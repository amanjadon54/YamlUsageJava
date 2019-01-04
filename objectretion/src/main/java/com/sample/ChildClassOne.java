package com.sample;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ChildClassOne implements ClassOne {

    public String method1() {
        return "ClassOne Method1";
    }

    public String method2() {
        return "ClassOne Method2";
    }
}
