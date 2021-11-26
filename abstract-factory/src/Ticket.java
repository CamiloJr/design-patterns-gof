import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Ticket {

    private String origin;
    private String destination;
    private Calendar departure;

    protected SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Ticket(String origin, String destination, Calendar departure) {
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
    }

    public abstract void ShowDetails();

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Calendar getDeparture() {
        return departure;
    }

    public void setDeparture(Calendar departure) {
        this.departure = departure;
    }
}
