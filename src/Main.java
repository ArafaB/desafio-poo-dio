import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Descricao Curso Java Script");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnna = new Dev();
        devAnna.setNome("Anna");
        devAnna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anna:" + devAnna.getConteudosInscritos());
        devAnna.progredir();
        devAnna.progredir();
        System.out.println("- Progrediu -");
        System.out.println("Conteúdos Inscritos Anna:" + devAnna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Anna:" + devAnna.getConteudosConcluidos());
        System.out.println("XP:" + devAnna.calcularTotalXp());

        System.out.println("--------");

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo:" + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("- Progrediu -");
        System.out.println("Conteúdos Inscritos Paulo:" + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo:" + devPaulo.getConteudosConcluidos());
        System.out.println("XP:" + devPaulo.calcularTotalXp());

    }
}
