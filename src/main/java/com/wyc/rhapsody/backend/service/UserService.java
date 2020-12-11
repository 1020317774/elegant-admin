package com.wyc.rhapsody.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyc.rhapsody.backend.model.dto.LoginDTO;
import com.wyc.rhapsody.backend.model.dto.RegisterDTO;
import com.wyc.rhapsody.backend.model.entity.TbUser;
import com.wyc.rhapsody.backend.model.vo.ProfileVO;

/**
 * 用户
 *
 * @author Knox 2020/11/7
 */
public interface UserService extends IService<TbUser> {

    /**
     * 用户登录
     *
     * @param dto
     * @return 生成的JWT的token
     */
    String executeLogin(LoginDTO dto);

    /**
     * 注册功能
     *
     * @param dto
     * @return 注册对象
     */
    TbUser executeRegister(RegisterDTO dto);

    /**
     * 获取用户信息
     *
     * @param username
     * @return dbUser
     */
    TbUser getUserByUsername(String username);

    /**
     * 获取用户信息
     *
     * @param id 用户ID
     * @return
     */
    ProfileVO getUserProfile(String id);

}