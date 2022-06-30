package function;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class FunctionTest {

    @Test
    void runnable() {
        Runnable runnable = () -> System.out.println("hello world!!!");
        runnable.run();
    }

    @Test
    void supplier() {
        Supplier<String> stringSupplier = () -> "Hello World!!!";
        assertThat(stringSupplier.get()).isEqualTo("Hello World!!!");
    }

    @Test
    void consumer() {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("hi");
    }

    @Test
    void function() {
        Function<Integer, Integer> function = (integer -> integer + 1);
        assertThat(function.apply(1)).isEqualTo(2);
    }

    @Test
    void predicate() {
        Predicate<String> predicate = (s -> s.equals("hi"));
        assertTrue(predicate.test("hi"));
    }

}
