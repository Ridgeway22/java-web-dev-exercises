package School;
import java.util.ArrayList;
import java.util.HashMap;

public class Course<dueDate> {
    private ArrayList<String> book = new ArrayList<>();
    private HashMap<String, Integer> chapter = new HashMap<>();
    private String dueDate;



    public Course(String book, String chapter, String dueDate) {
        book = book;
        chapter = chapter;

        dueDate = dueDate;

    }

    public ArrayList<String> getBook() {
        return book;
    }

    public HashMap<String, Integer> getChapter() {
        return chapter;
    }
    public String getDueDate() {
        return dueDate;
    }

    public void setBook(ArrayList<String> book) {
        this.book = book;
    }

    public void setChapter(HashMap<String, Integer> chapter) {
        this.chapter = chapter;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
        public void main(String[] args) {

        book.add("Health");
        this.chapter.put("Bones", 1);
        this.dueDate = ("friday");
        this.book.add("Science");
        this.chapter.put("Rocks", 2);
        this.dueDate = ("Monday");
        this.book.add("Social Science");
        this.chapter.put("1920", 3);
        this.dueDate = ("Tuesday");

      System.out.println(book);


    }


    }

