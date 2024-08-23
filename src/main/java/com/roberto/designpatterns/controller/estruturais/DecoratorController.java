package com.roberto.designpatterns.controller.estruturais;

import com.roberto.designpatterns.estruturais.decorator.BordaRequeijao;
import com.roberto.designpatterns.estruturais.decorator.MassaIntegral;
import com.roberto.designpatterns.estruturais.decorator.PizzaCalabresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estruturais/decorator")
public class DecoratorController {

    @GetMapping("test")
    public void test() {

        PizzaCalabresa pizzaCalabresa = new PizzaCalabresa();

        System.out.println("Descrição: " + pizzaCalabresa.getDescricao());
        System.out.println("Preço: R$ " + pizzaCalabresa.getPreco());

        BordaRequeijao pizzaCalabresaBordaRequeijao = new BordaRequeijao(pizzaCalabresa);

        System.out.println(" ");
        System.out.println("Descrição: " + pizzaCalabresaBordaRequeijao.getDescricao());
        System.out.println("Preço: R$ " + pizzaCalabresaBordaRequeijao.getPreco());

        MassaIntegral pizzaCalabresaBordaRequeijaoMassaIntegral = new MassaIntegral(pizzaCalabresaBordaRequeijao);

        System.out.println(" ");
        System.out.println("Descrição: " + pizzaCalabresaBordaRequeijaoMassaIntegral.getDescricao());
        System.out.println("Preço: R$ " + pizzaCalabresaBordaRequeijaoMassaIntegral.getPreco());

        MassaIntegral pizzaCalabresaMassaIntegral = new MassaIntegral(pizzaCalabresa);

        System.out.println(" ");
        System.out.println("Descrição: " + pizzaCalabresaMassaIntegral.getDescricao());
        System.out.println("Preço: R$ " + pizzaCalabresaMassaIntegral.getPreco());
    }

}
