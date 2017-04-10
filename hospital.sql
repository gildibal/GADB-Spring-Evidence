-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-04-2017 a las 19:50:13
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `idCita` int(10) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time DEFAULT NULL,
  `idPaciente` int(10) NOT NULL,
  `idMedico` int(10) NOT NULL,
  `idConsultorio` int(10) NOT NULL,
  `Presion` varchar(10) DEFAULT NULL,
  `Peso` float DEFAULT NULL,
  `Talla` float DEFAULT NULL,
  `Temperatura` float DEFAULT NULL,
  `Diagnostico` varchar(255) DEFAULT NULL,
  `Observacion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cita`
--

INSERT INTO `cita` (`idCita`, `Fecha`, `Hora`, `idPaciente`, `idMedico`, `idConsultorio`, `Presion`, `Peso`, `Talla`, `Temperatura`, `Diagnostico`, `Observacion`) VALUES
(1, '2017-04-04', '10:00:00', 1, 1, 101, '120', 84, 70, 34.5, 'Fractura', 'Fractura expuesta de pierna con múltiples golpes en el cuerpo.'),
(2, '2017-03-04', '12:00:00', 2, 2, 201, '120', 74, 60, 38.5, 'Cuadro de Gripa', 'Presenta temperatura alta, dolor de cuerpo, infección en la garganta'),
(3, '2017-02-04', '10:00:00', 3, 3, 301, '100', 60, 63, 35.5, 'Chequeo', 'Todo en orden'),
(5, '1969-12-31', '18:57:34', 1, 1, 43, '120/80', 79.8, 73, 35.5, 'Diarrea', 'Deshidratación');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultorio`
--

CREATE TABLE `consultorio` (
  `idConsultorio` int(10) NOT NULL,
  `Piso` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `consultorio`
--

INSERT INTO `consultorio` (`idConsultorio`, `Piso`) VALUES
(43, 6),
(101, 1),
(102, 1),
(201, 2),
(202, 2),
(301, 3),
(302, 3),
(303, 1),
(304, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `Nombre` varchar(50) DEFAULT NULL,
  `idDepartamento` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`Nombre`, `idDepartamento`) VALUES
('Geriatría', 1),
('Pediatría', 2),
('Tanatología', 3),
('Neurología', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE `especialidad` (
  `idEspecialidad` int(10) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `idDepartamento` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `especialidad`
--

INSERT INTO `especialidad` (`idEspecialidad`, `Nombre`, `idDepartamento`) VALUES
(1, 'Neonatal', 2),
(2, 'Gastroenterólogo Pediátrico', 2),
(3, 'Traumatolgía Geriátrica', 1),
(4, 'Oftalmología Geriátrica', 1),
(5, 'Nueva Especialidad', 1),
(7, 'Oncología', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `idHistorial` int(10) NOT NULL,
  `idReceta` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `idMedico` int(10) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Apellido` varchar(255) DEFAULT NULL,
  `idEspecialidad` int(10) NOT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Correo` varchar(255) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  `CedulaProfesional` varchar(25) DEFAULT NULL,
  `Horario` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`idMedico`, `Nombre`, `Apellido`, `idEspecialidad`, `Telefono`, `Correo`, `Direccion`, `CedulaProfesional`, `Horario`) VALUES
(1, 'Rodrigo', 'Sanchez', 1, '234242', 'luis@hotmail.com', 'Zaragoza 23', '86537745', 'Matutino'),
(2, 'Rodrigo', 'Sanchez', 1, '234242', 'luis@hotmail.com', 'Zaragoza 23', '86537745', 'Matutino'),
(3, 'Rodrigo', 'Sanchez', 1, '234242', 'luis@hotmail.com', 'Zaragoza 23', '86537745', 'Matutino'),
(4, 'Rodrigo', 'Sanchez', 1, '234242', 'luis@hotmail.com', 'Zaragoza 23', '86537745', 'Matutino'),
(5, 'Rodrigo', 'Sanchez', 1, '234242', 'luis@hotmail.com', 'Zaragoza 23', '86537745', 'Matutino'),
(6, 'Rodrigo', 'Sanchez', 1, '234242', 'luis@hotmail.com', 'Zaragoza 23', '86537745', 'Matutino'),
(7, 'Rodrigo', 'Sanchez', 1, '234242', 'luis@hotmail.com', 'Zaragoza 23', '86537745', 'Matutino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(10) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Apellido` varchar(255) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  `Telefono` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `TipoSangre` varchar(255) DEFAULT NULL,
  `Alergias` varchar(255) DEFAULT NULL,
  `NSS` varchar(20) DEFAULT NULL,
  `Sexo` varchar(10) DEFAULT NULL,
  `FechaNacimiento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`idPaciente`, `Nombre`, `Apellido`, `Direccion`, `Telefono`, `Email`, `TipoSangre`, `Alergias`, `NSS`, `Sexo`, `FechaNacimiento`) VALUES
(1, 'Gil ', 'Diaz', 'Matamoros 109, Barrio San Mateo.', '2324931', 'gildibal@hotmail.com', 'O+', NULL, '1234567', 'Masculino', '1987-04-08'),
(2, 'Andres', 'Aleman', 'Josefa 324, col. centro', '1234567', 'email@hotmail.com', 'O-', 'Penicilina', '544345763', 'Masculino', '1988-04-19'),
(3, 'Jorge', 'Flores', 'Allende 334, col. centro', '1234567', 'email@hotmail.com', 'O-', 'Chocolate', '135742363', 'Masculino', '1998-04-19'),
(4, 'Reyna', 'Lopez', 'Santa Inés 534, col. centro', '1234567', 'email@hotmail.com', 'O-', 'Nueces', '2454363', 'Femenino', '1973-04-19'),
(5, 'Gil', 'Balderas', 'Hidalgo 34, col centro.', '992378753', 'gildibal@gmail.com', 'AB-', 'Fresas', '34535362', 'Masculino', '1969-12-31'),
(6, 'José Luis', 'Diaz ', 'Matamoros 109, Barrio San Mateo.', '2324931', 'gildibal@hotmail.com', 'O+', 'null', '1234567', 'Masculino', '1987-04-07');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `receta`
--

CREATE TABLE `receta` (
  `idReceta` int(10) NOT NULL,
  `idCita` int(10) NOT NULL,
  `Prescripcion` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `receta`
--

INSERT INTO `receta` (`idReceta`, `idCita`, `Prescripcion`) VALUES
(1, 1, 'Tomar Paracetamol cada 8 hrs.\r\nUtilizar yeso por 3 meses'),
(2, 2, 'Ibuprofeno cada 6 hrs por 3 dias\r\nReposo por 3 dias');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`idCita`),
  ADD KEY `FKCita621231` (`idConsultorio`),
  ADD KEY `FKCita604195` (`idMedico`),
  ADD KEY `FKCita297047` (`idPaciente`);

--
-- Indices de la tabla `consultorio`
--
ALTER TABLE `consultorio`
  ADD PRIMARY KEY (`idConsultorio`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`idDepartamento`);

--
-- Indices de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  ADD PRIMARY KEY (`idEspecialidad`),
  ADD KEY `FKEspecialid10716` (`idDepartamento`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`idHistorial`);

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`idMedico`),
  ADD KEY `FKMedico415894` (`idEspecialidad`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`);

--
-- Indices de la tabla `receta`
--
ALTER TABLE `receta`
  ADD PRIMARY KEY (`idReceta`),
  ADD KEY `FKReceta109226` (`idCita`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `idCita` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `consultorio`
--
ALTER TABLE `consultorio`
  MODIFY `idConsultorio` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=305;
--
-- AUTO_INCREMENT de la tabla `departamento`
--
ALTER TABLE `departamento`
  MODIFY `idDepartamento` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  MODIFY `idEspecialidad` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
  MODIFY `idHistorial` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `medico`
--
ALTER TABLE `medico`
  MODIFY `idMedico` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `receta`
--
ALTER TABLE `receta`
  MODIFY `idReceta` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `FKCita297047` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`),
  ADD CONSTRAINT `FKCita604195` FOREIGN KEY (`idMedico`) REFERENCES `medico` (`idMedico`),
  ADD CONSTRAINT `FKCita621231` FOREIGN KEY (`idConsultorio`) REFERENCES `consultorio` (`idConsultorio`);

--
-- Filtros para la tabla `especialidad`
--
ALTER TABLE `especialidad`
  ADD CONSTRAINT `FKEspecialid10716` FOREIGN KEY (`idDepartamento`) REFERENCES `departamento` (`idDepartamento`);

--
-- Filtros para la tabla `medico`
--
ALTER TABLE `medico`
  ADD CONSTRAINT `FKMedico415894` FOREIGN KEY (`idEspecialidad`) REFERENCES `especialidad` (`idEspecialidad`);

--
-- Filtros para la tabla `receta`
--
ALTER TABLE `receta`
  ADD CONSTRAINT `FKReceta109226` FOREIGN KEY (`idCita`) REFERENCES `cita` (`idCita`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
