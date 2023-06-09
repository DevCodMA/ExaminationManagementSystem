-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2021 at 08:23 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ems`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `uname` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`uname`, `password`) VALUES
('admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `eid` varchar(12) DEFAULT NULL,
  `ename` varchar(40) DEFAULT NULL,
  `max` int(11) DEFAULT NULL,
  `min` int(11) DEFAULT NULL,
  `date` varchar(12) DEFAULT NULL,
  `time` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`eid`, `ename`, `max`, `min`, `date`, `time`) VALUES
('COSC21', 'Computer Science', 50, 25, 'DEC 17, 2021', 10),
('CYFO21', 'Cyber Forensic', 50, 25, 'DEC 24, 2021', 10),
('COOR21', 'Computer Organization', 50, 25, 'DEC 24, 2021', 10),
('NENE21', 'Neural Network', 50, 25, 'DEC 24, 2021', 10),
('NEFU21', 'Networking Fundamentals', 50, 25, 'DEC 24, 2021', 10),
('DIEL21', 'Digital Electronics', 50, 25, 'DEC 24, 2021', 10);

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `qid` varchar(12) NOT NULL,
  `exam` varchar(40) DEFAULT NULL,
  `qstn` varchar(400) DEFAULT NULL,
  `op1` varchar(200) DEFAULT NULL,
  `op2` varchar(200) DEFAULT NULL,
  `op3` varchar(200) DEFAULT NULL,
  `op4` varchar(200) DEFAULT NULL,
  `ans` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`qid`, `exam`, `qstn`, `op1`, `op2`, `op3`, `op4`, `ans`) VALUES
('COSC2101', 'COSC21', 'Who invented C Language?', 'Charles Babbage', 'Grahambel', 'Dennis Ritchie', 'Steve Jobs', 'Dennis Ritchie'),
('COSC2102', 'COSC21', 'C Language is a successor to which language?', 'FORTRAN', 'D Language', 'BASIC', 'B Language', 'B Language'),
('COSC2103', 'COSC21', 'High level language is a?', 'Human readable like language.', 'language with small program size.', 'language with big program size.', 'language which is difficult to understand and not human readable.', 'Human readable like language.'),
('COSC2104', 'COSC21', 'Which program outputs \"Hello World..\" ?', 'printf(\"Hello World..\");', 'scanf(\"Hello World..\"); ', 'print(\"Hello World..\");', 'scan(\"Hello World..\");', 'printf(\"Hello World..\");'),
('COSC2105', 'COSC21', 'C language was invented in which laboratories?', 'Uniliver Labs', 'IBM Labs', 'AT&T Bell Labs', 'Verizon Labs', 'AT&T Bell Labs'),
('COSC2106', 'COSC21', 'BCPL Language is also called..?', 'C Language', 'B Language', 'D Language', 'None', 'C Language'),
('COSC2107', 'COSC21', 'C language was invented to develop which Operating System.?', 'Android', 'Linux', 'Ubuntu', 'Unix', 'Unix'),
('COSC2108', 'COSC21', 'A C program is a combination of.?', 'Statements', 'Functions', 'Variables', 'All of the above', 'All of the above'),
('COSC2109', 'COSC21', 'Of the following, if statements, which one correctly executes three instructions if the condition is true?', '  If (x < 0) a = b * 2; y = x; z = a – y;', ' { if (x < 0) a = b * 2; y = x; z = a – y; }', 'If{ (x < 0) a = b * 2; y = x; z = a – y ; }', 'If (x < 0) { a = b * 2; y = x; z = a – y; }', 'If (x < 0) { a = b * 2; y = x; z = a – y; }'),
('COSC2110', 'COSC21', 'Which of the sets of statements below will add 1 to x if x is positive and subtract 1 from x if x is negative but leave x alone if x is 0?', ' If (x > 0) x++; else x--;', 'If (x > 0) x++; else if (x < 0) x--;', ' If (x == 0) x = 0; else x++; x--;', ' X++; x--;', ' If (x > 0) x++; else x--;');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `sid` varchar(12) DEFAULT NULL,
  `eid` varchar(12) DEFAULT NULL,
  `min` int(11) DEFAULT NULL,
  `max` int(11) DEFAULT NULL,
  `awarded` int(11) DEFAULT NULL,
  `status` varchar(6) DEFAULT NULL,
  `publish` varchar(1) NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`sid`, `eid`, `min`, `max`, `awarded`, `status`, `publish`) VALUES
('180021030987', 'COSC21', 25, 50, 50, 'PASS', 'N'),
('180021030987', 'COSC21', 25, 50, 50, 'PASS', 'N'),
('180021030986', 'COSC21', 25, 50, 15, 'FAIL', 'N'),
('180021030986', 'COSC21', 25, 50, 5, 'FAIL', 'N');

-- --------------------------------------------------------

--
-- Table structure for table `stddetails`
--

CREATE TABLE `stddetails` (
  `sid` varchar(12) NOT NULL,
  `sname` varchar(40) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `stream` varchar(24) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stddetails`
--

INSERT INTO `stddetails` (`sid`, `sname`, `email`, `stream`, `password`) VALUES
('180021030986', 'Mithun P. M', 'midhunpm51@gmail.com', 'Computer Science', '123456'),
('180021030987', 'Muhammed Ajmal', 'majmals1998@gmail.com', 'Computer Science', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`uname`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`qid`);

--
-- Indexes for table `stddetails`
--
ALTER TABLE `stddetails`
  ADD PRIMARY KEY (`sid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
