/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50616
Source Host           : localhost:3306
Source Database       : qa

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2014-07-20 17:25:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cooperator
-- ----------------------------
DROP TABLE IF EXISTS `cooperator`;
CREATE TABLE `cooperator` (
  `ID` varchar(10) NOT NULL COMMENT '外协厂家ID',
  `NAME` varchar(60) DEFAULT NULL COMMENT '外协厂家名字',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cooperator
-- ----------------------------
INSERT INTO `cooperator` VALUES ('A0001', '晨艺');
INSERT INTO `cooperator` VALUES ('A0002', '高敦');
INSERT INTO `cooperator` VALUES ('A0003', '联化');
INSERT INTO `cooperator` VALUES ('A0004', '无锡');

-- ----------------------------
-- Table structure for defect
-- ----------------------------
DROP TABLE IF EXISTS `defect`;
CREATE TABLE `defect` (
  `DEFECT_ID` varchar(10) NOT NULL,
  `NAME` varchar(40) DEFAULT NULL,
  `CATEGORY_ID` varchar(10) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`DEFECT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of defect
-- ----------------------------
INSERT INTO `defect` VALUES ('00001', 'asdgq', '00001', '241rs');

-- ----------------------------
-- Table structure for defect_category
-- ----------------------------
DROP TABLE IF EXISTS `defect_category`;
CREATE TABLE `defect_category` (
  `CATEGORY_ID` varchar(10) NOT NULL,
  `NAME` varchar(40) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`CATEGORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of defect_category
-- ----------------------------
INSERT INTO `defect_category` VALUES ('00001', '表面处理', 'asa');
INSERT INTO `defect_category` VALUES ('00002', '刻字', 'asfag');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `ID` varchar(20) NOT NULL COMMENT '员工工号',
  `NAME` varchar(30) DEFAULT NULL COMMENT '员工姓名',
  `ROLE_ID` varchar(10) DEFAULT NULL COMMENT '员工角色',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('0001', 'asfq', '1');

-- ----------------------------
-- Table structure for measure
-- ----------------------------
DROP TABLE IF EXISTS `measure`;
CREATE TABLE `measure` (
  `MEASURE_ID` varchar(20) NOT NULL,
  `DEFECT_ID` varchar(10) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`MEASURE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of measure
-- ----------------------------
INSERT INTO `measure` VALUES ('00001', '00001', 'qetdg');
INSERT INTO `measure` VALUES ('00002', '00001', '3t1qe3');
INSERT INTO `measure` VALUES ('00003', '00001', 'sdfbs');

-- ----------------------------
-- Table structure for rework
-- ----------------------------
DROP TABLE IF EXISTS `rework`;
CREATE TABLE `rework` (
  `ORDER_ID` varchar(20) NOT NULL COMMENT '返工单号',
  `PO_NO` varchar(40) DEFAULT NULL COMMENT '订单号',
  `PART_NO` varchar(40) DEFAULT NULL COMMENT '零件图号',
  `PART_REV` varchar(5) DEFAULT NULL COMMENT '零件版本号',
  `QUANTITY` int(10) DEFAULT NULL COMMENT '数量',
  `PIC_ID` varchar(20) DEFAULT NULL COMMENT '负责人工号',
  `DESCRIPTION` varchar(200) DEFAULT NULL COMMENT '原因描述',
  `MEASURE` varchar(200) DEFAULT NULL COMMENT '处理措施',
  `TYPE` varchar(5) DEFAULT NULL COMMENT '内部或者外部造成的',
  `COOPERATOR_ID` varchar(10) DEFAULT NULL COMMENT '外协厂家id',
  `CR_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATOR_ID` varchar(20) DEFAULT NULL COMMENT '创建者工号',
  `STATUS` varchar(5) DEFAULT NULL COMMENT '返工状态',
  `REWORK_DONE_NUMBER` int(5) DEFAULT NULL COMMENT '返工成功件数',
  `REWORK_FAILED_NUMBER` int(5) DEFAULT NULL COMMENT '返工失败件数',
  `REFRESH_TIME` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rework
-- ----------------------------
INSERT INTO `rework` VALUES ('0001', 'wqetq', 'weqt', 'wet', '12', 'egqwr', '23', '1234fg', '241a', '13r', '2014-07-31 16:17:28', '124', '123r', '1', '124', '2014-07-15 16:17:22');

-- ----------------------------
-- Table structure for rework_log
-- ----------------------------
DROP TABLE IF EXISTS `rework_log`;
CREATE TABLE `rework_log` (
  `LOGO_ID` varchar(30) NOT NULL COMMENT '日志唯一标识号',
  `ORDER_ID` varchar(20) NOT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `CREATOR_ID` varchar(20) DEFAULT NULL,
  `CR_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`LOGO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rework_log
-- ----------------------------
INSERT INTO `rework_log` VALUES ('00001', '0001', 'q3wedg', '124', '2014-07-29 16:17:42');
INSERT INTO `rework_log` VALUES ('00002', '0001', 'qteag', '124', '2014-07-30 16:19:21');
INSERT INTO `rework_log` VALUES ('00003', '0001', '3tqeg', '1241', '2014-07-17 16:19:37');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `ID` varchar(10) NOT NULL COMMENT '角色ID',
  `NAME` varchar(30) DEFAULT NULL COMMENT '角色名字',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '检验员');
INSERT INTO `role` VALUES ('2', '检验组长');
INSERT INTO `role` VALUES ('3', '质量工程师');
INSERT INTO `role` VALUES ('4', '车间主任');
INSERT INTO `role` VALUES ('5', '仓库管理员');

-- ----------------------------
-- Table structure for scrap
-- ----------------------------
DROP TABLE IF EXISTS `scrap`;
CREATE TABLE `scrap` (
  `ORDER_ID` varchar(20) NOT NULL COMMENT '报废单号',
  `PO_NO` varchar(40) DEFAULT NULL COMMENT '订单号',
  `PART_NO` varchar(40) DEFAULT NULL COMMENT '零件图号',
  `PART_REV` varchar(5) DEFAULT NULL COMMENT '零件版本号',
  `QUANTITY` int(10) DEFAULT NULL COMMENT '数量',
  `PIC_ID` varchar(20) DEFAULT NULL COMMENT '负责人工号',
  `DESCRIPTION` varchar(200) DEFAULT NULL COMMENT '原因描述',
  `MEASURE` varchar(200) DEFAULT NULL COMMENT '处理措施',
  `TYPE` varchar(5) DEFAULT NULL COMMENT '内部或者外部造成的',
  `COOPERATOR_ID` varchar(10) DEFAULT NULL COMMENT '外协厂家id',
  `CR_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATOR_ID` varchar(20) DEFAULT NULL COMMENT '创建者工号',
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scrap
-- ----------------------------
INSERT INTO `scrap` VALUES ('00001', '11251', '1515', 'W', '12', '123512', '12351', '235123', '124', '124', '2014-07-15 21:33:45', '124');
