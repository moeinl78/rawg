package ir.ariyana.vg_market.model


import com.google.gson.annotations.SerializedName

data class VideoGameDetail(
    @SerializedName("achievements_count")
    val achievementsCount: Int,
    @SerializedName("added")
    val added: Int,
    @SerializedName("added_by_status")
    val addedByStatus: AddedByStatus,
    @SerializedName("additions_count")
    val additionsCount: Int,
    @SerializedName("alternative_names")
    val alternativeNames: List<String>,
    @SerializedName("background_image")
    val backgroundImage: String,
    @SerializedName("background_image_additional")
    val backgroundImageAdditional: String,
    @SerializedName("clip")
    val clip: Any,
    @SerializedName("creators_count")
    val creatorsCount: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("description_raw")
    val descriptionRaw: String,
    @SerializedName("developers")
    val developers: List<Developer>,
    @SerializedName("dominant_color")
    val dominantColor: String,
    @SerializedName("esrb_rating")
    val esrbRating: EsrbRating,
    @SerializedName("game_series_count")
    val gameSeriesCount: Int,
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("metacritic")
    val metacritic: Int,
    @SerializedName("metacritic_platforms")
    val metacriticPlatforms: List<MetacriticPlatform>,
    @SerializedName("metacritic_url")
    val metacriticUrl: String,
    @SerializedName("movies_count")
    val moviesCount: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("name_original")
    val nameOriginal: String,
    @SerializedName("parent_achievements_count")
    val parentAchievementsCount: Int,
    @SerializedName("parent_platforms")
    val parentPlatforms: List<ParentPlatform>,
    @SerializedName("parents_count")
    val parentsCount: Int,
    @SerializedName("platforms")
    val platforms: List<Platform>,
    @SerializedName("playtime")
    val playtime: Int,
    @SerializedName("publishers")
    val publishers: List<Publisher>,
    @SerializedName("rating")
    val rating: Double,
    @SerializedName("rating_top")
    val ratingTop: Int,
    @SerializedName("ratings")
    val ratings: List<Rating>,
    @SerializedName("ratings_count")
    val ratingsCount: Int,
    @SerializedName("reactions")
    val reactions: Reactions,
    @SerializedName("reddit_count")
    val redditCount: Int,
    @SerializedName("reddit_description")
    val redditDescription: String,
    @SerializedName("reddit_logo")
    val redditLogo: String,
    @SerializedName("reddit_name")
    val redditName: String,
    @SerializedName("reddit_url")
    val redditUrl: String,
    @SerializedName("released")
    val released: String,
    @SerializedName("reviews_count")
    val reviewsCount: Int,
    @SerializedName("reviews_text_count")
    val reviewsTextCount: Int,
    @SerializedName("saturated_color")
    val saturatedColor: String,
    @SerializedName("screenshots_count")
    val screenshotsCount: Int,
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
    @SerializedName("twitch_count")
    val twitchCount: Int,
    @SerializedName("updated")
    val updated: String,
    @SerializedName("user_game")
    val userGame: Any,
    @SerializedName("website")
    val website: String,
    @SerializedName("youtube_count")
    val youtubeCount: Int
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

    data class Developer(
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

    data class MetacriticPlatform(
        @SerializedName("metascore")
        val metascore: Int,
        @SerializedName("platform")
        val platform: Platform,
        @SerializedName("url")
        val url: String
    ) {
        data class Platform(
            @SerializedName("name")
            val name: String,
            @SerializedName("platform")
            val platform: Int,
            @SerializedName("slug")
            val slug: String
        )
    }

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
        @SerializedName("requirements")
        val requirements: Requirements
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
            val yearStart: Any
        )

        data class Requirements(
            @SerializedName("minimum")
            val minimum: String,
            @SerializedName("recommended")
            val recommended: String
        )
    }

    data class Publisher(
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

    data class Reactions(
        @SerializedName("1")
        val x1: Int,
        @SerializedName("10")
        val x10: Int,
        @SerializedName("11")
        val x11: Int,
        @SerializedName("12")
        val x12: Int,
        @SerializedName("14")
        val x14: Int,
        @SerializedName("15")
        val x15: Int,
        @SerializedName("16")
        val x16: Int,
        @SerializedName("18")
        val x18: Int,
        @SerializedName("2")
        val x2: Int,
        @SerializedName("20")
        val x20: Int,
        @SerializedName("21")
        val x21: Int,
        @SerializedName("3")
        val x3: Int,
        @SerializedName("4")
        val x4: Int,
        @SerializedName("5")
        val x5: Int,
        @SerializedName("6")
        val x6: Int,
        @SerializedName("7")
        val x7: Int,
        @SerializedName("8")
        val x8: Int,
        @SerializedName("9")
        val x9: Int
    )

    data class Store(
        @SerializedName("id")
        val id: Int,
        @SerializedName("store")
        val store: Store,
        @SerializedName("url")
        val url: String
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