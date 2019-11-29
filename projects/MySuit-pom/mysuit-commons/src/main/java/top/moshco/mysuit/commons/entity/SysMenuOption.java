package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 菜单项
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "sys_menu_option")
public class SysMenuOption implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：code 字段描述：菜单编码
	@Field("code")
	protected String code = null;

	// 对应数据库字段：inner_code 字段描述：目录内编码
	@Field("inner_code")
	protected String innerCode = null;

	// 对应数据库字段：icon 字段描述：菜单图标
	@Field("icon")
	protected String icon = null;

	// 对应数据库字段：title 字段描述：菜单项名称
	@Field("title")
	protected String title = null;

	// 对应数据库字段：super_id 字段描述：上级菜单项
	@Field("super_id")
	protected String superId = null;

	// 对应数据库字段：super_title 字段描述：上级菜单项名称
	@Field("super_title")
	protected String superTitle = null;

	// 对应数据库字段：depth 字段描述：菜单深度
	@Field("depth")
	protected Integer depth = null;

	// 对应数据库字段：url 字段描述：功能链接
	@Field("url")
	protected String url = null;

	// 对应数据库字段：is_band_authority 字段描述：是否绑定权限（是、否）
	@Field("is_band_authority")
	protected String isBandAuthority = null;

	// 对应数据库字段：authority_id 字段描述：权限Id
	@Field("authority_id")
	protected String authorityId = null;

	// 对应数据库字段：authority_code 字段描述：权限编码
	@Field("authority_code")
	protected String authorityCode = null;

	// 对应数据库字段：authority 字段描述：权限标题
	@Field("authority")
	protected String authority = null;

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
	 * 对应数据库字段：code 字段描述：菜单编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 对应数据库字段：code 字段描述：菜单编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 对应数据库字段：inner_code 字段描述：目录内编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getInnerCode() {
		return innerCode;
	}

	/**
	 * 对应数据库字段：inner_code 字段描述：目录内编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：innerCode
	 */
	public void setInnerCode(String innerCode) {
		this.innerCode = innerCode;
	}

	/**
	 * 对应数据库字段：icon 字段描述：菜单图标
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 对应数据库字段：icon 字段描述：菜单图标
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * 对应数据库字段：title 字段描述：菜单项名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 对应数据库字段：title 字段描述：菜单项名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 对应数据库字段：super_id 字段描述：上级菜单项
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getSuperId() {
		return superId;
	}

	/**
	 * 对应数据库字段：super_id 字段描述：上级菜单项
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：superId
	 */
	public void setSuperId(String superId) {
		this.superId = superId;
	}

	/**
	 * 对应数据库字段：super_title 字段描述：上级菜单项名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getSuperTitle() {
		return superTitle;
	}

	/**
	 * 对应数据库字段：super_title 字段描述：上级菜单项名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：superTitle
	 */
	public void setSuperTitle(String superTitle) {
		this.superTitle = superTitle;
	}

	/**
	 * 对应数据库字段：depth 字段描述：菜单深度
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Integer getDepth() {
		return depth;
	}

	/**
	 * 对应数据库字段：depth 字段描述：菜单深度
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：depth
	 */
	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	/**
	 * 对应数据库字段：url 字段描述：功能链接
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 对应数据库字段：url 字段描述：功能链接
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 对应数据库字段：is_band_authority 字段描述：是否绑定权限（是、否）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getIsBandAuthority() {
		return isBandAuthority;
	}

	/**
	 * 对应数据库字段：is_band_authority 字段描述：是否绑定权限（是、否）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：isBandAuthority
	 */
	public void setIsBandAuthority(String isBandAuthority) {
		this.isBandAuthority = isBandAuthority;
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
	 * 对应数据库字段：authority 字段描述：权限标题
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * 对应数据库字段：authority 字段描述：权限标题
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：authority
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
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
