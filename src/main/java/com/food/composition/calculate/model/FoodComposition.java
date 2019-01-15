package com.food.composition.calculate.model;

import com.food.composition.calculate.base.BaseModel;

import java.util.Date;

/**
 * 食材成分实体类
 *
 * @author H.R.ZHAO
 */
public class FoodComposition extends BaseModel {

    private static final long serialVersionUID = 5083503223503959811L;

    /**
     * ID, 主键
     */
    private String id;

    /**
     * 食物名称
     */
    private String foodName;

    /**
     * 热量，卡路里 /kcal
     */
    private double calorific;
    /**
     * 重量 /g
     */

    private double weight;

    /**
     * 铜含量 /mg
     */
    private double cu;

    /**
     * 铁含量 /mg
     */
    private double fe;

    /**
     * 锌含量 /mg
     */
    private double zn;

    /**
     * 维生素A含量 /IU
     */
    private double va;

    /**
     * 维生素D含量 /IU
     */
    private double vd;

    /**
     * 维生素E含量 /mg
     */
    private double ve;

    /**
     * 维生素B1含量 /mg
     */
    private double vb1;

    /**
     * 维生素B9含量 /mg
     */
    private double vb9;

    /**
     * 维生素B12含量 /mg
     */
    private double vb12;

    /**
     * 胆碱含量 /mg
     */
    private double choline;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getCalorific() {
        return calorific;
    }

    public void setCalorific(double calorific) {
        this.calorific = calorific;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCu() {
        return cu;
    }

    public void setCu(double cu) {
        this.cu = cu;
    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }

    public double getZn() {
        return zn;
    }

    public void setZn(double zn) {
        this.zn = zn;
    }

    public double getVa() {
        return va;
    }

    public void setVa(double va) {
        this.va = va;
    }

    public double getVd() {
        return vd;
    }

    public void setVd(double vd) {
        this.vd = vd;
    }

    public double getVe() {
        return ve;
    }

    public void setVe(double ve) {
        this.ve = ve;
    }

    public double getVb1() {
        return vb1;
    }

    public void setVb1(double vb1) {
        this.vb1 = vb1;
    }

    public double getVb9() {
        return vb9;
    }

    public void setVb9(double vb9) {
        this.vb9 = vb9;
    }

    public double getVb12() {
        return vb12;
    }

    public void setVb12(double vb12) {
        this.vb12 = vb12;
    }

    public double getCholine() {
        return choline;
    }

    public void setCholine(double choline) {
        this.choline = choline;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
