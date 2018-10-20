package com.fntzy.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Attributes {

    private Attribute strength;
    private Attribute agility;
    private Attribute toughness;
    private Attribute intellect;
    private Attribute sociability;
    private Attribute perception;

}
