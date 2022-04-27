package degerDondur;

import java.util.ArrayList;

public class degerBul {

	public static void main(String[] args)
	{
		//String yazdýrma
		String ogrenciAdi = "Emre Bulut";
		getValue(ogrenciAdi, "ad");
		
		//Integer yazdýrma
		Integer yas = 17;
		getValue(yas, "yas");
		
		//Ogrenci nesnesiyle oluþturulan diziyi yazdýrma
		Ogrenci yeniOgrenci = new Ogrenci("Emre", 15);
		Ogrenci yeniOgrenci2 = new Ogrenci("Kerem", 22);
		ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		ogrenciList.add(yeniOgrenci);
		ogrenciList.add(yeniOgrenci2);
		getValue(ogrenciList, "ogrenciListNesne");
	
		// String dizisi yazdýrma
		ArrayList<String> ogrenciList2 = new ArrayList<>();
		ogrenciList2.add("Emre");
		ogrenciList2.add("Kerem");
		getValue(ogrenciList2, "ogrenciListString");
	}
	
	public static void getValue(Object object, String turu)
	{
		switch(turu) {
		  case "ad":
			  System.out.println("Ogrenci Adi Yazdiriliyor..");
			  System.out.println(object);
		    break;
		  case "yas":
			  System.out.println("Ogrenci Yasi Yazdiriliyor.");
			  System.out.println(object);
		    break;
		  case "ogrenciListNesne":
			  System.out.println("Ogrenci Listesi(Nesne) Yazdiriliyor.");
			  ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>) object;
			  for(int i=0; i<ogrenciList.size(); i++)
			  {
				  System.out.println(i+1 +  ". Ogrenci Adi= " +  ogrenciList.get(i).getOgrenciAdi() + " , Yasi=" + ogrenciList.get(i).getYas());
			  }
		    break;
		  case "ogrenciListString":
			  System.out.println("Ogrenci Listesi(String) Yazdiriliyor.");
			  ArrayList<String> ogrenciList2 = (ArrayList<String>) object;
			  for(int i=0; i<ogrenciList2.size(); i++)
			  {
				  System.out.println(i+1 +  ". Ogrenci= " +  ogrenciList2.get(i));
			  }
		    break;
		}
		

	}
}





