# java-simple_mvc_jdbc_example
Small java code to retreive data from database using jdbc connector and displaying it in table using MVC pattern

I  used following sql commands

CREATE DATABASE 'jdbc';
USE 'jdbc';

CREATE TABLE `actor` (
  `id` int(11) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `actor` (`id`, `age`, `name`) VALUES
(1, 30, 'aayush'),
(2, 23, 'anish'),
(3,11,'sunil');

