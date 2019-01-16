package com.gj.core.mybatis;

import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenMybatis {

	public static void main(String[] args) {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		String filePath = ClassLoader.getSystemResource("generator/generatorConfig.xml").getPath();
		//String filePath = ClassLoader.getSystemResource("config/generatorConfig2.xml").getPath();
		System.out.println(filePath);
		
		File configFile = new File(filePath);
		Configuration config;
		try {
			
			ConfigurationParser cp = new ConfigurationParser(warnings);

			config = cp.parseConfiguration(configFile);
			

			DefaultShellCallback shellCallback = new DefaultShellCallback(overwrite);

			MyGenerator myBatisGenerator = new MyGenerator(config, shellCallback, warnings);

			ProgressCallback progressCallback = new VerboseProgressCallback();

			myBatisGenerator.generate(progressCallback);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} 
      

    }
		

}
