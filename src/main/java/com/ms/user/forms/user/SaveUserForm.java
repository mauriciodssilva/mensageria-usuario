package com.ms.user.forms.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Mauricio Silva
 */
public record SaveUserForm(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email) {

}
