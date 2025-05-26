public class charaters{
    public static void main(String[] args){

        char letter0;
        letter0 = 'a';
        System.out.println(letter0);

        char letter1;
        letter1 = 66; // the code still works because of the ASCII table. that converts "66" to "B"
        System.out.println(letter1);

        char letter2;
        letter2 = 66; 
        letter2 = (char)(letter2 + 1); // the code still works because of the ASCII table. that converts "67" to "C"
        System.out.println(letter2);

        String message;
        message = "I'm learning Java!";
        System.out.println(message);

        message = message + " My teacher is a youtuber teacher!";
        System.out.println(message);
    }
}