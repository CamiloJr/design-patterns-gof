import java.util.Calendar;

public abstract class Company {

    public abstract Ticket issueTicket(String origin, String destination, Calendar departure);
}
