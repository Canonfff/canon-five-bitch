package com.canon.dao;

import com.canon.platform.model.IdCenter;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/9 11:13
 * @Description:
 */
public interface IdCenterMapper {
    IdCenter findById(Long id);

    IdCenter selectByPrimaryKey(Long id);
}
