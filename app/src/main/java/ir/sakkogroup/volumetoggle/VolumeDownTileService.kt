package ir.sakkogroup.volumetoggle

import android.media.AudioManager
import android.service.quicksettings.TileService
import android.widget.Toast


class VolumeDownTileService : TileService() {
    override fun onClick() {
        super.onClick()

        // Called when the user click the tile
        //val context = applicationContext
        //Toast.makeText(context, "Volume Up", Toast.LENGTH_SHORT).show()
        val audioManager: AudioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        audioManager.adjustVolume(AudioManager.ADJUST_LOWER,AudioManager.FLAG_SHOW_UI)
    }

    override fun onTileRemoved() {
        super.onTileRemoved()

        // Do something when the user removes the Tile
    }

    override fun onTileAdded() {
        super.onTileAdded()

        // Do something when the user add the Tile
    }

    override fun onStartListening() {
        super.onStartListening()

        // Called when the Tile becomes visible
    }

    override fun onStopListening() {
        super.onStopListening()

        // Called when the tile is no longer visible
    }
}