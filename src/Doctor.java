import java.util.Date;

public class Doctor extends Person implements AppointmentManagement{
    protected MedicalSpecialty specialty;
    protected Appointment appointmentList;

    public boolean bookAppointment(Doctor doctor, Date date, Date time){
        return true;
    }
    public boolean cancelAppointment(Date time , Date date){
        return true;
    }

    public boolean completeAppointment(Date time, Date date){
        return true;
    }
}
