package com.yajun.springcloud.controller;

import com.yajun.springcloud.entities.CommonResult;
import com.yajun.springcloud.entities.Payment;
import com.yajun.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
/**
 *
 * 功能描述: 订单模块，发起支付请求
 *          支付之后，生成支付订单
 *
 * @param:
 * @return:
 * @auther: zyj
 * @date: 2020/6/20 16:53
 */
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
            return new CommonResult(200, "插入成功",null);
        } else {
            return new CommonResult(444, "插入失败",null);
        }
    }
    @GetMapping("/get/{id}")
    public CommonResult get(@PathVariable("id") Long  id) {
        Payment result= paymentService.getPaymentById(id);
        log.info("获取的结果[{}]", result);
        if (result != null) {
            return new CommonResult(200, "查询成功",result);
        } else {
            return new CommonResult(444, "失败",null);
        }
    }

}
