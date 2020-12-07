package cn.edu.neu.domain;

/**
 * @author liyu
 */
public class AgentCount {

    private int id;
    private int num;
    private String agent;
    private int count;

    @Override
    public String toString() {
        return "AgentCount{" +
                "id=" + id +
                ", sum=" + num +
                ", agent='" + agent + '\'' +
                ", count=" + count +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }
}
