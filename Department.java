import java.util.ArrayList;
import java.util.List;

public class Department implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addUnit(EducationalUnit unit) {
        units.add(unit);
    }

    @Override
    public void getDetails() {
        System.out.println("  Department: " + name);
        for (EducationalUnit unit : units) {
            unit.getDetails();
        }
    }

    @Override
    public int getStudentCount() {
        return units.stream().mapToInt(EducationalUnit::getStudentCount).sum();
    }

    @Override
    public double getBudget() {
        return units.stream().mapToDouble(EducationalUnit::getBudget).sum();
    }
}
