package cn.edu.neu.controller;

import cn.edu.neu.domain.UserVisitorVisitCount;
import cn.edu.neu.mapper.UserMapper;
import cn.edu.neu.vo.Vo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liyu
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper mapper;

    @RequestMapping("/type")
    public Vo[] getUserTypeCount() {
        return mapper.getUserTypeCount().stream().map(c -> new Vo(c.getUserType() == 0 ? "老用户" : "新用户",
                c.getCount())).toArray(Vo[]::new);

    }

    @RequestMapping("/UVCount")
    public Vo[] getUVCount() {
        UserVisitorVisitCount uv = mapper.getUserVisitorsVisitCount();

        return new Vo[]{new Vo("用户", uv.getUserCount()), new Vo("游客", uv.getVisitorCount())};
    }

}
