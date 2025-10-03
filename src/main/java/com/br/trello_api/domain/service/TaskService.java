package com.br.trello_api.domain.service;

import com.br.trello_api.domain.model.Task;
import com.br.trello_api.domain.repository.TaskRespository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRespository taskRespository;

    public Task criar(Task task){
        return taskRespository.save(task);
    }

    public void deletar(Long id){
        taskRespository.deleteById(id);
    }

    public Optional<Task> buscarPorId(Long id){
        return taskRespository.findById(id);
    }

    public List<Task> listar(){
        return taskRespository.findAll();
    }
}
