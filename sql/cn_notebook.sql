# Host: localhost  (Version: 5.5.20)
# Date: 2016-02-28 23:58:51
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "cn_notebook"
#

DROP TABLE IF EXISTS `cn_notebook`;
CREATE TABLE `cn_notebook` (
  `cn_notebook_id` varchar(100) NOT NULL COMMENT '笔记本ID',
  `cn_user_id` varchar(100) DEFAULT NULL COMMENT '用户ID',
  `cn_notebook_type_id` varchar(100) DEFAULT NULL COMMENT '笔记本类型ID',
  `cn_notebook_name` varchar(500) DEFAULT NULL COMMENT '笔记本名',
  `cn_notebook_desc` text COMMENT '笔记本说明',
  `cn_notebook_createtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`cn_notebook_id`),
  KEY `FK_Note_User_Reference` (`cn_user_id`),
  KEY `FK_Reference_6` (`cn_notebook_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "cn_notebook"
#

INSERT INTO `cn_notebook` VALUES ('0c0b77bf-7438-4d9a-a77a-50be0d20002f','2d389891-f03f-4680-a36c-86d400d21366','4','推送',NULL,'2015-02-27 11:03:22'),('5dc081fa-0813-430f-a2a2-24037e482511','2d389891-f03f-4680-a36c-86d400d21366','1','收藏',NULL,'2015-02-27 11:03:22'),('617f2466-f756-49d0-9996-a8aee38b60cc','2d389891-f03f-4680-a36c-86d400d21366','3','活动',NULL,'2015-02-27 11:03:22'),('65e6a119-ef8e-4904-8b94-3cd6991b680f','2d389891-f03f-4680-a36c-86d400d21366','5','云笔记项目开发','','2015-02-27 11:13:40'),('9b988ee1-f984-4e3e-b968-758336c509b3','2d389891-f03f-4680-a36c-86d400d21366','2','回收站',NULL,'2015-02-27 11:03:22'),('ddd6dc31-9982-4989-a449-027dafcedb6c','2d389891-f03f-4680-a36c-86d400d21366','5','Oracle',NULL,'2015-02-27 11:03:46'),('e4753522-d5c4-427b-a3ec-27f83a7ff9ba','2d389891-f03f-4680-a36c-86d400d21366','5','安静的逗比',NULL,'2015-02-27 11:05:58');
