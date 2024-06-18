public class OperacionesMatematica {

    public static void main(String [] args){
        double x=2.1;
        double y=3;
        // devuelve un entero hacia arriba
        System.out.println("devuelve un entero hacia arriba"+Math.ceil(x));
        // Devuelve un entero hacia abajo
        System.out.println("devuelve un entero hacia abajo"+Math.floor(x));
        //devuelve un número elevafo a otro
        System.out.println("devuelve el número elevado al otro: "+Math.pow(x,y));
        // Devuelve el numero mayor
        System.out.println(" devuelve el numero mayor"+ Math.max(x,y));
        //System.out.println(Math.E);
        System.out.println("la raiz cuadrada:"+Math.sqrt(y));
        // area de un circulo
        // pi * r2
        System.out.println(Math.PI* Math.pow(y,2));

        // area de una esfera
        System.out.println(4*Math.PI*Math.pow(y,2));



    }
}
