package com.leishui.music.result.PlayListBean

import com.google.gson.annotations.SerializedName

data class Playlist(
    val adType: Int,
    val anonimous: Boolean,
    val artists: Any,
    val backgroundCoverId: Int,
    val backgroundCoverUrl: Any,
    val cloudTrackCount: Int,
    val commentThreadId: String,
    val coverImgId: Long,
    val coverImgId_str: String,
    val coverImgUrl: String,
    val createTime: Long,
    val creator: Creator,
    val description: String,
    val highQuality: Boolean,
    val id: Long,
    val name: String,
    val newImported: Boolean,
    val ordered: Boolean,
    val playCount: Int,
    val privacy: Int,
    val specialType: Int,
    val status: Int,
    val subscribed: Boolean,
    val subscribedCount: Int,
    val subscribers: List<Any>,
    val tags: List<Any>,
    val totalDuration: Int,
    val trackCount: Int,
    val trackNumberUpdateTime: Long,
    val trackUpdateTime: Long,
    val tracks: Any,
    val updateFrequency: Any,
    val updateTime: Long,
    val userId: Int
)