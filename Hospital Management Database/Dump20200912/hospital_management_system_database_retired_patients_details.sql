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
-- Table structure for table `retired_patients_details`
--

DROP TABLE IF EXISTS `retired_patients_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `retired_patients_details` (
  `Patient_ID` varchar(10) NOT NULL,
  `Patient_Name` varchar(70) DEFAULT NULL,
  `Doctor_Name` varchar(70) DEFAULT NULL,
  `Date_Of_Last_Checked` date DEFAULT NULL,
  `Telephone_Number` varchar(15) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Patient_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `retired_patients_details`
--

LOCK TABLES `retired_patients_details` WRITE;
/*!40000 ALTER TABLE `retired_patients_details` DISABLE KEYS */;
INSERT INTO `retired_patients_details` VALUES ('','','','2019-08-02','',''),('RP001','Sadun De Silva','Dr. Amaya Fernando','2019-08-15','011-4856355','Pannipitiya'),('RP002','Saumya Fernando','Dr. Maln Abdul','2019-08-02','077-5846912','Rathnapura'),('RP003','Saraswathi Gunapala','Dr. Dananjaya','2019-07-17','077-5366142','Anuradapura'),('RP004','Kamal Dewappriya','Dr. Amila Fernando','2019-08-08','077-5856584','Kurunagala'),('RP005','Sanduni  Damsara','Dr. Kamal Fernando','2019-08-09','077-5854739','Galle'),('RP006','Dilshan Aravinda','Dr. Kamali Fernando','2019-08-22','077-5857439','Giriulla'),('RP007','Kamal Weerasinghe','Dr. Namal','2019-08-08','077-5507410','Puttlam'),('RP008','Gunapala Malalasekara','De. Ariyadasa','2019-08-02','077-5841236','Galle');
/*!40000 ALTER TABLE `retired_patients_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-12 21:47:09
