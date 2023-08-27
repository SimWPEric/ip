package duke.task;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeadlineTest {
    @Test
    public void createNewDeadline() {
        Deadline task = new Deadline("CS2103T ip", LocalDate.parse("2023-08-12"));
        assertEquals(task.toString(), "[D][ ] CS2103T ip (by: Aug 12 2023)");
    }

    @Test
    public void markDoneDeadline() {
        Deadline task = new Deadline("CS2103T ip", LocalDate.parse("2023-08-12"));
        task.markAsDone();
        assertEquals(task.toString(), "[D][X] CS2103T ip (by: Aug 12 2023)");
    }

    @Test
    public void markUndoneDeadline() {
        Deadline task = new Deadline("CS2103T ip", LocalDate.parse("2023-08-12"));
        task.markAsDone();
        task.markAsUndone();
        assertEquals(task.toString(), "[D][ ] CS2103T ip (by: Aug 12 2023)");
    }
}
