package ee.valiit.suvepiduback.domain.account.business;

import ee.valiit.suvepiduback.domain.account.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "business", schema = "suvepidu")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Size(max = 50)
    @NotNull
    @Column(name = "company_name", nullable = false, length = 50)
    private String companyName;

    @NotNull
    @Column(name = "phone", nullable = false)
    private Integer phone;

    @Size(max = 50)
    @NotNull
    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @NotNull
    @Column(name = "registry_code", nullable = false)
    private Integer registryCode;

    @Column(name = "vat_number")
    private Integer vatNumber;

    @NotNull
    @Column(name = "status", nullable = false, length = Integer.MAX_VALUE)
    private String status;

}