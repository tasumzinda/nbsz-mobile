/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain.util;

import zw.org.nbsz.business.util.StringUtils;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public enum PassFail {
    
    PASS(1), FAIL(2);

    private final Integer code;

    PassFail(Integer code){
        this.code = code;
    }

    public static PassFail get(Integer code){
        switch (code){
            case 1:
                return PASS;
            case 2:
                return FAIL;
            default:
                throw new IllegalArgumentException("Parameter passed to method not recognized: " + code);
        }
    }

    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }
}
