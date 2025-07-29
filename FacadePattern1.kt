package com.example.designpatterns
//subsystems
class DVDPlayer {
    fun on() = println("DVD Player ON")
    fun play() = println("DVD is Playing")
}

class Projector {
    fun on() = println("Projector ON")
    fun setMode(mode: String) = println("Projector mode: $mode")
}

class SoundSystem {
    fun on() = println("Sound System ON")
    fun setVolume(level: Int) = println("Volume set to $level")
}
//facadeclass
class HomeTheaterFacade(
    private val dvd: DVDPlayer,
    private val projector: Projector,
    private val sound: SoundSystem
) {
    fun watchMovie() {
        println("Get ready to watch a movie...")
        dvd.on()
        dvd.play()
        projector.on()
        projector.setMode("Cinema")
        sound.on()
        sound.setVolume(10)
    }
}
fun main() {
    val dvd = DVDPlayer()
    val projector = Projector()
    val sound = SoundSystem()

    val homeTheater = HomeTheaterFacade(dvd, projector, sound)
    homeTheater.watchMovie()
}

