package com.github.ludwig_dan.cursos.arquitetura_spring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
    public void enviar(String mensagem){
        System.out.println("Email enviado:");
        System.out.println(mensagem);
    }
}
