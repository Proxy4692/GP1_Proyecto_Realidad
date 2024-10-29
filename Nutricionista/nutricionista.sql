-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2024 a las 22:39:18
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimento`
--

CREATE TABLE `alimento` (
  `codAlimento` int(11) NOT NULL,
  `nombreA` varchar(20) NOT NULL,
  `selA` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `conComida` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `tipoComida` varchar(100) NOT NULL,
  `caloriasPor100g` int(11) NOT NULL,
  `detalle` varchar(500) NOT NULL,
  `baja` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comidaalimento`
--

CREATE TABLE `comidaalimento` (
  `conComida` int(11) NOT NULL,
  `codAlimento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `codDieta` int(11) NOT NULL,
  `nombreD` varchar(100) NOT NULL,
  `fechaIni` date NOT NULL,
  `fechaFin` date NOT NULL,
  `pesoFin` double NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `totalCalorias` int(11) NOT NULL,
  `nroPaciente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietasposibles`
--

CREATE TABLE `dietasposibles` (
  `opcion` int(11) NOT NULL,
  `kcalS` int(11) NOT NULL,
  `desayuno` int(11) NOT NULL,
  `almuerzo` int(11) NOT NULL,
  `merienda` int(11) NOT NULL,
  `colacion` int(11) NOT NULL,
  `cena` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menudiario`
--

CREATE TABLE `menudiario` (
  `codMenu` int(11) NOT NULL,
  `diaNro` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `codDieta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `nroPaciente` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL,
  `altura` double NOT NULL,
  `pesoActual` double NOT NULL,
  `pesoBuscado` double NOT NULL,
  `codDieta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renglondemenu`
--

CREATE TABLE `renglondemenu` (
  `nroRenglon` int(11) NOT NULL,
  `cantidadGrs` double NOT NULL,
  `subtotalCalorias` int(11) NOT NULL,
  `conComida` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seleccaloria`
--

CREATE TABLE `seleccaloria` (
  `diaNro` int(11) NOT NULL,
  `k5850` int(11) NOT NULL,
  `k7000` int(11) NOT NULL,
  `k8050` int(11) NOT NULL,
  `k9450` int(11) NOT NULL,
  `k10500` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimento`
--
ALTER TABLE `alimento`
  ADD PRIMARY KEY (`codAlimento`);

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`conComida`);

--
-- Indices de la tabla `comidaalimento`
--
ALTER TABLE `comidaalimento`
  ADD KEY `conComida` (`conComida`),
  ADD KEY `codAlimento` (`codAlimento`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`codDieta`);

--
-- Indices de la tabla `menudiario`
--
ALTER TABLE `menudiario`
  ADD PRIMARY KEY (`codMenu`),
  ADD KEY `codDieta` (`codDieta`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`nroPaciente`);

--
-- Indices de la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  ADD PRIMARY KEY (`nroRenglon`),
  ADD KEY `conComida` (`conComida`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alimento`
--
ALTER TABLE `alimento`
  MODIFY `codAlimento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `conComida` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `codDieta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `menudiario`
--
ALTER TABLE `menudiario`
  MODIFY `codMenu` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `nroPaciente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  MODIFY `nroRenglon` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comidaalimento`
--
ALTER TABLE `comidaalimento`
  ADD CONSTRAINT `comidaalimento_ibfk_1` FOREIGN KEY (`conComida`) REFERENCES `comida` (`conComida`),
  ADD CONSTRAINT `comidaalimento_ibfk_2` FOREIGN KEY (`codAlimento`) REFERENCES `alimento` (`codAlimento`);

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`nroPaciente`) REFERENCES `paciente` (`nroPaciente`);

--
-- Filtros para la tabla `menudiario`
--
ALTER TABLE `menudiario`
  ADD CONSTRAINT `menudiario_ibfk_1` FOREIGN KEY (`codDieta`) REFERENCES `dieta` (`codDieta`);

--
-- Filtros para la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  ADD CONSTRAINT `renglondemenu_ibfk_1` FOREIGN KEY (`conComida`) REFERENCES `comida` (`conComida`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
