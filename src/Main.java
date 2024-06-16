public class Main {

    public static void main(String[] args) {
        // Heyvan yarat
        String[] vərdişlər = {"yemək", "içmək", "yatmaq"};
        Pet pet = new pet("it", "Rock", 5, 75, vərdişlər);

        // Valideynləri yarat
        Human ana = new ana("Jane", "Karleone", 1950);
        Human ata = new ata("Vito", "Karleone", 1945);

        // Bütün sahələr ilə uşaq yarat
        String[][] cədvəl = {
                {"Bazar ertəsi", "idmana getmək"},
                {"Çərşənbə axşamı", "dostlarla görüşmək"},
                {"Çərşənbə", "təhsil"},
                {"Cümə axşamı", "futbol oynamaq"},
                {"Cümə", "kinoya getmək"},
                {"Şənbə", "istirahət"},
                {"Bazar", "ailə vaxtı"}
        };

        Human uşaq = new uşaq ("Michael", "Karleone", 1977, 90,uşaq, ana, ata, cədvəl);

        // Hər bir şəxs haqqında məlumatları göstər
        System.out.println("Ana: " + ana);
        System.out.println("Ata: " + ata);
        System.out.println("Uşaq: " + uşaq);

        // Uşaq və onun heyvanı üçün metodları çağır
        uşaq.cavabVer();
        uşaq.gizlət();
        pet.heyvanıSalamla();
        pet.heyvanıTəsvirEt();
        pet.heyvanıTəsvirEt();

        // toString metodlarını çağır
        System.out.println(uşaq);
        System.out.println(pet);
    }
}
