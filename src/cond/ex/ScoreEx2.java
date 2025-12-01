package cond.ex;

public class ScoreEx2 {
    public static void main(String[] args) {
        int dollar = 10;
        int won = dollar * 1300;


        if (dollar < 0){
            System.out.println("잘못된 금액입니다.");
        }else if (dollar ==0 ){
            System.out.println("환전된 돈이 없습니다.");
        }else{
            System.out.println("환전금액은"+won+"입니다.");
        }
    }
}
