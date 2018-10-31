package cn.imp.bootplus.service.user;

import java.util.List;

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
	
	/**
	 * 根据id获取user
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findUserById(String id) throws Exception;

	/**
	 * 验证登录用户用户名和密码是否正确
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public boolean verificationUser(String userName, String password) throws Exception;
	
	/**
	 * 根据传入条件查询user用户
	 * @param condition
	 * @return
	 * @throws Exception
	 */
	public List<User> findUserByCondition(User condition) throws Exception; 
}
