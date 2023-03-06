public class HDRStudent {
    private String stuName;
    private String stuID;
    private String course;
    private Staff supervisor;

    public HDRStudent(String stuName, String stuID, String course, Staff supervisor) {
        this.stuName = stuName;
        this.stuID = stuID;
        this.course = course;
        this.supervisor = supervisor;
    }

    public String toString() {
        return String.format("Student Name: %s%nStudent ID: %s%nHDR Course: %s%nSupervisor: %s",
                             stuName, stuID, course, supervisor.getName());
    }

    // stuName getter and setter
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    // stuID getter and setter
    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    // course getter and setter
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
