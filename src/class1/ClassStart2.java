package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] studentnames = { "학생1", "학생2"};
        int [] studentages = {15, 16};
        int [] studdentsGrade = {90, 80};
        for (int i = 0 ; i < studentnames.length ; i++){
            System.out.println("이름"+studentnames[i]+"나이"+studentages[i]+"성적"+studdentsGrade[i]);
        }


    }
}
