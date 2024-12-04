import java.util.Collection;
import java.util.Iterator;


public class ConcreteWebRentalIterator implements WebRentalIterator {
    private Iterator<Rental> rentalIterator;

    public ConcreteWebRentalIterator(Collection<Rental> rentals) {
        this.rentalIterator = rentals.iterator();
    }

    @Override
    public boolean hasNext() {
        return rentalIterator.hasNext();
    }

    @Override
    public Rental next() {
        return rentalIterator.next();
    }
}