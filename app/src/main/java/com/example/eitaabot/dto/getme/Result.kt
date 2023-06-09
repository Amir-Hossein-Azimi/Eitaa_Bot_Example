package com.example.eitaabot.dto.getme

data class Result(
    val can_join_groups: Boolean,
    val can_read_all_group_messages: Boolean,
    val first_name: String,
    val id: Int,
    val is_bot: Boolean,
    val last_name: String,
    val supports_inline_queries: Boolean,
    val username: String
)