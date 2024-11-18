public class Rounder implements TaxCalculator{
    private TaxCalculator calculator;
    public Rounder(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Item getItem() {
        return calculator.getItem();
    }

    @Override
    public float calc() {
        float res = (float) (Math.ceil(calculator.calc() * 20.0) / 20.0);
      //  System.out.println(res);
        return res;
    }
}
