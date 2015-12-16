package models;

import play.*;
import play.mvc.*;

/**
 * 
 * @author Olanre
 *Class that contains the object for a single BlackList URl
 */

public class BlacklistEntry extends Model {
	@Id
	public long id;
	public double last_seen;
	public String category;
	
	public Blacklist( String category){
		this.category = category;
	}
	
	
	public void
	
	public String getCategory(){
		return this.category;
	}
	
	public void setCategory(String new_category){
		this.category = new_category
	}
	
	public void set_lastSeen(double new_date){
		this.last_seen = new_date;
		
	}
	

}

public class BlacklistURL extends BlacklistEntry{

	public String URL;
	
	public BlacklistURL(String URL, String category){
		super(category);
		this.URL = URL;	
	}
	
	public String getURL(){
		return this.URL;
	}
	
}

public class BlacklistDomain extends BlacklistEntry{

	public String Domain;
	
	public BlacklistDomain( String Domain, String category){
		super(category);
		this.Domain = Domain;
	}
	
	public String getDomain(){
		return this.Domain;
	}
	
}

public class BlacklistIP extends BlacklistEntry{

	public String IP;
	
	public BlacklistDomain( String IP, String category){
		super(category);
		this.IP = IP;	
	}
	
	public String getIP(){
		return this.IP;
	}
	
}

public class BlacklistWords extends BlacklistEntry{

	public String Phrase;
	
	public BlacklistDomain( String Phrase, String category){
		super(category);
		this.Phrase = Phrase;	
	}
	
	public String getPhrase(){
		return this.Phrase;
	}
	
}

