package com.br.trello_api.infrastructure.persistence;

import com.br.trello_api.domain.model.Task;
import com.br.trello_api.domain.repository.TaskRespository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskJpaRepository extends JpaRepository<Task, Long>, TaskRespository {
}
