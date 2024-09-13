package one.devos.osuv2kt.models

public data class Failtimes(
    val exit: IntArray?,
    val fail: IntArray?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Failtimes

        if (exit != null) {
            if (other.exit == null) return false
            if (!exit.contentEquals(other.exit)) return false
        } else if (other.exit != null) return false
        if (fail != null) {
            if (other.fail == null) return false
            if (!fail.contentEquals(other.fail)) return false
        } else if (other.fail != null) return false

        return true
    }

    override fun hashCode(): Int {
        var result = exit?.contentHashCode() ?: 0
        result = 31 * result + (fail?.contentHashCode() ?: 0)
        return result
    }
}
