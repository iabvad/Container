public class Container {

    public int liquid;
    public Container() {
        this.liquid = 0;
    }

    public void addAmount( int amount){
        if(this.liquid + amount <= 100) {
            this.liquid += amount;
        }else {
            System.out.println ("Container cant exceed 100");
        }

    }

    public void remove(int amount){
        if(this.liquid - amount >= 0){
            this.liquid -= amount;
        } else {
            System.out.println ("Container cant go below 0");
        }
    }

    public void move(int amount, Container container){
        if((this.liquid >= amount) && (container.liquid + amount <= 100)){
            remove(amount);
            container.addAmount(amount);
        }
    }

    public String toString(){
        return this.liquid + "/100";
    }
}
