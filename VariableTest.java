
public class VariableTest {

    public static void main(String[] args) {
        int first, second;
        first = 5;
        second = 7;

        second = first;
        first = 10; //this line doesn't change the value of 'second' since it executes after the initial assignment 

        System.out.println(second);

    }

}
