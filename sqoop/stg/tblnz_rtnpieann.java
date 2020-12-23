// ORM class for table 'tblnz_rtnpieann'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:34:00 NZDT 2020
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

public class tblnz_rtnpieann extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngTotalCertificates", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.flngTotalCertificates = (Integer)value;
      }
    });
    setters.put("fcurTotalIncomeLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTotalIncomeLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTotalTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurNetTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurZeroExitedTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurZeroExitedTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalForeignTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTotalForeignTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalDWPTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTotalDWPTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalICTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTotalICTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRWTTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTotalRWTTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPaymentExitedInvestors", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTaxPaymentExitedInvestors = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableIncomeLowMid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTaxableIncomeLowMid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPaidLowMid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTaxPaidLowMid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxCreditsLowMid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieann.this.fcurTotalTaxCreditsLowMid = (java.math.BigDecimal)value;
      }
    });
  }
  public tblnz_rtnpieann() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnpieann with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnpieann with_fstrWho(String fstrWho) {
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
  public tblnz_rtnpieann with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  private Integer flngTotalCertificates;
  public Integer get_flngTotalCertificates() {
    return flngTotalCertificates;
  }
  public void set_flngTotalCertificates(Integer flngTotalCertificates) {
    this.flngTotalCertificates = flngTotalCertificates;
  }
  public tblnz_rtnpieann with_flngTotalCertificates(Integer flngTotalCertificates) {
    this.flngTotalCertificates = flngTotalCertificates;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncomeLoss;
  public java.math.BigDecimal get_fcurTotalIncomeLoss() {
    return fcurTotalIncomeLoss;
  }
  public void set_fcurTotalIncomeLoss(java.math.BigDecimal fcurTotalIncomeLoss) {
    this.fcurTotalIncomeLoss = fcurTotalIncomeLoss;
  }
  public tblnz_rtnpieann with_fcurTotalIncomeLoss(java.math.BigDecimal fcurTotalIncomeLoss) {
    this.fcurTotalIncomeLoss = fcurTotalIncomeLoss;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxCredits;
  public java.math.BigDecimal get_fcurTotalTaxCredits() {
    return fcurTotalTaxCredits;
  }
  public void set_fcurTotalTaxCredits(java.math.BigDecimal fcurTotalTaxCredits) {
    this.fcurTotalTaxCredits = fcurTotalTaxCredits;
  }
  public tblnz_rtnpieann with_fcurTotalTaxCredits(java.math.BigDecimal fcurTotalTaxCredits) {
    this.fcurTotalTaxCredits = fcurTotalTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurNetTaxPaid;
  public java.math.BigDecimal get_fcurNetTaxPaid() {
    return fcurNetTaxPaid;
  }
  public void set_fcurNetTaxPaid(java.math.BigDecimal fcurNetTaxPaid) {
    this.fcurNetTaxPaid = fcurNetTaxPaid;
  }
  public tblnz_rtnpieann with_fcurNetTaxPaid(java.math.BigDecimal fcurNetTaxPaid) {
    this.fcurNetTaxPaid = fcurNetTaxPaid;
    return this;
  }
  private java.math.BigDecimal fcurZeroExitedTaxableIncome;
  public java.math.BigDecimal get_fcurZeroExitedTaxableIncome() {
    return fcurZeroExitedTaxableIncome;
  }
  public void set_fcurZeroExitedTaxableIncome(java.math.BigDecimal fcurZeroExitedTaxableIncome) {
    this.fcurZeroExitedTaxableIncome = fcurZeroExitedTaxableIncome;
  }
  public tblnz_rtnpieann with_fcurZeroExitedTaxableIncome(java.math.BigDecimal fcurZeroExitedTaxableIncome) {
    this.fcurZeroExitedTaxableIncome = fcurZeroExitedTaxableIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalForeignTaxCredits;
  public java.math.BigDecimal get_fcurTotalForeignTaxCredits() {
    return fcurTotalForeignTaxCredits;
  }
  public void set_fcurTotalForeignTaxCredits(java.math.BigDecimal fcurTotalForeignTaxCredits) {
    this.fcurTotalForeignTaxCredits = fcurTotalForeignTaxCredits;
  }
  public tblnz_rtnpieann with_fcurTotalForeignTaxCredits(java.math.BigDecimal fcurTotalForeignTaxCredits) {
    this.fcurTotalForeignTaxCredits = fcurTotalForeignTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalDWPTaxCredits;
  public java.math.BigDecimal get_fcurTotalDWPTaxCredits() {
    return fcurTotalDWPTaxCredits;
  }
  public void set_fcurTotalDWPTaxCredits(java.math.BigDecimal fcurTotalDWPTaxCredits) {
    this.fcurTotalDWPTaxCredits = fcurTotalDWPTaxCredits;
  }
  public tblnz_rtnpieann with_fcurTotalDWPTaxCredits(java.math.BigDecimal fcurTotalDWPTaxCredits) {
    this.fcurTotalDWPTaxCredits = fcurTotalDWPTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalICTaxCredits;
  public java.math.BigDecimal get_fcurTotalICTaxCredits() {
    return fcurTotalICTaxCredits;
  }
  public void set_fcurTotalICTaxCredits(java.math.BigDecimal fcurTotalICTaxCredits) {
    this.fcurTotalICTaxCredits = fcurTotalICTaxCredits;
  }
  public tblnz_rtnpieann with_fcurTotalICTaxCredits(java.math.BigDecimal fcurTotalICTaxCredits) {
    this.fcurTotalICTaxCredits = fcurTotalICTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalRWTTaxCredits;
  public java.math.BigDecimal get_fcurTotalRWTTaxCredits() {
    return fcurTotalRWTTaxCredits;
  }
  public void set_fcurTotalRWTTaxCredits(java.math.BigDecimal fcurTotalRWTTaxCredits) {
    this.fcurTotalRWTTaxCredits = fcurTotalRWTTaxCredits;
  }
  public tblnz_rtnpieann with_fcurTotalRWTTaxCredits(java.math.BigDecimal fcurTotalRWTTaxCredits) {
    this.fcurTotalRWTTaxCredits = fcurTotalRWTTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTaxPaymentExitedInvestors;
  public java.math.BigDecimal get_fcurTaxPaymentExitedInvestors() {
    return fcurTaxPaymentExitedInvestors;
  }
  public void set_fcurTaxPaymentExitedInvestors(java.math.BigDecimal fcurTaxPaymentExitedInvestors) {
    this.fcurTaxPaymentExitedInvestors = fcurTaxPaymentExitedInvestors;
  }
  public tblnz_rtnpieann with_fcurTaxPaymentExitedInvestors(java.math.BigDecimal fcurTaxPaymentExitedInvestors) {
    this.fcurTaxPaymentExitedInvestors = fcurTaxPaymentExitedInvestors;
    return this;
  }
  private java.math.BigDecimal fcurTaxableIncomeLowMid;
  public java.math.BigDecimal get_fcurTaxableIncomeLowMid() {
    return fcurTaxableIncomeLowMid;
  }
  public void set_fcurTaxableIncomeLowMid(java.math.BigDecimal fcurTaxableIncomeLowMid) {
    this.fcurTaxableIncomeLowMid = fcurTaxableIncomeLowMid;
  }
  public tblnz_rtnpieann with_fcurTaxableIncomeLowMid(java.math.BigDecimal fcurTaxableIncomeLowMid) {
    this.fcurTaxableIncomeLowMid = fcurTaxableIncomeLowMid;
    return this;
  }
  private java.math.BigDecimal fcurTaxPaidLowMid;
  public java.math.BigDecimal get_fcurTaxPaidLowMid() {
    return fcurTaxPaidLowMid;
  }
  public void set_fcurTaxPaidLowMid(java.math.BigDecimal fcurTaxPaidLowMid) {
    this.fcurTaxPaidLowMid = fcurTaxPaidLowMid;
  }
  public tblnz_rtnpieann with_fcurTaxPaidLowMid(java.math.BigDecimal fcurTaxPaidLowMid) {
    this.fcurTaxPaidLowMid = fcurTaxPaidLowMid;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxCreditsLowMid;
  public java.math.BigDecimal get_fcurTotalTaxCreditsLowMid() {
    return fcurTotalTaxCreditsLowMid;
  }
  public void set_fcurTotalTaxCreditsLowMid(java.math.BigDecimal fcurTotalTaxCreditsLowMid) {
    this.fcurTotalTaxCreditsLowMid = fcurTotalTaxCreditsLowMid;
  }
  public tblnz_rtnpieann with_fcurTotalTaxCreditsLowMid(java.math.BigDecimal fcurTotalTaxCreditsLowMid) {
    this.fcurTotalTaxCreditsLowMid = fcurTotalTaxCreditsLowMid;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpieann)) {
      return false;
    }
    tblnz_rtnpieann that = (tblnz_rtnpieann) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.flngTotalCertificates == null ? that.flngTotalCertificates == null : this.flngTotalCertificates.equals(that.flngTotalCertificates));
    equal = equal && (this.fcurTotalIncomeLoss == null ? that.fcurTotalIncomeLoss == null : this.fcurTotalIncomeLoss.equals(that.fcurTotalIncomeLoss));
    equal = equal && (this.fcurTotalTaxCredits == null ? that.fcurTotalTaxCredits == null : this.fcurTotalTaxCredits.equals(that.fcurTotalTaxCredits));
    equal = equal && (this.fcurNetTaxPaid == null ? that.fcurNetTaxPaid == null : this.fcurNetTaxPaid.equals(that.fcurNetTaxPaid));
    equal = equal && (this.fcurZeroExitedTaxableIncome == null ? that.fcurZeroExitedTaxableIncome == null : this.fcurZeroExitedTaxableIncome.equals(that.fcurZeroExitedTaxableIncome));
    equal = equal && (this.fcurTotalForeignTaxCredits == null ? that.fcurTotalForeignTaxCredits == null : this.fcurTotalForeignTaxCredits.equals(that.fcurTotalForeignTaxCredits));
    equal = equal && (this.fcurTotalDWPTaxCredits == null ? that.fcurTotalDWPTaxCredits == null : this.fcurTotalDWPTaxCredits.equals(that.fcurTotalDWPTaxCredits));
    equal = equal && (this.fcurTotalICTaxCredits == null ? that.fcurTotalICTaxCredits == null : this.fcurTotalICTaxCredits.equals(that.fcurTotalICTaxCredits));
    equal = equal && (this.fcurTotalRWTTaxCredits == null ? that.fcurTotalRWTTaxCredits == null : this.fcurTotalRWTTaxCredits.equals(that.fcurTotalRWTTaxCredits));
    equal = equal && (this.fcurTaxPaymentExitedInvestors == null ? that.fcurTaxPaymentExitedInvestors == null : this.fcurTaxPaymentExitedInvestors.equals(that.fcurTaxPaymentExitedInvestors));
    equal = equal && (this.fcurTaxableIncomeLowMid == null ? that.fcurTaxableIncomeLowMid == null : this.fcurTaxableIncomeLowMid.equals(that.fcurTaxableIncomeLowMid));
    equal = equal && (this.fcurTaxPaidLowMid == null ? that.fcurTaxPaidLowMid == null : this.fcurTaxPaidLowMid.equals(that.fcurTaxPaidLowMid));
    equal = equal && (this.fcurTotalTaxCreditsLowMid == null ? that.fcurTotalTaxCreditsLowMid == null : this.fcurTotalTaxCreditsLowMid.equals(that.fcurTotalTaxCreditsLowMid));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpieann)) {
      return false;
    }
    tblnz_rtnpieann that = (tblnz_rtnpieann) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.flngTotalCertificates == null ? that.flngTotalCertificates == null : this.flngTotalCertificates.equals(that.flngTotalCertificates));
    equal = equal && (this.fcurTotalIncomeLoss == null ? that.fcurTotalIncomeLoss == null : this.fcurTotalIncomeLoss.equals(that.fcurTotalIncomeLoss));
    equal = equal && (this.fcurTotalTaxCredits == null ? that.fcurTotalTaxCredits == null : this.fcurTotalTaxCredits.equals(that.fcurTotalTaxCredits));
    equal = equal && (this.fcurNetTaxPaid == null ? that.fcurNetTaxPaid == null : this.fcurNetTaxPaid.equals(that.fcurNetTaxPaid));
    equal = equal && (this.fcurZeroExitedTaxableIncome == null ? that.fcurZeroExitedTaxableIncome == null : this.fcurZeroExitedTaxableIncome.equals(that.fcurZeroExitedTaxableIncome));
    equal = equal && (this.fcurTotalForeignTaxCredits == null ? that.fcurTotalForeignTaxCredits == null : this.fcurTotalForeignTaxCredits.equals(that.fcurTotalForeignTaxCredits));
    equal = equal && (this.fcurTotalDWPTaxCredits == null ? that.fcurTotalDWPTaxCredits == null : this.fcurTotalDWPTaxCredits.equals(that.fcurTotalDWPTaxCredits));
    equal = equal && (this.fcurTotalICTaxCredits == null ? that.fcurTotalICTaxCredits == null : this.fcurTotalICTaxCredits.equals(that.fcurTotalICTaxCredits));
    equal = equal && (this.fcurTotalRWTTaxCredits == null ? that.fcurTotalRWTTaxCredits == null : this.fcurTotalRWTTaxCredits.equals(that.fcurTotalRWTTaxCredits));
    equal = equal && (this.fcurTaxPaymentExitedInvestors == null ? that.fcurTaxPaymentExitedInvestors == null : this.fcurTaxPaymentExitedInvestors.equals(that.fcurTaxPaymentExitedInvestors));
    equal = equal && (this.fcurTaxableIncomeLowMid == null ? that.fcurTaxableIncomeLowMid == null : this.fcurTaxableIncomeLowMid.equals(that.fcurTaxableIncomeLowMid));
    equal = equal && (this.fcurTaxPaidLowMid == null ? that.fcurTaxPaidLowMid == null : this.fcurTaxPaidLowMid.equals(that.fcurTaxPaidLowMid));
    equal = equal && (this.fcurTotalTaxCreditsLowMid == null ? that.fcurTotalTaxCreditsLowMid == null : this.fcurTotalTaxCreditsLowMid.equals(that.fcurTotalTaxCreditsLowMid));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngTotalCertificates = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurTotalIncomeLoss = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurTotalTaxCredits = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurNetTaxPaid = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurZeroExitedTaxableIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalForeignTaxCredits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurTotalDWPTaxCredits = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTotalICTaxCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalRWTTaxCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTaxPaymentExitedInvestors = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTaxableIncomeLowMid = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTaxPaidLowMid = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalTaxCreditsLowMid = JdbcWritableBridge.readBigDecimal(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngTotalCertificates = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurTotalIncomeLoss = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurTotalTaxCredits = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurNetTaxPaid = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurZeroExitedTaxableIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalForeignTaxCredits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurTotalDWPTaxCredits = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTotalICTaxCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalRWTTaxCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTaxPaymentExitedInvestors = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTaxableIncomeLowMid = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTaxPaidLowMid = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalTaxCreditsLowMid = JdbcWritableBridge.readBigDecimal(16, __dbResults);
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
    JdbcWritableBridge.writeString(fstrWho, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTotalCertificates, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeLoss, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCredits, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetTaxPaid, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurZeroExitedTaxableIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalForeignTaxCredits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDWPTaxCredits, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalICTaxCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWTTaxCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaymentExitedInvestors, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncomeLowMid, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaidLowMid, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCreditsLowMid, 16 + __off, 3, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTotalCertificates, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeLoss, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCredits, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetTaxPaid, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurZeroExitedTaxableIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalForeignTaxCredits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDWPTaxCredits, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalICTaxCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWTTaxCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaymentExitedInvestors, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncomeLowMid, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaidLowMid, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCreditsLowMid, 16 + __off, 3, __dbStmt);
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
    if (__dataIn.readBoolean()) { 
        this.flngTotalCertificates = null;
    } else {
    this.flngTotalCertificates = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncomeLoss = null;
    } else {
    this.fcurTotalIncomeLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxCredits = null;
    } else {
    this.fcurTotalTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetTaxPaid = null;
    } else {
    this.fcurNetTaxPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurZeroExitedTaxableIncome = null;
    } else {
    this.fcurZeroExitedTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalForeignTaxCredits = null;
    } else {
    this.fcurTotalForeignTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalDWPTaxCredits = null;
    } else {
    this.fcurTotalDWPTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalICTaxCredits = null;
    } else {
    this.fcurTotalICTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalRWTTaxCredits = null;
    } else {
    this.fcurTotalRWTTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPaymentExitedInvestors = null;
    } else {
    this.fcurTaxPaymentExitedInvestors = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxableIncomeLowMid = null;
    } else {
    this.fcurTaxableIncomeLowMid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPaidLowMid = null;
    } else {
    this.fcurTaxPaidLowMid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxCreditsLowMid = null;
    } else {
    this.fcurTotalTaxCreditsLowMid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.flngTotalCertificates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTotalCertificates);
    }
    if (null == this.fcurTotalIncomeLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeLoss, __dataOut);
    }
    if (null == this.fcurTotalTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCredits, __dataOut);
    }
    if (null == this.fcurNetTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetTaxPaid, __dataOut);
    }
    if (null == this.fcurZeroExitedTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurZeroExitedTaxableIncome, __dataOut);
    }
    if (null == this.fcurTotalForeignTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalForeignTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalDWPTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDWPTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalICTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalICTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalRWTTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWTTaxCredits, __dataOut);
    }
    if (null == this.fcurTaxPaymentExitedInvestors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaymentExitedInvestors, __dataOut);
    }
    if (null == this.fcurTaxableIncomeLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncomeLowMid, __dataOut);
    }
    if (null == this.fcurTaxPaidLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaidLowMid, __dataOut);
    }
    if (null == this.fcurTotalTaxCreditsLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCreditsLowMid, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.flngTotalCertificates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTotalCertificates);
    }
    if (null == this.fcurTotalIncomeLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeLoss, __dataOut);
    }
    if (null == this.fcurTotalTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCredits, __dataOut);
    }
    if (null == this.fcurNetTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetTaxPaid, __dataOut);
    }
    if (null == this.fcurZeroExitedTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurZeroExitedTaxableIncome, __dataOut);
    }
    if (null == this.fcurTotalForeignTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalForeignTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalDWPTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDWPTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalICTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalICTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalRWTTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWTTaxCredits, __dataOut);
    }
    if (null == this.fcurTaxPaymentExitedInvestors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaymentExitedInvestors, __dataOut);
    }
    if (null == this.fcurTaxableIncomeLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncomeLowMid, __dataOut);
    }
    if (null == this.fcurTaxPaidLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaidLowMid, __dataOut);
    }
    if (null == this.fcurTotalTaxCreditsLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCreditsLowMid, __dataOut);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTotalCertificates==null?"\\N":"" + flngTotalCertificates, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeLoss==null?"\\N":fcurTotalIncomeLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCredits==null?"\\N":fcurTotalTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetTaxPaid==null?"\\N":fcurNetTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurZeroExitedTaxableIncome==null?"\\N":fcurZeroExitedTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalForeignTaxCredits==null?"\\N":fcurTotalForeignTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDWPTaxCredits==null?"\\N":fcurTotalDWPTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalICTaxCredits==null?"\\N":fcurTotalICTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWTTaxCredits==null?"\\N":fcurTotalRWTTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaymentExitedInvestors==null?"\\N":fcurTaxPaymentExitedInvestors.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncomeLowMid==null?"\\N":fcurTaxableIncomeLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaidLowMid==null?"\\N":fcurTaxPaidLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCreditsLowMid==null?"\\N":fcurTotalTaxCreditsLowMid.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTotalCertificates==null?"\\N":"" + flngTotalCertificates, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeLoss==null?"\\N":fcurTotalIncomeLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCredits==null?"\\N":fcurTotalTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetTaxPaid==null?"\\N":fcurNetTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurZeroExitedTaxableIncome==null?"\\N":fcurZeroExitedTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalForeignTaxCredits==null?"\\N":fcurTotalForeignTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDWPTaxCredits==null?"\\N":fcurTotalDWPTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalICTaxCredits==null?"\\N":fcurTotalICTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWTTaxCredits==null?"\\N":fcurTotalRWTTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaymentExitedInvestors==null?"\\N":fcurTaxPaymentExitedInvestors.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncomeLowMid==null?"\\N":fcurTaxableIncomeLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaidLowMid==null?"\\N":fcurTaxPaidLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCreditsLowMid==null?"\\N":fcurTotalTaxCreditsLowMid.toPlainString(), delimiters));
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

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTotalCertificates = null; } else {
      this.flngTotalCertificates = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeLoss = null; } else {
      this.fcurTotalIncomeLoss = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetTaxPaid = null; } else {
      this.fcurNetTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurZeroExitedTaxableIncome = null; } else {
      this.fcurZeroExitedTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalForeignTaxCredits = null; } else {
      this.fcurTotalForeignTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDWPTaxCredits = null; } else {
      this.fcurTotalDWPTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalICTaxCredits = null; } else {
      this.fcurTotalICTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWTTaxCredits = null; } else {
      this.fcurTotalRWTTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaymentExitedInvestors = null; } else {
      this.fcurTaxPaymentExitedInvestors = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableIncomeLowMid = null; } else {
      this.fcurTaxableIncomeLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaidLowMid = null; } else {
      this.fcurTaxPaidLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCreditsLowMid = null; } else {
      this.fcurTotalTaxCreditsLowMid = new java.math.BigDecimal(__cur_str);
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

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTotalCertificates = null; } else {
      this.flngTotalCertificates = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeLoss = null; } else {
      this.fcurTotalIncomeLoss = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetTaxPaid = null; } else {
      this.fcurNetTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurZeroExitedTaxableIncome = null; } else {
      this.fcurZeroExitedTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalForeignTaxCredits = null; } else {
      this.fcurTotalForeignTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDWPTaxCredits = null; } else {
      this.fcurTotalDWPTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalICTaxCredits = null; } else {
      this.fcurTotalICTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWTTaxCredits = null; } else {
      this.fcurTotalRWTTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaymentExitedInvestors = null; } else {
      this.fcurTaxPaymentExitedInvestors = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableIncomeLowMid = null; } else {
      this.fcurTaxableIncomeLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaidLowMid = null; } else {
      this.fcurTaxPaidLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCreditsLowMid = null; } else {
      this.fcurTotalTaxCreditsLowMid = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblnz_rtnpieann o = (tblnz_rtnpieann) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnpieann o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("flngTotalCertificates", this.flngTotalCertificates);
    __sqoop$field_map.put("fcurTotalIncomeLoss", this.fcurTotalIncomeLoss);
    __sqoop$field_map.put("fcurTotalTaxCredits", this.fcurTotalTaxCredits);
    __sqoop$field_map.put("fcurNetTaxPaid", this.fcurNetTaxPaid);
    __sqoop$field_map.put("fcurZeroExitedTaxableIncome", this.fcurZeroExitedTaxableIncome);
    __sqoop$field_map.put("fcurTotalForeignTaxCredits", this.fcurTotalForeignTaxCredits);
    __sqoop$field_map.put("fcurTotalDWPTaxCredits", this.fcurTotalDWPTaxCredits);
    __sqoop$field_map.put("fcurTotalICTaxCredits", this.fcurTotalICTaxCredits);
    __sqoop$field_map.put("fcurTotalRWTTaxCredits", this.fcurTotalRWTTaxCredits);
    __sqoop$field_map.put("fcurTaxPaymentExitedInvestors", this.fcurTaxPaymentExitedInvestors);
    __sqoop$field_map.put("fcurTaxableIncomeLowMid", this.fcurTaxableIncomeLowMid);
    __sqoop$field_map.put("fcurTaxPaidLowMid", this.fcurTaxPaidLowMid);
    __sqoop$field_map.put("fcurTotalTaxCreditsLowMid", this.fcurTotalTaxCreditsLowMid);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("flngTotalCertificates", this.flngTotalCertificates);
    __sqoop$field_map.put("fcurTotalIncomeLoss", this.fcurTotalIncomeLoss);
    __sqoop$field_map.put("fcurTotalTaxCredits", this.fcurTotalTaxCredits);
    __sqoop$field_map.put("fcurNetTaxPaid", this.fcurNetTaxPaid);
    __sqoop$field_map.put("fcurZeroExitedTaxableIncome", this.fcurZeroExitedTaxableIncome);
    __sqoop$field_map.put("fcurTotalForeignTaxCredits", this.fcurTotalForeignTaxCredits);
    __sqoop$field_map.put("fcurTotalDWPTaxCredits", this.fcurTotalDWPTaxCredits);
    __sqoop$field_map.put("fcurTotalICTaxCredits", this.fcurTotalICTaxCredits);
    __sqoop$field_map.put("fcurTotalRWTTaxCredits", this.fcurTotalRWTTaxCredits);
    __sqoop$field_map.put("fcurTaxPaymentExitedInvestors", this.fcurTaxPaymentExitedInvestors);
    __sqoop$field_map.put("fcurTaxableIncomeLowMid", this.fcurTaxableIncomeLowMid);
    __sqoop$field_map.put("fcurTaxPaidLowMid", this.fcurTaxPaidLowMid);
    __sqoop$field_map.put("fcurTotalTaxCreditsLowMid", this.fcurTotalTaxCreditsLowMid);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
