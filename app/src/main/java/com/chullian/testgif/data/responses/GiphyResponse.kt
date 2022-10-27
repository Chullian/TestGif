package com.chullian.testgif.data.responses


import com.chullian.testgif.data.GiphyItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GiphyResponse(
    @SerialName("data")
    val `data`: List<Data?>? = null,
    @SerialName("meta")
    val meta: Meta? = null,
    @SerialName("pagination")
    val pagination: Pagination?
)

@Serializable
data class Data(
    @SerialName("analytics")
    val analytics: Analytics? = null,
    @SerialName("analytics_response_payload")
    val analyticsResponsePayload: String? = null,
    @SerialName("bitly_gif_url")
    val bitlyGifUrl: String? = null,
    @SerialName("bitly_url")
    val bitlyUrl: String? = null,
    @SerialName("content_url")
    val contentUrl: String? = null,
    @SerialName("embed_url")
    val embedUrl: String? = null,
    @SerialName("id")
    val id: String? = null,
    @SerialName("images")
    val images: Images? = null,
    @SerialName("import_datetime")
    val importDatetime: String? = null,
    @SerialName("is_sticker")
    val isSticker: Int? = null,
    @SerialName("rating")
    val rating: String? = null,
    @SerialName("slug")
    val slug: String? = null,
    @SerialName("source")
    val source: String? = null,
    @SerialName("source_post_url")
    val sourcePostUrl: String? = null,
    @SerialName("source_tld")
    val sourceTld: String? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("trending_datetime")
    val trendingDatetime: String? = null,
    @SerialName("type")
    val type: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("user")
    val user: User? = null,
    @SerialName("username")
    val username: String?
)

@Serializable
data class Analytics(
    @SerialName("onclick")
    val onclick: Onclick? = null,
    @SerialName("onload")
    val onload: Onload? = null,
    @SerialName("onsent")
    val onsent: Onsent?
)

@Serializable
data class Onclick(
    @SerialName("url")
    val url: String?
)

@Serializable
data class Onload(
    @SerialName("url")
    val url: String?
)

@Serializable
data class Onsent(
    @SerialName("url")
    val url: String?
)

@Serializable
data class Images(
    @SerialName("downsized")
    val downsized: Downsized? = null,
    @SerialName("downsized_large")
    val downsizedLarge: DownsizedLarge? = null,
    @SerialName("downsized_medium")
    val downsizedMedium: DownsizedMedium? = null,
    @SerialName("downsized_small")
    val downsizedSmall: DownsizedSmall? = null,
    @SerialName("downsized_still")
    val downsizedStill: DownsizedStill? = null,
    @SerialName("fixed_height")
    val fixedHeight: FixedHeight? = null,
    @SerialName("fixed_height_downsampled")
    val fixedHeightDownsampled: FixedHeightDownsampled? = null,
    @SerialName("fixed_height_small")
    val fixedHeightSmall: FixedHeightSmall? = null,
    @SerialName("fixed_height_small_still")
    val fixedHeightSmallStill: FixedHeightSmallStill? = null,
    @SerialName("fixed_height_still")
    val fixedHeightStill: FixedHeightStill? = null,
    @SerialName("fixed_width")
    val fixedWidth: FixedWidth? = null,
    @SerialName("fixed_width_downsampled")
    val fixedWidthDownsampled: FixedWidthDownsampled? = null,
    @SerialName("fixed_width_small")
    val fixedWidthSmall: FixedWidthSmall? = null,
    @SerialName("fixed_width_small_still")
    val fixedWidthSmallStill: FixedWidthSmallStill? = null,
    @SerialName("fixed_width_still")
    val fixedWidthStill: FixedWidthStill? = null,
    @SerialName("hd")
    val hd: Hd? = null,
    @SerialName("4k")
    val k: K? = null,
    @SerialName("looping")
    val looping: Looping? = null,
    @SerialName("original")
    val original: Original? = null,
    @SerialName("original_mp4")
    val originalMp4: OriginalMp4? = null,
    @SerialName("original_still")
    val originalStill: OriginalStill? = null,
    @SerialName("preview")
    val preview: Preview? = null,
    @SerialName("preview_gif")
    val previewGif: PreviewGif? = null,
    @SerialName("preview_webp")
    val previewWebp: PreviewWebp? = null,
    @SerialName("480w_still")
    val wStill: WStill?
)

@Serializable
data class Downsized(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class DownsizedLarge(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class DownsizedMedium(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class DownsizedSmall(
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class DownsizedStill(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedHeight(
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("webp")
    val webp: String? = null,
    @SerialName("webp_size")
    val webpSize: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedHeightDownsampled(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("webp")
    val webp: String? = null,
    @SerialName("webp_size")
    val webpSize: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedHeightSmall(
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("webp")
    val webp: String? = null,
    @SerialName("webp_size")
    val webpSize: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedHeightSmallStill(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedHeightStill(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedWidth(
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("webp")
    val webp: String? = null,
    @SerialName("webp_size")
    val webpSize: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedWidthDownsampled(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("webp")
    val webp: String? = null,
    @SerialName("webp_size")
    val webpSize: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedWidthSmall(
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("webp")
    val webp: String? = null,
    @SerialName("webp_size")
    val webpSize: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedWidthSmallStill(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class FixedWidthStill(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class Hd(
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class K(
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class Looping(
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String?
)

@Serializable
data class Original(
    @SerialName("frames")
    val frames: String? = null,
    @SerialName("hash")
    val hash: String? = null,
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("webp")
    val webp: String? = null,
    @SerialName("webp_size")
    val webpSize: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class OriginalMp4(
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class OriginalStill(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class Preview(
    @SerialName("height")
    val height: String? = null,
    @SerialName("mp4")
    val mp4: String? = null,
    @SerialName("mp4_size")
    val mp4Size: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class PreviewGif(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class PreviewWebp(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)

@Serializable
data class WStill(
    @SerialName("height")
    val height: String? = null,
    @SerialName("size")
    val size: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("width")
    val width: String?
)


@Serializable
data class User(
    @SerialName("avatar_url")
    val avatarUrl: String? = null,
    @SerialName("banner_image")
    val bannerImage: String? = null,
    @SerialName("banner_url")
    val bannerUrl: String? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("display_name")
    val displayName: String? = null,
    @SerialName("instagram_url")
    val instagramUrl: String? = null,
    @SerialName("is_verified")
    val isVerified: Boolean? = null,
    @SerialName("profile_url")
    val profileUrl: String? = null,
    @SerialName("username")
    val username: String? = null,
    @SerialName("website_url")
    val websiteUrl: String?
)


@Serializable
data class Meta(
    @SerialName("msg")
    val msg: String? = null,
    @SerialName("response_id")
    val responseId: String? = null,
    @SerialName("status")
    val status: Int?
)

@Serializable
data class Pagination(
    @SerialName("count")
    val count: Int? = null,
    @SerialName("offset")
    val offset: Int? = null,
    @SerialName("total_count")
    val totalCount: Int?
)


fun Data.toGiphyItem() = GiphyItem(
    title = this.title ?: "",
    gif = this.images?.original?.webp ?: "",
)