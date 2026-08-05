package com.github.ludwig_dan.cursos.arquitetura_spring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    public TodoRepository repository;
    public TodoValidator validator;
    public MailSender mailSender;

    // injeção de dependência por construtor
    public TodoService(TodoRepository repository, TodoValidator validator, MailSender mailSender) {
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
        String status = todo.getConcluida() == Boolean.TRUE ? "Concluída": "Pendente";
        mailSender.enviar("Todo "+todo.getDescricao()+" atualizado para "+status);
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
