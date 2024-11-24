package ch.elca.boot_cli_web.Todo;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoInitializer {

    private final  TodoRepository todoRepository;

    @PostConstruct
    public void initData() {
        Todo todo1 = Todo.builder()
                .title("todo 1")
                .description("description 1")
                .completed(true)
                .build();

        Todo todo2 = Todo.builder()
                .title("todo 2")
                .description("description 2")
                .completed(false)
                .build();

        todoRepository.save(todo1);
        todoRepository.save(todo2);
    }
}
