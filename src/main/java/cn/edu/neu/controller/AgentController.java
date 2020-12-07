package cn.edu.neu.controller;

import cn.edu.neu.mapper.AgentMapper;
import cn.edu.neu.domain.AgentCount;
import cn.edu.neu.vo.AgentCountPie;
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
    public List<AgentCountPie> getCount() {
        List<AgentCount> nowAgentCount = mapper.getNowAgentCount();
        List<AgentCountPie> agentCountPies = new ArrayList<AgentCountPie>();
        for (AgentCount agentCount : nowAgentCount) {
            agentCountPies.add(new AgentCountPie(agentCount.getAgent(), agentCount.getSum()));
        }
        return agentCountPies;
    }
}
