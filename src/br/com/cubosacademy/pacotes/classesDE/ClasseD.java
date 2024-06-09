package br.com.cubosacademy.pacotes.classesDE;

import br.com.cubosacademy.pacotes.classesABC.ClasseB;

public class ClasseD {
    String nome = "Classe D";
    ClasseB classeB = new ClasseB();// para que pudesse usar a classe de outro apcote, a IDE importa a classeB
}
