package com.cjh.study.mango.service.sys.impl;

import com.cjh.study.mango.bean.sys.SysUser;
import com.cjh.study.mango.dao.sys.SysUserMapper;
import com.cjh.study.mango.service.sys.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    @Override
    public List<SysUser> findAll() {

        //return null;
        return baseMapper.findAll();
    }
}
