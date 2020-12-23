// ORM class for table 'tblnz_rtngsd'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:30:07 NZDT 2020
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

public class tblnz_rtngsd extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrFilingFreq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fstrFilingFreq = (String)value;
      }
    });
    setters.put("fstrRegistrationNo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fstrRegistrationNo = (String)value;
      }
    });
    setters.put("fstrSourceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fstrSourceType = (String)value;
      }
    });
    setters.put("fstrSoldFirstname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fstrSoldFirstname = (String)value;
      }
    });
    setters.put("fstrSoldFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fstrSoldFamilyName = (String)value;
      }
    });
    setters.put("fstrBusinessName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fstrBusinessName = (String)value;
      }
    });
    setters.put("fstrSoldRegistration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fstrSoldRegistration = (String)value;
      }
    });
    setters.put("fcurTotalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fcurTotalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGSTPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fcurGSTPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngsd.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtngsd() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtngsd with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_rtngsd with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrFilingFreq;
  public String get_fstrFilingFreq() {
    return fstrFilingFreq;
  }
  public void set_fstrFilingFreq(String fstrFilingFreq) {
    this.fstrFilingFreq = fstrFilingFreq;
  }
  public tblnz_rtngsd with_fstrFilingFreq(String fstrFilingFreq) {
    this.fstrFilingFreq = fstrFilingFreq;
    return this;
  }
  private String fstrRegistrationNo;
  public String get_fstrRegistrationNo() {
    return fstrRegistrationNo;
  }
  public void set_fstrRegistrationNo(String fstrRegistrationNo) {
    this.fstrRegistrationNo = fstrRegistrationNo;
  }
  public tblnz_rtngsd with_fstrRegistrationNo(String fstrRegistrationNo) {
    this.fstrRegistrationNo = fstrRegistrationNo;
    return this;
  }
  private String fstrSourceType;
  public String get_fstrSourceType() {
    return fstrSourceType;
  }
  public void set_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
  }
  public tblnz_rtngsd with_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
    return this;
  }
  private String fstrSoldFirstname;
  public String get_fstrSoldFirstname() {
    return fstrSoldFirstname;
  }
  public void set_fstrSoldFirstname(String fstrSoldFirstname) {
    this.fstrSoldFirstname = fstrSoldFirstname;
  }
  public tblnz_rtngsd with_fstrSoldFirstname(String fstrSoldFirstname) {
    this.fstrSoldFirstname = fstrSoldFirstname;
    return this;
  }
  private String fstrSoldFamilyName;
  public String get_fstrSoldFamilyName() {
    return fstrSoldFamilyName;
  }
  public void set_fstrSoldFamilyName(String fstrSoldFamilyName) {
    this.fstrSoldFamilyName = fstrSoldFamilyName;
  }
  public tblnz_rtngsd with_fstrSoldFamilyName(String fstrSoldFamilyName) {
    this.fstrSoldFamilyName = fstrSoldFamilyName;
    return this;
  }
  private String fstrBusinessName;
  public String get_fstrBusinessName() {
    return fstrBusinessName;
  }
  public void set_fstrBusinessName(String fstrBusinessName) {
    this.fstrBusinessName = fstrBusinessName;
  }
  public tblnz_rtngsd with_fstrBusinessName(String fstrBusinessName) {
    this.fstrBusinessName = fstrBusinessName;
    return this;
  }
  private String fstrSoldRegistration;
  public String get_fstrSoldRegistration() {
    return fstrSoldRegistration;
  }
  public void set_fstrSoldRegistration(String fstrSoldRegistration) {
    this.fstrSoldRegistration = fstrSoldRegistration;
  }
  public tblnz_rtngsd with_fstrSoldRegistration(String fstrSoldRegistration) {
    this.fstrSoldRegistration = fstrSoldRegistration;
    return this;
  }
  private java.math.BigDecimal fcurTotalSales;
  public java.math.BigDecimal get_fcurTotalSales() {
    return fcurTotalSales;
  }
  public void set_fcurTotalSales(java.math.BigDecimal fcurTotalSales) {
    this.fcurTotalSales = fcurTotalSales;
  }
  public tblnz_rtngsd with_fcurTotalSales(java.math.BigDecimal fcurTotalSales) {
    this.fcurTotalSales = fcurTotalSales;
    return this;
  }
  private java.math.BigDecimal fcurGSTPayable;
  public java.math.BigDecimal get_fcurGSTPayable() {
    return fcurGSTPayable;
  }
  public void set_fcurGSTPayable(java.math.BigDecimal fcurGSTPayable) {
    this.fcurGSTPayable = fcurGSTPayable;
  }
  public tblnz_rtngsd with_fcurGSTPayable(java.math.BigDecimal fcurGSTPayable) {
    this.fcurGSTPayable = fcurGSTPayable;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtngsd with_fstrWho(String fstrWho) {
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
  public tblnz_rtngsd with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtngsd)) {
      return false;
    }
    tblnz_rtngsd that = (tblnz_rtngsd) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrFilingFreq == null ? that.fstrFilingFreq == null : this.fstrFilingFreq.equals(that.fstrFilingFreq));
    equal = equal && (this.fstrRegistrationNo == null ? that.fstrRegistrationNo == null : this.fstrRegistrationNo.equals(that.fstrRegistrationNo));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fstrSoldFirstname == null ? that.fstrSoldFirstname == null : this.fstrSoldFirstname.equals(that.fstrSoldFirstname));
    equal = equal && (this.fstrSoldFamilyName == null ? that.fstrSoldFamilyName == null : this.fstrSoldFamilyName.equals(that.fstrSoldFamilyName));
    equal = equal && (this.fstrBusinessName == null ? that.fstrBusinessName == null : this.fstrBusinessName.equals(that.fstrBusinessName));
    equal = equal && (this.fstrSoldRegistration == null ? that.fstrSoldRegistration == null : this.fstrSoldRegistration.equals(that.fstrSoldRegistration));
    equal = equal && (this.fcurTotalSales == null ? that.fcurTotalSales == null : this.fcurTotalSales.equals(that.fcurTotalSales));
    equal = equal && (this.fcurGSTPayable == null ? that.fcurGSTPayable == null : this.fcurGSTPayable.equals(that.fcurGSTPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtngsd)) {
      return false;
    }
    tblnz_rtngsd that = (tblnz_rtngsd) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrFilingFreq == null ? that.fstrFilingFreq == null : this.fstrFilingFreq.equals(that.fstrFilingFreq));
    equal = equal && (this.fstrRegistrationNo == null ? that.fstrRegistrationNo == null : this.fstrRegistrationNo.equals(that.fstrRegistrationNo));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fstrSoldFirstname == null ? that.fstrSoldFirstname == null : this.fstrSoldFirstname.equals(that.fstrSoldFirstname));
    equal = equal && (this.fstrSoldFamilyName == null ? that.fstrSoldFamilyName == null : this.fstrSoldFamilyName.equals(that.fstrSoldFamilyName));
    equal = equal && (this.fstrBusinessName == null ? that.fstrBusinessName == null : this.fstrBusinessName.equals(that.fstrBusinessName));
    equal = equal && (this.fstrSoldRegistration == null ? that.fstrSoldRegistration == null : this.fstrSoldRegistration.equals(that.fstrSoldRegistration));
    equal = equal && (this.fcurTotalSales == null ? that.fcurTotalSales == null : this.fcurTotalSales.equals(that.fcurTotalSales));
    equal = equal && (this.fcurGSTPayable == null ? that.fcurGSTPayable == null : this.fcurGSTPayable.equals(that.fcurGSTPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fstrFilingFreq = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrRegistrationNo = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSoldFirstname = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrSoldFamilyName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrBusinessName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrSoldRegistration = JdbcWritableBridge.readString(9, __dbResults);
    this.fcurTotalSales = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurGSTPayable = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fstrFilingFreq = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrRegistrationNo = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSoldFirstname = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrSoldFamilyName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrBusinessName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrSoldRegistration = JdbcWritableBridge.readString(9, __dbResults);
    this.fcurTotalSales = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurGSTPayable = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(13, __dbResults);
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
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFreq, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegistrationNo, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoldFirstname, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoldFamilyName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBusinessName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoldRegistration, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSales, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGSTPayable, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFreq, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegistrationNo, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoldFirstname, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoldFamilyName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBusinessName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoldRegistration, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSales, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGSTPayable, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
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
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingFreq = null;
    } else {
    this.fstrFilingFreq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRegistrationNo = null;
    } else {
    this.fstrRegistrationNo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceType = null;
    } else {
    this.fstrSourceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoldFirstname = null;
    } else {
    this.fstrSoldFirstname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoldFamilyName = null;
    } else {
    this.fstrSoldFamilyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBusinessName = null;
    } else {
    this.fstrBusinessName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoldRegistration = null;
    } else {
    this.fstrSoldRegistration = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalSales = null;
    } else {
    this.fcurTotalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGSTPayable = null;
    } else {
    this.fcurGSTPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrFilingFreq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFreq);
    }
    if (null == this.fstrRegistrationNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegistrationNo);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fstrSoldFirstname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoldFirstname);
    }
    if (null == this.fstrSoldFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoldFamilyName);
    }
    if (null == this.fstrBusinessName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBusinessName);
    }
    if (null == this.fstrSoldRegistration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoldRegistration);
    }
    if (null == this.fcurTotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSales, __dataOut);
    }
    if (null == this.fcurGSTPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGSTPayable, __dataOut);
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
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrFilingFreq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFreq);
    }
    if (null == this.fstrRegistrationNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegistrationNo);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fstrSoldFirstname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoldFirstname);
    }
    if (null == this.fstrSoldFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoldFamilyName);
    }
    if (null == this.fstrBusinessName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBusinessName);
    }
    if (null == this.fstrSoldRegistration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoldRegistration);
    }
    if (null == this.fcurTotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSales, __dataOut);
    }
    if (null == this.fcurGSTPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGSTPayable, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFreq==null?"\\N":fstrFilingFreq, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegistrationNo==null?"\\N":fstrRegistrationNo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoldFirstname==null?"\\N":fstrSoldFirstname, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoldFamilyName==null?"\\N":fstrSoldFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBusinessName==null?"\\N":fstrBusinessName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoldRegistration==null?"\\N":fstrSoldRegistration, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSales==null?"\\N":fcurTotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGSTPayable==null?"\\N":fcurGSTPayable.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFreq==null?"\\N":fstrFilingFreq, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegistrationNo==null?"\\N":fstrRegistrationNo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoldFirstname==null?"\\N":fstrSoldFirstname, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoldFamilyName==null?"\\N":fstrSoldFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBusinessName==null?"\\N":fstrBusinessName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoldRegistration==null?"\\N":fstrSoldRegistration, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSales==null?"\\N":fcurTotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGSTPayable==null?"\\N":fcurGSTPayable.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFreq = null; } else {
      this.fstrFilingFreq = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRegistrationNo = null; } else {
      this.fstrRegistrationNo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoldFirstname = null; } else {
      this.fstrSoldFirstname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoldFamilyName = null; } else {
      this.fstrSoldFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBusinessName = null; } else {
      this.fstrBusinessName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoldRegistration = null; } else {
      this.fstrSoldRegistration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSales = null; } else {
      this.fcurTotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGSTPayable = null; } else {
      this.fcurGSTPayable = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFreq = null; } else {
      this.fstrFilingFreq = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRegistrationNo = null; } else {
      this.fstrRegistrationNo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoldFirstname = null; } else {
      this.fstrSoldFirstname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoldFamilyName = null; } else {
      this.fstrSoldFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBusinessName = null; } else {
      this.fstrBusinessName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoldRegistration = null; } else {
      this.fstrSoldRegistration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSales = null; } else {
      this.fcurTotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGSTPayable = null; } else {
      this.fcurGSTPayable = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtngsd o = (tblnz_rtngsd) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtngsd o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrFilingFreq", this.fstrFilingFreq);
    __sqoop$field_map.put("fstrRegistrationNo", this.fstrRegistrationNo);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fstrSoldFirstname", this.fstrSoldFirstname);
    __sqoop$field_map.put("fstrSoldFamilyName", this.fstrSoldFamilyName);
    __sqoop$field_map.put("fstrBusinessName", this.fstrBusinessName);
    __sqoop$field_map.put("fstrSoldRegistration", this.fstrSoldRegistration);
    __sqoop$field_map.put("fcurTotalSales", this.fcurTotalSales);
    __sqoop$field_map.put("fcurGSTPayable", this.fcurGSTPayable);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrFilingFreq", this.fstrFilingFreq);
    __sqoop$field_map.put("fstrRegistrationNo", this.fstrRegistrationNo);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fstrSoldFirstname", this.fstrSoldFirstname);
    __sqoop$field_map.put("fstrSoldFamilyName", this.fstrSoldFamilyName);
    __sqoop$field_map.put("fstrBusinessName", this.fstrBusinessName);
    __sqoop$field_map.put("fstrSoldRegistration", this.fstrSoldRegistration);
    __sqoop$field_map.put("fcurTotalSales", this.fcurTotalSales);
    __sqoop$field_map.put("fcurGSTPayable", this.fcurGSTPayable);
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
