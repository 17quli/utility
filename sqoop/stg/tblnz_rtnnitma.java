// ORM class for table 'tblnz_rtnnitma'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:41:50 NZDT 2020
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class tblnz_rtnnitma extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurGrossInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurGrossInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurDividendGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMaoriDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurMaoriDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetRentalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurNetRentalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetTradingIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurNetTradingIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTotalAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAfterAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurIncomeAfterAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalDonations", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTotalDonations = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAfterDonations", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurIncomeAfterDonations = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossesBroughtForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurLossesBroughtForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTotalTaxPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurOverseasTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfterOverseas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTaxAfterOverseas = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurDividendImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfterDividend", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTaxAfterDividend = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRLWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurRLWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfterRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTaxAfterRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMaoriCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurMaoriCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResidualIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurResidualIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionalTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurProvisionalTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTaxAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverpaymentProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurOverpaymentProvisional = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefundAfterOverpayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurRefundAfterOverpayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTransferProvisional = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferCustomerAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTransferCustomerAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurTotalRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmProvisionalStartDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fdtmProvisionalStartDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrProvisionalOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fstrProvisionalOption = (String)value;
      }
    });
    setters.put("fcurProvisionalTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurProvisionalTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnCFC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fblnCFC = (Integer)value;
      }
    });
    setters.put("fcurLossToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurLossToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurExcessImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputationAsLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurExcessImputationAsLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrResMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fstrResMethod = (String)value;
      }
    });
    setters.put("fcurResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurResDeductionsClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsPriorYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurResDeductionsPriorYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurResDeductionsForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurResNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardCurrentYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurRDICarryForwardCurrentYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardRemaining", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurRDICarryForwardRemaining = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPropertyProfitLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fcurPropertyProfitLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitma.this.fstrWho = (String)value;
      }
    });
  }
  public tblnz_rtnnitma() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnnitma with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurGrossInterest;
  public java.math.BigDecimal get_fcurGrossInterest() {
    return fcurGrossInterest;
  }
  public void set_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
    this.fcurGrossInterest = fcurGrossInterest;
  }
  public tblnz_rtnnitma with_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
    this.fcurGrossInterest = fcurGrossInterest;
    return this;
  }
  private java.math.BigDecimal fcurDividendGross;
  public java.math.BigDecimal get_fcurDividendGross() {
    return fcurDividendGross;
  }
  public void set_fcurDividendGross(java.math.BigDecimal fcurDividendGross) {
    this.fcurDividendGross = fcurDividendGross;
  }
  public tblnz_rtnnitma with_fcurDividendGross(java.math.BigDecimal fcurDividendGross) {
    this.fcurDividendGross = fcurDividendGross;
    return this;
  }
  private java.math.BigDecimal fcurMaoriDistributions;
  public java.math.BigDecimal get_fcurMaoriDistributions() {
    return fcurMaoriDistributions;
  }
  public void set_fcurMaoriDistributions(java.math.BigDecimal fcurMaoriDistributions) {
    this.fcurMaoriDistributions = fcurMaoriDistributions;
  }
  public tblnz_rtnnitma with_fcurMaoriDistributions(java.math.BigDecimal fcurMaoriDistributions) {
    this.fcurMaoriDistributions = fcurMaoriDistributions;
    return this;
  }
  private java.math.BigDecimal fcurNetRentalIncome;
  public java.math.BigDecimal get_fcurNetRentalIncome() {
    return fcurNetRentalIncome;
  }
  public void set_fcurNetRentalIncome(java.math.BigDecimal fcurNetRentalIncome) {
    this.fcurNetRentalIncome = fcurNetRentalIncome;
  }
  public tblnz_rtnnitma with_fcurNetRentalIncome(java.math.BigDecimal fcurNetRentalIncome) {
    this.fcurNetRentalIncome = fcurNetRentalIncome;
    return this;
  }
  private java.math.BigDecimal fcurNetTradingIncome;
  public java.math.BigDecimal get_fcurNetTradingIncome() {
    return fcurNetTradingIncome;
  }
  public void set_fcurNetTradingIncome(java.math.BigDecimal fcurNetTradingIncome) {
    this.fcurNetTradingIncome = fcurNetTradingIncome;
  }
  public tblnz_rtnnitma with_fcurNetTradingIncome(java.math.BigDecimal fcurNetTradingIncome) {
    this.fcurNetTradingIncome = fcurNetTradingIncome;
    return this;
  }
  private java.math.BigDecimal fcurOtherIncome;
  public java.math.BigDecimal get_fcurOtherIncome() {
    return fcurOtherIncome;
  }
  public void set_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
  }
  public tblnz_rtnnitma with_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncome;
  public java.math.BigDecimal get_fcurTotalIncome() {
    return fcurTotalIncome;
  }
  public void set_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
  }
  public tblnz_rtnnitma with_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalAdjustments;
  public java.math.BigDecimal get_fcurTotalAdjustments() {
    return fcurTotalAdjustments;
  }
  public void set_fcurTotalAdjustments(java.math.BigDecimal fcurTotalAdjustments) {
    this.fcurTotalAdjustments = fcurTotalAdjustments;
  }
  public tblnz_rtnnitma with_fcurTotalAdjustments(java.math.BigDecimal fcurTotalAdjustments) {
    this.fcurTotalAdjustments = fcurTotalAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAfterAdjustments;
  public java.math.BigDecimal get_fcurIncomeAfterAdjustments() {
    return fcurIncomeAfterAdjustments;
  }
  public void set_fcurIncomeAfterAdjustments(java.math.BigDecimal fcurIncomeAfterAdjustments) {
    this.fcurIncomeAfterAdjustments = fcurIncomeAfterAdjustments;
  }
  public tblnz_rtnnitma with_fcurIncomeAfterAdjustments(java.math.BigDecimal fcurIncomeAfterAdjustments) {
    this.fcurIncomeAfterAdjustments = fcurIncomeAfterAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurTotalDonations;
  public java.math.BigDecimal get_fcurTotalDonations() {
    return fcurTotalDonations;
  }
  public void set_fcurTotalDonations(java.math.BigDecimal fcurTotalDonations) {
    this.fcurTotalDonations = fcurTotalDonations;
  }
  public tblnz_rtnnitma with_fcurTotalDonations(java.math.BigDecimal fcurTotalDonations) {
    this.fcurTotalDonations = fcurTotalDonations;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAfterDonations;
  public java.math.BigDecimal get_fcurIncomeAfterDonations() {
    return fcurIncomeAfterDonations;
  }
  public void set_fcurIncomeAfterDonations(java.math.BigDecimal fcurIncomeAfterDonations) {
    this.fcurIncomeAfterDonations = fcurIncomeAfterDonations;
  }
  public tblnz_rtnnitma with_fcurIncomeAfterDonations(java.math.BigDecimal fcurIncomeAfterDonations) {
    this.fcurIncomeAfterDonations = fcurIncomeAfterDonations;
    return this;
  }
  private java.math.BigDecimal fcurLossesBroughtForward;
  public java.math.BigDecimal get_fcurLossesBroughtForward() {
    return fcurLossesBroughtForward;
  }
  public void set_fcurLossesBroughtForward(java.math.BigDecimal fcurLossesBroughtForward) {
    this.fcurLossesBroughtForward = fcurLossesBroughtForward;
  }
  public tblnz_rtnnitma with_fcurLossesBroughtForward(java.math.BigDecimal fcurLossesBroughtForward) {
    this.fcurLossesBroughtForward = fcurLossesBroughtForward;
    return this;
  }
  private java.math.BigDecimal fcurTaxableIncome;
  public java.math.BigDecimal get_fcurTaxableIncome() {
    return fcurTaxableIncome;
  }
  public void set_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
  }
  public tblnz_rtnnitma with_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxPayable;
  public java.math.BigDecimal get_fcurTotalTaxPayable() {
    return fcurTotalTaxPayable;
  }
  public void set_fcurTotalTaxPayable(java.math.BigDecimal fcurTotalTaxPayable) {
    this.fcurTotalTaxPayable = fcurTotalTaxPayable;
  }
  public tblnz_rtnnitma with_fcurTotalTaxPayable(java.math.BigDecimal fcurTotalTaxPayable) {
    this.fcurTotalTaxPayable = fcurTotalTaxPayable;
    return this;
  }
  private java.math.BigDecimal fcurOverseasTax;
  public java.math.BigDecimal get_fcurOverseasTax() {
    return fcurOverseasTax;
  }
  public void set_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
    this.fcurOverseasTax = fcurOverseasTax;
  }
  public tblnz_rtnnitma with_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
    this.fcurOverseasTax = fcurOverseasTax;
    return this;
  }
  private java.math.BigDecimal fcurTaxAfterOverseas;
  public java.math.BigDecimal get_fcurTaxAfterOverseas() {
    return fcurTaxAfterOverseas;
  }
  public void set_fcurTaxAfterOverseas(java.math.BigDecimal fcurTaxAfterOverseas) {
    this.fcurTaxAfterOverseas = fcurTaxAfterOverseas;
  }
  public tblnz_rtnnitma with_fcurTaxAfterOverseas(java.math.BigDecimal fcurTaxAfterOverseas) {
    this.fcurTaxAfterOverseas = fcurTaxAfterOverseas;
    return this;
  }
  private java.math.BigDecimal fcurDividendImputation;
  public java.math.BigDecimal get_fcurDividendImputation() {
    return fcurDividendImputation;
  }
  public void set_fcurDividendImputation(java.math.BigDecimal fcurDividendImputation) {
    this.fcurDividendImputation = fcurDividendImputation;
  }
  public tblnz_rtnnitma with_fcurDividendImputation(java.math.BigDecimal fcurDividendImputation) {
    this.fcurDividendImputation = fcurDividendImputation;
    return this;
  }
  private java.math.BigDecimal fcurTaxAfterDividend;
  public java.math.BigDecimal get_fcurTaxAfterDividend() {
    return fcurTaxAfterDividend;
  }
  public void set_fcurTaxAfterDividend(java.math.BigDecimal fcurTaxAfterDividend) {
    this.fcurTaxAfterDividend = fcurTaxAfterDividend;
  }
  public tblnz_rtnnitma with_fcurTaxAfterDividend(java.math.BigDecimal fcurTaxAfterDividend) {
    this.fcurTaxAfterDividend = fcurTaxAfterDividend;
    return this;
  }
  private java.math.BigDecimal fcurRWT;
  public java.math.BigDecimal get_fcurRWT() {
    return fcurRWT;
  }
  public void set_fcurRWT(java.math.BigDecimal fcurRWT) {
    this.fcurRWT = fcurRWT;
  }
  public tblnz_rtnnitma with_fcurRWT(java.math.BigDecimal fcurRWT) {
    this.fcurRWT = fcurRWT;
    return this;
  }
  private java.math.BigDecimal fcurRLWT;
  public java.math.BigDecimal get_fcurRLWT() {
    return fcurRLWT;
  }
  public void set_fcurRLWT(java.math.BigDecimal fcurRLWT) {
    this.fcurRLWT = fcurRLWT;
  }
  public tblnz_rtnnitma with_fcurRLWT(java.math.BigDecimal fcurRLWT) {
    this.fcurRLWT = fcurRLWT;
    return this;
  }
  private java.math.BigDecimal fcurTaxAfterRWT;
  public java.math.BigDecimal get_fcurTaxAfterRWT() {
    return fcurTaxAfterRWT;
  }
  public void set_fcurTaxAfterRWT(java.math.BigDecimal fcurTaxAfterRWT) {
    this.fcurTaxAfterRWT = fcurTaxAfterRWT;
  }
  public tblnz_rtnnitma with_fcurTaxAfterRWT(java.math.BigDecimal fcurTaxAfterRWT) {
    this.fcurTaxAfterRWT = fcurTaxAfterRWT;
    return this;
  }
  private java.math.BigDecimal fcurMaoriCredits;
  public java.math.BigDecimal get_fcurMaoriCredits() {
    return fcurMaoriCredits;
  }
  public void set_fcurMaoriCredits(java.math.BigDecimal fcurMaoriCredits) {
    this.fcurMaoriCredits = fcurMaoriCredits;
  }
  public tblnz_rtnnitma with_fcurMaoriCredits(java.math.BigDecimal fcurMaoriCredits) {
    this.fcurMaoriCredits = fcurMaoriCredits;
    return this;
  }
  private java.math.BigDecimal fcurResidualIncomeTax;
  public java.math.BigDecimal get_fcurResidualIncomeTax() {
    return fcurResidualIncomeTax;
  }
  public void set_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
  }
  public tblnz_rtnnitma with_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
    return this;
  }
  private java.math.BigDecimal fcurProvisionalTaxPaid;
  public java.math.BigDecimal get_fcurProvisionalTaxPaid() {
    return fcurProvisionalTaxPaid;
  }
  public void set_fcurProvisionalTaxPaid(java.math.BigDecimal fcurProvisionalTaxPaid) {
    this.fcurProvisionalTaxPaid = fcurProvisionalTaxPaid;
  }
  public tblnz_rtnnitma with_fcurProvisionalTaxPaid(java.math.BigDecimal fcurProvisionalTaxPaid) {
    this.fcurProvisionalTaxPaid = fcurProvisionalTaxPaid;
    return this;
  }
  private java.math.BigDecimal fcurTaxAmount;
  public java.math.BigDecimal get_fcurTaxAmount() {
    return fcurTaxAmount;
  }
  public void set_fcurTaxAmount(java.math.BigDecimal fcurTaxAmount) {
    this.fcurTaxAmount = fcurTaxAmount;
  }
  public tblnz_rtnnitma with_fcurTaxAmount(java.math.BigDecimal fcurTaxAmount) {
    this.fcurTaxAmount = fcurTaxAmount;
    return this;
  }
  private java.math.BigDecimal fcurOverpaymentProvisional;
  public java.math.BigDecimal get_fcurOverpaymentProvisional() {
    return fcurOverpaymentProvisional;
  }
  public void set_fcurOverpaymentProvisional(java.math.BigDecimal fcurOverpaymentProvisional) {
    this.fcurOverpaymentProvisional = fcurOverpaymentProvisional;
  }
  public tblnz_rtnnitma with_fcurOverpaymentProvisional(java.math.BigDecimal fcurOverpaymentProvisional) {
    this.fcurOverpaymentProvisional = fcurOverpaymentProvisional;
    return this;
  }
  private java.math.BigDecimal fcurRefundAfterOverpayment;
  public java.math.BigDecimal get_fcurRefundAfterOverpayment() {
    return fcurRefundAfterOverpayment;
  }
  public void set_fcurRefundAfterOverpayment(java.math.BigDecimal fcurRefundAfterOverpayment) {
    this.fcurRefundAfterOverpayment = fcurRefundAfterOverpayment;
  }
  public tblnz_rtnnitma with_fcurRefundAfterOverpayment(java.math.BigDecimal fcurRefundAfterOverpayment) {
    this.fcurRefundAfterOverpayment = fcurRefundAfterOverpayment;
    return this;
  }
  private java.math.BigDecimal fcurTransferProvisional;
  public java.math.BigDecimal get_fcurTransferProvisional() {
    return fcurTransferProvisional;
  }
  public void set_fcurTransferProvisional(java.math.BigDecimal fcurTransferProvisional) {
    this.fcurTransferProvisional = fcurTransferProvisional;
  }
  public tblnz_rtnnitma with_fcurTransferProvisional(java.math.BigDecimal fcurTransferProvisional) {
    this.fcurTransferProvisional = fcurTransferProvisional;
    return this;
  }
  private java.math.BigDecimal fcurTransferCustomerAmount;
  public java.math.BigDecimal get_fcurTransferCustomerAmount() {
    return fcurTransferCustomerAmount;
  }
  public void set_fcurTransferCustomerAmount(java.math.BigDecimal fcurTransferCustomerAmount) {
    this.fcurTransferCustomerAmount = fcurTransferCustomerAmount;
  }
  public tblnz_rtnnitma with_fcurTransferCustomerAmount(java.math.BigDecimal fcurTransferCustomerAmount) {
    this.fcurTransferCustomerAmount = fcurTransferCustomerAmount;
    return this;
  }
  private java.math.BigDecimal fcurTotalRefund;
  public java.math.BigDecimal get_fcurTotalRefund() {
    return fcurTotalRefund;
  }
  public void set_fcurTotalRefund(java.math.BigDecimal fcurTotalRefund) {
    this.fcurTotalRefund = fcurTotalRefund;
  }
  public tblnz_rtnnitma with_fcurTotalRefund(java.math.BigDecimal fcurTotalRefund) {
    this.fcurTotalRefund = fcurTotalRefund;
    return this;
  }
  private java.sql.Timestamp fdtmProvisionalStartDate;
  public java.sql.Timestamp get_fdtmProvisionalStartDate() {
    return fdtmProvisionalStartDate;
  }
  public void set_fdtmProvisionalStartDate(java.sql.Timestamp fdtmProvisionalStartDate) {
    this.fdtmProvisionalStartDate = fdtmProvisionalStartDate;
  }
  public tblnz_rtnnitma with_fdtmProvisionalStartDate(java.sql.Timestamp fdtmProvisionalStartDate) {
    this.fdtmProvisionalStartDate = fdtmProvisionalStartDate;
    return this;
  }
  private String fstrProvisionalOption;
  public String get_fstrProvisionalOption() {
    return fstrProvisionalOption;
  }
  public void set_fstrProvisionalOption(String fstrProvisionalOption) {
    this.fstrProvisionalOption = fstrProvisionalOption;
  }
  public tblnz_rtnnitma with_fstrProvisionalOption(String fstrProvisionalOption) {
    this.fstrProvisionalOption = fstrProvisionalOption;
    return this;
  }
  private java.math.BigDecimal fcurProvisionalTax;
  public java.math.BigDecimal get_fcurProvisionalTax() {
    return fcurProvisionalTax;
  }
  public void set_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
    this.fcurProvisionalTax = fcurProvisionalTax;
  }
  public tblnz_rtnnitma with_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
    this.fcurProvisionalTax = fcurProvisionalTax;
    return this;
  }
  private Integer fblnCFC;
  public Integer get_fblnCFC() {
    return fblnCFC;
  }
  public void set_fblnCFC(Integer fblnCFC) {
    this.fblnCFC = fblnCFC;
  }
  public tblnz_rtnnitma with_fblnCFC(Integer fblnCFC) {
    this.fblnCFC = fblnCFC;
    return this;
  }
  private java.math.BigDecimal fcurLossToCarryForward;
  public java.math.BigDecimal get_fcurLossToCarryForward() {
    return fcurLossToCarryForward;
  }
  public void set_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
  }
  public tblnz_rtnnitma with_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
    return this;
  }
  private java.math.BigDecimal fcurExcessImputation;
  public java.math.BigDecimal get_fcurExcessImputation() {
    return fcurExcessImputation;
  }
  public void set_fcurExcessImputation(java.math.BigDecimal fcurExcessImputation) {
    this.fcurExcessImputation = fcurExcessImputation;
  }
  public tblnz_rtnnitma with_fcurExcessImputation(java.math.BigDecimal fcurExcessImputation) {
    this.fcurExcessImputation = fcurExcessImputation;
    return this;
  }
  private java.math.BigDecimal fcurExcessImputationAsLoss;
  public java.math.BigDecimal get_fcurExcessImputationAsLoss() {
    return fcurExcessImputationAsLoss;
  }
  public void set_fcurExcessImputationAsLoss(java.math.BigDecimal fcurExcessImputationAsLoss) {
    this.fcurExcessImputationAsLoss = fcurExcessImputationAsLoss;
  }
  public tblnz_rtnnitma with_fcurExcessImputationAsLoss(java.math.BigDecimal fcurExcessImputationAsLoss) {
    this.fcurExcessImputationAsLoss = fcurExcessImputationAsLoss;
    return this;
  }
  private String fstrResMethod;
  public String get_fstrResMethod() {
    return fstrResMethod;
  }
  public void set_fstrResMethod(String fstrResMethod) {
    this.fstrResMethod = fstrResMethod;
  }
  public tblnz_rtnnitma with_fstrResMethod(String fstrResMethod) {
    this.fstrResMethod = fstrResMethod;
    return this;
  }
  private java.math.BigDecimal fcurResIncome;
  public java.math.BigDecimal get_fcurResIncome() {
    return fcurResIncome;
  }
  public void set_fcurResIncome(java.math.BigDecimal fcurResIncome) {
    this.fcurResIncome = fcurResIncome;
  }
  public tblnz_rtnnitma with_fcurResIncome(java.math.BigDecimal fcurResIncome) {
    this.fcurResIncome = fcurResIncome;
    return this;
  }
  private java.math.BigDecimal fcurResDeductionsClaimed;
  public java.math.BigDecimal get_fcurResDeductionsClaimed() {
    return fcurResDeductionsClaimed;
  }
  public void set_fcurResDeductionsClaimed(java.math.BigDecimal fcurResDeductionsClaimed) {
    this.fcurResDeductionsClaimed = fcurResDeductionsClaimed;
  }
  public tblnz_rtnnitma with_fcurResDeductionsClaimed(java.math.BigDecimal fcurResDeductionsClaimed) {
    this.fcurResDeductionsClaimed = fcurResDeductionsClaimed;
    return this;
  }
  private java.math.BigDecimal fcurResDeductions;
  public java.math.BigDecimal get_fcurResDeductions() {
    return fcurResDeductions;
  }
  public void set_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
    this.fcurResDeductions = fcurResDeductions;
  }
  public tblnz_rtnnitma with_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
    this.fcurResDeductions = fcurResDeductions;
    return this;
  }
  private java.math.BigDecimal fcurResDeductionsPriorYear;
  public java.math.BigDecimal get_fcurResDeductionsPriorYear() {
    return fcurResDeductionsPriorYear;
  }
  public void set_fcurResDeductionsPriorYear(java.math.BigDecimal fcurResDeductionsPriorYear) {
    this.fcurResDeductionsPriorYear = fcurResDeductionsPriorYear;
  }
  public tblnz_rtnnitma with_fcurResDeductionsPriorYear(java.math.BigDecimal fcurResDeductionsPriorYear) {
    this.fcurResDeductionsPriorYear = fcurResDeductionsPriorYear;
    return this;
  }
  private java.math.BigDecimal fcurResDeductionsForward;
  public java.math.BigDecimal get_fcurResDeductionsForward() {
    return fcurResDeductionsForward;
  }
  public void set_fcurResDeductionsForward(java.math.BigDecimal fcurResDeductionsForward) {
    this.fcurResDeductionsForward = fcurResDeductionsForward;
  }
  public tblnz_rtnnitma with_fcurResDeductionsForward(java.math.BigDecimal fcurResDeductionsForward) {
    this.fcurResDeductionsForward = fcurResDeductionsForward;
    return this;
  }
  private java.math.BigDecimal fcurResNetIncome;
  public java.math.BigDecimal get_fcurResNetIncome() {
    return fcurResNetIncome;
  }
  public void set_fcurResNetIncome(java.math.BigDecimal fcurResNetIncome) {
    this.fcurResNetIncome = fcurResNetIncome;
  }
  public tblnz_rtnnitma with_fcurResNetIncome(java.math.BigDecimal fcurResNetIncome) {
    this.fcurResNetIncome = fcurResNetIncome;
    return this;
  }
  private java.math.BigDecimal fcurRDICarryForwardCurrentYear;
  public java.math.BigDecimal get_fcurRDICarryForwardCurrentYear() {
    return fcurRDICarryForwardCurrentYear;
  }
  public void set_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
    this.fcurRDICarryForwardCurrentYear = fcurRDICarryForwardCurrentYear;
  }
  public tblnz_rtnnitma with_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
    this.fcurRDICarryForwardCurrentYear = fcurRDICarryForwardCurrentYear;
    return this;
  }
  private java.math.BigDecimal fcurRDICarryForwardRemaining;
  public java.math.BigDecimal get_fcurRDICarryForwardRemaining() {
    return fcurRDICarryForwardRemaining;
  }
  public void set_fcurRDICarryForwardRemaining(java.math.BigDecimal fcurRDICarryForwardRemaining) {
    this.fcurRDICarryForwardRemaining = fcurRDICarryForwardRemaining;
  }
  public tblnz_rtnnitma with_fcurRDICarryForwardRemaining(java.math.BigDecimal fcurRDICarryForwardRemaining) {
    this.fcurRDICarryForwardRemaining = fcurRDICarryForwardRemaining;
    return this;
  }
  private java.math.BigDecimal fcurPropertyProfitLoss;
  public java.math.BigDecimal get_fcurPropertyProfitLoss() {
    return fcurPropertyProfitLoss;
  }
  public void set_fcurPropertyProfitLoss(java.math.BigDecimal fcurPropertyProfitLoss) {
    this.fcurPropertyProfitLoss = fcurPropertyProfitLoss;
  }
  public tblnz_rtnnitma with_fcurPropertyProfitLoss(java.math.BigDecimal fcurPropertyProfitLoss) {
    this.fcurPropertyProfitLoss = fcurPropertyProfitLoss;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tblnz_rtnnitma with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnnitma with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitma)) {
      return false;
    }
    tblnz_rtnnitma that = (tblnz_rtnnitma) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurDividendGross == null ? that.fcurDividendGross == null : this.fcurDividendGross.equals(that.fcurDividendGross));
    equal = equal && (this.fcurMaoriDistributions == null ? that.fcurMaoriDistributions == null : this.fcurMaoriDistributions.equals(that.fcurMaoriDistributions));
    equal = equal && (this.fcurNetRentalIncome == null ? that.fcurNetRentalIncome == null : this.fcurNetRentalIncome.equals(that.fcurNetRentalIncome));
    equal = equal && (this.fcurNetTradingIncome == null ? that.fcurNetTradingIncome == null : this.fcurNetTradingIncome.equals(that.fcurNetTradingIncome));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurTotalAdjustments == null ? that.fcurTotalAdjustments == null : this.fcurTotalAdjustments.equals(that.fcurTotalAdjustments));
    equal = equal && (this.fcurIncomeAfterAdjustments == null ? that.fcurIncomeAfterAdjustments == null : this.fcurIncomeAfterAdjustments.equals(that.fcurIncomeAfterAdjustments));
    equal = equal && (this.fcurTotalDonations == null ? that.fcurTotalDonations == null : this.fcurTotalDonations.equals(that.fcurTotalDonations));
    equal = equal && (this.fcurIncomeAfterDonations == null ? that.fcurIncomeAfterDonations == null : this.fcurIncomeAfterDonations.equals(that.fcurIncomeAfterDonations));
    equal = equal && (this.fcurLossesBroughtForward == null ? that.fcurLossesBroughtForward == null : this.fcurLossesBroughtForward.equals(that.fcurLossesBroughtForward));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurTotalTaxPayable == null ? that.fcurTotalTaxPayable == null : this.fcurTotalTaxPayable.equals(that.fcurTotalTaxPayable));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurTaxAfterOverseas == null ? that.fcurTaxAfterOverseas == null : this.fcurTaxAfterOverseas.equals(that.fcurTaxAfterOverseas));
    equal = equal && (this.fcurDividendImputation == null ? that.fcurDividendImputation == null : this.fcurDividendImputation.equals(that.fcurDividendImputation));
    equal = equal && (this.fcurTaxAfterDividend == null ? that.fcurTaxAfterDividend == null : this.fcurTaxAfterDividend.equals(that.fcurTaxAfterDividend));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurTaxAfterRWT == null ? that.fcurTaxAfterRWT == null : this.fcurTaxAfterRWT.equals(that.fcurTaxAfterRWT));
    equal = equal && (this.fcurMaoriCredits == null ? that.fcurMaoriCredits == null : this.fcurMaoriCredits.equals(that.fcurMaoriCredits));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurProvisionalTaxPaid == null ? that.fcurProvisionalTaxPaid == null : this.fcurProvisionalTaxPaid.equals(that.fcurProvisionalTaxPaid));
    equal = equal && (this.fcurTaxAmount == null ? that.fcurTaxAmount == null : this.fcurTaxAmount.equals(that.fcurTaxAmount));
    equal = equal && (this.fcurOverpaymentProvisional == null ? that.fcurOverpaymentProvisional == null : this.fcurOverpaymentProvisional.equals(that.fcurOverpaymentProvisional));
    equal = equal && (this.fcurRefundAfterOverpayment == null ? that.fcurRefundAfterOverpayment == null : this.fcurRefundAfterOverpayment.equals(that.fcurRefundAfterOverpayment));
    equal = equal && (this.fcurTransferProvisional == null ? that.fcurTransferProvisional == null : this.fcurTransferProvisional.equals(that.fcurTransferProvisional));
    equal = equal && (this.fcurTransferCustomerAmount == null ? that.fcurTransferCustomerAmount == null : this.fcurTransferCustomerAmount.equals(that.fcurTransferCustomerAmount));
    equal = equal && (this.fcurTotalRefund == null ? that.fcurTotalRefund == null : this.fcurTotalRefund.equals(that.fcurTotalRefund));
    equal = equal && (this.fdtmProvisionalStartDate == null ? that.fdtmProvisionalStartDate == null : this.fdtmProvisionalStartDate.equals(that.fdtmProvisionalStartDate));
    equal = equal && (this.fstrProvisionalOption == null ? that.fstrProvisionalOption == null : this.fstrProvisionalOption.equals(that.fstrProvisionalOption));
    equal = equal && (this.fcurProvisionalTax == null ? that.fcurProvisionalTax == null : this.fcurProvisionalTax.equals(that.fcurProvisionalTax));
    equal = equal && (this.fblnCFC == null ? that.fblnCFC == null : this.fblnCFC.equals(that.fblnCFC));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fcurExcessImputation == null ? that.fcurExcessImputation == null : this.fcurExcessImputation.equals(that.fcurExcessImputation));
    equal = equal && (this.fcurExcessImputationAsLoss == null ? that.fcurExcessImputationAsLoss == null : this.fcurExcessImputationAsLoss.equals(that.fcurExcessImputationAsLoss));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsForward == null ? that.fcurResDeductionsForward == null : this.fcurResDeductionsForward.equals(that.fcurResDeductionsForward));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurPropertyProfitLoss == null ? that.fcurPropertyProfitLoss == null : this.fcurPropertyProfitLoss.equals(that.fcurPropertyProfitLoss));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitma)) {
      return false;
    }
    tblnz_rtnnitma that = (tblnz_rtnnitma) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurDividendGross == null ? that.fcurDividendGross == null : this.fcurDividendGross.equals(that.fcurDividendGross));
    equal = equal && (this.fcurMaoriDistributions == null ? that.fcurMaoriDistributions == null : this.fcurMaoriDistributions.equals(that.fcurMaoriDistributions));
    equal = equal && (this.fcurNetRentalIncome == null ? that.fcurNetRentalIncome == null : this.fcurNetRentalIncome.equals(that.fcurNetRentalIncome));
    equal = equal && (this.fcurNetTradingIncome == null ? that.fcurNetTradingIncome == null : this.fcurNetTradingIncome.equals(that.fcurNetTradingIncome));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurTotalAdjustments == null ? that.fcurTotalAdjustments == null : this.fcurTotalAdjustments.equals(that.fcurTotalAdjustments));
    equal = equal && (this.fcurIncomeAfterAdjustments == null ? that.fcurIncomeAfterAdjustments == null : this.fcurIncomeAfterAdjustments.equals(that.fcurIncomeAfterAdjustments));
    equal = equal && (this.fcurTotalDonations == null ? that.fcurTotalDonations == null : this.fcurTotalDonations.equals(that.fcurTotalDonations));
    equal = equal && (this.fcurIncomeAfterDonations == null ? that.fcurIncomeAfterDonations == null : this.fcurIncomeAfterDonations.equals(that.fcurIncomeAfterDonations));
    equal = equal && (this.fcurLossesBroughtForward == null ? that.fcurLossesBroughtForward == null : this.fcurLossesBroughtForward.equals(that.fcurLossesBroughtForward));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurTotalTaxPayable == null ? that.fcurTotalTaxPayable == null : this.fcurTotalTaxPayable.equals(that.fcurTotalTaxPayable));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurTaxAfterOverseas == null ? that.fcurTaxAfterOverseas == null : this.fcurTaxAfterOverseas.equals(that.fcurTaxAfterOverseas));
    equal = equal && (this.fcurDividendImputation == null ? that.fcurDividendImputation == null : this.fcurDividendImputation.equals(that.fcurDividendImputation));
    equal = equal && (this.fcurTaxAfterDividend == null ? that.fcurTaxAfterDividend == null : this.fcurTaxAfterDividend.equals(that.fcurTaxAfterDividend));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurTaxAfterRWT == null ? that.fcurTaxAfterRWT == null : this.fcurTaxAfterRWT.equals(that.fcurTaxAfterRWT));
    equal = equal && (this.fcurMaoriCredits == null ? that.fcurMaoriCredits == null : this.fcurMaoriCredits.equals(that.fcurMaoriCredits));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurProvisionalTaxPaid == null ? that.fcurProvisionalTaxPaid == null : this.fcurProvisionalTaxPaid.equals(that.fcurProvisionalTaxPaid));
    equal = equal && (this.fcurTaxAmount == null ? that.fcurTaxAmount == null : this.fcurTaxAmount.equals(that.fcurTaxAmount));
    equal = equal && (this.fcurOverpaymentProvisional == null ? that.fcurOverpaymentProvisional == null : this.fcurOverpaymentProvisional.equals(that.fcurOverpaymentProvisional));
    equal = equal && (this.fcurRefundAfterOverpayment == null ? that.fcurRefundAfterOverpayment == null : this.fcurRefundAfterOverpayment.equals(that.fcurRefundAfterOverpayment));
    equal = equal && (this.fcurTransferProvisional == null ? that.fcurTransferProvisional == null : this.fcurTransferProvisional.equals(that.fcurTransferProvisional));
    equal = equal && (this.fcurTransferCustomerAmount == null ? that.fcurTransferCustomerAmount == null : this.fcurTransferCustomerAmount.equals(that.fcurTransferCustomerAmount));
    equal = equal && (this.fcurTotalRefund == null ? that.fcurTotalRefund == null : this.fcurTotalRefund.equals(that.fcurTotalRefund));
    equal = equal && (this.fdtmProvisionalStartDate == null ? that.fdtmProvisionalStartDate == null : this.fdtmProvisionalStartDate.equals(that.fdtmProvisionalStartDate));
    equal = equal && (this.fstrProvisionalOption == null ? that.fstrProvisionalOption == null : this.fstrProvisionalOption.equals(that.fstrProvisionalOption));
    equal = equal && (this.fcurProvisionalTax == null ? that.fcurProvisionalTax == null : this.fcurProvisionalTax.equals(that.fcurProvisionalTax));
    equal = equal && (this.fblnCFC == null ? that.fblnCFC == null : this.fblnCFC.equals(that.fblnCFC));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fcurExcessImputation == null ? that.fcurExcessImputation == null : this.fcurExcessImputation.equals(that.fcurExcessImputation));
    equal = equal && (this.fcurExcessImputationAsLoss == null ? that.fcurExcessImputationAsLoss == null : this.fcurExcessImputationAsLoss.equals(that.fcurExcessImputationAsLoss));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsForward == null ? that.fcurResDeductionsForward == null : this.fcurResDeductionsForward.equals(that.fcurResDeductionsForward));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurPropertyProfitLoss == null ? that.fcurPropertyProfitLoss == null : this.fcurPropertyProfitLoss.equals(that.fcurPropertyProfitLoss));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurDividendGross = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurMaoriDistributions = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurNetRentalIncome = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurNetTradingIncome = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalAdjustments = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurIncomeAfterAdjustments = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTotalDonations = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurIncomeAfterDonations = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLossesBroughtForward = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalTaxPayable = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTaxAfterOverseas = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurDividendImputation = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTaxAfterDividend = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTaxAfterRWT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurMaoriCredits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOverpaymentProvisional = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurRefundAfterOverpayment = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(33, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fblnCFC = JdbcWritableBridge.readInteger(35, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurExcessImputation = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurExcessImputationAsLoss = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(39, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurPropertyProfitLoss = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(49, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(50, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurDividendGross = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurMaoriDistributions = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurNetRentalIncome = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurNetTradingIncome = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalAdjustments = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurIncomeAfterAdjustments = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTotalDonations = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurIncomeAfterDonations = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLossesBroughtForward = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalTaxPayable = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTaxAfterOverseas = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurDividendImputation = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTaxAfterDividend = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTaxAfterRWT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurMaoriCredits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOverpaymentProvisional = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurRefundAfterOverpayment = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(33, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fblnCFC = JdbcWritableBridge.readInteger(35, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurExcessImputation = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurExcessImputationAsLoss = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(39, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurPropertyProfitLoss = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(49, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(50, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendGross, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriDistributions, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetRentalIncome, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetTradingIncome, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAdjustments, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterAdjustments, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDonations, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterDonations, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossesBroughtForward, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxPayable, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterOverseas, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendImputation, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterDividend, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterRWT, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriCredits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvisional, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAfterOverpayment, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCFC, 35 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputation, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationAsLoss, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPropertyProfitLoss, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 49 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 50 + __off, -9, __dbStmt);
    return 50;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendGross, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriDistributions, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetRentalIncome, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetTradingIncome, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAdjustments, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterAdjustments, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDonations, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterDonations, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossesBroughtForward, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxPayable, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterOverseas, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendImputation, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterDividend, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterRWT, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriCredits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvisional, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAfterOverpayment, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCFC, 35 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputation, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationAsLoss, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPropertyProfitLoss, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 49 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 50 + __off, -9, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossInterest = null;
    } else {
    this.fcurGrossInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendGross = null;
    } else {
    this.fcurDividendGross = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMaoriDistributions = null;
    } else {
    this.fcurMaoriDistributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetRentalIncome = null;
    } else {
    this.fcurNetRentalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetTradingIncome = null;
    } else {
    this.fcurNetTradingIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherIncome = null;
    } else {
    this.fcurOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncome = null;
    } else {
    this.fcurTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalAdjustments = null;
    } else {
    this.fcurTotalAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAfterAdjustments = null;
    } else {
    this.fcurIncomeAfterAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalDonations = null;
    } else {
    this.fcurTotalDonations = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAfterDonations = null;
    } else {
    this.fcurIncomeAfterDonations = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossesBroughtForward = null;
    } else {
    this.fcurLossesBroughtForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxableIncome = null;
    } else {
    this.fcurTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxPayable = null;
    } else {
    this.fcurTotalTaxPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOverseasTax = null;
    } else {
    this.fcurOverseasTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAfterOverseas = null;
    } else {
    this.fcurTaxAfterOverseas = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendImputation = null;
    } else {
    this.fcurDividendImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAfterDividend = null;
    } else {
    this.fcurTaxAfterDividend = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWT = null;
    } else {
    this.fcurRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRLWT = null;
    } else {
    this.fcurRLWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAfterRWT = null;
    } else {
    this.fcurTaxAfterRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMaoriCredits = null;
    } else {
    this.fcurMaoriCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResidualIncomeTax = null;
    } else {
    this.fcurResidualIncomeTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisionalTaxPaid = null;
    } else {
    this.fcurProvisionalTaxPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAmount = null;
    } else {
    this.fcurTaxAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOverpaymentProvisional = null;
    } else {
    this.fcurOverpaymentProvisional = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRefundAfterOverpayment = null;
    } else {
    this.fcurRefundAfterOverpayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTransferProvisional = null;
    } else {
    this.fcurTransferProvisional = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTransferCustomerAmount = null;
    } else {
    this.fcurTransferCustomerAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalRefund = null;
    } else {
    this.fcurTotalRefund = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProvisionalStartDate = null;
    } else {
    this.fdtmProvisionalStartDate = new Timestamp(__dataIn.readLong());
    this.fdtmProvisionalStartDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrProvisionalOption = null;
    } else {
    this.fstrProvisionalOption = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisionalTax = null;
    } else {
    this.fcurProvisionalTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCFC = null;
    } else {
    this.fblnCFC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossToCarryForward = null;
    } else {
    this.fcurLossToCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessImputation = null;
    } else {
    this.fcurExcessImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessImputationAsLoss = null;
    } else {
    this.fcurExcessImputationAsLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrResMethod = null;
    } else {
    this.fstrResMethod = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResIncome = null;
    } else {
    this.fcurResIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResDeductionsClaimed = null;
    } else {
    this.fcurResDeductionsClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResDeductions = null;
    } else {
    this.fcurResDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResDeductionsPriorYear = null;
    } else {
    this.fcurResDeductionsPriorYear = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResDeductionsForward = null;
    } else {
    this.fcurResDeductionsForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResNetIncome = null;
    } else {
    this.fcurResNetIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRDICarryForwardCurrentYear = null;
    } else {
    this.fcurRDICarryForwardCurrentYear = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRDICarryForwardRemaining = null;
    } else {
    this.fcurRDICarryForwardRemaining = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPropertyProfitLoss = null;
    } else {
    this.fcurPropertyProfitLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fcurGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossInterest, __dataOut);
    }
    if (null == this.fcurDividendGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendGross, __dataOut);
    }
    if (null == this.fcurMaoriDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaoriDistributions, __dataOut);
    }
    if (null == this.fcurNetRentalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetRentalIncome, __dataOut);
    }
    if (null == this.fcurNetTradingIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetTradingIncome, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurTotalAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAdjustments, __dataOut);
    }
    if (null == this.fcurIncomeAfterAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterAdjustments, __dataOut);
    }
    if (null == this.fcurTotalDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDonations, __dataOut);
    }
    if (null == this.fcurIncomeAfterDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterDonations, __dataOut);
    }
    if (null == this.fcurLossesBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossesBroughtForward, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fcurTotalTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxPayable, __dataOut);
    }
    if (null == this.fcurOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasTax, __dataOut);
    }
    if (null == this.fcurTaxAfterOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterOverseas, __dataOut);
    }
    if (null == this.fcurDividendImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendImputation, __dataOut);
    }
    if (null == this.fcurTaxAfterDividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterDividend, __dataOut);
    }
    if (null == this.fcurRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWT, __dataOut);
    }
    if (null == this.fcurRLWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWT, __dataOut);
    }
    if (null == this.fcurTaxAfterRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterRWT, __dataOut);
    }
    if (null == this.fcurMaoriCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaoriCredits, __dataOut);
    }
    if (null == this.fcurResidualIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidualIncomeTax, __dataOut);
    }
    if (null == this.fcurProvisionalTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionalTaxPaid, __dataOut);
    }
    if (null == this.fcurTaxAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAmount, __dataOut);
    }
    if (null == this.fcurOverpaymentProvisional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverpaymentProvisional, __dataOut);
    }
    if (null == this.fcurRefundAfterOverpayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundAfterOverpayment, __dataOut);
    }
    if (null == this.fcurTransferProvisional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransferProvisional, __dataOut);
    }
    if (null == this.fcurTransferCustomerAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransferCustomerAmount, __dataOut);
    }
    if (null == this.fcurTotalRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRefund, __dataOut);
    }
    if (null == this.fdtmProvisionalStartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProvisionalStartDate.getTime());
    __dataOut.writeInt(this.fdtmProvisionalStartDate.getNanos());
    }
    if (null == this.fstrProvisionalOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProvisionalOption);
    }
    if (null == this.fcurProvisionalTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionalTax, __dataOut);
    }
    if (null == this.fblnCFC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCFC);
    }
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fcurExcessImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputation, __dataOut);
    }
    if (null == this.fcurExcessImputationAsLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationAsLoss, __dataOut);
    }
    if (null == this.fstrResMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResMethod);
    }
    if (null == this.fcurResIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResIncome, __dataOut);
    }
    if (null == this.fcurResDeductionsClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsClaimed, __dataOut);
    }
    if (null == this.fcurResDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductions, __dataOut);
    }
    if (null == this.fcurResDeductionsPriorYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsPriorYear, __dataOut);
    }
    if (null == this.fcurResDeductionsForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsForward, __dataOut);
    }
    if (null == this.fcurResNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResNetIncome, __dataOut);
    }
    if (null == this.fcurRDICarryForwardCurrentYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDICarryForwardCurrentYear, __dataOut);
    }
    if (null == this.fcurRDICarryForwardRemaining) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDICarryForwardRemaining, __dataOut);
    }
    if (null == this.fcurPropertyProfitLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPropertyProfitLoss, __dataOut);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fcurGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossInterest, __dataOut);
    }
    if (null == this.fcurDividendGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendGross, __dataOut);
    }
    if (null == this.fcurMaoriDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaoriDistributions, __dataOut);
    }
    if (null == this.fcurNetRentalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetRentalIncome, __dataOut);
    }
    if (null == this.fcurNetTradingIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetTradingIncome, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurTotalAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAdjustments, __dataOut);
    }
    if (null == this.fcurIncomeAfterAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterAdjustments, __dataOut);
    }
    if (null == this.fcurTotalDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDonations, __dataOut);
    }
    if (null == this.fcurIncomeAfterDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterDonations, __dataOut);
    }
    if (null == this.fcurLossesBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossesBroughtForward, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fcurTotalTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxPayable, __dataOut);
    }
    if (null == this.fcurOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasTax, __dataOut);
    }
    if (null == this.fcurTaxAfterOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterOverseas, __dataOut);
    }
    if (null == this.fcurDividendImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendImputation, __dataOut);
    }
    if (null == this.fcurTaxAfterDividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterDividend, __dataOut);
    }
    if (null == this.fcurRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWT, __dataOut);
    }
    if (null == this.fcurRLWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWT, __dataOut);
    }
    if (null == this.fcurTaxAfterRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterRWT, __dataOut);
    }
    if (null == this.fcurMaoriCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaoriCredits, __dataOut);
    }
    if (null == this.fcurResidualIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidualIncomeTax, __dataOut);
    }
    if (null == this.fcurProvisionalTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionalTaxPaid, __dataOut);
    }
    if (null == this.fcurTaxAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAmount, __dataOut);
    }
    if (null == this.fcurOverpaymentProvisional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverpaymentProvisional, __dataOut);
    }
    if (null == this.fcurRefundAfterOverpayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundAfterOverpayment, __dataOut);
    }
    if (null == this.fcurTransferProvisional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransferProvisional, __dataOut);
    }
    if (null == this.fcurTransferCustomerAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransferCustomerAmount, __dataOut);
    }
    if (null == this.fcurTotalRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRefund, __dataOut);
    }
    if (null == this.fdtmProvisionalStartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProvisionalStartDate.getTime());
    __dataOut.writeInt(this.fdtmProvisionalStartDate.getNanos());
    }
    if (null == this.fstrProvisionalOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProvisionalOption);
    }
    if (null == this.fcurProvisionalTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionalTax, __dataOut);
    }
    if (null == this.fblnCFC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCFC);
    }
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fcurExcessImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputation, __dataOut);
    }
    if (null == this.fcurExcessImputationAsLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationAsLoss, __dataOut);
    }
    if (null == this.fstrResMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResMethod);
    }
    if (null == this.fcurResIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResIncome, __dataOut);
    }
    if (null == this.fcurResDeductionsClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsClaimed, __dataOut);
    }
    if (null == this.fcurResDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductions, __dataOut);
    }
    if (null == this.fcurResDeductionsPriorYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsPriorYear, __dataOut);
    }
    if (null == this.fcurResDeductionsForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsForward, __dataOut);
    }
    if (null == this.fcurResNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResNetIncome, __dataOut);
    }
    if (null == this.fcurRDICarryForwardCurrentYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDICarryForwardCurrentYear, __dataOut);
    }
    if (null == this.fcurRDICarryForwardRemaining) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDICarryForwardRemaining, __dataOut);
    }
    if (null == this.fcurPropertyProfitLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPropertyProfitLoss, __dataOut);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossInterest==null?"\\N":fcurGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendGross==null?"\\N":fcurDividendGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaoriDistributions==null?"\\N":fcurMaoriDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetRentalIncome==null?"\\N":fcurNetRentalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetTradingIncome==null?"\\N":fcurNetTradingIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAdjustments==null?"\\N":fcurTotalAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterAdjustments==null?"\\N":fcurIncomeAfterAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDonations==null?"\\N":fcurTotalDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterDonations==null?"\\N":fcurIncomeAfterDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossesBroughtForward==null?"\\N":fcurLossesBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxPayable==null?"\\N":fcurTotalTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterOverseas==null?"\\N":fcurTaxAfterOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendImputation==null?"\\N":fcurDividendImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterDividend==null?"\\N":fcurTaxAfterDividend.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWT==null?"\\N":fcurRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterRWT==null?"\\N":fcurTaxAfterRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaoriCredits==null?"\\N":fcurMaoriCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTaxPaid==null?"\\N":fcurProvisionalTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAmount==null?"\\N":fcurTaxAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverpaymentProvisional==null?"\\N":fcurOverpaymentProvisional.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundAfterOverpayment==null?"\\N":fcurRefundAfterOverpayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransferProvisional==null?"\\N":fcurTransferProvisional.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransferCustomerAmount==null?"\\N":fcurTransferCustomerAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRefund==null?"\\N":fcurTotalRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProvisionalStartDate==null?"\\N":"" + fdtmProvisionalStartDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProvisionalOption==null?"\\N":fstrProvisionalOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTax==null?"\\N":fcurProvisionalTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCFC==null?"\\N":"" + fblnCFC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputation==null?"\\N":fcurExcessImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationAsLoss==null?"\\N":fcurExcessImputationAsLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResMethod==null?"\\N":fstrResMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResIncome==null?"\\N":fcurResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsClaimed==null?"\\N":fcurResDeductionsClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductions==null?"\\N":fcurResDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsPriorYear==null?"\\N":fcurResDeductionsPriorYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsForward==null?"\\N":fcurResDeductionsForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResNetIncome==null?"\\N":fcurResNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardCurrentYear==null?"\\N":fcurRDICarryForwardCurrentYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPropertyProfitLoss==null?"\\N":fcurPropertyProfitLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossInterest==null?"\\N":fcurGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendGross==null?"\\N":fcurDividendGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaoriDistributions==null?"\\N":fcurMaoriDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetRentalIncome==null?"\\N":fcurNetRentalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetTradingIncome==null?"\\N":fcurNetTradingIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAdjustments==null?"\\N":fcurTotalAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterAdjustments==null?"\\N":fcurIncomeAfterAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDonations==null?"\\N":fcurTotalDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterDonations==null?"\\N":fcurIncomeAfterDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossesBroughtForward==null?"\\N":fcurLossesBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxPayable==null?"\\N":fcurTotalTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterOverseas==null?"\\N":fcurTaxAfterOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendImputation==null?"\\N":fcurDividendImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterDividend==null?"\\N":fcurTaxAfterDividend.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWT==null?"\\N":fcurRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterRWT==null?"\\N":fcurTaxAfterRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaoriCredits==null?"\\N":fcurMaoriCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTaxPaid==null?"\\N":fcurProvisionalTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAmount==null?"\\N":fcurTaxAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverpaymentProvisional==null?"\\N":fcurOverpaymentProvisional.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundAfterOverpayment==null?"\\N":fcurRefundAfterOverpayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransferProvisional==null?"\\N":fcurTransferProvisional.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransferCustomerAmount==null?"\\N":fcurTransferCustomerAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRefund==null?"\\N":fcurTotalRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProvisionalStartDate==null?"\\N":"" + fdtmProvisionalStartDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProvisionalOption==null?"\\N":fstrProvisionalOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTax==null?"\\N":fcurProvisionalTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCFC==null?"\\N":"" + fblnCFC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputation==null?"\\N":fcurExcessImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationAsLoss==null?"\\N":fcurExcessImputationAsLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResMethod==null?"\\N":fstrResMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResIncome==null?"\\N":fcurResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsClaimed==null?"\\N":fcurResDeductionsClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductions==null?"\\N":fcurResDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsPriorYear==null?"\\N":fcurResDeductionsPriorYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsForward==null?"\\N":fcurResDeductionsForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResNetIncome==null?"\\N":fcurResNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardCurrentYear==null?"\\N":fcurRDICarryForwardCurrentYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPropertyProfitLoss==null?"\\N":fcurPropertyProfitLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossInterest = null; } else {
      this.fcurGrossInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendGross = null; } else {
      this.fcurDividendGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaoriDistributions = null; } else {
      this.fcurMaoriDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetRentalIncome = null; } else {
      this.fcurNetRentalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetTradingIncome = null; } else {
      this.fcurNetTradingIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherIncome = null; } else {
      this.fcurOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncome = null; } else {
      this.fcurTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAdjustments = null; } else {
      this.fcurTotalAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAfterAdjustments = null; } else {
      this.fcurIncomeAfterAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDonations = null; } else {
      this.fcurTotalDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAfterDonations = null; } else {
      this.fcurIncomeAfterDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossesBroughtForward = null; } else {
      this.fcurLossesBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableIncome = null; } else {
      this.fcurTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxPayable = null; } else {
      this.fcurTotalTaxPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverseasTax = null; } else {
      this.fcurOverseasTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterOverseas = null; } else {
      this.fcurTaxAfterOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendImputation = null; } else {
      this.fcurDividendImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterDividend = null; } else {
      this.fcurTaxAfterDividend = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWT = null; } else {
      this.fcurRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWT = null; } else {
      this.fcurRLWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterRWT = null; } else {
      this.fcurTaxAfterRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaoriCredits = null; } else {
      this.fcurMaoriCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResidualIncomeTax = null; } else {
      this.fcurResidualIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionalTaxPaid = null; } else {
      this.fcurProvisionalTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAmount = null; } else {
      this.fcurTaxAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverpaymentProvisional = null; } else {
      this.fcurOverpaymentProvisional = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundAfterOverpayment = null; } else {
      this.fcurRefundAfterOverpayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransferProvisional = null; } else {
      this.fcurTransferProvisional = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransferCustomerAmount = null; } else {
      this.fcurTransferCustomerAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRefund = null; } else {
      this.fcurTotalRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProvisionalStartDate = null; } else {
      this.fdtmProvisionalStartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProvisionalOption = null; } else {
      this.fstrProvisionalOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionalTax = null; } else {
      this.fcurProvisionalTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCFC = null; } else {
      this.fblnCFC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputation = null; } else {
      this.fcurExcessImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputationAsLoss = null; } else {
      this.fcurExcessImputationAsLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResMethod = null; } else {
      this.fstrResMethod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResIncome = null; } else {
      this.fcurResIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsClaimed = null; } else {
      this.fcurResDeductionsClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductions = null; } else {
      this.fcurResDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsPriorYear = null; } else {
      this.fcurResDeductionsPriorYear = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsForward = null; } else {
      this.fcurResDeductionsForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResNetIncome = null; } else {
      this.fcurResNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDICarryForwardCurrentYear = null; } else {
      this.fcurRDICarryForwardCurrentYear = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDICarryForwardRemaining = null; } else {
      this.fcurRDICarryForwardRemaining = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPropertyProfitLoss = null; } else {
      this.fcurPropertyProfitLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossInterest = null; } else {
      this.fcurGrossInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendGross = null; } else {
      this.fcurDividendGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaoriDistributions = null; } else {
      this.fcurMaoriDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetRentalIncome = null; } else {
      this.fcurNetRentalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetTradingIncome = null; } else {
      this.fcurNetTradingIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherIncome = null; } else {
      this.fcurOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncome = null; } else {
      this.fcurTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAdjustments = null; } else {
      this.fcurTotalAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAfterAdjustments = null; } else {
      this.fcurIncomeAfterAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDonations = null; } else {
      this.fcurTotalDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAfterDonations = null; } else {
      this.fcurIncomeAfterDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossesBroughtForward = null; } else {
      this.fcurLossesBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableIncome = null; } else {
      this.fcurTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxPayable = null; } else {
      this.fcurTotalTaxPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverseasTax = null; } else {
      this.fcurOverseasTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterOverseas = null; } else {
      this.fcurTaxAfterOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendImputation = null; } else {
      this.fcurDividendImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterDividend = null; } else {
      this.fcurTaxAfterDividend = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWT = null; } else {
      this.fcurRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWT = null; } else {
      this.fcurRLWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterRWT = null; } else {
      this.fcurTaxAfterRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaoriCredits = null; } else {
      this.fcurMaoriCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResidualIncomeTax = null; } else {
      this.fcurResidualIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionalTaxPaid = null; } else {
      this.fcurProvisionalTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAmount = null; } else {
      this.fcurTaxAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverpaymentProvisional = null; } else {
      this.fcurOverpaymentProvisional = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundAfterOverpayment = null; } else {
      this.fcurRefundAfterOverpayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransferProvisional = null; } else {
      this.fcurTransferProvisional = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransferCustomerAmount = null; } else {
      this.fcurTransferCustomerAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRefund = null; } else {
      this.fcurTotalRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProvisionalStartDate = null; } else {
      this.fdtmProvisionalStartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProvisionalOption = null; } else {
      this.fstrProvisionalOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionalTax = null; } else {
      this.fcurProvisionalTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCFC = null; } else {
      this.fblnCFC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputation = null; } else {
      this.fcurExcessImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputationAsLoss = null; } else {
      this.fcurExcessImputationAsLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResMethod = null; } else {
      this.fstrResMethod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResIncome = null; } else {
      this.fcurResIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsClaimed = null; } else {
      this.fcurResDeductionsClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductions = null; } else {
      this.fcurResDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsPriorYear = null; } else {
      this.fcurResDeductionsPriorYear = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsForward = null; } else {
      this.fcurResDeductionsForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResNetIncome = null; } else {
      this.fcurResNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDICarryForwardCurrentYear = null; } else {
      this.fcurRDICarryForwardCurrentYear = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDICarryForwardRemaining = null; } else {
      this.fcurRDICarryForwardRemaining = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPropertyProfitLoss = null; } else {
      this.fcurPropertyProfitLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblnz_rtnnitma o = (tblnz_rtnnitma) super.clone();
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnitma o) throws CloneNotSupportedException {
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurDividendGross", this.fcurDividendGross);
    __sqoop$field_map.put("fcurMaoriDistributions", this.fcurMaoriDistributions);
    __sqoop$field_map.put("fcurNetRentalIncome", this.fcurNetRentalIncome);
    __sqoop$field_map.put("fcurNetTradingIncome", this.fcurNetTradingIncome);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurTotalAdjustments", this.fcurTotalAdjustments);
    __sqoop$field_map.put("fcurIncomeAfterAdjustments", this.fcurIncomeAfterAdjustments);
    __sqoop$field_map.put("fcurTotalDonations", this.fcurTotalDonations);
    __sqoop$field_map.put("fcurIncomeAfterDonations", this.fcurIncomeAfterDonations);
    __sqoop$field_map.put("fcurLossesBroughtForward", this.fcurLossesBroughtForward);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurTotalTaxPayable", this.fcurTotalTaxPayable);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurTaxAfterOverseas", this.fcurTaxAfterOverseas);
    __sqoop$field_map.put("fcurDividendImputation", this.fcurDividendImputation);
    __sqoop$field_map.put("fcurTaxAfterDividend", this.fcurTaxAfterDividend);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurTaxAfterRWT", this.fcurTaxAfterRWT);
    __sqoop$field_map.put("fcurMaoriCredits", this.fcurMaoriCredits);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurProvisionalTaxPaid", this.fcurProvisionalTaxPaid);
    __sqoop$field_map.put("fcurTaxAmount", this.fcurTaxAmount);
    __sqoop$field_map.put("fcurOverpaymentProvisional", this.fcurOverpaymentProvisional);
    __sqoop$field_map.put("fcurRefundAfterOverpayment", this.fcurRefundAfterOverpayment);
    __sqoop$field_map.put("fcurTransferProvisional", this.fcurTransferProvisional);
    __sqoop$field_map.put("fcurTransferCustomerAmount", this.fcurTransferCustomerAmount);
    __sqoop$field_map.put("fcurTotalRefund", this.fcurTotalRefund);
    __sqoop$field_map.put("fdtmProvisionalStartDate", this.fdtmProvisionalStartDate);
    __sqoop$field_map.put("fstrProvisionalOption", this.fstrProvisionalOption);
    __sqoop$field_map.put("fcurProvisionalTax", this.fcurProvisionalTax);
    __sqoop$field_map.put("fblnCFC", this.fblnCFC);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fcurExcessImputation", this.fcurExcessImputation);
    __sqoop$field_map.put("fcurExcessImputationAsLoss", this.fcurExcessImputationAsLoss);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsForward", this.fcurResDeductionsForward);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurPropertyProfitLoss", this.fcurPropertyProfitLoss);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurDividendGross", this.fcurDividendGross);
    __sqoop$field_map.put("fcurMaoriDistributions", this.fcurMaoriDistributions);
    __sqoop$field_map.put("fcurNetRentalIncome", this.fcurNetRentalIncome);
    __sqoop$field_map.put("fcurNetTradingIncome", this.fcurNetTradingIncome);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurTotalAdjustments", this.fcurTotalAdjustments);
    __sqoop$field_map.put("fcurIncomeAfterAdjustments", this.fcurIncomeAfterAdjustments);
    __sqoop$field_map.put("fcurTotalDonations", this.fcurTotalDonations);
    __sqoop$field_map.put("fcurIncomeAfterDonations", this.fcurIncomeAfterDonations);
    __sqoop$field_map.put("fcurLossesBroughtForward", this.fcurLossesBroughtForward);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurTotalTaxPayable", this.fcurTotalTaxPayable);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurTaxAfterOverseas", this.fcurTaxAfterOverseas);
    __sqoop$field_map.put("fcurDividendImputation", this.fcurDividendImputation);
    __sqoop$field_map.put("fcurTaxAfterDividend", this.fcurTaxAfterDividend);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurTaxAfterRWT", this.fcurTaxAfterRWT);
    __sqoop$field_map.put("fcurMaoriCredits", this.fcurMaoriCredits);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurProvisionalTaxPaid", this.fcurProvisionalTaxPaid);
    __sqoop$field_map.put("fcurTaxAmount", this.fcurTaxAmount);
    __sqoop$field_map.put("fcurOverpaymentProvisional", this.fcurOverpaymentProvisional);
    __sqoop$field_map.put("fcurRefundAfterOverpayment", this.fcurRefundAfterOverpayment);
    __sqoop$field_map.put("fcurTransferProvisional", this.fcurTransferProvisional);
    __sqoop$field_map.put("fcurTransferCustomerAmount", this.fcurTransferCustomerAmount);
    __sqoop$field_map.put("fcurTotalRefund", this.fcurTotalRefund);
    __sqoop$field_map.put("fdtmProvisionalStartDate", this.fdtmProvisionalStartDate);
    __sqoop$field_map.put("fstrProvisionalOption", this.fstrProvisionalOption);
    __sqoop$field_map.put("fcurProvisionalTax", this.fcurProvisionalTax);
    __sqoop$field_map.put("fblnCFC", this.fblnCFC);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fcurExcessImputation", this.fcurExcessImputation);
    __sqoop$field_map.put("fcurExcessImputationAsLoss", this.fcurExcessImputationAsLoss);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsForward", this.fcurResDeductionsForward);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurPropertyProfitLoss", this.fcurPropertyProfitLoss);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
