package ch4part1;

public class DeliveryDetailsPrinter {
    private Sorter sorter;

    public DeliveryDetailsPrinter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void printDetails() {
        sorter.sortDetails();
        System.out.println("Printing Details");
    }
}
