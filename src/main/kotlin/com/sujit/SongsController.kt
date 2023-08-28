package com.sujit;

import com.sujit.domain.Song;
import com.sujit.service.SongService
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import kotlinx.coroutines.flow.Flow

@Controller("/songs")
class SongsController(val songService: SongService) {
    @Get
    fun getSongs(): Flow<Song> {
        return songService.getSongs();
    }


}
