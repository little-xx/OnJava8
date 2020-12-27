import java.util.Random;
import java.util.stream.Stream;

public class RandomGenerators {

    public static <T> void show(Stream<T> stream) {
        stream.limit(4).forEach(System.out :: println);
        System.out.println("+++++++++");
    }

    public static void main(String[] args) {
        Random random = new Random(47);

        show(random.ints().boxed());
        show(random.doubles().boxed());
        show(random.longs().boxed());

        show(random.ints(10, 20).boxed());
        show(random.doubles(50, 100).boxed());
        show(random.longs(20, 30).boxed());

        show(random.ints(2).boxed());
        show(random.doubles(2).boxed());
        show(random.longs(2).boxed());

        show(random.ints(2, 3, 6).boxed());
        show(random.longs(3, 20,50).boxed());
        show(random.doubles(3, 2.3, 5.6).boxed());
    }
}
