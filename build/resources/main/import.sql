create database if not exists `node_service`;

USE `node_service`;

/*Table structure for table `app_authorities` */

DROP TABLE IF EXISTS `app_authorities`;

CREATE TABLE `app_authorities` (
  `username` varchar(64) NOT NULL,
  `authority` varchar(64) default NULL,
  PRIMARY KEY  (`username`),
  CONSTRAINT `FK_app_authorities` FOREIGN KEY (`username`) REFERENCES `app_users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_authorities` */

insert  into `app_authorities`(`username`,`authority`) values ('admin','ROLE_ADMIN');

/*Table structure for table `app_category` */

DROP TABLE IF EXISTS `app_category`;

CREATE TABLE `app_category` (
  `record_id` int(11) NOT NULL auto_increment,
  `category_code` varchar(64) NOT NULL,
  `category_name` varchar(64) default NULL,
  `category_desc` varchar(164) default NULL,
  PRIMARY KEY  (`category_code`),
  UNIQUE KEY `record_id` (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_category` */

/*Table structure for table `app_contact` */

DROP TABLE IF EXISTS `app_contact`;

CREATE TABLE `app_contact` (
  `username` varchar(64) NOT NULL,
  `subscription` varchar(10) default NULL,
  `jid` varchar(64) NOT NULL,
  `nickname` varchar(64) default NULL,
  `joindate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `show` varchar(20) default NULL,
  `status` varchar(100) default NULL,
  `lastseen` timestamp NOT NULL default '0000-00-00 00:00:00',
  `unread` int(11) default NULL,
  `key` varchar(20) default NULL,
  PRIMARY KEY  (`username`,`jid`),
  KEY `jid` (`jid`),
  CONSTRAINT `FK_app_contact` FOREIGN KEY (`username`) REFERENCES `app_users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_contact` */

insert  into `app_contact`(`username`,`subscription`,`jid`,`nickname`,`joindate`,`show`,`status`,`lastseen`,`unread`,`key`) values ('6210001','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210001','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210002','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210002','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210003','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210003','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210004','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210004','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210005','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210005','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210006','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210006','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210007','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210007','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210008','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210008','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210009','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210009','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210010','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210010','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210011','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210011','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210012','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210012','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210013','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210013','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210014','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210014','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210015','both','admin@domain.com','admin','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('6210015','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210001@domain.com','6210001','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210002@domain.com','6210002','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210003@domain.com','6210003','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210004@domain.com','6210004','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210005@domain.com','6210005','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210006@domain.com','6210006','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210007@domain.com','6210007','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210008@domain.com','6210008','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210009@domain.com','6210009','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210010@domain.com','6210010','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210011@domain.com','6210011','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210012@domain.com','6210012','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210013@domain.com','6210013','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210014@domain.com','6210014','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','6210015@domain.com','6210015','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('admin','both','user@domain.com','user','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210001@domain.com','6210001','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210002@domain.com','6210002','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210003@domain.com','6210003','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210004@domain.com','6210004','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210005@domain.com','6210005','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210006@domain.com','6210006','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210007@domain.com','6210007','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210008@domain.com','6210008','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210009@domain.com','6210009','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210010@domain.com','6210010','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210011@domain.com','6210011','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210012@domain.com','6210012','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210013@domain.com','6210013','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210014@domain.com','6210014','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','6210015@domain.com','6210015','2019-10-01 15:22:04','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL),('user','both','admin@domain.com','admin','2019-10-01 15:22:26','unavailable','Offline','2020-05-01 17:48:40',NULL,NULL);

/*Table structure for table `app_contract` */

DROP TABLE IF EXISTS `app_contract`;

CREATE TABLE `app_contract` (
  `record_id` int(11) NOT NULL auto_increment,
  `contract_code` varchar(64) NOT NULL,
  `contract_name` varchar(64) default NULL,
  `contract_status` varchar(10) default NULL,
  `start_date` date default NULL,
  `end_date` date default NULL,
  `username` varchar(64) default NULL,
  PRIMARY KEY  (`contract_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_contract` (`username`),
  CONSTRAINT `FK_app_contract` FOREIGN KEY (`username`) REFERENCES `app_users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_contract` */

/*Table structure for table `app_contract_device` */

DROP TABLE IF EXISTS `app_contract_device`;

CREATE TABLE `app_contract_device` (
  `record_id` int(11) NOT NULL auto_increment,
  `contract_code` varchar(64) NOT NULL,
  `contract_type` varchar(20) default NULL,
  `device_code` varchar(64) default NULL,
  `device_status` varchar(10) default NULL,
  `start_date` date default NULL,
  `end_date` date default NULL,
  PRIMARY KEY  (`record_id`,`contract_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_contract_device` (`contract_code`),
  CONSTRAINT `FK_app_contract_device` FOREIGN KEY (`contract_code`) REFERENCES `app_contract` (`contract_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_contract_device` */

/*Table structure for table `app_contract_product` */

DROP TABLE IF EXISTS `app_contract_product`;

CREATE TABLE `app_contract_product` (
  `record_id` int(11) NOT NULL auto_increment,
  `contract_code` varchar(64) NOT NULL,
  `contract_type` varchar(20) default NULL,
  `product_code` varchar(64) default NULL,
  `product_status` varchar(10) default NULL,
  `start_date` date default NULL,
  `end_date` date default NULL,
  PRIMARY KEY  (`record_id`,`contract_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_contract_product` (`contract_code`),
  CONSTRAINT `FK_app_contract_product` FOREIGN KEY (`contract_code`) REFERENCES `app_contract` (`contract_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_contract_product` */

/*Table structure for table `app_contract_service` */

DROP TABLE IF EXISTS `app_contract_service`;

CREATE TABLE `app_contract_service` (
  `record_id` int(11) NOT NULL auto_increment,
  `contract_code` varchar(64) NOT NULL,
  `contract_type` varchar(20) default NULL,
  `service_code` varchar(64) default NULL,
  `service_status` varchar(10) default NULL,
  `start_date` date default NULL,
  `end_date` date default NULL,
  PRIMARY KEY  (`record_id`,`contract_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_contract_service` (`contract_code`),
  CONSTRAINT `FK_app_contract_service` FOREIGN KEY (`contract_code`) REFERENCES `app_contract` (`contract_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_contract_service` */

/*Table structure for table `app_device` */

DROP TABLE IF EXISTS `app_device`;

CREATE TABLE `app_device` (
  `record_id` int(11) NOT NULL auto_increment,
  `device_code` varchar(64) NOT NULL,
  `device_name` varchar(64) default NULL,
  `device_desc` varchar(164) default NULL,
  `category_code` varchar(64) default NULL,
  PRIMARY KEY  (`device_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_device` (`category_code`),
  CONSTRAINT `FK_app_device` FOREIGN KEY (`category_code`) REFERENCES `app_category` (`category_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_device` */

/*Table structure for table `app_device_attribute` */

DROP TABLE IF EXISTS `app_device_attribute`;

CREATE TABLE `app_device_attribute` (
  `device_code` varchar(64) NOT NULL,
  `text_attribute_01` varchar(40) default NULL,
  `text_attribute_02` varchar(40) default NULL,
  `text_attribute_03` varchar(40) default NULL,
  `text_attribute_04` varchar(40) default NULL,
  `text_attribute_05` varchar(40) default NULL,
  `text_attribute_06` varchar(40) default NULL,
  `text_attribute_07` varchar(40) default NULL,
  `text_attribute_08` varchar(40) default NULL,
  `text_attribute_09` varchar(40) default NULL,
  `text_attribute_10` varchar(40) default NULL,
  `int_attribute_01` int(11) default NULL,
  `int_attribute_02` int(11) default NULL,
  `int_attribute_03` int(11) default NULL,
  `int_attribute_04` int(11) default NULL,
  `int_attribute_05` int(11) default NULL,
  `last_update` date default NULL,
  PRIMARY KEY  (`device_code`),
  CONSTRAINT `FK_app_device_attribute` FOREIGN KEY (`device_code`) REFERENCES `app_device` (`device_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_device_attribute` */

/*Table structure for table `app_device_records` */

DROP TABLE IF EXISTS `app_device_records`;

CREATE TABLE `app_device_records` (
  `record_id` int(11) NOT NULL auto_increment,
  `device_code` varchar(64) NOT NULL,
  `text_attribute_01` varchar(40) default NULL,
  `text_attribute_02` varchar(40) default NULL,
  `text_attribute_03` varchar(40) default NULL,
  `text_attribute_04` varchar(40) default NULL,
  `text_attribute_05` varchar(40) default NULL,
  `text_attribute_06` varchar(40) default NULL,
  `text_attribute_07` varchar(40) default NULL,
  `text_attribute_08` varchar(40) default NULL,
  `text_attribute_09` varchar(40) default NULL,
  `text_attribute_10` varchar(40) default NULL,
  `int_attribute_01` int(11) default NULL,
  `int_attribute_02` int(11) default NULL,
  `int_attribute_03` int(11) default NULL,
  `int_attribute_04` int(11) default NULL,
  `int_attribute_05` int(11) default NULL,
  `created_date` date default NULL,
  `contract_code` varchar(64) default NULL,
  PRIMARY KEY  (`record_id`,`device_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_device_records` (`device_code`),
  KEY `FK_app_device_records_2` (`contract_code`),
  CONSTRAINT `FK_app_device_records_2` FOREIGN KEY (`contract_code`) REFERENCES `app_contract_device` (`contract_code`),
  CONSTRAINT `FK_app_device_records` FOREIGN KEY (`device_code`) REFERENCES `app_device` (`device_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_device_records` */

/*Table structure for table `app_group_authorities` */

DROP TABLE IF EXISTS `app_group_authorities`;

CREATE TABLE `app_group_authorities` (
  `group_id` int(11) NOT NULL,
  `authority` varchar(64) default NULL,
  PRIMARY KEY  (`group_id`),
  CONSTRAINT `FK_app_group_authorities` FOREIGN KEY (`group_id`) REFERENCES `app_groups` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_group_authorities` */

/*Table structure for table `app_group_members` */

DROP TABLE IF EXISTS `app_group_members`;

CREATE TABLE `app_group_members` (
  `group_id` int(11) default NULL,
  `group_member_id` int(11) NOT NULL auto_increment,
  `username` varchar(64) default NULL,
  PRIMARY KEY  (`group_member_id`),
  KEY `FK_app_group_members1` (`group_id`),
  KEY `FK_app_group_members2` (`username`),
  CONSTRAINT `FK_app_group_members1` FOREIGN KEY (`group_id`) REFERENCES `app_groups` (`group_id`),
  CONSTRAINT `FK_app_group_members2` FOREIGN KEY (`username`) REFERENCES `app_users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_group_members` */

/*Table structure for table `app_groups` */

DROP TABLE IF EXISTS `app_groups`;

CREATE TABLE `app_groups` (
  `group_id` int(11) NOT NULL auto_increment,
  `group_name` varchar(64) default NULL,
  PRIMARY KEY  (`group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `app_groups` */

insert  into `app_groups`(`group_id`,`group_name`) values (1,'APP_ADMIN'),(2,'APP_USER');

/*Table structure for table `app_menus` */

DROP TABLE IF EXISTS `app_menus`;

CREATE TABLE `app_menus` (
  `name` varchar(64) NOT NULL,
  `link` varchar(64) NOT NULL,
  `display` varchar(64) NOT NULL,
  PRIMARY KEY  (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_menus` */

insert  into `app_menus`(`name`,`link`,`display`) values ('appContact','searchAppContact','AppContact'),('appGroups','searchAppGroups','AppGroups'),('appUsers','searchAppUsers','AppUsers');

/*Table structure for table `app_message` */

DROP TABLE IF EXISTS `app_message`;

CREATE TABLE `app_message` (
  `username` varchar(64) NOT NULL,
  `jid` varchar(64) NOT NULL,
  `msgtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `msgType` varchar(20) default NULL,
  `msgSubject` varchar(100) default NULL,
  `msgText` text,
  PRIMARY KEY  (`username`,`jid`,`msgtime`),
  KEY `FK_app_inbox` (`jid`),
  CONSTRAINT `FK_app_inbox` FOREIGN KEY (`jid`) REFERENCES `app_contact` (`jid`),
  CONSTRAINT `FK_app_outbox` FOREIGN KEY (`username`) REFERENCES `app_users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_message` */

/*Table structure for table `app_persistent_logins` */

DROP TABLE IF EXISTS `app_persistent_logins`;

CREATE TABLE `app_persistent_logins` (
  `username` varchar(64) default NULL,
  `series` varchar(64) NOT NULL,
  `token` varchar(64) default NULL,
  `last_used` datetime NOT NULL,
  PRIMARY KEY  (`series`,`last_used`),
  KEY `FK_app_persistent_logins` (`username`),
  CONSTRAINT `FK_app_persistent_logins` FOREIGN KEY (`username`) REFERENCES `app_users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_persistent_logins` */

insert  into `app_persistent_logins`(`username`,`series`,`token`,`last_used`) values ('admin','xLrLMZ3VYi-uokbIqzRkm8lj6oEisa2Q','2VbuEkU3DmsdQGdzAAAA','2020-05-01 05:49:23'),('admin','y9uC7864JVS9PvNzy4Om6bnHNmBIMMFK','i4jwUos3nSZiybmJAAAA','2020-05-01 07:14:32');

/*Table structure for table `app_product` */

DROP TABLE IF EXISTS `app_product`;

CREATE TABLE `app_product` (
  `record_id` int(11) NOT NULL auto_increment,
  `product_code` varchar(64) NOT NULL,
  `product_name` varchar(64) default NULL,
  `product_desc` varchar(164) default NULL,
  `category_code` varchar(64) default NULL,
  PRIMARY KEY  (`product_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_product` (`category_code`),
  CONSTRAINT `FK_app_product` FOREIGN KEY (`category_code`) REFERENCES `app_category` (`category_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_product` */

/*Table structure for table `app_product_attribute` */

DROP TABLE IF EXISTS `app_product_attribute`;

CREATE TABLE `app_product_attribute` (
  `product_code` varchar(64) NOT NULL,
  `text_attribute_01` varchar(40) default NULL,
  `text_attribute_02` varchar(40) default NULL,
  `text_attribute_03` varchar(40) default NULL,
  `text_attribute_04` varchar(40) default NULL,
  `text_attribute_05` varchar(40) default NULL,
  `text_attribute_06` varchar(40) default NULL,
  `text_attribute_07` varchar(40) default NULL,
  `text_attribute_08` varchar(40) default NULL,
  `text_attribute_09` varchar(40) default NULL,
  `text_attribute_10` varchar(40) default NULL,
  `int_attribute_01` int(11) default NULL,
  `int_attribute_02` int(11) default NULL,
  `int_attribute_03` int(11) default NULL,
  `int_attribute_04` int(11) default NULL,
  `int_attribute_05` int(11) default NULL,
  `last_update` date default NULL,
  PRIMARY KEY  (`product_code`),
  CONSTRAINT `FK_app_product_attribute` FOREIGN KEY (`product_code`) REFERENCES `app_product` (`product_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_product_attribute` */

/*Table structure for table `app_product_records` */

DROP TABLE IF EXISTS `app_product_records`;

CREATE TABLE `app_product_records` (
  `record_id` int(11) NOT NULL auto_increment,
  `product_code` varchar(64) NOT NULL,
  `text_attribute_01` varchar(40) default NULL,
  `text_attribute_02` varchar(40) default NULL,
  `text_attribute_03` varchar(40) default NULL,
  `text_attribute_04` varchar(40) default NULL,
  `text_attribute_05` varchar(40) default NULL,
  `text_attribute_06` varchar(40) default NULL,
  `text_attribute_07` varchar(40) default NULL,
  `text_attribute_08` varchar(40) default NULL,
  `text_attribute_09` varchar(40) default NULL,
  `text_attribute_10` varchar(40) default NULL,
  `int_attribute_01` int(11) default NULL,
  `int_attribute_02` int(11) default NULL,
  `int_attribute_03` int(11) default NULL,
  `int_attribute_04` int(11) default NULL,
  `int_attribute_05` int(11) default NULL,
  `created_date` date default NULL,
  `contract_code` varchar(64) default NULL,
  PRIMARY KEY  (`record_id`,`product_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_device_records` (`product_code`),
  KEY `FK_app_product_records_2` (`contract_code`),
  CONSTRAINT `FK_app_product_records_2` FOREIGN KEY (`contract_code`) REFERENCES `app_contract_product` (`contract_code`),
  CONSTRAINT `FK_app_product_records` FOREIGN KEY (`product_code`) REFERENCES `app_product` (`product_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_product_records` */

/*Table structure for table `app_room` */

DROP TABLE IF EXISTS `app_room`;

CREATE TABLE `app_room` (
  `meeting_room` varchar(100) NOT NULL,
  `subject` varchar(100) default NULL,
  `participant` varchar(46) default NULL,
  `start_date` datetime default NULL,
  `end_date` datetime default NULL,
  `status` varchar(46) default NULL,
  `ref_value` text,
  PRIMARY KEY  (`meeting_room`),
  KEY `FK_app_room` (`participant`),
  CONSTRAINT `FK_app_room` FOREIGN KEY (`participant`) REFERENCES `app_users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_room` */

/*Table structure for table `app_service` */

DROP TABLE IF EXISTS `app_service`;

CREATE TABLE `app_service` (
  `record_id` int(11) NOT NULL auto_increment,
  `service_code` varchar(64) NOT NULL,
  `service_name` varchar(64) default NULL,
  `service_desc` varchar(164) default NULL,
  `category_code` varchar(64) default NULL,
  PRIMARY KEY  (`service_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_service` (`category_code`),
  CONSTRAINT `FK_app_service` FOREIGN KEY (`category_code`) REFERENCES `app_category` (`category_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_service` */

/*Table structure for table `app_service_attribute` */

DROP TABLE IF EXISTS `app_service_attribute`;

CREATE TABLE `app_service_attribute` (
  `service_code` varchar(64) NOT NULL,
  `text_attribute_01` varchar(40) default NULL,
  `text_attribute_02` varchar(40) default NULL,
  `text_attribute_03` varchar(40) default NULL,
  `text_attribute_04` varchar(40) default NULL,
  `text_attribute_05` varchar(40) default NULL,
  `text_attribute_06` varchar(40) default NULL,
  `text_attribute_07` varchar(40) default NULL,
  `text_attribute_08` varchar(40) default NULL,
  `text_attribute_09` varchar(40) default NULL,
  `text_attribute_10` varchar(40) default NULL,
  `int_attribute_01` int(11) default NULL,
  `int_attribute_02` int(11) default NULL,
  `int_attribute_03` int(11) default NULL,
  `int_attribute_04` int(11) default NULL,
  `int_attribute_05` int(11) default NULL,
  `last_update` date default NULL,
  PRIMARY KEY  (`service_code`),
  CONSTRAINT `FK_app_service_attribute` FOREIGN KEY (`service_code`) REFERENCES `app_service` (`service_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_service_attribute` */

/*Table structure for table `app_service_records` */

DROP TABLE IF EXISTS `app_service_records`;

CREATE TABLE `app_service_records` (
  `record_id` int(11) NOT NULL auto_increment,
  `service_code` varchar(64) NOT NULL,
  `text_attribute_01` varchar(40) default NULL,
  `text_attribute_02` varchar(40) default NULL,
  `text_attribute_03` varchar(40) default NULL,
  `text_attribute_04` varchar(40) default NULL,
  `text_attribute_05` varchar(40) default NULL,
  `text_attribute_06` varchar(40) default NULL,
  `text_attribute_07` varchar(40) default NULL,
  `text_attribute_08` varchar(40) default NULL,
  `text_attribute_09` varchar(40) default NULL,
  `text_attribute_10` varchar(40) default NULL,
  `int_attribute_01` int(11) default NULL,
  `int_attribute_02` int(11) default NULL,
  `int_attribute_03` int(11) default NULL,
  `int_attribute_04` int(11) default NULL,
  `int_attribute_05` int(11) default NULL,
  `created_date` date default NULL,
  `contract_code` varchar(64) default NULL,
  PRIMARY KEY  (`record_id`,`service_code`),
  UNIQUE KEY `record_id` (`record_id`),
  KEY `FK_app_device_records` (`service_code`),
  KEY `FK_app_service_records_2` (`contract_code`),
  CONSTRAINT `FK_app_service_records_2` FOREIGN KEY (`contract_code`) REFERENCES `app_contract_service` (`contract_code`),
  CONSTRAINT `FK_app_service_records` FOREIGN KEY (`service_code`) REFERENCES `app_service` (`service_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_service_records` */

/*Table structure for table `app_users` */

DROP TABLE IF EXISTS `app_users`;

CREATE TABLE `app_users` (
  `username` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  `name` varchar(64) default NULL,
  `email` varchar(100) default NULL,
  `phone` varchar(64) default NULL,
  `mobile` varchar(64) default NULL,
  `enabled` tinyint(1) default NULL,
  `token` varchar(64) NOT NULL,
  PRIMARY KEY  (`username`),
  KEY `FK_app_users` (`token`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `app_users` */

insert  into `app_users`(`username`,`password`,`name`,`email`,`phone`,`mobile`,`enabled`,`token`) values ('6210001','password','6210001','6210001@domain.com',NULL,NULL,1,'6210001'),('6210002','password','6210002','6210002@domain.com',NULL,NULL,1,'6210002'),('6210003','password','6210003','6210003@domain.com',NULL,NULL,1,'6210003'),('6210004','password','6210004','6210004@domain.com',NULL,NULL,1,'6210004'),('6210005','password','6210005','6210005@domain.com',NULL,NULL,1,'6210005'),('6210006','password','6210006','6210006@domain.com',NULL,NULL,1,'6210006'),('6210007','password','6210007','6210007@domain.com',NULL,NULL,1,'6210007'),('6210008','password','6210008','6210008@domain.com',NULL,NULL,1,'6210008'),('6210009','password','6210009','6210009@domain.com',NULL,NULL,1,'6210009'),('6210010','password','6210010','6210010@domain.com',NULL,NULL,1,'6210010'),('6210011','password','6210011','6210011@domain.com',NULL,NULL,1,'6210011'),('6210012','password','6210012','6210012@domain.com',NULL,NULL,1,'6210012'),('6210013','password','6210013','6210013@domain.com',NULL,NULL,1,'6210013'),('6210014','password','6210014','6210014@domain.com',NULL,NULL,1,'6210014'),('6210015','password','6210015','6210015@domain.com',NULL,NULL,1,'6210015'),('admin','password',NULL,NULL,NULL,NULL,1,'wmQ45QjYpC38W3i'),('user','password','User','user@domain.com','','',1,'wmQ45QjYpC38W3i');
