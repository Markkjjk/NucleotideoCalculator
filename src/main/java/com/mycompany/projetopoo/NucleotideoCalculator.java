/**
 * Classe que representa um calculador de nucleotídeos.
 * @author Marcos Cabral, Anthony Guimarães
 * Esta classe fornece métodos para calcular a contagem de nucleotídeos em uma sequência de DNA.
 */

package com.mycompany.projetopoo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NucleotideoCalculator {
    public int[] calculaNucleotideos(String filePath) {
        int[] counts = new int[4]; 
        try {
            String dnaSequence = Files.readString(Path.of(filePath)).toUpperCase();
            for (char nucleotide : dnaSequence.toCharArray()) {
                switch (nucleotide) {
                    case 'A':
                        counts[0]++;
                        break;
                    case 'C':
                        counts[1]++;
                        break;
                    case 'G':
                        counts[2]++;
                        break;
                    case 'T':
                        counts[3]++;
                        break;
                    default:
                        
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counts;
    }
}
