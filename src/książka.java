public class książka {
    private String tytul;
    private String autor;
    private int liczbastron;
    private boolean dostepna;

    public książka(String tytul, String autor, int liczbastron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbastron = liczbastron;
        this.dostepna = dostepna;

    }

    public void wypiszinfo() {
        System.out.println("tytul: " + this.tytul);
        System.out.println("autor: " + this.autor);
        System.out.println("liczbastron: " + this.liczbastron);
        System.out.println("dostepna: " + this.dostepna);


    }
    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("ksiazka jest dostepna  do wypozyczenia");
          }  else {
            System.out.println("ksiazka niedostepna");
        }


        }
    public void zwroc() {
        dostepna = true;
        System.out.println("ksiazka moze zostac zwrocona");
    }


    }

