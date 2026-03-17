class Course {
    // Instance Variables
    private String courseName;
    private int duration;   // in hours
    private double fee;

    // Class Variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
	public void displayCourseDetails() {
        System.out.println("Institute  : " + instituteName);
        System.out.println("Course     : " + courseName);
        System.out.println("Duration   : " + duration + " hours");
        System.out.println("Fee        : $" + fee);
        System.out.println("----------------------------");
    }

    // Class Method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 40, 199.99);
        Course c2 = new Course("Data Structures", 30, 149.99);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("CodInClub Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}