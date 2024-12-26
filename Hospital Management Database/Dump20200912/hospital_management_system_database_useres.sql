-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: hospital_management_system_database
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `useres`
--

DROP TABLE IF EXISTS `useres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `useres` (
  `NIC_No` varchar(45) NOT NULL,
  `Usename` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `Re_Enter_Password` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `Full_name` varchar(450) DEFAULT NULL,
  `Date_Of_Birth` date DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `image_path` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`NIC_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `useres`
--

LOCK TABLES `useres` WRITE;
/*!40000 ALTER TABLE `useres` DISABLE KEYS */;
INSERT INTO `useres` VALUES ('19953460379','admin','123456','123456','076-6661951','Dinuwan Theekshana','1995-12-11','Male','E:\\My Java Projects\\Hospital_Management_System\\User_Image\\2_ingoscholtes_switzerland.jpg'),('675468321','Kusuma','200300','200300','071-5283347','Ms. Kuaumawathi Gamage','1967-09-18','Female','E:\\My Java Projects\\Hospital_Management_System\\User_Image\\Audi-R8-TDI-Le-Mans-Red-audi-wallpapers-car-wallpapers-1280x1024.jpg'),('87471633188','Kasun','1234','1234','077-2525548','Mr. Kasun Perera','2020-08-06','Male','E:\\My Java Projects\\Hospital_Management_System\\User_Image\\5_ingoscholtes_germany.jpg'),('8841236940','piumal','369','369','071-2045743','Piumal Ruwanditha','1989-05-12','Male','E:\\My Java Projects\\Hospital_Management_System\\User_Image\\6_ingoscholtes_sardinia.jpg'),('8854324593','Sandu','1234','1234','077-5821486','Ms. Sanduni Nimesha','1988-08-18','Female','E:\\My Java Projects\\Hospital_Management_System\\User_Image\\hd-wallpapers-1080p-2.jpg'),('9212453631','Fathima','2357','2357','078-2527745','Ms. Nazeera Fathima','1992-09-11','Female','E:\\My Java Projects\\Hospital_Management_System\\User_Image\\8.jpg'),('953463709','Administrator','2703700','2703700','076-6661951','Dinuwan Theekshana','1995-12-11','Male','E:\\My Java Projects\\Hospital_Management_System\\User_Image\\MVIMG_20190804_095004~2.jpg'),('97145633840','Samith','2468','2468','078-5856514','Mr. Samith Fernando','1997-08-29','Male','E:\\My Java Projects\\Hospital_Management_System\\User_Image\\Wallpapers-1080p-Full-HD.jpg'),('9858453145','Warsha','13579','13579','071-5893214','Ms. Warsha Saandamini','1998-07-08','Female','E:\\My Java Projects\\Hospital_Management_System\\User_Image\\Alone-Girl-on-Road-HD-Wallpapers-3.jpg');
/*!40000 ALTER TABLE `useres` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-12 21:47:08
