class MainLaptop {
public static void main(String []args)
{
    Laptop l1=new Laptop();
    l1.brand="linovo";
    l1.processer="i3";
    l1.ram=4;
    l1.storage=250;
    Laptop l2=new Laptop();
    l2.brand="dell";
    l2.processer="i7";
    l2.ram=16;
    l2.storage=1024;
    l1.properties();
    System.out.println("___________________________________________-");
    l2.properties();
    l2.install();
    l2.uninstall();
}    

}
