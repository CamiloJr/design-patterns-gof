import java.util.Calendar;

public class TicketInterstateBus extends Ticket {

    public TicketInterstateBus(String origin, String destination, Calendar departure) {
        super(origin, destination, departure);
    }

    public void ShowDetails() {
        System.out.println("Interstate bus ticket: " + this.getOrigin() + " to " +
                           this.getDestination() + ", Date/Hour: " +
                           super.simpleDateFormat.format(this.getDeparture().getTime()));
    }
}
