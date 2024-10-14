/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Student
 */
@Entity
public class ClassList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long studentNum;
    private String name;
    private String surname;
    @Lob
    private byte[] stu_photo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date  timestampreal;

    public Date getTime() {
        return  timestampreal;
    }

    public void setTime(Date time) {
        this.timestampreal = time;
    }

    public ClassList() {
    } 
    public Long getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Long studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte[] getStu_photo() {
        return stu_photo;
    }

    public void setStu_photo(byte[] stu_photo) {
        this.stu_photo = stu_photo;
    }
    
    

    public Long getId() {
        return studentNum;
    }

    public void setId(Long studentNum) {
        this.studentNum= studentNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentNum != null ? studentNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClassList)) {
            return false;
        }
        ClassList other = (ClassList) object;
        if((this.studentNum == null && other.studentNum != null) || (this.studentNum != null && !this.studentNum.equals(other.studentNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.models.ClassList[ id=" + studentNum + " ]";
    }
    
}
