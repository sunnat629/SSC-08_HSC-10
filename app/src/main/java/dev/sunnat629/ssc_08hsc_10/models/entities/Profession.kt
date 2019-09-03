package dev.sunnat629.ssc_08hsc_10.models.entities

/**
 * Profession class is responsible for all the data regarding the professional background information
 * of the user. This will be a list.
 * @param currentOccupation contains the name of the profession
 * @param functionalCategory contains the type of his job. Example: Doctor, Administration, Engineer
 * @param position contains the job position
 * @param duration contains the year duration of this current job
 * @param employerName contains the name of the work place of the user
 * @param chamberAddress contains the address if there any personal chamber of the users. This is optional field
 * @param professionWebsite contains the website of the employer. This is optional field
 * @param city contains the name of the city where user works
 * @param country contains the name of the country where user works
 * */
data class Profession(
    val currentOccupation: String,
    val functionalCategory: String,
    val position: String,
    val duration: Int,
    val employerName: String,
    val chamberAddress: String?,
    val professionWebsite: String?,
    val city: String,
    val country: String
)