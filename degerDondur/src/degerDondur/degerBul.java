package degerDondur;

import java.util.ArrayList;

public class degerBul {

	public static void main(String[] args)
	{
		//String yazdýrma
		String ogrenciAdi = "Emre Bulut";
		System.out.println("(Ogrenci Adý Yazdýrýlýyor...");
		getValue(ogrenciAdi);
		
		//Integer yazdýrma
		Integer yas = 17;
		System.out.println("Yaþ Yazdýrýlýyor...");
		getValue(yas);
		
		//Ogrenci nesnesiyle oluþturulan diziyi yazdýrma
		Ogrenci yeniOgrenci = new Ogrenci(ogrenciAdi, yas);
		ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		ogrenciList.add(yeniOgrenci);
		System.out.println("Öðrenci Listesi (Nesne) Yazdýrýlýyor.");
		getValue(ogrenciList);
	
		// String dizisi yazdýrma
		ArrayList<String> ogrenciList2 = new ArrayList<>();
		ogrenciList2.add("Emre");
		ogrenciList2.add("Kerem");
		System.out.println("Öðrenci Listesi(String) Yazdýrýlýyor.");
		getValue(ogrenciList2);
	}
	
	public static void getValue(Object object)
	{
		System.out.println("Gelen deðer= "+ object);
	}
}





