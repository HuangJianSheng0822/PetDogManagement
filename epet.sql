/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : epet

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2022-07-12 17:13:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cust
-- ----------------------------
DROP TABLE IF EXISTS `cust`;
CREATE TABLE `cust` (
  `id` varchar(255) NOT NULL,
  `dogId` varchar(255) NOT NULL,
  `custName` varchar(255) NOT NULL,
  `custNum` varchar(255) NOT NULL,
  `custAddress` varchar(255) NOT NULL,
  `custPrice` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cust
-- ----------------------------
INSERT INTO `cust` VALUES ('16e602bced07402086a8551462db3220', '22222', '22222', '222222', '22222', '22222');

-- ----------------------------
-- Table structure for dog
-- ----------------------------
DROP TABLE IF EXISTS `dog`;
CREATE TABLE `dog` (
  `dogId` varchar(255) NOT NULL,
  `dogName` varchar(255) NOT NULL,
  `dogAge` varchar(255) NOT NULL,
  `dogSex` varchar(255) NOT NULL,
  `dogDescription` varchar(255) NOT NULL,
  `dogPrice` double(10,0) NOT NULL,
  `nowHas` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`dogId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dog
-- ----------------------------
INSERT INTO `dog` VALUES ('44444', '888899', '99', '雄', '99', '99', '-1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `adminId` varchar(255) NOT NULL,
  `adminPwd` varchar(255) NOT NULL,
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', 'admin');
