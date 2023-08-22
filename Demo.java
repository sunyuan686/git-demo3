import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        System.out.println("HelloKitty");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("Hello" + i);
        }
        list.forEach(item -> System.out.println(item));

    }
}
