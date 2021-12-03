package tralipa.urations.deployments;

import java.util.Set;

import tralipa.urations.TaggedEntity;
import tralipa.urations.configs.Config;
import tralipa.urations.envs.Environment;

public class Deployment extends TaggedEntity{

	private Set<Config> configs;
	private Set<Environment> environments;
	private Set<RoutingRule> routingRules;
	
}
