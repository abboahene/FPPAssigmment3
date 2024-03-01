package Problem1;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice", "Bue", "8493");
        Address c1BillingAddress = new Address("1000 N St", "Assin Foso", "Ohio", "4444");
        c1.setBillingAddress(c1BillingAddress);
        Address c1shippingAddress = new Address("1000 N St Ship", "Assin Foso Ship", "Ohio Ship", "4444");
        c1.setShippingAddress(c1shippingAddress);

        Customer c2 = new Customer("Tom", "Bradly", "8494");
        Address c2BillingAddress = new Address("1001 N St", "Fairfield", "Iowa", "5555");
        c2.setBillingAddress(c2BillingAddress);
        Address c2shippingAddress = new Address("1001 N St Ship", "Fairfield Ship", "Iowa Ship", "5555");
        c2.setShippingAddress(c2shippingAddress);

        Customer c3 = new Customer("Ama", "Adelle", "8495");
        Address c3BillingAddress = new Address("1002 N St", "Odumasi", "Chicago", "7777");
        c3.setBillingAddress(c3BillingAddress);
        Address c3shippingAddress = new Address("1002 N St Ship", "Odumasi Ship", "Chicago Ship", "7777");
        c3.setShippingAddress(c3shippingAddress);

        Customer[] cArr = {c1, c2, c3};

        for (Customer c : cArr){
            if(c.getBillingAddress().state.equals("Chicago")){
                System.out.println(c.toString());
            }
        }
    }
}
