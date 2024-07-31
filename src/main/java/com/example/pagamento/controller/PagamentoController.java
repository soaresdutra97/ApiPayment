package com.example.pagamento.controller;

import com.example.pagamento.business.PagamentoService;
import com.example.pagamento.controller.request.CartaoRequestDTO;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/pagamento")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    @PostMapping
    public ResponseEntity<Boolean> verificaPagamentoCartao(@RequestBody CartaoRequestDTO cartaoRequestDTO){
        return ResponseEntity.ok(pagamentoService.verificaPagamento(cartaoRequestDTO));
    }
}
