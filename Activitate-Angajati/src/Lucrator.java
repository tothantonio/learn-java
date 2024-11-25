public class Lucrator {
    private String nume;
    private CalendarLucru calendar;

    public Lucrator(String nume) {
        this.nume = nume;
        this.calendar = new CalendarLucru();
    }

    public void lucreaza(String zi) {
        try {
            if (!calendar.esteZiValida(zi)) {
                throw new ExceptieZiInvalida("Exceptie: " + zi + " nu este o zi valida");
            }
            if (calendar.esteLucratoare(zi)) {
                System.out.println(nume + " lucreaza " + zi);
            } else {
                throw new ExceptieZiNelucratoare("Exceptie: " + zi + " nu este o zi lucratoare");
            }
        } catch (ExceptieZiInvalida | ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }
    }
}
