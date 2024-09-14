package ISP;
public class LibraryItem implements ReportGenerator{
    private String title;
    

    public LibraryItem(String title) {
        this.title = title;
    }

    public void generateReport() {
        System.out.print("Title: " + title);
    }
}
