import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class StringAddTest {
    @ValueSource(strings = ["-1", "0", "a"])
    @ParameterizedTest
    fun `음수 값, 숫자가아닌 인풋이 들어오면 런타임 익셉션 던진다`(input: String) {
        val inputValidator = InputValidator()

        assertThrows<RuntimeException> {
            inputValidator.checkNatualAndZero(input)
        }
    }

    @Test
    fun `쉼표 또는 콜론을 기준으로 구분한다`() {
        val input = "1,3:5"
        val inputParser = InputParser()
        val parsed = inputParser.parse(input, ",|:")

        assertThat(parsed[0]).isEqualTo("1")
        assertThat(parsed[1]).isEqualTo("3")
        assertThat(parsed[2]).isEqualTo("5")
    }
}
