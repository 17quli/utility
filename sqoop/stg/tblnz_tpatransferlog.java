// ORM class for table 'tblnz_tpatransferlog'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:01:37 NZDT 2020
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

public class tblnz_tpatransferlog extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngTPAKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngTPAKey = (Integer)value;
      }
    });
    setters.put("flngSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngSequence = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngTransKey = (Integer)value;
      }
    });
    setters.put("flngUOMITransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngUOMITransKey = (Integer)value;
      }
    });
    setters.put("fstrTransfer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fstrTransfer = (String)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurUOMI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fcurUOMI = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmPosted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fdtmPosted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPostedEffectiveDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fdtmPostedEffectiveDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnOwned", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fblnOwned = (Integer)value;
      }
    });
    setters.put("flngTransferType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngTransferType = (Integer)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngTPAKeyTransfer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngTPAKeyTransfer = (Integer)value;
      }
    });
    setters.put("flngWorkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngWorkKey = (Integer)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("fblnConverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fblnConverted = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpatransferlog.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_tpatransferlog() {
    init0();
  }
  private Integer flngTPAKey;
  public Integer get_flngTPAKey() {
    return flngTPAKey;
  }
  public void set_flngTPAKey(Integer flngTPAKey) {
    this.flngTPAKey = flngTPAKey;
  }
  public tblnz_tpatransferlog with_flngTPAKey(Integer flngTPAKey) {
    this.flngTPAKey = flngTPAKey;
    return this;
  }
  private Integer flngSequence;
  public Integer get_flngSequence() {
    return flngSequence;
  }
  public void set_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
  }
  public tblnz_tpatransferlog with_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_tpatransferlog with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_tpatransferlog with_flngAccountKey(Integer flngAccountKey) {
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
  public tblnz_tpatransferlog with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngTransKey;
  public Integer get_flngTransKey() {
    return flngTransKey;
  }
  public void set_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
  }
  public tblnz_tpatransferlog with_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
    return this;
  }
  private Integer flngUOMITransKey;
  public Integer get_flngUOMITransKey() {
    return flngUOMITransKey;
  }
  public void set_flngUOMITransKey(Integer flngUOMITransKey) {
    this.flngUOMITransKey = flngUOMITransKey;
  }
  public tblnz_tpatransferlog with_flngUOMITransKey(Integer flngUOMITransKey) {
    this.flngUOMITransKey = flngUOMITransKey;
    return this;
  }
  private String fstrTransfer;
  public String get_fstrTransfer() {
    return fstrTransfer;
  }
  public void set_fstrTransfer(String fstrTransfer) {
    this.fstrTransfer = fstrTransfer;
  }
  public tblnz_tpatransferlog with_fstrTransfer(String fstrTransfer) {
    this.fstrTransfer = fstrTransfer;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_tpatransferlog with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private java.math.BigDecimal fcurUOMI;
  public java.math.BigDecimal get_fcurUOMI() {
    return fcurUOMI;
  }
  public void set_fcurUOMI(java.math.BigDecimal fcurUOMI) {
    this.fcurUOMI = fcurUOMI;
  }
  public tblnz_tpatransferlog with_fcurUOMI(java.math.BigDecimal fcurUOMI) {
    this.fcurUOMI = fcurUOMI;
    return this;
  }
  private java.sql.Timestamp fdtmPosted;
  public java.sql.Timestamp get_fdtmPosted() {
    return fdtmPosted;
  }
  public void set_fdtmPosted(java.sql.Timestamp fdtmPosted) {
    this.fdtmPosted = fdtmPosted;
  }
  public tblnz_tpatransferlog with_fdtmPosted(java.sql.Timestamp fdtmPosted) {
    this.fdtmPosted = fdtmPosted;
    return this;
  }
  private java.sql.Timestamp fdtmPostedEffectiveDate;
  public java.sql.Timestamp get_fdtmPostedEffectiveDate() {
    return fdtmPostedEffectiveDate;
  }
  public void set_fdtmPostedEffectiveDate(java.sql.Timestamp fdtmPostedEffectiveDate) {
    this.fdtmPostedEffectiveDate = fdtmPostedEffectiveDate;
  }
  public tblnz_tpatransferlog with_fdtmPostedEffectiveDate(java.sql.Timestamp fdtmPostedEffectiveDate) {
    this.fdtmPostedEffectiveDate = fdtmPostedEffectiveDate;
    return this;
  }
  private Integer fblnOwned;
  public Integer get_fblnOwned() {
    return fblnOwned;
  }
  public void set_fblnOwned(Integer fblnOwned) {
    this.fblnOwned = fblnOwned;
  }
  public tblnz_tpatransferlog with_fblnOwned(Integer fblnOwned) {
    this.fblnOwned = fblnOwned;
    return this;
  }
  private Integer flngTransferType;
  public Integer get_flngTransferType() {
    return flngTransferType;
  }
  public void set_flngTransferType(Integer flngTransferType) {
    this.flngTransferType = flngTransferType;
  }
  public tblnz_tpatransferlog with_flngTransferType(Integer flngTransferType) {
    this.flngTransferType = flngTransferType;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblnz_tpatransferlog with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private Integer flngTPAKeyTransfer;
  public Integer get_flngTPAKeyTransfer() {
    return flngTPAKeyTransfer;
  }
  public void set_flngTPAKeyTransfer(Integer flngTPAKeyTransfer) {
    this.flngTPAKeyTransfer = flngTPAKeyTransfer;
  }
  public tblnz_tpatransferlog with_flngTPAKeyTransfer(Integer flngTPAKeyTransfer) {
    this.flngTPAKeyTransfer = flngTPAKeyTransfer;
    return this;
  }
  private Integer flngWorkKey;
  public Integer get_flngWorkKey() {
    return flngWorkKey;
  }
  public void set_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
  }
  public tblnz_tpatransferlog with_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tblnz_tpatransferlog with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private Integer fblnConverted;
  public Integer get_fblnConverted() {
    return fblnConverted;
  }
  public void set_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
  }
  public tblnz_tpatransferlog with_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_tpatransferlog with_fstrWho(String fstrWho) {
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
  public tblnz_tpatransferlog with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tpatransferlog)) {
      return false;
    }
    tblnz_tpatransferlog that = (tblnz_tpatransferlog) o;
    boolean equal = true;
    equal = equal && (this.flngTPAKey == null ? that.flngTPAKey == null : this.flngTPAKey.equals(that.flngTPAKey));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.flngUOMITransKey == null ? that.flngUOMITransKey == null : this.flngUOMITransKey.equals(that.flngUOMITransKey));
    equal = equal && (this.fstrTransfer == null ? that.fstrTransfer == null : this.fstrTransfer.equals(that.fstrTransfer));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fcurUOMI == null ? that.fcurUOMI == null : this.fcurUOMI.equals(that.fcurUOMI));
    equal = equal && (this.fdtmPosted == null ? that.fdtmPosted == null : this.fdtmPosted.equals(that.fdtmPosted));
    equal = equal && (this.fdtmPostedEffectiveDate == null ? that.fdtmPostedEffectiveDate == null : this.fdtmPostedEffectiveDate.equals(that.fdtmPostedEffectiveDate));
    equal = equal && (this.fblnOwned == null ? that.fblnOwned == null : this.fblnOwned.equals(that.fblnOwned));
    equal = equal && (this.flngTransferType == null ? that.flngTransferType == null : this.flngTransferType.equals(that.flngTransferType));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.flngTPAKeyTransfer == null ? that.flngTPAKeyTransfer == null : this.flngTPAKeyTransfer.equals(that.flngTPAKeyTransfer));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tpatransferlog)) {
      return false;
    }
    tblnz_tpatransferlog that = (tblnz_tpatransferlog) o;
    boolean equal = true;
    equal = equal && (this.flngTPAKey == null ? that.flngTPAKey == null : this.flngTPAKey.equals(that.flngTPAKey));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.flngUOMITransKey == null ? that.flngUOMITransKey == null : this.flngUOMITransKey.equals(that.flngUOMITransKey));
    equal = equal && (this.fstrTransfer == null ? that.fstrTransfer == null : this.fstrTransfer.equals(that.fstrTransfer));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fcurUOMI == null ? that.fcurUOMI == null : this.fcurUOMI.equals(that.fcurUOMI));
    equal = equal && (this.fdtmPosted == null ? that.fdtmPosted == null : this.fdtmPosted.equals(that.fdtmPosted));
    equal = equal && (this.fdtmPostedEffectiveDate == null ? that.fdtmPostedEffectiveDate == null : this.fdtmPostedEffectiveDate.equals(that.fdtmPostedEffectiveDate));
    equal = equal && (this.fblnOwned == null ? that.fblnOwned == null : this.fblnOwned.equals(that.fblnOwned));
    equal = equal && (this.flngTransferType == null ? that.flngTransferType == null : this.flngTransferType.equals(that.flngTransferType));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.flngTPAKeyTransfer == null ? that.flngTPAKeyTransfer == null : this.flngTPAKeyTransfer.equals(that.flngTPAKeyTransfer));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngTPAKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngUOMITransKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrTransfer = JdbcWritableBridge.readString(8, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurUOMI = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fdtmPosted = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmPostedEffectiveDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fblnOwned = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngTransferType = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.flngTPAKeyTransfer = JdbcWritableBridge.readInteger(16, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngTPAKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngUOMITransKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrTransfer = JdbcWritableBridge.readString(8, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurUOMI = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fdtmPosted = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmPostedEffectiveDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fblnOwned = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngTransferType = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.flngTPAKeyTransfer = JdbcWritableBridge.readInteger(16, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngTPAKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngUOMITransKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransfer, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUOMI, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPosted, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPostedEffectiveDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOwned, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransferType, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTPAKeyTransfer, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
    return 21;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngTPAKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngUOMITransKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransfer, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUOMI, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPosted, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPostedEffectiveDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOwned, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransferType, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTPAKeyTransfer, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngTPAKey = null;
    } else {
    this.flngTPAKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSequence = null;
    } else {
    this.flngSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
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
        this.flngTransKey = null;
    } else {
    this.flngTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngUOMITransKey = null;
    } else {
    this.flngUOMITransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransfer = null;
    } else {
    this.fstrTransfer = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurUOMI = null;
    } else {
    this.fcurUOMI = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPosted = null;
    } else {
    this.fdtmPosted = new Timestamp(__dataIn.readLong());
    this.fdtmPosted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPostedEffectiveDate = null;
    } else {
    this.fdtmPostedEffectiveDate = new Timestamp(__dataIn.readLong());
    this.fdtmPostedEffectiveDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOwned = null;
    } else {
    this.fblnOwned = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTransferType = null;
    } else {
    this.flngTransferType = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTPAKeyTransfer = null;
    } else {
    this.flngTPAKeyTransfer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngWorkKey = null;
    } else {
    this.flngWorkKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnConverted = null;
    } else {
    this.fblnConverted = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngTPAKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTPAKey);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
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
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.flngUOMITransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngUOMITransKey);
    }
    if (null == this.fstrTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransfer);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fcurUOMI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUOMI, __dataOut);
    }
    if (null == this.fdtmPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPosted.getTime());
    __dataOut.writeInt(this.fdtmPosted.getNanos());
    }
    if (null == this.fdtmPostedEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPostedEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmPostedEffectiveDate.getNanos());
    }
    if (null == this.fblnOwned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOwned);
    }
    if (null == this.flngTransferType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransferType);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.flngTPAKeyTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTPAKeyTransfer);
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
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
    if (null == this.flngTPAKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTPAKey);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
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
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.flngUOMITransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngUOMITransKey);
    }
    if (null == this.fstrTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransfer);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fcurUOMI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUOMI, __dataOut);
    }
    if (null == this.fdtmPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPosted.getTime());
    __dataOut.writeInt(this.fdtmPosted.getNanos());
    }
    if (null == this.fdtmPostedEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPostedEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmPostedEffectiveDate.getNanos());
    }
    if (null == this.fblnOwned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOwned);
    }
    if (null == this.flngTransferType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransferType);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.flngTPAKeyTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTPAKeyTransfer);
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTPAKey==null?"\\N":"" + flngTPAKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngUOMITransKey==null?"\\N":"" + flngUOMITransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransfer==null?"\\N":fstrTransfer, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUOMI==null?"\\N":fcurUOMI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPosted==null?"\\N":"" + fdtmPosted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPostedEffectiveDate==null?"\\N":"" + fdtmPostedEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOwned==null?"\\N":"" + fblnOwned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransferType==null?"\\N":"" + flngTransferType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTPAKeyTransfer==null?"\\N":"" + flngTPAKeyTransfer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTPAKey==null?"\\N":"" + flngTPAKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngUOMITransKey==null?"\\N":"" + flngUOMITransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransfer==null?"\\N":fstrTransfer, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUOMI==null?"\\N":fcurUOMI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPosted==null?"\\N":"" + fdtmPosted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPostedEffectiveDate==null?"\\N":"" + fdtmPostedEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOwned==null?"\\N":"" + fblnOwned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransferType==null?"\\N":"" + flngTransferType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTPAKeyTransfer==null?"\\N":"" + flngTPAKeyTransfer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTPAKey = null; } else {
      this.flngTPAKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSequence = null; } else {
      this.flngSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngUOMITransKey = null; } else {
      this.flngUOMITransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransfer = null; } else {
      this.fstrTransfer = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUOMI = null; } else {
      this.fcurUOMI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPosted = null; } else {
      this.fdtmPosted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPostedEffectiveDate = null; } else {
      this.fdtmPostedEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOwned = null; } else {
      this.fblnOwned = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransferType = null; } else {
      this.flngTransferType = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTPAKeyTransfer = null; } else {
      this.flngTPAKeyTransfer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConverted = null; } else {
      this.fblnConverted = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTPAKey = null; } else {
      this.flngTPAKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSequence = null; } else {
      this.flngSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngUOMITransKey = null; } else {
      this.flngUOMITransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransfer = null; } else {
      this.fstrTransfer = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUOMI = null; } else {
      this.fcurUOMI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPosted = null; } else {
      this.fdtmPosted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPostedEffectiveDate = null; } else {
      this.fdtmPostedEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOwned = null; } else {
      this.fblnOwned = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransferType = null; } else {
      this.flngTransferType = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTPAKeyTransfer = null; } else {
      this.flngTPAKeyTransfer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConverted = null; } else {
      this.fblnConverted = Integer.valueOf(__cur_str);
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
    tblnz_tpatransferlog o = (tblnz_tpatransferlog) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmPosted = (o.fdtmPosted != null) ? (java.sql.Timestamp) o.fdtmPosted.clone() : null;
    o.fdtmPostedEffectiveDate = (o.fdtmPostedEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmPostedEffectiveDate.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_tpatransferlog o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmPosted = (o.fdtmPosted != null) ? (java.sql.Timestamp) o.fdtmPosted.clone() : null;
    o.fdtmPostedEffectiveDate = (o.fdtmPostedEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmPostedEffectiveDate.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngTPAKey", this.flngTPAKey);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("flngUOMITransKey", this.flngUOMITransKey);
    __sqoop$field_map.put("fstrTransfer", this.fstrTransfer);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fcurUOMI", this.fcurUOMI);
    __sqoop$field_map.put("fdtmPosted", this.fdtmPosted);
    __sqoop$field_map.put("fdtmPostedEffectiveDate", this.fdtmPostedEffectiveDate);
    __sqoop$field_map.put("fblnOwned", this.fblnOwned);
    __sqoop$field_map.put("flngTransferType", this.flngTransferType);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("flngTPAKeyTransfer", this.flngTPAKeyTransfer);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngTPAKey", this.flngTPAKey);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("flngUOMITransKey", this.flngUOMITransKey);
    __sqoop$field_map.put("fstrTransfer", this.fstrTransfer);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fcurUOMI", this.fcurUOMI);
    __sqoop$field_map.put("fdtmPosted", this.fdtmPosted);
    __sqoop$field_map.put("fdtmPostedEffectiveDate", this.fdtmPostedEffectiveDate);
    __sqoop$field_map.put("fblnOwned", this.fblnOwned);
    __sqoop$field_map.put("flngTransferType", this.flngTransferType);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("flngTPAKeyTransfer", this.flngTPAKeyTransfer);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
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
