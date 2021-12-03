package tralipa.urations;

import static tralipa.urations.Utils.hash;

import java.util.Arrays;

import tralipa.urations.configs.Config;

public class Urations {

	   public static void main(String[] args) {
		    
	    	Config c = config("environment","prod");
	    	Config c1 = config("environment","test");
	    	Config c2 = config("env","uat");
	    	
	    	System.out.println(hash(c.toHashableString()));
	    	System.out.println(hash(c1.toHashableString()));
	    	System.out.println(hash(c2.toHashableString()));

	    	System.out.println(hash(c.toHashableString()).getBytes().length);
	    	System.out.println(hash(c1.toHashableString()).getBytes().length);
	    	System.out.println(hash(c2.toHashableString()).getBytes().length);
	    	
	    }

	    private static Config config(String key,String value) {
	    	Label[] ls = new Label[] {label(key,value),label("customer","abc"),label("application","ifrc")};
	        Config c = new Config();
	        c.setName("JVM_OPTS");
	        c.setValue("-Dappp=abc,-Dappparam2=xyz,-xms256");
	        c.setLabels(Arrays.asList(ls));

	        return c;
	    }
	    private static Label label(String name,String value) {
	    	return new Label(name,value);
	    	 
	    }

}
