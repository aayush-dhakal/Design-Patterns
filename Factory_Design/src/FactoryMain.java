// to format code hit ctrl+alt+L

import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
//        The Factory Method Design Pattern is a creational pattern that provides an interface for creating objects but allows subclasses to decide which class to instantiate. It is a pattern that promotes loose coupling between classes and promotes code reuse.
        OperatingSystemFactory osf = new OperatingSystemFactory();

//        OS obj = osf.getInstance("Open");
//        obj.spec();

//        OS obj = osf.getInstance("Closed");
//        obj.spec();

        OS obj = osf.getInstance("Windows");
        obj.spec();
    }
}
