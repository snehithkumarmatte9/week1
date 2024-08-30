import java.util.Scanner;

class Addtwonumbers{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("enter number1");
        int num1=scanner.nextInt();
        
        System.out.println("enter number2");
        int num2=scanner.nextInt();
        
        int result=num1+num2;
        
        System.out.println("the sum of "+num1 +" and "+num2+"   is : "+result);
    }
}