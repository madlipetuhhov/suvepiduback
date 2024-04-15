package ee.valiit.suvepiduback.summerevent.newaccount;

import ee.valiit.suvepiduback.domain.account.user.User;
import ee.valiit.suvepiduback.domain.account.user.UserMapper;
import ee.valiit.suvepiduback.domain.account.user.UserRepository;
import ee.valiit.suvepiduback.domain.account.user.role.Role;
import ee.valiit.suvepiduback.domain.account.user.role.RoleMapper;
import ee.valiit.suvepiduback.domain.account.user.role.RoleRepository;
import ee.valiit.suvepiduback.summerevent.newaccount.dto.RolesDropdownInfo;
import ee.valiit.suvepiduback.summerevent.newaccount.dto.UserInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NewAccountService {
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    private final RoleMapper roleMapper;
    private final UserMapper userMapper;


    public List<RolesDropdownInfo> executeRolesDropdown() {
        List<Role> roles = roleRepository.findAll();
        return roleMapper.toRolesDropdownInfos(roles);
    }

    public void addNewUser(UserInfo userInfo) {
        User user = userMapper.toUser(userInfo);
        userRepository.save(user);
    }
}
