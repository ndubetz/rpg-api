package com.fntzy.profile;

import com.fntzy.core.AttributeGenerator;
import com.fntzy.core.model.Attribute;
import com.fntzy.core.model.AttributeName;
import com.fntzy.core.model.Attributes;
import com.fntzy.core.model.Discipline;
import lombok.Builder;
import lombok.Data;

import java.util.List;

import static com.fntzy.core.AttributeGenerator.generateStatScore;

@Data
@Builder
public class Creature {

    private String name;
    private List<Discipline> disciplines;
    private Attributes attributes;

    public static Creature fromTemplate(CreatureTemplate creatureTemplate) {
        List<Discipline> disciplines = creatureTemplate.getDisciplines();
        return Creature.builder()
                .name(creatureTemplate.getName())
                .disciplines(disciplines)
                .attributes(Attributes.builder()
                        .strength(Attribute.builder()
                                .name(AttributeName.STRENGTH)
                                .score(generateStatScore(AttributeName.STRENGTH, disciplines))
                                .build())
                        .agility(Attribute.builder()
                                .name(AttributeName.AGILITY)
                                .score(generateStatScore(AttributeName.AGILITY, disciplines))
                                .build())
                        .toughness(Attribute.builder()
                                .name(AttributeName.TOUGHNESS)
                                .score(generateStatScore(AttributeName.TOUGHNESS, disciplines))
                                .build())
                        .intellect(Attribute.builder()
                                .name(AttributeName.INTELLECT)
                                .score(generateStatScore(AttributeName.INTELLECT, disciplines))
                                .build())
                        .perception(Attribute.builder()
                                .name(AttributeName.PERCEPTION)
                                .score(generateStatScore(AttributeName.PERCEPTION, disciplines))
                                .build())
                        .sociability(Attribute.builder()
                                .name(AttributeName.SOCIABILITY)
                                .score(generateStatScore(AttributeName.SOCIABILITY, disciplines))
                                .build())
                        .build())
                .build();

    }
}
