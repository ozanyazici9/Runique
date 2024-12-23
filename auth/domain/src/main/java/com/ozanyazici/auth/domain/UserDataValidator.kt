package com.ozanyazici.auth.domain

class UserDataValidator(
    private val patternValidator: PatternValidator
) {

    fun isValidEmail(email: String): Boolean {
        return patternValidator.matches(email.trim())
    }

    fun validatePassword(password: String): PasswordValidationState {
        val hasMinLenght = password.length >= MIN_PASSWORD_LENGTH
        val hasDigit = password.any{ it.isDigit() }
        val hasLowerCaseCharacter = password.any{ it.isDigit() }
        val hasUpperCaseCharacter = password.any{ it.isDigit() }

        return PasswordValidationState(
            hasMinLength = hasMinLenght,
            hasNumber = hasDigit,
            hasLowerCaseCharacter = hasLowerCaseCharacter,
            hasUpperCaseCharacter = hasUpperCaseCharacter
        )
    }

    companion object {
        const val MIN_PASSWORD_LENGTH = 9
    }
}