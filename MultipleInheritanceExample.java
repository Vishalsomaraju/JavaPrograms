/*S.vishal
24RA1A05AO
CSE-F*/
public class MultipleInheritanceExample {

    public static void main(String[] args) {
        Student student1 = new Student("Vishal", "Rambabu", "KPRIT");
        student1.displayStudentName();
        student1.displayFacultyName();
        student1.displayCollegeName();
    }
}

class College {

    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    void displayCollegeName() {
        System.out.println("College name: " + collegeName);
    }
}

class Faculty extends College {

    String facultyName;

    Faculty(String fN, String cN) {
        super(cN);
        facultyName = fN;
    }

    void displayFacultyName() {
        System.out.println("Faculty name: " + facultyName);
    }
}

class Student extends Faculty {

    String studentName;

    Student(String sN, String fN, String cN) {
        super(fN, cN);
        studentName = sN;
    }

    void displayStudentName() {
        System.out.println("Student name: " + studentName);
    }
}
