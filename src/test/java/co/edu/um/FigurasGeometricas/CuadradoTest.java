package co.edu.um.FigurasGeometricas;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 11/08/13
 * Time: 01:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class CuadradoTest {

    @Test
    public void testPerimetro() throws Exception {

        Cuadrado cuad = new Cuadrado();

        cuad.lado = 3.0;

        Assert.assertEquals(12.0,cuad.perimetro());
    }

    @Test
    public void testArea() throws Exception {

        Cuadrado cuad = new Cuadrado();

        cuad.lado = 3.0;

        Assert.assertEquals(9.0,cuad.area());

    }
}
