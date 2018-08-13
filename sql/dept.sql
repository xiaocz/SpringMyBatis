# Host: localhost  (Version: 5.5.20)
# Date: 2016-02-28 23:59:01
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "dept"
#

DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL,
  `dname` varchar(32) NOT NULL,
  `location` varchar(32) DEFAULT NULL,
  `createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator` varchar(32) DEFAULT NULL,
  `status` char(2) DEFAULT NULL,
  `comments` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "dept"
#

INSERT INTO `dept` VALUES (10,'销售部','北京','2015-08-29 01:38:06','Eric','01','销售部'),(20,'采购部','北京','2015-08-29 01:38:07','Amiy','01','采购部'),(30,'java开发部','上海','2015-08-29 01:38:07','Jack','01','采购部');
