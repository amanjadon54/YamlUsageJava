package com.sample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Configuration {
    @Getter
    @Setter
    ClassOne someVar1;

    @Getter
    @Setter
    ClassTwo someVar2;

//    @Getter
//    @Setter
//    RoleConfigurations[] roles;

}
