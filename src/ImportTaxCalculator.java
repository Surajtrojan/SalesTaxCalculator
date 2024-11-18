public class ImportTaxCalculator implements TaxCalculator{
    private TaxCalculator calculator;

    public ImportTaxCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Item getItem() {
        return calculator.getItem();
    }

    @Override
    public float calc() {
      //  System.out.println(calculator.calc() + getItem().basePrice * 0.05f);
        return calculator.calc() + getItem().basePrice * 0.05f;
    }
}
