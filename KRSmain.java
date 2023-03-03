public class KRSmain {
    public static void main(String[] args) {
        KRS krs = new KRS();
        krs.tambahMatKul("Pengantar Keilmuan Komputer");
        krs.tambahMatKul("Pemrograman Dasar");
        krs.tambahMatKul("Arsitektur dan Organisasi Komputer");
        krs.tambahMatKul("Agama Islam");
        krs.tambahMatKul("Bahasa Inggris");
        krs.tambahMatKul("");

        String[] daftarMatKul = krs.getmatKul();
        for(String MatKul : daftarMatKul) {
            if(MatKul != null) {
                System.out.println(MatKul);
            }
        } 
    }
}
