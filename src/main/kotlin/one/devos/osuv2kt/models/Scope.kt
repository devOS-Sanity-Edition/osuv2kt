package one.devos.osuv2kt.models

public enum class Scope(private val value: String) {

    READ_CHAT("chat.read"),
    WRITE_CHAT("chat.write"),
    MANAGE_CHAT("chat.write_manage"),
    DELEGATE("delegate"),
    WRITE_FORUM("forum.write"),
    READ_FRIENDS("friends.read"),
    IDENTIFY("identify"),
    PUBLIC("public");

    override fun toString(): String {
        return value
    }

}
