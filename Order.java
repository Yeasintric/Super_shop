public class Order {
    String productName;
    private double unit_price;
    private int quantity;
    
    public Order(String productName, double unit_price, int quantity) throws Exception{
        if(unit_price<=0){
            throw new Exception("Hey idiot, the unit price must be greater than zero");    
        }
        if(quantity<=0){
            throw new Exception("Hey idiot, the quantity must be greater than zero");    
        }
        this.productName = productName;
        this.unit_price = unit_price;
        this.quantity = quantity;
        }
        public void setUnitPrice(double unitPrice) throws Exception{
            if(unitPrice<=0){
                throw new Exception("Hey idiot, the unit price must be greater than zero");    
            }
            this.unit_price = unitPrice;
        }
        
        public void setQuantity(int qty) throws Exception{
            if(qty<=0){
                throw new Exception("Hey idiot, the quantity must be greater than zero");    
            }
            this.quantity = qty;
        }
        public double calculateTotal() {
        return unit_price * quantity;
    }
    @Override
    public String toString() {

        return productName + " - " +
               quantity +" x "+
               unit_price + " = " +
               calculateTotal();
    }   
}
