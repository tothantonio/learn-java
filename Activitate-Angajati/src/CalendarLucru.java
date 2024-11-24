public class CalendarLucru {
    private Zi[] zile;

    public CalendarLucru() {
        zile = new Zi[7];
        zile[0] = new Zi("Luni", true);
        zile[1] = new Zi("Marti", true);
        zile[2] = new Zi("Miercuri", true);
        zile[3] = new Zi("Joi", true);
        zile[4] = new Zi("Vineri", true);
        zile[5] = new Zi("Sambata", false);
        zile[6] = new Zi("Duminica", false);
    }

    public void setLucratoare(String numeZi) {
        for (Zi zi : zile) {
            if (zi.getNume().equals(numeZi)) {
                zi.setLucratoare();
            }
        }
    }

    public void setNelucratoare(String numeZi) {
        for (Zi zi : zile) {
            if (zi.getNume().equals(numeZi)) {
                zi.setNelucratoare();
            }
        }
    }

    public boolean esteLucratoare(String numeZi) {
        for (Zi zi : zile) {
            if (zi.getNume().equals(numeZi)) {
                return zi.esteLucratoare();
            }
        }
        return false;
    }
}
