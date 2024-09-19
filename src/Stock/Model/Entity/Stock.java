package Stock.Model.Entity;

public class Stock {

    int inbound;
    int outbond;
    int currentQuantity;

    public Stock(int currentQuantity) {
        // when create de Products. After modified with seters
        this.currentQuantity = currentQuantity;
       this.inbound = 0;
       this.outbond = 0;
    }

    public int getInbound() {
        return inbound;
    }

    public int getOutbond() {
        return outbond;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setInbound(int inbound) {
        this.inbound = inbound;
    }

    public void setOutbond(int outbond) {
        this.outbond = outbond;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }
    @Override
    public String toString(){
        return " |Cantidad actual: " + this.currentQuantity + " |Entrante:" + this.inbound + " |Saliente:" +this.outbond;
    }
}
