/*
Navicat MariaDB Data Transfer

Source Server         : shoppay
Source Server Version : 50556
Source Host           : 127.0.0.1:2226
Source Database       : sampledb

Target Server Type    : MariaDB
Target Server Version : 50556
File Encoding         : 65001

Date: 2017-11-28 21:15:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_login_log
-- ----------------------------
DROP TABLE IF EXISTS `t_login_log`;
CREATE TABLE `t_login_log` (
  `login_log_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `ip` varchar(23) DEFAULT NULL,
  `login_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`login_log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_login_log
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) DEFAULT NULL,
  `credits` int(11) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `last_visit` datetime DEFAULT NULL,
  `last_ip` varchar(23) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', null, '123456', null, null);
