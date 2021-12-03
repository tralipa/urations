package tralipa.urations.configs;

import java.util.stream.Collectors;

import tralipa.urations.TaggedEntity;

//TODO make it init once
public class Config extends TaggedEntity{

	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String toHashableString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getName());
		builder.append(getLabels().stream().map(l -> l.toHashableString()).collect(Collectors.joining()));
		return builder.toString();
	}
}
