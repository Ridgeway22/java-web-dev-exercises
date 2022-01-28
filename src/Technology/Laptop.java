package Technology;

public class Laptop extends Computer{
    private Double weight;

    public Laptop(int ram, int storage, String graphicsCard, boolean rgb, Double weight) {
        super(ram, storage, graphicsCard, rgb);
        this.weight = weight;
    }
}
