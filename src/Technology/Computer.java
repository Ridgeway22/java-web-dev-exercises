package Technology;


public class Computer {
 private int ram ;
 private int storage;
 private String graphicsCard;
 private boolean rgb;

    public Computer(int ram, int storage, String graphicsCard, boolean rgb) {
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.rgb = rgb;
    }
    public void increaseStorage(int numStorage) {
        this.storage = this.storage + numStorage;
    }

    public void increaseRam(int numRam) {
        this.ram = this.ram + numRam;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public boolean isRgb() {
        return rgb;
    }
}
