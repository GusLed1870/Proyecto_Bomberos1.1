-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 23:49:51
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberosg77`
--
CREATE DATABASE IF NOT EXISTS `bomberosg77` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bomberosg77`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `id_bombero` int(11) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre_ape` varchar(50) NOT NULL,
  `fecha_nac` date NOT NULL,
  `celular` int(15) NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `grupoSanguineo` varchar(4) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `dni`, `nombre_ape`, `fecha_nac`, `celular`, `codBrigada`, `grupoSanguineo`, `estado`) VALUES
(1, '45876246', 'Alexis Ezequiel Twaska', '1998-10-16', 1134593421, 29, 'A+', 1),
(2, '25968500', 'Leonardo Daniel Lipiejko', '1978-06-02', 1121566850, 10, 'B+', 1),
(3, '28052510', 'Sebastián Ramírez', '2004-10-24', 1152367800, 17, 'AB-', 1),
(4, '28632456', 'Hernán Gabriel Díaz', '2000-02-09', 1125473212, 4, '0+', 1),
(5, '10000000', 'Lionel Messi', '1980-05-01', 1184563265, 10, 'A-', 1),
(6, '10', 'Diego Armando Maradona', '1960-10-10', 1136952136, 25, 'A-', 1),
(7, '26789654', 'Marcos Andrés Rojo', '2000-10-26', 1124569874, 17, '0-', 1),
(8, '29940864', 'Nahuel Leandro Insaurralde ', '1983-04-29', 1125468526, 20, 'B+', 1),
(9, '36854621', 'Federico Matías Lopardo', '2001-05-03', 1135856456, 22, 'A+', 1),
(10, '27658159', 'Cristian Omar Altamirano', '1977-05-12', 1124563587, 32, 'B-', 1),
(11, '10852654', 'Carlos Daniel Medina', '1985-10-15', 1125478632, 25, 'AB+', 1),
(13, '24368951', 'Javier Omar Olmedo', '1975-10-18', 1165854525, 6, 'A+', 1),
(14, '24698751', 'Luis Cáceres', '1977-03-16', 1124587659, 12, 'A-', 1),
(15, '35785469', 'Anibal Ibarra', '1977-02-17', 1136525584, 6, 'B+', 1),
(16, '30452647', 'Adrian Toledo', '1987-05-16', 1135556878, 2, 'A+', 1),
(17, '26598456', 'Eduardo Garzón', '1978-05-02', 1132546851, 6, 'A-', 1),
(18, '28453145', 'NelsonCastro', '2023-10-14', 12323232, 8, 'AB-', 1),
(24, '35854126', 'Carolina Aguilar', '1983-10-13', 1146858536, 2, 'A-', 1),
(25, '34547893', 'Patricia Giardone', '1993-11-24', 1125645893, 2, 'A-', 1),
(26, '35841256', 'Bárbara Haspert', '2023-11-17', 1135625863, 8, 'B-', 1),
(27, '12584367', 'Jorge Steiman', '1975-09-20', 1123564587, 17, '0+', 1),
(29, '30458246', 'Florencia Guzman', '1981-03-17', 1125487636, 17, '0+', 1),
(43, '45685254', 'Elena Calderini', '1997-10-17', 1125399971, 29, 'B-', 1),
(60, '45364123', 'Felix Vera', '2000-09-16', 1642356541, 2, 'AB-', 1),
(65, '26874596', 'Darío Nuñez', '1981-01-29', 1124756851, 4, 'A+', 1),
(68, '35148657', 'Ian Garro', '2023-10-05', 1223336784, 17, 'A+', 1),
(78, '26847562', 'Julián Zarate', '1984-05-15', 1548765233, 10, 'B+', 1),
(79, '23456764', 'Pablo Cosentini', '1980-01-03', 1123443453, 32, 'AB-', 1),
(80, '32158741', 'Enrique Monzón', '1930-10-04', 1125463528, 6, 'B-', 1),
(81, '28576928', 'Ariel Mora', '2023-10-05', 1157456825, 12, 'B-', 1),
(82, '22576359', 'Gastón Díaz', '1990-10-18', 1124763225, 2, 'A+', 1),
(83, '22378675', 'Germán Franch', '2000-10-03', 1125346875, 34, 'A-', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombre_br` varchar(20) NOT NULL,
  `especialidad` varchar(60) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `nro_cuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`) VALUES
(2, 'Alfa', 'Incendios en viviendas, e industrias', 1, 4),
(4, 'Bravo', 'Salvamento en derrumbes', 1, 5),
(6, 'Delta', 'Rescate de personas atrapadas en accidentes de tránsito', 1, 3),
(8, 'Foxtrot', 'Operativos de prevención', 1, 3),
(10, 'Hotel', 'Operativos de prevención', 1, 5),
(12, 'Juliet', 'Socorrer inundaciones', 1, 4),
(17, 'Oscar', 'Rescate de personas atrapadas en accidentes de tráfico', 1, 5),
(20, 'Romeo', 'Rescates en ámbito montaña', 1, 8),
(22, 'Tango', 'Salvamento en derrumbes', 1, 3),
(25, 'Whiskey', 'Incendios en viviendas, e industrias', 1, 3),
(28, 'Zulu', 'Incendios en viviendas, e industrias', 1, 5),
(29, 'Elephant', 'Operativos de prevención', 1, 3),
(31, 'Sigma', 'Socorrer inundaciones', 1, 4),
(32, 'Griffo', 'Salvamento en derrumbes', 1, 3),
(33, 'Hilton', 'Rescates en ámbito montaña', 1, 3),
(34, 'Natalia', 'Incendios en viviendas, e industrias', 1, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `codCuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(40) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`) VALUES
(3, 'Estación II Patricios', 'Av. Caseros 2849', 3445, 4567, '4943-2222', 'estpalermo@gmail.com'),
(4, 'Destacamento Nueva Pompeya', 'Av. Saenz 1457', 2342, 1275, '4911-4852', 'destnuevap@gmail.com'),
(5, 'Estación III Barracas', 'Brandsen 1046', 8234, 975, '4567-8655', 'estbarracas3@gmail.com'),
(6, 'Destacamento La Boca', 'Av. Alte. Brown y Av. Don Pedro de Mendoza', 2434, 4573, '4301-2121', 'labocadestac@gmail.com'),
(7, 'Estación IV Recoleta', 'Laprida 1739', 1237, 4564, '4826-0222', 'est4recoleta@gmail.com'),
(8, 'Destacamento Once', 'Tte. General Juan domingo Perón 2930', 1389, 6527, '4863-2884', 'destaconce@gmail.com'),
(9, 'Destacamento Retiro', 'Terminal de Ómnibus de Retiro', 4216, 5684, '4313-7343', 'retdestacam@gmail.com'),
(10, 'Destacamento 9 de Julio', 'Cerrito y Sarmiento', 6324, 1786, '1128607191', 'destjulio9@yahoo.com.ar'),
(11, 'Estación V Belgrano', 'Vuelta de Obligado 2254', 4965, 7325, '4783-0820', 'est5bel@hotmail.com'),
(12, 'Destacamento Urquiza', 'Av. Olazabal 5446', 7532, 8512, '4521-2222', 'urquidesta@hotmail.com'),
(13, 'Estación VI Villa Crespo', 'Av. Corrientes 5340', 3458, 4456, '4854-2222', 'estvillcresp6@yahoo.com'),
(14, 'Destacamento Palermo', 'Guatemala 5966', 1389, 2415, '4772-2222', 'bomberospalermo@gmail.com'),
(15, 'Destacamento Chacarita', 'Santos Dumont 4354', 2346, 1597, '4584-3333', 'chacabomberos@yahoo.com.ar'),
(16, 'Estación VII Flores', 'Cnel. Ramón L. Falcón 2255', 3284, 4812, '4632-5806', 'estflores7@hotmail.com.ar'),
(17, 'Estación VIII Nueva Chicago', 'Av. Lisandro de la Torre 2830', 1358, 1649, '4687-2222', 'nuevachicagoest7@gmail.com'),
(18, 'Destacamento Vélez Sarsfield', 'José E. Rodo 4474', 1147, 2583, '4671-2222', 'velezdest@yahoo.com'),
(19, 'Estación IX Versalles', 'Manuel Porcel de Peralta 750', 2511, 3267, '4641-0326', 'versaest9@gmail.com'),
(20, 'Destacamento Villa Devoto', 'José Cubas 4146', 2155, 3422, '45012223', 'vildevbomb@gmail.com'),
(21, 'Estación X Lugano', 'Cafayate y Ana Diaz', 3618, 2634, '4605-4242', 'luganoxest@yahoo.com'),
(22, 'Estación XI Albariño', 'Santander 5955', 2485, 3246, '4601-8801', 'albariest@hotmail.com'),
(23, 'Destacamento G.E.R. Caballito', 'Riglos 959', 1114, 6954, '4921-2737', 'gercaballito@gmail.com'),
(24, 'Destacamento G.E.R. Saavedra', ' Jaramillo 3551', 2599, 4288, '4542-2222', 'saavedreger@hotmail.com'),
(25, 'Estación II Patricios', 'Av. Caseros 2849', 3445, 4567, '4943-2222', 'estpalermo@gmail.com'),
(26, 'Destacamento Nueva Pompeya', 'Av. Saenz 1457', 2342, 1275, '4911-4852', 'jhgghfh@gmail.com'),
(27, 'Estación III Barracas', 'Brandsen 1046', 8234, 975, '4567-8655', 'dhfhswjj@gmail.com'),
(30, 'Cuartel Colegiales', 'Enrique Martinez 3200', 234, 178, '45548039', 'cuarCol@gmail.com'),
(31, '788', '4545', 4545, 5445, '45454', 'jost@hotmail.com'),
(32, 'Cuartel V Puerto Madero', 'Huergo 2347', 196, 598, '45578976', 'maderov@gmail.com'),
(33, 'Cuartel II Saavedra', 'Machain 3875', 378, 1123, '45679876', 'correo@h@yu'),
(34, 'Cuartel II Saavedra', 'Machain 3875', 378, 1123, '45679876', 'correcuaSaav@gmail.com'),
(35, 'Cuartel II Belgrano', 'Charcas 2354', 236, 1289, '45679075', 'belg2Cuart@gmail.com'),
(36, 'Estación III Barracas', 'Brandsen 1046', 285, 975, '4567-8655', 'estbarracas3@gmail.com'),
(37, 'Cuartel II Palermo', 'Gorriti 5720', 1865, 7501, '43678658', 'cp2bomberos@gmail.com'),
(38, 'Destacamento Nuñez II', 'Mendoza 5934', 3560, 1245, '45685475', 'nunezdestsegundo@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(60) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `detalles` text NOT NULL,
  `fecha_resol` date DEFAULT NULL,
  `puntuacion` int(11) NOT NULL,
  `codBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codigo`, `tipo`, `fecha_siniestro`, `coord_X`, `coord_Y`, `detalles`, `fecha_resol`, `puntuacion`, `codBrigada`) VALUES
(13, 'Socorrer inundaciones', '2023-10-23', 545, 345, 'Desborde del Arroyo Maldonado en zona de Palermo', NULL, 0, 12),
(15, 'Salvamento en derrumbes', '2023-10-16', 9999, 456, 'Derrumbe en obra de Angel Carranza 2456', '2023-10-16', 0, 4),
(16, 'Rescates en ámbito montaña', '2023-10-20', 3556, 5555, 'Rescate en Cerro Tandil', '2023-10-21', 0, 33),
(17, 'Rescate de personas atrapadas en accidentes de tráfico', '2023-10-24', 674, 122, 'Accidente entre vehículos en Av. Córdoba 5640', '2023-10-24', 0, 6),
(18, 'Operativos de prevención', '2023-10-16', 23, 456, 'Charla educativa en escuela Nicolas Avellaneda, en El Salvador 5234', '2023-10-16', 0, 29),
(19, 'Incendios en viviendas, e industrias', '2023-08-09', 987, 5643, 'Incendio en Restaurante La Dorita, en Humboldt 5400', '2023-08-09', 0, 34),
(20, 'Incendios en viviendas, e industrias', '2023-10-17', 126, 234, 'Incendio en fábrica textil en Bouchard 3456', '2023-10-18', 0, 2),
(22, 'Incendios en viviendas, e industrias', '2023-10-05', 7643, 448, 'Incendio en descampado al costado de las vías del ferrocarril Mitre en Arévalo y Santa Fe', '2023-10-05', 0, 28),
(23, 'Incendios en viviendas, e industrias', '2023-10-05', 245, 5678, 'Incendio en supermercado Dia de Av. Córdoba 5621', '2023-10-04', 0, 34),
(25, 'Incendios en viviendas, e industrias', '2023-10-05', 452, 111, 'Incendio en papelera de Machain 4566', NULL, 0, 2),
(26, 'Incendios en viviendas, e industrias', '2023-10-05', 53, 2344, 'Incendio en vivienda de Paraguay 4567', '2023-10-05', 0, 34),
(27, 'Incendios en viviendas, e industrias', '2023-10-25', 5567, 678, 'Incendio en fábrica metarlúrgica en Caseros 3745', NULL, 0, 28),
(28, 'Incendios en viviendas, e industrias', '2023-10-26', 345, 235, 'Incendio en CEAMSE sito en Matienzo y Cramer', '2023-10-26', 0, 2),
(29, 'Socorrer inundaciones', '2023-10-27', 12, 48, 'Inundación en barrio de La Boca', NULL, 0, 31);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id_bombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codBrigada`),
  ADD KEY `nro_cuartel` (`nro_cuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=84;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`nro_cuartel`) REFERENCES `cuartel` (`codCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
