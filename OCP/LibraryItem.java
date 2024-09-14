package OCP;
public class LibraryItem{
    private String title;
    

    public LibraryItem(String title) {
        this.title = title;
    }

    public void generateReport() {
        System.out.print("Title: " + title);
    }
}
