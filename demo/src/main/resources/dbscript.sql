-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.12 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for movie
DROP DATABASE IF EXISTS `movie`;
CREATE DATABASE IF NOT EXISTS `movie` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `movie`;

-- Dumping structure for table movie.booking
DROP TABLE IF EXISTS `booking`;
CREATE TABLE IF NOT EXISTS `booking` (
  `id` bigint(20) DEFAULT NULL,
  `showid` bigint(20) DEFAULT NULL,
  `seats` varchar(50) DEFAULT NULL,
  `seatcount` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table movie.hibernate_sequence
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table movie.movie
DROP TABLE IF EXISTS `movie`;
CREATE TABLE IF NOT EXISTS `movie` (
  `id` bigint(20) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `language` varchar(50) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table movie.showdetails
DROP TABLE IF EXISTS `showdetails`;
CREATE TABLE IF NOT EXISTS `showdetails` (
  `id` bigint(20) DEFAULT NULL,
  `thid` bigint(20) DEFAULT NULL,
  `mvid` bigint(20) DEFAULT NULL,
  `showshr` int(11) DEFAULT NULL,
  `showsmn` int(11) DEFAULT NULL,
  `showehr` int(11) DEFAULT NULL,
  `showemn` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

-- Dumping structure for table movie.theater
DROP TABLE IF EXISTS `theater`;
CREATE TABLE IF NOT EXISTS `theater` (
  `id` bigint(20) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `capacity` int(11) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Data exporting was unselected.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
