package cn.edu.neu.vo;

/**
 * @author liyu
 */
public class Vo {
    private String name;
    private int value;

    public Vo(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "AgentCountPie{" +
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
