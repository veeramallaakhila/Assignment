package practise.com;

import java.util.Scanner;


public class amstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter a number"+n);
        int se=0,k=n,a,c;
        for(int i=0;i<n;i++)
        {
            a=n%10;
            c=a*a*a;
            se=se+c;
            n=n/10;
                System.out.println(c);
        }
        if (se == k) {
            System.out.println("Given number is Armstrong");
        }
        else {
            System.out.println("Given number is not Armstrong");

        }
    }
}
