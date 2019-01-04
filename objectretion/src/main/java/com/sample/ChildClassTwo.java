package com.sample;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ChildClassTwo implements ClassTwo {
    public String method1() {
        return "ClassTwo Method1";
    }

    public String method2() {
        return "ClassTwo Method2";
    }
}
