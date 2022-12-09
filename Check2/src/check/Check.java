package check;

import constants.Constants;

public class Check extends Constants {

		private static String firstName="suzuki";
		private static String lastName="shota";

	public static void main(String[] args) {
		printName(firstName,lastName);
		Pet pet=new Pet(CHECK_CLASS_JAVA,CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet rPet=new RobotPet(CHECK_CLASS_R2D2,CHECK_CLASS_LUKE);
		rPet.introduce();


	}
	private static void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド→"+firstName+lastName);
	}

}
