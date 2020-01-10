package com.canon;

import com.alibaba.fastjson.JSON;
import com.canon.base.run.Main;
import com.canon.platform.model.IdCenter;
import com.canon.service.IIdCenterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/9 09:46
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class ApplicationTest {



    @Resource
    IIdCenterService iIdCenterService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void findById() {
        IdCenter byId = iIdCenterService.findById(1L);
        System.out.println(JSON.toJSONString(byId));
    }

    @Test
    public void findByJdbcTemplate() {

        List<IdCenter> query = jdbcTemplate.query("select id,app,tableName,cindex,createtime,keypre,fstep from t_idcenter where id ='1'", new BeanPropertyRowMapper<IdCenter>(IdCenter.class));
        System.err.println(JSON.toJSONString(query));
    }

    @Test
    public void add() {
        String str = "{\"app\":\"public\",\"cindex\":21798020,\"createtime\":\"2016-02-14T13:53:35\",\"fstep\":20,\"id\":1,\"keypre\":\"pb_\",\"tableName\":\"common\"}";
        IdCenter idCenter = JSON.parseObject(str, IdCenter.class);
        idCenter.setId(10000L);
        idCenter.setUpdatetime(LocalDateTime.now());
        iIdCenterService.add(idCenter);
    }




}
