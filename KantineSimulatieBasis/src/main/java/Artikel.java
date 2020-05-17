public class Artikel {
    public static void main(String[] args) {
        //aanmaak velden
        private String naam;
        private double prijs;

        //constructor met parameter C
    public Artikel(String naam, double prijs){
            this.naam = naam;
            this.prijs = prijs;
        }

        //constructor zonder parameter D
    public Artikel() {
            naam = "Naam";
            prijs = 2;
        }

        //getters en setters E
        public String getNaam () {
            return naam;
        }

        public int getPrijs () {
            return prijs;
        }

        public void setNaam (String newNaam){
            this.naam = newNaam;
        }

        public void setPrijs ( int newPrijs){
            this.prijs = newPrijs;
        }

    }
}

//Declaratie : Het opzetten van de variabele, het type en de naam van de variabele voor de eerste keer weergeven
//Initialisatie: Een waarde geven aan een variabele.
//Een variabele moet gedeclareerd zijn voordat deze geïnitialiseerd kan worden.