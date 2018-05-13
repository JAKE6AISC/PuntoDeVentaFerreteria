-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 13-05-2018 a las 23:35:41
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `puntoventa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE IF NOT EXISTS `compra` (
  `id_compra` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `total` float DEFAULT NULL,
  PRIMARY KEY (`id_compra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra`
--

CREATE TABLE IF NOT EXISTS `detalle_compra` (
  `id_detalle_compra` int(11) NOT NULL AUTO_INCREMENT,
  `costo` float DEFAULT NULL,
  `compra_id_compra` int(11) NOT NULL,
  `producto_id_producto` int(11) NOT NULL,
  PRIMARY KEY (`id_detalle_compra`),
  KEY `fk_detalle_compra_compra1_idx` (`compra_id_compra`),
  KEY `fk_detalle_compra_producto1_idx` (`producto_id_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE IF NOT EXISTS `detalle_venta` (
  `id_detalle_venta` int(11) NOT NULL AUTO_INCREMENT,
  `precio_producto` float DEFAULT NULL,
  `venta_id_venta` int(11) NOT NULL,
  `producto_id_producto` int(11) NOT NULL,
  PRIMARY KEY (`id_detalle_venta`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Volcado de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`id_detalle_venta`, `precio_producto`, `venta_id_venta`, `producto_id_producto`) VALUES
(1, 1.5, 46, 1),
(2, 1, 46, 9),
(3, 16.5, 46, 2),
(4, 16.5, 46, 2),
(5, 20, 46, 3),
(6, 20, 46, 3),
(7, 1.5, 47, 1),
(8, 1.5, 47, 1),
(9, 16.5, 47, 2),
(10, 20, 47, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `existencias`
--

CREATE TABLE IF NOT EXISTS `existencias` (
  `id_existencias` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `producto_id_producto` int(11) NOT NULL,
  PRIMARY KEY (`id_existencias`),
  KEY `fk_existencias_producto1_idx` (`producto_id_producto`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=17 ;

--
-- Volcado de datos para la tabla `existencias`
--

INSERT INTO `existencias` (`id_existencias`, `cantidad`, `producto_id_producto`) VALUES
(1, 93, 1),
(2, 97, 2),
(3, 97, 3),
(4, 100, 6),
(7, 100, 5),
(10, 0, 11),
(11, 0, 12),
(12, 0, 13),
(13, 0, 14),
(14, 0, 15),
(15, 0, 16),
(16, 0, 17);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `id_producto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `clasificacion` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `proveedor_id_proveedor` int(11) NOT NULL,
  PRIMARY KEY (`id_producto`),
  KEY `fk_producto_proveedor1_idx` (`proveedor_id_proveedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=18 ;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre`, `precio`, `clasificacion`, `tipo`, `proveedor_id_proveedor`) VALUES
(1, 'Tornillos', 1.5, 'Pieza', 'Ferreteria', 1000),
(2, 'Segeta', 16.5, 'Pieza', 'Herramientas corte', 1001),
(3, 'Madera lija', 20, 'Unidad', 'Otros', 1002),
(5, 'Clavos Conqreto', 2.5, 'Otros', 'Pieza', 1003),
(6, 'Cinta aislante', 10, 'ferreteria', 'pieza', 1003),
(10, 'Prueba', 21, 'Pieza', 'Pieza', 1000),
(11, 'Producto', 1.52, 'Y', 'X', 1000),
(12, 'ziddfj', 12, 'javdjb', 'sjdnvdj', 1001),
(13, 'sadvnadkjn', 1212, 'cnsdjcsj', 'sjcbsjcb', 1002),
(14, 'vndkjvv', 344, 'advfnsfnvnj', 'adfvndfkvj', 1002),
(15, 'jkcjasb', 33, 'ajdvndjc', 'vjndsfkvn', 1001),
(16, 'Hola', 12.05, 'Mundo', 'Cruel', 1002),
(17, 'Juanes', 12.2, 'Agregado', 'Nuevo Codigo', 1003);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `id_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `empresa` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1005 ;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `nombre`, `empresa`) VALUES
(1000, 'Fulano', 'Quaker Skate'),
(1001, 'Sutano', 'E-Ferretreias'),
(1002, 'Manolo', 'Ferretreia el arbolito'),
(1003, 'Perengano', 'Ibarra'),
(1004, 'Satanas', 'Auto partes zacatecas ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE IF NOT EXISTS `ticket` (
  `id_ticket` int(11) NOT NULL AUTO_INCREMENT,
  `id_venta` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` char(10) DEFAULT NULL,
  `lugar` varchar(50) DEFAULT NULL,
  `codigopostal` varchar(10) DEFAULT NULL,
  `total` float DEFAULT NULL,
  `efectivo` float DEFAULT NULL,
  `cambio` float DEFAULT NULL,
  PRIMARY KEY (`id_ticket`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`id_ticket`, `id_venta`, `fecha`, `hora`, `lugar`, `codigopostal`, `total`, `efectivo`, `cambio`) VALUES
(1, 1, '2018-04-24', '12:24', 'Rio Grande Zacatecas', '98403', 120, 200, 80),
(2, 46, '2018-05-13', NULL, 'Rio Grande Zacatecas', '98403', 75.5, 100, 24.5),
(3, 47, '2018-05-13', NULL, 'Rio Grande Zacatecas', '98403', 39.5, 50, 10.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `id_venta` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `total` float DEFAULT NULL,
  PRIMARY KEY (`id_venta`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=48 ;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`id_venta`, `fecha`, `total`) VALUES
(1, '2018-04-24', 43),
(2, '2018-04-24', 15.5),
(3, '2018-04-24', 20),
(4, '2018-04-24', 54),
(5, '2018-04-24', 43.5),
(6, '2018-04-24', 9),
(7, '2018-04-24', 15.5),
(8, '2018-04-24', 68),
(9, '2018-04-24', 6),
(10, '2018-04-24', 55.5),
(11, '2018-04-24', 1.5),
(12, '2018-04-24', 44.5),
(13, '2018-04-24', 1.5),
(14, '2018-04-24', 4.5),
(15, '2018-04-26', 60),
(16, '2018-04-27', 4.5),
(17, '2018-04-27', 46.5),
(18, '2018-05-02', 7.5),
(19, '2018-05-02', 3),
(20, '2018-05-11', 80),
(21, '2018-05-11', 40),
(22, '2018-05-11', 100),
(23, '2018-05-11', 20),
(24, '2018-05-11', 117),
(25, '2018-05-11', 117),
(26, '2018-05-11', 117),
(27, '2018-05-11', 61),
(28, '2018-05-11', 2.5),
(29, '2018-05-11', 5),
(30, '2018-05-11', 20),
(31, '2018-05-11', 2.5),
(32, '2018-05-11', 10),
(33, '2018-05-11', 100),
(34, '2018-05-11', 300),
(35, '2018-05-11', 100),
(36, '2018-05-12', 61),
(37, '2018-05-12', 12.5),
(38, '2018-05-12', 10),
(39, '2018-05-12', 5),
(40, '2018-05-12', 2.5),
(41, '2018-05-12', 32.5),
(42, '2018-05-13', 20),
(43, '2018-05-13', 16.5),
(44, '2018-05-13', 16.5),
(45, '2018-05-13', 49.5),
(46, '2018-05-13', 75.5),
(47, '2018-05-13', 39.5);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD CONSTRAINT `fk_detalle_compra_compra1` FOREIGN KEY (`compra_id_compra`) REFERENCES `compra` (`id_compra`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_detalle_compra_producto1` FOREIGN KEY (`producto_id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `existencias`
--
ALTER TABLE `existencias`
  ADD CONSTRAINT `fk_existencias_producto1` FOREIGN KEY (`producto_id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `fk_producto_proveedor1` FOREIGN KEY (`proveedor_id_proveedor`) REFERENCES `proveedor` (`id_proveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
