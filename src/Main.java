import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setDataDaMentoria(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Dercrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscrever(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Pedro" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

        System.out.println("-----------------");

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscrever(bootcamp);
        System.out.println("Conteúdos Inscritos Gustavo" + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        System.out.println("--");
        System.out.println("XP: " + devPedro.calcularTotalXp());
        System.out.println("Conteúdos Inscritos Gustavo" + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gustavo" + devGustavo.getConteudosConcluidos());
    }
}
