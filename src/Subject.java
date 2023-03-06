public class Subject {
    private String name;
    private String code;
    private String session_nYear;
    private Staff subCoord;

    public Subject(String name, String code, String session_nYear, Staff subCoord) {
        this.name = name;
        this.code = code;
        this.session_nYear= session_nYear;
        this.subCoord = subCoord;
    }

    public String toString() {
        return String.format("Code: %s%nName: %s%nSession and Year: %s%nCoordinator: %s",
                            code, name, session_nYear, subCoord.getName());
    }

    // name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // code getter and setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // session_nYear getter 
    public String getSession_nYear() {
        return session_nYear;
    }

}

