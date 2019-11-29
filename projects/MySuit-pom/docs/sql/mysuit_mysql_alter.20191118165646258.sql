
-- ----------------------------
-- ----- 修改数据库表的SQL
-- ----- 开发人员 moshco zhu
-- ----- 日期：2019-11-18 16:56:37 448
-- ----------------------------




-- ----------------------------
-- ----- sys_user
-- ----------------------------


-- ----- sys_user.user_name_1234
alter table sys_user add user_name_1234 varchar(64) null default null COMMENT '用户帐号' after user_name;


-- ----- sys_user.user_name_123
alter table sys_user drop user_name_123;




-- ----------------------------
-- ----- sys_user_user_group
-- ----------------------------




-- ----------------------------
-- ----- sys_user_group
-- ----------------------------




-- ----------------------------
-- ----- sys_user_group_role
-- ----------------------------




-- ----------------------------
-- ----- sys_role
-- ----------------------------




-- ----------------------------
-- ----- sys_role_authority
-- ----------------------------




-- ----------------------------
-- ----- sys_authority_group
-- ----------------------------




-- ----------------------------
-- ----- sys_authority
-- ----------------------------




-- ----------------------------
-- ----- sys_menu_option
-- ----------------------------




-- ----------------------------
-- ----- constant_data_dict
-- ----------------------------




-- ----------------------------
-- ----- address_region
-- ----------------------------




-- ----------------------------
-- ----- verify_code
-- ----------------------------




-- ----------------------------
-- ----- employee
-- ----------------------------




-- ----------------------------
-- ----- department
-- ----------------------------




-- ----------------------------
-- ----- data_area
-- ----------------------------




-- ----------------------------
-- ----- advert
-- ----------------------------




-- ----------------------------
-- ----- advert_attachment
-- ----------------------------