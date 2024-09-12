package one.devos.osuv2kt.utils

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import one.devos.osuv2kt.models.RankStatus
import java.lang.reflect.Type

public class RankStatusDeserializer : JsonDeserializer<RankStatus> {
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): RankStatus {
        val value: Any = try {
            json.asInt
        } catch (ignored: Throwable) {
            json.asString
        }

        return RankStatus.from(value)
    }

}