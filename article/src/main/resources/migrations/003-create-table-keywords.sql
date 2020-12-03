--liquibase formatted sql
--changeset mikolajmeller:1
CREATE TABLE `keywords` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `article_id` INT NOT NULL,
    `name` VARCHAR(255) NOT NULL UNIQUE,
    `description` MEDIUMTEXT,
    INDEX `keywords__article_id` (`article_id`),
    INDEX `keywords__name` (`name`)
);
--rollback DROP TABLE `keywords`;