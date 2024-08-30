import java.util.Scanner;

class Square{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int a=scanner.nextInt();
        int result=a*a;
        System.out.println("the square of "+a+result);
    }
}