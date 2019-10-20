package com.cjh.study.mango.service.sys;

import com.cjh.study.mango.bean.sys.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户管理 服务类
 * </p>
 *
 * @author cjh
 * @since 2019-10-20
 */
public interface SysUserService extends IService<SysUser> {
    List<SysUser> findAll();
}
