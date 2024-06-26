package by.haritonenko.rest.util.entity;

import by.haritonenko.rest.model.Note;
import by.harlap.rest.util.TestBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor(staticName = "note")
@With
public class NoteTestBuilder implements TestBuilder<Note> {

    private Long id = 1L;
    private Long storyId = 1L;
    private String content = "dhjksc";

    @Override
    public Note build() {
        Note note = new Note();

        note.setId(id);
        note.setContent(content);
        note.setStoryId(storyId);

        return note;
    }
}
