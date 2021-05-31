/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100414
 Source Host           : localhost:3306
 Source Schema         : cnpm

 Target Server Type    : MySQL
 Target Server Version : 100414
 File Encoding         : 65001

 Date: 31/05/2021 16:12:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `publisher` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `nameBook` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `addDate` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `amount` int(255) NULL DEFAULT NULL,
  `remainAmount` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'Kim Đồng', 'Nàng Thơ', 'Nguyễn Du', '', 100, 100);
INSERT INTO `book` VALUES ('2', 'Thiếu Nhi', 'Triết Học Mac', 'Hồ Chí Minh', '2021-05-05', 50, 50);
INSERT INTO `book` VALUES ('3', 'HiBook', 'Tuổi Trẻ Đáng Giá Bao Nhiêu', 'Hạ Vũ', '2021-05-11', 50, 50);
INSERT INTO `book` VALUES ('4', 'FirstNews', 'Sức Mạnh Tình Bạn', 'Alan Loy', '2021-05-31', 1111, 1111);
INSERT INTO `book` VALUES ('5', 'FirstNews', 'Cánh Cửa Hạnh Phúc', 'Ben', '2021-05-31', 3, 3);
INSERT INTO `book` VALUES ('6', 'FirstNews', 'Cách Nghĩ Quyết Định Hướng Đi', 'Hạ Vũ', '2021-05-31', 1000, 1000);

SET FOREIGN_KEY_CHECKS = 1;
