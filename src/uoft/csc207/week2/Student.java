package uoft.csc207.week2;

public class Student extends Person{

    /**
     * Initialize this Person named name with UTORid utorid.
     *
     * @param name   the person's name (family name last)
     * @param utorid the person's UTORid
     */
    Student(String[] name, String utorid, String studentID) {
        super(name, utorid);
    }
}
