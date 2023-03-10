package com.techacademy;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.DayOfWeek;

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
    @GetMapping("/dayofweek/{val1}")
    public String disDayOfWeek(@PathVariable String val1) {
        String year = val1.substring(0,4);
        String month = val1.substring(4,6);
        String day = val1.substring(6,8);

        int yyyy = Integer.parseInt(year);
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);

        LocalDateTime ldt = LocalDateTime.of( yyyy , mm , dd , 0, 0);
        DayOfWeek week = ldt.getDayOfWeek();
        String dn = week.getDisplayName(TextStyle.FULL, Locale.US);
        return "曜日：" + dn;
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
