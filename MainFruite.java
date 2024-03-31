

class MainFruite {

    public static void main(String[] args) {

        Fruite f1 = new Fruite();
        f1.name = "mango";
        f1.colour = "yellow";
        Fruite f2 = new Fruite();
        f2.name = "banana";
        f2.colour = "green";
        System.out.println(f1.name);
        System.out.println(f1.colour);
        System.out.println("---------------------------");
        System.out.println(f2.name);
        System.out.println(f2.colour);
        f1.grow();
        f2.grow();

    }
}