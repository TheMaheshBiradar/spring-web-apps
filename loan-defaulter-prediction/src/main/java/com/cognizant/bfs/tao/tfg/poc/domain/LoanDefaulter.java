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
  private String            age;
  private String            debtAmount;
  private String            married;
  private String            bankCustomer;
  private String            educateLevel;
  private String            enthinicity;
  private String            yearsEmployed;
  private String            priorDefault;
  private String            employed;
  private String            creditScore;
  private String            citizen;
  private String            zipcode;
  private String            income;

  public String getGender() {
    return this.gender;
  }

  public void setGender(final String gender) {
    this.gender = gender;
  }

  public String getAge() {
    return this.age;
  }

  public void setAge(final String age) {
    this.age = age;
  }

  public String getDebtAmount() {
    return this.debtAmount;
  }

  public void setDebtAmount(final String debtAmount) {
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

  public String getEducateLevel() {
    return this.educateLevel;
  }

  public void setEducateLevel(final String educateLevel) {
    this.educateLevel = educateLevel;
  }

  public String getEnthinicity() {
    return this.enthinicity;
  }

  public void setEnthinicity(final String enthinicity) {
    this.enthinicity = enthinicity;
  }

  public String getYearsEmployed() {
    return this.yearsEmployed;
  }

  public void setYearsEmployed(final String yearsEmployed) {
    this.yearsEmployed = yearsEmployed;
  }

  public String getPriorDefault() {
    return this.priorDefault;
  }

  public void setPriorDefault(final String priorDefault) {
    this.priorDefault = priorDefault;
  }

  public String getEmployed() {
    return this.employed;
  }

  public void setEmployed(final String employed) {
    this.employed = employed;
  }

  public String getCreditScore() {
    return this.creditScore;
  }

  public void setCreditScore(final String creditScore) {
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

  public String getIncome() {
    return this.income;
  }

  public void setIncome(final String income) {
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
