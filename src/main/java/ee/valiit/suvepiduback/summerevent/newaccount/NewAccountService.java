package ee.valiit.suvepiduback.summerevent.newaccount;

import ee.valiit.suvepiduback.domain.account.user.role.Role;
import ee.valiit.suvepiduback.domain.account.user.role.RoleMapper;
import ee.valiit.suvepiduback.domain.account.user.role.RoleRepository;
import ee.valiit.suvepiduback.domain.account.user.role.RolesDropdownResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewAccountService {
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RolesDropdownResponse executeRolesDropdown(Integer roleId) {
        Role role = roleRepository.getReferenceById(roleId);
        return roleMapper.toRolesDropdownResponse(role);

    }
}
