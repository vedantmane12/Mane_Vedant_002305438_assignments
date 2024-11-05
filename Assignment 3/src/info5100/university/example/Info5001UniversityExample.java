/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;


/**
 *
 * @author kal bugrara
 */

public class Info5001UniversityExample {
        

    /**
     * @param args the command line arguments
     */
    
    /* 1) Create Department make sure to pass the name of the department
       2) Use the person directory to create persons some will play students role, some will play faculty role, etc
       3) Use the Course Catalog to creat some courses
       4) Create a course schedule for a semester (ex: spring 2025
       5) Use the course schedule to create some classes (course offer)
       6) Search for a person by ssn and assign as faculty (faculty profile)
       7) Search for person and assign as student (student profile)
       8) Register student for scheduled classes
    
    
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Department department = new Department("Data Science");
        // we need the persondirectory to create persons for the different roles
        
        PersonDirectory persondirectory = department.getPersonDirectory();
        
//      Create course and keep it in the course catalog
        
        CourseCatalog coursecatalog = department.getCourseCatalog();        
        
        Course[] predefinedCourses = {
            new Course("App Engg & Dev", "INFO 5100", 4),
            new Course("DSEM", "INFO 6105", 4),
            new Course("DMDD", "DAMG 6205", 4),
            new Course("Machine Learning", "CSYE 6400", 4),
            new Course("Artificial Intelligence", "CSYE 6450", 4),
            new Course("Neural Networks", "INFO 7210", 4),
            new Course("NLP", "DAMG 6350", 4),
            new Course("Deep Learning", "INFO 6320", 4),
            new Course("Data Analytics", "DAMG 5100", 4),
            new Course("Data Engineering", "CSYE 4530", 4),
            new Course("Business Intelligence", "INFO 7560", 4)
        };
        
        for (Course course : predefinedCourses) {
            coursecatalog.newCourse(course.getName(), course.getCOurseNumber(), course.getCredits());
        }
        
        department.addCoreCourse(predefinedCourses[0]);
        
        department.addElectiveCourse(predefinedCourses[1]);
        department.addElectiveCourse(predefinedCourses[2]);
        department.addElectiveCourse(predefinedCourses[3]);
        department.addElectiveCourse(predefinedCourses[4]);
        department.addElectiveCourse(predefinedCourses[5]);
        department.addElectiveCourse(predefinedCourses[6]);
        department.addElectiveCourse(predefinedCourses[7]);
        department.addElectiveCourse(predefinedCourses[8]);
        department.addElectiveCourse(predefinedCourses[9]);
        department.addElectiveCourse(predefinedCourses[10]);
        
//      now lets schedule class to run for spring 2024        
        CourseSchedule courseschedule = department.newCourseSchedule("Spring 2025");
        
        CourseOffer courseoffer1 = courseschedule.newCourseOffer("INFO 5100");
        CourseOffer courseoffer2 = courseschedule.newCourseOffer("INFO 6105");
        CourseOffer courseoffer3 = courseschedule.newCourseOffer("DAMG 6205");
        CourseOffer courseoffer4 = courseschedule.newCourseOffer("CSYE 6400");
        CourseOffer courseoffer5 = courseschedule.newCourseOffer("CSYE 6450");
        CourseOffer courseoffer6 = courseschedule.newCourseOffer("INFO 7210");
        CourseOffer courseoffer7 = courseschedule.newCourseOffer("DAMG 6350");
        CourseOffer courseoffer8 = courseschedule.newCourseOffer("INFO 6320");
        CourseOffer courseoffer9 = courseschedule.newCourseOffer("DAMG 5100");
        CourseOffer courseoffer10 = courseschedule.newCourseOffer("CSYE 4530");
        CourseOffer courseoffer11 = courseschedule.newCourseOffer("INFO 7560");
        
        
        CourseOffer[] offers = {
            courseoffer1, courseoffer2, courseoffer3, courseoffer4, 
            courseoffer5, courseoffer6, courseoffer7, courseoffer8, 
            courseoffer9, courseoffer10, courseoffer11
        };
        
        for (CourseOffer co : offers) {
            if (co == null) return;
        }

        courseoffer1.generatSeats(10); 
        courseoffer2.generatSeats(10); 
        courseoffer3.generatSeats(10); 
        courseoffer4.generatSeats(10); 
        courseoffer5.generatSeats(10); 
        courseoffer6.generatSeats(10); 
        courseoffer7.generatSeats(10); 
        courseoffer8.generatSeats(10); 
        courseoffer9.generatSeats(10); 
        courseoffer10.generatSeats(10); 
        courseoffer11.generatSeats(10); 

//      Create teacher for class

        Person person1 = persondirectory.newPerson("001123978"); 
        Person person2 = persondirectory.newPerson("001123237"); 
        Person person3 = persondirectory.newPerson("001128794"); 
        Person person4 = persondirectory.newPerson("001127385"); 
        Person person5 = persondirectory.newPerson("001124642"); 
        Person person6 = persondirectory.newPerson("001127483"); 
        Person person7 = persondirectory.newPerson("001128784"); 
        Person person8 = persondirectory.newPerson("001128937");
        
        FacultyDirectory facultydirectory = department.getFacultyDirectory();
        FacultyProfile teacher1 = facultydirectory.newFacultyProfile(person1);
        FacultyProfile teacher2 = facultydirectory.newFacultyProfile(person2);       
        FacultyProfile teacher3 = facultydirectory.newFacultyProfile(person3);
        FacultyProfile teacher4 = facultydirectory.newFacultyProfile(person4);       
        FacultyProfile teacher5 = facultydirectory.newFacultyProfile(person5);
        FacultyProfile teacher6 = facultydirectory.newFacultyProfile(person6);       
        FacultyProfile teacher7 = facultydirectory.newFacultyProfile(person7);
        FacultyProfile teacher8 = facultydirectory.newFacultyProfile(person8);       


        courseoffer1.AssignAsTeacher(teacher1);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer1.AssignAsTeacher(teacher2);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer2.AssignAsTeacher(teacher3);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer2.AssignAsTeacher(teacher4);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer3.AssignAsTeacher(teacher5);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer3.AssignAsTeacher(teacher6);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer4.AssignAsTeacher(teacher7);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer4.AssignAsTeacher(teacher8);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer5.AssignAsTeacher(teacher1);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer5.AssignAsTeacher(teacher2);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer6.AssignAsTeacher(teacher3);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer6.AssignAsTeacher(teacher4);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer7.AssignAsTeacher(teacher5);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer7.AssignAsTeacher(teacher6);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer8.AssignAsTeacher(teacher7);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer8.AssignAsTeacher(teacher8);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer9.AssignAsTeacher(teacher2);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer9.AssignAsTeacher(teacher4);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer10.AssignAsTeacher(teacher6);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer10.AssignAsTeacher(teacher8);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer11.AssignAsTeacher(teacher3);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer11.AssignAsTeacher(teacher5);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
       
    //  Create student     
 
        Person person11 = persondirectory.newPerson("002305438");  
        Person person12 = persondirectory.newPerson("002322606");   
        Person person13 = persondirectory.newPerson("002394890");  
        Person person14 = persondirectory.newPerson("002238946");   
        Person person15 = persondirectory.newPerson("002375690");  
        Person person16 = persondirectory.newPerson("002894366");   
        Person person17 = persondirectory.newPerson("002239657");  
        Person person18 = persondirectory.newPerson("002267832");   
        Person person19 = persondirectory.newPerson("002738564");  
        Person person20 = persondirectory.newPerson("002468367");   
        Person person21 = persondirectory.newPerson("002478376");  
        Person person22 = persondirectory.newPerson("002358967");   
        Person person23 = persondirectory.newPerson("002835433");  
        Person person24 = persondirectory.newPerson("002483534");   
        Person person25 = persondirectory.newPerson("002748465");  
        Person person26 = persondirectory.newPerson("002478398");   
        Person person27 = persondirectory.newPerson("002467354");  
        Person person28 = persondirectory.newPerson("002486353");   
        Person person29 = persondirectory.newPerson("002297451");  
        Person person30 = persondirectory.newPerson("002438568");   
        
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student1 = sd.newStudentProfile(person11); 
        StudentProfile student2 = sd.newStudentProfile(person12);
        StudentProfile student3 = sd.newStudentProfile(person13); 
        StudentProfile student4 = sd.newStudentProfile(person14);
        StudentProfile student5 = sd.newStudentProfile(person15); 
        StudentProfile student6 = sd.newStudentProfile(person16);
        StudentProfile student7 = sd.newStudentProfile(person17); 
        StudentProfile student8 = sd.newStudentProfile(person18);
        StudentProfile student9 = sd.newStudentProfile(person19); 
        StudentProfile student10 = sd.newStudentProfile(person20);
        StudentProfile student11 = sd.newStudentProfile(person21); 
        StudentProfile student12 = sd.newStudentProfile(person22);
        StudentProfile student13 = sd.newStudentProfile(person23); 
        StudentProfile student14 = sd.newStudentProfile(person24);
        StudentProfile student15 = sd.newStudentProfile(person25); 
        StudentProfile student16 = sd.newStudentProfile(person26);
        StudentProfile student17 = sd.newStudentProfile(person27); 
        StudentProfile student18 = sd.newStudentProfile(person28);
        StudentProfile student19 = sd.newStudentProfile(person29); 
        StudentProfile student20 = sd.newStudentProfile(person30);
        
        //  Register student in class for the load of the spring semester     
        CourseLoad courseload1 = student1.newCourseLoad("Spring 2025"); 
        CourseLoad courseload2 = student2.newCourseLoad("Spring 2025");   
        CourseLoad courseload3 = student3.newCourseLoad("Spring 2025"); 
        CourseLoad courseload4 = student4.newCourseLoad("Spring 2025");   
        CourseLoad courseload5 = student5.newCourseLoad("Spring 2025"); 
        CourseLoad courseload6 = student6.newCourseLoad("Spring 2025");   
        CourseLoad courseload7 = student7.newCourseLoad("Spring 2025"); 
        CourseLoad courseload8 = student8.newCourseLoad("Spring 2025");   
        CourseLoad courseload9 = student9.newCourseLoad("Spring 2025"); 
        CourseLoad courseload10 = student10.newCourseLoad("Spring 2025");   
        CourseLoad courseload11 = student11.newCourseLoad("Spring 2025"); 
        CourseLoad courseload12 = student12.newCourseLoad("Spring 2025");   
        CourseLoad courseload13 = student13.newCourseLoad("Spring 2025"); 
        CourseLoad courseload14 = student14.newCourseLoad("Spring 2025");   
        CourseLoad courseload15 = student15.newCourseLoad("Spring 2025"); 
        CourseLoad courseload16 = student16.newCourseLoad("Spring 2025");   
        CourseLoad courseload17 = student17.newCourseLoad("Spring 2025"); 
        CourseLoad courseload18 = student18.newCourseLoad("Spring 2025");   
        CourseLoad courseload19 = student19.newCourseLoad("Spring 2025"); 
        CourseLoad courseload20 = student20.newCourseLoad("Spring 2025");  
        
        courseload1.registerStudentInClass(courseoffer1, "A");
        courseload1.registerStudentInClass(courseoffer2, "B+");
        courseload2.registerStudentInClass(courseoffer3, "A-");
        courseload2.registerStudentInClass(courseoffer4, "B");
        courseload3.registerStudentInClass(courseoffer5, "A");
        courseload3.registerStudentInClass(courseoffer6, "C+");
        courseload4.registerStudentInClass(courseoffer7, "B-");
        courseload4.registerStudentInClass(courseoffer8, "A");
        courseload5.registerStudentInClass(courseoffer9, "B");
        courseload5.registerStudentInClass(courseoffer10, "A-");
        courseload6.registerStudentInClass(courseoffer11, "C");
        courseload6.registerStudentInClass(courseoffer7, "B+");
        courseload7.registerStudentInClass(courseoffer3, "A");
        courseload7.registerStudentInClass(courseoffer8, "B-");
        courseload8.registerStudentInClass(courseoffer9, "A-");
        courseload8.registerStudentInClass(courseoffer2, "C+");
        courseload9.registerStudentInClass(courseoffer6, "B");
        courseload9.registerStudentInClass(courseoffer4, "A");
        courseload10.registerStudentInClass(courseoffer7, "C-");
        courseload10.registerStudentInClass(courseoffer2, "B+");
        courseload11.registerStudentInClass(courseoffer7, "A");
        courseload11.registerStudentInClass(courseoffer8, "C+");
        courseload12.registerStudentInClass(courseoffer3, "A-");
        courseload12.registerStudentInClass(courseoffer6, "B+");
        courseload13.registerStudentInClass(courseoffer1, "C");
        courseload13.registerStudentInClass(courseoffer8, "A");
        courseload14.registerStudentInClass(courseoffer4, "B");
        courseload14.registerStudentInClass(courseoffer10, "A-");
        courseload15.registerStudentInClass(courseoffer11, "B+");
        courseload15.registerStudentInClass(courseoffer9, "C-");
        courseload16.registerStudentInClass(courseoffer3, "A");
        courseload16.registerStudentInClass(courseoffer4, "B+");
        courseload17.registerStudentInClass(courseoffer6, "A-");
        courseload17.registerStudentInClass(courseoffer5, "B");
        courseload18.registerStudentInClass(courseoffer1, "C+");
        courseload18.registerStudentInClass(courseoffer7, "A");
        courseload19.registerStudentInClass(courseoffer8, "A-");
        courseload19.registerStudentInClass(courseoffer5, "B+");
        courseload20.registerStudentInClass(courseoffer6, "C");
        courseload20.registerStudentInClass(courseoffer8, "A");
        
        
        for (StudentProfile sp : department.getStudentDirectory().getAllStudents()) {
            ArrayList<SeatAssignment> seatAssignments = sp.getCurrentCourseLoad().getSeatAssignments();

            System.out.println("=============================================");
            System.out.println("Student ID   : " + sp.getID());
            System.out.println("Semester     : " + sp.getCurrentCourseLoad().getSemester());  
            System.out.println("---------------------------------------------");
            System.out.println("Courses Enrolled:");
            System.out.println("---------------------------------------------");
            
            int count = 0;
            float gpa = 0;

            for (SeatAssignment sa : seatAssignments) {
                System.out.println("Course       : " + sa.getAssociatedCourse().getName());
                System.out.println("Teacher      : " + sa.getCourseOffer().getFacultyProfile().getID());
                System.out.println("Grade        : " + sa.getG());  
                System.out.printf("GPA          : %.2f\n", sa.GetCourseStudentScore() / sa.getCreditHours());
                System.out.printf("Tuition Fee  : $%.2f\n", Float.valueOf(sa.getAssociatedCourse().getCoursePrice()));
                System.out.println("---------------------------------------------");
                gpa = gpa + sa.GetCourseStudentScore() / sa.getCreditHours();
                count = count + 1;
            }

            System.out.printf("Total Semester GPA : %.2f\n", gpa / count);
            System.out.println("=============================================\n");

        }
        
    }

}
