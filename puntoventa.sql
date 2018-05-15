-- phpMyAdmin SQL Dump
-- version 4.7.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:8889
-- Tiempo de generación: 15-05-2018 a las 20:38:43
-- Versión del servidor: 5.6.35-log
-- Versión de PHP: 7.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de datos: `puntoventa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE `ticket` (
  `id_ticket` int(11) NOT NULL,
  `id_venta` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` char(10) DEFAULT NULL,
  `lugar` varchar(50) DEFAULT NULL,
  `codigopostal` varchar(10) DEFAULT NULL,
  `total` float DEFAULT NULL,
  `efectivo` float DEFAULT NULL,
  `cambio` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`id_ticket`, `id_venta`, `fecha`, `hora`, `lugar`, `codigopostal`, `total`, `efectivo`, `cambio`) VALUES
(1, 1, '2018-05-15', NULL, 'Rio Grande Zacatecas', '98403', 615, 615, 0),
(2, 2, '2018-05-15', NULL, 'Rio Grande Zacatecas', '98403', 190, 190, 0),
(3, 3, '2018-05-15', NULL, 'Rio Grande Zacatecas', '98403', 690, 700, 10),
(4, 4, '2018-05-15', '0:55', 'Río Grande', '98403', 125, 500, 375);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`id_ticket`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ticket`
--
ALTER TABLE `ticket`
  MODIFY `id_ticket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;