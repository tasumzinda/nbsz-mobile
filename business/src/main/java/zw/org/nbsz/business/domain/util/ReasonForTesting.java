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
public enum ReasonForTesting {
    
    VOLUNTARY(1), EMPLOYMENT(2), INSURANCE(3), MEDICAL_ADVICE(4), OTHER(5);

    private final Integer code;

    ReasonForTesting(Integer code){
        this.code = code;
    }

    public static ReasonForTesting get(Integer code){
        for(ReasonForTesting item : values()){
            if(item.equals(item)){
                return item;
            }
        }
        throw new IllegalArgumentException("Parameter provided to method is not recognized: " + code);
    }

    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }
}
