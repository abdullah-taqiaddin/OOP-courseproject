package oop20192;

import java.util.Scanner;

public class CourseDriver 
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        int x  ; 
        System.out.println("Enter the numebr of students : ");
        x = input.nextInt();
        Course N = new Course("6969", "OOP");
        if(x <= 20 )
        {
            for(int i = 0 ; N.getPosition() < x ; i++)
            {
            System.out.println("Enter the Id : ");
            String Id = input.next();
            System.out.println("Enter first name : ");
            String FirstName = input.next();
            System.out.println("Enter last name : ");
            String LastName = input.next();
            /////////////
            System.out.println("Enter the studetn's home Address : \n");
            System.out.println("Home City : ");
            String Hcity = input.next();
            
            System.out.println("Home street : ");
            String Hst = input.next();
            
            System.out.println("Building Number : ");
            int Hbuilding = input.nextInt();
            ///////////
            System.out.println("Enter the student's college address : ");
            System.out.println("College Name : ");
            String Cname = input.next();
            
            System.out.println("College city : ");
            String Ccity = input.next();
            
            System.out.println("College street : ");
            String Cst = input.next();
            
            System.out.println("College Building number : ");
            int Cbuilding = input.nextInt();
            N.addStudent(new Student(Id, FirstName, LastName, new Address(Hst, Hcity, Hbuilding),
            new CollegeAddress(Cname, Cst, Ccity, Cbuilding))); 

            
            }
           
        }
        else if (x < 12
                || x > 20)
        {
            System.out.println("INVALID");
        }
        System.out.println(N.toString()+"\n__________________________");
         N.showStudents();
        
        for(int i = 1 ; i <= x ; i++)
        {
            System.out.println("Enter ID :");
            String Id = input.next();
            for(int j = 1 ; j < 4 ; j++)
            {
                System.out.println("Enter the " + j + "exam : ");
                int ExamScore = input.nextInt();
                N.addExamScore(Id, j, ExamScore);
            }
            
        }
        
        System.out.println(N.getAverage());

        
    }
 
          
    
    

}
