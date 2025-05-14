public class Student implements EducationalUnit {
    private String name;
    private String studentId;
    private double tuition;

    public Student(String name, String studentId, double tuition) {
        this.name = name;
        this.studentId = studentId;
        this.tuition = tuition;
    }

    @Override
    public void getDetails() {
        System.out.println("    Student: " + name + ", ID: " + studentId + ", Tuition: " + tuition);
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuition;
    }
}
