package tralipa.urations;

import java.util.Collections;
import java.util.List;

public class TaggedEntity {

	private String name;
	private List<Label> labels;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Label> getLabels() {
		return labels;
	}
	public void setLabels(List<Label> labels) {
		this.labels = labels;
		Collections.sort(this.labels,new LabelNameComparator());
	}
	
	
	
}
