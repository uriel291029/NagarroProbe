import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ParserTest {

    @Test
    fun testParser() {
        val sentence = "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
        val result = "L3m I3m i0s s4y d2y t2t o0f t1e p4g a1d t7g i6y"
        Assertions.assertEquals(Parser.parser(sentence), result)
    }
}