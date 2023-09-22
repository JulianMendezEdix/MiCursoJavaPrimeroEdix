package testing;

import javabeans.Region;

public class TestRegion {

	public static void main(String[] args) {
		String nombre = "andres";
		Region reg1, reg2, reg3;
		
		reg1 = new Region();
		
		reg1.setRegionId(1);
		reg1.setRegionName("Europa");
		
		reg2 = new Region(2,"America");
		reg3 = new Region(2,"America");
		
		
		System.out.println(reg2.getRegionName());

		System.out.println(reg2);
		System.out.println(nombre);
		
		if (reg2.equals(reg3))
			System.out.println("regiones iguales");
		else
			System.out.println("regiones distintas");
		
		

	}

}
