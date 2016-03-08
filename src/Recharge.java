class Recharge extends RoboFamily {
	int timeCharging;
	public Recharge(int TimeCharging, int PowerLevel, int Speed, String Name){
		super (Name, PowerLevel, Speed);
		timeCharging = TimeCharging;
	}
	public void PowerUp(){
		System.out.println("Looks like you could use some fuel!");
		if (powerLevel <= 100){
			for (;timeCharging>0; timeCharging-=1){
			powerLevel = powerLevel + 5;
		}	
		}
		System.out.println("Your new battery level is:");
	}
}


