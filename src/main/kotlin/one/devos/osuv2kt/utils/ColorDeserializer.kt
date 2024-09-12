package one.devos.osuv2kt.utils

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.awt.Color
import java.lang.reflect.Type

public class ColorDeserializer : JsonDeserializer<Color> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): Color {
        val string = json.asString
        if (string.startsWith("#")) {
            // Check if the hex string is valid syntax
            if (!string.matches(Regex("^#?([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$"))) {
                return Color.WHITE
            }

            // Remove '#' symbol if present
            val unpoundedHex = if (string[0] == '#') string.substring(1) else string

            // Expand short hex format to full format if necessary
            val fullSizeHex = if (unpoundedHex.length == 3) {
                unpoundedHex.map { it.toString() + it }.joinToString("")
            } else {
                unpoundedHex
            }

            // Convert hex to RGB values
            val red = fullSizeHex.substring(0, 2).toInt(16)
            val green = fullSizeHex.substring(2, 4).toInt(16)
            val blue = fullSizeHex.substring(4, 6).toInt(16)

            return Color(red, green, blue)
        }

        return Color.GRAY // Bland, just like British food
    }

}
