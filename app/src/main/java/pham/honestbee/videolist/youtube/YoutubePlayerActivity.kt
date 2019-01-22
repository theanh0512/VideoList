package pham.honestbee.videolist.youtube

import android.databinding.DataBindingUtil
import android.os.Bundle

import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import pham.honestbee.videolist.databinding.ActivityYoutubePlayerBinding

import pham.honestbee.videolist.R

/**
 * Created by Pham on 23/1/2019.
 */

class YoutubePlayerActivity : YouTubeBaseActivity() {

    private var mVideoID: String? = null
    var binding: ActivityYoutubePlayerBinding? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_youtube_player)

        mVideoID = intent.getStringExtra(KEY_VIDEO_ID_INTENT)
    }

    override fun onStart() {
        super.onStart()
        binding?.youtubeView?.initialize(API_KEY, OnInitializeListener())
    }

    inner class OnInitializeListener : YouTubePlayer.OnInitializedListener {

        override fun onInitializationSuccess(provider: YouTubePlayer.Provider, youTubePlayer: YouTubePlayer, b: Boolean) {
            /** after onStart initialize - Listener  */

            //load video
            youTubePlayer.loadVideo(mVideoID)
        }

        override fun onInitializationFailure(provider: YouTubePlayer.Provider, youTubeInitializationResult: YouTubeInitializationResult) {
            //do nothing
        }
    }

    companion object {

        // test key
        val API_KEY = "AIzaSyCw-NkefYqnuyBuiKy7GaxEy6y7hPL8r4k"
        val KEY_VIDEO_ID_INTENT = "VIDEO_ID_INTENT"
    }

}
