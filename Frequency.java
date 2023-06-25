package misc;

import java.util.HashMap;

public class Frequency {
	
	private String text; 
	private HashMap<String,Integer> all = new HashMap<>(); 
	private boolean done = false;
	
	Frequency(String text){
		this.text = text;
	}
	
	public void set_text(String text) {
		done = false;
		this.text = text;
	}
	
	public String get_text(){
		return text;
	}
	
	public int get_frequency(String word){
		
		if(done) {
			return all.get(word);
		}
		
		StringBuilder tmp = new StringBuilder();
		
		for(int i = 0;i < text.length();i++) {
			String x = text.substring(i,i+1);
			
			if(x.equals(" ")){
				if(all.containsKey(tmp.toString())){
					all.put(tmp.toString(), all.get(tmp.toString())+1);
				}
				else {
					all.put(tmp.toString(), 1);
				}
				tmp = new StringBuilder();
				continue;
			}
			
			tmp.append(x);
			
		}
		
		done = true;
		if(all.containsKey(word)){
			return all.get(word);
		}
		return 0;
		
	}

}
