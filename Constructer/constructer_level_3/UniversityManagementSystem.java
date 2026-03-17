class Student {
    // Access Modifiers
    public int rollNumber;       // public
    protected String name;       // protected
    private double CGPA;         // private

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        setCGPA(CGPA);  // use setter for private field
    }

    // Public getter for private CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public setter with validation for private CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
			 } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    public void displayDetails() {
        System.out.println("Roll No : " + rollNumber);
        System.out.println("Name    : " + name);
        System.out.println("CGPA    : " + CGPA);
    }
}

// Subclass demonstrating use of protected members
class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name,
                                double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayDetails() {
        System.out.println("Roll No        : " + rollNumber);    // public
        System.out.println("Name           : " + name);          // protected ✅
        System.out.println("CGPA           : " + getCGPA());     // private via getter
        System.out.println("Research Topic : " + researchTopic);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayDetails();

        System.out.println("\nModifying CGPA...");
        s1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());
 System.out.println("\n--- Postgraduate Student ---");
        PostgraduateStudent pg1 = new PostgraduateStudent(
            201, "Bob", 9.1, "Machine Learning"
        );
        pg1.displayDetails();

        // s1.CGPA = 10; ❌ ERROR: CGPA is private, cannot access directly
    }
}
