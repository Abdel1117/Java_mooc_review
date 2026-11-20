
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment apartment) {
        if (this.squares > apartment.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int priceOfFirstAppartement = this.princePerSquare * this.squares;
        int priceOfSecondAppartement = compared.princePerSquare * compared.squares;

        if (priceOfFirstAppartement > priceOfSecondAppartement) {
            return priceOfFirstAppartement - priceOfSecondAppartement;
        } else {
            return priceOfSecondAppartement - priceOfFirstAppartement;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {

        int priceOfFirstAppartement = this.princePerSquare * this.squares;
        int priceOfSecondAppartement = compared.princePerSquare * compared.squares;
        if (priceOfFirstAppartement > priceOfSecondAppartement) {
            return true;
        } else {
            return false;
        }
    }
}
