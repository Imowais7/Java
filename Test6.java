public class Test6 {
    public static void main(String[] args)
    {
     System.out.println(largest(10,30,15));
     System.out.println(smallest(15,30,10));

    }
    public static int largest(int a,int b, int c)
    {
        if (a>b & a>c)
            return a;
        else if(b>c)
            return b;
        else 
            return c;
    }
    public static int smallest(int a,int b, int c)
    {
        if (a<b & a<c)
            return a;
        else if(b<c)
            return b;
        else 
            return c;
    }
}
