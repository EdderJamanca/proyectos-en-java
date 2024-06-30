
import java.util.Date;

import  static  UI.UIMenu.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // instancial una clase
//        Doctor myDotor = new Doctor();
//        myDotor.name="El gran doctor";
//        myDotor.showName();
//
//        myDotor.showId();
//
//        Doctor myDotor3 = new Doctor();
//        myDotor3.name="El gran doctor";
//        myDotor3.showName();
//
//        myDotor3.showId();
//
//        Doctor myDoctor2= new Doctor("el mejor doctor del mundo","sicologo");
//        myDoctor2.showName();
//        myDoctor2.showId();

//        Paciente paciente= new Paciente("Edder Ivan","edder@gmail.com");
//
//        paciente.setWeight(12);
//        paciente.setHeight(80);
//
//        System.out.println(paciente.getHeight());
//        System.out.println(paciente.getWeight());

          Doctor myDoctor=new Doctor("Anahí Salgado","Pediatria");
          myDoctor.addDisponibilidadCita(new Date(),"4pm");
          myDoctor.addDisponibilidadCita(new Date(),"10am");
          myDoctor.addDisponibilidadCita(new Date(),"12am");

          for(Doctor.DisponibleCita dis:myDoctor.getDisponibilidaDeCitas()){
              System.out.println(dis.getDate() + "  " + dis.getTime());
          }

     //   showMenu();
        //System.out.println();

    }
}