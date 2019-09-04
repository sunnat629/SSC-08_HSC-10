package dev.sunnat629.ssc_08hsc_10.models.entities

/**
 * Person class is responsible for all the information of the user.
 *
 * @param preFixName contains the user's pre-fix name. Example: Dr., Barrister, Egr. etc.
 * @param firstName contains the user's first name.
 * @param lastName contains the user's last name.
 * @param dateOfBirth contains the date of birth of the user.
 * @param gender contains the gender of the user.
 * @param maritalStatus contains the marital status of the user.
 * @param bloodGroup contains the name of the user's blood group.
 * @param permanentCity contains the name of the user's permanent city.
 * @param presentCity contains the name of the user's present city.
 * @param presentCountry contains the name of the user's present country.
 * @param profileImage contains the URL of the user's image.
 * @param education contains the record of the academic background. It will be a list.
 * @see Education for more details regarding education.
 * @param profession contains the record of the profession. It will be a list.
 * @see Profession for more details regarding profession.
 * @param contactDetails contains all the contact details of the users. This field will be optional.
 * @see ContactDetails for more details regarding contactDetails.
 * */
data class Person(
    val preFixName: String?,
    val firstName: String,
    val lastName: String,
    val dateOfBirth: String,
    val gender: String,
    val maritalStatus: String,
    val bloodGroup: String,
    val permanentCity: String,
    val presentCity: String,
    val presentCountry: String,
    val profileImage: String,
    val education: List<Education>,
    val profession: List<Profession>,
    val contactDetails: ContactDetails?
)