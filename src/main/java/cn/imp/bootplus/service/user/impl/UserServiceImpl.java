package cn.imp.bootplus.service.user.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import cn.imp.bootplus.entity.user.User;
import cn.imp.bootplus.mapper.user.UserMapper;
import cn.imp.bootplus.service.user.IUserService;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2018-10-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
