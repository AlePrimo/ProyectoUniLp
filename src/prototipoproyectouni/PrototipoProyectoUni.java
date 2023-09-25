package prototipoproyectouni;

import java.time.LocalDate;
import java.time.Month;
import prototipoproyectouni.AccesoADatos.AlumnoData;
import prototipoproyectouni.AccesoADatos.Conexion;
import prototipoproyectouni.AccesoADatos.InscripcionData;
import prototipoproyectouni.AccesoADatos.MateriaData;
import prototipoproyectouni.Entidades.Alumno;
import prototipoproyectouni.Entidades.Inscripcion;
import prototipoproyectouni.Entidades.Materia;

public class PrototipoProyectoUni {

    public static void main(String[] args) {

//        Alumno pepe = new Alumno(4, 5555, "Perez", "Juan carlos", LocalDate.of(1980, Month.MARCH, 12), true);
//        Alumno jose = new Alumno(6666, "Perez", "Jose", LocalDate.of(1985, 5, 22), true);
//        Alumno car = new Alumno(7777, "Sanchez", "Carlos", LocalDate.of(1993, 5, 22), true);
////        Alumno toti = new Alumno(888, "Salvador", "Rodrigo", LocalDate.of(1978, 5, 24), true);
     // AlumnoData alu = new AlumnoData();
////Alumno ccc=alu.buscarAlumno(5);
////Alumno coc=alu.buscarAlumno(4);
//Alumno antesPerez=new Alumno(7,23458795,"Velasquez","raul",LocalDate.of(1956, 4, 2), true);
//        //alu.guardarAlumno(toti);
//        //alu.guardarAlumno(car);
//        //alu.guardarAlumno(jose);
//        //alu.guardarAlumno(pepe);
//        //alu.modificarAlumno(pepe);
//        // alu.eliminarAlumno(4);
//        //Alumno alu1=alu.buscarAlumno(4);
//        //System.out.println(alu1.toString());
//System.out.println(alu.listarAlumnos());
//      alu.modificarAlumno(antesPerez);
//      Materia uno=new Materia("Fisica 2", 2, true);
//        Materia dos=new Materia("Quimica", 3, true);
//        Materia tres=new Materia("Matematica", 1, true);
//        Materia cuatro=new Materia("Derecho Penal 3", 5, true);  
//        
//       MateriaData mat=new MateriaData();
//       Materia mata=mat.buscarMateria(10);
//       Materia mata1=mat.buscarMateria(11);
//       Materia mata2=mat.buscarMateria(12);
//        mat.guardarMateria(uno);
//         mat.guardarMateria(dos);
//          mat.guardarMateria(tres);
//          mat.guardarMateria(cuatro);
//     



//Inscripcion in2= new Inscripcion(ccc, mata1, 8);
//Inscripcion in3= new Inscripcion(coco, mata2, 5);
//Inscripcion in4= new Inscripcion(coc, mata, 7);
//Inscripcion in5= new Inscripcion(coc, mata1, 9);
InscripcionData inis=new InscripcionData();
////inis.guardarInscripcion(in5); metodo 1
//inis.guardarInscripcion(in4);
// inis.guardarInscripcion(in3);
// inis.guardarInscripcion(in2);
//System.out.println(inis.obtenerInscripciones());  metodo 2
        //System.out.println(inis.obtenerInscripcionesporAlumno(4));  metodo 3
 
 //inis.borrarInscripcionAlumno(4, 11); metodo 4
 //inis.actualizarNota(4, 10, 3);     metodo 5
        //System.out.println(inis.obtenerAlumnosPorMateria(12));  metodo 6
        //System.out.println(inis.obtenerMateriasCursadas(5));  metodo 7
        //System.out.println(inis.obtenerMateriasNoCursadas(5)); //metodo 8
 
    }

}
