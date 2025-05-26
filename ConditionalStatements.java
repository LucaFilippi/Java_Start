
public class ConditionalStatements {

    public static void main(String[] args) {
        System.out.println("testing conditional statements");
        int age;
        age = 2;
        int quantityPearson;
        quantityPearson = 1;

        if (age >= 18) {
            System.out.println("You are older than 18. ");
            System.out.println("you can buy a beer!");

        } else {
            if (quantityPearson >= 2) {

                System.out.println("Okay, you're under 18, but you have a guardian with you");
                System.out.println("you can buy a beer!");
            } else {

                System.out.println("you are under 18");
                System.out.println("you can't buy a beer!");

            }
        }

    }
}
