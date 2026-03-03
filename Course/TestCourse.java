public class TestCourse{


        public static void main(String[] args) {

     try {
      Course goodCourse = new Course("Math 101", 3, "Dr. Smith", "MWF", "9:00AM");
      System.out.println("Successfully created course: " + goodCourse.getCourseName());
       } 
       catch (CreditException e) {

     System.out.println("Failed to create course: " + e.getMessage());
      }
    

     try {
       Course badCreditCourse = new Course("Science", 7, "Dr. Brown", "TR", "10:00AM");
        } 
     catch (CreditException e) {
       System.out.println("Error: " + e.getMessage());
        }
    
    try {
         Course badMaxCourse = new Course("History", 3, "Prof. Green", "MW", "2:00PM", 6);
     } 
     catch (StudentException e) {
         System.out.println("Error: " + e.getMessage());
      }
    
      try {
      Course dupStudentCourse = new Course("Programming", 3, "Dr. Ada", "TR", "1:00PM");
      Student s1 = new Student("Nahian Karim", "024190");
       Student s2 = new Student("Faiza Etu ", "0215340");
      Student s3 = new Student("Nahian Karim ", "024190"); 
    
        dupStudentCourse.addStudent(s1);
       dupStudentCourse.addStudent(s2);
       dupStudentCourse.addStudent(s3); 
        } catch (StudentException | CreditException e) {
      System.out.println("Error adding students: " + e.getMessage());
            }
        }
    }