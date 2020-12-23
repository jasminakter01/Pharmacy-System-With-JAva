/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.0.45-community-nt : Database - pharmacy_management
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pharmacy_management` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pharmacy_management`;

/*Table structure for table `madecin_info` */

DROP TABLE IF EXISTS `madecin_info`;

CREATE TABLE `madecin_info` (
  `id` int(100) default NULL,
  `madecine_name` varchar(100) default NULL,
  `company_name` varchar(100) default NULL,
  `purchase_p` int(100) default NULL,
  `sell_p` int(100) default NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `madecin_info` */

insert  into `madecin_info`(`id`,`madecine_name`,`company_name`,`purchase_p`,`sell_p`) values (5,'Flexi®','NSAIDs and Antigout Preparations',400,450),(8,'Tylace™','Mucolytic Agent',300,350),(1,' Virux®','Systemic Antifungal, Antiviral and Antiprotozoal Agents',200,210),(9,'Virux Tablet®','Topical Preparations',300,320),(6,'Fona plus®','Topical Preparations',310,320),(2,'Almex®','Antiparasite Preparations',290,300),(3,'Ambrisan™ 5','Cardiovascular Preparations',500,505),(7,'Tryptin®','CNS Preparations',330,350),(4,'Anzitor®','Lipid Modifying Preparations',440,450),(10,'Zimax®','Other Antibacterials',290,295),(NULL,'afrin','ACI',120,150),(NULL,'napa','ssd',200,220);

/*Table structure for table `puchase_returen` */

DROP TABLE IF EXISTS `puchase_returen`;

CREATE TABLE `puchase_returen` (
  `id` int(100) default NULL,
  `sname` varchar(100) default NULL,
  `medecne` varchar(100) default NULL,
  `quantity` int(100) default NULL,
  `price` int(100) default NULL,
  `date` date default NULL,
  `status` varchar(100) default 'main',
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `puchase_returen` */

insert  into `puchase_returen`(`id`,`sname`,`medecne`,`quantity`,`price`,`date`,`status`) values (NULL,'Sharmin','Flexi®',10,4000,'2020-01-07','main'),(NULL,'Sharmin','Flexi®',2,800,'2020-01-07','main'),(NULL,'Sharmin','Tylace™',5,1500,'2020-01-07','main'),(NULL,'naima','Fona plus®',1,310,'2020-01-07','main'),(NULL,'Sharmin','Tylace™',10,3000,'2020-01-07','main'),(NULL,'Sharmin','Tylace™',15,4500,'2020-01-07','main'),(NULL,'naima','Flexi®',4,1600,'2020-01-07','main'),(NULL,'naima','Fona plus®',30,9300,'2020-01-07','main'),(NULL,'Jasmin',' Virux®',23,4600,'2020-01-08','sample'),(NULL,'Jasmin','Tylace™',1,300,'2020-10-25','main');

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `id` int(100) default NULL,
  `sname` varchar(100) default NULL,
  `number` varchar(100) default NULL,
  `medecine` varchar(100) default NULL,
  `p_price` int(100) default NULL,
  `s_price` int(100) default NULL,
  `quantity` int(100) default NULL,
  `total_price` int(100) default NULL,
  `date` date default NULL,
  `status` varchar(100) default 'main',
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `purchase` */

insert  into `purchase`(`id`,`sname`,`number`,`medecine`,`p_price`,`s_price`,`quantity`,`total_price`,`date`,`status`) values (1,'Nabila','01887765544','Flexi®',400,450,23,9200,'2020-01-05','main'),(1,'Nabila','01887765544','Virux Tablet®',300,320,44,13200,'2020-01-05','main'),(2,'Nabila','01887765544','Tylace™',300,350,34,10200,'2020-01-05','main'),(3,'Nabila','01887765544',' Virux®',200,210,23,4600,'2020-01-05','main'),(3,'Nabila','01887765544',' Virux®',200,210,23,4600,'2020-01-05','main'),(5,'Nabila','01887765544',' Virux®',200,210,23,4600,'2020-01-05','main'),(6,'Jasmin','01882209965',' Virux®',200,210,23,4600,'2020-01-05','main'),(6,'Jasmin','01882209965','Almex®',290,300,34,9860,'2020-01-05','main'),(7,'Jasmin','01882209965','Tylace™',300,350,23,6900,'2020-01-05','main'),(8,'Nabila','01887765544','Tylace™',300,350,34,10200,'2020-01-05','main'),(8,'Nabila','01887765544','Virux Tablet®',300,320,36,10800,'2020-01-05','main'),(9,'Nabila','01887765544',' Virux®',200,210,23,4600,'2020-01-05','main'),(10,'naima','01887765543','Flexi®',400,450,34,13600,'2020-01-05','main'),(11,'Jasmin','01882209965',' Virux®',200,210,12,2400,'2020-01-06','main'),(12,'Nabila','01887765544','Virux Tablet®',300,320,12,3600,'2020-01-06','main'),(12,'Nabila','01887765544','Fona plus®',310,320,23,7130,'2020-01-06','main'),(13,'naima','01887765543','Flexi®',400,450,12,4800,'2020-01-06','main'),(13,'naima','01887765543','Fona plus®',310,320,34,10540,'2020-01-06','main'),(14,'Jasmin','01882209965','Fona plus®',310,320,23,7130,'2020-01-06','main'),(15,'Nabila','01887765544',' Virux®',200,210,23,4600,'2020-01-06','main'),(16,'naima','01887765543','Tylace™',300,350,12,3600,'2020-01-06','main'),(17,'Jasmin','01882209965','Virux Tablet®',300,320,34,10200,'2020-01-06','main'),(18,'Jasmin','01882209965','Tylace™',300,350,12,3600,'2020-01-06','main'),(19,'Nabila','01887765544',' Virux®',200,210,12,2400,'2020-01-06','main'),(20,'Jasmin','01882209965','Fona plus®',310,320,5,1550,'2020-01-06','main'),(21,'Faruk','01887765543',' Virux®',200,210,23,4600,'2020-01-06','main'),(21,'Faruk','01887765543','Almex®',290,300,34,9860,'2020-01-06','main'),(22,'Faruk','01887765543',' Virux®',200,210,12,2400,'2020-01-06','main'),(23,'Faruk','01887765543',' Virux®',200,210,12,2400,'2020-01-06','main'),(23,'Faruk','01887765543','Almex®',290,300,3,870,'2020-01-06','main'),(24,'naima','01887765543',' Virux®',200,210,23,4600,'2020-01-06','main'),(24,'naima','01887765543','Almex®',290,300,23,6670,'2020-01-06','main'),(25,'naima','01887765543','Tylace™',300,350,23,6900,'2020-01-06','main'),(25,'naima','01887765543','Virux Tablet®',300,320,32,9600,'2020-01-06','main'),(26,'naima','01887765543','Tylace™',300,350,12,3600,'2020-01-06','main'),(27,'Nabila','01887765544','Tylace™',300,350,23,6900,'2020-01-07','main'),(28,'naima','01887765543','Tylace™',300,350,45,13500,'2020-01-07','main'),(29,'naima','01887765543','Flexi®',400,450,30,12000,'2020-01-07','main'),(29,'naima','01887765543','Flexi®',400,450,30,12000,'2020-01-07','main'),(30,'Sharmin','01889976654','Virux Tablet®',300,320,12,3600,'2020-01-07','main'),(31,'Sharmin','01889976654','Flexi®',400,450,2,800,'2020-01-07','main'),(31,'Sharmin','01889976654','Tylace™',300,350,15,4500,'2020-01-07','main'),(32,'naima','01887765543','Fona plus®',310,320,3,930,'2020-01-07','main'),(33,'naima','01887765543','Fona plus®',310,320,23,7130,'2020-01-08','sample'),(33,'naima','01887765543','Tylace™',300,350,45,13500,'2020-01-08','sample'),(34,'Jasmin','01882209965','Flexi®',400,450,12,4800,'2020-01-08','sample'),(34,'Jasmin','01882209965',' Virux®',200,210,9,1800,'2020-01-08','sample'),(35,'Sharmin','01889976654','Virux Tablet®',300,320,23,6900,'2020-01-08','sample'),(36,'Sharmin','01889976654','Tylace™',300,350,23,6900,'2020-01-08','sample'),(48,'Sharmin','01889976654',' Virux®',22,210,11,242,'2020-01-12','sample'),(58,'Sharmin','01889976654','Tylace™',300,350,23,6900,'2020-01-12','sample'),(59,'Sharmin','01889976654','Virux Tablet®',300,320,3,900,'2020-01-12','sample'),(60,'Nabila','01887765544','Fona plus®',310,320,5,1550,'2020-01-12','sample'),(61,'Nabila','01887765544',' Virux®',200,210,12,2400,'2020-01-12','sample'),(61,'Nabila','01887765544','Fona plus®',310,320,5,1550,'2020-01-12','sample'),(62,'Sharmin','01889976654',' Virux®',200,210,21,4200,'2020-01-12','sample'),(63,'Nabila','01887765544','Tylace™',300,350,34,10200,'2020-01-12','sample'),(63,'Nabila','01887765544','Virux Tablet®',300,320,45,13500,'2020-01-12','sample'),(63,'Nabila','01887765544',' Virux®',200,210,33,6600,'2020-01-12','sample'),(64,'Sharmin','01889976654','Virux Tablet®',300,320,45,13500,'2020-01-12','sample'),(64,'Sharmin','01889976654','Tylace™',300,350,23,6900,'2020-01-12','sample'),(65,'naima','01887765543','Tylace™',300,350,43,12900,'2020-01-12','sample'),(65,'naima','01887765543','Tylace™',300,350,4,1200,'2020-01-12','sample'),(66,'naima','01887765543','Virux Tablet®',300,320,12,3600,'2020-01-13','sample'),(66,'naima','01887765543',' Virux®',200,210,23,4600,'2020-01-13','sample'),(66,'naima','01887765543','Virux Tablet®',300,320,23,6900,'2020-01-13','sample'),(67,'Sharmin','01889976654','Virux Tablet®',300,320,12,3600,'2020-01-13','sample'),(68,'Nabila','01887765544','Tylace™',300,350,213,63900,'2020-01-13','main'),(68,'Nabila','01887765544','Almex®',290,300,2,580,'2020-01-13','main'),(69,'naima','01887765543','Flexi®',400,450,23,9200,'2020-01-13','main'),(70,'Sharmin','01889976654','Virux Tablet®',120,320,3,360,'2020-01-13','sample'),(71,'naima','01887765543','Virux Tablet®',200,320,12,2400,'2020-01-13','sample'),(74,'Jasmin','01882209965','Tylace™',300,350,12,3600,'2020-01-13','main'),(80,'Nabila','01887765544',' Virux®',200,210,12,2400,'2020-01-13','main'),(81,'Nabila','01887765544',' Virux®',200,210,12,2400,'2020-01-14','main'),(82,'Sharmin','01889976654',' Virux®',200,210,22,4400,'2020-01-14','main'),(84,'naima','01887765543','Fona plus®',310,320,100,31000,'2020-01-30','main'),(84,'naima','01887765543',' Virux®',200,210,50,10000,'2020-01-30','main'),(85,'Jasmin','01882209965','Flexi®',400,450,400,160000,'2020-03-26','main'),(86,'Nadiya','01855669824','Fona plus®',310,320,2,620,'2020-03-26','main'),(86,'Nadiya','01855669824',' Virux®',200,210,23,4600,'2020-03-26','main'),(87,'naima','01887765543','Tylace™',200,350,20,4000,'2020-03-26','sample'),(88,'naima','01887765543','Flexi®',400,450,23,9200,'2020-03-26','main'),(89,'naima','01887765543','Tylace™',300,350,12,3600,'2020-09-27','main'),(90,'naima','01887765543','Flexi®',400,450,2,800,'2020-10-25','main'),(93,'Jasmin','01882209965','Tylace™',300,350,1,300,'2020-10-25','main'),(93,'Jasmin','01882209965','Virux Tablet®',300,320,80,24000,'2020-10-25','main'),(95,'naima','01887765543','Flexi®',400,450,2,800,'2020-12-09','main'),(96,'Nabila','01887765544','Tylace™',300,350,5,1500,'2020-12-12','main'),(96,'Nabila','01887765544','Virux Tablet®',300,320,2,600,'2020-12-12','main'),(96,'Nabila','01887765544','Flexi®',400,450,5,2000,'2020-12-12','main'),(97,'Abir','023747823223',' Virux®',200,210,5,1000,'2020-12-12','main'),(98,'Jasmin','01882209965','Flexi®',400,450,5,2000,'2020-12-12','main');

/*Table structure for table `purchase_total` */

DROP TABLE IF EXISTS `purchase_total`;

CREATE TABLE `purchase_total` (
  `id` int(100) default NULL,
  `s_name` varchar(100) default NULL,
  `mobile` varchar(100) default NULL,
  `ammount` int(100) default '0',
  `total_ammount` int(100) default NULL,
  `paid` int(100) default '0',
  `status` varchar(100) default 'main',
  `date` date default NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `purchase_total` */

insert  into `purchase_total`(`id`,`s_name`,`mobile`,`ammount`,`total_ammount`,`paid`,`status`,`date`) values (1,'Nabila','01887765544',22400,22400,0,'main','2020-01-05'),(2,'Nabila','01887765544',10200,32600,600,'main','2020-01-05'),(3,'Nabila','01887765544',9200,41200,0,'main','2020-01-05'),(4,'Nabila','01887765544',0,41200,200,'main','2020-01-05'),(5,'Nabila','01887765544',4600,45600,0,'main','2020-01-05'),(6,'Jasmin','01882209965',14460,14460,0,'main','2020-01-05'),(7,'Jasmin','01882209965',6900,21360,0,'main','2020-01-05'),(8,'Nabila','01887765544',21000,66600,0,'main','2020-01-05'),(9,'Nabila','01887765544',4600,71200,0,'main','2020-01-05'),(10,'naima','01887765543',13600,13600,0,'main','2020-01-05'),(11,'Jasmin','01882209965',2400,23760,0,'main','2020-01-06'),(12,'Nabila','01887765544',10730,81930,2730,'main','2020-01-06'),(13,'naima','01887765543',15340,28940,8070,'main','2020-01-06'),(14,'Jasmin','01882209965',7130,30890,9860,'main','2020-01-06'),(15,'Nabila','01887765544',4600,83800,7330,'main','2020-01-06'),(16,'naima','01887765543',3600,24470,930,'main','2020-01-06'),(17,'Jasmin','01882209965',10200,31230,7530,'main','2020-01-06'),(18,'Jasmin','01882209965',3600,27300,930,'main','2020-01-06'),(19,'Nabila','01887765544',2400,78870,9730,'main','2020-01-06'),(20,'Jasmin','01882209965',1550,27920,0,'main','2020-01-06'),(21,'Faruk','01887765543',14460,14460,4460,'main','2020-01-06'),(22,'Faruk','01887765543',2400,12400,400,'main','2020-01-06'),(23,'Faruk','01887765543',3270,15270,5270,'main','2020-01-06'),(24,'naima','01887765543',11270,34810,4810,'main','2020-01-06'),(25,'naima','01887765543',16500,46500,6500,'main','2020-01-06'),(26,'naima','01887765543',3600,43600,0,'main','2020-01-06'),(27,'Nabila','01887765544',6900,76040,6040,'main','2020-01-07'),(28,'naima','01887765543',13500,57100,7100,'main','2020-01-07'),(29,'naima','01887765543',21200,71200,0,'main','2020-01-07'),(30,'Sharmin','01889976654',3600,3600,0,'main','2020-01-07'),(31,'Sharmin','01889976654',5300,8900,0,'main','2020-01-07'),(32,'naima','01887765543',930,73730,67,'main','2020-01-07'),(33,'naima','01887765543',0,74863,34,'main','2020-01-08'),(34,'Jasmin','01882209965',6600,6600,1200,'sample','2020-01-08'),(35,'Sharmin','01889976654',6900,6900,900,'sample','2020-01-08'),(36,'Sharmin','01889976654',6900,12900,900,'sample','2020-01-08'),(37,'Jasmin','01882209965',0,27920,920,'main','2020-01-09'),(38,'Jasmin','01882209965',0,27000,7000,'main','2020-01-09'),(39,'Jasmin','01882209965',0,20000,5000,'main','2020-01-09'),(40,'Faruk','01887765543',0,10000,5,'main','2020-01-09'),(41,'Jasmin','01882209965',0,15000,3000,'main','2020-01-09'),(42,'Faruk','01887765543',0,9995,95,'main','2020-01-09'),(43,'naima','01887765543',0,74829,55,'main','2020-01-09'),(44,'Jasmin','01882209965',0,12000,1000,'main','2020-01-11'),(45,'Sharmin','01889976654',0,8900,45,'main','2020-01-11'),(46,'Jasmin','01882209965',0,11000,200,'main','2020-01-11'),(47,'Sharmin','01889976654',0,12000,2000,'sample','2020-01-11'),(48,'Sharmin','01889976654',242,10242,0,'sample','2020-01-12'),(49,'Jasmin','01882209965',0,10800,800,'main','2020-01-12'),(50,'Jasmin','01882209965',0,10000,500,'main','2020-01-12'),(51,'Jasmin','01882209965',0,9500,400,'main','2020-01-12'),(52,'naima','01887765543',0,74774,12,'main','2020-01-12'),(53,'Sharmin','01889976654',0,10242,242,'sample','2020-01-12'),(54,'Jasmin','01882209965',0,9100,100,'main','2020-01-12'),(55,'Nabila','01887765544',0,70000,56,'main','2020-01-12'),(56,'Jasmin','01882209965',0,9000,12,'main','2020-01-12'),(57,'Faruk','01887765543',0,9900,32,'main','2020-01-12'),(58,'Sharmin','01889976654',6900,8855,34,'main','2020-01-12'),(59,'Sharmin','01889976654',900,8821,6,'main','2020-01-12'),(60,'Nabila','01887765544',1550,69944,9,'main','2020-01-12'),(61,'Nabila','01887765544',0,69935,9935,'main','2020-01-12'),(62,'Sharmin','01889976654',4200,8815,65,'main','2020-01-12'),(63,'Nabila','01887765544',0,60000,0,'main','2020-01-12'),(64,'Sharmin','01889976654',0,8750,0,'main','2020-01-12'),(65,'naima','01887765543',0,74762,0,'main','2020-01-12'),(66,'naima','01887765543',0,74762,0,'main','2020-01-13'),(67,'Sharmin','01889976654',3600,8750,0,'main','2020-01-13'),(68,'Nabila','01887765544',64480,124480,45,'main','2020-01-13'),(69,'naima','01887765543',9200,83962,3962,'main','2020-01-13'),(70,'Sharmin','01889976654',360,46360,6360,'sample','2020-01-13'),(71,'naima','01887765543',2400,52230,2400,'sample','2020-01-13'),(72,'Jasmin','01882209965',0,8988,23,'main','2020-01-13'),(73,'Nabila','01887765544',0,124435,45,'main','2020-01-13'),(74,'Jasmin','01882209965',3600,12565,89,'main','2020-01-13'),(75,'Jasmin','01882209965',0,12476,34,'main','2020-01-13'),(76,'naima','01887765543',0,80000,3,'main','2020-01-13'),(77,'Jasmin','01882209965',0,12442,442,'main','2020-01-13'),(78,'Faruk','01887765543',0,9868,45,'main','2020-01-13'),(79,'Nabila','01887765544',0,124390,24390,'main','2020-01-13'),(80,'Nabila','01887765544',2400,102400,0,'main','2020-01-13'),(81,'Nabila','01887765544',2400,104800,0,'main','2020-01-14'),(82,'Sharmin','01889976654',4400,13150,0,'main','2020-01-14'),(83,'Nabila','01887765544',0,104800,8000,'main','2020-01-22'),(84,'naima','01887765543',41000,120997,0,'main','2020-01-30'),(85,'Jasmin','01882209965',160000,172000,2000,'main','2020-03-26'),(86,'Nadiya','01855669824',5220,5220,5220,'main','2020-03-26'),(87,'naima','01887765543',4000,53830,3830,'sample','2020-03-26'),(88,'naima','01887765543',9200,130197,23,'main','2020-03-26'),(89,'naima','01887765543',3600,133774,6,'main','2020-09-27'),(90,'naima','01887765543',800,134568,5,'main','2020-10-25'),(91,'Faruk','01887765543',0,9823,23,'main','2020-10-25'),(92,'Jasmin','01882209965',0,170000,5,'main','2020-10-25'),(93,'Jasmin','01882209965',24300,194295,595,'main','2020-10-25'),(94,'Jasmin','01882209965',0,194000,500,'main','2020-10-25'),(95,'naima','01887765543',800,135363,0,'main','2020-12-09'),(96,'Nabila','01887765544',4100,100900,0,'main','2020-12-12'),(97,'Abir','023747823223',1000,1000,0,'main','2020-12-12'),(98,'Jasmin','01882209965',2000,195200,0,'main','2020-12-12');

/*Table structure for table `sells` */

DROP TABLE IF EXISTS `sells`;

CREATE TABLE `sells` (
  `id` int(100) default NULL,
  `customer name` varchar(100) default NULL,
  `madecine` varchar(100) default NULL,
  `s_price` int(100) default NULL,
  `quantity` int(100) default NULL,
  `total price` int(100) default NULL,
  `date` date default NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sells` */

insert  into `sells`(`id`,`customer name`,`madecine`,`s_price`,`quantity`,`total price`,`date`) values (NULL,NULL,' Virux®',210,33,6930,'2020-01-02'),(NULL,NULL,'Flexi®',450,5,2250,'2020-01-02'),(NULL,NULL,'Flexi®',450,2,900,'2020-01-02'),(NULL,NULL,'Almex®',300,22,6600,'2020-01-02'),(NULL,NULL,'Ambrisan™ 5',505,22,11110,'2020-01-02'),(NULL,NULL,'Tylace™',350,1,350,'2020-01-11'),(NULL,NULL,'Flexi®',450,33,14850,'2020-01-11'),(NULL,NULL,'Flexi®',450,12,5400,'2020-01-13'),(NULL,NULL,'Flexi®',450,23,10350,'2020-01-13'),(NULL,NULL,'Almex®',300,23,6900,'2020-01-13'),(NULL,NULL,'Almex®',300,23,6900,'2020-01-13'),(NULL,NULL,'Almex®',300,2,600,'2020-01-13'),(NULL,NULL,'Tylace™',350,23,8050,'2020-01-13'),(NULL,NULL,'Almex®',300,25,7500,'2020-03-26'),(NULL,NULL,' Virux®',210,22,4620,'2020-10-25'),(NULL,NULL,'Virux Tablet®',320,3,960,'2020-10-25');

/*Table structure for table `sells_ammount` */

DROP TABLE IF EXISTS `sells_ammount`;

CREATE TABLE `sells_ammount` (
  `id` int(100) default NULL,
  `customer_Name` varchar(100) default NULL,
  `ammount` int(100) default NULL,
  `date` date default NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sells_ammount` */

/*Table structure for table `sells_return` */

DROP TABLE IF EXISTS `sells_return`;

CREATE TABLE `sells_return` (
  `id` int(100) default NULL,
  `cname` varchar(100) default NULL,
  `madecine` varchar(100) default NULL,
  `quantity` int(100) default NULL,
  `price` int(100) default NULL,
  `date` date default NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sells_return` */

/*Table structure for table `supplier_info` */

DROP TABLE IF EXISTS `supplier_info`;

CREATE TABLE `supplier_info` (
  `id` int(100) default NULL,
  `name` varchar(100) default NULL,
  `mobile` varchar(100) default NULL,
  `date` date default NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `supplier_info` */

insert  into `supplier_info`(`id`,`name`,`mobile`,`date`) values (1,'Jasmin','01882209965','2019-12-25'),(2,'naima','01887765543','2019-12-26'),(3,'Nabila','01887765544','2019-12-26'),(NULL,'Sharmin','01889976654','2019-12-26'),(NULL,'Faruk','01887765543','2019-12-26'),(NULL,'Arif','01876548879','2019-12-26'),(NULL,'Nadiya','01855669824','2020-03-26'),(NULL,'Abir','023747823223','2020-12-12');

/*Table structure for table `user_accounts` */

DROP TABLE IF EXISTS `user_accounts`;

CREATE TABLE `user_accounts` (
  `id` varchar(100) default NULL,
  `username` varchar(100) default NULL,
  `password` int(100) default NULL,
  `status` varchar(100) default 'user'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_accounts` */

insert  into `user_accounts`(`id`,`username`,`password`,`status`) values ('user123','jasmin',123456,'User'),('admin123','admin',123456,'Admin'),('sawalid','sawal',12345,'User'),('tareqpin','tarek',12345,'User'),('user123','jesi',1234567,'User');

/*Table structure for table `user_id` */

DROP TABLE IF EXISTS `user_id`;

CREATE TABLE `user_id` (
  `id` varchar(100) default NULL,
  `status` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_id` */

insert  into `user_id`(`id`,`status`) values ('user123','User'),('admin123','Admin'),('sawalid','User'),('tareqpin','User'),('23','Admin'),('1','Admin');

/*Table structure for table `pur_quantity` */

DROP TABLE IF EXISTS `pur_quantity`;

/*!50001 DROP VIEW IF EXISTS `pur_quantity` */;
/*!50001 DROP TABLE IF EXISTS `pur_quantity` */;

/*!50001 CREATE TABLE  `pur_quantity`(
 `medecine` varchar(100) ,
 `pur_quantity` decimal(32,0) 
)*/;

/*Table structure for table `sell_quantity` */

DROP TABLE IF EXISTS `sell_quantity`;

/*!50001 DROP VIEW IF EXISTS `sell_quantity` */;
/*!50001 DROP TABLE IF EXISTS `sell_quantity` */;

/*!50001 CREATE TABLE  `sell_quantity`(
 `madecine` varchar(100) ,
 `sells_quantity` decimal(32,0) 
)*/;

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

/*!50001 DROP VIEW IF EXISTS `stock` */;
/*!50001 DROP TABLE IF EXISTS `stock` */;

/*!50001 CREATE TABLE  `stock`(
 `Madicine_Name` varchar(100) ,
 `pur` decimal(32,0) ,
 `sales` decimal(32,0) 
)*/;

/*View structure for view pur_quantity */

/*!50001 DROP TABLE IF EXISTS `pur_quantity` */;
/*!50001 DROP VIEW IF EXISTS `pur_quantity` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `pur_quantity` AS select `purchase`.`medecine` AS `medecine`,sum(`purchase`.`quantity`) AS `pur_quantity` from `purchase` group by `purchase`.`medecine` */;

/*View structure for view sell_quantity */

/*!50001 DROP TABLE IF EXISTS `sell_quantity` */;
/*!50001 DROP VIEW IF EXISTS `sell_quantity` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `sell_quantity` AS select `sells`.`madecine` AS `madecine`,sum(`sells`.`quantity`) AS `sells_quantity` from `sells` group by `sells`.`madecine` */;

/*View structure for view stock */

/*!50001 DROP TABLE IF EXISTS `stock` */;
/*!50001 DROP VIEW IF EXISTS `stock` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `stock` AS select `pur_quantity`.`medecine` AS `Madicine_Name`,`pur_quantity`.`pur_quantity` AS `pur`,`sell_quantity`.`sells_quantity` AS `sales` from (`pur_quantity` left join `sell_quantity` on((`pur_quantity`.`medecine` = `sell_quantity`.`madecine`))) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
