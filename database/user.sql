-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 21, 2021 at 10:56 AM
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
-- Database: `userdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

DROP TABLE IF EXISTS `details`;
CREATE TABLE IF NOT EXISTS `details` (
  `username` varchar(250) DEFAULT NULL,
  `aadhar` varchar(250) DEFAULT NULL,
  `mobile_number` varchar(150) DEFAULT NULL,
  `vaccine` varchar(100) DEFAULT NULL,
  `address` text,
  `gender` varchar(100) DEFAULT NULL,
  `Disability` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `district` varchar(100) DEFAULT NULL,
  `Pin` varchar(100) DEFAULT NULL,
  `Ref_number` varchar(100) DEFAULT NULL,
  `Amount` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`username`, `aadhar`, `mobile_number`, `vaccine`, `address`, `gender`, `Disability`, `age`, `Date`, `state`, `district`, `Pin`, `Ref_number`, `Amount`) VALUES
('LIKITH', '241569872051', '9568741235', 'NOVAVAX', 'tagrpura,T narsepura,mysore karnataka', 'Male', 'No', '18', '2021-06-29', 'karnataka', 'MYSORE', '570000', 'LIK2051', '1140.0'),
('DASTAGHEER', '241597863025', '6254789102', 'SPUTNIK V', 'Musheerabad,Hyderabad ', 'Male', 'No', '22', '2021-06-25', 'Hyderabad ', 'MUSHEERABAD', '500020', 'DAS3025', '800.0'),
('RAMA', '245698712302', '6578942610', 'PFIZER', 'mamballi,chamarajanagar,karnataka', 'Others', 'Yes', '35', '2021-07-05', 'karnataka', 'CHAMARAJANAGAR', '571442', 'RAM2302', '1200.0'),
('RAJU', '258963147258', '9873546210', 'MODERNA', '2nd stage,kuvempunagar,mysore,karntaka', 'Male', 'No', '30', '2021-06-23', 'karnataka', 'MYSORE', '570001', 'RAJ7258', '2375.0'),
('RAMADEVI', '254698712302', '8796541230', 'COVIDSHEILD', 'shanthigeri,shivamogha,karnataka', 'Female', 'Yes', '50', '2021-06-28', 'karnataka', 'SHIVAMOGA', '571534', 'RAM2302', '850.0'),
('SHIVAKUMAR', '254687912312', '7896325410', 'COVAXIN', 'kollegal,chamarajanagar,karnataka', 'Male', 'No', '20', '2021-07-01', 'karnataka', 'CHMARAJANAGAR', '571400', 'SHI2312', '190.0'),
('SABHAPATHI', '243887465236', '6263828196', 'PFIZER', 'mamballi,chamarajanagar,karnataka', 'Male', 'No', '21', '2021-06-25', 'karnataka', 'CHAMARAJANAGAR', '571442', 'SAB5236', '1500.0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
