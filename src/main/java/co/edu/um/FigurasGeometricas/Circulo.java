package co.edu.um.FigurasGeometricas;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 10/08/13
 * Time: 01:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Circulo extends Figura {

    public double radio;

    @Override
    public double perimetro(){
        return (3.14)*2*radio;
    }

    @Override
    public double area(){
        return (radio * radio)*3.14;
    }

}
