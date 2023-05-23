package kz.qarapaiymstudios.testapi.data.model


import com.google.gson.annotations.SerializedName

data class Laureats(
    @SerializedName("laureates")
    val laureates: List<Laureate>,
    @SerializedName("links")
    val links: Links,
    @SerializedName("meta")
    val meta: Meta
) {
    data class Laureate(
        @SerializedName("birth")
        val birth: Birth,
        @SerializedName("death")
        val death: Death,
        @SerializedName("familyName")
        val familyName: FamilyName,
        @SerializedName("fileName")
        val fileName: String,
        @SerializedName("fullName")
        val fullName: FullName,
        @SerializedName("gender")
        val gender: String,
        @SerializedName("givenName")
        val givenName: GivenName,
        @SerializedName("id")
        val id: String,
        @SerializedName("knownName")
        val knownName: KnownName,
        @SerializedName("links")
        val links: List<Link>,
        @SerializedName("nobelPrizes")
        val nobelPrizes: List<NobelPrize>,
        @SerializedName("sameAs")
        val sameAs: List<String>,
        @SerializedName("wikidata")
        val wikidata: Wikidata,
        @SerializedName("wikipedia")
        val wikipedia: Wikipedia
    ) {
        data class Birth(
            @SerializedName("date")
            val date: String,
            @SerializedName("place")
            val place: Place
        ) {
            data class Place(
                @SerializedName("city")
                val city: City,
                @SerializedName("cityNow")
                val cityNow: CityNow,
                @SerializedName("continent")
                val continent: Continent,
                @SerializedName("country")
                val country: Country,
                @SerializedName("countryNow")
                val countryNow: CountryNow,
                @SerializedName("locationString")
                val locationString: LocationString
            ) {
                data class City(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class CityNow(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("sameAs")
                    val sameAs: List<String>,
                    @SerializedName("se")
                    val se: String
                )

                data class Continent(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class Country(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class CountryNow(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("sameAs")
                    val sameAs: List<String>,
                    @SerializedName("se")
                    val se: String
                )

                data class LocationString(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )
            }
        }

        data class Death(
            @SerializedName("date")
            val date: String,
            @SerializedName("place")
            val place: Place
        ) {
            data class Place(
                @SerializedName("city")
                val city: City,
                @SerializedName("cityNow")
                val cityNow: CityNow,
                @SerializedName("continent")
                val continent: Continent,
                @SerializedName("country")
                val country: Country,
                @SerializedName("countryNow")
                val countryNow: CountryNow,
                @SerializedName("locationString")
                val locationString: LocationString
            ) {
                data class City(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class CityNow(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("sameAs")
                    val sameAs: List<String>,
                    @SerializedName("se")
                    val se: String
                )

                data class Continent(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class Country(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("sameAs")
                    val sameAs: String,
                    @SerializedName("se")
                    val se: String
                )

                data class CountryNow(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("sameAs")
                    val sameAs: List<String>,
                    @SerializedName("se")
                    val se: String
                )

                data class LocationString(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )
            }
        }

        data class FamilyName(
            @SerializedName("en")
            val en: String,
            @SerializedName("se")
            val se: String
        )

        data class FullName(
            @SerializedName("en")
            val en: String,
            @SerializedName("se")
            val se: String
        )

        data class GivenName(
            @SerializedName("en")
            val en: String,
            @SerializedName("se")
            val se: String
        )

        data class KnownName(
            @SerializedName("en")
            val en: String,
            @SerializedName("se")
            val se: String
        )

        data class Link(
            @SerializedName("action")
            val action: String,
            @SerializedName("class")
            val classX: List<String>,
            @SerializedName("href")
            val href: String,
            @SerializedName("rel")
            val rel: String,
            @SerializedName("title")
            val title: String,
            @SerializedName("types")
            val types: String
        )

        data class NobelPrize(
            @SerializedName("affiliations")
            val affiliations: List<Affiliation>,
            @SerializedName("awardYear")
            val awardYear: String,
            @SerializedName("category")
            val category: Category,
            @SerializedName("categoryFullName")
            val categoryFullName: CategoryFullName,
            @SerializedName("dateAwarded")
            val dateAwarded: String,
            @SerializedName("links")
            val links: List<Link>,
            @SerializedName("motivation")
            val motivation: Motivation,
            @SerializedName("portion")
            val portion: String,
            @SerializedName("prizeAmount")
            val prizeAmount: Int,
            @SerializedName("prizeAmountAdjusted")
            val prizeAmountAdjusted: Int,
            @SerializedName("prizeStatus")
            val prizeStatus: String,
            @SerializedName("residences")
            val residences: List<Residence>,
            @SerializedName("sortOrder")
            val sortOrder: String
        ) {
            data class Affiliation(
                @SerializedName("city")
                val city: City,
                @SerializedName("cityNow")
                val cityNow: CityNow,
                @SerializedName("country")
                val country: Country,
                @SerializedName("countryNow")
                val countryNow: CountryNow,
                @SerializedName("locationString")
                val locationString: LocationString,
                @SerializedName("name")
                val name: Name,
                @SerializedName("nameNow")
                val nameNow: NameNow
            ) {
                data class City(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class CityNow(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("sameAs")
                    val sameAs: List<String>,
                    @SerializedName("se")
                    val se: String
                )

                data class Country(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class CountryNow(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("sameAs")
                    val sameAs: List<String>,
                    @SerializedName("se")
                    val se: String
                )

                data class LocationString(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class Name(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class NameNow(
                    @SerializedName("en")
                    val en: String
                )
            }

            data class Category(
                @SerializedName("en")
                val en: String,
                @SerializedName("no")
                val no: String,
                @SerializedName("se")
                val se: String
            )

            data class CategoryFullName(
                @SerializedName("en")
                val en: String,
                @SerializedName("no")
                val no: String,
                @SerializedName("se")
                val se: String
            )

            data class Link(
                @SerializedName("action")
                val action: String,
                @SerializedName("class")
                val classX: List<String>,
                @SerializedName("href")
                val href: String,
                @SerializedName("rel")
                val rel: String,
                @SerializedName("title")
                val title: String,
                @SerializedName("types")
                val types: String
            )

            data class Motivation(
                @SerializedName("en")
                val en: String,
                @SerializedName("no")
                val no: String,
                @SerializedName("se")
                val se: String
            )

            data class Residence(
                @SerializedName("country")
                val country: Country,
                @SerializedName("countryNow")
                val countryNow: CountryNow,
                @SerializedName("locationString")
                val locationString: LocationString
            ) {
                data class Country(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class CountryNow(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )

                data class LocationString(
                    @SerializedName("en")
                    val en: String,
                    @SerializedName("no")
                    val no: String,
                    @SerializedName("se")
                    val se: String
                )
            }
        }

        data class Wikidata(
            @SerializedName("id")
            val id: String,
            @SerializedName("url")
            val url: String
        )

        data class Wikipedia(
            @SerializedName("english")
            val english: String,
            @SerializedName("slug")
            val slug: String
        )
    }

    data class Links(
        @SerializedName("first")
        val first: String,
        @SerializedName("last")
        val last: String,
        @SerializedName("next")
        val next: String,
        @SerializedName("self")
        val self: String
    )

    data class Meta(
        @SerializedName("count")
        val count: Int,
        @SerializedName("disclaimer")
        val disclaimer: String,
        @SerializedName("license")
        val license: String,
        @SerializedName("limit")
        val limit: Int,
        @SerializedName("offset")
        val offset: Int,
        @SerializedName("terms")
        val terms: String
    )
}