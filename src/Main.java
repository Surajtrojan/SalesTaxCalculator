
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Tax Calculator!");


        Item importedPerfume = new Item("imported bottle of perfume", Category.OTHER, true, 27.99f);
        Item perfume  = new Item("bottle of perfume", Category.OTHER, false, 18.99f);
        Item headachePills = new Item("packet of headache pills", Category.MEDICAL, false, 9.75f);
        Item importedChocolates = new Item("imported box of chocolates", Category.FOOD, true, 11.25f);


    /*
      ------------ test case/input -: 1 -----------------------------------
        Item book = new Item("book", Category.BOOK, false, 12.49f);
        Item cd = new Item("Music CD", Category.OTHER, false, 14.99f);
        Item bar = new Item("Chocolate Bar", Category.FOOD, false, 0.85f);
        receipt.addItem(book);
        receipt.addItem(cd);
        receipt.addItem(bar);

      ------------ rest case/input -: 2 ---------------------------------------
        Item importedChocolates = new Item("imported box of chocolates", Category.FOOD, true, 10.00f);
        Item importedPerfume = new Item("imported bottle of perfume", Category.OTHER, true, 47.50f);
        receipt.addItem(importedChocolates);
        receipt.addItem(importedPerfume);

    */

       // Adding the items
        Receipt receipt = new Receipt();
        receipt.addItem(importedPerfume);
        receipt.addItem(perfume);
        receipt.addItem(headachePills);
        receipt.addItem(importedChocolates);

       // printing item output i.e. price(base+salesTax)
        receipt.print();

        // Total Sales tax
        System.out.println("Sales Taxes: " + receipt.getTotalSalesTax());

        // Total amount
        System.out.println("Total: " + receipt.getTotalAMount());


    }
}