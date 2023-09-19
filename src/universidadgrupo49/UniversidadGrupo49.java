package universidadgrupo49;

import java.sql.*;
import universidadgrupo49.accesoADatos.Conexion;
import java.time.*;
import universidadgrupo49.accesoADatos.AlumnoData;
import universidadgrupo49.accesoADatos.InscripcionData;
import universidadgrupo49.accesoADatos.MateriaData;
import universidadgrupo49.entidades.Alumno;
import universidadgrupo49.entidades.Inscripcion;
import universidadgrupo49.entidades.Materia;

public class UniversidadGrupo49 {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();
//        Alumno x1=new Alumno (1234567,"Luna","Sol",LocalDate.of(1980, 4,25),true);
//        AlumnoData alu=new AlumnoData();
//        alu.guardarAlumno(x1);
//        Materia m2 = new Materia("derecho", 1, true);
//        MateriaData mat = new MateriaData();
//        mat.guardarMateria(m2);

//        Materia materiaEncontrada=mat.buscarMateria(1);
//        System.out.println("nombre: "+materiaEncontrada.getNombre());
//        
//           for(Materia materia:mat.listarMaterias()){
//           
//               System.out.println(materia.getNombre());
//               System.out.println(materia.getAnio());
//               
//           }
//        Inscripcion inscripcionUNO=new Inscripcion(x1, m2, 9);  NO FUNCIONA
//        
        



//           InscripcionData ins= new InscripcionData();
       
//       ins.guardarInscripcion(inscripcionUNO, 1, 1);  ////no sirve
           InscripcionData insUno=new InscripcionData();
           
           for(Materia materia:insUno.obtenerMateriasCursadas(1)){
               System.out.println("id materia: "+materia.getIdMateria());
               System.out.println("nombre: "+materia.getNombre());
               System.out.println("año: "+materia.getAnio());
           }


//        AlumnoData alu=new AlumnoData();
//        System.out.println(alu.buscarAlumnoPorDni(1234567));
//        
        


//Alumno x1 = new Alumno(1234567, "roberta", "tierra", LocalDate.of(1980, 4, 25), true);
//        AlumnoData alu = new AlumnoData();
//       alu.ModificarAlumno(x1);





    }

}
