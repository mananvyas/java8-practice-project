package BuilderPattern;

public class Company {
    PermanentEmployee permanentEmployee;
    ContractEmployee contractEmployee;

    public Company(PermanentEmployee permanentEmployee, ContractEmployee contractEmployee) {
        this.permanentEmployee = permanentEmployee;
        this.contractEmployee = contractEmployee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "permanentEmployee=" + permanentEmployee +
                ", contractEmployee=" + contractEmployee +
                '}';
    }
}
