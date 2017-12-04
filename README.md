据说，有小伙伴说我没写建表语句。在此处补上。可见mysql_db.sql文件。
</br>
</br>
</br>
/*
 Navicat Premium Data Transfer

 Source Server         : samb_db
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost
 Source Database       : mysql_db

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : utf-8

 Date: 12/04/2017 19:08:20 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `bookdetail`
-- ----------------------------
DROP TABLE IF EXISTS `bookdetail`;
CREATE TABLE `bookdetail` (
  `idbookdetail` int(11) NOT NULL,
  `bookcontent` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `idreal` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idreal`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `bookdetail`
-- ----------------------------
BEGIN;
INSERT INTO `bookdetail` VALUES ('1', '韦小宝和七个老婆的故事', '1'), ('2', '我也不知道连城诀讲的是什么', '2'), ('1', '七个老婆的韦小宝大概是在数流氓', '3');
COMMIT;

-- ----------------------------
--  Table structure for `booklist`
-- ----------------------------
DROP TABLE IF EXISTS `booklist`;
CREATE TABLE `booklist` (
  `idbook` int(11) NOT NULL,
  `bookname` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `bookwriter` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idbook`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `booklist`
-- ----------------------------
BEGIN;
INSERT INTO `booklist` VALUES ('1', '鹿鼎记', '金庸'), ('2', '天龙八部', '金庸');
COMMIT;

-- ----------------------------
--  Table structure for `stuclass`
-- ----------------------------
DROP TABLE IF EXISTS `stuclass`;
CREATE TABLE `stuclass` (
  `idstuclass` int(11) NOT NULL,
  `stuclassname` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `stuclassdetail` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `idstudent` int(11) DEFAULT NULL,
  PRIMARY KEY (`idstuclass`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `stuclass`
-- ----------------------------
BEGIN;
INSERT INTO `stuclass` VALUES ('1', '语文', '鲁迅散文集', '1'), ('2', '数学', '加法口诀', '1'), ('3', '语文', '鲁迅散文集', '2');
COMMIT;

-- ----------------------------
--  Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `idstudent` int(11) NOT NULL,
  `studentname` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idstudent`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `student`
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES ('1', 'bobo'), ('2', '小丽'), ('3', 'boboddd'), ('4', 'dodo');
COMMIT;

-- ----------------------------
--  Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`password`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `userinfo`
-- ----------------------------
BEGIN;
INSERT INTO `userinfo` VALUES ('1', 'bobo', '111111'), ('7', 'xiaoming', '222222'), ('8', 'xiaoming', '222222');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
