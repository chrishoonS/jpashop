package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Member {
    // 객체를 테이블에 맞추어 데이터 중심으로 모델링하면 협력 관계 X
    // 객체는 참조로 연관된 객체를 찾지만, 테이블은 외래키 조인으로 연관된 테이블 찾는다!!
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipCode;

    // 동적 객체 생성을 위한 기본 생성자
    public Member() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
