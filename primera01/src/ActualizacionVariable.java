public class ActualizacionVariable {

    public static void  main(String[] args){
        int salary=1000;

        // bono de $200
        salary=salary*200;
        System.out.println(salary);

        // pension $50 descuenta
        salary=salary-50;
        System.out.println(salary);

        // 2 horas extra $30 c/u
        // comida $45
        salary=salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizar cadenas de texto
        String employeName="Anahi Salgado";

        employeName=employeName + " Días de la vega";

        employeName="Irene " + employeName;
        System.out.println(employeName);
    }
}
