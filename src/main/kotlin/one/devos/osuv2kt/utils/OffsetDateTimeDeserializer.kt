package one.devos.osuv2kt.utils

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type
import java.time.OffsetDateTime

public class OffsetDateTimeDeserializer : JsonDeserializer<OffsetDateTime> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): OffsetDateTime {
        return OffsetDateTime.parse(json.asString)
    }

}