package cn.edu.neu.mapper;

import cn.edu.neu.domain.UserCount;
import cn.edu.neu.vo.OldUserNewUserVar;
import cn.edu.neu.vo.UserVisitorVisitCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liyu
 */
@Mapper
@Repository
public interface UserMapper {
    @Select("SELECT isOldUser userType,COUNT(1) COUNT FROM old_user WHERE num = (SELECT MAX(id) FROM num_table)	 " +
            "GROUP" +
            " BY isOldUser ")
    public List<UserCount> getUserTypeCount();


    @Select("SELECT * FROM user_count WHERE num = (SELECT MAX(id) FROM num_table)")
    public UserVisitorVisitCount getUserVisitorsVisitCount();

    @Select(" SELECT DATE_FORMAT(createtime,'%Y-%m-%d') DATE, userCount, visitorCount FROM user_count JOIN num_table " +
            "ON user_count.num = num_table.id")
    public List<UserVisitorVisitCount> getUserVisitorsVisitCountVar();

    public List<OldUserNewUserVar> getOldUserNewUserVar();
}
