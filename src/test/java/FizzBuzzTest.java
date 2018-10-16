
import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_input() {
        Assertions.assertThat(fizzBuzz.fizzBuzz(1)).isEqualTo("1");
        assertThat(fizzBuzz.fizzBuzz(2)).isEqualTo("2");
        assertThat(fizzBuzz.fizzBuzz(4)).isEqualTo("4");
    }

    @Test
    public void should_return_fizz_when_input_is_devided_by_3() {
        assertThat(fizzBuzz.fizzBuzz(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.fizzBuzz(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.fizzBuzz(9)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_fizz_when_input_is_devided_by_5() {
        assertThat(fizzBuzz.fizzBuzz(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.fizzBuzz(10)).isEqualTo("Buzz");
        assertThat(fizzBuzz.fizzBuzz(20)).isEqualTo("Buzz");
    }


    @Test
    public void should_return_fizz_when_input_is_devided_by_3_and_5() {
        assertThat(fizzBuzz.fizzBuzz(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.fizzBuzz(30)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.fizzBuzz(45)).isEqualTo("FizzBuzz");
    }


    @Test
    public void should_return_generic_fizz_if_devided_by_3() {
        assertThat(fizzBuzz.fizzBuzzGeneric(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.fizzBuzzGeneric(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.fizzBuzzGeneric(9)).isEqualTo("Fizz");
    }
    @Test
    public void should_return_input_generic(){
        assertThat(fizzBuzz.fizzBuzzGeneric(1)).isEqualTo("1");
        assertThat(fizzBuzz.fizzBuzzGeneric(13)).isEqualTo("13");
        assertThat(fizzBuzz.fizzBuzzGeneric(105)).isEqualTo("FizzBuzzOLBATI");
    }
}