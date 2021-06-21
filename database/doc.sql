-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 21, 2021 at 10:55 AM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `doctordb`
--

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

DROP TABLE IF EXISTS `details`;
CREATE TABLE IF NOT EXISTS `details` (
  `name` varchar(250) DEFAULT NULL,
  `vaccine` varchar(150) DEFAULT NULL,
  `aadhar` varchar(200) DEFAULT NULL,
  `mobile_number` varchar(150) DEFAULT NULL,
  `Amount` varchar(100) DEFAULT NULL,
  `Disability` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `Reg_Date` varchar(150) DEFAULT NULL,
  `Recevied_Date` varchar(150) DEFAULT NULL,
  `Payment` varchar(100) DEFAULT NULL,
  `Dose` varchar(100) DEFAULT NULL,
  `Status` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`name`, `vaccine`, `aadhar`, `mobile_number`, `Amount`, `Disability`, `age`, `Reg_Date`, `Recevied_Date`, `Payment`, `Dose`, `Status`) VALUES
('SABHAPATHI', 'PFIZER', '243887465236', '6263828196', '1500.0', 'No', '21', '2021-06-25', '2021-06-27', 'paid', 'First', 'Received'),
('LIKITH', 'NOVAVAX', '241569872051', '9568741235', '1140.0', 'No', '18', '2021-06-29', '2021-02-05', 'paid', 'First', 'Received'),
('RAMA', 'PFIZER', '245698712302', '6578942610', '1200.0', 'Yes', '35', '2021-07-05', '2021-07-07', 'paid', 'Second', 'Received'),
('DASTAGHEER', 'SPUTNIK V', '241597863025', '6254789102', '800.0', 'No', '22', '2021-06-25', '2021-06-28', 'paid', 'Second', 'Received'),
('RAJU', 'MODERNA', '258963147258', '9873546210', '2375.0', 'No', '30', '2021-06-23', '2021-06-25', 'Not paid', 'Second', 'Not Received'),
('SHIVAKUMAR', 'COVAXIN', '254687912312', '7896325410', '190.0', 'No', '20', '2021-07-01', '2021-07-05', 'paid', 'Second', 'Received');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
