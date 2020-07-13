package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * 功能描述: 
 *
 * @param: 
 * @return: 
 * @auther: zyj
 * @date: 2020/7/12 17:11
 */
@RestController
public class PaymentController {
    
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentzk() {
        return serverPort;
    }
}
