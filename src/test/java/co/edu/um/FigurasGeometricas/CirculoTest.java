package co.edu.um.FigurasGeometricas;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 10/08/13
 * Time: 01:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class CirculoTest {

    @Test
    public void testPerimetro() throws Exception {

        Circulo cir = new Circulo();

        cir.radio= 2.0;

        Assert.assertEquals(12.56, cir.perimetro());

    }

    @Test
    public void testArea() throws Exception {

        Circulo cir = new Circulo();

        cir.radio= 1.0;

        Assert.assertEquals(3.14, cir.area());



    }
}
