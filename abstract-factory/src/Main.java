import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Company cCompany = new ConcreteCompany();

        TicketUrbanBus ticketUrbanBus = cCompany.issueTicketUrban("São Paulo", "São Carlos",
                                                                    new GregorianCalendar(2021, Calendar.MARCH,
                                                                            10, 11, 00));

        TicketInterstateBus ticketInterstateBus = cCompany.issueTicketInterstate("São Paulo", "Uberlândia",
                                                                    new GregorianCalendar(2021, Calendar.SEPTEMBER,
                                                                            22, 15, 45));
        ticketUrbanBus.ShowDetails();
        ticketInterstateBus.ShowDetails();
    }
}
