// a. Student class
class Student {
    protected int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

// b. Test class inheriting Student
class Test extends Student {
    protected int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public int getSub1() {
        return sub1;
    }

    public int getSub2() {
        return sub2;
    }
}

// c. Sports interface
interface Sports {
    int sMarks = 20; // constant by default in interface
    void set(); // abstract method
}

// d. Result class inheriting Test and implementing Sports
class Result extends Test implements Sports {
    private int sportsMarks;

    @Override
    public void set() {
        sportsMarks = sMarks; // setting the sports marks
    }

    public void displayResult() {
        int total = sub1 + sub2 + sportsMarks;
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Subject 1 Marks: " + getSub1());
        System.out.println("Subject 2 Marks: " + getSub2());
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + total);
    }
}

// e. Main test class
public class Student_Exam {
    public static void main(String[] args) {
        Result student1 = new Result();
        student1.setRollNo(101);
        student1.setMarks(75, 80);
        student1.set(); // set sports marks from interface
        student1.displayResult();
    }
}
