public class floatsvariables{
    public static void main(String[] args){
        
       double operation0;
       operation0 = 3.4/2;

       System.out.println(operation0);

       int operation1;
       operation1 = 3/2;

       System.out.println(operation1);
        
        // incorrect way, this will result 1.0
       double operation2;

       operation2 = 3/2;

       System.out.println(operation2);

       // correct way:
              double operation3;

       operation3 = 3.0 /2;

       System.out.println(operation3);
}

}
