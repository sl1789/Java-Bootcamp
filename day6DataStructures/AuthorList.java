package day6DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;

public class AuthorList {
	
	private ArrayList<Author2> authorList;
	
	public ArrayList<Author2> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(ArrayList<Author2> authorList) {
		this.authorList = authorList;
	}
	
	AuthorList(){}

	AuthorList(Author2[] authorArray){
		this.authorList=new ArrayList<Author2>(Arrays.asList(authorArray));
	}
	
	public boolean checkAuthor(String s){
		//System.out.println(authorList.contains(s));
		//int i = 0;
		boolean a = false;
		for(Author2 i :authorList){
			if (i.getName().equals(s)){
				a= true;
			}
		}
		return a;
	}
	
	public void addAuthor(Author2 au){
		if (!checkAuthor(au.getName())){
			authorList.add(au);
		}else{
			System.out.println("This author already exists");
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<authorList.size();i++){
			sb.append(authorList.get(i).getName());
			sb.append(" ");
		}
		String s = sb.toString();
		return s;
	}

}
