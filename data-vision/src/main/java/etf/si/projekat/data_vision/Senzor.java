package etf.si.projekat.data_vision;

import java.sql.Time;
import java.util.Date;



public class Senzor {
	//fields
	Date datumMjerenja;
	Time vrijemeMjerenja;
	double izmjerenaVrijednost;
	String tipSenzora;
	
	//constructors
	public Senzor(){
		datumMjerenja=null;
		vrijemeMjerenja=null;
		izmjerenaVrijednost=0;
		tipSenzora=null;
		
	}
	
	public Senzor(String tip, Date datum, Time vrijeme, double vrijednost){
		tipSenzora = tip;
		datumMjerenja = datum;
		vrijemeMjerenja = vrijeme;
		izmjerenaVrijednost = vrijednost;
	}
	
	
	
	//methods
	public Date getDatumMjerenja() {
		return datumMjerenja;
	}
	public void setDatumMjerenja(Date datumMjerenja) {
		this.datumMjerenja = datumMjerenja;
	}
	public Time getVrijemeMjerenja() {
		return vrijemeMjerenja;
	}
	public void setVrijemeMjerenja(Time vrijemeMjerenja) {
		this.vrijemeMjerenja = vrijemeMjerenja;
	}
	public double getIzmjerenaVrijednost() {
		return izmjerenaVrijednost;
	}
	public void setIzmjerenaVrijednost(double izmjerenaVrijednost) {
		this.izmjerenaVrijednost = izmjerenaVrijednost;
	}
	public String getTipSenzora() {
		return tipSenzora;
	}
	public void setTipSenzora(String tipSenzora) {
		this.tipSenzora = tipSenzora;
	}

	
	
	
	

}
