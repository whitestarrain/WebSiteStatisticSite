package cn.edu.neu.vo;

/**
 * @author liyu
 */
public class FlowCountVar {
    private String date;
    private Double sumCount;

    public FlowCountVar(String date, Double sumCount) {
        this.date = date;
        this.sumCount = sumCount;
    }

    @Override
    public String toString() {
        return "FlowCountVar{" +
                "date='" + date + '\'' +
                ", sumCount=" + sumCount +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getSumCount() {
        return sumCount;
    }

    public void setSumCount(Double sumCount) {
        this.sumCount = sumCount;
    }
}
