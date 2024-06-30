import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    Doctor(String nombre, String speciality){
        super(nombre,"");
        this.speciality=speciality;
       System.out.println("En doctor asignado es "+ nombre);
    }



    ArrayList<DisponibleCita> disponibilidaDeCitas=new ArrayList<>();

    public void addDisponibilidadCita(Date date,String time){
        disponibilidaDeCitas.add(new DisponibleCita(date,time));
    }
    public ArrayList<DisponibleCita> getDisponibilidaDeCitas(){
        return disponibilidaDeCitas;
    }

    public static class DisponibleCita{
        private int id;
        private Date date;
        private  String time;

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public DisponibleCita(Date date, String time){
            this.date=date;
            this.time=time;
        }
    }
}
