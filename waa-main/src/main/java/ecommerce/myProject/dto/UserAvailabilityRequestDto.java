package ecommerce.myProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAvailabilityRequestDto {

    private String username;
    private boolean isAvailable;
}
