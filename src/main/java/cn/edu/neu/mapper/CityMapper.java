package cn.edu.neu.mapper;

import cn.edu.neu.domain.CityCounts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liyu
 */
@Mapper
@Repository
public interface CityMapper {
    @Select("SELECT * FROM city_distribute WHERE num = (SELECT MAX(id) FROM num_table)")
    public List<CityCounts> getCityCounts();
}
