import java.util.Scanner;
public class Prime{
    public static void main(String []args){
        int n,count =0;
        System.out.print("Enter any number");
        Scanner scan = new Scanner (System.in);
        n=scan.nextInt();
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if(count ==2)
            System.out.println("Prime number");
        else
            System.out.print("not a prime number");
    }

}
