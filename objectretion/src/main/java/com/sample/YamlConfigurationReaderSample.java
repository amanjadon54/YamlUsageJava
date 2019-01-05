package com.sample;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Arrays;

public class YamlConfigurationReaderSample {

    public static void main(String... s) {

        try {
            Yaml yaml = new Yaml();
            InputStream in = YamlConfigurationReaderSample.class.getClassLoader().getResourceAsStream("sample.yaml");

            Configuration config = yaml.loadAs(in, Configuration.class);
            Arrays.stream(config.roles).forEach(e -> System.out.println(Arrays.stream(e.services).map(f -> ((SampleObjectClass)f).appName)));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
