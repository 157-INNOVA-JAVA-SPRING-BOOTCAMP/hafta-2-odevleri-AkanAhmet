package com.akanahmet.innerclass;

public class Ulke {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	public static class Sehir {
		private String sehirAdi;
		
		public String getSehirAdi() {
			return sehirAdi;
		}
		
		public void setSehirAdi(String sehirAdi) {
			this.sehirAdi = sehirAdi;
		}
		
		public static class Mahalle {
			private String mahalleAdi;
			
			public String getMahalleAdi() {
				return mahalleAdi;
			}
			
			public void setMahalleAdi(String mahalleAdi) {
				this.mahalleAdi = mahalleAdi;
			}
			
		}
		
	}
	
}
