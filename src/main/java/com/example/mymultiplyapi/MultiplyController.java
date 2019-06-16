package com.example.mymultiplyapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplyController {

    @PostMapping("/multiply")
    public Integer calculate(@RequestBody Multiplication multiplication) {
        return multiplication.getNumber1()*multiplication.getNumber2();
    }
}

class Multiplication {
    private Integer number1;
    private Integer number2;

    public Multiplication() {
    }

    public Multiplication(final Integer number1, final Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    Integer getNumber1() {
        return number1;
    }

    Integer getNumber2() {
        return number2;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }
}