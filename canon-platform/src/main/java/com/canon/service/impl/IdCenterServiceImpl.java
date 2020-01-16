package com.canon.service.impl;

import com.canon.dao.IdCenterMapper;
import com.canon.platform.model.IdCenter;
import com.canon.service.IIdCenterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/9 11:12
 * @Description:
 */
@Service
public class IdCenterServiceImpl implements IIdCenterService {

    @Resource
    private IdCenterMapper idCenterMapper;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public IdCenter findById(Long id) {
//        int i = 1/0;
        return idCenterMapper.findById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void add(IdCenter idCenter) {
        String sql = "INSERT INTO aptbu.t_idcenter (id, app, tableName, cindex, createtime, updatetime, keypre, fstep, dbid) value (?,?,?,?,?,?,?,?,?)";
        LocalDateTime now = LocalDateTime.now();
        Object[] params = new Object[] {10000,"test-app","test-table",100,now, System.currentTimeMillis(),null,50,10000L};
        jdbcTemplate.update(sql, params);
        // int count = 1/0;
    }
}
