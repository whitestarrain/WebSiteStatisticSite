package cn.edu.neu.domain;

/**
 * @author liyu
 */
public class CityFlow {
    private int id;
    private int num;
    private String city;
    private double sumFlow;

    @Override
    public String toString() {
        return "CityFlow{" +
                "id=" + id +
                ", num=" + num +
                ", city='" + city + '\'' +
                ", sum_flow=" + sumFlow +
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSumFlow() {
        return sumFlow;
    }

    public void setSumFlow(double sumFlow) {
        this.sumFlow = sumFlow;
    }
}
