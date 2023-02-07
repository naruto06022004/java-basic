import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên:");
        Integer number = myObj.nextInt();
        System.out.println("A =" + number);
        int totalNumber = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                totalNumber = totalNumber + 1;

            }
        }
        System.out.println(" So luong uoc =" + totalNumber);

    }
}
