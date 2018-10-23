package com.fntzy.core.model;

import com.fntzy.core.model.enums.AttributeName;
import com.fntzy.template.CreatureTemplate;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

import static com.fntzy.core.AttributeGenerator.generateStatScore;

@Data
@Builder
public class Creature {

    private String name;
    private List<Discipline> disciplines;
    private Attributes attributes;

    public static Creature fromTemplate(CreatureTemplate creatureTemplate) {
        List<Discipline> disciplines = creatureTemplate.getDisciplineTemplates()
                .stream()
                .map(Discipline::fromTemplate)
                .collect(Collectors.toList());
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
                        .spirit(Attribute.builder()
                                .name(AttributeName.SPIRIT)
                                .score(generateStatScore(AttributeName.SPIRIT, disciplines))
                                .build())
                        .build())
                .build();

    }
}
