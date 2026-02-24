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
@Table(name = "Departments")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DeptCode")
    private String maPhong;

    @Column(name = "DeptName")
    private String tenPhong;

    @Column(name = "CreatedAt")
    private Date ngayThanhLap;

    @Column(name = "IsActive")
    private Boolean hoatDong;
}
