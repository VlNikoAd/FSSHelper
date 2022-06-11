import interfaces.*;

public class Assistant implements Health, Money, Family, Carier, Friends {

    public Assistant() {}

    protected void sayHello() {
        System.out.println("Hello!");
    }
}
