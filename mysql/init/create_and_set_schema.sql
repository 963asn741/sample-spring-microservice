CREATE DATABASE IF NOT EXISTS sample_service;
CREATE USER IF NOT EXISTS service_user IDENTIFIED BY 'password';

GRANT all privileges ON sample_service.* TO service_user;

USE sample_service;