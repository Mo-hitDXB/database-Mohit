package com.mohitjoi.library.core.payload.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BorrowRequestDto {

    @NotNull
    private Long userId;

    @NotNull
    private String bookId;
}
