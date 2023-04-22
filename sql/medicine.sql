/*
 Navicat Premium Data Transfer

 Source Server         : medicine
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : 47.99.49.255:3307
 Source Schema         : medicine

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 22/04/2023 14:46:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for yaocai
-- ----------------------------
DROP TABLE IF EXISTS `yaocai`;
CREATE TABLE `yaocai`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '学名：当归',
  `img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '药材图片链接',
  `alais` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '别名',
  `area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分布区域',
  `classificaion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '药材分类:动物/植物',
  `harvest` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '采收时间',
  `effect` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '功效',
  `indication` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主治',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '百度链接',
  `del_flg` int(0) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yaocai
-- ----------------------------
INSERT INTO `yaocai` VALUES (1, '666', '1', '1', '1', '1', '1', '11', '1', '1', 0);
INSERT INTO `yaocai` VALUES (2, '地黄', 'https://img0.baidu.com/it/u=3511089590,2908085846&fm=253&fmt=auto&app=120&f=JPEG?w=681&h=500', '生地、生地黄、芐、怀庆地黄、小鸡喝酒、地髓等', '辽宁、河北、河南、山东、山西、陕西、甘肃、内蒙古、江苏等省', '植物', '秋后为主', '地黄性凉，味甘苦，具有滋阴补肾、养血补血、凉血的功效', '地黄性凉，味甘苦，具有滋阴补肾、养血补血、凉血的功效。凡阴虚血虚肾虚者食之，颇有益处。此外，地黄有强心利尿、解热消炎、促进血液凝固和降低血糖的作用。', 'https://baike.baidu.com/item/%E5%9C%B0%E9%BB%84/759100?fromtitle=%E7%86%9F%E5%9C%B0%E9%BB%84&fromid=5138038&fr=aladdin', 0);
INSERT INTO `yaocai` VALUES (3, '888', '', '', '', '', '', '', '', '', 0);
INSERT INTO `yaocai` VALUES (5, 'dsds', '', '', '', '', '', '', '', '9999', 0);

SET FOREIGN_KEY_CHECKS = 1;
