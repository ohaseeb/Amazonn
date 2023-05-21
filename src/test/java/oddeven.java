import java.util.Scanner;

public class oddeven {

    static void oddevn(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int val=sc.nextInt();
        if (val%2==0)
        {
            System.out.println("given number is even");
        }
        else {
        System.out.println("given number is odd");
        }
    }

    public static void main(String[] args) {
        oddeven.oddevn();
    }
}
