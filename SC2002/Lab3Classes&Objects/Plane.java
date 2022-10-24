package F1U2P2_solution.solution;

public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;
    
    public Plane(){
        this.seat = new PlaneSeat[12];
        this.numEmptySeat = 12;
        //Should initalize an object to the array else we will have null issues
        for(int i=0; i<12; i++){
            this.seat[i] = new PlaneSeat(i+1);
        }
    }
    private PlaneSeat[] sortSeats(){
        PlaneSeat[] copySeat = new PlaneSeat[12];
        PlaneSeat tempSeat;
        //copy the content of the original Seat to tempSeat
        //can use System.arraycopy(), Object.clone(), Arrays.copyOf() 
		for(int i=0; i<12; i++)
		{
			//copy key (address)
			copySeat[i] = seat[i];
		}
		
		//sort them by customer id in ascending order using insertion sort algorithm
		for(int i=1; i<12; i++)
		{
			for(int j=i; j>0; j--)
			{
				if(copySeat[j].getCustomerID() < copySeat[j-1].getCustomerID())
				{
					//swap the elements to left is smaller than right
					tempSeat = copySeat[j];
					copySeat[j] = copySeat[j-1];
					copySeat[j-1] = tempSeat;
				}
				else
					break;
			}
		}
		
		return copySeat;
    }
    public void showNumEmptySeats(){
        System.out.println("There are " + this.numEmptySeat + " empty seats");
    }
    public void showEmptySeats(){
        System.out.println("The following seats are empty:");
        for(int i=0; i<seat.length; i++){
            if(!seat[i].isOccupied()){
                System.out.println("SeatID "+seat[i].getSeatID());
            }
        }
    }
    public void showAssignedSeats(boolean bySeatId){
        PlaneSeat[] copyPlaneSeats2 = bySeatId? this.seat:sortSeats();
        for(int i=0; i<12; i++){
            if(copyPlaneSeats2[i].isOccupied()){
                System.out.printf("SeatID %d assigned to CustomerID %d.\n", copyPlaneSeats2[i].getSeatID(), copyPlaneSeats2[i].getCustomerID());
            }
        }
    }
    public void assignSeat(int seatId, int cust_id){
        if(this.seat[seatId-1].isOccupied())
			System.out.println("Seat already assigned to a customer.");
		else
		{
			//assign customer to seat if seat is not occupied
			this.seat[seatId-1].assign(cust_id);
			//reduce the number of empty seats
			--this.numEmptySeat;
			
			System.out.println("Seat Assigned!");
		}
    }
    public void unAssignSeat(int seatId){
        if(this.seat[seatId-1].isOccupied())
		{
			//unassigns a seat
			this.seat[seatId-1].unAssign();
			//increase the number of empty seats
			++this.numEmptySeat;
		}
		System.out.println("Seat Unassigned!");
    }
}
