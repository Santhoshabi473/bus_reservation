package recervation;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;// get and set
	
	Bus(int busNo,boolean ac,int cap){
		this.busNo= busNo;
		this.ac=ac;
		this.capacity=cap;
	}
	 public int getCapacity() {
		 return capacity;
	 }
	 public boolean isAc() {
		 return ac;
	 }
	 public void  setAc(boolean val) {
		 ac=val;
	 }
	 public void  setCapacity(int cap) {
		 capacity=cap;
	 }
	 
	 public void displayBusInfo(){
		 System.out.println("BusNO:" + busNo +  "AC:" + ac  + "Total capacity:" + capacity );
	 }
	public int getbusNo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
