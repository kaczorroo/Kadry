package com.company;

/**
 * Created by user on 2016-05-04.
 */
public class Kadry {
    private Pracownik[] pracownicy_;
    private int zatrudnienie_;

    public Kadry() {
        pracownicy_ = new Pracownik[100]; //okreslamy tablice pracownikow do 100 poniewaz firma nie zaklada zatrudniac wiecej
        zatrudnienie_ = 0; //ustalamy zatrudnienie na zero
    }

    /**
     * tworzymy metode dodajPracownika, ktora jak nazwa wskazuje dodaje pracownika jezeli nie ma wiecej niz 100 osob w firmie
     * nadaje mu id zatrudnienie_ zaleznie od tego ktora osoba wpisana do bazy danych jest pracownik i podnosi zatrudnienie_
     * o jeden wiecej
     */
    private void dodajPracownika(Pracownik pracownik) {
        if (zatrudnienie_ < 100) {
            pracownicy_[zatrudnienie_] = pracownik;
            zatrudnienie_++;
        } else
            System.out.println("Limit pracownikow has reached");
    }

    private void dodajPracownikaInteraktywnie() {
        //nie wiem jak to zrobic -.-
    }

    public void importujZPlikuTekstowego() {
        //nie wiem tez
    }

    protected double sredniZarobek () {
        // brak pomyslu
        return 0;
    }

    protected double sredniZarobek(int dzial) {
        // brak pomyslu
        return 0;
    }

    protected int[] dajDzialy(){
        //kod
        return new int[0];
    }
    public void zapiszDoPliku(){
        //kod
    }
    public void odczytajZPliku(){
        //kod
    }

}
