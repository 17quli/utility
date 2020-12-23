// ORM class for table 'tblnz_msdwagesubsidy'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:47:40 NZDT 2020
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

public class tblnz_msdwagesubsidy extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64FileLoadItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fi64FileLoadItemKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fstrName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fstrName = (String)value;
      }
    });
    setters.put("fcurTotalAmountPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fcurTotalAmountPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmApplicationDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fdtmApplicationDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurTotalAmountRecovered", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fcurTotalAmountRecovered = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrRecoveryReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fstrRecoveryReason = (String)value;
      }
    });
    setters.put("fdtmRefundDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fdtmRefundDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurWageSubsidy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fcurWageSubsidy = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrRecordType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fstrRecordType = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_msdwagesubsidy.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_msdwagesubsidy() {
    init0();
  }
  private Long fi64FileLoadItemKey;
  public Long get_fi64FileLoadItemKey() {
    return fi64FileLoadItemKey;
  }
  public void set_fi64FileLoadItemKey(Long fi64FileLoadItemKey) {
    this.fi64FileLoadItemKey = fi64FileLoadItemKey;
  }
  public tblnz_msdwagesubsidy with_fi64FileLoadItemKey(Long fi64FileLoadItemKey) {
    this.fi64FileLoadItemKey = fi64FileLoadItemKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_msdwagesubsidy with_flngVer(Integer flngVer) {
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
  public tblnz_msdwagesubsidy with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrIRDNumber;
  public String get_fstrIRDNumber() {
    return fstrIRDNumber;
  }
  public void set_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
  }
  public tblnz_msdwagesubsidy with_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
    return this;
  }
  private String fstrName;
  public String get_fstrName() {
    return fstrName;
  }
  public void set_fstrName(String fstrName) {
    this.fstrName = fstrName;
  }
  public tblnz_msdwagesubsidy with_fstrName(String fstrName) {
    this.fstrName = fstrName;
    return this;
  }
  private java.math.BigDecimal fcurTotalAmountPaid;
  public java.math.BigDecimal get_fcurTotalAmountPaid() {
    return fcurTotalAmountPaid;
  }
  public void set_fcurTotalAmountPaid(java.math.BigDecimal fcurTotalAmountPaid) {
    this.fcurTotalAmountPaid = fcurTotalAmountPaid;
  }
  public tblnz_msdwagesubsidy with_fcurTotalAmountPaid(java.math.BigDecimal fcurTotalAmountPaid) {
    this.fcurTotalAmountPaid = fcurTotalAmountPaid;
    return this;
  }
  private java.sql.Timestamp fdtmApplicationDate;
  public java.sql.Timestamp get_fdtmApplicationDate() {
    return fdtmApplicationDate;
  }
  public void set_fdtmApplicationDate(java.sql.Timestamp fdtmApplicationDate) {
    this.fdtmApplicationDate = fdtmApplicationDate;
  }
  public tblnz_msdwagesubsidy with_fdtmApplicationDate(java.sql.Timestamp fdtmApplicationDate) {
    this.fdtmApplicationDate = fdtmApplicationDate;
    return this;
  }
  private java.math.BigDecimal fcurTotalAmountRecovered;
  public java.math.BigDecimal get_fcurTotalAmountRecovered() {
    return fcurTotalAmountRecovered;
  }
  public void set_fcurTotalAmountRecovered(java.math.BigDecimal fcurTotalAmountRecovered) {
    this.fcurTotalAmountRecovered = fcurTotalAmountRecovered;
  }
  public tblnz_msdwagesubsidy with_fcurTotalAmountRecovered(java.math.BigDecimal fcurTotalAmountRecovered) {
    this.fcurTotalAmountRecovered = fcurTotalAmountRecovered;
    return this;
  }
  private String fstrRecoveryReason;
  public String get_fstrRecoveryReason() {
    return fstrRecoveryReason;
  }
  public void set_fstrRecoveryReason(String fstrRecoveryReason) {
    this.fstrRecoveryReason = fstrRecoveryReason;
  }
  public tblnz_msdwagesubsidy with_fstrRecoveryReason(String fstrRecoveryReason) {
    this.fstrRecoveryReason = fstrRecoveryReason;
    return this;
  }
  private java.sql.Timestamp fdtmRefundDate;
  public java.sql.Timestamp get_fdtmRefundDate() {
    return fdtmRefundDate;
  }
  public void set_fdtmRefundDate(java.sql.Timestamp fdtmRefundDate) {
    this.fdtmRefundDate = fdtmRefundDate;
  }
  public tblnz_msdwagesubsidy with_fdtmRefundDate(java.sql.Timestamp fdtmRefundDate) {
    this.fdtmRefundDate = fdtmRefundDate;
    return this;
  }
  private java.math.BigDecimal fcurWageSubsidy;
  public java.math.BigDecimal get_fcurWageSubsidy() {
    return fcurWageSubsidy;
  }
  public void set_fcurWageSubsidy(java.math.BigDecimal fcurWageSubsidy) {
    this.fcurWageSubsidy = fcurWageSubsidy;
  }
  public tblnz_msdwagesubsidy with_fcurWageSubsidy(java.math.BigDecimal fcurWageSubsidy) {
    this.fcurWageSubsidy = fcurWageSubsidy;
    return this;
  }
  private String fstrRecordType;
  public String get_fstrRecordType() {
    return fstrRecordType;
  }
  public void set_fstrRecordType(String fstrRecordType) {
    this.fstrRecordType = fstrRecordType;
  }
  public tblnz_msdwagesubsidy with_fstrRecordType(String fstrRecordType) {
    this.fstrRecordType = fstrRecordType;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_msdwagesubsidy with_fstrWho(String fstrWho) {
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
  public tblnz_msdwagesubsidy with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_msdwagesubsidy)) {
      return false;
    }
    tblnz_msdwagesubsidy that = (tblnz_msdwagesubsidy) o;
    boolean equal = true;
    equal = equal && (this.fi64FileLoadItemKey == null ? that.fi64FileLoadItemKey == null : this.fi64FileLoadItemKey.equals(that.fi64FileLoadItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fcurTotalAmountPaid == null ? that.fcurTotalAmountPaid == null : this.fcurTotalAmountPaid.equals(that.fcurTotalAmountPaid));
    equal = equal && (this.fdtmApplicationDate == null ? that.fdtmApplicationDate == null : this.fdtmApplicationDate.equals(that.fdtmApplicationDate));
    equal = equal && (this.fcurTotalAmountRecovered == null ? that.fcurTotalAmountRecovered == null : this.fcurTotalAmountRecovered.equals(that.fcurTotalAmountRecovered));
    equal = equal && (this.fstrRecoveryReason == null ? that.fstrRecoveryReason == null : this.fstrRecoveryReason.equals(that.fstrRecoveryReason));
    equal = equal && (this.fdtmRefundDate == null ? that.fdtmRefundDate == null : this.fdtmRefundDate.equals(that.fdtmRefundDate));
    equal = equal && (this.fcurWageSubsidy == null ? that.fcurWageSubsidy == null : this.fcurWageSubsidy.equals(that.fcurWageSubsidy));
    equal = equal && (this.fstrRecordType == null ? that.fstrRecordType == null : this.fstrRecordType.equals(that.fstrRecordType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_msdwagesubsidy)) {
      return false;
    }
    tblnz_msdwagesubsidy that = (tblnz_msdwagesubsidy) o;
    boolean equal = true;
    equal = equal && (this.fi64FileLoadItemKey == null ? that.fi64FileLoadItemKey == null : this.fi64FileLoadItemKey.equals(that.fi64FileLoadItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fcurTotalAmountPaid == null ? that.fcurTotalAmountPaid == null : this.fcurTotalAmountPaid.equals(that.fcurTotalAmountPaid));
    equal = equal && (this.fdtmApplicationDate == null ? that.fdtmApplicationDate == null : this.fdtmApplicationDate.equals(that.fdtmApplicationDate));
    equal = equal && (this.fcurTotalAmountRecovered == null ? that.fcurTotalAmountRecovered == null : this.fcurTotalAmountRecovered.equals(that.fcurTotalAmountRecovered));
    equal = equal && (this.fstrRecoveryReason == null ? that.fstrRecoveryReason == null : this.fstrRecoveryReason.equals(that.fstrRecoveryReason));
    equal = equal && (this.fdtmRefundDate == null ? that.fdtmRefundDate == null : this.fdtmRefundDate.equals(that.fdtmRefundDate));
    equal = equal && (this.fcurWageSubsidy == null ? that.fcurWageSubsidy == null : this.fcurWageSubsidy.equals(that.fcurWageSubsidy));
    equal = equal && (this.fstrRecordType == null ? that.fstrRecordType == null : this.fstrRecordType.equals(that.fstrRecordType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64FileLoadItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(5, __dbResults);
    this.fcurTotalAmountPaid = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fdtmApplicationDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fcurTotalAmountRecovered = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrRecoveryReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmRefundDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurWageSubsidy = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fstrRecordType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64FileLoadItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(5, __dbResults);
    this.fcurTotalAmountPaid = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fdtmApplicationDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fcurTotalAmountRecovered = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrRecoveryReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmRefundDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurWageSubsidy = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fstrRecordType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64FileLoadItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmountPaid, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApplicationDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmountRecovered, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecoveryReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRefundDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWageSubsidy, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecordType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64FileLoadItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmountPaid, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApplicationDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmountRecovered, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecoveryReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRefundDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWageSubsidy, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecordType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64FileLoadItemKey = null;
    } else {
    this.fi64FileLoadItemKey = Long.valueOf(__dataIn.readLong());
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
        this.fstrIRDNumber = null;
    } else {
    this.fstrIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrName = null;
    } else {
    this.fstrName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalAmountPaid = null;
    } else {
    this.fcurTotalAmountPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApplicationDate = null;
    } else {
    this.fdtmApplicationDate = new Timestamp(__dataIn.readLong());
    this.fdtmApplicationDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalAmountRecovered = null;
    } else {
    this.fcurTotalAmountRecovered = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecoveryReason = null;
    } else {
    this.fstrRecoveryReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRefundDate = null;
    } else {
    this.fdtmRefundDate = new Timestamp(__dataIn.readLong());
    this.fdtmRefundDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurWageSubsidy = null;
    } else {
    this.fcurWageSubsidy = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecordType = null;
    } else {
    this.fstrRecordType = Text.readString(__dataIn);
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
    if (null == this.fi64FileLoadItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64FileLoadItemKey);
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
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fcurTotalAmountPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmountPaid, __dataOut);
    }
    if (null == this.fdtmApplicationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApplicationDate.getTime());
    __dataOut.writeInt(this.fdtmApplicationDate.getNanos());
    }
    if (null == this.fcurTotalAmountRecovered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmountRecovered, __dataOut);
    }
    if (null == this.fstrRecoveryReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecoveryReason);
    }
    if (null == this.fdtmRefundDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRefundDate.getTime());
    __dataOut.writeInt(this.fdtmRefundDate.getNanos());
    }
    if (null == this.fcurWageSubsidy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWageSubsidy, __dataOut);
    }
    if (null == this.fstrRecordType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecordType);
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
    if (null == this.fi64FileLoadItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64FileLoadItemKey);
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
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fcurTotalAmountPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmountPaid, __dataOut);
    }
    if (null == this.fdtmApplicationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApplicationDate.getTime());
    __dataOut.writeInt(this.fdtmApplicationDate.getNanos());
    }
    if (null == this.fcurTotalAmountRecovered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmountRecovered, __dataOut);
    }
    if (null == this.fstrRecoveryReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecoveryReason);
    }
    if (null == this.fdtmRefundDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRefundDate.getTime());
    __dataOut.writeInt(this.fdtmRefundDate.getNanos());
    }
    if (null == this.fcurWageSubsidy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWageSubsidy, __dataOut);
    }
    if (null == this.fstrRecordType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecordType);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64FileLoadItemKey==null?"\\N":"" + fi64FileLoadItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmountPaid==null?"\\N":fcurTotalAmountPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApplicationDate==null?"\\N":"" + fdtmApplicationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmountRecovered==null?"\\N":fcurTotalAmountRecovered.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecoveryReason==null?"\\N":fstrRecoveryReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRefundDate==null?"\\N":"" + fdtmRefundDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWageSubsidy==null?"\\N":fcurWageSubsidy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecordType==null?"\\N":fstrRecordType, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64FileLoadItemKey==null?"\\N":"" + fi64FileLoadItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmountPaid==null?"\\N":fcurTotalAmountPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApplicationDate==null?"\\N":"" + fdtmApplicationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmountRecovered==null?"\\N":fcurTotalAmountRecovered.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecoveryReason==null?"\\N":fstrRecoveryReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRefundDate==null?"\\N":"" + fdtmRefundDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWageSubsidy==null?"\\N":fcurWageSubsidy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecordType==null?"\\N":fstrRecordType, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64FileLoadItemKey = null; } else {
      this.fi64FileLoadItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmountPaid = null; } else {
      this.fcurTotalAmountPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApplicationDate = null; } else {
      this.fdtmApplicationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmountRecovered = null; } else {
      this.fcurTotalAmountRecovered = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecoveryReason = null; } else {
      this.fstrRecoveryReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRefundDate = null; } else {
      this.fdtmRefundDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWageSubsidy = null; } else {
      this.fcurWageSubsidy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecordType = null; } else {
      this.fstrRecordType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64FileLoadItemKey = null; } else {
      this.fi64FileLoadItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmountPaid = null; } else {
      this.fcurTotalAmountPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApplicationDate = null; } else {
      this.fdtmApplicationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmountRecovered = null; } else {
      this.fcurTotalAmountRecovered = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecoveryReason = null; } else {
      this.fstrRecoveryReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRefundDate = null; } else {
      this.fdtmRefundDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWageSubsidy = null; } else {
      this.fcurWageSubsidy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecordType = null; } else {
      this.fstrRecordType = __cur_str;
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
    tblnz_msdwagesubsidy o = (tblnz_msdwagesubsidy) super.clone();
    o.fdtmApplicationDate = (o.fdtmApplicationDate != null) ? (java.sql.Timestamp) o.fdtmApplicationDate.clone() : null;
    o.fdtmRefundDate = (o.fdtmRefundDate != null) ? (java.sql.Timestamp) o.fdtmRefundDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_msdwagesubsidy o) throws CloneNotSupportedException {
    o.fdtmApplicationDate = (o.fdtmApplicationDate != null) ? (java.sql.Timestamp) o.fdtmApplicationDate.clone() : null;
    o.fdtmRefundDate = (o.fdtmRefundDate != null) ? (java.sql.Timestamp) o.fdtmRefundDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64FileLoadItemKey", this.fi64FileLoadItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fcurTotalAmountPaid", this.fcurTotalAmountPaid);
    __sqoop$field_map.put("fdtmApplicationDate", this.fdtmApplicationDate);
    __sqoop$field_map.put("fcurTotalAmountRecovered", this.fcurTotalAmountRecovered);
    __sqoop$field_map.put("fstrRecoveryReason", this.fstrRecoveryReason);
    __sqoop$field_map.put("fdtmRefundDate", this.fdtmRefundDate);
    __sqoop$field_map.put("fcurWageSubsidy", this.fcurWageSubsidy);
    __sqoop$field_map.put("fstrRecordType", this.fstrRecordType);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64FileLoadItemKey", this.fi64FileLoadItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fcurTotalAmountPaid", this.fcurTotalAmountPaid);
    __sqoop$field_map.put("fdtmApplicationDate", this.fdtmApplicationDate);
    __sqoop$field_map.put("fcurTotalAmountRecovered", this.fcurTotalAmountRecovered);
    __sqoop$field_map.put("fstrRecoveryReason", this.fstrRecoveryReason);
    __sqoop$field_map.put("fdtmRefundDate", this.fdtmRefundDate);
    __sqoop$field_map.put("fcurWageSubsidy", this.fcurWageSubsidy);
    __sqoop$field_map.put("fstrRecordType", this.fstrRecordType);
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
