package academy.everyonecodes.java.week2.set2.exercise5;

public class ShoeCustomer {

    private int shoeCustomerSize;

    public ShoeCustomer(int shoeCustomerSize) {
        this.shoeCustomerSize = shoeCustomerSize;
    }

    public int getShoeCustomerSize() {
        return shoeCustomerSize;
    }

    public boolean tryShoe(Shoe shoe) {
        if (shoeCustomerSize == shoe.getShoeSize()) {
            return true;
        } else {
            return false;

        }

    }

}
