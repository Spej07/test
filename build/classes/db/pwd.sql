-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2025 at 05:10 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pwd`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `r_id` int(20) NOT NULL,
  `r_fname` varchar(55) NOT NULL,
  `r_lname` varchar(55) NOT NULL,
  `r_username` varchar(55) NOT NULL,
  `r_password` varchar(55) NOT NULL,
  `r_age` varchar(55) NOT NULL,
  `r_address` varchar(55) NOT NULL,
  `r_pwdstatus` varchar(55) NOT NULL,
  `r_type` varchar(55) NOT NULL,
  `r_status` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`r_id`, `r_fname`, `r_lname`, `r_username`, `r_password`, `r_age`, `r_address`, `r_pwdstatus`, `r_type`, `r_status`) VALUES
(15, 'sdfsdfsdf', 'sdfsdfsd', 'Valen123', 'Valen123456', '25', 'Minglanilla', 'Nothing', 'Admin', 'Active'),
(16, 'adfasdasda', 'sgdsfgfdgdfgdfg', 'Valen123456', 'Valen0990', '25', 'Minglanilla', 'Nothing', 'Resident', 'PENDING'),
(17, 'Valen', 'Justine', 'justinev', 'justineianv', '25', 'Minglanilla', 'Nothing', 'Resident', 'Active'),
(18, 'Lilwayne', 'Waynlee', 'Lilwayne', 'nzKSgNCHLGRQVGoIPBtuOKosfi9v4QOl6CGhz9qa5NY=', '30', 'Cebu City', 'One Leg', 'Resident', 'Active'),
(19, 'Winstonlee', 'Leebat', 'Leebat1', '5UuK4EbB9gi8+PCUnacjbmYYPXooUGAMyJ2HFkROlXk=', '25', 'Minglanilla', 'Nothing', 'Resident', 'Active'),
(20, 'KUlas', 'Kulalas', 'Leebat12', '5UuK4EbB9gi8+PCUnacjbmYYPXooUGAMyJ2HFkROlXk=', '25', 'Minglanilal', 'Nothing', 'Resident', 'PENDING'),
(21, 'Jeps', 'Jepsie', 'Spej07', '5By5TwYK/C3U31EISFyD+TqtryLHG+xtaIFaV3hBQ/g=', '25', 'Cebu City', 'Nothing', 'Admin', 'Active'),
(22, 'Jakstone', 'Stoneford', 'Stoneford', '5L2zOi8XLtzmAsBtgQmFPFIirgs3xQnqIsgXoldBhCg=', '30', 'Calajoan', 'Nothing', 'Admin', 'Active'),
(23, 'Jose ', 'Rizal', 'Rizaljose', 'jTNGLJwuiiO7OnByvHyrxb9G9ERZgyW47JnwSr+iJYU=', '40', 'Maynila', 'Kupal', 'Resident', 'Active'),
(24, 'test', 'test', 'test12', 'hXd/JwrXzyp5CYG7rjxOSEodxV4kp3OQ1pL78c/6Evo=', 'test', 'test', 'test', 'Resident', 'Active'),
(25, 'Admi', 'Admn', 'Admin12', 'O2Esdae1BIpDX7bsgeUv+S1teVqLWpwXBw9qY8l6U7I=', '29', 'Cebu', 'Nothing', 'Admin', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`r_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `r_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
