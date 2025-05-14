public class UniversityClient {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Dr. Reyes", "Data Structures", 50000);
        Teacher t2 = new Teacher("Prof. Cruz", "Accounting", 45000);

        Student s1 = new Student("Alice", "S101", 30000);
        Student s2 = new Student("Bob", "S102", 32000);
        Student s3 = new Student("Cathy", "S103", 31000);

        Department csDept = new Department("Computer Science");
        csDept.addUnit(t1);
        csDept.addUnit(s1);
        csDept.addUnit(s2);

        Department acctDept = new Department("Accounting");
        acctDept.addUnit(t2);
        acctDept.addUnit(s3);

        College engCollege = new College("College of Engineering");
        engCollege.addUnit(csDept);

        College busCollege = new College("College of Business");
        busCollege.addUnit(acctDept);

        College university = new College("New Era University");
        university.addUnit(engCollege);
        university.addUnit(busCollege);

        university.getDetails();

        System.out.println("\nTotal Students: " + university.getStudentCount());

        System.out.println("Total Budget: " + university.getBudget());
    }
}
