import interfaces.*;

import java.io.File;
import java.io.IOException;

public class Assistant implements Health, Money, Family, Carrier, Friends {

    public Assistant(String helper) {
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

    protected void sayHello() {
        System.out.println("Hello!");
    }
}
