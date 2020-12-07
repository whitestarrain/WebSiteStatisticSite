package cn.edu.neu.vo;

/**
 * @author liyu
 */
public class AgentCountPie {
    private String name;
    private int value;

    public AgentCountPie(String name, int value) {
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
