-- MySQL dump 10.11
--
-- ------------------------------------------------------
-- Server version	5.0.89-community-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;




--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user` (
`id` varchar(64) not null COMMENT '记录编号' ,
`user_name` varchar(64) null default null COMMENT '用户帐号' ,
`password` varchar(64) null default null COMMENT '登录密码' ,
`dongles` varchar(64) null default null COMMENT '加密狗' ,
`true_name` varchar(128) null default null COMMENT '真实姓名' ,
`email` varchar(64) null default null COMMENT '邮箱' ,
`mobile` varchar(11) null default null COMMENT '手机' ,
`enable` varchar(8) null default null COMMENT '是否激活（否、是）' ,
`user_type` varchar(32) null default null COMMENT '帐号类型（员工帐号、机构帐号、申办方/CRO帐号、受试者帐号、接口帐号帐号）' ,
`last_set_password_time` datetime null default null COMMENT '用户上次修改密码时间' ,
`prior_login_time` datetime null default null COMMENT '前一次登录时间' ,
`last_login_time` datetime null default null COMMENT '最后一次登录时间' ,
`total_login` int null default null COMMENT '登录次数' ,
`create_time` datetime null default null COMMENT '创建时间' ,
`remark` text null default null COMMENT '备注' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `user_name` (`user_name`),
KEY `true_name` (`true_name`),
KEY `mobile` (`mobile`),
KEY `user_type` (`user_type`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帐号表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `sys_user_user_group`
--

DROP TABLE IF EXISTS `sys_user_user_group`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user_user_group` (
`id` varchar(64) not null COMMENT '记录编号' ,
`user_id` varchar(64) null default null COMMENT '用户Id' ,
`user_group_id` varchar(64) null default null COMMENT '用户组Id' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `user_id` (`user_id`),
KEY `user_group_id` (`user_group_id`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户和用户组之间关系表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_user_group`
--

LOCK TABLES `sys_user_user_group` WRITE;
/*!40000 ALTER TABLE `sys_user_user_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_user_user_group` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `sys_user_group`
--

DROP TABLE IF EXISTS `sys_user_group`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user_group` (
`id` varchar(64) not null COMMENT '记录编号' ,
`title` varchar(64) null default null COMMENT '用户组名称' ,
`corporation_id` varchar(64) null default null COMMENT '公司Id' ,
`corporation` varchar(128) null default null COMMENT '公司名称' ,
`remark` text null default null COMMENT '备注' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `corporation_id` (`corporation_id`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户组表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_group`
--

LOCK TABLES `sys_user_group` WRITE;
/*!40000 ALTER TABLE `sys_user_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_user_group` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `sys_user_group_role`
--

DROP TABLE IF EXISTS `sys_user_group_role`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user_group_role` (
`id` varchar(64) not null COMMENT '记录编号' ,
`user_group_id` varchar(64) null default null COMMENT '用户组Id' ,
`role_id` varchar(64) null default null COMMENT '角色Id' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `user_group_id` (`user_group_id`),
KEY `role_id` (`role_id`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户组和角色之间的关系表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_group_role`
--

LOCK TABLES `sys_user_group_role` WRITE;
/*!40000 ALTER TABLE `sys_user_group_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_user_group_role` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `sys_role`
--

DROP TABLE IF EXISTS `sys_role`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role` (
`id` varchar(64) not null COMMENT '记录Id' ,
`sign_code` varchar(64) null default null COMMENT '角色分组（按岗位分类）' ,
`title` varchar(64) null default null COMMENT '角色名称' ,
`remark` text null default null COMMENT '备注' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role`
--

LOCK TABLES `sys_role` WRITE;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `sys_role_authority`
--

DROP TABLE IF EXISTS `sys_role_authority`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role_authority` (
`id` varchar(64) not null COMMENT '记录编号' ,
`role_id` varchar(64) null default null COMMENT '角色Id' ,
`authority_id` varchar(64) null default null COMMENT '权限Id' ,
`authority_code` varchar(128) null default null COMMENT '权限编码' ,
`authority_group_id` varchar(64) null default null COMMENT '权限组Id' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `role_id` (`role_id`),
KEY `authority_id` (`authority_id`),
KEY `authority_code` (`authority_code`),
KEY `authority_group_id` (`authority_group_id`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色和权限之间的关系表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role_authority`
--

LOCK TABLES `sys_role_authority` WRITE;
/*!40000 ALTER TABLE `sys_role_authority` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_role_authority` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `sys_authority_group`
--

DROP TABLE IF EXISTS `sys_authority_group`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_authority_group` (
`id` varchar(64) not null COMMENT '记录编号' ,
`supper_id` varchar(64) null default null COMMENT '上级组Id' ,
`supper_title` varchar(512) null default null COMMENT '上级组' ,
`title` varchar(512) null default null COMMENT '权限组标题' ,
`remark` text null default null COMMENT '备注' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `supper_id` (`supper_id`),
KEY `title` (`title`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统权限组表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_authority_group`
--

LOCK TABLES `sys_authority_group` WRITE;
/*!40000 ALTER TABLE `sys_authority_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_authority_group` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `sys_authority`
--

DROP TABLE IF EXISTS `sys_authority`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_authority` (
`id` varchar(64) not null COMMENT '记录编号' ,
`title` varchar(512) null default null COMMENT '权限标题' ,
`code` varchar(128) null default null COMMENT '权限编码' ,
`authority_group_id` varchar(64) null default null COMMENT '权限组Id' ,
`authority_group` varchar(512) null default null COMMENT '权限组' ,
`entry_url` varchar(512) null default null COMMENT '入口功能链接' ,
`remark` text null default null COMMENT '备注' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `code` (`code`),
KEY `authority_group_id` (`authority_group_id`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统权限表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_authority`
--

LOCK TABLES `sys_authority` WRITE;
/*!40000 ALTER TABLE `sys_authority` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_authority` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `sys_menu_option`
--

DROP TABLE IF EXISTS `sys_menu_option`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_menu_option` (
`id` varchar(64) not null COMMENT '记录编号' ,
`code` varchar(128) null default null COMMENT '菜单编码' ,
`inner_code` varchar(8) null default null COMMENT '目录内编码' ,
`icon` varchar(512) null default null COMMENT '菜单图标' ,
`title` varchar(64) null default null COMMENT '菜单项名称' ,
`super_id` varchar(64) null default null COMMENT '上级菜单项' ,
`super_title` varchar(64) null default null COMMENT '上级菜单项名称' ,
`depth` int null default null COMMENT '菜单深度' ,
`url` varchar(512) null default null COMMENT '功能链接' ,
`is_band_authority` varchar(8) null default null COMMENT '是否绑定权限（是、否）' ,
`authority_id` varchar(64) null default null COMMENT '权限Id' ,
`authority_code` varchar(128) null default null COMMENT '权限编码' ,
`authority` varchar(512) null default null COMMENT '权限标题' ,
`remark` text null default null COMMENT '备注' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `code` (`code`),
KEY `super_id` (`super_id`),
KEY `depth` (`depth`),
KEY `authority_id` (`authority_id`),
KEY `authority_code` (`authority_code`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单项';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_menu_option`
--

LOCK TABLES `sys_menu_option` WRITE;
/*!40000 ALTER TABLE `sys_menu_option` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_menu_option` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `constant_data_dict`
--

DROP TABLE IF EXISTS `constant_data_dict`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `constant_data_dict` (
`id` varchar(64) not null COMMENT '记录编号' ,
`item` varchar(64) null default null COMMENT '数据分类' ,
`title` varchar(512) null default null COMMENT '标题' ,
`value` varchar(512) null default null COMMENT '值' ,
`extend_value` varchar(512) null default null COMMENT '扩展值' ,
`order_index` int null default null COMMENT '排序' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `item` (`item`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='常量数据字典';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `constant_data_dict`
--

LOCK TABLES `constant_data_dict` WRITE;
/*!40000 ALTER TABLE `constant_data_dict` DISABLE KEYS */;
/*!40000 ALTER TABLE `constant_data_dict` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `address_region`
--

DROP TABLE IF EXISTS `address_region`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address_region` (
`id` varchar(64) not null COMMENT '记录编号' ,
`parent_region` varchar(512) null default null COMMENT '上级区域名称' ,
`region_name` varchar(512) null default null COMMENT '区域名称' ,
`post_code` varchar(16) null default null COMMENT '邮编' ,
`level` varchar(32) null default null COMMENT '行政级别（省份、直辖市、省会城市、地级市、县、县级市、镇、乡）' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `parent_region` (`parent_region`),
KEY `region_name` (`region_name`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='地址区域';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address_region`
--

LOCK TABLES `address_region` WRITE;
/*!40000 ALTER TABLE `address_region` DISABLE KEYS */;
/*!40000 ALTER TABLE `address_region` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `verify_code`
--

DROP TABLE IF EXISTS `verify_code`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `verify_code` (
`id` varchar(64) not null COMMENT '记录编号' ,
`code` varchar(64) null default null COMMENT '验证码' ,
`sort` varchar(64) null default null COMMENT '验证码类型（掩码、手机验证码、邮箱验证码）' ,
`email` varchar(128) null default null COMMENT '邮箱' ,
`mobile` varchar(32) null default null COMMENT '手机号' ,
`client_id` varchar(64) null default null COMMENT '客户端Id' ,
`session_id` varchar(64) null default null COMMENT 'sessionId' ,
`user_id` varchar(64) null default null COMMENT '帐号表Id' ,
`true_name` varchar(128) null default null COMMENT '真实姓名' ,
`action_place` varchar(128) null default null COMMENT '验证码功能（员工登录、机构登录、申办方/CRO登录、受试者登录、受试者注册、验证手机、验证邮箱）' ,
`begin_time` datetime null default null COMMENT '开始时间' ,
`end_time` datetime null default null COMMENT '结束时间' ,
`validate_length` int null default null COMMENT '有效时长（分钟）' ,
`is_verify` varchar(8) null default null COMMENT '是否验证（否、是）' ,
`verify_time` datetime null default null COMMENT '验证时间' ,
`create_time` datetime null default null COMMENT '创建时间' ,
`remark` text null default null COMMENT '备注' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `code` (`code`),
KEY `sort` (`sort`),
KEY `email` (`email`),
KEY `mobile` (`mobile`),
KEY `user_id` (`user_id`),
KEY `action_place` (`action_place`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='验证码表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `verify_code`
--

LOCK TABLES `verify_code` WRITE;
/*!40000 ALTER TABLE `verify_code` DISABLE KEYS */;
/*!40000 ALTER TABLE `verify_code` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
`id` varchar(64) not null COMMENT '记录编号' ,
`user_id` varchar(64) null default null COMMENT '帐号Id' ,
`user_name` varchar(64) null default null COMMENT '登录帐号' ,
`true_name` varchar(64) null default null COMMENT '真实姓名' ,
`birthday` varchar(16) null default null COMMENT '生日' ,
`sex` varchar(16) null default null COMMENT '性别' ,
`post` varchar(128) null default null COMMENT '岗位' ,
`is_manage_post` varchar(8) null default null COMMENT '是否管理岗位（否、是）' ,
`department_id` varchar(64) null default null COMMENT '部门编号' ,
`department` varchar(128) null default null COMMENT '部门' ,
`email` varchar(128) null default null COMMENT '邮箱' ,
`mobile` varchar(128) null default null COMMENT '手机' ,
`address` varchar(512) null default null COMMENT '住址' ,
`head_photo` varchar(512) null default null COMMENT '头像' ,
`status` varchar(64) null default null COMMENT '员工状态（正式员工、试用期员工）' ,
`entry_time` datetime null default null COMMENT '入职时间' ,
`education` varchar(128) null default null COMMENT '学历' ,
`id_card` varchar(128) null default null COMMENT '身份证号' ,
`origin` varchar(512) null default null COMMENT '籍贯' ,
`creator_user_id` varchar(64) null default null COMMENT '创建人帐号Id' ,
`creator_user_name` varchar(64) null default null COMMENT '创建人登录帐号' ,
`creator_employee_id` varchar(64) null default null COMMENT '创建人员工Id' ,
`creator` varchar(64) null default null COMMENT '创建人' ,
`create_time` datetime null default null COMMENT '创建时间' ,
`remark` text null default null COMMENT '备注' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `creator_user_id` (`creator_user_id`),
KEY `creator_user_name` (`creator_user_name`),
KEY `creator_employee_id` (`creator_employee_id`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
`id` varchar(64) not null COMMENT '记录编号' ,
`sponsor_id` varchar(64) null default null COMMENT '申办方Id（中兴正远该值为空）' ,
`sponsor_title_all` varchar(512) null default null COMMENT '申办方全称' ,
`title` varchar(512) null default null COMMENT '部门名称' ,
`super_title` varchar(512) null default null COMMENT '上级部门' ,
`remark` text null default null COMMENT '备注' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `sponsor_id` (`sponsor_id`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `data_area`
--

DROP TABLE IF EXISTS `data_area`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_area` (
`id` varchar(64) not null COMMENT '记录编号' ,
`area_code` varchar(64) null default null COMMENT '区域编码' ,
`area` varchar(512) null default null COMMENT '区域名称' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `area_code` (`area_code`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据区域';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_area`
--

LOCK TABLES `data_area` WRITE;
/*!40000 ALTER TABLE `data_area` DISABLE KEYS */;
/*!40000 ALTER TABLE `data_area` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `advert`
--

DROP TABLE IF EXISTS `advert`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advert` (
`id` varchar(64) not null COMMENT '记录编号' ,
`code` varchar(64) null default null COMMENT '广告编码' ,
`position` varchar(128) null default null COMMENT '广告位置 来至字典（如：主页左侧、页头、页脚）' ,
`title` varchar(128) null default null COMMENT '标题' ,
`content_file` text null default null COMMENT '内容文件' ,
`start_time` datetime null default null COMMENT '生效时间' ,
`expire_time` datetime null default null COMMENT '过期时间' ,
`status` varchar(32) null default null COMMENT '状态（编辑、已经发布）' ,
`preview_url` text null default null COMMENT '预览的url 可以带参数' ,
`publisher_user_id` varchar(64) null default null COMMENT '发布人帐号Id' ,
`publisher_user_name` varchar(64) null default null COMMENT '发布人登录帐号' ,
`publisher_employee_id` varchar(64) null default null COMMENT '发布人员工Id' ,
`publisher` varchar(64) null default null COMMENT '发布人' ,
`publish_time` datetime null default null COMMENT '发布时间' ,
`editor_user_id` varchar(64) null default null COMMENT '编辑人帐号Id' ,
`editor_user_name` varchar(64) null default null COMMENT '编辑人登录帐号' ,
`editor_employee_id` varchar(64) null default null COMMENT '编辑人员工Id' ,
`editor` varchar(64) null default null COMMENT '编辑人' ,
`edit_time` datetime null default null COMMENT '编辑时间' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `code` (`code`),
KEY `publisher_user_id` (`publisher_user_id`),
KEY `publisher_user_name` (`publisher_user_name`),
KEY `publisher_employee_id` (`publisher_employee_id`),
KEY `editor_user_id` (`editor_user_id`),
KEY `editor_user_name` (`editor_user_name`),
KEY `editor_employee_id` (`editor_employee_id`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='广告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advert`
--

LOCK TABLES `advert` WRITE;
/*!40000 ALTER TABLE `advert` DISABLE KEYS */;
/*!40000 ALTER TABLE `advert` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `advert_attachment`
--

DROP TABLE IF EXISTS `advert_attachment`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advert_attachment` (
`id` varchar(64) not null COMMENT '记录编号' ,
`advert_id` varchar(64) null default null COMMENT '广告编号' ,
`code` varchar(64) null default null COMMENT '广告编码' ,
`title` varchar(64) null default null COMMENT '标题' ,
`content_type` varchar(64) null default null COMMENT '内容类型（图片、swf视频、视频、其它）' ,
`content_file` text null default null COMMENT '附件文件' ,
`is_valid` int null default 1 COMMENT '是否有效记录（0-无效 1-有效）' ,
`invalid_date` datetime null default null COMMENT '删除时间' ,
PRIMARY KEY  (`id`),
KEY `code` (`code`),
KEY `is_valid` (`is_valid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='广告附件表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advert_attachment`
--

LOCK TABLES `advert_attachment` WRITE;
/*!40000 ALTER TABLE `advert_attachment` DISABLE KEYS */;
/*!40000 ALTER TABLE `advert_attachment` ENABLE KEYS */;
UNLOCK TABLES;

