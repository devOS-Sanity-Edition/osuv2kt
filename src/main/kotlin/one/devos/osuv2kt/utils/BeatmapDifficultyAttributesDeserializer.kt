package one.devos.osuv2kt.utils

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import one.devos.osuv2kt.models.beatmap.BeatmapDifficultyAttributes
import one.devos.osuv2kt.models.beatmap.attributes.FruitsBeatmapDifficultyAttributes
import one.devos.osuv2kt.models.beatmap.attributes.ManiaBeatmapDifficultyAttributes
import one.devos.osuv2kt.models.beatmap.attributes.OsuBeatmapDifficultyAttributes
import one.devos.osuv2kt.models.beatmap.attributes.TaikoBeatmapDifficultyAttributes
import java.lang.reflect.Type

public class BeatmapDifficultyAttributesDeserializer : JsonDeserializer<BeatmapDifficultyAttributes> {
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): BeatmapDifficultyAttributes {
        val obj = json.asJsonObject

        return when {
            obj.has("aim_difficulty") -> context.deserialize(json, OsuBeatmapDifficultyAttributes::class.java)
            obj.has("stamina_difficulty") -> context.deserialize(json, TaikoBeatmapDifficultyAttributes::class.java)
            obj.has("great_hit_window") -> context.deserialize(json, ManiaBeatmapDifficultyAttributes::class.java)
            obj.has("approach_rate") -> context.deserialize(json, FruitsBeatmapDifficultyAttributes::class.java)
            else -> throw IllegalArgumentException("Unknown beatmap mode")
        }
    }
}
