package entities;

public class OutsourcedEmployee extends Employee{
    private Double additionalCharge;

    /**
     * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os
     * funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
     */
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
