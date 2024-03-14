import java.util.ArrayList;
import java.util.List;

interface Component {
    void showPrice();
}

class Leaf implements Component {
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @java.lang.Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }
}

class Composite implements Component {
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component com) {
        components.add(com); // this com will be of Leaf type actually which will then have its own showPrice implementation
    }

    @java.lang.Override
    public void showPrice() {
        System.out.println(name); // this will first print the Composite name itself like Computer

        for (Component c : components) { // there will be no components for Computer composite so this will not execute for it. But for Peri it will have it's two components Mouse and Monitor
            c.showPrice(); // this c.showPrice will be called from Leaf class method
        }
    }
}
