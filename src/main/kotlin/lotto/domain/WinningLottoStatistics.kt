package lotto.domain

class WinningLottoStatistics(
    lottoTicket: LottoTicket,
    winningLottoNumbers: WinningLottoNumbers
) {
    val statistics: MutableMap<LottoRank, Int> = hashMapOf()

    init {
        initializeRankMap()

        lottoTicket.lottos.forEach {
            addRankStatistics(rank(it, winningLottoNumbers))
        }
    }

    private fun initializeRankMap() {
        LottoRank.valuesExcludeNotPlace().forEach {
            statistics[it] = 0
        }
    }

    private fun addRankStatistics(lottoRank: LottoRank) {
        if (lottoRank != LottoRank.NOT_PLACE) {
            val prevRankCount = statistics.getOrDefault(lottoRank, DEFAULT_RANK_COUNT)
            statistics[lottoRank] = prevRankCount + ADD_RANK_COUNT
        }
    }

    private fun rank(lotto: Lotto, winningLottoNumbers: WinningLottoNumbers): LottoRank {
        val winningNumberCount = winningLottoNumbers.countWinningNumbers(lotto)
        val matchBonus = lotto.contains(winningLottoNumbers.bonusLotto)
        return LottoRank.selectByMatchCount(winningNumberCount, matchBonus)
    }

    fun calculateProfitRate(buyingPrice: LottoPrice): LottoProfitRate {
        val total = statistics.entries.fold(0) { total, winningPrice ->
            total + winningPrice.key.winningMoney * winningPrice.value
        }

        return LottoProfitRate(total, buyingPrice)
    }

    companion object {
        private const val DEFAULT_RANK_COUNT = 0
        private const val ADD_RANK_COUNT = 1
    }
}