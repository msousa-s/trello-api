package com.br.trello_api.interfaces.dto;

import com.br.trello_api.domain.model.Task;

public record TaskResponse(Long id, String title) {
    public static TaskResponse from(Task task) {
        return new TaskResponse(task.getId(), task.getTitle());
    }
}