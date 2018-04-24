-- MySQL Script generated by MySQL Workbench
-- Mon Apr 23 09:42:04 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema puntoventa
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema puntoventa
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `puntoventa` DEFAULT CHARACTER SET utf8 ;
USE `puntoventa` ;

-- -----------------------------------------------------
-- Table `puntoventa`.`proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa`.`proveedor` (
  `id_proveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `empresa` VARCHAR(45) NULL,
  PRIMARY KEY (`id_proveedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `puntoventa`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa`.`producto` (
  `id_producto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `precio` FLOAT NULL,
  `clasificacion` VARCHAR(45) NULL,
  `tipo` VARCHAR(45) NULL,
  `proveedor_id_proveedor` INT NOT NULL,
  PRIMARY KEY (`id_producto`),
  INDEX `fk_producto_proveedor1_idx` (`proveedor_id_proveedor` ASC),
  CONSTRAINT `fk_producto_proveedor1`
    FOREIGN KEY (`proveedor_id_proveedor`)
    REFERENCES `puntoventa`.`proveedor` (`id_proveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `puntoventa`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa`.`venta` (
  `id_venta` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL,
  `total` FLOAT NULL,
  PRIMARY KEY (`id_venta`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `puntoventa`.`compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa`.`compra` (
  `id_compra` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL,
  `total` FLOAT NULL,
  PRIMARY KEY (`id_compra`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `puntoventa`.`existencias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa`.`existencias` (
  `id_existencias` INT NOT NULL AUTO_INCREMENT,
  `cantidad` INT NULL,
  `producto_id_producto` INT NOT NULL,
  PRIMARY KEY (`id_existencias`),
  INDEX `fk_existencias_producto1_idx` (`producto_id_producto` ASC),
  CONSTRAINT `fk_existencias_producto1`
    FOREIGN KEY (`producto_id_producto`)
    REFERENCES `puntoventa`.`producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `puntoventa`.`detalle_venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa`.`detalle_venta` (
  `id_detalle_venta` INT NOT NULL AUTO_INCREMENT,
  `precio` FLOAT NULL,
  `venta_id_venta` INT NOT NULL,
  `producto_id_producto` INT NOT NULL,
  PRIMARY KEY (`id_detalle_venta`),
  INDEX `fk_detalle_venta_producto1_idx` (`producto_id_producto` ASC),
  CONSTRAINT `fk_detalle_venta_producto1`
    FOREIGN KEY (`producto_id_producto`)
    REFERENCES `puntoventa`.`producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `puntoventa`.`detalle_compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa`.`detalle_compra` (
  `id_detalle_compra` INT NOT NULL AUTO_INCREMENT,
  `costo` FLOAT NULL,
  `compra_id_compra` INT NOT NULL,
  `producto_id_producto` INT NOT NULL,
  PRIMARY KEY (`id_detalle_compra`),
  INDEX `fk_detalle_compra_compra1_idx` (`compra_id_compra` ASC),
  INDEX `fk_detalle_compra_producto1_idx` (`producto_id_producto` ASC),
  CONSTRAINT `fk_detalle_compra_compra1`
    FOREIGN KEY (`compra_id_compra`)
    REFERENCES `puntoventa`.`compra` (`id_compra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_compra_producto1`
    FOREIGN KEY (`producto_id_producto`)
    REFERENCES `puntoventa`.`producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
