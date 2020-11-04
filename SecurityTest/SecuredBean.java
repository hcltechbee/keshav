/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MyCompany.ejb.bean;

import com.MyCompany.ejb.remote.SecuredBeanRemote;
import javax.annotation.security.PermitAll;
//import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;


/**
 *
 * @author hppc--
 */
@Stateless
public class SecuredBean implements SecuredBeanRemote{

    @Override
    @PermitAll
    
    public void doSecureTask() {
        System.out.print("starting do secure task");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
