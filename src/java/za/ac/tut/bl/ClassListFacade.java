/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.models.ClassList;

/**
 *
 * @author Student
 */
@Stateless
public class ClassListFacade extends AbstractFacade<ClassList> implements ClassListFacadeLocal {

    @PersistenceContext(unitName = "ClassListEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClassListFacade() {
        super(ClassList.class);
    }
    
}
