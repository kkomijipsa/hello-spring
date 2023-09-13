package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
  @GetMapping("hello")
  public String hello(Model model) {
    // "data"라는 이름으로 "hello!!"라는 문자열을 모델에 추가
    model.addAttribute("data", "hello!!");
    return "hello"; // "hello"라는 뷰(template)를 반환합니다.
  }

  @GetMapping("hello-mvc")
  public String helloMvc(@RequestParam(value = "name", required = true) String name, Model model) {
    // "name"이라는 이름으로 요청 파라미터로 받은 "name" 값을 모델에 추가
    model.addAttribute("name", name);
    // "hello-template"라는 뷰(template)를 반환합니다.
    return "hello-template";
  }
}