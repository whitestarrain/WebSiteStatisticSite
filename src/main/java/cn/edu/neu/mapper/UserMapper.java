package cn.edu.neu.mapper;

import cn.edu.neu.domain.UserCount;
import cn.edu.neu.domain.UserVisitorVisitCount;
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
}
