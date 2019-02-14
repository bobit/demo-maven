/*
 Navicat Premium Data Transfer

 Source Server         : mysql_docker_6666
 Source Server Type    : MySQL
 Source Server Version : 50635
 Source Host           : 127.0.0.1:6666
 Source Schema         : test_hrm_db

 Target Server Type    : MySQL
 Target Server Version : 50635
 File Encoding         : 65001

 Date: 14/02/2019 10:41:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_dept_inf
-- ----------------------------
DROP TABLE IF EXISTS `t_dept_inf`;
CREATE TABLE `t_dept_inf`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REMARK` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_dept_inf
-- ----------------------------
INSERT INTO `t_dept_inf` VALUES (1, '技术部', '技术部');
INSERT INTO `t_dept_inf` VALUES (2, '运营部', '运营部');
INSERT INTO `t_dept_inf` VALUES (3, '财务部', '财务部');
INSERT INTO `t_dept_inf` VALUES (5, '总裁办', '总裁办');
INSERT INTO `t_dept_inf` VALUES (6, '市场部', '市场部');
INSERT INTO `t_dept_inf` VALUES (7, '教学部', '教学部');

-- ----------------------------
-- Table structure for t_document_inf
-- ----------------------------
DROP TABLE IF EXISTS `t_document_inf`;
CREATE TABLE `t_document_inf`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `filename` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REMARK` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_DATE` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `USER_ID` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `FK_DOCUMENT_USER`(`USER_ID`) USING BTREE,
  CONSTRAINT `FK_DOCUMENT_USER` FOREIGN KEY (`USER_ID`) REFERENCES `t_user_inf` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_employee_inf
-- ----------------------------
DROP TABLE IF EXISTS `t_employee_inf`;
CREATE TABLE `t_employee_inf`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DEPT_ID` int(11) NOT NULL,
  `JOB_ID` int(11) NOT NULL,
  `NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CARD_ID` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ADDRESS` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `POST_CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `TEL` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PHONE` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `QQ_NUM` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EMAIL` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SEX` int(11) NOT NULL DEFAULT 1,
  `PARTY` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BIRTHDAY` datetime(0) NULL DEFAULT NULL,
  `RACE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EDUCATION` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `SPECIALITY` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `HOBBY` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `REMARK` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_DATE` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `FK_EMP_DEPT`(`DEPT_ID`) USING BTREE,
  INDEX `FK_EMP_JOB`(`JOB_ID`) USING BTREE,
  CONSTRAINT `FK_EMP_DEPT` FOREIGN KEY (`DEPT_ID`) REFERENCES `t_dept_inf` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_EMP_JOB` FOREIGN KEY (`JOB_ID`) REFERENCES `t_job_inf` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_employee_inf
-- ----------------------------
INSERT INTO `t_employee_inf` VALUES (1, 1, 8, '张三', '4328011988', '广州天河', '510000', '020-77777777', '13902001111', '36750066', '251425887@qq.com', 0, '党员', '1980-01-01 00:00:00', '满', '本科', '美声', '唱歌', '四大天王', '2016-03-14 11:35:18');
INSERT INTO `t_employee_inf` VALUES (2, 2, 1, '李四', '22623', '43234', '42427424', '42242', '4247242', '42424', '251425887@qq.com', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2016-03-14 11:35:18');
INSERT INTO `t_employee_inf` VALUES (3, 1, 2, '王五', '432801197711251038', '广州', '510000', '020-99999999', '13907351532', '36750064', '36750064@qq.com', 1, '党员', '1977-11-25 00:00:00', '汉', '本科', '计算机', '爬山', '无', '2016-07-14 09:54:52');

-- ----------------------------
-- Table structure for t_job_inf
-- ----------------------------
DROP TABLE IF EXISTS `t_job_inf`;
CREATE TABLE `t_job_inf`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REMARK` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_job_inf
-- ----------------------------
INSERT INTO `t_job_inf` VALUES (1, '职员', '职员');
INSERT INTO `t_job_inf` VALUES (2, 'Java开发工程师', 'Java开发工程师');
INSERT INTO `t_job_inf` VALUES (3, 'Java中级开发工程师', 'Java中级开发工程师');
INSERT INTO `t_job_inf` VALUES (4, 'Java高级开发工程师', 'Java高级开发工程师');
INSERT INTO `t_job_inf` VALUES (5, '系统管理员', '系统管理员');
INSERT INTO `t_job_inf` VALUES (6, '架构师', '架构师');
INSERT INTO `t_job_inf` VALUES (7, '主管', '主管');
INSERT INTO `t_job_inf` VALUES (8, '经理', '经理');
INSERT INTO `t_job_inf` VALUES (9, '总经理', '总经理');

-- ----------------------------
-- Table structure for t_notice_inf
-- ----------------------------
DROP TABLE IF EXISTS `t_notice_inf`;
CREATE TABLE `t_notice_inf`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CONTENT` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CREATE_DATE` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `USER_ID` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `FK_NOTICE_USER`(`USER_ID`) USING BTREE,
  CONSTRAINT `FK_NOTICE_USER` FOREIGN KEY (`USER_ID`) REFERENCES `t_user_inf` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_user_inf
-- ----------------------------
DROP TABLE IF EXISTS `t_user_inf`;
CREATE TABLE `t_user_inf`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `loginname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `PASSWORD` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `STATUS` int(11) NOT NULL DEFAULT 1,
  `createdate` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user_inf
-- ----------------------------
INSERT INTO `t_user_inf` VALUES (1, 'admin', '123456', 2, '2016-03-12 09:34:28', '超级管理员');

SET FOREIGN_KEY_CHECKS = 1;
