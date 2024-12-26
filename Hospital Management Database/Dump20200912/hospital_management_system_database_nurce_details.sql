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
-- Table structure for table `nurce_details`
--

DROP TABLE IF EXISTS `nurce_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nurce_details` (
  `Nurce_ID` varchar(12) NOT NULL,
  `Nurce_Name` varchar(45) DEFAULT NULL,
  `Level` varchar(45) DEFAULT NULL,
  `Section_or_Word` varchar(150) DEFAULT NULL,
  `Phone_Number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Nurce_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nurce_details`
--

LOCK TABLES `nurce_details` WRITE;
/*!40000 ALTER TABLE `nurce_details` DISABLE KEYS */;
INSERT INTO `nurce_details` VALUES ('N001','Ms.Kanchana Fernando','Level 2','Operation Theorter','077-5254782'),('N002','Ms.Malika Siriwardana','Level 1','War Number 15','074-582311'),('N003','Ms Kavvessha Gamage','Level 4','I.C.U','077-5826931'),('N004','Shananee Fernando','Level 2','Word 2 (Assistent Nurce)','071-2596351'),('N005','Samanthika Dilshani','Level 2','Wars No 02','077 - 5286481');
/*!40000 ALTER TABLE `nurce_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-12 21:47:06
