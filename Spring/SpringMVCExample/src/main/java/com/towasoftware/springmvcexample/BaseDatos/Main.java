package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.Date;
import java.sql.SQLException;
import com.towasoftware.springmvcexample.model.Paciente;



public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	//	Insert i = new Insert();
	//	Update update = new Update();
		
		Paciente paciente = new Paciente();
		paciente.setNombre("Gil");
		paciente.setAlergias("Fresas");
		paciente.setApellido("Balderas");
		paciente.setDireccion("Hidalgo 34, col centro.");
		paciente.setEmail("gildibal@gmail.com");
		paciente.setFechaNacimiento(new Date(23454));
		paciente.setNSS("34535362");
		paciente.setSexo("Masculino");
		paciente.setTelefono("992378753");
		paciente.setTipoSangre("AB-");
		paciente.setIdPaciente(5);
		//i.InsertarPaciente(paciente);
		//update.updatePaciente(paciente);
		
	/*	Departamento depto = new Departamento();
		depto.setIdDepartamento(432);
		depto.setNombre("Neurología");
		i.InsertarDepartamento(depto);
		*/
		
		/*Consultorio consultorio = new Consultorio();
		consultorio.setPiso(1);
		consultorio.setIdConsultorio(43);
		i.InsertarConsultorio(consultorio);*/
		
	/*	Especialidad especialidad = new Especialidad();
		especialidad.setIdDepartamento(1);
		especialidad.setNombre("Nueva Especialidad");
		i.InsertarEspecialidad(especialidad);*/
		
	/*	Cita cita = new Cita();
		cita.setDiagnostico("Diarrea");
		cita.setFecha(new Date(3456));
		cita.setHora(new Time(3454353));
		cita.setIdConsultorio(43);
		cita.setIdMedico(1);
		cita.setIdPaciente(1);
		cita.setObservacion("Deshidratación");
		cita.setPeso((float)79.800);
		cita.setPresion("120/80");
		cita.setTalla((float) 73.0);
		cita.setTemperatura((float) 35.5);
		i.InsertarCita(cita);
		*/
		
	/*	Medico medico = new Medico(1,"Luis","Juárez",1,"234242","luis@hotmail.com",
				"Zaragoza 23","86537745","Matutino");
		i.InsertarMedico(medico);
	*/
		
		
	}

}
