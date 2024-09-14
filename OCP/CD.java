package OCP;

public class CD extends LibraryItem{
    private String artist;


    public CD(String title, String artist) {
        super(title);   // 부모 생성자 호출
        this.artist = artist;
        //TODO Auto-generated constructor stub
    }

    
    public void generateReport(){
        System.out.println("Title: " + super.title + ", artist: " + this.artist);
    }
}
