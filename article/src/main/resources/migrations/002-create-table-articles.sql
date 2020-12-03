--liquibase formatted sql
--changeset mikolajmeller:1
CREATE TABLE `articles` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `category_id` INT NOT NULL,
    `title` VARCHAR(255) NOT NULL UNIQUE,
    `content` MEDIUMTEXT,
    `created` DATETIME DEFAULT NOW(),
    INDEX `articles__category_id` (`category_id`)
);
--rollback DROP TABLE `articles`;