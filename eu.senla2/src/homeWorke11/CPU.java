package homeWorke11;

public class CPU {

    String name;
    Integer frequency;

    public CPU(String name, Integer frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
