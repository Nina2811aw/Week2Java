package uoft.csc207.week2;

public class Student extends Person{
    private final String studentID;

    /**
     *
     * @param name
     * @param utorid
     * @param studentID
     */
    Student(String[] name, String utorid, String studentID) {
        super(name, utorid);
        this.studentID = studentID;
    }
}
