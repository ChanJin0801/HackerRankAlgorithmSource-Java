package Advanced.CovariantReturnTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower{
	String whatsYourName() {
		return "I have many names and types.";
	}
}
class Jasmine extends Flower{
	@Override
	String whatsYourName() {
		return "Jasmine";
	}
}
class Lily extends Flower{
	@Override
	String whatsYourName() {
		return "Lily";
	}
}
class Lotus extends Flower{
	@Override
	String whatsYourName() {
		return "Lotus";
	}
}

class Region{
	Flower yourNationalFlower() {
		return new Flower();
	}
}
class WestBengal extends Region{
	Flower yourNationalFlower() {
		return new Jasmine();
	}
}
class Karnataka extends Region{
	Flower yourNationalFlower() {
		return new Lotus();
	}
}
class AndhraPradesh extends Region{
	Flower yourNationalFlower(){
		return new Lily();
	}
}


public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine().trim();
		Region region = null;
		switch(s) {
		case "WestBengal":
			region = new WestBengal();
			break;
		case "AndhraPradesh":
			region = new AndhraPradesh();
			break;
		}
		Flower flower = region.yourNationalFlower();
		System.out.println(flower.whatsYourName());
		

	}

}
