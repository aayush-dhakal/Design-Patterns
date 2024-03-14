public class CompositeTest {
    public static void main(String[] args) {
        Component hd=new Leaf(4000,"HDD");
        Component mouse=new Leaf(500,"Mouse");
        Component monitor=new Leaf(8000,"Monitor");
        Component ram=new Leaf(3000,"Ram");
        Component cpu=new Leaf(9000,"CPU");

        Composite ph=new Composite("Peri");
        Composite cabinet=new Composite("Cabinet");
        Composite mb=new Composite("MB");
        Composite computer=new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor); // for every composite like ph and cabinet they will have their own list items. So here, ph will have mouse and monitor as its components. Which will then be printed by iterating them inside the showPrice method of Composite class.
        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        ram.showPrice();
        System.out.println("----");

        ph.showPrice();
        System.out.println("----");

        computer.showPrice();
    }
}
