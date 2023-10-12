import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        System.out.println("HelloKitty");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            list.add("Hello" + i);
        }
        list.forEach(item -> System.out.println(item));

        methond1();

    }
    public static void methond1(){
        System.out.println("method1");
    }



    public static void methond2(){
        System.out.println("method2");
    }

}
