package jp.co.axa.apidemo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Table(name="EMPLOYEE")
public class Employee implements Serializable {


    @Id
    @Column(name="EMPLOYEE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter
    @Setter
	private Long id;

	@Getter
	@Setter
	@Column(name="EMPLOYEE_NAME")
	private String name;

	@Getter
    @Setter
    @Column(name="EMPLOYEE_SALARY")
    private Integer salary;

	@Getter
    @Setter
    @Column(name="DEPARTMENT")
    private String department;

}