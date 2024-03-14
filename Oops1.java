
    

public class Oops1 {
    public static void main(String []args)
    {
        Marker m1=new Marker();
        m1.colour="red";
        m1.brand="camel";
        System.out.println(m1.colour);
        System.out.println("my brand is " +m1.brand);
        Marker m2=new Marker();
        m2.colour="green";
        System.out.println(m2.colour);
        Marker m3= new Marker();
        m3.colour="black";
        System.out.println(m3.colour);
        m1.write();

    }

    
}

class Marker {
    String colour;
    String brand;
    public void write()
    {
        System.out.println("i am for writing");
    }

    
}
