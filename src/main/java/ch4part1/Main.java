package ch4part1;

public class Main {
    public static void main(String[] args) {
        Sorter sorterByAddress = new SorterByAddress();
        DeliveryDetailsPrinter detailsPrinter1 = new DeliveryDetailsPrinter(sorterByAddress);
        detailsPrinter1.printDetails();

        Sorter sorterByName = new SorterByName();
        DeliveryDetailsPrinter detailsPrinter2 = new DeliveryDetailsPrinter(sorterByName);
        detailsPrinter2.printDetails();
    }
}
