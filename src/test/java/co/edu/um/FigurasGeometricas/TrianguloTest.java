package co.edu.um.FigurasGeometricas;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 11/08/13
 * Time: 01:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class TrianguloTest {

    @Test
    public void testPerimetro() throws Exception {

        Triangulo tri = new Triangulo();

        tri.lado1 = 2.0;
        tri.lado2 = 3.0;
        tri.lado3 = 4.0;

        Assert.assertEquals(9.0,tri.perimetro());
    }

    @Test
    public void testArea() throws Exception {

        Triangulo tri = new Triangulo();

        tri.lado1 = 2.0;
        tri.lado2 = 3.0;
        tri.lado3 = 3.0;

        Assert.assertEquals(2.8284271247461903,tri.area());
    }
}
