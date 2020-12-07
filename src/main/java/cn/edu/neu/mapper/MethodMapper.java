package cn.edu.neu.mapper;

import cn.edu.neu.domain.MethodCounts;
import cn.edu.neu.domain.ReferCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liyu
 */
@Mapper
@Repository
public interface MethodMapper {
    @Select("SELECT * FROM request_method WHERE num = (SELECT MAX(id) FROM num_table)")
    public List<MethodCounts> getReferCount();
}
