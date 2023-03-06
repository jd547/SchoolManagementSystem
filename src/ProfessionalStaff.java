public class ProfessionalStaff extends Staff {
    private String workingDays;
    private String position;

    public ProfessionalStaff(String staffID, String name, String title, String phone, String email, String location, String workingDays, String position) {

        // explicit call to superclass Staff constructor
        super(staffID, name, title, phone, email, location);

        this.workingDays = workingDays;
        this.position = position;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("%sWorking Days: %s%nPosition: %s%n",
        super.toString(), workingDays, position);
    }
    
    // workingDays getter and setter
    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    // position getter and setter
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
