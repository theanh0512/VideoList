package pham.honestbee.videolist.repository

import android.content.Context
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import pham.honestbee.videolist.BuildConfig
import pham.honestbee.videolist.api.VideoService
import pham.honestbee.videolist.vo.Response
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Pham on 25/8/2018.
 */
@Singleton
class VideoRepository @Inject constructor(val context: Context, val videoService: VideoService) {
    fun getYoutubeVideosFromPlaylist(playlistId: String): Observable<Response> {
        return videoService.getVideos(BuildConfig.YOUTUBE_KEY,
                playlistId, "snippet", 50)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }


    companion object {
        private val TAG = "VideoList"
    }
}