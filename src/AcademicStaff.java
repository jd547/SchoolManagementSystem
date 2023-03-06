import java.util.ArrayList;

public class AcademicStaff extends Staff{
    private ArrayList<Subject> subjectList;
    private ArrayList<HDRStudent> studentList;

    public AcademicStaff(String staffID, String name, String title, String phone, String email, String location, ArrayList<Subject> subjectList, ArrayList<HDRStudent> studentList) {
        
        // explicit call to superclass Staff constructor
        super(staffID, name, title, phone, email, location);

        this.subjectList = subjectList;
        this.studentList = studentList;
    }
}
