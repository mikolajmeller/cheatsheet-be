CREATE DATABASE `${serviceName}` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS '${dbUser}'@'%' IDENTIFIED BY '${dbPassword}';
GRANT ALL PRIVILEGES on `${serviceName}`.* to '${dbUser}'@'%';
