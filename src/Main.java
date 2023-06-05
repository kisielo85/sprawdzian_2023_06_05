import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        List<NaPewnoZdam> chyba = new ArrayList<NaPewnoZdam>();

        chyba.add(new NaPewnoZdam("Java",2,"Mirosław Zelent"));
        chyba.add(new NaPewnoZdam("Chemia",6,"Walter White"));
        chyba.add(new NaPewnoZdam("Polski",3,"Donald Trump"));

        LocalDate date = LocalDate.of(2023, 6, 5);
        chyba.add(new Zdalem("Matematyka",4,"RandomZYoutube", date));

        for (NaPewnoZdam x: chyba) {
            System.out.println(x.toString());
        }
        chyba.remove(0);

    }
}