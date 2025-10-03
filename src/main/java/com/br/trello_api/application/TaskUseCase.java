package com.br.trello_api.application;

import com.br.trello_api.domain.model.Task;
import com.br.trello_api.domain.service.TaskService;
import com.br.trello_api.interfaces.dto.TaskRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TaskUseCase {

    @Autowired
    private final TaskService taskService;

    public Task criarNovaTarefa(TaskRequest dto) {
        Task task = new Task(dto.title(), dto.description());
        return taskService.criar(task);
    }
}


