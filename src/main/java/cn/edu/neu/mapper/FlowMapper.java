package cn.edu.neu.mapper;

import cn.edu.neu.domain.CityFlow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liyu
 */
@Mapper
@Repository
public interface FlowMapper {
    @Select("SELECT * FROM flow_distribution WHERE num = (SELECT MAX(id) FROM num_table)")
    public List<CityFlow> getCityFlow();
}
