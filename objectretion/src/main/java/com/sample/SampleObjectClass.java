package com.sample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class SampleObjectClass {
    @Getter
    @Setter
    String appName;

    @Getter
    @Setter
    Object[] objectArray;

}
