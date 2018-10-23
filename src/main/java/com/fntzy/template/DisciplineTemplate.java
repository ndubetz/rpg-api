package com.fntzy.template;

import com.fntzy.core.model.enums.DisciplineName;
import com.fntzy.core.model.enums.SpecializationName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DisciplineTemplate {
    private DisciplineName name;
    private SpecializationName specialization;
    private int rank;
}
