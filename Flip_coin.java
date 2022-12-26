import java.util.Scanner;
public class Flip_coin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number you want to toss the coin");
        int num = scan.nextInt();
        int count = 0;
        int head = 0;
        int tail = 0;
        for (int i = 0; i < num; i++) {
            if (Math.random() < 0.5) {
                tail = tail + 1;
            } else {
                head = head + 1;
            }
        }
        System.out.println("Head count is : " + head);
        System.out.println("Tail count is : " + tail);
        double percentageOfHead = (head * 100) / num;
        double percentageOfTail = (tail * 100) / num;
        System.out.println("Percentage of head is : " + percentageOfHead + "%");
        System.out.println("Percentage of tail is : " + percentageOfTail + "%");
    }
}

