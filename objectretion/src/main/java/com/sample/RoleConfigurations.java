package com.sample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class RoleConfigurations {

    @Getter
    @Setter
    String id;

    @Getter
    @Setter
    Object[] services;
}
