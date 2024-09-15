package LSP;

public class DVD extends LibraryItem{
    private String director;
    private int duration;


    public DVD(String title, String director, int duration) {
        super(title);   // 부모 생성자 호출
        this.director = director;
        this.duration = duration;
        //TODO Auto-generated constructor stub
    }

    public void generateReport(){
        System.out.print("Title: " + super.title + ", director: " + this.director + ", duration: " + this.duration);
        stream();
    }
    
    public void stream(){
        System.out.println(", stream: True");
    }
}
