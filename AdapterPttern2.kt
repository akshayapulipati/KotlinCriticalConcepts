package com.example.designpatterns

// Existing Interface
interface MediaPlayer {
    fun play(audioType: String, fileName: String)
}

// A new class that plays only mp4
class Mp4Player {
    fun playMp4(fileName: String) {
        println("Playing mp4 file: $fileName")
    }
}

// Adapter class to fit Mp4Player into MediaPlayer
class MediaAdapter : MediaPlayer {
    private val mp4Player = Mp4Player()

    override fun play(audioType: String, fileName: String) {
        if (audioType.lowercase() == "mp4") {
            mp4Player.playMp4(fileName)
        } else {
            println("Unsupported format: $audioType")
        }
    }
}

// Client code
fun main() {
    val player: MediaPlayer = MediaAdapter()
    player.play("mp4", "video.mp4")
}
