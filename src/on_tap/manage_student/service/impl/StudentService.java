package on_tap.manage_student.service.impl;


import on_tap.manage_student.exception.StudentNotFoundException;
import on_tap.manage_student.model.Student;
import on_tap.manage_student.service.IStudentService;
import on_tap.manage_student.service.InputNumber;
import on_tap.manage_student.service.WriteReadFile;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentService implements IStudentService {

    List<Student> students ;

    {
        students = WriteReadFile.readFile();
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        //validate
        //cach 1
        Pattern pattern = Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z][a-z]*)){1,5}$");
        Matcher m = pattern.matcher(name);
        System.out.println(m.matches());

        // cach 2
        while (!Pattern.matches("^([A-Z][a-z]*)(\\s([A-Z][a-z]*)){1,5}$", name)){
            System.out.println("Incorrect name format");
            name = scanner.nextLine();
        }

        // cach 3
        Pattern.compile("^([A-Z][a-z]*)(\\s([A-Z][a-z]*)){1,5}$").matcher(name).matches();

        System.out.println("Please enter gender");
        String gender = scanner.nextLine();
        System.out.println("Please enter age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter point");
        double point = InputNumber.inputDouble();
        while (point<0 || point>10){
            System.out.println("Point > 0 and <= 10");
            point = InputNumber.inputDouble();
        }
        students.add(new Student(name, age, gender, point));
        WriteReadFile.writeFile(students);
    }

    @Override
    public void displayStudent() {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    @Override
    public void deleteStudent() {

    }
    public void findStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        try {
            System.out.println(findByName(name));
        } catch (StudentNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Student findByName(String name) throws StudentNotFoundException {
        Student studentResult = null;
        for (Student student: students) {
            if (name.equals(student.getName())){
                studentResult = student;
                break;
            }
        }
        if (studentResult == null){
            throw new StudentNotFoundException();
        }
        return studentResult;
    }
}
