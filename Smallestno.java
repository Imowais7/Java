// find the smallest of given five number

class Smallestno {
    public static void main(String[] args)
    {
        int n1=312, n2=203, n3=45,n4=84,n5=33;
        if (n1<n2 && n1<n3 && n1<n4 && n1<n5 )
            System.out.println(n1+ " is smallest number");

        else if(n2<n3 && n2<n4 &&n2<n5)
            System.out.println(n2+" is smallest no");
        else if(n3<n4 &&n3<n5)
            System.out.println(n3+" is a smallest");
        else  if (n4<n5)
            System.out.println(n4+"is smallest number");
        else
            System.out.println(n5+"is smallest ");
    }
    
}
