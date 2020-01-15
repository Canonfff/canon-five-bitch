package com.canon.controller;

import com.canon.platform.model.IdCenter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/8 14:01
 * @Description:
 */
@Controller
@RequestMapping("/hello")
public class HelloWordController {

    @Resource
    public RestTemplate restTemplate;

    @RequestMapping("/get")
    @ResponseBody
    public IdCenter get(@RequestParam(name = "id") Long id) {
//        ResponseEntity<IdCenter> post = restTemplate.postForEntity("http:localhost:8081/platform/get", id, IdCenter.class);
        // return restTemplate.getForObject("http://localhost:8081/platform/get?id=1", String.class);
        return restTemplate.getForObject("http://localhost:8081/platform/get?id=1", IdCenter.class);
//        return post.getBody();
    }

}
