public class ParameterCons {
    //parameterized Constructor
    public ParameterCons(int a, int b){
        System.out.println("Addition using parameterized Constructor");
        System.out.println(a + " + " + b + " = " +(a + b));
    }

    public static void main(String[] args) {
        
        // Object Create to Call Constructor 
        ParameterCons pr = new ParameterCons(41, 55);
    }

}
