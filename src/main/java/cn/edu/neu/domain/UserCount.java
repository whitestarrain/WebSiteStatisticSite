package cn.edu.neu.domain;

/**
 * @author liyu
 */
public class UserCount {
    private int userType;
    private long count;

    public UserCount(Integer userType, Long count) {
        this.userType = userType;
        this.count = count;
    }

    @Override
    public String toString() {
        return "UserCount{" +
                "userType=" + userType +
                ", count=" + count +
                '}';
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
