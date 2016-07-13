package com.unixcraft.YumRepo;

/**
 * Created by kashif on 13/07/2016.
 */

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YumRepoConfigurationController {

    @RequestMapping("/yumrepoconf")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
