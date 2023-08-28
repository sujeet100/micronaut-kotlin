package com.sujit.service

import com.sujit.domain.Song
import com.sujit.repository.SongRepository
import jakarta.inject.Singleton

@Singleton
class SongService(val songRepository: SongRepository) {

    fun getSongs(): kotlinx.coroutines.flow.Flow<Song> {
        return songRepository.findAll()
    }
}

