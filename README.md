据说，有小伙伴说我没写建表语句。在此处补上。
1、bookdetail表
CREATE TABLE `bookdetail` (
  `idbookdetail` int(11) NOT NULL,
  `bookcontent` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `idreal` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idreal`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
2、booklist表
CREATE TABLE `booklist` (
  `idbook` int(11) NOT NULL,
  `bookname` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `bookwriter` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idbook`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
3、stuclass表
CREATE TABLE `stuclass` (
  `idstuclass` int(11) NOT NULL,
  `stuclassname` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `stuclassdetail` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `idstudent` int(11) DEFAULT NULL,
  PRIMARY KEY (`idstuclass`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
4、student表
CREATE TABLE `student` (
  `idstudent` int(11) NOT NULL,
  `studentname` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idstudent`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
5、userinfo表
CREATE TABLE `userinfo` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`password`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1