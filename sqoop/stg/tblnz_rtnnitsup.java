// ORM class for table 'tblnz_rtnnitsup'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:40:43 NZDT 2020
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

public class tblnz_rtnnitsup extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurFundsIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurFundsIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalDeductionFromAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTotalDeductionFromAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductionFromCapital", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurDeductionFromCapital = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductionFromRevenue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurDeductionFromRevenue = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductionFromSummed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurDeductionFromSummed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductionFromSubtracted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurDeductionFromSubtracted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalDeductionToAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTotalDeductionToAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductionToCapital", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurDeductionToCapital = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductionToRevenue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurDeductionToRevenue = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductionToSummed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurDeductionToSummed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLosses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurNetLosses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurLossClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTaxPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnDisclosureRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fblnDisclosureRequired = (Integer)value;
      }
    });
    setters.put("fcurDisposedInvestments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurDisposedInvestments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnGainsOnTaxableAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fblnGainsOnTaxableAccount = (Integer)value;
      }
    });
    setters.put("fblnFundInvestments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fblnFundInvestments = (Integer)value;
      }
    });
    setters.put("fblnInvestmentsDisposed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fblnInvestmentsDisposed = (Integer)value;
      }
    });
    setters.put("fblnTradingStock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fblnTradingStock = (Integer)value;
      }
    });
    setters.put("fcurOverseasCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurOverseasCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPayableAfterOverseas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTaxPayableAfterOverseas = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPayableAfterImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTaxPayableAfterImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurExcessImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputationAsLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurExcessImputationAsLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRLWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurRLWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurLossToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResidualIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurResidualIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionalTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurProvisionalTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTaxAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverpaymentProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurOverpaymentProvisional = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefundAfterOverpayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurRefundAfterOverpayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTransferProvisional = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferCustomerAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTransferCustomerAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurTotalRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmProvisionalStartDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fdtmProvisionalStartDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrProvisionalOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fstrProvisionalOption = (String)value;
      }
    });
    setters.put("fcurProvisionalTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurProvisionalTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardCurrentYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurRDICarryForwardCurrentYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardRemaining", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurRDICarryForwardRemaining = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPropertyProfitLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fcurPropertyProfitLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitsup.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnnitsup() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnnitsup with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurFundsIncome;
  public java.math.BigDecimal get_fcurFundsIncome() {
    return fcurFundsIncome;
  }
  public void set_fcurFundsIncome(java.math.BigDecimal fcurFundsIncome) {
    this.fcurFundsIncome = fcurFundsIncome;
  }
  public tblnz_rtnnitsup with_fcurFundsIncome(java.math.BigDecimal fcurFundsIncome) {
    this.fcurFundsIncome = fcurFundsIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalDeductionFromAmount;
  public java.math.BigDecimal get_fcurTotalDeductionFromAmount() {
    return fcurTotalDeductionFromAmount;
  }
  public void set_fcurTotalDeductionFromAmount(java.math.BigDecimal fcurTotalDeductionFromAmount) {
    this.fcurTotalDeductionFromAmount = fcurTotalDeductionFromAmount;
  }
  public tblnz_rtnnitsup with_fcurTotalDeductionFromAmount(java.math.BigDecimal fcurTotalDeductionFromAmount) {
    this.fcurTotalDeductionFromAmount = fcurTotalDeductionFromAmount;
    return this;
  }
  private java.math.BigDecimal fcurDeductionFromCapital;
  public java.math.BigDecimal get_fcurDeductionFromCapital() {
    return fcurDeductionFromCapital;
  }
  public void set_fcurDeductionFromCapital(java.math.BigDecimal fcurDeductionFromCapital) {
    this.fcurDeductionFromCapital = fcurDeductionFromCapital;
  }
  public tblnz_rtnnitsup with_fcurDeductionFromCapital(java.math.BigDecimal fcurDeductionFromCapital) {
    this.fcurDeductionFromCapital = fcurDeductionFromCapital;
    return this;
  }
  private java.math.BigDecimal fcurDeductionFromRevenue;
  public java.math.BigDecimal get_fcurDeductionFromRevenue() {
    return fcurDeductionFromRevenue;
  }
  public void set_fcurDeductionFromRevenue(java.math.BigDecimal fcurDeductionFromRevenue) {
    this.fcurDeductionFromRevenue = fcurDeductionFromRevenue;
  }
  public tblnz_rtnnitsup with_fcurDeductionFromRevenue(java.math.BigDecimal fcurDeductionFromRevenue) {
    this.fcurDeductionFromRevenue = fcurDeductionFromRevenue;
    return this;
  }
  private java.math.BigDecimal fcurDeductionFromSummed;
  public java.math.BigDecimal get_fcurDeductionFromSummed() {
    return fcurDeductionFromSummed;
  }
  public void set_fcurDeductionFromSummed(java.math.BigDecimal fcurDeductionFromSummed) {
    this.fcurDeductionFromSummed = fcurDeductionFromSummed;
  }
  public tblnz_rtnnitsup with_fcurDeductionFromSummed(java.math.BigDecimal fcurDeductionFromSummed) {
    this.fcurDeductionFromSummed = fcurDeductionFromSummed;
    return this;
  }
  private java.math.BigDecimal fcurDeductionFromSubtracted;
  public java.math.BigDecimal get_fcurDeductionFromSubtracted() {
    return fcurDeductionFromSubtracted;
  }
  public void set_fcurDeductionFromSubtracted(java.math.BigDecimal fcurDeductionFromSubtracted) {
    this.fcurDeductionFromSubtracted = fcurDeductionFromSubtracted;
  }
  public tblnz_rtnnitsup with_fcurDeductionFromSubtracted(java.math.BigDecimal fcurDeductionFromSubtracted) {
    this.fcurDeductionFromSubtracted = fcurDeductionFromSubtracted;
    return this;
  }
  private java.math.BigDecimal fcurTotalDeductionToAmount;
  public java.math.BigDecimal get_fcurTotalDeductionToAmount() {
    return fcurTotalDeductionToAmount;
  }
  public void set_fcurTotalDeductionToAmount(java.math.BigDecimal fcurTotalDeductionToAmount) {
    this.fcurTotalDeductionToAmount = fcurTotalDeductionToAmount;
  }
  public tblnz_rtnnitsup with_fcurTotalDeductionToAmount(java.math.BigDecimal fcurTotalDeductionToAmount) {
    this.fcurTotalDeductionToAmount = fcurTotalDeductionToAmount;
    return this;
  }
  private java.math.BigDecimal fcurDeductionToCapital;
  public java.math.BigDecimal get_fcurDeductionToCapital() {
    return fcurDeductionToCapital;
  }
  public void set_fcurDeductionToCapital(java.math.BigDecimal fcurDeductionToCapital) {
    this.fcurDeductionToCapital = fcurDeductionToCapital;
  }
  public tblnz_rtnnitsup with_fcurDeductionToCapital(java.math.BigDecimal fcurDeductionToCapital) {
    this.fcurDeductionToCapital = fcurDeductionToCapital;
    return this;
  }
  private java.math.BigDecimal fcurDeductionToRevenue;
  public java.math.BigDecimal get_fcurDeductionToRevenue() {
    return fcurDeductionToRevenue;
  }
  public void set_fcurDeductionToRevenue(java.math.BigDecimal fcurDeductionToRevenue) {
    this.fcurDeductionToRevenue = fcurDeductionToRevenue;
  }
  public tblnz_rtnnitsup with_fcurDeductionToRevenue(java.math.BigDecimal fcurDeductionToRevenue) {
    this.fcurDeductionToRevenue = fcurDeductionToRevenue;
    return this;
  }
  private java.math.BigDecimal fcurDeductionToSummed;
  public java.math.BigDecimal get_fcurDeductionToSummed() {
    return fcurDeductionToSummed;
  }
  public void set_fcurDeductionToSummed(java.math.BigDecimal fcurDeductionToSummed) {
    this.fcurDeductionToSummed = fcurDeductionToSummed;
  }
  public tblnz_rtnnitsup with_fcurDeductionToSummed(java.math.BigDecimal fcurDeductionToSummed) {
    this.fcurDeductionToSummed = fcurDeductionToSummed;
    return this;
  }
  private java.math.BigDecimal fcurNetLosses;
  public java.math.BigDecimal get_fcurNetLosses() {
    return fcurNetLosses;
  }
  public void set_fcurNetLosses(java.math.BigDecimal fcurNetLosses) {
    this.fcurNetLosses = fcurNetLosses;
  }
  public tblnz_rtnnitsup with_fcurNetLosses(java.math.BigDecimal fcurNetLosses) {
    this.fcurNetLosses = fcurNetLosses;
    return this;
  }
  private java.math.BigDecimal fcurLossClaimed;
  public java.math.BigDecimal get_fcurLossClaimed() {
    return fcurLossClaimed;
  }
  public void set_fcurLossClaimed(java.math.BigDecimal fcurLossClaimed) {
    this.fcurLossClaimed = fcurLossClaimed;
  }
  public tblnz_rtnnitsup with_fcurLossClaimed(java.math.BigDecimal fcurLossClaimed) {
    this.fcurLossClaimed = fcurLossClaimed;
    return this;
  }
  private java.math.BigDecimal fcurTaxableIncome;
  public java.math.BigDecimal get_fcurTaxableIncome() {
    return fcurTaxableIncome;
  }
  public void set_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
  }
  public tblnz_rtnnitsup with_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
    return this;
  }
  private java.math.BigDecimal fcurTaxPayable;
  public java.math.BigDecimal get_fcurTaxPayable() {
    return fcurTaxPayable;
  }
  public void set_fcurTaxPayable(java.math.BigDecimal fcurTaxPayable) {
    this.fcurTaxPayable = fcurTaxPayable;
  }
  public tblnz_rtnnitsup with_fcurTaxPayable(java.math.BigDecimal fcurTaxPayable) {
    this.fcurTaxPayable = fcurTaxPayable;
    return this;
  }
  private Integer fblnDisclosureRequired;
  public Integer get_fblnDisclosureRequired() {
    return fblnDisclosureRequired;
  }
  public void set_fblnDisclosureRequired(Integer fblnDisclosureRequired) {
    this.fblnDisclosureRequired = fblnDisclosureRequired;
  }
  public tblnz_rtnnitsup with_fblnDisclosureRequired(Integer fblnDisclosureRequired) {
    this.fblnDisclosureRequired = fblnDisclosureRequired;
    return this;
  }
  private java.math.BigDecimal fcurDisposedInvestments;
  public java.math.BigDecimal get_fcurDisposedInvestments() {
    return fcurDisposedInvestments;
  }
  public void set_fcurDisposedInvestments(java.math.BigDecimal fcurDisposedInvestments) {
    this.fcurDisposedInvestments = fcurDisposedInvestments;
  }
  public tblnz_rtnnitsup with_fcurDisposedInvestments(java.math.BigDecimal fcurDisposedInvestments) {
    this.fcurDisposedInvestments = fcurDisposedInvestments;
    return this;
  }
  private Integer fblnGainsOnTaxableAccount;
  public Integer get_fblnGainsOnTaxableAccount() {
    return fblnGainsOnTaxableAccount;
  }
  public void set_fblnGainsOnTaxableAccount(Integer fblnGainsOnTaxableAccount) {
    this.fblnGainsOnTaxableAccount = fblnGainsOnTaxableAccount;
  }
  public tblnz_rtnnitsup with_fblnGainsOnTaxableAccount(Integer fblnGainsOnTaxableAccount) {
    this.fblnGainsOnTaxableAccount = fblnGainsOnTaxableAccount;
    return this;
  }
  private Integer fblnFundInvestments;
  public Integer get_fblnFundInvestments() {
    return fblnFundInvestments;
  }
  public void set_fblnFundInvestments(Integer fblnFundInvestments) {
    this.fblnFundInvestments = fblnFundInvestments;
  }
  public tblnz_rtnnitsup with_fblnFundInvestments(Integer fblnFundInvestments) {
    this.fblnFundInvestments = fblnFundInvestments;
    return this;
  }
  private Integer fblnInvestmentsDisposed;
  public Integer get_fblnInvestmentsDisposed() {
    return fblnInvestmentsDisposed;
  }
  public void set_fblnInvestmentsDisposed(Integer fblnInvestmentsDisposed) {
    this.fblnInvestmentsDisposed = fblnInvestmentsDisposed;
  }
  public tblnz_rtnnitsup with_fblnInvestmentsDisposed(Integer fblnInvestmentsDisposed) {
    this.fblnInvestmentsDisposed = fblnInvestmentsDisposed;
    return this;
  }
  private Integer fblnTradingStock;
  public Integer get_fblnTradingStock() {
    return fblnTradingStock;
  }
  public void set_fblnTradingStock(Integer fblnTradingStock) {
    this.fblnTradingStock = fblnTradingStock;
  }
  public tblnz_rtnnitsup with_fblnTradingStock(Integer fblnTradingStock) {
    this.fblnTradingStock = fblnTradingStock;
    return this;
  }
  private java.math.BigDecimal fcurOverseasCredits;
  public java.math.BigDecimal get_fcurOverseasCredits() {
    return fcurOverseasCredits;
  }
  public void set_fcurOverseasCredits(java.math.BigDecimal fcurOverseasCredits) {
    this.fcurOverseasCredits = fcurOverseasCredits;
  }
  public tblnz_rtnnitsup with_fcurOverseasCredits(java.math.BigDecimal fcurOverseasCredits) {
    this.fcurOverseasCredits = fcurOverseasCredits;
    return this;
  }
  private java.math.BigDecimal fcurTaxPayableAfterOverseas;
  public java.math.BigDecimal get_fcurTaxPayableAfterOverseas() {
    return fcurTaxPayableAfterOverseas;
  }
  public void set_fcurTaxPayableAfterOverseas(java.math.BigDecimal fcurTaxPayableAfterOverseas) {
    this.fcurTaxPayableAfterOverseas = fcurTaxPayableAfterOverseas;
  }
  public tblnz_rtnnitsup with_fcurTaxPayableAfterOverseas(java.math.BigDecimal fcurTaxPayableAfterOverseas) {
    this.fcurTaxPayableAfterOverseas = fcurTaxPayableAfterOverseas;
    return this;
  }
  private java.math.BigDecimal fcurImputationCredits;
  public java.math.BigDecimal get_fcurImputationCredits() {
    return fcurImputationCredits;
  }
  public void set_fcurImputationCredits(java.math.BigDecimal fcurImputationCredits) {
    this.fcurImputationCredits = fcurImputationCredits;
  }
  public tblnz_rtnnitsup with_fcurImputationCredits(java.math.BigDecimal fcurImputationCredits) {
    this.fcurImputationCredits = fcurImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurTaxPayableAfterImputation;
  public java.math.BigDecimal get_fcurTaxPayableAfterImputation() {
    return fcurTaxPayableAfterImputation;
  }
  public void set_fcurTaxPayableAfterImputation(java.math.BigDecimal fcurTaxPayableAfterImputation) {
    this.fcurTaxPayableAfterImputation = fcurTaxPayableAfterImputation;
  }
  public tblnz_rtnnitsup with_fcurTaxPayableAfterImputation(java.math.BigDecimal fcurTaxPayableAfterImputation) {
    this.fcurTaxPayableAfterImputation = fcurTaxPayableAfterImputation;
    return this;
  }
  private java.math.BigDecimal fcurExcessImputationCredits;
  public java.math.BigDecimal get_fcurExcessImputationCredits() {
    return fcurExcessImputationCredits;
  }
  public void set_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
  }
  public tblnz_rtnnitsup with_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
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
  public tblnz_rtnnitsup with_fcurExcessImputationAsLoss(java.math.BigDecimal fcurExcessImputationAsLoss) {
    this.fcurExcessImputationAsLoss = fcurExcessImputationAsLoss;
    return this;
  }
  private java.math.BigDecimal fcurRWT;
  public java.math.BigDecimal get_fcurRWT() {
    return fcurRWT;
  }
  public void set_fcurRWT(java.math.BigDecimal fcurRWT) {
    this.fcurRWT = fcurRWT;
  }
  public tblnz_rtnnitsup with_fcurRWT(java.math.BigDecimal fcurRWT) {
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
  public tblnz_rtnnitsup with_fcurRLWT(java.math.BigDecimal fcurRLWT) {
    this.fcurRLWT = fcurRLWT;
    return this;
  }
  private java.math.BigDecimal fcurLossToCarryForward;
  public java.math.BigDecimal get_fcurLossToCarryForward() {
    return fcurLossToCarryForward;
  }
  public void set_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
  }
  public tblnz_rtnnitsup with_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
    return this;
  }
  private java.math.BigDecimal fcurResidualIncomeTax;
  public java.math.BigDecimal get_fcurResidualIncomeTax() {
    return fcurResidualIncomeTax;
  }
  public void set_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
  }
  public tblnz_rtnnitsup with_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
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
  public tblnz_rtnnitsup with_fcurProvisionalTaxPaid(java.math.BigDecimal fcurProvisionalTaxPaid) {
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
  public tblnz_rtnnitsup with_fcurTaxAmount(java.math.BigDecimal fcurTaxAmount) {
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
  public tblnz_rtnnitsup with_fcurOverpaymentProvisional(java.math.BigDecimal fcurOverpaymentProvisional) {
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
  public tblnz_rtnnitsup with_fcurRefundAfterOverpayment(java.math.BigDecimal fcurRefundAfterOverpayment) {
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
  public tblnz_rtnnitsup with_fcurTransferProvisional(java.math.BigDecimal fcurTransferProvisional) {
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
  public tblnz_rtnnitsup with_fcurTransferCustomerAmount(java.math.BigDecimal fcurTransferCustomerAmount) {
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
  public tblnz_rtnnitsup with_fcurTotalRefund(java.math.BigDecimal fcurTotalRefund) {
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
  public tblnz_rtnnitsup with_fdtmProvisionalStartDate(java.sql.Timestamp fdtmProvisionalStartDate) {
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
  public tblnz_rtnnitsup with_fstrProvisionalOption(String fstrProvisionalOption) {
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
  public tblnz_rtnnitsup with_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
    this.fcurProvisionalTax = fcurProvisionalTax;
    return this;
  }
  private java.math.BigDecimal fcurRDICarryForwardCurrentYear;
  public java.math.BigDecimal get_fcurRDICarryForwardCurrentYear() {
    return fcurRDICarryForwardCurrentYear;
  }
  public void set_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
    this.fcurRDICarryForwardCurrentYear = fcurRDICarryForwardCurrentYear;
  }
  public tblnz_rtnnitsup with_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
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
  public tblnz_rtnnitsup with_fcurRDICarryForwardRemaining(java.math.BigDecimal fcurRDICarryForwardRemaining) {
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
  public tblnz_rtnnitsup with_fcurPropertyProfitLoss(java.math.BigDecimal fcurPropertyProfitLoss) {
    this.fcurPropertyProfitLoss = fcurPropertyProfitLoss;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnnitsup with_fstrWho(String fstrWho) {
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
  public tblnz_rtnnitsup with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitsup)) {
      return false;
    }
    tblnz_rtnnitsup that = (tblnz_rtnnitsup) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurFundsIncome == null ? that.fcurFundsIncome == null : this.fcurFundsIncome.equals(that.fcurFundsIncome));
    equal = equal && (this.fcurTotalDeductionFromAmount == null ? that.fcurTotalDeductionFromAmount == null : this.fcurTotalDeductionFromAmount.equals(that.fcurTotalDeductionFromAmount));
    equal = equal && (this.fcurDeductionFromCapital == null ? that.fcurDeductionFromCapital == null : this.fcurDeductionFromCapital.equals(that.fcurDeductionFromCapital));
    equal = equal && (this.fcurDeductionFromRevenue == null ? that.fcurDeductionFromRevenue == null : this.fcurDeductionFromRevenue.equals(that.fcurDeductionFromRevenue));
    equal = equal && (this.fcurDeductionFromSummed == null ? that.fcurDeductionFromSummed == null : this.fcurDeductionFromSummed.equals(that.fcurDeductionFromSummed));
    equal = equal && (this.fcurDeductionFromSubtracted == null ? that.fcurDeductionFromSubtracted == null : this.fcurDeductionFromSubtracted.equals(that.fcurDeductionFromSubtracted));
    equal = equal && (this.fcurTotalDeductionToAmount == null ? that.fcurTotalDeductionToAmount == null : this.fcurTotalDeductionToAmount.equals(that.fcurTotalDeductionToAmount));
    equal = equal && (this.fcurDeductionToCapital == null ? that.fcurDeductionToCapital == null : this.fcurDeductionToCapital.equals(that.fcurDeductionToCapital));
    equal = equal && (this.fcurDeductionToRevenue == null ? that.fcurDeductionToRevenue == null : this.fcurDeductionToRevenue.equals(that.fcurDeductionToRevenue));
    equal = equal && (this.fcurDeductionToSummed == null ? that.fcurDeductionToSummed == null : this.fcurDeductionToSummed.equals(that.fcurDeductionToSummed));
    equal = equal && (this.fcurNetLosses == null ? that.fcurNetLosses == null : this.fcurNetLosses.equals(that.fcurNetLosses));
    equal = equal && (this.fcurLossClaimed == null ? that.fcurLossClaimed == null : this.fcurLossClaimed.equals(that.fcurLossClaimed));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurTaxPayable == null ? that.fcurTaxPayable == null : this.fcurTaxPayable.equals(that.fcurTaxPayable));
    equal = equal && (this.fblnDisclosureRequired == null ? that.fblnDisclosureRequired == null : this.fblnDisclosureRequired.equals(that.fblnDisclosureRequired));
    equal = equal && (this.fcurDisposedInvestments == null ? that.fcurDisposedInvestments == null : this.fcurDisposedInvestments.equals(that.fcurDisposedInvestments));
    equal = equal && (this.fblnGainsOnTaxableAccount == null ? that.fblnGainsOnTaxableAccount == null : this.fblnGainsOnTaxableAccount.equals(that.fblnGainsOnTaxableAccount));
    equal = equal && (this.fblnFundInvestments == null ? that.fblnFundInvestments == null : this.fblnFundInvestments.equals(that.fblnFundInvestments));
    equal = equal && (this.fblnInvestmentsDisposed == null ? that.fblnInvestmentsDisposed == null : this.fblnInvestmentsDisposed.equals(that.fblnInvestmentsDisposed));
    equal = equal && (this.fblnTradingStock == null ? that.fblnTradingStock == null : this.fblnTradingStock.equals(that.fblnTradingStock));
    equal = equal && (this.fcurOverseasCredits == null ? that.fcurOverseasCredits == null : this.fcurOverseasCredits.equals(that.fcurOverseasCredits));
    equal = equal && (this.fcurTaxPayableAfterOverseas == null ? that.fcurTaxPayableAfterOverseas == null : this.fcurTaxPayableAfterOverseas.equals(that.fcurTaxPayableAfterOverseas));
    equal = equal && (this.fcurImputationCredits == null ? that.fcurImputationCredits == null : this.fcurImputationCredits.equals(that.fcurImputationCredits));
    equal = equal && (this.fcurTaxPayableAfterImputation == null ? that.fcurTaxPayableAfterImputation == null : this.fcurTaxPayableAfterImputation.equals(that.fcurTaxPayableAfterImputation));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurExcessImputationAsLoss == null ? that.fcurExcessImputationAsLoss == null : this.fcurExcessImputationAsLoss.equals(that.fcurExcessImputationAsLoss));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
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
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurPropertyProfitLoss == null ? that.fcurPropertyProfitLoss == null : this.fcurPropertyProfitLoss.equals(that.fcurPropertyProfitLoss));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitsup)) {
      return false;
    }
    tblnz_rtnnitsup that = (tblnz_rtnnitsup) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurFundsIncome == null ? that.fcurFundsIncome == null : this.fcurFundsIncome.equals(that.fcurFundsIncome));
    equal = equal && (this.fcurTotalDeductionFromAmount == null ? that.fcurTotalDeductionFromAmount == null : this.fcurTotalDeductionFromAmount.equals(that.fcurTotalDeductionFromAmount));
    equal = equal && (this.fcurDeductionFromCapital == null ? that.fcurDeductionFromCapital == null : this.fcurDeductionFromCapital.equals(that.fcurDeductionFromCapital));
    equal = equal && (this.fcurDeductionFromRevenue == null ? that.fcurDeductionFromRevenue == null : this.fcurDeductionFromRevenue.equals(that.fcurDeductionFromRevenue));
    equal = equal && (this.fcurDeductionFromSummed == null ? that.fcurDeductionFromSummed == null : this.fcurDeductionFromSummed.equals(that.fcurDeductionFromSummed));
    equal = equal && (this.fcurDeductionFromSubtracted == null ? that.fcurDeductionFromSubtracted == null : this.fcurDeductionFromSubtracted.equals(that.fcurDeductionFromSubtracted));
    equal = equal && (this.fcurTotalDeductionToAmount == null ? that.fcurTotalDeductionToAmount == null : this.fcurTotalDeductionToAmount.equals(that.fcurTotalDeductionToAmount));
    equal = equal && (this.fcurDeductionToCapital == null ? that.fcurDeductionToCapital == null : this.fcurDeductionToCapital.equals(that.fcurDeductionToCapital));
    equal = equal && (this.fcurDeductionToRevenue == null ? that.fcurDeductionToRevenue == null : this.fcurDeductionToRevenue.equals(that.fcurDeductionToRevenue));
    equal = equal && (this.fcurDeductionToSummed == null ? that.fcurDeductionToSummed == null : this.fcurDeductionToSummed.equals(that.fcurDeductionToSummed));
    equal = equal && (this.fcurNetLosses == null ? that.fcurNetLosses == null : this.fcurNetLosses.equals(that.fcurNetLosses));
    equal = equal && (this.fcurLossClaimed == null ? that.fcurLossClaimed == null : this.fcurLossClaimed.equals(that.fcurLossClaimed));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurTaxPayable == null ? that.fcurTaxPayable == null : this.fcurTaxPayable.equals(that.fcurTaxPayable));
    equal = equal && (this.fblnDisclosureRequired == null ? that.fblnDisclosureRequired == null : this.fblnDisclosureRequired.equals(that.fblnDisclosureRequired));
    equal = equal && (this.fcurDisposedInvestments == null ? that.fcurDisposedInvestments == null : this.fcurDisposedInvestments.equals(that.fcurDisposedInvestments));
    equal = equal && (this.fblnGainsOnTaxableAccount == null ? that.fblnGainsOnTaxableAccount == null : this.fblnGainsOnTaxableAccount.equals(that.fblnGainsOnTaxableAccount));
    equal = equal && (this.fblnFundInvestments == null ? that.fblnFundInvestments == null : this.fblnFundInvestments.equals(that.fblnFundInvestments));
    equal = equal && (this.fblnInvestmentsDisposed == null ? that.fblnInvestmentsDisposed == null : this.fblnInvestmentsDisposed.equals(that.fblnInvestmentsDisposed));
    equal = equal && (this.fblnTradingStock == null ? that.fblnTradingStock == null : this.fblnTradingStock.equals(that.fblnTradingStock));
    equal = equal && (this.fcurOverseasCredits == null ? that.fcurOverseasCredits == null : this.fcurOverseasCredits.equals(that.fcurOverseasCredits));
    equal = equal && (this.fcurTaxPayableAfterOverseas == null ? that.fcurTaxPayableAfterOverseas == null : this.fcurTaxPayableAfterOverseas.equals(that.fcurTaxPayableAfterOverseas));
    equal = equal && (this.fcurImputationCredits == null ? that.fcurImputationCredits == null : this.fcurImputationCredits.equals(that.fcurImputationCredits));
    equal = equal && (this.fcurTaxPayableAfterImputation == null ? that.fcurTaxPayableAfterImputation == null : this.fcurTaxPayableAfterImputation.equals(that.fcurTaxPayableAfterImputation));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurExcessImputationAsLoss == null ? that.fcurExcessImputationAsLoss == null : this.fcurExcessImputationAsLoss.equals(that.fcurExcessImputationAsLoss));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
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
    equal = equal && (this.fcurRDICarryForwardCurrentYear == null ? that.fcurRDICarryForwardCurrentYear == null : this.fcurRDICarryForwardCurrentYear.equals(that.fcurRDICarryForwardCurrentYear));
    equal = equal && (this.fcurRDICarryForwardRemaining == null ? that.fcurRDICarryForwardRemaining == null : this.fcurRDICarryForwardRemaining.equals(that.fcurRDICarryForwardRemaining));
    equal = equal && (this.fcurPropertyProfitLoss == null ? that.fcurPropertyProfitLoss == null : this.fcurPropertyProfitLoss.equals(that.fcurPropertyProfitLoss));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurFundsIncome = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurTotalDeductionFromAmount = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurDeductionFromCapital = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurDeductionFromRevenue = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDeductionFromSummed = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDeductionFromSubtracted = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalDeductionToAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurDeductionToCapital = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurDeductionToRevenue = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurDeductionToSummed = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurNetLosses = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLossClaimed = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTaxPayable = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fblnDisclosureRequired = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fcurDisposedInvestments = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnGainsOnTaxableAccount = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnFundInvestments = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnInvestmentsDisposed = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnTradingStock = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fcurOverseasCredits = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTaxPayableAfterOverseas = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurImputationCredits = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTaxPayableAfterImputation = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurExcessImputationAsLoss = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurOverpaymentProvisional = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurRefundAfterOverpayment = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(39, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(40, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurPropertyProfitLoss = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(45, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(46, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurFundsIncome = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurTotalDeductionFromAmount = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurDeductionFromCapital = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurDeductionFromRevenue = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDeductionFromSummed = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDeductionFromSubtracted = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalDeductionToAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurDeductionToCapital = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurDeductionToRevenue = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurDeductionToSummed = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurNetLosses = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLossClaimed = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTaxPayable = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fblnDisclosureRequired = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fcurDisposedInvestments = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnGainsOnTaxableAccount = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnFundInvestments = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnInvestmentsDisposed = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnTradingStock = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fcurOverseasCredits = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTaxPayableAfterOverseas = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurImputationCredits = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTaxPayableAfterImputation = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurExcessImputationAsLoss = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurOverpaymentProvisional = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurRefundAfterOverpayment = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(39, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(40, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurPropertyProfitLoss = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(45, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(46, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurFundsIncome, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDeductionFromAmount, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionFromCapital, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionFromRevenue, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionFromSummed, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionFromSubtracted, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDeductionToAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionToCapital, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionToRevenue, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionToSummed, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLosses, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossClaimed, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayable, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDisclosureRequired, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisposedInvestments, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGainsOnTaxableAccount, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFundInvestments, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInvestmentsDisposed, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTradingStock, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasCredits, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterOverseas, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredits, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterImputation, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationAsLoss, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvisional, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAfterOverpayment, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 39 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPropertyProfitLoss, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 46 + __off, 93, __dbStmt);
    return 46;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFundsIncome, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDeductionFromAmount, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionFromCapital, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionFromRevenue, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionFromSummed, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionFromSubtracted, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDeductionToAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionToCapital, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionToRevenue, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionToSummed, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLosses, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossClaimed, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayable, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDisclosureRequired, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisposedInvestments, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGainsOnTaxableAccount, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFundInvestments, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInvestmentsDisposed, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTradingStock, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasCredits, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterOverseas, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredits, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayableAfterImputation, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationAsLoss, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvisional, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAfterOverpayment, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 39 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPropertyProfitLoss, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 46 + __off, 93, __dbStmt);
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
        this.fcurFundsIncome = null;
    } else {
    this.fcurFundsIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalDeductionFromAmount = null;
    } else {
    this.fcurTotalDeductionFromAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductionFromCapital = null;
    } else {
    this.fcurDeductionFromCapital = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductionFromRevenue = null;
    } else {
    this.fcurDeductionFromRevenue = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductionFromSummed = null;
    } else {
    this.fcurDeductionFromSummed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductionFromSubtracted = null;
    } else {
    this.fcurDeductionFromSubtracted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalDeductionToAmount = null;
    } else {
    this.fcurTotalDeductionToAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductionToCapital = null;
    } else {
    this.fcurDeductionToCapital = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductionToRevenue = null;
    } else {
    this.fcurDeductionToRevenue = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductionToSummed = null;
    } else {
    this.fcurDeductionToSummed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetLosses = null;
    } else {
    this.fcurNetLosses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossClaimed = null;
    } else {
    this.fcurLossClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxableIncome = null;
    } else {
    this.fcurTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPayable = null;
    } else {
    this.fcurTaxPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDisclosureRequired = null;
    } else {
    this.fblnDisclosureRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDisposedInvestments = null;
    } else {
    this.fcurDisposedInvestments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnGainsOnTaxableAccount = null;
    } else {
    this.fblnGainsOnTaxableAccount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFundInvestments = null;
    } else {
    this.fblnFundInvestments = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInvestmentsDisposed = null;
    } else {
    this.fblnInvestmentsDisposed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTradingStock = null;
    } else {
    this.fblnTradingStock = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOverseasCredits = null;
    } else {
    this.fcurOverseasCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPayableAfterOverseas = null;
    } else {
    this.fcurTaxPayableAfterOverseas = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImputationCredits = null;
    } else {
    this.fcurImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPayableAfterImputation = null;
    } else {
    this.fcurTaxPayableAfterImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurLossToCarryForward = null;
    } else {
    this.fcurLossToCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurFundsIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFundsIncome, __dataOut);
    }
    if (null == this.fcurTotalDeductionFromAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDeductionFromAmount, __dataOut);
    }
    if (null == this.fcurDeductionFromCapital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionFromCapital, __dataOut);
    }
    if (null == this.fcurDeductionFromRevenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionFromRevenue, __dataOut);
    }
    if (null == this.fcurDeductionFromSummed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionFromSummed, __dataOut);
    }
    if (null == this.fcurDeductionFromSubtracted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionFromSubtracted, __dataOut);
    }
    if (null == this.fcurTotalDeductionToAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDeductionToAmount, __dataOut);
    }
    if (null == this.fcurDeductionToCapital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionToCapital, __dataOut);
    }
    if (null == this.fcurDeductionToRevenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionToRevenue, __dataOut);
    }
    if (null == this.fcurDeductionToSummed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionToSummed, __dataOut);
    }
    if (null == this.fcurNetLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLosses, __dataOut);
    }
    if (null == this.fcurLossClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossClaimed, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fcurTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayable, __dataOut);
    }
    if (null == this.fblnDisclosureRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDisclosureRequired);
    }
    if (null == this.fcurDisposedInvestments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisposedInvestments, __dataOut);
    }
    if (null == this.fblnGainsOnTaxableAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGainsOnTaxableAccount);
    }
    if (null == this.fblnFundInvestments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFundInvestments);
    }
    if (null == this.fblnInvestmentsDisposed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInvestmentsDisposed);
    }
    if (null == this.fblnTradingStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTradingStock);
    }
    if (null == this.fcurOverseasCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasCredits, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterOverseas, __dataOut);
    }
    if (null == this.fcurImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredits, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterImputation, __dataOut);
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
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
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
    if (null == this.fcurFundsIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFundsIncome, __dataOut);
    }
    if (null == this.fcurTotalDeductionFromAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDeductionFromAmount, __dataOut);
    }
    if (null == this.fcurDeductionFromCapital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionFromCapital, __dataOut);
    }
    if (null == this.fcurDeductionFromRevenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionFromRevenue, __dataOut);
    }
    if (null == this.fcurDeductionFromSummed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionFromSummed, __dataOut);
    }
    if (null == this.fcurDeductionFromSubtracted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionFromSubtracted, __dataOut);
    }
    if (null == this.fcurTotalDeductionToAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDeductionToAmount, __dataOut);
    }
    if (null == this.fcurDeductionToCapital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionToCapital, __dataOut);
    }
    if (null == this.fcurDeductionToRevenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionToRevenue, __dataOut);
    }
    if (null == this.fcurDeductionToSummed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionToSummed, __dataOut);
    }
    if (null == this.fcurNetLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLosses, __dataOut);
    }
    if (null == this.fcurLossClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossClaimed, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fcurTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayable, __dataOut);
    }
    if (null == this.fblnDisclosureRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDisclosureRequired);
    }
    if (null == this.fcurDisposedInvestments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisposedInvestments, __dataOut);
    }
    if (null == this.fblnGainsOnTaxableAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGainsOnTaxableAccount);
    }
    if (null == this.fblnFundInvestments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFundInvestments);
    }
    if (null == this.fblnInvestmentsDisposed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInvestmentsDisposed);
    }
    if (null == this.fblnTradingStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTradingStock);
    }
    if (null == this.fcurOverseasCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasCredits, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterOverseas, __dataOut);
    }
    if (null == this.fcurImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredits, __dataOut);
    }
    if (null == this.fcurTaxPayableAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayableAfterImputation, __dataOut);
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
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFundsIncome==null?"\\N":fcurFundsIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDeductionFromAmount==null?"\\N":fcurTotalDeductionFromAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionFromCapital==null?"\\N":fcurDeductionFromCapital.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionFromRevenue==null?"\\N":fcurDeductionFromRevenue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionFromSummed==null?"\\N":fcurDeductionFromSummed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionFromSubtracted==null?"\\N":fcurDeductionFromSubtracted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDeductionToAmount==null?"\\N":fcurTotalDeductionToAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionToCapital==null?"\\N":fcurDeductionToCapital.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionToRevenue==null?"\\N":fcurDeductionToRevenue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionToSummed==null?"\\N":fcurDeductionToSummed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLosses==null?"\\N":fcurNetLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossClaimed==null?"\\N":fcurLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayable==null?"\\N":fcurTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDisclosureRequired==null?"\\N":"" + fblnDisclosureRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisposedInvestments==null?"\\N":fcurDisposedInvestments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGainsOnTaxableAccount==null?"\\N":"" + fblnGainsOnTaxableAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFundInvestments==null?"\\N":"" + fblnFundInvestments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInvestmentsDisposed==null?"\\N":"" + fblnInvestmentsDisposed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTradingStock==null?"\\N":"" + fblnTradingStock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasCredits==null?"\\N":fcurOverseasCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterOverseas==null?"\\N":fcurTaxPayableAfterOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredits==null?"\\N":fcurImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterImputation==null?"\\N":fcurTaxPayableAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationAsLoss==null?"\\N":fcurExcessImputationAsLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWT==null?"\\N":fcurRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardCurrentYear==null?"\\N":fcurRDICarryForwardCurrentYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPropertyProfitLoss==null?"\\N":fcurPropertyProfitLoss.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFundsIncome==null?"\\N":fcurFundsIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDeductionFromAmount==null?"\\N":fcurTotalDeductionFromAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionFromCapital==null?"\\N":fcurDeductionFromCapital.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionFromRevenue==null?"\\N":fcurDeductionFromRevenue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionFromSummed==null?"\\N":fcurDeductionFromSummed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionFromSubtracted==null?"\\N":fcurDeductionFromSubtracted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDeductionToAmount==null?"\\N":fcurTotalDeductionToAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionToCapital==null?"\\N":fcurDeductionToCapital.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionToRevenue==null?"\\N":fcurDeductionToRevenue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionToSummed==null?"\\N":fcurDeductionToSummed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLosses==null?"\\N":fcurNetLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossClaimed==null?"\\N":fcurLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayable==null?"\\N":fcurTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDisclosureRequired==null?"\\N":"" + fblnDisclosureRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisposedInvestments==null?"\\N":fcurDisposedInvestments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGainsOnTaxableAccount==null?"\\N":"" + fblnGainsOnTaxableAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFundInvestments==null?"\\N":"" + fblnFundInvestments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInvestmentsDisposed==null?"\\N":"" + fblnInvestmentsDisposed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTradingStock==null?"\\N":"" + fblnTradingStock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasCredits==null?"\\N":fcurOverseasCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterOverseas==null?"\\N":fcurTaxPayableAfterOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredits==null?"\\N":fcurImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayableAfterImputation==null?"\\N":fcurTaxPayableAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationAsLoss==null?"\\N":fcurExcessImputationAsLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWT==null?"\\N":fcurRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardCurrentYear==null?"\\N":fcurRDICarryForwardCurrentYear.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDICarryForwardRemaining==null?"\\N":fcurRDICarryForwardRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPropertyProfitLoss==null?"\\N":fcurPropertyProfitLoss.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFundsIncome = null; } else {
      this.fcurFundsIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDeductionFromAmount = null; } else {
      this.fcurTotalDeductionFromAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionFromCapital = null; } else {
      this.fcurDeductionFromCapital = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionFromRevenue = null; } else {
      this.fcurDeductionFromRevenue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionFromSummed = null; } else {
      this.fcurDeductionFromSummed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionFromSubtracted = null; } else {
      this.fcurDeductionFromSubtracted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDeductionToAmount = null; } else {
      this.fcurTotalDeductionToAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionToCapital = null; } else {
      this.fcurDeductionToCapital = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionToRevenue = null; } else {
      this.fcurDeductionToRevenue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionToSummed = null; } else {
      this.fcurDeductionToSummed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLosses = null; } else {
      this.fcurNetLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossClaimed = null; } else {
      this.fcurLossClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayable = null; } else {
      this.fcurTaxPayable = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisposedInvestments = null; } else {
      this.fcurDisposedInvestments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGainsOnTaxableAccount = null; } else {
      this.fblnGainsOnTaxableAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFundInvestments = null; } else {
      this.fblnFundInvestments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInvestmentsDisposed = null; } else {
      this.fblnInvestmentsDisposed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTradingStock = null; } else {
      this.fblnTradingStock = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverseasCredits = null; } else {
      this.fcurOverseasCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableAfterOverseas = null; } else {
      this.fcurTaxPayableAfterOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredits = null; } else {
      this.fcurImputationCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFundsIncome = null; } else {
      this.fcurFundsIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDeductionFromAmount = null; } else {
      this.fcurTotalDeductionFromAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionFromCapital = null; } else {
      this.fcurDeductionFromCapital = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionFromRevenue = null; } else {
      this.fcurDeductionFromRevenue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionFromSummed = null; } else {
      this.fcurDeductionFromSummed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionFromSubtracted = null; } else {
      this.fcurDeductionFromSubtracted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDeductionToAmount = null; } else {
      this.fcurTotalDeductionToAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionToCapital = null; } else {
      this.fcurDeductionToCapital = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionToRevenue = null; } else {
      this.fcurDeductionToRevenue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionToSummed = null; } else {
      this.fcurDeductionToSummed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLosses = null; } else {
      this.fcurNetLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossClaimed = null; } else {
      this.fcurLossClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayable = null; } else {
      this.fcurTaxPayable = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisposedInvestments = null; } else {
      this.fcurDisposedInvestments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGainsOnTaxableAccount = null; } else {
      this.fblnGainsOnTaxableAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFundInvestments = null; } else {
      this.fblnFundInvestments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInvestmentsDisposed = null; } else {
      this.fblnInvestmentsDisposed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTradingStock = null; } else {
      this.fblnTradingStock = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverseasCredits = null; } else {
      this.fcurOverseasCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayableAfterOverseas = null; } else {
      this.fcurTaxPayableAfterOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredits = null; } else {
      this.fcurImputationCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnnitsup o = (tblnz_rtnnitsup) super.clone();
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnitsup o) throws CloneNotSupportedException {
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurFundsIncome", this.fcurFundsIncome);
    __sqoop$field_map.put("fcurTotalDeductionFromAmount", this.fcurTotalDeductionFromAmount);
    __sqoop$field_map.put("fcurDeductionFromCapital", this.fcurDeductionFromCapital);
    __sqoop$field_map.put("fcurDeductionFromRevenue", this.fcurDeductionFromRevenue);
    __sqoop$field_map.put("fcurDeductionFromSummed", this.fcurDeductionFromSummed);
    __sqoop$field_map.put("fcurDeductionFromSubtracted", this.fcurDeductionFromSubtracted);
    __sqoop$field_map.put("fcurTotalDeductionToAmount", this.fcurTotalDeductionToAmount);
    __sqoop$field_map.put("fcurDeductionToCapital", this.fcurDeductionToCapital);
    __sqoop$field_map.put("fcurDeductionToRevenue", this.fcurDeductionToRevenue);
    __sqoop$field_map.put("fcurDeductionToSummed", this.fcurDeductionToSummed);
    __sqoop$field_map.put("fcurNetLosses", this.fcurNetLosses);
    __sqoop$field_map.put("fcurLossClaimed", this.fcurLossClaimed);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurTaxPayable", this.fcurTaxPayable);
    __sqoop$field_map.put("fblnDisclosureRequired", this.fblnDisclosureRequired);
    __sqoop$field_map.put("fcurDisposedInvestments", this.fcurDisposedInvestments);
    __sqoop$field_map.put("fblnGainsOnTaxableAccount", this.fblnGainsOnTaxableAccount);
    __sqoop$field_map.put("fblnFundInvestments", this.fblnFundInvestments);
    __sqoop$field_map.put("fblnInvestmentsDisposed", this.fblnInvestmentsDisposed);
    __sqoop$field_map.put("fblnTradingStock", this.fblnTradingStock);
    __sqoop$field_map.put("fcurOverseasCredits", this.fcurOverseasCredits);
    __sqoop$field_map.put("fcurTaxPayableAfterOverseas", this.fcurTaxPayableAfterOverseas);
    __sqoop$field_map.put("fcurImputationCredits", this.fcurImputationCredits);
    __sqoop$field_map.put("fcurTaxPayableAfterImputation", this.fcurTaxPayableAfterImputation);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurExcessImputationAsLoss", this.fcurExcessImputationAsLoss);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
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
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurPropertyProfitLoss", this.fcurPropertyProfitLoss);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurFundsIncome", this.fcurFundsIncome);
    __sqoop$field_map.put("fcurTotalDeductionFromAmount", this.fcurTotalDeductionFromAmount);
    __sqoop$field_map.put("fcurDeductionFromCapital", this.fcurDeductionFromCapital);
    __sqoop$field_map.put("fcurDeductionFromRevenue", this.fcurDeductionFromRevenue);
    __sqoop$field_map.put("fcurDeductionFromSummed", this.fcurDeductionFromSummed);
    __sqoop$field_map.put("fcurDeductionFromSubtracted", this.fcurDeductionFromSubtracted);
    __sqoop$field_map.put("fcurTotalDeductionToAmount", this.fcurTotalDeductionToAmount);
    __sqoop$field_map.put("fcurDeductionToCapital", this.fcurDeductionToCapital);
    __sqoop$field_map.put("fcurDeductionToRevenue", this.fcurDeductionToRevenue);
    __sqoop$field_map.put("fcurDeductionToSummed", this.fcurDeductionToSummed);
    __sqoop$field_map.put("fcurNetLosses", this.fcurNetLosses);
    __sqoop$field_map.put("fcurLossClaimed", this.fcurLossClaimed);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurTaxPayable", this.fcurTaxPayable);
    __sqoop$field_map.put("fblnDisclosureRequired", this.fblnDisclosureRequired);
    __sqoop$field_map.put("fcurDisposedInvestments", this.fcurDisposedInvestments);
    __sqoop$field_map.put("fblnGainsOnTaxableAccount", this.fblnGainsOnTaxableAccount);
    __sqoop$field_map.put("fblnFundInvestments", this.fblnFundInvestments);
    __sqoop$field_map.put("fblnInvestmentsDisposed", this.fblnInvestmentsDisposed);
    __sqoop$field_map.put("fblnTradingStock", this.fblnTradingStock);
    __sqoop$field_map.put("fcurOverseasCredits", this.fcurOverseasCredits);
    __sqoop$field_map.put("fcurTaxPayableAfterOverseas", this.fcurTaxPayableAfterOverseas);
    __sqoop$field_map.put("fcurImputationCredits", this.fcurImputationCredits);
    __sqoop$field_map.put("fcurTaxPayableAfterImputation", this.fcurTaxPayableAfterImputation);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurExcessImputationAsLoss", this.fcurExcessImputationAsLoss);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
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
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurPropertyProfitLoss", this.fcurPropertyProfitLoss);
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
