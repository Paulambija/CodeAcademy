class Destytojas extends Asmuo_1 {
    public Destytojas(String vardas, String pavarde) {
        super(vardas, pavarde);
    }

    @Override
    public void spausdinkInformacija() {
        System.out.println("Destytojo informacija:\n " + toString());
    }
}