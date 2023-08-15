package br.com.myproject.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties("myproject-service")
public class MyProjectConfiguration {
	private String myProject;
	private String defaultValue;

	public MyProjectConfiguration() {
	}

	public String getMyProject() {
		return myProject;
	}

	public void setMyProject(String myProject) {
		this.myProject = myProject;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
