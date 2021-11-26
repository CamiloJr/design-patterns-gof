import java.util.Calendar;

public abstract class Company {

    public abstract TicketUrbanBus issueTicketUrban(String origin, String destination, Calendar departure);
    public abstract TicketInterstateBus issueTicketInterstate(String origin, String destination, Calendar departure);

}
