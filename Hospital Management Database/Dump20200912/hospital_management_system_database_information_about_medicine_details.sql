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
-- Table structure for table `information_about_medicine_details`
--

DROP TABLE IF EXISTS `information_about_medicine_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `information_about_medicine_details` (
  `ID_Number` varchar(10) NOT NULL,
  `Name_of_medicine` varchar(100) DEFAULT NULL,
  `Expiar_Date` date DEFAULT NULL,
  `Manifactured_Date` date DEFAULT NULL,
  `Quontity` varchar(45) DEFAULT NULL,
  `Price_of_the_one_medicine` varchar(45) DEFAULT NULL,
  `Descriotion_about_medicine` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `information_about_medicine_details`
--

LOCK TABLES `information_about_medicine_details` WRITE;
/*!40000 ALTER TABLE `information_about_medicine_details` DISABLE KEYS */;
INSERT INTO `information_about_medicine_details` VALUES ('M001','Parasitamol','2025-08-08','2020-08-08','2000','Rs 15.00','Use for headek'),('M002','Panadol','2025-08-20','2020-08-20','5000','Rs. 10.00','Use for headek'),('M003','Pricium','2025-08-22','2020-08-22','1000','Rs 18.00','Use for fit'),('M004','Ceptol CR 200 ','2027-08-08','2020-08-08','1000','Rs 22.00','Use for fit'),('M005','Vitermine C','2022-08-25','2020-08-25','2000','Rs 10.00','Use for semen');
/*!40000 ALTER TABLE `information_about_medicine_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-12 21:47:07
