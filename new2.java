abstract class Asmuo_1 {

    protected String vardas;

    protected String pavarde;



    public Asmuo_1(String vardas, String pavarde) {

        this.vardas = vardas;

        this.pavarde = pavarde;

    }



    @Override

    public String toString() {

        return "Vardas: " + vardas + ", Pavarde: " + pavarde;

    }



    public abstract void spausdinkInformacija();

}

class Studentas extends Asmuo_1 {     p... by Vladimiras Lukaševas
    Vladimiras Lukaševas
21:20

    class Studentas extends Asmuo_1 {

        public Studentas(String vardas, String pavarde) {

            super(vardas, pavarde);

        }



        @Override

        public void spausdinkInformacija() {

            System.out.println("Studento informacija:\n " + toString());

        }

    }

    class Destytojas extends Asmuo_1 {     ... by Vladimiras Lukaevas
        Vladimiras Lukaevas
21:20

        class Destytojas extends Asmuo_1 {

            public Destytojas(String vardas, String pavarde) {

                super(vardas, pavarde);

            }



            @Override

            public void spausdinkInformacija() {

                System.out.println("Destytojo informacija:\n " + toString());

            }

        }

        has context menu
                Compose