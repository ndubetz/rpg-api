package com.fntzy.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Discipline {
    private String name;
    private int rank;
    private AttributeName primary;
    private AttributeName secondary;
    private AttributeName tertiary;
}
