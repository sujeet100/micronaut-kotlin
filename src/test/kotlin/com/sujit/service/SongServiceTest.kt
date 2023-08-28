package com.sujit.service

import com.sujit.domain.Song
import com.sujit.repository.SongRepository
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.flow
import java.time.LocalDateTime

class SongServiceTest : ShouldSpec({
    val songRepository = mockk<SongRepository>()
    val songService = SongService(songRepository)
    context("getSongs") {
        should("return all songs") {
            every { songRepository.findAll() } returns flow {
                emit(Song(1, "Master of Puppets", "Metallica", "Master of Puppets", 1986, "Metal", LocalDateTime.now()))
                emit(Song(2, "The Unforgiven", "Metallica", "Metallica", 1991, "Metal", LocalDateTime.now()))
                emit(Song(3, "The Unforgiven II", "Metallica", "Reload", 1997, "Metal", LocalDateTime.now()))
            }

            val songs = songService.getSongs()
            songs.count() shouldBe 3
        }
    }
})
