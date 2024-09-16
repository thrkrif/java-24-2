package ISP;
public class LibraryItem implements IReportGenerator{
    private String title;
    

    public LibraryItem(String title) {
        this.title = title;
    }


    // 인터페이스 구현
    @Override
    public void generateReport() {
        System.out.print("Title: " + title);
    }
}
