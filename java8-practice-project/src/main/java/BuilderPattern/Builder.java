package BuilderPattern;

public interface Builder {
    Builder buildPermanentEmployee(String name, int age, Double yearlyPerks);
    Builder buildContractEmployee(String name, int age, Double weeklyPay, int contractLength);
    Company build();
}
