package hello.hellostudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class practiceController {
    @GetMapping("practice")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name, @RequestParam("age") int age){
        Hello hello = new Hello();
        hello.setAge(age);
        hello.setName(name);
        return hello;
    }


    static class Hello{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
