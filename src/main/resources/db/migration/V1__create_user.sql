CREATE TABLE `portifolio-spring`.`user` (
  `id` INT(12) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(150) NULL,
  `status` CHAR(1) default 'A' NULL ,
  `email` VARCHAR(200) NULL,
  `password` VARCHAR(200) NULL,
  PRIMARY KEY (`id`));