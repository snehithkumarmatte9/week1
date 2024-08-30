import java.util.Scanner;

class Even{
    public static void main(String[] main){
        Scanner scanner=new Scanner(System.in);
        
        int a=scanner.nextInt();
        if (a%2==0){
    
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}