public class SalesTaxCalculator implements TaxCalculator{
    private TaxCalculator calculator;

    public SalesTaxCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Item getItem() {
        return calculator.getItem();
    }

    @Override
    public float calc() {
       // System.out.println(calculator.calc() + getItem().basePrice * 0.1f);
        return calculator.calc() + getItem().basePrice * 0.1f;
    }
}
