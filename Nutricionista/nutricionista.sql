-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2024 a las 00:00:39
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

--
-- Volcado de datos para la tabla `alimento`
--

INSERT INTO `alimento` (`codAlimento`, `nombreA`, `selA`) VALUES
(1, 'almendra', 1),
(2, 'arroz', 1),
(3, 'avena', 1),
(4, 'banana', 1),
(5, 'café', 1),
(6, 'carne', 1),
(7, 'cebolla', 1),
(8, 'chocolate', 1),
(9, 'durazno', 1),
(10, 'fiambre', 1),
(11, 'fideos', 1),
(12, 'frutas', 1),
(13, 'fruto seco', 1),
(14, 'huevo', 1),
(15, 'kiwi', 1),
(16, 'leche', 1),
(17, 'leche light', 1),
(18, 'lechuga', 1),
(19, 'lenteja', 1),
(20, 'mandarina', 1),
(21, 'manzana', 1),
(22, 'mate', 1),
(23, 'melon', 1),
(24, 'mermelada', 1),
(25, 'naranja', 1),
(26, 'panificado', 1),
(27, 'pepino', 1),
(28, 'pera', 1),
(29, 'pescado', 1),
(30, 'pollo', 1),
(31, 'pomelo', 1),
(32, 'porotos', 1),
(33, 'queso', 1),
(34, 'sandía', 1),
(35, 'soja', 1),
(36, 'te', 1),
(37, 'tomate', 1),
(38, 'uvas', 1),
(39, 'verduras', 1),
(40, 'zapallo', 1);

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

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`conComida`, `nombre`, `tipoComida`, `caloriasPor100g`, `detalle`, `baja`) VALUES
(301, 'Sopa de fideos', 'Almuerzo', 100, '', 0),
(302, 'Arroz con pollo + ensalada lechuga', 'Almuerzo', 102, '', 0),
(303, 'Pollo dulce agrio de arroz', 'Almuerzo', 105, '', 0),
(304, 'Pure de calabaza c/ensalada pepino', 'Almuerzo', 109, '', 0),
(305, 'Arroz con verduras', 'Almuerzo', 111, '', 0),
(306, 'Tarta de arroz', 'Almuerzo', 116, '', 0),
(307, 'Panqueques de avena y banana', 'Almuerzo', 118, '', 0),
(308, 'Paella', 'Almuerzo', 120, '', 0),
(309, 'Espaguetis con tomate', 'Almuerzo', 129, '', 0),
(310, 'Mollejas de pollo c/ensalada mixta', 'Almuerzo', 168, '', 0),
(311, 'Lasaña', 'Almuerzo', 171, '', 0),
(312, 'Empanada de jamon y queso', 'Almuerzo', 178, '', 0),
(313, 'Pastel de carne c/ensalada verduras', 'Almuerzo', 179, '', 0),
(314, 'Lentejas con arroz', 'Almuerzo', 185, '', 0),
(315, 'Calabacín relleno c/carne res', 'Almuerzo', 187, '', 0),
(316, 'Puré de verduras c/carne mechada', 'Almuerzo', 195, '', 0),
(317, 'Ravioles de verdura', 'Almuerzo', 201, '', 0),
(318, 'Tarta de carne', 'Almuerzo', 204, '', 0),
(319, 'Carne asada c/ensalada tomate cebolla', 'Almuerzo', 230, '', 0),
(320, 'Pollo relleno c/ensalada pepino', 'Almuerzo', 235, '', 0),
(321, 'Sopa de tortilla', 'Almuerzo', 237, '', 0),
(322, 'Milanesa de pollo c/ensalada verduras', 'Almuerzo', 246, '', 0),
(323, 'Sopa de pollo', 'Almuerzo', 246, '', 0),
(324, 'Sopa de lentejas', 'Almuerzo', 25, '', 0),
(325, 'Caldo de pollo con verduras', 'Almuerzo', 250, '', 0),
(326, 'Empanada de pescado', 'Almuerzo', 256, '', 0),
(327, 'Sopa de verduras', 'Almuerzo', 26, '', 0),
(328, 'Empanada de carne al horno', 'Almuerzo', 293, '', 0),
(329, 'Carne con tomate', 'Almuerzo', 298, '', 0),
(330, 'Caldo de carne', 'Almuerzo', 323, '', 0),
(331, 'Empanada de carne c/ensalada lechuga', 'Almuerzo', 342, '', 0),
(332, 'Sopa de pollo con fideos', 'Almuerzo', 349, '', 0),
(333, 'Omelette c/ensalada tomate y cebolla', 'Almuerzo', 457, '', 0),
(334, 'Guiso de lentejas', 'Almuerzo', 52, '', 0),
(335, 'Sopa de pollo y verduras', 'Almuerzo', 60, '', 0),
(336, 'Ceviche de pescado', 'Almuerzo', 68, '', 0),
(337, 'Locro', 'Almuerzo', 69, '', 0),
(338, 'Sopa de pollo con arroz', 'Almuerzo', 78, '', 0),
(339, 'Lentejas con chorizo', 'Almuerzo', 85, '', 0),
(340, 'Arroz con pollo y verduras', 'Almuerzo', 99, '', 0),
(401, 'Sopa de fideos', 'Cena', 100, '', 0),
(402, 'Arroz con pollo + ensalada lechuga', 'Cena', 102, '', 0),
(403, 'Pollo dulce agrio de arroz', 'Cena', 105, '', 0),
(404, 'Pure de calabaza c/ensalada pepino', 'Cena', 109, '', 0),
(405, 'Arroz con verduras', 'Cena', 111, '', 0),
(406, 'Tarta de arroz', 'Cena', 116, '', 0),
(407, 'Panqueques de avena y banana', 'Cena', 118, '', 0),
(408, 'Paella', 'Cena', 120, '', 0),
(409, 'Espaguetis con tomate', 'Cena', 129, '', 0),
(410, 'Mollejas de pollo c/ensalada mixta', 'Cena', 168, '', 0),
(411, 'Lasaña', 'Cena', 171, '', 0),
(412, 'Empanada de jamon y queso', 'Cena', 178, '', 0),
(413, 'Pastel de carne c/ensalada verduras', 'Cena', 179, '', 0),
(414, 'Lentejas con arroz', 'Cena', 185, '', 0),
(415, 'Calabacín relleno c/carne res', 'Cena', 187, '', 0),
(416, 'Puré de verduras c/carne mechada', 'Cena', 195, '', 0),
(417, 'Ravioles de verdura', 'Cena', 201, '', 0),
(418, 'Tarta de carne', 'Cena', 204, '', 0),
(419, 'Carne asada c/ensalada tomate cebolla', 'Cena', 230, '', 0),
(420, 'Pollo relleno c/ensalada pepino', 'Cena', 235, '', 0),
(421, 'Sopa de tortilla', 'Cena', 237, '', 0),
(422, 'Milanesa de pollo c/ensalada verduras', 'Cena', 246, '', 0),
(423, 'Sopa de pollo', 'Cena', 246, '', 0),
(424, 'Sopa de lentejas', 'Cena', 25, '', 0),
(425, 'Caldo de pollo con verduras', 'Cena', 250, '', 0),
(426, 'Empanada de pescado', 'Cena', 256, '', 0),
(427, 'Sopa de verduras', 'Cena', 26, '', 0),
(428, 'Empanada de carne al horno', 'Cena', 293, '', 0),
(429, 'Carne con tomate', 'Cena', 298, '', 0),
(430, 'Caldo de carne', 'Cena', 323, '', 0),
(431, 'Empanada de carne c/ensalada lechuga', 'Cena', 342, '', 0),
(432, 'Sopa de pollo con fideos', 'Cena', 349, '', 0),
(433, 'Omelette c/ensalada tomate y cebolla', 'Cena', 457, '', 0),
(434, 'Guiso de lentejas', 'Cena', 52, '', 0),
(435, 'Sopa de pollo y verduras', 'Cena', 60, '', 0),
(436, 'Ceviche de pescado', 'Cena', 68, '', 0),
(437, 'Locro', 'Cena', 69, '', 0),
(438, 'Sopa de pollo con arroz', 'Cena', 78, '', 0),
(439, 'Lentejas con chorizo', 'Cena', 85, '', 0),
(440, 'Arroz con pollo y verduras', 'Cena', 99, '', 0),
(501, 'Vaso de Chocolate caliente', 'Colacion', 132, '', 0),
(502, '200 grs Sandía', 'Colacion', 138, '', 0),
(503, 'Vaso de Leche light c/50 gr pasas uvas', 'Colacion', 141, '', 0),
(504, '1 Durazno', 'Colacion', 144, '', 0),
(505, '200 grs Uvas', 'Colacion', 144, '', 0),
(506, '1 Naranja', 'Colacion', 147, '', 0),
(507, '1 Pomelo', 'Colacion', 147, '', 0),
(508, '1 Manzana verde', 'Colacion', 151, '', 0),
(509, 'Vaso de Leche de almendras', 'Colacion', 22, '', 0),
(510, '1 Banana frita', 'Colacion', 252, '', 0),
(511, '2 o 3 Higos, secos', 'Colacion', 270, '', 0),
(512, 'Vaso de Leche de soja', 'Colacion', 36, '', 0),
(513, 'Vaso de Leche con avena', 'Colacion', 40, '', 0),
(514, '1 Mandarina', 'Colacion', 53, '', 0),
(515, '100 grs Melón verde', 'Colacion', 56, '', 0),
(516, '1 Pera', 'Colacion', 57, '', 0),
(517, '2 Kiwi verde', 'Colacion', 61, '', 0),
(518, '1 Manzana', 'Colacion', 64, '', 0),
(519, '1 Banana mediana', 'Colacion', 92, '', 0),
(520, '150 ml Ensalada de frutas', 'Colacion', 97, '', 0),
(601, 'Caldo de verduras', 'Desayuno', 148, '', 0),
(602, '2 Huevos revueltos', 'Desayuno', 155, '', 0),
(603, 'Café con azúcar c/disco arroz', 'Desayuno', 210, '', 0),
(604, '2 Huevos revueltos c/tostada', 'Desayuno', 215, '', 0),
(605, 'Cafe con leche c/pan tostado integral', 'Desayuno', 240, '', 0),
(606, 'Te Verde c/pan integral c/semillas', 'Desayuno', 242, '', 0),
(607, 'Café c/leche desc c/pan semillas', 'Desayuno', 250, '', 0),
(608, 'Sandwich de jamón tostado', 'Desayuno', 255, '', 0),
(609, 'Capuchino c/pan y queso', 'Desayuno', 271, '', 0),
(610, 'Café descafeinado c/pan tostado', 'Desayuno', 299, '', 0),
(611, 'Te Rojo c/pan blanco tostado', 'Desayuno', 301, '', 0),
(612, 'Té negro c/tostada mermelada', 'Desayuno', 324, '', 0),
(613, 'Yerba mate c/tostada light', 'Desayuno', 325, '', 0),
(614, 'Mate amargo c/tostada mermelada', 'Desayuno', 330, '', 0),
(615, '2 Huevos revueltos c/discos arroz', 'Desayuno', 355, '', 0),
(616, 'Tortitas de arroz integral', 'Desayuno', 383, '', 0),
(617, 'Omelette', 'Desayuno', 387, '', 0),
(618, 'Té negro con leche c/factura', 'Desayuno', 391, '', 0),
(619, 'Mate cocido c/pan tostado integral', 'Desayuno', 392, '', 0),
(620, 'Omelette c/discos arroz', 'Desayuno', 397, '', 0),
(621, 'Omelette c/tostada light', 'Desayuno', 407, '', 0),
(622, 'Te con leche c/medialuna manteca', 'Desayuno', 415, '', 0),
(701, 'Caldo de verduras', 'Merienda', 148, '', 0),
(702, '2 Huevos revueltos', 'Merienda', 155, '', 0),
(703, 'Café con azúcar c/disco arroz', 'Merienda', 210, '', 0),
(704, '2 Huevos revueltos c/tostada', 'Merienda', 215, '', 0),
(705, 'Cafe con leche c/pan tostado integral', 'Merienda', 240, '', 0),
(706, 'Te Verde c/pan integral c/semillas', 'Merienda', 242, '', 0),
(707, 'Café c/leche desc c/pan semillas', 'Merienda', 250, '', 0),
(708, 'Sandwich de jamón tostado', 'Merienda', 255, '', 0),
(709, 'Capuchino c/pan y queso', 'Merienda', 271, '', 0),
(710, 'Café descafeinado c/pan tostado', 'Merienda', 299, '', 0),
(711, 'Te Rojo c/pan blanco tostado', 'Merienda', 301, '', 0),
(712, 'Té negro c/tostada mermelada', 'Merienda', 324, '', 0),
(713, 'Yerba mate c/tostada light', 'Merienda', 325, '', 0),
(714, 'Mate amargo c/tostada mermelada', 'Merienda', 330, '', 0),
(715, '2 Huevos revueltos c/discos arroz', 'Merienda', 355, '', 0),
(716, 'Tortitas de arroz integral', 'Merienda', 383, '', 0),
(717, 'Omelette', 'Merienda', 387, '', 0),
(718, 'Té negro con leche c/factura', 'Merienda', 391, '', 0),
(719, 'Mate cocido c/pan tostado integral', 'Merienda', 392, '', 0),
(720, 'Omelette c/discos arroz', 'Merienda', 397, '', 0),
(721, 'Omelette c/tostada light', 'Merienda', 407, '', 0),
(722, 'Te con leche c/medialuna manteca', 'Merienda', 415, '', 0);

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

--
-- Volcado de datos para la tabla `dietasposibles`
--

INSERT INTO `dietasposibles` (`opcion`, `kcalS`, `desayuno`, `almuerzo`, `merienda`, `colacion`, `cena`, `estado`) VALUES
(1, 700, 607, 320, 512, 702, 401, 1),
(2, 700, 602, 316, 503, 701, 402, 1),
(3, 700, 603, 313, 501, 702, 401, 1),
(4, 700, 604, 321, 514, 702, 406, 1),
(5, 700, 606, 316, 515, 701, 401, 1),
(6, 700, 603, 310, 503, 702, 402, 1),
(7, 700, 601, 317, 504, 701, 401, 1),
(1, 750, 607, 320, 512, 702, 401, 1),
(2, 750, 602, 323, 519, 701, 404, 1),
(3, 750, 603, 313, 501, 702, 401, 1),
(4, 750, 603, 310, 503, 702, 402, 1),
(5, 750, 606, 306, 505, 701, 401, 1),
(6, 750, 607, 317, 504, 702, 427, 1),
(7, 750, 601, 317, 505, 701, 404, 1),
(1, 800, 607, 321, 515, 702, 402, 1),
(2, 800, 607, 317, 519, 702, 402, 1),
(3, 800, 606, 325, 514, 702, 401, 1),
(4, 800, 603, 317, 501, 702, 402, 1),
(5, 800, 603, 316, 506, 701, 401, 1),
(6, 800, 603, 317, 501, 702, 402, 1),
(7, 800, 603, 316, 506, 701, 401, 1),
(1, 850, 606, 317, 503, 702, 405, 1),
(2, 850, 609, 314, 504, 701, 402, 1),
(3, 850, 606, 325, 519, 702, 405, 1),
(4, 850, 604, 321, 503, 702, 402, 1),
(5, 850, 609, 310, 506, 702, 404, 1),
(6, 850, 608, 315, 508, 702, 402, 1),
(7, 850, 609, 315, 504, 701, 401, 1),
(1, 900, 607, 321, 506, 702, 405, 1),
(2, 900, 607, 315, 505, 701, 411, 1),
(3, 900, 610, 328, 514, 702, 401, 1),
(4, 900, 605, 326, 506, 702, 402, 1),
(5, 900, 603, 329, 505, 701, 401, 1),
(6, 900, 610, 322, 501, 702, 436, 1),
(7, 900, 608, 323, 505, 702, 401, 1),
(1, 935, 606, 329, 502, 702, 402, 1),
(2, 935, 610, 323, 516, 702, 412, 1),
(3, 935, 605, 328, 506, 702, 401, 1),
(4, 935, 610, 325, 514, 702, 412, 1),
(5, 935, 610, 325, 502, 701, 401, 1),
(6, 935, 607, 328, 501, 702, 403, 1),
(7, 935, 610, 329, 502, 701, 434, 1),
(1, 1000, 614, 330, 519, 702, 401, 1),
(2, 1000, 609, 330, 506, 701, 405, 1),
(3, 1000, 612, 325, 508, 702, 408, 1),
(4, 1000, 610, 328, 508, 702, 402, 1),
(5, 1000, 610, 329, 505, 701, 405, 1),
(6, 1000, 610, 328, 508, 702, 402, 1),
(7, 1000, 610, 329, 504, 701, 405, 1),
(1, 1075, 614, 330, 506, 702, 408, 1),
(2, 1075, 615, 330, 506, 701, 402, 1),
(3, 1075, 605, 325, 510, 702, 412, 1),
(4, 1075, 610, 330, 503, 703, 402, 1),
(5, 1075, 613, 325, 510, 701, 401, 1),
(6, 1075, 612, 330, 504, 702, 409, 1),
(7, 1075, 613, 325, 510, 701, 401, 1),
(1, 1150, 613, 329, 511, 702, 402, 1),
(2, 1150, 616, 321, 511, 702, 403, 1),
(3, 1150, 613, 329, 510, 702, 408, 1),
(4, 1150, 610, 321, 511, 704, 409, 1),
(5, 1150, 613, 329, 510, 702, 408, 1),
(6, 1150, 614, 328, 511, 702, 402, 1),
(7, 1150, 615, 315, 510, 702, 417, 1),
(1, 1200, 620, 330, 506, 702, 412, 1),
(2, 1200, 614, 330, 511, 701, 409, 1),
(3, 1200, 619, 319, 510, 704, 405, 1),
(4, 1200, 618, 330, 506, 703, 409, 1),
(5, 1200, 617, 332, 502, 701, 412, 1),
(6, 1200, 617, 331, 508, 704, 403, 1),
(7, 1200, 620, 329, 510, 701, 403, 1),
(1, 1260, 613, 330, 511, 706, 401, 1),
(2, 1260, 622, 331, 504, 702, 418, 1),
(3, 1260, 620, 329, 506, 705, 412, 1),
(4, 1260, 621, 319, 511, 706, 405, 1),
(5, 1260, 610, 332, 510, 705, 408, 1),
(6, 1260, 621, 330, 506, 704, 410, 1),
(7, 1260, 615, 329, 510, 707, 403, 1),
(1, 1300, 620, 329, 510, 706, 405, 1),
(2, 1300, 608, 331, 511, 708, 412, 1),
(3, 1300, 620, 328, 510, 705, 407, 1),
(4, 1300, 619, 325, 511, 703, 412, 1),
(5, 1300, 617, 325, 510, 705, 411, 1),
(6, 1300, 615, 330, 511, 707, 402, 1),
(7, 1300, 615, 315, 510, 707, 426, 1),
(1, 1350, 620, 330, 511, 705, 408, 1),
(2, 1350, 617, 332, 511, 706, 402, 1),
(3, 1350, 617, 328, 510, 705, 412, 1),
(4, 1350, 617, 328, 511, 704, 414, 1),
(5, 1350, 616, 332, 510, 708, 405, 1),
(6, 1350, 622, 331, 511, 702, 410, 1),
(7, 1350, 616, 332, 502, 707, 419, 1),
(1, 1400, 621, 333, 511, 702, 405, 1),
(2, 1400, 621, 333, 511, 702, 405, 1),
(3, 1400, 617, 333, 502, 705, 412, 1),
(4, 1400, 621, 333, 511, 702, 405, 1),
(5, 1400, 613, 333, 510, 708, 405, 1),
(6, 1400, 621, 333, 504, 702, 421, 1),
(7, 1400, 613, 333, 510, 708, 405, 1),
(1, 1440, 617, 333, 510, 706, 402, 1),
(2, 1440, 617, 333, 511, 702, 411, 1),
(3, 1440, 617, 333, 506, 709, 412, 1),
(4, 1440, 618, 333, 506, 703, 420, 1),
(5, 1440, 620, 333, 505, 709, 411, 1),
(6, 1440, 617, 333, 511, 704, 405, 1),
(7, 1440, 615, 333, 510, 709, 403, 1),
(1, 1500, 613, 333, 510, 709, 416, 1),
(2, 1500, 621, 333, 511, 708, 405, 1),
(3, 1500, 620, 333, 502, 709, 421, 1),
(4, 1500, 618, 333, 511, 709, 405, 1),
(5, 1500, 620, 333, 510, 701, 422, 1),
(6, 1500, 615, 333, 511, 707, 410, 1),
(7, 1500, 622, 333, 510, 709, 403, 1),
(1, 1530, 620, 333, 503, 706, 428, 1),
(2, 1530, 616, 333, 511, 706, 412, 1),
(3, 1530, 620, 333, 502, 711, 421, 1),
(4, 1530, 618, 333, 511, 711, 405, 1),
(5, 1530, 613, 333, 510, 705, 426, 1),
(6, 1530, 612, 333, 511, 711, 412, 1),
(7, 1530, 613, 333, 510, 707, 422, 1),
(1, 1600, 621, 333, 511, 709, 416, 1),
(2, 1600, 621, 333, 511, 709, 416, 1),
(3, 1600, 620, 333, 508, 711, 428, 1),
(4, 1600, 617, 333, 511, 711, 414, 1),
(5, 1600, 620, 333, 510, 705, 426, 1),
(6, 1600, 617, 333, 511, 711, 414, 1),
(7, 1600, 622, 333, 510, 709, 418, 1),
(1, 1700, 621, 333, 511, 709, 428, 1),
(2, 1700, 617, 333, 511, 714, 426, 1),
(3, 1700, 620, 333, 510, 711, 428, 1),
(4, 1700, 621, 333, 511, 706, 430, 1),
(5, 1700, 616, 333, 510, 712, 428, 1),
(6, 1700, 615, 333, 511, 713, 428, 1),
(7, 1700, 622, 333, 510, 714, 422, 1),
(1, 1800, 621, 333, 511, 712, 431, 1),
(2, 1800, 617, 333, 511, 714, 432, 1),
(3, 1800, 620, 333, 510, 712, 431, 1),
(4, 1800, 619, 333, 511, 713, 432, 1),
(5, 1800, 620, 333, 510, 715, 431, 1),
(6, 1800, 619, 333, 511, 714, 432, 1),
(7, 1800, 620, 333, 510, 715, 431, 1);

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

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`nroPaciente`, `nombre`, `edad`, `altura`, `pesoActual`, `pesoBuscado`, `codDieta`) VALUES
(1, 'Gabriel Ortega', 36, 1.72, 92.4, 82.5, NULL),
(2, 'Ana Paez', 41, 1.69, 87, 80, NULL),
(3, 'Jorge Bataglia', 28, 1.66, 89, 76, NULL),
(4, 'Analía Ortega', 36, 1.73, 107, 70, NULL),
(5, 'Pablo Benitez', 42, 1.82, 75, 77, NULL),
(6, 'Gabriel Ortega', 36, 1.72, 92.4, 82.5, NULL),
(7, 'Ana Paez', 41, 1.69, 87, 80, NULL),
(8, 'Jorge Bataglia', 28, 1.66, 89, 76, NULL),
(9, 'Analía Ortega', 36, 1.73, 107, 70, NULL),
(10, 'Pablo Benitez', 42, 1.82, 75, 77, NULL);

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
  MODIFY `codAlimento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `conComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=723;

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
  MODIFY `nroPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

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
