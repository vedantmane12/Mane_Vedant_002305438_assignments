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
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;


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

        Person person1 = persondirectory.newPerson("Kal"); 
        Person person2 = persondirectory.newPerson("Dino"); 
        Person person3 = persondirectory.newPerson("Pan"); 
        Person person4 = persondirectory.newPerson("Sahil"); 
        Person person5 = persondirectory.newPerson("Tanmay"); 
        Person person6 = persondirectory.newPerson("Max"); 
        Person person7 = persondirectory.newPerson("Mario"); 
        Person person8 = persondirectory.newPerson("Dua");
        
        FacultyDirectory facultydirectory = department.getFacultyDirectory();
        FacultyProfile teacher1 = facultydirectory.newFacultyProfile(person1);
        FacultyProfile teacher2 = facultydirectory.newFacultyProfile(person2);       
        FacultyProfile teacher3 = facultydirectory.newFacultyProfile(person1);
        FacultyProfile teacher4 = facultydirectory.newFacultyProfile(person2);       
        FacultyProfile teacher5 = facultydirectory.newFacultyProfile(person1);
        FacultyProfile teacher6 = facultydirectory.newFacultyProfile(person2);       
        FacultyProfile teacher7 = facultydirectory.newFacultyProfile(person1);
        FacultyProfile teacher8 = facultydirectory.newFacultyProfile(person2);       


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
 
        Person person11 = persondirectory.newPerson("A");  
        Person person12 = persondirectory.newPerson("B");   
        Person person13 = persondirectory.newPerson("C");  
        Person person14 = persondirectory.newPerson("D");   
        Person person15 = persondirectory.newPerson("E");  
        Person person16 = persondirectory.newPerson("F");   
        Person person17 = persondirectory.newPerson("G");  
        Person person18 = persondirectory.newPerson("H");   
        Person person19 = persondirectory.newPerson("I");  
        Person person20 = persondirectory.newPerson("J");   
        Person person21 = persondirectory.newPerson("K");  
        Person person22 = persondirectory.newPerson("L");   
        Person person23 = persondirectory.newPerson("M");  
        Person person24 = persondirectory.newPerson("N");   
        Person person25 = persondirectory.newPerson("O");  
        Person person26 = persondirectory.newPerson("P");   
        Person person27 = persondirectory.newPerson("Q");  
        Person person28 = persondirectory.newPerson("R");   
        Person person29 = persondirectory.newPerson("S");  
        Person person30 = persondirectory.newPerson("T");   
        
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
        
        courseload1.registerStudentInClass(courseoffer1); 
        courseload1.registerStudentInClass(courseoffer2);
        courseload2.registerStudentInClass(courseoffer3);
        courseload2.registerStudentInClass(courseoffer4);
        courseload3.registerStudentInClass(courseoffer5); 
        courseload3.registerStudentInClass(courseoffer6);
        courseload4.registerStudentInClass(courseoffer7);
        courseload4.registerStudentInClass(courseoffer8);
        courseload5.registerStudentInClass(courseoffer9); 
        courseload5.registerStudentInClass(courseoffer10);
        courseload6.registerStudentInClass(courseoffer11);
        courseload6.registerStudentInClass(courseoffer7);
        courseload7.registerStudentInClass(courseoffer3); 
        courseload7.registerStudentInClass(courseoffer8);
        courseload8.registerStudentInClass(courseoffer9);
        courseload8.registerStudentInClass(courseoffer2);
        courseload9.registerStudentInClass(courseoffer6); 
        courseload9.registerStudentInClass(courseoffer4);
        courseload10.registerStudentInClass(courseoffer7);
        courseload10.registerStudentInClass(courseoffer2);
        courseload11.registerStudentInClass(courseoffer7); 
        courseload11.registerStudentInClass(courseoffer8);
        courseload12.registerStudentInClass(courseoffer3);
        courseload12.registerStudentInClass(courseoffer6);
        courseload13.registerStudentInClass(courseoffer1); 
        courseload13.registerStudentInClass(courseoffer8);
        courseload14.registerStudentInClass(courseoffer4);
        courseload14.registerStudentInClass(courseoffer10);
        courseload15.registerStudentInClass(courseoffer11); 
        courseload15.registerStudentInClass(courseoffer9);
        courseload16.registerStudentInClass(courseoffer3);
        courseload16.registerStudentInClass(courseoffer4);
        courseload17.registerStudentInClass(courseoffer6); 
        courseload17.registerStudentInClass(courseoffer5);
        courseload18.registerStudentInClass(courseoffer1);
        courseload18.registerStudentInClass(courseoffer7);
        courseload19.registerStudentInClass(courseoffer8); 
        courseload19.registerStudentInClass(courseoffer5);
        courseload20.registerStudentInClass(courseoffer6);
        courseload20.registerStudentInClass(courseoffer8);
        
        int total = department.calculateRevenuesBySemester("Spring 2025");
        System.out.print("Total:  " + total+"    ");

    }

}
