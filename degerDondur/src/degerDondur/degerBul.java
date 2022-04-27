package degerDondur;

import java.util.ArrayList;

public class degerBul {

	public static void main(String[] args)
	{
		//String yazd�rma
		String ogrenciAdi = "Emre Bulut";
		System.out.println("(Ogrenci Ad� Yazd�r�l�yor...");
		getValue(ogrenciAdi);
		
		//Integer yazd�rma
		Integer yas = 17;
		System.out.println("Ya� Yazd�r�l�yor...");
		getValue(yas);
		
		//Ogrenci nesnesiyle olu�turulan diziyi yazd�rma
		Ogrenci yeniOgrenci = new Ogrenci(ogrenciAdi, yas);
		ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		ogrenciList.add(yeniOgrenci);
		System.out.println("��renci Listesi (Nesne) Yazd�r�l�yor.");
		getValue(ogrenciList);
	
		// String dizisi yazd�rma
		ArrayList<String> ogrenciList2 = new ArrayList<>();
		ogrenciList2.add("Emre");
		ogrenciList2.add("Kerem");
		System.out.println("��renci Listesi(String) Yazd�r�l�yor.");
		getValue(ogrenciList2);
	}
	
	public static void getValue(Object object)
	{
		System.out.println("Gelen de�er= "+ object);
	}
}





