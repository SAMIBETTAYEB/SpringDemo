/**
 * Created by Bettayeb on 5/19/2017.
 */
public class PersonWithAddress extends Person {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getId()+" - "+getName()+" - "+address.getAddress()+" - "+address.getEmail();
    }
}
