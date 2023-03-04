package com.techacademy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }

    //指定日
    @GetMapping("disdayofweek")
    public String disDayOfWeek() {
        String now = LocalDateTime.now().format( DateTimeFormatter.ofPattern("yyyy:mm:dd") );

        return "現在時刻：" + now;
    }
    //足し算
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果:" + res;
    }
    //引き算
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果:" + res;
    }
    //掛け算
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果:" + res;
    }
    //割り算
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果:" + res;
    }

}
