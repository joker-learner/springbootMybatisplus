package com.lc.myplus.service.impl;

import com.lc.myplus.entity.Employment;
import com.lc.myplus.mapper.EmploymentMapper;
import com.lc.myplus.server.EmploymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author com.lc
 * @since 2020-11-06
 */
@Service
public class EmploymentServiceImpl extends ServiceImpl<EmploymentMapper, Employment> implements EmploymentService {

    @Autowired
    private EmploymentMapper employmentMapper;

}
