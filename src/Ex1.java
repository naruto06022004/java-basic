import java.util.Scanner;

public class Ex1 {// =>  để tạo ra object
    int test;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên:");
        int number = scanner.nextInt();
        System.out.println(number);
        System.out.println("A: " + getSum(number));// String + int = String
        int newNumber= getSum(3)+ 8;
        System.out.println(newNumber);
        System.out.println("B:" + getFloatSum(number));
    }

    public static int getSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number;i++) {
            if (number % 2 == 0 && i % 2 == 1) {
                sum = sum + i;
            } else if (
                    number % 2 == 1 && i % 2 == 1
            ) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static float getFloatSum(int number) {
        int result=0;
        for (int i = 0; i < number; i++)
        {
            System.out.println(1/i);

        }

        return  result;
    }


}
