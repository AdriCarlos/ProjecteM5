import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carlos2
 */
public class ex2 {

    private int numEmpleat;
    private String nomEmpleat;
    private int mesosTreball;
    private char directiu;
    private String prima;

    /**
     * Constructor de la classe buit.
     *
     * 
     */
    public ex2() {

    }

    /**
     * Mètode principal de la classe encarregat de validar els parametres introduïts
     *i en cas de ser correctes generar una prima segons el cas.
     * 
     * @param numEmpleat Número(enter) identificador de l'empleat per al qual es calcularà la prima  
     * @param nomEmpleat Nom de l'empleat per al qual es calcularà la prima  
     * @param mesosTreball Quantitat de mesos treballats 
     * @param directiu Caracter que ens indicarà si aquest empleat és directiu o no
     * 
     * @throws Exception cridada quan algun dels paràmetres no té el format correcte o no és vàlid
     * 
     * @return Retorna una cadena de text (String) indicant quin tipus de prima rebrà l'empleat
     */
    public static String getPrima(int numEmpleat, String nomEmpleat, int mesosTreball, char directiu) throws Exception {
        String prima = "P0";
        char[] validaNom;
        boolean ok = false;

        // try {
        ok = true;
        if (numEmpleat < 1 || numEmpleat > 999) {
            ok = false;
        }
        if (ok && nomEmpleat.length() > 0 && nomEmpleat.length() <= 10) {
            validaNom = nomEmpleat.toLowerCase().toCharArray();
            for (int i = 0; i < validaNom.length; i++) {
                if (validaNom[i] < 97) {
                    if (!(validaNom[i] > 47 && validaNom[i] < 58)) {
                        ok = false;
                    }
                } else {
                    if (validaNom[i] > 122) {
                        ok = false;
                    }
                }
            }
        } else {
            ok = false;
        }

        if (mesosTreball < 0 || mesosTreball > 999) {
            ok = false;
        }
        if (directiu != 43 && directiu != 45) {
            ok = false;
        }

        if (!ok) {
            throw new Exception();
        }

        switch (directiu) {
            case 43:
                if (mesosTreball > 12) {
                    prima = "P1";
                } else {
                    prima = "P3";
                }
                break;
            case 45:
                if (mesosTreball > 12) {
                    prima = "P2";
                } else {
                    prima = "P4";
                }
                break;
            default:
                System.out.println("Error");

        }
        return prima;

    }
}
