package pham.honestbee.videolist.videos

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.content.Intent
import android.databinding.*
import android.util.Log
import io.reactivex.disposables.CompositeDisposable
import pham.honestbee.videolist.repository.VideoRepository
import pham.honestbee.videolist.vo.Video
import pham.honestbee.videolist.youtube.YoutubePlayerActivity
import javax.inject.Inject

/**
 * Created by Pham on 11/2/2018
 */
class MainViewModel @Inject constructor(val context: Context, val videoRepository: VideoRepository) : ViewModel(), Observable {
    val loading = ObservableBoolean(false)
    val loadSuccess = ObservableBoolean(false)
    val videos = ObservableArrayList<Video>()
    private val callbacks: PropertyChangeRegistry by lazy { PropertyChangeRegistry() }
    private val compositeDisposable = CompositeDisposable()
    private val videoAdapter = VideoAdapter(object : VideoAdapter.VideoListener{
        override fun onVideoClick(videoId: String?) {
            val intent = Intent(context, YoutubePlayerActivity::class.java)
            intent.putExtra(YoutubePlayerActivity.KEY_VIDEO_ID_INTENT, videoId)
            context.startActivity(intent)
        }
    })

    init {
        loadVideos(WORK_PLAYLIST_ID)
    }

    // we use these here because the databinding lib is still having a timing bug
    // where calling notifyChanged() or notifyPropertyChanged(int) results in no action taking place
    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.add(callback)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.add(callback)
    }

    @Bindable
    fun getAdapter(): VideoAdapter {
        return this.videoAdapter
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

    fun loadVideos(playlistId: String) {
        loading.set(true)
        compositeDisposable.add(videoRepository.getYoutubeVideosFromPlaylist(playlistId)
                .subscribe({ response ->
                    loading.set(false)
                    loadSuccess.set(true)
                    videos.addAll(response.videos as ArrayList)
                }, { throwable ->
                    throwable.printStackTrace()
                    loading.set(false)
                    loadSuccess.set(false)
                })
                { Log.d("Videos", "Completed") })
    }

    companion object {
        private val WORK_PLAYLIST_ID = "PLyRfJw1I1N7HOCVMCJ3xpvKmAfZBv684-"
    }
}
