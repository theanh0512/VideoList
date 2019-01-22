package pham.honestbee.videolist.binding

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import pham.honestbee.videolist.videos.VideoAdapter
import pham.honestbee.videolist.vo.Video

/**
 * Created by Pham on 27/8/2018.
 */
class RecyclerViewDataBinding {
    /**
     * Binds the data to the [android.support.v7.widget.RecyclerView.Adapter], sets the
     * recycler view on the adapter, and performs some other recycler view initialization.
     *
     * @param recyclerView passed in automatically with the data binding
     * @param adapter      must be explicitly passed in
     * @param data         must be explicitly passed in
     */
    @BindingAdapter("app:adapter", "app:data")
    fun bind(recyclerView: RecyclerView?, adapter: VideoAdapter?, data: List<Video>?) {
        recyclerView?.adapter = adapter
        adapter?.updateData(data)
        val animation = TranslateAnimation(Animation.ABSOLUTE, //from xType
                0f,
                Animation.ABSOLUTE, //to xType
                0f,
                Animation.ABSOLUTE, //from yType
                500f,
                Animation.ABSOLUTE, //to yType
                0f)
        animation.duration = 2000
        recyclerView?.animation = animation
        animation.start()
    }
}