/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50641
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50641
 File Encoding         : 65001

 Date: 26/10/2018 17:00:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ai
-- ----------------------------
DROP TABLE IF EXISTS `ai`;
CREATE TABLE `ai`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Table structure for bootplus_system_menu
-- ----------------------------
DROP TABLE IF EXISTS `bootplus_system_menu`;
CREATE TABLE `bootplus_system_menu`  (
  `menuId` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `menuName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `url` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `icon` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `req1` int(11) NULL DEFAULT NULL,
  `req2` int(11) NULL DEFAULT NULL,
  `del_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mod_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`menuId`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bootplus_system_user
-- ----------------------------
DROP TABLE IF EXISTS `bootplus_system_user`;
CREATE TABLE `bootplus_system_user`  (
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userAge` int(11) NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `phoneNum` int(11) NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bootplus_system_user
-- ----------------------------
INSERT INTO `bootplus_system_user` VALUES ('03409388-efe3-4fa6-829e-fcb3c720f059', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('0a81a0a4-dc6b-421e-934d-6c2ad1e6c212', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('1', 'jln', 12, '2018-10-25', 1335567788, '11111', '111111111111111');
INSERT INTO `bootplus_system_user` VALUES ('14e926e6-306b-451f-922b-cb7d6517ee76', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('1b4383ec-277b-409b-b11b-1958587d550c', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('1cb5c245-4e82-41f6-98d5-861e17c80a8d', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('2', 'user', 23, '2018-09-26', 123456666, '2222', '22222');
INSERT INTO `bootplus_system_user` VALUES ('3', 'test', 16, '2018-09-28', 110, '33333', '3333333');
INSERT INTO `bootplus_system_user` VALUES ('37f93bfa-1f23-4e53-8ce6-f48539ef308f', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('4cc66955-7416-4c57-b7f6-440e95434e92', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('52a0826c-779d-4fef-a525-de22dc402f8b', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('553758e2-a5fe-4efe-a46c-65e90d5c9a00', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('5a6d807a-19e0-4ffa-bc0c-02dd29c36826', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('6c084d7d-f92c-4083-be6a-67cc41e06126', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('72b12128-8940-4fdb-9975-1efbadd0b585', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('7c581cc8-d693-4fa1-931e-4c0f6c986849', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('93e1fa16-25b6-4761-b1e8-3ef40dedb46c', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('a7a5c277-404c-4e1a-8ba3-ac7816259faa', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('c71bd38d-96b0-447b-a9e7-11fcc2b7165b', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('c83c7f6a-69d2-4b71-bd5f-6c69690070f1', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('d84362e8-8356-4c8e-8ef4-85a948bb443d', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('e82f79ae-e4a3-417f-9166-337116ac599b', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('f823d32f-f42c-462e-a0ff-22e423305b5c', 'test', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `bootplus_system_user` VALUES ('fb9e3b86-473f-4e6f-abfd-c4ce2b282485', 'test', NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` int(2) NULL DEFAULT NULL,
  `deptname` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, 'tech');
INSERT INTO `dept` VALUES (2, 'sale');
INSERT INTO `dept` VALUES (3, 'hr');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `age` int(3) NULL DEFAULT NULL,
  `deptno` int(2) NULL DEFAULT 0,
  `ename` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birth` date NULL DEFAULT NULL,
  `hiredate` date NULL DEFAULT NULL,
  `sal` decimal(10, 2) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (NULL, 1, 'zzx1', NULL, '2000-01-01', 2000.00);
INSERT INTO `emp` VALUES (NULL, 1, 'zzx2', NULL, '2000-01-01', 100.00);
INSERT INTO `emp` VALUES (NULL, 2, 'lisa', NULL, '2003-02-01', 200.00);
INSERT INTO `emp` VALUES (NULL, 1, 'bjguan', NULL, '2004-04-02', 100.00);
INSERT INTO `emp` VALUES (NULL, 4, 'dony', NULL, '2005-02-05', 2000.00);

-- ----------------------------
-- Table structure for t1
-- ----------------------------
DROP TABLE IF EXISTS `t1`;
CREATE TABLE `t1`  (
  `id1` int(10) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `id2` int(5) UNSIGNED ZEROFILL NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t1
-- ----------------------------
INSERT INTO `t1` VALUES (0000000001, 00001);

-- ----------------------------
-- Table structure for t2
-- ----------------------------
DROP TABLE IF EXISTS `t2`;
CREATE TABLE `t2`  (
  `id1` float(5, 2) NULL DEFAULT NULL,
  `id2` double(5, 2) NULL DEFAULT NULL,
  `id3` decimal(5, 2) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t2
-- ----------------------------
INSERT INTO `t2` VALUES (1.23, 1.23, 1.23);
INSERT INTO `t2` VALUES (1.23, 1.23, 1.23);

SET FOREIGN_KEY_CHECKS = 1;
