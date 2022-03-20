package br.com.acme.payrollapi.resources;

import br.com.acme.payrollapi.domain.Payroll;
import br.com.acme.payrollapi.domain.User;
import br.com.acme.payrollapi.feignClients.UserFeign;
import br.com.acme.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollService payrollService;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(payrollService.getPayment(workerId, payment));
    }





}
