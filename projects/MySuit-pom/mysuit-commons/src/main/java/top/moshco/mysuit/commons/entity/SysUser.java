package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 帐号表
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "sys_user")
public class SysUser implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：user_name 字段描述：用户帐号
	@Field("user_name")
	protected String userName = null;

	// 对应数据库字段：password 字段描述：登录密码
	@Field("password")
	protected String password = null;

	// 对应数据库字段：dongles 字段描述：加密狗
	@Field("dongles")
	protected String dongles = null;

	// 对应数据库字段：true_name 字段描述：真实姓名
	@Field("true_name")
	protected String trueName = null;

	// 对应数据库字段：email 字段描述：邮箱
	@Field("email")
	protected String email = null;

	// 对应数据库字段：mobile 字段描述：手机
	@Field("mobile")
	protected String mobile = null;

	// 对应数据库字段：enable 字段描述：是否激活（否、是）
	@Field("enable")
	protected String enable = null;

	// 对应数据库字段：user_type 字段描述：帐号类型（员工帐号、机构帐号、申办方/CRO帐号、受试者帐号、接口帐号帐号）
	@Field("user_type")
	protected String userType = null;

	// 对应数据库字段：last_set_password_time 字段描述：用户上次修改密码时间
	@Field("last_set_password_time")
	protected Date lastSetPasswordTime = null;

	// 对应数据库字段：prior_login_time 字段描述：前一次登录时间
	@Field("prior_login_time")
	protected Date priorLoginTime = null;

	// 对应数据库字段：last_login_time 字段描述：最后一次登录时间
	@Field("last_login_time")
	protected Date lastLoginTime = null;

	// 对应数据库字段：total_login 字段描述：登录次数
	@Field("total_login")
	protected Integer totalLogin = null;

	// 对应数据库字段：create_time 字段描述：创建时间
	@Field("create_time")
	protected Date createTime = null;

	// 对应数据库字段：remark 字段描述：备注
	@Field("remark")
	protected String remark = null;

	// 对应数据库字段：is_valid 字段描述：是否有效记录（0-无效 1-有效）
	@Field("is_valid")
	protected Integer isValid = null;

	// 对应数据库字段：invalid_date 字段描述：删除时间
	@Field("invalid_date")
	protected Date invalidDate = null;

	/**
	 * 对应数据库字段：id 字段描述：记录编号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 对应数据库字段：id 字段描述：记录编号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 对应数据库字段：user_name 字段描述：用户帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 对应数据库字段：user_name 字段描述：用户帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 对应数据库字段：password 字段描述：登录密码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 对应数据库字段：password 字段描述：登录密码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 对应数据库字段：dongles 字段描述：加密狗
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getDongles() {
		return dongles;
	}

	/**
	 * 对应数据库字段：dongles 字段描述：加密狗
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：dongles
	 */
	public void setDongles(String dongles) {
		this.dongles = dongles;
	}

	/**
	 * 对应数据库字段：true_name 字段描述：真实姓名
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * 对应数据库字段：true_name 字段描述：真实姓名
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：trueName
	 */
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	/**
	 * 对应数据库字段：email 字段描述：邮箱
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 对应数据库字段：email 字段描述：邮箱
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 对应数据库字段：mobile 字段描述：手机
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 对应数据库字段：mobile 字段描述：手机
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 对应数据库字段：enable 字段描述：是否激活（否、是）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getEnable() {
		return enable;
	}

	/**
	 * 对应数据库字段：enable 字段描述：是否激活（否、是）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：enable
	 */
	public void setEnable(String enable) {
		this.enable = enable;
	}

	/**
	 * 对应数据库字段：user_type 字段描述：帐号类型（员工帐号、机构帐号、申办方/CRO帐号、受试者帐号、接口帐号帐号）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * 对应数据库字段：user_type 字段描述：帐号类型（员工帐号、机构帐号、申办方/CRO帐号、受试者帐号、接口帐号帐号）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：userType
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * 对应数据库字段：last_set_password_time 字段描述：用户上次修改密码时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getLastSetPasswordTime() {
		return lastSetPasswordTime;
	}

	/**
	 * 对应数据库字段：last_set_password_time 字段描述：用户上次修改密码时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：lastSetPasswordTime
	 */
	public void setLastSetPasswordTime(Date lastSetPasswordTime) {
		this.lastSetPasswordTime = lastSetPasswordTime;
	}

	/**
	 * 对应数据库字段：prior_login_time 字段描述：前一次登录时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getPriorLoginTime() {
		return priorLoginTime;
	}

	/**
	 * 对应数据库字段：prior_login_time 字段描述：前一次登录时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：priorLoginTime
	 */
	public void setPriorLoginTime(Date priorLoginTime) {
		this.priorLoginTime = priorLoginTime;
	}

	/**
	 * 对应数据库字段：last_login_time 字段描述：最后一次登录时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * 对应数据库字段：last_login_time 字段描述：最后一次登录时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：lastLoginTime
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * 对应数据库字段：total_login 字段描述：登录次数
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getTotalLogin() {
		return totalLogin;
	}

	/**
	 * 对应数据库字段：total_login 字段描述：登录次数
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：totalLogin
	 */
	public void setTotalLogin(Integer totalLogin) {
		this.totalLogin = totalLogin;
	}

	/**
	 * 对应数据库字段：create_time 字段描述：创建时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 对应数据库字段：create_time 字段描述：创建时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 对应数据库字段：remark 字段描述：备注
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 对应数据库字段：remark 字段描述：备注
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 对应数据库字段：is_valid 字段描述：是否有效记录（0-无效 1-有效）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getIsValid() {
		return isValid;
	}

	/**
	 * 对应数据库字段：is_valid 字段描述：是否有效记录（0-无效 1-有效）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：isValid
	 */
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	/**
	 * 对应数据库字段：invalid_date 字段描述：删除时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getInvalidDate() {
		return invalidDate;
	}

	/**
	 * 对应数据库字段：invalid_date 字段描述：删除时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：invalidDate
	 */
	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

}
