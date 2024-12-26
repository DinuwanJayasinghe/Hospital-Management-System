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
-- Table structure for table `expenditure_details`
--

DROP TABLE IF EXISTS `expenditure_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expenditure_details` (
  `ID_Nunber` varchar(8) NOT NULL,
  `Period` varchar(45) DEFAULT NULL,
  `Cost_for_Medicine` varchar(45) DEFAULT NULL,
  `Cost_for_Vehicales` varchar(45) DEFAULT NULL,
  `Cost_for_Salaries` varchar(45) DEFAULT NULL,
  `Cost_of_Maintaince` varchar(45) DEFAULT NULL,
  `Total_Cost` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Nunber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expenditure_details`
--

LOCK TABLES `expenditure_details` WRITE;
/*!40000 ALTER TABLE `expenditure_details` DISABLE KEYS */;
INSERT INTO `expenditure_details` VALUES ('E001','Jun 2019  - Jul 2019 ','Rs.40,000.00','Rs.40,000.00','Rs.40,000.00','Rs.40,000.00','Rs. 170,000.00'),('E002','Ju; 2019 - Aug 2019','Rs. 55,000.00','Rs. 55,000.00','Rs. 55,000.00','Rs. 55,000.00','220,000.00'),('E003','Aug 2019 to Sep 2019','20,000.00','20,000.00','20,000.00','20,000.00','100,000.00'),('E004','Sep 2019 - Oct 2019','Rs 30,000.00','Rs 30,000.00','Rs 30,000.00','Rs 30,000.00','120,000.00'),('E005','Oct 2019 - Nov 2019','Rs. 60,000.00','Rs. 60,000.00','Rs. 60,000.00','Rs. 60,000.00','Rs.240,000.00');
/*!40000 ALTER TABLE `expenditure_details` ENABLE KEYS */;
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
