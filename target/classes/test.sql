# Host: 127.0.0.1  (Version: 5.6.20)
# Date: 2017-05-08 23:04:57
# Generator: MySQL-Front 5.3  (Build 4.13)

/*!40101 SET NAMES utf8 */;

#
# Source for table "student"
#

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

#
# Data for table "student"
#

INSERT INTO `student` VALUES (4,3,'kobe','22323','北京'),(5,3,'lowly','34434','北京'),(6,4,'terry','23444','上海');
