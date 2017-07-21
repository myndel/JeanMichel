package example.jbot.lang;

import java.util.ArrayList;
import java.util.List;

public class Dico {

	public static List<String> OOPS = new ArrayList<String>();
	
	static{
		OOPS.add("foutre");
		OOPS.add("sodomie");
		OOPS.add("fiotte");
		OOPS.add("couille");
		OOPS.add("anus");
		OOPS.add("bite");
		OOPS.add("bites");
		OOPS.add("caca");
		OOPS.add("chatte");
		OOPS.add("chattes");
		OOPS.add("pute");
		OOPS.add("putes");
		OOPS.add("enculé");
		OOPS.add("encule");
		OOPS.add("enculer");
		OOPS.add("enculés");
		OOPS.add("poil");
		OOPS.add("poils");
		OOPS.add("porno");
		OOPS.add("porn");
		OOPS.add("moule");
		OOPS.add("gazon");
		OOPS.add("doigt");
		OOPS.add("salope");
		OOPS.add("salopes");
		OOPS.add("salop");
		OOPS.add("salops");
		OOPS.add("shit");
		OOPS.add("broute");
		OOPS.add("gay");
		OOPS.add("gays");
		OOPS.add("huitres");
		OOPS.add("huitre");
	}
	
	public static String getNewOopsedTitle(String originalTitle){
		originalTitle = originalTitle.toLowerCase();
		String[] originalWords = originalTitle.split("[\\ '?.!,]+");
		boolean lol = false;
		for(String originalWord : originalWords){
			for(String oops: OOPS){
				double rankedLeven = LevenshteinDistance.computeRankedLevenshteinDistance(originalWord, oops); 
				if(rankedLeven > 70 && rankedLeven < 100){
					originalTitle = originalTitle.replace(originalWord, oops);
					lol = true;
				}
			}
		}
		
		return lol ? originalTitle: null;
	}
}