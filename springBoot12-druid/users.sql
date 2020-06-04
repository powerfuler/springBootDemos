/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-11-05 21:17:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(50) NOT NULL,
    `password` VARCHAR(64) NOT NULL,
    `birthday` DATE NOT NULL,
    PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=3
;


CREATE TABLE `role` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(10) NOT NULL,
    `descr` VARCHAR(100) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;


CREATE TABLE `department` (
    `id` INT(11) NOT NULL,
    `name` VARCHAR(10) NOT NULL,
    `descr` VARCHAR(50) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
)
ENGINE=InnoDB
;




