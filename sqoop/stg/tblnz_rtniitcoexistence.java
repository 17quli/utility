// ORM class for table 'tblnz_rtniitcoexistence'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:23:37 NZDT 2020
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

public class tblnz_rtniitcoexistence extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngReturnKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.flngReturnKey = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fdtmSentToFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fdtmSentToFIRST = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fstrStatus = (String)value;
      }
    });
    setters.put("fstrReturnType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fstrReturnType = (String)value;
      }
    });
    setters.put("fdtmDateTimeStamp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fdtmDateTimeStamp = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrFIRSTDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fstrFIRSTDLN = (String)value;
      }
    });
    setters.put("fstrId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fstrId = (String)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReturnGen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fdtmReturnGen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrLodgementStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fstrLodgementStatus = (String)value;
      }
    });
    setters.put("fstrUserId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fstrUserId = (String)value;
      }
    });
    setters.put("fdtmLodged", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fdtmLodged = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPTSConfirmed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fstrPTSConfirmed = (String)value;
      }
    });
    setters.put("fcurSchedularPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurSchedularPayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurGrossInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurGrossDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMADistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurMADistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEstateTrustIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurEstateTrustIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurOverseasIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnershipIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurPartnershipIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurActiveLTCIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurActiveLTCIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareholderSalary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurShareholderSalary = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetRent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurNetRent = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSelfEmployedIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurSelfEmployedIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLossesBroughtForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurNetLossesBroughtForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLossesClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurNetLossesClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLRepaymentThreshold", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurSLRepaymentThreshold = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLUnusedRepaymentThreshold", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurSLUnusedRepaymentThreshold = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLAdjustedNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurSLAdjustedNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLLiableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurSLLiableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLAssessmentAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurSLAssessmentAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLInterimRepaymentAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fcurSLInterimRepaymentAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnIR215", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fblnIR215 = (Integer)value;
      }
    });
    setters.put("fintForwardDateNotice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fintForwardDateNotice = (Integer)value;
      }
    });
    setters.put("fblnManualOverride", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fblnManualOverride = (Integer)value;
      }
    });
    setters.put("fblnPartYearReturn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fblnPartYearReturn = (Integer)value;
      }
    });
    setters.put("fstrPartYearSituation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fstrPartYearSituation = (String)value;
      }
    });
    setters.put("fdtmPartYearFromDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fdtmPartYearFromDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPartYearToDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fdtmPartYearToDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitcoexistence.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtniitcoexistence() {
    init0();
  }
  private Integer flngReturnKey;
  public Integer get_flngReturnKey() {
    return flngReturnKey;
  }
  public void set_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
  }
  public tblnz_rtniitcoexistence with_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblnz_rtniitcoexistence with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.sql.Timestamp fdtmSentToFIRST;
  public java.sql.Timestamp get_fdtmSentToFIRST() {
    return fdtmSentToFIRST;
  }
  public void set_fdtmSentToFIRST(java.sql.Timestamp fdtmSentToFIRST) {
    this.fdtmSentToFIRST = fdtmSentToFIRST;
  }
  public tblnz_rtniitcoexistence with_fdtmSentToFIRST(java.sql.Timestamp fdtmSentToFIRST) {
    this.fdtmSentToFIRST = fdtmSentToFIRST;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtniitcoexistence with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrStatus;
  public String get_fstrStatus() {
    return fstrStatus;
  }
  public void set_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
  }
  public tblnz_rtniitcoexistence with_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
    return this;
  }
  private String fstrReturnType;
  public String get_fstrReturnType() {
    return fstrReturnType;
  }
  public void set_fstrReturnType(String fstrReturnType) {
    this.fstrReturnType = fstrReturnType;
  }
  public tblnz_rtniitcoexistence with_fstrReturnType(String fstrReturnType) {
    this.fstrReturnType = fstrReturnType;
    return this;
  }
  private java.sql.Timestamp fdtmDateTimeStamp;
  public java.sql.Timestamp get_fdtmDateTimeStamp() {
    return fdtmDateTimeStamp;
  }
  public void set_fdtmDateTimeStamp(java.sql.Timestamp fdtmDateTimeStamp) {
    this.fdtmDateTimeStamp = fdtmDateTimeStamp;
  }
  public tblnz_rtniitcoexistence with_fdtmDateTimeStamp(java.sql.Timestamp fdtmDateTimeStamp) {
    this.fdtmDateTimeStamp = fdtmDateTimeStamp;
    return this;
  }
  private String fstrFIRSTDLN;
  public String get_fstrFIRSTDLN() {
    return fstrFIRSTDLN;
  }
  public void set_fstrFIRSTDLN(String fstrFIRSTDLN) {
    this.fstrFIRSTDLN = fstrFIRSTDLN;
  }
  public tblnz_rtniitcoexistence with_fstrFIRSTDLN(String fstrFIRSTDLN) {
    this.fstrFIRSTDLN = fstrFIRSTDLN;
    return this;
  }
  private String fstrId;
  public String get_fstrId() {
    return fstrId;
  }
  public void set_fstrId(String fstrId) {
    this.fstrId = fstrId;
  }
  public tblnz_rtniitcoexistence with_fstrId(String fstrId) {
    this.fstrId = fstrId;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_rtniitcoexistence with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmReturnGen;
  public java.sql.Timestamp get_fdtmReturnGen() {
    return fdtmReturnGen;
  }
  public void set_fdtmReturnGen(java.sql.Timestamp fdtmReturnGen) {
    this.fdtmReturnGen = fdtmReturnGen;
  }
  public tblnz_rtniitcoexistence with_fdtmReturnGen(java.sql.Timestamp fdtmReturnGen) {
    this.fdtmReturnGen = fdtmReturnGen;
    return this;
  }
  private String fstrLodgementStatus;
  public String get_fstrLodgementStatus() {
    return fstrLodgementStatus;
  }
  public void set_fstrLodgementStatus(String fstrLodgementStatus) {
    this.fstrLodgementStatus = fstrLodgementStatus;
  }
  public tblnz_rtniitcoexistence with_fstrLodgementStatus(String fstrLodgementStatus) {
    this.fstrLodgementStatus = fstrLodgementStatus;
    return this;
  }
  private String fstrUserId;
  public String get_fstrUserId() {
    return fstrUserId;
  }
  public void set_fstrUserId(String fstrUserId) {
    this.fstrUserId = fstrUserId;
  }
  public tblnz_rtniitcoexistence with_fstrUserId(String fstrUserId) {
    this.fstrUserId = fstrUserId;
    return this;
  }
  private java.sql.Timestamp fdtmLodged;
  public java.sql.Timestamp get_fdtmLodged() {
    return fdtmLodged;
  }
  public void set_fdtmLodged(java.sql.Timestamp fdtmLodged) {
    this.fdtmLodged = fdtmLodged;
  }
  public tblnz_rtniitcoexistence with_fdtmLodged(java.sql.Timestamp fdtmLodged) {
    this.fdtmLodged = fdtmLodged;
    return this;
  }
  private String fstrPTSConfirmed;
  public String get_fstrPTSConfirmed() {
    return fstrPTSConfirmed;
  }
  public void set_fstrPTSConfirmed(String fstrPTSConfirmed) {
    this.fstrPTSConfirmed = fstrPTSConfirmed;
  }
  public tblnz_rtniitcoexistence with_fstrPTSConfirmed(String fstrPTSConfirmed) {
    this.fstrPTSConfirmed = fstrPTSConfirmed;
    return this;
  }
  private java.math.BigDecimal fcurSchedularPayment;
  public java.math.BigDecimal get_fcurSchedularPayment() {
    return fcurSchedularPayment;
  }
  public void set_fcurSchedularPayment(java.math.BigDecimal fcurSchedularPayment) {
    this.fcurSchedularPayment = fcurSchedularPayment;
  }
  public tblnz_rtniitcoexistence with_fcurSchedularPayment(java.math.BigDecimal fcurSchedularPayment) {
    this.fcurSchedularPayment = fcurSchedularPayment;
    return this;
  }
  private java.math.BigDecimal fcurGrossInterest;
  public java.math.BigDecimal get_fcurGrossInterest() {
    return fcurGrossInterest;
  }
  public void set_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
    this.fcurGrossInterest = fcurGrossInterest;
  }
  public tblnz_rtniitcoexistence with_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
    this.fcurGrossInterest = fcurGrossInterest;
    return this;
  }
  private java.math.BigDecimal fcurGrossDividends;
  public java.math.BigDecimal get_fcurGrossDividends() {
    return fcurGrossDividends;
  }
  public void set_fcurGrossDividends(java.math.BigDecimal fcurGrossDividends) {
    this.fcurGrossDividends = fcurGrossDividends;
  }
  public tblnz_rtniitcoexistence with_fcurGrossDividends(java.math.BigDecimal fcurGrossDividends) {
    this.fcurGrossDividends = fcurGrossDividends;
    return this;
  }
  private java.math.BigDecimal fcurMADistributions;
  public java.math.BigDecimal get_fcurMADistributions() {
    return fcurMADistributions;
  }
  public void set_fcurMADistributions(java.math.BigDecimal fcurMADistributions) {
    this.fcurMADistributions = fcurMADistributions;
  }
  public tblnz_rtniitcoexistence with_fcurMADistributions(java.math.BigDecimal fcurMADistributions) {
    this.fcurMADistributions = fcurMADistributions;
    return this;
  }
  private java.math.BigDecimal fcurEstateTrustIncome;
  public java.math.BigDecimal get_fcurEstateTrustIncome() {
    return fcurEstateTrustIncome;
  }
  public void set_fcurEstateTrustIncome(java.math.BigDecimal fcurEstateTrustIncome) {
    this.fcurEstateTrustIncome = fcurEstateTrustIncome;
  }
  public tblnz_rtniitcoexistence with_fcurEstateTrustIncome(java.math.BigDecimal fcurEstateTrustIncome) {
    this.fcurEstateTrustIncome = fcurEstateTrustIncome;
    return this;
  }
  private java.math.BigDecimal fcurOverseasIncome;
  public java.math.BigDecimal get_fcurOverseasIncome() {
    return fcurOverseasIncome;
  }
  public void set_fcurOverseasIncome(java.math.BigDecimal fcurOverseasIncome) {
    this.fcurOverseasIncome = fcurOverseasIncome;
  }
  public tblnz_rtniitcoexistence with_fcurOverseasIncome(java.math.BigDecimal fcurOverseasIncome) {
    this.fcurOverseasIncome = fcurOverseasIncome;
    return this;
  }
  private java.math.BigDecimal fcurPartnershipIncome;
  public java.math.BigDecimal get_fcurPartnershipIncome() {
    return fcurPartnershipIncome;
  }
  public void set_fcurPartnershipIncome(java.math.BigDecimal fcurPartnershipIncome) {
    this.fcurPartnershipIncome = fcurPartnershipIncome;
  }
  public tblnz_rtniitcoexistence with_fcurPartnershipIncome(java.math.BigDecimal fcurPartnershipIncome) {
    this.fcurPartnershipIncome = fcurPartnershipIncome;
    return this;
  }
  private java.math.BigDecimal fcurActiveLTCIncome;
  public java.math.BigDecimal get_fcurActiveLTCIncome() {
    return fcurActiveLTCIncome;
  }
  public void set_fcurActiveLTCIncome(java.math.BigDecimal fcurActiveLTCIncome) {
    this.fcurActiveLTCIncome = fcurActiveLTCIncome;
  }
  public tblnz_rtniitcoexistence with_fcurActiveLTCIncome(java.math.BigDecimal fcurActiveLTCIncome) {
    this.fcurActiveLTCIncome = fcurActiveLTCIncome;
    return this;
  }
  private java.math.BigDecimal fcurShareholderSalary;
  public java.math.BigDecimal get_fcurShareholderSalary() {
    return fcurShareholderSalary;
  }
  public void set_fcurShareholderSalary(java.math.BigDecimal fcurShareholderSalary) {
    this.fcurShareholderSalary = fcurShareholderSalary;
  }
  public tblnz_rtniitcoexistence with_fcurShareholderSalary(java.math.BigDecimal fcurShareholderSalary) {
    this.fcurShareholderSalary = fcurShareholderSalary;
    return this;
  }
  private java.math.BigDecimal fcurNetRent;
  public java.math.BigDecimal get_fcurNetRent() {
    return fcurNetRent;
  }
  public void set_fcurNetRent(java.math.BigDecimal fcurNetRent) {
    this.fcurNetRent = fcurNetRent;
  }
  public tblnz_rtniitcoexistence with_fcurNetRent(java.math.BigDecimal fcurNetRent) {
    this.fcurNetRent = fcurNetRent;
    return this;
  }
  private java.math.BigDecimal fcurSelfEmployedIncome;
  public java.math.BigDecimal get_fcurSelfEmployedIncome() {
    return fcurSelfEmployedIncome;
  }
  public void set_fcurSelfEmployedIncome(java.math.BigDecimal fcurSelfEmployedIncome) {
    this.fcurSelfEmployedIncome = fcurSelfEmployedIncome;
  }
  public tblnz_rtniitcoexistence with_fcurSelfEmployedIncome(java.math.BigDecimal fcurSelfEmployedIncome) {
    this.fcurSelfEmployedIncome = fcurSelfEmployedIncome;
    return this;
  }
  private java.math.BigDecimal fcurOtherIncome;
  public java.math.BigDecimal get_fcurOtherIncome() {
    return fcurOtherIncome;
  }
  public void set_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
  }
  public tblnz_rtniitcoexistence with_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurNetLossesBroughtForward;
  public java.math.BigDecimal get_fcurNetLossesBroughtForward() {
    return fcurNetLossesBroughtForward;
  }
  public void set_fcurNetLossesBroughtForward(java.math.BigDecimal fcurNetLossesBroughtForward) {
    this.fcurNetLossesBroughtForward = fcurNetLossesBroughtForward;
  }
  public tblnz_rtniitcoexistence with_fcurNetLossesBroughtForward(java.math.BigDecimal fcurNetLossesBroughtForward) {
    this.fcurNetLossesBroughtForward = fcurNetLossesBroughtForward;
    return this;
  }
  private java.math.BigDecimal fcurNetLossesClaimed;
  public java.math.BigDecimal get_fcurNetLossesClaimed() {
    return fcurNetLossesClaimed;
  }
  public void set_fcurNetLossesClaimed(java.math.BigDecimal fcurNetLossesClaimed) {
    this.fcurNetLossesClaimed = fcurNetLossesClaimed;
  }
  public tblnz_rtniitcoexistence with_fcurNetLossesClaimed(java.math.BigDecimal fcurNetLossesClaimed) {
    this.fcurNetLossesClaimed = fcurNetLossesClaimed;
    return this;
  }
  private java.math.BigDecimal fcurTaxableIncome;
  public java.math.BigDecimal get_fcurTaxableIncome() {
    return fcurTaxableIncome;
  }
  public void set_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
  }
  public tblnz_rtniitcoexistence with_fcurTaxableIncome(java.math.BigDecimal fcurTaxableIncome) {
    this.fcurTaxableIncome = fcurTaxableIncome;
    return this;
  }
  private java.math.BigDecimal fcurSLRepaymentThreshold;
  public java.math.BigDecimal get_fcurSLRepaymentThreshold() {
    return fcurSLRepaymentThreshold;
  }
  public void set_fcurSLRepaymentThreshold(java.math.BigDecimal fcurSLRepaymentThreshold) {
    this.fcurSLRepaymentThreshold = fcurSLRepaymentThreshold;
  }
  public tblnz_rtniitcoexistence with_fcurSLRepaymentThreshold(java.math.BigDecimal fcurSLRepaymentThreshold) {
    this.fcurSLRepaymentThreshold = fcurSLRepaymentThreshold;
    return this;
  }
  private java.math.BigDecimal fcurSLUnusedRepaymentThreshold;
  public java.math.BigDecimal get_fcurSLUnusedRepaymentThreshold() {
    return fcurSLUnusedRepaymentThreshold;
  }
  public void set_fcurSLUnusedRepaymentThreshold(java.math.BigDecimal fcurSLUnusedRepaymentThreshold) {
    this.fcurSLUnusedRepaymentThreshold = fcurSLUnusedRepaymentThreshold;
  }
  public tblnz_rtniitcoexistence with_fcurSLUnusedRepaymentThreshold(java.math.BigDecimal fcurSLUnusedRepaymentThreshold) {
    this.fcurSLUnusedRepaymentThreshold = fcurSLUnusedRepaymentThreshold;
    return this;
  }
  private java.math.BigDecimal fcurSLAdjustedNetIncome;
  public java.math.BigDecimal get_fcurSLAdjustedNetIncome() {
    return fcurSLAdjustedNetIncome;
  }
  public void set_fcurSLAdjustedNetIncome(java.math.BigDecimal fcurSLAdjustedNetIncome) {
    this.fcurSLAdjustedNetIncome = fcurSLAdjustedNetIncome;
  }
  public tblnz_rtniitcoexistence with_fcurSLAdjustedNetIncome(java.math.BigDecimal fcurSLAdjustedNetIncome) {
    this.fcurSLAdjustedNetIncome = fcurSLAdjustedNetIncome;
    return this;
  }
  private java.math.BigDecimal fcurSLLiableIncome;
  public java.math.BigDecimal get_fcurSLLiableIncome() {
    return fcurSLLiableIncome;
  }
  public void set_fcurSLLiableIncome(java.math.BigDecimal fcurSLLiableIncome) {
    this.fcurSLLiableIncome = fcurSLLiableIncome;
  }
  public tblnz_rtniitcoexistence with_fcurSLLiableIncome(java.math.BigDecimal fcurSLLiableIncome) {
    this.fcurSLLiableIncome = fcurSLLiableIncome;
    return this;
  }
  private java.math.BigDecimal fcurSLAssessmentAmount;
  public java.math.BigDecimal get_fcurSLAssessmentAmount() {
    return fcurSLAssessmentAmount;
  }
  public void set_fcurSLAssessmentAmount(java.math.BigDecimal fcurSLAssessmentAmount) {
    this.fcurSLAssessmentAmount = fcurSLAssessmentAmount;
  }
  public tblnz_rtniitcoexistence with_fcurSLAssessmentAmount(java.math.BigDecimal fcurSLAssessmentAmount) {
    this.fcurSLAssessmentAmount = fcurSLAssessmentAmount;
    return this;
  }
  private java.math.BigDecimal fcurSLInterimRepaymentAmount;
  public java.math.BigDecimal get_fcurSLInterimRepaymentAmount() {
    return fcurSLInterimRepaymentAmount;
  }
  public void set_fcurSLInterimRepaymentAmount(java.math.BigDecimal fcurSLInterimRepaymentAmount) {
    this.fcurSLInterimRepaymentAmount = fcurSLInterimRepaymentAmount;
  }
  public tblnz_rtniitcoexistence with_fcurSLInterimRepaymentAmount(java.math.BigDecimal fcurSLInterimRepaymentAmount) {
    this.fcurSLInterimRepaymentAmount = fcurSLInterimRepaymentAmount;
    return this;
  }
  private Integer fblnIR215;
  public Integer get_fblnIR215() {
    return fblnIR215;
  }
  public void set_fblnIR215(Integer fblnIR215) {
    this.fblnIR215 = fblnIR215;
  }
  public tblnz_rtniitcoexistence with_fblnIR215(Integer fblnIR215) {
    this.fblnIR215 = fblnIR215;
    return this;
  }
  private Integer fintForwardDateNotice;
  public Integer get_fintForwardDateNotice() {
    return fintForwardDateNotice;
  }
  public void set_fintForwardDateNotice(Integer fintForwardDateNotice) {
    this.fintForwardDateNotice = fintForwardDateNotice;
  }
  public tblnz_rtniitcoexistence with_fintForwardDateNotice(Integer fintForwardDateNotice) {
    this.fintForwardDateNotice = fintForwardDateNotice;
    return this;
  }
  private Integer fblnManualOverride;
  public Integer get_fblnManualOverride() {
    return fblnManualOverride;
  }
  public void set_fblnManualOverride(Integer fblnManualOverride) {
    this.fblnManualOverride = fblnManualOverride;
  }
  public tblnz_rtniitcoexistence with_fblnManualOverride(Integer fblnManualOverride) {
    this.fblnManualOverride = fblnManualOverride;
    return this;
  }
  private Integer fblnPartYearReturn;
  public Integer get_fblnPartYearReturn() {
    return fblnPartYearReturn;
  }
  public void set_fblnPartYearReturn(Integer fblnPartYearReturn) {
    this.fblnPartYearReturn = fblnPartYearReturn;
  }
  public tblnz_rtniitcoexistence with_fblnPartYearReturn(Integer fblnPartYearReturn) {
    this.fblnPartYearReturn = fblnPartYearReturn;
    return this;
  }
  private String fstrPartYearSituation;
  public String get_fstrPartYearSituation() {
    return fstrPartYearSituation;
  }
  public void set_fstrPartYearSituation(String fstrPartYearSituation) {
    this.fstrPartYearSituation = fstrPartYearSituation;
  }
  public tblnz_rtniitcoexistence with_fstrPartYearSituation(String fstrPartYearSituation) {
    this.fstrPartYearSituation = fstrPartYearSituation;
    return this;
  }
  private java.sql.Timestamp fdtmPartYearFromDate;
  public java.sql.Timestamp get_fdtmPartYearFromDate() {
    return fdtmPartYearFromDate;
  }
  public void set_fdtmPartYearFromDate(java.sql.Timestamp fdtmPartYearFromDate) {
    this.fdtmPartYearFromDate = fdtmPartYearFromDate;
  }
  public tblnz_rtniitcoexistence with_fdtmPartYearFromDate(java.sql.Timestamp fdtmPartYearFromDate) {
    this.fdtmPartYearFromDate = fdtmPartYearFromDate;
    return this;
  }
  private java.sql.Timestamp fdtmPartYearToDate;
  public java.sql.Timestamp get_fdtmPartYearToDate() {
    return fdtmPartYearToDate;
  }
  public void set_fdtmPartYearToDate(java.sql.Timestamp fdtmPartYearToDate) {
    this.fdtmPartYearToDate = fdtmPartYearToDate;
  }
  public tblnz_rtniitcoexistence with_fdtmPartYearToDate(java.sql.Timestamp fdtmPartYearToDate) {
    this.fdtmPartYearToDate = fdtmPartYearToDate;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtniitcoexistence with_fstrWho(String fstrWho) {
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
  public tblnz_rtniitcoexistence with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitcoexistence)) {
      return false;
    }
    tblnz_rtniitcoexistence that = (tblnz_rtniitcoexistence) o;
    boolean equal = true;
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmSentToFIRST == null ? that.fdtmSentToFIRST == null : this.fdtmSentToFIRST.equals(that.fdtmSentToFIRST));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrReturnType == null ? that.fstrReturnType == null : this.fstrReturnType.equals(that.fstrReturnType));
    equal = equal && (this.fdtmDateTimeStamp == null ? that.fdtmDateTimeStamp == null : this.fdtmDateTimeStamp.equals(that.fdtmDateTimeStamp));
    equal = equal && (this.fstrFIRSTDLN == null ? that.fstrFIRSTDLN == null : this.fstrFIRSTDLN.equals(that.fstrFIRSTDLN));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmReturnGen == null ? that.fdtmReturnGen == null : this.fdtmReturnGen.equals(that.fdtmReturnGen));
    equal = equal && (this.fstrLodgementStatus == null ? that.fstrLodgementStatus == null : this.fstrLodgementStatus.equals(that.fstrLodgementStatus));
    equal = equal && (this.fstrUserId == null ? that.fstrUserId == null : this.fstrUserId.equals(that.fstrUserId));
    equal = equal && (this.fdtmLodged == null ? that.fdtmLodged == null : this.fdtmLodged.equals(that.fdtmLodged));
    equal = equal && (this.fstrPTSConfirmed == null ? that.fstrPTSConfirmed == null : this.fstrPTSConfirmed.equals(that.fstrPTSConfirmed));
    equal = equal && (this.fcurSchedularPayment == null ? that.fcurSchedularPayment == null : this.fcurSchedularPayment.equals(that.fcurSchedularPayment));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurGrossDividends == null ? that.fcurGrossDividends == null : this.fcurGrossDividends.equals(that.fcurGrossDividends));
    equal = equal && (this.fcurMADistributions == null ? that.fcurMADistributions == null : this.fcurMADistributions.equals(that.fcurMADistributions));
    equal = equal && (this.fcurEstateTrustIncome == null ? that.fcurEstateTrustIncome == null : this.fcurEstateTrustIncome.equals(that.fcurEstateTrustIncome));
    equal = equal && (this.fcurOverseasIncome == null ? that.fcurOverseasIncome == null : this.fcurOverseasIncome.equals(that.fcurOverseasIncome));
    equal = equal && (this.fcurPartnershipIncome == null ? that.fcurPartnershipIncome == null : this.fcurPartnershipIncome.equals(that.fcurPartnershipIncome));
    equal = equal && (this.fcurActiveLTCIncome == null ? that.fcurActiveLTCIncome == null : this.fcurActiveLTCIncome.equals(that.fcurActiveLTCIncome));
    equal = equal && (this.fcurShareholderSalary == null ? that.fcurShareholderSalary == null : this.fcurShareholderSalary.equals(that.fcurShareholderSalary));
    equal = equal && (this.fcurNetRent == null ? that.fcurNetRent == null : this.fcurNetRent.equals(that.fcurNetRent));
    equal = equal && (this.fcurSelfEmployedIncome == null ? that.fcurSelfEmployedIncome == null : this.fcurSelfEmployedIncome.equals(that.fcurSelfEmployedIncome));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurNetLossesBroughtForward == null ? that.fcurNetLossesBroughtForward == null : this.fcurNetLossesBroughtForward.equals(that.fcurNetLossesBroughtForward));
    equal = equal && (this.fcurNetLossesClaimed == null ? that.fcurNetLossesClaimed == null : this.fcurNetLossesClaimed.equals(that.fcurNetLossesClaimed));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurSLRepaymentThreshold == null ? that.fcurSLRepaymentThreshold == null : this.fcurSLRepaymentThreshold.equals(that.fcurSLRepaymentThreshold));
    equal = equal && (this.fcurSLUnusedRepaymentThreshold == null ? that.fcurSLUnusedRepaymentThreshold == null : this.fcurSLUnusedRepaymentThreshold.equals(that.fcurSLUnusedRepaymentThreshold));
    equal = equal && (this.fcurSLAdjustedNetIncome == null ? that.fcurSLAdjustedNetIncome == null : this.fcurSLAdjustedNetIncome.equals(that.fcurSLAdjustedNetIncome));
    equal = equal && (this.fcurSLLiableIncome == null ? that.fcurSLLiableIncome == null : this.fcurSLLiableIncome.equals(that.fcurSLLiableIncome));
    equal = equal && (this.fcurSLAssessmentAmount == null ? that.fcurSLAssessmentAmount == null : this.fcurSLAssessmentAmount.equals(that.fcurSLAssessmentAmount));
    equal = equal && (this.fcurSLInterimRepaymentAmount == null ? that.fcurSLInterimRepaymentAmount == null : this.fcurSLInterimRepaymentAmount.equals(that.fcurSLInterimRepaymentAmount));
    equal = equal && (this.fblnIR215 == null ? that.fblnIR215 == null : this.fblnIR215.equals(that.fblnIR215));
    equal = equal && (this.fintForwardDateNotice == null ? that.fintForwardDateNotice == null : this.fintForwardDateNotice.equals(that.fintForwardDateNotice));
    equal = equal && (this.fblnManualOverride == null ? that.fblnManualOverride == null : this.fblnManualOverride.equals(that.fblnManualOverride));
    equal = equal && (this.fblnPartYearReturn == null ? that.fblnPartYearReturn == null : this.fblnPartYearReturn.equals(that.fblnPartYearReturn));
    equal = equal && (this.fstrPartYearSituation == null ? that.fstrPartYearSituation == null : this.fstrPartYearSituation.equals(that.fstrPartYearSituation));
    equal = equal && (this.fdtmPartYearFromDate == null ? that.fdtmPartYearFromDate == null : this.fdtmPartYearFromDate.equals(that.fdtmPartYearFromDate));
    equal = equal && (this.fdtmPartYearToDate == null ? that.fdtmPartYearToDate == null : this.fdtmPartYearToDate.equals(that.fdtmPartYearToDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitcoexistence)) {
      return false;
    }
    tblnz_rtniitcoexistence that = (tblnz_rtniitcoexistence) o;
    boolean equal = true;
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmSentToFIRST == null ? that.fdtmSentToFIRST == null : this.fdtmSentToFIRST.equals(that.fdtmSentToFIRST));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrReturnType == null ? that.fstrReturnType == null : this.fstrReturnType.equals(that.fstrReturnType));
    equal = equal && (this.fdtmDateTimeStamp == null ? that.fdtmDateTimeStamp == null : this.fdtmDateTimeStamp.equals(that.fdtmDateTimeStamp));
    equal = equal && (this.fstrFIRSTDLN == null ? that.fstrFIRSTDLN == null : this.fstrFIRSTDLN.equals(that.fstrFIRSTDLN));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmReturnGen == null ? that.fdtmReturnGen == null : this.fdtmReturnGen.equals(that.fdtmReturnGen));
    equal = equal && (this.fstrLodgementStatus == null ? that.fstrLodgementStatus == null : this.fstrLodgementStatus.equals(that.fstrLodgementStatus));
    equal = equal && (this.fstrUserId == null ? that.fstrUserId == null : this.fstrUserId.equals(that.fstrUserId));
    equal = equal && (this.fdtmLodged == null ? that.fdtmLodged == null : this.fdtmLodged.equals(that.fdtmLodged));
    equal = equal && (this.fstrPTSConfirmed == null ? that.fstrPTSConfirmed == null : this.fstrPTSConfirmed.equals(that.fstrPTSConfirmed));
    equal = equal && (this.fcurSchedularPayment == null ? that.fcurSchedularPayment == null : this.fcurSchedularPayment.equals(that.fcurSchedularPayment));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurGrossDividends == null ? that.fcurGrossDividends == null : this.fcurGrossDividends.equals(that.fcurGrossDividends));
    equal = equal && (this.fcurMADistributions == null ? that.fcurMADistributions == null : this.fcurMADistributions.equals(that.fcurMADistributions));
    equal = equal && (this.fcurEstateTrustIncome == null ? that.fcurEstateTrustIncome == null : this.fcurEstateTrustIncome.equals(that.fcurEstateTrustIncome));
    equal = equal && (this.fcurOverseasIncome == null ? that.fcurOverseasIncome == null : this.fcurOverseasIncome.equals(that.fcurOverseasIncome));
    equal = equal && (this.fcurPartnershipIncome == null ? that.fcurPartnershipIncome == null : this.fcurPartnershipIncome.equals(that.fcurPartnershipIncome));
    equal = equal && (this.fcurActiveLTCIncome == null ? that.fcurActiveLTCIncome == null : this.fcurActiveLTCIncome.equals(that.fcurActiveLTCIncome));
    equal = equal && (this.fcurShareholderSalary == null ? that.fcurShareholderSalary == null : this.fcurShareholderSalary.equals(that.fcurShareholderSalary));
    equal = equal && (this.fcurNetRent == null ? that.fcurNetRent == null : this.fcurNetRent.equals(that.fcurNetRent));
    equal = equal && (this.fcurSelfEmployedIncome == null ? that.fcurSelfEmployedIncome == null : this.fcurSelfEmployedIncome.equals(that.fcurSelfEmployedIncome));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurNetLossesBroughtForward == null ? that.fcurNetLossesBroughtForward == null : this.fcurNetLossesBroughtForward.equals(that.fcurNetLossesBroughtForward));
    equal = equal && (this.fcurNetLossesClaimed == null ? that.fcurNetLossesClaimed == null : this.fcurNetLossesClaimed.equals(that.fcurNetLossesClaimed));
    equal = equal && (this.fcurTaxableIncome == null ? that.fcurTaxableIncome == null : this.fcurTaxableIncome.equals(that.fcurTaxableIncome));
    equal = equal && (this.fcurSLRepaymentThreshold == null ? that.fcurSLRepaymentThreshold == null : this.fcurSLRepaymentThreshold.equals(that.fcurSLRepaymentThreshold));
    equal = equal && (this.fcurSLUnusedRepaymentThreshold == null ? that.fcurSLUnusedRepaymentThreshold == null : this.fcurSLUnusedRepaymentThreshold.equals(that.fcurSLUnusedRepaymentThreshold));
    equal = equal && (this.fcurSLAdjustedNetIncome == null ? that.fcurSLAdjustedNetIncome == null : this.fcurSLAdjustedNetIncome.equals(that.fcurSLAdjustedNetIncome));
    equal = equal && (this.fcurSLLiableIncome == null ? that.fcurSLLiableIncome == null : this.fcurSLLiableIncome.equals(that.fcurSLLiableIncome));
    equal = equal && (this.fcurSLAssessmentAmount == null ? that.fcurSLAssessmentAmount == null : this.fcurSLAssessmentAmount.equals(that.fcurSLAssessmentAmount));
    equal = equal && (this.fcurSLInterimRepaymentAmount == null ? that.fcurSLInterimRepaymentAmount == null : this.fcurSLInterimRepaymentAmount.equals(that.fcurSLInterimRepaymentAmount));
    equal = equal && (this.fblnIR215 == null ? that.fblnIR215 == null : this.fblnIR215.equals(that.fblnIR215));
    equal = equal && (this.fintForwardDateNotice == null ? that.fintForwardDateNotice == null : this.fintForwardDateNotice.equals(that.fintForwardDateNotice));
    equal = equal && (this.fblnManualOverride == null ? that.fblnManualOverride == null : this.fblnManualOverride.equals(that.fblnManualOverride));
    equal = equal && (this.fblnPartYearReturn == null ? that.fblnPartYearReturn == null : this.fblnPartYearReturn.equals(that.fblnPartYearReturn));
    equal = equal && (this.fstrPartYearSituation == null ? that.fstrPartYearSituation == null : this.fstrPartYearSituation.equals(that.fstrPartYearSituation));
    equal = equal && (this.fdtmPartYearFromDate == null ? that.fdtmPartYearFromDate == null : this.fdtmPartYearFromDate.equals(that.fdtmPartYearFromDate));
    equal = equal && (this.fdtmPartYearToDate == null ? that.fdtmPartYearToDate == null : this.fdtmPartYearToDate.equals(that.fdtmPartYearToDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngReturnKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmSentToFIRST = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrReturnType = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmDateTimeStamp = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrFIRSTDLN = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmReturnGen = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrLodgementStatus = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrUserId = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmLodged = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrPTSConfirmed = JdbcWritableBridge.readString(15, __dbResults);
    this.fcurSchedularPayment = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurGrossDividends = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurMADistributions = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurEstateTrustIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurOverseasIncome = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurPartnershipIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurActiveLTCIncome = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurShareholderSalary = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurNetRent = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurSelfEmployedIncome = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetLossesBroughtForward = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurNetLossesClaimed = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurSLRepaymentThreshold = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurSLUnusedRepaymentThreshold = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurSLAdjustedNetIncome = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurSLLiableIncome = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurSLAssessmentAmount = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurSLInterimRepaymentAmount = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fblnIR215 = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fintForwardDateNotice = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fblnManualOverride = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnPartYearReturn = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fstrPartYearSituation = JdbcWritableBridge.readString(41, __dbResults);
    this.fdtmPartYearFromDate = JdbcWritableBridge.readTimestamp(42, __dbResults);
    this.fdtmPartYearToDate = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(44, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(45, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngReturnKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmSentToFIRST = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrReturnType = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmDateTimeStamp = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrFIRSTDLN = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmReturnGen = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrLodgementStatus = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrUserId = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmLodged = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrPTSConfirmed = JdbcWritableBridge.readString(15, __dbResults);
    this.fcurSchedularPayment = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurGrossDividends = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurMADistributions = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurEstateTrustIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurOverseasIncome = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurPartnershipIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurActiveLTCIncome = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurShareholderSalary = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurNetRent = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurSelfEmployedIncome = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetLossesBroughtForward = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurNetLossesClaimed = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTaxableIncome = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurSLRepaymentThreshold = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurSLUnusedRepaymentThreshold = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurSLAdjustedNetIncome = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurSLLiableIncome = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurSLAssessmentAmount = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurSLInterimRepaymentAmount = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fblnIR215 = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fintForwardDateNotice = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fblnManualOverride = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnPartYearReturn = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fstrPartYearSituation = JdbcWritableBridge.readString(41, __dbResults);
    this.fdtmPartYearFromDate = JdbcWritableBridge.readTimestamp(42, __dbResults);
    this.fdtmPartYearToDate = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(44, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(45, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngReturnKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSentToFIRST, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReturnType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateTimeStamp, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFIRSTDLN, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReturnGen, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrLodgementStatus, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUserId, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLodged, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPTSConfirmed, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSchedularPayment, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDividends, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMADistributions, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEstateTrustIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasIncome, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnershipIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurActiveLTCIncome, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderSalary, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetRent, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSelfEmployedIncome, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossesBroughtForward, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossesClaimed, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLRepaymentThreshold, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLUnusedRepaymentThreshold, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLAdjustedNetIncome, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLLiableIncome, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLAssessmentAmount, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLInterimRepaymentAmount, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIR215, 37 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintForwardDateNotice, 38 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualOverride, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPartYearReturn, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartYearSituation, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPartYearFromDate, 42 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPartYearToDate, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 45 + __off, 93, __dbStmt);
    return 45;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngReturnKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSentToFIRST, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReturnType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateTimeStamp, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFIRSTDLN, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReturnGen, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrLodgementStatus, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUserId, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLodged, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPTSConfirmed, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSchedularPayment, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDividends, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMADistributions, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEstateTrustIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasIncome, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnershipIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurActiveLTCIncome, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderSalary, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetRent, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSelfEmployedIncome, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossesBroughtForward, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLossesClaimed, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncome, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLRepaymentThreshold, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLUnusedRepaymentThreshold, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLAdjustedNetIncome, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLLiableIncome, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLAssessmentAmount, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLInterimRepaymentAmount, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIR215, 37 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintForwardDateNotice, 38 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualOverride, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPartYearReturn, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartYearSituation, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPartYearFromDate, 42 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPartYearToDate, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 45 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngReturnKey = null;
    } else {
    this.flngReturnKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSentToFIRST = null;
    } else {
    this.fdtmSentToFIRST = new Timestamp(__dataIn.readLong());
    this.fdtmSentToFIRST.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStatus = null;
    } else {
    this.fstrStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReturnType = null;
    } else {
    this.fstrReturnType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDateTimeStamp = null;
    } else {
    this.fdtmDateTimeStamp = new Timestamp(__dataIn.readLong());
    this.fdtmDateTimeStamp.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFIRSTDLN = null;
    } else {
    this.fstrFIRSTDLN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrId = null;
    } else {
    this.fstrId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReturnGen = null;
    } else {
    this.fdtmReturnGen = new Timestamp(__dataIn.readLong());
    this.fdtmReturnGen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLodgementStatus = null;
    } else {
    this.fstrLodgementStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUserId = null;
    } else {
    this.fstrUserId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLodged = null;
    } else {
    this.fdtmLodged = new Timestamp(__dataIn.readLong());
    this.fdtmLodged.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPTSConfirmed = null;
    } else {
    this.fstrPTSConfirmed = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSchedularPayment = null;
    } else {
    this.fcurSchedularPayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossInterest = null;
    } else {
    this.fcurGrossInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossDividends = null;
    } else {
    this.fcurGrossDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMADistributions = null;
    } else {
    this.fcurMADistributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEstateTrustIncome = null;
    } else {
    this.fcurEstateTrustIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOverseasIncome = null;
    } else {
    this.fcurOverseasIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnershipIncome = null;
    } else {
    this.fcurPartnershipIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurActiveLTCIncome = null;
    } else {
    this.fcurActiveLTCIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareholderSalary = null;
    } else {
    this.fcurShareholderSalary = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetRent = null;
    } else {
    this.fcurNetRent = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSelfEmployedIncome = null;
    } else {
    this.fcurSelfEmployedIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherIncome = null;
    } else {
    this.fcurOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetLossesBroughtForward = null;
    } else {
    this.fcurNetLossesBroughtForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetLossesClaimed = null;
    } else {
    this.fcurNetLossesClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxableIncome = null;
    } else {
    this.fcurTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLRepaymentThreshold = null;
    } else {
    this.fcurSLRepaymentThreshold = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLUnusedRepaymentThreshold = null;
    } else {
    this.fcurSLUnusedRepaymentThreshold = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLAdjustedNetIncome = null;
    } else {
    this.fcurSLAdjustedNetIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLLiableIncome = null;
    } else {
    this.fcurSLLiableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLAssessmentAmount = null;
    } else {
    this.fcurSLAssessmentAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLInterimRepaymentAmount = null;
    } else {
    this.fcurSLInterimRepaymentAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIR215 = null;
    } else {
    this.fblnIR215 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintForwardDateNotice = null;
    } else {
    this.fintForwardDateNotice = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnManualOverride = null;
    } else {
    this.fblnManualOverride = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPartYearReturn = null;
    } else {
    this.fblnPartYearReturn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPartYearSituation = null;
    } else {
    this.fstrPartYearSituation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPartYearFromDate = null;
    } else {
    this.fdtmPartYearFromDate = new Timestamp(__dataIn.readLong());
    this.fdtmPartYearFromDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPartYearToDate = null;
    } else {
    this.fdtmPartYearToDate = new Timestamp(__dataIn.readLong());
    this.fdtmPartYearToDate.setNanos(__dataIn.readInt());
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fdtmSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmSentToFIRST.getNanos());
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fstrReturnType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReturnType);
    }
    if (null == this.fdtmDateTimeStamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateTimeStamp.getTime());
    __dataOut.writeInt(this.fdtmDateTimeStamp.getNanos());
    }
    if (null == this.fstrFIRSTDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFIRSTDLN);
    }
    if (null == this.fstrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrId);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fdtmReturnGen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReturnGen.getTime());
    __dataOut.writeInt(this.fdtmReturnGen.getNanos());
    }
    if (null == this.fstrLodgementStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLodgementStatus);
    }
    if (null == this.fstrUserId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUserId);
    }
    if (null == this.fdtmLodged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLodged.getTime());
    __dataOut.writeInt(this.fdtmLodged.getNanos());
    }
    if (null == this.fstrPTSConfirmed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPTSConfirmed);
    }
    if (null == this.fcurSchedularPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSchedularPayment, __dataOut);
    }
    if (null == this.fcurGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossInterest, __dataOut);
    }
    if (null == this.fcurGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDividends, __dataOut);
    }
    if (null == this.fcurMADistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMADistributions, __dataOut);
    }
    if (null == this.fcurEstateTrustIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEstateTrustIncome, __dataOut);
    }
    if (null == this.fcurOverseasIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasIncome, __dataOut);
    }
    if (null == this.fcurPartnershipIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnershipIncome, __dataOut);
    }
    if (null == this.fcurActiveLTCIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurActiveLTCIncome, __dataOut);
    }
    if (null == this.fcurShareholderSalary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderSalary, __dataOut);
    }
    if (null == this.fcurNetRent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetRent, __dataOut);
    }
    if (null == this.fcurSelfEmployedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSelfEmployedIncome, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurNetLossesBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossesBroughtForward, __dataOut);
    }
    if (null == this.fcurNetLossesClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossesClaimed, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fcurSLRepaymentThreshold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLRepaymentThreshold, __dataOut);
    }
    if (null == this.fcurSLUnusedRepaymentThreshold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLUnusedRepaymentThreshold, __dataOut);
    }
    if (null == this.fcurSLAdjustedNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLAdjustedNetIncome, __dataOut);
    }
    if (null == this.fcurSLLiableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLLiableIncome, __dataOut);
    }
    if (null == this.fcurSLAssessmentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLAssessmentAmount, __dataOut);
    }
    if (null == this.fcurSLInterimRepaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLInterimRepaymentAmount, __dataOut);
    }
    if (null == this.fblnIR215) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIR215);
    }
    if (null == this.fintForwardDateNotice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintForwardDateNotice);
    }
    if (null == this.fblnManualOverride) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualOverride);
    }
    if (null == this.fblnPartYearReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPartYearReturn);
    }
    if (null == this.fstrPartYearSituation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartYearSituation);
    }
    if (null == this.fdtmPartYearFromDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPartYearFromDate.getTime());
    __dataOut.writeInt(this.fdtmPartYearFromDate.getNanos());
    }
    if (null == this.fdtmPartYearToDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPartYearToDate.getTime());
    __dataOut.writeInt(this.fdtmPartYearToDate.getNanos());
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fdtmSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmSentToFIRST.getNanos());
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fstrReturnType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReturnType);
    }
    if (null == this.fdtmDateTimeStamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateTimeStamp.getTime());
    __dataOut.writeInt(this.fdtmDateTimeStamp.getNanos());
    }
    if (null == this.fstrFIRSTDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFIRSTDLN);
    }
    if (null == this.fstrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrId);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fdtmReturnGen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReturnGen.getTime());
    __dataOut.writeInt(this.fdtmReturnGen.getNanos());
    }
    if (null == this.fstrLodgementStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLodgementStatus);
    }
    if (null == this.fstrUserId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUserId);
    }
    if (null == this.fdtmLodged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLodged.getTime());
    __dataOut.writeInt(this.fdtmLodged.getNanos());
    }
    if (null == this.fstrPTSConfirmed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPTSConfirmed);
    }
    if (null == this.fcurSchedularPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSchedularPayment, __dataOut);
    }
    if (null == this.fcurGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossInterest, __dataOut);
    }
    if (null == this.fcurGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDividends, __dataOut);
    }
    if (null == this.fcurMADistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMADistributions, __dataOut);
    }
    if (null == this.fcurEstateTrustIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEstateTrustIncome, __dataOut);
    }
    if (null == this.fcurOverseasIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasIncome, __dataOut);
    }
    if (null == this.fcurPartnershipIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnershipIncome, __dataOut);
    }
    if (null == this.fcurActiveLTCIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurActiveLTCIncome, __dataOut);
    }
    if (null == this.fcurShareholderSalary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderSalary, __dataOut);
    }
    if (null == this.fcurNetRent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetRent, __dataOut);
    }
    if (null == this.fcurSelfEmployedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSelfEmployedIncome, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurNetLossesBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossesBroughtForward, __dataOut);
    }
    if (null == this.fcurNetLossesClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLossesClaimed, __dataOut);
    }
    if (null == this.fcurTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncome, __dataOut);
    }
    if (null == this.fcurSLRepaymentThreshold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLRepaymentThreshold, __dataOut);
    }
    if (null == this.fcurSLUnusedRepaymentThreshold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLUnusedRepaymentThreshold, __dataOut);
    }
    if (null == this.fcurSLAdjustedNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLAdjustedNetIncome, __dataOut);
    }
    if (null == this.fcurSLLiableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLLiableIncome, __dataOut);
    }
    if (null == this.fcurSLAssessmentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLAssessmentAmount, __dataOut);
    }
    if (null == this.fcurSLInterimRepaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLInterimRepaymentAmount, __dataOut);
    }
    if (null == this.fblnIR215) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIR215);
    }
    if (null == this.fintForwardDateNotice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintForwardDateNotice);
    }
    if (null == this.fblnManualOverride) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualOverride);
    }
    if (null == this.fblnPartYearReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPartYearReturn);
    }
    if (null == this.fstrPartYearSituation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartYearSituation);
    }
    if (null == this.fdtmPartYearFromDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPartYearFromDate.getTime());
    __dataOut.writeInt(this.fdtmPartYearFromDate.getNanos());
    }
    if (null == this.fdtmPartYearToDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPartYearToDate.getTime());
    __dataOut.writeInt(this.fdtmPartYearToDate.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSentToFIRST==null?"\\N":"" + fdtmSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReturnType==null?"\\N":fstrReturnType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateTimeStamp==null?"\\N":"" + fdtmDateTimeStamp, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFIRSTDLN==null?"\\N":fstrFIRSTDLN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReturnGen==null?"\\N":"" + fdtmReturnGen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLodgementStatus==null?"\\N":fstrLodgementStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUserId==null?"\\N":fstrUserId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLodged==null?"\\N":"" + fdtmLodged, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPTSConfirmed==null?"\\N":fstrPTSConfirmed, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSchedularPayment==null?"\\N":fcurSchedularPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossInterest==null?"\\N":fcurGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDividends==null?"\\N":fcurGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMADistributions==null?"\\N":fcurMADistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEstateTrustIncome==null?"\\N":fcurEstateTrustIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasIncome==null?"\\N":fcurOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnershipIncome==null?"\\N":fcurPartnershipIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurActiveLTCIncome==null?"\\N":fcurActiveLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderSalary==null?"\\N":fcurShareholderSalary.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetRent==null?"\\N":fcurNetRent.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSelfEmployedIncome==null?"\\N":fcurSelfEmployedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossesBroughtForward==null?"\\N":fcurNetLossesBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossesClaimed==null?"\\N":fcurNetLossesClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLRepaymentThreshold==null?"\\N":fcurSLRepaymentThreshold.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLUnusedRepaymentThreshold==null?"\\N":fcurSLUnusedRepaymentThreshold.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLAdjustedNetIncome==null?"\\N":fcurSLAdjustedNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLLiableIncome==null?"\\N":fcurSLLiableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLAssessmentAmount==null?"\\N":fcurSLAssessmentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLInterimRepaymentAmount==null?"\\N":fcurSLInterimRepaymentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIR215==null?"\\N":"" + fblnIR215, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintForwardDateNotice==null?"\\N":"" + fintForwardDateNotice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualOverride==null?"\\N":"" + fblnManualOverride, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPartYearReturn==null?"\\N":"" + fblnPartYearReturn, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartYearSituation==null?"\\N":fstrPartYearSituation, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPartYearFromDate==null?"\\N":"" + fdtmPartYearFromDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPartYearToDate==null?"\\N":"" + fdtmPartYearToDate, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSentToFIRST==null?"\\N":"" + fdtmSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReturnType==null?"\\N":fstrReturnType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateTimeStamp==null?"\\N":"" + fdtmDateTimeStamp, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFIRSTDLN==null?"\\N":fstrFIRSTDLN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReturnGen==null?"\\N":"" + fdtmReturnGen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLodgementStatus==null?"\\N":fstrLodgementStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUserId==null?"\\N":fstrUserId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLodged==null?"\\N":"" + fdtmLodged, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPTSConfirmed==null?"\\N":fstrPTSConfirmed, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSchedularPayment==null?"\\N":fcurSchedularPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossInterest==null?"\\N":fcurGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDividends==null?"\\N":fcurGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMADistributions==null?"\\N":fcurMADistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEstateTrustIncome==null?"\\N":fcurEstateTrustIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasIncome==null?"\\N":fcurOverseasIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnershipIncome==null?"\\N":fcurPartnershipIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurActiveLTCIncome==null?"\\N":fcurActiveLTCIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderSalary==null?"\\N":fcurShareholderSalary.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetRent==null?"\\N":fcurNetRent.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSelfEmployedIncome==null?"\\N":fcurSelfEmployedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossesBroughtForward==null?"\\N":fcurNetLossesBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLossesClaimed==null?"\\N":fcurNetLossesClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncome==null?"\\N":fcurTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLRepaymentThreshold==null?"\\N":fcurSLRepaymentThreshold.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLUnusedRepaymentThreshold==null?"\\N":fcurSLUnusedRepaymentThreshold.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLAdjustedNetIncome==null?"\\N":fcurSLAdjustedNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLLiableIncome==null?"\\N":fcurSLLiableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLAssessmentAmount==null?"\\N":fcurSLAssessmentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLInterimRepaymentAmount==null?"\\N":fcurSLInterimRepaymentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIR215==null?"\\N":"" + fblnIR215, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintForwardDateNotice==null?"\\N":"" + fintForwardDateNotice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualOverride==null?"\\N":"" + fblnManualOverride, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPartYearReturn==null?"\\N":"" + fblnPartYearReturn, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartYearSituation==null?"\\N":fstrPartYearSituation, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPartYearFromDate==null?"\\N":"" + fdtmPartYearFromDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPartYearToDate==null?"\\N":"" + fdtmPartYearToDate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSentToFIRST = null; } else {
      this.fdtmSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null")) { this.fstrStatus = null; } else {
      this.fstrStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReturnType = null; } else {
      this.fstrReturnType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateTimeStamp = null; } else {
      this.fdtmDateTimeStamp = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFIRSTDLN = null; } else {
      this.fstrFIRSTDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrId = null; } else {
      this.fstrId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReturnGen = null; } else {
      this.fdtmReturnGen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLodgementStatus = null; } else {
      this.fstrLodgementStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUserId = null; } else {
      this.fstrUserId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLodged = null; } else {
      this.fdtmLodged = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPTSConfirmed = null; } else {
      this.fstrPTSConfirmed = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSchedularPayment = null; } else {
      this.fcurSchedularPayment = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDividends = null; } else {
      this.fcurGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMADistributions = null; } else {
      this.fcurMADistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEstateTrustIncome = null; } else {
      this.fcurEstateTrustIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnershipIncome = null; } else {
      this.fcurPartnershipIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurActiveLTCIncome = null; } else {
      this.fcurActiveLTCIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderSalary = null; } else {
      this.fcurShareholderSalary = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetRent = null; } else {
      this.fcurNetRent = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSelfEmployedIncome = null; } else {
      this.fcurSelfEmployedIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossesBroughtForward = null; } else {
      this.fcurNetLossesBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossesClaimed = null; } else {
      this.fcurNetLossesClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLRepaymentThreshold = null; } else {
      this.fcurSLRepaymentThreshold = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLUnusedRepaymentThreshold = null; } else {
      this.fcurSLUnusedRepaymentThreshold = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLAdjustedNetIncome = null; } else {
      this.fcurSLAdjustedNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLLiableIncome = null; } else {
      this.fcurSLLiableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLAssessmentAmount = null; } else {
      this.fcurSLAssessmentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLInterimRepaymentAmount = null; } else {
      this.fcurSLInterimRepaymentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIR215 = null; } else {
      this.fblnIR215 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintForwardDateNotice = null; } else {
      this.fintForwardDateNotice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManualOverride = null; } else {
      this.fblnManualOverride = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPartYearReturn = null; } else {
      this.fblnPartYearReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartYearSituation = null; } else {
      this.fstrPartYearSituation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPartYearFromDate = null; } else {
      this.fdtmPartYearFromDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPartYearToDate = null; } else {
      this.fdtmPartYearToDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSentToFIRST = null; } else {
      this.fdtmSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null")) { this.fstrStatus = null; } else {
      this.fstrStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReturnType = null; } else {
      this.fstrReturnType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateTimeStamp = null; } else {
      this.fdtmDateTimeStamp = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFIRSTDLN = null; } else {
      this.fstrFIRSTDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrId = null; } else {
      this.fstrId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReturnGen = null; } else {
      this.fdtmReturnGen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLodgementStatus = null; } else {
      this.fstrLodgementStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUserId = null; } else {
      this.fstrUserId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLodged = null; } else {
      this.fdtmLodged = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPTSConfirmed = null; } else {
      this.fstrPTSConfirmed = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSchedularPayment = null; } else {
      this.fcurSchedularPayment = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDividends = null; } else {
      this.fcurGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMADistributions = null; } else {
      this.fcurMADistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEstateTrustIncome = null; } else {
      this.fcurEstateTrustIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnershipIncome = null; } else {
      this.fcurPartnershipIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurActiveLTCIncome = null; } else {
      this.fcurActiveLTCIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderSalary = null; } else {
      this.fcurShareholderSalary = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetRent = null; } else {
      this.fcurNetRent = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSelfEmployedIncome = null; } else {
      this.fcurSelfEmployedIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossesBroughtForward = null; } else {
      this.fcurNetLossesBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLossesClaimed = null; } else {
      this.fcurNetLossesClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLRepaymentThreshold = null; } else {
      this.fcurSLRepaymentThreshold = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLUnusedRepaymentThreshold = null; } else {
      this.fcurSLUnusedRepaymentThreshold = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLAdjustedNetIncome = null; } else {
      this.fcurSLAdjustedNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLLiableIncome = null; } else {
      this.fcurSLLiableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLAssessmentAmount = null; } else {
      this.fcurSLAssessmentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLInterimRepaymentAmount = null; } else {
      this.fcurSLInterimRepaymentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIR215 = null; } else {
      this.fblnIR215 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintForwardDateNotice = null; } else {
      this.fintForwardDateNotice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManualOverride = null; } else {
      this.fblnManualOverride = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPartYearReturn = null; } else {
      this.fblnPartYearReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartYearSituation = null; } else {
      this.fstrPartYearSituation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPartYearFromDate = null; } else {
      this.fdtmPartYearFromDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPartYearToDate = null; } else {
      this.fdtmPartYearToDate = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_rtniitcoexistence o = (tblnz_rtniitcoexistence) super.clone();
    o.fdtmSentToFIRST = (o.fdtmSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmSentToFIRST.clone() : null;
    o.fdtmDateTimeStamp = (o.fdtmDateTimeStamp != null) ? (java.sql.Timestamp) o.fdtmDateTimeStamp.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmReturnGen = (o.fdtmReturnGen != null) ? (java.sql.Timestamp) o.fdtmReturnGen.clone() : null;
    o.fdtmLodged = (o.fdtmLodged != null) ? (java.sql.Timestamp) o.fdtmLodged.clone() : null;
    o.fdtmPartYearFromDate = (o.fdtmPartYearFromDate != null) ? (java.sql.Timestamp) o.fdtmPartYearFromDate.clone() : null;
    o.fdtmPartYearToDate = (o.fdtmPartYearToDate != null) ? (java.sql.Timestamp) o.fdtmPartYearToDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtniitcoexistence o) throws CloneNotSupportedException {
    o.fdtmSentToFIRST = (o.fdtmSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmSentToFIRST.clone() : null;
    o.fdtmDateTimeStamp = (o.fdtmDateTimeStamp != null) ? (java.sql.Timestamp) o.fdtmDateTimeStamp.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmReturnGen = (o.fdtmReturnGen != null) ? (java.sql.Timestamp) o.fdtmReturnGen.clone() : null;
    o.fdtmLodged = (o.fdtmLodged != null) ? (java.sql.Timestamp) o.fdtmLodged.clone() : null;
    o.fdtmPartYearFromDate = (o.fdtmPartYearFromDate != null) ? (java.sql.Timestamp) o.fdtmPartYearFromDate.clone() : null;
    o.fdtmPartYearToDate = (o.fdtmPartYearToDate != null) ? (java.sql.Timestamp) o.fdtmPartYearToDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmSentToFIRST", this.fdtmSentToFIRST);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrReturnType", this.fstrReturnType);
    __sqoop$field_map.put("fdtmDateTimeStamp", this.fdtmDateTimeStamp);
    __sqoop$field_map.put("fstrFIRSTDLN", this.fstrFIRSTDLN);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmReturnGen", this.fdtmReturnGen);
    __sqoop$field_map.put("fstrLodgementStatus", this.fstrLodgementStatus);
    __sqoop$field_map.put("fstrUserId", this.fstrUserId);
    __sqoop$field_map.put("fdtmLodged", this.fdtmLodged);
    __sqoop$field_map.put("fstrPTSConfirmed", this.fstrPTSConfirmed);
    __sqoop$field_map.put("fcurSchedularPayment", this.fcurSchedularPayment);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurGrossDividends", this.fcurGrossDividends);
    __sqoop$field_map.put("fcurMADistributions", this.fcurMADistributions);
    __sqoop$field_map.put("fcurEstateTrustIncome", this.fcurEstateTrustIncome);
    __sqoop$field_map.put("fcurOverseasIncome", this.fcurOverseasIncome);
    __sqoop$field_map.put("fcurPartnershipIncome", this.fcurPartnershipIncome);
    __sqoop$field_map.put("fcurActiveLTCIncome", this.fcurActiveLTCIncome);
    __sqoop$field_map.put("fcurShareholderSalary", this.fcurShareholderSalary);
    __sqoop$field_map.put("fcurNetRent", this.fcurNetRent);
    __sqoop$field_map.put("fcurSelfEmployedIncome", this.fcurSelfEmployedIncome);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurNetLossesBroughtForward", this.fcurNetLossesBroughtForward);
    __sqoop$field_map.put("fcurNetLossesClaimed", this.fcurNetLossesClaimed);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurSLRepaymentThreshold", this.fcurSLRepaymentThreshold);
    __sqoop$field_map.put("fcurSLUnusedRepaymentThreshold", this.fcurSLUnusedRepaymentThreshold);
    __sqoop$field_map.put("fcurSLAdjustedNetIncome", this.fcurSLAdjustedNetIncome);
    __sqoop$field_map.put("fcurSLLiableIncome", this.fcurSLLiableIncome);
    __sqoop$field_map.put("fcurSLAssessmentAmount", this.fcurSLAssessmentAmount);
    __sqoop$field_map.put("fcurSLInterimRepaymentAmount", this.fcurSLInterimRepaymentAmount);
    __sqoop$field_map.put("fblnIR215", this.fblnIR215);
    __sqoop$field_map.put("fintForwardDateNotice", this.fintForwardDateNotice);
    __sqoop$field_map.put("fblnManualOverride", this.fblnManualOverride);
    __sqoop$field_map.put("fblnPartYearReturn", this.fblnPartYearReturn);
    __sqoop$field_map.put("fstrPartYearSituation", this.fstrPartYearSituation);
    __sqoop$field_map.put("fdtmPartYearFromDate", this.fdtmPartYearFromDate);
    __sqoop$field_map.put("fdtmPartYearToDate", this.fdtmPartYearToDate);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmSentToFIRST", this.fdtmSentToFIRST);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrReturnType", this.fstrReturnType);
    __sqoop$field_map.put("fdtmDateTimeStamp", this.fdtmDateTimeStamp);
    __sqoop$field_map.put("fstrFIRSTDLN", this.fstrFIRSTDLN);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmReturnGen", this.fdtmReturnGen);
    __sqoop$field_map.put("fstrLodgementStatus", this.fstrLodgementStatus);
    __sqoop$field_map.put("fstrUserId", this.fstrUserId);
    __sqoop$field_map.put("fdtmLodged", this.fdtmLodged);
    __sqoop$field_map.put("fstrPTSConfirmed", this.fstrPTSConfirmed);
    __sqoop$field_map.put("fcurSchedularPayment", this.fcurSchedularPayment);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurGrossDividends", this.fcurGrossDividends);
    __sqoop$field_map.put("fcurMADistributions", this.fcurMADistributions);
    __sqoop$field_map.put("fcurEstateTrustIncome", this.fcurEstateTrustIncome);
    __sqoop$field_map.put("fcurOverseasIncome", this.fcurOverseasIncome);
    __sqoop$field_map.put("fcurPartnershipIncome", this.fcurPartnershipIncome);
    __sqoop$field_map.put("fcurActiveLTCIncome", this.fcurActiveLTCIncome);
    __sqoop$field_map.put("fcurShareholderSalary", this.fcurShareholderSalary);
    __sqoop$field_map.put("fcurNetRent", this.fcurNetRent);
    __sqoop$field_map.put("fcurSelfEmployedIncome", this.fcurSelfEmployedIncome);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurNetLossesBroughtForward", this.fcurNetLossesBroughtForward);
    __sqoop$field_map.put("fcurNetLossesClaimed", this.fcurNetLossesClaimed);
    __sqoop$field_map.put("fcurTaxableIncome", this.fcurTaxableIncome);
    __sqoop$field_map.put("fcurSLRepaymentThreshold", this.fcurSLRepaymentThreshold);
    __sqoop$field_map.put("fcurSLUnusedRepaymentThreshold", this.fcurSLUnusedRepaymentThreshold);
    __sqoop$field_map.put("fcurSLAdjustedNetIncome", this.fcurSLAdjustedNetIncome);
    __sqoop$field_map.put("fcurSLLiableIncome", this.fcurSLLiableIncome);
    __sqoop$field_map.put("fcurSLAssessmentAmount", this.fcurSLAssessmentAmount);
    __sqoop$field_map.put("fcurSLInterimRepaymentAmount", this.fcurSLInterimRepaymentAmount);
    __sqoop$field_map.put("fblnIR215", this.fblnIR215);
    __sqoop$field_map.put("fintForwardDateNotice", this.fintForwardDateNotice);
    __sqoop$field_map.put("fblnManualOverride", this.fblnManualOverride);
    __sqoop$field_map.put("fblnPartYearReturn", this.fblnPartYearReturn);
    __sqoop$field_map.put("fstrPartYearSituation", this.fstrPartYearSituation);
    __sqoop$field_map.put("fdtmPartYearFromDate", this.fdtmPartYearFromDate);
    __sqoop$field_map.put("fdtmPartYearToDate", this.fdtmPartYearToDate);
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
