package co.edu.um.FigurasGeometricas;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 10/08/13
 * Time: 01:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cuadrado extends Figura {

    public double lado;

    @Override
    public double perimetro(){
        return 4*lado;
    }

    @Override
    public double area(){
        return lado*lado;
    }
}
