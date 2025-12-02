package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;// if 코드에서만 사용 비효율적인 메모리를 사용한다. 코드의 복잡성이 증가한다. 스코프가 넓으면 실무에서는 불편할 수 있다.


        if (m>0){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }



        System.out.println("m="+m);
    }
}
