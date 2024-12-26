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
-- Table structure for table `channeling_details`
--

DROP TABLE IF EXISTS `channeling_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `channeling_details` (
  `Channeling_Number` varchar(12) NOT NULL,
  `Patient_Name` varchar(45) DEFAULT NULL,
  `Doctor_Name` varchar(45) DEFAULT NULL,
  `Patient_Telphone_Number` varchar(45) DEFAULT NULL,
  `Patient_Address` varchar(45) DEFAULT NULL,
  `Channeling_Cost` varchar(45) DEFAULT NULL,
  `Duration_Period` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Channeling_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `channeling_details`
--

LOCK TABLES `channeling_details` WRITE;
/*!40000 ALTER TABLE `channeling_details` DISABLE KEYS */;
INSERT INTO `channeling_details` VALUES ('C001','Mr.Rathanaweera Gunapala','Dr.Ariyawansha','077-5891235','No 56 Kollupitiya Road, Kollupitiya','Rs. 2500.00','After 6 Months '),('C002','Ms Prasdini Chandima','Dr.Abishek Fernandez','011-5828552','No 67 Kelaniya road Colombo','Rs. 1500.00','After 3 Months '),('C003','Ms. Sayuri Chamathka','Dr. Ananda Abecon','077-5281278','Galle','Rs. 1500.00','After 6 months');
/*!40000 ALTER TABLE `channeling_details` ENABLE KEYS */;
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
