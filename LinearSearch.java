public class LinearSearch
{
    public static void main(String args[])
    {
       int[] a1 = {10,20,30,40,50};
       int n = 30;
       for (int i = 0; i<5; i++)
       {
        if(a1[i]==n)
        System.out.println("The element is found");

        else
        System.out.println("Element not found");
       }

    }
}