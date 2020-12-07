package cn.edu.neu.domain;

/**
 * @author liyu
 */
public class UserVisitorVisitCount {
    private int id;
    private int num;
    private int userCount;
    private int visitorCount;

    public UserVisitorVisitCount(Integer id, Integer num, Integer userCount, Integer visitorCount) {
        this.id = id;
        this.num = num;
        this.userCount = userCount;
        this.visitorCount = visitorCount;
    }

    @Override
    public String toString() {
        return "UserVisitorVisitCount{" +
                "id=" + id +
                ", num=" + num +
                ", userCount=" + userCount +
                ", visitorCount=" + visitorCount +
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

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(int visitorCount) {
        this.visitorCount = visitorCount;
    }
}
