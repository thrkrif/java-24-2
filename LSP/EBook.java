package LSP;

public class EBook extends Book{


    public EBook(String title, String author) {
        super(title,author);   // 부모 생성자 호출
        //TODO Auto-generated constructor stub
    }

    public void generateReport(){
        System.out.print("Title: " + super.title + ", author: " + super.author);
        download();
    }
    
    public void download(){
        System.out.println(", download: True");
    }
}
