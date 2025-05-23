package dio.lab_padroes_projeto_spring.service.impl;

import dio.lab_padroes_projeto_spring.model.Cliente;
import dio.lab_padroes_projeto_spring.model.Endereco;
import dio.lab_padroes_projeto_spring.repository.ClienteRepository;
import dio.lab_padroes_projeto_spring.repository.EnderecoRepository;
import dio.lab_padroes_projeto_spring.service.ClienteService;
import dio.lab_padroes_projeto_spring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente){
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente){
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if(clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
            Endereco novoEndeco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndeco);
            return novoEndeco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }



}
