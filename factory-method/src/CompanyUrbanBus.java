import java.util.Calendar;

public class CompanyUrbanBus extends Company {
    public Ticket issueTicket(String origin, String destination, Calendar departure) {

        return new TicketUrbanBus(origin, destination, departure);
    }
}
