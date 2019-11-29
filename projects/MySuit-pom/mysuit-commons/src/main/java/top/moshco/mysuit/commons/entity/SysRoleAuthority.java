package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 角色和权限之间的关系表
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "sys_role_authority")
public class SysRoleAuthority implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：role_id 字段描述：角色Id
	@Field("role_id")
	protected String roleId = null;

	// 对应数据库字段：authority_id 字段描述：权限Id
	@Field("authority_id")
	protected String authorityId = null;

	// 对应数据库字段：authority_code 字段描述：权限编码
	@Field("authority_code")
	protected String authorityCode = null;

	// 对应数据库字段：authority_group_id 字段描述：权限组Id
	@Field("authority_group_id")
	protected String authorityGroupId = null;

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
	 * 对应数据库字段：role_id 字段描述：角色Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * 对应数据库字段：role_id 字段描述：角色Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：roleId
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * 对应数据库字段：authority_id 字段描述：权限Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getAuthorityId() {
		return authorityId;
	}

	/**
	 * 对应数据库字段：authority_id 字段描述：权限Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：authorityId
	 */
	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}

	/**
	 * 对应数据库字段：authority_code 字段描述：权限编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getAuthorityCode() {
		return authorityCode;
	}

	/**
	 * 对应数据库字段：authority_code 字段描述：权限编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：authorityCode
	 */
	public void setAuthorityCode(String authorityCode) {
		this.authorityCode = authorityCode;
	}

	/**
	 * 对应数据库字段：authority_group_id 字段描述：权限组Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getAuthorityGroupId() {
		return authorityGroupId;
	}

	/**
	 * 对应数据库字段：authority_group_id 字段描述：权限组Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：authorityGroupId
	 */
	public void setAuthorityGroupId(String authorityGroupId) {
		this.authorityGroupId = authorityGroupId;
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
