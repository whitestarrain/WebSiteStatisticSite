package cn.edu.neu.domain;

/**
 * @author liyu
 */
public class AgentCount {

    private Integer id;
    private Integer num;
    private String agent;
    private Integer count;

    @Override
    public String toString() {
        return "AgentCount{" +
                "id=" + id +
                ", num=" + num +
                ", agent='" + agent + '\'' +
                ", count=" + count +
                '}';
    }

    public AgentCount(Integer id, Integer num, String agent, Integer count) {
        this.id = id;
        this.num = num;
        this.agent = agent;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
