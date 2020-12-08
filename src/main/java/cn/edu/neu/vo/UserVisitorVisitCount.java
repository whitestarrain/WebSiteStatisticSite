package cn.edu.neu.vo;

/**
 * @author liyu
 */
public class UserVisitorVisitCount {
    private Integer id;
    private Integer num;
    private Integer userCount;
    private Integer visitorCount;
    private String date;

    public UserVisitorVisitCount(String date, Integer userCount, Integer visitorCount) {
        this.userCount = userCount;
        this.visitorCount = visitorCount;
        this.date = date;
        this.id = 0;
        this.num = 0;
    }

    public UserVisitorVisitCount(Integer id, Integer num, Integer userCount, Integer visitorCount, String date) {
        this.id = id;
        this.num = num;
        this.userCount = userCount;
        this.visitorCount = visitorCount;
        this.date = date;
    }

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
                ", date='" + date + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
