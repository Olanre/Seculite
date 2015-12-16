package models;

import play.*;
import play.mvc.*;

public class URLBlackList extends Model{
	
	public ArrayList<BlackListURL> UrlList;
	
	public URLBlackList(ArrayList<BlackListURL> array ){
		this.UrlList = array;
	}
	 
	public ArrayList<BlackListURL> getURLList(){
		return this.UrlList;
	}
	
	public addNewURL(String new_url, String category){
		BlackListURl = new BlacklistURL(new_url, String category);
		this.UrlList.add( BlackListURl);
	}
	
	
	
}