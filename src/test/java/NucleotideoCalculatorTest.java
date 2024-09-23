/**
 * Classe de teste para o NucleotideoCalculator.
 * @author Marcos Cabral, Anthony Guimarães
 * Esta classe contém testes unitários que verificam se o método de contagem de nucleotídeos
 */

package com.mycompany.projetopoo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NucleotideoCalculatorTest {

    private static Path tempFile;

    @BeforeAll
    public static void setup() throws IOException {
        tempFile = Files.createTempFile("dna", ".txt");
        Files.writeString(tempFile, "AGCTAGCTAGCTNNN");
    }

    @AfterAll
    public static void teardown() throws IOException {
        Files.deleteIfExists(tempFile);
    }

    @Test
    @DisplayName("Testa o cálculo dos nucleotideos")
    public void testCalculaNucleotideos() {
        NucleotideoCalculator calculator = new NucleotideoCalculator();
        int[] expectedCounts = {3, 3, 3, 3};
        int[] actualCounts = calculator.calculaNucleotideos(tempFile.toString());
        assertArrayEquals(expectedCounts, actualCounts);
    }
}
