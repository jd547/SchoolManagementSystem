public class Staff {
    protected String staffID;
    protected String name;
    protected String title;
    protected String phone;
    protected String email;
    protected String location;

    public Staff(String staffID, String name, String title, String phone, String email, String location) {
        this.staffID = staffID;
        this.name = name;
        this.title = title;
        this.phone = phone;
        this.email = email;
        this.location = location;
    }

    // toString method
    public String toString() {
        return String.format("%s %s%nStaff ID: %s%nPhone: %s%nEmail: %s%nLocation: %s%n",
         title, name, staffID, phone, email, location);
    }

    // name getter
    public String getName() {
        return name;
    }

    // staffID getter
    public String getStaffID() {
        return staffID;
    }

    // title getter
    public String getTitle() {
        return title;
    }

    // phone getter
    public String getPhone() {
        return phone;
    }

    // email getter
    public String getEmail() {
        return email;
    }

    // location getter
    public String getLocation() {
        return location;
    }    
}

