
public class TelevibsionProgram {

    private String name;
    private int duration;

    public TelevibsionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
