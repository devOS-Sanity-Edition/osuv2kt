package one.devos.osuv2kt

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient

class Osu {
    val client: OkHttpClient = OkHttpClient()
    val gson = GsonBuilder().create()
    val baseUrl = "https://osu.ppy.sh/api/v2/"
}