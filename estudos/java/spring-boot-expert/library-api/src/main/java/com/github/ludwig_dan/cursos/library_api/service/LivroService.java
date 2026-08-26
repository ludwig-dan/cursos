package com.github.ludwig_dan.cursos.library_api.service;

import com.github.ludwig_dan.cursos.library_api.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LivroService {
    private final LivroRepository repository;
}
