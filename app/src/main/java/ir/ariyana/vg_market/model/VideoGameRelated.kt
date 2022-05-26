package ir.ariyana.vg_market.model


import com.google.gson.annotations.SerializedName

data class VideoGameRelated(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: Any,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val results: List<Result>
) {
    data class Result(
        @SerializedName("added")
        val added: Int,
        @SerializedName("added_by_status")
        val addedByStatus: AddedByStatus,
        @SerializedName("background_image")
        val backgroundImage: String,
        @SerializedName("clip")
        val clip: Any,
        @SerializedName("dominant_color")
        val dominantColor: String,
        @SerializedName("esrb_rating")
        val esrbRating: EsrbRating,
        @SerializedName("genres")
        val genres: List<Genre>,
        @SerializedName("id")
        val id: Int,
        @SerializedName("metacritic")
        val metacritic: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("parent_platforms")
        val parentPlatforms: List<ParentPlatform>,
        @SerializedName("platforms")
        val platforms: List<Platform>,
        @SerializedName("playtime")
        val playtime: Int,
        @SerializedName("rating")
        val rating: Double,
        @SerializedName("rating_top")
        val ratingTop: Int,
        @SerializedName("ratings")
        val ratings: List<Rating>,
        @SerializedName("ratings_count")
        val ratingsCount: Int,
        @SerializedName("released")
        val released: String,
        @SerializedName("reviews_count")
        val reviewsCount: Int,
        @SerializedName("reviews_text_count")
        val reviewsTextCount: Int,
        @SerializedName("saturated_color")
        val saturatedColor: String,
        @SerializedName("short_screenshots")
        val shortScreenshots: List<ShortScreenshot>,
        @SerializedName("slug")
        val slug: String,
        @SerializedName("stores")
        val stores: List<Store>,
        @SerializedName("suggestions_count")
        val suggestionsCount: Int,
        @SerializedName("tags")
        val tags: List<Tag>,
        @SerializedName("tba")
        val tba: Boolean,
        @SerializedName("updated")
        val updated: String,
        @SerializedName("user_game")
        val userGame: Any
    ) {
        data class AddedByStatus(
            @SerializedName("beaten")
            val beaten: Int,
            @SerializedName("dropped")
            val dropped: Int,
            @SerializedName("owned")
            val owned: Int,
            @SerializedName("playing")
            val playing: Int,
            @SerializedName("toplay")
            val toplay: Int,
            @SerializedName("yet")
            val yet: Int
        )

        data class EsrbRating(
            @SerializedName("id")
            val id: Int,
            @SerializedName("name")
            val name: String,
            @SerializedName("slug")
            val slug: String
        )

        data class Genre(
            @SerializedName("games_count")
            val gamesCount: Int,
            @SerializedName("id")
            val id: Int,
            @SerializedName("image_background")
            val imageBackground: String,
            @SerializedName("name")
            val name: String,
            @SerializedName("slug")
            val slug: String
        )

        data class ParentPlatform(
            @SerializedName("platform")
            val platform: Platform
        ) {
            data class Platform(
                @SerializedName("id")
                val id: Int,
                @SerializedName("name")
                val name: String,
                @SerializedName("slug")
                val slug: String
            )
        }

        data class Platform(
            @SerializedName("platform")
            val platform: Platform,
            @SerializedName("released_at")
            val releasedAt: String,
            @SerializedName("requirements_en")
            val requirementsEn: Any,
            @SerializedName("requirements_ru")
            val requirementsRu: Any
        ) {
            data class Platform(
                @SerializedName("games_count")
                val gamesCount: Int,
                @SerializedName("id")
                val id: Int,
                @SerializedName("image")
                val image: Any,
                @SerializedName("image_background")
                val imageBackground: String,
                @SerializedName("name")
                val name: String,
                @SerializedName("slug")
                val slug: String,
                @SerializedName("year_end")
                val yearEnd: Any,
                @SerializedName("year_start")
                val yearStart: Int
            )
        }

        data class Rating(
            @SerializedName("count")
            val count: Int,
            @SerializedName("id")
            val id: Int,
            @SerializedName("percent")
            val percent: Double,
            @SerializedName("title")
            val title: String
        )

        data class ShortScreenshot(
            @SerializedName("id")
            val id: Int,
            @SerializedName("image")
            val image: String
        )

        data class Store(
            @SerializedName("id")
            val id: Int,
            @SerializedName("store")
            val store: Store
        ) {
            data class Store(
                @SerializedName("domain")
                val domain: String,
                @SerializedName("games_count")
                val gamesCount: Int,
                @SerializedName("id")
                val id: Int,
                @SerializedName("image_background")
                val imageBackground: String,
                @SerializedName("name")
                val name: String,
                @SerializedName("slug")
                val slug: String
            )
        }

        data class Tag(
            @SerializedName("games_count")
            val gamesCount: Int,
            @SerializedName("id")
            val id: Int,
            @SerializedName("image_background")
            val imageBackground: String,
            @SerializedName("language")
            val language: String,
            @SerializedName("name")
            val name: String,
            @SerializedName("slug")
            val slug: String
        )
    }
}