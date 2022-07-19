package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j                          //롬복이 제공하는 어노테이션. log 를 따로 선언 안해도 됨.
@RestController                 //return 값을 따로 지정할수 있다. 아래에 return "ok".
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); //slf4j logger

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("debug log={}", name);         //application.properties에 info 레벨로 설정 해놓으면 이 아래로만 출력된다.
        log.warn("debug log={}", name);
        log.error("debug log={}", name);

        return "ok";
    }
}