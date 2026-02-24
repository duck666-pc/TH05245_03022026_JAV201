package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeId")
    private Integer id;

    @Column(name = "EmpCode")
    private String maNhanVien;

    @Column(name = "FullName")
    private String ten;

    @Column(name = "Gender")
    private String gioiTinh;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone")
    private String soDienThoai;

    @Column(name = "Salary")
    private Double luong;

    @Column(name = "Status")
    private String trangThai;
    @ManyToOne
    @JoinColumn(name = "DepartmentId")
    private Departments idPhong;
}