package com.canon.service.impl;

import com.canon.dao.IdCenterMapper;
import com.canon.platform.model.IdCenter;
import com.canon.service.IIdCenterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/9 11:12
 * @Description:
 */
@Service
public class IdCenterServiceImpl implements IIdCenterService {

    @Resource
    IdCenterMapper idCenterMapper;

    @Override
    public IdCenter findById(Long id) {
        return idCenterMapper.findById(id);
    }
}
