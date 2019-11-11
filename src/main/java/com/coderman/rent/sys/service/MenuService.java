package com.coderman.rent.sys.service;

import com.coderman.rent.sys.bean.DTreeJson;
import com.coderman.rent.sys.bean.Menu;

import java.util.List;

/**
 * Created by zhangyukang on 2019/11/10 11:49
 */
public interface MenuService {
    /**
     * 查询所有的可用菜单
     * @return
     */
    public List<Menu> loadAllMenu();

    /**
     * 根据用户id查询菜单
     * @param userId
     * @return
     */
    public List<Menu> loadAllMenuByUserId( Long userId);

    /**
     * 加载所有可用的菜单（dTree）
     * @return
     */
    List<DTreeJson> loadAllMenuJSON();

    /**
     * 根据角色Id加载所有可用的菜单（dTree）
     * @param id：角色id
     * @return
     */
    List<DTreeJson> loadAllMenuByRoleId(Long id);
}
