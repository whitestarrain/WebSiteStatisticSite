package cn.edu.neu.controller;

import cn.edu.neu.mapper.ReferMapper;
import cn.edu.neu.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyu
 */
@RestController
@RequestMapping("/refer")
public class ReferController {
    @Autowired
    private ReferMapper mapper;

    @RequestMapping("/count")
    public Vo[] getReferCount() {
        return mapper.getReferCount().stream().map(c -> new Vo(c.getRefer(), c.getCount())).toArray(Vo[]::new);
    }
}
