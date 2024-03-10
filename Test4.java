public class Test4 {
    public static void main (String [] args)
    {
        System.out.println(isVowel('p'));
        System.out.println(isVowel('a'));
    }
    public static boolean  isVowel(char ch)
    {
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        else
            return false;
    }
}
