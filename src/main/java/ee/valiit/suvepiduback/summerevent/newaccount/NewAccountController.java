package ee.valiit.suvepiduback.summerevent.newaccount;

import ee.valiit.suvepiduback.domain.account.user.role.RolesDropdownInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class NewAccountController {
    private final NewAccountService newAccountService;
    @GetMapping("/roles")
    @Operation(summary = "Rollide valiku loomine. Tagastab roleId",
            description = "Süsteemist otsitakse roleId abil rollid")

    public List<RolesDropdownInfo> executeRolesDropdown() {
        return newAccountService.executeRolesDropdown();
    }

    
}
