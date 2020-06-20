package com.yajun.springcloud.controller;

import com.yajun.springcloud.entities.CommonResult;
import com.yajun.springcloud.entities.Payment;
import com.yajun.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult createPayment(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        log.info("插入成功[{}]", i);
        if (i > 0) {
            return new CommonResult(200, "插入成功");
        } else {
            return new CommonResult(444, "插入失败");
        }
    }
    @GetMapping("/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long  id) {
        Payment result= paymentService.getPaymentById(id);
        log.info("获取的结果[{}]", result);
        if (result != null) {
            return new CommonResult<>(200, "查询成功",result);
        } else {
            return new CommonResult<>(444, "失败");
        }
    }

}
