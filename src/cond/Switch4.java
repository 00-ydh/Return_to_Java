package cond;


//새로운 switch 문.. 조금 깔끔하긴 하다. "->" 를 사용 실무에서 완전 많지 않지만 점점 쓸 예정 새로운 switch문은 더 많은 내용을 담고있지만
//지금은 이정도로만 알자.
public class Switch4 {
    public static void main(String[] args) {

        int grade = 2;
        int coupon = switch(grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(coupon);

    }
}
