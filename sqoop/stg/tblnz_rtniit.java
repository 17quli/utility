// ORM class for table 'tblnz_rtniit'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:16:53 NZDT 2020
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

public class tblnz_rtniit extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnIR215Attached", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnIR215Attached = (Integer)value;
      }
    });
    setters.put("fcurTotalFamilyTaxCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalFamilyTaxCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPAYEDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalPAYEDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalAdjPAYEDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalAdjPAYEDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalGrossIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalGrossIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeNotLiableForACC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurIncomeNotLiableForACC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurACCEarnerLevy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurACCEarnerLevy = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncomeWithTaxDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalIncomeWithTaxDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalSchedularPymtTaxDed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalSchedularPymtTaxDed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalGrossSchedularPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalGrossSchedularPayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExpensesSchedularPayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurExpensesSchedularPayments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetSchedularPayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurNetSchedularPayments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalGrossInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalGrossInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnIntPshpLTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnIntPshpLTC = (Integer)value;
      }
    });
    setters.put("fcurTotalImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalDividendRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalDividendRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalGrossDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalGrossDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnDivPshpLTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnDivPshpLTC = (Integer)value;
      }
    });
    setters.put("fcurTotalMaoriCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalMaoriCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalMaoriDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalMaoriDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxPaidByTrustees", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalTaxPaidByTrustees = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalEstateOrTrusteeIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalEstateOrTrusteeIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxableDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalTaxableDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOverseasTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalOverseasTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOverseasIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalOverseasIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnOverseasSuper", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnOverseasSuper = (Integer)value;
      }
    });
    setters.put("fcurTotalPartnershipTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalPartnershipTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalActivePtshpIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalActivePtshpIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalLTCTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalLTCTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalActiveLTCIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalActiveLTCIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonAllowableDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurNonAllowableDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonAllowableDedClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurNonAllowableDedClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdjustedLTCIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurAdjustedLTCIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxCreditSubtotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTaxCreditSubtotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeSubtotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurIncomeSubtotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareholderEmployeeSalary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurShareholderEmployeeSalary = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnFutureShrSalary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnFutureShrSalary = (Integer)value;
      }
    });
    setters.put("fblnWithoutPayCloseCompany", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnWithoutPayCloseCompany = (Integer)value;
      }
    });
    setters.put("fcurNetRents", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurNetRents = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSelfEmployedNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurSelfEmployedNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalOtherNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSaleOfProperty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurSaleOfProperty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRLWTCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurRLWTCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalOtherExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAfterExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurIncomeAfterExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountBroughtForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurAmountBroughtForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountClaimedThisYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurAmountClaimedThisYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnEligibleForIETC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnEligibleForIETC = (Integer)value;
      }
    });
    setters.put("fdtmExOverseasIncomeStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fdtmExOverseasIncomeStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmExcOverseasIncomeEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fdtmExcOverseasIncomeEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintExcOverseasMonths", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fintExcOverseasMonths = (Integer)value;
      }
    });
    setters.put("fcurIETC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurIETC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAllowableImpCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurAllowableImpCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurExcessImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalExtTCPD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalExtTCPD = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTCPD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTotalTCPD = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxOnTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTaxOnTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResidualIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurResidualIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxCalcResult", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurTaxCalcResult = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImputationToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurImputationToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnEarlyPymtDiscount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnEarlyPymtDiscount = (Integer)value;
      }
    });
    setters.put("fcurOverpaymentProvRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurOverpaymentProvRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefundAndProvOverpayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurRefundAndProvOverpayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefundCalc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurRefundCalc = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionalTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurProvisionalTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurLossToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAllowableRLWTCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurAllowableRLWTCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionalTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurProvisionalTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnDisclosureRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnDisclosureRequired = (Integer)value;
      }
    });
    setters.put("fstrPTSStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fstrPTSStatus = (String)value;
      }
    });
    setters.put("flngSelectGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.flngSelectGroup = (Integer)value;
      }
    });
    setters.put("fdtmSelectDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fdtmSelectDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnGroup2Suspend", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fblnGroup2Suspend = (Integer)value;
      }
    });
    setters.put("fstrResMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fstrResMethod = (String)value;
      }
    });
    setters.put("fcurResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsPriorYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurResDeductionsPriorYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurResDeductionsClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurResNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsCarriedForwar", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurResDeductionsCarriedForwar = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardCurrentYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurRDICarryForwardCurrentYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardRemaining", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurRDICarryForwardRemaining = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareholderAIMTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fcurShareholderAIMTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniit.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtniit() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtniit with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnIR215Attached;
  public Integer get_fblnIR215Attached() {
    return fblnIR215Attached;
  }
  public void set_fblnIR215Attached(Integer fblnIR215Attached) {
    this.fblnIR215Attached = fblnIR215Attached;
  }
  public tblnz_rtniit with_fblnIR215Attached(Integer fblnIR215Attached) {
    this.fblnIR215Attached = fblnIR215Attached;
    return this;
  }
  private java.math.BigDecimal fcurTotalFamilyTaxCredit;
  public java.math.BigDecimal get_fcurTotalFamilyTaxCredit() {
    return fcurTotalFamilyTaxCredit;
  }
  public void set_fcurTotalFamilyTaxCredit(java.math.BigDecimal fcurTotalFamilyTaxCredit) {
    this.fcurTotalFamilyTaxCredit = fcurTotalFamilyTaxCredit;
  }
  public tblnz_rtniit with_fcurTotalFamilyTaxCredit(java.math.BigDecimal fcurTotalFamilyTaxCredit) {
    this.fcurTotalFamilyTaxCredit = fcurTotalFamilyTaxCredit;
    return this;
  }
  private java.math.BigDecimal fcurTotalPAYEDeducted;
  public java.math.BigDecimal get_fcurTotalPAYEDeducted() {
    return fcurTotalPAYEDeducted;
  }
  public void set_fcurTotalPAYEDeducted(java.math.BigDecimal fcurTotalPAYEDeducted) {
    this.fcurTotalPAYEDeducted = fcurTotalPAYEDeducted;
  }
  public tblnz_rtniit with_fcurTotalPAYEDeducted(java.math.BigDecimal fcurTotalPAYEDeducted) {
    this.fcurTotalPAYEDeducted = fcurTotalPAYEDeducted;
    return this;
  }
  private java.math.BigDecimal fcurTotalAdjPAYEDeducted;
  public java.math.BigDecimal get_fcurTotalAdjPAYEDeducted() {
    return fcurTotalAdjPAYEDeducted;
  }
  public void set_fcurTotalAdjPAYEDeducted(java.math.BigDecimal fcurTotalAdjPAYEDeducted) {
    this.fcurTotalAdjPAYEDeducted = fcurTotalAdjPAYEDeducted;
  }
  public tblnz_rtniit with_fcurTotalAdjPAYEDeducted(java.math.BigDecimal fcurTotalAdjPAYEDeducted) {
    this.fcurTotalAdjPAYEDeducted = fcurTotalAdjPAYEDeducted;
    return this;
  }
  private java.math.BigDecimal fcurTotalGrossIncome;
  public java.math.BigDecimal get_fcurTotalGrossIncome() {
    return fcurTotalGrossIncome;
  }
  public void set_fcurTotalGrossIncome(java.math.BigDecimal fcurTotalGrossIncome) {
    this.fcurTotalGrossIncome = fcurTotalGrossIncome;
  }
  public tblnz_rtniit with_fcurTotalGrossIncome(java.math.BigDecimal fcurTotalGrossIncome) {
    this.fcurTotalGrossIncome = fcurTotalGrossIncome;
    return this;
  }
  private java.math.BigDecimal fcurIncomeNotLiableForACC;
  public java.math.BigDecimal get_fcurIncomeNotLiableForACC() {
    return fcurIncomeNotLiableForACC;
  }
  public void set_fcurIncomeNotLiableForACC(java.math.BigDecimal fcurIncomeNotLiableForACC) {
    this.fcurIncomeNotLiableForACC = fcurIncomeNotLiableForACC;
  }
  public tblnz_rtniit with_fcurIncomeNotLiableForACC(java.math.BigDecimal fcurIncomeNotLiableForACC) {
    this.fcurIncomeNotLiableForACC = fcurIncomeNotLiableForACC;
    return this;
  }
  private java.math.BigDecimal fcurACCEarnerLevy;
  public java.math.BigDecimal get_fcurACCEarnerLevy() {
    return fcurACCEarnerLevy;
  }
  public void set_fcurACCEarnerLevy(java.math.BigDecimal fcurACCEarnerLevy) {
    this.fcurACCEarnerLevy = fcurACCEarnerLevy;
  }
  public tblnz_rtniit with_fcurACCEarnerLevy(java.math.BigDecimal fcurACCEarnerLevy) {
    this.fcurACCEarnerLevy = fcurACCEarnerLevy;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncomeWithTaxDeducted;
  public java.math.BigDecimal get_fcurTotalIncomeWithTaxDeducted() {
    return fcurTotalIncomeWithTaxDeducted;
  }
  public void set_fcurTotalIncomeWithTaxDeducted(java.math.BigDecimal fcurTotalIncomeWithTaxDeducted) {
    this.fcurTotalIncomeWithTaxDeducted = fcurTotalIncomeWithTaxDeducted;
  }
  public tblnz_rtniit with_fcurTotalIncomeWithTaxDeducted(java.math.BigDecimal fcurTotalIncomeWithTaxDeducted) {
    this.fcurTotalIncomeWithTaxDeducted = fcurTotalIncomeWithTaxDeducted;
    return this;
  }
  private java.math.BigDecimal fcurTotalSchedularPymtTaxDed;
  public java.math.BigDecimal get_fcurTotalSchedularPymtTaxDed() {
    return fcurTotalSchedularPymtTaxDed;
  }
  public void set_fcurTotalSchedularPymtTaxDed(java.math.BigDecimal fcurTotalSchedularPymtTaxDed) {
    this.fcurTotalSchedularPymtTaxDed = fcurTotalSchedularPymtTaxDed;
  }
  public tblnz_rtniit with_fcurTotalSchedularPymtTaxDed(java.math.BigDecimal fcurTotalSchedularPymtTaxDed) {
    this.fcurTotalSchedularPymtTaxDed = fcurTotalSchedularPymtTaxDed;
    return this;
  }
  private java.math.BigDecimal fcurTotalGrossSchedularPayment;
  public java.math.BigDecimal get_fcurTotalGrossSchedularPayment() {
    return fcurTotalGrossSchedularPayment;
  }
  public void set_fcurTotalGrossSchedularPayment(java.math.BigDecimal fcurTotalGrossSchedularPayment) {
    this.fcurTotalGrossSchedularPayment = fcurTotalGrossSchedularPayment;
  }
  public tblnz_rtniit with_fcurTotalGrossSchedularPayment(java.math.BigDecimal fcurTotalGrossSchedularPayment) {
    this.fcurTotalGrossSchedularPayment = fcurTotalGrossSchedularPayment;
    return this;
  }
  private java.math.BigDecimal fcurExpensesSchedularPayments;
  public java.math.BigDecimal get_fcurExpensesSchedularPayments() {
    return fcurExpensesSchedularPayments;
  }
  public void set_fcurExpensesSchedularPayments(java.math.BigDecimal fcurExpensesSchedularPayments) {
    this.fcurExpensesSchedularPayments = fcurExpensesSchedularPayments;
  }
  public tblnz_rtniit with_fcurExpensesSchedularPayments(java.math.BigDecimal fcurExpensesSchedularPayments) {
    this.fcurExpensesSchedularPayments = fcurExpensesSchedularPayments;
    return this;
  }
  private java.math.BigDecimal fcurNetSchedularPayments;
  public java.math.BigDecimal get_fcurNetSchedularPayments() {
    return fcurNetSchedularPayments;
  }
  public void set_fcurNetSchedularPayments(java.math.BigDecimal fcurNetSchedularPayments) {
    this.fcurNetSchedularPayments = fcurNetSchedularPayments;
  }
  public tblnz_rtniit with_fcurNetSchedularPayments(java.math.BigDecimal fcurNetSchedularPayments) {
    this.fcurNetSchedularPayments = fcurNetSchedularPayments;
    return this;
  }
  private java.math.BigDecimal fcurTotalRWT;
  public java.math.BigDecimal get_fcurTotalRWT() {
    return fcurTotalRWT;
  }
  public void set_fcurTotalRWT(java.math.BigDecimal fcurTotalRWT) {
    this.fcurTotalRWT = fcurTotalRWT;
  }
  public tblnz_rtniit with_fcurTotalRWT(java.math.BigDecimal fcurTotalRWT) {
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
  public tblnz_rtniit with_fcurTotalGrossInterest(java.math.BigDecimal fcurTotalGrossInterest) {
    this.fcurTotalGrossInterest = fcurTotalGrossInterest;
    return this;
  }
  private Integer fblnIntPshpLTC;
  public Integer get_fblnIntPshpLTC() {
    return fblnIntPshpLTC;
  }
  public void set_fblnIntPshpLTC(Integer fblnIntPshpLTC) {
    this.fblnIntPshpLTC = fblnIntPshpLTC;
  }
  public tblnz_rtniit with_fblnIntPshpLTC(Integer fblnIntPshpLTC) {
    this.fblnIntPshpLTC = fblnIntPshpLTC;
    return this;
  }
  private java.math.BigDecimal fcurTotalImputationCredits;
  public java.math.BigDecimal get_fcurTotalImputationCredits() {
    return fcurTotalImputationCredits;
  }
  public void set_fcurTotalImputationCredits(java.math.BigDecimal fcurTotalImputationCredits) {
    this.fcurTotalImputationCredits = fcurTotalImputationCredits;
  }
  public tblnz_rtniit with_fcurTotalImputationCredits(java.math.BigDecimal fcurTotalImputationCredits) {
    this.fcurTotalImputationCredits = fcurTotalImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalDividendRWT;
  public java.math.BigDecimal get_fcurTotalDividendRWT() {
    return fcurTotalDividendRWT;
  }
  public void set_fcurTotalDividendRWT(java.math.BigDecimal fcurTotalDividendRWT) {
    this.fcurTotalDividendRWT = fcurTotalDividendRWT;
  }
  public tblnz_rtniit with_fcurTotalDividendRWT(java.math.BigDecimal fcurTotalDividendRWT) {
    this.fcurTotalDividendRWT = fcurTotalDividendRWT;
    return this;
  }
  private java.math.BigDecimal fcurTotalGrossDividends;
  public java.math.BigDecimal get_fcurTotalGrossDividends() {
    return fcurTotalGrossDividends;
  }
  public void set_fcurTotalGrossDividends(java.math.BigDecimal fcurTotalGrossDividends) {
    this.fcurTotalGrossDividends = fcurTotalGrossDividends;
  }
  public tblnz_rtniit with_fcurTotalGrossDividends(java.math.BigDecimal fcurTotalGrossDividends) {
    this.fcurTotalGrossDividends = fcurTotalGrossDividends;
    return this;
  }
  private Integer fblnDivPshpLTC;
  public Integer get_fblnDivPshpLTC() {
    return fblnDivPshpLTC;
  }
  public void set_fblnDivPshpLTC(Integer fblnDivPshpLTC) {
    this.fblnDivPshpLTC = fblnDivPshpLTC;
  }
  public tblnz_rtniit with_fblnDivPshpLTC(Integer fblnDivPshpLTC) {
    this.fblnDivPshpLTC = fblnDivPshpLTC;
    return this;
  }
  private java.math.BigDecimal fcurTotalMaoriCredits;
  public java.math.BigDecimal get_fcurTotalMaoriCredits() {
    return fcurTotalMaoriCredits;
  }
  public void set_fcurTotalMaoriCredits(java.math.BigDecimal fcurTotalMaoriCredits) {
    this.fcurTotalMaoriCredits = fcurTotalMaoriCredits;
  }
  public tblnz_rtniit with_fcurTotalMaoriCredits(java.math.BigDecimal fcurTotalMaoriCredits) {
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
  public tblnz_rtniit with_fcurTotalMaoriDistributions(java.math.BigDecimal fcurTotalMaoriDistributions) {
    this.fcurTotalMaoriDistributions = fcurTotalMaoriDistributions;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxPaidByTrustees;
  public java.math.BigDecimal get_fcurTotalTaxPaidByTrustees() {
    return fcurTotalTaxPaidByTrustees;
  }
  public void set_fcurTotalTaxPaidByTrustees(java.math.BigDecimal fcurTotalTaxPaidByTrustees) {
    this.fcurTotalTaxPaidByTrustees = fcurTotalTaxPaidByTrustees;
  }
  public tblnz_rtniit with_fcurTotalTaxPaidByTrustees(java.math.BigDecimal fcurTotalTaxPaidByTrustees) {
    this.fcurTotalTaxPaidByTrustees = fcurTotalTaxPaidByTrustees;
    return this;
  }
  private java.math.BigDecimal fcurTotalEstateOrTrusteeIncome;
  public java.math.BigDecimal get_fcurTotalEstateOrTrusteeIncome() {
    return fcurTotalEstateOrTrusteeIncome;
  }
  public void set_fcurTotalEstateOrTrusteeIncome(java.math.BigDecimal fcurTotalEstateOrTrusteeIncome) {
    this.fcurTotalEstateOrTrusteeIncome = fcurTotalEstateOrTrusteeIncome;
  }
  public tblnz_rtniit with_fcurTotalEstateOrTrusteeIncome(java.math.BigDecimal fcurTotalEstateOrTrusteeIncome) {
    this.fcurTotalEstateOrTrusteeIncome = fcurTotalEstateOrTrusteeIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxableDistributions;
  public java.math.BigDecimal get_fcurTotalTaxableDistributions() {
    return fcurTotalTaxableDistributions;
  }
  public void set_fcurTotalTaxableDistributions(java.math.BigDecimal fcurTotalTaxableDistributions) {
    this.fcurTotalTaxableDistributions = fcurTotalTaxableDistributions;
  }
  public tblnz_rtniit with_fcurTotalTaxableDistributions(java.math.BigDecimal fcurTotalTaxableDistributions) {
    this.fcurTotalTaxableDistributions = fcurTotalTaxableDistributions;
    return this;
  }
  private java.math.BigDecimal fcurTotalOverseasTaxPaid;
  public java.math.BigDecimal get_fcurTotalOverseasTaxPaid() {
    return fcurTotalOverseasTaxPaid;
  }
  public void set_fcurTotalOverseasTaxPaid(java.math.BigDecimal fcurTotalOverseasTaxPaid) {
    this.fcurTotalOverseasTaxPaid = fcurTotalOverseasTaxPaid;
  }
  public tblnz_rtniit with_fcurTotalOverseasTaxPaid(java.math.BigDecimal fcurTotalOverseasTaxPaid) {
    this.fcurTotalOverseasTaxPaid = fcurTotalOverseasTaxPaid;
    return this;
  }
  private java.math.BigDecimal fcurTotalOverseasIncome;
  public java.math.BigDecimal get_fcurTotalOverseasIncome() {
    return fcurTotalOverseasIncome;
  }
  public void set_fcurTotalOverseasIncome(java.math.BigDecimal fcurTotalOverseasIncome) {
    this.fcurTotalOverseasIncome = fcurTotalOverseasIncome;
  }
  public tblnz_rtniit with_fcurTotalOverseasIncome(java.math.BigDecimal fcurTotalOverseasIncome) {
    this.fcurTotalOverseasIncome = fcurTotalOverseasIncome;
    return this;
  }
  private Integer fblnOverseasSuper;
  public Integer get_fblnOverseasSuper() {
    return fblnOverseasSuper;
  }
  public void set_fblnOverseasSuper(Integer fblnOverseasSuper) {
    this.fblnOverseasSuper = fblnOverseasSuper;
  }
  public tblnz_rtniit with_fblnOverseasSuper(Integer fblnOverseasSuper) {
    this.fblnOverseasSuper = fblnOverseasSuper;
    return this;
  }
  private java.math.BigDecimal fcurTotalPartnershipTaxCredits;
  public java.math.BigDecimal get_fcurTotalPartnershipTaxCredits() {
    return fcurTotalPartnershipTaxCredits;
  }
  public void set_fcurTotalPartnershipTaxCredits(java.math.BigDecimal fcurTotalPartnershipTaxCredits) {
    this.fcurTotalPartnershipTaxCredits = fcurTotalPartnershipTaxCredits;
  }
  public tblnz_rtniit with_fcurTotalPartnershipTaxCredits(java.math.BigDecimal fcurTotalPartnershipTaxCredits) {
    this.fcurTotalPartnershipTaxCredits = fcurTotalPartnershipTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalActivePtshpIncome;
  public java.math.BigDecimal get_fcurTotalActivePtshpIncome() {
    return fcurTotalActivePtshpIncome;
  }
  public void set_fcurTotalActivePtshpIncome(java.math.BigDecimal fcurTotalActivePtshpIncome) {
    this.fcurTotalActivePtshpIncome = fcurTotalActivePtshpIncome;
  }
  public tblnz_rtniit with_fcurTotalActivePtshpIncome(java.math.BigDecimal fcurTotalActivePtshpIncome) {
    this.fcurTotalActivePtshpIncome = fcurTotalActivePtshpIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalLTCTaxCredits;
  public java.math.BigDecimal get_fcurTotalLTCTaxCredits() {
    return fcurTotalLTCTaxCredits;
  }
  public void set_fcurTotalLTCTaxCredits(java.math.BigDecimal fcurTotalLTCTaxCredits) {
    this.fcurTotalLTCTaxCredits = fcurTotalLTCTaxCredits;
  }
  public tblnz_rtniit with_fcurTotalLTCTaxCredits(java.math.BigDecimal fcurTotalLTCTaxCredits) {
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
  public tblnz_rtniit with_fcurTotalActiveLTCIncome(java.math.BigDecimal fcurTotalActiveLTCIncome) {
    this.fcurTotalActiveLTCIncome = fcurTotalActiveLTCIncome;
    return this;
  }
  private java.math.BigDecimal fcurNonAllowableDeductions;
  public java.math.BigDecimal get_fcurNonAllowableDeductions() {
    return fcurNonAllowableDeductions;
  }
  public void set_fcurNonAllowableDeductions(java.math.BigDecimal fcurNonAllowableDeductions) {
    this.fcurNonAllowableDeductions = fcurNonAllowableDeductions;
  }
  public tblnz_rtniit with_fcurNonAllowableDeductions(java.math.BigDecimal fcurNonAllowableDeductions) {
    this.fcurNonAllowableDeductions = fcurNonAllowableDeductions;
    return this;
  }
  private java.math.BigDecimal fcurNonAllowableDedClaimed;
  public java.math.BigDecimal get_fcurNonAllowableDedClaimed() {
    return fcurNonAllowableDedClaimed;
  }
  public void set_fcurNonAllowableDedClaimed(java.math.BigDecimal fcurNonAllowableDedClaimed) {
    this.fcurNonAllowableDedClaimed = fcurNonAllowableDedClaimed;
  }
  public tblnz_rtniit with_fcurNonAllowableDedClaimed(java.math.BigDecimal fcurNonAllowableDedClaimed) {
    this.fcurNonAllowableDedClaimed = fcurNonAllowableDedClaimed;
    return this;
  }
  private java.math.BigDecimal fcurAdjustedLTCIncome;
  public java.math.BigDecimal get_fcurAdjustedLTCIncome() {
    return fcurAdjustedLTCIncome;
  }
  public void set_fcurAdjustedLTCIncome(java.math.BigDecimal fcurAdjustedLTCIncome) {
    this.fcurAdjustedLTCIncome = fcurAdjustedLTCIncome;
  }
  public tblnz_rtniit with_fcurAdjustedLTCIncome(java.math.BigDecimal fcurAdjustedLTCIncome) {
    this.fcurAdjustedLTCIncome = fcurAdjustedLTCIncome;
    return this;
  }
  private java.math.BigDecimal fcurTaxCreditSubtotal;
  public java.math.BigDecimal get_fcurTaxCreditSubtotal() {
    return fcurTaxCreditSubtotal;
  }
  public void set_fcurTaxCreditSubtotal(java.math.BigDecimal fcurTaxCreditSubtotal) {
    this.fcurTaxCreditSubtotal = fcurTaxCreditSubtotal;
  }
  public tblnz_rtniit with_fcurTaxCreditSubtotal(java.math.BigDecimal fcurTaxCreditSubtotal) {
    this.fcurTaxCreditSubtotal = fcurTaxCreditSubtotal;
    return this;
  }
  private java.math.BigDecimal fcurIncomeSubtotal;
  public java.math.BigDecimal get_fcurIncomeSubtotal() {
    return fcurIncomeSubtotal;
  }
  public void set_fcurIncomeSubtotal(java.math.BigDecimal fcurIncomeSubtotal) {
    this.fcurIncomeSubtotal = fcurIncomeSubtotal;
  }
  public tblnz_rtniit with_fcurIncomeSubtotal(java.math.BigDecimal fcurIncomeSubtotal) {
    this.fcurIncomeSubtotal = fcurIncomeSubtotal;
    return this;
  }
  private java.math.BigDecimal fcurShareholderEmployeeSalary;
  public java.math.BigDecimal get_fcurShareholderEmployeeSalary() {
    return fcurShareholderEmployeeSalary;
  }
  public void set_fcurShareholderEmployeeSalary(java.math.BigDecimal fcurShareholderEmployeeSalary) {
    this.fcurShareholderEmployeeSalary = fcurShareholderEmployeeSalary;
  }
  public tblnz_rtniit with_fcurShareholderEmployeeSalary(java.math.BigDecimal fcurShareholderEmployeeSalary) {
    this.fcurShareholderEmployeeSalary = fcurShareholderEmployeeSalary;
    return this;
  }
  private Integer fblnFutureShrSalary;
  public Integer get_fblnFutureShrSalary() {
    return fblnFutureShrSalary;
  }
  public void set_fblnFutureShrSalary(Integer fblnFutureShrSalary) {
    this.fblnFutureShrSalary = fblnFutureShrSalary;
  }
  public tblnz_rtniit with_fblnFutureShrSalary(Integer fblnFutureShrSalary) {
    this.fblnFutureShrSalary = fblnFutureShrSalary;
    return this;
  }
  private Integer fblnWithoutPayCloseCompany;
  public Integer get_fblnWithoutPayCloseCompany() {
    return fblnWithoutPayCloseCompany;
  }
  public void set_fblnWithoutPayCloseCompany(Integer fblnWithoutPayCloseCompany) {
    this.fblnWithoutPayCloseCompany = fblnWithoutPayCloseCompany;
  }
  public tblnz_rtniit with_fblnWithoutPayCloseCompany(Integer fblnWithoutPayCloseCompany) {
    this.fblnWithoutPayCloseCompany = fblnWithoutPayCloseCompany;
    return this;
  }
  private java.math.BigDecimal fcurNetRents;
  public java.math.BigDecimal get_fcurNetRents() {
    return fcurNetRents;
  }
  public void set_fcurNetRents(java.math.BigDecimal fcurNetRents) {
    this.fcurNetRents = fcurNetRents;
  }
  public tblnz_rtniit with_fcurNetRents(java.math.BigDecimal fcurNetRents) {
    this.fcurNetRents = fcurNetRents;
    return this;
  }
  private java.math.BigDecimal fcurSelfEmployedNetIncome;
  public java.math.BigDecimal get_fcurSelfEmployedNetIncome() {
    return fcurSelfEmployedNetIncome;
  }
  public void set_fcurSelfEmployedNetIncome(java.math.BigDecimal fcurSelfEmployedNetIncome) {
    this.fcurSelfEmployedNetIncome = fcurSelfEmployedNetIncome;
  }
  public tblnz_rtniit with_fcurSelfEmployedNetIncome(java.math.BigDecimal fcurSelfEmployedNetIncome) {
    this.fcurSelfEmployedNetIncome = fcurSelfEmployedNetIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherNetIncome;
  public java.math.BigDecimal get_fcurTotalOtherNetIncome() {
    return fcurTotalOtherNetIncome;
  }
  public void set_fcurTotalOtherNetIncome(java.math.BigDecimal fcurTotalOtherNetIncome) {
    this.fcurTotalOtherNetIncome = fcurTotalOtherNetIncome;
  }
  public tblnz_rtniit with_fcurTotalOtherNetIncome(java.math.BigDecimal fcurTotalOtherNetIncome) {
    this.fcurTotalOtherNetIncome = fcurTotalOtherNetIncome;
    return this;
  }
  private java.math.BigDecimal fcurSaleOfProperty;
  public java.math.BigDecimal get_fcurSaleOfProperty() {
    return fcurSaleOfProperty;
  }
  public void set_fcurSaleOfProperty(java.math.BigDecimal fcurSaleOfProperty) {
    this.fcurSaleOfProperty = fcurSaleOfProperty;
  }
  public tblnz_rtniit with_fcurSaleOfProperty(java.math.BigDecimal fcurSaleOfProperty) {
    this.fcurSaleOfProperty = fcurSaleOfProperty;
    return this;
  }
  private java.math.BigDecimal fcurRLWTCredit;
  public java.math.BigDecimal get_fcurRLWTCredit() {
    return fcurRLWTCredit;
  }
  public void set_fcurRLWTCredit(java.math.BigDecimal fcurRLWTCredit) {
    this.fcurRLWTCredit = fcurRLWTCredit;
  }
  public tblnz_rtniit with_fcurRLWTCredit(java.math.BigDecimal fcurRLWTCredit) {
    this.fcurRLWTCredit = fcurRLWTCredit;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncome;
  public java.math.BigDecimal get_fcurTotalIncome() {
    return fcurTotalIncome;
  }
  public void set_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
  }
  public tblnz_rtniit with_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherExpenses;
  public java.math.BigDecimal get_fcurTotalOtherExpenses() {
    return fcurTotalOtherExpenses;
  }
  public void set_fcurTotalOtherExpenses(java.math.BigDecimal fcurTotalOtherExpenses) {
    this.fcurTotalOtherExpenses = fcurTotalOtherExpenses;
  }
  public tblnz_rtniit with_fcurTotalOtherExpenses(java.math.BigDecimal fcurTotalOtherExpenses) {
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
  public tblnz_rtniit with_fcurIncomeAfterExpenses(java.math.BigDecimal fcurIncomeAfterExpenses) {
    this.fcurIncomeAfterExpenses = fcurIncomeAfterExpenses;
    return this;
  }
  private java.math.BigDecimal fcurAmountBroughtForward;
  public java.math.BigDecimal get_fcurAmountBroughtForward() {
    return fcurAmountBroughtForward;
  }
  public void set_fcurAmountBroughtForward(java.math.BigDecimal fcurAmountBroughtForward) {
    this.fcurAmountBroughtForward = fcurAmountBroughtForward;
  }
  public tblnz_rtniit with_fcurAmountBroughtForward(java.math.BigDecimal fcurAmountBroughtForward) {
    this.fcurAmountBroughtForward = fcurAmountBroughtForward;
    return this;
  }
  private java.math.BigDecimal fcurAmountClaimedThisYear;
  public java.math.BigDecimal get_fcurAmountClaimedThisYear() {
    return fcurAmountClaimedThisYear;
  }
  public void set_fcurAmountClaimedThisYear(java.math.BigDecimal fcurAmountClaimedThisYear) {
    this.fcurAmountClaimedThisYear = fcurAmountClaimedThisYear;
  }
  public tblnz_rtniit with_fcurAmountClaimedThisYear(java.math.BigDecimal fcurAmountClaimedThisYear) {
    this.fcurAmountClaimedThisYear = fcurAmountClaimedThisYear;
    return this;
  }
  private java.math.BigDecimal fcurTaxableIncome;
  public java.math.BigDecimal get_fcurTaxableIncome() {
    return fcurTaxableIncome;
  }
  public void set_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
  }
  public tblnz_rtniit with_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
    return this;
  }
  private Integer fblnEligibleForIETC;
  public Integer get_fblnEligibleForIETC() {
    return fblnEligibleForIETC;
  }
  public void set_fblnEligibleForIETC(Integer fblnEligibleForIETC) {
    this.fblnEligibleForIETC = fblnEligibleForIETC;
  }
  public tblnz_rtniit with_fblnEligibleForIETC(Integer fblnEligibleForIETC) {
    this.fblnEligibleForIETC = fblnEligibleForIETC;
    return this;
  }
  private java.sql.Timestamp fdtmExOverseasIncomeStart;
  public java.sql.Timestamp get_fdtmExOverseasIncomeStart() {
    return fdtmExOverseasIncomeStart;
  }
  public void set_fdtmExOverseasIncomeStart(java.sql.Timestamp fdtmExOverseasIncomeStart) {
    this.fdtmExOverseasIncomeStart = fdtmExOverseasIncomeStart;
  }
  public tblnz_rtniit with_fdtmExOverseasIncomeStart(java.sql.Timestamp fdtmExOverseasIncomeStart) {
    this.fdtmExOverseasIncomeStart = fdtmExOverseasIncomeStart;
    return this;
  }
  private java.sql.Timestamp fdtmExcOverseasIncomeEnd;
  public java.sql.Timestamp get_fdtmExcOverseasIncomeEnd() {
    return fdtmExcOverseasIncomeEnd;
  }
  public void set_fdtmExcOverseasIncomeEnd(java.sql.Timestamp fdtmExcOverseasIncomeEnd) {
    this.fdtmExcOverseasIncomeEnd = fdtmExcOverseasIncomeEnd;
  }
  public tblnz_rtniit with_fdtmExcOverseasIncomeEnd(java.sql.Timestamp fdtmExcOverseasIncomeEnd) {
    this.fdtmExcOverseasIncomeEnd = fdtmExcOverseasIncomeEnd;
    return this;
  }
  private Integer fintExcOverseasMonths;
  public Integer get_fintExcOverseasMonths() {
    return fintExcOverseasMonths;
  }
  public void set_fintExcOverseasMonths(Integer fintExcOverseasMonths) {
    this.fintExcOverseasMonths = fintExcOverseasMonths;
  }
  public tblnz_rtniit with_fintExcOverseasMonths(Integer fintExcOverseasMonths) {
    this.fintExcOverseasMonths = fintExcOverseasMonths;
    return this;
  }
  private java.math.BigDecimal fcurIETC;
  public java.math.BigDecimal get_fcurIETC() {
    return fcurIETC;
  }
  public void set_fcurIETC(java.math.BigDecimal fcurIETC) {
    this.fcurIETC = fcurIETC;
  }
  public tblnz_rtniit with_fcurIETC(java.math.BigDecimal fcurIETC) {
    this.fcurIETC = fcurIETC;
    return this;
  }
  private java.math.BigDecimal fcurAllowableImpCredits;
  public java.math.BigDecimal get_fcurAllowableImpCredits() {
    return fcurAllowableImpCredits;
  }
  public void set_fcurAllowableImpCredits(java.math.BigDecimal fcurAllowableImpCredits) {
    this.fcurAllowableImpCredits = fcurAllowableImpCredits;
  }
  public tblnz_rtniit with_fcurAllowableImpCredits(java.math.BigDecimal fcurAllowableImpCredits) {
    this.fcurAllowableImpCredits = fcurAllowableImpCredits;
    return this;
  }
  private java.math.BigDecimal fcurExcessImputationCredits;
  public java.math.BigDecimal get_fcurExcessImputationCredits() {
    return fcurExcessImputationCredits;
  }
  public void set_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
  }
  public tblnz_rtniit with_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalExtTCPD;
  public java.math.BigDecimal get_fcurTotalExtTCPD() {
    return fcurTotalExtTCPD;
  }
  public void set_fcurTotalExtTCPD(java.math.BigDecimal fcurTotalExtTCPD) {
    this.fcurTotalExtTCPD = fcurTotalExtTCPD;
  }
  public tblnz_rtniit with_fcurTotalExtTCPD(java.math.BigDecimal fcurTotalExtTCPD) {
    this.fcurTotalExtTCPD = fcurTotalExtTCPD;
    return this;
  }
  private java.math.BigDecimal fcurTotalTCPD;
  public java.math.BigDecimal get_fcurTotalTCPD() {
    return fcurTotalTCPD;
  }
  public void set_fcurTotalTCPD(java.math.BigDecimal fcurTotalTCPD) {
    this.fcurTotalTCPD = fcurTotalTCPD;
  }
  public tblnz_rtniit with_fcurTotalTCPD(java.math.BigDecimal fcurTotalTCPD) {
    this.fcurTotalTCPD = fcurTotalTCPD;
    return this;
  }
  private java.math.BigDecimal fcurTaxOnTaxableIncome;
  public java.math.BigDecimal get_fcurTaxOnTaxableIncome() {
    return fcurTaxOnTaxableIncome;
  }
  public void set_fcurTaxOnTaxableIncome(java.math.BigDecimal fcurTaxOnTaxableIncome) {
    this.fcurTaxOnTaxableIncome = fcurTaxOnTaxableIncome;
  }
  public tblnz_rtniit with_fcurTaxOnTaxableIncome(java.math.BigDecimal fcurTaxOnTaxableIncome) {
    this.fcurTaxOnTaxableIncome = fcurTaxOnTaxableIncome;
    return this;
  }
  private java.math.BigDecimal fcurResidualIncomeTax;
  public java.math.BigDecimal get_fcurResidualIncomeTax() {
    return fcurResidualIncomeTax;
  }
  public void set_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
  }
  public tblnz_rtniit with_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
    return this;
  }
  private java.math.BigDecimal fcurTaxCalcResult;
  public java.math.BigDecimal get_fcurTaxCalcResult() {
    return fcurTaxCalcResult;
  }
  public void set_fcurTaxCalcResult(java.math.BigDecimal fcurTaxCalcResult) {
    this.fcurTaxCalcResult = fcurTaxCalcResult;
  }
  public tblnz_rtniit with_fcurTaxCalcResult(java.math.BigDecimal fcurTaxCalcResult) {
    this.fcurTaxCalcResult = fcurTaxCalcResult;
    return this;
  }
  private java.math.BigDecimal fcurImputationToCarryForward;
  public java.math.BigDecimal get_fcurImputationToCarryForward() {
    return fcurImputationToCarryForward;
  }
  public void set_fcurImputationToCarryForward(java.math.BigDecimal fcurImputationToCarryForward) {
    this.fcurImputationToCarryForward = fcurImputationToCarryForward;
  }
  public tblnz_rtniit with_fcurImputationToCarryForward(java.math.BigDecimal fcurImputationToCarryForward) {
    this.fcurImputationToCarryForward = fcurImputationToCarryForward;
    return this;
  }
  private Integer fblnEarlyPymtDiscount;
  public Integer get_fblnEarlyPymtDiscount() {
    return fblnEarlyPymtDiscount;
  }
  public void set_fblnEarlyPymtDiscount(Integer fblnEarlyPymtDiscount) {
    this.fblnEarlyPymtDiscount = fblnEarlyPymtDiscount;
  }
  public tblnz_rtniit with_fblnEarlyPymtDiscount(Integer fblnEarlyPymtDiscount) {
    this.fblnEarlyPymtDiscount = fblnEarlyPymtDiscount;
    return this;
  }
  private java.math.BigDecimal fcurOverpaymentProvRefund;
  public java.math.BigDecimal get_fcurOverpaymentProvRefund() {
    return fcurOverpaymentProvRefund;
  }
  public void set_fcurOverpaymentProvRefund(java.math.BigDecimal fcurOverpaymentProvRefund) {
    this.fcurOverpaymentProvRefund = fcurOverpaymentProvRefund;
  }
  public tblnz_rtniit with_fcurOverpaymentProvRefund(java.math.BigDecimal fcurOverpaymentProvRefund) {
    this.fcurOverpaymentProvRefund = fcurOverpaymentProvRefund;
    return this;
  }
  private java.math.BigDecimal fcurRefundAndProvOverpayment;
  public java.math.BigDecimal get_fcurRefundAndProvOverpayment() {
    return fcurRefundAndProvOverpayment;
  }
  public void set_fcurRefundAndProvOverpayment(java.math.BigDecimal fcurRefundAndProvOverpayment) {
    this.fcurRefundAndProvOverpayment = fcurRefundAndProvOverpayment;
  }
  public tblnz_rtniit with_fcurRefundAndProvOverpayment(java.math.BigDecimal fcurRefundAndProvOverpayment) {
    this.fcurRefundAndProvOverpayment = fcurRefundAndProvOverpayment;
    return this;
  }
  private java.math.BigDecimal fcurRefundCalc;
  public java.math.BigDecimal get_fcurRefundCalc() {
    return fcurRefundCalc;
  }
  public void set_fcurRefundCalc(java.math.BigDecimal fcurRefundCalc) {
    this.fcurRefundCalc = fcurRefundCalc;
  }
  public tblnz_rtniit with_fcurRefundCalc(java.math.BigDecimal fcurRefundCalc) {
    this.fcurRefundCalc = fcurRefundCalc;
    return this;
  }
  private java.math.BigDecimal fcurProvisionalTax;
  public java.math.BigDecimal get_fcurProvisionalTax() {
    return fcurProvisionalTax;
  }
  public void set_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
    this.fcurProvisionalTax = fcurProvisionalTax;
  }
  public tblnz_rtniit with_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
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
  public tblnz_rtniit with_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
    return this;
  }
  private java.math.BigDecimal fcurAllowableRLWTCredits;
  public java.math.BigDecimal get_fcurAllowableRLWTCredits() {
    return fcurAllowableRLWTCredits;
  }
  public void set_fcurAllowableRLWTCredits(java.math.BigDecimal fcurAllowableRLWTCredits) {
    this.fcurAllowableRLWTCredits = fcurAllowableRLWTCredits;
  }
  public tblnz_rtniit with_fcurAllowableRLWTCredits(java.math.BigDecimal fcurAllowableRLWTCredits) {
    this.fcurAllowableRLWTCredits = fcurAllowableRLWTCredits;
    return this;
  }
  private java.math.BigDecimal fcurProvisionalTaxPaid;
  public java.math.BigDecimal get_fcurProvisionalTaxPaid() {
    return fcurProvisionalTaxPaid;
  }
  public void set_fcurProvisionalTaxPaid(java.math.BigDecimal fcurProvisionalTaxPaid) {
    this.fcurProvisionalTaxPaid = fcurProvisionalTaxPaid;
  }
  public tblnz_rtniit with_fcurProvisionalTaxPaid(java.math.BigDecimal fcurProvisionalTaxPaid) {
    this.fcurProvisionalTaxPaid = fcurProvisionalTaxPaid;
    return this;
  }
  private java.math.BigDecimal fcurRefund;
  public java.math.BigDecimal get_fcurRefund() {
    return fcurRefund;
  }
  public void set_fcurRefund(java.math.BigDecimal fcurRefund) {
    this.fcurRefund = fcurRefund;
  }
  public tblnz_rtniit with_fcurRefund(java.math.BigDecimal fcurRefund) {
    this.fcurRefund = fcurRefund;
    return this;
  }
  private Integer fblnDisclosureRequired;
  public Integer get_fblnDisclosureRequired() {
    return fblnDisclosureRequired;
  }
  public void set_fblnDisclosureRequired(Integer fblnDisclosureRequired) {
    this.fblnDisclosureRequired = fblnDisclosureRequired;
  }
  public tblnz_rtniit with_fblnDisclosureRequired(Integer fblnDisclosureRequired) {
    this.fblnDisclosureRequired = fblnDisclosureRequired;
    return this;
  }
  private String fstrPTSStatus;
  public String get_fstrPTSStatus() {
    return fstrPTSStatus;
  }
  public void set_fstrPTSStatus(String fstrPTSStatus) {
    this.fstrPTSStatus = fstrPTSStatus;
  }
  public tblnz_rtniit with_fstrPTSStatus(String fstrPTSStatus) {
    this.fstrPTSStatus = fstrPTSStatus;
    return this;
  }
  private Integer flngSelectGroup;
  public Integer get_flngSelectGroup() {
    return flngSelectGroup;
  }
  public void set_flngSelectGroup(Integer flngSelectGroup) {
    this.flngSelectGroup = flngSelectGroup;
  }
  public tblnz_rtniit with_flngSelectGroup(Integer flngSelectGroup) {
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
  public tblnz_rtniit with_fdtmSelectDate(java.sql.Timestamp fdtmSelectDate) {
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
  public tblnz_rtniit with_fblnGroup2Suspend(Integer fblnGroup2Suspend) {
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
  public tblnz_rtniit with_fstrResMethod(String fstrResMethod) {
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
  public tblnz_rtniit with_fcurResIncome(java.math.BigDecimal fcurResIncome) {
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
  public tblnz_rtniit with_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
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
  public tblnz_rtniit with_fcurResDeductionsPriorYear(java.math.BigDecimal fcurResDeductionsPriorYear) {
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
  public tblnz_rtniit with_fcurResDeductionsClaimed(java.math.BigDecimal fcurResDeductionsClaimed) {
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
  public tblnz_rtniit with_fcurResNetIncome(java.math.BigDecimal fcurResNetIncome) {
    this.fcurResNetIncome = fcurResNetIncome;
    return this;
  }
  private java.math.BigDecimal fcurResDeductionsCarriedForwar;
  public java.math.BigDecimal get_fcurResDeductionsCarriedForwar() {
    return fcurResDeductionsCarriedForwar;
  }
  public void set_fcurResDeductionsCarriedForwar(java.math.BigDecimal fcurResDeductionsCarriedForwar) {
    this.fcurResDeductionsCarriedForwar = fcurResDeductionsCarriedForwar;
  }
  public tblnz_rtniit with_fcurResDeductionsCarriedForwar(java.math.BigDecimal fcurResDeductionsCarriedForwar) {
    this.fcurResDeductionsCarriedForwar = fcurResDeductionsCarriedForwar;
    return this;
  }
  private java.math.BigDecimal fcurRDICarryForwardCurrentYear;
  public java.math.BigDecimal get_fcurRDICarryForwardCurrentYear() {
    return fcurRDICarryForwardCurrentYear;
  }
  public void set_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
    this.fcurRDICarryForwardCurrentYear = fcurRDICarryForwardCurrentYear;
  }
  public tblnz_rtniit with_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
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
  public tblnz_rtniit with_fcurRDICarryForwardRemaining(java.math.BigDecimal fcurRDICarryForwardRemaining) {
    this.fcurRDICarryForwardRemaining = fcurRDICarryForwardRemaining;
    return this;
  }
  private java.math.BigDecimal fcurShareholderAIMTaxPaid;
  public java.math.BigDecimal get_fcurShareholderAIMTaxPaid() {
    return fcurShareholderAIMTaxPaid;
  }
  public void set_fcurShareholderAIMTaxPaid(java.math.BigDecimal fcurShareholderAIMTaxPaid) {
    this.fcurShareholderAIMTaxPaid = fcurShareholderAIMTaxPaid;
  }
  public tblnz_rtniit with_fcurShareholderAIMTaxPaid(java.math.BigDecimal fcurShareholderAIMTaxPaid) {
    this.fcurShareholderAIMTaxPaid = fcurShareholderAIMTaxPaid;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtniit with_fstrWho(String fstrWho) {
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
  public tblnz_rtniit with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniit)) {
      return false;
    }
    tblnz_rtniit that = (tblnz_rtniit) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnIR215Attached == null ? that.fblnIR215Attached == null : this.fblnIR215Attached.equals(that.fblnIR215Attached));
    equal = equal && (this.fcurTotalFamilyTaxCredit == null ? that.fcurTotalFamilyTaxCredit == null : this.fcurTotalFamilyTaxCredit.equals(that.fcurTotalFamilyTaxCredit));
    equal = equal && (this.fcurTotalPAYEDeducted == null ? that.fcurTotalPAYEDeducted == null : this.fcurTotalPAYEDeducted.equals(that.fcurTotalPAYEDeducted));
    equal = equal && (this.fcurTotalAdjPAYEDeducted == null ? that.fcurTotalAdjPAYEDeducted == null : this.fcurTotalAdjPAYEDeducted.equals(that.fcurTotalAdjPAYEDeducted));
    equal = equal && (this.fcurTotalGrossIncome == null ? that.fcurTotalGrossIncome == null : this.fcurTotalGrossIncome.equals(that.fcurTotalGrossIncome));
    equal = equal && (this.fcurIncomeNotLiableForACC == null ? that.fcurIncomeNotLiableForACC == null : this.fcurIncomeNotLiableForACC.equals(that.fcurIncomeNotLiableForACC));
    equal = equal && (this.fcurACCEarnerLevy == null ? that.fcurACCEarnerLevy == null : this.fcurACCEarnerLevy.equals(that.fcurACCEarnerLevy));
    equal = equal && (this.fcurTotalIncomeWithTaxDeducted == null ? that.fcurTotalIncomeWithTaxDeducted == null : this.fcurTotalIncomeWithTaxDeducted.equals(that.fcurTotalIncomeWithTaxDeducted));
    equal = equal && (this.fcurTotalSchedularPymtTaxDed == null ? that.fcurTotalSchedularPymtTaxDed == null : this.fcurTotalSchedularPymtTaxDed.equals(that.fcurTotalSchedularPymtTaxDed));
    equal = equal && (this.fcurTotalGrossSchedularPayment == null ? that.fcurTotalGrossSchedularPayment == null : this.fcurTotalGrossSchedularPayment.equals(that.fcurTotalGrossSchedularPayment));
    equal = equal && (this.fcurExpensesSchedularPayments == null ? that.fcurExpensesSchedularPayments == null : this.fcurExpensesSchedularPayments.equals(that.fcurExpensesSchedularPayments));
    equal = equal && (this.fcurNetSchedularPayments == null ? that.fcurNetSchedularPayments == null : this.fcurNetSchedularPayments.equals(that.fcurNetSchedularPayments));
    equal = equal && (this.fcurTotalRWT == null ? that.fcurTotalRWT == null : this.fcurTotalRWT.equals(that.fcurTotalRWT));
    equal = equal && (this.fcurTotalGrossInterest == null ? that.fcurTotalGrossInterest == null : this.fcurTotalGrossInterest.equals(that.fcurTotalGrossInterest));
    equal = equal && (this.fblnIntPshpLTC == null ? that.fblnIntPshpLTC == null : this.fblnIntPshpLTC.equals(that.fblnIntPshpLTC));
    equal = equal && (this.fcurTotalImputationCredits == null ? that.fcurTotalImputationCredits == null : this.fcurTotalImputationCredits.equals(that.fcurTotalImputationCredits));
    equal = equal && (this.fcurTotalDividendRWT == null ? that.fcurTotalDividendRWT == null : this.fcurTotalDividendRWT.equals(that.fcurTotalDividendRWT));
    equal = equal && (this.fcurTotalGrossDividends == null ? that.fcurTotalGrossDividends == null : this.fcurTotalGrossDividends.equals(that.fcurTotalGrossDividends));
    equal = equal && (this.fblnDivPshpLTC == null ? that.fblnDivPshpLTC == null : this.fblnDivPshpLTC.equals(that.fblnDivPshpLTC));
    equal = equal && (this.fcurTotalMaoriCredits == null ? that.fcurTotalMaoriCredits == null : this.fcurTotalMaoriCredits.equals(that.fcurTotalMaoriCredits));
    equal = equal && (this.fcurTotalMaoriDistributions == null ? that.fcurTotalMaoriDistributions == null : this.fcurTotalMaoriDistributions.equals(that.fcurTotalMaoriDistributions));
    equal = equal && (this.fcurTotalTaxPaidByTrustees == null ? that.fcurTotalTaxPaidByTrustees == null : this.fcurTotalTaxPaidByTrustees.equals(that.fcurTotalTaxPaidByTrustees));
    equal = equal && (this.fcurTotalEstateOrTrusteeIncome == null ? that.fcurTotalEstateOrTrusteeIncome == null : this.fcurTotalEstateOrTrusteeIncome.equals(that.fcurTotalEstateOrTrusteeIncome));
    equal = equal && (this.fcurTotalTaxableDistributions == null ? that.fcurTotalTaxableDistributions == null : this.fcurTotalTaxableDistributions.equals(that.fcurTotalTaxableDistributions));
    equal = equal && (this.fcurTotalOverseasTaxPaid == null ? that.fcurTotalOverseasTaxPaid == null : this.fcurTotalOverseasTaxPaid.equals(that.fcurTotalOverseasTaxPaid));
    equal = equal && (this.fcurTotalOverseasIncome == null ? that.fcurTotalOverseasIncome == null : this.fcurTotalOverseasIncome.equals(that.fcurTotalOverseasIncome));
    equal = equal && (this.fblnOverseasSuper == null ? that.fblnOverseasSuper == null : this.fblnOverseasSuper.equals(that.fblnOverseasSuper));
    equal = equal && (this.fcurTotalPartnershipTaxCredits == null ? that.fcurTotalPartnershipTaxCredits == null : this.fcurTotalPartnershipTaxCredits.equals(that.fcurTotalPartnershipTaxCredits));
    equal = equal && (this.fcurTotalActivePtshpIncome == null ? that.fcurTotalActivePtshpIncome == null : this.fcurTotalActivePtshpIncome.equals(that.fcurTotalActivePtshpIncome));
    equal = equal && (this.fcurTotalLTCTaxCredits == null ? that.fcurTotalLTCTaxCredits == null : this.fcurTotalLTCTaxCredits.equals(that.fcurTotalLTCTaxCredits));
    equal = equal && (this.fcurTotalActiveLTCIncome == null ? that.fcurTotalActiveLTCIncome == null : this.fcurTotalActiveLTCIncome.equals(that.fcurTotalActiveLTCIncome));
    equal = equal && (this.fcurNonAllowableDeductions == null ? that.fcurNonAllowableDeductions == null : this.fcurNonAllowableDeductions.equals(that.fcurNonAllowableDeductions));
    equal = equal && (this.fcurNonAllowableDedClaimed == null ? that.fcurNonAllowableDedClaimed == null : this.fcurNonAllowableDedClaimed.equals(that.fcurNonAllowableDedClaimed));
    equal = equal && (this.fcurAdjustedLTCIncome == null ? that.fcurAdjustedLTCIncome == null : this.fcurAdjustedLTCIncome.equals(that.fcurAdjustedLTCIncome));
    equal = equal && (this.fcurTaxCreditSubtotal == null ? that.fcurTaxCreditSubtotal == null : this.fcurTaxCreditSubtotal.equals(that.fcurTaxCreditSubtotal));
    equal = equal && (this.fcurIncomeSubtotal == null ? that.fcurIncomeSubtotal == null : this.fcurIncomeSubtotal.equals(that.fcurIncomeSubtotal));
    equal = equal && (this.fcurShareholderEmployeeSalary == null ? that.fcurShareholderEmployeeSalary == null : this.fcurShareholderEmployeeSalary.equals(that.fcurShareholderEmployeeSalary));
    equal = equal && (this.fblnFutureShrSalary == null ? that.fblnFutureShrSalary == null : this.fblnFutureShrSalary.equals(that.fblnFutureShrSalary));
    equal = equal && (this.fblnWithoutPayCloseCompany == null ? that.fblnWithoutPayCloseCompany == null : this.fblnWithoutPayCloseCompany.equals(that.fblnWithoutPayCloseCompany));
    equal = equal && (this.fcurNetRents == null ? that.fcurNetRents == null : this.fcurNetRents.equals(that.fcurNetRents));
    equal = equal && (this.fcurSelfEmployedNetIncome == null ? that.fcurSelfEmployedNetIncome == null : this.fcurSelfEmployedNetIncome.equals(that.fcurSelfEmployedNetIncome));
    equal = equal && (this.fcurTotalOtherNetIncome == null ? that.fcurTotalOtherNetIncome == null : this.fcurTotalOtherNetIncome.equals(that.fcurTotalOtherNetIncome));
    equal = equal && (this.fcurSaleOfProperty == null ? that.fcurSaleOfProperty == null : this.fcurSaleOfProperty.equals(that.fcurSaleOfProperty));
    equal = equal && (this.fcurRLWTCredit == null ? that.fcurRLWTCredit == null : this.fcurRLWTCredit.equals(that.fcurRLWTCredit));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurTotalOtherExpenses == null ? that.fcurTotalOtherExpenses == null : this.fcurTotalOtherExpenses.equals(that.fcurTotalOtherExpenses));
    equal = equal && (this.fcurIncomeAfterExpenses == null ? that.fcurIncomeAfterExpenses == null : this.fcurIncomeAfterExpenses.equals(that.fcurIncomeAfterExpenses));
    equal = equal && (this.fcurAmountBroughtForward == null ? that.fcurAmountBroughtForward == null : this.fcurAmountBroughtForward.equals(that.fcurAmountBroughtForward));
    equal = equal && (this.fcurAmountClaimedThisYear == null ? that.fcurAmountClaimedThisYear == null : this.fcurAmountClaimedThisYear.equals(that.fcurAmountClaimedThisYear));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fblnEligibleForIETC == null ? that.fblnEligibleForIETC == null : this.fblnEligibleForIETC.equals(that.fblnEligibleForIETC));
    equal = equal && (this.fdtmExOverseasIncomeStart == null ? that.fdtmExOverseasIncomeStart == null : this.fdtmExOverseasIncomeStart.equals(that.fdtmExOverseasIncomeStart));
    equal = equal && (this.fdtmExcOverseasIncomeEnd == null ? that.fdtmExcOverseasIncomeEnd == null : this.fdtmExcOverseasIncomeEnd.equals(that.fdtmExcOverseasIncomeEnd));
    equal = equal && (this.fintExcOverseasMonths == null ? that.fintExcOverseasMonths == null : this.fintExcOverseasMonths.equals(that.fintExcOverseasMonths));
    equal = equal && (this.fcurIETC == null ? that.fcurIETC == null : this.fcurIETC.equals(that.fcurIETC));
    equal = equal && (this.fcurAllowableImpCredits == null ? that.fcurAllowableImpCredits == null : this.fcurAllowableImpCredits.equals(that.fcurAllowableImpCredits));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurTotalExtTCPD == null ? that.fcurTotalExtTCPD == null : this.fcurTotalExtTCPD.equals(that.fcurTotalExtTCPD));
    equal = equal && (this.fcurTotalTCPD == null ? that.fcurTotalTCPD == null : this.fcurTotalTCPD.equals(that.fcurTotalTCPD));
    equal = equal && (this.fcurTaxOnTaxableIncome == null ? that.fcurTaxOnTaxableIncome == null : this.fcurTaxOnTaxableIncome.equals(that.fcurTaxOnTaxableIncome));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurTaxCalcResult == null ? that.fcurTaxCalcResult == null : this.fcurTaxCalcResult.equals(that.fcurTaxCalcResult));
    equal = equal && (this.fcurImputationToCarryForward == null ? that.fcurImputationToCarryForward == null : this.fcurImputationToCarryForward.equals(that.fcurImputationToCarryForward));
    equal = equal && (this.fblnEarlyPymtDiscount == null ? that.fblnEarlyPymtDiscount == null : this.fblnEarlyPymtDiscount.equals(that.fblnEarlyPymtDiscount));
    equal = equal && (this.fcurOverpaymentProvRefund == null ? that.fcurOverpaymentProvRefund == null : this.fcurOverpaymentProvRefund.equals(that.fcurOverpaymentProvRefund));
    equal = equal && (this.fcurRefundAndProvOverpayment == null ? that.fcurRefundAndProvOverpayment == null : this.fcurRefundAndProvOverpayment.equals(that.fcurRefundAndProvOverpayment));
    equal = equal && (this.fcurRefundCalc == null ? that.fcurRefundCalc == null : this.fcurRefundCalc.equals(that.fcurRefundCalc));
    equal = equal && (this.fcurProvisionalTax == null ? that.fcurProvisionalTax == null : this.fcurProvisionalTax.equals(that.fcurProvisionalTax));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fcurAllowableRLWTCredits == null ? that.fcurAllowableRLWTCredits == null : this.fcurAllowableRLWTCredits.equals(that.fcurAllowableRLWTCredits));
    equal = equal && (this.fcurProvisionalTaxPaid == null ? that.fcurProvisionalTaxPaid == null : this.fcurProvisionalTaxPaid.equals(that.fcurProvisionalTaxPaid));
    equal = equal && (this.fcurRefund == null ? that.fcurRefund == null : this.fcurRefund.equals(that.fcurRefund));
    equal = equal && (this.fblnDisclosureRequired == null ? that.fblnDisclosureRequired == null : this.fblnDisclosureRequired.equals(that.fblnDisclosureRequired));
    equal = equal && (this.fstrPTSStatus == null ? that.fstrPTSStatus == null : this.fstrPTSStatus.equals(that.fstrPTSStatus));
    equal = equal && (this.flngSelectGroup == null ? that.flngSelectGroup == null : this.flngSelectGroup.equals(that.flngSelectGroup));
    equal = equal && (this.fdtmSelectDate == null ? that.fdtmSelectDate == null : this.fdtmSelectDate.equals(that.fdtmSelectDate));
    equal = equal && (this.fblnGroup2Suspend == null ? that.fblnGroup2Suspend == null : this.fblnGroup2Suspend.equals(that.fblnGroup2Suspend));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurResDeductionsCarriedForwar == null ? that.fcurResDeductionsCarriedForwar == null : this.fcurResDeductionsCarriedForwar.equals(that.fcurResDeductionsCarriedForwar));
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurShareholderAIMTaxPaid == null ? that.fcurShareholderAIMTaxPaid == null : this.fcurShareholderAIMTaxPaid.equals(that.fcurShareholderAIMTaxPaid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniit)) {
      return false;
    }
    tblnz_rtniit that = (tblnz_rtniit) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnIR215Attached == null ? that.fblnIR215Attached == null : this.fblnIR215Attached.equals(that.fblnIR215Attached));
    equal = equal && (this.fcurTotalFamilyTaxCredit == null ? that.fcurTotalFamilyTaxCredit == null : this.fcurTotalFamilyTaxCredit.equals(that.fcurTotalFamilyTaxCredit));
    equal = equal && (this.fcurTotalPAYEDeducted == null ? that.fcurTotalPAYEDeducted == null : this.fcurTotalPAYEDeducted.equals(that.fcurTotalPAYEDeducted));
    equal = equal && (this.fcurTotalAdjPAYEDeducted == null ? that.fcurTotalAdjPAYEDeducted == null : this.fcurTotalAdjPAYEDeducted.equals(that.fcurTotalAdjPAYEDeducted));
    equal = equal && (this.fcurTotalGrossIncome == null ? that.fcurTotalGrossIncome == null : this.fcurTotalGrossIncome.equals(that.fcurTotalGrossIncome));
    equal = equal && (this.fcurIncomeNotLiableForACC == null ? that.fcurIncomeNotLiableForACC == null : this.fcurIncomeNotLiableForACC.equals(that.fcurIncomeNotLiableForACC));
    equal = equal && (this.fcurACCEarnerLevy == null ? that.fcurACCEarnerLevy == null : this.fcurACCEarnerLevy.equals(that.fcurACCEarnerLevy));
    equal = equal && (this.fcurTotalIncomeWithTaxDeducted == null ? that.fcurTotalIncomeWithTaxDeducted == null : this.fcurTotalIncomeWithTaxDeducted.equals(that.fcurTotalIncomeWithTaxDeducted));
    equal = equal && (this.fcurTotalSchedularPymtTaxDed == null ? that.fcurTotalSchedularPymtTaxDed == null : this.fcurTotalSchedularPymtTaxDed.equals(that.fcurTotalSchedularPymtTaxDed));
    equal = equal && (this.fcurTotalGrossSchedularPayment == null ? that.fcurTotalGrossSchedularPayment == null : this.fcurTotalGrossSchedularPayment.equals(that.fcurTotalGrossSchedularPayment));
    equal = equal && (this.fcurExpensesSchedularPayments == null ? that.fcurExpensesSchedularPayments == null : this.fcurExpensesSchedularPayments.equals(that.fcurExpensesSchedularPayments));
    equal = equal && (this.fcurNetSchedularPayments == null ? that.fcurNetSchedularPayments == null : this.fcurNetSchedularPayments.equals(that.fcurNetSchedularPayments));
    equal = equal && (this.fcurTotalRWT == null ? that.fcurTotalRWT == null : this.fcurTotalRWT.equals(that.fcurTotalRWT));
    equal = equal && (this.fcurTotalGrossInterest == null ? that.fcurTotalGrossInterest == null : this.fcurTotalGrossInterest.equals(that.fcurTotalGrossInterest));
    equal = equal && (this.fblnIntPshpLTC == null ? that.fblnIntPshpLTC == null : this.fblnIntPshpLTC.equals(that.fblnIntPshpLTC));
    equal = equal && (this.fcurTotalImputationCredits == null ? that.fcurTotalImputationCredits == null : this.fcurTotalImputationCredits.equals(that.fcurTotalImputationCredits));
    equal = equal && (this.fcurTotalDividendRWT == null ? that.fcurTotalDividendRWT == null : this.fcurTotalDividendRWT.equals(that.fcurTotalDividendRWT));
    equal = equal && (this.fcurTotalGrossDividends == null ? that.fcurTotalGrossDividends == null : this.fcurTotalGrossDividends.equals(that.fcurTotalGrossDividends));
    equal = equal && (this.fblnDivPshpLTC == null ? that.fblnDivPshpLTC == null : this.fblnDivPshpLTC.equals(that.fblnDivPshpLTC));
    equal = equal && (this.fcurTotalMaoriCredits == null ? that.fcurTotalMaoriCredits == null : this.fcurTotalMaoriCredits.equals(that.fcurTotalMaoriCredits));
    equal = equal && (this.fcurTotalMaoriDistributions == null ? that.fcurTotalMaoriDistributions == null : this.fcurTotalMaoriDistributions.equals(that.fcurTotalMaoriDistributions));
    equal = equal && (this.fcurTotalTaxPaidByTrustees == null ? that.fcurTotalTaxPaidByTrustees == null : this.fcurTotalTaxPaidByTrustees.equals(that.fcurTotalTaxPaidByTrustees));
    equal = equal && (this.fcurTotalEstateOrTrusteeIncome == null ? that.fcurTotalEstateOrTrusteeIncome == null : this.fcurTotalEstateOrTrusteeIncome.equals(that.fcurTotalEstateOrTrusteeIncome));
    equal = equal && (this.fcurTotalTaxableDistributions == null ? that.fcurTotalTaxableDistributions == null : this.fcurTotalTaxableDistributions.equals(that.fcurTotalTaxableDistributions));
    equal = equal && (this.fcurTotalOverseasTaxPaid == null ? that.fcurTotalOverseasTaxPaid == null : this.fcurTotalOverseasTaxPaid.equals(that.fcurTotalOverseasTaxPaid));
    equal = equal && (this.fcurTotalOverseasIncome == null ? that.fcurTotalOverseasIncome == null : this.fcurTotalOverseasIncome.equals(that.fcurTotalOverseasIncome));
    equal = equal && (this.fblnOverseasSuper == null ? that.fblnOverseasSuper == null : this.fblnOverseasSuper.equals(that.fblnOverseasSuper));
    equal = equal && (this.fcurTotalPartnershipTaxCredits == null ? that.fcurTotalPartnershipTaxCredits == null : this.fcurTotalPartnershipTaxCredits.equals(that.fcurTotalPartnershipTaxCredits));
    equal = equal && (this.fcurTotalActivePtshpIncome == null ? that.fcurTotalActivePtshpIncome == null : this.fcurTotalActivePtshpIncome.equals(that.fcurTotalActivePtshpIncome));
    equal = equal && (this.fcurTotalLTCTaxCredits == null ? that.fcurTotalLTCTaxCredits == null : this.fcurTotalLTCTaxCredits.equals(that.fcurTotalLTCTaxCredits));
    equal = equal && (this.fcurTotalActiveLTCIncome == null ? that.fcurTotalActiveLTCIncome == null : this.fcurTotalActiveLTCIncome.equals(that.fcurTotalActiveLTCIncome));
    equal = equal && (this.fcurNonAllowableDeductions == null ? that.fcurNonAllowableDeductions == null : this.fcurNonAllowableDeductions.equals(that.fcurNonAllowableDeductions));
    equal = equal && (this.fcurNonAllowableDedClaimed == null ? that.fcurNonAllowableDedClaimed == null : this.fcurNonAllowableDedClaimed.equals(that.fcurNonAllowableDedClaimed));
    equal = equal && (this.fcurAdjustedLTCIncome == null ? that.fcurAdjustedLTCIncome == null : this.fcurAdjustedLTCIncome.equals(that.fcurAdjustedLTCIncome));
    equal = equal && (this.fcurTaxCreditSubtotal == null ? that.fcurTaxCreditSubtotal == null : this.fcurTaxCreditSubtotal.equals(that.fcurTaxCreditSubtotal));
    equal = equal && (this.fcurIncomeSubtotal == null ? that.fcurIncomeSubtotal == null : this.fcurIncomeSubtotal.equals(that.fcurIncomeSubtotal));
    equal = equal && (this.fcurShareholderEmployeeSalary == null ? that.fcurShareholderEmployeeSalary == null : this.fcurShareholderEmployeeSalary.equals(that.fcurShareholderEmployeeSalary));
    equal = equal && (this.fblnFutureShrSalary == null ? that.fblnFutureShrSalary == null : this.fblnFutureShrSalary.equals(that.fblnFutureShrSalary));
    equal = equal && (this.fblnWithoutPayCloseCompany == null ? that.fblnWithoutPayCloseCompany == null : this.fblnWithoutPayCloseCompany.equals(that.fblnWithoutPayCloseCompany));
    equal = equal && (this.fcurNetRents == null ? that.fcurNetRents == null : this.fcurNetRents.equals(that.fcurNetRents));
    equal = equal && (this.fcurSelfEmployedNetIncome == null ? that.fcurSelfEmployedNetIncome == null : this.fcurSelfEmployedNetIncome.equals(that.fcurSelfEmployedNetIncome));
    equal = equal && (this.fcurTotalOtherNetIncome == null ? that.fcurTotalOtherNetIncome == null : this.fcurTotalOtherNetIncome.equals(that.fcurTotalOtherNetIncome));
    equal = equal && (this.fcurSaleOfProperty == null ? that.fcurSaleOfProperty == null : this.fcurSaleOfProperty.equals(that.fcurSaleOfProperty));
    equal = equal && (this.fcurRLWTCredit == null ? that.fcurRLWTCredit == null : this.fcurRLWTCredit.equals(that.fcurRLWTCredit));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurTotalOtherExpenses == null ? that.fcurTotalOtherExpenses == null : this.fcurTotalOtherExpenses.equals(that.fcurTotalOtherExpenses));
    equal = equal && (this.fcurIncomeAfterExpenses == null ? that.fcurIncomeAfterExpenses == null : this.fcurIncomeAfterExpenses.equals(that.fcurIncomeAfterExpenses));
    equal = equal && (this.fcurAmountBroughtForward == null ? that.fcurAmountBroughtForward == null : this.fcurAmountBroughtForward.equals(that.fcurAmountBroughtForward));
    equal = equal && (this.fcurAmountClaimedThisYear == null ? that.fcurAmountClaimedThisYear == null : this.fcurAmountClaimedThisYear.equals(that.fcurAmountClaimedThisYear));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fblnEligibleForIETC == null ? that.fblnEligibleForIETC == null : this.fblnEligibleForIETC.equals(that.fblnEligibleForIETC));
    equal = equal && (this.fdtmExOverseasIncomeStart == null ? that.fdtmExOverseasIncomeStart == null : this.fdtmExOverseasIncomeStart.equals(that.fdtmExOverseasIncomeStart));
    equal = equal && (this.fdtmExcOverseasIncomeEnd == null ? that.fdtmExcOverseasIncomeEnd == null : this.fdtmExcOverseasIncomeEnd.equals(that.fdtmExcOverseasIncomeEnd));
    equal = equal && (this.fintExcOverseasMonths == null ? that.fintExcOverseasMonths == null : this.fintExcOverseasMonths.equals(that.fintExcOverseasMonths));
    equal = equal && (this.fcurIETC == null ? that.fcurIETC == null : this.fcurIETC.equals(that.fcurIETC));
    equal = equal && (this.fcurAllowableImpCredits == null ? that.fcurAllowableImpCredits == null : this.fcurAllowableImpCredits.equals(that.fcurAllowableImpCredits));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurTotalExtTCPD == null ? that.fcurTotalExtTCPD == null : this.fcurTotalExtTCPD.equals(that.fcurTotalExtTCPD));
    equal = equal && (this.fcurTotalTCPD == null ? that.fcurTotalTCPD == null : this.fcurTotalTCPD.equals(that.fcurTotalTCPD));
    equal = equal && (this.fcurTaxOnTaxableIncome == null ? that.fcurTaxOnTaxableIncome == null : this.fcurTaxOnTaxableIncome.equals(that.fcurTaxOnTaxableIncome));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurTaxCalcResult == null ? that.fcurTaxCalcResult == null : this.fcurTaxCalcResult.equals(that.fcurTaxCalcResult));
    equal = equal && (this.fcurImputationToCarryForward == null ? that.fcurImputationToCarryForward == null : this.fcurImputationToCarryForward.equals(that.fcurImputationToCarryForward));
    equal = equal && (this.fblnEarlyPymtDiscount == null ? that.fblnEarlyPymtDiscount == null : this.fblnEarlyPymtDiscount.equals(that.fblnEarlyPymtDiscount));
    equal = equal && (this.fcurOverpaymentProvRefund == null ? that.fcurOverpaymentProvRefund == null : this.fcurOverpaymentProvRefund.equals(that.fcurOverpaymentProvRefund));
    equal = equal && (this.fcurRefundAndProvOverpayment == null ? that.fcurRefundAndProvOverpayment == null : this.fcurRefundAndProvOverpayment.equals(that.fcurRefundAndProvOverpayment));
    equal = equal && (this.fcurRefundCalc == null ? that.fcurRefundCalc == null : this.fcurRefundCalc.equals(that.fcurRefundCalc));
    equal = equal && (this.fcurProvisionalTax == null ? that.fcurProvisionalTax == null : this.fcurProvisionalTax.equals(that.fcurProvisionalTax));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fcurAllowableRLWTCredits == null ? that.fcurAllowableRLWTCredits == null : this.fcurAllowableRLWTCredits.equals(that.fcurAllowableRLWTCredits));
    equal = equal && (this.fcurProvisionalTaxPaid == null ? that.fcurProvisionalTaxPaid == null : this.fcurProvisionalTaxPaid.equals(that.fcurProvisionalTaxPaid));
    equal = equal && (this.fcurRefund == null ? that.fcurRefund == null : this.fcurRefund.equals(that.fcurRefund));
    equal = equal && (this.fblnDisclosureRequired == null ? that.fblnDisclosureRequired == null : this.fblnDisclosureRequired.equals(that.fblnDisclosureRequired));
    equal = equal && (this.fstrPTSStatus == null ? that.fstrPTSStatus == null : this.fstrPTSStatus.equals(that.fstrPTSStatus));
    equal = equal && (this.flngSelectGroup == null ? that.flngSelectGroup == null : this.flngSelectGroup.equals(that.flngSelectGroup));
    equal = equal && (this.fdtmSelectDate == null ? that.fdtmSelectDate == null : this.fdtmSelectDate.equals(that.fdtmSelectDate));
    equal = equal && (this.fblnGroup2Suspend == null ? that.fblnGroup2Suspend == null : this.fblnGroup2Suspend.equals(that.fblnGroup2Suspend));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurResDeductionsCarriedForwar == null ? that.fcurResDeductionsCarriedForwar == null : this.fcurResDeductionsCarriedForwar.equals(that.fcurResDeductionsCarriedForwar));
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurShareholderAIMTaxPaid == null ? that.fcurShareholderAIMTaxPaid == null : this.fcurShareholderAIMTaxPaid.equals(that.fcurShareholderAIMTaxPaid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnIR215Attached = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fcurTotalFamilyTaxCredit = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurTotalPAYEDeducted = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTotalAdjPAYEDeducted = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurTotalGrossIncome = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurIncomeNotLiableForACC = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurACCEarnerLevy = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalIncomeWithTaxDeducted = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurTotalSchedularPymtTaxDed = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTotalGrossSchedularPayment = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurExpensesSchedularPayments = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurNetSchedularPayments = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalRWT = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalGrossInterest = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fblnIntPshpLTC = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fcurTotalImputationCredits = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalDividendRWT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalGrossDividends = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fblnDivPshpLTC = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fcurTotalMaoriCredits = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalMaoriDistributions = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTotalTaxPaidByTrustees = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurTotalEstateOrTrusteeIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTotalTaxableDistributions = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTotalOverseasTaxPaid = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTotalOverseasIncome = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fblnOverseasSuper = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fcurTotalPartnershipTaxCredits = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTotalActivePtshpIncome = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTotalLTCTaxCredits = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurTotalActiveLTCIncome = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurNonAllowableDeductions = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurNonAllowableDedClaimed = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurAdjustedLTCIncome = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurTaxCreditSubtotal = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurIncomeSubtotal = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurShareholderEmployeeSalary = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fblnFutureShrSalary = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnWithoutPayCloseCompany = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fcurNetRents = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurSelfEmployedNetIncome = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurTotalOtherNetIncome = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurRLWTCredit = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurTotalOtherExpenses = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurIncomeAfterExpenses = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurAmountBroughtForward = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurAmountClaimedThisYear = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fblnEligibleForIETC = JdbcWritableBridge.readInteger(52, __dbResults);
    this.fdtmExOverseasIncomeStart = JdbcWritableBridge.readTimestamp(53, __dbResults);
    this.fdtmExcOverseasIncomeEnd = JdbcWritableBridge.readTimestamp(54, __dbResults);
    this.fintExcOverseasMonths = JdbcWritableBridge.readInteger(55, __dbResults);
    this.fcurIETC = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurAllowableImpCredits = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurTotalExtTCPD = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurTotalTCPD = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurTaxOnTaxableIncome = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.fcurTaxCalcResult = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurImputationToCarryForward = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fblnEarlyPymtDiscount = JdbcWritableBridge.readInteger(65, __dbResults);
    this.fcurOverpaymentProvRefund = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fcurRefundAndProvOverpayment = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.fcurRefundCalc = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.fcurAllowableRLWTCredits = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(72, __dbResults);
    this.fcurRefund = JdbcWritableBridge.readBigDecimal(73, __dbResults);
    this.fblnDisclosureRequired = JdbcWritableBridge.readInteger(74, __dbResults);
    this.fstrPTSStatus = JdbcWritableBridge.readString(75, __dbResults);
    this.flngSelectGroup = JdbcWritableBridge.readInteger(76, __dbResults);
    this.fdtmSelectDate = JdbcWritableBridge.readTimestamp(77, __dbResults);
    this.fblnGroup2Suspend = JdbcWritableBridge.readInteger(78, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(79, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(81, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(82, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(83, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(84, __dbResults);
    this.fcurResDeductionsCarriedForwar = JdbcWritableBridge.readBigDecimal(85, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(86, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(87, __dbResults);
    this.fcurShareholderAIMTaxPaid = JdbcWritableBridge.readBigDecimal(88, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(89, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(90, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnIR215Attached = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fcurTotalFamilyTaxCredit = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurTotalPAYEDeducted = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTotalAdjPAYEDeducted = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurTotalGrossIncome = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurIncomeNotLiableForACC = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurACCEarnerLevy = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalIncomeWithTaxDeducted = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurTotalSchedularPymtTaxDed = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTotalGrossSchedularPayment = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurExpensesSchedularPayments = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurNetSchedularPayments = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalRWT = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalGrossInterest = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fblnIntPshpLTC = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fcurTotalImputationCredits = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalDividendRWT = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalGrossDividends = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fblnDivPshpLTC = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fcurTotalMaoriCredits = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalMaoriDistributions = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTotalTaxPaidByTrustees = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurTotalEstateOrTrusteeIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTotalTaxableDistributions = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTotalOverseasTaxPaid = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTotalOverseasIncome = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fblnOverseasSuper = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fcurTotalPartnershipTaxCredits = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTotalActivePtshpIncome = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTotalLTCTaxCredits = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurTotalActiveLTCIncome = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurNonAllowableDeductions = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurNonAllowableDedClaimed = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurAdjustedLTCIncome = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurTaxCreditSubtotal = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurIncomeSubtotal = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurShareholderEmployeeSalary = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fblnFutureShrSalary = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnWithoutPayCloseCompany = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fcurNetRents = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurSelfEmployedNetIncome = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurTotalOtherNetIncome = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurRLWTCredit = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurTotalOtherExpenses = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurIncomeAfterExpenses = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurAmountBroughtForward = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurAmountClaimedThisYear = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fblnEligibleForIETC = JdbcWritableBridge.readInteger(52, __dbResults);
    this.fdtmExOverseasIncomeStart = JdbcWritableBridge.readTimestamp(53, __dbResults);
    this.fdtmExcOverseasIncomeEnd = JdbcWritableBridge.readTimestamp(54, __dbResults);
    this.fintExcOverseasMonths = JdbcWritableBridge.readInteger(55, __dbResults);
    this.fcurIETC = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurAllowableImpCredits = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurTotalExtTCPD = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurTotalTCPD = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurTaxOnTaxableIncome = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.fcurTaxCalcResult = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurImputationToCarryForward = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fblnEarlyPymtDiscount = JdbcWritableBridge.readInteger(65, __dbResults);
    this.fcurOverpaymentProvRefund = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fcurRefundAndProvOverpayment = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.fcurRefundCalc = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.fcurAllowableRLWTCredits = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(72, __dbResults);
    this.fcurRefund = JdbcWritableBridge.readBigDecimal(73, __dbResults);
    this.fblnDisclosureRequired = JdbcWritableBridge.readInteger(74, __dbResults);
    this.fstrPTSStatus = JdbcWritableBridge.readString(75, __dbResults);
    this.flngSelectGroup = JdbcWritableBridge.readInteger(76, __dbResults);
    this.fdtmSelectDate = JdbcWritableBridge.readTimestamp(77, __dbResults);
    this.fblnGroup2Suspend = JdbcWritableBridge.readInteger(78, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(79, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(81, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(82, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(83, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(84, __dbResults);
    this.fcurResDeductionsCarriedForwar = JdbcWritableBridge.readBigDecimal(85, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(86, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(87, __dbResults);
    this.fcurShareholderAIMTaxPaid = JdbcWritableBridge.readBigDecimal(88, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(89, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(90, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnIR215Attached, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalFamilyTaxCredit, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPAYEDeducted, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAdjPAYEDeducted, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossIncome, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeNotLiableForACC, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurACCEarnerLevy, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeWithTaxDeducted, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSchedularPymtTaxDed, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossSchedularPayment, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExpensesSchedularPayments, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetSchedularPayments, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWT, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossInterest, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIntPshpLTC, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalImputationCredits, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDividendRWT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossDividends, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDivPshpLTC, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMaoriCredits, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMaoriDistributions, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxPaidByTrustees, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalEstateOrTrusteeIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxableDistributions, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOverseasTaxPaid, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOverseasIncome, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverseasSuper, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPartnershipTaxCredits, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalActivePtshpIncome, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLTCTaxCredits, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalActiveLTCIncome, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonAllowableDeductions, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonAllowableDedClaimed, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedLTCIncome, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditSubtotal, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeSubtotal, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderEmployeeSalary, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFutureShrSalary, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWithoutPayCloseCompany, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetRents, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSelfEmployedNetIncome, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherNetIncome, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWTCredit, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherExpenses, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterExpenses, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountBroughtForward, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountClaimedThisYear, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEligibleForIETC, 52 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExOverseasIncomeStart, 53 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExcOverseasIncomeEnd, 54 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintExcOverseasMonths, 55 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIETC, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAllowableImpCredits, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalExtTCPD, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTCPD, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxOnTaxableIncome, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCalcResult, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationToCarryForward, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEarlyPymtDiscount, 65 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvRefund, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAndProvOverpayment, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundCalc, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 69 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAllowableRLWTCredits, 71 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 72 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefund, 73 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDisclosureRequired, 74 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPTSStatus, 75 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSelectGroup, 76 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSelectDate, 77 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGroup2Suspend, 78 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 79 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 81 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 82 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 83 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 84 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsCarriedForwar, 85 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 86 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 87 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderAIMTaxPaid, 88 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 89 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 90 + __off, 93, __dbStmt);
    return 90;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIR215Attached, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalFamilyTaxCredit, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPAYEDeducted, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAdjPAYEDeducted, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossIncome, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeNotLiableForACC, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurACCEarnerLevy, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeWithTaxDeducted, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSchedularPymtTaxDed, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossSchedularPayment, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExpensesSchedularPayments, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetSchedularPayments, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWT, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossInterest, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIntPshpLTC, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalImputationCredits, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDividendRWT, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrossDividends, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDivPshpLTC, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMaoriCredits, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMaoriDistributions, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxPaidByTrustees, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalEstateOrTrusteeIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxableDistributions, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOverseasTaxPaid, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOverseasIncome, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverseasSuper, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPartnershipTaxCredits, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalActivePtshpIncome, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLTCTaxCredits, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalActiveLTCIncome, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonAllowableDeductions, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonAllowableDedClaimed, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedLTCIncome, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditSubtotal, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeSubtotal, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderEmployeeSalary, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFutureShrSalary, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWithoutPayCloseCompany, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetRents, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSelfEmployedNetIncome, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherNetIncome, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWTCredit, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherExpenses, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterExpenses, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountBroughtForward, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountClaimedThisYear, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEligibleForIETC, 52 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExOverseasIncomeStart, 53 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExcOverseasIncomeEnd, 54 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintExcOverseasMonths, 55 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIETC, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAllowableImpCredits, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalExtTCPD, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTCPD, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxOnTaxableIncome, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCalcResult, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationToCarryForward, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEarlyPymtDiscount, 65 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvRefund, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAndProvOverpayment, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundCalc, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 69 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAllowableRLWTCredits, 71 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 72 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefund, 73 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDisclosureRequired, 74 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPTSStatus, 75 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSelectGroup, 76 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSelectDate, 77 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGroup2Suspend, 78 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 79 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 81 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 82 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 83 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 84 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsCarriedForwar, 85 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 86 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 87 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderAIMTaxPaid, 88 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 89 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 90 + __off, 93, __dbStmt);
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
        this.fblnIR215Attached = null;
    } else {
    this.fblnIR215Attached = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalFamilyTaxCredit = null;
    } else {
    this.fcurTotalFamilyTaxCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPAYEDeducted = null;
    } else {
    this.fcurTotalPAYEDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalAdjPAYEDeducted = null;
    } else {
    this.fcurTotalAdjPAYEDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalGrossIncome = null;
    } else {
    this.fcurTotalGrossIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeNotLiableForACC = null;
    } else {
    this.fcurIncomeNotLiableForACC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurACCEarnerLevy = null;
    } else {
    this.fcurACCEarnerLevy = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncomeWithTaxDeducted = null;
    } else {
    this.fcurTotalIncomeWithTaxDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalSchedularPymtTaxDed = null;
    } else {
    this.fcurTotalSchedularPymtTaxDed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalGrossSchedularPayment = null;
    } else {
    this.fcurTotalGrossSchedularPayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExpensesSchedularPayments = null;
    } else {
    this.fcurExpensesSchedularPayments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetSchedularPayments = null;
    } else {
    this.fcurNetSchedularPayments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fblnIntPshpLTC = null;
    } else {
    this.fblnIntPshpLTC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalImputationCredits = null;
    } else {
    this.fcurTotalImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalDividendRWT = null;
    } else {
    this.fcurTotalDividendRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalGrossDividends = null;
    } else {
    this.fcurTotalGrossDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDivPshpLTC = null;
    } else {
    this.fblnDivPshpLTC = Integer.valueOf(__dataIn.readInt());
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
        this.fcurTotalTaxPaidByTrustees = null;
    } else {
    this.fcurTotalTaxPaidByTrustees = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalEstateOrTrusteeIncome = null;
    } else {
    this.fcurTotalEstateOrTrusteeIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxableDistributions = null;
    } else {
    this.fcurTotalTaxableDistributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOverseasTaxPaid = null;
    } else {
    this.fcurTotalOverseasTaxPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOverseasIncome = null;
    } else {
    this.fcurTotalOverseasIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverseasSuper = null;
    } else {
    this.fblnOverseasSuper = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPartnershipTaxCredits = null;
    } else {
    this.fcurTotalPartnershipTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalActivePtshpIncome = null;
    } else {
    this.fcurTotalActivePtshpIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurNonAllowableDeductions = null;
    } else {
    this.fcurNonAllowableDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNonAllowableDedClaimed = null;
    } else {
    this.fcurNonAllowableDedClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdjustedLTCIncome = null;
    } else {
    this.fcurAdjustedLTCIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxCreditSubtotal = null;
    } else {
    this.fcurTaxCreditSubtotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeSubtotal = null;
    } else {
    this.fcurIncomeSubtotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareholderEmployeeSalary = null;
    } else {
    this.fcurShareholderEmployeeSalary = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFutureShrSalary = null;
    } else {
    this.fblnFutureShrSalary = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnWithoutPayCloseCompany = null;
    } else {
    this.fblnWithoutPayCloseCompany = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetRents = null;
    } else {
    this.fcurNetRents = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSelfEmployedNetIncome = null;
    } else {
    this.fcurSelfEmployedNetIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOtherNetIncome = null;
    } else {
    this.fcurTotalOtherNetIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSaleOfProperty = null;
    } else {
    this.fcurSaleOfProperty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRLWTCredit = null;
    } else {
    this.fcurRLWTCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncome = null;
    } else {
    this.fcurTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurAmountBroughtForward = null;
    } else {
    this.fcurAmountBroughtForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountClaimedThisYear = null;
    } else {
    this.fcurAmountClaimedThisYear = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxableIncome = null;
    } else {
    this.fcurTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEligibleForIETC = null;
    } else {
    this.fblnEligibleForIETC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmExOverseasIncomeStart = null;
    } else {
    this.fdtmExOverseasIncomeStart = new Timestamp(__dataIn.readLong());
    this.fdtmExOverseasIncomeStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmExcOverseasIncomeEnd = null;
    } else {
    this.fdtmExcOverseasIncomeEnd = new Timestamp(__dataIn.readLong());
    this.fdtmExcOverseasIncomeEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintExcOverseasMonths = null;
    } else {
    this.fintExcOverseasMonths = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIETC = null;
    } else {
    this.fcurIETC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAllowableImpCredits = null;
    } else {
    this.fcurAllowableImpCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessImputationCredits = null;
    } else {
    this.fcurExcessImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalExtTCPD = null;
    } else {
    this.fcurTotalExtTCPD = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTCPD = null;
    } else {
    this.fcurTotalTCPD = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxOnTaxableIncome = null;
    } else {
    this.fcurTaxOnTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResidualIncomeTax = null;
    } else {
    this.fcurResidualIncomeTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxCalcResult = null;
    } else {
    this.fcurTaxCalcResult = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImputationToCarryForward = null;
    } else {
    this.fcurImputationToCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEarlyPymtDiscount = null;
    } else {
    this.fblnEarlyPymtDiscount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOverpaymentProvRefund = null;
    } else {
    this.fcurOverpaymentProvRefund = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRefundAndProvOverpayment = null;
    } else {
    this.fcurRefundAndProvOverpayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRefundCalc = null;
    } else {
    this.fcurRefundCalc = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurAllowableRLWTCredits = null;
    } else {
    this.fcurAllowableRLWTCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisionalTaxPaid = null;
    } else {
    this.fcurProvisionalTaxPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRefund = null;
    } else {
    this.fcurRefund = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDisclosureRequired = null;
    } else {
    this.fblnDisclosureRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPTSStatus = null;
    } else {
    this.fstrPTSStatus = Text.readString(__dataIn);
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
        this.fcurResDeductionsCarriedForwar = null;
    } else {
    this.fcurResDeductionsCarriedForwar = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurShareholderAIMTaxPaid = null;
    } else {
    this.fcurShareholderAIMTaxPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fblnIR215Attached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIR215Attached);
    }
    if (null == this.fcurTotalFamilyTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalFamilyTaxCredit, __dataOut);
    }
    if (null == this.fcurTotalPAYEDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPAYEDeducted, __dataOut);
    }
    if (null == this.fcurTotalAdjPAYEDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAdjPAYEDeducted, __dataOut);
    }
    if (null == this.fcurTotalGrossIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossIncome, __dataOut);
    }
    if (null == this.fcurIncomeNotLiableForACC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeNotLiableForACC, __dataOut);
    }
    if (null == this.fcurACCEarnerLevy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurACCEarnerLevy, __dataOut);
    }
    if (null == this.fcurTotalIncomeWithTaxDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeWithTaxDeducted, __dataOut);
    }
    if (null == this.fcurTotalSchedularPymtTaxDed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSchedularPymtTaxDed, __dataOut);
    }
    if (null == this.fcurTotalGrossSchedularPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossSchedularPayment, __dataOut);
    }
    if (null == this.fcurExpensesSchedularPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExpensesSchedularPayments, __dataOut);
    }
    if (null == this.fcurNetSchedularPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetSchedularPayments, __dataOut);
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
    if (null == this.fblnIntPshpLTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIntPshpLTC);
    }
    if (null == this.fcurTotalImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalImputationCredits, __dataOut);
    }
    if (null == this.fcurTotalDividendRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDividendRWT, __dataOut);
    }
    if (null == this.fcurTotalGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossDividends, __dataOut);
    }
    if (null == this.fblnDivPshpLTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDivPshpLTC);
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
    if (null == this.fcurTotalTaxPaidByTrustees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxPaidByTrustees, __dataOut);
    }
    if (null == this.fcurTotalEstateOrTrusteeIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalEstateOrTrusteeIncome, __dataOut);
    }
    if (null == this.fcurTotalTaxableDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxableDistributions, __dataOut);
    }
    if (null == this.fcurTotalOverseasTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOverseasTaxPaid, __dataOut);
    }
    if (null == this.fcurTotalOverseasIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOverseasIncome, __dataOut);
    }
    if (null == this.fblnOverseasSuper) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverseasSuper);
    }
    if (null == this.fcurTotalPartnershipTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPartnershipTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalActivePtshpIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalActivePtshpIncome, __dataOut);
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
    if (null == this.fcurNonAllowableDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonAllowableDeductions, __dataOut);
    }
    if (null == this.fcurNonAllowableDedClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonAllowableDedClaimed, __dataOut);
    }
    if (null == this.fcurAdjustedLTCIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedLTCIncome, __dataOut);
    }
    if (null == this.fcurTaxCreditSubtotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditSubtotal, __dataOut);
    }
    if (null == this.fcurIncomeSubtotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeSubtotal, __dataOut);
    }
    if (null == this.fcurShareholderEmployeeSalary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderEmployeeSalary, __dataOut);
    }
    if (null == this.fblnFutureShrSalary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFutureShrSalary);
    }
    if (null == this.fblnWithoutPayCloseCompany) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWithoutPayCloseCompany);
    }
    if (null == this.fcurNetRents) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetRents, __dataOut);
    }
    if (null == this.fcurSelfEmployedNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSelfEmployedNetIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherNetIncome, __dataOut);
    }
    if (null == this.fcurSaleOfProperty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSaleOfProperty, __dataOut);
    }
    if (null == this.fcurRLWTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWTCredit, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
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
    if (null == this.fcurAmountBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountBroughtForward, __dataOut);
    }
    if (null == this.fcurAmountClaimedThisYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountClaimedThisYear, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fblnEligibleForIETC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEligibleForIETC);
    }
    if (null == this.fdtmExOverseasIncomeStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExOverseasIncomeStart.getTime());
    __dataOut.writeInt(this.fdtmExOverseasIncomeStart.getNanos());
    }
    if (null == this.fdtmExcOverseasIncomeEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExcOverseasIncomeEnd.getTime());
    __dataOut.writeInt(this.fdtmExcOverseasIncomeEnd.getNanos());
    }
    if (null == this.fintExcOverseasMonths) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintExcOverseasMonths);
    }
    if (null == this.fcurIETC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIETC, __dataOut);
    }
    if (null == this.fcurAllowableImpCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAllowableImpCredits, __dataOut);
    }
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
    }
    if (null == this.fcurTotalExtTCPD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalExtTCPD, __dataOut);
    }
    if (null == this.fcurTotalTCPD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTCPD, __dataOut);
    }
    if (null == this.fcurTaxOnTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxOnTaxableIncome, __dataOut);
    }
    if (null == this.fcurResidualIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidualIncomeTax, __dataOut);
    }
    if (null == this.fcurTaxCalcResult) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCalcResult, __dataOut);
    }
    if (null == this.fcurImputationToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationToCarryForward, __dataOut);
    }
    if (null == this.fblnEarlyPymtDiscount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEarlyPymtDiscount);
    }
    if (null == this.fcurOverpaymentProvRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverpaymentProvRefund, __dataOut);
    }
    if (null == this.fcurRefundAndProvOverpayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundAndProvOverpayment, __dataOut);
    }
    if (null == this.fcurRefundCalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundCalc, __dataOut);
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
    if (null == this.fcurAllowableRLWTCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAllowableRLWTCredits, __dataOut);
    }
    if (null == this.fcurProvisionalTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionalTaxPaid, __dataOut);
    }
    if (null == this.fcurRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefund, __dataOut);
    }
    if (null == this.fblnDisclosureRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDisclosureRequired);
    }
    if (null == this.fstrPTSStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPTSStatus);
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
    if (null == this.fcurResDeductionsCarriedForwar) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsCarriedForwar, __dataOut);
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
    if (null == this.fcurShareholderAIMTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderAIMTaxPaid, __dataOut);
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
    if (null == this.fblnIR215Attached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIR215Attached);
    }
    if (null == this.fcurTotalFamilyTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalFamilyTaxCredit, __dataOut);
    }
    if (null == this.fcurTotalPAYEDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPAYEDeducted, __dataOut);
    }
    if (null == this.fcurTotalAdjPAYEDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAdjPAYEDeducted, __dataOut);
    }
    if (null == this.fcurTotalGrossIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossIncome, __dataOut);
    }
    if (null == this.fcurIncomeNotLiableForACC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeNotLiableForACC, __dataOut);
    }
    if (null == this.fcurACCEarnerLevy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurACCEarnerLevy, __dataOut);
    }
    if (null == this.fcurTotalIncomeWithTaxDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeWithTaxDeducted, __dataOut);
    }
    if (null == this.fcurTotalSchedularPymtTaxDed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSchedularPymtTaxDed, __dataOut);
    }
    if (null == this.fcurTotalGrossSchedularPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossSchedularPayment, __dataOut);
    }
    if (null == this.fcurExpensesSchedularPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExpensesSchedularPayments, __dataOut);
    }
    if (null == this.fcurNetSchedularPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetSchedularPayments, __dataOut);
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
    if (null == this.fblnIntPshpLTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIntPshpLTC);
    }
    if (null == this.fcurTotalImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalImputationCredits, __dataOut);
    }
    if (null == this.fcurTotalDividendRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDividendRWT, __dataOut);
    }
    if (null == this.fcurTotalGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrossDividends, __dataOut);
    }
    if (null == this.fblnDivPshpLTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDivPshpLTC);
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
    if (null == this.fcurTotalTaxPaidByTrustees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxPaidByTrustees, __dataOut);
    }
    if (null == this.fcurTotalEstateOrTrusteeIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalEstateOrTrusteeIncome, __dataOut);
    }
    if (null == this.fcurTotalTaxableDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxableDistributions, __dataOut);
    }
    if (null == this.fcurTotalOverseasTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOverseasTaxPaid, __dataOut);
    }
    if (null == this.fcurTotalOverseasIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOverseasIncome, __dataOut);
    }
    if (null == this.fblnOverseasSuper) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverseasSuper);
    }
    if (null == this.fcurTotalPartnershipTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPartnershipTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalActivePtshpIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalActivePtshpIncome, __dataOut);
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
    if (null == this.fcurNonAllowableDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonAllowableDeductions, __dataOut);
    }
    if (null == this.fcurNonAllowableDedClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonAllowableDedClaimed, __dataOut);
    }
    if (null == this.fcurAdjustedLTCIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedLTCIncome, __dataOut);
    }
    if (null == this.fcurTaxCreditSubtotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditSubtotal, __dataOut);
    }
    if (null == this.fcurIncomeSubtotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeSubtotal, __dataOut);
    }
    if (null == this.fcurShareholderEmployeeSalary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderEmployeeSalary, __dataOut);
    }
    if (null == this.fblnFutureShrSalary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFutureShrSalary);
    }
    if (null == this.fblnWithoutPayCloseCompany) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWithoutPayCloseCompany);
    }
    if (null == this.fcurNetRents) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetRents, __dataOut);
    }
    if (null == this.fcurSelfEmployedNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSelfEmployedNetIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherNetIncome, __dataOut);
    }
    if (null == this.fcurSaleOfProperty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSaleOfProperty, __dataOut);
    }
    if (null == this.fcurRLWTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWTCredit, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
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
    if (null == this.fcurAmountBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountBroughtForward, __dataOut);
    }
    if (null == this.fcurAmountClaimedThisYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountClaimedThisYear, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fblnEligibleForIETC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEligibleForIETC);
    }
    if (null == this.fdtmExOverseasIncomeStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExOverseasIncomeStart.getTime());
    __dataOut.writeInt(this.fdtmExOverseasIncomeStart.getNanos());
    }
    if (null == this.fdtmExcOverseasIncomeEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExcOverseasIncomeEnd.getTime());
    __dataOut.writeInt(this.fdtmExcOverseasIncomeEnd.getNanos());
    }
    if (null == this.fintExcOverseasMonths) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintExcOverseasMonths);
    }
    if (null == this.fcurIETC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIETC, __dataOut);
    }
    if (null == this.fcurAllowableImpCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAllowableImpCredits, __dataOut);
    }
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
    }
    if (null == this.fcurTotalExtTCPD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalExtTCPD, __dataOut);
    }
    if (null == this.fcurTotalTCPD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTCPD, __dataOut);
    }
    if (null == this.fcurTaxOnTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxOnTaxableIncome, __dataOut);
    }
    if (null == this.fcurResidualIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidualIncomeTax, __dataOut);
    }
    if (null == this.fcurTaxCalcResult) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCalcResult, __dataOut);
    }
    if (null == this.fcurImputationToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationToCarryForward, __dataOut);
    }
    if (null == this.fblnEarlyPymtDiscount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEarlyPymtDiscount);
    }
    if (null == this.fcurOverpaymentProvRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverpaymentProvRefund, __dataOut);
    }
    if (null == this.fcurRefundAndProvOverpayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundAndProvOverpayment, __dataOut);
    }
    if (null == this.fcurRefundCalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundCalc, __dataOut);
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
    if (null == this.fcurAllowableRLWTCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAllowableRLWTCredits, __dataOut);
    }
    if (null == this.fcurProvisionalTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionalTaxPaid, __dataOut);
    }
    if (null == this.fcurRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefund, __dataOut);
    }
    if (null == this.fblnDisclosureRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDisclosureRequired);
    }
    if (null == this.fstrPTSStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPTSStatus);
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
    if (null == this.fcurResDeductionsCarriedForwar) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductionsCarriedForwar, __dataOut);
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
    if (null == this.fcurShareholderAIMTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderAIMTaxPaid, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIR215Attached==null?"\\N":"" + fblnIR215Attached, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalFamilyTaxCredit==null?"\\N":fcurTotalFamilyTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPAYEDeducted==null?"\\N":fcurTotalPAYEDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAdjPAYEDeducted==null?"\\N":fcurTotalAdjPAYEDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossIncome==null?"\\N":fcurTotalGrossIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeNotLiableForACC==null?"\\N":fcurIncomeNotLiableForACC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurACCEarnerLevy==null?"\\N":fcurACCEarnerLevy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeWithTaxDeducted==null?"\\N":fcurTotalIncomeWithTaxDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSchedularPymtTaxDed==null?"\\N":fcurTotalSchedularPymtTaxDed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossSchedularPayment==null?"\\N":fcurTotalGrossSchedularPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExpensesSchedularPayments==null?"\\N":fcurExpensesSchedularPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetSchedularPayments==null?"\\N":fcurNetSchedularPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWT==null?"\\N":fcurTotalRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossInterest==null?"\\N":fcurTotalGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIntPshpLTC==null?"\\N":"" + fblnIntPshpLTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalImputationCredits==null?"\\N":fcurTotalImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDividendRWT==null?"\\N":fcurTotalDividendRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossDividends==null?"\\N":fcurTotalGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDivPshpLTC==null?"\\N":"" + fblnDivPshpLTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMaoriCredits==null?"\\N":fcurTotalMaoriCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMaoriDistributions==null?"\\N":fcurTotalMaoriDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxPaidByTrustees==null?"\\N":fcurTotalTaxPaidByTrustees.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalEstateOrTrusteeIncome==null?"\\N":fcurTotalEstateOrTrusteeIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxableDistributions==null?"\\N":fcurTotalTaxableDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOverseasTaxPaid==null?"\\N":fcurTotalOverseasTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOverseasIncome==null?"\\N":fcurTotalOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverseasSuper==null?"\\N":"" + fblnOverseasSuper, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPartnershipTaxCredits==null?"\\N":fcurTotalPartnershipTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalActivePtshpIncome==null?"\\N":fcurTotalActivePtshpIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLTCTaxCredits==null?"\\N":fcurTotalLTCTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalActiveLTCIncome==null?"\\N":fcurTotalActiveLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonAllowableDeductions==null?"\\N":fcurNonAllowableDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonAllowableDedClaimed==null?"\\N":fcurNonAllowableDedClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedLTCIncome==null?"\\N":fcurAdjustedLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditSubtotal==null?"\\N":fcurTaxCreditSubtotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeSubtotal==null?"\\N":fcurIncomeSubtotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderEmployeeSalary==null?"\\N":fcurShareholderEmployeeSalary.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFutureShrSalary==null?"\\N":"" + fblnFutureShrSalary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWithoutPayCloseCompany==null?"\\N":"" + fblnWithoutPayCloseCompany, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetRents==null?"\\N":fcurNetRents.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSelfEmployedNetIncome==null?"\\N":fcurSelfEmployedNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherNetIncome==null?"\\N":fcurTotalOtherNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSaleOfProperty==null?"\\N":fcurSaleOfProperty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWTCredit==null?"\\N":fcurRLWTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherExpenses==null?"\\N":fcurTotalOtherExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterExpenses==null?"\\N":fcurIncomeAfterExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountBroughtForward==null?"\\N":fcurAmountBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountClaimedThisYear==null?"\\N":fcurAmountClaimedThisYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEligibleForIETC==null?"\\N":"" + fblnEligibleForIETC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExOverseasIncomeStart==null?"\\N":"" + fdtmExOverseasIncomeStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExcOverseasIncomeEnd==null?"\\N":"" + fdtmExcOverseasIncomeEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintExcOverseasMonths==null?"\\N":"" + fintExcOverseasMonths, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIETC==null?"\\N":fcurIETC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAllowableImpCredits==null?"\\N":fcurAllowableImpCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalExtTCPD==null?"\\N":fcurTotalExtTCPD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTCPD==null?"\\N":fcurTotalTCPD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxOnTaxableIncome==null?"\\N":fcurTaxOnTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCalcResult==null?"\\N":fcurTaxCalcResult.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationToCarryForward==null?"\\N":fcurImputationToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEarlyPymtDiscount==null?"\\N":"" + fblnEarlyPymtDiscount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverpaymentProvRefund==null?"\\N":fcurOverpaymentProvRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundAndProvOverpayment==null?"\\N":fcurRefundAndProvOverpayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundCalc==null?"\\N":fcurRefundCalc.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTax==null?"\\N":fcurProvisionalTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAllowableRLWTCredits==null?"\\N":fcurAllowableRLWTCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTaxPaid==null?"\\N":fcurProvisionalTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefund==null?"\\N":fcurRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDisclosureRequired==null?"\\N":"" + fblnDisclosureRequired, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPTSStatus==null?"\\N":fstrPTSStatus, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsCarriedForwar==null?"\\N":fcurResDeductionsCarriedForwar.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardCurrentYear==null?"\\N":fcurRDICarryForwardCurrentYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderAIMTaxPaid==null?"\\N":fcurShareholderAIMTaxPaid.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIR215Attached==null?"\\N":"" + fblnIR215Attached, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalFamilyTaxCredit==null?"\\N":fcurTotalFamilyTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPAYEDeducted==null?"\\N":fcurTotalPAYEDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAdjPAYEDeducted==null?"\\N":fcurTotalAdjPAYEDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossIncome==null?"\\N":fcurTotalGrossIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeNotLiableForACC==null?"\\N":fcurIncomeNotLiableForACC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurACCEarnerLevy==null?"\\N":fcurACCEarnerLevy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeWithTaxDeducted==null?"\\N":fcurTotalIncomeWithTaxDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSchedularPymtTaxDed==null?"\\N":fcurTotalSchedularPymtTaxDed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossSchedularPayment==null?"\\N":fcurTotalGrossSchedularPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExpensesSchedularPayments==null?"\\N":fcurExpensesSchedularPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetSchedularPayments==null?"\\N":fcurNetSchedularPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWT==null?"\\N":fcurTotalRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossInterest==null?"\\N":fcurTotalGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIntPshpLTC==null?"\\N":"" + fblnIntPshpLTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalImputationCredits==null?"\\N":fcurTotalImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDividendRWT==null?"\\N":fcurTotalDividendRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrossDividends==null?"\\N":fcurTotalGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDivPshpLTC==null?"\\N":"" + fblnDivPshpLTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMaoriCredits==null?"\\N":fcurTotalMaoriCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMaoriDistributions==null?"\\N":fcurTotalMaoriDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxPaidByTrustees==null?"\\N":fcurTotalTaxPaidByTrustees.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalEstateOrTrusteeIncome==null?"\\N":fcurTotalEstateOrTrusteeIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxableDistributions==null?"\\N":fcurTotalTaxableDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOverseasTaxPaid==null?"\\N":fcurTotalOverseasTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOverseasIncome==null?"\\N":fcurTotalOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverseasSuper==null?"\\N":"" + fblnOverseasSuper, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPartnershipTaxCredits==null?"\\N":fcurTotalPartnershipTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalActivePtshpIncome==null?"\\N":fcurTotalActivePtshpIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLTCTaxCredits==null?"\\N":fcurTotalLTCTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalActiveLTCIncome==null?"\\N":fcurTotalActiveLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonAllowableDeductions==null?"\\N":fcurNonAllowableDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonAllowableDedClaimed==null?"\\N":fcurNonAllowableDedClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedLTCIncome==null?"\\N":fcurAdjustedLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditSubtotal==null?"\\N":fcurTaxCreditSubtotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeSubtotal==null?"\\N":fcurIncomeSubtotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderEmployeeSalary==null?"\\N":fcurShareholderEmployeeSalary.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFutureShrSalary==null?"\\N":"" + fblnFutureShrSalary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWithoutPayCloseCompany==null?"\\N":"" + fblnWithoutPayCloseCompany, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetRents==null?"\\N":fcurNetRents.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSelfEmployedNetIncome==null?"\\N":fcurSelfEmployedNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherNetIncome==null?"\\N":fcurTotalOtherNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSaleOfProperty==null?"\\N":fcurSaleOfProperty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWTCredit==null?"\\N":fcurRLWTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherExpenses==null?"\\N":fcurTotalOtherExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterExpenses==null?"\\N":fcurIncomeAfterExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountBroughtForward==null?"\\N":fcurAmountBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountClaimedThisYear==null?"\\N":fcurAmountClaimedThisYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEligibleForIETC==null?"\\N":"" + fblnEligibleForIETC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExOverseasIncomeStart==null?"\\N":"" + fdtmExOverseasIncomeStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExcOverseasIncomeEnd==null?"\\N":"" + fdtmExcOverseasIncomeEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintExcOverseasMonths==null?"\\N":"" + fintExcOverseasMonths, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIETC==null?"\\N":fcurIETC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAllowableImpCredits==null?"\\N":fcurAllowableImpCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalExtTCPD==null?"\\N":fcurTotalExtTCPD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTCPD==null?"\\N":fcurTotalTCPD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxOnTaxableIncome==null?"\\N":fcurTaxOnTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCalcResult==null?"\\N":fcurTaxCalcResult.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationToCarryForward==null?"\\N":fcurImputationToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEarlyPymtDiscount==null?"\\N":"" + fblnEarlyPymtDiscount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverpaymentProvRefund==null?"\\N":fcurOverpaymentProvRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundAndProvOverpayment==null?"\\N":fcurRefundAndProvOverpayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundCalc==null?"\\N":fcurRefundCalc.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTax==null?"\\N":fcurProvisionalTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAllowableRLWTCredits==null?"\\N":fcurAllowableRLWTCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTaxPaid==null?"\\N":fcurProvisionalTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefund==null?"\\N":fcurRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDisclosureRequired==null?"\\N":"" + fblnDisclosureRequired, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPTSStatus==null?"\\N":fstrPTSStatus, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductionsCarriedForwar==null?"\\N":fcurResDeductionsCarriedForwar.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardCurrentYear==null?"\\N":fcurRDICarryForwardCurrentYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderAIMTaxPaid==null?"\\N":fcurShareholderAIMTaxPaid.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIR215Attached = null; } else {
      this.fblnIR215Attached = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalFamilyTaxCredit = null; } else {
      this.fcurTotalFamilyTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPAYEDeducted = null; } else {
      this.fcurTotalPAYEDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAdjPAYEDeducted = null; } else {
      this.fcurTotalAdjPAYEDeducted = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeNotLiableForACC = null; } else {
      this.fcurIncomeNotLiableForACC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurACCEarnerLevy = null; } else {
      this.fcurACCEarnerLevy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeWithTaxDeducted = null; } else {
      this.fcurTotalIncomeWithTaxDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSchedularPymtTaxDed = null; } else {
      this.fcurTotalSchedularPymtTaxDed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossSchedularPayment = null; } else {
      this.fcurTotalGrossSchedularPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExpensesSchedularPayments = null; } else {
      this.fcurExpensesSchedularPayments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetSchedularPayments = null; } else {
      this.fcurNetSchedularPayments = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIntPshpLTC = null; } else {
      this.fblnIntPshpLTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalImputationCredits = null; } else {
      this.fcurTotalImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDividendRWT = null; } else {
      this.fcurTotalDividendRWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDivPshpLTC = null; } else {
      this.fblnDivPshpLTC = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxPaidByTrustees = null; } else {
      this.fcurTotalTaxPaidByTrustees = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalEstateOrTrusteeIncome = null; } else {
      this.fcurTotalEstateOrTrusteeIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxableDistributions = null; } else {
      this.fcurTotalTaxableDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOverseasTaxPaid = null; } else {
      this.fcurTotalOverseasTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOverseasIncome = null; } else {
      this.fcurTotalOverseasIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverseasSuper = null; } else {
      this.fblnOverseasSuper = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalActivePtshpIncome = null; } else {
      this.fcurTotalActivePtshpIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonAllowableDeductions = null; } else {
      this.fcurNonAllowableDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonAllowableDedClaimed = null; } else {
      this.fcurNonAllowableDedClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditSubtotal = null; } else {
      this.fcurTaxCreditSubtotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeSubtotal = null; } else {
      this.fcurIncomeSubtotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderEmployeeSalary = null; } else {
      this.fcurShareholderEmployeeSalary = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFutureShrSalary = null; } else {
      this.fblnFutureShrSalary = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWithoutPayCloseCompany = null; } else {
      this.fblnWithoutPayCloseCompany = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSelfEmployedNetIncome = null; } else {
      this.fcurSelfEmployedNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherNetIncome = null; } else {
      this.fcurTotalOtherNetIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWTCredit = null; } else {
      this.fcurRLWTCredit = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountBroughtForward = null; } else {
      this.fcurAmountBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountClaimedThisYear = null; } else {
      this.fcurAmountClaimedThisYear = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEligibleForIETC = null; } else {
      this.fblnEligibleForIETC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExOverseasIncomeStart = null; } else {
      this.fdtmExOverseasIncomeStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExcOverseasIncomeEnd = null; } else {
      this.fdtmExcOverseasIncomeEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintExcOverseasMonths = null; } else {
      this.fintExcOverseasMonths = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIETC = null; } else {
      this.fcurIETC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAllowableImpCredits = null; } else {
      this.fcurAllowableImpCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalExtTCPD = null; } else {
      this.fcurTotalExtTCPD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTCPD = null; } else {
      this.fcurTotalTCPD = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResidualIncomeTax = null; } else {
      this.fcurResidualIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCalcResult = null; } else {
      this.fcurTaxCalcResult = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEarlyPymtDiscount = null; } else {
      this.fblnEarlyPymtDiscount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverpaymentProvRefund = null; } else {
      this.fcurOverpaymentProvRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundAndProvOverpayment = null; } else {
      this.fcurRefundAndProvOverpayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundCalc = null; } else {
      this.fcurRefundCalc = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAllowableRLWTCredits = null; } else {
      this.fcurAllowableRLWTCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefund = null; } else {
      this.fcurRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDisclosureRequired = null; } else {
      this.fblnDisclosureRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPTSStatus = null; } else {
      this.fstrPTSStatus = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsCarriedForwar = null; } else {
      this.fcurResDeductionsCarriedForwar = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderAIMTaxPaid = null; } else {
      this.fcurShareholderAIMTaxPaid = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIR215Attached = null; } else {
      this.fblnIR215Attached = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalFamilyTaxCredit = null; } else {
      this.fcurTotalFamilyTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPAYEDeducted = null; } else {
      this.fcurTotalPAYEDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAdjPAYEDeducted = null; } else {
      this.fcurTotalAdjPAYEDeducted = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeNotLiableForACC = null; } else {
      this.fcurIncomeNotLiableForACC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurACCEarnerLevy = null; } else {
      this.fcurACCEarnerLevy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeWithTaxDeducted = null; } else {
      this.fcurTotalIncomeWithTaxDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSchedularPymtTaxDed = null; } else {
      this.fcurTotalSchedularPymtTaxDed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrossSchedularPayment = null; } else {
      this.fcurTotalGrossSchedularPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExpensesSchedularPayments = null; } else {
      this.fcurExpensesSchedularPayments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetSchedularPayments = null; } else {
      this.fcurNetSchedularPayments = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIntPshpLTC = null; } else {
      this.fblnIntPshpLTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalImputationCredits = null; } else {
      this.fcurTotalImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDividendRWT = null; } else {
      this.fcurTotalDividendRWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDivPshpLTC = null; } else {
      this.fblnDivPshpLTC = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxPaidByTrustees = null; } else {
      this.fcurTotalTaxPaidByTrustees = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalEstateOrTrusteeIncome = null; } else {
      this.fcurTotalEstateOrTrusteeIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxableDistributions = null; } else {
      this.fcurTotalTaxableDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOverseasTaxPaid = null; } else {
      this.fcurTotalOverseasTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOverseasIncome = null; } else {
      this.fcurTotalOverseasIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverseasSuper = null; } else {
      this.fblnOverseasSuper = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalActivePtshpIncome = null; } else {
      this.fcurTotalActivePtshpIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonAllowableDeductions = null; } else {
      this.fcurNonAllowableDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonAllowableDedClaimed = null; } else {
      this.fcurNonAllowableDedClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditSubtotal = null; } else {
      this.fcurTaxCreditSubtotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeSubtotal = null; } else {
      this.fcurIncomeSubtotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderEmployeeSalary = null; } else {
      this.fcurShareholderEmployeeSalary = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFutureShrSalary = null; } else {
      this.fblnFutureShrSalary = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWithoutPayCloseCompany = null; } else {
      this.fblnWithoutPayCloseCompany = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSelfEmployedNetIncome = null; } else {
      this.fcurSelfEmployedNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherNetIncome = null; } else {
      this.fcurTotalOtherNetIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWTCredit = null; } else {
      this.fcurRLWTCredit = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountBroughtForward = null; } else {
      this.fcurAmountBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountClaimedThisYear = null; } else {
      this.fcurAmountClaimedThisYear = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEligibleForIETC = null; } else {
      this.fblnEligibleForIETC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExOverseasIncomeStart = null; } else {
      this.fdtmExOverseasIncomeStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExcOverseasIncomeEnd = null; } else {
      this.fdtmExcOverseasIncomeEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintExcOverseasMonths = null; } else {
      this.fintExcOverseasMonths = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIETC = null; } else {
      this.fcurIETC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAllowableImpCredits = null; } else {
      this.fcurAllowableImpCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalExtTCPD = null; } else {
      this.fcurTotalExtTCPD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTCPD = null; } else {
      this.fcurTotalTCPD = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResidualIncomeTax = null; } else {
      this.fcurResidualIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCalcResult = null; } else {
      this.fcurTaxCalcResult = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEarlyPymtDiscount = null; } else {
      this.fblnEarlyPymtDiscount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverpaymentProvRefund = null; } else {
      this.fcurOverpaymentProvRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundAndProvOverpayment = null; } else {
      this.fcurRefundAndProvOverpayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundCalc = null; } else {
      this.fcurRefundCalc = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAllowableRLWTCredits = null; } else {
      this.fcurAllowableRLWTCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefund = null; } else {
      this.fcurRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDisclosureRequired = null; } else {
      this.fblnDisclosureRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPTSStatus = null; } else {
      this.fstrPTSStatus = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductionsCarriedForwar = null; } else {
      this.fcurResDeductionsCarriedForwar = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderAIMTaxPaid = null; } else {
      this.fcurShareholderAIMTaxPaid = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtniit o = (tblnz_rtniit) super.clone();
    o.fdtmExOverseasIncomeStart = (o.fdtmExOverseasIncomeStart != null) ? (java.sql.Timestamp) o.fdtmExOverseasIncomeStart.clone() : null;
    o.fdtmExcOverseasIncomeEnd = (o.fdtmExcOverseasIncomeEnd != null) ? (java.sql.Timestamp) o.fdtmExcOverseasIncomeEnd.clone() : null;
    o.fdtmSelectDate = (o.fdtmSelectDate != null) ? (java.sql.Timestamp) o.fdtmSelectDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtniit o) throws CloneNotSupportedException {
    o.fdtmExOverseasIncomeStart = (o.fdtmExOverseasIncomeStart != null) ? (java.sql.Timestamp) o.fdtmExOverseasIncomeStart.clone() : null;
    o.fdtmExcOverseasIncomeEnd = (o.fdtmExcOverseasIncomeEnd != null) ? (java.sql.Timestamp) o.fdtmExcOverseasIncomeEnd.clone() : null;
    o.fdtmSelectDate = (o.fdtmSelectDate != null) ? (java.sql.Timestamp) o.fdtmSelectDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnIR215Attached", this.fblnIR215Attached);
    __sqoop$field_map.put("fcurTotalFamilyTaxCredit", this.fcurTotalFamilyTaxCredit);
    __sqoop$field_map.put("fcurTotalPAYEDeducted", this.fcurTotalPAYEDeducted);
    __sqoop$field_map.put("fcurTotalAdjPAYEDeducted", this.fcurTotalAdjPAYEDeducted);
    __sqoop$field_map.put("fcurTotalGrossIncome", this.fcurTotalGrossIncome);
    __sqoop$field_map.put("fcurIncomeNotLiableForACC", this.fcurIncomeNotLiableForACC);
    __sqoop$field_map.put("fcurACCEarnerLevy", this.fcurACCEarnerLevy);
    __sqoop$field_map.put("fcurTotalIncomeWithTaxDeducted", this.fcurTotalIncomeWithTaxDeducted);
    __sqoop$field_map.put("fcurTotalSchedularPymtTaxDed", this.fcurTotalSchedularPymtTaxDed);
    __sqoop$field_map.put("fcurTotalGrossSchedularPayment", this.fcurTotalGrossSchedularPayment);
    __sqoop$field_map.put("fcurExpensesSchedularPayments", this.fcurExpensesSchedularPayments);
    __sqoop$field_map.put("fcurNetSchedularPayments", this.fcurNetSchedularPayments);
    __sqoop$field_map.put("fcurTotalRWT", this.fcurTotalRWT);
    __sqoop$field_map.put("fcurTotalGrossInterest", this.fcurTotalGrossInterest);
    __sqoop$field_map.put("fblnIntPshpLTC", this.fblnIntPshpLTC);
    __sqoop$field_map.put("fcurTotalImputationCredits", this.fcurTotalImputationCredits);
    __sqoop$field_map.put("fcurTotalDividendRWT", this.fcurTotalDividendRWT);
    __sqoop$field_map.put("fcurTotalGrossDividends", this.fcurTotalGrossDividends);
    __sqoop$field_map.put("fblnDivPshpLTC", this.fblnDivPshpLTC);
    __sqoop$field_map.put("fcurTotalMaoriCredits", this.fcurTotalMaoriCredits);
    __sqoop$field_map.put("fcurTotalMaoriDistributions", this.fcurTotalMaoriDistributions);
    __sqoop$field_map.put("fcurTotalTaxPaidByTrustees", this.fcurTotalTaxPaidByTrustees);
    __sqoop$field_map.put("fcurTotalEstateOrTrusteeIncome", this.fcurTotalEstateOrTrusteeIncome);
    __sqoop$field_map.put("fcurTotalTaxableDistributions", this.fcurTotalTaxableDistributions);
    __sqoop$field_map.put("fcurTotalOverseasTaxPaid", this.fcurTotalOverseasTaxPaid);
    __sqoop$field_map.put("fcurTotalOverseasIncome", this.fcurTotalOverseasIncome);
    __sqoop$field_map.put("fblnOverseasSuper", this.fblnOverseasSuper);
    __sqoop$field_map.put("fcurTotalPartnershipTaxCredits", this.fcurTotalPartnershipTaxCredits);
    __sqoop$field_map.put("fcurTotalActivePtshpIncome", this.fcurTotalActivePtshpIncome);
    __sqoop$field_map.put("fcurTotalLTCTaxCredits", this.fcurTotalLTCTaxCredits);
    __sqoop$field_map.put("fcurTotalActiveLTCIncome", this.fcurTotalActiveLTCIncome);
    __sqoop$field_map.put("fcurNonAllowableDeductions", this.fcurNonAllowableDeductions);
    __sqoop$field_map.put("fcurNonAllowableDedClaimed", this.fcurNonAllowableDedClaimed);
    __sqoop$field_map.put("fcurAdjustedLTCIncome", this.fcurAdjustedLTCIncome);
    __sqoop$field_map.put("fcurTaxCreditSubtotal", this.fcurTaxCreditSubtotal);
    __sqoop$field_map.put("fcurIncomeSubtotal", this.fcurIncomeSubtotal);
    __sqoop$field_map.put("fcurShareholderEmployeeSalary", this.fcurShareholderEmployeeSalary);
    __sqoop$field_map.put("fblnFutureShrSalary", this.fblnFutureShrSalary);
    __sqoop$field_map.put("fblnWithoutPayCloseCompany", this.fblnWithoutPayCloseCompany);
    __sqoop$field_map.put("fcurNetRents", this.fcurNetRents);
    __sqoop$field_map.put("fcurSelfEmployedNetIncome", this.fcurSelfEmployedNetIncome);
    __sqoop$field_map.put("fcurTotalOtherNetIncome", this.fcurTotalOtherNetIncome);
    __sqoop$field_map.put("fcurSaleOfProperty", this.fcurSaleOfProperty);
    __sqoop$field_map.put("fcurRLWTCredit", this.fcurRLWTCredit);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurTotalOtherExpenses", this.fcurTotalOtherExpenses);
    __sqoop$field_map.put("fcurIncomeAfterExpenses", this.fcurIncomeAfterExpenses);
    __sqoop$field_map.put("fcurAmountBroughtForward", this.fcurAmountBroughtForward);
    __sqoop$field_map.put("fcurAmountClaimedThisYear", this.fcurAmountClaimedThisYear);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fblnEligibleForIETC", this.fblnEligibleForIETC);
    __sqoop$field_map.put("fdtmExOverseasIncomeStart", this.fdtmExOverseasIncomeStart);
    __sqoop$field_map.put("fdtmExcOverseasIncomeEnd", this.fdtmExcOverseasIncomeEnd);
    __sqoop$field_map.put("fintExcOverseasMonths", this.fintExcOverseasMonths);
    __sqoop$field_map.put("fcurIETC", this.fcurIETC);
    __sqoop$field_map.put("fcurAllowableImpCredits", this.fcurAllowableImpCredits);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurTotalExtTCPD", this.fcurTotalExtTCPD);
    __sqoop$field_map.put("fcurTotalTCPD", this.fcurTotalTCPD);
    __sqoop$field_map.put("fcurTaxOnTaxableIncome", this.fcurTaxOnTaxableIncome);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurTaxCalcResult", this.fcurTaxCalcResult);
    __sqoop$field_map.put("fcurImputationToCarryForward", this.fcurImputationToCarryForward);
    __sqoop$field_map.put("fblnEarlyPymtDiscount", this.fblnEarlyPymtDiscount);
    __sqoop$field_map.put("fcurOverpaymentProvRefund", this.fcurOverpaymentProvRefund);
    __sqoop$field_map.put("fcurRefundAndProvOverpayment", this.fcurRefundAndProvOverpayment);
    __sqoop$field_map.put("fcurRefundCalc", this.fcurRefundCalc);
    __sqoop$field_map.put("fcurProvisionalTax", this.fcurProvisionalTax);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fcurAllowableRLWTCredits", this.fcurAllowableRLWTCredits);
    __sqoop$field_map.put("fcurProvisionalTaxPaid", this.fcurProvisionalTaxPaid);
    __sqoop$field_map.put("fcurRefund", this.fcurRefund);
    __sqoop$field_map.put("fblnDisclosureRequired", this.fblnDisclosureRequired);
    __sqoop$field_map.put("fstrPTSStatus", this.fstrPTSStatus);
    __sqoop$field_map.put("flngSelectGroup", this.flngSelectGroup);
    __sqoop$field_map.put("fdtmSelectDate", this.fdtmSelectDate);
    __sqoop$field_map.put("fblnGroup2Suspend", this.fblnGroup2Suspend);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurResDeductionsCarriedForwar", this.fcurResDeductionsCarriedForwar);
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurShareholderAIMTaxPaid", this.fcurShareholderAIMTaxPaid);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnIR215Attached", this.fblnIR215Attached);
    __sqoop$field_map.put("fcurTotalFamilyTaxCredit", this.fcurTotalFamilyTaxCredit);
    __sqoop$field_map.put("fcurTotalPAYEDeducted", this.fcurTotalPAYEDeducted);
    __sqoop$field_map.put("fcurTotalAdjPAYEDeducted", this.fcurTotalAdjPAYEDeducted);
    __sqoop$field_map.put("fcurTotalGrossIncome", this.fcurTotalGrossIncome);
    __sqoop$field_map.put("fcurIncomeNotLiableForACC", this.fcurIncomeNotLiableForACC);
    __sqoop$field_map.put("fcurACCEarnerLevy", this.fcurACCEarnerLevy);
    __sqoop$field_map.put("fcurTotalIncomeWithTaxDeducted", this.fcurTotalIncomeWithTaxDeducted);
    __sqoop$field_map.put("fcurTotalSchedularPymtTaxDed", this.fcurTotalSchedularPymtTaxDed);
    __sqoop$field_map.put("fcurTotalGrossSchedularPayment", this.fcurTotalGrossSchedularPayment);
    __sqoop$field_map.put("fcurExpensesSchedularPayments", this.fcurExpensesSchedularPayments);
    __sqoop$field_map.put("fcurNetSchedularPayments", this.fcurNetSchedularPayments);
    __sqoop$field_map.put("fcurTotalRWT", this.fcurTotalRWT);
    __sqoop$field_map.put("fcurTotalGrossInterest", this.fcurTotalGrossInterest);
    __sqoop$field_map.put("fblnIntPshpLTC", this.fblnIntPshpLTC);
    __sqoop$field_map.put("fcurTotalImputationCredits", this.fcurTotalImputationCredits);
    __sqoop$field_map.put("fcurTotalDividendRWT", this.fcurTotalDividendRWT);
    __sqoop$field_map.put("fcurTotalGrossDividends", this.fcurTotalGrossDividends);
    __sqoop$field_map.put("fblnDivPshpLTC", this.fblnDivPshpLTC);
    __sqoop$field_map.put("fcurTotalMaoriCredits", this.fcurTotalMaoriCredits);
    __sqoop$field_map.put("fcurTotalMaoriDistributions", this.fcurTotalMaoriDistributions);
    __sqoop$field_map.put("fcurTotalTaxPaidByTrustees", this.fcurTotalTaxPaidByTrustees);
    __sqoop$field_map.put("fcurTotalEstateOrTrusteeIncome", this.fcurTotalEstateOrTrusteeIncome);
    __sqoop$field_map.put("fcurTotalTaxableDistributions", this.fcurTotalTaxableDistributions);
    __sqoop$field_map.put("fcurTotalOverseasTaxPaid", this.fcurTotalOverseasTaxPaid);
    __sqoop$field_map.put("fcurTotalOverseasIncome", this.fcurTotalOverseasIncome);
    __sqoop$field_map.put("fblnOverseasSuper", this.fblnOverseasSuper);
    __sqoop$field_map.put("fcurTotalPartnershipTaxCredits", this.fcurTotalPartnershipTaxCredits);
    __sqoop$field_map.put("fcurTotalActivePtshpIncome", this.fcurTotalActivePtshpIncome);
    __sqoop$field_map.put("fcurTotalLTCTaxCredits", this.fcurTotalLTCTaxCredits);
    __sqoop$field_map.put("fcurTotalActiveLTCIncome", this.fcurTotalActiveLTCIncome);
    __sqoop$field_map.put("fcurNonAllowableDeductions", this.fcurNonAllowableDeductions);
    __sqoop$field_map.put("fcurNonAllowableDedClaimed", this.fcurNonAllowableDedClaimed);
    __sqoop$field_map.put("fcurAdjustedLTCIncome", this.fcurAdjustedLTCIncome);
    __sqoop$field_map.put("fcurTaxCreditSubtotal", this.fcurTaxCreditSubtotal);
    __sqoop$field_map.put("fcurIncomeSubtotal", this.fcurIncomeSubtotal);
    __sqoop$field_map.put("fcurShareholderEmployeeSalary", this.fcurShareholderEmployeeSalary);
    __sqoop$field_map.put("fblnFutureShrSalary", this.fblnFutureShrSalary);
    __sqoop$field_map.put("fblnWithoutPayCloseCompany", this.fblnWithoutPayCloseCompany);
    __sqoop$field_map.put("fcurNetRents", this.fcurNetRents);
    __sqoop$field_map.put("fcurSelfEmployedNetIncome", this.fcurSelfEmployedNetIncome);
    __sqoop$field_map.put("fcurTotalOtherNetIncome", this.fcurTotalOtherNetIncome);
    __sqoop$field_map.put("fcurSaleOfProperty", this.fcurSaleOfProperty);
    __sqoop$field_map.put("fcurRLWTCredit", this.fcurRLWTCredit);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurTotalOtherExpenses", this.fcurTotalOtherExpenses);
    __sqoop$field_map.put("fcurIncomeAfterExpenses", this.fcurIncomeAfterExpenses);
    __sqoop$field_map.put("fcurAmountBroughtForward", this.fcurAmountBroughtForward);
    __sqoop$field_map.put("fcurAmountClaimedThisYear", this.fcurAmountClaimedThisYear);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fblnEligibleForIETC", this.fblnEligibleForIETC);
    __sqoop$field_map.put("fdtmExOverseasIncomeStart", this.fdtmExOverseasIncomeStart);
    __sqoop$field_map.put("fdtmExcOverseasIncomeEnd", this.fdtmExcOverseasIncomeEnd);
    __sqoop$field_map.put("fintExcOverseasMonths", this.fintExcOverseasMonths);
    __sqoop$field_map.put("fcurIETC", this.fcurIETC);
    __sqoop$field_map.put("fcurAllowableImpCredits", this.fcurAllowableImpCredits);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurTotalExtTCPD", this.fcurTotalExtTCPD);
    __sqoop$field_map.put("fcurTotalTCPD", this.fcurTotalTCPD);
    __sqoop$field_map.put("fcurTaxOnTaxableIncome", this.fcurTaxOnTaxableIncome);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurTaxCalcResult", this.fcurTaxCalcResult);
    __sqoop$field_map.put("fcurImputationToCarryForward", this.fcurImputationToCarryForward);
    __sqoop$field_map.put("fblnEarlyPymtDiscount", this.fblnEarlyPymtDiscount);
    __sqoop$field_map.put("fcurOverpaymentProvRefund", this.fcurOverpaymentProvRefund);
    __sqoop$field_map.put("fcurRefundAndProvOverpayment", this.fcurRefundAndProvOverpayment);
    __sqoop$field_map.put("fcurRefundCalc", this.fcurRefundCalc);
    __sqoop$field_map.put("fcurProvisionalTax", this.fcurProvisionalTax);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fcurAllowableRLWTCredits", this.fcurAllowableRLWTCredits);
    __sqoop$field_map.put("fcurProvisionalTaxPaid", this.fcurProvisionalTaxPaid);
    __sqoop$field_map.put("fcurRefund", this.fcurRefund);
    __sqoop$field_map.put("fblnDisclosureRequired", this.fblnDisclosureRequired);
    __sqoop$field_map.put("fstrPTSStatus", this.fstrPTSStatus);
    __sqoop$field_map.put("flngSelectGroup", this.flngSelectGroup);
    __sqoop$field_map.put("fdtmSelectDate", this.fdtmSelectDate);
    __sqoop$field_map.put("fblnGroup2Suspend", this.fblnGroup2Suspend);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurResDeductionsCarriedForwar", this.fcurResDeductionsCarriedForwar);
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurShareholderAIMTaxPaid", this.fcurShareholderAIMTaxPaid);
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
