package com.fntzy.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Attribute {
    private AttributeName name;
    private int score;
}
