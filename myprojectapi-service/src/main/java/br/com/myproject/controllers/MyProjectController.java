package br.com.myproject.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.myproject.configuration.MyProjectConfiguration;
import br.com.myproject.model.MyProject;

@RestController
public class MyProjectController {
	private static final String template = "%s, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private MyProjectConfiguration configuration;

	@RequestMapping("/myproject")
	public MyProject myproject(@RequestParam(value = "name", defaultValue = "") String name) {
		if (name.isEmpty())
			name = configuration.getDefaultValue();
		return new MyProject(counter.incrementAndGet(), String.format(template, configuration.getMyProject(), name));

	}
}
