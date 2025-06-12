package com.mlucov.business.user.models;

import java.util.List;

public record UserDetailsOutput(
   Long id,
   String username,
   String password,
   boolean enabled,
   List<RoleOutput> roles
) {
}
