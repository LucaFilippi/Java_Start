
public class ConditionalTests3 {

    public static void main(String[] args) {
        System.out.println("testing conditional statements");
        int age;
        age = 12;
        boolean Accompanied;
        Accompanied = true;

        if (age >= 18 && Accompanied) { //and both in must be true (1)
            System.out.println("you can buy a beer!");

        } else {
            System.out.println("you can't buy a beer!");

        }
    }

}
