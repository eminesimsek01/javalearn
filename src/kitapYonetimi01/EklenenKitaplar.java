package kitapYonetimi01;

public class EklenenKitaplar {
	//Fields...
	public int kitapNo;
	public String kitapAdı;
	public String yazar;
	public int kitapFiyatı;
	
	
	public EklenenKitaplar() { //Önce parametresiz constructor oluşturdu. P'li p'sizi ezmesin diye
		
	}
	
	
	public EklenenKitaplar (int kitapNo, String kitapAdı, String yazar, int kitapFiyatı) { //Full p'li telescopic constructor
		this.kitapNo=Kitapcı_KitapEkle.count;
		this.kitapAdı=kitapAdı;//Matching için
		this.yazar=yazar;
		this.kitapFiyatı=kitapFiyatı;
	}


}
