package com.fntzy.profile;

import com.fntzy.core.model.Discipline;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CreatureTemplate {

    private String name;
    private List<Discipline> disciplines;
}
