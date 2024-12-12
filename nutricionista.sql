-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-12-2024 a las 19:57:03
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
(301, 'Sopa de fideos', 'Almuerzo', 100, 'fideos', 0),
(302, 'Arroz con pollo + ensalada lechuga', 'Almuerzo', 102, 'arroz - lechuga - pollo', 0),
(303, 'Pollo dulce agrio de arroz', 'Almuerzo', 105, 'arroz - pollo - verduras', 0),
(304, 'Pure de calabaza c/ensalada pepino', 'Almuerzo', 109, 'pepino - zapallo', 0),
(305, 'Arroz con verduras', 'Almuerzo', 111, 'arroz - verduras', 0),
(306, 'Tarta de arroz', 'Almuerzo', 116, 'arroz', 0),
(307, 'Panqueques de avena y banana', 'Almuerzo', 118, 'avena - banana - verduras', 0),
(308, 'Paella', 'Almuerzo', 120, 'arroz', 0),
(309, 'Espaguetis con tomate', 'Almuerzo', 129, 'fideos - tomate', 0),
(310, 'Mollejas de pollo c/ensalada mixta', 'Almuerzo', 168, 'pollo - verduras', 0),
(311, 'Lasaña', 'Almuerzo', 171, 'fideos', 0),
(312, 'Empanada de jamon y queso', 'Almuerzo', 178, 'fiambre', 0),
(313, 'Pastel de carne c/ensalada verduras', 'Almuerzo', 179, 'carne - verduras', 0),
(314, 'Lentejas con arroz', 'Almuerzo', 185, 'arroz - lenteja', 0),
(315, 'Calabacín relleno c/carne res', 'Almuerzo', 187, 'carne - zapallo', 0),
(316, 'Puré de verduras c/carne mechada', 'Almuerzo', 195, 'carne - verduras', 0),
(317, 'Ravioles de verdura', 'Almuerzo', 201, 'verduras', 0),
(318, 'Tarta de carne', 'Almuerzo', 204, 'carne', 0),
(319, 'Carne asada c/ensalada tomate cebolla', 'Almuerzo', 230, 'carne - cebolla - tomate', 0),
(320, 'Pollo relleno c/ensalada pepino', 'Almuerzo', 235, 'pepino - pollo', 0),
(321, 'Sopa de tortilla', 'Almuerzo', 237, 'verduras', 0),
(322, 'Milanesa de pollo c/ensalada verduras', 'Almuerzo', 246, 'pollo - verduras', 0),
(323, 'Sopa de pollo', 'Almuerzo', 246, 'pollo', 0),
(324, 'Sopa de lentejas', 'Almuerzo', 25, 'lenteja', 0),
(325, 'Caldo de pollo con verduras', 'Almuerzo', 250, 'pollo - verduras', 0),
(326, 'Empanada de pescado', 'Almuerzo', 256, 'pescado', 0),
(327, 'Sopa de verduras', 'Almuerzo', 26, 'verduras', 0),
(328, 'Empanada de carne al horno', 'Almuerzo', 293, 'carne', 0),
(329, 'Carne con tomate', 'Almuerzo', 298, 'carne - tomate', 0),
(330, 'Caldo de carne', 'Almuerzo', 323, 'carne', 0),
(331, 'Empanada de carne c/ensalada lechuga', 'Almuerzo', 342, 'carne - lechuga', 0),
(332, 'Sopa de pollo con fideos', 'Almuerzo', 349, 'fideos - pollo', 0),
(333, 'Omelette c/ensalada tomate y cebolla', 'Almuerzo', 457, 'cebolla - huevo - queso - tomate', 0),
(334, 'Guiso de lentejas', 'Almuerzo', 52, 'lenteja', 0),
(335, 'Sopa de pollo y verduras', 'Almuerzo', 60, 'pollo - verduras', 0),
(336, 'Ceviche de pescado', 'Almuerzo', 68, 'pescado - verduras', 0),
(337, 'Locro', 'Almuerzo', 69, 'porotos', 0),
(338, 'Sopa de pollo con arroz', 'Almuerzo', 78, 'arroz - pollo', 0),
(339, 'Lentejas con chorizo', 'Almuerzo', 85, 'carne - lenteja', 0),
(340, 'Arroz con pollo y verduras', 'Almuerzo', 99, 'arroz - pollo - verduras', 0),
(401, 'Sopa de fideos', 'Cena', 100, 'fideos', 0),
(402, 'Arroz con pollo + ensalada lechuga', 'Cena', 102, 'arroz - lechuga - pollo', 0),
(403, 'Pollo dulce agrio de arroz', 'Cena', 105, 'arroz - pollo - verduras', 0),
(404, 'Pure de calabaza c/ensalada pepino', 'Cena', 109, 'pepino - zapallo', 0),
(405, 'Arroz con verduras', 'Cena', 111, 'arroz - verduras', 0),
(406, 'Tarta de arroz', 'Cena', 116, 'arroz', 1),
(407, 'Panqueques de avena y banana', 'Cena', 118, 'avena - banana - verduras', 0),
(408, 'Paella', 'Cena', 120, 'arroz', 1),
(409, 'Espaguetis con tomate', 'Cena', 129, 'fideos - tomate', 0),
(410, 'Mollejas de pollo c/ensalada mixta', 'Cena', 168, 'pollo - verduras', 0),
(411, 'Lasaña', 'Cena', 171, 'fideos', 0),
(412, 'Empanada de jamon y queso', 'Cena', 178, 'fiambre', 0),
(413, 'Pastel de carne c/ensalada verduras', 'Cena', 179, 'carne - verduras', 1),
(414, 'Lentejas con arroz', 'Cena', 185, 'arroz - lenteja', 0),
(415, 'Calabacín relleno c/carne res', 'Cena', 187, 'carne - zapallo', 0),
(416, 'Puré de verduras c/carne mechada', 'Cena', 195, 'carne - verduras', 0),
(417, 'Ravioles de verdura', 'Cena', 201, 'verduras', 0),
(418, 'Tarta de carne', 'Cena', 204, 'carne', 0),
(419, 'Carne asada c/ensalada tomate cebolla', 'Cena', 230, 'carne - cebolla - tomate', 0),
(420, 'Pollo relleno c/ensalada pepino', 'Cena', 235, 'pepino - pollo', 0),
(421, 'Sopa de tortilla', 'Cena', 237, 'verduras', 0),
(422, 'Milanesa de pollo c/ensalada verduras', 'Cena', 246, 'pollo - verduras', 0),
(423, 'Sopa de pollo', 'Cena', 246, 'pollo', 0),
(424, 'Sopa de lentejas', 'Cena', 25, 'lenteja', 0),
(425, 'Caldo de pollo con verduras', 'Cena', 250, 'pollo - verduras', 0),
(426, 'Empanada de pescado', 'Cena', 256, 'pescado', 1),
(427, 'Sopa de verduras', 'Cena', 26, 'verduras', 0),
(428, 'Empanada de carne al horno', 'Cena', 293, 'carne', 0),
(429, 'Carne con tomate', 'Cena', 298, 'carne - tomate', 0),
(430, 'Caldo de carne', 'Cena', 323, 'carne', 0),
(431, 'Empanada de carne c/ensalada lechuga', 'Cena', 342, 'carne - lechuga', 0),
(432, 'Sopa de pollo con fideos', 'Cena', 349, 'fideos - pollo', 0),
(433, 'Omelette c/ensalada tomate y cebolla', 'Cena', 457, 'cebolla - huevo - queso - tomate', 0),
(434, 'Guiso de lentejas', 'Cena', 52, 'lenteja', 0),
(435, 'Sopa de pollo y verduras', 'Cena', 60, 'pollo - verduras', 0),
(436, 'Ceviche de pescado', 'Cena', 68, 'pescado - verduras', 0),
(437, 'Locro', 'Cena', 69, 'porotos', 0),
(438, 'Sopa de pollo con arroz', 'Cena', 78, 'arroz - pollo', 0),
(439, 'Lentejas con chorizo', 'Cena', 85, 'carne - lenteja', 0),
(440, 'Arroz con pollo y verduras', 'Cena', 99, 'arroz - pollo - verduras', 0),
(501, 'Vaso de Chocolate caliente', 'Colacion', 132, 'chocolate - leche', 0),
(502, '200 grs Sandía', 'Colacion', 138, 'sandía', 0),
(503, 'Vaso de Leche light c/50 gr pasas uvas', 'Colacion', 141, 'kiwi', 0),
(504, '1 Durazno', 'Colacion', 144, 'durazno', 0),
(505, '200 grs Uvas', 'Colacion', 144, 'uvas', 0),
(506, '1 Naranja', 'Colacion', 147, 'naranja', 0),
(507, '1 Pomelo', 'Colacion', 147, 'pomelo', 0),
(508, '1 Manzana verde', 'Colacion', 151, 'manzana', 0),
(509, 'Vaso de Leche de almendras', 'Colacion', 22, 'almendra - leche', 0),
(510, '1 Banana frita', 'Colacion', 252, 'banana', 0),
(511, '2 o 3 Higos, secos', 'Colacion', 270, 'fruto seco', 0),
(512, 'Vaso de Leche de soja', 'Colacion', 36, 'leche - soja', 0),
(513, 'Vaso de Leche con avena', 'Colacion', 40, 'avena - leche', 0),
(514, '1 Mandarina', 'Colacion', 53, 'mandarina', 0),
(515, '100 grs Melón verde', 'Colacion', 56, 'melon', 0),
(516, '1 Pera', 'Colacion', 57, 'pera', 0),
(517, '2 Kiwi verde', 'Colacion', 61, 'kiwi', 0),
(518, '1 Manzana', 'Colacion', 64, 'manzana', 0),
(519, '1 Banana mediana', 'Colacion', 92, 'banana', 0),
(520, '150 ml Ensalada de frutas', 'Colacion', 97, 'frutas', 0),
(601, 'Caldo de verduras', 'Desayuno', 148, 'verduras', 0),
(602, '2 Huevos revueltos', 'Desayuno', 155, 'huevo', 0),
(603, 'Café con azúcar c/disco arroz', 'Desayuno', 210, 'café', 0),
(604, '2 Huevos revueltos c/tostada', 'Desayuno', 215, 'huevo - panificado', 0),
(605, 'Cafe con leche c/pan tostado integral', 'Desayuno', 240, 'café - leche - panificado', 1),
(606, 'Te Verde c/pan integral c/semillas', 'Desayuno', 242, 'panificado - te', 0),
(607, 'Café c/leche desc c/pan semillas', 'Desayuno', 250, 'café - leche - panificado', 1),
(608, 'Sandwich de jamón tostado', 'Desayuno', 255, 'fiambre - panificado', 0),
(609, 'Capuchino c/pan y queso', 'Desayuno', 271, 'café - leche - panificado - queso', 0),
(610, 'Café descafeinado c/pan tostado', 'Desayuno', 299, 'café - panificado', 0),
(611, 'Te Rojo c/pan blanco tostado', 'Desayuno', 301, 'panificado - te', 0),
(612, 'Té negro c/tostada mermelada', 'Desayuno', 324, 'mermelada - panificado - te', 0),
(613, 'Yerba mate c/tostada light', 'Desayuno', 325, 'mate - panificado', 0),
(614, 'Mate amargo c/tostada mermelada', 'Desayuno', 330, 'mate - mermelada - panificado', 0),
(615, '2 Huevos revueltos c/discos arroz', 'Desayuno', 355, 'huevo', 0),
(616, 'Tortitas de arroz integral', 'Desayuno', 383, 'panificado', 0),
(617, 'Omelette', 'Desayuno', 387, 'huevo - queso', 0),
(618, 'Té negro con leche c/factura', 'Desayuno', 391, 'leche - panificado - te', 0),
(619, 'Mate cocido c/pan tostado integral', 'Desayuno', 392, 'mate - panificado', 0),
(620, 'Omelette c/discos arroz', 'Desayuno', 397, 'huevo - queso', 0),
(621, 'Omelette c/tostada light', 'Desayuno', 407, 'huevo - panificado - queso', 0),
(622, 'Te con leche c/medialuna manteca', 'Desayuno', 415, 'leche - panificado - te', 0),
(701, 'Caldo de verduras', 'Merienda', 148, 'verduras', 0),
(702, '2 Huevos revueltos', 'Merienda', 155, 'huevo', 0),
(703, 'Café con azúcar c/disco arroz', 'Merienda', 210, 'café', 0),
(704, '2 Huevos revueltos c/tostada', 'Merienda', 215, 'huevo - panificado', 0),
(705, 'Cafe con leche c/pan tostado integral', 'Merienda', 240, 'café - leche - panificado', 0),
(706, 'Te Verde c/pan integral c/semillas', 'Merienda', 242, 'panificado - te', 0),
(707, 'Café c/leche desc c/pan semillas', 'Merienda', 250, 'café - leche - panificado', 0),
(708, 'Sandwich de jamón tostado', 'Merienda', 255, 'fiambre - panificado', 0),
(709, 'Capuchino c/pan y queso', 'Merienda', 271, 'café - leche - panificado - queso', 0),
(710, 'Café descafeinado c/pan tostado', 'Merienda', 299, 'café - panificado', 0),
(711, 'Te Rojo c/pan blanco tostado', 'Merienda', 301, 'panificado - te', 0),
(712, 'Té negro c/tostada mermelada', 'Merienda', 324, 'mermelada - panificado - te', 0),
(713, 'Yerba mate c/tostada light', 'Merienda', 325, 'mate - panificado', 0),
(714, 'Mate amargo c/tostada mermelada', 'Merienda', 330, 'mate - mermelada - panificado', 0),
(715, '2 Huevos revueltos c/discos arroz', 'Merienda', 355, 'huevo', 0),
(716, 'Tortitas de arroz integral', 'Merienda', 383, 'panificado', 0),
(717, 'Omelette', 'Merienda', 387, 'huevo - queso', 0),
(718, 'Té negro con leche c/factura', 'Merienda', 391, 'leche - panificado - te', 0),
(719, 'Mate cocido c/pan tostado integral', 'Merienda', 392, 'mate - panificado', 0),
(720, 'Omelette c/discos arroz', 'Merienda', 397, 'huevo - queso', 0),
(721, 'Omelette c/tostada light', 'Merienda', 407, 'huevo - panificado - queso', 0),
(722, 'Te con leche c/medialuna manteca', 'Merienda', 415, 'leche - panificado - te', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comidaalimento`
--

CREATE TABLE `comidaalimento` (
  `conComida` int(11) NOT NULL,
  `codAlimento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comidaalimento`
--

INSERT INTO `comidaalimento` (`conComida`, `codAlimento`) VALUES
(509, 1),
(302, 2),
(402, 2),
(303, 2),
(403, 2),
(305, 2),
(405, 2),
(306, 2),
(406, 2),
(308, 2),
(408, 2),
(314, 2),
(414, 2),
(338, 2),
(438, 2),
(340, 2),
(440, 2),
(307, 3),
(407, 3),
(513, 3),
(307, 4),
(407, 4),
(510, 4),
(519, 4),
(603, 5),
(703, 5),
(605, 5),
(705, 5),
(607, 5),
(707, 5),
(609, 5),
(709, 5),
(610, 5),
(710, 5),
(313, 6),
(413, 6),
(315, 6),
(415, 6),
(316, 6),
(416, 6),
(318, 6),
(418, 6),
(319, 6),
(419, 6),
(328, 6),
(428, 6),
(329, 6),
(429, 6),
(330, 6),
(430, 6),
(331, 6),
(431, 6),
(339, 6),
(439, 6),
(319, 7),
(419, 7),
(333, 7),
(433, 7),
(501, 8),
(504, 9),
(312, 10),
(412, 10),
(608, 10),
(708, 10),
(301, 11),
(401, 11),
(309, 11),
(409, 11),
(311, 11),
(411, 11),
(332, 11),
(432, 11),
(520, 12),
(511, 13),
(602, 14),
(702, 14),
(604, 14),
(704, 14),
(615, 14),
(715, 14),
(617, 14),
(717, 14),
(620, 14),
(720, 14),
(621, 14),
(721, 14),
(333, 14),
(433, 14),
(517, 15),
(501, 16),
(509, 16),
(605, 16),
(705, 16),
(607, 16),
(707, 16),
(609, 16),
(709, 16),
(512, 16),
(618, 16),
(718, 16),
(513, 16),
(622, 16),
(722, 16),
(503, 15),
(302, 18),
(402, 18),
(331, 18),
(431, 18),
(314, 19),
(414, 19),
(324, 19),
(424, 19),
(334, 19),
(434, 19),
(339, 19),
(439, 19),
(514, 20),
(508, 21),
(518, 21),
(613, 22),
(713, 22),
(614, 22),
(714, 22),
(619, 22),
(719, 22),
(515, 23),
(612, 24),
(712, 24),
(614, 24),
(714, 24),
(506, 25),
(604, 26),
(704, 26),
(605, 26),
(705, 26),
(606, 26),
(706, 26),
(607, 26),
(707, 26),
(608, 26),
(708, 26),
(609, 26),
(709, 26),
(610, 26),
(710, 26),
(611, 26),
(711, 26),
(612, 26),
(712, 26),
(613, 26),
(713, 26),
(614, 26),
(714, 26),
(616, 26),
(716, 26),
(618, 26),
(718, 26),
(619, 26),
(719, 26),
(621, 26),
(721, 26),
(622, 26),
(722, 26),
(304, 27),
(404, 27),
(320, 27),
(420, 27),
(516, 28),
(326, 29),
(426, 29),
(336, 29),
(436, 29),
(302, 30),
(402, 30),
(303, 30),
(403, 30),
(310, 30),
(410, 30),
(320, 30),
(420, 30),
(322, 30),
(323, 30),
(422, 30),
(423, 30),
(325, 30),
(425, 30),
(332, 30),
(432, 30),
(335, 30),
(435, 30),
(338, 30),
(438, 30),
(340, 30),
(440, 30),
(507, 31),
(337, 32),
(437, 32),
(609, 33),
(709, 33),
(617, 33),
(717, 33),
(620, 33),
(720, 33),
(621, 33),
(721, 33),
(333, 33),
(433, 33),
(502, 34),
(512, 35),
(606, 36),
(706, 36),
(611, 36),
(711, 36),
(612, 36),
(712, 36),
(618, 36),
(718, 36),
(622, 36),
(722, 36),
(309, 37),
(409, 37),
(319, 37),
(419, 37),
(329, 37),
(429, 37),
(333, 37),
(433, 37),
(505, 38),
(303, 39),
(403, 39),
(305, 39),
(405, 39),
(307, 39),
(407, 39),
(601, 39),
(701, 39),
(310, 39),
(410, 39),
(313, 39),
(413, 39),
(316, 39),
(416, 39),
(317, 39),
(417, 39),
(321, 39),
(421, 39),
(322, 39),
(422, 39),
(325, 39),
(425, 39),
(327, 39),
(427, 39),
(335, 39),
(435, 39),
(336, 39),
(436, 39),
(340, 39),
(440, 39),
(304, 40),
(404, 40),
(315, 40),
(415, 40);

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
  `nroPaciente` int(11) DEFAULT NULL,
  `cantMenu` int(2) NOT NULL,
  `kcalSelec` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`codDieta`, `nombreD`, `fechaIni`, `fechaFin`, `pesoFin`, `estado`, `totalCalorias`, `nroPaciente`, `cantMenu`, `kcalSelec`) VALUES
(1, 'Dieta Lunar', '2024-12-06', '2024-12-06', 0, 0, 0, 4, 5, '10500k-MuyAlto'),
(2, 'Dieta Lunar', '2024-12-04', '2024-12-04', 0, 0, 0, 5, 5, '10500k-MuyAlto'),
(3, 'DIETA LUNAR', '2024-07-05', '2024-12-07', 0, 0, 0, 1, 7, '8050k-Medio'),
(4, 'DIETA LUNAR', '2024-10-10', '2024-12-14', 0, 0, 0, 1, 7, '8050k-Medio'),
(5, 'DIETA LUNAR', '2024-10-03', '2024-12-22', 0, 0, 0, 1, 7, '8050k-Medio'),
(6, 'DIETA LUNAR', '2024-11-01', '2024-12-14', 0, 0, 0, 14, 7, '8050k-Medio');

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
  `desayuno` varchar(150) NOT NULL,
  `almuerzo` varchar(150) NOT NULL,
  `colacion` varchar(150) NOT NULL,
  `merienda` varchar(150) NOT NULL,
  `cena` varchar(150) NOT NULL,
  `kcalTotal` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `codDieta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `menudiario`
--

INSERT INTO `menudiario` (`codMenu`, `diaNro`, `desayuno`, `almuerzo`, `colacion`, `merienda`, `cena`, `kcalTotal`, `estado`, `codDieta`) VALUES
(104, 1, 'Te Verde c/pan integral c/semillas (95.0 grs)', 'Carne con tomate (115.0 grs)', '2 Huevos revueltos (74.0 grs)', '200 grs Sandía (83.0 grs)', 'Arroz con pollo + ensalada lechuga (338.0 grs)', 1150, 1, 1),
(105, 2, 'Mate amargo c/tostada mermelada (69.0 grs)', 'Caldo de carne (106.0 grs)', '2 Huevos revueltos (74.0 grs)', '1 Banana mediana (125.0 grs)', 'Sopa de fideos (345.0 grs)', 1150, 1, 1),
(106, 3, 'Mate amargo c/tostada mermelada (69.0 grs)', 'Caldo de carne (106.0 grs)', '2 Huevos revueltos (74.0 grs)', '1 Naranja (78.0 grs)', ' (0 grs)', 805, 1, 1),
(107, 4, 'Yerba mate c/tostada light (70.0 grs)', 'Carne con tomate (115.0 grs)', '2 Huevos revueltos (74.0 grs)', '2 o 3 Higos, secos (42.0 grs)', 'Arroz con pollo + ensalada lechuga (338.0 grs)', 1150, 1, 1),
(108, 5, 'Omelette c/discos arroz (57.0 grs)', 'Caldo de carne (106.0 grs)', '2 Huevos revueltos (74.0 grs)', '1 Naranja (78.0 grs)', 'Empanada de jamon y queso (193.0 grs)', 1150, 1, 1),
(109, 6, 'Omelette c/discos arroz (57.0 grs)', 'Carne con tomate (115.0 grs)', 'Te Verde c/pan integral c/semillas (47.0 grs)', '1 Banana frita (45.0 grs)', 'Arroz con verduras (310.0 grs)', 1150, 1, 1),
(110, 7, 'Omelette c/discos arroz (57.0 grs)', 'Caldo de carne (106.0 grs)', 'Cafe con leche c/pan tostado integral (47.0 grs)', '2 o 3 Higos, secos (42.0 grs)', ' (0 grs)', 805, 1, 1),
(111, 1, 'Te Verde c/pan integral c/semillas (95.0 grs)', 'Carne con tomate (115.0 grs)', '2 Huevos revueltos (74.0 grs)', '200 grs Sandía (83.0 grs)', 'Arroz con pollo + ensalada lechuga (338.0 grs)', 1147, 1, 6),
(112, 2, 'Mate amargo c/tostada mermelada (69.0 grs)', 'Caldo de carne (106.0 grs)', '2 Huevos revueltos (74.0 grs)', '1 Banana mediana (125.0 grs)', 'Sopa de fideos (345.0 grs)', 1147, 1, 6),
(113, 3, 'Mate amargo c/tostada mermelada (69.0 grs)', 'Caldo de carne (106.0 grs)', '2 Huevos revueltos (74.0 grs)', '1 Naranja (78.0 grs)', ' (0 grs)', 802, 1, 6),
(114, 4, 'Yerba mate c/tostada light (70.0 grs)', 'Carne con tomate (115.0 grs)', '2 Huevos revueltos (74.0 grs)', '2 o 3 Higos, secos (42.0 grs)', 'Arroz con pollo + ensalada lechuga (338.0 grs)', 1147, 1, 6),
(115, 5, 'Omelette c/discos arroz (57.0 grs)', 'Caldo de carne (106.0 grs)', '2 Huevos revueltos (74.0 grs)', '1 Naranja (78.0 grs)', 'Empanada de jamon y queso (193.0 grs)', 1147, 1, 6),
(116, 6, 'Omelette c/discos arroz (57.0 grs)', 'Carne con tomate (115.0 grs)', 'Te Verde c/pan integral c/semillas (47.0 grs)', '1 Banana frita (45.0 grs)', 'Arroz con verduras (310.0 grs)', 1147, 1, 6),
(117, 7, 'Omelette c/discos arroz (57.0 grs)', 'Caldo de carne (106.0 grs)', 'Cafe con leche c/pan tostado integral (47.0 grs)', '2 o 3 Higos, secos (42.0 grs)', ' (0 grs)', 802, 1, 6);

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
(3, 'Jorge Bataglia', 36, 1.659999966621399, 89, 76, NULL),
(4, 'Analía Ortega', 36, 1.73, 107, 70, NULL),
(5, 'Pablo Benitez', 42, 1.82, 75, 77, NULL),
(6, 'Gabriel Ortega', 36, 1.72, 92.4, 82.5, NULL),
(8, 'Jorge Bataglia', 28, 3, 89, 76, NULL),
(10, 'Pablo Benitez', 42, 1.82, 75, 77, NULL),
(11, 'Diego Gallardo', 45, 1.75, 82, 78, NULL),
(12, 'Diego Gallardo', 45, 1.75, 82, 78, NULL),
(13, 'Diego Gallardo', 45, 1.75, 82, 78, NULL),
(14, 'Diego Gallardo', 45, 1.75, 80, 77, NULL);

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

--
-- Volcado de datos para la tabla `renglondemenu`
--

INSERT INTO `renglondemenu` (`nroRenglon`, `cantidadGrs`, `subtotalCalorias`, `conComida`) VALUES
(31738, 155, 230, 601),
(31739, 148, 230, 602),
(31740, 109, 230, 603),
(31741, 106, 230, 604),
(31742, 95, 230, 606),
(31743, 90, 230, 608),
(31744, 84, 230, 609),
(31745, 76, 230, 610),
(31746, 76, 230, 611),
(31747, 70, 230, 612),
(31748, 70, 230, 613),
(31749, 69, 230, 614),
(31750, 64, 230, 615),
(31751, 60, 230, 616),
(31752, 59, 230, 617),
(31753, 58, 230, 618),
(31754, 58, 230, 619),
(31755, 57, 230, 620),
(31756, 56, 230, 621),
(31757, 55, 230, 622),
(31758, 345, 345, 301),
(31759, 338, 344, 302),
(31760, 328, 344, 303),
(31761, 316, 344, 304),
(31762, 310, 344, 305),
(31763, 297, 344, 306),
(31764, 292, 344, 307),
(31765, 287, 344, 308),
(31766, 267, 344, 309),
(31767, 205, 344, 310),
(31768, 201, 343, 311),
(31769, 193, 343, 312),
(31770, 192, 343, 313),
(31771, 186, 344, 314),
(31772, 184, 344, 315),
(31773, 176, 343, 316),
(31774, 171, 343, 317),
(31775, 169, 344, 318),
(31776, 150, 345, 319),
(31777, 146, 343, 320),
(31778, 145, 343, 321),
(31779, 140, 344, 322),
(31780, 140, 344, 323),
(31781, 1380, 345, 324),
(31782, 138, 345, 325),
(31783, 134, 343, 326),
(31784, 1326, 344, 327),
(31785, 117, 342, 328),
(31786, 115, 342, 329),
(31787, 106, 342, 330),
(31788, 100, 342, 331),
(31789, 98, 342, 332),
(31790, 75, 342, 333),
(31791, 663, 344, 334),
(31792, 575, 345, 335),
(31793, 507, 344, 336),
(31794, 500, 345, 337),
(31795, 442, 344, 338),
(31796, 405, 344, 339),
(31797, 348, 344, 340),
(31798, 87, 115, 501),
(31799, 83, 115, 502),
(31800, 81, 115, 503),
(31801, 79, 115, 504),
(31802, 79, 115, 505),
(31803, 78, 115, 506),
(31804, 78, 115, 507),
(31805, 76, 115, 508),
(31806, 522, 115, 509),
(31807, 45, 115, 510),
(31808, 42, 115, 511),
(31809, 319, 115, 512),
(31810, 287, 115, 513),
(31811, 216, 115, 514),
(31812, 205, 115, 515),
(31813, 201, 115, 516),
(31814, 188, 115, 517),
(31815, 179, 115, 518),
(31816, 125, 115, 519),
(31817, 118, 115, 520),
(31818, 77, 115, 701),
(31819, 74, 115, 702),
(31820, 54, 115, 703),
(31821, 53, 115, 704),
(31822, 47, 115, 705),
(31823, 47, 115, 706),
(31824, 46, 115, 707),
(31825, 45, 115, 708),
(31826, 42, 115, 709),
(31827, 38, 115, 710),
(31828, 38, 115, 711),
(31829, 35, 115, 712),
(31830, 35, 115, 713),
(31831, 34, 115, 714),
(31832, 32, 115, 715),
(31833, 30, 115, 716),
(31834, 29, 115, 717),
(31835, 29, 115, 718),
(31836, 29, 115, 719),
(31837, 28, 115, 720),
(31838, 28, 115, 721),
(31839, 27, 115, 722),
(31840, 345, 345, 401),
(31841, 338, 345, 402),
(31842, 328, 345, 403),
(31843, 316, 345, 404),
(31844, 310, 345, 405),
(31845, 292, 345, 407),
(31846, 267, 345, 409),
(31847, 205, 345, 410),
(31848, 201, 345, 411),
(31849, 193, 345, 412),
(31850, 186, 345, 414),
(31851, 184, 345, 415),
(31852, 176, 345, 416),
(31853, 171, 345, 417),
(31854, 169, 345, 418),
(31855, 150, 345, 419),
(31856, 146, 345, 420),
(31857, 145, 345, 421),
(31858, 140, 345, 422),
(31859, 140, 345, 423),
(31860, 1380, 345, 424),
(31861, 138, 345, 425),
(31862, 1326, 345, 427),
(31863, 117, 345, 428),
(31864, 115, 345, 429),
(31865, 106, 345, 430),
(31866, 100, 345, 431),
(31867, 98, 345, 432),
(31868, 75, 345, 433),
(31869, 663, 345, 434),
(31870, 575, 345, 435),
(31871, 507, 345, 436),
(31872, 500, 345, 437),
(31873, 442, 345, 438),
(31874, 405, 345, 439),
(31875, 348, 345, 440);

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
-- Volcado de datos para la tabla `seleccaloria`
--

INSERT INTO `seleccaloria` (`diaNro`, `k5850`, `k7000`, `k8050`, `k9450`, `k10500`) VALUES
(1, 750, 850, 1000, 1150, 1300),
(2, 935, 1150, 1300, 1530, 1700),
(3, 800, 935, 1075, 1260, 1400),
(4, 900, 1075, 1200, 1440, 1600),
(5, 700, 800, 935, 1075, 1200),
(6, 1000, 1200, 1350, 1600, 1800),
(7, 750, 1000, 1150, 1350, 1500);

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
  MODIFY `codDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `menudiario`
--
ALTER TABLE `menudiario`
  MODIFY `codMenu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=118;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `nroPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  MODIFY `nroRenglon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31876;

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
