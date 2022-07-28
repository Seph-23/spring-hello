package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
  //뷰 템플릿을 호출하는 세가지 방법.
  @RequestMapping("/response-view-v1")
  public ModelAndView responseViewV1(){
    ModelAndView mav = new ModelAndView("response/hello")
              .addObject("data", "hello!");
    return mav;
  }

  @RequestMapping("/response-view-v2")
  public String responseViewV2(Model model){
    model.addAttribute("data", "hello!");
    return "response/hello";
  }

  //void를 사용하는 경우, @Controller를 사용하고 요청 URL을 참고해서 논리 뷰 이름으로 사용.
  @RequestMapping("/response/hello")
  public void responseViewV3(Model model){
    model.addAttribute("data", "hello!");
  }
}