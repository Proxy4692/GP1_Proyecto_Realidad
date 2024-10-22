-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-10-2024 a las 23:56:47
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutricionista`
--
CREATE DATABASE IF NOT EXISTS `nutricionista` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutricionista`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comidas`
--

CREATE TABLE `comidas` (
  `cod_comida` int(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `calorias_por_porcion` decimal(10,2) NOT NULL,
  `tipo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietas`
--

CREATE TABLE `dietas` (
  `cod-dieta` int(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fecha-inicio` date NOT NULL,
  `fecha-fin` date NOT NULL,
  `paciente-id` int(50) NOT NULL,
  `peso-inicial` decimal(5,2) NOT NULL,
  `peso-final` decimal(5,2) NOT NULL,
  `calorias-totales` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menus`
--

CREATE TABLE `menus` (
  `cod-menu` int(50) NOT NULL,
  `dia` date NOT NULL,
  `calorias-menu` decimal(10,2) NOT NULL,
  `dieta-id` int(50) NOT NULL,
  `estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `paciente_id` int(11) NOT NULL,
  `nombre-completo` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL,
  `altura` decimal(5,2) NOT NULL,
  `peso-actual` decimal(5,2) NOT NULL,
  `peso-buscado` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reglones_menu`
--

CREATE TABLE `reglones_menu` (
  `nro_renglon` int(50) NOT NULL,
  `cod_menu` int(50) NOT NULL,
  `comida_id` int(50) NOT NULL,
  `cantidad` decimal(5,2) NOT NULL,
  `subtotal_calorias` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comidas`
--
ALTER TABLE `comidas`
  ADD PRIMARY KEY (`cod_comida`);

--
-- Indices de la tabla `dietas`
--
ALTER TABLE `dietas`
  ADD PRIMARY KEY (`cod-dieta`),
  ADD UNIQUE KEY `Paciente-id` (`paciente-id`);

--
-- Indices de la tabla `menus`
--
ALTER TABLE `menus`
  ADD PRIMARY KEY (`cod-menu`),
  ADD UNIQUE KEY `dieta-id` (`dieta-id`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`paciente_id`);

--
-- Indices de la tabla `reglones_menu`
--
ALTER TABLE `reglones_menu`
  ADD PRIMARY KEY (`nro_renglon`),
  ADD UNIQUE KEY `cod_menu` (`cod_menu`),
  ADD UNIQUE KEY `comida_id` (`comida_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comidas`
--
ALTER TABLE `comidas`
  MODIFY `cod_comida` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `dietas`
--
ALTER TABLE `dietas`
  MODIFY `cod-dieta` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `menus`
--
ALTER TABLE `menus`
  MODIFY `cod-menu` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `paciente_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reglones_menu`
--
ALTER TABLE `reglones_menu`
  MODIFY `nro_renglon` int(50) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comidas`
--
ALTER TABLE `comidas`
  ADD CONSTRAINT `comidas_ibfk_1` FOREIGN KEY (`cod_comida`) REFERENCES `reglones_menu` (`comida_id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `dietas`
--
ALTER TABLE `dietas`
  ADD CONSTRAINT `dietas_ibfk_1` FOREIGN KEY (`paciente-id`) REFERENCES `pacientes` (`paciente_id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `menus`
--
ALTER TABLE `menus`
  ADD CONSTRAINT `menus_ibfk_1` FOREIGN KEY (`dieta-id`) REFERENCES `dietas` (`cod-dieta`) ON DELETE CASCADE;

--
-- Filtros para la tabla `reglones_menu`
--
ALTER TABLE `reglones_menu`
  ADD CONSTRAINT `reglones_menu_ibfk_1` FOREIGN KEY (`cod_menu`) REFERENCES `menus` (`cod-menu`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
