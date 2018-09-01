/**
 * 
 */
package com.cognizant.bfs.tao.tfg.poc.domain;

import java.io.Serializable;

/**
 * @author Mahesh
 *
 */
public class LoanDefaulterResult implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private boolean           isDefaulter;

  public boolean isDefaulter() {
    return this.isDefaulter;
  }

  public void setDefaulter(final boolean isDefaulter) {
    this.isDefaulter = isDefaulter;
  }

}
