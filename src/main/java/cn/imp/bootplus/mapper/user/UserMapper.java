package cn.imp.bootplus.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import cn.imp.bootplus.entity.user.User;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author jln
 * @since 2018-10-25
 */
public interface UserMapper extends BaseMapper<User> {

	/**
	 * 根据用户名和密码判断用户是否存在
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public int verificationUser(@Param("userName") String userName, @Param("password") String password);
	
	/**
	 * 根据条件类查询user列表
	 * @param condition
	 * @return
	 */
	public List<User> findUserByCondition(@Param("condition") User condition);

}
