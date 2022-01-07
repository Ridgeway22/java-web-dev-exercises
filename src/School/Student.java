package School;

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //constructor

public Student(String name, int numberOfCredits, double gpa){
    this.name = name;
    this.numberOfCredits = numberOfCredits;
    this.gpa = gpa;
}

    //Getter
    public String getName(){
        return name;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    private double getGpa(){
        return gpa;
    }

    //Setter
    public void setName(String aname){
        this.name = aname;
    }

    public void setStudentId(int astudentId){
        this.studentId = astudentId;
    }
    public void setNumberOfCredits(int anumberOfCredits){
        this.numberOfCredits = anumberOfCredits;
    }
    public void setGpa( double agpa){
        this.gpa = agpa;
    }


}
