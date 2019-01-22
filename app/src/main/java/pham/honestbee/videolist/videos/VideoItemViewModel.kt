package pham.honestbee.videolist.videos

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.text.TextUtils
import pham.honestbee.videolist.vo.Video

/**
 * Created by Pham on 23/1/2019.
 */
class VideoItemViewModel(val video: Video) : BaseObservable() {
    @Bindable
    fun getTitle(): String? {
        return if (!TextUtils.isEmpty(video.snippet?.title)) video.snippet?.title else ""
    }

    @Bindable
    fun getDefaultThumbnailUrl(): String? {
        return video.snippet?.thumbnails?.default?.url
    }

    @Bindable
    fun getMediumThumbnailUrl(): String? {
        return video.snippet?.thumbnails?.medium?.url
    }

    @Bindable
    fun getHighThumbnailUrl(): String? {
        return video.snippet?.thumbnails?.high?.url
    }

    @Bindable
    fun getVideoId(): String? {
        return video.snippet?.resource?.videoId
    }
}