-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-05-2021 a las 01:22:05
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `universidadgrupo1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `apellido` varchar(15) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `legajo` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `nombre`, `apellido`, `fecha_nacimiento`, `legajo`, `estado`) VALUES
(9, 'Roberto', 'Perez', '1999-02-08', 151015, 1),
(11, 'Ezequiel', 'Acevedo', '2000-03-22', 784514, 1),
(15, 'Laucha', 'Saucedo', '1994-06-29', 123456, 1),
(16, 'Ezequiel', 'Coronel', '1999-06-08', 174, 0),
(18, 'Martin', 'Lopez', '1999-06-08', 175, 1),
(20, 'Daniel', 'Perez', '1993-06-01', 176, 1),
(21, 'Daniel', 'Lucero', '1999-06-08', 172, 1),
(22, 'Roberto', 'Manz', '1996-08-05', 177, 1),
(24, 'Roberto', 'Madz', '1996-08-05', 178, 1),
(25, 'Daniel', 'Coronel', '1999-06-08', 180, 0),
(26, 'Roberto', 'Magallanes', '1996-08-05', 188, 0),
(33, 'Damian', 'Gani', '1996-12-06', 190, 0),
(34, 'David', 'Valk', '1996-07-12', 292, 1),
(35, 'Carolina', 'Montenegro', '1972-10-06', 199, 0),
(36, 'Gabriel', 'Manzur', '1999-05-28', 202, 0),
(37, 'Maria', 'Flores', '1996-10-15', 203, 0),
(43, 'Victor', 'Gonzales', '1999-06-06', 204, 0),
(48, 'Alan', 'Russo', '1996-05-20', 205, 1),
(49, 'Lionel Miguel', 'Jordan', '1998-05-20', 207, 1),
(50, 'Julian', 'Sosa', '1996-05-06', 270, 1),
(56, 'Daniel', 'Coronel', '1999-06-08', 210, 1),
(60, 'Luis Martin', 'Martinez', '1998-10-24', 211, 1),
(62, 'Sergio', 'Lopez', '1992-08-12', 271, 1),
(64, 'Emilio Fidel', 'Jimenez', '1995-09-16', 272, 1),
(65, 'Angelica', 'Ediya', '2000-09-18', 281, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursada`
--

CREATE TABLE `cursada` (
  `idCursada` int(11) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL,
  `nota` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cursada`
--

INSERT INTO `cursada` (`idCursada`, `idAlumno`, `idMateria`, `nota`) VALUES
(11, 11, 5, 10),
(16, 33, 9, 8.5),
(17, 16, 4, 0),
(22, 9, 9, 0),
(23, 9, 8, 0),
(24, 9, 4, 0),
(25, 15, 9, 0),
(26, 15, 8, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre_materia` varchar(30) NOT NULL,
  `anio` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `nombre_materia`, `anio`, `estado`) VALUES
(4, 'Laboratorio de Programacion 1', 4, 1),
(5, 'EDA', 3, 1),
(8, 'Ingles 1', 1, 0),
(9, 'Matematica 2', 2, 0),
(11, 'Desarrollo Android', 1, 1),
(12, 'Ingles 3', 3, 1),
(15, 'Ingenieria de software', 2, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`),
  ADD UNIQUE KEY `legajo` (`legajo`);

--
-- Indices de la tabla `cursada`
--
ALTER TABLE `cursada`
  ADD PRIMARY KEY (`idCursada`),
  ADD KEY `idAlumno` (`idAlumno`),
  ADD KEY `idMateria` (`idMateria`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT de la tabla `cursada`
--
ALTER TABLE `cursada`
  MODIFY `idCursada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cursada`
--
ALTER TABLE `cursada`
  ADD CONSTRAINT `cursada_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `cursada_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
