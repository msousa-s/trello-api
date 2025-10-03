package com.br.trello_api.interfaces.controller;

import com.br.trello_api.application.TaskUseCase;
import com.br.trello_api.domain.model.Task;
import com.br.trello_api.interfaces.dto.TaskRequest;
import com.br.trello_api.interfaces.dto.TaskResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/tasks")
public class TaskController {

    private final TaskUseCase taskUseCase;

    @PostMapping
    public ResponseEntity<TaskResponse> criar(@RequestBody TaskRequest dto) {
        Task task = taskUseCase.criarNovaTarefa(dto);
        return ResponseEntity.ok(TaskResponse.from(task));
    }
}

