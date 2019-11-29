package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 数据区域
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "data_area")
public class DataArea implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：area_code 字段描述：区域编码
	@Field("area_code")
	protected String areaCode = null;

	// 对应数据库字段：area 字段描述：区域名称
	@Field("area")
	protected String area = null;

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
	 * 对应数据库字段：area_code 字段描述：区域编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * 对应数据库字段：area_code 字段描述：区域编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：areaCode
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * 对应数据库字段：area 字段描述：区域名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getArea() {
		return area;
	}

	/**
	 * 对应数据库字段：area 字段描述：区域名称
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：area
	 */
	public void setArea(String area) {
		this.area = area;
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
