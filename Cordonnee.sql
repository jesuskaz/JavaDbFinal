-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 10, 2019 at 11:16 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Cordonnee`
--

-- --------------------------------------------------------

--
-- Table structure for table `Bloquer`
--

CREATE TABLE `Bloquer` (
  `id` int(255) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `adresse` varchar(30) NOT NULL,
  `tel` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Bloquer`
--

INSERT INTO `Bloquer` (`id`, `nom`, `prenom`, `adresse`, `tel`) VALUES
(1, 'bonjour', 'comment', 'jesus', 'kazembe'),
(2, 'Kidinda', 'Kazembe Jesus', '123,makomeno,City', '0970719030'),
(3, '8', '', '', ''),
(4, '', '', '', ''),
(5, '', '', '', ''),
(6, '', '', '', ''),
(7, 'kazembe', 'kidinda', 'Fils', '0970719030'),
(8, 'Kazembe', 'kfkzdflkdfk', 'fkkdskfksl', 'gfdsklgdklgk'),
(9, 'jesus', 'jesus', 'jesus', 'jesus');

-- --------------------------------------------------------

--
-- Table structure for table `Favori`
--

CREATE TABLE `Favori` (
  `id` int(255) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `adresse` varchar(30) NOT NULL,
  `tel` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Favori`
--

INSERT INTO `Favori` (`id`, `nom`, `prenom`, `adresse`, `tel`) VALUES
(1, 'kazembe', 'kidinda', 'Fils', '0970719030'),
(3, 'jsafjkl', 'djfklds', 'dkjfldsjf', 'dkjsffjdsfjsd'),
(4, 'Kindsdshdj', 'PFSFSPF', 'OODFDF', 'KKFDKFK'),
(5, 'KING', 'KAzwmbw', 'Kidins', 'KKFDKFK'),
(16, 'Kazembe', 'kfkzdflkdfk', 'fkkdskfksl', 'gfdsklgdklgk'),
(17, '', '', '', ''),
(18, 'vx;dlkj;', 'fjkdfl', 'jkfdsljgf', 'dv;skjg'),
(19, '', '', '', ''),
(20, 'dsfklds[v', 'sdfk[', 'sdvkg', 'f[dgkpg'),
(21, 'Kazembe', 'Kidinda', 'Jesus', '0970719030'),
(22, 'dsfklds[v', 'sdfk[', 'sdvkg', 'f[dgkpg'),
(23, 'Kazembe', 'Kidinda', 'Jesus', '0970719030'),
(24, 'jesus', 'jesus', 'jesus', 'jesus');

-- --------------------------------------------------------

--
-- Table structure for table `Favoris`
--

CREATE TABLE `Favoris` (
  `id` int(11) NOT NULL,
  `nom` int(11) NOT NULL,
  `prenom` int(11) NOT NULL,
  `adresse` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `info`
--

CREATE TABLE `info` (
  `id` int(255) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `adresse` varchar(30) NOT NULL,
  `tel` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info`
--

INSERT INTO `info` (`id`, `nom`, `prenom`, `adresse`, `tel`) VALUES
(6, 'Kazembe', 'kfkzdflkdfk', 'fkkdskfksl', 'gfdsklgdklgk'),
(8, 'vx;dlkj;', 'fjkdfl', 'jkfdsljgf', 'dv;skjg'),
(9, 'gfsdg', 'fsefd', 'fesf', 'fsdgf'),
(10, 'dsfklds[v', 'sdfk[', 'sdvkg', 'f[dgkpg'),
(11, 'jesus', 'kazembe', 'kidinda', 'Fils'),
(12, 'jesus', 'kazembe', 'kidinda', 'Fils'),
(13, 'King', 'Jesus', 'Kidinda', '0970719030'),
(14, '', '', '', ''),
(15, '', '', '', ''),
(16, 'Kidinda', 'Kazembe Jesus', '123,makomeno,City', '0970719030'),
(17, 'Kazembe', 'Kidinda', 'Jesus', '0970719030'),
(18, 'Kazembe', 'Kidinda', 'Jesus', '0970719030'),
(19, 'Kazembe', 'Kidinda', 'Jesus', '0970719030');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Bloquer`
--
ALTER TABLE `Bloquer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Favori`
--
ALTER TABLE `Favori`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `info`
--
ALTER TABLE `info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Bloquer`
--
ALTER TABLE `Bloquer`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `Favori`
--
ALTER TABLE `Favori`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `info`
--
ALTER TABLE `info`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
