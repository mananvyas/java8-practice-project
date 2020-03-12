package BuilderPattern;

/*
* I know following code needs improvement, but for the time-being submitting code for reference purpose.
* I will improve it when I get back.
* */
public class Director {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Company companyCe = builder.buildContractEmployee("Sri", 60, 300.00, 6).build();
        Company companyPe= builder.buildPermanentEmployee("Raj", 70, 300.0).build();
        Company fullCompany = builder
                .buildContractEmployee("rak", 55,400.00, 4)
                .buildPermanentEmployee("kumar",31, 6600.00).build();

        System.out.println(companyCe.toString());

        System.out.println(companyPe.toString());

        System.out.println(fullCompany.toString());

    }

}
