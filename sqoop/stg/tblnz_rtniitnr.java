// ORM class for table 'tblnz_rtniitnr'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:28:11 NZDT 2020
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

public class tblnz_rtniitnr extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurTotalRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalGrossInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalGrossInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurNRWTInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalDividendCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalDividendCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalGrossDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalGrossDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTDividend", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurNRWTDividend = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxRoyalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalTaxRoyalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalGrossRoyalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalGrossRoyalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTRoyalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurNRWTRoyalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurNRWTTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalNRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalNRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalTaxDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalGrossIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalGrossIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalMaoriCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalMaoriCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalMaoriDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalMaoriDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPartnershipTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalPartnershipTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPartnershipIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalPartnershipIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalEstateTrustTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalEstateTrustTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalEstateTrustIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalEstateTrustIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalLTCTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalLTCTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalActiveLTCIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalActiveLTCIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonAllowDedThisYr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurNonAllowDedThisYr = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonAllowDedPrvYr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurNonAllowDedPrvYr = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdjustedLTCIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurAdjustedLTCIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalOtherCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherIncomeSubtotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurOtherIncomeSubtotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetRents", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurNetRents = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetSelfEmployedIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurNetSelfEmployedIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAnyOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurAnyOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRLWTCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurRLWTCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalOtherExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAfterExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurIncomeAfterExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossBroughtForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurLossBroughtForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalLossClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalLossClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdjustedTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurAdjustedTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnWorkedInNZ", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fblnWorkedInNZ = (Integer)value;
      }
    });
    setters.put("fcurTaxOnTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTaxOnTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOthIncTaxAndNRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurOthIncTaxAndNRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResidualIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurResidualIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurProvTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefundOrTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurRefundOrTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvTaxOverpayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurProvTaxOverpayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurTotalRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRemainingRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurRemainingRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionalTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurProvisionalTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurLossToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImputationToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurImputationToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurExcessImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngSelectGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.flngSelectGroup = (Integer)value;
      }
    });
    setters.put("fdtmSelectDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fdtmSelectDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnGroup2Suspend", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fblnGroup2Suspend = (Integer)value;
      }
    });
    setters.put("fstrResMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fstrResMethod = (String)value;
      }
    });
    setters.put("fcurResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsPriorYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurResDeductionsPriorYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurResDeductionsClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurResNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurResDeductionsForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardCurrentYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurRDICarryForwardCurrentYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardRemaining", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurRDICarryForwardRemaining = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSaleOfProperty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fcurSaleOfProperty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitnr.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtniitnr() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtniitnr with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurTotalRWT;
  public java.math.BigDecimal get_fcurTotalRWT() {
    return fcurTotalRWT;
  }
  public void set_fcurTotalRWT(java.math.BigDecimal fcurTotalRWT) {
    this.fcurTotalRWT = fcurTotalRWT;
  }
  public tblnz_rtniitnr with_fcurTotalRWT(java.math.BigDecimal fcurTotalRWT) {
    this.fcurTotalRWT = fcurTotalRWT;
    return this;
  }
  private java.math.BigDecimal fcurTotalGrossInterest;
  public java.math.BigDecimal get_fcurTotalGrossInterest() {
    return fcurTotalGrossInterest;
  }
  public void set_fcurTotalGrossInterest(java.math.BigDecimal fcurTotalGrossInterest) {
    this.fcurTotalGrossInterest = fcurTotalGrossInterest;
  }
  public tblnz_rtniitnr with_fcurTotalGrossInterest(java.math.BigDecimal fcurTotalGrossInterest) {
    this.fcurTotalGrossInterest = fcurTotalGrossInterest;
    return this;
  }
  private java.math.BigDecimal fcurNRWTInterest;
  public java.math.BigDecimal get_fcurNRWTInterest() {
    return fcurNRWTInterest;
  }
  public void set_fcurNRWTInterest(java.math.BigDecimal fcurNRWTInterest) {
    this.fcurNRWTInterest = fcurNRWTInterest;
  }
  public tblnz_rtniitnr with_fcurNRWTInterest(java.math.BigDecimal fcurNRWTInterest) {
    this.fcurNRWTInterest = fcurNRWTInterest;
    return this;
  }
  private java.math.BigDecimal fcurTotalDividendCredit;
  public java.math.BigDecimal get_fcurTotalDividendCredit() {
    return fcurTotalDividendCredit;
  }
  public void set_fcurTotalDividendCredit(java.math.BigDecimal fcurTotalDividendCredit) {
    this.fcurTotalDividendCredit = fcurTotalDividendCredit;
  }
  public tblnz_rtniitnr with_fcurTotalDividendCredit(java.math.BigDecimal fcurTotalDividendCredit) {
    this.fcurTotalDividendCredit = fcurTotalDividendCredit;
    return this;
  }
  private java.math.BigDecimal fcurTotalGrossDividends;
  public java.math.BigDecimal get_fcurTotalGrossDividends() {
    return fcurTotalGrossDividends;
  }
  public void set_fcurTotalGrossDividends(java.math.BigDecimal fcurTotalGrossDividends) {
    this.fcurTotalGrossDividends = fcurTotalGrossDividends;
  }
  public tblnz_rtniitnr with_fcurTotalGrossDividends(java.math.BigDecimal fcurTotalGrossDividends) {
    this.fcurTotalGrossDividends = fcurTotalGrossDividends;
    return this;
  }
  private java.math.BigDecimal fcurNRWTDividend;
  public java.math.BigDecimal get_fcurNRWTDividend() {
    return fcurNRWTDividend;
  }
  public void set_fcurNRWTDividend(java.math.BigDecimal fcurNRWTDividend) {
    this.fcurNRWTDividend = fcurNRWTDividend;
  }
  public tblnz_rtniitnr with_fcurNRWTDividend(java.math.BigDecimal fcurNRWTDividend) {
    this.fcurNRWTDividend = fcurNRWTDividend;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxRoyalty;
  public java.math.BigDecimal get_fcurTotalTaxRoyalty() {
    return fcurTotalTaxRoyalty;
  }
  public void set_fcurTotalTaxRoyalty(java.math.BigDecimal fcurTotalTaxRoyalty) {
    this.fcurTotalTaxRoyalty = fcurTotalTaxRoyalty;
  }
  public tblnz_rtniitnr with_fcurTotalTaxRoyalty(java.math.BigDecimal fcurTotalTaxRoyalty) {
    this.fcurTotalTaxRoyalty = fcurTotalTaxRoyalty;
    return this;
  }
  private java.math.BigDecimal fcurTotalGrossRoyalty;
  public java.math.BigDecimal get_fcurTotalGrossRoyalty() {
    return fcurTotalGrossRoyalty;
  }
  public void set_fcurTotalGrossRoyalty(java.math.BigDecimal fcurTotalGrossRoyalty) {
    this.fcurTotalGrossRoyalty = fcurTotalGrossRoyalty;
  }
  public tblnz_rtniitnr with_fcurTotalGrossRoyalty(java.math.BigDecimal fcurTotalGrossRoyalty) {
    this.fcurTotalGrossRoyalty = fcurTotalGrossRoyalty;
    return this;
  }
  private java.math.BigDecimal fcurNRWTRoyalty;
  public java.math.BigDecimal get_fcurNRWTRoyalty() {
    return fcurNRWTRoyalty;
  }
  public void set_fcurNRWTRoyalty(java.math.BigDecimal fcurNRWTRoyalty) {
    this.fcurNRWTRoyalty = fcurNRWTRoyalty;
  }
  public tblnz_rtniitnr with_fcurNRWTRoyalty(java.math.BigDecimal fcurNRWTRoyalty) {
    this.fcurNRWTRoyalty = fcurNRWTRoyalty;
    return this;
  }
  private java.math.BigDecimal fcurNRWTTaxCredits;
  public java.math.BigDecimal get_fcurNRWTTaxCredits() {
    return fcurNRWTTaxCredits;
  }
  public void set_fcurNRWTTaxCredits(java.math.BigDecimal fcurNRWTTaxCredits) {
    this.fcurNRWTTaxCredits = fcurNRWTTaxCredits;
  }
  public tblnz_rtniitnr with_fcurNRWTTaxCredits(java.math.BigDecimal fcurNRWTTaxCredits) {
    this.fcurNRWTTaxCredits = fcurNRWTTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalNRWT;
  public java.math.BigDecimal get_fcurTotalNRWT() {
    return fcurTotalNRWT;
  }
  public void set_fcurTotalNRWT(java.math.BigDecimal fcurTotalNRWT) {
    this.fcurTotalNRWT = fcurTotalNRWT;
  }
  public tblnz_rtniitnr with_fcurTotalNRWT(java.math.BigDecimal fcurTotalNRWT) {
    this.fcurTotalNRWT = fcurTotalNRWT;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxDeductions;
  public java.math.BigDecimal get_fcurTotalTaxDeductions() {
    return fcurTotalTaxDeductions;
  }
  public void set_fcurTotalTaxDeductions(java.math.BigDecimal fcurTotalTaxDeductions) {
    this.fcurTotalTaxDeductions = fcurTotalTaxDeductions;
  }
  public tblnz_rtniitnr with_fcurTotalTaxDeductions(java.math.BigDecimal fcurTotalTaxDeductions) {
    this.fcurTotalTaxDeductions = fcurTotalTaxDeductions;
    return this;
  }
  private java.math.BigDecimal fcurTotalGrossIncome;
  public java.math.BigDecimal get_fcurTotalGrossIncome() {
    return fcurTotalGrossIncome;
  }
  public void set_fcurTotalGrossIncome(java.math.BigDecimal fcurTotalGrossIncome) {
    this.fcurTotalGrossIncome = fcurTotalGrossIncome;
  }
  public tblnz_rtniitnr with_fcurTotalGrossIncome(java.math.BigDecimal fcurTotalGrossIncome) {
    this.fcurTotalGrossIncome = fcurTotalGrossIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalMaoriCredits;
  public java.math.BigDecimal get_fcurTotalMaoriCredits() {
    return fcurTotalMaoriCredits;
  }
  public void set_fcurTotalMaoriCredits(java.math.BigDecimal fcurTotalMaoriCredits) {
    this.fcurTotalMaoriCredits = fcurTotalMaoriCredits;
  }
  public tblnz_rtniitnr with_fcurTotalMaoriCredits(java.math.BigDecimal fcurTotalMaoriCredits) {
    this.fcurTotalMaoriCredits = fcurTotalMaoriCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalMaoriDistributions;
  public java.math.BigDecimal get_fcurTotalMaoriDistributions() {
    return fcurTotalMaoriDistributions;
  }
  public void set_fcurTotalMaoriDistributions(java.math.BigDecimal fcurTotalMaoriDistributions) {
    this.fcurTotalMaoriDistributions = fcurTotalMaoriDistributions;
  }
  public tblnz_rtniitnr with_fcurTotalMaoriDistributions(java.math.BigDecimal fcurTotalMaoriDistributions) {
    this.fcurTotalMaoriDistributions = fcurTotalMaoriDistributions;
    return this;
  }
  private java.math.BigDecimal fcurTotalPartnershipTaxCredits;
  public java.math.BigDecimal get_fcurTotalPartnershipTaxCredits() {
    return fcurTotalPartnershipTaxCredits;
  }
  public void set_fcurTotalPartnershipTaxCredits(java.math.BigDecimal fcurTotalPartnershipTaxCredits) {
    this.fcurTotalPartnershipTaxCredits = fcurTotalPartnershipTaxCredits;
  }
  public tblnz_rtniitnr with_fcurTotalPartnershipTaxCredits(java.math.BigDecimal fcurTotalPartnershipTaxCredits) {
    this.fcurTotalPartnershipTaxCredits = fcurTotalPartnershipTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalPartnershipIncome;
  public java.math.BigDecimal get_fcurTotalPartnershipIncome() {
    return fcurTotalPartnershipIncome;
  }
  public void set_fcurTotalPartnershipIncome(java.math.BigDecimal fcurTotalPartnershipIncome) {
    this.fcurTotalPartnershipIncome = fcurTotalPartnershipIncome;
  }
  public tblnz_rtniitnr with_fcurTotalPartnershipIncome(java.math.BigDecimal fcurTotalPartnershipIncome) {
    this.fcurTotalPartnershipIncome = fcurTotalPartnershipIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalEstateTrustTaxCredits;
  public java.math.BigDecimal get_fcurTotalEstateTrustTaxCredits() {
    return fcurTotalEstateTrustTaxCredits;
  }
  public void set_fcurTotalEstateTrustTaxCredits(java.math.BigDecimal fcurTotalEstateTrustTaxCredits) {
    this.fcurTotalEstateTrustTaxCredits = fcurTotalEstateTrustTaxCredits;
  }
  public tblnz_rtniitnr with_fcurTotalEstateTrustTaxCredits(java.math.BigDecimal fcurTotalEstateTrustTaxCredits) {
    this.fcurTotalEstateTrustTaxCredits = fcurTotalEstateTrustTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalEstateTrustIncome;
  public java.math.BigDecimal get_fcurTotalEstateTrustIncome() {
    return fcurTotalEstateTrustIncome;
  }
  public void set_fcurTotalEstateTrustIncome(java.math.BigDecimal fcurTotalEstateTrustIncome) {
    this.fcurTotalEstateTrustIncome = fcurTotalEstateTrustIncome;
  }
  public tblnz_rtniitnr with_fcurTotalEstateTrustIncome(java.math.BigDecimal fcurTotalEstateTrustIncome) {
    this.fcurTotalEstateTrustIncome = fcurTotalEstateTrustIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalLTCTaxCredits;
  public java.math.BigDecimal get_fcurTotalLTCTaxCredits() {
    return fcurTotalLTCTaxCredits;
  }
  public void set_fcurTotalLTCTaxCredits(java.math.BigDecimal fcurTotalLTCTaxCredits) {
    this.fcurTotalLTCTaxCredits = fcurTotalLTCTaxCredits;
  }
  public tblnz_rtniitnr with_fcurTotalLTCTaxCredits(java.math.BigDecimal fcurTotalLTCTaxCredits) {
    this.fcurTotalLTCTaxCredits = fcurTotalLTCTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalActiveLTCIncome;
  public java.math.BigDecimal get_fcurTotalActiveLTCIncome() {
    return fcurTotalActiveLTCIncome;
  }
  public void set_fcurTotalActiveLTCIncome(java.math.BigDecimal fcurTotalActiveLTCIncome) {
    this.fcurTotalActiveLTCIncome = fcurTotalActiveLTCIncome;
  }
  public tblnz_rtniitnr with_fcurTotalActiveLTCIncome(java.math.BigDecimal fcurTotalActiveLTCIncome) {
    this.fcurTotalActiveLTCIncome = fcurTotalActiveLTCIncome;
    return this;
  }
  private java.math.BigDecimal fcurNonAllowDedThisYr;
  public java.math.BigDecimal get_fcurNonAllowDedThisYr() {
    return fcurNonAllowDedThisYr;
  }
  public void set_fcurNonAllowDedThisYr(java.math.BigDecimal fcurNonAllowDedThisYr) {
    this.fcurNonAllowDedThisYr = fcurNonAllowDedThisYr;
  }
  public tblnz_rtniitnr with_fcurNonAllowDedThisYr(java.math.BigDecimal fcurNonAllowDedThisYr) {
    this.fcurNonAllowDedThisYr = fcurNonAllowDedThisYr;
    return this;
  }
  private java.math.BigDecimal fcurNonAllowDedPrvYr;
  public java.math.BigDecimal get_fcurNonAllowDedPrvYr() {
    return fcurNonAllowDedPrvYr;
  }
  public void set_fcurNonAllowDedPrvYr(java.math.BigDecimal fcurNonAllowDedPrvYr) {
    this.fcurNonAllowDedPrvYr = fcurNonAllowDedPrvYr;
  }
  public tblnz_rtniitnr with_fcurNonAllowDedPrvYr(java.math.BigDecimal fcurNonAllowDedPrvYr) {
    this.fcurNonAllowDedPrvYr = fcurNonAllowDedPrvYr;
    return this;
  }
  private java.math.BigDecimal fcurAdjustedLTCIncome;
  public java.math.BigDecimal get_fcurAdjustedLTCIncome() {
    return fcurAdjustedLTCIncome;
  }
  public void set_fcurAdjustedLTCIncome(java.math.BigDecimal fcurAdjustedLTCIncome) {
    this.fcurAdjustedLTCIncome = fcurAdjustedLTCIncome;
  }
  public tblnz_rtniitnr with_fcurAdjustedLTCIncome(java.math.BigDecimal fcurAdjustedLTCIncome) {
    this.fcurAdjustedLTCIncome = fcurAdjustedLTCIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherCredits;
  public java.math.BigDecimal get_fcurTotalOtherCredits() {
    return fcurTotalOtherCredits;
  }
  public void set_fcurTotalOtherCredits(java.math.BigDecimal fcurTotalOtherCredits) {
    this.fcurTotalOtherCredits = fcurTotalOtherCredits;
  }
  public tblnz_rtniitnr with_fcurTotalOtherCredits(java.math.BigDecimal fcurTotalOtherCredits) {
    this.fcurTotalOtherCredits = fcurTotalOtherCredits;
    return this;
  }
  private java.math.BigDecimal fcurOtherIncomeSubtotal;
  public java.math.BigDecimal get_fcurOtherIncomeSubtotal() {
    return fcurOtherIncomeSubtotal;
  }
  public void set_fcurOtherIncomeSubtotal(java.math.BigDecimal fcurOtherIncomeSubtotal) {
    this.fcurOtherIncomeSubtotal = fcurOtherIncomeSubtotal;
  }
  public tblnz_rtniitnr with_fcurOtherIncomeSubtotal(java.math.BigDecimal fcurOtherIncomeSubtotal) {
    this.fcurOtherIncomeSubtotal = fcurOtherIncomeSubtotal;
    return this;
  }
  private java.math.BigDecimal fcurNetRents;
  public java.math.BigDecimal get_fcurNetRents() {
    return fcurNetRents;
  }
  public void set_fcurNetRents(java.math.BigDecimal fcurNetRents) {
    this.fcurNetRents = fcurNetRents;
  }
  public tblnz_rtniitnr with_fcurNetRents(java.math.BigDecimal fcurNetRents) {
    this.fcurNetRents = fcurNetRents;
    return this;
  }
  private java.math.BigDecimal fcurNetSelfEmployedIncome;
  public java.math.BigDecimal get_fcurNetSelfEmployedIncome() {
    return fcurNetSelfEmployedIncome;
  }
  public void set_fcurNetSelfEmployedIncome(java.math.BigDecimal fcurNetSelfEmployedIncome) {
    this.fcurNetSelfEmployedIncome = fcurNetSelfEmployedIncome;
  }
  public tblnz_rtniitnr with_fcurNetSelfEmployedIncome(java.math.BigDecimal fcurNetSelfEmployedIncome) {
    this.fcurNetSelfEmployedIncome = fcurNetSelfEmployedIncome;
    return this;
  }
  private java.math.BigDecimal fcurAnyOtherIncome;
  public java.math.BigDecimal get_fcurAnyOtherIncome() {
    return fcurAnyOtherIncome;
  }
  public void set_fcurAnyOtherIncome(java.math.BigDecimal fcurAnyOtherIncome) {
    this.fcurAnyOtherIncome = fcurAnyOtherIncome;
  }
  public tblnz_rtniitnr with_fcurAnyOtherIncome(java.math.BigDecimal fcurAnyOtherIncome) {
    this.fcurAnyOtherIncome = fcurAnyOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurRLWTCredit;
  public java.math.BigDecimal get_fcurRLWTCredit() {
    return fcurRLWTCredit;
  }
  public void set_fcurRLWTCredit(java.math.BigDecimal fcurRLWTCredit) {
    this.fcurRLWTCredit = fcurRLWTCredit;
  }
  public tblnz_rtniitnr with_fcurRLWTCredit(java.math.BigDecimal fcurRLWTCredit) {
    this.fcurRLWTCredit = fcurRLWTCredit;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherIncome;
  public java.math.BigDecimal get_fcurTotalOtherIncome() {
    return fcurTotalOtherIncome;
  }
  public void set_fcurTotalOtherIncome(java.math.BigDecimal fcurTotalOtherIncome) {
    this.fcurTotalOtherIncome = fcurTotalOtherIncome;
  }
  public tblnz_rtniitnr with_fcurTotalOtherIncome(java.math.BigDecimal fcurTotalOtherIncome) {
    this.fcurTotalOtherIncome = fcurTotalOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherExpenses;
  public java.math.BigDecimal get_fcurTotalOtherExpenses() {
    return fcurTotalOtherExpenses;
  }
  public void set_fcurTotalOtherExpenses(java.math.BigDecimal fcurTotalOtherExpenses) {
    this.fcurTotalOtherExpenses = fcurTotalOtherExpenses;
  }
  public tblnz_rtniitnr with_fcurTotalOtherExpenses(java.math.BigDecimal fcurTotalOtherExpenses) {
    this.fcurTotalOtherExpenses = fcurTotalOtherExpenses;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAfterExpenses;
  public java.math.BigDecimal get_fcurIncomeAfterExpenses() {
    return fcurIncomeAfterExpenses;
  }
  public void set_fcurIncomeAfterExpenses(java.math.BigDecimal fcurIncomeAfterExpenses) {
    this.fcurIncomeAfterExpenses = fcurIncomeAfterExpenses;
  }
  public tblnz_rtniitnr with_fcurIncomeAfterExpenses(java.math.BigDecimal fcurIncomeAfterExpenses) {
    this.fcurIncomeAfterExpenses = fcurIncomeAfterExpenses;
    return this;
  }
  private java.math.BigDecimal fcurLossBroughtForward;
  public java.math.BigDecimal get_fcurLossBroughtForward() {
    return fcurLossBroughtForward;
  }
  public void set_fcurLossBroughtForward(java.math.BigDecimal fcurLossBroughtForward) {
    this.fcurLossBroughtForward = fcurLossBroughtForward;
  }
  public tblnz_rtniitnr with_fcurLossBroughtForward(java.math.BigDecimal fcurLossBroughtForward) {
    this.fcurLossBroughtForward = fcurLossBroughtForward;
    return this;
  }
  private java.math.BigDecimal fcurTotalLossClaimed;
  public java.math.BigDecimal get_fcurTotalLossClaimed() {
    return fcurTotalLossClaimed;
  }
  public void set_fcurTotalLossClaimed(java.math.BigDecimal fcurTotalLossClaimed) {
    this.fcurTotalLossClaimed = fcurTotalLossClaimed;
  }
  public tblnz_rtniitnr with_fcurTotalLossClaimed(java.math.BigDecimal fcurTotalLossClaimed) {
    this.fcurTotalLossClaimed = fcurTotalLossClaimed;
    return this;
  }
  private java.math.BigDecimal fcurTaxableIncome;
  public java.math.BigDecimal get_fcurTaxableIncome() {
    return fcurTaxableIncome;
  }
  public void set_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
  }
  public tblnz_rtniitnr with_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
    return this;
  }
  private java.math.BigDecimal fcurAdjustedTaxableIncome;
  public java.math.BigDecimal get_fcurAdjustedTaxableIncome() {
    return fcurAdjustedTaxableIncome;
  }
  public void set_fcurAdjustedTaxableIncome(java.math.BigDecimal fcurAdjustedTaxableIncome) {
    this.fcurAdjustedTaxableIncome = fcurAdjustedTaxableIncome;
  }
  public tblnz_rtniitnr with_fcurAdjustedTaxableIncome(java.math.BigDecimal fcurAdjustedTaxableIncome) {
    this.fcurAdjustedTaxableIncome = fcurAdjustedTaxableIncome;
    return this;
  }
  private Integer fblnWorkedInNZ;
  public Integer get_fblnWorkedInNZ() {
    return fblnWorkedInNZ;
  }
  public void set_fblnWorkedInNZ(Integer fblnWorkedInNZ) {
    this.fblnWorkedInNZ = fblnWorkedInNZ;
  }
  public tblnz_rtniitnr with_fblnWorkedInNZ(Integer fblnWorkedInNZ) {
    this.fblnWorkedInNZ = fblnWorkedInNZ;
    return this;
  }
  private java.math.BigDecimal fcurTaxOnTaxableIncome;
  public java.math.BigDecimal get_fcurTaxOnTaxableIncome() {
    return fcurTaxOnTaxableIncome;
  }
  public void set_fcurTaxOnTaxableIncome(java.math.BigDecimal fcurTaxOnTaxableIncome) {
    this.fcurTaxOnTaxableIncome = fcurTaxOnTaxableIncome;
  }
  public tblnz_rtniitnr with_fcurTaxOnTaxableIncome(java.math.BigDecimal fcurTaxOnTaxableIncome) {
    this.fcurTaxOnTaxableIncome = fcurTaxOnTaxableIncome;
    return this;
  }
  private java.math.BigDecimal fcurOthIncTaxAndNRWT;
  public java.math.BigDecimal get_fcurOthIncTaxAndNRWT() {
    return fcurOthIncTaxAndNRWT;
  }
  public void set_fcurOthIncTaxAndNRWT(java.math.BigDecimal fcurOthIncTaxAndNRWT) {
    this.fcurOthIncTaxAndNRWT = fcurOthIncTaxAndNRWT;
  }
  public tblnz_rtniitnr with_fcurOthIncTaxAndNRWT(java.math.BigDecimal fcurOthIncTaxAndNRWT) {
    this.fcurOthIncTaxAndNRWT = fcurOthIncTaxAndNRWT;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxCredits;
  public java.math.BigDecimal get_fcurTotalTaxCredits() {
    return fcurTotalTaxCredits;
  }
  public void set_fcurTotalTaxCredits(java.math.BigDecimal fcurTotalTaxCredits) {
    this.fcurTotalTaxCredits = fcurTotalTaxCredits;
  }
  public tblnz_rtniitnr with_fcurTotalTaxCredits(java.math.BigDecimal fcurTotalTaxCredits) {
    this.fcurTotalTaxCredits = fcurTotalTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurResidualIncomeTax;
  public java.math.BigDecimal get_fcurResidualIncomeTax() {
    return fcurResidualIncomeTax;
  }
  public void set_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
  }
  public tblnz_rtniitnr with_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
    return this;
  }
  private java.math.BigDecimal fcurProvTaxPaid;
  public java.math.BigDecimal get_fcurProvTaxPaid() {
    return fcurProvTaxPaid;
  }
  public void set_fcurProvTaxPaid(java.math.BigDecimal fcurProvTaxPaid) {
    this.fcurProvTaxPaid = fcurProvTaxPaid;
  }
  public tblnz_rtniitnr with_fcurProvTaxPaid(java.math.BigDecimal fcurProvTaxPaid) {
    this.fcurProvTaxPaid = fcurProvTaxPaid;
    return this;
  }
  private java.math.BigDecimal fcurRefundOrTax;
  public java.math.BigDecimal get_fcurRefundOrTax() {
    return fcurRefundOrTax;
  }
  public void set_fcurRefundOrTax(java.math.BigDecimal fcurRefundOrTax) {
    this.fcurRefundOrTax = fcurRefundOrTax;
  }
  public tblnz_rtniitnr with_fcurRefundOrTax(java.math.BigDecimal fcurRefundOrTax) {
    this.fcurRefundOrTax = fcurRefundOrTax;
    return this;
  }
  private java.math.BigDecimal fcurRefund;
  public java.math.BigDecimal get_fcurRefund() {
    return fcurRefund;
  }
  public void set_fcurRefund(java.math.BigDecimal fcurRefund) {
    this.fcurRefund = fcurRefund;
  }
  public tblnz_rtniitnr with_fcurRefund(java.math.BigDecimal fcurRefund) {
    this.fcurRefund = fcurRefund;
    return this;
  }
  private java.math.BigDecimal fcurProvTaxOverpayment;
  public java.math.BigDecimal get_fcurProvTaxOverpayment() {
    return fcurProvTaxOverpayment;
  }
  public void set_fcurProvTaxOverpayment(java.math.BigDecimal fcurProvTaxOverpayment) {
    this.fcurProvTaxOverpayment = fcurProvTaxOverpayment;
  }
  public tblnz_rtniitnr with_fcurProvTaxOverpayment(java.math.BigDecimal fcurProvTaxOverpayment) {
    this.fcurProvTaxOverpayment = fcurProvTaxOverpayment;
    return this;
  }
  private java.math.BigDecimal fcurTotalRefund;
  public java.math.BigDecimal get_fcurTotalRefund() {
    return fcurTotalRefund;
  }
  public void set_fcurTotalRefund(java.math.BigDecimal fcurTotalRefund) {
    this.fcurTotalRefund = fcurTotalRefund;
  }
  public tblnz_rtniitnr with_fcurTotalRefund(java.math.BigDecimal fcurTotalRefund) {
    this.fcurTotalRefund = fcurTotalRefund;
    return this;
  }
  private java.math.BigDecimal fcurRemainingRefund;
  public java.math.BigDecimal get_fcurRemainingRefund() {
    return fcurRemainingRefund;
  }
  public void set_fcurRemainingRefund(java.math.BigDecimal fcurRemainingRefund) {
    this.fcurRemainingRefund = fcurRemainingRefund;
  }
  public tblnz_rtniitnr with_fcurRemainingRefund(java.math.BigDecimal fcurRemainingRefund) {
    this.fcurRemainingRefund = fcurRemainingRefund;
    return this;
  }
  private java.math.BigDecimal fcurProvisionalTax;
  public java.math.BigDecimal get_fcurProvisionalTax() {
    return fcurProvisionalTax;
  }
  public void set_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
    this.fcurProvisionalTax = fcurProvisionalTax;
  }
  public tblnz_rtniitnr with_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
    this.fcurProvisionalTax = fcurProvisionalTax;
    return this;
  }
  private java.math.BigDecimal fcurLossToCarryForward;
  public java.math.BigDecimal get_fcurLossToCarryForward() {
    return fcurLossToCarryForward;
  }
  public void set_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
  }
  public tblnz_rtniitnr with_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
    return this;
  }
  private java.math.BigDecimal fcurImputationToCarryForward;
  public java.math.BigDecimal get_fcurImputationToCarryForward() {
    return fcurImputationToCarryForward;
  }
  public void set_fcurImputationToCarryForward(java.math.BigDecimal fcurImputationToCarryForward) {
    this.fcurImputationToCarryForward = fcurImputationToCarryForward;
  }
  public tblnz_rtniitnr with_fcurImputationToCarryForward(java.math.BigDecimal fcurImputationToCarryForward) {
    this.fcurImputationToCarryForward = fcurImputationToCarryForward;
    return this;
  }
  private java.math.BigDecimal fcurExcessImputationCredits;
  public java.math.BigDecimal get_fcurExcessImputationCredits() {
    return fcurExcessImputationCredits;
  }
  public void set_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
  }
  public tblnz_rtniitnr with_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
    return this;
  }
  private Integer flngSelectGroup;
  public Integer get_flngSelectGroup() {
    return flngSelectGroup;
  }
  public void set_flngSelectGroup(Integer flngSelectGroup) {
    this.flngSelectGroup = flngSelectGroup;
  }
  public tblnz_rtniitnr with_flngSelectGroup(Integer flngSelectGroup) {
    this.flngSelectGroup = flngSelectGroup;
    return this;
  }
  private java.sql.Timestamp fdtmSelectDate;
  public java.sql.Timestamp get_fdtmSelectDate() {
    return fdtmSelectDate;
  }
  public void set_fdtmSelectDate(java.sql.Timestamp fdtmSelectDate) {
    this.fdtmSelectDate = fdtmSelectDate;
  }
  public tblnz_rtniitnr with_fdtmSelectDate(java.sql.Timestamp fdtmSelectDate) {
    this.fdtmSelectDate = fdtmSelectDate;
    return this;
  }
  private Integer fblnGroup2Suspend;
  public Integer get_fblnGroup2Suspend() {
    return fblnGroup2Suspend;
  }
  public void set_fblnGroup2Suspend(Integer fblnGroup2Suspend) {
    this.fblnGroup2Suspend = fblnGroup2Suspend;
  }
  public tblnz_rtniitnr with_fblnGroup2Suspend(Integer fblnGroup2Suspend) {
    this.fblnGroup2Suspend = fblnGroup2Suspend;
    return this;
  }
  private String fstrResMethod;
  public String get_fstrResMethod() {
    return fstrResMethod;
  }
  public void set_fstrResMethod(String fstrResMethod) {
    this.fstrResMethod = fstrResMethod;
  }
  public tblnz_rtniitnr with_fstrResMethod(String fstrResMethod) {
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
  public tblnz_rtniitnr with_fcurResIncome(java.math.BigDecimal fcurResIncome) {
    this.fcurResIncome = fcurResIncome;
    return this;
  }
  private java.math.BigDecimal fcurResDeductions;
  public java.math.BigDecimal get_fcurResDeductions() {
    return fcurResDeductions;
  }
  public void set_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
    this.fcurResDeductions = fcurResDeductions;
  }
  public tblnz_rtniitnr with_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
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
  public tblnz_rtniitnr with_fcurResDeductionsPriorYear(java.math.BigDecimal fcurResDeductionsPriorYear) {
    this.fcurResDeductionsPriorYear = fcurResDeductionsPriorYear;
    return this;
  }
  private java.math.BigDecimal fcurResDeductionsClaimed;
  public java.math.BigDecimal get_fcurResDeductionsClaimed() {
    return fcurResDeductionsClaimed;
  }
  public void set_fcurResDeductionsClaimed(java.math.BigDecimal fcurResDeductionsClaimed) {
    this.fcurResDeductionsClaimed = fcurResDeductionsClaimed;
  }
  public tblnz_rtniitnr with_fcurResDeductionsClaimed(java.math.BigDecimal fcurResDeductionsClaimed) {
    this.fcurResDeductionsClaimed = fcurResDeductionsClaimed;
    return this;
  }
  private java.math.BigDecimal fcurResNetIncome;
  public java.math.BigDecimal get_fcurResNetIncome() {
    return fcurResNetIncome;
  }
  public void set_fcurResNetIncome(java.math.BigDecimal fcurResNetIncome) {
    this.fcurResNetIncome = fcurResNetIncome;
  }
  public tblnz_rtniitnr with_fcurResNetIncome(java.math.BigDecimal fcurResNetIncome) {
    this.fcurResNetIncome = fcurResNetIncome;
    return this;
  }
  private java.math.BigDecimal fcurResDeductionsForward;
  public java.math.BigDecimal get_fcurResDeductionsForward() {
    return fcurResDeductionsForward;
  }
  public void set_fcurResDeductionsForward(java.math.BigDecimal fcurResDeductionsForward) {
    this.fcurResDeductionsForward = fcurResDeductionsForward;
  }
  public tblnz_rtniitnr with_fcurResDeductionsForward(java.math.BigDecimal fcurResDeductionsForward) {
    this.fcurResDeductionsForward = fcurResDeductionsForward;
    return this;
  }
  private java.math.BigDecimal fcurRDICarryForwardCurrentYear;
  public java.math.BigDecimal get_fcurRDICarryForwardCurrentYear() {
    return fcurRDICarryForwardCurrentYear;
  }
  public void set_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
    this.fcurRDICarryForwardCurrentYear = fcurRDICarryForwardCurrentYear;
  }
  public tblnz_rtniitnr with_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
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
  public tblnz_rtniitnr with_fcurRDICarryForwardRemaining(java.math.BigDecimal fcurRDICarryForwardRemaining) {
    this.fcurRDICarryForwardRemaining = fcurRDICarryForwardRemaining;
    return this;
  }
  private java.math.BigDecimal fcurSaleOfProperty;
  public java.math.BigDecimal get_fcurSaleOfProperty() {
    return fcurSaleOfProperty;
  }
  public void set_fcurSaleOfProperty(java.math.BigDecimal fcurSaleOfProperty) {
    this.fcurSaleOfProperty = fcurSaleOfProperty;
  }
  public tblnz_rtniitnr with_fcurSaleOfProperty(java.math.BigDecimal fcurSaleOfProperty) {
    this.fcurSaleOfProperty = fcurSaleOfProperty;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtniitnr with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tblnz_rtniitnr with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitnr)) {
      return false;
    }
    tblnz_rtniitnr that = (tblnz_rtniitnr) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTotalRWT == null ? that.fcurTotalRWT == null : this.fcurTotalRWT.equals(that.fcurTotalRWT));
    equal = equal && (this.fcurTotalGrossInterest == null ? that.fcurTotalGrossInterest == null : this.fcurTotalGrossInterest.equals(that.fcurTotalGrossInterest));
    equal = equal && (this.fcurNRWTInterest == null ? that.fcurNRWTInterest == null : this.fcurNRWTInterest.equals(that.fcurNRWTInterest));
    equal = equal && (this.fcurTotalDividendCredit == null ? that.fcurTotalDividendCredit == null : this.fcurTotalDividendCredit.equals(that.fcurTotalDividendCredit));
    equal = equal && (this.fcurTotalGrossDividends == null ? that.fcurTotalGrossDividends == null : this.fcurTotalGrossDividends.equals(that.fcurTotalGrossDividends));
    equal = equal && (this.fcurNRWTDividend == null ? that.fcurNRWTDividend == null : this.fcurNRWTDividend.equals(that.fcurNRWTDividend));
    equal = equal && (this.fcurTotalTaxRoyalty == null ? that.fcurTotalTaxRoyalty == null : this.fcurTotalTaxRoyalty.equals(that.fcurTotalTaxRoyalty));
    equal = equal && (this.fcurTotalGrossRoyalty == null ? that.fcurTotalGrossRoyalty == null : this.fcurTotalGrossRoyalty.equals(that.fcurTotalGrossRoyalty));
    equal = equal && (this.fcurNRWTRoyalty == null ? that.fcurNRWTRoyalty == null : this.fcurNRWTRoyalty.equals(that.fcurNRWTRoyalty));
    equal = equal && (this.fcurNRWTTaxCredits == null ? that.fcurNRWTTaxCredits == null : this.fcurNRWTTaxCredits.equals(that.fcurNRWTTaxCredits));
    equal = equal && (this.fcurTotalNRWT == null ? that.fcurTotalNRWT == null : this.fcurTotalNRWT.equals(that.fcurTotalNRWT));
    equal = equal && (this.fcurTotalTaxDeductions == null ? that.fcurTotalTaxDeductions == null : this.fcurTotalTaxDeductions.equals(that.fcurTotalTaxDeductions));
    equal = equal && (this.fcurTotalGrossIncome == null ? that.fcurTotalGrossIncome == null : this.fcurTotalGrossIncome.equals(that.fcurTotalGrossIncome));
    equal = equal && (this.fcurTotalMaoriCredits == null ? that.fcurTotalMaoriCredits == null : this.fcurTotalMaoriCredits.equals(that.fcurTotalMaoriCredits));
    equal = equal && (this.fcurTotalMaoriDistributions == null ? that.fcurTotalMaoriDistributions == null : this.fcurTotalMaoriDistributions.equals(that.fcurTotalMaoriDistributions));
    equal = equal && (this.fcurTotalPartnershipTaxCredits == null ? that.fcurTotalPartnershipTaxCredits == null : this.fcurTotalPartnershipTaxCredits.equals(that.fcurTotalPartnershipTaxCredits));
    equal = equal && (this.fcurTotalPartnershipIncome == null ? that.fcurTotalPartnershipIncome == null : this.fcurTotalPartnershipIncome.equals(that.fcurTotalPartnershipIncome));
    equal = equal && (this.fcurTotalEstateTrustTaxCredits == null ? that.fcurTotalEstateTrustTaxCredits == null : this.fcurTotalEstateTrustTaxCredits.equals(that.fcurTotalEstateTrustTaxCredits));
    equal = equal && (this.fcurTotalEstateTrustIncome == null ? that.fcurTotalEstateTrustIncome == null : this.fcurTotalEstateTrustIncome.equals(that.fcurTotalEstateTrustIncome));
    equal = equal && (this.fcurTotalLTCTaxCredits == null ? that.fcurTotalLTCTaxCredits == null : this.fcurTotalLTCTaxCredits.equals(that.fcurTotalLTCTaxCredits));
    equal = equal && (this.fcurTotalActiveLTCIncome == null ? that.fcurTotalActiveLTCIncome == null : this.fcurTotalActiveLTCIncome.equals(that.fcurTotalActiveLTCIncome));
    equal = equal && (this.fcurNonAllowDedThisYr == null ? that.fcurNonAllowDedThisYr == null : this.fcurNonAllowDedThisYr.equals(that.fcurNonAllowDedThisYr));
    equal = equal && (this.fcurNonAllowDedPrvYr == null ? that.fcurNonAllowDedPrvYr == null : this.fcurNonAllowDedPrvYr.equals(that.fcurNonAllowDedPrvYr));
    equal = equal && (this.fcurAdjustedLTCIncome == null ? that.fcurAdjustedLTCIncome == null : this.fcurAdjustedLTCIncome.equals(that.fcurAdjustedLTCIncome));
    equal = equal && (this.fcurTotalOtherCredits == null ? that.fcurTotalOtherCredits == null : this.fcurTotalOtherCredits.equals(that.fcurTotalOtherCredits));
    equal = equal && (this.fcurOtherIncomeSubtotal == null ? that.fcurOtherIncomeSubtotal == null : this.fcurOtherIncomeSubtotal.equals(that.fcurOtherIncomeSubtotal));
    equal = equal && (this.fcurNetRents == null ? that.fcurNetRents == null : this.fcurNetRents.equals(that.fcurNetRents));
    equal = equal && (this.fcurNetSelfEmployedIncome == null ? that.fcurNetSelfEmployedIncome == null : this.fcurNetSelfEmployedIncome.equals(that.fcurNetSelfEmployedIncome));
    equal = equal && (this.fcurAnyOtherIncome == null ? that.fcurAnyOtherIncome == null : this.fcurAnyOtherIncome.equals(that.fcurAnyOtherIncome));
    equal = equal && (this.fcurRLWTCredit == null ? that.fcurRLWTCredit == null : this.fcurRLWTCredit.equals(that.fcurRLWTCredit));
    equal = equal && (this.fcurTotalOtherIncome == null ? that.fcurTotalOtherIncome == null : this.fcurTotalOtherIncome.equals(that.fcurTotalOtherIncome));
    equal = equal && (this.fcurTotalOtherExpenses == null ? that.fcurTotalOtherExpenses == null : this.fcurTotalOtherExpenses.equals(that.fcurTotalOtherExpenses));
    equal = equal && (this.fcurIncomeAfterExpenses == null ? that.fcurIncomeAfterExpenses == null : this.fcurIncomeAfterExpenses.equals(that.fcurIncomeAfterExpenses));
    equal = equal && (this.fcurLossBroughtForward == null ? that.fcurLossBroughtForward == null : this.fcurLossBroughtForward.equals(that.fcurLossBroughtForward));
    equal = equal && (this.fcurTotalLossClaimed == null ? that.fcurTotalLossClaimed == null : this.fcurTotalLossClaimed.equals(that.fcurTotalLossClaimed));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurAdjustedTaxableIncome == null ? that.fcurAdjustedTaxableIncome == null : this.fcurAdjustedTaxableIncome.equals(that.fcurAdjustedTaxableIncome));
    equal = equal && (this.fblnWorkedInNZ == null ? that.fblnWorkedInNZ == null : this.fblnWorkedInNZ.equals(that.fblnWorkedInNZ));
    equal = equal && (this.fcurTaxOnTaxableIncome == null ? that.fcurTaxOnTaxableIncome == null : this.fcurTaxOnTaxableIncome.equals(that.fcurTaxOnTaxableIncome));
    equal = equal && (this.fcurOthIncTaxAndNRWT == null ? that.fcurOthIncTaxAndNRWT == null : this.fcurOthIncTaxAndNRWT.equals(that.fcurOthIncTaxAndNRWT));
    equal = equal && (this.fcurTotalTaxCredits == null ? that.fcurTotalTaxCredits == null : this.fcurTotalTaxCredits.equals(that.fcurTotalTaxCredits));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurProvTaxPaid == null ? that.fcurProvTaxPaid == null : this.fcurProvTaxPaid.equals(that.fcurProvTaxPaid));
    equal = equal && (this.fcurRefundOrTax == null ? that.fcurRefundOrTax == null : this.fcurRefundOrTax.equals(that.fcurRefundOrTax));
    equal = equal && (this.fcurRefund == null ? that.fcurRefund == null : this.fcurRefund.equals(that.fcurRefund));
    equal = equal && (this.fcurProvTaxOverpayment == null ? that.fcurProvTaxOverpayment == null : this.fcurProvTaxOverpayment.equals(that.fcurProvTaxOverpayment));
    equal = equal && (this.fcurTotalRefund == null ? that.fcurTotalRefund == null : this.fcurTotalRefund.equals(that.fcurTotalRefund));
    equal = equal && (this.fcurRemainingRefund == null ? that.fcurRemainingRefund == null : this.fcurRemainingRefund.equals(that.fcurRemainingRefund));
    equal = equal && (this.fcurProvisionalTax == null ? that.fcurProvisionalTax == null : this.fcurProvisionalTax.equals(that.fcurProvisionalTax));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fcurImputationToCarryForward == null ? that.fcurImputationToCarryForward == null : this.fcurImputationToCarryForward.equals(that.fcurImputationToCarryForward));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.flngSelectGroup == null ? that.flngSelectGroup == null : this.flngSelectGroup.equals(that.flngSelectGroup));
    equal = equal && (this.fdtmSelectDate == null ? that.fdtmSelectDate == null : this.fdtmSelectDate.equals(that.fdtmSelectDate));
    equal = equal && (this.fblnGroup2Suspend == null ? that.fblnGroup2Suspend == null : this.fblnGroup2Suspend.equals(that.fblnGroup2Suspend));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurResDeductionsForward == null ? that.fcurResDeductionsForward == null : this.fcurResDeductionsForward.equals(that.fcurResDeductionsForward));
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurSaleOfProperty == null ? that.fcurSaleOfProperty == null : this.fcurSaleOfProperty.equals(that.fcurSaleOfProperty));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitnr)) {
      return false;
    }
    tblnz_rtniitnr that = (tblnz_rtniitnr) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTotalRWT == null ? that.fcurTotalRWT == null : this.fcurTotalRWT.equals(that.fcurTotalRWT));
    equal = equal && (this.fcurTotalGrossInterest == null ? that.fcurTotalGrossInterest == null : this.fcurTotalGrossInterest.equals(that.fcurTotalGrossInterest));
    equal = equal && (this.fcurNRWTInterest == null ? that.fcurNRWTInterest == null : this.fcurNRWTInterest.equals(that.fcurNRWTInterest));
    equal = equal && (this.fcurTotalDividendCredit == null ? that.fcurTotalDividendCredit == null : this.fcurTotalDividendCredit.equals(that.fcurTotalDividendCredit));
    equal = equal && (this.fcurTotalGrossDividends == null ? that.fcurTotalGrossDividends == null : this.fcurTotalGrossDividends.equals(that.fcurTotalGrossDividends));
    equal = equal && (this.fcurNRWTDividend == null ? that.fcurNRWTDividend == null : this.fcurNRWTDividend.equals(that.fcurNRWTDividend));
    equal = equal && (this.fcurTotalTaxRoyalty == null ? that.fcurTotalTaxRoyalty == null : this.fcurTotalTaxRoyalty.equals(that.fcurTotalTaxRoyalty));
    equal = equal && (this.fcurTotalGrossRoyalty == null ? that.fcurTotalGrossRoyalty == null : this.fcurTotalGrossRoyalty.equals(that.fcurTotalGrossRoyalty));
    equal = equal && (this.fcurNRWTRoyalty == null ? that.fcurNRWTRoyalty == null : this.fcurNRWTRoyalty.equals(that.fcurNRWTRoyalty));
    equal = equal && (this.fcurNRWTTaxCredits == null ? that.fcurNRWTTaxCredits == null : this.fcurNRWTTaxCredits.equals(that.fcurNRWTTaxCredits));
    equal = equal && (this.fcurTotalNRWT == null ? that.fcurTotalNRWT == null : this.fcurTotalNRWT.equals(that.fcurTotalNRWT));
    equal = equal && (this.fcurTotalTaxDeductions == null ? that.fcurTotalTaxDeductions == null : this.fcurTotalTaxDeductions.equals(that.fcurTotalTaxDeductions));
    equal = equal && (this.fcurTotalGrossIncome == null ? that.fcurTotalGrossIncome == null : this.fcurTotalGrossIncome.equals(that.fcurTotalGrossIncome));
    equal = equal && (this.fcurTotalMaoriCredits == null ? that.fcurTotalMaoriCredits == null : this.fcurTotalMaoriCredits.equals(that.fcurTotalMaoriCredits));
    equal = equal && (this.fcurTotalMaoriDistributions == null ? that.fcurTotalMaoriDistributions == null : this.fcurTotalMaoriDistributions.equals(that.fcurTotalMaoriDistributions));
    equal = equal && (this.fcurTotalPartnershipTaxCredits == null ? that.fcurTotalPartnershipTaxCredits == null : this.fcurTotalPartnershipTaxCredits.equals(that.fcurTotalPartnershipTaxCredits));
    equal = equal && (this.fcurTotalPartnershipIncome == null ? that.fcurTotalPartnershipIncome == null : this.fcurTotalPartnershipIncome.equals(that.fcurTotalPartnershipIncome));
    equal = equal && (this.fcurTotalEstateTrustTaxCredits == null ? that.fcurTotalEstateTrustTaxCredits == null : this.fcurTotalEstateTrustTaxCredits.equals(that.fcurTotalEstateTrustTaxCredits));
    equal = equal && (this.fcurTotalEstateTrustIncome == null ? that.fcurTotalEstateTrustIncome == null : this.fcurTotalEstateTrustIncome.equals(that.fcurTotalEstateTrustIncome));
    equal = equal && (this.fcurTotalLTCTaxCredits == null ? that.fcurTotalLTCTaxCredits == null : this.fcurTotalLTCTaxCredits.equals(that.fcurTotalLTCTaxCredits));
    equal = equal && (this.fcurTotalActiveLTCIncome == null ? that.fcurTotalActiveLTCIncome == null : this.fcurTotalActiveLTCIncome.equals(that.fcurTotalActiveLTCIncome));
    equal = equal && (this.fcurNonAllowDedThisYr == null ? that.fcurNonAllowDedThisYr == null : this.fcurNonAllowDedThisYr.equals(that.fcurNonAllowDedThisYr));
    equal = equal && (this.fcurNonAllowDedPrvYr == null ? that.fcurNonAllowDedPrvYr == null : this.fcurNonAllowDedPrvYr.equals(that.fcurNonAllowDedPrvYr));
    equal = equal && (this.fcurAdjustedLTCIncome == null ? that.fcurAdjustedLTCIncome == null : this.fcurAdjustedLTCIncome.equals(that.fcurAdjustedLTCIncome));
    equal = equal && (this.fcurTotalOtherCredits == null ? that.fcurTotalOtherCredits == null : this.fcurTotalOtherCredits.equals(that.fcurTotalOtherCredits));
    equal = equal && (this.fcurOtherIncomeSubtotal == null ? that.fcurOtherIncomeSubtotal == null : this.fcurOtherIncomeSubtotal.equals(that.fcurOtherIncomeSubtotal));
    equal = equal && (this.fcurNetRents == null ? that.fcurNetRents == null : this.fcurNetRents.equals(that.fcurNetRents));
    equal = equal && (this.fcurNetSelfEmployedIncome == null ? that.fcurNetSelfEmployedIncome == null : this.fcurNetSelfEmployedIncome.equals(that.fcurNetSelfEmployedIncome));
    equal = equal && (this.fcurAnyOtherIncome == null ? that.fcurAnyOtherIncome == null : this.fcurAnyOtherIncome.equals(that.fcurAnyOtherIncome));
    equal = equal && (this.fcurRLWTCredit == null ? that.fcurRLWTCredit == null : this.fcurRLWTCredit.equals(that.fcurRLWTCredit));
    equal = equal && (this.fcurTotalOtherIncome == null ? that.fcurTotalOtherIncome == null : this.fcurTotalOtherIncome.equals(that.fcurTotalOtherIncome));
    equal = equal && (this.fcurTotalOtherExpenses == null ? that.fcurTotalOtherExpenses == null : this.fcurTotalOtherExpenses.equals(that.fcurTotalOtherExpenses));
    equal = equal && (this.fcurIncomeAfterExpenses == null ? that.fcurIncomeAfterExpenses == null : this.fcurIncomeAfterExpenses.equals(that.fcurIncomeAfterExpenses));
    equal = equal && (this.fcurLossBroughtForward == null ? that.fcurLossBroughtForward == null : this.fcurLossBroughtForward.equals(that.fcurLossBroughtForward));
    equal = equal && (this.fcurTotalLossClaimed == null ? that.fcurTotalLossClaimed == null : this.fcurTotalLossClaimed.equals(that.fcurTotalLossClaimed));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurAdjustedTaxableIncome == null ? that.fcurAdjustedTaxableIncome == null : this.fcurAdjustedTaxableIncome.equals(that.fcurAdjustedTaxableIncome));
    equal = equal && (this.fblnWorkedInNZ == null ? that.fblnWorkedInNZ == null : this.fblnWorkedInNZ.equals(that.fblnWorkedInNZ));
    equal = equal && (this.fcurTaxOnTaxableIncome == null ? that.fcurTaxOnTaxableIncome == null : this.fcurTaxOnTaxableIncome.equals(that.fcurTaxOnTaxableIncome));
    equal = equal && (this.fcurOthIncTaxAndNRWT == null ? that.fcurOthIncTaxAndNRWT == null : this.fcurOthIncTaxAndNRWT.equals(that.fcurOthIncTaxAndNRWT));
    equal = equal && (this.fcurTotalTaxCredits == null ? that.fcurTotalTaxCredits == null : this.fcurTotalTaxCredits.equals(that.fcurTotalTaxCredits));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurProvTaxPaid == null ? that.fcurProvTaxPaid == null : this.fcurProvTaxPaid.equals(that.fcurProvTaxPaid));
    equal = equal && (this.fcurRefundOrTax == null ? that.fcurRefundOrTax == null : this.fcurRefundOrTax.equals(that.fcurRefundOrTax));
    equal = equal && (this.fcurRefund == null ? that.fcurRefund == null : this.fcurRefund.equals(that.fcurRefund));
    equal = equal && (this.fcurProvTaxOverpayment == null ? that.fcurProvTaxOverpayment == null : this.fcurProvTaxOverpayment.equals(that.fcurProvTaxOverpayment));
    equal = equal && (this.fcurTotalRefund == null ? that.fcurTotalRefund == null : this.fcurTotalRefund.equals(that.fcurTotalRefund));
    equal = equal && (this.fcurRemainingRefund == null ? that.fcurRemainingRefund == null : this.fcurRemainingRefund.equals(that.fcurRemainingRefund));
    equal = equal && (this.fcurProvisionalTax == null ? that.fcurProvisionalTax == null : this.fcurProvisionalTax.equals(that.fcurProvisionalTax));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fcurImputationToCarryForward == null ? that.fcurImputationToCarryForward == null : this.fcurImputationToCarryForward.equals(that.fcurImputationToCarryForward));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.flngSelectGroup == null ? that.flngSelectGroup == null : this.flngSelectGroup.equals(that.flngSelectGroup));
    equal = equal && (this.fdtmSelectDate == null ? that.fdtmSelectDate == null : this.fdtmSelectDate.equals(that.fdtmSelectDate));
    equal = equal && (this.fblnGroup2Suspend == null ? that.fblnGroup2Suspend == null : this.fblnGroup2Suspend.equals(that.fblnGroup2Suspend));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurResDeductionsForward == null ? that.fcurResDeductionsForward == null : this.fcurResDeductionsForward.equals(that.fcurResDeductionsForward));
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurSaleOfProperty == null ? that.fcurSaleOfProperty == null : this.fcurSaleOfProperty.equals(that.fcurSaleOfProperty));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTotalRWT = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurTotalGrossInterest = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurNRWTInterest = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTotalDividendCredit = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurTotalGrossDividends = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurNRWTDividend = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalTaxRoyalty = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalGrossRoyalty = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurNRWTRoyalty = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurNRWTTaxCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalNRWT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalTaxDeductions = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalGrossIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalMaoriCredits = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalMaoriDistributions = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalPartnershipTaxCredits = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalPartnershipIncome = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalEstateTrustTaxCredits = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalEstateTrustIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurTotalLTCTaxCredits = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalActiveLTCIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurNonAllowDedThisYr = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurNonAllowDedPrvYr = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurAdjustedLTCIncome = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTotalOtherCredits = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOtherIncomeSubtotal = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetRents = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurNetSelfEmployedIncome = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurAnyOtherIncome = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurRLWTCredit = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurTotalOtherIncome = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurTotalOtherExpenses = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurIncomeAfterExpenses = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurLossBroughtForward = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurTotalLossClaimed = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurAdjustedTaxableIncome = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fblnWorkedInNZ = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fcurTaxOnTaxableIncome = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurOthIncTaxAndNRWT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurTotalTaxCredits = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurProvTaxPaid = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurRefundOrTax = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurRefund = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurProvTaxOverpayment = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurRemainingRefund = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurImputationToCarryForward = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.flngSelectGroup = JdbcWritableBridge.readInteger(54, __dbResults);
    this.fdtmSelectDate = JdbcWritableBridge.readTimestamp(55, __dbResults);
    this.fblnGroup2Suspend = JdbcWritableBridge.readInteger(56, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(57, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(67, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(68, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTotalRWT = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurTotalGrossInterest = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurNRWTInterest = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTotalDividendCredit = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurTotalGrossDividends = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurNRWTDividend = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalTaxRoyalty = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalGrossRoyalty = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurNRWTRoyalty = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurNRWTTaxCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalNRWT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalTaxDeductions = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalGrossIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalMaoriCredits = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalMaoriDistributions = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalPartnershipTaxCredits = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalPartnershipIncome = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalEstateTrustTaxCredits = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalEstateTrustIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurTotalLTCTaxCredits = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalActiveLTCIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurNonAllowDedThisYr = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurNonAllowDedPrvYr = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurAdjustedLTCIncome = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTotalOtherCredits = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOtherIncomeSubtotal = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetRents = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurNetSelfEmployedIncome = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurAnyOtherIncome = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurRLWTCredit = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurTotalOtherIncome = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurTotalOtherExpenses = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurIncomeAfterExpenses = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurLossBroughtForward = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurTotalLossClaimed = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurAdjustedTaxableIncome = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fblnWorkedInNZ = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fcurTaxOnTaxableIncome = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurOthIncTaxAndNRWT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurTotalTaxCredits = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurProvTaxPaid = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurRefundOrTax = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurRefund = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurProvTaxOverpayment = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurRemainingRefund = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurImputationToCarryForward = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.flngSelectGroup = JdbcWritableBridge.readInteger(54, __dbResults);
    this.fdtmSelectDate = JdbcWritableBridge.readTimestamp(55, __dbResults);
    this.fblnGroup2Suspend = JdbcWritableBridge.readInteger(56, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(57, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(67, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(68, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWT, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossInterest, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTInterest, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDividendCredit, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossDividends, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTDividend, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxRoyalty, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossRoyalty, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTRoyalty, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTTaxCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalNRWT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxDeductions, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMaoriCredits, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMaoriDistributions, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPartnershipTaxCredits, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPartnershipIncome, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalEstateTrustTaxCredits, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalEstateTrustIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLTCTaxCredits, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalActiveLTCIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonAllowDedThisYr, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonAllowDedPrvYr, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedLTCIncome, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherCredits, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncomeSubtotal, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetRents, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetSelfEmployedIncome, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAnyOtherIncome, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWTCredit, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherIncome, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherExpenses, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterExpenses, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossBroughtForward, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLossClaimed, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedTaxableIncome, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWorkedInNZ, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxOnTaxableIncome, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOthIncTaxAndNRWT, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCredits, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvTaxPaid, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundOrTax, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefund, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvTaxOverpayment, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemainingRefund, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationToCarryForward, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSelectGroup, 54 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSelectDate, 55 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGroup2Suspend, 56 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 57 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 67 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 68 + __off, 93, __dbStmt);
    return 68;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWT, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossInterest, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTInterest, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDividendCredit, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossDividends, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTDividend, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxRoyalty, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossRoyalty, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTRoyalty, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTTaxCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalNRWT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxDeductions, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMaoriCredits, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMaoriDistributions, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPartnershipTaxCredits, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPartnershipIncome, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalEstateTrustTaxCredits, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalEstateTrustIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLTCTaxCredits, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalActiveLTCIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonAllowDedThisYr, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonAllowDedPrvYr, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedLTCIncome, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherCredits, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncomeSubtotal, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetRents, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetSelfEmployedIncome, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAnyOtherIncome, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWTCredit, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherIncome, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherExpenses, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterExpenses, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossBroughtForward, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLossClaimed, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedTaxableIncome, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWorkedInNZ, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxOnTaxableIncome, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOthIncTaxAndNRWT, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCredits, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvTaxPaid, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundOrTax, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefund, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvTaxOverpayment, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemainingRefund, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationToCarryForward, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSelectGroup, 54 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSelectDate, 55 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGroup2Suspend, 56 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 57 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 67 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 68 + __off, 93, __dbStmt);
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
        this.fcurTotalRWT = null;
    } else {
    this.fcurTotalRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalGrossInterest = null;
    } else {
    this.fcurTotalGrossInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTInterest = null;
    } else {
    this.fcurNRWTInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalDividendCredit = null;
    } else {
    this.fcurTotalDividendCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalGrossDividends = null;
    } else {
    this.fcurTotalGrossDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTDividend = null;
    } else {
    this.fcurNRWTDividend = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxRoyalty = null;
    } else {
    this.fcurTotalTaxRoyalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalGrossRoyalty = null;
    } else {
    this.fcurTotalGrossRoyalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTRoyalty = null;
    } else {
    this.fcurNRWTRoyalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTTaxCredits = null;
    } else {
    this.fcurNRWTTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalNRWT = null;
    } else {
    this.fcurTotalNRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxDeductions = null;
    } else {
    this.fcurTotalTaxDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalGrossIncome = null;
    } else {
    this.fcurTotalGrossIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalMaoriCredits = null;
    } else {
    this.fcurTotalMaoriCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalMaoriDistributions = null;
    } else {
    this.fcurTotalMaoriDistributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPartnershipTaxCredits = null;
    } else {
    this.fcurTotalPartnershipTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPartnershipIncome = null;
    } else {
    this.fcurTotalPartnershipIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalEstateTrustTaxCredits = null;
    } else {
    this.fcurTotalEstateTrustTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalEstateTrustIncome = null;
    } else {
    this.fcurTotalEstateTrustIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalLTCTaxCredits = null;
    } else {
    this.fcurTotalLTCTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalActiveLTCIncome = null;
    } else {
    this.fcurTotalActiveLTCIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNonAllowDedThisYr = null;
    } else {
    this.fcurNonAllowDedThisYr = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNonAllowDedPrvYr = null;
    } else {
    this.fcurNonAllowDedPrvYr = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdjustedLTCIncome = null;
    } else {
    this.fcurAdjustedLTCIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOtherCredits = null;
    } else {
    this.fcurTotalOtherCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherIncomeSubtotal = null;
    } else {
    this.fcurOtherIncomeSubtotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetRents = null;
    } else {
    this.fcurNetRents = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetSelfEmployedIncome = null;
    } else {
    this.fcurNetSelfEmployedIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAnyOtherIncome = null;
    } else {
    this.fcurAnyOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRLWTCredit = null;
    } else {
    this.fcurRLWTCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOtherIncome = null;
    } else {
    this.fcurTotalOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOtherExpenses = null;
    } else {
    this.fcurTotalOtherExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAfterExpenses = null;
    } else {
    this.fcurIncomeAfterExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossBroughtForward = null;
    } else {
    this.fcurLossBroughtForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalLossClaimed = null;
    } else {
    this.fcurTotalLossClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxableIncome = null;
    } else {
    this.fcurTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdjustedTaxableIncome = null;
    } else {
    this.fcurAdjustedTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnWorkedInNZ = null;
    } else {
    this.fblnWorkedInNZ = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxOnTaxableIncome = null;
    } else {
    this.fcurTaxOnTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOthIncTaxAndNRWT = null;
    } else {
    this.fcurOthIncTaxAndNRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxCredits = null;
    } else {
    this.fcurTotalTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResidualIncomeTax = null;
    } else {
    this.fcurResidualIncomeTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvTaxPaid = null;
    } else {
    this.fcurProvTaxPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRefundOrTax = null;
    } else {
    this.fcurRefundOrTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRefund = null;
    } else {
    this.fcurRefund = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvTaxOverpayment = null;
    } else {
    this.fcurProvTaxOverpayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalRefund = null;
    } else {
    this.fcurTotalRefund = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRemainingRefund = null;
    } else {
    this.fcurRemainingRefund = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisionalTax = null;
    } else {
    this.fcurProvisionalTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossToCarryForward = null;
    } else {
    this.fcurLossToCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImputationToCarryForward = null;
    } else {
    this.fcurImputationToCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessImputationCredits = null;
    } else {
    this.fcurExcessImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngSelectGroup = null;
    } else {
    this.flngSelectGroup = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSelectDate = null;
    } else {
    this.fdtmSelectDate = new Timestamp(__dataIn.readLong());
    this.fdtmSelectDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnGroup2Suspend = null;
    } else {
    this.fblnGroup2Suspend = Integer.valueOf(__dataIn.readInt());
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
        this.fcurResDeductionsClaimed = null;
    } else {
    this.fcurResDeductionsClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResNetIncome = null;
    } else {
    this.fcurResNetIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResDeductionsForward = null;
    } else {
    this.fcurResDeductionsForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurSaleOfProperty = null;
    } else {
    this.fcurSaleOfProperty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fcurTotalRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWT, __dataOut);
    }
    if (null == this.fcurTotalGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossInterest, __dataOut);
    }
    if (null == this.fcurNRWTInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTInterest, __dataOut);
    }
    if (null == this.fcurTotalDividendCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDividendCredit, __dataOut);
    }
    if (null == this.fcurTotalGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossDividends, __dataOut);
    }
    if (null == this.fcurNRWTDividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTDividend, __dataOut);
    }
    if (null == this.fcurTotalTaxRoyalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxRoyalty, __dataOut);
    }
    if (null == this.fcurTotalGrossRoyalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossRoyalty, __dataOut);
    }
    if (null == this.fcurNRWTRoyalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTRoyalty, __dataOut);
    }
    if (null == this.fcurNRWTTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalNRWT, __dataOut);
    }
    if (null == this.fcurTotalTaxDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxDeductions, __dataOut);
    }
    if (null == this.fcurTotalGrossIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossIncome, __dataOut);
    }
    if (null == this.fcurTotalMaoriCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalMaoriCredits, __dataOut);
    }
    if (null == this.fcurTotalMaoriDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalMaoriDistributions, __dataOut);
    }
    if (null == this.fcurTotalPartnershipTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPartnershipTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalPartnershipIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPartnershipIncome, __dataOut);
    }
    if (null == this.fcurTotalEstateTrustTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalEstateTrustTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalEstateTrustIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalEstateTrustIncome, __dataOut);
    }
    if (null == this.fcurTotalLTCTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLTCTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalActiveLTCIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalActiveLTCIncome, __dataOut);
    }
    if (null == this.fcurNonAllowDedThisYr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonAllowDedThisYr, __dataOut);
    }
    if (null == this.fcurNonAllowDedPrvYr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonAllowDedPrvYr, __dataOut);
    }
    if (null == this.fcurAdjustedLTCIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedLTCIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherCredits, __dataOut);
    }
    if (null == this.fcurOtherIncomeSubtotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncomeSubtotal, __dataOut);
    }
    if (null == this.fcurNetRents) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetRents, __dataOut);
    }
    if (null == this.fcurNetSelfEmployedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetSelfEmployedIncome, __dataOut);
    }
    if (null == this.fcurAnyOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAnyOtherIncome, __dataOut);
    }
    if (null == this.fcurRLWTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWTCredit, __dataOut);
    }
    if (null == this.fcurTotalOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherExpenses, __dataOut);
    }
    if (null == this.fcurIncomeAfterExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterExpenses, __dataOut);
    }
    if (null == this.fcurLossBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossBroughtForward, __dataOut);
    }
    if (null == this.fcurTotalLossClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLossClaimed, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fcurAdjustedTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedTaxableIncome, __dataOut);
    }
    if (null == this.fblnWorkedInNZ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWorkedInNZ);
    }
    if (null == this.fcurTaxOnTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxOnTaxableIncome, __dataOut);
    }
    if (null == this.fcurOthIncTaxAndNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOthIncTaxAndNRWT, __dataOut);
    }
    if (null == this.fcurTotalTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCredits, __dataOut);
    }
    if (null == this.fcurResidualIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidualIncomeTax, __dataOut);
    }
    if (null == this.fcurProvTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvTaxPaid, __dataOut);
    }
    if (null == this.fcurRefundOrTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundOrTax, __dataOut);
    }
    if (null == this.fcurRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefund, __dataOut);
    }
    if (null == this.fcurProvTaxOverpayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvTaxOverpayment, __dataOut);
    }
    if (null == this.fcurTotalRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRefund, __dataOut);
    }
    if (null == this.fcurRemainingRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemainingRefund, __dataOut);
    }
    if (null == this.fcurProvisionalTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionalTax, __dataOut);
    }
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fcurImputationToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationToCarryForward, __dataOut);
    }
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
    }
    if (null == this.flngSelectGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSelectGroup);
    }
    if (null == this.fdtmSelectDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSelectDate.getTime());
    __dataOut.writeInt(this.fdtmSelectDate.getNanos());
    }
    if (null == this.fblnGroup2Suspend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGroup2Suspend);
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
    if (null == this.fcurResDeductionsClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsClaimed, __dataOut);
    }
    if (null == this.fcurResNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResNetIncome, __dataOut);
    }
    if (null == this.fcurResDeductionsForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsForward, __dataOut);
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
    if (null == this.fcurSaleOfProperty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSaleOfProperty, __dataOut);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fcurTotalRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWT, __dataOut);
    }
    if (null == this.fcurTotalGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossInterest, __dataOut);
    }
    if (null == this.fcurNRWTInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTInterest, __dataOut);
    }
    if (null == this.fcurTotalDividendCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDividendCredit, __dataOut);
    }
    if (null == this.fcurTotalGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossDividends, __dataOut);
    }
    if (null == this.fcurNRWTDividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTDividend, __dataOut);
    }
    if (null == this.fcurTotalTaxRoyalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxRoyalty, __dataOut);
    }
    if (null == this.fcurTotalGrossRoyalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossRoyalty, __dataOut);
    }
    if (null == this.fcurNRWTRoyalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTRoyalty, __dataOut);
    }
    if (null == this.fcurNRWTTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalNRWT, __dataOut);
    }
    if (null == this.fcurTotalTaxDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxDeductions, __dataOut);
    }
    if (null == this.fcurTotalGrossIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossIncome, __dataOut);
    }
    if (null == this.fcurTotalMaoriCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalMaoriCredits, __dataOut);
    }
    if (null == this.fcurTotalMaoriDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalMaoriDistributions, __dataOut);
    }
    if (null == this.fcurTotalPartnershipTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPartnershipTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalPartnershipIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPartnershipIncome, __dataOut);
    }
    if (null == this.fcurTotalEstateTrustTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalEstateTrustTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalEstateTrustIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalEstateTrustIncome, __dataOut);
    }
    if (null == this.fcurTotalLTCTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLTCTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalActiveLTCIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalActiveLTCIncome, __dataOut);
    }
    if (null == this.fcurNonAllowDedThisYr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonAllowDedThisYr, __dataOut);
    }
    if (null == this.fcurNonAllowDedPrvYr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonAllowDedPrvYr, __dataOut);
    }
    if (null == this.fcurAdjustedLTCIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedLTCIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherCredits, __dataOut);
    }
    if (null == this.fcurOtherIncomeSubtotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncomeSubtotal, __dataOut);
    }
    if (null == this.fcurNetRents) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetRents, __dataOut);
    }
    if (null == this.fcurNetSelfEmployedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetSelfEmployedIncome, __dataOut);
    }
    if (null == this.fcurAnyOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAnyOtherIncome, __dataOut);
    }
    if (null == this.fcurRLWTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWTCredit, __dataOut);
    }
    if (null == this.fcurTotalOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherExpenses, __dataOut);
    }
    if (null == this.fcurIncomeAfterExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterExpenses, __dataOut);
    }
    if (null == this.fcurLossBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossBroughtForward, __dataOut);
    }
    if (null == this.fcurTotalLossClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLossClaimed, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fcurAdjustedTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedTaxableIncome, __dataOut);
    }
    if (null == this.fblnWorkedInNZ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWorkedInNZ);
    }
    if (null == this.fcurTaxOnTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxOnTaxableIncome, __dataOut);
    }
    if (null == this.fcurOthIncTaxAndNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOthIncTaxAndNRWT, __dataOut);
    }
    if (null == this.fcurTotalTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCredits, __dataOut);
    }
    if (null == this.fcurResidualIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidualIncomeTax, __dataOut);
    }
    if (null == this.fcurProvTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvTaxPaid, __dataOut);
    }
    if (null == this.fcurRefundOrTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundOrTax, __dataOut);
    }
    if (null == this.fcurRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefund, __dataOut);
    }
    if (null == this.fcurProvTaxOverpayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvTaxOverpayment, __dataOut);
    }
    if (null == this.fcurTotalRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRefund, __dataOut);
    }
    if (null == this.fcurRemainingRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemainingRefund, __dataOut);
    }
    if (null == this.fcurProvisionalTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionalTax, __dataOut);
    }
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fcurImputationToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationToCarryForward, __dataOut);
    }
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
    }
    if (null == this.flngSelectGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSelectGroup);
    }
    if (null == this.fdtmSelectDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSelectDate.getTime());
    __dataOut.writeInt(this.fdtmSelectDate.getNanos());
    }
    if (null == this.fblnGroup2Suspend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGroup2Suspend);
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
    if (null == this.fcurResDeductionsClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsClaimed, __dataOut);
    }
    if (null == this.fcurResNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResNetIncome, __dataOut);
    }
    if (null == this.fcurResDeductionsForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsForward, __dataOut);
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
    if (null == this.fcurSaleOfProperty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSaleOfProperty, __dataOut);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWT==null?"\\N":fcurTotalRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossInterest==null?"\\N":fcurTotalGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTInterest==null?"\\N":fcurNRWTInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDividendCredit==null?"\\N":fcurTotalDividendCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossDividends==null?"\\N":fcurTotalGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTDividend==null?"\\N":fcurNRWTDividend.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxRoyalty==null?"\\N":fcurTotalTaxRoyalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossRoyalty==null?"\\N":fcurTotalGrossRoyalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTRoyalty==null?"\\N":fcurNRWTRoyalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTTaxCredits==null?"\\N":fcurNRWTTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalNRWT==null?"\\N":fcurTotalNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxDeductions==null?"\\N":fcurTotalTaxDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossIncome==null?"\\N":fcurTotalGrossIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMaoriCredits==null?"\\N":fcurTotalMaoriCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMaoriDistributions==null?"\\N":fcurTotalMaoriDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPartnershipTaxCredits==null?"\\N":fcurTotalPartnershipTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPartnershipIncome==null?"\\N":fcurTotalPartnershipIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalEstateTrustTaxCredits==null?"\\N":fcurTotalEstateTrustTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalEstateTrustIncome==null?"\\N":fcurTotalEstateTrustIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLTCTaxCredits==null?"\\N":fcurTotalLTCTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalActiveLTCIncome==null?"\\N":fcurTotalActiveLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonAllowDedThisYr==null?"\\N":fcurNonAllowDedThisYr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonAllowDedPrvYr==null?"\\N":fcurNonAllowDedPrvYr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedLTCIncome==null?"\\N":fcurAdjustedLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherCredits==null?"\\N":fcurTotalOtherCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncomeSubtotal==null?"\\N":fcurOtherIncomeSubtotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetRents==null?"\\N":fcurNetRents.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetSelfEmployedIncome==null?"\\N":fcurNetSelfEmployedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAnyOtherIncome==null?"\\N":fcurAnyOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWTCredit==null?"\\N":fcurRLWTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherIncome==null?"\\N":fcurTotalOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherExpenses==null?"\\N":fcurTotalOtherExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterExpenses==null?"\\N":fcurIncomeAfterExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossBroughtForward==null?"\\N":fcurLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLossClaimed==null?"\\N":fcurTotalLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedTaxableIncome==null?"\\N":fcurAdjustedTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWorkedInNZ==null?"\\N":"" + fblnWorkedInNZ, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxOnTaxableIncome==null?"\\N":fcurTaxOnTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOthIncTaxAndNRWT==null?"\\N":fcurOthIncTaxAndNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCredits==null?"\\N":fcurTotalTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvTaxPaid==null?"\\N":fcurProvTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundOrTax==null?"\\N":fcurRefundOrTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefund==null?"\\N":fcurRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvTaxOverpayment==null?"\\N":fcurProvTaxOverpayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRefund==null?"\\N":fcurTotalRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemainingRefund==null?"\\N":fcurRemainingRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTax==null?"\\N":fcurProvisionalTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationToCarryForward==null?"\\N":fcurImputationToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSelectGroup==null?"\\N":"" + flngSelectGroup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSelectDate==null?"\\N":"" + fdtmSelectDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGroup2Suspend==null?"\\N":"" + fblnGroup2Suspend, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResMethod==null?"\\N":fstrResMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResIncome==null?"\\N":fcurResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductions==null?"\\N":fcurResDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsPriorYear==null?"\\N":fcurResDeductionsPriorYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsClaimed==null?"\\N":fcurResDeductionsClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResNetIncome==null?"\\N":fcurResNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsForward==null?"\\N":fcurResDeductionsForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardCurrentYear==null?"\\N":fcurRDICarryForwardCurrentYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSaleOfProperty==null?"\\N":fcurSaleOfProperty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWT==null?"\\N":fcurTotalRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossInterest==null?"\\N":fcurTotalGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTInterest==null?"\\N":fcurNRWTInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDividendCredit==null?"\\N":fcurTotalDividendCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossDividends==null?"\\N":fcurTotalGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTDividend==null?"\\N":fcurNRWTDividend.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxRoyalty==null?"\\N":fcurTotalTaxRoyalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossRoyalty==null?"\\N":fcurTotalGrossRoyalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTRoyalty==null?"\\N":fcurNRWTRoyalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTTaxCredits==null?"\\N":fcurNRWTTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalNRWT==null?"\\N":fcurTotalNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxDeductions==null?"\\N":fcurTotalTaxDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossIncome==null?"\\N":fcurTotalGrossIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMaoriCredits==null?"\\N":fcurTotalMaoriCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMaoriDistributions==null?"\\N":fcurTotalMaoriDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPartnershipTaxCredits==null?"\\N":fcurTotalPartnershipTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPartnershipIncome==null?"\\N":fcurTotalPartnershipIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalEstateTrustTaxCredits==null?"\\N":fcurTotalEstateTrustTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalEstateTrustIncome==null?"\\N":fcurTotalEstateTrustIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLTCTaxCredits==null?"\\N":fcurTotalLTCTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalActiveLTCIncome==null?"\\N":fcurTotalActiveLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonAllowDedThisYr==null?"\\N":fcurNonAllowDedThisYr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonAllowDedPrvYr==null?"\\N":fcurNonAllowDedPrvYr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedLTCIncome==null?"\\N":fcurAdjustedLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherCredits==null?"\\N":fcurTotalOtherCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncomeSubtotal==null?"\\N":fcurOtherIncomeSubtotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetRents==null?"\\N":fcurNetRents.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetSelfEmployedIncome==null?"\\N":fcurNetSelfEmployedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAnyOtherIncome==null?"\\N":fcurAnyOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWTCredit==null?"\\N":fcurRLWTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherIncome==null?"\\N":fcurTotalOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherExpenses==null?"\\N":fcurTotalOtherExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterExpenses==null?"\\N":fcurIncomeAfterExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossBroughtForward==null?"\\N":fcurLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLossClaimed==null?"\\N":fcurTotalLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedTaxableIncome==null?"\\N":fcurAdjustedTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWorkedInNZ==null?"\\N":"" + fblnWorkedInNZ, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxOnTaxableIncome==null?"\\N":fcurTaxOnTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOthIncTaxAndNRWT==null?"\\N":fcurOthIncTaxAndNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCredits==null?"\\N":fcurTotalTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvTaxPaid==null?"\\N":fcurProvTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundOrTax==null?"\\N":fcurRefundOrTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefund==null?"\\N":fcurRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvTaxOverpayment==null?"\\N":fcurProvTaxOverpayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRefund==null?"\\N":fcurTotalRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemainingRefund==null?"\\N":fcurRemainingRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTax==null?"\\N":fcurProvisionalTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationToCarryForward==null?"\\N":fcurImputationToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSelectGroup==null?"\\N":"" + flngSelectGroup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSelectDate==null?"\\N":"" + fdtmSelectDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGroup2Suspend==null?"\\N":"" + fblnGroup2Suspend, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResMethod==null?"\\N":fstrResMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResIncome==null?"\\N":fcurResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductions==null?"\\N":fcurResDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsPriorYear==null?"\\N":fcurResDeductionsPriorYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsClaimed==null?"\\N":fcurResDeductionsClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResNetIncome==null?"\\N":fcurResNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsForward==null?"\\N":fcurResDeductionsForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardCurrentYear==null?"\\N":fcurRDICarryForwardCurrentYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSaleOfProperty==null?"\\N":fcurSaleOfProperty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWT = null; } else {
      this.fcurTotalRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossInterest = null; } else {
      this.fcurTotalGrossInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTInterest = null; } else {
      this.fcurNRWTInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDividendCredit = null; } else {
      this.fcurTotalDividendCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossDividends = null; } else {
      this.fcurTotalGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTDividend = null; } else {
      this.fcurNRWTDividend = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxRoyalty = null; } else {
      this.fcurTotalTaxRoyalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossRoyalty = null; } else {
      this.fcurTotalGrossRoyalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTRoyalty = null; } else {
      this.fcurNRWTRoyalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTTaxCredits = null; } else {
      this.fcurNRWTTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalNRWT = null; } else {
      this.fcurTotalNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxDeductions = null; } else {
      this.fcurTotalTaxDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossIncome = null; } else {
      this.fcurTotalGrossIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalMaoriCredits = null; } else {
      this.fcurTotalMaoriCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalMaoriDistributions = null; } else {
      this.fcurTotalMaoriDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPartnershipTaxCredits = null; } else {
      this.fcurTotalPartnershipTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPartnershipIncome = null; } else {
      this.fcurTotalPartnershipIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalEstateTrustTaxCredits = null; } else {
      this.fcurTotalEstateTrustTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalEstateTrustIncome = null; } else {
      this.fcurTotalEstateTrustIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLTCTaxCredits = null; } else {
      this.fcurTotalLTCTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalActiveLTCIncome = null; } else {
      this.fcurTotalActiveLTCIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonAllowDedThisYr = null; } else {
      this.fcurNonAllowDedThisYr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonAllowDedPrvYr = null; } else {
      this.fcurNonAllowDedPrvYr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedLTCIncome = null; } else {
      this.fcurAdjustedLTCIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherCredits = null; } else {
      this.fcurTotalOtherCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherIncomeSubtotal = null; } else {
      this.fcurOtherIncomeSubtotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetRents = null; } else {
      this.fcurNetRents = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetSelfEmployedIncome = null; } else {
      this.fcurNetSelfEmployedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAnyOtherIncome = null; } else {
      this.fcurAnyOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWTCredit = null; } else {
      this.fcurRLWTCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherIncome = null; } else {
      this.fcurTotalOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherExpenses = null; } else {
      this.fcurTotalOtherExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAfterExpenses = null; } else {
      this.fcurIncomeAfterExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossBroughtForward = null; } else {
      this.fcurLossBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLossClaimed = null; } else {
      this.fcurTotalLossClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedTaxableIncome = null; } else {
      this.fcurAdjustedTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWorkedInNZ = null; } else {
      this.fblnWorkedInNZ = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxOnTaxableIncome = null; } else {
      this.fcurTaxOnTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOthIncTaxAndNRWT = null; } else {
      this.fcurOthIncTaxAndNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCredits = null; } else {
      this.fcurTotalTaxCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvTaxPaid = null; } else {
      this.fcurProvTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundOrTax = null; } else {
      this.fcurRefundOrTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefund = null; } else {
      this.fcurRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvTaxOverpayment = null; } else {
      this.fcurProvTaxOverpayment = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemainingRefund = null; } else {
      this.fcurRemainingRefund = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationToCarryForward = null; } else {
      this.fcurImputationToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputationCredits = null; } else {
      this.fcurExcessImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSelectGroup = null; } else {
      this.flngSelectGroup = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSelectDate = null; } else {
      this.fdtmSelectDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGroup2Suspend = null; } else {
      this.fblnGroup2Suspend = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsClaimed = null; } else {
      this.fcurResDeductionsClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsForward = null; } else {
      this.fcurResDeductionsForward = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSaleOfProperty = null; } else {
      this.fcurSaleOfProperty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWT = null; } else {
      this.fcurTotalRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossInterest = null; } else {
      this.fcurTotalGrossInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTInterest = null; } else {
      this.fcurNRWTInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDividendCredit = null; } else {
      this.fcurTotalDividendCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossDividends = null; } else {
      this.fcurTotalGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTDividend = null; } else {
      this.fcurNRWTDividend = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxRoyalty = null; } else {
      this.fcurTotalTaxRoyalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossRoyalty = null; } else {
      this.fcurTotalGrossRoyalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTRoyalty = null; } else {
      this.fcurNRWTRoyalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTTaxCredits = null; } else {
      this.fcurNRWTTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalNRWT = null; } else {
      this.fcurTotalNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxDeductions = null; } else {
      this.fcurTotalTaxDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossIncome = null; } else {
      this.fcurTotalGrossIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalMaoriCredits = null; } else {
      this.fcurTotalMaoriCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalMaoriDistributions = null; } else {
      this.fcurTotalMaoriDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPartnershipTaxCredits = null; } else {
      this.fcurTotalPartnershipTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPartnershipIncome = null; } else {
      this.fcurTotalPartnershipIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalEstateTrustTaxCredits = null; } else {
      this.fcurTotalEstateTrustTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalEstateTrustIncome = null; } else {
      this.fcurTotalEstateTrustIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLTCTaxCredits = null; } else {
      this.fcurTotalLTCTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalActiveLTCIncome = null; } else {
      this.fcurTotalActiveLTCIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonAllowDedThisYr = null; } else {
      this.fcurNonAllowDedThisYr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonAllowDedPrvYr = null; } else {
      this.fcurNonAllowDedPrvYr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedLTCIncome = null; } else {
      this.fcurAdjustedLTCIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherCredits = null; } else {
      this.fcurTotalOtherCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherIncomeSubtotal = null; } else {
      this.fcurOtherIncomeSubtotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetRents = null; } else {
      this.fcurNetRents = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetSelfEmployedIncome = null; } else {
      this.fcurNetSelfEmployedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAnyOtherIncome = null; } else {
      this.fcurAnyOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWTCredit = null; } else {
      this.fcurRLWTCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherIncome = null; } else {
      this.fcurTotalOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherExpenses = null; } else {
      this.fcurTotalOtherExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAfterExpenses = null; } else {
      this.fcurIncomeAfterExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossBroughtForward = null; } else {
      this.fcurLossBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLossClaimed = null; } else {
      this.fcurTotalLossClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedTaxableIncome = null; } else {
      this.fcurAdjustedTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWorkedInNZ = null; } else {
      this.fblnWorkedInNZ = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxOnTaxableIncome = null; } else {
      this.fcurTaxOnTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOthIncTaxAndNRWT = null; } else {
      this.fcurOthIncTaxAndNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCredits = null; } else {
      this.fcurTotalTaxCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvTaxPaid = null; } else {
      this.fcurProvTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundOrTax = null; } else {
      this.fcurRefundOrTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefund = null; } else {
      this.fcurRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvTaxOverpayment = null; } else {
      this.fcurProvTaxOverpayment = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemainingRefund = null; } else {
      this.fcurRemainingRefund = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationToCarryForward = null; } else {
      this.fcurImputationToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputationCredits = null; } else {
      this.fcurExcessImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSelectGroup = null; } else {
      this.flngSelectGroup = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSelectDate = null; } else {
      this.fdtmSelectDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGroup2Suspend = null; } else {
      this.fblnGroup2Suspend = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsClaimed = null; } else {
      this.fcurResDeductionsClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsForward = null; } else {
      this.fcurResDeductionsForward = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSaleOfProperty = null; } else {
      this.fcurSaleOfProperty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblnz_rtniitnr o = (tblnz_rtniitnr) super.clone();
    o.fdtmSelectDate = (o.fdtmSelectDate != null) ? (java.sql.Timestamp) o.fdtmSelectDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtniitnr o) throws CloneNotSupportedException {
    o.fdtmSelectDate = (o.fdtmSelectDate != null) ? (java.sql.Timestamp) o.fdtmSelectDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTotalRWT", this.fcurTotalRWT);
    __sqoop$field_map.put("fcurTotalGrossInterest", this.fcurTotalGrossInterest);
    __sqoop$field_map.put("fcurNRWTInterest", this.fcurNRWTInterest);
    __sqoop$field_map.put("fcurTotalDividendCredit", this.fcurTotalDividendCredit);
    __sqoop$field_map.put("fcurTotalGrossDividends", this.fcurTotalGrossDividends);
    __sqoop$field_map.put("fcurNRWTDividend", this.fcurNRWTDividend);
    __sqoop$field_map.put("fcurTotalTaxRoyalty", this.fcurTotalTaxRoyalty);
    __sqoop$field_map.put("fcurTotalGrossRoyalty", this.fcurTotalGrossRoyalty);
    __sqoop$field_map.put("fcurNRWTRoyalty", this.fcurNRWTRoyalty);
    __sqoop$field_map.put("fcurNRWTTaxCredits", this.fcurNRWTTaxCredits);
    __sqoop$field_map.put("fcurTotalNRWT", this.fcurTotalNRWT);
    __sqoop$field_map.put("fcurTotalTaxDeductions", this.fcurTotalTaxDeductions);
    __sqoop$field_map.put("fcurTotalGrossIncome", this.fcurTotalGrossIncome);
    __sqoop$field_map.put("fcurTotalMaoriCredits", this.fcurTotalMaoriCredits);
    __sqoop$field_map.put("fcurTotalMaoriDistributions", this.fcurTotalMaoriDistributions);
    __sqoop$field_map.put("fcurTotalPartnershipTaxCredits", this.fcurTotalPartnershipTaxCredits);
    __sqoop$field_map.put("fcurTotalPartnershipIncome", this.fcurTotalPartnershipIncome);
    __sqoop$field_map.put("fcurTotalEstateTrustTaxCredits", this.fcurTotalEstateTrustTaxCredits);
    __sqoop$field_map.put("fcurTotalEstateTrustIncome", this.fcurTotalEstateTrustIncome);
    __sqoop$field_map.put("fcurTotalLTCTaxCredits", this.fcurTotalLTCTaxCredits);
    __sqoop$field_map.put("fcurTotalActiveLTCIncome", this.fcurTotalActiveLTCIncome);
    __sqoop$field_map.put("fcurNonAllowDedThisYr", this.fcurNonAllowDedThisYr);
    __sqoop$field_map.put("fcurNonAllowDedPrvYr", this.fcurNonAllowDedPrvYr);
    __sqoop$field_map.put("fcurAdjustedLTCIncome", this.fcurAdjustedLTCIncome);
    __sqoop$field_map.put("fcurTotalOtherCredits", this.fcurTotalOtherCredits);
    __sqoop$field_map.put("fcurOtherIncomeSubtotal", this.fcurOtherIncomeSubtotal);
    __sqoop$field_map.put("fcurNetRents", this.fcurNetRents);
    __sqoop$field_map.put("fcurNetSelfEmployedIncome", this.fcurNetSelfEmployedIncome);
    __sqoop$field_map.put("fcurAnyOtherIncome", this.fcurAnyOtherIncome);
    __sqoop$field_map.put("fcurRLWTCredit", this.fcurRLWTCredit);
    __sqoop$field_map.put("fcurTotalOtherIncome", this.fcurTotalOtherIncome);
    __sqoop$field_map.put("fcurTotalOtherExpenses", this.fcurTotalOtherExpenses);
    __sqoop$field_map.put("fcurIncomeAfterExpenses", this.fcurIncomeAfterExpenses);
    __sqoop$field_map.put("fcurLossBroughtForward", this.fcurLossBroughtForward);
    __sqoop$field_map.put("fcurTotalLossClaimed", this.fcurTotalLossClaimed);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurAdjustedTaxableIncome", this.fcurAdjustedTaxableIncome);
    __sqoop$field_map.put("fblnWorkedInNZ", this.fblnWorkedInNZ);
    __sqoop$field_map.put("fcurTaxOnTaxableIncome", this.fcurTaxOnTaxableIncome);
    __sqoop$field_map.put("fcurOthIncTaxAndNRWT", this.fcurOthIncTaxAndNRWT);
    __sqoop$field_map.put("fcurTotalTaxCredits", this.fcurTotalTaxCredits);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurProvTaxPaid", this.fcurProvTaxPaid);
    __sqoop$field_map.put("fcurRefundOrTax", this.fcurRefundOrTax);
    __sqoop$field_map.put("fcurRefund", this.fcurRefund);
    __sqoop$field_map.put("fcurProvTaxOverpayment", this.fcurProvTaxOverpayment);
    __sqoop$field_map.put("fcurTotalRefund", this.fcurTotalRefund);
    __sqoop$field_map.put("fcurRemainingRefund", this.fcurRemainingRefund);
    __sqoop$field_map.put("fcurProvisionalTax", this.fcurProvisionalTax);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fcurImputationToCarryForward", this.fcurImputationToCarryForward);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("flngSelectGroup", this.flngSelectGroup);
    __sqoop$field_map.put("fdtmSelectDate", this.fdtmSelectDate);
    __sqoop$field_map.put("fblnGroup2Suspend", this.fblnGroup2Suspend);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurResDeductionsForward", this.fcurResDeductionsForward);
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurSaleOfProperty", this.fcurSaleOfProperty);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTotalRWT", this.fcurTotalRWT);
    __sqoop$field_map.put("fcurTotalGrossInterest", this.fcurTotalGrossInterest);
    __sqoop$field_map.put("fcurNRWTInterest", this.fcurNRWTInterest);
    __sqoop$field_map.put("fcurTotalDividendCredit", this.fcurTotalDividendCredit);
    __sqoop$field_map.put("fcurTotalGrossDividends", this.fcurTotalGrossDividends);
    __sqoop$field_map.put("fcurNRWTDividend", this.fcurNRWTDividend);
    __sqoop$field_map.put("fcurTotalTaxRoyalty", this.fcurTotalTaxRoyalty);
    __sqoop$field_map.put("fcurTotalGrossRoyalty", this.fcurTotalGrossRoyalty);
    __sqoop$field_map.put("fcurNRWTRoyalty", this.fcurNRWTRoyalty);
    __sqoop$field_map.put("fcurNRWTTaxCredits", this.fcurNRWTTaxCredits);
    __sqoop$field_map.put("fcurTotalNRWT", this.fcurTotalNRWT);
    __sqoop$field_map.put("fcurTotalTaxDeductions", this.fcurTotalTaxDeductions);
    __sqoop$field_map.put("fcurTotalGrossIncome", this.fcurTotalGrossIncome);
    __sqoop$field_map.put("fcurTotalMaoriCredits", this.fcurTotalMaoriCredits);
    __sqoop$field_map.put("fcurTotalMaoriDistributions", this.fcurTotalMaoriDistributions);
    __sqoop$field_map.put("fcurTotalPartnershipTaxCredits", this.fcurTotalPartnershipTaxCredits);
    __sqoop$field_map.put("fcurTotalPartnershipIncome", this.fcurTotalPartnershipIncome);
    __sqoop$field_map.put("fcurTotalEstateTrustTaxCredits", this.fcurTotalEstateTrustTaxCredits);
    __sqoop$field_map.put("fcurTotalEstateTrustIncome", this.fcurTotalEstateTrustIncome);
    __sqoop$field_map.put("fcurTotalLTCTaxCredits", this.fcurTotalLTCTaxCredits);
    __sqoop$field_map.put("fcurTotalActiveLTCIncome", this.fcurTotalActiveLTCIncome);
    __sqoop$field_map.put("fcurNonAllowDedThisYr", this.fcurNonAllowDedThisYr);
    __sqoop$field_map.put("fcurNonAllowDedPrvYr", this.fcurNonAllowDedPrvYr);
    __sqoop$field_map.put("fcurAdjustedLTCIncome", this.fcurAdjustedLTCIncome);
    __sqoop$field_map.put("fcurTotalOtherCredits", this.fcurTotalOtherCredits);
    __sqoop$field_map.put("fcurOtherIncomeSubtotal", this.fcurOtherIncomeSubtotal);
    __sqoop$field_map.put("fcurNetRents", this.fcurNetRents);
    __sqoop$field_map.put("fcurNetSelfEmployedIncome", this.fcurNetSelfEmployedIncome);
    __sqoop$field_map.put("fcurAnyOtherIncome", this.fcurAnyOtherIncome);
    __sqoop$field_map.put("fcurRLWTCredit", this.fcurRLWTCredit);
    __sqoop$field_map.put("fcurTotalOtherIncome", this.fcurTotalOtherIncome);
    __sqoop$field_map.put("fcurTotalOtherExpenses", this.fcurTotalOtherExpenses);
    __sqoop$field_map.put("fcurIncomeAfterExpenses", this.fcurIncomeAfterExpenses);
    __sqoop$field_map.put("fcurLossBroughtForward", this.fcurLossBroughtForward);
    __sqoop$field_map.put("fcurTotalLossClaimed", this.fcurTotalLossClaimed);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurAdjustedTaxableIncome", this.fcurAdjustedTaxableIncome);
    __sqoop$field_map.put("fblnWorkedInNZ", this.fblnWorkedInNZ);
    __sqoop$field_map.put("fcurTaxOnTaxableIncome", this.fcurTaxOnTaxableIncome);
    __sqoop$field_map.put("fcurOthIncTaxAndNRWT", this.fcurOthIncTaxAndNRWT);
    __sqoop$field_map.put("fcurTotalTaxCredits", this.fcurTotalTaxCredits);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurProvTaxPaid", this.fcurProvTaxPaid);
    __sqoop$field_map.put("fcurRefundOrTax", this.fcurRefundOrTax);
    __sqoop$field_map.put("fcurRefund", this.fcurRefund);
    __sqoop$field_map.put("fcurProvTaxOverpayment", this.fcurProvTaxOverpayment);
    __sqoop$field_map.put("fcurTotalRefund", this.fcurTotalRefund);
    __sqoop$field_map.put("fcurRemainingRefund", this.fcurRemainingRefund);
    __sqoop$field_map.put("fcurProvisionalTax", this.fcurProvisionalTax);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fcurImputationToCarryForward", this.fcurImputationToCarryForward);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("flngSelectGroup", this.flngSelectGroup);
    __sqoop$field_map.put("fdtmSelectDate", this.fdtmSelectDate);
    __sqoop$field_map.put("fblnGroup2Suspend", this.fblnGroup2Suspend);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurResDeductionsForward", this.fcurResDeductionsForward);
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurSaleOfProperty", this.fcurSaleOfProperty);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
