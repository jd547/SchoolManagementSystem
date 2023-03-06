/*------------------------------------------------------
My name: Jonathan Duong
My student number: 6489126
My course code: CSIT121
My email address: jd547@uowmail.edu.au
Assignment number: 1
-------------------------------------------------------*/
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolManagementSystem {
    public static void main(String[] args) {

        // 1) 
        // create ArrayList<Subject> subjectList 
        ArrayList<Subject> subjectList = new ArrayList<Subject>(0);

        // create ArrayList<HDDRStudent> studentList
        ArrayList<HDRStudent> studentList = new ArrayList<HDRStudent>(0);

        // create ArrayList<Staff> staffList
        ArrayList<Staff> staffList = new ArrayList<Staff>(0);

        // create an AcademicStaff object
        AcademicStaff aStaff = new AcademicStaff("100001", "David Hintz", "Professor", "4221-1111", "david@university.edu.au", "3.001", subjectList, studentList);
        staffList.add(aStaff);
    
        // create a ProfessionalStaff object
        ProfessionalStaff pStaff = new ProfessionalStaff("100002", "Cindy Ma", "Miss", "4211-1112", "cindy@university.edu.au", "3.002", "Monday~Thursday", "School Manager");
        staffList.add(pStaff);

        // create a School object
        School infoSchool = new School("School of Computer Science", aStaff, pStaff, staffList, subjectList, studentList);
        
        // 2)
        // display aStaff, pStaff and infoSchool object fields
        System.out.println("\nWelcome to the School of Computer Science. Here is the information about the school\n");
        
        // print infoSchool
        System.out.println("School Name: " +infoSchool.getSchoolName());
        System.out.println("Head of School: " +infoSchool.getHead().getTitle()+ " " +infoSchool.getHead().getName());
        System.out.println("School Manager: " +infoSchool.getManager().getTitle()+ " " +infoSchool.getManager().getName());
        System.out.println("Staff List: \n");
 

        // print aStaff
        System.out.println(aStaff.getTitle()+ " " +aStaff.getName());
        System.out.println("Staff ID: " +aStaff.getStaffID());
        System.out.println("Phone: " +aStaff.getPhone());
        System.out.println("Email: " +aStaff.getEmail());
        System.out.println("Office Location: " +aStaff.getLocation());
        System.out.println();

        // print pStaff
        System.out.println(pStaff.getTitle()+ " " +pStaff.getName());
        System.out.println("Staff ID: " +pStaff.getStaffID());
        System.out.println("Phone: " +pStaff.getPhone());
        System.out.println("Email: " +pStaff.getEmail());
        System.out.println("Office Location: " +pStaff.getLocation());
        System.out.println("Working days: " +pStaff.getWorkingDays());
        System.out.println("Position: " +pStaff.getPosition());
        System.out.println();

        Scanner input = new Scanner(System.in);

        //prompt user to select between 6 operations
        System.out.println("Please make a select from the following item\n1: add a professional staff\n2: add an academic staff\n"+
                            "3: add a subject\n4: add an HDR student\n5: display the school information\n6: exit the system");
        int operation = input.nextInt();

        //ProfessionalStaff info = new ProfessionalStaff();

        // new scanner obj
        Scanner user_in = new Scanner(System.in);

        while (operation!=6) {
            if (operation==1) { // add a professional staff
                // 3) 
                // input information about new professional staff
                System.out.println("Please input staff name: ");
                String name = user_in.nextLine();
        
                System.out.println("Please input the staff ID: ");
                String id = user_in.nextLine();
        
                System.out.println("Please input the staff title: ");
                String title = user_in.nextLine();
        
                System.out.println("Please input the staff phone number: ");
                String phone = user_in.nextLine();
        
                System.out.println("Please input the staff email address: ");
                String email = user_in.nextLine();
        
                System.out.println("Please input the staff office location: ");
                String location = user_in.nextLine();
        
                System.out.println("Please input the staff working days: ");
                String days = user_in.nextLine();
        
                System.out.println("Please input the staff position (Manager or Administration): ");
                String position = user_in.nextLine();  
                
                System.out.println();
                
                // create new ProfessionalStaff obj 
                ProfessionalStaff pStaff1 = new ProfessionalStaff(id, name, title, phone, email, location, days, position);
                
                // add obj to school's staffList
                staffList.add(pStaff1);
    
    
            } else if (operation==2) { // add an academic staff
                // prompt academic staff info
                System.out.println("Please input the staff name: ");
                String name = user_in.nextLine();

                System.out.println("Please input the staff ID: ");
                String id = user_in.nextLine();

                System.out.println("Please input the staff title: ");
                String title = user_in.nextLine();

                System.out.println("Please input the staff phone number: ");
                String phone = user_in.nextLine();

                System.out.println("Please input the staff email address: ");
                String email = user_in.nextLine();

                System.out.println("Please input the staff office location: ");
                String location = user_in.nextLine();
                System.out.println();
    
                // create AcademicStaff obj n pass variables to obj
                AcademicStaff aStaff1 = new AcademicStaff(id, name, title, phone, email, location, subjectList, studentList);
                
                // add obj to school's staffList
                staffList.add(aStaff1);
    
            } else if (operation==3) { // add a subject
                // prompt user input
                System.out.println("Please input the subject code: ");
                String code = user_in.nextLine();

                System.out.println("Please input the subject name: ");
                String name = user_in.nextLine();

                System.out.println("Please input the subject session and year (such as Autumn 2021): ");
                String session_nYear = user_in.nextLine();
                System.out.println("Please nominate a subject coordinator from the following staff: ");

                // for each Staff obj, print count and staff name
                int count =0;
                for (Staff i: staffList) {
                    System.out.println(count+ ": " +i.getName());
                    count++;
                }

                System.out.println("Please input the index for the subject coordinator: ");
                int index = user_in.nextInt();
                user_in.nextLine(); // consume next line
                System.out.println();

                // get staff index 
                Staff subCoord = staffList.get(index);

                // create new instance of subject obj
                Subject subj = new Subject(name, code, session_nYear, subCoord);

                // add obj to subjectList
                subjectList.add(subj);
    
            } else if (operation==4) { // add a HDR student
                // prompt student info
                System.out.println("Please input the student name: ");
                String stuName = user_in.nextLine();

                System.out.println("Please input the student ID: ");
                String stuID = user_in.nextLine();

                System.out.println("Please input the HDR course (Master or PhD): ");
                String course = user_in.nextLine();

                System.out.println("Please nominate a supervisor from the following staff: ");

                // for each Staff obj, print count and staff name
                int count =0;
                for (Staff i: staffList) {
                    System.out.println(count+ ": " +i.getName());
                    count++;
                }

                System.out.println("Please input the index for the supervisor: ");
                int index = user_in.nextInt();
                user_in.nextLine(); // consume next line
                System.out.println();

                // get staff index
                Staff supervisor = staffList.get(index);

                // create new instance of student obj
                HDRStudent stu = new HDRStudent(stuName, stuID, course, supervisor);

                // add obj to studentList
                studentList.add(stu);
                
            } else if (operation==5) {  // display school info
                // school info
                System.out.println("School Name: " +infoSchool.getSchoolName());
                System.out.println("Head of School: " +infoSchool.getHead().getTitle()+ " " +infoSchool.getHead().getName());
                System.out.println("School Manager: " +infoSchool.getManager().getTitle()+ " " +infoSchool.getManager().getName());
    
                // for each Staff obj, print toString()
                System.out.println("Staff List: \n");
                for (Staff i: staffList) {
                    System.out.println(i);
                }
    
                // for each Subject obj, print toString()
                System.out.println("Subject List: \n");
                for (Subject i: subjectList) {
                    System.out.println(i);
                }

                System.out.println();

                // for each HDRStudent obj, print toString()
                System.out.println("HDR Student List: \n");
                for (HDRStudent i: studentList) {
                    System.out.println(i);
                }

                System.out.println();
                
            } else if (operation==6){  // exit system
                System.out.println("Thanks for using the SMS, see you next time.");
                break;
            } else { 
                System.out.println("Please make a select from the following item\n1: add a professional staff\n2: add an academic staff\n"+
                            "3: add a subject\n4: add an HDR student\n5: display the school information\n6: exit the system");
                
                operation = input.nextInt();
            }

            System.out.println("Please make a select from the following item\n1: add a professional staff\n2: add an academic staff\n"+
                            "3: add a subject\n4: add an HDR student\n5: display the school information\n6: exit the system");
                
                operation = input.nextInt();
        }

        System.out.println("Thanks for using the SMS, see you next time.");
        

        
    }
}
