package cn.edu.neu.controller;

import cn.edu.neu.domain.CityFlow;
import cn.edu.neu.mapper.FlowMapper;
import cn.edu.neu.vo.FlowCountVar;
import cn.edu.neu.vo.Vo;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liyu
 */
@RestController
@RequestMapping("/flow")
public class FlowController {
    @Autowired
    private FlowMapper mapper;

    @RequestMapping("/cityCount")
    public Vo[] getCityMapper() {
        List<CityFlow> cityFlow = mapper.getCityFlow();
        return cityFlow.stream().map(c -> new Vo(c.getCity(), c.getSumFlow() * 1024)).toArray(Vo[]::new);
    }

    @RequestMapping("/countVar")
    public List<FlowCountVar> getFlowCountVar() {
        List<FlowCountVar> flowCountVar = mapper.getFlowCountVar();
        return flowCountVar;
    }
}
