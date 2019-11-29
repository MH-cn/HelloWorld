package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 地址区域
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "address_region")
public class AddressRegion implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：parent_region 字段描述：上级区域名称
	@Field("parent_region")
	protected String parentRegion = null;

	// 对应数据库字段：region_name 字段描述：区域名称
	@Field("region_name")
	protected String regionName = null;

	// 对应数据库字段：post_code 字段描述：邮编
	@Field("post_code")
	protected String postCode = null;

	// 对应数据库字段：level 字段描述：行政级别（省份、直辖市、省会城市、地级市、县、县级市、镇、乡）
	@Field("level")
	protected String level = null;

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
	 * 对应数据库字段：parent_region 字段描述：上级区域名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getParentRegion() {
		return parentRegion;
	}

	/**
	 * 对应数据库字段：parent_region 字段描述：上级区域名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：parentRegion
	 */
	public void setParentRegion(String parentRegion) {
		this.parentRegion = parentRegion;
	}

	/**
	 * 对应数据库字段：region_name 字段描述：区域名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getRegionName() {
		return regionName;
	}

	/**
	 * 对应数据库字段：region_name 字段描述：区域名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：regionName
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	/**
	 * 对应数据库字段：post_code 字段描述：邮编
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * 对应数据库字段：post_code 字段描述：邮编
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：postCode
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * 对应数据库字段：level 字段描述：行政级别（省份、直辖市、省会城市、地级市、县、县级市、镇、乡）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * 对应数据库字段：level 字段描述：行政级别（省份、直辖市、省会城市、地级市、县、县级市、镇、乡）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：level
	 */
	public void setLevel(String level) {
		this.level = level;
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
