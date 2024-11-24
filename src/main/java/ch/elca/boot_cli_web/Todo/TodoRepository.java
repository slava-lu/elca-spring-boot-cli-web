package ch.elca.boot_cli_web.Todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "todos", path = "todo")
public interface TodoRepository extends CrudRepository<Todo, Long> {}

