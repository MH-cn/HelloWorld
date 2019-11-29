package top.moshco.mysuit.commons.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import top.moshco.mysuit.commons.entity.SysUser;
import top.moshco.mysuit.commons.entity.SysUserUserGroup;
import top.moshco.mysuit.commons.entity.SysUserGroup;
import top.moshco.mysuit.commons.entity.SysUserGroupRole;
import top.moshco.mysuit.commons.entity.SysRole;
import top.moshco.mysuit.commons.entity.SysRoleAuthority;
import top.moshco.mysuit.commons.entity.SysAuthorityGroup;
import top.moshco.mysuit.commons.entity.SysAuthority;
import top.moshco.mysuit.commons.entity.SysMenuOption;
import top.moshco.mysuit.commons.entity.ConstantDataDict;
import top.moshco.mysuit.commons.entity.AddressRegion;
import top.moshco.mysuit.commons.entity.VerifyCode;
import top.moshco.mysuit.commons.entity.Employee;
import top.moshco.mysuit.commons.entity.Department;
import top.moshco.mysuit.commons.entity.DataArea;
import top.moshco.mysuit.commons.entity.Advert;
import top.moshco.mysuit.commons.entity.AdvertAttachment;
import org.apache.ibatis.annotations.Param;

/**
 * MySuit-commons项目的业务Mapper接口
 * 
 * 创建时间：2019-11-18 18:36:02
 * 
 * @author moshco zhu
 * 
 */
public interface MySuitBaseDao extends Serializable {
	
	/**
	 * 新建帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUser 被保存的实体对象
	 * @return
	 */
	public void saveSysUser(SysUser sysUser);

	/**
	 * 找寻帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserId 要找寻的实体记录的主键值 
	 * @return
	 */
	public SysUser findSysUser(@Param("sysUserId") String sysUserId);

	/**
	 * 更新帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUser 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUser(SysUser sysUser);

	/**
	 * 动态更新帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUser 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUser2(SysUser sysUser);

	/**
	 * 删除帐号表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUser 被删除的实体对象
	 * @return
	 */
	public void deleteSysUser(SysUser sysUser);

	/**
	 * 查询帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<SysUser> querySysUser(Map<String, Object> queryParamMap);

	/**
	 * 找寻帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public SysUser findSysUser2(Map<String, Object> queryParamMap);

	/**
	 * 找寻帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public SysUser findSysUser3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询帐号表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysUserCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询帐号表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<SysUser> queryPaginationSysUserList(Map<String, Object> queryParamMap);

	/**
	 * 新建用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroup 被保存的实体对象
	 * @return
	 */
	public void saveSysUserUserGroup(SysUserUserGroup sysUserUserGroup);

	/**
	 * 找寻用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroupId 要找寻的实体记录的主键值 
	 * @return
	 */
	public SysUserUserGroup findSysUserUserGroup(@Param("sysUserUserGroupId") String sysUserUserGroupId);

	/**
	 * 更新用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroup 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserUserGroup(SysUserUserGroup sysUserUserGroup);

	/**
	 * 动态更新用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroup 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserUserGroup2(SysUserUserGroup sysUserUserGroup);

	/**
	 * 删除用户和用户组之间关系表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroup 被删除的实体对象
	 * @return
	 */
	public void deleteSysUserUserGroup(SysUserUserGroup sysUserUserGroup);

	/**
	 * 查询用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<SysUserUserGroup> querySysUserUserGroup(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public SysUserUserGroup findSysUserUserGroup2(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public SysUserUserGroup findSysUserUserGroup3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询用户和用户组之间关系表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysUserUserGroupCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询用户和用户组之间关系表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<SysUserUserGroup> queryPaginationSysUserUserGroupList(Map<String, Object> queryParamMap);

	/**
	 * 新建用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroup 被保存的实体对象
	 * @return
	 */
	public void saveSysUserGroup(SysUserGroup sysUserGroup);

	/**
	 * 找寻用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupId 要找寻的实体记录的主键值 
	 * @return
	 */
	public SysUserGroup findSysUserGroup(@Param("sysUserGroupId") String sysUserGroupId);

	/**
	 * 更新用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroup 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserGroup(SysUserGroup sysUserGroup);

	/**
	 * 动态更新用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroup 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserGroup2(SysUserGroup sysUserGroup);

	/**
	 * 删除用户组表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroup 被删除的实体对象
	 * @return
	 */
	public void deleteSysUserGroup(SysUserGroup sysUserGroup);

	/**
	 * 查询用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<SysUserGroup> querySysUserGroup(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public SysUserGroup findSysUserGroup2(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public SysUserGroup findSysUserGroup3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询用户组表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysUserGroupCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询用户组表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<SysUserGroup> queryPaginationSysUserGroupList(Map<String, Object> queryParamMap);

	/**
	 * 新建用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRole 被保存的实体对象
	 * @return
	 */
	public void saveSysUserGroupRole(SysUserGroupRole sysUserGroupRole);

	/**
	 * 找寻用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRoleId 要找寻的实体记录的主键值 
	 * @return
	 */
	public SysUserGroupRole findSysUserGroupRole(@Param("sysUserGroupRoleId") String sysUserGroupRoleId);

	/**
	 * 更新用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRole 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserGroupRole(SysUserGroupRole sysUserGroupRole);

	/**
	 * 动态更新用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRole 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserGroupRole2(SysUserGroupRole sysUserGroupRole);

	/**
	 * 删除用户组和角色之间的关系表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRole 被删除的实体对象
	 * @return
	 */
	public void deleteSysUserGroupRole(SysUserGroupRole sysUserGroupRole);

	/**
	 * 查询用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<SysUserGroupRole> querySysUserGroupRole(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public SysUserGroupRole findSysUserGroupRole2(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public SysUserGroupRole findSysUserGroupRole3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询用户组和角色之间的关系表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysUserGroupRoleCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询用户组和角色之间的关系表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<SysUserGroupRole> queryPaginationSysUserGroupRoleList(Map<String, Object> queryParamMap);

	/**
	 * 新建角色表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRole 被保存的实体对象
	 * @return
	 */
	public void saveSysRole(SysRole sysRole);

	/**
	 * 找寻角色表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRoleId 要找寻的实体记录的主键值 
	 * @return
	 */
	public SysRole findSysRole(@Param("sysRoleId") String sysRoleId);

	/**
	 * 更新角色表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRole 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysRole(SysRole sysRole);

	/**
	 * 动态更新角色表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRole 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysRole2(SysRole sysRole);

	/**
	 * 删除角色表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRole 被删除的实体对象
	 * @return
	 */
	public void deleteSysRole(SysRole sysRole);

	/**
	 * 查询角色表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<SysRole> querySysRole(Map<String, Object> queryParamMap);

	/**
	 * 找寻角色表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public SysRole findSysRole2(Map<String, Object> queryParamMap);

	/**
	 * 找寻角色表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public SysRole findSysRole3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询角色表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysRoleCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询角色表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<SysRole> queryPaginationSysRoleList(Map<String, Object> queryParamMap);

	/**
	 * 新建角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthority 被保存的实体对象
	 * @return
	 */
	public void saveSysRoleAuthority(SysRoleAuthority sysRoleAuthority);

	/**
	 * 找寻角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthorityId 要找寻的实体记录的主键值 
	 * @return
	 */
	public SysRoleAuthority findSysRoleAuthority(@Param("sysRoleAuthorityId") String sysRoleAuthorityId);

	/**
	 * 更新角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthority 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysRoleAuthority(SysRoleAuthority sysRoleAuthority);

	/**
	 * 动态更新角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthority 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysRoleAuthority2(SysRoleAuthority sysRoleAuthority);

	/**
	 * 删除角色和权限之间的关系表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthority 被删除的实体对象
	 * @return
	 */
	public void deleteSysRoleAuthority(SysRoleAuthority sysRoleAuthority);

	/**
	 * 查询角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<SysRoleAuthority> querySysRoleAuthority(Map<String, Object> queryParamMap);

	/**
	 * 找寻角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public SysRoleAuthority findSysRoleAuthority2(Map<String, Object> queryParamMap);

	/**
	 * 找寻角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public SysRoleAuthority findSysRoleAuthority3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询角色和权限之间的关系表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysRoleAuthorityCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询角色和权限之间的关系表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<SysRoleAuthority> queryPaginationSysRoleAuthorityList(Map<String, Object> queryParamMap);

	/**
	 * 新建系统权限组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthorityGroup 被保存的实体对象
	 * @return
	 */
	public void saveSysAuthorityGroup(SysAuthorityGroup sysAuthorityGroup);

	/**
	 * 找寻系统权限组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthorityGroupId 要找寻的实体记录的主键值 
	 * @return
	 */
	public SysAuthorityGroup findSysAuthorityGroup(@Param("sysAuthorityGroupId") String sysAuthorityGroupId);

	/**
	 * 更新系统权限组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthorityGroup 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysAuthorityGroup(SysAuthorityGroup sysAuthorityGroup);

	/**
	 * 动态更新系统权限组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthorityGroup 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysAuthorityGroup2(SysAuthorityGroup sysAuthorityGroup);

	/**
	 * 删除系统权限组表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthorityGroup 被删除的实体对象
	 * @return
	 */
	public void deleteSysAuthorityGroup(SysAuthorityGroup sysAuthorityGroup);

	/**
	 * 查询系统权限组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<SysAuthorityGroup> querySysAuthorityGroup(Map<String, Object> queryParamMap);

	/**
	 * 找寻系统权限组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public SysAuthorityGroup findSysAuthorityGroup2(Map<String, Object> queryParamMap);

	/**
	 * 找寻系统权限组表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public SysAuthorityGroup findSysAuthorityGroup3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询系统权限组表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysAuthorityGroupCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询系统权限组表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<SysAuthorityGroup> queryPaginationSysAuthorityGroupList(Map<String, Object> queryParamMap);

	/**
	 * 新建系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthority 被保存的实体对象
	 * @return
	 */
	public void saveSysAuthority(SysAuthority sysAuthority);

	/**
	 * 找寻系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthorityId 要找寻的实体记录的主键值 
	 * @return
	 */
	public SysAuthority findSysAuthority(@Param("sysAuthorityId") String sysAuthorityId);

	/**
	 * 更新系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthority 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysAuthority(SysAuthority sysAuthority);

	/**
	 * 动态更新系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthority 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysAuthority2(SysAuthority sysAuthority);

	/**
	 * 删除系统权限表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysAuthority 被删除的实体对象
	 * @return
	 */
	public void deleteSysAuthority(SysAuthority sysAuthority);

	/**
	 * 查询系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<SysAuthority> querySysAuthority(Map<String, Object> queryParamMap);

	/**
	 * 找寻系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public SysAuthority findSysAuthority2(Map<String, Object> queryParamMap);

	/**
	 * 找寻系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public SysAuthority findSysAuthority3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询系统权限表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysAuthorityCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询系统权限表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<SysAuthority> queryPaginationSysAuthorityList(Map<String, Object> queryParamMap);

	/**
	 * 新建菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOption 被保存的实体对象
	 * @return
	 */
	public void saveSysMenuOption(SysMenuOption sysMenuOption);

	/**
	 * 找寻菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOptionId 要找寻的实体记录的主键值 
	 * @return
	 */
	public SysMenuOption findSysMenuOption(@Param("sysMenuOptionId") String sysMenuOptionId);

	/**
	 * 更新菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOption 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysMenuOption(SysMenuOption sysMenuOption);

	/**
	 * 动态更新菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOption 被编辑更新的实体对象
	 * @return
	 */
	public void updateSysMenuOption2(SysMenuOption sysMenuOption);

	/**
	 * 删除菜单项的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOption 被删除的实体对象
	 * @return
	 */
	public void deleteSysMenuOption(SysMenuOption sysMenuOption);

	/**
	 * 查询菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<SysMenuOption> querySysMenuOption(Map<String, Object> queryParamMap);

	/**
	 * 找寻菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public SysMenuOption findSysMenuOption2(Map<String, Object> queryParamMap);

	/**
	 * 找寻菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public SysMenuOption findSysMenuOption3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询菜单项的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysMenuOptionCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询菜单项的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<SysMenuOption> queryPaginationSysMenuOptionList(Map<String, Object> queryParamMap);

	/**
	 * 新建常量数据字典的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param constantDataDict 被保存的实体对象
	 * @return
	 */
	public void saveConstantDataDict(ConstantDataDict constantDataDict);

	/**
	 * 找寻常量数据字典的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param constantDataDictId 要找寻的实体记录的主键值 
	 * @return
	 */
	public ConstantDataDict findConstantDataDict(@Param("constantDataDictId") String constantDataDictId);

	/**
	 * 更新常量数据字典的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param constantDataDict 被编辑更新的实体对象
	 * @return
	 */
	public void updateConstantDataDict(ConstantDataDict constantDataDict);

	/**
	 * 动态更新常量数据字典的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param constantDataDict 被编辑更新的实体对象
	 * @return
	 */
	public void updateConstantDataDict2(ConstantDataDict constantDataDict);

	/**
	 * 删除常量数据字典的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param constantDataDict 被删除的实体对象
	 * @return
	 */
	public void deleteConstantDataDict(ConstantDataDict constantDataDict);

	/**
	 * 查询常量数据字典的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<ConstantDataDict> queryConstantDataDict(Map<String, Object> queryParamMap);

	/**
	 * 找寻常量数据字典的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public ConstantDataDict findConstantDataDict2(Map<String, Object> queryParamMap);

	/**
	 * 找寻常量数据字典的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public ConstantDataDict findConstantDataDict3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询常量数据字典的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationConstantDataDictCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询常量数据字典的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<ConstantDataDict> queryPaginationConstantDataDictList(Map<String, Object> queryParamMap);

	/**
	 * 新建地址区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param addressRegion 被保存的实体对象
	 * @return
	 */
	public void saveAddressRegion(AddressRegion addressRegion);

	/**
	 * 找寻地址区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param addressRegionId 要找寻的实体记录的主键值 
	 * @return
	 */
	public AddressRegion findAddressRegion(@Param("addressRegionId") String addressRegionId);

	/**
	 * 更新地址区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param addressRegion 被编辑更新的实体对象
	 * @return
	 */
	public void updateAddressRegion(AddressRegion addressRegion);

	/**
	 * 动态更新地址区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param addressRegion 被编辑更新的实体对象
	 * @return
	 */
	public void updateAddressRegion2(AddressRegion addressRegion);

	/**
	 * 删除地址区域的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param addressRegion 被删除的实体对象
	 * @return
	 */
	public void deleteAddressRegion(AddressRegion addressRegion);

	/**
	 * 查询地址区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<AddressRegion> queryAddressRegion(Map<String, Object> queryParamMap);

	/**
	 * 找寻地址区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public AddressRegion findAddressRegion2(Map<String, Object> queryParamMap);

	/**
	 * 找寻地址区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public AddressRegion findAddressRegion3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询地址区域的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationAddressRegionCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询地址区域的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<AddressRegion> queryPaginationAddressRegionList(Map<String, Object> queryParamMap);

	/**
	 * 新建验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param verifyCode 被保存的实体对象
	 * @return
	 */
	public void saveVerifyCode(VerifyCode verifyCode);

	/**
	 * 找寻验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param verifyCodeId 要找寻的实体记录的主键值 
	 * @return
	 */
	public VerifyCode findVerifyCode(@Param("verifyCodeId") String verifyCodeId);

	/**
	 * 更新验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param verifyCode 被编辑更新的实体对象
	 * @return
	 */
	public void updateVerifyCode(VerifyCode verifyCode);

	/**
	 * 动态更新验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param verifyCode 被编辑更新的实体对象
	 * @return
	 */
	public void updateVerifyCode2(VerifyCode verifyCode);

	/**
	 * 删除验证码表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param verifyCode 被删除的实体对象
	 * @return
	 */
	public void deleteVerifyCode(VerifyCode verifyCode);

	/**
	 * 查询验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<VerifyCode> queryVerifyCode(Map<String, Object> queryParamMap);

	/**
	 * 找寻验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public VerifyCode findVerifyCode2(Map<String, Object> queryParamMap);

	/**
	 * 找寻验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public VerifyCode findVerifyCode3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询验证码表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationVerifyCodeCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询验证码表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<VerifyCode> queryPaginationVerifyCodeList(Map<String, Object> queryParamMap);

	/**
	 * 新建员工表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param employee 被保存的实体对象
	 * @return
	 */
	public void saveEmployee(Employee employee);

	/**
	 * 找寻员工表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param employeeId 要找寻的实体记录的主键值 
	 * @return
	 */
	public Employee findEmployee(@Param("employeeId") String employeeId);

	/**
	 * 更新员工表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param employee 被编辑更新的实体对象
	 * @return
	 */
	public void updateEmployee(Employee employee);

	/**
	 * 动态更新员工表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param employee 被编辑更新的实体对象
	 * @return
	 */
	public void updateEmployee2(Employee employee);

	/**
	 * 删除员工表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param employee 被删除的实体对象
	 * @return
	 */
	public void deleteEmployee(Employee employee);

	/**
	 * 查询员工表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<Employee> queryEmployee(Map<String, Object> queryParamMap);

	/**
	 * 找寻员工表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Employee findEmployee2(Map<String, Object> queryParamMap);

	/**
	 * 找寻员工表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public Employee findEmployee3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询员工表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationEmployeeCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询员工表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<Employee> queryPaginationEmployeeList(Map<String, Object> queryParamMap);

	/**
	 * 新建部门表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param department 被保存的实体对象
	 * @return
	 */
	public void saveDepartment(Department department);

	/**
	 * 找寻部门表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param departmentId 要找寻的实体记录的主键值 
	 * @return
	 */
	public Department findDepartment(@Param("departmentId") String departmentId);

	/**
	 * 更新部门表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param department 被编辑更新的实体对象
	 * @return
	 */
	public void updateDepartment(Department department);

	/**
	 * 动态更新部门表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param department 被编辑更新的实体对象
	 * @return
	 */
	public void updateDepartment2(Department department);

	/**
	 * 删除部门表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param department 被删除的实体对象
	 * @return
	 */
	public void deleteDepartment(Department department);

	/**
	 * 查询部门表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<Department> queryDepartment(Map<String, Object> queryParamMap);

	/**
	 * 找寻部门表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Department findDepartment2(Map<String, Object> queryParamMap);

	/**
	 * 找寻部门表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public Department findDepartment3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询部门表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationDepartmentCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询部门表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<Department> queryPaginationDepartmentList(Map<String, Object> queryParamMap);

	/**
	 * 新建数据区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param dataArea 被保存的实体对象
	 * @return
	 */
	public void saveDataArea(DataArea dataArea);

	/**
	 * 找寻数据区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param dataAreaId 要找寻的实体记录的主键值 
	 * @return
	 */
	public DataArea findDataArea(@Param("dataAreaId") String dataAreaId);

	/**
	 * 更新数据区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param dataArea 被编辑更新的实体对象
	 * @return
	 */
	public void updateDataArea(DataArea dataArea);

	/**
	 * 动态更新数据区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param dataArea 被编辑更新的实体对象
	 * @return
	 */
	public void updateDataArea2(DataArea dataArea);

	/**
	 * 删除数据区域的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param dataArea 被删除的实体对象
	 * @return
	 */
	public void deleteDataArea(DataArea dataArea);

	/**
	 * 查询数据区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<DataArea> queryDataArea(Map<String, Object> queryParamMap);

	/**
	 * 找寻数据区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public DataArea findDataArea2(Map<String, Object> queryParamMap);

	/**
	 * 找寻数据区域的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public DataArea findDataArea3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询数据区域的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationDataAreaCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询数据区域的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<DataArea> queryPaginationDataAreaList(Map<String, Object> queryParamMap);

	/**
	 * 新建广告的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advert 被保存的实体对象
	 * @return
	 */
	public void saveAdvert(Advert advert);

	/**
	 * 找寻广告的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advertId 要找寻的实体记录的主键值 
	 * @return
	 */
	public Advert findAdvert(@Param("advertId") String advertId);

	/**
	 * 更新广告的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advert 被编辑更新的实体对象
	 * @return
	 */
	public void updateAdvert(Advert advert);

	/**
	 * 动态更新广告的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advert 被编辑更新的实体对象
	 * @return
	 */
	public void updateAdvert2(Advert advert);

	/**
	 * 删除广告的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advert 被删除的实体对象
	 * @return
	 */
	public void deleteAdvert(Advert advert);

	/**
	 * 查询广告的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<Advert> queryAdvert(Map<String, Object> queryParamMap);

	/**
	 * 找寻广告的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Advert findAdvert2(Map<String, Object> queryParamMap);

	/**
	 * 找寻广告的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public Advert findAdvert3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询广告的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationAdvertCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询广告的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<Advert> queryPaginationAdvertList(Map<String, Object> queryParamMap);

	/**
	 * 新建广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advertAttachment 被保存的实体对象
	 * @return
	 */
	public void saveAdvertAttachment(AdvertAttachment advertAttachment);

	/**
	 * 找寻广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advertAttachmentId 要找寻的实体记录的主键值 
	 * @return
	 */
	public AdvertAttachment findAdvertAttachment(@Param("advertAttachmentId") String advertAttachmentId);

	/**
	 * 更新广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advertAttachment 被编辑更新的实体对象
	 * @return
	 */
	public void updateAdvertAttachment(AdvertAttachment advertAttachment);

	/**
	 * 动态更新广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advertAttachment 被编辑更新的实体对象
	 * @return
	 */
	public void updateAdvertAttachment2(AdvertAttachment advertAttachment);

	/**
	 * 删除广告附件表的实体记录 
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param advertAttachment 被删除的实体对象
	 * @return
	 */
	public void deleteAdvertAttachment(AdvertAttachment advertAttachment);

	/**
	 * 查询广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public List<AdvertAttachment> queryAdvertAttachment(Map<String, Object> queryParamMap);

	/**
	 * 找寻广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public AdvertAttachment findAdvertAttachment2(Map<String, Object> queryParamMap);

	/**
	 * 找寻广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param paramName 参数名称
	 * @param paramValue 匹配的参数值
	 * @return
	 */
	public AdvertAttachment findAdvertAttachment3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询广告附件表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap 查询参数集合
	 * @return
	 */
	public Integer queryPaginationAdvertAttachmentCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询广告附件表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2019-11-18 18:36
	 * 
	 * @author：moshco zhu
	 * @param pageSize 页面尺寸
	 * @return
	 */
	public List<AdvertAttachment> queryPaginationAdvertAttachmentList(Map<String, Object> queryParamMap);

}
