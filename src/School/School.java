package School;

public class School {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student("Amber", 1,4.0);
        System.out.println(me.getName() + me.getNumberOfCredits());
        Course group1 = new Course("Health", "Bones, 1", "Friday");
        Course group2 = new Course("Science", "Rocks, 2", "Tuesday");


    }
}
