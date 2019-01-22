package pham.honestbee.videolist.binding

import android.content.Intent
import android.databinding.BindingAdapter
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import pham.honestbee.videolist.R
import pham.honestbee.videolist.youtube.YoutubePlayerActivity


/**
 * Created by Allen on 27/8/18.
 */

@BindingAdapter("app:rotation")
fun setRotation(view: ImageView, loading: Boolean) {
    if (loading) {
        val rotation = AnimationUtils.loadAnimation(view.context, R.anim.rotate)
        rotation.fillAfter = true
        view.startAnimation(rotation)
    } else {
        view.clearAnimation()
    }
}

@BindingAdapter("app:thumbnailImage")
fun loadImage(view: ImageView, imageUrl: String) {
    val requestOptions = RequestOptions()
    requestOptions.error(R.drawable.no_image).centerCrop()

    Glide.with(view.context)
            .setDefaultRequestOptions(requestOptions)
            .load(imageUrl)
            .into(view)
}

@BindingAdapter("app:itemOnClick")
fun onClick(view: View, videoId: String) {
    val intent = Intent(view.context, YoutubePlayerActivity::class.java)
    intent.putExtra(YoutubePlayerActivity.KEY_VIDEO_ID_INTENT, videoId)
    view.context.startActivity(intent)
}