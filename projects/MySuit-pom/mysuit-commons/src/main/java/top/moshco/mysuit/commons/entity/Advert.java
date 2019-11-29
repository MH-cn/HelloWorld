package top.moshco.mysuit.commons.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

/**
 * 广告
 * 创建时间：2019-11-18 18:36:02
 *
 * @author moshco zhu
 *
 */
@Document(collection = "advert")
public class Advert implements Serializable {

	// 对应数据库字段：id 字段描述：记录编号
	@Id
	@Field("id")
	protected String id = null;

	// 对应数据库字段：code 字段描述：广告编码
	@Field("code")
	protected String code = null;

	// 对应数据库字段：position 字段描述：广告位置 来至字典（如：主页左侧、页头、页脚）
	@Field("position")
	protected String position = null;

	// 对应数据库字段：title 字段描述：标题
	@Field("title")
	protected String title = null;

	// 对应数据库字段：content_file 字段描述：内容文件
	@Field("content_file")
	protected String contentFile = null;

	// 对应数据库字段：start_time 字段描述：生效时间
	@Field("start_time")
	protected Date startTime = null;

	// 对应数据库字段：expire_time 字段描述：过期时间
	@Field("expire_time")
	protected Date expireTime = null;

	// 对应数据库字段：status 字段描述：状态（编辑、已经发布）
	@Field("status")
	protected String status = null;

	// 对应数据库字段：preview_url 字段描述：预览的url 可以带参数
	@Field("preview_url")
	protected String previewUrl = null;

	// 对应数据库字段：publisher_user_id 字段描述：发布人帐号Id
	@Field("publisher_user_id")
	protected String publisherUserId = null;

	// 对应数据库字段：publisher_user_name 字段描述：发布人登录帐号
	@Field("publisher_user_name")
	protected String publisherUserName = null;

	// 对应数据库字段：publisher_employee_id 字段描述：发布人员工Id
	@Field("publisher_employee_id")
	protected String publisherEmployeeId = null;

	// 对应数据库字段：publisher 字段描述：发布人
	@Field("publisher")
	protected String publisher = null;

	// 对应数据库字段：publish_time 字段描述：发布时间
	@Field("publish_time")
	protected Date publishTime = null;

	// 对应数据库字段：editor_user_id 字段描述：编辑人帐号Id
	@Field("editor_user_id")
	protected String editorUserId = null;

	// 对应数据库字段：editor_user_name 字段描述：编辑人登录帐号
	@Field("editor_user_name")
	protected String editorUserName = null;

	// 对应数据库字段：editor_employee_id 字段描述：编辑人员工Id
	@Field("editor_employee_id")
	protected String editorEmployeeId = null;

	// 对应数据库字段：editor 字段描述：编辑人
	@Field("editor")
	protected String editor = null;

	// 对应数据库字段：edit_time 字段描述：编辑时间
	@Field("edit_time")
	protected Date editTime = null;

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
	 * 对应数据库字段：position 字段描述：广告位置 来至字典（如：主页左侧、页头、页脚）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * 对应数据库字段：position 字段描述：广告位置 来至字典（如：主页左侧、页头、页脚）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：position
	 */
	public void setPosition(String position) {
		this.position = position;
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
	 * 对应数据库字段：content_file 字段描述：内容文件
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getContentFile() {
		return contentFile;
	}

	/**
	 * 对应数据库字段：content_file 字段描述：内容文件
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：contentFile
	 */
	public void setContentFile(String contentFile) {
		this.contentFile = contentFile;
	}

	/**
	 * 对应数据库字段：start_time 字段描述：生效时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * 对应数据库字段：start_time 字段描述：生效时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：startTime
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * 对应数据库字段：expire_time 字段描述：过期时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getExpireTime() {
		return expireTime;
	}

	/**
	 * 对应数据库字段：expire_time 字段描述：过期时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：expireTime
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * 对应数据库字段：status 字段描述：状态（编辑、已经发布）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 对应数据库字段：status 字段描述：状态（编辑、已经发布）
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 对应数据库字段：preview_url 字段描述：预览的url 可以带参数
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getPreviewUrl() {
		return previewUrl;
	}

	/**
	 * 对应数据库字段：preview_url 字段描述：预览的url 可以带参数
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：previewUrl
	 */
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	/**
	 * 对应数据库字段：publisher_user_id 字段描述：发布人帐号Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getPublisherUserId() {
		return publisherUserId;
	}

	/**
	 * 对应数据库字段：publisher_user_id 字段描述：发布人帐号Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：publisherUserId
	 */
	public void setPublisherUserId(String publisherUserId) {
		this.publisherUserId = publisherUserId;
	}

	/**
	 * 对应数据库字段：publisher_user_name 字段描述：发布人登录帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getPublisherUserName() {
		return publisherUserName;
	}

	/**
	 * 对应数据库字段：publisher_user_name 字段描述：发布人登录帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：publisherUserName
	 */
	public void setPublisherUserName(String publisherUserName) {
		this.publisherUserName = publisherUserName;
	}

	/**
	 * 对应数据库字段：publisher_employee_id 字段描述：发布人员工Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getPublisherEmployeeId() {
		return publisherEmployeeId;
	}

	/**
	 * 对应数据库字段：publisher_employee_id 字段描述：发布人员工Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：publisherEmployeeId
	 */
	public void setPublisherEmployeeId(String publisherEmployeeId) {
		this.publisherEmployeeId = publisherEmployeeId;
	}

	/**
	 * 对应数据库字段：publisher 字段描述：发布人
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * 对应数据库字段：publisher 字段描述：发布人
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * 对应数据库字段：publish_time 字段描述：发布时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getPublishTime() {
		return publishTime;
	}

	/**
	 * 对应数据库字段：publish_time 字段描述：发布时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：publishTime
	 */
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	/**
	 * 对应数据库字段：editor_user_id 字段描述：编辑人帐号Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getEditorUserId() {
		return editorUserId;
	}

	/**
	 * 对应数据库字段：editor_user_id 字段描述：编辑人帐号Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：editorUserId
	 */
	public void setEditorUserId(String editorUserId) {
		this.editorUserId = editorUserId;
	}

	/**
	 * 对应数据库字段：editor_user_name 字段描述：编辑人登录帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getEditorUserName() {
		return editorUserName;
	}

	/**
	 * 对应数据库字段：editor_user_name 字段描述：编辑人登录帐号
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：editorUserName
	 */
	public void setEditorUserName(String editorUserName) {
		this.editorUserName = editorUserName;
	}

	/**
	 * 对应数据库字段：editor_employee_id 字段描述：编辑人员工Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getEditorEmployeeId() {
		return editorEmployeeId;
	}

	/**
	 * 对应数据库字段：editor_employee_id 字段描述：编辑人员工Id
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：editorEmployeeId
	 */
	public void setEditorEmployeeId(String editorEmployeeId) {
		this.editorEmployeeId = editorEmployeeId;
	}

	/**
	 * 对应数据库字段：editor 字段描述：编辑人
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * 对应数据库字段：editor 字段描述：编辑人
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：editor
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * 对应数据库字段：edit_time 字段描述：编辑时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @return
	 */
	public Date getEditTime() {
		return editTime;
	}

	/**
	 * 对应数据库字段：edit_time 字段描述：编辑时间
	 *
	 * 开发时间：2019-11-18 18:36:02
	 * @author：moshco zhu
	 * @param：editTime
	 */
	public void setEditTime(Date editTime) {
		this.editTime = editTime;
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
