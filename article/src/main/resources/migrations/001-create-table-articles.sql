--liquibase formatted sql
--changeset mikolajmeller:1
CREATE TABLE articles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content MEDIUMTEXT,
    updated DATETIME DEFAULT NOW(),
    INDEX idx__article__title (title)
);
--rollback DROP TABLE article;