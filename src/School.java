import java.util.ArrayList;

public class School {
    private String name;
    private AcademicStaff head;
    private ProfessionalStaff manager;
    private ArrayList<Staff> staffList;
    private ArrayList<Subject> subjectList;
    private ArrayList<HDRStudent> studentList;

    public School(String name, AcademicStaff aStaff, ProfessionalStaff pStaff, ArrayList<Staff> staffList, ArrayList<Subject> subjectList, ArrayList<HDRStudent> studentList) {
        this.name = name;
        this.head = aStaff;
        this.manager = pStaff;
        this.staffList = staffList;
        this.subjectList = subjectList;
        this.studentList = studentList;
    }

    // schoolName getter
    public String getSchoolName() {
        return name;
    }

    public AcademicStaff getHead() {
        return head;
    }

    public ProfessionalStaff getManager() {
        return manager;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public ArrayList<HDRStudent> getStudentList() {
        return studentList;
    }

}
