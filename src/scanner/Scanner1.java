package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열"+str);



        System.out.print("숫자를 입력하세요");
        int intvalue = scanner.nextInt();
        System.out.println("입력한 문자열"+intvalue);




        System.out.print("문자열을 입력하세요");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 문자열"+doubleValue);



    }
}
