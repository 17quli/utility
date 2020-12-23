// ORM class for table 'tblnz_rtnnitprt'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:43:18 NZDT 2020
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

public class tblnz_rtnnitprt extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurSchedularTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurSchedularTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSchedularPayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurSchedularPayments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurGrossInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurDividendImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurDividendRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurDividendGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMaoriCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurMaoriCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMaoriDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurMaoriDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTrustCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurTrustCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTrustIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurTrustIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLTCCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurLTCCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLTCActiveIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurLTCActiveIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLTCDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurLTCDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLTCPriorDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurLTCPriorDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLTCAdjustedIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurLTCAdjustedIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurOverseasTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurOverseasIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBusinessIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurBusinessIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRentalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurRentalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurTotalOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRLWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurRLWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExpensesClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurExpensesClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAfterExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurIncomeAfterExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExtinguishedLosses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurExtinguishedLosses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPriorDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurPriorDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductionsClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurDeductionsClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrResMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fstrResMethod = (String)value;
      }
    });
    setters.put("fcurResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnLTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fblnLTC = (Integer)value;
      }
    });
    setters.put("fblnPartnership", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fblnPartnership = (Integer)value;
      }
    });
    setters.put("fcurSaleOfProperty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fcurSaleOfProperty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprt.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnnitprt() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnnitprt with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurSchedularTax;
  public java.math.BigDecimal get_fcurSchedularTax() {
    return fcurSchedularTax;
  }
  public void set_fcurSchedularTax(java.math.BigDecimal fcurSchedularTax) {
    this.fcurSchedularTax = fcurSchedularTax;
  }
  public tblnz_rtnnitprt with_fcurSchedularTax(java.math.BigDecimal fcurSchedularTax) {
    this.fcurSchedularTax = fcurSchedularTax;
    return this;
  }
  private java.math.BigDecimal fcurSchedularPayments;
  public java.math.BigDecimal get_fcurSchedularPayments() {
    return fcurSchedularPayments;
  }
  public void set_fcurSchedularPayments(java.math.BigDecimal fcurSchedularPayments) {
    this.fcurSchedularPayments = fcurSchedularPayments;
  }
  public tblnz_rtnnitprt with_fcurSchedularPayments(java.math.BigDecimal fcurSchedularPayments) {
    this.fcurSchedularPayments = fcurSchedularPayments;
    return this;
  }
  private java.math.BigDecimal fcurRWT;
  public java.math.BigDecimal get_fcurRWT() {
    return fcurRWT;
  }
  public void set_fcurRWT(java.math.BigDecimal fcurRWT) {
    this.fcurRWT = fcurRWT;
  }
  public tblnz_rtnnitprt with_fcurRWT(java.math.BigDecimal fcurRWT) {
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
  public tblnz_rtnnitprt with_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
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
  public tblnz_rtnnitprt with_fcurDividendImputation(java.math.BigDecimal fcurDividendImputation) {
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
  public tblnz_rtnnitprt with_fcurDividendRWT(java.math.BigDecimal fcurDividendRWT) {
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
  public tblnz_rtnnitprt with_fcurDividendGross(java.math.BigDecimal fcurDividendGross) {
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
  public tblnz_rtnnitprt with_fcurMaoriCredits(java.math.BigDecimal fcurMaoriCredits) {
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
  public tblnz_rtnnitprt with_fcurMaoriDistributions(java.math.BigDecimal fcurMaoriDistributions) {
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
  public tblnz_rtnnitprt with_fcurTrustCredits(java.math.BigDecimal fcurTrustCredits) {
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
  public tblnz_rtnnitprt with_fcurTrustIncome(java.math.BigDecimal fcurTrustIncome) {
    this.fcurTrustIncome = fcurTrustIncome;
    return this;
  }
  private java.math.BigDecimal fcurLTCCredits;
  public java.math.BigDecimal get_fcurLTCCredits() {
    return fcurLTCCredits;
  }
  public void set_fcurLTCCredits(java.math.BigDecimal fcurLTCCredits) {
    this.fcurLTCCredits = fcurLTCCredits;
  }
  public tblnz_rtnnitprt with_fcurLTCCredits(java.math.BigDecimal fcurLTCCredits) {
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
  public tblnz_rtnnitprt with_fcurLTCActiveIncome(java.math.BigDecimal fcurLTCActiveIncome) {
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
  public tblnz_rtnnitprt with_fcurLTCDeductions(java.math.BigDecimal fcurLTCDeductions) {
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
  public tblnz_rtnnitprt with_fcurLTCPriorDeductions(java.math.BigDecimal fcurLTCPriorDeductions) {
    this.fcurLTCPriorDeductions = fcurLTCPriorDeductions;
    return this;
  }
  private java.math.BigDecimal fcurLTCAdjustedIncome;
  public java.math.BigDecimal get_fcurLTCAdjustedIncome() {
    return fcurLTCAdjustedIncome;
  }
  public void set_fcurLTCAdjustedIncome(java.math.BigDecimal fcurLTCAdjustedIncome) {
    this.fcurLTCAdjustedIncome = fcurLTCAdjustedIncome;
  }
  public tblnz_rtnnitprt with_fcurLTCAdjustedIncome(java.math.BigDecimal fcurLTCAdjustedIncome) {
    this.fcurLTCAdjustedIncome = fcurLTCAdjustedIncome;
    return this;
  }
  private java.math.BigDecimal fcurOverseasTax;
  public java.math.BigDecimal get_fcurOverseasTax() {
    return fcurOverseasTax;
  }
  public void set_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
    this.fcurOverseasTax = fcurOverseasTax;
  }
  public tblnz_rtnnitprt with_fcurOverseasTax(java.math.BigDecimal fcurOverseasTax) {
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
  public tblnz_rtnnitprt with_fcurOverseasIncome(java.math.BigDecimal fcurOverseasIncome) {
    this.fcurOverseasIncome = fcurOverseasIncome;
    return this;
  }
  private java.math.BigDecimal fcurBusinessIncome;
  public java.math.BigDecimal get_fcurBusinessIncome() {
    return fcurBusinessIncome;
  }
  public void set_fcurBusinessIncome(java.math.BigDecimal fcurBusinessIncome) {
    this.fcurBusinessIncome = fcurBusinessIncome;
  }
  public tblnz_rtnnitprt with_fcurBusinessIncome(java.math.BigDecimal fcurBusinessIncome) {
    this.fcurBusinessIncome = fcurBusinessIncome;
    return this;
  }
  private java.math.BigDecimal fcurRentalIncome;
  public java.math.BigDecimal get_fcurRentalIncome() {
    return fcurRentalIncome;
  }
  public void set_fcurRentalIncome(java.math.BigDecimal fcurRentalIncome) {
    this.fcurRentalIncome = fcurRentalIncome;
  }
  public tblnz_rtnnitprt with_fcurRentalIncome(java.math.BigDecimal fcurRentalIncome) {
    this.fcurRentalIncome = fcurRentalIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherIncome;
  public java.math.BigDecimal get_fcurTotalOtherIncome() {
    return fcurTotalOtherIncome;
  }
  public void set_fcurTotalOtherIncome(java.math.BigDecimal fcurTotalOtherIncome) {
    this.fcurTotalOtherIncome = fcurTotalOtherIncome;
  }
  public tblnz_rtnnitprt with_fcurTotalOtherIncome(java.math.BigDecimal fcurTotalOtherIncome) {
    this.fcurTotalOtherIncome = fcurTotalOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurRLWT;
  public java.math.BigDecimal get_fcurRLWT() {
    return fcurRLWT;
  }
  public void set_fcurRLWT(java.math.BigDecimal fcurRLWT) {
    this.fcurRLWT = fcurRLWT;
  }
  public tblnz_rtnnitprt with_fcurRLWT(java.math.BigDecimal fcurRLWT) {
    this.fcurRLWT = fcurRLWT;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncome;
  public java.math.BigDecimal get_fcurTotalIncome() {
    return fcurTotalIncome;
  }
  public void set_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
  }
  public tblnz_rtnnitprt with_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurExpensesClaimed;
  public java.math.BigDecimal get_fcurExpensesClaimed() {
    return fcurExpensesClaimed;
  }
  public void set_fcurExpensesClaimed(java.math.BigDecimal fcurExpensesClaimed) {
    this.fcurExpensesClaimed = fcurExpensesClaimed;
  }
  public tblnz_rtnnitprt with_fcurExpensesClaimed(java.math.BigDecimal fcurExpensesClaimed) {
    this.fcurExpensesClaimed = fcurExpensesClaimed;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAfterExpenses;
  public java.math.BigDecimal get_fcurIncomeAfterExpenses() {
    return fcurIncomeAfterExpenses;
  }
  public void set_fcurIncomeAfterExpenses(java.math.BigDecimal fcurIncomeAfterExpenses) {
    this.fcurIncomeAfterExpenses = fcurIncomeAfterExpenses;
  }
  public tblnz_rtnnitprt with_fcurIncomeAfterExpenses(java.math.BigDecimal fcurIncomeAfterExpenses) {
    this.fcurIncomeAfterExpenses = fcurIncomeAfterExpenses;
    return this;
  }
  private java.math.BigDecimal fcurExtinguishedLosses;
  public java.math.BigDecimal get_fcurExtinguishedLosses() {
    return fcurExtinguishedLosses;
  }
  public void set_fcurExtinguishedLosses(java.math.BigDecimal fcurExtinguishedLosses) {
    this.fcurExtinguishedLosses = fcurExtinguishedLosses;
  }
  public tblnz_rtnnitprt with_fcurExtinguishedLosses(java.math.BigDecimal fcurExtinguishedLosses) {
    this.fcurExtinguishedLosses = fcurExtinguishedLosses;
    return this;
  }
  private java.math.BigDecimal fcurPriorDeductions;
  public java.math.BigDecimal get_fcurPriorDeductions() {
    return fcurPriorDeductions;
  }
  public void set_fcurPriorDeductions(java.math.BigDecimal fcurPriorDeductions) {
    this.fcurPriorDeductions = fcurPriorDeductions;
  }
  public tblnz_rtnnitprt with_fcurPriorDeductions(java.math.BigDecimal fcurPriorDeductions) {
    this.fcurPriorDeductions = fcurPriorDeductions;
    return this;
  }
  private java.math.BigDecimal fcurDeductionsClaimed;
  public java.math.BigDecimal get_fcurDeductionsClaimed() {
    return fcurDeductionsClaimed;
  }
  public void set_fcurDeductionsClaimed(java.math.BigDecimal fcurDeductionsClaimed) {
    this.fcurDeductionsClaimed = fcurDeductionsClaimed;
  }
  public tblnz_rtnnitprt with_fcurDeductionsClaimed(java.math.BigDecimal fcurDeductionsClaimed) {
    this.fcurDeductionsClaimed = fcurDeductionsClaimed;
    return this;
  }
  private String fstrResMethod;
  public String get_fstrResMethod() {
    return fstrResMethod;
  }
  public void set_fstrResMethod(String fstrResMethod) {
    this.fstrResMethod = fstrResMethod;
  }
  public tblnz_rtnnitprt with_fstrResMethod(String fstrResMethod) {
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
  public tblnz_rtnnitprt with_fcurResIncome(java.math.BigDecimal fcurResIncome) {
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
  public tblnz_rtnnitprt with_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
    this.fcurResDeductions = fcurResDeductions;
    return this;
  }
  private Integer fblnLTC;
  public Integer get_fblnLTC() {
    return fblnLTC;
  }
  public void set_fblnLTC(Integer fblnLTC) {
    this.fblnLTC = fblnLTC;
  }
  public tblnz_rtnnitprt with_fblnLTC(Integer fblnLTC) {
    this.fblnLTC = fblnLTC;
    return this;
  }
  private Integer fblnPartnership;
  public Integer get_fblnPartnership() {
    return fblnPartnership;
  }
  public void set_fblnPartnership(Integer fblnPartnership) {
    this.fblnPartnership = fblnPartnership;
  }
  public tblnz_rtnnitprt with_fblnPartnership(Integer fblnPartnership) {
    this.fblnPartnership = fblnPartnership;
    return this;
  }
  private java.math.BigDecimal fcurSaleOfProperty;
  public java.math.BigDecimal get_fcurSaleOfProperty() {
    return fcurSaleOfProperty;
  }
  public void set_fcurSaleOfProperty(java.math.BigDecimal fcurSaleOfProperty) {
    this.fcurSaleOfProperty = fcurSaleOfProperty;
  }
  public tblnz_rtnnitprt with_fcurSaleOfProperty(java.math.BigDecimal fcurSaleOfProperty) {
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
  public tblnz_rtnnitprt with_fstrWho(String fstrWho) {
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
  public tblnz_rtnnitprt with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitprt)) {
      return false;
    }
    tblnz_rtnnitprt that = (tblnz_rtnnitprt) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurSchedularTax == null ? that.fcurSchedularTax == null : this.fcurSchedularTax.equals(that.fcurSchedularTax));
    equal = equal && (this.fcurSchedularPayments == null ? that.fcurSchedularPayments == null : this.fcurSchedularPayments.equals(that.fcurSchedularPayments));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurDividendImputation == null ? that.fcurDividendImputation == null : this.fcurDividendImputation.equals(that.fcurDividendImputation));
    equal = equal && (this.fcurDividendRWT == null ? that.fcurDividendRWT == null : this.fcurDividendRWT.equals(that.fcurDividendRWT));
    equal = equal && (this.fcurDividendGross == null ? that.fcurDividendGross == null : this.fcurDividendGross.equals(that.fcurDividendGross));
    equal = equal && (this.fcurMaoriCredits == null ? that.fcurMaoriCredits == null : this.fcurMaoriCredits.equals(that.fcurMaoriCredits));
    equal = equal && (this.fcurMaoriDistributions == null ? that.fcurMaoriDistributions == null : this.fcurMaoriDistributions.equals(that.fcurMaoriDistributions));
    equal = equal && (this.fcurTrustCredits == null ? that.fcurTrustCredits == null : this.fcurTrustCredits.equals(that.fcurTrustCredits));
    equal = equal && (this.fcurTrustIncome == null ? that.fcurTrustIncome == null : this.fcurTrustIncome.equals(that.fcurTrustIncome));
    equal = equal && (this.fcurLTCCredits == null ? that.fcurLTCCredits == null : this.fcurLTCCredits.equals(that.fcurLTCCredits));
    equal = equal && (this.fcurLTCActiveIncome == null ? that.fcurLTCActiveIncome == null : this.fcurLTCActiveIncome.equals(that.fcurLTCActiveIncome));
    equal = equal && (this.fcurLTCDeductions == null ? that.fcurLTCDeductions == null : this.fcurLTCDeductions.equals(that.fcurLTCDeductions));
    equal = equal && (this.fcurLTCPriorDeductions == null ? that.fcurLTCPriorDeductions == null : this.fcurLTCPriorDeductions.equals(that.fcurLTCPriorDeductions));
    equal = equal && (this.fcurLTCAdjustedIncome == null ? that.fcurLTCAdjustedIncome == null : this.fcurLTCAdjustedIncome.equals(that.fcurLTCAdjustedIncome));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurOverseasIncome == null ? that.fcurOverseasIncome == null : this.fcurOverseasIncome.equals(that.fcurOverseasIncome));
    equal = equal && (this.fcurBusinessIncome == null ? that.fcurBusinessIncome == null : this.fcurBusinessIncome.equals(that.fcurBusinessIncome));
    equal = equal && (this.fcurRentalIncome == null ? that.fcurRentalIncome == null : this.fcurRentalIncome.equals(that.fcurRentalIncome));
    equal = equal && (this.fcurTotalOtherIncome == null ? that.fcurTotalOtherIncome == null : this.fcurTotalOtherIncome.equals(that.fcurTotalOtherIncome));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurExpensesClaimed == null ? that.fcurExpensesClaimed == null : this.fcurExpensesClaimed.equals(that.fcurExpensesClaimed));
    equal = equal && (this.fcurIncomeAfterExpenses == null ? that.fcurIncomeAfterExpenses == null : this.fcurIncomeAfterExpenses.equals(that.fcurIncomeAfterExpenses));
    equal = equal && (this.fcurExtinguishedLosses == null ? that.fcurExtinguishedLosses == null : this.fcurExtinguishedLosses.equals(that.fcurExtinguishedLosses));
    equal = equal && (this.fcurPriorDeductions == null ? that.fcurPriorDeductions == null : this.fcurPriorDeductions.equals(that.fcurPriorDeductions));
    equal = equal && (this.fcurDeductionsClaimed == null ? that.fcurDeductionsClaimed == null : this.fcurDeductionsClaimed.equals(that.fcurDeductionsClaimed));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fblnLTC == null ? that.fblnLTC == null : this.fblnLTC.equals(that.fblnLTC));
    equal = equal && (this.fblnPartnership == null ? that.fblnPartnership == null : this.fblnPartnership.equals(that.fblnPartnership));
    equal = equal && (this.fcurSaleOfProperty == null ? that.fcurSaleOfProperty == null : this.fcurSaleOfProperty.equals(that.fcurSaleOfProperty));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitprt)) {
      return false;
    }
    tblnz_rtnnitprt that = (tblnz_rtnnitprt) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurSchedularTax == null ? that.fcurSchedularTax == null : this.fcurSchedularTax.equals(that.fcurSchedularTax));
    equal = equal && (this.fcurSchedularPayments == null ? that.fcurSchedularPayments == null : this.fcurSchedularPayments.equals(that.fcurSchedularPayments));
    equal = equal && (this.fcurRWT == null ? that.fcurRWT == null : this.fcurRWT.equals(that.fcurRWT));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurDividendImputation == null ? that.fcurDividendImputation == null : this.fcurDividendImputation.equals(that.fcurDividendImputation));
    equal = equal && (this.fcurDividendRWT == null ? that.fcurDividendRWT == null : this.fcurDividendRWT.equals(that.fcurDividendRWT));
    equal = equal && (this.fcurDividendGross == null ? that.fcurDividendGross == null : this.fcurDividendGross.equals(that.fcurDividendGross));
    equal = equal && (this.fcurMaoriCredits == null ? that.fcurMaoriCredits == null : this.fcurMaoriCredits.equals(that.fcurMaoriCredits));
    equal = equal && (this.fcurMaoriDistributions == null ? that.fcurMaoriDistributions == null : this.fcurMaoriDistributions.equals(that.fcurMaoriDistributions));
    equal = equal && (this.fcurTrustCredits == null ? that.fcurTrustCredits == null : this.fcurTrustCredits.equals(that.fcurTrustCredits));
    equal = equal && (this.fcurTrustIncome == null ? that.fcurTrustIncome == null : this.fcurTrustIncome.equals(that.fcurTrustIncome));
    equal = equal && (this.fcurLTCCredits == null ? that.fcurLTCCredits == null : this.fcurLTCCredits.equals(that.fcurLTCCredits));
    equal = equal && (this.fcurLTCActiveIncome == null ? that.fcurLTCActiveIncome == null : this.fcurLTCActiveIncome.equals(that.fcurLTCActiveIncome));
    equal = equal && (this.fcurLTCDeductions == null ? that.fcurLTCDeductions == null : this.fcurLTCDeductions.equals(that.fcurLTCDeductions));
    equal = equal && (this.fcurLTCPriorDeductions == null ? that.fcurLTCPriorDeductions == null : this.fcurLTCPriorDeductions.equals(that.fcurLTCPriorDeductions));
    equal = equal && (this.fcurLTCAdjustedIncome == null ? that.fcurLTCAdjustedIncome == null : this.fcurLTCAdjustedIncome.equals(that.fcurLTCAdjustedIncome));
    equal = equal && (this.fcurOverseasTax == null ? that.fcurOverseasTax == null : this.fcurOverseasTax.equals(that.fcurOverseasTax));
    equal = equal && (this.fcurOverseasIncome == null ? that.fcurOverseasIncome == null : this.fcurOverseasIncome.equals(that.fcurOverseasIncome));
    equal = equal && (this.fcurBusinessIncome == null ? that.fcurBusinessIncome == null : this.fcurBusinessIncome.equals(that.fcurBusinessIncome));
    equal = equal && (this.fcurRentalIncome == null ? that.fcurRentalIncome == null : this.fcurRentalIncome.equals(that.fcurRentalIncome));
    equal = equal && (this.fcurTotalOtherIncome == null ? that.fcurTotalOtherIncome == null : this.fcurTotalOtherIncome.equals(that.fcurTotalOtherIncome));
    equal = equal && (this.fcurRLWT == null ? that.fcurRLWT == null : this.fcurRLWT.equals(that.fcurRLWT));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurExpensesClaimed == null ? that.fcurExpensesClaimed == null : this.fcurExpensesClaimed.equals(that.fcurExpensesClaimed));
    equal = equal && (this.fcurIncomeAfterExpenses == null ? that.fcurIncomeAfterExpenses == null : this.fcurIncomeAfterExpenses.equals(that.fcurIncomeAfterExpenses));
    equal = equal && (this.fcurExtinguishedLosses == null ? that.fcurExtinguishedLosses == null : this.fcurExtinguishedLosses.equals(that.fcurExtinguishedLosses));
    equal = equal && (this.fcurPriorDeductions == null ? that.fcurPriorDeductions == null : this.fcurPriorDeductions.equals(that.fcurPriorDeductions));
    equal = equal && (this.fcurDeductionsClaimed == null ? that.fcurDeductionsClaimed == null : this.fcurDeductionsClaimed.equals(that.fcurDeductionsClaimed));
    equal = equal && (this.fstrResMethod == null ? that.fstrResMethod == null : this.fstrResMethod.equals(that.fstrResMethod));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fblnLTC == null ? that.fblnLTC == null : this.fblnLTC.equals(that.fblnLTC));
    equal = equal && (this.fblnPartnership == null ? that.fblnPartnership == null : this.fblnPartnership.equals(that.fblnPartnership));
    equal = equal && (this.fcurSaleOfProperty == null ? that.fcurSaleOfProperty == null : this.fcurSaleOfProperty.equals(that.fcurSaleOfProperty));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurSchedularTax = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurSchedularPayments = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDividendImputation = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDividendRWT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurDividendGross = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurMaoriCredits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurMaoriDistributions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTrustCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTrustIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLTCCredits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurLTCActiveIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurLTCDeductions = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurLTCPriorDeductions = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurLTCAdjustedIncome = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurOverseasIncome = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurBusinessIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurRentalIncome = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalOtherIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurExpensesClaimed = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurIncomeAfterExpenses = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurExtinguishedLosses = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurPriorDeductions = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurDeductionsClaimed = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(30, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fblnLTC = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fblnPartnership = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(36, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(37, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurSchedularTax = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurSchedularPayments = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurRWT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDividendImputation = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDividendRWT = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurDividendGross = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurMaoriCredits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurMaoriDistributions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTrustCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTrustIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLTCCredits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurLTCActiveIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurLTCDeductions = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurLTCPriorDeductions = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurLTCAdjustedIncome = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurOverseasTax = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurOverseasIncome = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurBusinessIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurRentalIncome = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalOtherIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurRLWT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurExpensesClaimed = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurIncomeAfterExpenses = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurExtinguishedLosses = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurPriorDeductions = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurDeductionsClaimed = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fstrResMethod = JdbcWritableBridge.readString(30, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fblnLTC = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fblnPartnership = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fcurSaleOfProperty = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(36, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(37, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurSchedularTax, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSchedularPayments, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendImputation, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendRWT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendGross, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriCredits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriDistributions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCCredits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCActiveIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCDeductions, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCPriorDeductions, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCAdjustedIncome, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasIncome, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBusinessIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalIncome, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExpensesClaimed, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterExpenses, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExtinguishedLosses, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPriorDeductions, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionsClaimed, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLTC, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPartnership, 34 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 37 + __off, 93, __dbStmt);
    return 37;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSchedularTax, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSchedularPayments, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendImputation, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendRWT, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendGross, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriCredits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaoriDistributions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCCredits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCActiveIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCDeductions, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCPriorDeductions, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLTCAdjustedIncome, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasTax, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasIncome, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBusinessIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalIncome, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRLWT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExpensesClaimed, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterExpenses, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExtinguishedLosses, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPriorDeductions, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductionsClaimed, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrResMethod, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLTC, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPartnership, 34 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSaleOfProperty, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 37 + __off, 93, __dbStmt);
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
        this.fcurSchedularTax = null;
    } else {
    this.fcurSchedularTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSchedularPayments = null;
    } else {
    this.fcurSchedularPayments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurLTCAdjustedIncome = null;
    } else {
    this.fcurLTCAdjustedIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurBusinessIncome = null;
    } else {
    this.fcurBusinessIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRentalIncome = null;
    } else {
    this.fcurRentalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOtherIncome = null;
    } else {
    this.fcurTotalOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRLWT = null;
    } else {
    this.fcurRLWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncome = null;
    } else {
    this.fcurTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExpensesClaimed = null;
    } else {
    this.fcurExpensesClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAfterExpenses = null;
    } else {
    this.fcurIncomeAfterExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExtinguishedLosses = null;
    } else {
    this.fcurExtinguishedLosses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPriorDeductions = null;
    } else {
    this.fcurPriorDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductionsClaimed = null;
    } else {
    this.fcurDeductionsClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fblnLTC = null;
    } else {
    this.fblnLTC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPartnership = null;
    } else {
    this.fblnPartnership = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fcurSchedularTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSchedularTax, __dataOut);
    }
    if (null == this.fcurSchedularPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSchedularPayments, __dataOut);
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
    if (null == this.fcurLTCAdjustedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCAdjustedIncome, __dataOut);
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
    if (null == this.fcurBusinessIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBusinessIncome, __dataOut);
    }
    if (null == this.fcurRentalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRentalIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherIncome, __dataOut);
    }
    if (null == this.fcurRLWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWT, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurExpensesClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExpensesClaimed, __dataOut);
    }
    if (null == this.fcurIncomeAfterExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterExpenses, __dataOut);
    }
    if (null == this.fcurExtinguishedLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExtinguishedLosses, __dataOut);
    }
    if (null == this.fcurPriorDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPriorDeductions, __dataOut);
    }
    if (null == this.fcurDeductionsClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionsClaimed, __dataOut);
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
    if (null == this.fblnLTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLTC);
    }
    if (null == this.fblnPartnership) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPartnership);
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
    if (null == this.fcurSchedularTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSchedularTax, __dataOut);
    }
    if (null == this.fcurSchedularPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSchedularPayments, __dataOut);
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
    if (null == this.fcurLTCAdjustedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLTCAdjustedIncome, __dataOut);
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
    if (null == this.fcurBusinessIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBusinessIncome, __dataOut);
    }
    if (null == this.fcurRentalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRentalIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherIncome, __dataOut);
    }
    if (null == this.fcurRLWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRLWT, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurExpensesClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExpensesClaimed, __dataOut);
    }
    if (null == this.fcurIncomeAfterExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterExpenses, __dataOut);
    }
    if (null == this.fcurExtinguishedLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExtinguishedLosses, __dataOut);
    }
    if (null == this.fcurPriorDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPriorDeductions, __dataOut);
    }
    if (null == this.fcurDeductionsClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductionsClaimed, __dataOut);
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
    if (null == this.fblnLTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLTC);
    }
    if (null == this.fblnPartnership) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPartnership);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSchedularTax==null?"\\N":fcurSchedularTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSchedularPayments==null?"\\N":fcurSchedularPayments.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCCredits==null?"\\N":fcurLTCCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCActiveIncome==null?"\\N":fcurLTCActiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCDeductions==null?"\\N":fcurLTCDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCPriorDeductions==null?"\\N":fcurLTCPriorDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCAdjustedIncome==null?"\\N":fcurLTCAdjustedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasIncome==null?"\\N":fcurOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBusinessIncome==null?"\\N":fcurBusinessIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRentalIncome==null?"\\N":fcurRentalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherIncome==null?"\\N":fcurTotalOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExpensesClaimed==null?"\\N":fcurExpensesClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterExpenses==null?"\\N":fcurIncomeAfterExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExtinguishedLosses==null?"\\N":fcurExtinguishedLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPriorDeductions==null?"\\N":fcurPriorDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionsClaimed==null?"\\N":fcurDeductionsClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResMethod==null?"\\N":fstrResMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResIncome==null?"\\N":fcurResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductions==null?"\\N":fcurResDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLTC==null?"\\N":"" + fblnLTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPartnership==null?"\\N":"" + fblnPartnership, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSchedularTax==null?"\\N":fcurSchedularTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSchedularPayments==null?"\\N":fcurSchedularPayments.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCCredits==null?"\\N":fcurLTCCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCActiveIncome==null?"\\N":fcurLTCActiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCDeductions==null?"\\N":fcurLTCDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCPriorDeductions==null?"\\N":fcurLTCPriorDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLTCAdjustedIncome==null?"\\N":fcurLTCAdjustedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasTax==null?"\\N":fcurOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasIncome==null?"\\N":fcurOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBusinessIncome==null?"\\N":fcurBusinessIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRentalIncome==null?"\\N":fcurRentalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherIncome==null?"\\N":fcurTotalOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRLWT==null?"\\N":fcurRLWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExpensesClaimed==null?"\\N":fcurExpensesClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterExpenses==null?"\\N":fcurIncomeAfterExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExtinguishedLosses==null?"\\N":fcurExtinguishedLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPriorDeductions==null?"\\N":fcurPriorDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductionsClaimed==null?"\\N":fcurDeductionsClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResMethod==null?"\\N":fstrResMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResIncome==null?"\\N":fcurResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductions==null?"\\N":fcurResDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLTC==null?"\\N":"" + fblnLTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPartnership==null?"\\N":"" + fblnPartnership, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSchedularTax = null; } else {
      this.fcurSchedularTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSchedularPayments = null; } else {
      this.fcurSchedularPayments = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCAdjustedIncome = null; } else {
      this.fcurLTCAdjustedIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBusinessIncome = null; } else {
      this.fcurBusinessIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRentalIncome = null; } else {
      this.fcurRentalIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWT = null; } else {
      this.fcurRLWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExpensesClaimed = null; } else {
      this.fcurExpensesClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExtinguishedLosses = null; } else {
      this.fcurExtinguishedLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPriorDeductions = null; } else {
      this.fcurPriorDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionsClaimed = null; } else {
      this.fcurDeductionsClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLTC = null; } else {
      this.fblnLTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPartnership = null; } else {
      this.fblnPartnership = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSchedularTax = null; } else {
      this.fcurSchedularTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSchedularPayments = null; } else {
      this.fcurSchedularPayments = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLTCAdjustedIncome = null; } else {
      this.fcurLTCAdjustedIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBusinessIncome = null; } else {
      this.fcurBusinessIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRentalIncome = null; } else {
      this.fcurRentalIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRLWT = null; } else {
      this.fcurRLWT = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExpensesClaimed = null; } else {
      this.fcurExpensesClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExtinguishedLosses = null; } else {
      this.fcurExtinguishedLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPriorDeductions = null; } else {
      this.fcurPriorDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductionsClaimed = null; } else {
      this.fcurDeductionsClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLTC = null; } else {
      this.fblnLTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPartnership = null; } else {
      this.fblnPartnership = Integer.valueOf(__cur_str);
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
    tblnz_rtnnitprt o = (tblnz_rtnnitprt) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnitprt o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurSchedularTax", this.fcurSchedularTax);
    __sqoop$field_map.put("fcurSchedularPayments", this.fcurSchedularPayments);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurDividendImputation", this.fcurDividendImputation);
    __sqoop$field_map.put("fcurDividendRWT", this.fcurDividendRWT);
    __sqoop$field_map.put("fcurDividendGross", this.fcurDividendGross);
    __sqoop$field_map.put("fcurMaoriCredits", this.fcurMaoriCredits);
    __sqoop$field_map.put("fcurMaoriDistributions", this.fcurMaoriDistributions);
    __sqoop$field_map.put("fcurTrustCredits", this.fcurTrustCredits);
    __sqoop$field_map.put("fcurTrustIncome", this.fcurTrustIncome);
    __sqoop$field_map.put("fcurLTCCredits", this.fcurLTCCredits);
    __sqoop$field_map.put("fcurLTCActiveIncome", this.fcurLTCActiveIncome);
    __sqoop$field_map.put("fcurLTCDeductions", this.fcurLTCDeductions);
    __sqoop$field_map.put("fcurLTCPriorDeductions", this.fcurLTCPriorDeductions);
    __sqoop$field_map.put("fcurLTCAdjustedIncome", this.fcurLTCAdjustedIncome);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurOverseasIncome", this.fcurOverseasIncome);
    __sqoop$field_map.put("fcurBusinessIncome", this.fcurBusinessIncome);
    __sqoop$field_map.put("fcurRentalIncome", this.fcurRentalIncome);
    __sqoop$field_map.put("fcurTotalOtherIncome", this.fcurTotalOtherIncome);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurExpensesClaimed", this.fcurExpensesClaimed);
    __sqoop$field_map.put("fcurIncomeAfterExpenses", this.fcurIncomeAfterExpenses);
    __sqoop$field_map.put("fcurExtinguishedLosses", this.fcurExtinguishedLosses);
    __sqoop$field_map.put("fcurPriorDeductions", this.fcurPriorDeductions);
    __sqoop$field_map.put("fcurDeductionsClaimed", this.fcurDeductionsClaimed);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fblnLTC", this.fblnLTC);
    __sqoop$field_map.put("fblnPartnership", this.fblnPartnership);
    __sqoop$field_map.put("fcurSaleOfProperty", this.fcurSaleOfProperty);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurSchedularTax", this.fcurSchedularTax);
    __sqoop$field_map.put("fcurSchedularPayments", this.fcurSchedularPayments);
    __sqoop$field_map.put("fcurRWT", this.fcurRWT);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurDividendImputation", this.fcurDividendImputation);
    __sqoop$field_map.put("fcurDividendRWT", this.fcurDividendRWT);
    __sqoop$field_map.put("fcurDividendGross", this.fcurDividendGross);
    __sqoop$field_map.put("fcurMaoriCredits", this.fcurMaoriCredits);
    __sqoop$field_map.put("fcurMaoriDistributions", this.fcurMaoriDistributions);
    __sqoop$field_map.put("fcurTrustCredits", this.fcurTrustCredits);
    __sqoop$field_map.put("fcurTrustIncome", this.fcurTrustIncome);
    __sqoop$field_map.put("fcurLTCCredits", this.fcurLTCCredits);
    __sqoop$field_map.put("fcurLTCActiveIncome", this.fcurLTCActiveIncome);
    __sqoop$field_map.put("fcurLTCDeductions", this.fcurLTCDeductions);
    __sqoop$field_map.put("fcurLTCPriorDeductions", this.fcurLTCPriorDeductions);
    __sqoop$field_map.put("fcurLTCAdjustedIncome", this.fcurLTCAdjustedIncome);
    __sqoop$field_map.put("fcurOverseasTax", this.fcurOverseasTax);
    __sqoop$field_map.put("fcurOverseasIncome", this.fcurOverseasIncome);
    __sqoop$field_map.put("fcurBusinessIncome", this.fcurBusinessIncome);
    __sqoop$field_map.put("fcurRentalIncome", this.fcurRentalIncome);
    __sqoop$field_map.put("fcurTotalOtherIncome", this.fcurTotalOtherIncome);
    __sqoop$field_map.put("fcurRLWT", this.fcurRLWT);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurExpensesClaimed", this.fcurExpensesClaimed);
    __sqoop$field_map.put("fcurIncomeAfterExpenses", this.fcurIncomeAfterExpenses);
    __sqoop$field_map.put("fcurExtinguishedLosses", this.fcurExtinguishedLosses);
    __sqoop$field_map.put("fcurPriorDeductions", this.fcurPriorDeductions);
    __sqoop$field_map.put("fcurDeductionsClaimed", this.fcurDeductionsClaimed);
    __sqoop$field_map.put("fstrResMethod", this.fstrResMethod);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fblnLTC", this.fblnLTC);
    __sqoop$field_map.put("fblnPartnership", this.fblnPartnership);
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
