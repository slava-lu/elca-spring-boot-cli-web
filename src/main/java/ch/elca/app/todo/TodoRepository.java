package ch.elca.app.todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "todos", path = "todo")
public interface TodoRepository extends CrudRepository<Todo, Long> {}

