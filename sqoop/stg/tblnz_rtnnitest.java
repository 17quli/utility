// ORM class for table 'tblnz_rtnnitest'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:40:12 NZDT 2020
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

public class tblnz_rtnnitest extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurGrossInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurDividendImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurDividendRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurDividendGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMaoriCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurMaoriCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMaoriDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurMaoriDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTrustCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTrustCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTrustIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTrustIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurOverseasTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurOverseasIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLTCCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurLTCCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLTCActiveIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurLTCActiveIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLTCDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurLTCDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLTCPriorDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurLTCPriorDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdjustedIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurAdjustedIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBusinessIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurBusinessIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTotalOtherCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTotalOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTotalCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRLWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurRLWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurBeneficiaryIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTrusteeIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTrusteeIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPayableTrusteesIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTaxPayableTrusteesIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExpensesClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurExpensesClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLossBroughtForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurNetLossBroughtForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLossClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurNetLossClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTotalDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTaxableDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnCFC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fblnCFC = (Integer)value;
      }
    });
    setters.put("fcurTotalTaxBeneficiaries", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTotalTaxBeneficiaries = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAfterExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurIncomeAfterExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTotalTaxPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareOfOverseasTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurShareOfOverseasTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPayableAfterShare", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTaxPayableAfterShare = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareOfImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurShareOfImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPayableAfterImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTaxPayableAfterImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareOfRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurShareOfRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPayableAfterRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTaxPayableAfterRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResidualIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurResidualIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionalTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurProvisionalTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTaxAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverpaymentProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurOverpaymentProvisional = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefundAfterOverpayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurRefundAfterOverpayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTransferProvisional = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferCustomerAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTransferCustomerAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurTotalRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmProvisionalStartDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fdtmProvisionalStartDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrProvisionalOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fstrProvisionalOption = (String)value;
      }
    });
    setters.put("fcurProvisionalTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurProvisionalTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurExcessImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputationAsLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurExcessImputationAsLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurLossToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnComplyingTrust", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fblnComplyingTrust = (Integer)value;
      }
    });
    setters.put("fblnForeignTrust", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fblnForeignTrust = (Integer)value;
      }
    });
    setters.put("fblnNonComplyingTrust", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fblnNonComplyingTrust = (Integer)value;
      }
    });
    setters.put("fstrResMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fstrResMethod = (String)value;
      }
    });
    setters.put("fcurResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsPriorYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurResDeductionsPriorYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurResDeductionsClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurResNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurResDeductionsForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardCurrentYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurRDICarryForwardCurrentYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardRemaining", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurRDICarryForwardRemaining = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSaleOfProperty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fcurSaleOfProperty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitest.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnnitest() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnnitest with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurRWT;
  public java.math.BigDecimal get_fcurRWT() {
    return fcurRWT;
  }
  public void set_fcurRWT(java.math.BigDecimal fcurRWT) {
    this.fcurRWT = fcurRWT;
  }
  public tblnz_rtnnitest with_fcurRWT(java.math.BigDecimal fcurRWT) {
    this.fcurRWT = fcurRWT;
    return this;
  }
  private java.math.BigDecimal fcurGrossInterest;
  public java.math.BigDecimal get_fcurGrossInterest() {
    return fcurGrossInterest;
  }
  public void set_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
    this.fcurGrossInterest = fcurGrossInterest;
  }
  public tblnz_rtnnitest with_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
    this.fcurGrossInterest = fcurGrossInterest;
    return this;
  }
  private java.math.BigDecimal fcurDividendImputation;
  public java.math.BigDecimal get_fcurDividendImputation() {
    return fcurDividendImputation;
  }
  public void set_fcurDividendImputation(java.math.BigDecimal fcurDividendImputation) {
    this.fcurDividendImputation = fcurDividendImputation;
  }
  public tblnz_rtnnitest with_fcurDividendImputation(java.math.BigDecimal fcurDividendImputation) {
    this.fcurDividendImputation = fcurDividendImputation;
    return this;
  }
  private java.math.BigDecimal fcurDividendRWT;
  public java.math.BigDecimal get_fcurDividendRWT() {
    return fcurDividendRWT;
  }
  public void set_fcurDividendRWT(java.math.BigDecimal fcurDividendRWT) {
    this.fcurDividendRWT = fcurDividendRWT;
  }
  public tblnz_rtnnitest with_fcurDividendRWT(java.math.BigDecimal fcurDividendRWT) {
    this.fcurDividendRWT = fcurDividendRWT;
    return this;
  }
  private java.math.BigDecimal fcurDividendGross;
  public java.math.BigDecimal get_fcurDividendGross() {
    return fcurDividendGross;
  }
  public void set_fcurDividendGross(java.math.BigDecimal fcurDividendGross) {
    this.fcurDividendGross = fcurDividendGross;
  }
  public tblnz_rtnnitest with_fcurDividendGross(java.math.BigDecimal fcurDividendGross) {
    this.fcurDividendGross = fcurDividendGross;
    return this;
  }
  private java.math.BigDecimal fcurMaoriCredits;
  public java.math.BigDecimal get_fcurMaoriCredits() {
    return fcurMaoriCredits;
  }
  public void set_fcurMaoriCredits(java.math.BigDecimal fcurMaoriCredits) {
    this.fcurMaoriCredits = fcurMaoriCredits;
  }
  public tblnz_rtnnitest with_fcurMaoriCredits(java.math.BigDecimal fcurMaoriCredits) {
    this.fcurMaoriCredits = fcurMaoriCredits;
    return this;
  }
  private java.math.BigDecimal fcurMaoriDistributions;
  public java.math.BigDecimal get_fcurMaoriDistributions() {
    return fcurMaoriDistributions;
  }
  public void set_fcurMaoriDistributions(java.math.BigDecimal fcurMaoriDistributions) {
    this.fcurMaoriDistributions = fcurMaoriDistributions;
  }
  public tblnz_rtnnitest with_fcurMaoriDistributions(java.math.BigDecimal fcurMaoriDistributions) {
    this.fcurMaoriDistributions = fcurMaoriDistributions;
    return this;
  }
  private java.math.BigDecimal fcurTrustCredits;
  public java.math.BigDecimal get_fcurTrustCredits() {
    return fcurTrustCredits;
  }
  public void set_fcurTrustCredits(java.math.BigDecimal fcurTrustCredits) {
    this.fcurTrustCredits = fcurTrustCredits;
  }
  public tblnz_rtnnitest with_fcurTrustCredits(java.math.BigDecimal fcurTrustCredits) {
    this.fcurTrustCredits = fcurTrustCredits;
    return this;
  }
  private java.math.BigDecimal fcurTrustIncome;
  public java.math.BigDecimal get_fcurTrustIncome() {
    return fcurTrustIncome;
  }
  public void set_fcurTrustIncome(java.math.BigDecimal fcurTrustIncome) {
    this.fcurTrustIncome = fcurTrustIncome;
  }
  public tblnz_rtnnitest with_fcurTrustIncome(java.math.BigDecimal fcurTrustIncome) {
    this.fcurTrustIncome = fcurTrustIncome;
    return this;
  }
  private java.math.BigDecimal fcurOverseasTax;
  public java.math.BigDecimal get_fcurOverseasTax() {
    return fcurOverseasTax;
  }
  public void set_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
    this.fcurOverseasTax = fcurOverseasTax;
  }
  public tblnz_rtnnitest with_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
    this.fcurOverseasTax = fcurOverseasTax;
    return this;
  }
  private java.math.BigDecimal fcurOverseasIncome;
  public java.math.BigDecimal get_fcurOverseasIncome() {
    return fcurOverseasIncome;
  }
  public void set_fcurOverseasIncome(java.math.BigDecimal fcurOverseasIncome) {
    this.fcurOverseasIncome = fcurOverseasIncome;
  }
  public tblnz_rtnnitest with_fcurOverseasIncome(java.math.BigDecimal fcurOverseasIncome) {
    this.fcurOverseasIncome = fcurOverseasIncome;
    return this;
  }
  private java.math.BigDecimal fcurLTCCredits;
  public java.math.BigDecimal get_fcurLTCCredits() {
    return fcurLTCCredits;
  }
  public void set_fcurLTCCredits(java.math.BigDecimal fcurLTCCredits) {
    this.fcurLTCCredits = fcurLTCCredits;
  }
  public tblnz_rtnnitest with_fcurLTCCredits(java.math.BigDecimal fcurLTCCredits) {
    this.fcurLTCCredits = fcurLTCCredits;
    return this;
  }
  private java.math.BigDecimal fcurLTCActiveIncome;
  public java.math.BigDecimal get_fcurLTCActiveIncome() {
    return fcurLTCActiveIncome;
  }
  public void set_fcurLTCActiveIncome(java.math.BigDecimal fcurLTCActiveIncome) {
    this.fcurLTCActiveIncome = fcurLTCActiveIncome;
  }
  public tblnz_rtnnitest with_fcurLTCActiveIncome(java.math.BigDecimal fcurLTCActiveIncome) {
    this.fcurLTCActiveIncome = fcurLTCActiveIncome;
    return this;
  }
  private java.math.BigDecimal fcurLTCDeductions;
  public java.math.BigDecimal get_fcurLTCDeductions() {
    return fcurLTCDeductions;
  }
  public void set_fcurLTCDeductions(java.math.BigDecimal fcurLTCDeductions) {
    this.fcurLTCDeductions = fcurLTCDeductions;
  }
  public tblnz_rtnnitest with_fcurLTCDeductions(java.math.BigDecimal fcurLTCDeductions) {
    this.fcurLTCDeductions = fcurLTCDeductions;
    return this;
  }
  private java.math.BigDecimal fcurLTCPriorDeductions;
  public java.math.BigDecimal get_fcurLTCPriorDeductions() {
    return fcurLTCPriorDeductions;
  }
  public void set_fcurLTCPriorDeductions(java.math.BigDecimal fcurLTCPriorDeductions) {
    this.fcurLTCPriorDeductions = fcurLTCPriorDeductions;
  }
  public tblnz_rtnnitest with_fcurLTCPriorDeductions(java.math.BigDecimal fcurLTCPriorDeductions) {
    this.fcurLTCPriorDeductions = fcurLTCPriorDeductions;
    return this;
  }
  private java.math.BigDecimal fcurAdjustedIncome;
  public java.math.BigDecimal get_fcurAdjustedIncome() {
    return fcurAdjustedIncome;
  }
  public void set_fcurAdjustedIncome(java.math.BigDecimal fcurAdjustedIncome) {
    this.fcurAdjustedIncome = fcurAdjustedIncome;
  }
  public tblnz_rtnnitest with_fcurAdjustedIncome(java.math.BigDecimal fcurAdjustedIncome) {
    this.fcurAdjustedIncome = fcurAdjustedIncome;
    return this;
  }
  private java.math.BigDecimal fcurBusinessIncome;
  public java.math.BigDecimal get_fcurBusinessIncome() {
    return fcurBusinessIncome;
  }
  public void set_fcurBusinessIncome(java.math.BigDecimal fcurBusinessIncome) {
    this.fcurBusinessIncome = fcurBusinessIncome;
  }
  public tblnz_rtnnitest with_fcurBusinessIncome(java.math.BigDecimal fcurBusinessIncome) {
    this.fcurBusinessIncome = fcurBusinessIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherCredits;
  public java.math.BigDecimal get_fcurTotalOtherCredits() {
    return fcurTotalOtherCredits;
  }
  public void set_fcurTotalOtherCredits(java.math.BigDecimal fcurTotalOtherCredits) {
    this.fcurTotalOtherCredits = fcurTotalOtherCredits;
  }
  public tblnz_rtnnitest with_fcurTotalOtherCredits(java.math.BigDecimal fcurTotalOtherCredits) {
    this.fcurTotalOtherCredits = fcurTotalOtherCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherIncome;
  public java.math.BigDecimal get_fcurTotalOtherIncome() {
    return fcurTotalOtherIncome;
  }
  public void set_fcurTotalOtherIncome(java.math.BigDecimal fcurTotalOtherIncome) {
    this.fcurTotalOtherIncome = fcurTotalOtherIncome;
  }
  public tblnz_rtnnitest with_fcurTotalOtherIncome(java.math.BigDecimal fcurTotalOtherIncome) {
    this.fcurTotalOtherIncome = fcurTotalOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalCredits;
  public java.math.BigDecimal get_fcurTotalCredits() {
    return fcurTotalCredits;
  }
  public void set_fcurTotalCredits(java.math.BigDecimal fcurTotalCredits) {
    this.fcurTotalCredits = fcurTotalCredits;
  }
  public tblnz_rtnnitest with_fcurTotalCredits(java.math.BigDecimal fcurTotalCredits) {
    this.fcurTotalCredits = fcurTotalCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncome;
  public java.math.BigDecimal get_fcurTotalIncome() {
    return fcurTotalIncome;
  }
  public void set_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
  }
  public tblnz_rtnnitest with_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurRLWT;
  public java.math.BigDecimal get_fcurRLWT() {
    return fcurRLWT;
  }
  public void set_fcurRLWT(java.math.BigDecimal fcurRLWT) {
    this.fcurRLWT = fcurRLWT;
  }
  public tblnz_rtnnitest with_fcurRLWT(java.math.BigDecimal fcurRLWT) {
    this.fcurRLWT = fcurRLWT;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryIncome;
  public java.math.BigDecimal get_fcurBeneficiaryIncome() {
    return fcurBeneficiaryIncome;
  }
  public void set_fcurBeneficiaryIncome(java.math.BigDecimal fcurBeneficiaryIncome) {
    this.fcurBeneficiaryIncome = fcurBeneficiaryIncome;
  }
  public tblnz_rtnnitest with_fcurBeneficiaryIncome(java.math.BigDecimal fcurBeneficiaryIncome) {
    this.fcurBeneficiaryIncome = fcurBeneficiaryIncome;
    return this;
  }
  private java.math.BigDecimal fcurTrusteeIncome;
  public java.math.BigDecimal get_fcurTrusteeIncome() {
    return fcurTrusteeIncome;
  }
  public void set_fcurTrusteeIncome(java.math.BigDecimal fcurTrusteeIncome) {
    this.fcurTrusteeIncome = fcurTrusteeIncome;
  }
  public tblnz_rtnnitest with_fcurTrusteeIncome(java.math.BigDecimal fcurTrusteeIncome) {
    this.fcurTrusteeIncome = fcurTrusteeIncome;
    return this;
  }
  private java.math.BigDecimal fcurTaxPayableTrusteesIncome;
  public java.math.BigDecimal get_fcurTaxPayableTrusteesIncome() {
    return fcurTaxPayableTrusteesIncome;
  }
  public void set_fcurTaxPayableTrusteesIncome(java.math.BigDecimal fcurTaxPayableTrusteesIncome) {
    this.fcurTaxPayableTrusteesIncome = fcurTaxPayableTrusteesIncome;
  }
  public tblnz_rtnnitest with_fcurTaxPayableTrusteesIncome(java.math.BigDecimal fcurTaxPayableTrusteesIncome) {
    this.fcurTaxPayableTrusteesIncome = fcurTaxPayableTrusteesIncome;
    return this;
  }
  private java.math.BigDecimal fcurExpensesClaimed;
  public java.math.BigDecimal get_fcurExpensesClaimed() {
    return fcurExpensesClaimed;
  }
  public void set_fcurExpensesClaimed(java.math.BigDecimal fcurExpensesClaimed) {
    this.fcurExpensesClaimed = fcurExpensesClaimed;
  }
  public tblnz_rtnnitest with_fcurExpensesClaimed(java.math.BigDecimal fcurExpensesClaimed) {
    this.fcurExpensesClaimed = fcurExpensesClaimed;
    return this;
  }
  private java.math.BigDecimal fcurNetLossBroughtForward;
  public java.math.BigDecimal get_fcurNetLossBroughtForward() {
    return fcurNetLossBroughtForward;
  }
  public void set_fcurNetLossBroughtForward(java.math.BigDecimal fcurNetLossBroughtForward) {
    this.fcurNetLossBroughtForward = fcurNetLossBroughtForward;
  }
  public tblnz_rtnnitest with_fcurNetLossBroughtForward(java.math.BigDecimal fcurNetLossBroughtForward) {
    this.fcurNetLossBroughtForward = fcurNetLossBroughtForward;
    return this;
  }
  private java.math.BigDecimal fcurNetLossClaimed;
  public java.math.BigDecimal get_fcurNetLossClaimed() {
    return fcurNetLossClaimed;
  }
  public void set_fcurNetLossClaimed(java.math.BigDecimal fcurNetLossClaimed) {
    this.fcurNetLossClaimed = fcurNetLossClaimed;
  }
  public tblnz_rtnnitest with_fcurNetLossClaimed(java.math.BigDecimal fcurNetLossClaimed) {
    this.fcurNetLossClaimed = fcurNetLossClaimed;
    return this;
  }
  private java.math.BigDecimal fcurTotalDistributions;
  public java.math.BigDecimal get_fcurTotalDistributions() {
    return fcurTotalDistributions;
  }
  public void set_fcurTotalDistributions(java.math.BigDecimal fcurTotalDistributions) {
    this.fcurTotalDistributions = fcurTotalDistributions;
  }
  public tblnz_rtnnitest with_fcurTotalDistributions(java.math.BigDecimal fcurTotalDistributions) {
    this.fcurTotalDistributions = fcurTotalDistributions;
    return this;
  }
  private java.math.BigDecimal fcurTaxableDistributions;
  public java.math.BigDecimal get_fcurTaxableDistributions() {
    return fcurTaxableDistributions;
  }
  public void set_fcurTaxableDistributions(java.math.BigDecimal fcurTaxableDistributions) {
    this.fcurTaxableDistributions = fcurTaxableDistributions;
  }
  public tblnz_rtnnitest with_fcurTaxableDistributions(java.math.BigDecimal fcurTaxableDistributions) {
    this.fcurTaxableDistributions = fcurTaxableDistributions;
    return this;
  }
  private Integer fblnCFC;
  public Integer get_fblnCFC() {
    return fblnCFC;
  }
  public void set_fblnCFC(Integer fblnCFC) {
    this.fblnCFC = fblnCFC;
  }
  public tblnz_rtnnitest with_fblnCFC(Integer fblnCFC) {
    this.fblnCFC = fblnCFC;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxBeneficiaries;
  public java.math.BigDecimal get_fcurTotalTaxBeneficiaries() {
    return fcurTotalTaxBeneficiaries;
  }
  public void set_fcurTotalTaxBeneficiaries(java.math.BigDecimal fcurTotalTaxBeneficiaries) {
    this.fcurTotalTaxBeneficiaries = fcurTotalTaxBeneficiaries;
  }
  public tblnz_rtnnitest with_fcurTotalTaxBeneficiaries(java.math.BigDecimal fcurTotalTaxBeneficiaries) {
    this.fcurTotalTaxBeneficiaries = fcurTotalTaxBeneficiaries;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAfterExpenses;
  public java.math.BigDecimal get_fcurIncomeAfterExpenses() {
    return fcurIncomeAfterExpenses;
  }
  public void set_fcurIncomeAfterExpenses(java.math.BigDecimal fcurIncomeAfterExpenses) {
    this.fcurIncomeAfterExpenses = fcurIncomeAfterExpenses;
  }
  public tblnz_rtnnitest with_fcurIncomeAfterExpenses(java.math.BigDecimal fcurIncomeAfterExpenses) {
    this.fcurIncomeAfterExpenses = fcurIncomeAfterExpenses;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxPayable;
  public java.math.BigDecimal get_fcurTotalTaxPayable() {
    return fcurTotalTaxPayable;
  }
  public void set_fcurTotalTaxPayable(java.math.BigDecimal fcurTotalTaxPayable) {
    this.fcurTotalTaxPayable = fcurTotalTaxPayable;
  }
  public tblnz_rtnnitest with_fcurTotalTaxPayable(java.math.BigDecimal fcurTotalTaxPayable) {
    this.fcurTotalTaxPayable = fcurTotalTaxPayable;
    return this;
  }
  private java.math.BigDecimal fcurShareOfOverseasTax;
  public java.math.BigDecimal get_fcurShareOfOverseasTax() {
    return fcurShareOfOverseasTax;
  }
  public void set_fcurShareOfOverseasTax(java.math.BigDecimal fcurShareOfOverseasTax) {
    this.fcurShareOfOverseasTax = fcurShareOfOverseasTax;
  }
  public tblnz_rtnnitest with_fcurShareOfOverseasTax(java.math.BigDecimal fcurShareOfOverseasTax) {
    this.fcurShareOfOverseasTax = fcurShareOfOverseasTax;
    return this;
  }
  private java.math.BigDecimal fcurTaxPayableAfterShare;
  public java.math.BigDecimal get_fcurTaxPayableAfterShare() {
    return fcurTaxPayableAfterShare;
  }
  public void set_fcurTaxPayableAfterShare(java.math.BigDecimal fcurTaxPayableAfterShare) {
    this.fcurTaxPayableAfterShare = fcurTaxPayableAfterShare;
  }
  public tblnz_rtnnitest with_fcurTaxPayableAfterShare(java.math.BigDecimal fcurTaxPayableAfterShare) {
    this.fcurTaxPayableAfterShare = fcurTaxPayableAfterShare;
    return this;
  }
  private java.math.BigDecimal fcurShareOfImputation;
  public java.math.BigDecimal get_fcurShareOfImputation() {
    return fcurShareOfImputation;
  }
  public void set_fcurShareOfImputation(java.math.BigDecimal fcurShareOfImputation) {
    this.fcurShareOfImputation = fcurShareOfImputation;
  }
  public tblnz_rtnnitest with_fcurShareOfImputation(java.math.BigDecimal fcurShareOfImputation) {
    this.fcurShareOfImputation = fcurShareOfImputation;
    return this;
  }
  private java.math.BigDecimal fcurTaxPayableAfterImputation;
  public java.math.BigDecimal get_fcurTaxPayableAfterImputation() {
    return fcurTaxPayableAfterImputation;
  }
  public void set_fcurTaxPayableAfterImputation(java.math.BigDecimal fcurTaxPayableAfterImputation) {
    this.fcurTaxPayableAfterImputation = fcurTaxPayableAfterImputation;
  }
  public tblnz_rtnnitest with_fcurTaxPayableAfterImputation(java.math.BigDecimal fcurTaxPayableAfterImputation) {
    this.fcurTaxPayableAfterImputation = fcurTaxPayableAfterImputation;
    return this;
  }
  private java.math.BigDecimal fcurShareOfRWT;
  public java.math.BigDecimal get_fcurShareOfRWT() {
    return fcurShareOfRWT;
  }
  public void set_fcurShareOfRWT(java.math.BigDecimal fcurShareOfRWT) {
    this.fcurShareOfRWT = fcurShareOfRWT;
  }
  public tblnz_rtnnitest with_fcurShareOfRWT(java.math.BigDecimal fcurShareOfRWT) {
    this.fcurShareOfRWT = fcurShareOfRWT;
    return this;
  }
  private java.math.BigDecimal fcurTaxPayableAfterRWT;
  public java.math.BigDecimal get_fcurTaxPayableAfterRWT() {
    return fcurTaxPayableAfterRWT;
  }
  public void set_fcurTaxPayableAfterRWT(java.math.BigDecimal fcurTaxPayableAfterRWT) {
    this.fcurTaxPayableAfterRWT = fcurTaxPayableAfterRWT;
  }
  public tblnz_rtnnitest with_fcurTaxPayableAfterRWT(java.math.BigDecimal fcurTaxPayableAfterRWT) {
    this.fcurTaxPayableAfterRWT = fcurTaxPayableAfterRWT;
    return this;
  }
  private java.math.BigDecimal fcurResidualIncomeTax;
  public java.math.BigDecimal get_fcurResidualIncomeTax() {
    return fcurResidualIncomeTax;
  }
  public void set_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
  }
  public tblnz_rtnnitest with_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
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
  public tblnz_rtnnitest with_fcurProvisionalTaxPaid(java.math.BigDecimal fcurProvisionalTaxPaid) {
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
  public tblnz_rtnnitest with_fcurTaxAmount(java.math.BigDecimal fcurTaxAmount) {
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
  public tblnz_rtnnitest with_fcurOverpaymentProvisional(java.math.BigDecimal fcurOverpaymentProvisional) {
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
  public tblnz_rtnnitest with_fcurRefundAfterOverpayment(java.math.BigDecimal fcurRefundAfterOverpayment) {
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
  public tblnz_rtnnitest with_fcurTransferProvisional(java.math.BigDecimal fcurTransferProvisional) {
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
  public tblnz_rtnnitest with_fcurTransferCustomerAmount(java.math.BigDecimal fcurTransferCustomerAmount) {
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
  public tblnz_rtnnitest with_fcurTotalRefund(java.math.BigDecimal fcurTotalRefund) {
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
  public tblnz_rtnnitest with_fdtmProvisionalStartDate(java.sql.Timestamp fdtmProvisionalStartDate) {
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
  public tblnz_rtnnitest with_fstrProvisionalOption(String fstrProvisionalOption) {
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
  public tblnz_rtnnitest with_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
    this.fcurProvisionalTax = fcurProvisionalTax;
    return this;
  }
  private java.math.BigDecimal fcurExcessImputationCredits;
  public java.math.BigDecimal get_fcurExcessImputationCredits() {
    return fcurExcessImputationCredits;
  }
  public void set_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
  }
  public tblnz_rtnnitest with_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurExcessImputationAsLoss;
  public java.math.BigDecimal get_fcurExcessImputationAsLoss() {
    return fcurExcessImputationAsLoss;
  }
  public void set_fcurExcessImputationAsLoss(java.math.BigDecimal fcurExcessImputationAsLoss) {
    this.fcurExcessImputationAsLoss = fcurExcessImputationAsLoss;
  }
  public tblnz_rtnnitest with_fcurExcessImputationAsLoss(java.math.BigDecimal fcurExcessImputationAsLoss) {
    this.fcurExcessImputationAsLoss = fcurExcessImputationAsLoss;
    return this;
  }
  private java.math.BigDecimal fcurLossToCarryForward;
  public java.math.BigDecimal get_fcurLossToCarryForward() {
    return fcurLossToCarryForward;
  }
  public void set_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
  }
  public tblnz_rtnnitest with_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
    return this;
  }
  private Integer fblnComplyingTrust;
  public Integer get_fblnComplyingTrust() {
    return fblnComplyingTrust;
  }
  public void set_fblnComplyingTrust(Integer fblnComplyingTrust) {
    this.fblnComplyingTrust = fblnComplyingTrust;
  }
  public tblnz_rtnnitest with_fblnComplyingTrust(Integer fblnComplyingTrust) {
    this.fblnComplyingTrust = fblnComplyingTrust;
    return this;
  }
  private Integer fblnForeignTrust;
  public Integer get_fblnForeignTrust() {
    return fblnForeignTrust;
  }
  public void set_fblnForeignTrust(Integer fblnForeignTrust) {
    this.fblnForeignTrust = fblnForeignTrust;
  }
  public tblnz_rtnnitest with_fblnForeignTrust(Integer fblnForeignTrust) {
    this.fblnForeignTrust = fblnForeignTrust;
    return this;
  }
  private Integer fblnNonComplyingTrust;
  public Integer get_fblnNonComplyingTrust() {
    return fblnNonComplyingTrust;
  }
  public void set_fblnNonComplyingTrust(Integer fblnNonComplyingTrust) {
    this.fblnNonComplyingTrust = fblnNonComplyingTrust;
  }
  public tblnz_rtnnitest with_fblnNonComplyingTrust(Integer fblnNonComplyingTrust) {
    this.fblnNonComplyingTrust = fblnNonComplyingTrust;
    return this;
  }
  private String fstrResMethod;
  public String get_fstrResMethod() {
    return fstrResMethod;
  }
  public void set_fstrResMethod(String fstrResMethod) {
    this.fstrResMethod = fstrResMethod;
  }
  public tblnz_rtnnitest with_fstrResMethod(String fstrResMethod) {
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
  public tblnz_rtnnitest with_fcurResIncome(java.math.BigDecimal fcurResIncome) {
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
  public tblnz_rtnnitest with_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
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
  public tblnz_rtnnitest with_fcurResDeductionsPriorYear(java.math.BigDecimal fcurResDeductionsPriorYear) {
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
  public tblnz_rtnnitest with_fcurResDeductionsClaimed(java.math.BigDecimal fcurResDeductionsClaimed) {
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
  public tblnz_rtnnitest with_fcurResNetIncome(java.math.BigDecimal fcurResNetIncome) {
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
  public tblnz_rtnnitest with_fcurResDeductionsForward(java.math.BigDecimal fcurResDeductionsForward) {
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
  public tblnz_rtnnitest with_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
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
  public tblnz_rtnnitest with_fcurRDICarryForwardRemaining(java.math.BigDecimal fcurRDICarryForwardRemaining) {
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
  public tblnz_rtnnitest with_fcurSaleOfProperty(java.math.BigDecimal fcurSaleOfProperty) {
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
  public tblnz_rtnnitest with_fstrWho(String fstrWho) {
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
  public tblnz_rtnnitest with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitest)) {
      return false;
    }
    tblnz_rtnnitest that = (tblnz_rtnnitest) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurDividendImputation == null ? that.fcurDividendImputation == null : this.fcurDividendImputation.equals(that.fcurDividendImputation));
    equal = equal && (this.fcurDividendRWT == null ? that.fcurDividendRWT == null : this.fcurDividendRWT.equals(that.fcurDividendRWT));
    equal = equal && (this.fcurDividendGross == null ? that.fcurDividendGross == null : this.fcurDividendGross.equals(that.fcurDividendGross));
    equal = equal && (this.fcurMaoriCredits == null ? that.fcurMaoriCredits == null : this.fcurMaoriCredits.equals(that.fcurMaoriCredits));
    equal = equal && (this.fcurMaoriDistributions == null ? that.fcurMaoriDistributions == null : this.fcurMaoriDistributions.equals(that.fcurMaoriDistributions));
    equal = equal && (this.fcurTrustCredits == null ? that.fcurTrustCredits == null : this.fcurTrustCredits.equals(that.fcurTrustCredits));
    equal = equal && (this.fcurTrustIncome == null ? that.fcurTrustIncome == null : this.fcurTrustIncome.equals(that.fcurTrustIncome));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurOverseasIncome == null ? that.fcurOverseasIncome == null : this.fcurOverseasIncome.equals(that.fcurOverseasIncome));
    equal = equal && (this.fcurLTCCredits == null ? that.fcurLTCCredits == null : this.fcurLTCCredits.equals(that.fcurLTCCredits));
    equal = equal && (this.fcurLTCActiveIncome == null ? that.fcurLTCActiveIncome == null : this.fcurLTCActiveIncome.equals(that.fcurLTCActiveIncome));
    equal = equal && (this.fcurLTCDeductions == null ? that.fcurLTCDeductions == null : this.fcurLTCDeductions.equals(that.fcurLTCDeductions));
    equal = equal && (this.fcurLTCPriorDeductions == null ? that.fcurLTCPriorDeductions == null : this.fcurLTCPriorDeductions.equals(that.fcurLTCPriorDeductions));
    equal = equal && (this.fcurAdjustedIncome == null ? that.fcurAdjustedIncome == null : this.fcurAdjustedIncome.equals(that.fcurAdjustedIncome));
    equal = equal && (this.fcurBusinessIncome == null ? that.fcurBusinessIncome == null : this.fcurBusinessIncome.equals(that.fcurBusinessIncome));
    equal = equal && (this.fcurTotalOtherCredits == null ? that.fcurTotalOtherCredits == null : this.fcurTotalOtherCredits.equals(that.fcurTotalOtherCredits));
    equal = equal && (this.fcurTotalOtherIncome == null ? that.fcurTotalOtherIncome == null : this.fcurTotalOtherIncome.equals(that.fcurTotalOtherIncome));
    equal = equal && (this.fcurTotalCredits == null ? that.fcurTotalCredits == null : this.fcurTotalCredits.equals(that.fcurTotalCredits));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurBeneficiaryIncome == null ? that.fcurBeneficiaryIncome == null : this.fcurBeneficiaryIncome.equals(that.fcurBeneficiaryIncome));
    equal = equal && (this.fcurTrusteeIncome == null ? that.fcurTrusteeIncome == null : this.fcurTrusteeIncome.equals(that.fcurTrusteeIncome));
    equal = equal && (this.fcurTaxPayableTrusteesIncome == null ? that.fcurTaxPayableTrusteesIncome == null : this.fcurTaxPayableTrusteesIncome.equals(that.fcurTaxPayableTrusteesIncome));
    equal = equal && (this.fcurExpensesClaimed == null ? that.fcurExpensesClaimed == null : this.fcurExpensesClaimed.equals(that.fcurExpensesClaimed));
    equal = equal && (this.fcurNetLossBroughtForward == null ? that.fcurNetLossBroughtForward == null : this.fcurNetLossBroughtForward.equals(that.fcurNetLossBroughtForward));
    equal = equal && (this.fcurNetLossClaimed == null ? that.fcurNetLossClaimed == null : this.fcurNetLossClaimed.equals(that.fcurNetLossClaimed));
    equal = equal && (this.fcurTotalDistributions == null ? that.fcurTotalDistributions == null : this.fcurTotalDistributions.equals(that.fcurTotalDistributions));
    equal = equal && (this.fcurTaxableDistributions == null ? that.fcurTaxableDistributions == null : this.fcurTaxableDistributions.equals(that.fcurTaxableDistributions));
    equal = equal && (this.fblnCFC == null ? that.fblnCFC == null : this.fblnCFC.equals(that.fblnCFC));
    equal = equal && (this.fcurTotalTaxBeneficiaries == null ? that.fcurTotalTaxBeneficiaries == null : this.fcurTotalTaxBeneficiaries.equals(that.fcurTotalTaxBeneficiaries));
    equal = equal && (this.fcurIncomeAfterExpenses == null ? that.fcurIncomeAfterExpenses == null : this.fcurIncomeAfterExpenses.equals(that.fcurIncomeAfterExpenses));
    equal = equal && (this.fcurTotalTaxPayable == null ? that.fcurTotalTaxPayable == null : this.fcurTotalTaxPayable.equals(that.fcurTotalTaxPayable));
    equal = equal && (this.fcurShareOfOverseasTax == null ? that.fcurShareOfOverseasTax == null : this.fcurShareOfOverseasTax.equals(that.fcurShareOfOverseasTax));
    equal = equal && (this.fcurTaxPayableAfterShare == null ? that.fcurTaxPayableAfterShare == null : this.fcurTaxPayableAfterShare.equals(that.fcurTaxPayableAfterShare));
    equal = equal && (this.fcurShareOfImputation == null ? that.fcurShareOfImputation == null : this.fcurShareOfImputation.equals(that.fcurShareOfImputation));
    equal = equal && (this.fcurTaxPayableAfterImputation == null ? that.fcurTaxPayableAfterImputation == null : this.fcurTaxPayableAfterImputation.equals(that.fcurTaxPayableAfterImputation));
    equal = equal && (this.fcurShareOfRWT == null ? that.fcurShareOfRWT == null : this.fcurShareOfRWT.equals(that.fcurShareOfRWT));
    equal = equal && (this.fcurTaxPayableAfterRWT == null ? that.fcurTaxPayableAfterRWT == null : this.fcurTaxPayableAfterRWT.equals(that.fcurTaxPayableAfterRWT));
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
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurExcessImputationAsLoss == null ? that.fcurExcessImputationAsLoss == null : this.fcurExcessImputationAsLoss.equals(that.fcurExcessImputationAsLoss));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fblnComplyingTrust == null ? that.fblnComplyingTrust == null : this.fblnComplyingTrust.equals(that.fblnComplyingTrust));
    equal = equal && (this.fblnForeignTrust == null ? that.fblnForeignTrust == null : this.fblnForeignTrust.equals(that.fblnForeignTrust));
    equal = equal && (this.fblnNonComplyingTrust == null ? that.fblnNonComplyingTrust == null : this.fblnNonComplyingTrust.equals(that.fblnNonComplyingTrust));
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
    if (!(o instanceof tblnz_rtnnitest)) {
      return false;
    }
    tblnz_rtnnitest that = (tblnz_rtnnitest) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurDividendImputation == null ? that.fcurDividendImputation == null : this.fcurDividendImputation.equals(that.fcurDividendImputation));
    equal = equal && (this.fcurDividendRWT == null ? that.fcurDividendRWT == null : this.fcurDividendRWT.equals(that.fcurDividendRWT));
    equal = equal && (this.fcurDividendGross == null ? that.fcurDividendGross == null : this.fcurDividendGross.equals(that.fcurDividendGross));
    equal = equal && (this.fcurMaoriCredits == null ? that.fcurMaoriCredits == null : this.fcurMaoriCredits.equals(that.fcurMaoriCredits));
    equal = equal && (this.fcurMaoriDistributions == null ? that.fcurMaoriDistributions == null : this.fcurMaoriDistributions.equals(that.fcurMaoriDistributions));
    equal = equal && (this.fcurTrustCredits == null ? that.fcurTrustCredits == null : this.fcurTrustCredits.equals(that.fcurTrustCredits));
    equal = equal && (this.fcurTrustIncome == null ? that.fcurTrustIncome == null : this.fcurTrustIncome.equals(that.fcurTrustIncome));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurOverseasIncome == null ? that.fcurOverseasIncome == null : this.fcurOverseasIncome.equals(that.fcurOverseasIncome));
    equal = equal && (this.fcurLTCCredits == null ? that.fcurLTCCredits == null : this.fcurLTCCredits.equals(that.fcurLTCCredits));
    equal = equal && (this.fcurLTCActiveIncome == null ? that.fcurLTCActiveIncome == null : this.fcurLTCActiveIncome.equals(that.fcurLTCActiveIncome));
    equal = equal && (this.fcurLTCDeductions == null ? that.fcurLTCDeductions == null : this.fcurLTCDeductions.equals(that.fcurLTCDeductions));
    equal = equal && (this.fcurLTCPriorDeductions == null ? that.fcurLTCPriorDeductions == null : this.fcurLTCPriorDeductions.equals(that.fcurLTCPriorDeductions));
    equal = equal && (this.fcurAdjustedIncome == null ? that.fcurAdjustedIncome == null : this.fcurAdjustedIncome.equals(that.fcurAdjustedIncome));
    equal = equal && (this.fcurBusinessIncome == null ? that.fcurBusinessIncome == null : this.fcurBusinessIncome.equals(that.fcurBusinessIncome));
    equal = equal && (this.fcurTotalOtherCredits == null ? that.fcurTotalOtherCredits == null : this.fcurTotalOtherCredits.equals(that.fcurTotalOtherCredits));
    equal = equal && (this.fcurTotalOtherIncome == null ? that.fcurTotalOtherIncome == null : this.fcurTotalOtherIncome.equals(that.fcurTotalOtherIncome));
    equal = equal && (this.fcurTotalCredits == null ? that.fcurTotalCredits == null : this.fcurTotalCredits.equals(that.fcurTotalCredits));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurBeneficiaryIncome == null ? that.fcurBeneficiaryIncome == null : this.fcurBeneficiaryIncome.equals(that.fcurBeneficiaryIncome));
    equal = equal && (this.fcurTrusteeIncome == null ? that.fcurTrusteeIncome == null : this.fcurTrusteeIncome.equals(that.fcurTrusteeIncome));
    equal = equal && (this.fcurTaxPayableTrusteesIncome == null ? that.fcurTaxPayableTrusteesIncome == null : this.fcurTaxPayableTrusteesIncome.equals(that.fcurTaxPayableTrusteesIncome));
    equal = equal && (this.fcurExpensesClaimed == null ? that.fcurExpensesClaimed == null : this.fcurExpensesClaimed.equals(that.fcurExpensesClaimed));
    equal = equal && (this.fcurNetLossBroughtForward == null ? that.fcurNetLossBroughtForward == null : this.fcurNetLossBroughtForward.equals(that.fcurNetLossBroughtForward));
    equal = equal && (this.fcurNetLossClaimed == null ? that.fcurNetLossClaimed == null : this.fcurNetLossClaimed.equals(that.fcurNetLossClaimed));
    equal = equal && (this.fcurTotalDistributions == null ? that.fcurTotalDistributions == null : this.fcurTotalDistributions.equals(that.fcurTotalDistributions));
    equal = equal && (this.fcurTaxableDistributions == null ? that.fcurTaxableDistributions == null : this.fcurTaxableDistributions.equals(that.fcurTaxableDistributions));
    equal = equal && (this.fblnCFC == null ? that.fblnCFC == null : this.fblnCFC.equals(that.fblnCFC));
    equal = equal && (this.fcurTotalTaxBeneficiaries == null ? that.fcurTotalTaxBeneficiaries == null : this.fcurTotalTaxBeneficiaries.equals(that.fcurTotalTaxBeneficiaries));
    equal = equal && (this.fcurIncomeAfterExpenses == null ? that.fcurIncomeAfterExpenses == null : this.fcurIncomeAfterExpenses.equals(that.fcurIncomeAfterExpenses));
    equal = equal && (this.fcurTotalTaxPayable == null ? that.fcurTotalTaxPayable == null : this.fcurTotalTaxPayable.equals(that.fcurTotalTaxPayable));
    equal = equal && (this.fcurShareOfOverseasTax == null ? that.fcurShareOfOverseasTax == null : this.fcurShareOfOverseasTax.equals(that.fcurShareOfOverseasTax));
    equal = equal && (this.fcurTaxPayableAfterShare == null ? that.fcurTaxPayableAfterShare == null : this.fcurTaxPayableAfterShare.equals(that.fcurTaxPayableAfterShare));
    equal = equal && (this.fcurShareOfImputation == null ? that.fcurShareOfImputation == null : this.fcurShareOfImputation.equals(that.fcurShareOfImputation));
    equal = equal && (this.fcurTaxPayableAfterImputation == null ? that.fcurTaxPayableAfterImputation == null : this.fcurTaxPayableAfterImputation.equals(that.fcurTaxPayableAfterImputation));
    equal = equal && (this.fcurShareOfRWT == null ? that.fcurShareOfRWT == null : this.fcurShareOfRWT.equals(that.fcurShareOfRWT));
    equal = equal && (this.fcurTaxPayableAfterRWT == null ? that.fcurTaxPayableAfterRWT == null : this.fcurTaxPayableAfterRWT.equals(that.fcurTaxPayableAfterRWT));
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
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurExcessImputationAsLoss == null ? that.fcurExcessImputationAsLoss == null : this.fcurExcessImputationAsLoss.equals(that.fcurExcessImputationAsLoss));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fblnComplyingTrust == null ? that.fblnComplyingTrust == null : this.fblnComplyingTrust.equals(that.fblnComplyingTrust));
    equal = equal && (this.fblnForeignTrust == null ? that.fblnForeignTrust == null : this.fblnForeignTrust.equals(that.fblnForeignTrust));
    equal = equal && (this.fblnNonComplyingTrust == null ? that.fblnNonComplyingTrust == null : this.fblnNonComplyingTrust.equals(that.fblnNonComplyingTrust));
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
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurDividendImputation = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurDividendRWT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDividendGross = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurMaoriCredits = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurMaoriDistributions = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTrustCredits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurTrustIncome = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurOverseasIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLTCCredits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurLTCActiveIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurLTCDeductions = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurLTCPriorDeductions = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurAdjustedIncome = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurBusinessIncome = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalOtherCredits = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalOtherIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurTotalCredits = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurBeneficiaryIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTrusteeIncome = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxPayableTrusteesIncome = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurExpensesClaimed = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetLossBroughtForward = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurNetLossClaimed = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTotalDistributions = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTaxableDistributions = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fblnCFC = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fcurTotalTaxBeneficiaries = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurIncomeAfterExpenses = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurTotalTaxPayable = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurShareOfOverseasTax = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurTaxPayableAfterShare = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurShareOfImputation = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurTaxPayableAfterImputation = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurShareOfRWT = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurTaxPayableAfterRWT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurOverpaymentProvisional = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurRefundAfterOverpayment = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(50, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(51, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurExcessImputationAsLoss = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fblnComplyingTrust = JdbcWritableBridge.readInteger(56, __dbResults);
    this.fblnForeignTrust = JdbcWritableBridge.readInteger(57, __dbResults);
    this.fblnNonComplyingTrust = JdbcWritableBridge.readInteger(58, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(59, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(69, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(70, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurDividendImputation = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurDividendRWT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDividendGross = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurMaoriCredits = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurMaoriDistributions = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTrustCredits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurTrustIncome = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurOverseasIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLTCCredits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurLTCActiveIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurLTCDeductions = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurLTCPriorDeductions = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurAdjustedIncome = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurBusinessIncome = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalOtherCredits = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalOtherIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurTotalCredits = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurBeneficiaryIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTrusteeIncome = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxPayableTrusteesIncome = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurExpensesClaimed = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetLossBroughtForward = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurNetLossClaimed = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTotalDistributions = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTaxableDistributions = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fblnCFC = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fcurTotalTaxBeneficiaries = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurIncomeAfterExpenses = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurTotalTaxPayable = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurShareOfOverseasTax = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurTaxPayableAfterShare = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurShareOfImputation = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurTaxPayableAfterImputation = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurShareOfRWT = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurTaxPayableAfterRWT = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurOverpaymentProvisional = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurRefundAfterOverpayment = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(50, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(51, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurExcessImputationAsLoss = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fblnComplyingTrust = JdbcWritableBridge.readInteger(56, __dbResults);
    this.fblnForeignTrust = JdbcWritableBridge.readInteger(57, __dbResults);
    this.fblnNonComplyingTrust = JdbcWritableBridge.readInteger(58, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(59, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(69, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(70, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendImputation, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendRWT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendGross, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriCredits, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriDistributions, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustCredits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustIncome, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCCredits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCActiveIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCDeductions, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCPriorDeductions, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedIncome, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBusinessIncome, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherCredits, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCredits, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrusteeIncome, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableTrusteesIncome, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExpensesClaimed, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossBroughtForward, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossClaimed, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDistributions, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableDistributions, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCFC, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxBeneficiaries, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterExpenses, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxPayable, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareOfOverseasTax, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterShare, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareOfImputation, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterImputation, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareOfRWT, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterRWT, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvisional, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAfterOverpayment, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 50 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationAsLoss, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnComplyingTrust, 56 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnForeignTrust, 57 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonComplyingTrust, 58 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 59 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 69 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 70 + __off, 93, __dbStmt);
    return 70;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendImputation, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendRWT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendGross, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriCredits, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriDistributions, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustCredits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustIncome, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCCredits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCActiveIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCDeductions, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCPriorDeductions, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedIncome, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBusinessIncome, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherCredits, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCredits, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrusteeIncome, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableTrusteesIncome, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExpensesClaimed, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossBroughtForward, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossClaimed, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDistributions, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableDistributions, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCFC, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxBeneficiaries, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterExpenses, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxPayable, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareOfOverseasTax, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterShare, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareOfImputation, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterImputation, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareOfRWT, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterRWT, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvisional, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAfterOverpayment, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 50 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationAsLoss, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnComplyingTrust, 56 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnForeignTrust, 57 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonComplyingTrust, 58 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 59 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 69 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 70 + __off, 93, __dbStmt);
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
        this.fcurRWT = null;
    } else {
    this.fcurRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossInterest = null;
    } else {
    this.fcurGrossInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendImputation = null;
    } else {
    this.fcurDividendImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendRWT = null;
    } else {
    this.fcurDividendRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendGross = null;
    } else {
    this.fcurDividendGross = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMaoriCredits = null;
    } else {
    this.fcurMaoriCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMaoriDistributions = null;
    } else {
    this.fcurMaoriDistributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTrustCredits = null;
    } else {
    this.fcurTrustCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTrustIncome = null;
    } else {
    this.fcurTrustIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOverseasTax = null;
    } else {
    this.fcurOverseasTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOverseasIncome = null;
    } else {
    this.fcurOverseasIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLTCCredits = null;
    } else {
    this.fcurLTCCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLTCActiveIncome = null;
    } else {
    this.fcurLTCActiveIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLTCDeductions = null;
    } else {
    this.fcurLTCDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLTCPriorDeductions = null;
    } else {
    this.fcurLTCPriorDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdjustedIncome = null;
    } else {
    this.fcurAdjustedIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBusinessIncome = null;
    } else {
    this.fcurBusinessIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOtherCredits = null;
    } else {
    this.fcurTotalOtherCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOtherIncome = null;
    } else {
    this.fcurTotalOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalCredits = null;
    } else {
    this.fcurTotalCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncome = null;
    } else {
    this.fcurTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRLWT = null;
    } else {
    this.fcurRLWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryIncome = null;
    } else {
    this.fcurBeneficiaryIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTrusteeIncome = null;
    } else {
    this.fcurTrusteeIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPayableTrusteesIncome = null;
    } else {
    this.fcurTaxPayableTrusteesIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExpensesClaimed = null;
    } else {
    this.fcurExpensesClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetLossBroughtForward = null;
    } else {
    this.fcurNetLossBroughtForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetLossClaimed = null;
    } else {
    this.fcurNetLossClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalDistributions = null;
    } else {
    this.fcurTotalDistributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxableDistributions = null;
    } else {
    this.fcurTaxableDistributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCFC = null;
    } else {
    this.fblnCFC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxBeneficiaries = null;
    } else {
    this.fcurTotalTaxBeneficiaries = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAfterExpenses = null;
    } else {
    this.fcurIncomeAfterExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxPayable = null;
    } else {
    this.fcurTotalTaxPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareOfOverseasTax = null;
    } else {
    this.fcurShareOfOverseasTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPayableAfterShare = null;
    } else {
    this.fcurTaxPayableAfterShare = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareOfImputation = null;
    } else {
    this.fcurShareOfImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPayableAfterImputation = null;
    } else {
    this.fcurTaxPayableAfterImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareOfRWT = null;
    } else {
    this.fcurShareOfRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPayableAfterRWT = null;
    } else {
    this.fcurTaxPayableAfterRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurExcessImputationCredits = null;
    } else {
    this.fcurExcessImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessImputationAsLoss = null;
    } else {
    this.fcurExcessImputationAsLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossToCarryForward = null;
    } else {
    this.fcurLossToCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnComplyingTrust = null;
    } else {
    this.fblnComplyingTrust = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnForeignTrust = null;
    } else {
    this.fblnForeignTrust = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNonComplyingTrust = null;
    } else {
    this.fblnNonComplyingTrust = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fcurRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWT, __dataOut);
    }
    if (null == this.fcurGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossInterest, __dataOut);
    }
    if (null == this.fcurDividendImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendImputation, __dataOut);
    }
    if (null == this.fcurDividendRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendRWT, __dataOut);
    }
    if (null == this.fcurDividendGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendGross, __dataOut);
    }
    if (null == this.fcurMaoriCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaoriCredits, __dataOut);
    }
    if (null == this.fcurMaoriDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaoriDistributions, __dataOut);
    }
    if (null == this.fcurTrustCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrustCredits, __dataOut);
    }
    if (null == this.fcurTrustIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrustIncome, __dataOut);
    }
    if (null == this.fcurOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasTax, __dataOut);
    }
    if (null == this.fcurOverseasIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasIncome, __dataOut);
    }
    if (null == this.fcurLTCCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCCredits, __dataOut);
    }
    if (null == this.fcurLTCActiveIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCActiveIncome, __dataOut);
    }
    if (null == this.fcurLTCDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCDeductions, __dataOut);
    }
    if (null == this.fcurLTCPriorDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCPriorDeductions, __dataOut);
    }
    if (null == this.fcurAdjustedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedIncome, __dataOut);
    }
    if (null == this.fcurBusinessIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBusinessIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherCredits, __dataOut);
    }
    if (null == this.fcurTotalOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCredits, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurRLWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWT, __dataOut);
    }
    if (null == this.fcurBeneficiaryIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryIncome, __dataOut);
    }
    if (null == this.fcurTrusteeIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrusteeIncome, __dataOut);
    }
    if (null == this.fcurTaxPayableTrusteesIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableTrusteesIncome, __dataOut);
    }
    if (null == this.fcurExpensesClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExpensesClaimed, __dataOut);
    }
    if (null == this.fcurNetLossBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossBroughtForward, __dataOut);
    }
    if (null == this.fcurNetLossClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossClaimed, __dataOut);
    }
    if (null == this.fcurTotalDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDistributions, __dataOut);
    }
    if (null == this.fcurTaxableDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableDistributions, __dataOut);
    }
    if (null == this.fblnCFC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCFC);
    }
    if (null == this.fcurTotalTaxBeneficiaries) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxBeneficiaries, __dataOut);
    }
    if (null == this.fcurIncomeAfterExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterExpenses, __dataOut);
    }
    if (null == this.fcurTotalTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxPayable, __dataOut);
    }
    if (null == this.fcurShareOfOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareOfOverseasTax, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterShare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterShare, __dataOut);
    }
    if (null == this.fcurShareOfImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareOfImputation, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterImputation, __dataOut);
    }
    if (null == this.fcurShareOfRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareOfRWT, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterRWT, __dataOut);
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
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
    }
    if (null == this.fcurExcessImputationAsLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationAsLoss, __dataOut);
    }
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fblnComplyingTrust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnComplyingTrust);
    }
    if (null == this.fblnForeignTrust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnForeignTrust);
    }
    if (null == this.fblnNonComplyingTrust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonComplyingTrust);
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
    if (null == this.fcurRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWT, __dataOut);
    }
    if (null == this.fcurGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossInterest, __dataOut);
    }
    if (null == this.fcurDividendImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendImputation, __dataOut);
    }
    if (null == this.fcurDividendRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendRWT, __dataOut);
    }
    if (null == this.fcurDividendGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendGross, __dataOut);
    }
    if (null == this.fcurMaoriCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaoriCredits, __dataOut);
    }
    if (null == this.fcurMaoriDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaoriDistributions, __dataOut);
    }
    if (null == this.fcurTrustCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrustCredits, __dataOut);
    }
    if (null == this.fcurTrustIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrustIncome, __dataOut);
    }
    if (null == this.fcurOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasTax, __dataOut);
    }
    if (null == this.fcurOverseasIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasIncome, __dataOut);
    }
    if (null == this.fcurLTCCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCCredits, __dataOut);
    }
    if (null == this.fcurLTCActiveIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCActiveIncome, __dataOut);
    }
    if (null == this.fcurLTCDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCDeductions, __dataOut);
    }
    if (null == this.fcurLTCPriorDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCPriorDeductions, __dataOut);
    }
    if (null == this.fcurAdjustedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedIncome, __dataOut);
    }
    if (null == this.fcurBusinessIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBusinessIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherCredits, __dataOut);
    }
    if (null == this.fcurTotalOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCredits, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurRLWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWT, __dataOut);
    }
    if (null == this.fcurBeneficiaryIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryIncome, __dataOut);
    }
    if (null == this.fcurTrusteeIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrusteeIncome, __dataOut);
    }
    if (null == this.fcurTaxPayableTrusteesIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableTrusteesIncome, __dataOut);
    }
    if (null == this.fcurExpensesClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExpensesClaimed, __dataOut);
    }
    if (null == this.fcurNetLossBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossBroughtForward, __dataOut);
    }
    if (null == this.fcurNetLossClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossClaimed, __dataOut);
    }
    if (null == this.fcurTotalDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDistributions, __dataOut);
    }
    if (null == this.fcurTaxableDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableDistributions, __dataOut);
    }
    if (null == this.fblnCFC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCFC);
    }
    if (null == this.fcurTotalTaxBeneficiaries) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxBeneficiaries, __dataOut);
    }
    if (null == this.fcurIncomeAfterExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterExpenses, __dataOut);
    }
    if (null == this.fcurTotalTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxPayable, __dataOut);
    }
    if (null == this.fcurShareOfOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareOfOverseasTax, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterShare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterShare, __dataOut);
    }
    if (null == this.fcurShareOfImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareOfImputation, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterImputation, __dataOut);
    }
    if (null == this.fcurShareOfRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareOfRWT, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterRWT, __dataOut);
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
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
    }
    if (null == this.fcurExcessImputationAsLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationAsLoss, __dataOut);
    }
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fblnComplyingTrust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnComplyingTrust);
    }
    if (null == this.fblnForeignTrust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnForeignTrust);
    }
    if (null == this.fblnNonComplyingTrust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonComplyingTrust);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWT==null?"\\N":fcurRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossInterest==null?"\\N":fcurGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendImputation==null?"\\N":fcurDividendImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendRWT==null?"\\N":fcurDividendRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendGross==null?"\\N":fcurDividendGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaoriCredits==null?"\\N":fcurMaoriCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaoriDistributions==null?"\\N":fcurMaoriDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrustCredits==null?"\\N":fcurTrustCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrustIncome==null?"\\N":fcurTrustIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasIncome==null?"\\N":fcurOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCCredits==null?"\\N":fcurLTCCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCActiveIncome==null?"\\N":fcurLTCActiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCDeductions==null?"\\N":fcurLTCDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCPriorDeductions==null?"\\N":fcurLTCPriorDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedIncome==null?"\\N":fcurAdjustedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBusinessIncome==null?"\\N":fcurBusinessIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherCredits==null?"\\N":fcurTotalOtherCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherIncome==null?"\\N":fcurTotalOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCredits==null?"\\N":fcurTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryIncome==null?"\\N":fcurBeneficiaryIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrusteeIncome==null?"\\N":fcurTrusteeIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableTrusteesIncome==null?"\\N":fcurTaxPayableTrusteesIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExpensesClaimed==null?"\\N":fcurExpensesClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossBroughtForward==null?"\\N":fcurNetLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossClaimed==null?"\\N":fcurNetLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDistributions==null?"\\N":fcurTotalDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableDistributions==null?"\\N":fcurTaxableDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCFC==null?"\\N":"" + fblnCFC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxBeneficiaries==null?"\\N":fcurTotalTaxBeneficiaries.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterExpenses==null?"\\N":fcurIncomeAfterExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxPayable==null?"\\N":fcurTotalTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareOfOverseasTax==null?"\\N":fcurShareOfOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterShare==null?"\\N":fcurTaxPayableAfterShare.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareOfImputation==null?"\\N":fcurShareOfImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterImputation==null?"\\N":fcurTaxPayableAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareOfRWT==null?"\\N":fcurShareOfRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterRWT==null?"\\N":fcurTaxPayableAfterRWT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationAsLoss==null?"\\N":fcurExcessImputationAsLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnComplyingTrust==null?"\\N":"" + fblnComplyingTrust, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnForeignTrust==null?"\\N":"" + fblnForeignTrust, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonComplyingTrust==null?"\\N":"" + fblnNonComplyingTrust, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWT==null?"\\N":fcurRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossInterest==null?"\\N":fcurGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendImputation==null?"\\N":fcurDividendImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendRWT==null?"\\N":fcurDividendRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendGross==null?"\\N":fcurDividendGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaoriCredits==null?"\\N":fcurMaoriCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaoriDistributions==null?"\\N":fcurMaoriDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrustCredits==null?"\\N":fcurTrustCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrustIncome==null?"\\N":fcurTrustIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasIncome==null?"\\N":fcurOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCCredits==null?"\\N":fcurLTCCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCActiveIncome==null?"\\N":fcurLTCActiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCDeductions==null?"\\N":fcurLTCDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCPriorDeductions==null?"\\N":fcurLTCPriorDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedIncome==null?"\\N":fcurAdjustedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBusinessIncome==null?"\\N":fcurBusinessIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherCredits==null?"\\N":fcurTotalOtherCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherIncome==null?"\\N":fcurTotalOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCredits==null?"\\N":fcurTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryIncome==null?"\\N":fcurBeneficiaryIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrusteeIncome==null?"\\N":fcurTrusteeIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableTrusteesIncome==null?"\\N":fcurTaxPayableTrusteesIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExpensesClaimed==null?"\\N":fcurExpensesClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossBroughtForward==null?"\\N":fcurNetLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossClaimed==null?"\\N":fcurNetLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDistributions==null?"\\N":fcurTotalDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableDistributions==null?"\\N":fcurTaxableDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCFC==null?"\\N":"" + fblnCFC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxBeneficiaries==null?"\\N":fcurTotalTaxBeneficiaries.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterExpenses==null?"\\N":fcurIncomeAfterExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxPayable==null?"\\N":fcurTotalTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareOfOverseasTax==null?"\\N":fcurShareOfOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterShare==null?"\\N":fcurTaxPayableAfterShare.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareOfImputation==null?"\\N":fcurShareOfImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterImputation==null?"\\N":fcurTaxPayableAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareOfRWT==null?"\\N":fcurShareOfRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterRWT==null?"\\N":fcurTaxPayableAfterRWT.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationAsLoss==null?"\\N":fcurExcessImputationAsLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnComplyingTrust==null?"\\N":"" + fblnComplyingTrust, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnForeignTrust==null?"\\N":"" + fblnForeignTrust, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonComplyingTrust==null?"\\N":"" + fblnNonComplyingTrust, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWT = null; } else {
      this.fcurRWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendImputation = null; } else {
      this.fcurDividendImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendRWT = null; } else {
      this.fcurDividendRWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaoriCredits = null; } else {
      this.fcurMaoriCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrustCredits = null; } else {
      this.fcurTrustCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrustIncome = null; } else {
      this.fcurTrustIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverseasIncome = null; } else {
      this.fcurOverseasIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCCredits = null; } else {
      this.fcurLTCCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCActiveIncome = null; } else {
      this.fcurLTCActiveIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCDeductions = null; } else {
      this.fcurLTCDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCPriorDeductions = null; } else {
      this.fcurLTCPriorDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedIncome = null; } else {
      this.fcurAdjustedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBusinessIncome = null; } else {
      this.fcurBusinessIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherIncome = null; } else {
      this.fcurTotalOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCredits = null; } else {
      this.fcurTotalCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWT = null; } else {
      this.fcurRLWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryIncome = null; } else {
      this.fcurBeneficiaryIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrusteeIncome = null; } else {
      this.fcurTrusteeIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableTrusteesIncome = null; } else {
      this.fcurTaxPayableTrusteesIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExpensesClaimed = null; } else {
      this.fcurExpensesClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossBroughtForward = null; } else {
      this.fcurNetLossBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossClaimed = null; } else {
      this.fcurNetLossClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDistributions = null; } else {
      this.fcurTotalDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableDistributions = null; } else {
      this.fcurTaxableDistributions = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxBeneficiaries = null; } else {
      this.fcurTotalTaxBeneficiaries = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxPayable = null; } else {
      this.fcurTotalTaxPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareOfOverseasTax = null; } else {
      this.fcurShareOfOverseasTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableAfterShare = null; } else {
      this.fcurTaxPayableAfterShare = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareOfImputation = null; } else {
      this.fcurShareOfImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableAfterImputation = null; } else {
      this.fcurTaxPayableAfterImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareOfRWT = null; } else {
      this.fcurShareOfRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableAfterRWT = null; } else {
      this.fcurTaxPayableAfterRWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputationCredits = null; } else {
      this.fcurExcessImputationCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnComplyingTrust = null; } else {
      this.fblnComplyingTrust = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnForeignTrust = null; } else {
      this.fblnForeignTrust = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonComplyingTrust = null; } else {
      this.fblnNonComplyingTrust = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWT = null; } else {
      this.fcurRWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendImputation = null; } else {
      this.fcurDividendImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendRWT = null; } else {
      this.fcurDividendRWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaoriCredits = null; } else {
      this.fcurMaoriCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrustCredits = null; } else {
      this.fcurTrustCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrustIncome = null; } else {
      this.fcurTrustIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverseasIncome = null; } else {
      this.fcurOverseasIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCCredits = null; } else {
      this.fcurLTCCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCActiveIncome = null; } else {
      this.fcurLTCActiveIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCDeductions = null; } else {
      this.fcurLTCDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCPriorDeductions = null; } else {
      this.fcurLTCPriorDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedIncome = null; } else {
      this.fcurAdjustedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBusinessIncome = null; } else {
      this.fcurBusinessIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherIncome = null; } else {
      this.fcurTotalOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCredits = null; } else {
      this.fcurTotalCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWT = null; } else {
      this.fcurRLWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryIncome = null; } else {
      this.fcurBeneficiaryIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrusteeIncome = null; } else {
      this.fcurTrusteeIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableTrusteesIncome = null; } else {
      this.fcurTaxPayableTrusteesIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExpensesClaimed = null; } else {
      this.fcurExpensesClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossBroughtForward = null; } else {
      this.fcurNetLossBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossClaimed = null; } else {
      this.fcurNetLossClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDistributions = null; } else {
      this.fcurTotalDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableDistributions = null; } else {
      this.fcurTaxableDistributions = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxBeneficiaries = null; } else {
      this.fcurTotalTaxBeneficiaries = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxPayable = null; } else {
      this.fcurTotalTaxPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareOfOverseasTax = null; } else {
      this.fcurShareOfOverseasTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableAfterShare = null; } else {
      this.fcurTaxPayableAfterShare = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareOfImputation = null; } else {
      this.fcurShareOfImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableAfterImputation = null; } else {
      this.fcurTaxPayableAfterImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareOfRWT = null; } else {
      this.fcurShareOfRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableAfterRWT = null; } else {
      this.fcurTaxPayableAfterRWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputationCredits = null; } else {
      this.fcurExcessImputationCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnComplyingTrust = null; } else {
      this.fblnComplyingTrust = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnForeignTrust = null; } else {
      this.fblnForeignTrust = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonComplyingTrust = null; } else {
      this.fblnNonComplyingTrust = Integer.valueOf(__cur_str);
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
    tblnz_rtnnitest o = (tblnz_rtnnitest) super.clone();
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnitest o) throws CloneNotSupportedException {
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurDividendImputation", this.fcurDividendImputation);
    __sqoop$field_map.put("fcurDividendRWT", this.fcurDividendRWT);
    __sqoop$field_map.put("fcurDividendGross", this.fcurDividendGross);
    __sqoop$field_map.put("fcurMaoriCredits", this.fcurMaoriCredits);
    __sqoop$field_map.put("fcurMaoriDistributions", this.fcurMaoriDistributions);
    __sqoop$field_map.put("fcurTrustCredits", this.fcurTrustCredits);
    __sqoop$field_map.put("fcurTrustIncome", this.fcurTrustIncome);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurOverseasIncome", this.fcurOverseasIncome);
    __sqoop$field_map.put("fcurLTCCredits", this.fcurLTCCredits);
    __sqoop$field_map.put("fcurLTCActiveIncome", this.fcurLTCActiveIncome);
    __sqoop$field_map.put("fcurLTCDeductions", this.fcurLTCDeductions);
    __sqoop$field_map.put("fcurLTCPriorDeductions", this.fcurLTCPriorDeductions);
    __sqoop$field_map.put("fcurAdjustedIncome", this.fcurAdjustedIncome);
    __sqoop$field_map.put("fcurBusinessIncome", this.fcurBusinessIncome);
    __sqoop$field_map.put("fcurTotalOtherCredits", this.fcurTotalOtherCredits);
    __sqoop$field_map.put("fcurTotalOtherIncome", this.fcurTotalOtherIncome);
    __sqoop$field_map.put("fcurTotalCredits", this.fcurTotalCredits);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurBeneficiaryIncome", this.fcurBeneficiaryIncome);
    __sqoop$field_map.put("fcurTrusteeIncome", this.fcurTrusteeIncome);
    __sqoop$field_map.put("fcurTaxPayableTrusteesIncome", this.fcurTaxPayableTrusteesIncome);
    __sqoop$field_map.put("fcurExpensesClaimed", this.fcurExpensesClaimed);
    __sqoop$field_map.put("fcurNetLossBroughtForward", this.fcurNetLossBroughtForward);
    __sqoop$field_map.put("fcurNetLossClaimed", this.fcurNetLossClaimed);
    __sqoop$field_map.put("fcurTotalDistributions", this.fcurTotalDistributions);
    __sqoop$field_map.put("fcurTaxableDistributions", this.fcurTaxableDistributions);
    __sqoop$field_map.put("fblnCFC", this.fblnCFC);
    __sqoop$field_map.put("fcurTotalTaxBeneficiaries", this.fcurTotalTaxBeneficiaries);
    __sqoop$field_map.put("fcurIncomeAfterExpenses", this.fcurIncomeAfterExpenses);
    __sqoop$field_map.put("fcurTotalTaxPayable", this.fcurTotalTaxPayable);
    __sqoop$field_map.put("fcurShareOfOverseasTax", this.fcurShareOfOverseasTax);
    __sqoop$field_map.put("fcurTaxPayableAfterShare", this.fcurTaxPayableAfterShare);
    __sqoop$field_map.put("fcurShareOfImputation", this.fcurShareOfImputation);
    __sqoop$field_map.put("fcurTaxPayableAfterImputation", this.fcurTaxPayableAfterImputation);
    __sqoop$field_map.put("fcurShareOfRWT", this.fcurShareOfRWT);
    __sqoop$field_map.put("fcurTaxPayableAfterRWT", this.fcurTaxPayableAfterRWT);
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
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurExcessImputationAsLoss", this.fcurExcessImputationAsLoss);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fblnComplyingTrust", this.fblnComplyingTrust);
    __sqoop$field_map.put("fblnForeignTrust", this.fblnForeignTrust);
    __sqoop$field_map.put("fblnNonComplyingTrust", this.fblnNonComplyingTrust);
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
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurDividendImputation", this.fcurDividendImputation);
    __sqoop$field_map.put("fcurDividendRWT", this.fcurDividendRWT);
    __sqoop$field_map.put("fcurDividendGross", this.fcurDividendGross);
    __sqoop$field_map.put("fcurMaoriCredits", this.fcurMaoriCredits);
    __sqoop$field_map.put("fcurMaoriDistributions", this.fcurMaoriDistributions);
    __sqoop$field_map.put("fcurTrustCredits", this.fcurTrustCredits);
    __sqoop$field_map.put("fcurTrustIncome", this.fcurTrustIncome);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurOverseasIncome", this.fcurOverseasIncome);
    __sqoop$field_map.put("fcurLTCCredits", this.fcurLTCCredits);
    __sqoop$field_map.put("fcurLTCActiveIncome", this.fcurLTCActiveIncome);
    __sqoop$field_map.put("fcurLTCDeductions", this.fcurLTCDeductions);
    __sqoop$field_map.put("fcurLTCPriorDeductions", this.fcurLTCPriorDeductions);
    __sqoop$field_map.put("fcurAdjustedIncome", this.fcurAdjustedIncome);
    __sqoop$field_map.put("fcurBusinessIncome", this.fcurBusinessIncome);
    __sqoop$field_map.put("fcurTotalOtherCredits", this.fcurTotalOtherCredits);
    __sqoop$field_map.put("fcurTotalOtherIncome", this.fcurTotalOtherIncome);
    __sqoop$field_map.put("fcurTotalCredits", this.fcurTotalCredits);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurBeneficiaryIncome", this.fcurBeneficiaryIncome);
    __sqoop$field_map.put("fcurTrusteeIncome", this.fcurTrusteeIncome);
    __sqoop$field_map.put("fcurTaxPayableTrusteesIncome", this.fcurTaxPayableTrusteesIncome);
    __sqoop$field_map.put("fcurExpensesClaimed", this.fcurExpensesClaimed);
    __sqoop$field_map.put("fcurNetLossBroughtForward", this.fcurNetLossBroughtForward);
    __sqoop$field_map.put("fcurNetLossClaimed", this.fcurNetLossClaimed);
    __sqoop$field_map.put("fcurTotalDistributions", this.fcurTotalDistributions);
    __sqoop$field_map.put("fcurTaxableDistributions", this.fcurTaxableDistributions);
    __sqoop$field_map.put("fblnCFC", this.fblnCFC);
    __sqoop$field_map.put("fcurTotalTaxBeneficiaries", this.fcurTotalTaxBeneficiaries);
    __sqoop$field_map.put("fcurIncomeAfterExpenses", this.fcurIncomeAfterExpenses);
    __sqoop$field_map.put("fcurTotalTaxPayable", this.fcurTotalTaxPayable);
    __sqoop$field_map.put("fcurShareOfOverseasTax", this.fcurShareOfOverseasTax);
    __sqoop$field_map.put("fcurTaxPayableAfterShare", this.fcurTaxPayableAfterShare);
    __sqoop$field_map.put("fcurShareOfImputation", this.fcurShareOfImputation);
    __sqoop$field_map.put("fcurTaxPayableAfterImputation", this.fcurTaxPayableAfterImputation);
    __sqoop$field_map.put("fcurShareOfRWT", this.fcurShareOfRWT);
    __sqoop$field_map.put("fcurTaxPayableAfterRWT", this.fcurTaxPayableAfterRWT);
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
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurExcessImputationAsLoss", this.fcurExcessImputationAsLoss);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fblnComplyingTrust", this.fblnComplyingTrust);
    __sqoop$field_map.put("fblnForeignTrust", this.fblnForeignTrust);
    __sqoop$field_map.put("fblnNonComplyingTrust", this.fblnNonComplyingTrust);
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
