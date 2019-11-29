package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 部门表
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "department")
public class Department implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：sponsor_id 字段描述：申办方Id（中兴正远该值为空）
	@Field("sponsor_id")
	protected String sponsorId = null;

	// 对应数据库字段：sponsor_title_all 字段描述：申办方全称
	@Field("sponsor_title_all")
	protected String sponsorTitleAll = null;

	// 对应数据库字段：title 字段描述：部门名称
	@Field("title")
	protected String title = null;

	// 对应数据库字段：super_title 字段描述：上级部门
	@Field("super_title")
	protected String superTitle = null;

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
	 * 对应数据库字段：sponsor_id 字段描述：申办方Id（中兴正远该值为空）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getSponsorId() {
		return sponsorId;
	}

	/**
	 * 对应数据库字段：sponsor_id 字段描述：申办方Id（中兴正远该值为空）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：sponsorId
	 */
	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}

	/**
	 * 对应数据库字段：sponsor_title_all 字段描述：申办方全称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getSponsorTitleAll() {
		return sponsorTitleAll;
	}

	/**
	 * 对应数据库字段：sponsor_title_all 字段描述：申办方全称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：sponsorTitleAll
	 */
	public void setSponsorTitleAll(String sponsorTitleAll) {
		this.sponsorTitleAll = sponsorTitleAll;
	}

	/**
	 * 对应数据库字段：title 字段描述：部门名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 对应数据库字段：title 字段描述：部门名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 对应数据库字段：super_title 字段描述：上级部门
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getSuperTitle() {
		return superTitle;
	}

	/**
	 * 对应数据库字段：super_title 字段描述：上级部门
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：superTitle
	 */
	public void setSuperTitle(String superTitle) {
		this.superTitle = superTitle;
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
