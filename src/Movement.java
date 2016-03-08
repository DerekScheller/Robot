class Movement extends RoboFamily{
	int distance;
	int weight;	
	public Movement(int Distance, int Speed, int PowerLevel, String Name){
		super (Name, PowerLevel, Speed);
		distance = Distance;
	}
	public void WheelAround(){
		System.out.println("You moved! Your remaining battery is:");
		powerLevel -= (3 * speed + distance);
		System.out.println(powerLevel);
		}
}

