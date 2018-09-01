/**
 * 
 */
package com.cognizant.bfs.tao.tfg.poc.domain;

import java.io.Serializable;

/**
 * @author Mahesh
 *
 */
public class LoanDefaulter implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private String            gender;
  private Float             age;
  private Float             debtAmount;
  private String            married;
  private String            bankCustomer;
  private Integer           educateLevel;
  private String            enthinicity;
  private Float             yearsEmployed;
  private Integer           priorDefault;
  private String            employed;
  private Integer           creditScore;
  private String            citizen;
  private String            zipcode;
  private Integer           income;

  public String getGender() {
    return this.gender;
  }

  public void setGender(final String gender) {
    this.gender = gender;
  }

  public Float getAge() {
    return this.age;
  }

  public void setAge(final Float age) {
    this.age = age;
  }

  public Float getDebtAmount() {
    return this.debtAmount;
  }

  public void setDebtAmount(final Float debtAmount) {
    this.debtAmount = debtAmount;
  }

  public String getMarried() {
    return this.married;
  }

  public void setMarried(final String married) {
    this.married = married;
  }

  public String getBankCustomer() {
    return this.bankCustomer;
  }

  public void setBankCustomer(final String bankCustomer) {
    this.bankCustomer = bankCustomer;
  }

  public Integer getEducateLevel() {
    return this.educateLevel;
  }

  public void setEducateLevel(final Integer educateLevel) {
    this.educateLevel = educateLevel;
  }

  public String getEnthinicity() {
    return this.enthinicity;
  }

  public void setEnthinicity(final String enthinicity) {
    this.enthinicity = enthinicity;
  }

  public Float getYearsEmployed() {
    return this.yearsEmployed;
  }

  public void setYearsEmployed(final Float yearsEmployed) {
    this.yearsEmployed = yearsEmployed;
  }

  public Integer getPriorDefault() {
    return this.priorDefault;
  }

  public void setPriorDefault(final Integer priorDefault) {
    this.priorDefault = priorDefault;
  }

  public String getEmployed() {
    return this.employed;
  }

  public void setEmployed(final String employed) {
    this.employed = employed;
  }

  public Integer getCreditScore() {
    return this.creditScore;
  }

  public void setCreditScore(final Integer creditScore) {
    this.creditScore = creditScore;
  }

  public String getCitizen() {
    return this.citizen;
  }

  public void setCitizen(final String citizen) {
    this.citizen = citizen;
  }

  public String getZipcode() {
    return this.zipcode;
  }

  public void setZipcode(final String zipcode) {
    this.zipcode = zipcode;
  }

  public Integer getIncome() {
    return this.income;
  }

  public void setIncome(final Integer income) {
    this.income = income;
  }

  @Override
  public String toString() {
    return "LoanDefaulter [gender=" + this.gender + ", age=" + this.age + ", debtAmount="
        + this.debtAmount + ", married=" + this.married + ", bankCustomer=" + this.bankCustomer
        + ", educateLevel=" + this.educateLevel + ", enthinicity=" + this.enthinicity
        + ", yearsEmployed=" + this.yearsEmployed + ", priorDefault=" + this.priorDefault
        + ", employed=" + this.employed + ", creditScore=" + this.creditScore + ", citizen="
        + this.citizen + ", zipcode=" + this.zipcode + ", income=" + this.income + "]";
  }

}
