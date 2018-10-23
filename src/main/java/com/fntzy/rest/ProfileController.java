package com.fntzy.rest;

import com.fntzy.core.model.Creature;
import com.fntzy.template.CreatureTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/template")
public class ProfileController {

    @PostMapping("/creature")
    public @ResponseBody
    Creature generateCreature(@RequestBody CreatureTemplate creatureTemplate) {
        return Creature.fromTemplate(creatureTemplate);
    }

    @GetMapping("/creature/{name}")
    public @ResponseBody
    Creature getCreature(@PathVariable String name) {
        return null;
    }

}
