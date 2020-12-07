package cn.edu.neu.controller;

import cn.edu.neu.mapper.MethodMapper;
import cn.edu.neu.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyu
 */
@RestController
@RequestMapping("/method")
public class MethodController {
    @Autowired
    private MethodMapper mapper;
    @RequestMapping("/count")
    public Vo[] getMethodCount(){
        return mapper.getReferCount().stream().map(c->new Vo(c.getMethod(),c.getCount())).toArray(Vo[]::new);
    }
}
