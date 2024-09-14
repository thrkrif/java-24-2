package OCP;

public class MainTest {
    // OCP - Open Close Principle
	// 확장에는 열려 있고, 변경에는 닫혀 있다.
	// 기존코드를 변경하지 않으면서(closed), 기능을 추가할 수 있도록(open) 설계되어야한다.
    public MainTest() {
        LibraryItem[] items1 = { 
            new Book("The Little Prince", "Antoine Marie Jean-Baptiste Roger de Saint-Exupéry"),
            new CD("We Are the World", "Roger Emerson, Michael Jackson, Lionel Richie"),
            new DVD("Star Wars: A New Hope", "George Lucas", 120),
            new EBook("Onepiece", "EIICHIRO ODA")
            // new LibraryItem("The Little Prince", "Antoine Marie Jean-Baptiste Roger de Saint-Exupéry", "Book"),
            // new LibraryItem("We Are the World", "Roger Emerson, Michael Jackson, Lionel Richie", "CD"),
            // new LibraryItem("Star Wars: A New Hope", "George Lucas", "DVD"),
            // new LibraryItem("Onepiece", "EIICHIRO ODA", "Ebook")
        };

        for (LibraryItem item : items1) {
            item.generateReport();
        }

    }
}
