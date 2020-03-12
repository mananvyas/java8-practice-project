package BuilderPattern;

public class ContractEmployee extends Employee {
    private Double weeklyPay;
    private int contractLength;

    public ContractEmployee(String name, int age, Double weeklyPay, int contractLength) {
        super(name, age);
        this.weeklyPay = weeklyPay;
        this.contractLength = contractLength;
    }

    public Double getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(Double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                " name=" + this.getName() +
                " age=" + this.getAge() +
                " weeklyPay=" + weeklyPay +
                ", contractLength=" + contractLength +
                '}';
    }
}
