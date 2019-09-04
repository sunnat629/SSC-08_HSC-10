package dev.sunnat629.ssc_08hsc_10.models.entities

/**
 * Education class is responsible for all the data regarding the educational background information
 * of the user. This will be a list.
 *
 * @param groupOrDepartment contains the name of the group or department in their institution.
 * @param passingYear contains the year when the user passed the exam
 * @param examinationType contains the type of the Academic stage. Example: School, College, University etc.
 * @param institutionName contains the name of the passing institution.
 * @param boardName contains the name of the board of the institution.
 * @param city contains the name of the city where user lives
 * @param country contains the name of the country where user lives
 * */
data class Education(
    val groupOrDepartment: String,
    val passingYear: Int,
    val examinationType: String,
    val institutionName: String,
    val boardName: String,
    val city: String,
    val country: String
)