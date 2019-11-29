package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 系统权限表
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "sys_authority")
public class SysAuthority implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：title 字段描述：权限标题
	@Field("title")
	protected String title = null;

	// 对应数据库字段：code 字段描述：权限编码
	@Field("code")
	protected String code = null;

	// 对应数据库字段：authority_group_id 字段描述：权限组Id
	@Field("authority_group_id")
	protected String authorityGroupId = null;

	// 对应数据库字段：authority_group 字段描述：权限组
	@Field("authority_group")
	protected String authorityGroup = null;

	// 对应数据库字段：entry_url 字段描述：入口功能链接
	@Field("entry_url")
	protected String entryUrl = null;

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
	 * 对应数据库字段：title 字段描述：权限标题
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 对应数据库字段：title 字段描述：权限标题
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 对应数据库字段：code 字段描述：权限编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 对应数据库字段：code 字段描述：权限编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：code
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * 对应数据库字段：authority_group 字段描述：权限组
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getAuthorityGroup() {
		return authorityGroup;
	}

	/**
	 * 对应数据库字段：authority_group 字段描述：权限组
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：authorityGroup
	 */
	public void setAuthorityGroup(String authorityGroup) {
		this.authorityGroup = authorityGroup;
	}

	/**
	 * 对应数据库字段：entry_url 字段描述：入口功能链接
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getEntryUrl() {
		return entryUrl;
	}

	/**
	 * 对应数据库字段：entry_url 字段描述：入口功能链接
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：entryUrl
	 */
	public void setEntryUrl(String entryUrl) {
		this.entryUrl = entryUrl;
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
