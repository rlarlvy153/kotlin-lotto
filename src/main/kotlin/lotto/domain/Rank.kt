package lotto.domain

enum class Rank(val matchCount: Int, val prizeMoney: Int, val bonusBall: Boolean = false) { //
    FIRST(6, 2_000_000_000),
    SECOND(5, 30_000_000, true),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000),
    ELSE(0, 0);

    companion object {
        fun of(matchCount: Int, bonusBall: Boolean): Rank {
            return values().find { it.matchCount == matchCount && it.bonusBall == bonusBall } ?: ELSE
        }
    }
}
