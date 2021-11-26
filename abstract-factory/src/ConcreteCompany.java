import java.util.Calendar;

public class ConcreteCompany extends Company {

    public TicketUrbanBus issueTicketUrban(String origin, String destination, Calendar departure) {
        return new TicketUrbanBus(origin, destination, departure);
    }

    public TicketInterstateBus issueTicketInterstate(String origin, String destination, Calendar departure) {
        return new TicketInterstateBus(origin, destination, departure);
    }
}
