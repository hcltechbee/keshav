
package com.MyCompany.ejb.remote;

import javax.ejb.Remote;


@Remote
public interface SecuredBeanRemote {

    void doSecureTask();
    
}
