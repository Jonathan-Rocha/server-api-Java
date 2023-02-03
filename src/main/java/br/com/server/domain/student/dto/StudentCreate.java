package br.com.server.domain.student.dto;

import br.com.server.domain.format.ClassFormat;
import br.com.server.domain.instrument.Instrument;
import br.com.server.domain.user.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record StudentCreate(
        @NotBlank
        String name,
        @NotNull
        Instrument instrument,
        @NotNull
        ClassFormat classFormat,
        @NotNull
        User user
) {
}
