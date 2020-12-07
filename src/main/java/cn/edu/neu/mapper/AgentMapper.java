package cn.edu.neu.mapper;

import cn.edu.neu.domain.AgentCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liyu
 */
@Mapper
@Repository
public interface AgentMapper {
    @Select("select * from agent where num = (select max(id) from num_table)")
    public List<AgentCount> getNowAgentCount();
}
