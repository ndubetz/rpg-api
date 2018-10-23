package com.fntzy.core.model;

import com.fntzy.core.model.enums.AttributeName;
import com.fntzy.core.model.enums.DisciplineName;
import com.fntzy.template.DisciplineTemplate;
import lombok.Builder;
import lombok.Data;

import static com.fntzy.core.model.enums.AttributeName.NONE;
import static com.fntzy.core.model.maps.DisciplineAttributeMaps.*;
import static java.util.Objects.isNull;

@Data
@Builder
public class Discipline {
    private DisciplineName name;
    private int rank;
    private AttributeName primary;
    private AttributeName secondary;
    private AttributeName tertiary;

    public static Discipline fromTemplate(DisciplineTemplate disciplineTemplate) {
        return Discipline.builder()
                .name(disciplineTemplate.getName())
                .rank(disciplineTemplate.getRank())
                .primary(primaryDiscplineNameToAttributeMap().get(disciplineTemplate.getName()))
                .secondary(secondaryDiscplineNameToAttributeMap().get(disciplineTemplate.getName()))
                .tertiary(hasSpecialization(disciplineTemplate)
                        ? tertiarySpecializationToAttributeMap().get(disciplineTemplate.getSpecialization())
                        : NONE)
                .build();
    }

    private static boolean hasSpecialization(DisciplineTemplate disciplineTemplate) {
        return !isNull(disciplineTemplate.getSpecialization()) && disciplineTemplate.getRank() > 5;
    }
}
