// ORM class for table 'tblppicustomrate'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:59:03 NZDT 2020
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

public class tblppicustomrate extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCustomRateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.flngCustomRateKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngIndicatorKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.flngIndicatorKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngBillItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.flngBillItemKey = (Integer)value;
      }
    });
    setters.put("fstrCustomType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fstrCustomType = (String)value;
      }
    });
    setters.put("fdtmFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fdtmFrom = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fdtmTo = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdblRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fdblRate = (Double)value;
      }
    });
    setters.put("fdblDefinedRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fdblDefinedRate = (Double)value;
      }
    });
    setters.put("flngCRMKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.flngCRMKey = (Integer)value;
      }
    });
    setters.put("fstrComment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fstrComment = (String)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblppicustomrate.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblppicustomrate() {
    init0();
  }
  private Integer flngCustomRateKey;
  public Integer get_flngCustomRateKey() {
    return flngCustomRateKey;
  }
  public void set_flngCustomRateKey(Integer flngCustomRateKey) {
    this.flngCustomRateKey = flngCustomRateKey;
  }
  public tblppicustomrate with_flngCustomRateKey(Integer flngCustomRateKey) {
    this.flngCustomRateKey = flngCustomRateKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblppicustomrate with_flngVer(Integer flngVer) {
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
  public tblppicustomrate with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngIndicatorKey;
  public Integer get_flngIndicatorKey() {
    return flngIndicatorKey;
  }
  public void set_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
  }
  public tblppicustomrate with_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblppicustomrate with_flngAccountKey(Integer flngAccountKey) {
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
  public tblppicustomrate with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
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
  public tblppicustomrate with_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
    return this;
  }
  private String fstrCustomType;
  public String get_fstrCustomType() {
    return fstrCustomType;
  }
  public void set_fstrCustomType(String fstrCustomType) {
    this.fstrCustomType = fstrCustomType;
  }
  public tblppicustomrate with_fstrCustomType(String fstrCustomType) {
    this.fstrCustomType = fstrCustomType;
    return this;
  }
  private java.sql.Timestamp fdtmFrom;
  public java.sql.Timestamp get_fdtmFrom() {
    return fdtmFrom;
  }
  public void set_fdtmFrom(java.sql.Timestamp fdtmFrom) {
    this.fdtmFrom = fdtmFrom;
  }
  public tblppicustomrate with_fdtmFrom(java.sql.Timestamp fdtmFrom) {
    this.fdtmFrom = fdtmFrom;
    return this;
  }
  private java.sql.Timestamp fdtmTo;
  public java.sql.Timestamp get_fdtmTo() {
    return fdtmTo;
  }
  public void set_fdtmTo(java.sql.Timestamp fdtmTo) {
    this.fdtmTo = fdtmTo;
  }
  public tblppicustomrate with_fdtmTo(java.sql.Timestamp fdtmTo) {
    this.fdtmTo = fdtmTo;
    return this;
  }
  private Double fdblRate;
  public Double get_fdblRate() {
    return fdblRate;
  }
  public void set_fdblRate(Double fdblRate) {
    this.fdblRate = fdblRate;
  }
  public tblppicustomrate with_fdblRate(Double fdblRate) {
    this.fdblRate = fdblRate;
    return this;
  }
  private Double fdblDefinedRate;
  public Double get_fdblDefinedRate() {
    return fdblDefinedRate;
  }
  public void set_fdblDefinedRate(Double fdblDefinedRate) {
    this.fdblDefinedRate = fdblDefinedRate;
  }
  public tblppicustomrate with_fdblDefinedRate(Double fdblDefinedRate) {
    this.fdblDefinedRate = fdblDefinedRate;
    return this;
  }
  private Integer flngCRMKey;
  public Integer get_flngCRMKey() {
    return flngCRMKey;
  }
  public void set_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
  }
  public tblppicustomrate with_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
    return this;
  }
  private String fstrComment;
  public String get_fstrComment() {
    return fstrComment;
  }
  public void set_fstrComment(String fstrComment) {
    this.fstrComment = fstrComment;
  }
  public tblppicustomrate with_fstrComment(String fstrComment) {
    this.fstrComment = fstrComment;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblppicustomrate with_fblnActive(Integer fblnActive) {
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
  public tblppicustomrate with_fstrWho(String fstrWho) {
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
  public tblppicustomrate with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblppicustomrate)) {
      return false;
    }
    tblppicustomrate that = (tblppicustomrate) o;
    boolean equal = true;
    equal = equal && (this.flngCustomRateKey == null ? that.flngCustomRateKey == null : this.flngCustomRateKey.equals(that.flngCustomRateKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.fstrCustomType == null ? that.fstrCustomType == null : this.fstrCustomType.equals(that.fstrCustomType));
    equal = equal && (this.fdtmFrom == null ? that.fdtmFrom == null : this.fdtmFrom.equals(that.fdtmFrom));
    equal = equal && (this.fdtmTo == null ? that.fdtmTo == null : this.fdtmTo.equals(that.fdtmTo));
    equal = equal && (this.fdblRate == null ? that.fdblRate == null : this.fdblRate.equals(that.fdblRate));
    equal = equal && (this.fdblDefinedRate == null ? that.fdblDefinedRate == null : this.fdblDefinedRate.equals(that.fdblDefinedRate));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrComment == null ? that.fstrComment == null : this.fstrComment.equals(that.fstrComment));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblppicustomrate)) {
      return false;
    }
    tblppicustomrate that = (tblppicustomrate) o;
    boolean equal = true;
    equal = equal && (this.flngCustomRateKey == null ? that.flngCustomRateKey == null : this.flngCustomRateKey.equals(that.flngCustomRateKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.fstrCustomType == null ? that.fstrCustomType == null : this.fstrCustomType.equals(that.fstrCustomType));
    equal = equal && (this.fdtmFrom == null ? that.fdtmFrom == null : this.fdtmFrom.equals(that.fdtmFrom));
    equal = equal && (this.fdtmTo == null ? that.fdtmTo == null : this.fdtmTo.equals(that.fdtmTo));
    equal = equal && (this.fdblRate == null ? that.fdblRate == null : this.fdblRate.equals(that.fdblRate));
    equal = equal && (this.fdblDefinedRate == null ? that.fdblDefinedRate == null : this.fdblDefinedRate.equals(that.fdblDefinedRate));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrComment == null ? that.fstrComment == null : this.fstrComment.equals(that.fstrComment));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCustomRateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrCustomType = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmFrom = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmTo = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdblRate = JdbcWritableBridge.readDouble(11, __dbResults);
    this.fdblDefinedRate = JdbcWritableBridge.readDouble(12, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrComment = JdbcWritableBridge.readString(14, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCustomRateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrCustomType = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmFrom = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmTo = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdblRate = JdbcWritableBridge.readDouble(11, __dbResults);
    this.fdblDefinedRate = JdbcWritableBridge.readDouble(12, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrComment = JdbcWritableBridge.readString(14, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCustomRateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFrom, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTo, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblRate, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblDefinedRate, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrComment, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCustomRateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFrom, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTo, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblRate, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblDefinedRate, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrComment, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCustomRateKey = null;
    } else {
    this.flngCustomRateKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngIndicatorKey = null;
    } else {
    this.flngIndicatorKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngBillItemKey = null;
    } else {
    this.flngBillItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCustomType = null;
    } else {
    this.fstrCustomType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFrom = null;
    } else {
    this.fdtmFrom = new Timestamp(__dataIn.readLong());
    this.fdtmFrom.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmTo = null;
    } else {
    this.fdtmTo = new Timestamp(__dataIn.readLong());
    this.fdtmTo.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdblRate = null;
    } else {
    this.fdblRate = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.fdblDefinedRate = null;
    } else {
    this.fdblDefinedRate = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCRMKey = null;
    } else {
    this.flngCRMKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrComment = null;
    } else {
    this.fstrComment = Text.readString(__dataIn);
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
    if (null == this.flngCustomRateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomRateKey);
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
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
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
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.fstrCustomType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomType);
    }
    if (null == this.fdtmFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFrom.getTime());
    __dataOut.writeInt(this.fdtmFrom.getNanos());
    }
    if (null == this.fdtmTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTo.getTime());
    __dataOut.writeInt(this.fdtmTo.getNanos());
    }
    if (null == this.fdblRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblRate);
    }
    if (null == this.fdblDefinedRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblDefinedRate);
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
    }
    if (null == this.fstrComment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrComment);
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
    if (null == this.flngCustomRateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomRateKey);
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
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
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
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.fstrCustomType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomType);
    }
    if (null == this.fdtmFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFrom.getTime());
    __dataOut.writeInt(this.fdtmFrom.getNanos());
    }
    if (null == this.fdtmTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTo.getTime());
    __dataOut.writeInt(this.fdtmTo.getNanos());
    }
    if (null == this.fdblRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblRate);
    }
    if (null == this.fdblDefinedRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblDefinedRate);
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
    }
    if (null == this.fstrComment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrComment);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomRateKey==null?"\\N":"" + flngCustomRateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomType==null?"\\N":fstrCustomType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFrom==null?"\\N":"" + fdtmFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTo==null?"\\N":"" + fdtmTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblRate==null?"\\N":"" + fdblRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblDefinedRate==null?"\\N":"" + fdblDefinedRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrComment==null?"\\N":fstrComment, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomRateKey==null?"\\N":"" + flngCustomRateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomType==null?"\\N":fstrCustomType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFrom==null?"\\N":"" + fdtmFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTo==null?"\\N":"" + fdtmTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblRate==null?"\\N":"" + fdblRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblDefinedRate==null?"\\N":"" + fdblDefinedRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrComment==null?"\\N":fstrComment, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomRateKey = null; } else {
      this.flngCustomRateKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomType = null; } else {
      this.fstrCustomType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFrom = null; } else {
      this.fdtmFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTo = null; } else {
      this.fdtmTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblRate = null; } else {
      this.fdblRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblDefinedRate = null; } else {
      this.fdblDefinedRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCRMKey = null; } else {
      this.flngCRMKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrComment = null; } else {
      this.fstrComment = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomRateKey = null; } else {
      this.flngCustomRateKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomType = null; } else {
      this.fstrCustomType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFrom = null; } else {
      this.fdtmFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTo = null; } else {
      this.fdtmTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblRate = null; } else {
      this.fdblRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblDefinedRate = null; } else {
      this.fdblDefinedRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCRMKey = null; } else {
      this.flngCRMKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrComment = null; } else {
      this.fstrComment = __cur_str;
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
    tblppicustomrate o = (tblppicustomrate) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmFrom = (o.fdtmFrom != null) ? (java.sql.Timestamp) o.fdtmFrom.clone() : null;
    o.fdtmTo = (o.fdtmTo != null) ? (java.sql.Timestamp) o.fdtmTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblppicustomrate o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmFrom = (o.fdtmFrom != null) ? (java.sql.Timestamp) o.fdtmFrom.clone() : null;
    o.fdtmTo = (o.fdtmTo != null) ? (java.sql.Timestamp) o.fdtmTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCustomRateKey", this.flngCustomRateKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("fstrCustomType", this.fstrCustomType);
    __sqoop$field_map.put("fdtmFrom", this.fdtmFrom);
    __sqoop$field_map.put("fdtmTo", this.fdtmTo);
    __sqoop$field_map.put("fdblRate", this.fdblRate);
    __sqoop$field_map.put("fdblDefinedRate", this.fdblDefinedRate);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
    __sqoop$field_map.put("fstrComment", this.fstrComment);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCustomRateKey", this.flngCustomRateKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("fstrCustomType", this.fstrCustomType);
    __sqoop$field_map.put("fdtmFrom", this.fdtmFrom);
    __sqoop$field_map.put("fdtmTo", this.fdtmTo);
    __sqoop$field_map.put("fdblRate", this.fdblRate);
    __sqoop$field_map.put("fdblDefinedRate", this.fdblDefinedRate);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
    __sqoop$field_map.put("fstrComment", this.fstrComment);
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
