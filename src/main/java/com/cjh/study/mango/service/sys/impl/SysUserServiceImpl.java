package com.cjh.study.mango.service.sys.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjh.study.mango.aop.TestAction;
import com.cjh.study.mango.bean.sys.SysUser;
import com.cjh.study.mango.dao.sys.SysUserMapper;
import com.cjh.study.mango.service.sys.SysUserService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * <p>
 * 用户管理 服务实现类
 * </p>
 *
 * @author cjh
 * @since 2019-10-20
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @TestAction(name = "TEST AOP")
    @Override
    public List<SysUser> findAll() {
        return baseMapper.findAll();
    }
}
