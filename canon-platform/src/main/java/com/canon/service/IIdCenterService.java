package com.canon.service;

import com.canon.platform.model.IdCenter;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/9 11:06
 * @Description:
 */
public interface IIdCenterService {
    IdCenter findById(Long id);
}
