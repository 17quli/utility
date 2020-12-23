// ORM class for table 'tblnz_rtnnit'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:36:28 NZDT 2020
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

public class tblnz_rtnnit extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurTaxDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTaxDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurGrossIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurGrossInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurDividendImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurDividendRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurDividendGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMaoriCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurMaoriCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMaoriDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurMaoriDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTrustCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTrustCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTrustIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTrustIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTotalCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurOverseasTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurOverseasIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBusinessActivities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurBusinessActivities = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPremiumPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurPremiumPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPremiumPaidSwitzerland", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurPremiumPaidSwitzerland = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPremium", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTotalPremium = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRLWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRLWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncomePreDonations", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTotalIncomePreDonations = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDonationsMade", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurDonationsMade = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLossBroughtForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurNetLossBroughtForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLossClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurNetLossClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncomeAfterNetLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTotalIncomeAfterNetLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLossToCompanies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurNetLossToCompanies = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSubventionsToCompanies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurSubventionsToCompanies = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTotalTaxPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfterOverseas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTaxAfterOverseas = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurForeignInvestorTaxCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurForeignInvestorTaxCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfterForeignInvestor", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTaxAfterForeignInvestor = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfterImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTaxAfterImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurExcessImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResidualIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurResidualIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionalTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurProvisionalTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTaxAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnRADFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fblnRADFiled = (Integer)value;
      }
    });
    setters.put("fcurRADAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRADAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRADRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRADRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRADLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRADLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRADTaxAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRADTaxAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRADRepaymentTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRADRepaymentTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTransferProvisional = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferCustomerAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTransferCustomerAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurTotalRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmProvisionalStartDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fdtmProvisionalStartDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrProvisionalOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fstrProvisionalOption = (String)value;
      }
    });
    setters.put("fcurProvisionalTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurProvisionalTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnNonresidentPayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fblnNonresidentPayments = (Integer)value;
      }
    });
    setters.put("fblnNonresidentWithholding", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fblnNonresidentWithholding = (Integer)value;
      }
    });
    setters.put("fblnCFC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fblnCFC = (Integer)value;
      }
    });
    setters.put("fcurSharesRepurchased", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurSharesRepurchased = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnForeignDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fblnForeignDividends = (Integer)value;
      }
    });
    setters.put("fblnNonresidentControlled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fblnNonresidentControlled = (Integer)value;
      }
    });
    setters.put("fblnNonResident", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fblnNonResident = (Integer)value;
      }
    });
    setters.put("fcurLowestEconomicInterests", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurLowestEconomicInterests = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurLossToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnLineItemsProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fblnLineItemsProcessed = (Integer)value;
      }
    });
    setters.put("fstrResMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fstrResMethod = (String)value;
      }
    });
    setters.put("fcurResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsPriorYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurResDeductionsPriorYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurResDeductionsClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurResNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurResDeductionsForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardCurrentYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRDICarryForwardCurrentYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDIRefundableCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRDIRefundableCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardRemaining", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurRDICarryForwardRemaining = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAIMShareholderTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurAIMShareholderTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSaleOfProperty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fcurSaleOfProperty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnit.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnnit() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnnit with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurTaxDeducted;
  public java.math.BigDecimal get_fcurTaxDeducted() {
    return fcurTaxDeducted;
  }
  public void set_fcurTaxDeducted(java.math.BigDecimal fcurTaxDeducted) {
    this.fcurTaxDeducted = fcurTaxDeducted;
  }
  public tblnz_rtnnit with_fcurTaxDeducted(java.math.BigDecimal fcurTaxDeducted) {
    this.fcurTaxDeducted = fcurTaxDeducted;
    return this;
  }
  private java.math.BigDecimal fcurGrossIncome;
  public java.math.BigDecimal get_fcurGrossIncome() {
    return fcurGrossIncome;
  }
  public void set_fcurGrossIncome(java.math.BigDecimal fcurGrossIncome) {
    this.fcurGrossIncome = fcurGrossIncome;
  }
  public tblnz_rtnnit with_fcurGrossIncome(java.math.BigDecimal fcurGrossIncome) {
    this.fcurGrossIncome = fcurGrossIncome;
    return this;
  }
  private java.math.BigDecimal fcurRWT;
  public java.math.BigDecimal get_fcurRWT() {
    return fcurRWT;
  }
  public void set_fcurRWT(java.math.BigDecimal fcurRWT) {
    this.fcurRWT = fcurRWT;
  }
  public tblnz_rtnnit with_fcurRWT(java.math.BigDecimal fcurRWT) {
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
  public tblnz_rtnnit with_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
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
  public tblnz_rtnnit with_fcurDividendImputation(java.math.BigDecimal fcurDividendImputation) {
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
  public tblnz_rtnnit with_fcurDividendRWT(java.math.BigDecimal fcurDividendRWT) {
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
  public tblnz_rtnnit with_fcurDividendGross(java.math.BigDecimal fcurDividendGross) {
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
  public tblnz_rtnnit with_fcurMaoriCredits(java.math.BigDecimal fcurMaoriCredits) {
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
  public tblnz_rtnnit with_fcurMaoriDistributions(java.math.BigDecimal fcurMaoriDistributions) {
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
  public tblnz_rtnnit with_fcurTrustCredits(java.math.BigDecimal fcurTrustCredits) {
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
  public tblnz_rtnnit with_fcurTrustIncome(java.math.BigDecimal fcurTrustIncome) {
    this.fcurTrustIncome = fcurTrustIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalCredits;
  public java.math.BigDecimal get_fcurTotalCredits() {
    return fcurTotalCredits;
  }
  public void set_fcurTotalCredits(java.math.BigDecimal fcurTotalCredits) {
    this.fcurTotalCredits = fcurTotalCredits;
  }
  public tblnz_rtnnit with_fcurTotalCredits(java.math.BigDecimal fcurTotalCredits) {
    this.fcurTotalCredits = fcurTotalCredits;
    return this;
  }
  private java.math.BigDecimal fcurOverseasTax;
  public java.math.BigDecimal get_fcurOverseasTax() {
    return fcurOverseasTax;
  }
  public void set_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
    this.fcurOverseasTax = fcurOverseasTax;
  }
  public tblnz_rtnnit with_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
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
  public tblnz_rtnnit with_fcurOverseasIncome(java.math.BigDecimal fcurOverseasIncome) {
    this.fcurOverseasIncome = fcurOverseasIncome;
    return this;
  }
  private java.math.BigDecimal fcurBusinessActivities;
  public java.math.BigDecimal get_fcurBusinessActivities() {
    return fcurBusinessActivities;
  }
  public void set_fcurBusinessActivities(java.math.BigDecimal fcurBusinessActivities) {
    this.fcurBusinessActivities = fcurBusinessActivities;
  }
  public tblnz_rtnnit with_fcurBusinessActivities(java.math.BigDecimal fcurBusinessActivities) {
    this.fcurBusinessActivities = fcurBusinessActivities;
    return this;
  }
  private java.math.BigDecimal fcurPremiumPaid;
  public java.math.BigDecimal get_fcurPremiumPaid() {
    return fcurPremiumPaid;
  }
  public void set_fcurPremiumPaid(java.math.BigDecimal fcurPremiumPaid) {
    this.fcurPremiumPaid = fcurPremiumPaid;
  }
  public tblnz_rtnnit with_fcurPremiumPaid(java.math.BigDecimal fcurPremiumPaid) {
    this.fcurPremiumPaid = fcurPremiumPaid;
    return this;
  }
  private java.math.BigDecimal fcurPremiumPaidSwitzerland;
  public java.math.BigDecimal get_fcurPremiumPaidSwitzerland() {
    return fcurPremiumPaidSwitzerland;
  }
  public void set_fcurPremiumPaidSwitzerland(java.math.BigDecimal fcurPremiumPaidSwitzerland) {
    this.fcurPremiumPaidSwitzerland = fcurPremiumPaidSwitzerland;
  }
  public tblnz_rtnnit with_fcurPremiumPaidSwitzerland(java.math.BigDecimal fcurPremiumPaidSwitzerland) {
    this.fcurPremiumPaidSwitzerland = fcurPremiumPaidSwitzerland;
    return this;
  }
  private java.math.BigDecimal fcurTotalPremium;
  public java.math.BigDecimal get_fcurTotalPremium() {
    return fcurTotalPremium;
  }
  public void set_fcurTotalPremium(java.math.BigDecimal fcurTotalPremium) {
    this.fcurTotalPremium = fcurTotalPremium;
  }
  public tblnz_rtnnit with_fcurTotalPremium(java.math.BigDecimal fcurTotalPremium) {
    this.fcurTotalPremium = fcurTotalPremium;
    return this;
  }
  private java.math.BigDecimal fcurOtherIncome;
  public java.math.BigDecimal get_fcurOtherIncome() {
    return fcurOtherIncome;
  }
  public void set_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
  }
  public tblnz_rtnnit with_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurRLWT;
  public java.math.BigDecimal get_fcurRLWT() {
    return fcurRLWT;
  }
  public void set_fcurRLWT(java.math.BigDecimal fcurRLWT) {
    this.fcurRLWT = fcurRLWT;
  }
  public tblnz_rtnnit with_fcurRLWT(java.math.BigDecimal fcurRLWT) {
    this.fcurRLWT = fcurRLWT;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncomePreDonations;
  public java.math.BigDecimal get_fcurTotalIncomePreDonations() {
    return fcurTotalIncomePreDonations;
  }
  public void set_fcurTotalIncomePreDonations(java.math.BigDecimal fcurTotalIncomePreDonations) {
    this.fcurTotalIncomePreDonations = fcurTotalIncomePreDonations;
  }
  public tblnz_rtnnit with_fcurTotalIncomePreDonations(java.math.BigDecimal fcurTotalIncomePreDonations) {
    this.fcurTotalIncomePreDonations = fcurTotalIncomePreDonations;
    return this;
  }
  private java.math.BigDecimal fcurDonationsMade;
  public java.math.BigDecimal get_fcurDonationsMade() {
    return fcurDonationsMade;
  }
  public void set_fcurDonationsMade(java.math.BigDecimal fcurDonationsMade) {
    this.fcurDonationsMade = fcurDonationsMade;
  }
  public tblnz_rtnnit with_fcurDonationsMade(java.math.BigDecimal fcurDonationsMade) {
    this.fcurDonationsMade = fcurDonationsMade;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncome;
  public java.math.BigDecimal get_fcurTotalIncome() {
    return fcurTotalIncome;
  }
  public void set_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
  }
  public tblnz_rtnnit with_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurNetLossBroughtForward;
  public java.math.BigDecimal get_fcurNetLossBroughtForward() {
    return fcurNetLossBroughtForward;
  }
  public void set_fcurNetLossBroughtForward(java.math.BigDecimal fcurNetLossBroughtForward) {
    this.fcurNetLossBroughtForward = fcurNetLossBroughtForward;
  }
  public tblnz_rtnnit with_fcurNetLossBroughtForward(java.math.BigDecimal fcurNetLossBroughtForward) {
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
  public tblnz_rtnnit with_fcurNetLossClaimed(java.math.BigDecimal fcurNetLossClaimed) {
    this.fcurNetLossClaimed = fcurNetLossClaimed;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncomeAfterNetLoss;
  public java.math.BigDecimal get_fcurTotalIncomeAfterNetLoss() {
    return fcurTotalIncomeAfterNetLoss;
  }
  public void set_fcurTotalIncomeAfterNetLoss(java.math.BigDecimal fcurTotalIncomeAfterNetLoss) {
    this.fcurTotalIncomeAfterNetLoss = fcurTotalIncomeAfterNetLoss;
  }
  public tblnz_rtnnit with_fcurTotalIncomeAfterNetLoss(java.math.BigDecimal fcurTotalIncomeAfterNetLoss) {
    this.fcurTotalIncomeAfterNetLoss = fcurTotalIncomeAfterNetLoss;
    return this;
  }
  private java.math.BigDecimal fcurNetLossToCompanies;
  public java.math.BigDecimal get_fcurNetLossToCompanies() {
    return fcurNetLossToCompanies;
  }
  public void set_fcurNetLossToCompanies(java.math.BigDecimal fcurNetLossToCompanies) {
    this.fcurNetLossToCompanies = fcurNetLossToCompanies;
  }
  public tblnz_rtnnit with_fcurNetLossToCompanies(java.math.BigDecimal fcurNetLossToCompanies) {
    this.fcurNetLossToCompanies = fcurNetLossToCompanies;
    return this;
  }
  private java.math.BigDecimal fcurSubventionsToCompanies;
  public java.math.BigDecimal get_fcurSubventionsToCompanies() {
    return fcurSubventionsToCompanies;
  }
  public void set_fcurSubventionsToCompanies(java.math.BigDecimal fcurSubventionsToCompanies) {
    this.fcurSubventionsToCompanies = fcurSubventionsToCompanies;
  }
  public tblnz_rtnnit with_fcurSubventionsToCompanies(java.math.BigDecimal fcurSubventionsToCompanies) {
    this.fcurSubventionsToCompanies = fcurSubventionsToCompanies;
    return this;
  }
  private java.math.BigDecimal fcurTaxableIncome;
  public java.math.BigDecimal get_fcurTaxableIncome() {
    return fcurTaxableIncome;
  }
  public void set_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
  }
  public tblnz_rtnnit with_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
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
  public tblnz_rtnnit with_fcurTotalTaxPayable(java.math.BigDecimal fcurTotalTaxPayable) {
    this.fcurTotalTaxPayable = fcurTotalTaxPayable;
    return this;
  }
  private java.math.BigDecimal fcurTaxAfterOverseas;
  public java.math.BigDecimal get_fcurTaxAfterOverseas() {
    return fcurTaxAfterOverseas;
  }
  public void set_fcurTaxAfterOverseas(java.math.BigDecimal fcurTaxAfterOverseas) {
    this.fcurTaxAfterOverseas = fcurTaxAfterOverseas;
  }
  public tblnz_rtnnit with_fcurTaxAfterOverseas(java.math.BigDecimal fcurTaxAfterOverseas) {
    this.fcurTaxAfterOverseas = fcurTaxAfterOverseas;
    return this;
  }
  private java.math.BigDecimal fcurForeignInvestorTaxCredit;
  public java.math.BigDecimal get_fcurForeignInvestorTaxCredit() {
    return fcurForeignInvestorTaxCredit;
  }
  public void set_fcurForeignInvestorTaxCredit(java.math.BigDecimal fcurForeignInvestorTaxCredit) {
    this.fcurForeignInvestorTaxCredit = fcurForeignInvestorTaxCredit;
  }
  public tblnz_rtnnit with_fcurForeignInvestorTaxCredit(java.math.BigDecimal fcurForeignInvestorTaxCredit) {
    this.fcurForeignInvestorTaxCredit = fcurForeignInvestorTaxCredit;
    return this;
  }
  private java.math.BigDecimal fcurTaxAfterForeignInvestor;
  public java.math.BigDecimal get_fcurTaxAfterForeignInvestor() {
    return fcurTaxAfterForeignInvestor;
  }
  public void set_fcurTaxAfterForeignInvestor(java.math.BigDecimal fcurTaxAfterForeignInvestor) {
    this.fcurTaxAfterForeignInvestor = fcurTaxAfterForeignInvestor;
  }
  public tblnz_rtnnit with_fcurTaxAfterForeignInvestor(java.math.BigDecimal fcurTaxAfterForeignInvestor) {
    this.fcurTaxAfterForeignInvestor = fcurTaxAfterForeignInvestor;
    return this;
  }
  private java.math.BigDecimal fcurTaxAfterImputation;
  public java.math.BigDecimal get_fcurTaxAfterImputation() {
    return fcurTaxAfterImputation;
  }
  public void set_fcurTaxAfterImputation(java.math.BigDecimal fcurTaxAfterImputation) {
    this.fcurTaxAfterImputation = fcurTaxAfterImputation;
  }
  public tblnz_rtnnit with_fcurTaxAfterImputation(java.math.BigDecimal fcurTaxAfterImputation) {
    this.fcurTaxAfterImputation = fcurTaxAfterImputation;
    return this;
  }
  private java.math.BigDecimal fcurExcessImputationCredits;
  public java.math.BigDecimal get_fcurExcessImputationCredits() {
    return fcurExcessImputationCredits;
  }
  public void set_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
  }
  public tblnz_rtnnit with_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurResidualIncomeTax;
  public java.math.BigDecimal get_fcurResidualIncomeTax() {
    return fcurResidualIncomeTax;
  }
  public void set_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
  }
  public tblnz_rtnnit with_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
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
  public tblnz_rtnnit with_fcurProvisionalTaxPaid(java.math.BigDecimal fcurProvisionalTaxPaid) {
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
  public tblnz_rtnnit with_fcurTaxAmount(java.math.BigDecimal fcurTaxAmount) {
    this.fcurTaxAmount = fcurTaxAmount;
    return this;
  }
  private Integer fblnRADFiled;
  public Integer get_fblnRADFiled() {
    return fblnRADFiled;
  }
  public void set_fblnRADFiled(Integer fblnRADFiled) {
    this.fblnRADFiled = fblnRADFiled;
  }
  public tblnz_rtnnit with_fblnRADFiled(Integer fblnRADFiled) {
    this.fblnRADFiled = fblnRADFiled;
    return this;
  }
  private java.math.BigDecimal fcurRADAmount;
  public java.math.BigDecimal get_fcurRADAmount() {
    return fcurRADAmount;
  }
  public void set_fcurRADAmount(java.math.BigDecimal fcurRADAmount) {
    this.fcurRADAmount = fcurRADAmount;
  }
  public tblnz_rtnnit with_fcurRADAmount(java.math.BigDecimal fcurRADAmount) {
    this.fcurRADAmount = fcurRADAmount;
    return this;
  }
  private java.math.BigDecimal fcurRADRefund;
  public java.math.BigDecimal get_fcurRADRefund() {
    return fcurRADRefund;
  }
  public void set_fcurRADRefund(java.math.BigDecimal fcurRADRefund) {
    this.fcurRADRefund = fcurRADRefund;
  }
  public tblnz_rtnnit with_fcurRADRefund(java.math.BigDecimal fcurRADRefund) {
    this.fcurRADRefund = fcurRADRefund;
    return this;
  }
  private java.math.BigDecimal fcurRADLoss;
  public java.math.BigDecimal get_fcurRADLoss() {
    return fcurRADLoss;
  }
  public void set_fcurRADLoss(java.math.BigDecimal fcurRADLoss) {
    this.fcurRADLoss = fcurRADLoss;
  }
  public tblnz_rtnnit with_fcurRADLoss(java.math.BigDecimal fcurRADLoss) {
    this.fcurRADLoss = fcurRADLoss;
    return this;
  }
  private java.math.BigDecimal fcurRADTaxAdjustment;
  public java.math.BigDecimal get_fcurRADTaxAdjustment() {
    return fcurRADTaxAdjustment;
  }
  public void set_fcurRADTaxAdjustment(java.math.BigDecimal fcurRADTaxAdjustment) {
    this.fcurRADTaxAdjustment = fcurRADTaxAdjustment;
  }
  public tblnz_rtnnit with_fcurRADTaxAdjustment(java.math.BigDecimal fcurRADTaxAdjustment) {
    this.fcurRADTaxAdjustment = fcurRADTaxAdjustment;
    return this;
  }
  private java.math.BigDecimal fcurRADRepaymentTax;
  public java.math.BigDecimal get_fcurRADRepaymentTax() {
    return fcurRADRepaymentTax;
  }
  public void set_fcurRADRepaymentTax(java.math.BigDecimal fcurRADRepaymentTax) {
    this.fcurRADRepaymentTax = fcurRADRepaymentTax;
  }
  public tblnz_rtnnit with_fcurRADRepaymentTax(java.math.BigDecimal fcurRADRepaymentTax) {
    this.fcurRADRepaymentTax = fcurRADRepaymentTax;
    return this;
  }
  private java.math.BigDecimal fcurTransferProvisional;
  public java.math.BigDecimal get_fcurTransferProvisional() {
    return fcurTransferProvisional;
  }
  public void set_fcurTransferProvisional(java.math.BigDecimal fcurTransferProvisional) {
    this.fcurTransferProvisional = fcurTransferProvisional;
  }
  public tblnz_rtnnit with_fcurTransferProvisional(java.math.BigDecimal fcurTransferProvisional) {
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
  public tblnz_rtnnit with_fcurTransferCustomerAmount(java.math.BigDecimal fcurTransferCustomerAmount) {
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
  public tblnz_rtnnit with_fcurTotalRefund(java.math.BigDecimal fcurTotalRefund) {
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
  public tblnz_rtnnit with_fdtmProvisionalStartDate(java.sql.Timestamp fdtmProvisionalStartDate) {
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
  public tblnz_rtnnit with_fstrProvisionalOption(String fstrProvisionalOption) {
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
  public tblnz_rtnnit with_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
    this.fcurProvisionalTax = fcurProvisionalTax;
    return this;
  }
  private Integer fblnNonresidentPayments;
  public Integer get_fblnNonresidentPayments() {
    return fblnNonresidentPayments;
  }
  public void set_fblnNonresidentPayments(Integer fblnNonresidentPayments) {
    this.fblnNonresidentPayments = fblnNonresidentPayments;
  }
  public tblnz_rtnnit with_fblnNonresidentPayments(Integer fblnNonresidentPayments) {
    this.fblnNonresidentPayments = fblnNonresidentPayments;
    return this;
  }
  private Integer fblnNonresidentWithholding;
  public Integer get_fblnNonresidentWithholding() {
    return fblnNonresidentWithholding;
  }
  public void set_fblnNonresidentWithholding(Integer fblnNonresidentWithholding) {
    this.fblnNonresidentWithholding = fblnNonresidentWithholding;
  }
  public tblnz_rtnnit with_fblnNonresidentWithholding(Integer fblnNonresidentWithholding) {
    this.fblnNonresidentWithholding = fblnNonresidentWithholding;
    return this;
  }
  private Integer fblnCFC;
  public Integer get_fblnCFC() {
    return fblnCFC;
  }
  public void set_fblnCFC(Integer fblnCFC) {
    this.fblnCFC = fblnCFC;
  }
  public tblnz_rtnnit with_fblnCFC(Integer fblnCFC) {
    this.fblnCFC = fblnCFC;
    return this;
  }
  private java.math.BigDecimal fcurSharesRepurchased;
  public java.math.BigDecimal get_fcurSharesRepurchased() {
    return fcurSharesRepurchased;
  }
  public void set_fcurSharesRepurchased(java.math.BigDecimal fcurSharesRepurchased) {
    this.fcurSharesRepurchased = fcurSharesRepurchased;
  }
  public tblnz_rtnnit with_fcurSharesRepurchased(java.math.BigDecimal fcurSharesRepurchased) {
    this.fcurSharesRepurchased = fcurSharesRepurchased;
    return this;
  }
  private Integer fblnForeignDividends;
  public Integer get_fblnForeignDividends() {
    return fblnForeignDividends;
  }
  public void set_fblnForeignDividends(Integer fblnForeignDividends) {
    this.fblnForeignDividends = fblnForeignDividends;
  }
  public tblnz_rtnnit with_fblnForeignDividends(Integer fblnForeignDividends) {
    this.fblnForeignDividends = fblnForeignDividends;
    return this;
  }
  private Integer fblnNonresidentControlled;
  public Integer get_fblnNonresidentControlled() {
    return fblnNonresidentControlled;
  }
  public void set_fblnNonresidentControlled(Integer fblnNonresidentControlled) {
    this.fblnNonresidentControlled = fblnNonresidentControlled;
  }
  public tblnz_rtnnit with_fblnNonresidentControlled(Integer fblnNonresidentControlled) {
    this.fblnNonresidentControlled = fblnNonresidentControlled;
    return this;
  }
  private Integer fblnNonResident;
  public Integer get_fblnNonResident() {
    return fblnNonResident;
  }
  public void set_fblnNonResident(Integer fblnNonResident) {
    this.fblnNonResident = fblnNonResident;
  }
  public tblnz_rtnnit with_fblnNonResident(Integer fblnNonResident) {
    this.fblnNonResident = fblnNonResident;
    return this;
  }
  private java.math.BigDecimal fcurLowestEconomicInterests;
  public java.math.BigDecimal get_fcurLowestEconomicInterests() {
    return fcurLowestEconomicInterests;
  }
  public void set_fcurLowestEconomicInterests(java.math.BigDecimal fcurLowestEconomicInterests) {
    this.fcurLowestEconomicInterests = fcurLowestEconomicInterests;
  }
  public tblnz_rtnnit with_fcurLowestEconomicInterests(java.math.BigDecimal fcurLowestEconomicInterests) {
    this.fcurLowestEconomicInterests = fcurLowestEconomicInterests;
    return this;
  }
  private java.math.BigDecimal fcurLossToCarryForward;
  public java.math.BigDecimal get_fcurLossToCarryForward() {
    return fcurLossToCarryForward;
  }
  public void set_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
  }
  public tblnz_rtnnit with_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
    return this;
  }
  private Integer fblnLineItemsProcessed;
  public Integer get_fblnLineItemsProcessed() {
    return fblnLineItemsProcessed;
  }
  public void set_fblnLineItemsProcessed(Integer fblnLineItemsProcessed) {
    this.fblnLineItemsProcessed = fblnLineItemsProcessed;
  }
  public tblnz_rtnnit with_fblnLineItemsProcessed(Integer fblnLineItemsProcessed) {
    this.fblnLineItemsProcessed = fblnLineItemsProcessed;
    return this;
  }
  private String fstrResMethod;
  public String get_fstrResMethod() {
    return fstrResMethod;
  }
  public void set_fstrResMethod(String fstrResMethod) {
    this.fstrResMethod = fstrResMethod;
  }
  public tblnz_rtnnit with_fstrResMethod(String fstrResMethod) {
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
  public tblnz_rtnnit with_fcurResIncome(java.math.BigDecimal fcurResIncome) {
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
  public tblnz_rtnnit with_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
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
  public tblnz_rtnnit with_fcurResDeductionsPriorYear(java.math.BigDecimal fcurResDeductionsPriorYear) {
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
  public tblnz_rtnnit with_fcurResDeductionsClaimed(java.math.BigDecimal fcurResDeductionsClaimed) {
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
  public tblnz_rtnnit with_fcurResNetIncome(java.math.BigDecimal fcurResNetIncome) {
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
  public tblnz_rtnnit with_fcurResDeductionsForward(java.math.BigDecimal fcurResDeductionsForward) {
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
  public tblnz_rtnnit with_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
    this.fcurRDICarryForwardCurrentYear = fcurRDICarryForwardCurrentYear;
    return this;
  }
  private java.math.BigDecimal fcurRDIRefundableCredit;
  public java.math.BigDecimal get_fcurRDIRefundableCredit() {
    return fcurRDIRefundableCredit;
  }
  public void set_fcurRDIRefundableCredit(java.math.BigDecimal fcurRDIRefundableCredit) {
    this.fcurRDIRefundableCredit = fcurRDIRefundableCredit;
  }
  public tblnz_rtnnit with_fcurRDIRefundableCredit(java.math.BigDecimal fcurRDIRefundableCredit) {
    this.fcurRDIRefundableCredit = fcurRDIRefundableCredit;
    return this;
  }
  private java.math.BigDecimal fcurRDICarryForwardRemaining;
  public java.math.BigDecimal get_fcurRDICarryForwardRemaining() {
    return fcurRDICarryForwardRemaining;
  }
  public void set_fcurRDICarryForwardRemaining(java.math.BigDecimal fcurRDICarryForwardRemaining) {
    this.fcurRDICarryForwardRemaining = fcurRDICarryForwardRemaining;
  }
  public tblnz_rtnnit with_fcurRDICarryForwardRemaining(java.math.BigDecimal fcurRDICarryForwardRemaining) {
    this.fcurRDICarryForwardRemaining = fcurRDICarryForwardRemaining;
    return this;
  }
  private java.math.BigDecimal fcurAIMShareholderTaxPaid;
  public java.math.BigDecimal get_fcurAIMShareholderTaxPaid() {
    return fcurAIMShareholderTaxPaid;
  }
  public void set_fcurAIMShareholderTaxPaid(java.math.BigDecimal fcurAIMShareholderTaxPaid) {
    this.fcurAIMShareholderTaxPaid = fcurAIMShareholderTaxPaid;
  }
  public tblnz_rtnnit with_fcurAIMShareholderTaxPaid(java.math.BigDecimal fcurAIMShareholderTaxPaid) {
    this.fcurAIMShareholderTaxPaid = fcurAIMShareholderTaxPaid;
    return this;
  }
  private java.math.BigDecimal fcurSaleOfProperty;
  public java.math.BigDecimal get_fcurSaleOfProperty() {
    return fcurSaleOfProperty;
  }
  public void set_fcurSaleOfProperty(java.math.BigDecimal fcurSaleOfProperty) {
    this.fcurSaleOfProperty = fcurSaleOfProperty;
  }
  public tblnz_rtnnit with_fcurSaleOfProperty(java.math.BigDecimal fcurSaleOfProperty) {
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
  public tblnz_rtnnit with_fstrWho(String fstrWho) {
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
  public tblnz_rtnnit with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnit)) {
      return false;
    }
    tblnz_rtnnit that = (tblnz_rtnnit) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTaxDeducted == null ? that.fcurTaxDeducted == null : this.fcurTaxDeducted.equals(that.fcurTaxDeducted));
    equal = equal && (this.fcurGrossIncome == null ? that.fcurGrossIncome == null : this.fcurGrossIncome.equals(that.fcurGrossIncome));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurDividendImputation == null ? that.fcurDividendImputation == null : this.fcurDividendImputation.equals(that.fcurDividendImputation));
    equal = equal && (this.fcurDividendRWT == null ? that.fcurDividendRWT == null : this.fcurDividendRWT.equals(that.fcurDividendRWT));
    equal = equal && (this.fcurDividendGross == null ? that.fcurDividendGross == null : this.fcurDividendGross.equals(that.fcurDividendGross));
    equal = equal && (this.fcurMaoriCredits == null ? that.fcurMaoriCredits == null : this.fcurMaoriCredits.equals(that.fcurMaoriCredits));
    equal = equal && (this.fcurMaoriDistributions == null ? that.fcurMaoriDistributions == null : this.fcurMaoriDistributions.equals(that.fcurMaoriDistributions));
    equal = equal && (this.fcurTrustCredits == null ? that.fcurTrustCredits == null : this.fcurTrustCredits.equals(that.fcurTrustCredits));
    equal = equal && (this.fcurTrustIncome == null ? that.fcurTrustIncome == null : this.fcurTrustIncome.equals(that.fcurTrustIncome));
    equal = equal && (this.fcurTotalCredits == null ? that.fcurTotalCredits == null : this.fcurTotalCredits.equals(that.fcurTotalCredits));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurOverseasIncome == null ? that.fcurOverseasIncome == null : this.fcurOverseasIncome.equals(that.fcurOverseasIncome));
    equal = equal && (this.fcurBusinessActivities == null ? that.fcurBusinessActivities == null : this.fcurBusinessActivities.equals(that.fcurBusinessActivities));
    equal = equal && (this.fcurPremiumPaid == null ? that.fcurPremiumPaid == null : this.fcurPremiumPaid.equals(that.fcurPremiumPaid));
    equal = equal && (this.fcurPremiumPaidSwitzerland == null ? that.fcurPremiumPaidSwitzerland == null : this.fcurPremiumPaidSwitzerland.equals(that.fcurPremiumPaidSwitzerland));
    equal = equal && (this.fcurTotalPremium == null ? that.fcurTotalPremium == null : this.fcurTotalPremium.equals(that.fcurTotalPremium));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurTotalIncomePreDonations == null ? that.fcurTotalIncomePreDonations == null : this.fcurTotalIncomePreDonations.equals(that.fcurTotalIncomePreDonations));
    equal = equal && (this.fcurDonationsMade == null ? that.fcurDonationsMade == null : this.fcurDonationsMade.equals(that.fcurDonationsMade));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurNetLossBroughtForward == null ? that.fcurNetLossBroughtForward == null : this.fcurNetLossBroughtForward.equals(that.fcurNetLossBroughtForward));
    equal = equal && (this.fcurNetLossClaimed == null ? that.fcurNetLossClaimed == null : this.fcurNetLossClaimed.equals(that.fcurNetLossClaimed));
    equal = equal && (this.fcurTotalIncomeAfterNetLoss == null ? that.fcurTotalIncomeAfterNetLoss == null : this.fcurTotalIncomeAfterNetLoss.equals(that.fcurTotalIncomeAfterNetLoss));
    equal = equal && (this.fcurNetLossToCompanies == null ? that.fcurNetLossToCompanies == null : this.fcurNetLossToCompanies.equals(that.fcurNetLossToCompanies));
    equal = equal && (this.fcurSubventionsToCompanies == null ? that.fcurSubventionsToCompanies == null : this.fcurSubventionsToCompanies.equals(that.fcurSubventionsToCompanies));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurTotalTaxPayable == null ? that.fcurTotalTaxPayable == null : this.fcurTotalTaxPayable.equals(that.fcurTotalTaxPayable));
    equal = equal && (this.fcurTaxAfterOverseas == null ? that.fcurTaxAfterOverseas == null : this.fcurTaxAfterOverseas.equals(that.fcurTaxAfterOverseas));
    equal = equal && (this.fcurForeignInvestorTaxCredit == null ? that.fcurForeignInvestorTaxCredit == null : this.fcurForeignInvestorTaxCredit.equals(that.fcurForeignInvestorTaxCredit));
    equal = equal && (this.fcurTaxAfterForeignInvestor == null ? that.fcurTaxAfterForeignInvestor == null : this.fcurTaxAfterForeignInvestor.equals(that.fcurTaxAfterForeignInvestor));
    equal = equal && (this.fcurTaxAfterImputation == null ? that.fcurTaxAfterImputation == null : this.fcurTaxAfterImputation.equals(that.fcurTaxAfterImputation));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurProvisionalTaxPaid == null ? that.fcurProvisionalTaxPaid == null : this.fcurProvisionalTaxPaid.equals(that.fcurProvisionalTaxPaid));
    equal = equal && (this.fcurTaxAmount == null ? that.fcurTaxAmount == null : this.fcurTaxAmount.equals(that.fcurTaxAmount));
    equal = equal && (this.fblnRADFiled == null ? that.fblnRADFiled == null : this.fblnRADFiled.equals(that.fblnRADFiled));
    equal = equal && (this.fcurRADAmount == null ? that.fcurRADAmount == null : this.fcurRADAmount.equals(that.fcurRADAmount));
    equal = equal && (this.fcurRADRefund == null ? that.fcurRADRefund == null : this.fcurRADRefund.equals(that.fcurRADRefund));
    equal = equal && (this.fcurRADLoss == null ? that.fcurRADLoss == null : this.fcurRADLoss.equals(that.fcurRADLoss));
    equal = equal && (this.fcurRADTaxAdjustment == null ? that.fcurRADTaxAdjustment == null : this.fcurRADTaxAdjustment.equals(that.fcurRADTaxAdjustment));
    equal = equal && (this.fcurRADRepaymentTax == null ? that.fcurRADRepaymentTax == null : this.fcurRADRepaymentTax.equals(that.fcurRADRepaymentTax));
    equal = equal && (this.fcurTransferProvisional == null ? that.fcurTransferProvisional == null : this.fcurTransferProvisional.equals(that.fcurTransferProvisional));
    equal = equal && (this.fcurTransferCustomerAmount == null ? that.fcurTransferCustomerAmount == null : this.fcurTransferCustomerAmount.equals(that.fcurTransferCustomerAmount));
    equal = equal && (this.fcurTotalRefund == null ? that.fcurTotalRefund == null : this.fcurTotalRefund.equals(that.fcurTotalRefund));
    equal = equal && (this.fdtmProvisionalStartDate == null ? that.fdtmProvisionalStartDate == null : this.fdtmProvisionalStartDate.equals(that.fdtmProvisionalStartDate));
    equal = equal && (this.fstrProvisionalOption == null ? that.fstrProvisionalOption == null : this.fstrProvisionalOption.equals(that.fstrProvisionalOption));
    equal = equal && (this.fcurProvisionalTax == null ? that.fcurProvisionalTax == null : this.fcurProvisionalTax.equals(that.fcurProvisionalTax));
    equal = equal && (this.fblnNonresidentPayments == null ? that.fblnNonresidentPayments == null : this.fblnNonresidentPayments.equals(that.fblnNonresidentPayments));
    equal = equal && (this.fblnNonresidentWithholding == null ? that.fblnNonresidentWithholding == null : this.fblnNonresidentWithholding.equals(that.fblnNonresidentWithholding));
    equal = equal && (this.fblnCFC == null ? that.fblnCFC == null : this.fblnCFC.equals(that.fblnCFC));
    equal = equal && (this.fcurSharesRepurchased == null ? that.fcurSharesRepurchased == null : this.fcurSharesRepurchased.equals(that.fcurSharesRepurchased));
    equal = equal && (this.fblnForeignDividends == null ? that.fblnForeignDividends == null : this.fblnForeignDividends.equals(that.fblnForeignDividends));
    equal = equal && (this.fblnNonresidentControlled == null ? that.fblnNonresidentControlled == null : this.fblnNonresidentControlled.equals(that.fblnNonresidentControlled));
    equal = equal && (this.fblnNonResident == null ? that.fblnNonResident == null : this.fblnNonResident.equals(that.fblnNonResident));
    equal = equal && (this.fcurLowestEconomicInterests == null ? that.fcurLowestEconomicInterests == null : this.fcurLowestEconomicInterests.equals(that.fcurLowestEconomicInterests));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fblnLineItemsProcessed == null ? that.fblnLineItemsProcessed == null : this.fblnLineItemsProcessed.equals(that.fblnLineItemsProcessed));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurResDeductionsForward == null ? that.fcurResDeductionsForward == null : this.fcurResDeductionsForward.equals(that.fcurResDeductionsForward));
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDIRefundableCredit == null ? that.fcurRDIRefundableCredit == null : this.fcurRDIRefundableCredit.equals(that.fcurRDIRefundableCredit));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurAIMShareholderTaxPaid == null ? that.fcurAIMShareholderTaxPaid == null : this.fcurAIMShareholderTaxPaid.equals(that.fcurAIMShareholderTaxPaid));
    equal = equal && (this.fcurSaleOfProperty == null ? that.fcurSaleOfProperty == null : this.fcurSaleOfProperty.equals(that.fcurSaleOfProperty));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnit)) {
      return false;
    }
    tblnz_rtnnit that = (tblnz_rtnnit) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTaxDeducted == null ? that.fcurTaxDeducted == null : this.fcurTaxDeducted.equals(that.fcurTaxDeducted));
    equal = equal && (this.fcurGrossIncome == null ? that.fcurGrossIncome == null : this.fcurGrossIncome.equals(that.fcurGrossIncome));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurDividendImputation == null ? that.fcurDividendImputation == null : this.fcurDividendImputation.equals(that.fcurDividendImputation));
    equal = equal && (this.fcurDividendRWT == null ? that.fcurDividendRWT == null : this.fcurDividendRWT.equals(that.fcurDividendRWT));
    equal = equal && (this.fcurDividendGross == null ? that.fcurDividendGross == null : this.fcurDividendGross.equals(that.fcurDividendGross));
    equal = equal && (this.fcurMaoriCredits == null ? that.fcurMaoriCredits == null : this.fcurMaoriCredits.equals(that.fcurMaoriCredits));
    equal = equal && (this.fcurMaoriDistributions == null ? that.fcurMaoriDistributions == null : this.fcurMaoriDistributions.equals(that.fcurMaoriDistributions));
    equal = equal && (this.fcurTrustCredits == null ? that.fcurTrustCredits == null : this.fcurTrustCredits.equals(that.fcurTrustCredits));
    equal = equal && (this.fcurTrustIncome == null ? that.fcurTrustIncome == null : this.fcurTrustIncome.equals(that.fcurTrustIncome));
    equal = equal && (this.fcurTotalCredits == null ? that.fcurTotalCredits == null : this.fcurTotalCredits.equals(that.fcurTotalCredits));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurOverseasIncome == null ? that.fcurOverseasIncome == null : this.fcurOverseasIncome.equals(that.fcurOverseasIncome));
    equal = equal && (this.fcurBusinessActivities == null ? that.fcurBusinessActivities == null : this.fcurBusinessActivities.equals(that.fcurBusinessActivities));
    equal = equal && (this.fcurPremiumPaid == null ? that.fcurPremiumPaid == null : this.fcurPremiumPaid.equals(that.fcurPremiumPaid));
    equal = equal && (this.fcurPremiumPaidSwitzerland == null ? that.fcurPremiumPaidSwitzerland == null : this.fcurPremiumPaidSwitzerland.equals(that.fcurPremiumPaidSwitzerland));
    equal = equal && (this.fcurTotalPremium == null ? that.fcurTotalPremium == null : this.fcurTotalPremium.equals(that.fcurTotalPremium));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurTotalIncomePreDonations == null ? that.fcurTotalIncomePreDonations == null : this.fcurTotalIncomePreDonations.equals(that.fcurTotalIncomePreDonations));
    equal = equal && (this.fcurDonationsMade == null ? that.fcurDonationsMade == null : this.fcurDonationsMade.equals(that.fcurDonationsMade));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurNetLossBroughtForward == null ? that.fcurNetLossBroughtForward == null : this.fcurNetLossBroughtForward.equals(that.fcurNetLossBroughtForward));
    equal = equal && (this.fcurNetLossClaimed == null ? that.fcurNetLossClaimed == null : this.fcurNetLossClaimed.equals(that.fcurNetLossClaimed));
    equal = equal && (this.fcurTotalIncomeAfterNetLoss == null ? that.fcurTotalIncomeAfterNetLoss == null : this.fcurTotalIncomeAfterNetLoss.equals(that.fcurTotalIncomeAfterNetLoss));
    equal = equal && (this.fcurNetLossToCompanies == null ? that.fcurNetLossToCompanies == null : this.fcurNetLossToCompanies.equals(that.fcurNetLossToCompanies));
    equal = equal && (this.fcurSubventionsToCompanies == null ? that.fcurSubventionsToCompanies == null : this.fcurSubventionsToCompanies.equals(that.fcurSubventionsToCompanies));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurTotalTaxPayable == null ? that.fcurTotalTaxPayable == null : this.fcurTotalTaxPayable.equals(that.fcurTotalTaxPayable));
    equal = equal && (this.fcurTaxAfterOverseas == null ? that.fcurTaxAfterOverseas == null : this.fcurTaxAfterOverseas.equals(that.fcurTaxAfterOverseas));
    equal = equal && (this.fcurForeignInvestorTaxCredit == null ? that.fcurForeignInvestorTaxCredit == null : this.fcurForeignInvestorTaxCredit.equals(that.fcurForeignInvestorTaxCredit));
    equal = equal && (this.fcurTaxAfterForeignInvestor == null ? that.fcurTaxAfterForeignInvestor == null : this.fcurTaxAfterForeignInvestor.equals(that.fcurTaxAfterForeignInvestor));
    equal = equal && (this.fcurTaxAfterImputation == null ? that.fcurTaxAfterImputation == null : this.fcurTaxAfterImputation.equals(that.fcurTaxAfterImputation));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurProvisionalTaxPaid == null ? that.fcurProvisionalTaxPaid == null : this.fcurProvisionalTaxPaid.equals(that.fcurProvisionalTaxPaid));
    equal = equal && (this.fcurTaxAmount == null ? that.fcurTaxAmount == null : this.fcurTaxAmount.equals(that.fcurTaxAmount));
    equal = equal && (this.fblnRADFiled == null ? that.fblnRADFiled == null : this.fblnRADFiled.equals(that.fblnRADFiled));
    equal = equal && (this.fcurRADAmount == null ? that.fcurRADAmount == null : this.fcurRADAmount.equals(that.fcurRADAmount));
    equal = equal && (this.fcurRADRefund == null ? that.fcurRADRefund == null : this.fcurRADRefund.equals(that.fcurRADRefund));
    equal = equal && (this.fcurRADLoss == null ? that.fcurRADLoss == null : this.fcurRADLoss.equals(that.fcurRADLoss));
    equal = equal && (this.fcurRADTaxAdjustment == null ? that.fcurRADTaxAdjustment == null : this.fcurRADTaxAdjustment.equals(that.fcurRADTaxAdjustment));
    equal = equal && (this.fcurRADRepaymentTax == null ? that.fcurRADRepaymentTax == null : this.fcurRADRepaymentTax.equals(that.fcurRADRepaymentTax));
    equal = equal && (this.fcurTransferProvisional == null ? that.fcurTransferProvisional == null : this.fcurTransferProvisional.equals(that.fcurTransferProvisional));
    equal = equal && (this.fcurTransferCustomerAmount == null ? that.fcurTransferCustomerAmount == null : this.fcurTransferCustomerAmount.equals(that.fcurTransferCustomerAmount));
    equal = equal && (this.fcurTotalRefund == null ? that.fcurTotalRefund == null : this.fcurTotalRefund.equals(that.fcurTotalRefund));
    equal = equal && (this.fdtmProvisionalStartDate == null ? that.fdtmProvisionalStartDate == null : this.fdtmProvisionalStartDate.equals(that.fdtmProvisionalStartDate));
    equal = equal && (this.fstrProvisionalOption == null ? that.fstrProvisionalOption == null : this.fstrProvisionalOption.equals(that.fstrProvisionalOption));
    equal = equal && (this.fcurProvisionalTax == null ? that.fcurProvisionalTax == null : this.fcurProvisionalTax.equals(that.fcurProvisionalTax));
    equal = equal && (this.fblnNonresidentPayments == null ? that.fblnNonresidentPayments == null : this.fblnNonresidentPayments.equals(that.fblnNonresidentPayments));
    equal = equal && (this.fblnNonresidentWithholding == null ? that.fblnNonresidentWithholding == null : this.fblnNonresidentWithholding.equals(that.fblnNonresidentWithholding));
    equal = equal && (this.fblnCFC == null ? that.fblnCFC == null : this.fblnCFC.equals(that.fblnCFC));
    equal = equal && (this.fcurSharesRepurchased == null ? that.fcurSharesRepurchased == null : this.fcurSharesRepurchased.equals(that.fcurSharesRepurchased));
    equal = equal && (this.fblnForeignDividends == null ? that.fblnForeignDividends == null : this.fblnForeignDividends.equals(that.fblnForeignDividends));
    equal = equal && (this.fblnNonresidentControlled == null ? that.fblnNonresidentControlled == null : this.fblnNonresidentControlled.equals(that.fblnNonresidentControlled));
    equal = equal && (this.fblnNonResident == null ? that.fblnNonResident == null : this.fblnNonResident.equals(that.fblnNonResident));
    equal = equal && (this.fcurLowestEconomicInterests == null ? that.fcurLowestEconomicInterests == null : this.fcurLowestEconomicInterests.equals(that.fcurLowestEconomicInterests));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fblnLineItemsProcessed == null ? that.fblnLineItemsProcessed == null : this.fblnLineItemsProcessed.equals(that.fblnLineItemsProcessed));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurResDeductionsForward == null ? that.fcurResDeductionsForward == null : this.fcurResDeductionsForward.equals(that.fcurResDeductionsForward));
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDIRefundableCredit == null ? that.fcurRDIRefundableCredit == null : this.fcurRDIRefundableCredit.equals(that.fcurRDIRefundableCredit));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurAIMShareholderTaxPaid == null ? that.fcurAIMShareholderTaxPaid == null : this.fcurAIMShareholderTaxPaid.equals(that.fcurAIMShareholderTaxPaid));
    equal = equal && (this.fcurSaleOfProperty == null ? that.fcurSaleOfProperty == null : this.fcurSaleOfProperty.equals(that.fcurSaleOfProperty));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTaxDeducted = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurGrossIncome = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDividendImputation = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDividendRWT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurDividendGross = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurMaoriCredits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurMaoriDistributions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTrustCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTrustIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalCredits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurOverseasIncome = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurBusinessActivities = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPremiumPaid = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurPremiumPaidSwitzerland = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalPremium = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalIncomePreDonations = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurDonationsMade = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurNetLossBroughtForward = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurNetLossClaimed = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTotalIncomeAfterNetLoss = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetLossToCompanies = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurSubventionsToCompanies = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTotalTaxPayable = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurTaxAfterOverseas = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurForeignInvestorTaxCredit = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurTaxAfterForeignInvestor = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurTaxAfterImputation = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fblnRADFiled = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fcurRADAmount = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurRADRefund = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurRADLoss = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurRADTaxAdjustment = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurRADRepaymentTax = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(49, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(50, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fblnNonresidentPayments = JdbcWritableBridge.readInteger(52, __dbResults);
    this.fblnNonresidentWithholding = JdbcWritableBridge.readInteger(53, __dbResults);
    this.fblnCFC = JdbcWritableBridge.readInteger(54, __dbResults);
    this.fcurSharesRepurchased = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fblnForeignDividends = JdbcWritableBridge.readInteger(56, __dbResults);
    this.fblnNonresidentControlled = JdbcWritableBridge.readInteger(57, __dbResults);
    this.fblnNonResident = JdbcWritableBridge.readInteger(58, __dbResults);
    this.fcurLowestEconomicInterests = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fblnLineItemsProcessed = JdbcWritableBridge.readInteger(61, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(62, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.fcurRDIRefundableCredit = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.fcurAIMShareholderTaxPaid = JdbcWritableBridge.readBigDecimal(72, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(73, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(74, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(75, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTaxDeducted = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurGrossIncome = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDividendImputation = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDividendRWT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurDividendGross = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurMaoriCredits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurMaoriDistributions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTrustCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTrustIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalCredits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurOverseasIncome = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurBusinessActivities = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPremiumPaid = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurPremiumPaidSwitzerland = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalPremium = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalIncomePreDonations = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurDonationsMade = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurNetLossBroughtForward = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurNetLossClaimed = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTotalIncomeAfterNetLoss = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetLossToCompanies = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurSubventionsToCompanies = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTotalTaxPayable = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurTaxAfterOverseas = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurForeignInvestorTaxCredit = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurTaxAfterForeignInvestor = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurTaxAfterImputation = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fblnRADFiled = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fcurRADAmount = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurRADRefund = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurRADLoss = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurRADTaxAdjustment = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurRADRepaymentTax = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(49, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(50, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fblnNonresidentPayments = JdbcWritableBridge.readInteger(52, __dbResults);
    this.fblnNonresidentWithholding = JdbcWritableBridge.readInteger(53, __dbResults);
    this.fblnCFC = JdbcWritableBridge.readInteger(54, __dbResults);
    this.fcurSharesRepurchased = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fblnForeignDividends = JdbcWritableBridge.readInteger(56, __dbResults);
    this.fblnNonresidentControlled = JdbcWritableBridge.readInteger(57, __dbResults);
    this.fblnNonResident = JdbcWritableBridge.readInteger(58, __dbResults);
    this.fcurLowestEconomicInterests = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fblnLineItemsProcessed = JdbcWritableBridge.readInteger(61, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(62, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.fcurRDIRefundableCredit = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.fcurAIMShareholderTaxPaid = JdbcWritableBridge.readBigDecimal(72, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(73, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(74, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(75, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurTaxDeducted, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossIncome, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendImputation, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendRWT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendGross, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriCredits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriDistributions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCredits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasIncome, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBusinessActivities, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPremiumPaid, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPremiumPaidSwitzerland, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPremium, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomePreDonations, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDonationsMade, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossBroughtForward, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossClaimed, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeAfterNetLoss, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossToCompanies, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSubventionsToCompanies, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxPayable, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterOverseas, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurForeignInvestorTaxCredit, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterForeignInvestor, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterImputation, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRADFiled, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADAmount, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADRefund, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADLoss, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADTaxAdjustment, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADRepaymentTax, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 49 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonresidentPayments, 52 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonresidentWithholding, 53 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCFC, 54 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSharesRepurchased, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnForeignDividends, 56 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonresidentControlled, 57 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonResident, 58 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLowestEconomicInterests, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLineItemsProcessed, 61 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 62 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 69 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDIRefundableCredit, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 71 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAIMShareholderTaxPaid, 72 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 73 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 74 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 75 + __off, 93, __dbStmt);
    return 75;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDeducted, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossIncome, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendImputation, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendRWT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendGross, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriCredits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriDistributions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCredits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasIncome, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBusinessActivities, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPremiumPaid, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPremiumPaidSwitzerland, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPremium, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomePreDonations, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDonationsMade, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossBroughtForward, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossClaimed, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeAfterNetLoss, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossToCompanies, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSubventionsToCompanies, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxPayable, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterOverseas, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurForeignInvestorTaxCredit, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterForeignInvestor, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterImputation, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRADFiled, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADAmount, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADRefund, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADLoss, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADTaxAdjustment, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRADRepaymentTax, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 49 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonresidentPayments, 52 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonresidentWithholding, 53 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCFC, 54 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSharesRepurchased, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnForeignDividends, 56 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonresidentControlled, 57 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonResident, 58 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLowestEconomicInterests, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLineItemsProcessed, 61 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 62 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 69 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDIRefundableCredit, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 71 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAIMShareholderTaxPaid, 72 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 73 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 74 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 75 + __off, 93, __dbStmt);
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
        this.fcurTaxDeducted = null;
    } else {
    this.fcurTaxDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossIncome = null;
    } else {
    this.fcurGrossIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurTotalCredits = null;
    } else {
    this.fcurTotalCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurBusinessActivities = null;
    } else {
    this.fcurBusinessActivities = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPremiumPaid = null;
    } else {
    this.fcurPremiumPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPremiumPaidSwitzerland = null;
    } else {
    this.fcurPremiumPaidSwitzerland = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPremium = null;
    } else {
    this.fcurTotalPremium = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherIncome = null;
    } else {
    this.fcurOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRLWT = null;
    } else {
    this.fcurRLWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncomePreDonations = null;
    } else {
    this.fcurTotalIncomePreDonations = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDonationsMade = null;
    } else {
    this.fcurDonationsMade = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncome = null;
    } else {
    this.fcurTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurTotalIncomeAfterNetLoss = null;
    } else {
    this.fcurTotalIncomeAfterNetLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetLossToCompanies = null;
    } else {
    this.fcurNetLossToCompanies = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSubventionsToCompanies = null;
    } else {
    this.fcurSubventionsToCompanies = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurTaxAfterOverseas = null;
    } else {
    this.fcurTaxAfterOverseas = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurForeignInvestorTaxCredit = null;
    } else {
    this.fcurForeignInvestorTaxCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAfterForeignInvestor = null;
    } else {
    this.fcurTaxAfterForeignInvestor = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAfterImputation = null;
    } else {
    this.fcurTaxAfterImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessImputationCredits = null;
    } else {
    this.fcurExcessImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fblnRADFiled = null;
    } else {
    this.fblnRADFiled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRADAmount = null;
    } else {
    this.fcurRADAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRADRefund = null;
    } else {
    this.fcurRADRefund = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRADLoss = null;
    } else {
    this.fcurRADLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRADTaxAdjustment = null;
    } else {
    this.fcurRADTaxAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRADRepaymentTax = null;
    } else {
    this.fcurRADRepaymentTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fblnNonresidentPayments = null;
    } else {
    this.fblnNonresidentPayments = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNonresidentWithholding = null;
    } else {
    this.fblnNonresidentWithholding = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCFC = null;
    } else {
    this.fblnCFC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSharesRepurchased = null;
    } else {
    this.fcurSharesRepurchased = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnForeignDividends = null;
    } else {
    this.fblnForeignDividends = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNonresidentControlled = null;
    } else {
    this.fblnNonresidentControlled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNonResident = null;
    } else {
    this.fblnNonResident = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLowestEconomicInterests = null;
    } else {
    this.fcurLowestEconomicInterests = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossToCarryForward = null;
    } else {
    this.fcurLossToCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLineItemsProcessed = null;
    } else {
    this.fblnLineItemsProcessed = Integer.valueOf(__dataIn.readInt());
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
        this.fcurRDIRefundableCredit = null;
    } else {
    this.fcurRDIRefundableCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRDICarryForwardRemaining = null;
    } else {
    this.fcurRDICarryForwardRemaining = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAIMShareholderTaxPaid = null;
    } else {
    this.fcurAIMShareholderTaxPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurTaxDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDeducted, __dataOut);
    }
    if (null == this.fcurGrossIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossIncome, __dataOut);
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
    if (null == this.fcurTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCredits, __dataOut);
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
    if (null == this.fcurBusinessActivities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBusinessActivities, __dataOut);
    }
    if (null == this.fcurPremiumPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPremiumPaid, __dataOut);
    }
    if (null == this.fcurPremiumPaidSwitzerland) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPremiumPaidSwitzerland, __dataOut);
    }
    if (null == this.fcurTotalPremium) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPremium, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurRLWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWT, __dataOut);
    }
    if (null == this.fcurTotalIncomePreDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomePreDonations, __dataOut);
    }
    if (null == this.fcurDonationsMade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDonationsMade, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
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
    if (null == this.fcurTotalIncomeAfterNetLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeAfterNetLoss, __dataOut);
    }
    if (null == this.fcurNetLossToCompanies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossToCompanies, __dataOut);
    }
    if (null == this.fcurSubventionsToCompanies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSubventionsToCompanies, __dataOut);
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
    if (null == this.fcurTaxAfterOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterOverseas, __dataOut);
    }
    if (null == this.fcurForeignInvestorTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurForeignInvestorTaxCredit, __dataOut);
    }
    if (null == this.fcurTaxAfterForeignInvestor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterForeignInvestor, __dataOut);
    }
    if (null == this.fcurTaxAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterImputation, __dataOut);
    }
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
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
    if (null == this.fblnRADFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRADFiled);
    }
    if (null == this.fcurRADAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADAmount, __dataOut);
    }
    if (null == this.fcurRADRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADRefund, __dataOut);
    }
    if (null == this.fcurRADLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADLoss, __dataOut);
    }
    if (null == this.fcurRADTaxAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADTaxAdjustment, __dataOut);
    }
    if (null == this.fcurRADRepaymentTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADRepaymentTax, __dataOut);
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
    if (null == this.fblnNonresidentPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonresidentPayments);
    }
    if (null == this.fblnNonresidentWithholding) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonresidentWithholding);
    }
    if (null == this.fblnCFC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCFC);
    }
    if (null == this.fcurSharesRepurchased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSharesRepurchased, __dataOut);
    }
    if (null == this.fblnForeignDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnForeignDividends);
    }
    if (null == this.fblnNonresidentControlled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonresidentControlled);
    }
    if (null == this.fblnNonResident) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonResident);
    }
    if (null == this.fcurLowestEconomicInterests) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLowestEconomicInterests, __dataOut);
    }
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fblnLineItemsProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLineItemsProcessed);
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
    if (null == this.fcurRDIRefundableCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDIRefundableCredit, __dataOut);
    }
    if (null == this.fcurRDICarryForwardRemaining) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDICarryForwardRemaining, __dataOut);
    }
    if (null == this.fcurAIMShareholderTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAIMShareholderTaxPaid, __dataOut);
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
    if (null == this.fcurTaxDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDeducted, __dataOut);
    }
    if (null == this.fcurGrossIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossIncome, __dataOut);
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
    if (null == this.fcurTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCredits, __dataOut);
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
    if (null == this.fcurBusinessActivities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBusinessActivities, __dataOut);
    }
    if (null == this.fcurPremiumPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPremiumPaid, __dataOut);
    }
    if (null == this.fcurPremiumPaidSwitzerland) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPremiumPaidSwitzerland, __dataOut);
    }
    if (null == this.fcurTotalPremium) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPremium, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurRLWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWT, __dataOut);
    }
    if (null == this.fcurTotalIncomePreDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomePreDonations, __dataOut);
    }
    if (null == this.fcurDonationsMade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDonationsMade, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
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
    if (null == this.fcurTotalIncomeAfterNetLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeAfterNetLoss, __dataOut);
    }
    if (null == this.fcurNetLossToCompanies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossToCompanies, __dataOut);
    }
    if (null == this.fcurSubventionsToCompanies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSubventionsToCompanies, __dataOut);
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
    if (null == this.fcurTaxAfterOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterOverseas, __dataOut);
    }
    if (null == this.fcurForeignInvestorTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurForeignInvestorTaxCredit, __dataOut);
    }
    if (null == this.fcurTaxAfterForeignInvestor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterForeignInvestor, __dataOut);
    }
    if (null == this.fcurTaxAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterImputation, __dataOut);
    }
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
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
    if (null == this.fblnRADFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRADFiled);
    }
    if (null == this.fcurRADAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADAmount, __dataOut);
    }
    if (null == this.fcurRADRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADRefund, __dataOut);
    }
    if (null == this.fcurRADLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADLoss, __dataOut);
    }
    if (null == this.fcurRADTaxAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADTaxAdjustment, __dataOut);
    }
    if (null == this.fcurRADRepaymentTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRADRepaymentTax, __dataOut);
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
    if (null == this.fblnNonresidentPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonresidentPayments);
    }
    if (null == this.fblnNonresidentWithholding) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonresidentWithholding);
    }
    if (null == this.fblnCFC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCFC);
    }
    if (null == this.fcurSharesRepurchased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSharesRepurchased, __dataOut);
    }
    if (null == this.fblnForeignDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnForeignDividends);
    }
    if (null == this.fblnNonresidentControlled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonresidentControlled);
    }
    if (null == this.fblnNonResident) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonResident);
    }
    if (null == this.fcurLowestEconomicInterests) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLowestEconomicInterests, __dataOut);
    }
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fblnLineItemsProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLineItemsProcessed);
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
    if (null == this.fcurRDIRefundableCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDIRefundableCredit, __dataOut);
    }
    if (null == this.fcurRDICarryForwardRemaining) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDICarryForwardRemaining, __dataOut);
    }
    if (null == this.fcurAIMShareholderTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAIMShareholderTaxPaid, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDeducted==null?"\\N":fcurTaxDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossIncome==null?"\\N":fcurGrossIncome.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCredits==null?"\\N":fcurTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasIncome==null?"\\N":fcurOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBusinessActivities==null?"\\N":fcurBusinessActivities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPremiumPaid==null?"\\N":fcurPremiumPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPremiumPaidSwitzerland==null?"\\N":fcurPremiumPaidSwitzerland.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPremium==null?"\\N":fcurTotalPremium.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomePreDonations==null?"\\N":fcurTotalIncomePreDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDonationsMade==null?"\\N":fcurDonationsMade.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossBroughtForward==null?"\\N":fcurNetLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossClaimed==null?"\\N":fcurNetLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeAfterNetLoss==null?"\\N":fcurTotalIncomeAfterNetLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossToCompanies==null?"\\N":fcurNetLossToCompanies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSubventionsToCompanies==null?"\\N":fcurSubventionsToCompanies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxPayable==null?"\\N":fcurTotalTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterOverseas==null?"\\N":fcurTaxAfterOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurForeignInvestorTaxCredit==null?"\\N":fcurForeignInvestorTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterForeignInvestor==null?"\\N":fcurTaxAfterForeignInvestor.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterImputation==null?"\\N":fcurTaxAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTaxPaid==null?"\\N":fcurProvisionalTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAmount==null?"\\N":fcurTaxAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRADFiled==null?"\\N":"" + fblnRADFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADAmount==null?"\\N":fcurRADAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADRefund==null?"\\N":fcurRADRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADLoss==null?"\\N":fcurRADLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADTaxAdjustment==null?"\\N":fcurRADTaxAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADRepaymentTax==null?"\\N":fcurRADRepaymentTax.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonresidentPayments==null?"\\N":"" + fblnNonresidentPayments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonresidentWithholding==null?"\\N":"" + fblnNonresidentWithholding, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCFC==null?"\\N":"" + fblnCFC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSharesRepurchased==null?"\\N":fcurSharesRepurchased.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnForeignDividends==null?"\\N":"" + fblnForeignDividends, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonresidentControlled==null?"\\N":"" + fblnNonresidentControlled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonResident==null?"\\N":"" + fblnNonResident, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLowestEconomicInterests==null?"\\N":fcurLowestEconomicInterests.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLineItemsProcessed==null?"\\N":"" + fblnLineItemsProcessed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDIRefundableCredit==null?"\\N":fcurRDIRefundableCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAIMShareholderTaxPaid==null?"\\N":fcurAIMShareholderTaxPaid.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDeducted==null?"\\N":fcurTaxDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossIncome==null?"\\N":fcurGrossIncome.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCredits==null?"\\N":fcurTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasIncome==null?"\\N":fcurOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBusinessActivities==null?"\\N":fcurBusinessActivities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPremiumPaid==null?"\\N":fcurPremiumPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPremiumPaidSwitzerland==null?"\\N":fcurPremiumPaidSwitzerland.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPremium==null?"\\N":fcurTotalPremium.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomePreDonations==null?"\\N":fcurTotalIncomePreDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDonationsMade==null?"\\N":fcurDonationsMade.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossBroughtForward==null?"\\N":fcurNetLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossClaimed==null?"\\N":fcurNetLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeAfterNetLoss==null?"\\N":fcurTotalIncomeAfterNetLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossToCompanies==null?"\\N":fcurNetLossToCompanies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSubventionsToCompanies==null?"\\N":fcurSubventionsToCompanies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxPayable==null?"\\N":fcurTotalTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterOverseas==null?"\\N":fcurTaxAfterOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurForeignInvestorTaxCredit==null?"\\N":fcurForeignInvestorTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterForeignInvestor==null?"\\N":fcurTaxAfterForeignInvestor.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterImputation==null?"\\N":fcurTaxAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionalTaxPaid==null?"\\N":fcurProvisionalTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAmount==null?"\\N":fcurTaxAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRADFiled==null?"\\N":"" + fblnRADFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADAmount==null?"\\N":fcurRADAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADRefund==null?"\\N":fcurRADRefund.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADLoss==null?"\\N":fcurRADLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADTaxAdjustment==null?"\\N":fcurRADTaxAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRADRepaymentTax==null?"\\N":fcurRADRepaymentTax.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonresidentPayments==null?"\\N":"" + fblnNonresidentPayments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonresidentWithholding==null?"\\N":"" + fblnNonresidentWithholding, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCFC==null?"\\N":"" + fblnCFC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSharesRepurchased==null?"\\N":fcurSharesRepurchased.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnForeignDividends==null?"\\N":"" + fblnForeignDividends, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonresidentControlled==null?"\\N":"" + fblnNonresidentControlled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonResident==null?"\\N":"" + fblnNonResident, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLowestEconomicInterests==null?"\\N":fcurLowestEconomicInterests.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLineItemsProcessed==null?"\\N":"" + fblnLineItemsProcessed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDIRefundableCredit==null?"\\N":fcurRDIRefundableCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAIMShareholderTaxPaid==null?"\\N":fcurAIMShareholderTaxPaid.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDeducted = null; } else {
      this.fcurTaxDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossIncome = null; } else {
      this.fcurGrossIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCredits = null; } else {
      this.fcurTotalCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBusinessActivities = null; } else {
      this.fcurBusinessActivities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPremiumPaid = null; } else {
      this.fcurPremiumPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPremiumPaidSwitzerland = null; } else {
      this.fcurPremiumPaidSwitzerland = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPremium = null; } else {
      this.fcurTotalPremium = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWT = null; } else {
      this.fcurRLWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomePreDonations = null; } else {
      this.fcurTotalIncomePreDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDonationsMade = null; } else {
      this.fcurDonationsMade = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeAfterNetLoss = null; } else {
      this.fcurTotalIncomeAfterNetLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossToCompanies = null; } else {
      this.fcurNetLossToCompanies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSubventionsToCompanies = null; } else {
      this.fcurSubventionsToCompanies = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterOverseas = null; } else {
      this.fcurTaxAfterOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurForeignInvestorTaxCredit = null; } else {
      this.fcurForeignInvestorTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterForeignInvestor = null; } else {
      this.fcurTaxAfterForeignInvestor = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterImputation = null; } else {
      this.fcurTaxAfterImputation = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRADFiled = null; } else {
      this.fblnRADFiled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADAmount = null; } else {
      this.fcurRADAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADRefund = null; } else {
      this.fcurRADRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADLoss = null; } else {
      this.fcurRADLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADTaxAdjustment = null; } else {
      this.fcurRADTaxAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADRepaymentTax = null; } else {
      this.fcurRADRepaymentTax = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonresidentPayments = null; } else {
      this.fblnNonresidentPayments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonresidentWithholding = null; } else {
      this.fblnNonresidentWithholding = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSharesRepurchased = null; } else {
      this.fcurSharesRepurchased = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnForeignDividends = null; } else {
      this.fblnForeignDividends = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonresidentControlled = null; } else {
      this.fblnNonresidentControlled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonResident = null; } else {
      this.fblnNonResident = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLowestEconomicInterests = null; } else {
      this.fcurLowestEconomicInterests = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLineItemsProcessed = null; } else {
      this.fblnLineItemsProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDIRefundableCredit = null; } else {
      this.fcurRDIRefundableCredit = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAIMShareholderTaxPaid = null; } else {
      this.fcurAIMShareholderTaxPaid = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDeducted = null; } else {
      this.fcurTaxDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossIncome = null; } else {
      this.fcurGrossIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCredits = null; } else {
      this.fcurTotalCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBusinessActivities = null; } else {
      this.fcurBusinessActivities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPremiumPaid = null; } else {
      this.fcurPremiumPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPremiumPaidSwitzerland = null; } else {
      this.fcurPremiumPaidSwitzerland = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPremium = null; } else {
      this.fcurTotalPremium = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWT = null; } else {
      this.fcurRLWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomePreDonations = null; } else {
      this.fcurTotalIncomePreDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDonationsMade = null; } else {
      this.fcurDonationsMade = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeAfterNetLoss = null; } else {
      this.fcurTotalIncomeAfterNetLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossToCompanies = null; } else {
      this.fcurNetLossToCompanies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSubventionsToCompanies = null; } else {
      this.fcurSubventionsToCompanies = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterOverseas = null; } else {
      this.fcurTaxAfterOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurForeignInvestorTaxCredit = null; } else {
      this.fcurForeignInvestorTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterForeignInvestor = null; } else {
      this.fcurTaxAfterForeignInvestor = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfterImputation = null; } else {
      this.fcurTaxAfterImputation = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRADFiled = null; } else {
      this.fblnRADFiled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADAmount = null; } else {
      this.fcurRADAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADRefund = null; } else {
      this.fcurRADRefund = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADLoss = null; } else {
      this.fcurRADLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADTaxAdjustment = null; } else {
      this.fcurRADTaxAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRADRepaymentTax = null; } else {
      this.fcurRADRepaymentTax = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonresidentPayments = null; } else {
      this.fblnNonresidentPayments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonresidentWithholding = null; } else {
      this.fblnNonresidentWithholding = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSharesRepurchased = null; } else {
      this.fcurSharesRepurchased = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnForeignDividends = null; } else {
      this.fblnForeignDividends = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonresidentControlled = null; } else {
      this.fblnNonresidentControlled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonResident = null; } else {
      this.fblnNonResident = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLowestEconomicInterests = null; } else {
      this.fcurLowestEconomicInterests = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLineItemsProcessed = null; } else {
      this.fblnLineItemsProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDIRefundableCredit = null; } else {
      this.fcurRDIRefundableCredit = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAIMShareholderTaxPaid = null; } else {
      this.fcurAIMShareholderTaxPaid = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnnit o = (tblnz_rtnnit) super.clone();
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnit o) throws CloneNotSupportedException {
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTaxDeducted", this.fcurTaxDeducted);
    __sqoop$field_map.put("fcurGrossIncome", this.fcurGrossIncome);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurDividendImputation", this.fcurDividendImputation);
    __sqoop$field_map.put("fcurDividendRWT", this.fcurDividendRWT);
    __sqoop$field_map.put("fcurDividendGross", this.fcurDividendGross);
    __sqoop$field_map.put("fcurMaoriCredits", this.fcurMaoriCredits);
    __sqoop$field_map.put("fcurMaoriDistributions", this.fcurMaoriDistributions);
    __sqoop$field_map.put("fcurTrustCredits", this.fcurTrustCredits);
    __sqoop$field_map.put("fcurTrustIncome", this.fcurTrustIncome);
    __sqoop$field_map.put("fcurTotalCredits", this.fcurTotalCredits);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurOverseasIncome", this.fcurOverseasIncome);
    __sqoop$field_map.put("fcurBusinessActivities", this.fcurBusinessActivities);
    __sqoop$field_map.put("fcurPremiumPaid", this.fcurPremiumPaid);
    __sqoop$field_map.put("fcurPremiumPaidSwitzerland", this.fcurPremiumPaidSwitzerland);
    __sqoop$field_map.put("fcurTotalPremium", this.fcurTotalPremium);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurTotalIncomePreDonations", this.fcurTotalIncomePreDonations);
    __sqoop$field_map.put("fcurDonationsMade", this.fcurDonationsMade);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurNetLossBroughtForward", this.fcurNetLossBroughtForward);
    __sqoop$field_map.put("fcurNetLossClaimed", this.fcurNetLossClaimed);
    __sqoop$field_map.put("fcurTotalIncomeAfterNetLoss", this.fcurTotalIncomeAfterNetLoss);
    __sqoop$field_map.put("fcurNetLossToCompanies", this.fcurNetLossToCompanies);
    __sqoop$field_map.put("fcurSubventionsToCompanies", this.fcurSubventionsToCompanies);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurTotalTaxPayable", this.fcurTotalTaxPayable);
    __sqoop$field_map.put("fcurTaxAfterOverseas", this.fcurTaxAfterOverseas);
    __sqoop$field_map.put("fcurForeignInvestorTaxCredit", this.fcurForeignInvestorTaxCredit);
    __sqoop$field_map.put("fcurTaxAfterForeignInvestor", this.fcurTaxAfterForeignInvestor);
    __sqoop$field_map.put("fcurTaxAfterImputation", this.fcurTaxAfterImputation);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurProvisionalTaxPaid", this.fcurProvisionalTaxPaid);
    __sqoop$field_map.put("fcurTaxAmount", this.fcurTaxAmount);
    __sqoop$field_map.put("fblnRADFiled", this.fblnRADFiled);
    __sqoop$field_map.put("fcurRADAmount", this.fcurRADAmount);
    __sqoop$field_map.put("fcurRADRefund", this.fcurRADRefund);
    __sqoop$field_map.put("fcurRADLoss", this.fcurRADLoss);
    __sqoop$field_map.put("fcurRADTaxAdjustment", this.fcurRADTaxAdjustment);
    __sqoop$field_map.put("fcurRADRepaymentTax", this.fcurRADRepaymentTax);
    __sqoop$field_map.put("fcurTransferProvisional", this.fcurTransferProvisional);
    __sqoop$field_map.put("fcurTransferCustomerAmount", this.fcurTransferCustomerAmount);
    __sqoop$field_map.put("fcurTotalRefund", this.fcurTotalRefund);
    __sqoop$field_map.put("fdtmProvisionalStartDate", this.fdtmProvisionalStartDate);
    __sqoop$field_map.put("fstrProvisionalOption", this.fstrProvisionalOption);
    __sqoop$field_map.put("fcurProvisionalTax", this.fcurProvisionalTax);
    __sqoop$field_map.put("fblnNonresidentPayments", this.fblnNonresidentPayments);
    __sqoop$field_map.put("fblnNonresidentWithholding", this.fblnNonresidentWithholding);
    __sqoop$field_map.put("fblnCFC", this.fblnCFC);
    __sqoop$field_map.put("fcurSharesRepurchased", this.fcurSharesRepurchased);
    __sqoop$field_map.put("fblnForeignDividends", this.fblnForeignDividends);
    __sqoop$field_map.put("fblnNonresidentControlled", this.fblnNonresidentControlled);
    __sqoop$field_map.put("fblnNonResident", this.fblnNonResident);
    __sqoop$field_map.put("fcurLowestEconomicInterests", this.fcurLowestEconomicInterests);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fblnLineItemsProcessed", this.fblnLineItemsProcessed);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurResDeductionsForward", this.fcurResDeductionsForward);
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDIRefundableCredit", this.fcurRDIRefundableCredit);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurAIMShareholderTaxPaid", this.fcurAIMShareholderTaxPaid);
    __sqoop$field_map.put("fcurSaleOfProperty", this.fcurSaleOfProperty);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTaxDeducted", this.fcurTaxDeducted);
    __sqoop$field_map.put("fcurGrossIncome", this.fcurGrossIncome);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurDividendImputation", this.fcurDividendImputation);
    __sqoop$field_map.put("fcurDividendRWT", this.fcurDividendRWT);
    __sqoop$field_map.put("fcurDividendGross", this.fcurDividendGross);
    __sqoop$field_map.put("fcurMaoriCredits", this.fcurMaoriCredits);
    __sqoop$field_map.put("fcurMaoriDistributions", this.fcurMaoriDistributions);
    __sqoop$field_map.put("fcurTrustCredits", this.fcurTrustCredits);
    __sqoop$field_map.put("fcurTrustIncome", this.fcurTrustIncome);
    __sqoop$field_map.put("fcurTotalCredits", this.fcurTotalCredits);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurOverseasIncome", this.fcurOverseasIncome);
    __sqoop$field_map.put("fcurBusinessActivities", this.fcurBusinessActivities);
    __sqoop$field_map.put("fcurPremiumPaid", this.fcurPremiumPaid);
    __sqoop$field_map.put("fcurPremiumPaidSwitzerland", this.fcurPremiumPaidSwitzerland);
    __sqoop$field_map.put("fcurTotalPremium", this.fcurTotalPremium);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurTotalIncomePreDonations", this.fcurTotalIncomePreDonations);
    __sqoop$field_map.put("fcurDonationsMade", this.fcurDonationsMade);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurNetLossBroughtForward", this.fcurNetLossBroughtForward);
    __sqoop$field_map.put("fcurNetLossClaimed", this.fcurNetLossClaimed);
    __sqoop$field_map.put("fcurTotalIncomeAfterNetLoss", this.fcurTotalIncomeAfterNetLoss);
    __sqoop$field_map.put("fcurNetLossToCompanies", this.fcurNetLossToCompanies);
    __sqoop$field_map.put("fcurSubventionsToCompanies", this.fcurSubventionsToCompanies);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurTotalTaxPayable", this.fcurTotalTaxPayable);
    __sqoop$field_map.put("fcurTaxAfterOverseas", this.fcurTaxAfterOverseas);
    __sqoop$field_map.put("fcurForeignInvestorTaxCredit", this.fcurForeignInvestorTaxCredit);
    __sqoop$field_map.put("fcurTaxAfterForeignInvestor", this.fcurTaxAfterForeignInvestor);
    __sqoop$field_map.put("fcurTaxAfterImputation", this.fcurTaxAfterImputation);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurProvisionalTaxPaid", this.fcurProvisionalTaxPaid);
    __sqoop$field_map.put("fcurTaxAmount", this.fcurTaxAmount);
    __sqoop$field_map.put("fblnRADFiled", this.fblnRADFiled);
    __sqoop$field_map.put("fcurRADAmount", this.fcurRADAmount);
    __sqoop$field_map.put("fcurRADRefund", this.fcurRADRefund);
    __sqoop$field_map.put("fcurRADLoss", this.fcurRADLoss);
    __sqoop$field_map.put("fcurRADTaxAdjustment", this.fcurRADTaxAdjustment);
    __sqoop$field_map.put("fcurRADRepaymentTax", this.fcurRADRepaymentTax);
    __sqoop$field_map.put("fcurTransferProvisional", this.fcurTransferProvisional);
    __sqoop$field_map.put("fcurTransferCustomerAmount", this.fcurTransferCustomerAmount);
    __sqoop$field_map.put("fcurTotalRefund", this.fcurTotalRefund);
    __sqoop$field_map.put("fdtmProvisionalStartDate", this.fdtmProvisionalStartDate);
    __sqoop$field_map.put("fstrProvisionalOption", this.fstrProvisionalOption);
    __sqoop$field_map.put("fcurProvisionalTax", this.fcurProvisionalTax);
    __sqoop$field_map.put("fblnNonresidentPayments", this.fblnNonresidentPayments);
    __sqoop$field_map.put("fblnNonresidentWithholding", this.fblnNonresidentWithholding);
    __sqoop$field_map.put("fblnCFC", this.fblnCFC);
    __sqoop$field_map.put("fcurSharesRepurchased", this.fcurSharesRepurchased);
    __sqoop$field_map.put("fblnForeignDividends", this.fblnForeignDividends);
    __sqoop$field_map.put("fblnNonresidentControlled", this.fblnNonresidentControlled);
    __sqoop$field_map.put("fblnNonResident", this.fblnNonResident);
    __sqoop$field_map.put("fcurLowestEconomicInterests", this.fcurLowestEconomicInterests);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fblnLineItemsProcessed", this.fblnLineItemsProcessed);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurResDeductionsForward", this.fcurResDeductionsForward);
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDIRefundableCredit", this.fcurRDIRefundableCredit);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurAIMShareholderTaxPaid", this.fcurAIMShareholderTaxPaid);
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
