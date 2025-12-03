package method;

public class MethodValue3 {
    public static void main(String[] args) {

        int number = 5;

        System.out.println("1. changeNumber 호출전, number:" + number);


        number = changeNumber(number);
        System.out.println("2. changeNumber 호출후, number:" + number);
    }


    public static int changeNumber(int num2) {
        System.out.println("2. changeNumber 변경전, number:" + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경후, number:" + num2);
        return num2;
    }
}
