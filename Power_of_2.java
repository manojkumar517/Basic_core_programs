import java.util.Scanner;

public interface Power_of_2 {
        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            System.out.println("Enter a number:");
            int num=scan.nextInt();
            System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
            System.out.println();
            System.out.println("Printing all till Power Value "+num);
            for(int i=1;i<=num;i++) {
                System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));
                long a,b,c;
                System.out.print("enter  any  calendar year :");
                b=scan.nextLong();
                if(b!=0)
                {
                    if (((b % 4 == 0) && (b % 100 != 0)) || (b % 400 == 0))
                        System.out.println(b+" is a leap year");
                    else
                        System.out.println(b+" is not a leap year");
                }
                else
                    System.out.println("year zero does not exist ");
            }
        }
}
