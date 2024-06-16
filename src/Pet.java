class Pet {
    private String ad;
    private String soyad;
    private int il;
    private int iq;
    private Pet pet;
    private Human ana;
    private Human ata;
    private String[][] cədvəl;

    // Boş konstruktor
    public Human getAna() {}

    // Ad, soyad və il ilə konstruktor
    public void Human(String ad, String soyad, int il) {
        this.ad = ad;
        this.soyad = soyad;
        this.il = il;
    }

    // Ad, soyad, il, ata və ana ilə konstruktor
    public void human(String ad, String soyad, int il, Human ata, Human ana) {
        this.ad = ad;
        this.soyad = soyad;
        this.il = il;
        this.ata = ata;
        this.ana = ana;
    }

    // Bütün sahələri əhatə edən konstruktor
    public void human(String ad, String soyad, int il, int iq, Pet heyvan, Human ana, Human ata, String[][] cədvəl) {
        this.ad = ad;
        this.soyad = soyad;
        this.il = il;
        this.iq = iq;
        this.pet = heyvan;
        this.ana = ana;
        this.ata = ata;
        this.cədvəl = cədvəl;
    }

    // Metodlar
    public void heyvanıSalamla() {
        System.out.println("Salam, " + this.pet.ləqəb);
    }

    public void heyvanıTəsvirEt() {
        String hiyləStatusu = this.pet.hiyləSəviyyəsi > 50 ? "çox hiyləgər" : "demək olar ki, hiyləgər deyil";
        System.out.println("Məndə bir " + this.pet.nov + " var, o " + this.pet.yaş + " yaşındadır, o " + hiyləStatusu + "dır");
    }

    // toString metodunu yenidən müəyyən etmək
    @Override
    public String toString() {
        return "Human{ad='" + ad + "', soyad='" + soyad + "', il=" + il + ", iq=" + iq +
                ", ana=" + ana. + " " + ana.soyad + ", ata=" + ata.ad + " " + ata.soyad +
                ", heyvan=" + pet.toString() + "}";
    }
}

