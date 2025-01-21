package com.caveiga.api1banco.client;

import com.caveiga.api1banco.model.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "api2-cliente", url = "http://localhost:8081")
 public interface Api2Client {

    @PostMapping("/cliente")
    Cliente criarCliente(@RequestBody Cliente cliente);

    @GetMapping("/cliente")
    List<Cliente> listarCliente();

}
