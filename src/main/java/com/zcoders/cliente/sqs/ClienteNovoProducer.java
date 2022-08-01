package com.zcoders.cliente.sqs;

import com.zcoders.cliente.model.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ClienteNovoProducer {

    Logger logger = LoggerFactory.getLogger(ClienteNovoProducer.class);

    @Value("${cloud.aws.queue.name}")
    private String queue;

    @Autowired
    private QueueMessagingTemplate messagingTemplate;

    @Async
    public void send(Cliente cliente) {
        ClienteNovo clienteNovo = new ClienteNovo(
                cliente.getId(), cliente.getNome(), cliente.getEmail(),
                cliente.getNascimento(), cliente.getIncluidoEm(),
                cliente.getAtualizadoEm());


        messagingTemplate.convertAndSend(queue, clienteNovo);

        logger.info("Mensagem enviada : {}", clienteNovo.toString());
    }

}
