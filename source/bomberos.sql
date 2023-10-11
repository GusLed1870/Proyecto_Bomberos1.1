-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-10-2023 a las 21:01:08
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
-- Base de datos: `bomberos`
--
CREATE DATABASE IF NOT EXISTS `bomberos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bomberos`;

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
(1, '45698352', 'Alexis Ezequiel Twaska', '1998-10-16', 1132568742, 12, 'A+', 1),
(2, '25968500', 'Leonardo Daniel Lipiejko', '1978-06-02', 1125482363, 10, 'B+', 1),
(3, '28052510', 'Sebastián Ramírez', '2004-10-24', 1152367854, 2, 'AB-', 1),
(4, '28632456', 'Hernán Gabriel Díaz', '2000-02-09', 1125473212, 4, '0+', 1),
(5, '10000000', 'Lionel Messi', '2001-05-11', 1184563257, 6, 'A-', 1),
(6, '10', 'Diego Armando Maradona', '1960-10-30', 1125487625, 17, 'B+', 1),
(7, '26789654', 'Marcos Andrés Rojo', '2000-10-26', 1124569874, 17, '0-', 1),
(8, '29940865', 'Nahuel Leandro Insaurralde ', '1983-04-29', 1125468526, 20, 'AB-', 1),
(9, '36854621', 'Federico Matías Lopardo', '2001-05-03', 1135856456, 22, 'A+', 1),
(10, '27658159', 'Cristian Omar Altamirano', '1977-05-12', 1124563587, 28, 'B-', 1),
(11, '10852654', 'Carlos Daniel Medina', '1985-10-15', 1125478632, 25, 'AB+', 1),
(12, '12578632', 'Carlos Daniel Lipiejko', '2023-10-20', 1125368549, 12, 'B+', 1),
(13, '24368951', 'Javier Omar Olmedo', '1975-10-18', 1165854525, 6, 'A+', 1);

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
(2, 'Alfa', 'Incendios en viviendas, e  industrias', 1, 4),
(4, 'Bravo', 'Salvamento en derrumbes', 1, 5),
(6, 'Delta', 'Rescate de personas atrapadas en accidentes de tránsito', 1, 3),
(8, 'Foxtrot', 'Operativos de prevención', 1, 3),
(10, 'Hotel', 'Operativos de prevención', 1, 5),
(12, 'Juliet', 'Socorrer inundaciones', 1, 4),
(17, 'Oscar', 'Rescate de personas  atrapadas en accidentes de tráfico', 1, 5),
(20, 'Romeo', 'Rescates en ámbito montaña', 1, 4),
(22, 'Tango', 'Salvamento en derrumbes', 1, 3),
(25, 'Whiskey', 'Incendios en viviendas, e  industrias', 1, 3),
(28, 'Zulu', 'Incendios en viviendas, e  industrias', 1, 5);

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
(10, 'Destacamento 9 de Julio', 'Cerrito y Sarmiento', 6324, 1785, '1128607191', 'destjulio9@yahoo.com.ar'),
(11, 'Estación V Belgrano', 'Vuelta de Obligado 2254', 4965, 7325, '4783-0820', 'est5bel@hotmail.com'),
(12, 'Destacamento Urquiza', 'Av. Olazabal 5446', 7532, 8512, '4521-2222', 'urquidesta@hotmail.com'),
(13, 'Estación VI Villa Crespo', 'Av. Corrientes 5340', 3458, 4456, '4854-2222', 'estvillcresp6@yahoo.com'),
(14, 'Destacamento Palermo', 'Guatemala 5966', 1389, 2415, '4772-2222', 'bomberospalermo@gmail.com'),
(15, 'Destacamento Chacarita', 'Santos Dumont 4350', 2346, 1597, '4584-3333', 'chacabomberos@yahoo.com.ar'),
(16, 'Estación VII Flores', 'Cnel. Ramón L. Falcón 2255', 3284, 4812, '4632-5806', 'estflores7@hotmail.com.ar'),
(17, 'Estación VIII Nueva Chicago', 'Av. Lisandro de la Torre 2830', 1358, 1649, '4687-2222', 'nuevachicagoest7@gmail.com'),
(18, 'Destacamento Vélez Sarsfield', 'José E. Rodo 4474', 1147, 2583, '4671-2222', 'velezdest@yahoo.com'),
(19, 'Estación IX Versalles', 'Manuel Porcel de Peralta 750', 2511, 3267, '4641-0326', 'versaest9@gmail.com'),
(20, 'Destacamento Villa Devoto', 'José Cubas 4142', 2153, 7425, '4501-2222', 'vildevbomb@gmail.com'),
(21, 'Estación X Lugano', 'Cafayate y Ana Diaz', 3618, 2634, '4605-4242', 'luganoxest@yahoo.com'),
(22, 'Estación XI Albariño', 'Santander 5955', 2485, 3246, '4601-8801', 'albariest@hotmail.com'),
(23, 'Destacamento G.E.R. Caballito', 'Riglos 959', 1114, 6954, '4921-2737', 'gercaballito@gmail.com'),
(24, 'Destacamento G.E.R. Saavedra', ' Jaramillo 3551', 2599, 4288, '4542-2222', 'saavedreger@hotmail.com'),
(25, 'Estación II Patricios', 'Av. Caseros 2849', 3445, 4567, '4943-2222', 'estpalermo@gmail.com'),
(26, 'Destacamento Nueva Pompeya', 'Av. Saenz 1457', 2342, 1275, '4911-4852', 'jhgghfh@gmail.com'),
(27, 'Estación III Barracas', 'Brandsen 1046', 8234, 975, '4567-8655', 'dhfhswjj@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `detalles` text NOT NULL,
  `fecha_resol` date DEFAULT NULL,
  `puntuacion` int(11) NOT NULL,
  `codBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

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
