package cn.edu.neu.domain;

/**
 * @author liyu
 */
public class ReferCount {
    private int id;
    private int num;
    private String refer;
    private int count;

    @Override
    public String toString() {
        return "ReferCount{" +
                "id=" + id +
                ", num=" + num +
                ", refer='" + refer + '\'' +
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

    public String getRefer() {
        return refer;
    }

    public void setRefer(String refer) {
        this.refer = refer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
