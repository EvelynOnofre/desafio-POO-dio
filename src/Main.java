import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args){
      Curso curso1 = new Curso ();
      curso1.setTitulo("curso Java");
      curso1. setDescrição("descrição curso Java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("curso Js");
      curso2. setDescrição("descrição curso Js");
      curso2.setCargaHoraria(4);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria do Java");
      mentoria.setDescrição("descrição mentoria Java");
      mentoria.setData(LocalDate.now());

      System.out.println(curso1);
      System.out.println(curso2);
      System.out.println(mentoria);
  }


}

