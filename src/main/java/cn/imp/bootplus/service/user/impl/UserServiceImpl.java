package cn.imp.bootplus.service.user.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import cn.imp.bootplus.entity.user.User;
import cn.imp.bootplus.mapper.user.UserMapper;
import cn.imp.bootplus.service.user.IUserService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jln
 * @since 2018-10-25
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "java.lang.Exception")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserById(String id) throws Exception {
		return userMapper.selectById(id);
	}

	@Override
	public boolean verificationUser(String username, String password) throws Exception {
		int count = userMapper.verificationUser(username, password);
		return count == 1;
	}

	@Override
	public List<User> findUserByCondition(User condition) throws Exception {
		return userMapper.findUserByCondition(condition);
	}

}
