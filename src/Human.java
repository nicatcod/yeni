import java.util.Arrays;

class Human {
    private String nov;
    private String ləqəb;
    private int yaş;
    private int hiyləSəviyyəsi;
    private String[] vərdişlər;

    // Boş konstruktor
    public Human() {}

    // Növ və ləqəb ilə konstruktor
    public void Humman (String nov, String ləqəb) {
        this.nov = nov;
        this.ləqəb = ləqəb;
    }

    // Bütün sahələri əhatə edən konstruktor
    public Human(String nov, String ləqəb, int yaş, int hiyləSəviyyəsi, String[] vərdişlər) {
        this.nov = nov;
        this.ləqəb = ləqəb;
        this.yaş = yaş;
        this.hiyləSəviyyəsi = hiyləSəviyyəsi;
        this.vərdişlər = vərdişlər;
    }

    // Metodlar
    public void ye() {
        System.out.println("Mən yeyirəm");
    }

    public void cavabVer() {
        System.out.println("Salam, sahib. Mən - " + this.ləqəb + ". Səni darıxıram!");
    }

    public void gizlət() {
        System.out.println("Mən bunu gizlətməliyəm");
    }

    // toString metodunu yenidən müəyyən etmək
    @Override
    public String toString() {
        return nov + "{ləqəb='" + ləqəb + "', yaş=" + yaş + ", hiyləSəviyyəsi=" + hiyləSəviyyəsi +
                ", vərdişlər=" + Arrays.toString(vərdişlər) + "}";
    }
}
