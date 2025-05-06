class Student {
    int roll_no;

    Student(int roll_no) {
        this.roll_no = roll_no;
    }

    void displayRollNo() {
        System.out.println("Roll No: " + roll_no);
    }
}

class Test extends Student {
    int sub1, sub2;

    Test(int roll_no, int sub1, int sub2) {
        super(roll_no);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void displayMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

class Result extends Test {

    Result(int roll_no, int sub1, int sub2) {
        super(roll_no, sub1, sub2);
    }

    void displayResult() {
        displayRollNo();
        displayMarks();
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Result student = new Result(101, 85, 90);
        student.displayResult();
    }
}
