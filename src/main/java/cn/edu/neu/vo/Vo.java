package cn.edu.neu.vo;

/**
 * @author liyu
 */
public class Vo {
    private String name;
    private double value;

    public Vo(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vo{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

