package com.ridohan.demolog;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
    private final static Logger LOGGER = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() {
        LOGGER.trace("A TRACE Message");
        LOGGER.debug("A DEBUG Message");
        LOGGER.info("An INFO Message");
        LOGGER.warn("A WARN Message");
        LOGGER.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
}
