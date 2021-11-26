import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Company urbanCompany = new CompanyUrbanBus();
        Company interstateCompany = new CompanyInterstateBus();

        Ticket urbanTicket = urbanCompany.issueTicket("São Paulo", "Campinas",
                                                      new GregorianCalendar(2021, Calendar.MARCH,
                                                                 10, 11, 00));

        Ticket interstateTicket = interstateCompany.issueTicket("São Paulo", "Uberlândia",
                                                      new GregorianCalendar(2021, Calendar.DECEMBER,
                                                                18, 13, 30));

        urbanTicket.ShowDetails();
        interstateTicket.ShowDetails();
    }   
}
