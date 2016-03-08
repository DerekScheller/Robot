import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Movement slimbot = new Movement(4, 9, 100, "Slimbot");
		System.out.println(slimbot.powerLevel);
		slimbot.WheelAround();
		Recharge fatbot = new Recharge(5,15,111,"Fatbot");
		System.out.println(fatbot.powerLevel);
		fatbot.PowerUp();
		System.out.println(fatbot.powerLevel);
	}

}

