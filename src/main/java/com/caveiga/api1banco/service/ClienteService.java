package com.caveiga.api1banco.service;

import com.caveiga.api1banco.client.Api2Client;
import com.caveiga.api1banco.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private Api2Client api2Client;

    public Cliente criarCliente(Cliente cliente){
        return api2Client.criarCliente(cliente);
    }

    public List<Cliente> listarClientes(){
        return api2Client.listarCliente();
    }

}
