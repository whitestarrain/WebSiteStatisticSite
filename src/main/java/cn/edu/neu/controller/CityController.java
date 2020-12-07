package cn.edu.neu.controller;

import cn.edu.neu.domain.CityCounts;
import cn.edu.neu.mapper.CityMapper;
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
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityMapper mapper;

    @RequestMapping("/distribute")
    public List<Vo> getDistributeCount() {
        List<CityCounts> cityCounts = mapper.getCityCounts();
        ArrayList<Vo> vos = new ArrayList<>();
        for (CityCounts cityCount : cityCounts) {
            vos.add(new Vo(cityCount.getCity(), cityCount.getCount()));
        }
        return vos;
    }
}
