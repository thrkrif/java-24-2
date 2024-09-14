package OCP;

public class DVD extends LibraryItem{
    private String director;
    private int duration;


    public DVD(String title, String director, int duration) {
        super(title);   // 부모 생성자 호출
        this.director = director;
        this.duration = duration;
        //TODO Auto-generated constructor stub
    }

    // 메서드 오버라이딩
    @Override
    public void generateReport(){
        super.generateReport(); // 부모 메서드 호출
        System.out.print(", director: " + this.director + ", duration: " + this.duration);
    }
    
    public void stream(){
        System.out.println(", stream: True");
    }
}
