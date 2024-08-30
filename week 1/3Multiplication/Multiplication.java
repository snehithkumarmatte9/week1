import java.util.Scanner;

class Multiplication{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number1 ");
        int a=scanner.nextInt();
        System.out.println("enter the number 2 ");
        int b=scanner.nextInt();
        int result=a*b;
        System.out.println("the multiplication of "+a+" and "+b+" is "+result);
    }
}