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
        switch (code){
            case 1:
                return SINGLE;
            case 2:
                return DRY;
            case 3:
                return TRIPLE;
            case 4:
                return QUADRUPLE;
            default:
                throw new IllegalArgumentException("Parameter passed to method not recognized: " + code);
        }
    }

    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }
}
