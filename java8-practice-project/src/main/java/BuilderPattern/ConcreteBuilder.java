package BuilderPattern;

public class ConcreteBuilder implements Builder {
    PermanentEmployee pe;
    ContractEmployee ce;

    @Override
public Builder buildPermanentEmployee(String name, int age, Double yearlyPerks) {
        pe = new PermanentEmployee(name, age, yearlyPerks);
        return this;

    }

    @Override
    public Builder buildContractEmployee(String name, int age, Double weeklyPay, int contractLength) {
        ce =  new ContractEmployee(name, age, weeklyPay, contractLength);
        return this;
    }

    @Override
    public Company build() {
        return new Company(this.pe, this.ce);
    }
}
