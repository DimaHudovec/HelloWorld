import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public static void hello(String name){
        System.out.println("Hello " + name);
    }
    public static void helloAll(ArrayList<String> names){
        for (String name : names) {
            hello(name);
        }
    }
}
