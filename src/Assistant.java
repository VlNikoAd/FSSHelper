import interfaces.*;

public class Assistant implements Health, Money, Family, Carrier, Friends {

    public Assistant() {}

    protected void sayHello() {
        System.out.println("Hello!");
    }
}
