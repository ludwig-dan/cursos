package com.github.ludwig_dan.cursos.arquitetura_spring;

import com.github.ludwig_dan.cursos.arquitetura_spring.todos.TodoEntity;
import com.github.ludwig_dan.cursos.arquitetura_spring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// escopo padrão: singleton (uma instância única do objeto vai atender toda a aplicação
// todo usuário que utilizar a aplicação vai utilizar a mesma instância
//@Scope("request") // uma instância para cada requisição, o ciclo de vida nasce e morre com a requisição
//@Scope("application") // parecido com o singleton, mas está ligado ao ciclo de vida da aplicação web
@Scope("session") // guarda estado enquanto a sessão está ativa
@Component
@Lazy // default true, faz com que o bean só seja instânciado quando for utilizado
// use @Lazy(false) quando alguma configuração global deixou todos os Beans como lazy
// mas um bean específico deve ser criado no startup
public class BeanGerenciado {
    // injeção por construtor (recomendada)
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    // injeção por propriedade
    @Autowired
    private TodoValidator validator;

    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    // injeção por setter
    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }
}
