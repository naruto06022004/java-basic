import java.util.Scanner; // import the Scanner class

public class Ex3 {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number;
        System.out.println("nhap so a");
        number = myObj.nextInt();
        int tempGreatestCommonDivisor =0;
        int tempLeastCommonMultiple =0;
        int number2;
        System.out.println("nhap so b ");
        number2 = myObj.nextInt();
        int i = 0 ;
        boolean check = true;
        while ( check ) {
            i++;
            if (number % i == 0&&number2 % i==0 ) {
                tempGreatestCommonDivisor= i;

            }
             if (i % number == 0&& i % number2 ==0){
                 tempLeastCommonMultiple = i;
               /*  break;*/
                 check = false ;
             }
        }
        System.out.println("uoc lon nhat : "+ tempGreatestCommonDivisor);
        System.out.println( "boi be nhat : " + tempLeastCommonMultiple);
    }
}
