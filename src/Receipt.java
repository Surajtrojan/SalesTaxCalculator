import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Item> items;

    public Receipt() {
        items = new ArrayList<>();
    }


    public void addItem(Item item) {
        items.add(item);
       // return this;
    }

    private float totalSalesTax;
    private float totalAMount;

    public float getTotalSalesTax() {
        return totalSalesTax;
    }

    public float getTotalAMount() {
        return totalAMount;
    }

    public void print() {
        for (Item item: items) {
            TaxCalculator calc = new BaseTaxCalculator(item);
            if (item.cat == Category.OTHER)
                calc = new SalesTaxCalculator(calc);
            if (item.isImported)
                calc = new ImportTaxCalculator(calc);
            calc = new Rounder(calc);
            float salesTax = calc.calc();
            float total = item.basePrice+salesTax;
            totalSalesTax = totalSalesTax+salesTax;
            totalAMount = totalAMount+total;
            System.out.println("1 " + item.name + ": " + total);
        }
    }
}
