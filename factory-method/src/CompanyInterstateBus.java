import java.util.Calendar;

public class CompanyInterstateBus extends Company {

    public Ticket issueTicket(String origin, String destination, Calendar departure) {
        return new TicketInterstateBus(origin, destination, departure);
    }
}
