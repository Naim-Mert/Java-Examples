package java1.ders;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		String internetSubeButon = "�nternet �ubeye gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println("internetSubeButonu");
		
		if(dolarBugun<dolarDun) {
			System.out.println("dolar d�st� resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("dolar y�kseldi resmi");
		}
		else {
			System.out.println("dolar esittir resmi");
		}
	
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "�it�i kredisi";
		String kredi4 = "Konut kredisi";
		String kredi5 = "Msb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler =
			{
					"H�zl� Kredi",
					"Mutlu emekli kredisi",
					"�it�i kredisi",
					"Konut kredisi",
					"Msb kredisi",
					
			};
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 ="Ankara";
		String sehir2 ="�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
		
	}
	

}
