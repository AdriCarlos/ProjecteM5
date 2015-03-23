/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos2
 */
public class JUnitTest {

    private String esperat1 = "P1";
    private String esperat2 = "P2";
    private String esperat3 = "P3";
    private String esperat4 = "P4";
    private ex2 classe;
    private int numEmpleat;
    private String nomEmpleat;
    private int mesosTreball;
    private char directiu;

    /**
     * Constructor de la classe de prova buit.
     *
     * 
     */
    public JUnitTest() {
    }

    /**
     * Primer mètode de prova correcte amb un director amb temps inferior a 12 mesos
     * i que espera com a resultat la prima P3
     * 
     */
    
    @Test
    public void ok1() throws Exception {
        numEmpleat = 123;
        nomEmpleat = "FERNANDEZ";
        mesosTreball = 9;
        directiu = '+';
        classe = new ex2();
        assertEquals(esperat3, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
        System.out.println("Test tot ok 1: ok");
    }
    
    
    /**
     * Segon mètode de prova correcte amb un empleat amb temps superior a 12 mesos
     * i que espera com a resultat la prima P2
     * 
     */
    @Test
    public void ok2() throws Exception {
        numEmpleat = 456;
        nomEmpleat = "DOMINGUEZ";
        mesosTreball = 13;
        directiu = '-';
        classe = new ex2();
        assertEquals(esperat2, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
        System.out.println("Test tot ok 2: ok");
    }
    
    
    
    /**
     * 
     * Mètode d'error que espera rebre una excepció ja que el numero d'empleat és inferior a 1
     * 
     * 
     */
    @Test(expected = Exception.class)
    public void err1() throws Exception {
        numEmpleat = 000;
        nomEmpleat = "GUMERSINDO";
        mesosTreball = 14;
        directiu = '+';
        classe = new ex2();
        assertEquals(esperat2, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
    }
   
    
    /**
     * 
     * Mètode d'error que espera rebre una excepció ja que el numero d'empleat és superior a 999
     * 
     * 
     */
    @Test(expected = Exception.class)
    public void err2() throws Exception {
        numEmpleat = 1024;
        nomEmpleat = "MINOTAUROS";
        mesosTreball = 26;
        directiu = '+';
        classe = new ex2();
        assertEquals(esperat1, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
    }
    

    
    /**
     * 
     * Mètode d'error que espera rebre una excepció ja que el nom d'empleat està buit
     * 
     * 
     */
    @Test(expected = Exception.class)
    public void err3() throws Exception {
        numEmpleat = 123;
        nomEmpleat = "";
        mesosTreball = 6;
        directiu = '+';
        classe = new ex2();
        assertEquals(esperat3, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
    }
    
    
    /**
     * 
     * Mètode d'error que espera rebre una excepció ja que el nom d'empleat ocupa més de 10 caracters
     * 
     * 
     */
    @Test(expected = Exception.class)
    public void err4() throws Exception {
        numEmpleat = 123;
        nomEmpleat = "TORRECEBALLOS";
        mesosTreball = 3;
        directiu = '+';
        classe = new ex2();
        assertEquals(esperat3, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
    }
    
    /**
     * 
     * Mètode d'error que espera rebre una excepció ja que el nom d'empleat consta de caracters no alfanumèrics
     * 
     * 
     */
    @Test(expected = Exception.class)
    public void err5() throws Exception {
        numEmpleat = 123;
        nomEmpleat = "%&/";
        mesosTreball = 3;
        directiu = '+';
        classe = new ex2();
        assertEquals(esperat3, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
    }
    
    /**
     * 
     * Mètode d'error que espera rebre una excepció ja que els mesos de treball són inferiors a 0
     * 
     * 
     */
    @Test(expected = Exception.class)
    public void err6() throws Exception {
        numEmpleat = 123;
        nomEmpleat = "MARGARITOS";
        mesosTreball = -1;
        directiu = '+';
        classe = new ex2();
        assertEquals(esperat3, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
    }
    
    /**
     * 
     * Mètode d'error que espera rebre una excepció ja que els mesos de treball són superiors a 999
     * 
     * 
     */
    @Test(expected = Exception.class)
    public void err7() throws Exception {
        numEmpleat = 123;
        nomEmpleat = "MARGARITOS";
        mesosTreball = 1024;
        directiu = '-';
        classe = new ex2();
        assertEquals(esperat2, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
    }
    
    /**
     * 
     * Mètode d'error que espera rebre una excepció ja que l'indicador de directiu és un espai en blanc
     * 
     * 
     */
    @Test(expected = Exception.class)
    public void err8() throws Exception {
        numEmpleat = 123;
        nomEmpleat = "MARGARITOS";
        mesosTreball = 13;
        directiu = ' ';
        classe = new ex2();
        assertEquals(esperat1, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
    }
    
    /**
     * 
     * Mètode d'error que espera rebre una excepció ja que l'indicador de directiu no és un caracter alfanumèric
     * 
     * 
     */
    @Test(expected = Exception.class)
    public void err9() throws Exception {
        numEmpleat = 123;
        nomEmpleat = "MARGARITOS";
        mesosTreball = 13;
        directiu = '*';
        classe = new ex2();
        assertEquals(esperat1, ex2.getPrima(numEmpleat, nomEmpleat, mesosTreball, directiu));
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
