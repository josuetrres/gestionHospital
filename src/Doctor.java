import java.util.Date;

public class Doctor extends Person implements AppointmentManagement{
    protected MedicalSpecialty specialty;
    protected Appointment appointmentList;

    public boolean bookAppointment(Doctor doctor, Date date, Date time){
        System.out.println("Appointment booked");
        return true;
    }
    public boolean cancelAppointment(Date time , Date date){
        System.out.println("Appointment cancelled");
        return true;
    }

    public boolean completeAppointment(Date time, Date date){
        System.out.println("Appointment completed");
        return true;
    }
}
