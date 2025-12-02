package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){


            System.out.println("숫자를 입력하시오");
            int num = input.nextInt();
            if (num==0){
                break;
            }
            sum += num;
            System.out.println("숫자의 합"+sum);



        }


    }
}
