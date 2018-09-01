package com.cognizant.bfs.tao.tfg.poc.web.v1;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.bfs.tao.tfg.poc.domain.LoanDefaulter;
import com.cognizant.bfs.tao.tfg.poc.domain.LoanDefaulterResult;

@RestController
public class LoanDefaulterController implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @RequestMapping(value = "/loan-defaulter-check", method = RequestMethod.POST)
  public ResponseEntity<LoanDefaulterResult> processLoanDefaulter(
      @RequestBody final LoanDefaulter loanDefaulter) {
    System.out.println("processLoanDefaulter processing " + loanDefaulter);

    final LoanDefaulterResult defaulterResult = new LoanDefaulterResult();
    defaulterResult.setDefaulter(true);

    return new ResponseEntity<LoanDefaulterResult>(defaulterResult, HttpStatus.OK);
  }

}
