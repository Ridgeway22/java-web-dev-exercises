package Technology;

public class Program {
    public static void main(String[] args){
    Computer computer1 = new Computer(8, 200, "card1",true);
        System.out.println(computer1.getRam());
    computer1.increaseRam(200);
        System.out.println(computer1.getRam());
    }
}
