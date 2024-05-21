import java.util.Date;

public class Appointment implements AppointmentManagement {
    protected Date date;
    protected Date time;
    protected String reason;
    protected int counter;
    protected Doctor doctor;
    protected Patient patient;
    protected Nurse nurse;
    protected AppointmentState state;

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
