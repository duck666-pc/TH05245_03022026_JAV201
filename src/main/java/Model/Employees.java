package Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "EmpCode")
    private String maNhanVien;

    @Column(name = "FullName")
    private String ten;

    @Column(name = "Gender")
    private Boolean gioiTinh;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone")
    private String soDienThoai;

    @Column(name = "Salary")
    private Float luong;

    @Column(name = "Status")
    private Boolean trangThai;

    @ManyToOne
    @JoinColumn(name = "DepartmentId")
    private Departments idPhong;
}
