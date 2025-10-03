package com.br.trello_api.domain.repository;
import com.br.trello_api.domain.model.Task;
import java.util.Optional;
import java.util.List;

public interface TaskRespository {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    void deleteById(Long id);
}
