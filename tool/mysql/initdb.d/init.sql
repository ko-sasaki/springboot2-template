
SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;

SET NAMES utf8mb4;

CREATE DATABASE `demo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
CREATE DATABASE `demo_admin` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

CREATE USER 'demo-user'@'%' IDENTIFIED BY 'demo-password';
CREATE USER 'demo-admin'@'%' IDENTIFIED BY 'demo-password';

GRANT ALL ON `demo`.* TO 'demo-user'@'%'  WITH GRANT OPTION;
GRANT ALL ON `demo`.* TO 'demo-admin'@'%'  WITH GRANT OPTION;
GRANT ALL ON `demo_admin`.* TO 'demo-admin'@'%'  WITH GRANT OPTION;
