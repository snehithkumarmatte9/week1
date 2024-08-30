import java.util.Scanner;

class Largest{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number 1");
        int num1=scanner.nextInt();
        
        System.out.println("enter the number2:");
        int num2=scanner.nextInt();
        
        System.out.println("enter the number3");
        int num3=scanner.nextInt();
        
        int largest=Math.max(num1,Math.max(num2,num3));
        System.out.println(largest);
    }
}