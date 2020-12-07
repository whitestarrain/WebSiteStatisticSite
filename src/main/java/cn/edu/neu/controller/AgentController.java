package cn.edu.neu.controller;

import cn.edu.neu.mapper.AgentMapper;
import cn.edu.neu.domain.AgentCount;
import cn.edu.neu.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyu
 */
@RestController
@RequestMapping("/agent")
public class AgentController {
    @Autowired
    AgentMapper mapper;

    @RequestMapping("/count")
    public List<Vo> getCount() {
        List<AgentCount> nowAgentCount = mapper.getNowAgentCount();
        List<Vo> voList = new ArrayList<Vo>();
        for (AgentCount agentCount : nowAgentCount) {
            voList.add(new Vo(agentCount.getAgent(), agentCount.getCount()));
        }
        return voList;
    }
}
