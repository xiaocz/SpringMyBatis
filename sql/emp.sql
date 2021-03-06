﻿# Host: localhost  (Version: 5.5.20)
# Date: 2016-02-28 23:59:09
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "emp"
#

DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(11) NOT NULL,
  `ename` varchar(20) DEFAULT NULL,
  `job` varchar(10) DEFAULT NULL,
  `mgr` int(11) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `sal` double DEFAULT NULL,
  `comm` double DEFAULT NULL,
  `deptno` int(11) DEFAULT NULL,
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "emp"
#

INSERT INTO `emp` VALUES (1,'SMITH','CLERK',3,'1980-05-12',800,NULL,2),(2,'ALLEN','SALESMAN',3,'1981-06-03',1600,300,3),(3,'WARD','SALESMAN',4,'1990-03-15',1250,500,3),(4,'JONES','MANAGER',5,'1985-04-08',2975,NULL,2),(5,'MARTIN','SALESMAN',7,'1986-03-08',1250,1400,3),(6,'BLAKE','MANAGER',9,'1989-06-01',2850,NULL,3),(7,'CLARK','MANAGER',9,'1995-10-01',2450,NULL,1),(8,'SCOTT','ANALYST',9,'1993-05-01',3000,NULL,2),(9,'KING','PRESIDENT',NULL,'1988-08-08',5000,NULL,1),(10,'TURNER','SALESMAN',5,'1983-02-01',1500,0,3),(11,'ADAMS','CLERK',5,'1992-07-03',1100,NULL,2),(12,'JAMES','CLERK',1,'1996-09-10',950,NULL,3),(13,'FORD','ANALYST',1,'1993-01-01',3000,NULL,2),(14,'MILLER','CLERK',3,'1983-10-09',1300,NULL,1);
