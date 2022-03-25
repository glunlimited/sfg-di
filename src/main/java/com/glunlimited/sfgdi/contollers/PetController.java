package com.glunlimited.sfgdi.contollers;

import com.glunlimited.sfgdi.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;


    public PetController(@Qualifier("petService") PetService petService) {
        this.petService = petService;
    }


    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
