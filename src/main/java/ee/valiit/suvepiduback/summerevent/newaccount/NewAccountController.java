package ee.valiit.suvepiduback.summerevent.newaccount;

import ee.valiit.suvepiduback.domain.account.user.role.RolesDropdownResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class NewAccountController {
    private final NewAccountService newAccountService;
    @GetMapping("/roles")
    
    public RolesDropdownResponse executeRolesDropdown(Integer roleId) {
        return newAccountService.executeRolesDropdown(roleId);
    }
    
}
