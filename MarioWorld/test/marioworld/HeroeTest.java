/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package marioworld;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class HeroeTest {
    
    public HeroeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Heroe.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Heroe instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVidas method, of class Heroe.
     */
    @Test
    public void testGetVidas() {
        System.out.println("getVidas");
        Heroe instance = null;
        int expResult = 0;
        int result = instance.getVidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicion method, of class Heroe.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        Heroe instance = null;
        int expResult = 0;
        int result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaltar method, of class Heroe.
     */
    @Test
    public void testGetSaltar() {
        System.out.println("getSaltar");
        Heroe instance = null;
        boolean expResult = false;
        boolean result = instance.getSaltar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVidas method, of class Heroe.
     */
    @Test
    public void testSetVidas() {
        System.out.println("setVidas");
        Heroe instance = null;
        instance.setVidas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicion method, of class Heroe.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        Heroe instance = null;
        instance.setPosicion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaltando method, of class Heroe.
     */
    @Test
    public void testSetSaltando() {
        System.out.println("setSaltando");
        Heroe instance = null;
        instance.setSaltando();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
