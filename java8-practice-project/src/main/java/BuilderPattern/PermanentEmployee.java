package BuilderPattern;

public class PermanentEmployee extends Employee {
    private Double yearlyPerk;

    public PermanentEmployee(String name, int age, Double yearlyPerk) {
        super(name, age);
        this.yearlyPerk = yearlyPerk;
    }

    public Double getYearlyPerk() {
        return yearlyPerk;
    }

    public void setYearlyPerk(Double yearlyPerk) {
        this.yearlyPerk = yearlyPerk;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                " name=" + this.getName() +
                " age=" + this.getAge() +
                " yearlyPerk=" + yearlyPerk +
                '}';
    }
}
