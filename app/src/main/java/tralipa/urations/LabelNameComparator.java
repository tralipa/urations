package tralipa.urations;

import java.util.Comparator;

public class LabelNameComparator implements Comparator<Label>{

	@Override
	public int compare(Label o1, Label o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
