

//Computer class

public abstract class Computer {
    
    public abstract string getRAM();
    public abstract String getHDD();

	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD();
	}
}


public class PC extends Computer {

	private String ram;
	private String hdd;

	public PC(String ram, String hdd){
		this.ram=ram;
		this.hdd=hdd;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

}


public class Server extends Computer{
    
    private String ram;
    private String hdd;
    
    public PC(String ram, String hdd){
        this.ram = ram;
        this.hdd = hdd;
    }
    
   @Override
   public String getRAM(){
       return this.ram;
   }
   
    @Override
   public String getHDD(){
       return this.hdd;
   }
    
}

public class ComputerFactory{
    	public static Computer getComputer(String type, String ram, String hdd){
    	    if("PC".equalsIgnoreCase(type)){
    	        return new PC(ram,hdd);
    	    }
    	     if("Server".equalsIgnoreCase(type)){
    	        return new Server(ram,hdd);
    	    }
    	    
    	}

    
}

public class TestFactory {
    
    	public static void main(String[] args) {
    	    
    	    Computer pc = ComputerFactory.getComputer("PC","2 GB","500 GB");
    	    Computer server = ComputerFactory.getComputer("Server","16 GB","1 TB");
    	    System.out.println("Factory PC Config::"+pc);
		    System.out.println("Factory Server Config::"+server);
    	}

}


