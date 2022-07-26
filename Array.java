import java.util.*;
public class HelloWorld {
    public static void main(String args[]) {
        int[] prakash;
        prakash=new  int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(int i=0; i<prakash.length; i++) {
            prakash[i]=input.nextInt();

        }
        for(int i=0; i<prakash.length; i++) {
            System.out.println("your marked is "+prakash[i]);




        }
    }
}
