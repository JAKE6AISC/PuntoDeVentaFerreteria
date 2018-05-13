-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 13-05-2018 a las 21:23:45
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
  `precio` float DEFAULT NULL,
  `venta_id_venta` int(11) NOT NULL,
  `producto_id_producto` int(11) NOT NULL,
  PRIMARY KEY (`id_detalle_venta`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=135 ;

--
-- Volcado de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`id_detalle_venta`, `precio`, `venta_id_venta`, `producto_id_producto`) VALUES
(1, 20, 3, 3),
(2, 1.5, 1, 4),
(3, 1.5, 1, 4),
(4, 15.5, 2, 4),
(5, 15.5, 2, 4),
(6, 20, 3, 4),
(7, 1.5, 1, 5),
(8, 1.5, 1, 5),
(9, 1.5, 1, 5),
(10, 1.5, 1, 5),
(11, 1.5, 1, 5),
(12, 1.5, 1, 5),
(13, 1.5, 1, 5),
(14, 1.5, 1, 5),
(15, 1.5, 1, 5),
(16, 1.5, 1, 5),
(17, 1.5, 1, 5),
(18, 1.5, 1, 5),
(19, 1.5, 1, 5),
(20, 1.5, 1, 5),
(21, 1.5, 1, 5),
(22, 1.5, 1, 5),
(23, 1.5, 1, 5),
(24, 1.5, 1, 5),
(25, 1.5, 1, 5),
(26, 1.5, 1, 5),
(27, 1.5, 1, 5),
(28, 1.5, 1, 5),
(29, 1.5, 1, 5),
(30, 1.5, 1, 5),
(31, 1.5, 1, 5),
(32, 1.5, 1, 5),
(33, 1.5, 1, 5),
(34, 1.5, 1, 5),
(35, 1.5, 1, 5),
(36, 1.5, 1, 6),
(37, 1.5, 1, 6),
(38, 1.5, 1, 6),
(39, 1.5, 1, 6),
(40, 1.5, 1, 6),
(41, 1.5, 1, 6),
(42, 15.5, 2, 7),
(43, 1.5, 1, 8),
(44, 15.5, 2, 8),
(45, 15.5, 2, 8),
(46, 15.5, 2, 8),
(47, 20, 3, 8),
(48, 1.5, 9, 1),
(49, 1.5, 9, 1),
(50, 1.5, 9, 1),
(51, 1.5, 9, 1),
(52, 1.5, 10, 1),
(53, 1.5, 10, 1),
(54, 1.5, 10, 1),
(55, 15.5, 10, 2),
(56, 15.5, 10, 2),
(57, 15.5, 10, 2),
(58, 1.5, 10, 1),
(59, 1.5, 10, 1),
(60, 1.5, 10, 1),
(61, 1.5, 11, 1),
(62, 1.5, 12, 1),
(63, 1.5, 12, 1),
(64, 1.5, 12, 1),
(65, 20, 12, 3),
(66, 20, 12, 3),
(67, 1.5, 13, 1),
(68, 1.5, 14, 1),
(69, 1.5, 14, 1),
(70, 1.5, 14, 1),
(71, 20, 3, 15),
(72, 20, 3, 15),
(73, 20, 3, 15),
(74, 1.5, 1, 16),
(75, 1.5, 1, 16),
(76, 1.5, 1, 16),
(77, 15.5, 2, 17),
(78, 15.5, 2, 17),
(79, 15.5, 2, 17),
(80, 1.5, 1, 18),
(81, 1.5, 1, 18),
(82, 1.5, 1, 18),
(83, 1.5, 1, 18),
(84, 1.5, 1, 18),
(85, 1.5, 1, 19),
(86, 1.5, 1, 19),
(87, 20, 3, 20),
(88, 20, 3, 20),
(89, 20, 3, 20),
(90, 20, 3, 20),
(91, 20, 3, 21),
(92, 20, 3, 21),
(93, 20, 3, 22),
(94, 20, 3, 22),
(95, 20, 3, 22),
(96, 20, 3, 22),
(97, 20, 3, 22),
(98, 20, 3, 23),
(99, 58.5, 4, 24),
(100, 58.5, 4, 24),
(101, 58.5, 4, 25),
(102, 58.5, 4, 25),
(103, 58.5, 4, 26),
(104, 58.5, 4, 26),
(105, 2.5, 5, 27),
(106, 58.5, 4, 27),
(107, 2.5, 5, 28),
(108, 2.5, 5, 29),
(109, 2.5, 5, 29),
(110, 10, 6, 30),
(111, 10, 6, 30),
(112, 2.5, 5, 31),
(113, 10, 6, 32),
(114, 100, 7, 33),
(115, 100, 7, 34),
(116, 100, 7, 34),
(117, 100, 7, 34),
(118, 100, 7, 35),
(119, 58.5, 4, 36),
(120, 2.5, 5, 36),
(121, 2.5, 5, 37),
(122, 10, 6, 37),
(123, 10, 6, 38),
(124, 2.5, 5, 39),
(125, 2.5, 5, 39),
(126, 2.5, 5, 40),
(127, 2.5, 5, 41),
(128, 10, 6, 41),
(129, 10, 6, 41),
(130, 10, 6, 41),
(131, 10, 42, 6),
(132, 10, 42, 6),
(133, 16.5, 43, 2),
(134, 16.5, 44, 2);

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
(1, 0, 1),
(2, 5, 2),
(3, 0, 3),
(4, 0, 6),
(7, 0, 5),
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
(9, '1', 1, '1', '1', 1000),
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
  `lugar` varchar(50) DEFAULT NULL,
  `codigopostal` varchar(10) DEFAULT NULL,
  `total` float DEFAULT NULL,
  `efectivo` float DEFAULT NULL,
  `cambio` float DEFAULT NULL,
  PRIMARY KEY (`id_ticket`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`id_ticket`, `id_venta`, `fecha`, `lugar`, `codigopostal`, `total`, `efectivo`, `cambio`) VALUES
(1, 1, '2018-04-24', 'Rio Grande Zacatecas', '98403', 120, 200, 80),
(2, 44, '2018-05-13', 'Rio Grande Zacatecas', '98403', 16.5, 17, 0.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `id_venta` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `total` float DEFAULT NULL,
  PRIMARY KEY (`id_venta`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=45 ;

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
(44, '2018-05-13', 16.5);

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
