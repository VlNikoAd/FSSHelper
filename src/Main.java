import java.io.File;
import java.io.IOException;

public class Main {

    private static final String helper = "/Users/vladislav/helper.txt";

    public static void main(String[] args) {
        createHelper(helper);

        Assistant assistant = new Assistant();
        assistant.sayHello();

        /*
        1. Create mvp console
        2. Reader/Writer
         */
    }
    private static void createHelper(String helper) {
        File file = new File(helper);
        try {
            if (file.createNewFile())
                System.out.println(helper + " complete!");
            else
                System.out.println(helper + " something wrong!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
