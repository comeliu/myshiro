package com.coderman.rent.sys.service;

import com.coderman.rent.sys.bean.Role;
import com.coderman.rent.sys.vo.PageVo;
import com.coderman.rent.sys.vo.RoleVo;

import java.util.List;

/**
 * 角色
 * Created by zhangyukang on 2019/11/11 16:48
 */
public interface RoleService {

    PageVo<Role> findPage(RoleVo roleVo);

    void update(RoleVo roleVo);

    void delete(RoleVo roleVo);

    void add(RoleVo roleVo);

    List<Role> findRoleList(List<Long> roleIds);

    /**
     * 更新用户的菜单
     * @param roleVo
     */
    void updateRoleMenu(RoleVo roleVo);
}
