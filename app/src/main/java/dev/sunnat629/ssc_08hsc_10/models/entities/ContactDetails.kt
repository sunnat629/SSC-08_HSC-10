package dev.sunnat629.ssc_08hsc_10.models.entities

/**
 * Education class is responsible for all the data regarding the educational background information
 * of the user. All the field will be optional.
 *
 * */

data class ContactDetails(
    val personalCellNumber: String?,
    val personalEmail: String?,
    val personalWebsite: String?,
    val facebookURL: String?,
    val twitterURL: String?,
    val linkedInURL: String?,
    val blogURL: String?,
    val gitHubURL: String?,
    val instagramURL: String?,
    val snapchatURL: String?
)