package cn.imp.bootplus.entity.user;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jln
 * @since 2018-10-25
 */
@TableName("bootplus_system_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String userName;

    private Integer userAge;

    private Date birthday;

    private Integer phoneNum;

    private String address;

    private String remark;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "Bootplus_system_user{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", userAge=" + userAge +
        ", birthday=" + birthday +
        ", phoneNum=" + phoneNum +
        ", address=" + address +
        ", remark=" + remark +
        "}";
    }
}
