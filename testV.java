
public abstract class testV {
    private int code;
    private String title;
    private double price;
    private int quantity;
    private int gst;

    public testV(int code, String title, double price, int quantity,int gst){
        this.code = code;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.gst=gst;
    }

    //Getters
    public int getCode(){
        return this.code;
    }
    public String getTitle(){
        return this.title;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public int setgst(){
        return this.gst;
    }
    // Setters
    public void setCode(int code){
        this.code = code;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setgst(int gst){
        this.gst = gst;
    }

    //ItemTotalCost method
    public double itemTotalCost(){
        double total = this.price * this.quantity;
        return total;
    }

    //ToString
    public String toString(){
        String outputItemDes = "";
        outputItemDes += "Code: "+ this.code;
        outputItemDes += "Title: "+ this.title;
        outputItemDes += "Price: "+ this.price;
        outputItemDes += "Quantity: "+ this.quantity;
        outputItemDes += "gst: "+ this.gst;
        outputItemDes += "Item Total Cost: " + this.itemTotalCost();
        return outputItemDes;
    }}


    