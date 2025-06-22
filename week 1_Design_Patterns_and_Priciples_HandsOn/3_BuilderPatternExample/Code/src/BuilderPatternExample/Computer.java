package BuilderPatternExample;

public class Computer {

    
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String touchScreen;
    
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.touchScreen=builder.touchScreen;
    }

    
    public void displayConfiguration() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Touch Screen: "+touchScreen);
        System.out.println();
    }

    
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String touchScreen;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        
        public Builder setTouchScreen(String touchScreen) {
        	this.touchScreen=touchScreen;
        	return this;	
        }

        
        public Computer build() {
            return new Computer(this);
        }
    }
}
