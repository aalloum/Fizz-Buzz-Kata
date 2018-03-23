import com.sun.tools.javah.JavahTask;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_input() {
        assertThat(fizzBuzz.process(1)).isEqualTo("1");
        assertThat(fizzBuzz.process(2)).isEqualTo("2");
        assertThat(fizzBuzz.process(4)).isEqualTo("4");
    }

    @Test
    public void should_return_fizz_when_input_is_multiple_of_3() {
        assertThat(fizzBuzz.process(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.process(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.process(9)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_fizz_when_input_is_multiple_of_5() {
        assertThat(fizzBuzz.process(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.process(10)).isEqualTo("Buzz");
        assertThat(fizzBuzz.process(20)).isEqualTo("Buzz");
    }


    @Test
    public void should_return_fizz_when_input_is_multiple_of_3_and_5() {
        assertThat(fizzBuzz.process(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.process(30)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.process(45)).isEqualTo("FizzBuzz");
    }


    @Test
    public void should_return_Generic_fizz_if_multiple_of_3() {
        assertThat(fizzBuzz.processGeneric(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.processGeneric(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.processGeneric(9)).isEqualTo("Fizz");
    }
    @Test
    public void should_return_input_With_Generic(){
        assertThat(fizzBuzz.processGeneric(1)).isEqualTo("1");
        assertThat(fizzBuzz.processGeneric(13)).isEqualTo("13");
    }
}