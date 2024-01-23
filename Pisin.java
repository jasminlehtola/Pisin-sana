import java.util.Scanner;

public class Pisin {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä sanoja välilyönnein erotettuna:");
        String syote = lukija.nextLine();

        // Alustetaan sanat-taulukko tyhjäksi
        String[] sanat = new String[0];
        // Tarkistetaan, onko syötettä
        if (syote.isEmpty()) {
            System.out.print("Ei parametreja.");
        } else {
            // Splittaillaan syöte sanoiksi
            sanat = syote.split(" ");
        }

        // Alustetaan pisinSana tyhjäksi merkkijonoksi
        String pisinSana = "";

        // Käydään läpi kaikki sanat
        for (String sana : sanat) {
            // Jos sana on pisin tähän mennessä, päivitetään pisinSana
            if (sana.length() > pisinSana.length()) {
                pisinSana = sana;
            }
        }

        // Tulostetaan pisin sana
        System.out.print("Pisin parametri: " + pisinSana);
    }
}