package OCP;

public class Book extends LibraryItem{
    private String author;


    public Book(String title, String author) {
        super(title);   // 부모 생성자 호출
        this.author = author;
        //TODO Auto-generated constructor stub
    }

    public void generateReport(){
        System.out.println("Title: " + super.title + ", author: " + this.author);
    }
}
