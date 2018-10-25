package cn.imp.bootplus.service.user;

import com.baomidou.mybatisplus.service.IService;

import cn.imp.bootplus.entity.user.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jln
 * @since 2018-10-25
 */
public interface IUserService extends IService<User> {
	
	public User getUser(String id)  throws Exception;
}
