package org.jinyingtaixiang.module;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CommonRest {
    @GetMapping("/")
    public String home() {
        return "/index.html";
    }
}
