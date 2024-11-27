import kotlin.test.Test
import org.junit.jupiter.api.assertDoesNotThrow

class HelloWorldTest {

  @Test
  fun `runs without throwing`() {
    assertDoesNotThrow { main() }
  }
}
