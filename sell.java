//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
///**
// * Created by students on 24/09/22.
// */
//public class Control {
//    private Student[]allStudents;
//    private int numOfStudents;
//
//    public Control() throws FileNotFoundException {
//
//        allStudents=new Student[10];
//        numOfStudents=0;
//        readSudent();
//    }
//    public boolean addNewStudent(int id, String fName, String lName, int registrationYear)
//    {
//        if (numOfStudents<allStudents.length) {
//            Student s = new Student(id, fName, lName, registrationYear);
//            allStudents[numOfStudents] = s;
//            numOfStudents++;
//            return true;
//        }
//        else
//            return false;
//    }
//
//    public Student[] viewAllStudents()
//    {
//        return allStudents;
//    }
//
//
//
//    public Student searchForStudent(int id)
//    {
//        boolean found=false;
//        int i=0;
//        while(!found&&i<allStudents.length)
//        {
//            if (allStudents[i].getId()==id)
//                found=true;
//            else
//                i++;
//        }
//        if (i<allStudents.length)
//            return allStudents[i];
//        else
//            return null;
//    }
//
//    public int searchForStudentIndex(int id)
//    {
//        boolean found=false;
//        int i=0;
//        while(!found&&i<allStudents.length)
//        {
//            if (allStudents[i].getId()==id)
//                found=true;
//            else
//                i++;
//        }
//        if (i<allStudents.length)
//            return i;
//        else
//            return -1;
//    }
//
//    public boolean deleteStudent(int id)
//    {
//        int index=searchForStudentIndex(id);
//        if(index!=-1) {
//            allStudents[index] = null;
//            return true;
//
//        }
//        else
//            return false;
//
//
//    }
//    public  boolean checkForDuplicate(Student s){
//        for (int i=0;i<numOfStudents;i++){
//            if (allStudents[i].equals(s))
//                return  true;
//        }return false;
//    }
//    public void readSudent() throws FileNotFoundException {
//        Scanner in=new Scanner(new File("D:\\student.txt"));
//        while (in.hasNextInt())
//        {
//            int i=in.nextInt();
//            String f=in.next();
//            String l=in.next();
//            int y=in.nextInt();
//            addNewStudent(i,f,l,y);
//
//        }in.close();
//    }
//
//    public void writeStudentFile() throws FileNotFoundException {
//        PrintWriter w=new PrintWriter(new File("D:\\student.txt"));
//        for (int i=0;i<numOfStudents;i++) {
//            w.write(allStudents[i].getId() + " " + allStudents[i].getfName() + " " + allStudents[i].getlName() + " " + allStudents[i].getRegistrationYear() + "\n");
//        }w.close();
//    }
//
//
//
//
//
//
//
//
//
//
//}
