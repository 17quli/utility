// ORM class for table 'tblperiod'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:59:25 NZDT 2020
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

public class tblperiod extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngLinkedAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.flngLinkedAccountKey = (Integer)value;
      }
    });
    setters.put("flngJointAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.flngJointAccountKey = (Integer)value;
      }
    });
    setters.put("fblnPrime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fblnPrime = (Integer)value;
      }
    });
    setters.put("fdtmPeriodBegin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmPeriodBegin = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPeriodEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmPeriodEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrFiling", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fstrFiling = (String)value;
      }
    });
    setters.put("fcurTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurTaxBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurTaxDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurInterestBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurInterestDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenaltyBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurPenaltyBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenaltyDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurPenaltyDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurOther = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurOtherBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurOtherDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurCreditBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurCreditDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fcurBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmActivity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmActivity = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmPenalty = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEffectMax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmEffectMax = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmDelta = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmStatute", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmStatute = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmSystemStatute", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmSystemStatute = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmUserStatute", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmUserStatute = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnSBAExists", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fblnSBAExists = (Integer)value;
      }
    });
    setters.put("fblnRA", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fblnRA = (Integer)value;
      }
    });
    setters.put("fblnPNI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fblnPNI = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiod.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblperiod() {
    init0();
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblperiod with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblperiod with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblperiod with_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblperiod with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngLinkedAccountKey;
  public Integer get_flngLinkedAccountKey() {
    return flngLinkedAccountKey;
  }
  public void set_flngLinkedAccountKey(Integer flngLinkedAccountKey) {
    this.flngLinkedAccountKey = flngLinkedAccountKey;
  }
  public tblperiod with_flngLinkedAccountKey(Integer flngLinkedAccountKey) {
    this.flngLinkedAccountKey = flngLinkedAccountKey;
    return this;
  }
  private Integer flngJointAccountKey;
  public Integer get_flngJointAccountKey() {
    return flngJointAccountKey;
  }
  public void set_flngJointAccountKey(Integer flngJointAccountKey) {
    this.flngJointAccountKey = flngJointAccountKey;
  }
  public tblperiod with_flngJointAccountKey(Integer flngJointAccountKey) {
    this.flngJointAccountKey = flngJointAccountKey;
    return this;
  }
  private Integer fblnPrime;
  public Integer get_fblnPrime() {
    return fblnPrime;
  }
  public void set_fblnPrime(Integer fblnPrime) {
    this.fblnPrime = fblnPrime;
  }
  public tblperiod with_fblnPrime(Integer fblnPrime) {
    this.fblnPrime = fblnPrime;
    return this;
  }
  private java.sql.Timestamp fdtmPeriodBegin;
  public java.sql.Timestamp get_fdtmPeriodBegin() {
    return fdtmPeriodBegin;
  }
  public void set_fdtmPeriodBegin(java.sql.Timestamp fdtmPeriodBegin) {
    this.fdtmPeriodBegin = fdtmPeriodBegin;
  }
  public tblperiod with_fdtmPeriodBegin(java.sql.Timestamp fdtmPeriodBegin) {
    this.fdtmPeriodBegin = fdtmPeriodBegin;
    return this;
  }
  private java.sql.Timestamp fdtmPeriodEnd;
  public java.sql.Timestamp get_fdtmPeriodEnd() {
    return fdtmPeriodEnd;
  }
  public void set_fdtmPeriodEnd(java.sql.Timestamp fdtmPeriodEnd) {
    this.fdtmPeriodEnd = fdtmPeriodEnd;
  }
  public tblperiod with_fdtmPeriodEnd(java.sql.Timestamp fdtmPeriodEnd) {
    this.fdtmPeriodEnd = fdtmPeriodEnd;
    return this;
  }
  private String fstrFiling;
  public String get_fstrFiling() {
    return fstrFiling;
  }
  public void set_fstrFiling(String fstrFiling) {
    this.fstrFiling = fstrFiling;
  }
  public tblperiod with_fstrFiling(String fstrFiling) {
    this.fstrFiling = fstrFiling;
    return this;
  }
  private java.math.BigDecimal fcurTax;
  public java.math.BigDecimal get_fcurTax() {
    return fcurTax;
  }
  public void set_fcurTax(java.math.BigDecimal fcurTax) {
    this.fcurTax = fcurTax;
  }
  public tblperiod with_fcurTax(java.math.BigDecimal fcurTax) {
    this.fcurTax = fcurTax;
    return this;
  }
  private java.math.BigDecimal fcurTaxBalance;
  public java.math.BigDecimal get_fcurTaxBalance() {
    return fcurTaxBalance;
  }
  public void set_fcurTaxBalance(java.math.BigDecimal fcurTaxBalance) {
    this.fcurTaxBalance = fcurTaxBalance;
  }
  public tblperiod with_fcurTaxBalance(java.math.BigDecimal fcurTaxBalance) {
    this.fcurTaxBalance = fcurTaxBalance;
    return this;
  }
  private java.math.BigDecimal fcurTaxDelta;
  public java.math.BigDecimal get_fcurTaxDelta() {
    return fcurTaxDelta;
  }
  public void set_fcurTaxDelta(java.math.BigDecimal fcurTaxDelta) {
    this.fcurTaxDelta = fcurTaxDelta;
  }
  public tblperiod with_fcurTaxDelta(java.math.BigDecimal fcurTaxDelta) {
    this.fcurTaxDelta = fcurTaxDelta;
    return this;
  }
  private java.math.BigDecimal fcurInterest;
  public java.math.BigDecimal get_fcurInterest() {
    return fcurInterest;
  }
  public void set_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
  }
  public tblperiod with_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
    return this;
  }
  private java.math.BigDecimal fcurInterestBalance;
  public java.math.BigDecimal get_fcurInterestBalance() {
    return fcurInterestBalance;
  }
  public void set_fcurInterestBalance(java.math.BigDecimal fcurInterestBalance) {
    this.fcurInterestBalance = fcurInterestBalance;
  }
  public tblperiod with_fcurInterestBalance(java.math.BigDecimal fcurInterestBalance) {
    this.fcurInterestBalance = fcurInterestBalance;
    return this;
  }
  private java.math.BigDecimal fcurInterestDelta;
  public java.math.BigDecimal get_fcurInterestDelta() {
    return fcurInterestDelta;
  }
  public void set_fcurInterestDelta(java.math.BigDecimal fcurInterestDelta) {
    this.fcurInterestDelta = fcurInterestDelta;
  }
  public tblperiod with_fcurInterestDelta(java.math.BigDecimal fcurInterestDelta) {
    this.fcurInterestDelta = fcurInterestDelta;
    return this;
  }
  private java.math.BigDecimal fcurPenalty;
  public java.math.BigDecimal get_fcurPenalty() {
    return fcurPenalty;
  }
  public void set_fcurPenalty(java.math.BigDecimal fcurPenalty) {
    this.fcurPenalty = fcurPenalty;
  }
  public tblperiod with_fcurPenalty(java.math.BigDecimal fcurPenalty) {
    this.fcurPenalty = fcurPenalty;
    return this;
  }
  private java.math.BigDecimal fcurPenaltyBalance;
  public java.math.BigDecimal get_fcurPenaltyBalance() {
    return fcurPenaltyBalance;
  }
  public void set_fcurPenaltyBalance(java.math.BigDecimal fcurPenaltyBalance) {
    this.fcurPenaltyBalance = fcurPenaltyBalance;
  }
  public tblperiod with_fcurPenaltyBalance(java.math.BigDecimal fcurPenaltyBalance) {
    this.fcurPenaltyBalance = fcurPenaltyBalance;
    return this;
  }
  private java.math.BigDecimal fcurPenaltyDelta;
  public java.math.BigDecimal get_fcurPenaltyDelta() {
    return fcurPenaltyDelta;
  }
  public void set_fcurPenaltyDelta(java.math.BigDecimal fcurPenaltyDelta) {
    this.fcurPenaltyDelta = fcurPenaltyDelta;
  }
  public tblperiod with_fcurPenaltyDelta(java.math.BigDecimal fcurPenaltyDelta) {
    this.fcurPenaltyDelta = fcurPenaltyDelta;
    return this;
  }
  private java.math.BigDecimal fcurOther;
  public java.math.BigDecimal get_fcurOther() {
    return fcurOther;
  }
  public void set_fcurOther(java.math.BigDecimal fcurOther) {
    this.fcurOther = fcurOther;
  }
  public tblperiod with_fcurOther(java.math.BigDecimal fcurOther) {
    this.fcurOther = fcurOther;
    return this;
  }
  private java.math.BigDecimal fcurOtherBalance;
  public java.math.BigDecimal get_fcurOtherBalance() {
    return fcurOtherBalance;
  }
  public void set_fcurOtherBalance(java.math.BigDecimal fcurOtherBalance) {
    this.fcurOtherBalance = fcurOtherBalance;
  }
  public tblperiod with_fcurOtherBalance(java.math.BigDecimal fcurOtherBalance) {
    this.fcurOtherBalance = fcurOtherBalance;
    return this;
  }
  private java.math.BigDecimal fcurOtherDelta;
  public java.math.BigDecimal get_fcurOtherDelta() {
    return fcurOtherDelta;
  }
  public void set_fcurOtherDelta(java.math.BigDecimal fcurOtherDelta) {
    this.fcurOtherDelta = fcurOtherDelta;
  }
  public tblperiod with_fcurOtherDelta(java.math.BigDecimal fcurOtherDelta) {
    this.fcurOtherDelta = fcurOtherDelta;
    return this;
  }
  private java.math.BigDecimal fcurCredit;
  public java.math.BigDecimal get_fcurCredit() {
    return fcurCredit;
  }
  public void set_fcurCredit(java.math.BigDecimal fcurCredit) {
    this.fcurCredit = fcurCredit;
  }
  public tblperiod with_fcurCredit(java.math.BigDecimal fcurCredit) {
    this.fcurCredit = fcurCredit;
    return this;
  }
  private java.math.BigDecimal fcurCreditBalance;
  public java.math.BigDecimal get_fcurCreditBalance() {
    return fcurCreditBalance;
  }
  public void set_fcurCreditBalance(java.math.BigDecimal fcurCreditBalance) {
    this.fcurCreditBalance = fcurCreditBalance;
  }
  public tblperiod with_fcurCreditBalance(java.math.BigDecimal fcurCreditBalance) {
    this.fcurCreditBalance = fcurCreditBalance;
    return this;
  }
  private java.math.BigDecimal fcurCreditDelta;
  public java.math.BigDecimal get_fcurCreditDelta() {
    return fcurCreditDelta;
  }
  public void set_fcurCreditDelta(java.math.BigDecimal fcurCreditDelta) {
    this.fcurCreditDelta = fcurCreditDelta;
  }
  public tblperiod with_fcurCreditDelta(java.math.BigDecimal fcurCreditDelta) {
    this.fcurCreditDelta = fcurCreditDelta;
    return this;
  }
  private java.math.BigDecimal fcurBalance;
  public java.math.BigDecimal get_fcurBalance() {
    return fcurBalance;
  }
  public void set_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
  }
  public tblperiod with_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
    return this;
  }
  private java.sql.Timestamp fdtmActivity;
  public java.sql.Timestamp get_fdtmActivity() {
    return fdtmActivity;
  }
  public void set_fdtmActivity(java.sql.Timestamp fdtmActivity) {
    this.fdtmActivity = fdtmActivity;
  }
  public tblperiod with_fdtmActivity(java.sql.Timestamp fdtmActivity) {
    this.fdtmActivity = fdtmActivity;
    return this;
  }
  private java.sql.Timestamp fdtmPenalty;
  public java.sql.Timestamp get_fdtmPenalty() {
    return fdtmPenalty;
  }
  public void set_fdtmPenalty(java.sql.Timestamp fdtmPenalty) {
    this.fdtmPenalty = fdtmPenalty;
  }
  public tblperiod with_fdtmPenalty(java.sql.Timestamp fdtmPenalty) {
    this.fdtmPenalty = fdtmPenalty;
    return this;
  }
  private java.sql.Timestamp fdtmEffectMax;
  public java.sql.Timestamp get_fdtmEffectMax() {
    return fdtmEffectMax;
  }
  public void set_fdtmEffectMax(java.sql.Timestamp fdtmEffectMax) {
    this.fdtmEffectMax = fdtmEffectMax;
  }
  public tblperiod with_fdtmEffectMax(java.sql.Timestamp fdtmEffectMax) {
    this.fdtmEffectMax = fdtmEffectMax;
    return this;
  }
  private java.sql.Timestamp fdtmDelta;
  public java.sql.Timestamp get_fdtmDelta() {
    return fdtmDelta;
  }
  public void set_fdtmDelta(java.sql.Timestamp fdtmDelta) {
    this.fdtmDelta = fdtmDelta;
  }
  public tblperiod with_fdtmDelta(java.sql.Timestamp fdtmDelta) {
    this.fdtmDelta = fdtmDelta;
    return this;
  }
  private java.sql.Timestamp fdtmStatute;
  public java.sql.Timestamp get_fdtmStatute() {
    return fdtmStatute;
  }
  public void set_fdtmStatute(java.sql.Timestamp fdtmStatute) {
    this.fdtmStatute = fdtmStatute;
  }
  public tblperiod with_fdtmStatute(java.sql.Timestamp fdtmStatute) {
    this.fdtmStatute = fdtmStatute;
    return this;
  }
  private java.sql.Timestamp fdtmSystemStatute;
  public java.sql.Timestamp get_fdtmSystemStatute() {
    return fdtmSystemStatute;
  }
  public void set_fdtmSystemStatute(java.sql.Timestamp fdtmSystemStatute) {
    this.fdtmSystemStatute = fdtmSystemStatute;
  }
  public tblperiod with_fdtmSystemStatute(java.sql.Timestamp fdtmSystemStatute) {
    this.fdtmSystemStatute = fdtmSystemStatute;
    return this;
  }
  private java.sql.Timestamp fdtmUserStatute;
  public java.sql.Timestamp get_fdtmUserStatute() {
    return fdtmUserStatute;
  }
  public void set_fdtmUserStatute(java.sql.Timestamp fdtmUserStatute) {
    this.fdtmUserStatute = fdtmUserStatute;
  }
  public tblperiod with_fdtmUserStatute(java.sql.Timestamp fdtmUserStatute) {
    this.fdtmUserStatute = fdtmUserStatute;
    return this;
  }
  private Integer fblnSBAExists;
  public Integer get_fblnSBAExists() {
    return fblnSBAExists;
  }
  public void set_fblnSBAExists(Integer fblnSBAExists) {
    this.fblnSBAExists = fblnSBAExists;
  }
  public tblperiod with_fblnSBAExists(Integer fblnSBAExists) {
    this.fblnSBAExists = fblnSBAExists;
    return this;
  }
  private Integer fblnRA;
  public Integer get_fblnRA() {
    return fblnRA;
  }
  public void set_fblnRA(Integer fblnRA) {
    this.fblnRA = fblnRA;
  }
  public tblperiod with_fblnRA(Integer fblnRA) {
    this.fblnRA = fblnRA;
    return this;
  }
  private Integer fblnPNI;
  public Integer get_fblnPNI() {
    return fblnPNI;
  }
  public void set_fblnPNI(Integer fblnPNI) {
    this.fblnPNI = fblnPNI;
  }
  public tblperiod with_fblnPNI(Integer fblnPNI) {
    this.fblnPNI = fblnPNI;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblperiod with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblperiod with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblperiod with_fstrWho(String fstrWho) {
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
  public tblperiod with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblperiod)) {
      return false;
    }
    tblperiod that = (tblperiod) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngLinkedAccountKey == null ? that.flngLinkedAccountKey == null : this.flngLinkedAccountKey.equals(that.flngLinkedAccountKey));
    equal = equal && (this.flngJointAccountKey == null ? that.flngJointAccountKey == null : this.flngJointAccountKey.equals(that.flngJointAccountKey));
    equal = equal && (this.fblnPrime == null ? that.fblnPrime == null : this.fblnPrime.equals(that.fblnPrime));
    equal = equal && (this.fdtmPeriodBegin == null ? that.fdtmPeriodBegin == null : this.fdtmPeriodBegin.equals(that.fdtmPeriodBegin));
    equal = equal && (this.fdtmPeriodEnd == null ? that.fdtmPeriodEnd == null : this.fdtmPeriodEnd.equals(that.fdtmPeriodEnd));
    equal = equal && (this.fstrFiling == null ? that.fstrFiling == null : this.fstrFiling.equals(that.fstrFiling));
    equal = equal && (this.fcurTax == null ? that.fcurTax == null : this.fcurTax.equals(that.fcurTax));
    equal = equal && (this.fcurTaxBalance == null ? that.fcurTaxBalance == null : this.fcurTaxBalance.equals(that.fcurTaxBalance));
    equal = equal && (this.fcurTaxDelta == null ? that.fcurTaxDelta == null : this.fcurTaxDelta.equals(that.fcurTaxDelta));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurInterestBalance == null ? that.fcurInterestBalance == null : this.fcurInterestBalance.equals(that.fcurInterestBalance));
    equal = equal && (this.fcurInterestDelta == null ? that.fcurInterestDelta == null : this.fcurInterestDelta.equals(that.fcurInterestDelta));
    equal = equal && (this.fcurPenalty == null ? that.fcurPenalty == null : this.fcurPenalty.equals(that.fcurPenalty));
    equal = equal && (this.fcurPenaltyBalance == null ? that.fcurPenaltyBalance == null : this.fcurPenaltyBalance.equals(that.fcurPenaltyBalance));
    equal = equal && (this.fcurPenaltyDelta == null ? that.fcurPenaltyDelta == null : this.fcurPenaltyDelta.equals(that.fcurPenaltyDelta));
    equal = equal && (this.fcurOther == null ? that.fcurOther == null : this.fcurOther.equals(that.fcurOther));
    equal = equal && (this.fcurOtherBalance == null ? that.fcurOtherBalance == null : this.fcurOtherBalance.equals(that.fcurOtherBalance));
    equal = equal && (this.fcurOtherDelta == null ? that.fcurOtherDelta == null : this.fcurOtherDelta.equals(that.fcurOtherDelta));
    equal = equal && (this.fcurCredit == null ? that.fcurCredit == null : this.fcurCredit.equals(that.fcurCredit));
    equal = equal && (this.fcurCreditBalance == null ? that.fcurCreditBalance == null : this.fcurCreditBalance.equals(that.fcurCreditBalance));
    equal = equal && (this.fcurCreditDelta == null ? that.fcurCreditDelta == null : this.fcurCreditDelta.equals(that.fcurCreditDelta));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fdtmActivity == null ? that.fdtmActivity == null : this.fdtmActivity.equals(that.fdtmActivity));
    equal = equal && (this.fdtmPenalty == null ? that.fdtmPenalty == null : this.fdtmPenalty.equals(that.fdtmPenalty));
    equal = equal && (this.fdtmEffectMax == null ? that.fdtmEffectMax == null : this.fdtmEffectMax.equals(that.fdtmEffectMax));
    equal = equal && (this.fdtmDelta == null ? that.fdtmDelta == null : this.fdtmDelta.equals(that.fdtmDelta));
    equal = equal && (this.fdtmStatute == null ? that.fdtmStatute == null : this.fdtmStatute.equals(that.fdtmStatute));
    equal = equal && (this.fdtmSystemStatute == null ? that.fdtmSystemStatute == null : this.fdtmSystemStatute.equals(that.fdtmSystemStatute));
    equal = equal && (this.fdtmUserStatute == null ? that.fdtmUserStatute == null : this.fdtmUserStatute.equals(that.fdtmUserStatute));
    equal = equal && (this.fblnSBAExists == null ? that.fblnSBAExists == null : this.fblnSBAExists.equals(that.fblnSBAExists));
    equal = equal && (this.fblnRA == null ? that.fblnRA == null : this.fblnRA.equals(that.fblnRA));
    equal = equal && (this.fblnPNI == null ? that.fblnPNI == null : this.fblnPNI.equals(that.fblnPNI));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblperiod)) {
      return false;
    }
    tblperiod that = (tblperiod) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngLinkedAccountKey == null ? that.flngLinkedAccountKey == null : this.flngLinkedAccountKey.equals(that.flngLinkedAccountKey));
    equal = equal && (this.flngJointAccountKey == null ? that.flngJointAccountKey == null : this.flngJointAccountKey.equals(that.flngJointAccountKey));
    equal = equal && (this.fblnPrime == null ? that.fblnPrime == null : this.fblnPrime.equals(that.fblnPrime));
    equal = equal && (this.fdtmPeriodBegin == null ? that.fdtmPeriodBegin == null : this.fdtmPeriodBegin.equals(that.fdtmPeriodBegin));
    equal = equal && (this.fdtmPeriodEnd == null ? that.fdtmPeriodEnd == null : this.fdtmPeriodEnd.equals(that.fdtmPeriodEnd));
    equal = equal && (this.fstrFiling == null ? that.fstrFiling == null : this.fstrFiling.equals(that.fstrFiling));
    equal = equal && (this.fcurTax == null ? that.fcurTax == null : this.fcurTax.equals(that.fcurTax));
    equal = equal && (this.fcurTaxBalance == null ? that.fcurTaxBalance == null : this.fcurTaxBalance.equals(that.fcurTaxBalance));
    equal = equal && (this.fcurTaxDelta == null ? that.fcurTaxDelta == null : this.fcurTaxDelta.equals(that.fcurTaxDelta));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurInterestBalance == null ? that.fcurInterestBalance == null : this.fcurInterestBalance.equals(that.fcurInterestBalance));
    equal = equal && (this.fcurInterestDelta == null ? that.fcurInterestDelta == null : this.fcurInterestDelta.equals(that.fcurInterestDelta));
    equal = equal && (this.fcurPenalty == null ? that.fcurPenalty == null : this.fcurPenalty.equals(that.fcurPenalty));
    equal = equal && (this.fcurPenaltyBalance == null ? that.fcurPenaltyBalance == null : this.fcurPenaltyBalance.equals(that.fcurPenaltyBalance));
    equal = equal && (this.fcurPenaltyDelta == null ? that.fcurPenaltyDelta == null : this.fcurPenaltyDelta.equals(that.fcurPenaltyDelta));
    equal = equal && (this.fcurOther == null ? that.fcurOther == null : this.fcurOther.equals(that.fcurOther));
    equal = equal && (this.fcurOtherBalance == null ? that.fcurOtherBalance == null : this.fcurOtherBalance.equals(that.fcurOtherBalance));
    equal = equal && (this.fcurOtherDelta == null ? that.fcurOtherDelta == null : this.fcurOtherDelta.equals(that.fcurOtherDelta));
    equal = equal && (this.fcurCredit == null ? that.fcurCredit == null : this.fcurCredit.equals(that.fcurCredit));
    equal = equal && (this.fcurCreditBalance == null ? that.fcurCreditBalance == null : this.fcurCreditBalance.equals(that.fcurCreditBalance));
    equal = equal && (this.fcurCreditDelta == null ? that.fcurCreditDelta == null : this.fcurCreditDelta.equals(that.fcurCreditDelta));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fdtmActivity == null ? that.fdtmActivity == null : this.fdtmActivity.equals(that.fdtmActivity));
    equal = equal && (this.fdtmPenalty == null ? that.fdtmPenalty == null : this.fdtmPenalty.equals(that.fdtmPenalty));
    equal = equal && (this.fdtmEffectMax == null ? that.fdtmEffectMax == null : this.fdtmEffectMax.equals(that.fdtmEffectMax));
    equal = equal && (this.fdtmDelta == null ? that.fdtmDelta == null : this.fdtmDelta.equals(that.fdtmDelta));
    equal = equal && (this.fdtmStatute == null ? that.fdtmStatute == null : this.fdtmStatute.equals(that.fdtmStatute));
    equal = equal && (this.fdtmSystemStatute == null ? that.fdtmSystemStatute == null : this.fdtmSystemStatute.equals(that.fdtmSystemStatute));
    equal = equal && (this.fdtmUserStatute == null ? that.fdtmUserStatute == null : this.fdtmUserStatute.equals(that.fdtmUserStatute));
    equal = equal && (this.fblnSBAExists == null ? that.fblnSBAExists == null : this.fblnSBAExists.equals(that.fblnSBAExists));
    equal = equal && (this.fblnRA == null ? that.fblnRA == null : this.fblnRA.equals(that.fblnRA));
    equal = equal && (this.fblnPNI == null ? that.fblnPNI == null : this.fblnPNI.equals(that.fblnPNI));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngLinkedAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngJointAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnPrime = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmPeriodBegin = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmPeriodEnd = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrFiling = JdbcWritableBridge.readString(10, __dbResults);
    this.fcurTax = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTaxBalance = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTaxDelta = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInterestBalance = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurInterestDelta = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPenalty = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurPenaltyBalance = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurPenaltyDelta = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurOther = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurOtherBalance = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurOtherDelta = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurCredit = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurCreditBalance = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurCreditDelta = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fdtmActivity = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.fdtmPenalty = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fdtmEffectMax = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fdtmDelta = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.fdtmStatute = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.fdtmSystemStatute = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.fdtmUserStatute = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.fblnSBAExists = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fblnRA = JdbcWritableBridge.readInteger(35, __dbResults);
    this.fblnPNI = JdbcWritableBridge.readInteger(36, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(39, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(40, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngLinkedAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngJointAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnPrime = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmPeriodBegin = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmPeriodEnd = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrFiling = JdbcWritableBridge.readString(10, __dbResults);
    this.fcurTax = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTaxBalance = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTaxDelta = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInterestBalance = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurInterestDelta = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPenalty = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurPenaltyBalance = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurPenaltyDelta = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurOther = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurOtherBalance = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurOtherDelta = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurCredit = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurCreditBalance = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurCreditDelta = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fdtmActivity = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.fdtmPenalty = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fdtmEffectMax = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fdtmDelta = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.fdtmStatute = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.fdtmSystemStatute = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.fdtmUserStatute = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.fblnSBAExists = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fblnRA = JdbcWritableBridge.readInteger(35, __dbResults);
    this.fblnPNI = JdbcWritableBridge.readInteger(36, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(39, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(40, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngLinkedAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJointAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPrime, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriodBegin, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriodEnd, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFiling, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTax, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxBalance, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDelta, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestBalance, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestDelta, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenalty, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyBalance, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyDelta, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOther, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherBalance, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherDelta, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCredit, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditBalance, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditDelta, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmActivity, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPenalty, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectMax, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDelta, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatute, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSystemStatute, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmUserStatute, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSBAExists, 34 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRA, 35 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPNI, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 38 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 40 + __off, 93, __dbStmt);
    return 40;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngLinkedAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJointAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPrime, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriodBegin, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriodEnd, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFiling, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTax, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxBalance, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDelta, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestBalance, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestDelta, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenalty, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyBalance, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyDelta, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOther, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherBalance, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherDelta, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCredit, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditBalance, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditDelta, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmActivity, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPenalty, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectMax, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDelta, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatute, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSystemStatute, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmUserStatute, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSBAExists, 34 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRA, 35 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPNI, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 38 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 40 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVer = null;
    } else {
    this.flngVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngLinkedAccountKey = null;
    } else {
    this.flngLinkedAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngJointAccountKey = null;
    } else {
    this.flngJointAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPrime = null;
    } else {
    this.fblnPrime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPeriodBegin = null;
    } else {
    this.fdtmPeriodBegin = new Timestamp(__dataIn.readLong());
    this.fdtmPeriodBegin.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPeriodEnd = null;
    } else {
    this.fdtmPeriodEnd = new Timestamp(__dataIn.readLong());
    this.fdtmPeriodEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFiling = null;
    } else {
    this.fstrFiling = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTax = null;
    } else {
    this.fcurTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxBalance = null;
    } else {
    this.fcurTaxBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxDelta = null;
    } else {
    this.fcurTaxDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterest = null;
    } else {
    this.fcurInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestBalance = null;
    } else {
    this.fcurInterestBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestDelta = null;
    } else {
    this.fcurInterestDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenalty = null;
    } else {
    this.fcurPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenaltyBalance = null;
    } else {
    this.fcurPenaltyBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenaltyDelta = null;
    } else {
    this.fcurPenaltyDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOther = null;
    } else {
    this.fcurOther = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherBalance = null;
    } else {
    this.fcurOtherBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherDelta = null;
    } else {
    this.fcurOtherDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCredit = null;
    } else {
    this.fcurCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditBalance = null;
    } else {
    this.fcurCreditBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditDelta = null;
    } else {
    this.fcurCreditDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalance = null;
    } else {
    this.fcurBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmActivity = null;
    } else {
    this.fdtmActivity = new Timestamp(__dataIn.readLong());
    this.fdtmActivity.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPenalty = null;
    } else {
    this.fdtmPenalty = new Timestamp(__dataIn.readLong());
    this.fdtmPenalty.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectMax = null;
    } else {
    this.fdtmEffectMax = new Timestamp(__dataIn.readLong());
    this.fdtmEffectMax.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDelta = null;
    } else {
    this.fdtmDelta = new Timestamp(__dataIn.readLong());
    this.fdtmDelta.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStatute = null;
    } else {
    this.fdtmStatute = new Timestamp(__dataIn.readLong());
    this.fdtmStatute.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSystemStatute = null;
    } else {
    this.fdtmSystemStatute = new Timestamp(__dataIn.readLong());
    this.fdtmSystemStatute.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmUserStatute = null;
    } else {
    this.fdtmUserStatute = new Timestamp(__dataIn.readLong());
    this.fdtmUserStatute.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSBAExists = null;
    } else {
    this.fblnSBAExists = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRA = null;
    } else {
    this.fblnRA = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPNI = null;
    } else {
    this.fblnPNI = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngLinkedAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLinkedAccountKey);
    }
    if (null == this.flngJointAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJointAccountKey);
    }
    if (null == this.fblnPrime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPrime);
    }
    if (null == this.fdtmPeriodBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriodBegin.getTime());
    __dataOut.writeInt(this.fdtmPeriodBegin.getNanos());
    }
    if (null == this.fdtmPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmPeriodEnd.getNanos());
    }
    if (null == this.fstrFiling) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFiling);
    }
    if (null == this.fcurTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTax, __dataOut);
    }
    if (null == this.fcurTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxBalance, __dataOut);
    }
    if (null == this.fcurTaxDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDelta, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestBalance, __dataOut);
    }
    if (null == this.fcurInterestDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestDelta, __dataOut);
    }
    if (null == this.fcurPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenalty, __dataOut);
    }
    if (null == this.fcurPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyBalance, __dataOut);
    }
    if (null == this.fcurPenaltyDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyDelta, __dataOut);
    }
    if (null == this.fcurOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOther, __dataOut);
    }
    if (null == this.fcurOtherBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherBalance, __dataOut);
    }
    if (null == this.fcurOtherDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherDelta, __dataOut);
    }
    if (null == this.fcurCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCredit, __dataOut);
    }
    if (null == this.fcurCreditBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditBalance, __dataOut);
    }
    if (null == this.fcurCreditDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditDelta, __dataOut);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fdtmActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmActivity.getTime());
    __dataOut.writeInt(this.fdtmActivity.getNanos());
    }
    if (null == this.fdtmPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPenalty.getTime());
    __dataOut.writeInt(this.fdtmPenalty.getNanos());
    }
    if (null == this.fdtmEffectMax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectMax.getTime());
    __dataOut.writeInt(this.fdtmEffectMax.getNanos());
    }
    if (null == this.fdtmDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDelta.getTime());
    __dataOut.writeInt(this.fdtmDelta.getNanos());
    }
    if (null == this.fdtmStatute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatute.getTime());
    __dataOut.writeInt(this.fdtmStatute.getNanos());
    }
    if (null == this.fdtmSystemStatute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSystemStatute.getTime());
    __dataOut.writeInt(this.fdtmSystemStatute.getNanos());
    }
    if (null == this.fdtmUserStatute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmUserStatute.getTime());
    __dataOut.writeInt(this.fdtmUserStatute.getNanos());
    }
    if (null == this.fblnSBAExists) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSBAExists);
    }
    if (null == this.fblnRA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRA);
    }
    if (null == this.fblnPNI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPNI);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngLinkedAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLinkedAccountKey);
    }
    if (null == this.flngJointAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJointAccountKey);
    }
    if (null == this.fblnPrime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPrime);
    }
    if (null == this.fdtmPeriodBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriodBegin.getTime());
    __dataOut.writeInt(this.fdtmPeriodBegin.getNanos());
    }
    if (null == this.fdtmPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmPeriodEnd.getNanos());
    }
    if (null == this.fstrFiling) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFiling);
    }
    if (null == this.fcurTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTax, __dataOut);
    }
    if (null == this.fcurTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxBalance, __dataOut);
    }
    if (null == this.fcurTaxDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDelta, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestBalance, __dataOut);
    }
    if (null == this.fcurInterestDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestDelta, __dataOut);
    }
    if (null == this.fcurPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenalty, __dataOut);
    }
    if (null == this.fcurPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyBalance, __dataOut);
    }
    if (null == this.fcurPenaltyDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyDelta, __dataOut);
    }
    if (null == this.fcurOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOther, __dataOut);
    }
    if (null == this.fcurOtherBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherBalance, __dataOut);
    }
    if (null == this.fcurOtherDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherDelta, __dataOut);
    }
    if (null == this.fcurCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCredit, __dataOut);
    }
    if (null == this.fcurCreditBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditBalance, __dataOut);
    }
    if (null == this.fcurCreditDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditDelta, __dataOut);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fdtmActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmActivity.getTime());
    __dataOut.writeInt(this.fdtmActivity.getNanos());
    }
    if (null == this.fdtmPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPenalty.getTime());
    __dataOut.writeInt(this.fdtmPenalty.getNanos());
    }
    if (null == this.fdtmEffectMax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectMax.getTime());
    __dataOut.writeInt(this.fdtmEffectMax.getNanos());
    }
    if (null == this.fdtmDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDelta.getTime());
    __dataOut.writeInt(this.fdtmDelta.getNanos());
    }
    if (null == this.fdtmStatute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatute.getTime());
    __dataOut.writeInt(this.fdtmStatute.getNanos());
    }
    if (null == this.fdtmSystemStatute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSystemStatute.getTime());
    __dataOut.writeInt(this.fdtmSystemStatute.getNanos());
    }
    if (null == this.fdtmUserStatute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmUserStatute.getTime());
    __dataOut.writeInt(this.fdtmUserStatute.getNanos());
    }
    if (null == this.fblnSBAExists) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSBAExists);
    }
    if (null == this.fblnRA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRA);
    }
    if (null == this.fblnPNI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPNI);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngLinkedAccountKey==null?"\\N":"" + flngLinkedAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJointAccountKey==null?"\\N":"" + flngJointAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPrime==null?"\\N":"" + fblnPrime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriodBegin==null?"\\N":"" + fdtmPeriodBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriodEnd==null?"\\N":"" + fdtmPeriodEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFiling==null?"\\N":fstrFiling, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTax==null?"\\N":fcurTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxBalance==null?"\\N":fcurTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDelta==null?"\\N":fcurTaxDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestBalance==null?"\\N":fcurInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestDelta==null?"\\N":fcurInterestDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenalty==null?"\\N":fcurPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyBalance==null?"\\N":fcurPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyDelta==null?"\\N":fcurPenaltyDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOther==null?"\\N":fcurOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherBalance==null?"\\N":fcurOtherBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherDelta==null?"\\N":fcurOtherDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCredit==null?"\\N":fcurCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditBalance==null?"\\N":fcurCreditBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditDelta==null?"\\N":fcurCreditDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmActivity==null?"\\N":"" + fdtmActivity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPenalty==null?"\\N":"" + fdtmPenalty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectMax==null?"\\N":"" + fdtmEffectMax, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDelta==null?"\\N":"" + fdtmDelta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatute==null?"\\N":"" + fdtmStatute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSystemStatute==null?"\\N":"" + fdtmSystemStatute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmUserStatute==null?"\\N":"" + fdtmUserStatute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSBAExists==null?"\\N":"" + fblnSBAExists, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRA==null?"\\N":"" + fblnRA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPNI==null?"\\N":"" + fblnPNI, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngLinkedAccountKey==null?"\\N":"" + flngLinkedAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJointAccountKey==null?"\\N":"" + flngJointAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPrime==null?"\\N":"" + fblnPrime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriodBegin==null?"\\N":"" + fdtmPeriodBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriodEnd==null?"\\N":"" + fdtmPeriodEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFiling==null?"\\N":fstrFiling, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTax==null?"\\N":fcurTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxBalance==null?"\\N":fcurTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDelta==null?"\\N":fcurTaxDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestBalance==null?"\\N":fcurInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestDelta==null?"\\N":fcurInterestDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenalty==null?"\\N":fcurPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyBalance==null?"\\N":fcurPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyDelta==null?"\\N":fcurPenaltyDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOther==null?"\\N":fcurOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherBalance==null?"\\N":fcurOtherBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherDelta==null?"\\N":fcurOtherDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCredit==null?"\\N":fcurCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditBalance==null?"\\N":fcurCreditBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditDelta==null?"\\N":fcurCreditDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmActivity==null?"\\N":"" + fdtmActivity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPenalty==null?"\\N":"" + fdtmPenalty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectMax==null?"\\N":"" + fdtmEffectMax, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDelta==null?"\\N":"" + fdtmDelta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatute==null?"\\N":"" + fdtmStatute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSystemStatute==null?"\\N":"" + fdtmSystemStatute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmUserStatute==null?"\\N":"" + fdtmUserStatute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSBAExists==null?"\\N":"" + fblnSBAExists, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRA==null?"\\N":"" + fblnRA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPNI==null?"\\N":"" + fblnPNI, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLinkedAccountKey = null; } else {
      this.flngLinkedAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJointAccountKey = null; } else {
      this.flngJointAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPrime = null; } else {
      this.fblnPrime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriodBegin = null; } else {
      this.fdtmPeriodBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriodEnd = null; } else {
      this.fdtmPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFiling = null; } else {
      this.fstrFiling = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTax = null; } else {
      this.fcurTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxBalance = null; } else {
      this.fcurTaxBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDelta = null; } else {
      this.fcurTaxDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterest = null; } else {
      this.fcurInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestBalance = null; } else {
      this.fcurInterestBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestDelta = null; } else {
      this.fcurInterestDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenalty = null; } else {
      this.fcurPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyBalance = null; } else {
      this.fcurPenaltyBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyDelta = null; } else {
      this.fcurPenaltyDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOther = null; } else {
      this.fcurOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherBalance = null; } else {
      this.fcurOtherBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherDelta = null; } else {
      this.fcurOtherDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCredit = null; } else {
      this.fcurCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditBalance = null; } else {
      this.fcurCreditBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditDelta = null; } else {
      this.fcurCreditDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmActivity = null; } else {
      this.fdtmActivity = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPenalty = null; } else {
      this.fdtmPenalty = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectMax = null; } else {
      this.fdtmEffectMax = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDelta = null; } else {
      this.fdtmDelta = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStatute = null; } else {
      this.fdtmStatute = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSystemStatute = null; } else {
      this.fdtmSystemStatute = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmUserStatute = null; } else {
      this.fdtmUserStatute = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSBAExists = null; } else {
      this.fblnSBAExists = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRA = null; } else {
      this.fblnRA = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPNI = null; } else {
      this.fblnPNI = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLinkedAccountKey = null; } else {
      this.flngLinkedAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJointAccountKey = null; } else {
      this.flngJointAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPrime = null; } else {
      this.fblnPrime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriodBegin = null; } else {
      this.fdtmPeriodBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriodEnd = null; } else {
      this.fdtmPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFiling = null; } else {
      this.fstrFiling = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTax = null; } else {
      this.fcurTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxBalance = null; } else {
      this.fcurTaxBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDelta = null; } else {
      this.fcurTaxDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterest = null; } else {
      this.fcurInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestBalance = null; } else {
      this.fcurInterestBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestDelta = null; } else {
      this.fcurInterestDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenalty = null; } else {
      this.fcurPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyBalance = null; } else {
      this.fcurPenaltyBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyDelta = null; } else {
      this.fcurPenaltyDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOther = null; } else {
      this.fcurOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherBalance = null; } else {
      this.fcurOtherBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherDelta = null; } else {
      this.fcurOtherDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCredit = null; } else {
      this.fcurCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditBalance = null; } else {
      this.fcurCreditBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditDelta = null; } else {
      this.fcurCreditDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmActivity = null; } else {
      this.fdtmActivity = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPenalty = null; } else {
      this.fdtmPenalty = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectMax = null; } else {
      this.fdtmEffectMax = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDelta = null; } else {
      this.fdtmDelta = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStatute = null; } else {
      this.fdtmStatute = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSystemStatute = null; } else {
      this.fdtmSystemStatute = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmUserStatute = null; } else {
      this.fdtmUserStatute = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSBAExists = null; } else {
      this.fblnSBAExists = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRA = null; } else {
      this.fblnRA = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPNI = null; } else {
      this.fblnPNI = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    tblperiod o = (tblperiod) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmPeriodBegin = (o.fdtmPeriodBegin != null) ? (java.sql.Timestamp) o.fdtmPeriodBegin.clone() : null;
    o.fdtmPeriodEnd = (o.fdtmPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmPeriodEnd.clone() : null;
    o.fdtmActivity = (o.fdtmActivity != null) ? (java.sql.Timestamp) o.fdtmActivity.clone() : null;
    o.fdtmPenalty = (o.fdtmPenalty != null) ? (java.sql.Timestamp) o.fdtmPenalty.clone() : null;
    o.fdtmEffectMax = (o.fdtmEffectMax != null) ? (java.sql.Timestamp) o.fdtmEffectMax.clone() : null;
    o.fdtmDelta = (o.fdtmDelta != null) ? (java.sql.Timestamp) o.fdtmDelta.clone() : null;
    o.fdtmStatute = (o.fdtmStatute != null) ? (java.sql.Timestamp) o.fdtmStatute.clone() : null;
    o.fdtmSystemStatute = (o.fdtmSystemStatute != null) ? (java.sql.Timestamp) o.fdtmSystemStatute.clone() : null;
    o.fdtmUserStatute = (o.fdtmUserStatute != null) ? (java.sql.Timestamp) o.fdtmUserStatute.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblperiod o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmPeriodBegin = (o.fdtmPeriodBegin != null) ? (java.sql.Timestamp) o.fdtmPeriodBegin.clone() : null;
    o.fdtmPeriodEnd = (o.fdtmPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmPeriodEnd.clone() : null;
    o.fdtmActivity = (o.fdtmActivity != null) ? (java.sql.Timestamp) o.fdtmActivity.clone() : null;
    o.fdtmPenalty = (o.fdtmPenalty != null) ? (java.sql.Timestamp) o.fdtmPenalty.clone() : null;
    o.fdtmEffectMax = (o.fdtmEffectMax != null) ? (java.sql.Timestamp) o.fdtmEffectMax.clone() : null;
    o.fdtmDelta = (o.fdtmDelta != null) ? (java.sql.Timestamp) o.fdtmDelta.clone() : null;
    o.fdtmStatute = (o.fdtmStatute != null) ? (java.sql.Timestamp) o.fdtmStatute.clone() : null;
    o.fdtmSystemStatute = (o.fdtmSystemStatute != null) ? (java.sql.Timestamp) o.fdtmSystemStatute.clone() : null;
    o.fdtmUserStatute = (o.fdtmUserStatute != null) ? (java.sql.Timestamp) o.fdtmUserStatute.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngLinkedAccountKey", this.flngLinkedAccountKey);
    __sqoop$field_map.put("flngJointAccountKey", this.flngJointAccountKey);
    __sqoop$field_map.put("fblnPrime", this.fblnPrime);
    __sqoop$field_map.put("fdtmPeriodBegin", this.fdtmPeriodBegin);
    __sqoop$field_map.put("fdtmPeriodEnd", this.fdtmPeriodEnd);
    __sqoop$field_map.put("fstrFiling", this.fstrFiling);
    __sqoop$field_map.put("fcurTax", this.fcurTax);
    __sqoop$field_map.put("fcurTaxBalance", this.fcurTaxBalance);
    __sqoop$field_map.put("fcurTaxDelta", this.fcurTaxDelta);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurInterestBalance", this.fcurInterestBalance);
    __sqoop$field_map.put("fcurInterestDelta", this.fcurInterestDelta);
    __sqoop$field_map.put("fcurPenalty", this.fcurPenalty);
    __sqoop$field_map.put("fcurPenaltyBalance", this.fcurPenaltyBalance);
    __sqoop$field_map.put("fcurPenaltyDelta", this.fcurPenaltyDelta);
    __sqoop$field_map.put("fcurOther", this.fcurOther);
    __sqoop$field_map.put("fcurOtherBalance", this.fcurOtherBalance);
    __sqoop$field_map.put("fcurOtherDelta", this.fcurOtherDelta);
    __sqoop$field_map.put("fcurCredit", this.fcurCredit);
    __sqoop$field_map.put("fcurCreditBalance", this.fcurCreditBalance);
    __sqoop$field_map.put("fcurCreditDelta", this.fcurCreditDelta);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fdtmActivity", this.fdtmActivity);
    __sqoop$field_map.put("fdtmPenalty", this.fdtmPenalty);
    __sqoop$field_map.put("fdtmEffectMax", this.fdtmEffectMax);
    __sqoop$field_map.put("fdtmDelta", this.fdtmDelta);
    __sqoop$field_map.put("fdtmStatute", this.fdtmStatute);
    __sqoop$field_map.put("fdtmSystemStatute", this.fdtmSystemStatute);
    __sqoop$field_map.put("fdtmUserStatute", this.fdtmUserStatute);
    __sqoop$field_map.put("fblnSBAExists", this.fblnSBAExists);
    __sqoop$field_map.put("fblnRA", this.fblnRA);
    __sqoop$field_map.put("fblnPNI", this.fblnPNI);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngLinkedAccountKey", this.flngLinkedAccountKey);
    __sqoop$field_map.put("flngJointAccountKey", this.flngJointAccountKey);
    __sqoop$field_map.put("fblnPrime", this.fblnPrime);
    __sqoop$field_map.put("fdtmPeriodBegin", this.fdtmPeriodBegin);
    __sqoop$field_map.put("fdtmPeriodEnd", this.fdtmPeriodEnd);
    __sqoop$field_map.put("fstrFiling", this.fstrFiling);
    __sqoop$field_map.put("fcurTax", this.fcurTax);
    __sqoop$field_map.put("fcurTaxBalance", this.fcurTaxBalance);
    __sqoop$field_map.put("fcurTaxDelta", this.fcurTaxDelta);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurInterestBalance", this.fcurInterestBalance);
    __sqoop$field_map.put("fcurInterestDelta", this.fcurInterestDelta);
    __sqoop$field_map.put("fcurPenalty", this.fcurPenalty);
    __sqoop$field_map.put("fcurPenaltyBalance", this.fcurPenaltyBalance);
    __sqoop$field_map.put("fcurPenaltyDelta", this.fcurPenaltyDelta);
    __sqoop$field_map.put("fcurOther", this.fcurOther);
    __sqoop$field_map.put("fcurOtherBalance", this.fcurOtherBalance);
    __sqoop$field_map.put("fcurOtherDelta", this.fcurOtherDelta);
    __sqoop$field_map.put("fcurCredit", this.fcurCredit);
    __sqoop$field_map.put("fcurCreditBalance", this.fcurCreditBalance);
    __sqoop$field_map.put("fcurCreditDelta", this.fcurCreditDelta);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fdtmActivity", this.fdtmActivity);
    __sqoop$field_map.put("fdtmPenalty", this.fdtmPenalty);
    __sqoop$field_map.put("fdtmEffectMax", this.fdtmEffectMax);
    __sqoop$field_map.put("fdtmDelta", this.fdtmDelta);
    __sqoop$field_map.put("fdtmStatute", this.fdtmStatute);
    __sqoop$field_map.put("fdtmSystemStatute", this.fdtmSystemStatute);
    __sqoop$field_map.put("fdtmUserStatute", this.fdtmUserStatute);
    __sqoop$field_map.put("fblnSBAExists", this.fblnSBAExists);
    __sqoop$field_map.put("fblnRA", this.fblnRA);
    __sqoop$field_map.put("fblnPNI", this.fblnPNI);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
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
