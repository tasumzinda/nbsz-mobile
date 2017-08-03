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
public enum Frequency {
    
    ALWAYS(1), SOMETIMES(2);

        private final Integer code;

        Frequency(Integer code){
            this.code = code;
        }

        public static Frequency get(Integer code){
            switch (code){
                case 1:
                    return ALWAYS;
                case 2:
                    return SOMETIMES;
                default:
                    throw new IllegalArgumentException("Parameter provided to method is not recognized: " + code);
            }
        }

        public String getName(){
            return StringUtils.toCamelCase3(super.name());
        }
}
