// ORM class for table 'tblauditperiod'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:37:32 NZDT 2020
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

public class tblauditperiod extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAuditkey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.flngAuditkey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fcurBeginTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurBeginTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeginPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurBeginPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeginInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurBeginInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeginCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurBeginCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeginBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurBeginBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeginTaxBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurBeginTaxBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeginPenaltyBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurBeginPenaltyBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeginInterestBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurBeginInterestBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmBeginWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fdtmBeginWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurEndTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurEndTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEndPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurEndPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEndInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurEndInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEndCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurEndCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEndBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurEndBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEndTaxBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurEndTaxBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEndPenaltyBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurEndPenaltyBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEndInterestBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurEndInterestBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmEndWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fdtmEndWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurChangeInTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurChangeInTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurChangeInPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurChangeInPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurChangeInInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurChangeInInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurChangeInCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurChangeInCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurChangeInBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fcurChangeInBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditperiod.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblauditperiod() {
    init0();
  }
  private Integer flngAuditkey;
  public Integer get_flngAuditkey() {
    return flngAuditkey;
  }
  public void set_flngAuditkey(Integer flngAuditkey) {
    this.flngAuditkey = flngAuditkey;
  }
  public tblauditperiod with_flngAuditkey(Integer flngAuditkey) {
    this.flngAuditkey = flngAuditkey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblauditperiod with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
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
  public tblauditperiod with_flngVer(Integer flngVer) {
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
  public tblauditperiod with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblauditperiod with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.math.BigDecimal fcurBeginTax;
  public java.math.BigDecimal get_fcurBeginTax() {
    return fcurBeginTax;
  }
  public void set_fcurBeginTax(java.math.BigDecimal fcurBeginTax) {
    this.fcurBeginTax = fcurBeginTax;
  }
  public tblauditperiod with_fcurBeginTax(java.math.BigDecimal fcurBeginTax) {
    this.fcurBeginTax = fcurBeginTax;
    return this;
  }
  private java.math.BigDecimal fcurBeginPenalty;
  public java.math.BigDecimal get_fcurBeginPenalty() {
    return fcurBeginPenalty;
  }
  public void set_fcurBeginPenalty(java.math.BigDecimal fcurBeginPenalty) {
    this.fcurBeginPenalty = fcurBeginPenalty;
  }
  public tblauditperiod with_fcurBeginPenalty(java.math.BigDecimal fcurBeginPenalty) {
    this.fcurBeginPenalty = fcurBeginPenalty;
    return this;
  }
  private java.math.BigDecimal fcurBeginInterest;
  public java.math.BigDecimal get_fcurBeginInterest() {
    return fcurBeginInterest;
  }
  public void set_fcurBeginInterest(java.math.BigDecimal fcurBeginInterest) {
    this.fcurBeginInterest = fcurBeginInterest;
  }
  public tblauditperiod with_fcurBeginInterest(java.math.BigDecimal fcurBeginInterest) {
    this.fcurBeginInterest = fcurBeginInterest;
    return this;
  }
  private java.math.BigDecimal fcurBeginCredit;
  public java.math.BigDecimal get_fcurBeginCredit() {
    return fcurBeginCredit;
  }
  public void set_fcurBeginCredit(java.math.BigDecimal fcurBeginCredit) {
    this.fcurBeginCredit = fcurBeginCredit;
  }
  public tblauditperiod with_fcurBeginCredit(java.math.BigDecimal fcurBeginCredit) {
    this.fcurBeginCredit = fcurBeginCredit;
    return this;
  }
  private java.math.BigDecimal fcurBeginBalance;
  public java.math.BigDecimal get_fcurBeginBalance() {
    return fcurBeginBalance;
  }
  public void set_fcurBeginBalance(java.math.BigDecimal fcurBeginBalance) {
    this.fcurBeginBalance = fcurBeginBalance;
  }
  public tblauditperiod with_fcurBeginBalance(java.math.BigDecimal fcurBeginBalance) {
    this.fcurBeginBalance = fcurBeginBalance;
    return this;
  }
  private java.math.BigDecimal fcurBeginTaxBalance;
  public java.math.BigDecimal get_fcurBeginTaxBalance() {
    return fcurBeginTaxBalance;
  }
  public void set_fcurBeginTaxBalance(java.math.BigDecimal fcurBeginTaxBalance) {
    this.fcurBeginTaxBalance = fcurBeginTaxBalance;
  }
  public tblauditperiod with_fcurBeginTaxBalance(java.math.BigDecimal fcurBeginTaxBalance) {
    this.fcurBeginTaxBalance = fcurBeginTaxBalance;
    return this;
  }
  private java.math.BigDecimal fcurBeginPenaltyBalance;
  public java.math.BigDecimal get_fcurBeginPenaltyBalance() {
    return fcurBeginPenaltyBalance;
  }
  public void set_fcurBeginPenaltyBalance(java.math.BigDecimal fcurBeginPenaltyBalance) {
    this.fcurBeginPenaltyBalance = fcurBeginPenaltyBalance;
  }
  public tblauditperiod with_fcurBeginPenaltyBalance(java.math.BigDecimal fcurBeginPenaltyBalance) {
    this.fcurBeginPenaltyBalance = fcurBeginPenaltyBalance;
    return this;
  }
  private java.math.BigDecimal fcurBeginInterestBalance;
  public java.math.BigDecimal get_fcurBeginInterestBalance() {
    return fcurBeginInterestBalance;
  }
  public void set_fcurBeginInterestBalance(java.math.BigDecimal fcurBeginInterestBalance) {
    this.fcurBeginInterestBalance = fcurBeginInterestBalance;
  }
  public tblauditperiod with_fcurBeginInterestBalance(java.math.BigDecimal fcurBeginInterestBalance) {
    this.fcurBeginInterestBalance = fcurBeginInterestBalance;
    return this;
  }
  private java.sql.Timestamp fdtmBeginWhen;
  public java.sql.Timestamp get_fdtmBeginWhen() {
    return fdtmBeginWhen;
  }
  public void set_fdtmBeginWhen(java.sql.Timestamp fdtmBeginWhen) {
    this.fdtmBeginWhen = fdtmBeginWhen;
  }
  public tblauditperiod with_fdtmBeginWhen(java.sql.Timestamp fdtmBeginWhen) {
    this.fdtmBeginWhen = fdtmBeginWhen;
    return this;
  }
  private java.math.BigDecimal fcurEndTax;
  public java.math.BigDecimal get_fcurEndTax() {
    return fcurEndTax;
  }
  public void set_fcurEndTax(java.math.BigDecimal fcurEndTax) {
    this.fcurEndTax = fcurEndTax;
  }
  public tblauditperiod with_fcurEndTax(java.math.BigDecimal fcurEndTax) {
    this.fcurEndTax = fcurEndTax;
    return this;
  }
  private java.math.BigDecimal fcurEndPenalty;
  public java.math.BigDecimal get_fcurEndPenalty() {
    return fcurEndPenalty;
  }
  public void set_fcurEndPenalty(java.math.BigDecimal fcurEndPenalty) {
    this.fcurEndPenalty = fcurEndPenalty;
  }
  public tblauditperiod with_fcurEndPenalty(java.math.BigDecimal fcurEndPenalty) {
    this.fcurEndPenalty = fcurEndPenalty;
    return this;
  }
  private java.math.BigDecimal fcurEndInterest;
  public java.math.BigDecimal get_fcurEndInterest() {
    return fcurEndInterest;
  }
  public void set_fcurEndInterest(java.math.BigDecimal fcurEndInterest) {
    this.fcurEndInterest = fcurEndInterest;
  }
  public tblauditperiod with_fcurEndInterest(java.math.BigDecimal fcurEndInterest) {
    this.fcurEndInterest = fcurEndInterest;
    return this;
  }
  private java.math.BigDecimal fcurEndCredit;
  public java.math.BigDecimal get_fcurEndCredit() {
    return fcurEndCredit;
  }
  public void set_fcurEndCredit(java.math.BigDecimal fcurEndCredit) {
    this.fcurEndCredit = fcurEndCredit;
  }
  public tblauditperiod with_fcurEndCredit(java.math.BigDecimal fcurEndCredit) {
    this.fcurEndCredit = fcurEndCredit;
    return this;
  }
  private java.math.BigDecimal fcurEndBalance;
  public java.math.BigDecimal get_fcurEndBalance() {
    return fcurEndBalance;
  }
  public void set_fcurEndBalance(java.math.BigDecimal fcurEndBalance) {
    this.fcurEndBalance = fcurEndBalance;
  }
  public tblauditperiod with_fcurEndBalance(java.math.BigDecimal fcurEndBalance) {
    this.fcurEndBalance = fcurEndBalance;
    return this;
  }
  private java.math.BigDecimal fcurEndTaxBalance;
  public java.math.BigDecimal get_fcurEndTaxBalance() {
    return fcurEndTaxBalance;
  }
  public void set_fcurEndTaxBalance(java.math.BigDecimal fcurEndTaxBalance) {
    this.fcurEndTaxBalance = fcurEndTaxBalance;
  }
  public tblauditperiod with_fcurEndTaxBalance(java.math.BigDecimal fcurEndTaxBalance) {
    this.fcurEndTaxBalance = fcurEndTaxBalance;
    return this;
  }
  private java.math.BigDecimal fcurEndPenaltyBalance;
  public java.math.BigDecimal get_fcurEndPenaltyBalance() {
    return fcurEndPenaltyBalance;
  }
  public void set_fcurEndPenaltyBalance(java.math.BigDecimal fcurEndPenaltyBalance) {
    this.fcurEndPenaltyBalance = fcurEndPenaltyBalance;
  }
  public tblauditperiod with_fcurEndPenaltyBalance(java.math.BigDecimal fcurEndPenaltyBalance) {
    this.fcurEndPenaltyBalance = fcurEndPenaltyBalance;
    return this;
  }
  private java.math.BigDecimal fcurEndInterestBalance;
  public java.math.BigDecimal get_fcurEndInterestBalance() {
    return fcurEndInterestBalance;
  }
  public void set_fcurEndInterestBalance(java.math.BigDecimal fcurEndInterestBalance) {
    this.fcurEndInterestBalance = fcurEndInterestBalance;
  }
  public tblauditperiod with_fcurEndInterestBalance(java.math.BigDecimal fcurEndInterestBalance) {
    this.fcurEndInterestBalance = fcurEndInterestBalance;
    return this;
  }
  private java.sql.Timestamp fdtmEndWhen;
  public java.sql.Timestamp get_fdtmEndWhen() {
    return fdtmEndWhen;
  }
  public void set_fdtmEndWhen(java.sql.Timestamp fdtmEndWhen) {
    this.fdtmEndWhen = fdtmEndWhen;
  }
  public tblauditperiod with_fdtmEndWhen(java.sql.Timestamp fdtmEndWhen) {
    this.fdtmEndWhen = fdtmEndWhen;
    return this;
  }
  private java.math.BigDecimal fcurChangeInTax;
  public java.math.BigDecimal get_fcurChangeInTax() {
    return fcurChangeInTax;
  }
  public void set_fcurChangeInTax(java.math.BigDecimal fcurChangeInTax) {
    this.fcurChangeInTax = fcurChangeInTax;
  }
  public tblauditperiod with_fcurChangeInTax(java.math.BigDecimal fcurChangeInTax) {
    this.fcurChangeInTax = fcurChangeInTax;
    return this;
  }
  private java.math.BigDecimal fcurChangeInPenalty;
  public java.math.BigDecimal get_fcurChangeInPenalty() {
    return fcurChangeInPenalty;
  }
  public void set_fcurChangeInPenalty(java.math.BigDecimal fcurChangeInPenalty) {
    this.fcurChangeInPenalty = fcurChangeInPenalty;
  }
  public tblauditperiod with_fcurChangeInPenalty(java.math.BigDecimal fcurChangeInPenalty) {
    this.fcurChangeInPenalty = fcurChangeInPenalty;
    return this;
  }
  private java.math.BigDecimal fcurChangeInInterest;
  public java.math.BigDecimal get_fcurChangeInInterest() {
    return fcurChangeInInterest;
  }
  public void set_fcurChangeInInterest(java.math.BigDecimal fcurChangeInInterest) {
    this.fcurChangeInInterest = fcurChangeInInterest;
  }
  public tblauditperiod with_fcurChangeInInterest(java.math.BigDecimal fcurChangeInInterest) {
    this.fcurChangeInInterest = fcurChangeInInterest;
    return this;
  }
  private java.math.BigDecimal fcurChangeInCredit;
  public java.math.BigDecimal get_fcurChangeInCredit() {
    return fcurChangeInCredit;
  }
  public void set_fcurChangeInCredit(java.math.BigDecimal fcurChangeInCredit) {
    this.fcurChangeInCredit = fcurChangeInCredit;
  }
  public tblauditperiod with_fcurChangeInCredit(java.math.BigDecimal fcurChangeInCredit) {
    this.fcurChangeInCredit = fcurChangeInCredit;
    return this;
  }
  private java.math.BigDecimal fcurChangeInBalance;
  public java.math.BigDecimal get_fcurChangeInBalance() {
    return fcurChangeInBalance;
  }
  public void set_fcurChangeInBalance(java.math.BigDecimal fcurChangeInBalance) {
    this.fcurChangeInBalance = fcurChangeInBalance;
  }
  public tblauditperiod with_fcurChangeInBalance(java.math.BigDecimal fcurChangeInBalance) {
    this.fcurChangeInBalance = fcurChangeInBalance;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblauditperiod with_fblnActive(Integer fblnActive) {
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
  public tblauditperiod with_fstrWho(String fstrWho) {
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
  public tblauditperiod with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditperiod)) {
      return false;
    }
    tblauditperiod that = (tblauditperiod) o;
    boolean equal = true;
    equal = equal && (this.flngAuditkey == null ? that.flngAuditkey == null : this.flngAuditkey.equals(that.flngAuditkey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fcurBeginTax == null ? that.fcurBeginTax == null : this.fcurBeginTax.equals(that.fcurBeginTax));
    equal = equal && (this.fcurBeginPenalty == null ? that.fcurBeginPenalty == null : this.fcurBeginPenalty.equals(that.fcurBeginPenalty));
    equal = equal && (this.fcurBeginInterest == null ? that.fcurBeginInterest == null : this.fcurBeginInterest.equals(that.fcurBeginInterest));
    equal = equal && (this.fcurBeginCredit == null ? that.fcurBeginCredit == null : this.fcurBeginCredit.equals(that.fcurBeginCredit));
    equal = equal && (this.fcurBeginBalance == null ? that.fcurBeginBalance == null : this.fcurBeginBalance.equals(that.fcurBeginBalance));
    equal = equal && (this.fcurBeginTaxBalance == null ? that.fcurBeginTaxBalance == null : this.fcurBeginTaxBalance.equals(that.fcurBeginTaxBalance));
    equal = equal && (this.fcurBeginPenaltyBalance == null ? that.fcurBeginPenaltyBalance == null : this.fcurBeginPenaltyBalance.equals(that.fcurBeginPenaltyBalance));
    equal = equal && (this.fcurBeginInterestBalance == null ? that.fcurBeginInterestBalance == null : this.fcurBeginInterestBalance.equals(that.fcurBeginInterestBalance));
    equal = equal && (this.fdtmBeginWhen == null ? that.fdtmBeginWhen == null : this.fdtmBeginWhen.equals(that.fdtmBeginWhen));
    equal = equal && (this.fcurEndTax == null ? that.fcurEndTax == null : this.fcurEndTax.equals(that.fcurEndTax));
    equal = equal && (this.fcurEndPenalty == null ? that.fcurEndPenalty == null : this.fcurEndPenalty.equals(that.fcurEndPenalty));
    equal = equal && (this.fcurEndInterest == null ? that.fcurEndInterest == null : this.fcurEndInterest.equals(that.fcurEndInterest));
    equal = equal && (this.fcurEndCredit == null ? that.fcurEndCredit == null : this.fcurEndCredit.equals(that.fcurEndCredit));
    equal = equal && (this.fcurEndBalance == null ? that.fcurEndBalance == null : this.fcurEndBalance.equals(that.fcurEndBalance));
    equal = equal && (this.fcurEndTaxBalance == null ? that.fcurEndTaxBalance == null : this.fcurEndTaxBalance.equals(that.fcurEndTaxBalance));
    equal = equal && (this.fcurEndPenaltyBalance == null ? that.fcurEndPenaltyBalance == null : this.fcurEndPenaltyBalance.equals(that.fcurEndPenaltyBalance));
    equal = equal && (this.fcurEndInterestBalance == null ? that.fcurEndInterestBalance == null : this.fcurEndInterestBalance.equals(that.fcurEndInterestBalance));
    equal = equal && (this.fdtmEndWhen == null ? that.fdtmEndWhen == null : this.fdtmEndWhen.equals(that.fdtmEndWhen));
    equal = equal && (this.fcurChangeInTax == null ? that.fcurChangeInTax == null : this.fcurChangeInTax.equals(that.fcurChangeInTax));
    equal = equal && (this.fcurChangeInPenalty == null ? that.fcurChangeInPenalty == null : this.fcurChangeInPenalty.equals(that.fcurChangeInPenalty));
    equal = equal && (this.fcurChangeInInterest == null ? that.fcurChangeInInterest == null : this.fcurChangeInInterest.equals(that.fcurChangeInInterest));
    equal = equal && (this.fcurChangeInCredit == null ? that.fcurChangeInCredit == null : this.fcurChangeInCredit.equals(that.fcurChangeInCredit));
    equal = equal && (this.fcurChangeInBalance == null ? that.fcurChangeInBalance == null : this.fcurChangeInBalance.equals(that.fcurChangeInBalance));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditperiod)) {
      return false;
    }
    tblauditperiod that = (tblauditperiod) o;
    boolean equal = true;
    equal = equal && (this.flngAuditkey == null ? that.flngAuditkey == null : this.flngAuditkey.equals(that.flngAuditkey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fcurBeginTax == null ? that.fcurBeginTax == null : this.fcurBeginTax.equals(that.fcurBeginTax));
    equal = equal && (this.fcurBeginPenalty == null ? that.fcurBeginPenalty == null : this.fcurBeginPenalty.equals(that.fcurBeginPenalty));
    equal = equal && (this.fcurBeginInterest == null ? that.fcurBeginInterest == null : this.fcurBeginInterest.equals(that.fcurBeginInterest));
    equal = equal && (this.fcurBeginCredit == null ? that.fcurBeginCredit == null : this.fcurBeginCredit.equals(that.fcurBeginCredit));
    equal = equal && (this.fcurBeginBalance == null ? that.fcurBeginBalance == null : this.fcurBeginBalance.equals(that.fcurBeginBalance));
    equal = equal && (this.fcurBeginTaxBalance == null ? that.fcurBeginTaxBalance == null : this.fcurBeginTaxBalance.equals(that.fcurBeginTaxBalance));
    equal = equal && (this.fcurBeginPenaltyBalance == null ? that.fcurBeginPenaltyBalance == null : this.fcurBeginPenaltyBalance.equals(that.fcurBeginPenaltyBalance));
    equal = equal && (this.fcurBeginInterestBalance == null ? that.fcurBeginInterestBalance == null : this.fcurBeginInterestBalance.equals(that.fcurBeginInterestBalance));
    equal = equal && (this.fdtmBeginWhen == null ? that.fdtmBeginWhen == null : this.fdtmBeginWhen.equals(that.fdtmBeginWhen));
    equal = equal && (this.fcurEndTax == null ? that.fcurEndTax == null : this.fcurEndTax.equals(that.fcurEndTax));
    equal = equal && (this.fcurEndPenalty == null ? that.fcurEndPenalty == null : this.fcurEndPenalty.equals(that.fcurEndPenalty));
    equal = equal && (this.fcurEndInterest == null ? that.fcurEndInterest == null : this.fcurEndInterest.equals(that.fcurEndInterest));
    equal = equal && (this.fcurEndCredit == null ? that.fcurEndCredit == null : this.fcurEndCredit.equals(that.fcurEndCredit));
    equal = equal && (this.fcurEndBalance == null ? that.fcurEndBalance == null : this.fcurEndBalance.equals(that.fcurEndBalance));
    equal = equal && (this.fcurEndTaxBalance == null ? that.fcurEndTaxBalance == null : this.fcurEndTaxBalance.equals(that.fcurEndTaxBalance));
    equal = equal && (this.fcurEndPenaltyBalance == null ? that.fcurEndPenaltyBalance == null : this.fcurEndPenaltyBalance.equals(that.fcurEndPenaltyBalance));
    equal = equal && (this.fcurEndInterestBalance == null ? that.fcurEndInterestBalance == null : this.fcurEndInterestBalance.equals(that.fcurEndInterestBalance));
    equal = equal && (this.fdtmEndWhen == null ? that.fdtmEndWhen == null : this.fdtmEndWhen.equals(that.fdtmEndWhen));
    equal = equal && (this.fcurChangeInTax == null ? that.fcurChangeInTax == null : this.fcurChangeInTax.equals(that.fcurChangeInTax));
    equal = equal && (this.fcurChangeInPenalty == null ? that.fcurChangeInPenalty == null : this.fcurChangeInPenalty.equals(that.fcurChangeInPenalty));
    equal = equal && (this.fcurChangeInInterest == null ? that.fcurChangeInInterest == null : this.fcurChangeInInterest.equals(that.fcurChangeInInterest));
    equal = equal && (this.fcurChangeInCredit == null ? that.fcurChangeInCredit == null : this.fcurChangeInCredit.equals(that.fcurChangeInCredit));
    equal = equal && (this.fcurChangeInBalance == null ? that.fcurChangeInBalance == null : this.fcurChangeInBalance.equals(that.fcurChangeInBalance));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAuditkey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fcurBeginTax = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurBeginPenalty = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurBeginInterest = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurBeginCredit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurBeginBalance = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurBeginTaxBalance = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurBeginPenaltyBalance = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBeginInterestBalance = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fdtmBeginWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurEndTax = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurEndPenalty = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurEndInterest = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurEndCredit = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurEndBalance = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurEndTaxBalance = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurEndPenaltyBalance = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurEndInterestBalance = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fdtmEndWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fcurChangeInTax = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurChangeInPenalty = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurChangeInInterest = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurChangeInCredit = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurChangeInBalance = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(31, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAuditkey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fcurBeginTax = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurBeginPenalty = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurBeginInterest = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurBeginCredit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurBeginBalance = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurBeginTaxBalance = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurBeginPenaltyBalance = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBeginInterestBalance = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fdtmBeginWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurEndTax = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurEndPenalty = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurEndInterest = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurEndCredit = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurEndBalance = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurEndTaxBalance = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurEndPenaltyBalance = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurEndInterestBalance = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fdtmEndWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fcurChangeInTax = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurChangeInPenalty = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurChangeInInterest = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurChangeInCredit = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurChangeInBalance = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(31, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAuditkey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginTax, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginPenalty, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginInterest, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginCredit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginBalance, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginTaxBalance, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginPenaltyBalance, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginInterestBalance, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBeginWhen, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndTax, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndPenalty, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndInterest, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndCredit, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndBalance, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndTaxBalance, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndPenaltyBalance, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndInterestBalance, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEndWhen, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInTax, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInPenalty, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInInterest, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInCredit, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInBalance, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 29 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 31 + __off, 93, __dbStmt);
    return 31;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAuditkey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginTax, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginPenalty, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginInterest, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginCredit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginBalance, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginTaxBalance, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginPenaltyBalance, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeginInterestBalance, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBeginWhen, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndTax, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndPenalty, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndInterest, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndCredit, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndBalance, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndTaxBalance, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndPenaltyBalance, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndInterestBalance, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEndWhen, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInTax, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInPenalty, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInInterest, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInCredit, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChangeInBalance, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 29 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 31 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngAuditkey = null;
    } else {
    this.flngAuditkey = Integer.valueOf(__dataIn.readInt());
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
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeginTax = null;
    } else {
    this.fcurBeginTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeginPenalty = null;
    } else {
    this.fcurBeginPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeginInterest = null;
    } else {
    this.fcurBeginInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeginCredit = null;
    } else {
    this.fcurBeginCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeginBalance = null;
    } else {
    this.fcurBeginBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeginTaxBalance = null;
    } else {
    this.fcurBeginTaxBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeginPenaltyBalance = null;
    } else {
    this.fcurBeginPenaltyBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeginInterestBalance = null;
    } else {
    this.fcurBeginInterestBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmBeginWhen = null;
    } else {
    this.fdtmBeginWhen = new Timestamp(__dataIn.readLong());
    this.fdtmBeginWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEndTax = null;
    } else {
    this.fcurEndTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEndPenalty = null;
    } else {
    this.fcurEndPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEndInterest = null;
    } else {
    this.fcurEndInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEndCredit = null;
    } else {
    this.fcurEndCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEndBalance = null;
    } else {
    this.fcurEndBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEndTaxBalance = null;
    } else {
    this.fcurEndTaxBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEndPenaltyBalance = null;
    } else {
    this.fcurEndPenaltyBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEndInterestBalance = null;
    } else {
    this.fcurEndInterestBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEndWhen = null;
    } else {
    this.fdtmEndWhen = new Timestamp(__dataIn.readLong());
    this.fdtmEndWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurChangeInTax = null;
    } else {
    this.fcurChangeInTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurChangeInPenalty = null;
    } else {
    this.fcurChangeInPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurChangeInInterest = null;
    } else {
    this.fcurChangeInInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurChangeInCredit = null;
    } else {
    this.fcurChangeInCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurChangeInBalance = null;
    } else {
    this.fcurChangeInBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.flngAuditkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditkey);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fcurBeginTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginTax, __dataOut);
    }
    if (null == this.fcurBeginPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginPenalty, __dataOut);
    }
    if (null == this.fcurBeginInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginInterest, __dataOut);
    }
    if (null == this.fcurBeginCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginCredit, __dataOut);
    }
    if (null == this.fcurBeginBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginBalance, __dataOut);
    }
    if (null == this.fcurBeginTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginTaxBalance, __dataOut);
    }
    if (null == this.fcurBeginPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginPenaltyBalance, __dataOut);
    }
    if (null == this.fcurBeginInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginInterestBalance, __dataOut);
    }
    if (null == this.fdtmBeginWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBeginWhen.getTime());
    __dataOut.writeInt(this.fdtmBeginWhen.getNanos());
    }
    if (null == this.fcurEndTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndTax, __dataOut);
    }
    if (null == this.fcurEndPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndPenalty, __dataOut);
    }
    if (null == this.fcurEndInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndInterest, __dataOut);
    }
    if (null == this.fcurEndCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndCredit, __dataOut);
    }
    if (null == this.fcurEndBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndBalance, __dataOut);
    }
    if (null == this.fcurEndTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndTaxBalance, __dataOut);
    }
    if (null == this.fcurEndPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndPenaltyBalance, __dataOut);
    }
    if (null == this.fcurEndInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndInterestBalance, __dataOut);
    }
    if (null == this.fdtmEndWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEndWhen.getTime());
    __dataOut.writeInt(this.fdtmEndWhen.getNanos());
    }
    if (null == this.fcurChangeInTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInTax, __dataOut);
    }
    if (null == this.fcurChangeInPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInPenalty, __dataOut);
    }
    if (null == this.fcurChangeInInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInInterest, __dataOut);
    }
    if (null == this.fcurChangeInCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInCredit, __dataOut);
    }
    if (null == this.fcurChangeInBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInBalance, __dataOut);
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
    if (null == this.flngAuditkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditkey);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fcurBeginTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginTax, __dataOut);
    }
    if (null == this.fcurBeginPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginPenalty, __dataOut);
    }
    if (null == this.fcurBeginInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginInterest, __dataOut);
    }
    if (null == this.fcurBeginCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginCredit, __dataOut);
    }
    if (null == this.fcurBeginBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginBalance, __dataOut);
    }
    if (null == this.fcurBeginTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginTaxBalance, __dataOut);
    }
    if (null == this.fcurBeginPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginPenaltyBalance, __dataOut);
    }
    if (null == this.fcurBeginInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeginInterestBalance, __dataOut);
    }
    if (null == this.fdtmBeginWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBeginWhen.getTime());
    __dataOut.writeInt(this.fdtmBeginWhen.getNanos());
    }
    if (null == this.fcurEndTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndTax, __dataOut);
    }
    if (null == this.fcurEndPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndPenalty, __dataOut);
    }
    if (null == this.fcurEndInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndInterest, __dataOut);
    }
    if (null == this.fcurEndCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndCredit, __dataOut);
    }
    if (null == this.fcurEndBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndBalance, __dataOut);
    }
    if (null == this.fcurEndTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndTaxBalance, __dataOut);
    }
    if (null == this.fcurEndPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndPenaltyBalance, __dataOut);
    }
    if (null == this.fcurEndInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndInterestBalance, __dataOut);
    }
    if (null == this.fdtmEndWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEndWhen.getTime());
    __dataOut.writeInt(this.fdtmEndWhen.getNanos());
    }
    if (null == this.fcurChangeInTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInTax, __dataOut);
    }
    if (null == this.fcurChangeInPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInPenalty, __dataOut);
    }
    if (null == this.fcurChangeInInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInInterest, __dataOut);
    }
    if (null == this.fcurChangeInCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInCredit, __dataOut);
    }
    if (null == this.fcurChangeInBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChangeInBalance, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditkey==null?"\\N":"" + flngAuditkey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginTax==null?"\\N":fcurBeginTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginPenalty==null?"\\N":fcurBeginPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginInterest==null?"\\N":fcurBeginInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginCredit==null?"\\N":fcurBeginCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginBalance==null?"\\N":fcurBeginBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginTaxBalance==null?"\\N":fcurBeginTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginPenaltyBalance==null?"\\N":fcurBeginPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginInterestBalance==null?"\\N":fcurBeginInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBeginWhen==null?"\\N":"" + fdtmBeginWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndTax==null?"\\N":fcurEndTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndPenalty==null?"\\N":fcurEndPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndInterest==null?"\\N":fcurEndInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndCredit==null?"\\N":fcurEndCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndBalance==null?"\\N":fcurEndBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndTaxBalance==null?"\\N":fcurEndTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndPenaltyBalance==null?"\\N":fcurEndPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndInterestBalance==null?"\\N":fcurEndInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEndWhen==null?"\\N":"" + fdtmEndWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInTax==null?"\\N":fcurChangeInTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInPenalty==null?"\\N":fcurChangeInPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInInterest==null?"\\N":fcurChangeInInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInCredit==null?"\\N":fcurChangeInCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInBalance==null?"\\N":fcurChangeInBalance.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditkey==null?"\\N":"" + flngAuditkey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginTax==null?"\\N":fcurBeginTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginPenalty==null?"\\N":fcurBeginPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginInterest==null?"\\N":fcurBeginInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginCredit==null?"\\N":fcurBeginCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginBalance==null?"\\N":fcurBeginBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginTaxBalance==null?"\\N":fcurBeginTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginPenaltyBalance==null?"\\N":fcurBeginPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeginInterestBalance==null?"\\N":fcurBeginInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBeginWhen==null?"\\N":"" + fdtmBeginWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndTax==null?"\\N":fcurEndTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndPenalty==null?"\\N":fcurEndPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndInterest==null?"\\N":fcurEndInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndCredit==null?"\\N":fcurEndCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndBalance==null?"\\N":fcurEndBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndTaxBalance==null?"\\N":fcurEndTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndPenaltyBalance==null?"\\N":fcurEndPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndInterestBalance==null?"\\N":fcurEndInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEndWhen==null?"\\N":"" + fdtmEndWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInTax==null?"\\N":fcurChangeInTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInPenalty==null?"\\N":fcurChangeInPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInInterest==null?"\\N":fcurChangeInInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInCredit==null?"\\N":fcurChangeInCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChangeInBalance==null?"\\N":fcurChangeInBalance.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditkey = null; } else {
      this.flngAuditkey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginTax = null; } else {
      this.fcurBeginTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginPenalty = null; } else {
      this.fcurBeginPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginInterest = null; } else {
      this.fcurBeginInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginCredit = null; } else {
      this.fcurBeginCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginBalance = null; } else {
      this.fcurBeginBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginTaxBalance = null; } else {
      this.fcurBeginTaxBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginPenaltyBalance = null; } else {
      this.fcurBeginPenaltyBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginInterestBalance = null; } else {
      this.fcurBeginInterestBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBeginWhen = null; } else {
      this.fdtmBeginWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndTax = null; } else {
      this.fcurEndTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndPenalty = null; } else {
      this.fcurEndPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndInterest = null; } else {
      this.fcurEndInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndCredit = null; } else {
      this.fcurEndCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndBalance = null; } else {
      this.fcurEndBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndTaxBalance = null; } else {
      this.fcurEndTaxBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndPenaltyBalance = null; } else {
      this.fcurEndPenaltyBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndInterestBalance = null; } else {
      this.fcurEndInterestBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEndWhen = null; } else {
      this.fdtmEndWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInTax = null; } else {
      this.fcurChangeInTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInPenalty = null; } else {
      this.fcurChangeInPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInInterest = null; } else {
      this.fcurChangeInInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInCredit = null; } else {
      this.fcurChangeInCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInBalance = null; } else {
      this.fcurChangeInBalance = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditkey = null; } else {
      this.flngAuditkey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginTax = null; } else {
      this.fcurBeginTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginPenalty = null; } else {
      this.fcurBeginPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginInterest = null; } else {
      this.fcurBeginInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginCredit = null; } else {
      this.fcurBeginCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginBalance = null; } else {
      this.fcurBeginBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginTaxBalance = null; } else {
      this.fcurBeginTaxBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginPenaltyBalance = null; } else {
      this.fcurBeginPenaltyBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeginInterestBalance = null; } else {
      this.fcurBeginInterestBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBeginWhen = null; } else {
      this.fdtmBeginWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndTax = null; } else {
      this.fcurEndTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndPenalty = null; } else {
      this.fcurEndPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndInterest = null; } else {
      this.fcurEndInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndCredit = null; } else {
      this.fcurEndCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndBalance = null; } else {
      this.fcurEndBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndTaxBalance = null; } else {
      this.fcurEndTaxBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndPenaltyBalance = null; } else {
      this.fcurEndPenaltyBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndInterestBalance = null; } else {
      this.fcurEndInterestBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEndWhen = null; } else {
      this.fdtmEndWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInTax = null; } else {
      this.fcurChangeInTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInPenalty = null; } else {
      this.fcurChangeInPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInInterest = null; } else {
      this.fcurChangeInInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInCredit = null; } else {
      this.fcurChangeInCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChangeInBalance = null; } else {
      this.fcurChangeInBalance = new java.math.BigDecimal(__cur_str);
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
    tblauditperiod o = (tblauditperiod) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmBeginWhen = (o.fdtmBeginWhen != null) ? (java.sql.Timestamp) o.fdtmBeginWhen.clone() : null;
    o.fdtmEndWhen = (o.fdtmEndWhen != null) ? (java.sql.Timestamp) o.fdtmEndWhen.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblauditperiod o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmBeginWhen = (o.fdtmBeginWhen != null) ? (java.sql.Timestamp) o.fdtmBeginWhen.clone() : null;
    o.fdtmEndWhen = (o.fdtmEndWhen != null) ? (java.sql.Timestamp) o.fdtmEndWhen.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAuditkey", this.flngAuditkey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fcurBeginTax", this.fcurBeginTax);
    __sqoop$field_map.put("fcurBeginPenalty", this.fcurBeginPenalty);
    __sqoop$field_map.put("fcurBeginInterest", this.fcurBeginInterest);
    __sqoop$field_map.put("fcurBeginCredit", this.fcurBeginCredit);
    __sqoop$field_map.put("fcurBeginBalance", this.fcurBeginBalance);
    __sqoop$field_map.put("fcurBeginTaxBalance", this.fcurBeginTaxBalance);
    __sqoop$field_map.put("fcurBeginPenaltyBalance", this.fcurBeginPenaltyBalance);
    __sqoop$field_map.put("fcurBeginInterestBalance", this.fcurBeginInterestBalance);
    __sqoop$field_map.put("fdtmBeginWhen", this.fdtmBeginWhen);
    __sqoop$field_map.put("fcurEndTax", this.fcurEndTax);
    __sqoop$field_map.put("fcurEndPenalty", this.fcurEndPenalty);
    __sqoop$field_map.put("fcurEndInterest", this.fcurEndInterest);
    __sqoop$field_map.put("fcurEndCredit", this.fcurEndCredit);
    __sqoop$field_map.put("fcurEndBalance", this.fcurEndBalance);
    __sqoop$field_map.put("fcurEndTaxBalance", this.fcurEndTaxBalance);
    __sqoop$field_map.put("fcurEndPenaltyBalance", this.fcurEndPenaltyBalance);
    __sqoop$field_map.put("fcurEndInterestBalance", this.fcurEndInterestBalance);
    __sqoop$field_map.put("fdtmEndWhen", this.fdtmEndWhen);
    __sqoop$field_map.put("fcurChangeInTax", this.fcurChangeInTax);
    __sqoop$field_map.put("fcurChangeInPenalty", this.fcurChangeInPenalty);
    __sqoop$field_map.put("fcurChangeInInterest", this.fcurChangeInInterest);
    __sqoop$field_map.put("fcurChangeInCredit", this.fcurChangeInCredit);
    __sqoop$field_map.put("fcurChangeInBalance", this.fcurChangeInBalance);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAuditkey", this.flngAuditkey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fcurBeginTax", this.fcurBeginTax);
    __sqoop$field_map.put("fcurBeginPenalty", this.fcurBeginPenalty);
    __sqoop$field_map.put("fcurBeginInterest", this.fcurBeginInterest);
    __sqoop$field_map.put("fcurBeginCredit", this.fcurBeginCredit);
    __sqoop$field_map.put("fcurBeginBalance", this.fcurBeginBalance);
    __sqoop$field_map.put("fcurBeginTaxBalance", this.fcurBeginTaxBalance);
    __sqoop$field_map.put("fcurBeginPenaltyBalance", this.fcurBeginPenaltyBalance);
    __sqoop$field_map.put("fcurBeginInterestBalance", this.fcurBeginInterestBalance);
    __sqoop$field_map.put("fdtmBeginWhen", this.fdtmBeginWhen);
    __sqoop$field_map.put("fcurEndTax", this.fcurEndTax);
    __sqoop$field_map.put("fcurEndPenalty", this.fcurEndPenalty);
    __sqoop$field_map.put("fcurEndInterest", this.fcurEndInterest);
    __sqoop$field_map.put("fcurEndCredit", this.fcurEndCredit);
    __sqoop$field_map.put("fcurEndBalance", this.fcurEndBalance);
    __sqoop$field_map.put("fcurEndTaxBalance", this.fcurEndTaxBalance);
    __sqoop$field_map.put("fcurEndPenaltyBalance", this.fcurEndPenaltyBalance);
    __sqoop$field_map.put("fcurEndInterestBalance", this.fcurEndInterestBalance);
    __sqoop$field_map.put("fdtmEndWhen", this.fdtmEndWhen);
    __sqoop$field_map.put("fcurChangeInTax", this.fcurChangeInTax);
    __sqoop$field_map.put("fcurChangeInPenalty", this.fcurChangeInPenalty);
    __sqoop$field_map.put("fcurChangeInInterest", this.fcurChangeInInterest);
    __sqoop$field_map.put("fcurChangeInCredit", this.fcurChangeInCredit);
    __sqoop$field_map.put("fcurChangeInBalance", this.fcurChangeInBalance);
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
