import java.util.Calendar;

public class TicketUrbanBus extends Ticket {

    public TicketUrbanBus(String origin, String destination, Calendar departure) {
        super(origin, destination, departure);
    }

    public void ShowDetails() {
        System.out.println("Urban bus ticket: " + this.getOrigin() + " to " +
                            this.getDestination() + ", Date/Hour: " +
                            super.simpleDateFormat.format(this.getDeparture().getTime()));
    }
}
