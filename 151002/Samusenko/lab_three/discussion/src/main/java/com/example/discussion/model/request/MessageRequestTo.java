package com.example.discussion.model.request;

import jakarta.validation.constraints.Size;
public record MessageRequestTo(
        Long id,
        Long issueId,
        @Size(min = 2, max = 2048)
        String content
) {
}
