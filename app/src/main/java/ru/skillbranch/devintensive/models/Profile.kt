package ru.skillbranch.devintensive.models

data class Profile(
    val firstName: String,
    val lastName: String,
    val about: String,
    val repository: String,
    val rating: Int = 0,
    val respect: Int = 0
) {
    val nickName: String = "John Doe"
    val rank: String = "Junior"
    //TODO implements method
    fun toMap(): Map<String, Any> = mapOf(
        "nickName" to nickName,
        "firstName" to firstName,
        "lastName" to lastName,
        "rank" to rank,
        "about" to about,
        "repository" to repository,
        "rating" to rating,
        "respect" to respect
    )

}