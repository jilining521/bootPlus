package cn.imp.bootplus.entity.menu;

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
 * @since 2018-10-26
 */
@TableName("bootplus_system_menu")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    private String menuId;

    private String menuName;

    private String url;

    private String icon;

    private Integer req1;

    private Integer req2;

    private String delState;

    private Date modTime;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Integer getReq1() {
        return req1;
    }

    public void setReq1(Integer req1) {
        this.req1 = req1;
    }
    public Integer getReq2() {
        return req2;
    }

    public void setReq2(Integer req2) {
        this.req2 = req2;
    }
   

    public String getDelState() {
		return delState;
	}

	public void setDelState(String delState) {
		this.delState = delState;
	}

	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}

	@Override
    protected Serializable pkVal() {
        return this.menuId;
    }

    @Override
    public String toString() {
        return "Bootplus_system_menu{" +
        "menuId=" + menuId +
        ", menuName=" + menuName +
        ", url=" + url +
        ", icon=" + icon +
        ", req1=" + req1 +
        ", req2=" + req2 +
        ", del_state=" + delState +
        ", mod_time=" + modTime +
        "}";
    }
}
