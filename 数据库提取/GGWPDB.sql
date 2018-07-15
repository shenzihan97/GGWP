CREATE DATABASE  IF NOT EXISTS `ggwp` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ggwp`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ggwp
-- ------------------------------------------------------
-- Server version	5.7.22-log

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
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `publisher` varchar(45) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `intro` varchar(1024) DEFAULT NULL,
  `score` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
INSERT INTO `game` VALUES (0,'GTA5','Rockstar Games','2012','1.jpg','Los Santos: a sprawling sun-soaked metropolis full of self-help gurus, starlets and fading celebrities, once the envy of the Western world, now struggling to stay alive in a time of economic uncertainty and cheap reality TV. Amidst the turmoil, three very unique criminals plot their own chances of survival and success: Franklin, a street hustler looking for tangible opportunities and serious money; Michael, a professional ex-con whose retirement is less rosy than he figured it would be; and Trevor, a violent dude driven by the opportunity for a cheap high and his next big score. With options at a premium, the crew risks it all in a myriad of daring and dangerous heists that could set them up for life.','5'),(1,'Borderlands2','2K-Games','2009','2.jpg','The Ultimate Vault Hunter’s Upgrade lets you get the most out of the Borderlands 2 experience.','4.5'),(2,'Divinity: OriginalSin2','Larian-Studios','2018','3.jpg','Master deep, tactical combat. Join up to 3 other players - but know that only one of you will have the chance to become a God.','4.8'),(3,'The Binding of Isaac','Edmund-McMillen','2011','4.jpg','The Binding of Isaac: Rebirth is a randomly generated action RPG shooter with heavy Rogue-like elements. Following Isaac on his journey players will find bizarre treasures that change Isaac’s form giving him super human abilities and enabling him to fight off droves of mysterious creatures, discover secrets ...','4.6'),(4,'Hyperdimension Neptunia','Compile Heart','2010','5.jpg','Packed with fast-paced, turn-based RPG action, fourth-wall-breaking, trope-demolishing dialogue, and more item, weapon, and costume customization than you can shake a Lvl. 1 Stick at, Gamindustri is a world set on turning the concept of the JRPG on its head!','5');
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pinfen`
--

DROP TABLE IF EXISTS `pinfen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pinfen` (
  `user` int(11) NOT NULL,
  `id` varchar(45) NOT NULL,
  `score` double DEFAULT NULL,
  `pinlun` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user`,`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pinfen`
--

LOCK TABLES `pinfen` WRITE;
/*!40000 ALTER TABLE `pinfen` DISABLE KEYS */;
INSERT INTO `pinfen` VALUES (1,'0',5,'666'),(1,'1',4.5,'good');
/*!40000 ALTER TABLE `pinfen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('1','1'),('shen','971203');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-15 20:24:48
