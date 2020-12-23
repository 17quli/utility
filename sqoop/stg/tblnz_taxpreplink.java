// ORM class for table 'tblnz_taxpreplink'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:49:33 NZDT 2020
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

public class tblnz_taxpreplink extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngFromCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.flngFromCustomerKey = (Integer)value;
      }
    });
    setters.put("flngLinkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.flngLinkKey = (Integer)value;
      }
    });
    setters.put("fintFromProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fintFromProfileNumber = (Integer)value;
      }
    });
    setters.put("flngFromAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.flngFromAccountKey = (Integer)value;
      }
    });
    setters.put("flngToCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.flngToCustomerKey = (Integer)value;
      }
    });
    setters.put("fintToProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fintToProfileNumber = (Integer)value;
      }
    });
    setters.put("flngToAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.flngToAccountKey = (Integer)value;
      }
    });
    setters.put("fstrLinkType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fstrLinkType = (String)value;
      }
    });
    setters.put("fblnMailRedirect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fblnMailRedirect = (Integer)value;
      }
    });
    setters.put("fblnDisbursementRedirect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fblnDisbursementRedirect = (Integer)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_taxpreplink.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_taxpreplink() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_taxpreplink with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngFromCustomerKey;
  public Integer get_flngFromCustomerKey() {
    return flngFromCustomerKey;
  }
  public void set_flngFromCustomerKey(Integer flngFromCustomerKey) {
    this.flngFromCustomerKey = flngFromCustomerKey;
  }
  public tblnz_taxpreplink with_flngFromCustomerKey(Integer flngFromCustomerKey) {
    this.flngFromCustomerKey = flngFromCustomerKey;
    return this;
  }
  private Integer flngLinkKey;
  public Integer get_flngLinkKey() {
    return flngLinkKey;
  }
  public void set_flngLinkKey(Integer flngLinkKey) {
    this.flngLinkKey = flngLinkKey;
  }
  public tblnz_taxpreplink with_flngLinkKey(Integer flngLinkKey) {
    this.flngLinkKey = flngLinkKey;
    return this;
  }
  private Integer fintFromProfileNumber;
  public Integer get_fintFromProfileNumber() {
    return fintFromProfileNumber;
  }
  public void set_fintFromProfileNumber(Integer fintFromProfileNumber) {
    this.fintFromProfileNumber = fintFromProfileNumber;
  }
  public tblnz_taxpreplink with_fintFromProfileNumber(Integer fintFromProfileNumber) {
    this.fintFromProfileNumber = fintFromProfileNumber;
    return this;
  }
  private Integer flngFromAccountKey;
  public Integer get_flngFromAccountKey() {
    return flngFromAccountKey;
  }
  public void set_flngFromAccountKey(Integer flngFromAccountKey) {
    this.flngFromAccountKey = flngFromAccountKey;
  }
  public tblnz_taxpreplink with_flngFromAccountKey(Integer flngFromAccountKey) {
    this.flngFromAccountKey = flngFromAccountKey;
    return this;
  }
  private Integer flngToCustomerKey;
  public Integer get_flngToCustomerKey() {
    return flngToCustomerKey;
  }
  public void set_flngToCustomerKey(Integer flngToCustomerKey) {
    this.flngToCustomerKey = flngToCustomerKey;
  }
  public tblnz_taxpreplink with_flngToCustomerKey(Integer flngToCustomerKey) {
    this.flngToCustomerKey = flngToCustomerKey;
    return this;
  }
  private Integer fintToProfileNumber;
  public Integer get_fintToProfileNumber() {
    return fintToProfileNumber;
  }
  public void set_fintToProfileNumber(Integer fintToProfileNumber) {
    this.fintToProfileNumber = fintToProfileNumber;
  }
  public tblnz_taxpreplink with_fintToProfileNumber(Integer fintToProfileNumber) {
    this.fintToProfileNumber = fintToProfileNumber;
    return this;
  }
  private Integer flngToAccountKey;
  public Integer get_flngToAccountKey() {
    return flngToAccountKey;
  }
  public void set_flngToAccountKey(Integer flngToAccountKey) {
    this.flngToAccountKey = flngToAccountKey;
  }
  public tblnz_taxpreplink with_flngToAccountKey(Integer flngToAccountKey) {
    this.flngToAccountKey = flngToAccountKey;
    return this;
  }
  private String fstrLinkType;
  public String get_fstrLinkType() {
    return fstrLinkType;
  }
  public void set_fstrLinkType(String fstrLinkType) {
    this.fstrLinkType = fstrLinkType;
  }
  public tblnz_taxpreplink with_fstrLinkType(String fstrLinkType) {
    this.fstrLinkType = fstrLinkType;
    return this;
  }
  private Integer fblnMailRedirect;
  public Integer get_fblnMailRedirect() {
    return fblnMailRedirect;
  }
  public void set_fblnMailRedirect(Integer fblnMailRedirect) {
    this.fblnMailRedirect = fblnMailRedirect;
  }
  public tblnz_taxpreplink with_fblnMailRedirect(Integer fblnMailRedirect) {
    this.fblnMailRedirect = fblnMailRedirect;
    return this;
  }
  private Integer fblnDisbursementRedirect;
  public Integer get_fblnDisbursementRedirect() {
    return fblnDisbursementRedirect;
  }
  public void set_fblnDisbursementRedirect(Integer fblnDisbursementRedirect) {
    this.fblnDisbursementRedirect = fblnDisbursementRedirect;
  }
  public tblnz_taxpreplink with_fblnDisbursementRedirect(Integer fblnDisbursementRedirect) {
    this.fblnDisbursementRedirect = fblnDisbursementRedirect;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tblnz_taxpreplink with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
    return this;
  }
  private java.sql.Timestamp fdtmCease;
  public java.sql.Timestamp get_fdtmCease() {
    return fdtmCease;
  }
  public void set_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
  }
  public tblnz_taxpreplink with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblnz_taxpreplink with_fblnActive(Integer fblnActive) {
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
  public tblnz_taxpreplink with_fstrWho(String fstrWho) {
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
  public tblnz_taxpreplink with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_taxpreplink)) {
      return false;
    }
    tblnz_taxpreplink that = (tblnz_taxpreplink) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngFromCustomerKey == null ? that.flngFromCustomerKey == null : this.flngFromCustomerKey.equals(that.flngFromCustomerKey));
    equal = equal && (this.flngLinkKey == null ? that.flngLinkKey == null : this.flngLinkKey.equals(that.flngLinkKey));
    equal = equal && (this.fintFromProfileNumber == null ? that.fintFromProfileNumber == null : this.fintFromProfileNumber.equals(that.fintFromProfileNumber));
    equal = equal && (this.flngFromAccountKey == null ? that.flngFromAccountKey == null : this.flngFromAccountKey.equals(that.flngFromAccountKey));
    equal = equal && (this.flngToCustomerKey == null ? that.flngToCustomerKey == null : this.flngToCustomerKey.equals(that.flngToCustomerKey));
    equal = equal && (this.fintToProfileNumber == null ? that.fintToProfileNumber == null : this.fintToProfileNumber.equals(that.fintToProfileNumber));
    equal = equal && (this.flngToAccountKey == null ? that.flngToAccountKey == null : this.flngToAccountKey.equals(that.flngToAccountKey));
    equal = equal && (this.fstrLinkType == null ? that.fstrLinkType == null : this.fstrLinkType.equals(that.fstrLinkType));
    equal = equal && (this.fblnMailRedirect == null ? that.fblnMailRedirect == null : this.fblnMailRedirect.equals(that.fblnMailRedirect));
    equal = equal && (this.fblnDisbursementRedirect == null ? that.fblnDisbursementRedirect == null : this.fblnDisbursementRedirect.equals(that.fblnDisbursementRedirect));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_taxpreplink)) {
      return false;
    }
    tblnz_taxpreplink that = (tblnz_taxpreplink) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngFromCustomerKey == null ? that.flngFromCustomerKey == null : this.flngFromCustomerKey.equals(that.flngFromCustomerKey));
    equal = equal && (this.flngLinkKey == null ? that.flngLinkKey == null : this.flngLinkKey.equals(that.flngLinkKey));
    equal = equal && (this.fintFromProfileNumber == null ? that.fintFromProfileNumber == null : this.fintFromProfileNumber.equals(that.fintFromProfileNumber));
    equal = equal && (this.flngFromAccountKey == null ? that.flngFromAccountKey == null : this.flngFromAccountKey.equals(that.flngFromAccountKey));
    equal = equal && (this.flngToCustomerKey == null ? that.flngToCustomerKey == null : this.flngToCustomerKey.equals(that.flngToCustomerKey));
    equal = equal && (this.fintToProfileNumber == null ? that.fintToProfileNumber == null : this.fintToProfileNumber.equals(that.fintToProfileNumber));
    equal = equal && (this.flngToAccountKey == null ? that.flngToAccountKey == null : this.flngToAccountKey.equals(that.flngToAccountKey));
    equal = equal && (this.fstrLinkType == null ? that.fstrLinkType == null : this.fstrLinkType.equals(that.fstrLinkType));
    equal = equal && (this.fblnMailRedirect == null ? that.fblnMailRedirect == null : this.fblnMailRedirect.equals(that.fblnMailRedirect));
    equal = equal && (this.fblnDisbursementRedirect == null ? that.fblnDisbursementRedirect == null : this.fblnDisbursementRedirect.equals(that.fblnDisbursementRedirect));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngFromCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngLinkKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintFromProfileNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngFromAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngToCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintToProfileNumber = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngToAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrLinkType = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnMailRedirect = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnDisbursementRedirect = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngFromCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngLinkKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintFromProfileNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngFromAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngToCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintToProfileNumber = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngToAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrLinkType = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnMailRedirect = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnDisbursementRedirect = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngFromCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngLinkKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFromProfileNumber, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFromAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngToCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintToProfileNumber, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngToAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMailRedirect, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDisbursementRedirect, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFromCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngLinkKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFromProfileNumber, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFromAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngToCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintToProfileNumber, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngToAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMailRedirect, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDisbursementRedirect, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
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
        this.flngFromCustomerKey = null;
    } else {
    this.flngFromCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngLinkKey = null;
    } else {
    this.flngLinkKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintFromProfileNumber = null;
    } else {
    this.fintFromProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFromAccountKey = null;
    } else {
    this.flngFromAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngToCustomerKey = null;
    } else {
    this.flngToCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintToProfileNumber = null;
    } else {
    this.fintToProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngToAccountKey = null;
    } else {
    this.flngToAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLinkType = null;
    } else {
    this.fstrLinkType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMailRedirect = null;
    } else {
    this.fblnMailRedirect = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDisbursementRedirect = null;
    } else {
    this.fblnDisbursementRedirect = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCommence = null;
    } else {
    this.fdtmCommence = new Timestamp(__dataIn.readLong());
    this.fdtmCommence.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCease = null;
    } else {
    this.fdtmCease = new Timestamp(__dataIn.readLong());
    this.fdtmCease.setNanos(__dataIn.readInt());
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngFromCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFromCustomerKey);
    }
    if (null == this.flngLinkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLinkKey);
    }
    if (null == this.fintFromProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFromProfileNumber);
    }
    if (null == this.flngFromAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFromAccountKey);
    }
    if (null == this.flngToCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngToCustomerKey);
    }
    if (null == this.fintToProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintToProfileNumber);
    }
    if (null == this.flngToAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngToAccountKey);
    }
    if (null == this.fstrLinkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkType);
    }
    if (null == this.fblnMailRedirect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMailRedirect);
    }
    if (null == this.fblnDisbursementRedirect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDisbursementRedirect);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngFromCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFromCustomerKey);
    }
    if (null == this.flngLinkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLinkKey);
    }
    if (null == this.fintFromProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFromProfileNumber);
    }
    if (null == this.flngFromAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFromAccountKey);
    }
    if (null == this.flngToCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngToCustomerKey);
    }
    if (null == this.fintToProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintToProfileNumber);
    }
    if (null == this.flngToAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngToAccountKey);
    }
    if (null == this.fstrLinkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkType);
    }
    if (null == this.fblnMailRedirect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMailRedirect);
    }
    if (null == this.fblnDisbursementRedirect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDisbursementRedirect);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFromCustomerKey==null?"\\N":"" + flngFromCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngLinkKey==null?"\\N":"" + flngLinkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFromProfileNumber==null?"\\N":"" + fintFromProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFromAccountKey==null?"\\N":"" + flngFromAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngToCustomerKey==null?"\\N":"" + flngToCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintToProfileNumber==null?"\\N":"" + fintToProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngToAccountKey==null?"\\N":"" + flngToAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkType==null?"\\N":fstrLinkType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMailRedirect==null?"\\N":"" + fblnMailRedirect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDisbursementRedirect==null?"\\N":"" + fblnDisbursementRedirect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFromCustomerKey==null?"\\N":"" + flngFromCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngLinkKey==null?"\\N":"" + flngLinkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFromProfileNumber==null?"\\N":"" + fintFromProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFromAccountKey==null?"\\N":"" + flngFromAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngToCustomerKey==null?"\\N":"" + flngToCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintToProfileNumber==null?"\\N":"" + fintToProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngToAccountKey==null?"\\N":"" + flngToAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkType==null?"\\N":fstrLinkType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMailRedirect==null?"\\N":"" + fblnMailRedirect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDisbursementRedirect==null?"\\N":"" + fblnDisbursementRedirect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFromCustomerKey = null; } else {
      this.flngFromCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLinkKey = null; } else {
      this.flngLinkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFromProfileNumber = null; } else {
      this.fintFromProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFromAccountKey = null; } else {
      this.flngFromAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngToCustomerKey = null; } else {
      this.flngToCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintToProfileNumber = null; } else {
      this.fintToProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngToAccountKey = null; } else {
      this.flngToAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLinkType = null; } else {
      this.fstrLinkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMailRedirect = null; } else {
      this.fblnMailRedirect = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDisbursementRedirect = null; } else {
      this.fblnDisbursementRedirect = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFromCustomerKey = null; } else {
      this.flngFromCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLinkKey = null; } else {
      this.flngLinkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFromProfileNumber = null; } else {
      this.fintFromProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFromAccountKey = null; } else {
      this.flngFromAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngToCustomerKey = null; } else {
      this.flngToCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintToProfileNumber = null; } else {
      this.fintToProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngToAccountKey = null; } else {
      this.flngToAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLinkType = null; } else {
      this.fstrLinkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMailRedirect = null; } else {
      this.fblnMailRedirect = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDisbursementRedirect = null; } else {
      this.fblnDisbursementRedirect = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_taxpreplink o = (tblnz_taxpreplink) super.clone();
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_taxpreplink o) throws CloneNotSupportedException {
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngFromCustomerKey", this.flngFromCustomerKey);
    __sqoop$field_map.put("flngLinkKey", this.flngLinkKey);
    __sqoop$field_map.put("fintFromProfileNumber", this.fintFromProfileNumber);
    __sqoop$field_map.put("flngFromAccountKey", this.flngFromAccountKey);
    __sqoop$field_map.put("flngToCustomerKey", this.flngToCustomerKey);
    __sqoop$field_map.put("fintToProfileNumber", this.fintToProfileNumber);
    __sqoop$field_map.put("flngToAccountKey", this.flngToAccountKey);
    __sqoop$field_map.put("fstrLinkType", this.fstrLinkType);
    __sqoop$field_map.put("fblnMailRedirect", this.fblnMailRedirect);
    __sqoop$field_map.put("fblnDisbursementRedirect", this.fblnDisbursementRedirect);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngFromCustomerKey", this.flngFromCustomerKey);
    __sqoop$field_map.put("flngLinkKey", this.flngLinkKey);
    __sqoop$field_map.put("fintFromProfileNumber", this.fintFromProfileNumber);
    __sqoop$field_map.put("flngFromAccountKey", this.flngFromAccountKey);
    __sqoop$field_map.put("flngToCustomerKey", this.flngToCustomerKey);
    __sqoop$field_map.put("fintToProfileNumber", this.fintToProfileNumber);
    __sqoop$field_map.put("flngToAccountKey", this.flngToAccountKey);
    __sqoop$field_map.put("fstrLinkType", this.fstrLinkType);
    __sqoop$field_map.put("fblnMailRedirect", this.fblnMailRedirect);
    __sqoop$field_map.put("fblnDisbursementRedirect", this.fblnDisbursementRedirect);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
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
