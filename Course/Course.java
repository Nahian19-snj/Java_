
//package courses;

/**
 *
 * @author your name
 */
public class Course {

    private String courseName;
    private int credits;
    private String instructorName;
    private String days;
    private String times;
    private Student[] students;
    private int numStudents = 0;
    private int maxStudents = 30;
    
    public Course(String courseName) {
        this.courseName = courseName;
        students = new Student[maxStudents];
    }

    public Course(String courseName, int credits, String instructorName,
            String days, String times) throws CreditException { // credits must be 0 <= credits <= 6
        students = new Student[maxStudents];

        if (credits < 0 || credits >6) {
            throw new CreditException("Credits must be between 0 and 6.");
        }
        this.credits = credits;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.days = days;
        this.times = times;
    
    }
    public Course(String courseName, int credits, String instructorName,
            String days, String times, int maxStudents) throws StudentException{ // maxStudents must be 8 <= maxStudents <= 30

                if (maxStudents < 8 || maxStudents > 30) {
                    throw new StudentException("Max students must be between 8 and 30.");
        }
        students = new Student[this.maxStudents];
        
        this.credits = credits;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.days = days;
        this.times = times;
    }

    public void addStudents(Student[] newStudents) throws StudentException {
        for (Student s : newStudents) {
            addStudent(s);
        }
    }

    public void addStudent(Student s) throws StudentException {
        if (numStudents >= maxStudents) {
            throw new StudentException("Course is full.");
        }
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getStudentID().equals(s.getStudentID())) {
                throw new StudentException("Student already enrolled: " + s.getStudentID());
            }
        }
        students[numStudents++] = s;
    }

      public void dropStudent(Student s) throws StudentException {
        boolean found = false;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getStudentID().equals(s.getStudentID())) {
                found = true;
                for (int j = i; j < numStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--numStudents] = null;
                break;
            }
        }
        if (!found) {
            throw new StudentException("Student not found: " + s.getStudentID());
        }
    }
    public Student[] getStudents() {
        Student[] s = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            s[i] = students[i];
        }
        return s;

    }
    
    public int getNumStudents() {
        return numStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getDays() {
        return days;
    }

    public String getTimes() {
        return times;
    }
    @Override
    public String toString() {
        String frontEnd = courseName + "\n" + instructorName + "\nCredits: "
                + credits + "\nHas " + maxStudents + " max"
                + "\nMeets: " + days + ", " + times;
        for (int i = 0; i < numStudents; i++) {
            frontEnd += "\n" + students[i].toString();
        }
        return frontEnd;
    }

}
