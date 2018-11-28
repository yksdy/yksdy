-- MySQL dump 10.10
--
-- Host: localhost    Database: students
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `abc`
--

DROP TABLE IF EXISTS `abc`;
/*!50001 DROP VIEW IF EXISTS `abc`*/;
/*!50001 DROP TABLE IF EXISTS `abc`*/;
/*!50001 CREATE TABLE `abc` (
  `name` varchar(255),
  `tel` varchar(50)
) */;

--
-- Table structure for table `hah`
--

DROP TABLE IF EXISTS `hah`;
CREATE TABLE `hah` (
  `x` int(11) default NULL,
  `y` int(11) default NULL,
  `z` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `hah`
--


/*!40000 ALTER TABLE `hah` DISABLE KEYS */;
LOCK TABLES `hah` WRITE;
INSERT INTO `hah` VALUES (3,23,2);
UNLOCK TABLES;
/*!40000 ALTER TABLE `hah` ENABLE KEYS */;

--
-- Table structure for table `haha`
--

DROP TABLE IF EXISTS `haha`;
CREATE TABLE `haha` (
  `x` int(11) default NULL,
  `y` int(11) default NULL,
  `z` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `haha`
--


/*!40000 ALTER TABLE `haha` DISABLE KEYS */;
LOCK TABLES `haha` WRITE;
INSERT INTO `haha` VALUES (23,23,2);
UNLOCK TABLES;
/*!40000 ALTER TABLE `haha` ENABLE KEYS */;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id_o` int(11) NOT NULL default '0',
  `no` int(11) default NULL,
  `id_p` int(11) default NULL,
  PRIMARY KEY  (`id_o`),
  KEY `id_p` (`id_p`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`id_p`) REFERENCES `persons` (`id_p`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `orders`
--


/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
LOCK TABLES `orders` WRITE;
INSERT INTO `orders` VALUES (1,132,2),(2,1232,2),(3,122,4),(4,1212,4);
UNLOCK TABLES;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;

--
-- Table structure for table `orders_bak`
--

DROP TABLE IF EXISTS `orders_bak`;
CREATE TABLE `orders_bak` (
  `a` int(11) default NULL,
  `b` int(11) default NULL,
  `c` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `orders_bak`
--


/*!40000 ALTER TABLE `orders_bak` DISABLE KEYS */;
LOCK TABLES `orders_bak` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `orders_bak` ENABLE KEYS */;

--
-- Table structure for table `persons`
--

DROP TABLE IF EXISTS `persons`;
CREATE TABLE `persons` (
  `id_p` int(11) NOT NULL default '0',
  `name` varchar(255) default NULL,
  `sex` char(4) NOT NULL,
  `tel` varchar(50) default NULL,
  `image` blob,
  `sal` int(11) default NULL,
  `math` int(11) default '80',
  `english` int(11) default '70',
  `chinese` int(11) default '90',
  PRIMARY KEY  (`id_p`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `persons`
--


/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
LOCK TABLES `persons` WRITE;
INSERT INTO `persons` VALUES (1,'Tom','M','911',NULL,5000,80,70,90),(2,'Diave','M','110',NULL,5000,80,70,90),(3,'Mengmeng','M','136',NULL,6000,80,70,90),(4,'Jack','M','119',NULL,5000,100,70,90),(5,'小明','M','215',NULL,5000,100,70,90),(6,'Yiva','F','12306',NULL,5000,100,70,90);
UNLOCK TABLES;
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;

--
-- View structure for view `abc`
--

/*!50001 DROP TABLE IF EXISTS `abc`*/;
/*!50001 DROP VIEW IF EXISTS `abc`*/;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `abc` AS select `persons`.`name` AS `name`,`persons`.`tel` AS `tel` from `persons` */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

