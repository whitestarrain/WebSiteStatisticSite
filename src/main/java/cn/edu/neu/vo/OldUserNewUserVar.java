package cn.edu.neu.vo;

/**
 * @author liyu
 */
public class OldUserNewUserVar {
    public String date;
    public Long oldUser;
    public Long newUser;

    public OldUserNewUserVar(String date, Long oldUser, Long newUser) {
        this.date = date;
        this.oldUser = oldUser;
        this.newUser = newUser;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getOldUser() {
        return oldUser;
    }

    public void setOldUser(Long oldUser) {
        this.oldUser = oldUser;
    }

    public Long getNewUser() {
        return newUser;
    }

    public void setNewUser(Long newUser) {
        this.newUser = newUser;
    }

    @Override
    public String toString() {
        return "OldUserNewUserVar{" +
                "date='" + date + '\'' +
                ", oldUser=" + oldUser +
                ", newUser=" + newUser +
                '}';
    }
}

