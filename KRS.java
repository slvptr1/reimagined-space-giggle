public class KRS {
    private String[] matKul = new String[5];
    private int jmlMatKul = 0;
    private final int isiKRS = 5;

    public void tambahMatKul(String matKul) {
        if(jmlMatKul < isiKRS) {
            this.matKul[jmlMatKul] = matKul;
            jmlMatKul++;
        } else {
            System.out.println(matKul + "Error: KRS telah penuh");
        }
    }
    public String[] getmatKul() {
return matKul;
    }
}