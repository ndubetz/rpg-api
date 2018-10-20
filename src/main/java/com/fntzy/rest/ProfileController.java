package com.fntzy.rest;

import com.fntzy.profile.Creature;
import com.fntzy.profile.CreatureTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @PostMapping("/creature")
    public @ResponseBody
    Creature generateCreature(@RequestBody CreatureTemplate creatureTemplate){
        return Creature.fromTemplate(creatureTemplate);
    }

    @GetMapping("/creature/{name}")
    public @ResponseBody
    Creature getCreature(@PathVariable String name){
        return null;
    }

}
