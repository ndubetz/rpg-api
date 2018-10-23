package com.fntzy.template;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CreatureTemplate {
    private String name;
    private List<DisciplineTemplate> disciplineTemplates;
}
