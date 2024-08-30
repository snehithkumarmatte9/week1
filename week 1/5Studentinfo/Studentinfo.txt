import java.util.Scanner;

class Studentinfo{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name :");
        String name=scanner.nextLine();
        
        System.out.println("enter rollnumber:");
        String rollnumber=scanner.nextLine();
        
        System.out.println("enter the total marks:");
        int marks=scanner.nextInt();
        System.out.println("name of student  : "+name);
        System.out.println("roll number : " +rollnumber);
        System.out.println("marks of the student : "+marks);
    }
}