public class AsignacionIncrementoDecremento {
    public  static  void  main(String[] args){
        // operador - Aplicacón - Desglose
        //==================================
        // +=           a+=b        a=a+b
        // -=           a-=b        a=a-b
        // *=           a*=b        a=a*b
        // /=           a/=b        a=a/b
        // %=           a%=b        a=a%b

        // operador - Nombre -   ejemplo - Desglose
        // ++       incremento    i++       i=i+1
        // --       decremento     i--      i=i-1

        int lives=5;
        lives=lives-1;
        System.out.println(lives);

        lives--;//decremento
        System.out.println(lives);

        lives++;//Incremento
        System.out.println(lives);

        //prefija
        // Gana un regalo por ganar una vida
        int gift=100+lives++;
        System.out.println(gift);
    }
}
