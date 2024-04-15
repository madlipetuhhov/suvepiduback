package ee.valiit.suvepiduback.domain.account.user.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Role}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolesDropdownInfo implements Serializable {
    private Integer roleId;
    private String roleName;
}