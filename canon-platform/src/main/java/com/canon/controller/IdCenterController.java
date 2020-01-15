package com.canon.controller;

import com.canon.platform.model.IdCenter;
import com.canon.service.IIdCenterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ProjectName: canon-dependencies
 * @Package: com.canon.controller
 * @ClassName: IdCenterController
 * @Author: 0227544
 * @Description:
 * @Date: 2020/1/15 17:06
 * @Version: 1.0
 */
@Controller
@RequestMapping("/platform")
public class IdCenterController {

    @Resource
    private IIdCenterService idCenterService;

    @RequestMapping("/get")
    @ResponseBody
    public IdCenter get(@RequestParam(name = "id") Long id) {
        return idCenterService.findById(id);
    }
}
