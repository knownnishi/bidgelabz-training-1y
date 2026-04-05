package Assignment13;

public class Question2 {
    public void wapperToPrimitive(){
        Double num1=67.8;
        double num2=98.7;
        int num3=(int)num2;
        System.out.println("Double:-"+num1);
        System.out.println("double:-"+num2);
        System.out.println("int"+num3);

    }
    public static void main (String[] args){
        Question2 q2=new Question2();
        q2.wapperToPrimitive();
    }
}
