package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 验证码表
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "verify_code")
public class VerifyCode implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：code 字段描述：验证码
	@Field("code")
	protected String code = null;

	// 对应数据库字段：sort 字段描述：验证码类型（掩码、手机验证码、邮箱验证码）
	@Field("sort")
	protected String sort = null;

	// 对应数据库字段：email 字段描述：邮箱
	@Field("email")
	protected String email = null;

	// 对应数据库字段：mobile 字段描述：手机号
	@Field("mobile")
	protected String mobile = null;

	// 对应数据库字段：client_id 字段描述：客户端Id
	@Field("client_id")
	protected String clientId = null;

	// 对应数据库字段：session_id 字段描述：sessionId
	@Field("session_id")
	protected String sessionId = null;

	// 对应数据库字段：user_id 字段描述：帐号表Id
	@Field("user_id")
	protected String userId = null;

	// 对应数据库字段：true_name 字段描述：真实姓名
	@Field("true_name")
	protected String trueName = null;

	// 对应数据库字段：action_place 字段描述：验证码功能（员工登录、机构登录、申办方/CRO登录、受试者登录、受试者注册、验证手机、验证邮箱）
	@Field("action_place")
	protected String actionPlace = null;

	// 对应数据库字段：begin_time 字段描述：开始时间
	@Field("begin_time")
	protected Date beginTime = null;

	// 对应数据库字段：end_time 字段描述：结束时间
	@Field("end_time")
	protected Date endTime = null;

	// 对应数据库字段：validate_length 字段描述：有效时长（分钟）
	@Field("validate_length")
	protected Integer validateLength = null;

	// 对应数据库字段：is_verify 字段描述：是否验证（否、是）
	@Field("is_verify")
	protected String isVerify = null;

	// 对应数据库字段：verify_time 字段描述：验证时间
	@Field("verify_time")
	protected Date verifyTime = null;

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
	 * 对应数据库字段：code 字段描述：验证码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 对应数据库字段：code 字段描述：验证码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 对应数据库字段：sort 字段描述：验证码类型（掩码、手机验证码、邮箱验证码）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * 对应数据库字段：sort 字段描述：验证码类型（掩码、手机验证码、邮箱验证码）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：sort
	 */
	public void setSort(String sort) {
		this.sort = sort;
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
	 * 对应数据库字段：mobile 字段描述：手机号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 对应数据库字段：mobile 字段描述：手机号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 对应数据库字段：client_id 字段描述：客户端Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * 对应数据库字段：client_id 字段描述：客户端Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：clientId
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * 对应数据库字段：session_id 字段描述：sessionId
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * 对应数据库字段：session_id 字段描述：sessionId
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：sessionId
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * 对应数据库字段：user_id 字段描述：帐号表Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 对应数据库字段：user_id 字段描述：帐号表Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * 对应数据库字段：action_place 字段描述：验证码功能（员工登录、机构登录、申办方/CRO登录、受试者登录、受试者注册、验证手机、验证邮箱）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getActionPlace() {
		return actionPlace;
	}

	/**
	 * 对应数据库字段：action_place 字段描述：验证码功能（员工登录、机构登录、申办方/CRO登录、受试者登录、受试者注册、验证手机、验证邮箱）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：actionPlace
	 */
	public void setActionPlace(String actionPlace) {
		this.actionPlace = actionPlace;
	}

	/**
	 * 对应数据库字段：begin_time 字段描述：开始时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getBeginTime() {
		return beginTime;
	}

	/**
	 * 对应数据库字段：begin_time 字段描述：开始时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：beginTime
	 */
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * 对应数据库字段：end_time 字段描述：结束时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 对应数据库字段：end_time 字段描述：结束时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：endTime
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * 对应数据库字段：validate_length 字段描述：有效时长（分钟）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getValidateLength() {
		return validateLength;
	}

	/**
	 * 对应数据库字段：validate_length 字段描述：有效时长（分钟）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：validateLength
	 */
	public void setValidateLength(Integer validateLength) {
		this.validateLength = validateLength;
	}

	/**
	 * 对应数据库字段：is_verify 字段描述：是否验证（否、是）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getIsVerify() {
		return isVerify;
	}

	/**
	 * 对应数据库字段：is_verify 字段描述：是否验证（否、是）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：isVerify
	 */
	public void setIsVerify(String isVerify) {
		this.isVerify = isVerify;
	}

	/**
	 * 对应数据库字段：verify_time 字段描述：验证时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getVerifyTime() {
		return verifyTime;
	}

	/**
	 * 对应数据库字段：verify_time 字段描述：验证时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：verifyTime
	 */
	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
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
