// ORM class for table 'tblnz_eotattributeshistory'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:51:04 NZDT 2020
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

public class tblnz_eotattributeshistory extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrEOTType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fstrEOTType = (String)value;
      }
    });
    setters.put("fstrStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fstrStatus = (String)value;
      }
    });
    setters.put("fblnWithdrawnForLfp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fblnWithdrawnForLfp = (Integer)value;
      }
    });
    setters.put("fblnManualOverride", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fblnManualOverride = (Integer)value;
      }
    });
    setters.put("fdtmDeferredDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fdtmDeferredDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmExtensionDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fdtmExtensionDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmTerminalTaxDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fdtmTerminalTaxDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_eotattributeshistory.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_eotattributeshistory() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_eotattributeshistory with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblnz_eotattributeshistory with_flngVerLast(Integer flngVerLast) {
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
  public tblnz_eotattributeshistory with_flngAccountKey(Integer flngAccountKey) {
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
  public tblnz_eotattributeshistory with_fstrAccountType(String fstrAccountType) {
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
  public tblnz_eotattributeshistory with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrEOTType;
  public String get_fstrEOTType() {
    return fstrEOTType;
  }
  public void set_fstrEOTType(String fstrEOTType) {
    this.fstrEOTType = fstrEOTType;
  }
  public tblnz_eotattributeshistory with_fstrEOTType(String fstrEOTType) {
    this.fstrEOTType = fstrEOTType;
    return this;
  }
  private String fstrStatus;
  public String get_fstrStatus() {
    return fstrStatus;
  }
  public void set_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
  }
  public tblnz_eotattributeshistory with_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
    return this;
  }
  private Integer fblnWithdrawnForLfp;
  public Integer get_fblnWithdrawnForLfp() {
    return fblnWithdrawnForLfp;
  }
  public void set_fblnWithdrawnForLfp(Integer fblnWithdrawnForLfp) {
    this.fblnWithdrawnForLfp = fblnWithdrawnForLfp;
  }
  public tblnz_eotattributeshistory with_fblnWithdrawnForLfp(Integer fblnWithdrawnForLfp) {
    this.fblnWithdrawnForLfp = fblnWithdrawnForLfp;
    return this;
  }
  private Integer fblnManualOverride;
  public Integer get_fblnManualOverride() {
    return fblnManualOverride;
  }
  public void set_fblnManualOverride(Integer fblnManualOverride) {
    this.fblnManualOverride = fblnManualOverride;
  }
  public tblnz_eotattributeshistory with_fblnManualOverride(Integer fblnManualOverride) {
    this.fblnManualOverride = fblnManualOverride;
    return this;
  }
  private java.sql.Timestamp fdtmDeferredDate;
  public java.sql.Timestamp get_fdtmDeferredDate() {
    return fdtmDeferredDate;
  }
  public void set_fdtmDeferredDate(java.sql.Timestamp fdtmDeferredDate) {
    this.fdtmDeferredDate = fdtmDeferredDate;
  }
  public tblnz_eotattributeshistory with_fdtmDeferredDate(java.sql.Timestamp fdtmDeferredDate) {
    this.fdtmDeferredDate = fdtmDeferredDate;
    return this;
  }
  private java.sql.Timestamp fdtmExtensionDate;
  public java.sql.Timestamp get_fdtmExtensionDate() {
    return fdtmExtensionDate;
  }
  public void set_fdtmExtensionDate(java.sql.Timestamp fdtmExtensionDate) {
    this.fdtmExtensionDate = fdtmExtensionDate;
  }
  public tblnz_eotattributeshistory with_fdtmExtensionDate(java.sql.Timestamp fdtmExtensionDate) {
    this.fdtmExtensionDate = fdtmExtensionDate;
    return this;
  }
  private java.sql.Timestamp fdtmTerminalTaxDue;
  public java.sql.Timestamp get_fdtmTerminalTaxDue() {
    return fdtmTerminalTaxDue;
  }
  public void set_fdtmTerminalTaxDue(java.sql.Timestamp fdtmTerminalTaxDue) {
    this.fdtmTerminalTaxDue = fdtmTerminalTaxDue;
  }
  public tblnz_eotattributeshistory with_fdtmTerminalTaxDue(java.sql.Timestamp fdtmTerminalTaxDue) {
    this.fdtmTerminalTaxDue = fdtmTerminalTaxDue;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_eotattributeshistory with_fstrWho(String fstrWho) {
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
  public tblnz_eotattributeshistory with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_eotattributeshistory)) {
      return false;
    }
    tblnz_eotattributeshistory that = (tblnz_eotattributeshistory) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrEOTType == null ? that.fstrEOTType == null : this.fstrEOTType.equals(that.fstrEOTType));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fblnWithdrawnForLfp == null ? that.fblnWithdrawnForLfp == null : this.fblnWithdrawnForLfp.equals(that.fblnWithdrawnForLfp));
    equal = equal && (this.fblnManualOverride == null ? that.fblnManualOverride == null : this.fblnManualOverride.equals(that.fblnManualOverride));
    equal = equal && (this.fdtmDeferredDate == null ? that.fdtmDeferredDate == null : this.fdtmDeferredDate.equals(that.fdtmDeferredDate));
    equal = equal && (this.fdtmExtensionDate == null ? that.fdtmExtensionDate == null : this.fdtmExtensionDate.equals(that.fdtmExtensionDate));
    equal = equal && (this.fdtmTerminalTaxDue == null ? that.fdtmTerminalTaxDue == null : this.fdtmTerminalTaxDue.equals(that.fdtmTerminalTaxDue));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_eotattributeshistory)) {
      return false;
    }
    tblnz_eotattributeshistory that = (tblnz_eotattributeshistory) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrEOTType == null ? that.fstrEOTType == null : this.fstrEOTType.equals(that.fstrEOTType));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fblnWithdrawnForLfp == null ? that.fblnWithdrawnForLfp == null : this.fblnWithdrawnForLfp.equals(that.fblnWithdrawnForLfp));
    equal = equal && (this.fblnManualOverride == null ? that.fblnManualOverride == null : this.fblnManualOverride.equals(that.fblnManualOverride));
    equal = equal && (this.fdtmDeferredDate == null ? that.fdtmDeferredDate == null : this.fdtmDeferredDate.equals(that.fdtmDeferredDate));
    equal = equal && (this.fdtmExtensionDate == null ? that.fdtmExtensionDate == null : this.fdtmExtensionDate.equals(that.fdtmExtensionDate));
    equal = equal && (this.fdtmTerminalTaxDue == null ? that.fdtmTerminalTaxDue == null : this.fdtmTerminalTaxDue.equals(that.fdtmTerminalTaxDue));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrEOTType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnWithdrawnForLfp = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnManualOverride = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmDeferredDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmExtensionDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmTerminalTaxDue = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrEOTType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnWithdrawnForLfp = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnManualOverride = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmDeferredDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmExtensionDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmTerminalTaxDue = JdbcWritableBridge.readTimestamp(12, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrEOTType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWithdrawnForLfp, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualOverride, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeferredDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExtensionDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTerminalTaxDue, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrEOTType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWithdrawnForLfp, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualOverride, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeferredDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExtensionDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTerminalTaxDue, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
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
        this.fstrEOTType = null;
    } else {
    this.fstrEOTType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStatus = null;
    } else {
    this.fstrStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnWithdrawnForLfp = null;
    } else {
    this.fblnWithdrawnForLfp = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnManualOverride = null;
    } else {
    this.fblnManualOverride = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDeferredDate = null;
    } else {
    this.fdtmDeferredDate = new Timestamp(__dataIn.readLong());
    this.fdtmDeferredDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmExtensionDate = null;
    } else {
    this.fdtmExtensionDate = new Timestamp(__dataIn.readLong());
    this.fdtmExtensionDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmTerminalTaxDue = null;
    } else {
    this.fdtmTerminalTaxDue = new Timestamp(__dataIn.readLong());
    this.fdtmTerminalTaxDue.setNanos(__dataIn.readInt());
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
    if (null == this.fstrEOTType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEOTType);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fblnWithdrawnForLfp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWithdrawnForLfp);
    }
    if (null == this.fblnManualOverride) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualOverride);
    }
    if (null == this.fdtmDeferredDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeferredDate.getTime());
    __dataOut.writeInt(this.fdtmDeferredDate.getNanos());
    }
    if (null == this.fdtmExtensionDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExtensionDate.getTime());
    __dataOut.writeInt(this.fdtmExtensionDate.getNanos());
    }
    if (null == this.fdtmTerminalTaxDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTerminalTaxDue.getTime());
    __dataOut.writeInt(this.fdtmTerminalTaxDue.getNanos());
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
    if (null == this.fstrEOTType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEOTType);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fblnWithdrawnForLfp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWithdrawnForLfp);
    }
    if (null == this.fblnManualOverride) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualOverride);
    }
    if (null == this.fdtmDeferredDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeferredDate.getTime());
    __dataOut.writeInt(this.fdtmDeferredDate.getNanos());
    }
    if (null == this.fdtmExtensionDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExtensionDate.getTime());
    __dataOut.writeInt(this.fdtmExtensionDate.getNanos());
    }
    if (null == this.fdtmTerminalTaxDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTerminalTaxDue.getTime());
    __dataOut.writeInt(this.fdtmTerminalTaxDue.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEOTType==null?"\\N":fstrEOTType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWithdrawnForLfp==null?"\\N":"" + fblnWithdrawnForLfp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualOverride==null?"\\N":"" + fblnManualOverride, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeferredDate==null?"\\N":"" + fdtmDeferredDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExtensionDate==null?"\\N":"" + fdtmExtensionDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTerminalTaxDue==null?"\\N":"" + fdtmTerminalTaxDue, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEOTType==null?"\\N":fstrEOTType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWithdrawnForLfp==null?"\\N":"" + fblnWithdrawnForLfp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualOverride==null?"\\N":"" + fblnManualOverride, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeferredDate==null?"\\N":"" + fdtmDeferredDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExtensionDate==null?"\\N":"" + fdtmExtensionDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTerminalTaxDue==null?"\\N":"" + fdtmTerminalTaxDue, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrEOTType = null; } else {
      this.fstrEOTType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWithdrawnForLfp = null; } else {
      this.fblnWithdrawnForLfp = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeferredDate = null; } else {
      this.fdtmDeferredDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExtensionDate = null; } else {
      this.fdtmExtensionDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTerminalTaxDue = null; } else {
      this.fdtmTerminalTaxDue = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrEOTType = null; } else {
      this.fstrEOTType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWithdrawnForLfp = null; } else {
      this.fblnWithdrawnForLfp = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeferredDate = null; } else {
      this.fdtmDeferredDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExtensionDate = null; } else {
      this.fdtmExtensionDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTerminalTaxDue = null; } else {
      this.fdtmTerminalTaxDue = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_eotattributeshistory o = (tblnz_eotattributeshistory) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDeferredDate = (o.fdtmDeferredDate != null) ? (java.sql.Timestamp) o.fdtmDeferredDate.clone() : null;
    o.fdtmExtensionDate = (o.fdtmExtensionDate != null) ? (java.sql.Timestamp) o.fdtmExtensionDate.clone() : null;
    o.fdtmTerminalTaxDue = (o.fdtmTerminalTaxDue != null) ? (java.sql.Timestamp) o.fdtmTerminalTaxDue.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_eotattributeshistory o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDeferredDate = (o.fdtmDeferredDate != null) ? (java.sql.Timestamp) o.fdtmDeferredDate.clone() : null;
    o.fdtmExtensionDate = (o.fdtmExtensionDate != null) ? (java.sql.Timestamp) o.fdtmExtensionDate.clone() : null;
    o.fdtmTerminalTaxDue = (o.fdtmTerminalTaxDue != null) ? (java.sql.Timestamp) o.fdtmTerminalTaxDue.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrEOTType", this.fstrEOTType);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fblnWithdrawnForLfp", this.fblnWithdrawnForLfp);
    __sqoop$field_map.put("fblnManualOverride", this.fblnManualOverride);
    __sqoop$field_map.put("fdtmDeferredDate", this.fdtmDeferredDate);
    __sqoop$field_map.put("fdtmExtensionDate", this.fdtmExtensionDate);
    __sqoop$field_map.put("fdtmTerminalTaxDue", this.fdtmTerminalTaxDue);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrEOTType", this.fstrEOTType);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fblnWithdrawnForLfp", this.fblnWithdrawnForLfp);
    __sqoop$field_map.put("fblnManualOverride", this.fblnManualOverride);
    __sqoop$field_map.put("fdtmDeferredDate", this.fdtmDeferredDate);
    __sqoop$field_map.put("fdtmExtensionDate", this.fdtmExtensionDate);
    __sqoop$field_map.put("fdtmTerminalTaxDue", this.fdtmTerminalTaxDue);
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
