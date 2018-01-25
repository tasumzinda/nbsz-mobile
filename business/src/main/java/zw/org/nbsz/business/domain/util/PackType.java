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
public enum PackType {
    
    SINGLE(1), DRY(2), TRIPLE(3), QUADRUPLE(4);

    private final Integer code;

    PackType(Integer code){
        this.code = code;
    }

    public static PackType get(Integer code){
        for(PackType item : values()){
            if(item.code.equals(code)){
                return item;
            }
        }
        throw new IllegalArgumentException("Parameter provided to method is not recognized: " + code);
    }

    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }
}
