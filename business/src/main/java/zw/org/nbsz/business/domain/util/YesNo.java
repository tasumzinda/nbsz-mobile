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
public enum YesNo {
    
    YES(1), NO(2);

    private final Integer code;

    private YesNo(Integer code) {
        this.code = code;
    }

    public static YesNo get(Integer code) {
        for(YesNo item : values()){
            if(item.code.equals(code)){
                return item;
            }
        }
        throw new IllegalArgumentException("Parameter provided to method is not recognized: " + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return StringUtils.toCamelCase3(super.name());
    }

    @Override
    public String toString() {
        return getName();
    }
    
}
