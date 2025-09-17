/*S.vishal
24RA1A05AO
CSE-F*/
public class InharetanceExample {

    public static void main(String[] args) {
        College c1 = new College();
        c1.displayCollegeCode();
        Student s1 = new Student("vishal");
        s1.displayStudentName();
        s1.displayCollegeCode();
    }
}

class College {

    public void displayCollegeCode() {
        System.out.println("College code is 'KPRIT' ");
    }
}

class Student extends College {

    String name;

    public Student(String n) {
        name = n;
    }

    public void displayStudentName() {
        System.out.println("student name is: " + name);
    }
}
