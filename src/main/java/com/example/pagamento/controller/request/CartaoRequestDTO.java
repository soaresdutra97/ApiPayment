package com.example.pagamento.controller.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CartaoRequestDTO {

    private String nome;
    private String numeroCartao;
    private String mes;
    private String ano;
    private String ccv;
    private BigDecimal valor;
    private EnderecoRequestDTO enderecoRequestDTO;

}
