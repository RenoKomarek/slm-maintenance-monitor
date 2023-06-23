package com.example.slmmaintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class slmmaintenancemonitorController {

    String defaultmessage = "Everything works as expected";

    String m = defaultmessage;

    @RequestMapping("/api/message")
    public String message(){ return m; }

}
