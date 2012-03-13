package production_v1;

public class Territory {
	
	private Territory[] connections;
	private Player owner;
	private int nbrOfUnits = 0, id;
	
	public Territory(int id){
		this.id = id;
		connections = null;
		owner = null;
	}
	
	public boolean hasConnection(Territory compareTo){
		if(connections == null){
			return false;
		}
		for(int i = 0; i < connections.length; i++){
			if(connections[i].equals(compareTo)){
				return true;
			}
		}
		return false;
	}
	
	public Player getOwner(){
		return owner;
	}
	
	public void setOwner(Player newOwner){
		this.owner = newOwner;
	}
	
	public void setNbrOfUnits(int nbrOfUnits){
		this.nbrOfUnits = nbrOfUnits;
	}
	
	public int getNbrOfUnits(){
		return this.nbrOfUnits;
	}

	private Object getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object rhs){
		if(rhs == null || !(rhs.getClass() == this.getClass())){
			return false;
		}
		Territory toCompare = (Territory)rhs;
		return this.getId() == toCompare.getId();
	}
	
	
}
