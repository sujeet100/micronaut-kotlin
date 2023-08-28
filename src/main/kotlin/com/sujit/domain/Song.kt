package com.sujit.domain;

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable
import java.time.LocalDateTime

@MappedEntity(value = "songs")
@Serdeable
data class Song(@field:Id val songId: Int, val title: String, val artist: String, val album: String, val year: Int, val genre: String, val createdOn: LocalDateTime)

