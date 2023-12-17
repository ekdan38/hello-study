package hello.hellostudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello") //HTTP GET요청. /hello경로로 들어오는 GET요청.
    public String hello(Model model){ //"hello" 엔드포인트로 들어오는 GET요청처리 메소드. "Model"객체를 파라미터로 받는다.
        model.addAttribute("data", "hello!"); //"data" 속성에 "hello" 추가.
        return "hello"; // "hello"라는 뷰를 찾아 "data" , "hx ello!" 뷰로 전달.   
    }
    @GetMapping("hello-mvc") //HTTP GET요청. "hello-mvc"로 들어오는 GET요청.
    public String helloMvc(@RequestParam(value = "name") String name, Model model){
        //@RequestParam(value = "name") String name => "name"의 파라미터를 추출하고 String name에 값 저장.
        model.addAttribute("name" ,name); //"name" 속성에 name저장
        return "hello-template"; // hello-template 라는 뷰를 찾아 "name"에 name 저장.
        //확인하려면 localhost:8080/hello-mvc?name=spring (name에 spring 저장)
    }





    //API 시작부분
    @GetMapping("hello-string")
    @ResponseBody // http 바디부에다가 return "hello" + name; 을 직접 넣어주겠다.
    public String helloString(@RequestParam("name")String name){
        return "hello " + name;
    }

    @GetMapping("hello-api") // api , json형태로 반환된다.
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
     //API 끝

}
