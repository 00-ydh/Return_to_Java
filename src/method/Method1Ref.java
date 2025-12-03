package method;

public class Method1Ref {
    public static void main(String[] args) {


        int sum1 = add(1, 2);
        System.out.println("결과출력 "+sum1);

        System.out.println("++++++++++++++++++++++++++++++++++");

        int sum2 = add(15, 20);
        System.out.println("결과출력"+sum2);


    }
    //반환타입 int 이거 뭔가 예전에 헷갈린거같음
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + "연산수행" + "");
        int sum = a + b;
        return sum;


    }
}