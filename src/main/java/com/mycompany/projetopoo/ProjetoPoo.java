/**
 * Main do programa
 * @author Marcos Cabral
 * Esta classe contém o método main que inicia a execução do programa, lê a sequência de DNA
 * de um arquivo e utiliza a classe NucleotideoCalculator para calcular e exibir a contagem
 * de nucleotídeos.
 * @author Marcos Cabral
 */

package com.mycompany.projetopoo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProjetoPoo {
    public static void main(String[] args) {
        NucleotideoCalculator calculator = new NucleotideoCalculator();
        int[] counts = calculator.calculaNucleotideos("src/main/java/com/mycompany/projetopoo/arquivo.txt");
        System.out.println("Contagem de nucleotideos:");
        System.out.println("A: " + counts[0]);
        System.out.println("C: " + counts[1]);
        System.out.println("G: " + counts[2]);
        System.out.println("T: " + counts[3]);
    }
}
