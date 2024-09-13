package one.devos.osuv2kt.models.score

public enum class ScoreMod(private val offset: Int?) {

    NO_MOD(null),
    NO_FAIL(0),
    EASY(1),
    TOUCH_DEVICE(2),
    HIDDEN(3),
    HARD_ROCK(4),
    SUDDEN_DEATH(5),
    DOUBLE_TIME(6),
    RELAX(7),
    HALF_TIME(8),
    NIGHTCORE(9),
    FLASHLIGHT(10),
    AUTOPLAY(11),
    SPUN_OUT(12),
    AUTOPILOT(13),
    PERFECT(14),
    KEY4(15),
    KEY5(16),
    KEY6(17),
    KEY7(18),
    KEY8(19),
    FADE_IN(20),
    RANDOM(21),
    CINEMA(22),
    TARGET(23),
    KEY9(24),
    KEY_COOP(25),
    KEY1(26),
    KEY3(27),
    KEY2(28),
    SCORE_V2(29),
    MIRROR(30);

    public val value: Long
        get() = if (offset == null) 0 else 1L shl offset

    public companion object {

        public fun from(mods: Long): ScoreMod {
            return entries.firstOrNull { item ->
                mods and item.value != 0L
            } ?: NO_MOD
        }

    }

}
