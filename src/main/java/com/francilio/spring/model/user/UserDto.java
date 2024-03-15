package com.francilio.spring.model.user;

public record UserDto(Long id, String name, char status, String email) {
}
