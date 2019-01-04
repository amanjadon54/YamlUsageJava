package com.sample;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class YamlConfigurationReaderSample {

    public static void main(String... s){

        try{
            Yaml yaml=new Yaml();
            InputStream in = YamlConfigurationReaderSample.class.getClassLoader().getResourceAsStream("sample.yaml");

            Configuration config=yaml.loadAs(in,Configuration.class);

            System.out.println(config);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
