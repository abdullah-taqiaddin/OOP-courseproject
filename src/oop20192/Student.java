package oop20192;

public class Student 
{
     private String studentId ;
     private String firstName ;
     private String lastName;
     private Address homeAddress ;
     private CollegeAddress schoolAddress ;
     
     private int firstExamScore ;
     private int secondExamScore ;
     private int finalExamScore ;
     
     public Student()
     {
         //default
     }

    public Student(String studentId, String firstName, String lastName, Address homeAddress, CollegeAddress schoolAddress) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
        this.firstExamScore = 0;
        this.secondExamScore = 0;
        this.finalExamScore = 0 ;
    }
     
    //setters and getters
    public String getFullName()
    {
        return firstName + " " + lastName ;
    }
     
    public String getStudentId()
    {
        return studentId;
    }
    
    public void setFirstExam(int firstExamScore){
        this.firstExamScore = firstExamScore ;
    }
    
    public void setSecondExam(int secondExamScore){
        this.secondExamScore = secondExamScore ;
    }
    
    public void setFinalExam(int finalExamScore){
        this.finalExamScore = finalExamScore ;
    }

    public int getFinalExamScore() {
        return finalExamScore;
    }

    public int getSecondExamScore() {
        return secondExamScore;
    }

    public int getFirstExamScore() {
        return firstExamScore;
    }
    
    
     
    public void setExamScore(int ExamNum , int ExamScore)
    {
        switch(ExamNum)
        {
            case 1 :
                setFirstExam(ExamScore);
                break;
            case 2 :
                setSecondExam(ExamScore);
                break;
            case 3 : 
                setFinalExam(ExamScore);
            default :
            {
                if( ExamNum < 1 || ExamNum > 3){
                    System.out.println("INVALID!");
                    break;
                }
            }
        }
    }
    
    public int getExamScore(int ExamNum){
        
        switch(ExamNum)
        {
            case 1 :
                return firstExamScore ;
            case 2 :
                return secondExamScore ;
            case 3 :
                return finalExamScore ;
            default:
                return -1 ;
        }
    
    }
    
    public int getTotlaExamScore()
    {
        return (this.firstExamScore + this.secondExamScore + this.finalExamScore) ;
    }
    
    
    public String toString()
    {
       return "Student's full Name : " + getFullName() + "\nStudent Id : " + getStudentId()
               + "\nStudent's Home Address : \n" + homeAddress.toString() + "\nStudent's College Address : \n"
               + schoolAddress.toString();
       
    }
    /**/
}
