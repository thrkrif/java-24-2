package SRP;
import java.util.ArrayList;
import java.util.List;

public class Library implements ReportGenerator{
    private List<LibraryItem> items;
    private CheckoutManager manager;

    public Library() {
        this.items = new ArrayList<>();
        this.manager = new CheckoutManager();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void checkOutItem(LibraryItem item) {
        item.checkOut();
    }

    public void returnItem(LibraryItem item) {
        item.returnItem();
    }

    // Library에서 generateReport 메서드를 구현했다.
    public void generateReport() {
        System.out.println("Library generateReport");
        for (LibraryItem item : items) {
            System.out.println("Title: " + item.getTitle());;
        }
    }
}
