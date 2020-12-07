package cn.edu.neu.controller;

import cn.edu.neu.mapper.StatusMapper;
import cn.edu.neu.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyu
 */
@RestController
@RequestMapping("/status")
public class StatusCotroller {
    @Autowired
    private StatusMapper mapper;
    @RequestMapping("/count")
    private Vo[] getStatusCount(){
        return mapper.getStatusCount().stream().map(c->new Vo(""+c.getStatus(),c.getCount())).toArray(Vo[]::new);
    }
}
