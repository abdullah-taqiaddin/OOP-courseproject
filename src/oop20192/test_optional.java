
package oop20192;

import java.util.Scanner;

public class test_optional 
{
    
    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);
        
        
        int position = 1 ;
        Course[] courses = new Course[20] ;
        
        int choice = 0 ;
       while(choice != 8)
       {
                   
        int number = 0  ;
        System.out.println("--------------------------------------------");
        System.out.println("1. add new course" + "\n2. add student to selected course , max number of students : 20 " +
                "\n3. Delete student for selected course" + "\n4. reset a course" +"\n5. Display students of the course" +
                "\n6. Add exam score to a student in the selected course"
        + "\n7. Show average of students in the selected course" 
                + "\n8. to exit" +"\n--------------------------------------------\n");
        choice = in.nextInt();
           if(choice == 1)
           {
              for(int i = 0  ; i <= 20 ; i++ )
              {
                  if(courses[i] == null)
                  {
                    System.out.println("enter course number : ");
                    String CourseNumber = in.next();
                    System.out.println("enter course title : ");
                    String CourseTitle = in.next();
                    courses[position] = new Course(CourseNumber, CourseTitle);
                    position++;
                    break;
                  }
                  else
                      System.out.println("NO MORE SPACE !");
              }

           }
           if(choice == 2)
               {
                   System.out.println("Choose the course you wish to add a student to : ");
                   number = in.nextInt();
                 if(number <= 20 && number > 0)
                 { 
                   
                    if(courses[number] != null)
                      {                     
                          if(courses[position].fullCourse()== true) //avalible space 
                            {
                                  System.out.println("Enter the Id : ");
                                  String Id = in.next();
                                  System.out.println("Enter first name : ");
                                  String FirstName = in.next();
                                  System.out.println("Enter last name : ");
                                  String LastName = in.next();
                            /////////////
                                  System.out.println("Enter the studetn's home Address : ");
                                  System.out.println("Home City : ");
                                  String Hcity = in.next();
            
                                  System.out.println("Home street : ");
                                  String Hst = in.next();
            
                                  System.out.println("Building Number : ");
                                  int Hbuilding = in.nextInt();
                            ///////////
                                  System.out.println("Enter the student's college address : ");
                                  System.out.println("College Name : ");
                                  String Cname = in.next();
            
                                  System.out.println("College city : ");
                                  String Ccity = in.next();
            
                                  System.out.println("College street : ");
                                  String Cst = in.next();
            
                                  System.out.println("College Building number : ");
                                  int Cbuilding = in.nextInt();
                                     courses[number].addStudent(new Student(Id, FirstName, LastName, new Address(Hst, Hcity, Hbuilding),
                                     new CollegeAddress(Cname, Cst, Ccity, Cbuilding))); 
                            }
                           else 
                                System.out.println("FULL COURSE !");
                          
                      }
                      else
                        System.out.println("the course u entered is empty !");
                }
                else
                    System.out.println("The course number u entered is invalid");
               }
           else if(choice == 3)
           {
               System.out.println("Choose the number of course u wish to delete a student from : ");
               number = in.nextInt();
               if(number <= 20)
               {
                   if(courses[number] != null)
                   {
                    System.out.println("Enter the student id : ");
                    String Id = in.next();
                    courses[number].deleteStudent(Id);
                   }
                   else
                       System.out.println("the course number u enterd is empty !");
               }
               else if(number < 1 || number > 20)
                   System.out.println("Invalid course number");
           }
           else if(choice == 4)
           {
               System.out.println("choose the number of course : ");
               number = in.nextInt();
               if(number <= 20)
               {
                   if(courses[number] != null)
                   {
                       courses[number].resetCourse();
                   }
                   else
                       System.out.println("the course number u enterd is empty !");
               }
               else if(number < 1 || number > 20)
                   System.out.println("Invalid course number");
           
           
           }
           else if(choice == 5)
           {
               System.out.println("Choose the number of course: ");
               number = in.nextInt();
               if(number <= 20)
               {
                   if(courses[number] != null)
                   {
                       courses[number].showStudents();
                   }
                   else
                       System.out.println("The course number u entered is empty !");
               }
                else if(number < 1 || number > 20)
                   System.out.println("Invalid course number");
           }
           else if(choice == 6)
           {
               System.out.println("Choose the number of course: ");
               number = in.nextInt();
               if(number <= 20)
               {
                   if(courses[number] != null)
                   {
                       System.out.println("Enter the student id : ");
                       String Id = in.next();
                       
                        for(int j = 1 ; j < 4 ; j++)
                    {
                        System.out.println("Enter the " + j + " exam score");
                        int ExamScore = in.nextInt();
                        courses[number].addExamScore(Id, j, ExamScore);
                    }
                   }
                   else
                       System.out.println("The course number u entered is empty !");
               }
                else if(number < 1 || number > 20)
                   System.out.println("Invalid course number");
           }
           else if(choice == 7)
           {
               System.out.println("Choose the number of course: ");
               number = in.nextInt();
               if(number <= 20)
               {
                   if(courses[number] != null)
                   {
                       System.out.println(courses[number].getAverage());
                   }
                   else
                       System.out.println("The course number u entered is empty !");
               }
                else if(number < 1 || number > 20)
                   System.out.println("Invalid course number");
           }
           else if(choice == 8)
               break;
           else if(number > 8 || number < 1)
               System.out.println("INVALID NUMBER !");       
       }       
    }
        
}
    

