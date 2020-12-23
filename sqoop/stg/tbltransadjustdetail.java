// ORM class for table 'tbltransadjustdetail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:38:36 NZDT 2020
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

public class tbltransadjustdetail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.flngTransKey = (Integer)value;
      }
    });
    setters.put("fstrTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fstrTransType = (String)value;
      }
    });
    setters.put("fdtmEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fdtmEffect = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngAdjustKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.flngAdjustKey = (Integer)value;
      }
    });
    setters.put("fstrAdjustType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fstrAdjustType = (String)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngBillItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.flngBillItemKey = (Integer)value;
      }
    });
    setters.put("flngSourceTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.flngSourceTransKey = (Integer)value;
      }
    });
    setters.put("fstrSourceTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fstrSourceTransType = (String)value;
      }
    });
    setters.put("fdtmSourceEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fdtmSourceEffect = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurPosted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fcurPosted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmPosted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fdtmPosted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fcurReversed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustdetail.this.fstrWho = (String)value;
      }
    });
  }
  public tbltransadjustdetail() {
    init0();
  }
  private Integer flngTransKey;
  public Integer get_flngTransKey() {
    return flngTransKey;
  }
  public void set_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
  }
  public tbltransadjustdetail with_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
    return this;
  }
  private String fstrTransType;
  public String get_fstrTransType() {
    return fstrTransType;
  }
  public void set_fstrTransType(String fstrTransType) {
    this.fstrTransType = fstrTransType;
  }
  public tbltransadjustdetail with_fstrTransType(String fstrTransType) {
    this.fstrTransType = fstrTransType;
    return this;
  }
  private java.sql.Timestamp fdtmEffect;
  public java.sql.Timestamp get_fdtmEffect() {
    return fdtmEffect;
  }
  public void set_fdtmEffect(java.sql.Timestamp fdtmEffect) {
    this.fdtmEffect = fdtmEffect;
  }
  public tbltransadjustdetail with_fdtmEffect(java.sql.Timestamp fdtmEffect) {
    this.fdtmEffect = fdtmEffect;
    return this;
  }
  private Integer flngAdjustKey;
  public Integer get_flngAdjustKey() {
    return flngAdjustKey;
  }
  public void set_flngAdjustKey(Integer flngAdjustKey) {
    this.flngAdjustKey = flngAdjustKey;
  }
  public tbltransadjustdetail with_flngAdjustKey(Integer flngAdjustKey) {
    this.flngAdjustKey = flngAdjustKey;
    return this;
  }
  private String fstrAdjustType;
  public String get_fstrAdjustType() {
    return fstrAdjustType;
  }
  public void set_fstrAdjustType(String fstrAdjustType) {
    this.fstrAdjustType = fstrAdjustType;
  }
  public tbltransadjustdetail with_fstrAdjustType(String fstrAdjustType) {
    this.fstrAdjustType = fstrAdjustType;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tbltransadjustdetail with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tbltransadjustdetail with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tbltransadjustdetail with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngBillItemKey;
  public Integer get_flngBillItemKey() {
    return flngBillItemKey;
  }
  public void set_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
  }
  public tbltransadjustdetail with_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
    return this;
  }
  private Integer flngSourceTransKey;
  public Integer get_flngSourceTransKey() {
    return flngSourceTransKey;
  }
  public void set_flngSourceTransKey(Integer flngSourceTransKey) {
    this.flngSourceTransKey = flngSourceTransKey;
  }
  public tbltransadjustdetail with_flngSourceTransKey(Integer flngSourceTransKey) {
    this.flngSourceTransKey = flngSourceTransKey;
    return this;
  }
  private String fstrSourceTransType;
  public String get_fstrSourceTransType() {
    return fstrSourceTransType;
  }
  public void set_fstrSourceTransType(String fstrSourceTransType) {
    this.fstrSourceTransType = fstrSourceTransType;
  }
  public tbltransadjustdetail with_fstrSourceTransType(String fstrSourceTransType) {
    this.fstrSourceTransType = fstrSourceTransType;
    return this;
  }
  private java.sql.Timestamp fdtmSourceEffect;
  public java.sql.Timestamp get_fdtmSourceEffect() {
    return fdtmSourceEffect;
  }
  public void set_fdtmSourceEffect(java.sql.Timestamp fdtmSourceEffect) {
    this.fdtmSourceEffect = fdtmSourceEffect;
  }
  public tbltransadjustdetail with_fdtmSourceEffect(java.sql.Timestamp fdtmSourceEffect) {
    this.fdtmSourceEffect = fdtmSourceEffect;
    return this;
  }
  private java.math.BigDecimal fcurPosted;
  public java.math.BigDecimal get_fcurPosted() {
    return fcurPosted;
  }
  public void set_fcurPosted(java.math.BigDecimal fcurPosted) {
    this.fcurPosted = fcurPosted;
  }
  public tbltransadjustdetail with_fcurPosted(java.math.BigDecimal fcurPosted) {
    this.fcurPosted = fcurPosted;
    return this;
  }
  private java.sql.Timestamp fdtmPosted;
  public java.sql.Timestamp get_fdtmPosted() {
    return fdtmPosted;
  }
  public void set_fdtmPosted(java.sql.Timestamp fdtmPosted) {
    this.fdtmPosted = fdtmPosted;
  }
  public tbltransadjustdetail with_fdtmPosted(java.sql.Timestamp fdtmPosted) {
    this.fdtmPosted = fdtmPosted;
    return this;
  }
  private java.math.BigDecimal fcurReversed;
  public java.math.BigDecimal get_fcurReversed() {
    return fcurReversed;
  }
  public void set_fcurReversed(java.math.BigDecimal fcurReversed) {
    this.fcurReversed = fcurReversed;
  }
  public tbltransadjustdetail with_fcurReversed(java.math.BigDecimal fcurReversed) {
    this.fcurReversed = fcurReversed;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tbltransadjustdetail with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tbltransadjustdetail with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tbltransadjustdetail with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltransadjustdetail)) {
      return false;
    }
    tbltransadjustdetail that = (tbltransadjustdetail) o;
    boolean equal = true;
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.fstrTransType == null ? that.fstrTransType == null : this.fstrTransType.equals(that.fstrTransType));
    equal = equal && (this.fdtmEffect == null ? that.fdtmEffect == null : this.fdtmEffect.equals(that.fdtmEffect));
    equal = equal && (this.flngAdjustKey == null ? that.flngAdjustKey == null : this.flngAdjustKey.equals(that.flngAdjustKey));
    equal = equal && (this.fstrAdjustType == null ? that.fstrAdjustType == null : this.fstrAdjustType.equals(that.fstrAdjustType));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.flngSourceTransKey == null ? that.flngSourceTransKey == null : this.flngSourceTransKey.equals(that.flngSourceTransKey));
    equal = equal && (this.fstrSourceTransType == null ? that.fstrSourceTransType == null : this.fstrSourceTransType.equals(that.fstrSourceTransType));
    equal = equal && (this.fdtmSourceEffect == null ? that.fdtmSourceEffect == null : this.fdtmSourceEffect.equals(that.fdtmSourceEffect));
    equal = equal && (this.fcurPosted == null ? that.fcurPosted == null : this.fcurPosted.equals(that.fcurPosted));
    equal = equal && (this.fdtmPosted == null ? that.fdtmPosted == null : this.fdtmPosted.equals(that.fdtmPosted));
    equal = equal && (this.fcurReversed == null ? that.fcurReversed == null : this.fcurReversed.equals(that.fcurReversed));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltransadjustdetail)) {
      return false;
    }
    tbltransadjustdetail that = (tbltransadjustdetail) o;
    boolean equal = true;
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.fstrTransType == null ? that.fstrTransType == null : this.fstrTransType.equals(that.fstrTransType));
    equal = equal && (this.fdtmEffect == null ? that.fdtmEffect == null : this.fdtmEffect.equals(that.fdtmEffect));
    equal = equal && (this.flngAdjustKey == null ? that.flngAdjustKey == null : this.flngAdjustKey.equals(that.flngAdjustKey));
    equal = equal && (this.fstrAdjustType == null ? that.fstrAdjustType == null : this.fstrAdjustType.equals(that.fstrAdjustType));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.flngSourceTransKey == null ? that.flngSourceTransKey == null : this.flngSourceTransKey.equals(that.flngSourceTransKey));
    equal = equal && (this.fstrSourceTransType == null ? that.fstrSourceTransType == null : this.fstrSourceTransType.equals(that.fstrSourceTransType));
    equal = equal && (this.fdtmSourceEffect == null ? that.fdtmSourceEffect == null : this.fdtmSourceEffect.equals(that.fdtmSourceEffect));
    equal = equal && (this.fcurPosted == null ? that.fcurPosted == null : this.fcurPosted.equals(that.fcurPosted));
    equal = equal && (this.fdtmPosted == null ? that.fdtmPosted == null : this.fdtmPosted.equals(that.fdtmPosted));
    equal = equal && (this.fcurReversed == null ? that.fcurReversed == null : this.fcurReversed.equals(that.fcurReversed));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngTransKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrTransType = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmEffect = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngAdjustKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrAdjustType = JdbcWritableBridge.readString(5, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngSourceTransKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrSourceTransType = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmSourceEffect = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurPosted = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fdtmPosted = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurReversed = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngTransKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrTransType = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmEffect = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngAdjustKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrAdjustType = JdbcWritableBridge.readString(5, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngSourceTransKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrSourceTransType = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmSourceEffect = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurPosted = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fdtmPosted = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurReversed = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngTransKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffect, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAdjustKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceTransKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceTransType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSourceEffect, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPosted, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPosted, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurReversed, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngTransKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffect, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAdjustKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceTransKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceTransType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSourceEffect, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPosted, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPosted, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurReversed, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngTransKey = null;
    } else {
    this.flngTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransType = null;
    } else {
    this.fstrTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffect = null;
    } else {
    this.fdtmEffect = new Timestamp(__dataIn.readLong());
    this.fdtmEffect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAdjustKey = null;
    } else {
    this.flngAdjustKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAdjustType = null;
    } else {
    this.fstrAdjustType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngBillItemKey = null;
    } else {
    this.flngBillItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSourceTransKey = null;
    } else {
    this.flngSourceTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceTransType = null;
    } else {
    this.fstrSourceTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSourceEffect = null;
    } else {
    this.fdtmSourceEffect = new Timestamp(__dataIn.readLong());
    this.fdtmSourceEffect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPosted = null;
    } else {
    this.fcurPosted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPosted = null;
    } else {
    this.fdtmPosted = new Timestamp(__dataIn.readLong());
    this.fdtmPosted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurReversed = null;
    } else {
    this.fcurReversed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.fstrTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransType);
    }
    if (null == this.fdtmEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffect.getTime());
    __dataOut.writeInt(this.fdtmEffect.getNanos());
    }
    if (null == this.flngAdjustKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAdjustKey);
    }
    if (null == this.fstrAdjustType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustType);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.flngSourceTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceTransKey);
    }
    if (null == this.fstrSourceTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceTransType);
    }
    if (null == this.fdtmSourceEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSourceEffect.getTime());
    __dataOut.writeInt(this.fdtmSourceEffect.getNanos());
    }
    if (null == this.fcurPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPosted, __dataOut);
    }
    if (null == this.fdtmPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPosted.getTime());
    __dataOut.writeInt(this.fdtmPosted.getNanos());
    }
    if (null == this.fcurReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurReversed, __dataOut);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.fstrTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransType);
    }
    if (null == this.fdtmEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffect.getTime());
    __dataOut.writeInt(this.fdtmEffect.getNanos());
    }
    if (null == this.flngAdjustKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAdjustKey);
    }
    if (null == this.fstrAdjustType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustType);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.flngSourceTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceTransKey);
    }
    if (null == this.fstrSourceTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceTransType);
    }
    if (null == this.fdtmSourceEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSourceEffect.getTime());
    __dataOut.writeInt(this.fdtmSourceEffect.getNanos());
    }
    if (null == this.fcurPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPosted, __dataOut);
    }
    if (null == this.fdtmPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPosted.getTime());
    __dataOut.writeInt(this.fdtmPosted.getNanos());
    }
    if (null == this.fcurReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurReversed, __dataOut);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransType==null?"\\N":fstrTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffect==null?"\\N":"" + fdtmEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAdjustKey==null?"\\N":"" + flngAdjustKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustType==null?"\\N":fstrAdjustType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceTransKey==null?"\\N":"" + flngSourceTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceTransType==null?"\\N":fstrSourceTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSourceEffect==null?"\\N":"" + fdtmSourceEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPosted==null?"\\N":fcurPosted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPosted==null?"\\N":"" + fdtmPosted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurReversed==null?"\\N":fcurReversed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransType==null?"\\N":fstrTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffect==null?"\\N":"" + fdtmEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAdjustKey==null?"\\N":"" + flngAdjustKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustType==null?"\\N":fstrAdjustType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceTransKey==null?"\\N":"" + flngSourceTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceTransType==null?"\\N":fstrSourceTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSourceEffect==null?"\\N":"" + fdtmSourceEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPosted==null?"\\N":fcurPosted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPosted==null?"\\N":"" + fdtmPosted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurReversed==null?"\\N":fcurReversed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransType = null; } else {
      this.fstrTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffect = null; } else {
      this.fdtmEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAdjustKey = null; } else {
      this.flngAdjustKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdjustType = null; } else {
      this.fstrAdjustType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceTransKey = null; } else {
      this.flngSourceTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceTransType = null; } else {
      this.fstrSourceTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSourceEffect = null; } else {
      this.fdtmSourceEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPosted = null; } else {
      this.fcurPosted = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurReversed = null; } else {
      this.fcurReversed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransType = null; } else {
      this.fstrTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffect = null; } else {
      this.fdtmEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAdjustKey = null; } else {
      this.flngAdjustKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdjustType = null; } else {
      this.fstrAdjustType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceTransKey = null; } else {
      this.flngSourceTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceTransType = null; } else {
      this.fstrSourceTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSourceEffect = null; } else {
      this.fdtmSourceEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPosted = null; } else {
      this.fcurPosted = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurReversed = null; } else {
      this.fcurReversed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tbltransadjustdetail o = (tbltransadjustdetail) super.clone();
    o.fdtmEffect = (o.fdtmEffect != null) ? (java.sql.Timestamp) o.fdtmEffect.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmSourceEffect = (o.fdtmSourceEffect != null) ? (java.sql.Timestamp) o.fdtmSourceEffect.clone() : null;
    o.fdtmPosted = (o.fdtmPosted != null) ? (java.sql.Timestamp) o.fdtmPosted.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tbltransadjustdetail o) throws CloneNotSupportedException {
    o.fdtmEffect = (o.fdtmEffect != null) ? (java.sql.Timestamp) o.fdtmEffect.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmSourceEffect = (o.fdtmSourceEffect != null) ? (java.sql.Timestamp) o.fdtmSourceEffect.clone() : null;
    o.fdtmPosted = (o.fdtmPosted != null) ? (java.sql.Timestamp) o.fdtmPosted.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("fstrTransType", this.fstrTransType);
    __sqoop$field_map.put("fdtmEffect", this.fdtmEffect);
    __sqoop$field_map.put("flngAdjustKey", this.flngAdjustKey);
    __sqoop$field_map.put("fstrAdjustType", this.fstrAdjustType);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("flngSourceTransKey", this.flngSourceTransKey);
    __sqoop$field_map.put("fstrSourceTransType", this.fstrSourceTransType);
    __sqoop$field_map.put("fdtmSourceEffect", this.fdtmSourceEffect);
    __sqoop$field_map.put("fcurPosted", this.fcurPosted);
    __sqoop$field_map.put("fdtmPosted", this.fdtmPosted);
    __sqoop$field_map.put("fcurReversed", this.fcurReversed);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("fstrTransType", this.fstrTransType);
    __sqoop$field_map.put("fdtmEffect", this.fdtmEffect);
    __sqoop$field_map.put("flngAdjustKey", this.flngAdjustKey);
    __sqoop$field_map.put("fstrAdjustType", this.fstrAdjustType);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("flngSourceTransKey", this.flngSourceTransKey);
    __sqoop$field_map.put("fstrSourceTransType", this.fstrSourceTransType);
    __sqoop$field_map.put("fdtmSourceEffect", this.fdtmSourceEffect);
    __sqoop$field_map.put("fcurPosted", this.fcurPosted);
    __sqoop$field_map.put("fdtmPosted", this.fdtmPosted);
    __sqoop$field_map.put("fcurReversed", this.fcurReversed);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
