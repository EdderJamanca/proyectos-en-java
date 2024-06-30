package UI;

import java.util.Scanner;

public class UIMenu {
        public static final String[] MESES={"Enero","Febrero","marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Noviembre","Diciembre"};
        // FINAL -> SE LE ASIGNA A LA VARIABLE CONSTANTES
        public  static void showMenu(){


            System.out.println("Bienvenido a nuestro hopital");
            System.out.println("Seleccione la opcíon deseada");

            int response=0;
             do{
                 System.out.println("1. Doctor");
                 System.out.println("2. Paciente");
                 System.out.println("3. Salir");

                 Scanner sc= new Scanner(System.in);
                 response=Integer.valueOf(sc.nextLine());

                 switch(response){
                     case 1:
                         System.out.println("Doctor");
                         break;
                     case  2:
                         response=0;
                         showPacienteMenu();
                         break;
                     case 0:
                         System.out.println("Gracias por su visita");
                         break;
                     default:
                         System.out.println("Por favor selecione una respuesta correcta.");

                 }
             }while(response !=0);
        }

        static void showPacienteMenu(){
            int response=0;

            do{
                System.out.println("\n\n\"");
                System.out.println("Paciente");
                System.out.println("1. Reserva tu cita");
                System.out.println("2. Mi cita");
                System.out.println("0. return");

                Scanner sc=new Scanner(System.in);
                response  = Integer.valueOf(sc.nextLine());

                switch (response){
                    case 1:
                        System.out.println(": Reserva tu cita");
                        for(int i=1;i<4;i++){
                            System.out.println(i +"."+ MESES[i-1]);
                        }
                        break;
                    case 2:
                        System.out.println("Mi cita");
                        break;
                    case 0:
                        showMenu();
                        break;
                }

            }while (response !=0);
        }
}
