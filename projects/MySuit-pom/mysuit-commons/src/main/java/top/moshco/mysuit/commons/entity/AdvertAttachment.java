package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 广告附件表
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "advert_attachment")
public class AdvertAttachment implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：advert_id 字段描述：广告编号
	@Field("advert_id")
	protected String advertId = null;

	// 对应数据库字段：code 字段描述：广告编码
	@Field("code")
	protected String code = null;

	// 对应数据库字段：title 字段描述：标题
	@Field("title")
	protected String title = null;

	// 对应数据库字段：content_type 字段描述：内容类型（图片、swf视频、视频、其它）
	@Field("content_type")
	protected String contentType = null;

	// 对应数据库字段：content_file 字段描述：附件文件
	@Field("content_file")
	protected String contentFile = null;

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
	 * 对应数据库字段：advert_id 字段描述：广告编号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getAdvertId() {
		return advertId;
	}

	/**
	 * 对应数据库字段：advert_id 字段描述：广告编号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：advertId
	 */
	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

	/**
	 * 对应数据库字段：code 字段描述：广告编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 对应数据库字段：code 字段描述：广告编码
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 对应数据库字段：title 字段描述：标题
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 对应数据库字段：title 字段描述：标题
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 对应数据库字段：content_type 字段描述：内容类型（图片、swf视频、视频、其它）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * 对应数据库字段：content_type 字段描述：内容类型（图片、swf视频、视频、其它）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：contentType
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * 对应数据库字段：content_file 字段描述：附件文件
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getContentFile() {
		return contentFile;
	}

	/**
	 * 对应数据库字段：content_file 字段描述：附件文件
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：contentFile
	 */
	public void setContentFile(String contentFile) {
		this.contentFile = contentFile;
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
