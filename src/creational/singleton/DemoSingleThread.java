package creational.singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        Singleton captain1 = Singleton.getInstance("Make a captain. Done!");
        if (captain1 != null){
            System.out.println("Captain is created!");
        }
        Singleton captain2 = Singleton.getInstance("Trying to make another captain.");
        if (captain1 == captain2){
            System.out.println("Your team already have this captain(cap1 is cap2)");
        }
        else {
            System.out.println("Captain2 is successful created.");
        }
        System.out.println(captain1);
        System.out.println(captain2);
    }
}