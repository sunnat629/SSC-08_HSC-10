package dev.sunnat629.ssc_08hsc_10.models.entities

/**
 * Education class is responsible for all the data regarding the educational background information
 * of the user. All the field will be optional.
 *
 * @param personalCellNumber contains the user's personal number 
 * @param personalEmail contains the user's email id
 * @param personalWebsite contains the user's website
 * @param facebookURL contains the user's Facebook url
 * @param twitterURL contains the user's Twitter url
 * @param linkedInURL contains the user's LinkedIn url
 * @param blogURL contains the user's blog url
 * @param gitHubURL contains the user's GitHub url
 * @param instagramURL contains the user's Instagram url
 * @param snapchatURL contains the user's Snapchat url
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