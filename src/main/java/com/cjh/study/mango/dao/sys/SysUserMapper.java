package com.cjh.study.mango.dao.sys;

import com.cjh.study.mango.bean.sys.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户管理 Mapper 接口
 * </p>
 *
 * @author cjh
 * @since 2019-10-20
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<SysUser> findAll();
}
