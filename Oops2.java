public class Oops2 {
    public static void main(String[] args)
    {
        Animal a1=new Animal();
        a1.initialize("dog", "black", "barke");
        a1.details();

        Animal a2=new Animal();
        a2.initialize("lion", "brown", "roar");
        a2.details();
    }
}

class Animal{
String name ;
String colour;
String sound;
public void initialize(String name,String colour, String sound)
{
    this.name=name;
this.colour=colour;
this.sound=sound;

}
public void details()
{
    System.out.println("name   - "+name);
    System.out.println("colour - "+colour);
    System.out.println("sound  - "+sound);
    System.out.println("-------------------------");
}
}