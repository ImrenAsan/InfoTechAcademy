package homework4;

public class Question1 {
    public static void main(String[] args) {
        //String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”  string
        //ifadesini “Java ogrenmek cok guzel.” sekline getirin.

        String ifade =" Java ogrenmek123 Cok guzel@ ";
        String ifade2= ifade.replaceAll("\\d", "");
        String ifade3 = ifade2.trim();
        System.out.println(ifade3);
        String ifade4 = ifade3.replaceFirst("@", "");
        System.out.println(ifade4);
        String ifade5= ifade4.replace("C", "c");
        System.out.println(ifade5);
        String ifade6= ifade5.concat(".");
        System.out.println(ifade6);

    }
}
