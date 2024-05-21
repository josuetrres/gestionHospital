import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Appointment appointment = new Appointment();
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        Patient patient = new Patient();
        appointment.bookAppointment(doctor, new Date(), new Date());
        appointment.cancelAppointment(new Date(), new Date());
        appointment.completeAppointment(new Date(), new Date());
    }
}
