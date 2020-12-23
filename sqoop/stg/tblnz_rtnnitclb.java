// ORM class for table 'tblnz_rtnnitclb'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:48:17 NZDT 2020
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

public class tblnz_rtnnitclb extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnFriendlySociety", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fblnFriendlySociety = (Integer)value;
      }
    });
    setters.put("fcurFriendlyNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurFriendlyNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnSpecific", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fblnSpecific = (Integer)value;
      }
    });
    setters.put("fcurExemptInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurExemptInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExemptDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurExemptDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExemptMaoriAuthority", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurExemptMaoriAuthority = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExemptOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurExemptOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExemptTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurExemptTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fblnOther = (Integer)value;
      }
    });
    setters.put("fcurOtherInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurOtherInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurOtherDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherMaoriAuthority", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurOtherMaoriAuthority = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurOtherOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurOtherTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonProfitCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurNonProfitCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncomeAfterNonProfit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTotalIncomeAfterNonProfit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetIncomeBeforeDonations", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurNetIncomeBeforeDonations = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDonationDeduction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurDonationDeduction = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLossBroughtForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurNetLossBroughtForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnIncorporated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fblnIncorporated = (Integer)value;
      }
    });
    setters.put("fcurTaxOnAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTaxOnAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurOverseasTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfterOverseas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTaxAfterOverseas = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImputationBroughtForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurImputationBroughtForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTotalImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurExcessImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImpCreditsCarryFwd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurExcessImpCreditsCarryFwd = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExcessImpCreditsAsLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurExcessImpCreditsAsLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfterImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTaxAfterImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalLossToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTotalLossToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRLWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurRLWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfterRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTaxAfterRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurOtherTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResidualIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurResidualIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionalTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurProvisionalTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTaxAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverpaymentProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurOverpaymentProvisional = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefundAfterOverpayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurRefundAfterOverpayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTransferProvisional = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransferCustomerAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTransferCustomerAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurTotalRefund = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmProvisionalStartDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fdtmProvisionalStartDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrProvisionalOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fstrProvisionalOption = (String)value;
      }
    });
    setters.put("fcurProvisionalTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurProvisionalTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrResMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fstrResMethod = (String)value;
      }
    });
    setters.put("fcurResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsPriorYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurResDeductionsPriorYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurResDeductionsClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurResNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductionsForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurResDeductionsForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardCurrentYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurRDICarryForwardCurrentYear = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDICarryForwardRemaining", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurRDICarryForwardRemaining = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPropertyProfitLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fcurPropertyProfitLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitclb.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnnitclb() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnnitclb with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnFriendlySociety;
  public Integer get_fblnFriendlySociety() {
    return fblnFriendlySociety;
  }
  public void set_fblnFriendlySociety(Integer fblnFriendlySociety) {
    this.fblnFriendlySociety = fblnFriendlySociety;
  }
  public tblnz_rtnnitclb with_fblnFriendlySociety(Integer fblnFriendlySociety) {
    this.fblnFriendlySociety = fblnFriendlySociety;
    return this;
  }
  private java.math.BigDecimal fcurFriendlyNetIncome;
  public java.math.BigDecimal get_fcurFriendlyNetIncome() {
    return fcurFriendlyNetIncome;
  }
  public void set_fcurFriendlyNetIncome(java.math.BigDecimal fcurFriendlyNetIncome) {
    this.fcurFriendlyNetIncome = fcurFriendlyNetIncome;
  }
  public tblnz_rtnnitclb with_fcurFriendlyNetIncome(java.math.BigDecimal fcurFriendlyNetIncome) {
    this.fcurFriendlyNetIncome = fcurFriendlyNetIncome;
    return this;
  }
  private Integer fblnSpecific;
  public Integer get_fblnSpecific() {
    return fblnSpecific;
  }
  public void set_fblnSpecific(Integer fblnSpecific) {
    this.fblnSpecific = fblnSpecific;
  }
  public tblnz_rtnnitclb with_fblnSpecific(Integer fblnSpecific) {
    this.fblnSpecific = fblnSpecific;
    return this;
  }
  private java.math.BigDecimal fcurExemptInterest;
  public java.math.BigDecimal get_fcurExemptInterest() {
    return fcurExemptInterest;
  }
  public void set_fcurExemptInterest(java.math.BigDecimal fcurExemptInterest) {
    this.fcurExemptInterest = fcurExemptInterest;
  }
  public tblnz_rtnnitclb with_fcurExemptInterest(java.math.BigDecimal fcurExemptInterest) {
    this.fcurExemptInterest = fcurExemptInterest;
    return this;
  }
  private java.math.BigDecimal fcurExemptDividends;
  public java.math.BigDecimal get_fcurExemptDividends() {
    return fcurExemptDividends;
  }
  public void set_fcurExemptDividends(java.math.BigDecimal fcurExemptDividends) {
    this.fcurExemptDividends = fcurExemptDividends;
  }
  public tblnz_rtnnitclb with_fcurExemptDividends(java.math.BigDecimal fcurExemptDividends) {
    this.fcurExemptDividends = fcurExemptDividends;
    return this;
  }
  private java.math.BigDecimal fcurExemptMaoriAuthority;
  public java.math.BigDecimal get_fcurExemptMaoriAuthority() {
    return fcurExemptMaoriAuthority;
  }
  public void set_fcurExemptMaoriAuthority(java.math.BigDecimal fcurExemptMaoriAuthority) {
    this.fcurExemptMaoriAuthority = fcurExemptMaoriAuthority;
  }
  public tblnz_rtnnitclb with_fcurExemptMaoriAuthority(java.math.BigDecimal fcurExemptMaoriAuthority) {
    this.fcurExemptMaoriAuthority = fcurExemptMaoriAuthority;
    return this;
  }
  private java.math.BigDecimal fcurExemptOtherIncome;
  public java.math.BigDecimal get_fcurExemptOtherIncome() {
    return fcurExemptOtherIncome;
  }
  public void set_fcurExemptOtherIncome(java.math.BigDecimal fcurExemptOtherIncome) {
    this.fcurExemptOtherIncome = fcurExemptOtherIncome;
  }
  public tblnz_rtnnitclb with_fcurExemptOtherIncome(java.math.BigDecimal fcurExemptOtherIncome) {
    this.fcurExemptOtherIncome = fcurExemptOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurExemptTotalIncome;
  public java.math.BigDecimal get_fcurExemptTotalIncome() {
    return fcurExemptTotalIncome;
  }
  public void set_fcurExemptTotalIncome(java.math.BigDecimal fcurExemptTotalIncome) {
    this.fcurExemptTotalIncome = fcurExemptTotalIncome;
  }
  public tblnz_rtnnitclb with_fcurExemptTotalIncome(java.math.BigDecimal fcurExemptTotalIncome) {
    this.fcurExemptTotalIncome = fcurExemptTotalIncome;
    return this;
  }
  private Integer fblnOther;
  public Integer get_fblnOther() {
    return fblnOther;
  }
  public void set_fblnOther(Integer fblnOther) {
    this.fblnOther = fblnOther;
  }
  public tblnz_rtnnitclb with_fblnOther(Integer fblnOther) {
    this.fblnOther = fblnOther;
    return this;
  }
  private java.math.BigDecimal fcurOtherInterest;
  public java.math.BigDecimal get_fcurOtherInterest() {
    return fcurOtherInterest;
  }
  public void set_fcurOtherInterest(java.math.BigDecimal fcurOtherInterest) {
    this.fcurOtherInterest = fcurOtherInterest;
  }
  public tblnz_rtnnitclb with_fcurOtherInterest(java.math.BigDecimal fcurOtherInterest) {
    this.fcurOtherInterest = fcurOtherInterest;
    return this;
  }
  private java.math.BigDecimal fcurOtherDividends;
  public java.math.BigDecimal get_fcurOtherDividends() {
    return fcurOtherDividends;
  }
  public void set_fcurOtherDividends(java.math.BigDecimal fcurOtherDividends) {
    this.fcurOtherDividends = fcurOtherDividends;
  }
  public tblnz_rtnnitclb with_fcurOtherDividends(java.math.BigDecimal fcurOtherDividends) {
    this.fcurOtherDividends = fcurOtherDividends;
    return this;
  }
  private java.math.BigDecimal fcurOtherMaoriAuthority;
  public java.math.BigDecimal get_fcurOtherMaoriAuthority() {
    return fcurOtherMaoriAuthority;
  }
  public void set_fcurOtherMaoriAuthority(java.math.BigDecimal fcurOtherMaoriAuthority) {
    this.fcurOtherMaoriAuthority = fcurOtherMaoriAuthority;
  }
  public tblnz_rtnnitclb with_fcurOtherMaoriAuthority(java.math.BigDecimal fcurOtherMaoriAuthority) {
    this.fcurOtherMaoriAuthority = fcurOtherMaoriAuthority;
    return this;
  }
  private java.math.BigDecimal fcurOtherOtherIncome;
  public java.math.BigDecimal get_fcurOtherOtherIncome() {
    return fcurOtherOtherIncome;
  }
  public void set_fcurOtherOtherIncome(java.math.BigDecimal fcurOtherOtherIncome) {
    this.fcurOtherOtherIncome = fcurOtherOtherIncome;
  }
  public tblnz_rtnnitclb with_fcurOtherOtherIncome(java.math.BigDecimal fcurOtherOtherIncome) {
    this.fcurOtherOtherIncome = fcurOtherOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurOtherTotalIncome;
  public java.math.BigDecimal get_fcurOtherTotalIncome() {
    return fcurOtherTotalIncome;
  }
  public void set_fcurOtherTotalIncome(java.math.BigDecimal fcurOtherTotalIncome) {
    this.fcurOtherTotalIncome = fcurOtherTotalIncome;
  }
  public tblnz_rtnnitclb with_fcurOtherTotalIncome(java.math.BigDecimal fcurOtherTotalIncome) {
    this.fcurOtherTotalIncome = fcurOtherTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurNonProfitCredit;
  public java.math.BigDecimal get_fcurNonProfitCredit() {
    return fcurNonProfitCredit;
  }
  public void set_fcurNonProfitCredit(java.math.BigDecimal fcurNonProfitCredit) {
    this.fcurNonProfitCredit = fcurNonProfitCredit;
  }
  public tblnz_rtnnitclb with_fcurNonProfitCredit(java.math.BigDecimal fcurNonProfitCredit) {
    this.fcurNonProfitCredit = fcurNonProfitCredit;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncomeAfterNonProfit;
  public java.math.BigDecimal get_fcurTotalIncomeAfterNonProfit() {
    return fcurTotalIncomeAfterNonProfit;
  }
  public void set_fcurTotalIncomeAfterNonProfit(java.math.BigDecimal fcurTotalIncomeAfterNonProfit) {
    this.fcurTotalIncomeAfterNonProfit = fcurTotalIncomeAfterNonProfit;
  }
  public tblnz_rtnnitclb with_fcurTotalIncomeAfterNonProfit(java.math.BigDecimal fcurTotalIncomeAfterNonProfit) {
    this.fcurTotalIncomeAfterNonProfit = fcurTotalIncomeAfterNonProfit;
    return this;
  }
  private java.math.BigDecimal fcurNetIncomeBeforeDonations;
  public java.math.BigDecimal get_fcurNetIncomeBeforeDonations() {
    return fcurNetIncomeBeforeDonations;
  }
  public void set_fcurNetIncomeBeforeDonations(java.math.BigDecimal fcurNetIncomeBeforeDonations) {
    this.fcurNetIncomeBeforeDonations = fcurNetIncomeBeforeDonations;
  }
  public tblnz_rtnnitclb with_fcurNetIncomeBeforeDonations(java.math.BigDecimal fcurNetIncomeBeforeDonations) {
    this.fcurNetIncomeBeforeDonations = fcurNetIncomeBeforeDonations;
    return this;
  }
  private java.math.BigDecimal fcurDonationDeduction;
  public java.math.BigDecimal get_fcurDonationDeduction() {
    return fcurDonationDeduction;
  }
  public void set_fcurDonationDeduction(java.math.BigDecimal fcurDonationDeduction) {
    this.fcurDonationDeduction = fcurDonationDeduction;
  }
  public tblnz_rtnnitclb with_fcurDonationDeduction(java.math.BigDecimal fcurDonationDeduction) {
    this.fcurDonationDeduction = fcurDonationDeduction;
    return this;
  }
  private java.math.BigDecimal fcurNetIncome;
  public java.math.BigDecimal get_fcurNetIncome() {
    return fcurNetIncome;
  }
  public void set_fcurNetIncome(java.math.BigDecimal fcurNetIncome) {
    this.fcurNetIncome = fcurNetIncome;
  }
  public tblnz_rtnnitclb with_fcurNetIncome(java.math.BigDecimal fcurNetIncome) {
    this.fcurNetIncome = fcurNetIncome;
    return this;
  }
  private java.math.BigDecimal fcurNetLossBroughtForward;
  public java.math.BigDecimal get_fcurNetLossBroughtForward() {
    return fcurNetLossBroughtForward;
  }
  public void set_fcurNetLossBroughtForward(java.math.BigDecimal fcurNetLossBroughtForward) {
    this.fcurNetLossBroughtForward = fcurNetLossBroughtForward;
  }
  public tblnz_rtnnitclb with_fcurNetLossBroughtForward(java.math.BigDecimal fcurNetLossBroughtForward) {
    this.fcurNetLossBroughtForward = fcurNetLossBroughtForward;
    return this;
  }
  private java.math.BigDecimal fcurTaxableIncome;
  public java.math.BigDecimal get_fcurTaxableIncome() {
    return fcurTaxableIncome;
  }
  public void set_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
  }
  public tblnz_rtnnitclb with_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
    return this;
  }
  private Integer fblnIncorporated;
  public Integer get_fblnIncorporated() {
    return fblnIncorporated;
  }
  public void set_fblnIncorporated(Integer fblnIncorporated) {
    this.fblnIncorporated = fblnIncorporated;
  }
  public tblnz_rtnnitclb with_fblnIncorporated(Integer fblnIncorporated) {
    this.fblnIncorporated = fblnIncorporated;
    return this;
  }
  private java.math.BigDecimal fcurTaxOnAmount;
  public java.math.BigDecimal get_fcurTaxOnAmount() {
    return fcurTaxOnAmount;
  }
  public void set_fcurTaxOnAmount(java.math.BigDecimal fcurTaxOnAmount) {
    this.fcurTaxOnAmount = fcurTaxOnAmount;
  }
  public tblnz_rtnnitclb with_fcurTaxOnAmount(java.math.BigDecimal fcurTaxOnAmount) {
    this.fcurTaxOnAmount = fcurTaxOnAmount;
    return this;
  }
  private java.math.BigDecimal fcurOverseasTax;
  public java.math.BigDecimal get_fcurOverseasTax() {
    return fcurOverseasTax;
  }
  public void set_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
    this.fcurOverseasTax = fcurOverseasTax;
  }
  public tblnz_rtnnitclb with_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
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
  public tblnz_rtnnitclb with_fcurTaxAfterOverseas(java.math.BigDecimal fcurTaxAfterOverseas) {
    this.fcurTaxAfterOverseas = fcurTaxAfterOverseas;
    return this;
  }
  private java.math.BigDecimal fcurImputationCredits;
  public java.math.BigDecimal get_fcurImputationCredits() {
    return fcurImputationCredits;
  }
  public void set_fcurImputationCredits(java.math.BigDecimal fcurImputationCredits) {
    this.fcurImputationCredits = fcurImputationCredits;
  }
  public tblnz_rtnnitclb with_fcurImputationCredits(java.math.BigDecimal fcurImputationCredits) {
    this.fcurImputationCredits = fcurImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurImputationBroughtForward;
  public java.math.BigDecimal get_fcurImputationBroughtForward() {
    return fcurImputationBroughtForward;
  }
  public void set_fcurImputationBroughtForward(java.math.BigDecimal fcurImputationBroughtForward) {
    this.fcurImputationBroughtForward = fcurImputationBroughtForward;
  }
  public tblnz_rtnnitclb with_fcurImputationBroughtForward(java.math.BigDecimal fcurImputationBroughtForward) {
    this.fcurImputationBroughtForward = fcurImputationBroughtForward;
    return this;
  }
  private java.math.BigDecimal fcurTotalImputationCredits;
  public java.math.BigDecimal get_fcurTotalImputationCredits() {
    return fcurTotalImputationCredits;
  }
  public void set_fcurTotalImputationCredits(java.math.BigDecimal fcurTotalImputationCredits) {
    this.fcurTotalImputationCredits = fcurTotalImputationCredits;
  }
  public tblnz_rtnnitclb with_fcurTotalImputationCredits(java.math.BigDecimal fcurTotalImputationCredits) {
    this.fcurTotalImputationCredits = fcurTotalImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurExcessImputationCredits;
  public java.math.BigDecimal get_fcurExcessImputationCredits() {
    return fcurExcessImputationCredits;
  }
  public void set_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
  }
  public tblnz_rtnnitclb with_fcurExcessImputationCredits(java.math.BigDecimal fcurExcessImputationCredits) {
    this.fcurExcessImputationCredits = fcurExcessImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurExcessImpCreditsCarryFwd;
  public java.math.BigDecimal get_fcurExcessImpCreditsCarryFwd() {
    return fcurExcessImpCreditsCarryFwd;
  }
  public void set_fcurExcessImpCreditsCarryFwd(java.math.BigDecimal fcurExcessImpCreditsCarryFwd) {
    this.fcurExcessImpCreditsCarryFwd = fcurExcessImpCreditsCarryFwd;
  }
  public tblnz_rtnnitclb with_fcurExcessImpCreditsCarryFwd(java.math.BigDecimal fcurExcessImpCreditsCarryFwd) {
    this.fcurExcessImpCreditsCarryFwd = fcurExcessImpCreditsCarryFwd;
    return this;
  }
  private java.math.BigDecimal fcurExcessImpCreditsAsLoss;
  public java.math.BigDecimal get_fcurExcessImpCreditsAsLoss() {
    return fcurExcessImpCreditsAsLoss;
  }
  public void set_fcurExcessImpCreditsAsLoss(java.math.BigDecimal fcurExcessImpCreditsAsLoss) {
    this.fcurExcessImpCreditsAsLoss = fcurExcessImpCreditsAsLoss;
  }
  public tblnz_rtnnitclb with_fcurExcessImpCreditsAsLoss(java.math.BigDecimal fcurExcessImpCreditsAsLoss) {
    this.fcurExcessImpCreditsAsLoss = fcurExcessImpCreditsAsLoss;
    return this;
  }
  private java.math.BigDecimal fcurTaxAfterImputation;
  public java.math.BigDecimal get_fcurTaxAfterImputation() {
    return fcurTaxAfterImputation;
  }
  public void set_fcurTaxAfterImputation(java.math.BigDecimal fcurTaxAfterImputation) {
    this.fcurTaxAfterImputation = fcurTaxAfterImputation;
  }
  public tblnz_rtnnitclb with_fcurTaxAfterImputation(java.math.BigDecimal fcurTaxAfterImputation) {
    this.fcurTaxAfterImputation = fcurTaxAfterImputation;
    return this;
  }
  private java.math.BigDecimal fcurTotalLossToCarryForward;
  public java.math.BigDecimal get_fcurTotalLossToCarryForward() {
    return fcurTotalLossToCarryForward;
  }
  public void set_fcurTotalLossToCarryForward(java.math.BigDecimal fcurTotalLossToCarryForward) {
    this.fcurTotalLossToCarryForward = fcurTotalLossToCarryForward;
  }
  public tblnz_rtnnitclb with_fcurTotalLossToCarryForward(java.math.BigDecimal fcurTotalLossToCarryForward) {
    this.fcurTotalLossToCarryForward = fcurTotalLossToCarryForward;
    return this;
  }
  private java.math.BigDecimal fcurRWT;
  public java.math.BigDecimal get_fcurRWT() {
    return fcurRWT;
  }
  public void set_fcurRWT(java.math.BigDecimal fcurRWT) {
    this.fcurRWT = fcurRWT;
  }
  public tblnz_rtnnitclb with_fcurRWT(java.math.BigDecimal fcurRWT) {
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
  public tblnz_rtnnitclb with_fcurRLWT(java.math.BigDecimal fcurRLWT) {
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
  public tblnz_rtnnitclb with_fcurTaxAfterRWT(java.math.BigDecimal fcurTaxAfterRWT) {
    this.fcurTaxAfterRWT = fcurTaxAfterRWT;
    return this;
  }
  private java.math.BigDecimal fcurOtherTaxCredits;
  public java.math.BigDecimal get_fcurOtherTaxCredits() {
    return fcurOtherTaxCredits;
  }
  public void set_fcurOtherTaxCredits(java.math.BigDecimal fcurOtherTaxCredits) {
    this.fcurOtherTaxCredits = fcurOtherTaxCredits;
  }
  public tblnz_rtnnitclb with_fcurOtherTaxCredits(java.math.BigDecimal fcurOtherTaxCredits) {
    this.fcurOtherTaxCredits = fcurOtherTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurResidualIncomeTax;
  public java.math.BigDecimal get_fcurResidualIncomeTax() {
    return fcurResidualIncomeTax;
  }
  public void set_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
  }
  public tblnz_rtnnitclb with_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
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
  public tblnz_rtnnitclb with_fcurProvisionalTaxPaid(java.math.BigDecimal fcurProvisionalTaxPaid) {
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
  public tblnz_rtnnitclb with_fcurTaxAmount(java.math.BigDecimal fcurTaxAmount) {
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
  public tblnz_rtnnitclb with_fcurOverpaymentProvisional(java.math.BigDecimal fcurOverpaymentProvisional) {
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
  public tblnz_rtnnitclb with_fcurRefundAfterOverpayment(java.math.BigDecimal fcurRefundAfterOverpayment) {
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
  public tblnz_rtnnitclb with_fcurTransferProvisional(java.math.BigDecimal fcurTransferProvisional) {
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
  public tblnz_rtnnitclb with_fcurTransferCustomerAmount(java.math.BigDecimal fcurTransferCustomerAmount) {
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
  public tblnz_rtnnitclb with_fcurTotalRefund(java.math.BigDecimal fcurTotalRefund) {
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
  public tblnz_rtnnitclb with_fdtmProvisionalStartDate(java.sql.Timestamp fdtmProvisionalStartDate) {
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
  public tblnz_rtnnitclb with_fstrProvisionalOption(String fstrProvisionalOption) {
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
  public tblnz_rtnnitclb with_fcurProvisionalTax(java.math.BigDecimal fcurProvisionalTax) {
    this.fcurProvisionalTax = fcurProvisionalTax;
    return this;
  }
  private String fstrResMethod;
  public String get_fstrResMethod() {
    return fstrResMethod;
  }
  public void set_fstrResMethod(String fstrResMethod) {
    this.fstrResMethod = fstrResMethod;
  }
  public tblnz_rtnnitclb with_fstrResMethod(String fstrResMethod) {
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
  public tblnz_rtnnitclb with_fcurResIncome(java.math.BigDecimal fcurResIncome) {
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
  public tblnz_rtnnitclb with_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
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
  public tblnz_rtnnitclb with_fcurResDeductionsPriorYear(java.math.BigDecimal fcurResDeductionsPriorYear) {
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
  public tblnz_rtnnitclb with_fcurResDeductionsClaimed(java.math.BigDecimal fcurResDeductionsClaimed) {
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
  public tblnz_rtnnitclb with_fcurResNetIncome(java.math.BigDecimal fcurResNetIncome) {
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
  public tblnz_rtnnitclb with_fcurResDeductionsForward(java.math.BigDecimal fcurResDeductionsForward) {
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
  public tblnz_rtnnitclb with_fcurRDICarryForwardCurrentYear(java.math.BigDecimal fcurRDICarryForwardCurrentYear) {
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
  public tblnz_rtnnitclb with_fcurRDICarryForwardRemaining(java.math.BigDecimal fcurRDICarryForwardRemaining) {
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
  public tblnz_rtnnitclb with_fcurPropertyProfitLoss(java.math.BigDecimal fcurPropertyProfitLoss) {
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
  public tblnz_rtnnitclb with_fstrWho(String fstrWho) {
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
  public tblnz_rtnnitclb with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitclb)) {
      return false;
    }
    tblnz_rtnnitclb that = (tblnz_rtnnitclb) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnFriendlySociety == null ? that.fblnFriendlySociety == null : this.fblnFriendlySociety.equals(that.fblnFriendlySociety));
    equal = equal && (this.fcurFriendlyNetIncome == null ? that.fcurFriendlyNetIncome == null : this.fcurFriendlyNetIncome.equals(that.fcurFriendlyNetIncome));
    equal = equal && (this.fblnSpecific == null ? that.fblnSpecific == null : this.fblnSpecific.equals(that.fblnSpecific));
    equal = equal && (this.fcurExemptInterest == null ? that.fcurExemptInterest == null : this.fcurExemptInterest.equals(that.fcurExemptInterest));
    equal = equal && (this.fcurExemptDividends == null ? that.fcurExemptDividends == null : this.fcurExemptDividends.equals(that.fcurExemptDividends));
    equal = equal && (this.fcurExemptMaoriAuthority == null ? that.fcurExemptMaoriAuthority == null : this.fcurExemptMaoriAuthority.equals(that.fcurExemptMaoriAuthority));
    equal = equal && (this.fcurExemptOtherIncome == null ? that.fcurExemptOtherIncome == null : this.fcurExemptOtherIncome.equals(that.fcurExemptOtherIncome));
    equal = equal && (this.fcurExemptTotalIncome == null ? that.fcurExemptTotalIncome == null : this.fcurExemptTotalIncome.equals(that.fcurExemptTotalIncome));
    equal = equal && (this.fblnOther == null ? that.fblnOther == null : this.fblnOther.equals(that.fblnOther));
    equal = equal && (this.fcurOtherInterest == null ? that.fcurOtherInterest == null : this.fcurOtherInterest.equals(that.fcurOtherInterest));
    equal = equal && (this.fcurOtherDividends == null ? that.fcurOtherDividends == null : this.fcurOtherDividends.equals(that.fcurOtherDividends));
    equal = equal && (this.fcurOtherMaoriAuthority == null ? that.fcurOtherMaoriAuthority == null : this.fcurOtherMaoriAuthority.equals(that.fcurOtherMaoriAuthority));
    equal = equal && (this.fcurOtherOtherIncome == null ? that.fcurOtherOtherIncome == null : this.fcurOtherOtherIncome.equals(that.fcurOtherOtherIncome));
    equal = equal && (this.fcurOtherTotalIncome == null ? that.fcurOtherTotalIncome == null : this.fcurOtherTotalIncome.equals(that.fcurOtherTotalIncome));
    equal = equal && (this.fcurNonProfitCredit == null ? that.fcurNonProfitCredit == null : this.fcurNonProfitCredit.equals(that.fcurNonProfitCredit));
    equal = equal && (this.fcurTotalIncomeAfterNonProfit == null ? that.fcurTotalIncomeAfterNonProfit == null : this.fcurTotalIncomeAfterNonProfit.equals(that.fcurTotalIncomeAfterNonProfit));
    equal = equal && (this.fcurNetIncomeBeforeDonations == null ? that.fcurNetIncomeBeforeDonations == null : this.fcurNetIncomeBeforeDonations.equals(that.fcurNetIncomeBeforeDonations));
    equal = equal && (this.fcurDonationDeduction == null ? that.fcurDonationDeduction == null : this.fcurDonationDeduction.equals(that.fcurDonationDeduction));
    equal = equal && (this.fcurNetIncome == null ? that.fcurNetIncome == null : this.fcurNetIncome.equals(that.fcurNetIncome));
    equal = equal && (this.fcurNetLossBroughtForward == null ? that.fcurNetLossBroughtForward == null : this.fcurNetLossBroughtForward.equals(that.fcurNetLossBroughtForward));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fblnIncorporated == null ? that.fblnIncorporated == null : this.fblnIncorporated.equals(that.fblnIncorporated));
    equal = equal && (this.fcurTaxOnAmount == null ? that.fcurTaxOnAmount == null : this.fcurTaxOnAmount.equals(that.fcurTaxOnAmount));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurTaxAfterOverseas == null ? that.fcurTaxAfterOverseas == null : this.fcurTaxAfterOverseas.equals(that.fcurTaxAfterOverseas));
    equal = equal && (this.fcurImputationCredits == null ? that.fcurImputationCredits == null : this.fcurImputationCredits.equals(that.fcurImputationCredits));
    equal = equal && (this.fcurImputationBroughtForward == null ? that.fcurImputationBroughtForward == null : this.fcurImputationBroughtForward.equals(that.fcurImputationBroughtForward));
    equal = equal && (this.fcurTotalImputationCredits == null ? that.fcurTotalImputationCredits == null : this.fcurTotalImputationCredits.equals(that.fcurTotalImputationCredits));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurExcessImpCreditsCarryFwd == null ? that.fcurExcessImpCreditsCarryFwd == null : this.fcurExcessImpCreditsCarryFwd.equals(that.fcurExcessImpCreditsCarryFwd));
    equal = equal && (this.fcurExcessImpCreditsAsLoss == null ? that.fcurExcessImpCreditsAsLoss == null : this.fcurExcessImpCreditsAsLoss.equals(that.fcurExcessImpCreditsAsLoss));
    equal = equal && (this.fcurTaxAfterImputation == null ? that.fcurTaxAfterImputation == null : this.fcurTaxAfterImputation.equals(that.fcurTaxAfterImputation));
    equal = equal && (this.fcurTotalLossToCarryForward == null ? that.fcurTotalLossToCarryForward == null : this.fcurTotalLossToCarryForward.equals(that.fcurTotalLossToCarryForward));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurTaxAfterRWT == null ? that.fcurTaxAfterRWT == null : this.fcurTaxAfterRWT.equals(that.fcurTaxAfterRWT));
    equal = equal && (this.fcurOtherTaxCredits == null ? that.fcurOtherTaxCredits == null : this.fcurOtherTaxCredits.equals(that.fcurOtherTaxCredits));
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
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurResDeductionsForward == null ? that.fcurResDeductionsForward == null : this.fcurResDeductionsForward.equals(that.fcurResDeductionsForward));
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
    if (!(o instanceof tblnz_rtnnitclb)) {
      return false;
    }
    tblnz_rtnnitclb that = (tblnz_rtnnitclb) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnFriendlySociety == null ? that.fblnFriendlySociety == null : this.fblnFriendlySociety.equals(that.fblnFriendlySociety));
    equal = equal && (this.fcurFriendlyNetIncome == null ? that.fcurFriendlyNetIncome == null : this.fcurFriendlyNetIncome.equals(that.fcurFriendlyNetIncome));
    equal = equal && (this.fblnSpecific == null ? that.fblnSpecific == null : this.fblnSpecific.equals(that.fblnSpecific));
    equal = equal && (this.fcurExemptInterest == null ? that.fcurExemptInterest == null : this.fcurExemptInterest.equals(that.fcurExemptInterest));
    equal = equal && (this.fcurExemptDividends == null ? that.fcurExemptDividends == null : this.fcurExemptDividends.equals(that.fcurExemptDividends));
    equal = equal && (this.fcurExemptMaoriAuthority == null ? that.fcurExemptMaoriAuthority == null : this.fcurExemptMaoriAuthority.equals(that.fcurExemptMaoriAuthority));
    equal = equal && (this.fcurExemptOtherIncome == null ? that.fcurExemptOtherIncome == null : this.fcurExemptOtherIncome.equals(that.fcurExemptOtherIncome));
    equal = equal && (this.fcurExemptTotalIncome == null ? that.fcurExemptTotalIncome == null : this.fcurExemptTotalIncome.equals(that.fcurExemptTotalIncome));
    equal = equal && (this.fblnOther == null ? that.fblnOther == null : this.fblnOther.equals(that.fblnOther));
    equal = equal && (this.fcurOtherInterest == null ? that.fcurOtherInterest == null : this.fcurOtherInterest.equals(that.fcurOtherInterest));
    equal = equal && (this.fcurOtherDividends == null ? that.fcurOtherDividends == null : this.fcurOtherDividends.equals(that.fcurOtherDividends));
    equal = equal && (this.fcurOtherMaoriAuthority == null ? that.fcurOtherMaoriAuthority == null : this.fcurOtherMaoriAuthority.equals(that.fcurOtherMaoriAuthority));
    equal = equal && (this.fcurOtherOtherIncome == null ? that.fcurOtherOtherIncome == null : this.fcurOtherOtherIncome.equals(that.fcurOtherOtherIncome));
    equal = equal && (this.fcurOtherTotalIncome == null ? that.fcurOtherTotalIncome == null : this.fcurOtherTotalIncome.equals(that.fcurOtherTotalIncome));
    equal = equal && (this.fcurNonProfitCredit == null ? that.fcurNonProfitCredit == null : this.fcurNonProfitCredit.equals(that.fcurNonProfitCredit));
    equal = equal && (this.fcurTotalIncomeAfterNonProfit == null ? that.fcurTotalIncomeAfterNonProfit == null : this.fcurTotalIncomeAfterNonProfit.equals(that.fcurTotalIncomeAfterNonProfit));
    equal = equal && (this.fcurNetIncomeBeforeDonations == null ? that.fcurNetIncomeBeforeDonations == null : this.fcurNetIncomeBeforeDonations.equals(that.fcurNetIncomeBeforeDonations));
    equal = equal && (this.fcurDonationDeduction == null ? that.fcurDonationDeduction == null : this.fcurDonationDeduction.equals(that.fcurDonationDeduction));
    equal = equal && (this.fcurNetIncome == null ? that.fcurNetIncome == null : this.fcurNetIncome.equals(that.fcurNetIncome));
    equal = equal && (this.fcurNetLossBroughtForward == null ? that.fcurNetLossBroughtForward == null : this.fcurNetLossBroughtForward.equals(that.fcurNetLossBroughtForward));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fblnIncorporated == null ? that.fblnIncorporated == null : this.fblnIncorporated.equals(that.fblnIncorporated));
    equal = equal && (this.fcurTaxOnAmount == null ? that.fcurTaxOnAmount == null : this.fcurTaxOnAmount.equals(that.fcurTaxOnAmount));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurTaxAfterOverseas == null ? that.fcurTaxAfterOverseas == null : this.fcurTaxAfterOverseas.equals(that.fcurTaxAfterOverseas));
    equal = equal && (this.fcurImputationCredits == null ? that.fcurImputationCredits == null : this.fcurImputationCredits.equals(that.fcurImputationCredits));
    equal = equal && (this.fcurImputationBroughtForward == null ? that.fcurImputationBroughtForward == null : this.fcurImputationBroughtForward.equals(that.fcurImputationBroughtForward));
    equal = equal && (this.fcurTotalImputationCredits == null ? that.fcurTotalImputationCredits == null : this.fcurTotalImputationCredits.equals(that.fcurTotalImputationCredits));
    equal = equal && (this.fcurExcessImputationCredits == null ? that.fcurExcessImputationCredits == null : this.fcurExcessImputationCredits.equals(that.fcurExcessImputationCredits));
    equal = equal && (this.fcurExcessImpCreditsCarryFwd == null ? that.fcurExcessImpCreditsCarryFwd == null : this.fcurExcessImpCreditsCarryFwd.equals(that.fcurExcessImpCreditsCarryFwd));
    equal = equal && (this.fcurExcessImpCreditsAsLoss == null ? that.fcurExcessImpCreditsAsLoss == null : this.fcurExcessImpCreditsAsLoss.equals(that.fcurExcessImpCreditsAsLoss));
    equal = equal && (this.fcurTaxAfterImputation == null ? that.fcurTaxAfterImputation == null : this.fcurTaxAfterImputation.equals(that.fcurTaxAfterImputation));
    equal = equal && (this.fcurTotalLossToCarryForward == null ? that.fcurTotalLossToCarryForward == null : this.fcurTotalLossToCarryForward.equals(that.fcurTotalLossToCarryForward));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurTaxAfterRWT == null ? that.fcurTaxAfterRWT == null : this.fcurTaxAfterRWT.equals(that.fcurTaxAfterRWT));
    equal = equal && (this.fcurOtherTaxCredits == null ? that.fcurOtherTaxCredits == null : this.fcurOtherTaxCredits.equals(that.fcurOtherTaxCredits));
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
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fcurResDeductionsPriorYear == null ? that.fcurResDeductionsPriorYear == null : this.fcurResDeductionsPriorYear.equals(that.fcurResDeductionsPriorYear));
    equal = equal && (this.fcurResDeductionsClaimed == null ? that.fcurResDeductionsClaimed == null : this.fcurResDeductionsClaimed.equals(that.fcurResDeductionsClaimed));
    equal = equal && (this.fcurResNetIncome == null ? that.fcurResNetIncome == null : this.fcurResNetIncome.equals(that.fcurResNetIncome));
    equal = equal && (this.fcurResDeductionsForward == null ? that.fcurResDeductionsForward == null : this.fcurResDeductionsForward.equals(that.fcurResDeductionsForward));
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
    this.fblnFriendlySociety = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fcurFriendlyNetIncome = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fblnSpecific = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurExemptInterest = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurExemptDividends = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurExemptMaoriAuthority = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurExemptOtherIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurExemptTotalIncome = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fblnOther = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurOtherInterest = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurOtherDividends = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurOtherMaoriAuthority = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurOtherOtherIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurOtherTotalIncome = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurNonProfitCredit = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalIncomeAfterNonProfit = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurNetIncomeBeforeDonations = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurDonationDeduction = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurNetIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurNetLossBroughtForward = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fblnIncorporated = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fcurTaxOnAmount = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxAfterOverseas = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurImputationCredits = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurImputationBroughtForward = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurTotalImputationCredits = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurExcessImpCreditsCarryFwd = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurExcessImpCreditsAsLoss = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurTaxAfterImputation = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurTotalLossToCarryForward = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurTaxAfterRWT = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurOtherTaxCredits = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurOverpaymentProvisional = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurRefundAfterOverpayment = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(47, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(48, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(50, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurPropertyProfitLoss = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(60, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(61, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnFriendlySociety = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fcurFriendlyNetIncome = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fblnSpecific = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurExemptInterest = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurExemptDividends = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurExemptMaoriAuthority = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurExemptOtherIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurExemptTotalIncome = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fblnOther = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurOtherInterest = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurOtherDividends = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurOtherMaoriAuthority = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurOtherOtherIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurOtherTotalIncome = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurNonProfitCredit = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalIncomeAfterNonProfit = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurNetIncomeBeforeDonations = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurDonationDeduction = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurNetIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurNetLossBroughtForward = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fblnIncorporated = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fcurTaxOnAmount = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxAfterOverseas = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurImputationCredits = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurImputationBroughtForward = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurTotalImputationCredits = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurExcessImputationCredits = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurExcessImpCreditsCarryFwd = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurExcessImpCreditsAsLoss = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurTaxAfterImputation = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurTotalLossToCarryForward = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurTaxAfterRWT = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurOtherTaxCredits = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurProvisionalTaxPaid = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurTaxAmount = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurOverpaymentProvisional = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurRefundAfterOverpayment = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurTransferProvisional = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurTransferCustomerAmount = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurTotalRefund = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fdtmProvisionalStartDate = JdbcWritableBridge.readTimestamp(47, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(48, __dbResults);
    this.fcurProvisionalTax = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(50, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurResDeductionsPriorYear = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurResDeductionsClaimed = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurResNetIncome = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurResDeductionsForward = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurRDICarryForwardCurrentYear = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurRDICarryForwardRemaining = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurPropertyProfitLoss = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(60, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(61, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnFriendlySociety, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFriendlyNetIncome, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecific, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptInterest, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptDividends, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptMaoriAuthority, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptOtherIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptTotalIncome, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOther, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherInterest, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherDividends, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherMaoriAuthority, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherOtherIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherTotalIncome, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonProfitCredit, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeAfterNonProfit, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetIncomeBeforeDonations, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDonationDeduction, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossBroughtForward, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIncorporated, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxOnAmount, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterOverseas, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredits, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationBroughtForward, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalImputationCredits, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImpCreditsCarryFwd, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImpCreditsAsLoss, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterImputation, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLossToCarryForward, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterRWT, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherTaxCredits, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvisional, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAfterOverpayment, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 47 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPropertyProfitLoss, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 61 + __off, 93, __dbStmt);
    return 61;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFriendlySociety, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFriendlyNetIncome, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecific, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptInterest, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptDividends, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptMaoriAuthority, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptOtherIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptTotalIncome, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOther, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherInterest, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherDividends, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherMaoriAuthority, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherOtherIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherTotalIncome, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonProfitCredit, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeAfterNonProfit, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetIncomeBeforeDonations, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDonationDeduction, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossBroughtForward, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIncorporated, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxOnAmount, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterOverseas, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredits, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationBroughtForward, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalImputationCredits, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImputationCredits, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImpCreditsCarryFwd, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessImpCreditsAsLoss, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterImputation, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLossToCarryForward, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfterRWT, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherTaxCredits, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTaxPaid, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAmount, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverpaymentProvisional, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAfterOverpayment, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferProvisional, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferCustomerAmount, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRefund, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProvisionalStartDate, 47 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionalTax, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsPriorYear, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsClaimed, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResNetIncome, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductionsForward, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardCurrentYear, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDICarryForwardRemaining, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPropertyProfitLoss, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 61 + __off, 93, __dbStmt);
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
        this.fblnFriendlySociety = null;
    } else {
    this.fblnFriendlySociety = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFriendlyNetIncome = null;
    } else {
    this.fcurFriendlyNetIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSpecific = null;
    } else {
    this.fblnSpecific = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExemptInterest = null;
    } else {
    this.fcurExemptInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExemptDividends = null;
    } else {
    this.fcurExemptDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExemptMaoriAuthority = null;
    } else {
    this.fcurExemptMaoriAuthority = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExemptOtherIncome = null;
    } else {
    this.fcurExemptOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExemptTotalIncome = null;
    } else {
    this.fcurExemptTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOther = null;
    } else {
    this.fblnOther = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherInterest = null;
    } else {
    this.fcurOtherInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherDividends = null;
    } else {
    this.fcurOtherDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherMaoriAuthority = null;
    } else {
    this.fcurOtherMaoriAuthority = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherOtherIncome = null;
    } else {
    this.fcurOtherOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherTotalIncome = null;
    } else {
    this.fcurOtherTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNonProfitCredit = null;
    } else {
    this.fcurNonProfitCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncomeAfterNonProfit = null;
    } else {
    this.fcurTotalIncomeAfterNonProfit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetIncomeBeforeDonations = null;
    } else {
    this.fcurNetIncomeBeforeDonations = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDonationDeduction = null;
    } else {
    this.fcurDonationDeduction = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetIncome = null;
    } else {
    this.fcurNetIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetLossBroughtForward = null;
    } else {
    this.fcurNetLossBroughtForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxableIncome = null;
    } else {
    this.fcurTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIncorporated = null;
    } else {
    this.fblnIncorporated = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxOnAmount = null;
    } else {
    this.fcurTaxOnAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurImputationCredits = null;
    } else {
    this.fcurImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImputationBroughtForward = null;
    } else {
    this.fcurImputationBroughtForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalImputationCredits = null;
    } else {
    this.fcurTotalImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessImputationCredits = null;
    } else {
    this.fcurExcessImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessImpCreditsCarryFwd = null;
    } else {
    this.fcurExcessImpCreditsCarryFwd = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessImpCreditsAsLoss = null;
    } else {
    this.fcurExcessImpCreditsAsLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAfterImputation = null;
    } else {
    this.fcurTaxAfterImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalLossToCarryForward = null;
    } else {
    this.fcurTotalLossToCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurOtherTaxCredits = null;
    } else {
    this.fcurOtherTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fblnFriendlySociety) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFriendlySociety);
    }
    if (null == this.fcurFriendlyNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFriendlyNetIncome, __dataOut);
    }
    if (null == this.fblnSpecific) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecific);
    }
    if (null == this.fcurExemptInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptInterest, __dataOut);
    }
    if (null == this.fcurExemptDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptDividends, __dataOut);
    }
    if (null == this.fcurExemptMaoriAuthority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptMaoriAuthority, __dataOut);
    }
    if (null == this.fcurExemptOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptOtherIncome, __dataOut);
    }
    if (null == this.fcurExemptTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptTotalIncome, __dataOut);
    }
    if (null == this.fblnOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOther);
    }
    if (null == this.fcurOtherInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherInterest, __dataOut);
    }
    if (null == this.fcurOtherDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherDividends, __dataOut);
    }
    if (null == this.fcurOtherMaoriAuthority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherMaoriAuthority, __dataOut);
    }
    if (null == this.fcurOtherOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherOtherIncome, __dataOut);
    }
    if (null == this.fcurOtherTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherTotalIncome, __dataOut);
    }
    if (null == this.fcurNonProfitCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonProfitCredit, __dataOut);
    }
    if (null == this.fcurTotalIncomeAfterNonProfit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeAfterNonProfit, __dataOut);
    }
    if (null == this.fcurNetIncomeBeforeDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetIncomeBeforeDonations, __dataOut);
    }
    if (null == this.fcurDonationDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDonationDeduction, __dataOut);
    }
    if (null == this.fcurNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetIncome, __dataOut);
    }
    if (null == this.fcurNetLossBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossBroughtForward, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fblnIncorporated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIncorporated);
    }
    if (null == this.fcurTaxOnAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxOnAmount, __dataOut);
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
    if (null == this.fcurImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredits, __dataOut);
    }
    if (null == this.fcurImputationBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationBroughtForward, __dataOut);
    }
    if (null == this.fcurTotalImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalImputationCredits, __dataOut);
    }
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
    }
    if (null == this.fcurExcessImpCreditsCarryFwd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImpCreditsCarryFwd, __dataOut);
    }
    if (null == this.fcurExcessImpCreditsAsLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImpCreditsAsLoss, __dataOut);
    }
    if (null == this.fcurTaxAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterImputation, __dataOut);
    }
    if (null == this.fcurTotalLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLossToCarryForward, __dataOut);
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
    if (null == this.fcurOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherTaxCredits, __dataOut);
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
    if (null == this.fblnFriendlySociety) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFriendlySociety);
    }
    if (null == this.fcurFriendlyNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFriendlyNetIncome, __dataOut);
    }
    if (null == this.fblnSpecific) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecific);
    }
    if (null == this.fcurExemptInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptInterest, __dataOut);
    }
    if (null == this.fcurExemptDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptDividends, __dataOut);
    }
    if (null == this.fcurExemptMaoriAuthority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptMaoriAuthority, __dataOut);
    }
    if (null == this.fcurExemptOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptOtherIncome, __dataOut);
    }
    if (null == this.fcurExemptTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptTotalIncome, __dataOut);
    }
    if (null == this.fblnOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOther);
    }
    if (null == this.fcurOtherInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherInterest, __dataOut);
    }
    if (null == this.fcurOtherDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherDividends, __dataOut);
    }
    if (null == this.fcurOtherMaoriAuthority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherMaoriAuthority, __dataOut);
    }
    if (null == this.fcurOtherOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherOtherIncome, __dataOut);
    }
    if (null == this.fcurOtherTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherTotalIncome, __dataOut);
    }
    if (null == this.fcurNonProfitCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonProfitCredit, __dataOut);
    }
    if (null == this.fcurTotalIncomeAfterNonProfit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeAfterNonProfit, __dataOut);
    }
    if (null == this.fcurNetIncomeBeforeDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetIncomeBeforeDonations, __dataOut);
    }
    if (null == this.fcurDonationDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDonationDeduction, __dataOut);
    }
    if (null == this.fcurNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetIncome, __dataOut);
    }
    if (null == this.fcurNetLossBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossBroughtForward, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fblnIncorporated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIncorporated);
    }
    if (null == this.fcurTaxOnAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxOnAmount, __dataOut);
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
    if (null == this.fcurImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredits, __dataOut);
    }
    if (null == this.fcurImputationBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationBroughtForward, __dataOut);
    }
    if (null == this.fcurTotalImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalImputationCredits, __dataOut);
    }
    if (null == this.fcurExcessImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImputationCredits, __dataOut);
    }
    if (null == this.fcurExcessImpCreditsCarryFwd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImpCreditsCarryFwd, __dataOut);
    }
    if (null == this.fcurExcessImpCreditsAsLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessImpCreditsAsLoss, __dataOut);
    }
    if (null == this.fcurTaxAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfterImputation, __dataOut);
    }
    if (null == this.fcurTotalLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLossToCarryForward, __dataOut);
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
    if (null == this.fcurOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherTaxCredits, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFriendlySociety==null?"\\N":"" + fblnFriendlySociety, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFriendlyNetIncome==null?"\\N":fcurFriendlyNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecific==null?"\\N":"" + fblnSpecific, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptInterest==null?"\\N":fcurExemptInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptDividends==null?"\\N":fcurExemptDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptMaoriAuthority==null?"\\N":fcurExemptMaoriAuthority.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptOtherIncome==null?"\\N":fcurExemptOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptTotalIncome==null?"\\N":fcurExemptTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOther==null?"\\N":"" + fblnOther, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherInterest==null?"\\N":fcurOtherInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherDividends==null?"\\N":fcurOtherDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherMaoriAuthority==null?"\\N":fcurOtherMaoriAuthority.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherOtherIncome==null?"\\N":fcurOtherOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherTotalIncome==null?"\\N":fcurOtherTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonProfitCredit==null?"\\N":fcurNonProfitCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeAfterNonProfit==null?"\\N":fcurTotalIncomeAfterNonProfit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetIncomeBeforeDonations==null?"\\N":fcurNetIncomeBeforeDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDonationDeduction==null?"\\N":fcurDonationDeduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetIncome==null?"\\N":fcurNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossBroughtForward==null?"\\N":fcurNetLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIncorporated==null?"\\N":"" + fblnIncorporated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxOnAmount==null?"\\N":fcurTaxOnAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterOverseas==null?"\\N":fcurTaxAfterOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredits==null?"\\N":fcurImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationBroughtForward==null?"\\N":fcurImputationBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalImputationCredits==null?"\\N":fcurTotalImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImpCreditsCarryFwd==null?"\\N":fcurExcessImpCreditsCarryFwd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImpCreditsAsLoss==null?"\\N":fcurExcessImpCreditsAsLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterImputation==null?"\\N":fcurTaxAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLossToCarryForward==null?"\\N":fcurTotalLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWT==null?"\\N":fcurRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterRWT==null?"\\N":fcurTaxAfterRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherTaxCredits==null?"\\N":fcurOtherTaxCredits.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFriendlySociety==null?"\\N":"" + fblnFriendlySociety, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFriendlyNetIncome==null?"\\N":fcurFriendlyNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecific==null?"\\N":"" + fblnSpecific, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptInterest==null?"\\N":fcurExemptInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptDividends==null?"\\N":fcurExemptDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptMaoriAuthority==null?"\\N":fcurExemptMaoriAuthority.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptOtherIncome==null?"\\N":fcurExemptOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptTotalIncome==null?"\\N":fcurExemptTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOther==null?"\\N":"" + fblnOther, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherInterest==null?"\\N":fcurOtherInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherDividends==null?"\\N":fcurOtherDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherMaoriAuthority==null?"\\N":fcurOtherMaoriAuthority.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherOtherIncome==null?"\\N":fcurOtherOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherTotalIncome==null?"\\N":fcurOtherTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonProfitCredit==null?"\\N":fcurNonProfitCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeAfterNonProfit==null?"\\N":fcurTotalIncomeAfterNonProfit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetIncomeBeforeDonations==null?"\\N":fcurNetIncomeBeforeDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDonationDeduction==null?"\\N":fcurDonationDeduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetIncome==null?"\\N":fcurNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossBroughtForward==null?"\\N":fcurNetLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIncorporated==null?"\\N":"" + fblnIncorporated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxOnAmount==null?"\\N":fcurTaxOnAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterOverseas==null?"\\N":fcurTaxAfterOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredits==null?"\\N":fcurImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationBroughtForward==null?"\\N":fcurImputationBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalImputationCredits==null?"\\N":fcurTotalImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImputationCredits==null?"\\N":fcurExcessImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImpCreditsCarryFwd==null?"\\N":fcurExcessImpCreditsCarryFwd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessImpCreditsAsLoss==null?"\\N":fcurExcessImpCreditsAsLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterImputation==null?"\\N":fcurTaxAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLossToCarryForward==null?"\\N":fcurTotalLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWT==null?"\\N":fcurRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfterRWT==null?"\\N":fcurTaxAfterRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherTaxCredits==null?"\\N":fcurOtherTaxCredits.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFriendlySociety = null; } else {
      this.fblnFriendlySociety = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFriendlyNetIncome = null; } else {
      this.fcurFriendlyNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecific = null; } else {
      this.fblnSpecific = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptInterest = null; } else {
      this.fcurExemptInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptDividends = null; } else {
      this.fcurExemptDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptMaoriAuthority = null; } else {
      this.fcurExemptMaoriAuthority = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptOtherIncome = null; } else {
      this.fcurExemptOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptTotalIncome = null; } else {
      this.fcurExemptTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOther = null; } else {
      this.fblnOther = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherInterest = null; } else {
      this.fcurOtherInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherDividends = null; } else {
      this.fcurOtherDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherMaoriAuthority = null; } else {
      this.fcurOtherMaoriAuthority = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherOtherIncome = null; } else {
      this.fcurOtherOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherTotalIncome = null; } else {
      this.fcurOtherTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonProfitCredit = null; } else {
      this.fcurNonProfitCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeAfterNonProfit = null; } else {
      this.fcurTotalIncomeAfterNonProfit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetIncomeBeforeDonations = null; } else {
      this.fcurNetIncomeBeforeDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDonationDeduction = null; } else {
      this.fcurDonationDeduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetIncome = null; } else {
      this.fcurNetIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableIncome = null; } else {
      this.fcurTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIncorporated = null; } else {
      this.fblnIncorporated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxOnAmount = null; } else {
      this.fcurTaxOnAmount = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredits = null; } else {
      this.fcurImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationBroughtForward = null; } else {
      this.fcurImputationBroughtForward = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputationCredits = null; } else {
      this.fcurExcessImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImpCreditsCarryFwd = null; } else {
      this.fcurExcessImpCreditsCarryFwd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImpCreditsAsLoss = null; } else {
      this.fcurExcessImpCreditsAsLoss = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLossToCarryForward = null; } else {
      this.fcurTotalLossToCarryForward = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherTaxCredits = null; } else {
      this.fcurOtherTaxCredits = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFriendlySociety = null; } else {
      this.fblnFriendlySociety = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFriendlyNetIncome = null; } else {
      this.fcurFriendlyNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecific = null; } else {
      this.fblnSpecific = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptInterest = null; } else {
      this.fcurExemptInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptDividends = null; } else {
      this.fcurExemptDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptMaoriAuthority = null; } else {
      this.fcurExemptMaoriAuthority = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptOtherIncome = null; } else {
      this.fcurExemptOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptTotalIncome = null; } else {
      this.fcurExemptTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOther = null; } else {
      this.fblnOther = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherInterest = null; } else {
      this.fcurOtherInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherDividends = null; } else {
      this.fcurOtherDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherMaoriAuthority = null; } else {
      this.fcurOtherMaoriAuthority = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherOtherIncome = null; } else {
      this.fcurOtherOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherTotalIncome = null; } else {
      this.fcurOtherTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonProfitCredit = null; } else {
      this.fcurNonProfitCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeAfterNonProfit = null; } else {
      this.fcurTotalIncomeAfterNonProfit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetIncomeBeforeDonations = null; } else {
      this.fcurNetIncomeBeforeDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDonationDeduction = null; } else {
      this.fcurDonationDeduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetIncome = null; } else {
      this.fcurNetIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableIncome = null; } else {
      this.fcurTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIncorporated = null; } else {
      this.fblnIncorporated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxOnAmount = null; } else {
      this.fcurTaxOnAmount = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredits = null; } else {
      this.fcurImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationBroughtForward = null; } else {
      this.fcurImputationBroughtForward = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImputationCredits = null; } else {
      this.fcurExcessImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImpCreditsCarryFwd = null; } else {
      this.fcurExcessImpCreditsCarryFwd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessImpCreditsAsLoss = null; } else {
      this.fcurExcessImpCreditsAsLoss = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLossToCarryForward = null; } else {
      this.fcurTotalLossToCarryForward = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherTaxCredits = null; } else {
      this.fcurOtherTaxCredits = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnnitclb o = (tblnz_rtnnitclb) super.clone();
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnitclb o) throws CloneNotSupportedException {
    o.fdtmProvisionalStartDate = (o.fdtmProvisionalStartDate != null) ? (java.sql.Timestamp) o.fdtmProvisionalStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnFriendlySociety", this.fblnFriendlySociety);
    __sqoop$field_map.put("fcurFriendlyNetIncome", this.fcurFriendlyNetIncome);
    __sqoop$field_map.put("fblnSpecific", this.fblnSpecific);
    __sqoop$field_map.put("fcurExemptInterest", this.fcurExemptInterest);
    __sqoop$field_map.put("fcurExemptDividends", this.fcurExemptDividends);
    __sqoop$field_map.put("fcurExemptMaoriAuthority", this.fcurExemptMaoriAuthority);
    __sqoop$field_map.put("fcurExemptOtherIncome", this.fcurExemptOtherIncome);
    __sqoop$field_map.put("fcurExemptTotalIncome", this.fcurExemptTotalIncome);
    __sqoop$field_map.put("fblnOther", this.fblnOther);
    __sqoop$field_map.put("fcurOtherInterest", this.fcurOtherInterest);
    __sqoop$field_map.put("fcurOtherDividends", this.fcurOtherDividends);
    __sqoop$field_map.put("fcurOtherMaoriAuthority", this.fcurOtherMaoriAuthority);
    __sqoop$field_map.put("fcurOtherOtherIncome", this.fcurOtherOtherIncome);
    __sqoop$field_map.put("fcurOtherTotalIncome", this.fcurOtherTotalIncome);
    __sqoop$field_map.put("fcurNonProfitCredit", this.fcurNonProfitCredit);
    __sqoop$field_map.put("fcurTotalIncomeAfterNonProfit", this.fcurTotalIncomeAfterNonProfit);
    __sqoop$field_map.put("fcurNetIncomeBeforeDonations", this.fcurNetIncomeBeforeDonations);
    __sqoop$field_map.put("fcurDonationDeduction", this.fcurDonationDeduction);
    __sqoop$field_map.put("fcurNetIncome", this.fcurNetIncome);
    __sqoop$field_map.put("fcurNetLossBroughtForward", this.fcurNetLossBroughtForward);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fblnIncorporated", this.fblnIncorporated);
    __sqoop$field_map.put("fcurTaxOnAmount", this.fcurTaxOnAmount);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurTaxAfterOverseas", this.fcurTaxAfterOverseas);
    __sqoop$field_map.put("fcurImputationCredits", this.fcurImputationCredits);
    __sqoop$field_map.put("fcurImputationBroughtForward", this.fcurImputationBroughtForward);
    __sqoop$field_map.put("fcurTotalImputationCredits", this.fcurTotalImputationCredits);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurExcessImpCreditsCarryFwd", this.fcurExcessImpCreditsCarryFwd);
    __sqoop$field_map.put("fcurExcessImpCreditsAsLoss", this.fcurExcessImpCreditsAsLoss);
    __sqoop$field_map.put("fcurTaxAfterImputation", this.fcurTaxAfterImputation);
    __sqoop$field_map.put("fcurTotalLossToCarryForward", this.fcurTotalLossToCarryForward);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurTaxAfterRWT", this.fcurTaxAfterRWT);
    __sqoop$field_map.put("fcurOtherTaxCredits", this.fcurOtherTaxCredits);
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
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurResDeductionsForward", this.fcurResDeductionsForward);
    __sqoop$field_map.put("fcurRDICarryForwardCurrentYear", this.fcurRDICarryForwardCurrentYear);
    __sqoop$field_map.put("fcurRDICarryForwardRemaining", this.fcurRDICarryForwardRemaining);
    __sqoop$field_map.put("fcurPropertyProfitLoss", this.fcurPropertyProfitLoss);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnFriendlySociety", this.fblnFriendlySociety);
    __sqoop$field_map.put("fcurFriendlyNetIncome", this.fcurFriendlyNetIncome);
    __sqoop$field_map.put("fblnSpecific", this.fblnSpecific);
    __sqoop$field_map.put("fcurExemptInterest", this.fcurExemptInterest);
    __sqoop$field_map.put("fcurExemptDividends", this.fcurExemptDividends);
    __sqoop$field_map.put("fcurExemptMaoriAuthority", this.fcurExemptMaoriAuthority);
    __sqoop$field_map.put("fcurExemptOtherIncome", this.fcurExemptOtherIncome);
    __sqoop$field_map.put("fcurExemptTotalIncome", this.fcurExemptTotalIncome);
    __sqoop$field_map.put("fblnOther", this.fblnOther);
    __sqoop$field_map.put("fcurOtherInterest", this.fcurOtherInterest);
    __sqoop$field_map.put("fcurOtherDividends", this.fcurOtherDividends);
    __sqoop$field_map.put("fcurOtherMaoriAuthority", this.fcurOtherMaoriAuthority);
    __sqoop$field_map.put("fcurOtherOtherIncome", this.fcurOtherOtherIncome);
    __sqoop$field_map.put("fcurOtherTotalIncome", this.fcurOtherTotalIncome);
    __sqoop$field_map.put("fcurNonProfitCredit", this.fcurNonProfitCredit);
    __sqoop$field_map.put("fcurTotalIncomeAfterNonProfit", this.fcurTotalIncomeAfterNonProfit);
    __sqoop$field_map.put("fcurNetIncomeBeforeDonations", this.fcurNetIncomeBeforeDonations);
    __sqoop$field_map.put("fcurDonationDeduction", this.fcurDonationDeduction);
    __sqoop$field_map.put("fcurNetIncome", this.fcurNetIncome);
    __sqoop$field_map.put("fcurNetLossBroughtForward", this.fcurNetLossBroughtForward);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fblnIncorporated", this.fblnIncorporated);
    __sqoop$field_map.put("fcurTaxOnAmount", this.fcurTaxOnAmount);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurTaxAfterOverseas", this.fcurTaxAfterOverseas);
    __sqoop$field_map.put("fcurImputationCredits", this.fcurImputationCredits);
    __sqoop$field_map.put("fcurImputationBroughtForward", this.fcurImputationBroughtForward);
    __sqoop$field_map.put("fcurTotalImputationCredits", this.fcurTotalImputationCredits);
    __sqoop$field_map.put("fcurExcessImputationCredits", this.fcurExcessImputationCredits);
    __sqoop$field_map.put("fcurExcessImpCreditsCarryFwd", this.fcurExcessImpCreditsCarryFwd);
    __sqoop$field_map.put("fcurExcessImpCreditsAsLoss", this.fcurExcessImpCreditsAsLoss);
    __sqoop$field_map.put("fcurTaxAfterImputation", this.fcurTaxAfterImputation);
    __sqoop$field_map.put("fcurTotalLossToCarryForward", this.fcurTotalLossToCarryForward);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurTaxAfterRWT", this.fcurTaxAfterRWT);
    __sqoop$field_map.put("fcurOtherTaxCredits", this.fcurOtherTaxCredits);
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
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fcurResDeductionsPriorYear", this.fcurResDeductionsPriorYear);
    __sqoop$field_map.put("fcurResDeductionsClaimed", this.fcurResDeductionsClaimed);
    __sqoop$field_map.put("fcurResNetIncome", this.fcurResNetIncome);
    __sqoop$field_map.put("fcurResDeductionsForward", this.fcurResDeductionsForward);
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
