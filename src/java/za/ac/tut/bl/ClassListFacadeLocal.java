/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.models.ClassList;

/**
 *
 * @author Student
 */
@Local
public interface ClassListFacadeLocal {

    void create(ClassList classList);

    void edit(ClassList classList);

    void remove(ClassList classList);

    ClassList find(Object id);

    List<ClassList> findAll();

    List<ClassList> findRange(int[] range);

    int count();
    
}
