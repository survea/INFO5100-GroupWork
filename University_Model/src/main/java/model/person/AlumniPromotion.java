/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person;

import java.util.Date;

/**
 *
 * @author Hp
 */
public class AlumniPromotion {
    private Date promotionDate;
    private String promotionName;

    public AlumniPromotion() {
    }

    public Date getPromotionDate() {
        return promotionDate;
    }

    public void setPromotionDate(Date promotionDate) {
        this.promotionDate = promotionDate;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }
    
}
