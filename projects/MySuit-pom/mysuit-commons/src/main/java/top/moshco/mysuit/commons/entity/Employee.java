package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 员工表
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "employee")
public class Employee implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：user_id 字段描述：帐号Id
	@Field("user_id")
	protected String userId = null;

	// 对应数据库字段：user_name 字段描述：登录帐号
	@Field("user_name")
	protected String userName = null;

	// 对应数据库字段：true_name 字段描述：真实姓名
	@Field("true_name")
	protected String trueName = null;

	// 对应数据库字段：birthday 字段描述：生日
	@Field("birthday")
	protected String birthday = null;

	// 对应数据库字段：sex 字段描述：性别
	@Field("sex")
	protected String sex = null;

	// 对应数据库字段：post 字段描述：岗位
	@Field("post")
	protected String post = null;

	// 对应数据库字段：is_manage_post 字段描述：是否管理岗位（否、是）
	@Field("is_manage_post")
	protected String isManagePost = null;

	// 对应数据库字段：department_id 字段描述：部门编号
	@Field("department_id")
	protected String departmentId = null;

	// 对应数据库字段：department 字段描述：部门
	@Field("department")
	protected String department = null;

	// 对应数据库字段：email 字段描述：邮箱
	@Field("email")
	protected String email = null;

	// 对应数据库字段：mobile 字段描述：手机
	@Field("mobile")
	protected String mobile = null;

	// 对应数据库字段：address 字段描述：住址
	@Field("address")
	protected String address = null;

	// 对应数据库字段：head_photo 字段描述：头像
	@Field("head_photo")
	protected String headPhoto = null;

	// 对应数据库字段：status 字段描述：员工状态（正式员工、试用期员工）
	@Field("status")
	protected String status = null;

	// 对应数据库字段：entry_time 字段描述：入职时间
	@Field("entry_time")
	protected Date entryTime = null;

	// 对应数据库字段：education 字段描述：学历
	@Field("education")
	protected String education = null;

	// 对应数据库字段：id_card 字段描述：身份证号
	@Field("id_card")
	protected String idCard = null;

	// 对应数据库字段：origin 字段描述：籍贯
	@Field("origin")
	protected String origin = null;

	// 对应数据库字段：creator_user_id 字段描述：创建人帐号Id
	@Field("creator_user_id")
	protected String creatorUserId = null;

	// 对应数据库字段：creator_user_name 字段描述：创建人登录帐号
	@Field("creator_user_name")
	protected String creatorUserName = null;

	// 对应数据库字段：creator_employee_id 字段描述：创建人员工Id
	@Field("creator_employee_id")
	protected String creatorEmployeeId = null;

	// 对应数据库字段：creator 字段描述：创建人
	@Field("creator")
	protected String creator = null;

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
	 * 对应数据库字段：user_id 字段描述：帐号Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 对应数据库字段：user_id 字段描述：帐号Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 对应数据库字段：user_name 字段描述：登录帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 对应数据库字段：user_name 字段描述：登录帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * 对应数据库字段：birthday 字段描述：生日
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * 对应数据库字段：birthday 字段描述：生日
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * 对应数据库字段：sex 字段描述：性别
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 对应数据库字段：sex 字段描述：性别
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 对应数据库字段：post 字段描述：岗位
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getPost() {
		return post;
	}

	/**
	 * 对应数据库字段：post 字段描述：岗位
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：post
	 */
	public void setPost(String post) {
		this.post = post;
	}

	/**
	 * 对应数据库字段：is_manage_post 字段描述：是否管理岗位（否、是）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getIsManagePost() {
		return isManagePost;
	}

	/**
	 * 对应数据库字段：is_manage_post 字段描述：是否管理岗位（否、是）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：isManagePost
	 */
	public void setIsManagePost(String isManagePost) {
		this.isManagePost = isManagePost;
	}

	/**
	 * 对应数据库字段：department_id 字段描述：部门编号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getDepartmentId() {
		return departmentId;
	}

	/**
	 * 对应数据库字段：department_id 字段描述：部门编号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：departmentId
	 */
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * 对应数据库字段：department 字段描述：部门
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * 对应数据库字段：department 字段描述：部门
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：department
	 */
	public void setDepartment(String department) {
		this.department = department;
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
	 * 对应数据库字段：address 字段描述：住址
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 对应数据库字段：address 字段描述：住址
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 对应数据库字段：head_photo 字段描述：头像
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getHeadPhoto() {
		return headPhoto;
	}

	/**
	 * 对应数据库字段：head_photo 字段描述：头像
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：headPhoto
	 */
	public void setHeadPhoto(String headPhoto) {
		this.headPhoto = headPhoto;
	}

	/**
	 * 对应数据库字段：status 字段描述：员工状态（正式员工、试用期员工）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 对应数据库字段：status 字段描述：员工状态（正式员工、试用期员工）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 对应数据库字段：entry_time 字段描述：入职时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getEntryTime() {
		return entryTime;
	}

	/**
	 * 对应数据库字段：entry_time 字段描述：入职时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：entryTime
	 */
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	/**
	 * 对应数据库字段：education 字段描述：学历
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * 对应数据库字段：education 字段描述：学历
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：education
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * 对应数据库字段：id_card 字段描述：身份证号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * 对应数据库字段：id_card 字段描述：身份证号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：idCard
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	/**
	 * 对应数据库字段：origin 字段描述：籍贯
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * 对应数据库字段：origin 字段描述：籍贯
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：origin
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * 对应数据库字段：creator_user_id 字段描述：创建人帐号Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getCreatorUserId() {
		return creatorUserId;
	}

	/**
	 * 对应数据库字段：creator_user_id 字段描述：创建人帐号Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：creatorUserId
	 */
	public void setCreatorUserId(String creatorUserId) {
		this.creatorUserId = creatorUserId;
	}

	/**
	 * 对应数据库字段：creator_user_name 字段描述：创建人登录帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getCreatorUserName() {
		return creatorUserName;
	}

	/**
	 * 对应数据库字段：creator_user_name 字段描述：创建人登录帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：creatorUserName
	 */
	public void setCreatorUserName(String creatorUserName) {
		this.creatorUserName = creatorUserName;
	}

	/**
	 * 对应数据库字段：creator_employee_id 字段描述：创建人员工Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getCreatorEmployeeId() {
		return creatorEmployeeId;
	}

	/**
	 * 对应数据库字段：creator_employee_id 字段描述：创建人员工Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：creatorEmployeeId
	 */
	public void setCreatorEmployeeId(String creatorEmployeeId) {
		this.creatorEmployeeId = creatorEmployeeId;
	}

	/**
	 * 对应数据库字段：creator 字段描述：创建人
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * 对应数据库字段：creator 字段描述：创建人
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：creator
	 */
	public void setCreator(String creator) {
		this.creator = creator;
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
