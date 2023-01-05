
package oop20192;

public class Course 
{
    private String CourseNumber ;
    private String CourseTitle ;
    private int position ;
    private Student [] students ;

    public Course() {
    }

    public Course(String CourseNumber, String CourseTitle) {
        this.CourseNumber = CourseNumber;
        this.CourseTitle = CourseTitle;
        this.position = 0;
        students = new Student[20] ;
    }

    public int getPosition() {
        return position;
    }
    
    //to check if the course is empty or not
    public boolean emptyCourse()
    {
        for(int i = 0 ; i < students.length ; i++)
        {
            if(students[i] != null)
                return true ;
        }
        return false ;
    }
    
    //to check if the course is full or not
    public boolean fullCourse()
    {
        for(int i = 0 ; i < students.length ; i++)
        {
            if(students[i] == null)
                return true; //avalible space
        }
        return false ; // no space left
    }
    
    public boolean isDuplicate(Student N){
        
        for(int i = 0 ; i < students.length ; i++)
        {   if(students[i] != null)
            {
                if(N.getStudentId().equals(students[i].getStudentId()))
                    return true ; // this students already exists
            }
            else if(students[i] == null)
                continue;
        }
        return false ; // no match for students id 
    }
    
    public void addStudent(Student N)
    {
        if(fullCourse() == false)
        {
            System.out.println("full course");
        }
        else if(fullCourse() == true)
        {
            if(isDuplicate(N) == true)
            {
                System.out.println("student already exists");
            }
            else if(isDuplicate(N) == false)
            {
                students[position] = N ;
                position++;
            }
        }
    }
    
    public void showStudents()
    {
        if(emptyCourse() == false)
        {
            System.out.println("Empty Course");
        }
        else
        {
            for(int i = 0 ; i < students.length ; i++)
            {
                if(students[i] == null)
                {
                    continue;
                }
                else if(students[i] != null)
                {
                    System.out.println(students[i].toString() + "\n________________");
                }
            }
        }

    }
    
    //cant use isDuplicate() in deleteStudent() becaues to delete the
    // student u need to identify where it is .
    
    public void deleteStudent(String N)
    {
      for(int i  = 0 ; i < students.length ; i++)
      {
          if(N.equals(students[i].getStudentId()))
          {
              students[i] = null;
              return;
          }
     
      }
      System.out.println("No Such Student");
    }
    
    // we have to use Id number , cant use isDuplicate()
    
    public void addExamScore(String Id , int ExamNum , int ExamScore)
    {
        for(int i = 0 ; i < students.length ; i++)
        {
            if(Id.equals(students[i].getStudentId()))
            {
                switch(ExamNum)
                {
                    case 1 :
                        students[i].setFirstExam(ExamScore);
                        break;
                    case 2 : 
                        students[i].setSecondExam(ExamScore);
                        break;
                    case 3 :
                        students[i].setFinalExam(ExamScore);
                        break;
                    default:
                        System.out.println("INVALID");
                }
                return; 
            }
            /*
            else
            {
                System.out.println("No such student");
                break;
            }
            */
        }
        System.out.println("No Such Student");
    }
    
    public String getAverage()
    {
        int index = 0 ;
        int average ;
        int sum = 0 ;
    
        for(int i = 0 ; i < students.length ; i++)
        {
            if(students[i] != null){
               index++; 
            }
                
        }
        for(int i = 0 ; i < students.length ; i++){
            
            if(students[i] != null)
            {
                sum += students[i].getTotlaExamScore();
            }
            else
                continue;
        }
        average = ( sum / index);
        return "Average : " + average ;
    }
    
    public void resetCourse()
    {
        for(int i = 0 ; i < students.length ; i++)
        {
            if(students[i] != null)
            {
                students[i] = null; 
            }
            else if(students[i] == null)
                continue ;
        }
    }
    
    public String toString()
    {
        return   CourseNumber + "_____" + CourseTitle ;
    }
    /**/
}
