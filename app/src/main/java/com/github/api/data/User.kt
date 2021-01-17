package com.github.api.data


data class User (
    val login: String,
    val avatarUrl: String,
    val htmlUrl: String,
    val followersUrl: String,
    val follower: Int,
    val followingUrl: String,
    val following: Int,
    val reposUrl: String,
    val repos: Int

)
