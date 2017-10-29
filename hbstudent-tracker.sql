CREATE DATABASE IF NOT EXISTS hb_student_tracker ;
USE hb_student_tracker;

--
-- Table structure for table student
--

DROP TABLE IF EXISTS student;

CREATE TABLE student (
	id int(11) NOT NULL auto_increment  ,
    first_name VARCHAR(45) DEFAULT NULL,
    last_name VARCHAR(45) DEFAULT NULL,
    email VARCHAR(45) DEFAULT NULL,
    PRIMARY KEY (id)
)  ENGINE = InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=Latin1;

