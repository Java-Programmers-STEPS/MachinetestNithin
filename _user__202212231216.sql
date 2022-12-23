INSERT INTO javadb_167.`user` (Full_Name,DOB,Email_Id) VALUES
	 ('Sam','0000-00-00','sam@gmail.com');
	 
	 -- javadb_167.`user` definition

CREATE TABLE `user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Full_Name` varchar(45) NOT NULL,
  `DOB` date NOT NULL,
  `Email_Id` varchar(45) NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=latin1;
