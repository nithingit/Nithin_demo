package com.project.config;

import java.io.File;
import java.net.URL;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;


public class ConfigProvider extends PropertiesConfiguration {

	/**
	 * 
	 */
	public ConfigProvider() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param file
	 * @throws ConfigurationException
	 */
	public ConfigProvider(File file) throws ConfigurationException {
		super(file);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fileName
	 * @throws ConfigurationException
	 */
	public ConfigProvider(String fileName) throws ConfigurationException {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param url
	 * @throws ConfigurationException
	 */
	public ConfigProvider(URL url) throws ConfigurationException {
		super(url);
		// TODO Auto-generated constructor stub
	}

	// private PropertiesConfiguration properties;
	// TODO: This class will be used when it is decided to proceed with other
	// Configuration provided library or custom config provider

}
