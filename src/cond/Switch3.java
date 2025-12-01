package cond;

public class Switch3 {
    public static void main(String[] args) {

    int grade =2;
    int coupon;

        switch (grade){
        case 1:
            coupon = 1000;
            break;
        case 2:         //break 유무 // 대부분  break 씀..
        case 3:
            coupon = 3000;
            break;
        default:
            coupon = 4000;
    }
        System.out.println(coupon);
}
}
//case는 값을 확인하는 문에만 사용한다. 솔직하게 if 문만 사용해도 된다 하지만 간결함을 위해 case문을 사용한다. 근데 솔직히 그다지..
// if 문만 정확하게 써도 상관없다고 한다. 새로운 switch 문이 있다고 한다. java14~~~ 다음 코드를 통해 보자.