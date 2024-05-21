import java.util.Date;

public interface AppointmentManagement {
    public boolean bookAppointment(Doctor doctor, Date date, Date time);

    public boolean cancelAppointment(Date time , Date date);

    public boolean completeAppointment(Date time, Date date);
}
