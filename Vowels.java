
// Write a program to check the vowels
import java.util.Scanner;
class Vowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        char n = sc.next().charAt(0);
        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
        {
            System.out.println(n+"is a vowel"); 

        }
        else{
            System.out.println(n+" is a consonent");
        }

        

    }
}