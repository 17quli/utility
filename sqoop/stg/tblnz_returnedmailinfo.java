// ORM class for table 'tblnz_returnedmailinfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:18:08 NZDT 2020
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

public class tblnz_returnedmailinfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngFileKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.flngFileKey = (Integer)value;
      }
    });
    setters.put("flngMailItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.flngMailItemKey = (Integer)value;
      }
    });
    setters.put("fstrChangeAddressLine1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fstrChangeAddressLine1 = (String)value;
      }
    });
    setters.put("fstrChangeAddressLine2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fstrChangeAddressLine2 = (String)value;
      }
    });
    setters.put("fstrChangeAddressLine3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fstrChangeAddressLine3 = (String)value;
      }
    });
    setters.put("fstrChangeAddressLine4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fstrChangeAddressLine4 = (String)value;
      }
    });
    setters.put("fstrChangeAddressLine5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fstrChangeAddressLine5 = (String)value;
      }
    });
    setters.put("fstrPostcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fstrPostcode = (String)value;
      }
    });
    setters.put("fstrActionFlag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fstrActionFlag = (String)value;
      }
    });
    setters.put("fstrMatchType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fstrMatchType = (String)value;
      }
    });
    setters.put("fdtmChangeDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fdtmChangeDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_returnedmailinfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_returnedmailinfo() {
    init0();
  }
  private Integer flngFileKey;
  public Integer get_flngFileKey() {
    return flngFileKey;
  }
  public void set_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
  }
  public tblnz_returnedmailinfo with_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
    return this;
  }
  private Integer flngMailItemKey;
  public Integer get_flngMailItemKey() {
    return flngMailItemKey;
  }
  public void set_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
  }
  public tblnz_returnedmailinfo with_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
    return this;
  }
  private String fstrChangeAddressLine1;
  public String get_fstrChangeAddressLine1() {
    return fstrChangeAddressLine1;
  }
  public void set_fstrChangeAddressLine1(String fstrChangeAddressLine1) {
    this.fstrChangeAddressLine1 = fstrChangeAddressLine1;
  }
  public tblnz_returnedmailinfo with_fstrChangeAddressLine1(String fstrChangeAddressLine1) {
    this.fstrChangeAddressLine1 = fstrChangeAddressLine1;
    return this;
  }
  private String fstrChangeAddressLine2;
  public String get_fstrChangeAddressLine2() {
    return fstrChangeAddressLine2;
  }
  public void set_fstrChangeAddressLine2(String fstrChangeAddressLine2) {
    this.fstrChangeAddressLine2 = fstrChangeAddressLine2;
  }
  public tblnz_returnedmailinfo with_fstrChangeAddressLine2(String fstrChangeAddressLine2) {
    this.fstrChangeAddressLine2 = fstrChangeAddressLine2;
    return this;
  }
  private String fstrChangeAddressLine3;
  public String get_fstrChangeAddressLine3() {
    return fstrChangeAddressLine3;
  }
  public void set_fstrChangeAddressLine3(String fstrChangeAddressLine3) {
    this.fstrChangeAddressLine3 = fstrChangeAddressLine3;
  }
  public tblnz_returnedmailinfo with_fstrChangeAddressLine3(String fstrChangeAddressLine3) {
    this.fstrChangeAddressLine3 = fstrChangeAddressLine3;
    return this;
  }
  private String fstrChangeAddressLine4;
  public String get_fstrChangeAddressLine4() {
    return fstrChangeAddressLine4;
  }
  public void set_fstrChangeAddressLine4(String fstrChangeAddressLine4) {
    this.fstrChangeAddressLine4 = fstrChangeAddressLine4;
  }
  public tblnz_returnedmailinfo with_fstrChangeAddressLine4(String fstrChangeAddressLine4) {
    this.fstrChangeAddressLine4 = fstrChangeAddressLine4;
    return this;
  }
  private String fstrChangeAddressLine5;
  public String get_fstrChangeAddressLine5() {
    return fstrChangeAddressLine5;
  }
  public void set_fstrChangeAddressLine5(String fstrChangeAddressLine5) {
    this.fstrChangeAddressLine5 = fstrChangeAddressLine5;
  }
  public tblnz_returnedmailinfo with_fstrChangeAddressLine5(String fstrChangeAddressLine5) {
    this.fstrChangeAddressLine5 = fstrChangeAddressLine5;
    return this;
  }
  private String fstrPostcode;
  public String get_fstrPostcode() {
    return fstrPostcode;
  }
  public void set_fstrPostcode(String fstrPostcode) {
    this.fstrPostcode = fstrPostcode;
  }
  public tblnz_returnedmailinfo with_fstrPostcode(String fstrPostcode) {
    this.fstrPostcode = fstrPostcode;
    return this;
  }
  private String fstrActionFlag;
  public String get_fstrActionFlag() {
    return fstrActionFlag;
  }
  public void set_fstrActionFlag(String fstrActionFlag) {
    this.fstrActionFlag = fstrActionFlag;
  }
  public tblnz_returnedmailinfo with_fstrActionFlag(String fstrActionFlag) {
    this.fstrActionFlag = fstrActionFlag;
    return this;
  }
  private String fstrMatchType;
  public String get_fstrMatchType() {
    return fstrMatchType;
  }
  public void set_fstrMatchType(String fstrMatchType) {
    this.fstrMatchType = fstrMatchType;
  }
  public tblnz_returnedmailinfo with_fstrMatchType(String fstrMatchType) {
    this.fstrMatchType = fstrMatchType;
    return this;
  }
  private java.sql.Timestamp fdtmChangeDate;
  public java.sql.Timestamp get_fdtmChangeDate() {
    return fdtmChangeDate;
  }
  public void set_fdtmChangeDate(java.sql.Timestamp fdtmChangeDate) {
    this.fdtmChangeDate = fdtmChangeDate;
  }
  public tblnz_returnedmailinfo with_fdtmChangeDate(java.sql.Timestamp fdtmChangeDate) {
    this.fdtmChangeDate = fdtmChangeDate;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_returnedmailinfo with_fstrWho(String fstrWho) {
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
  public tblnz_returnedmailinfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_returnedmailinfo)) {
      return false;
    }
    tblnz_returnedmailinfo that = (tblnz_returnedmailinfo) o;
    boolean equal = true;
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.fstrChangeAddressLine1 == null ? that.fstrChangeAddressLine1 == null : this.fstrChangeAddressLine1.equals(that.fstrChangeAddressLine1));
    equal = equal && (this.fstrChangeAddressLine2 == null ? that.fstrChangeAddressLine2 == null : this.fstrChangeAddressLine2.equals(that.fstrChangeAddressLine2));
    equal = equal && (this.fstrChangeAddressLine3 == null ? that.fstrChangeAddressLine3 == null : this.fstrChangeAddressLine3.equals(that.fstrChangeAddressLine3));
    equal = equal && (this.fstrChangeAddressLine4 == null ? that.fstrChangeAddressLine4 == null : this.fstrChangeAddressLine4.equals(that.fstrChangeAddressLine4));
    equal = equal && (this.fstrChangeAddressLine5 == null ? that.fstrChangeAddressLine5 == null : this.fstrChangeAddressLine5.equals(that.fstrChangeAddressLine5));
    equal = equal && (this.fstrPostcode == null ? that.fstrPostcode == null : this.fstrPostcode.equals(that.fstrPostcode));
    equal = equal && (this.fstrActionFlag == null ? that.fstrActionFlag == null : this.fstrActionFlag.equals(that.fstrActionFlag));
    equal = equal && (this.fstrMatchType == null ? that.fstrMatchType == null : this.fstrMatchType.equals(that.fstrMatchType));
    equal = equal && (this.fdtmChangeDate == null ? that.fdtmChangeDate == null : this.fdtmChangeDate.equals(that.fdtmChangeDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_returnedmailinfo)) {
      return false;
    }
    tblnz_returnedmailinfo that = (tblnz_returnedmailinfo) o;
    boolean equal = true;
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.fstrChangeAddressLine1 == null ? that.fstrChangeAddressLine1 == null : this.fstrChangeAddressLine1.equals(that.fstrChangeAddressLine1));
    equal = equal && (this.fstrChangeAddressLine2 == null ? that.fstrChangeAddressLine2 == null : this.fstrChangeAddressLine2.equals(that.fstrChangeAddressLine2));
    equal = equal && (this.fstrChangeAddressLine3 == null ? that.fstrChangeAddressLine3 == null : this.fstrChangeAddressLine3.equals(that.fstrChangeAddressLine3));
    equal = equal && (this.fstrChangeAddressLine4 == null ? that.fstrChangeAddressLine4 == null : this.fstrChangeAddressLine4.equals(that.fstrChangeAddressLine4));
    equal = equal && (this.fstrChangeAddressLine5 == null ? that.fstrChangeAddressLine5 == null : this.fstrChangeAddressLine5.equals(that.fstrChangeAddressLine5));
    equal = equal && (this.fstrPostcode == null ? that.fstrPostcode == null : this.fstrPostcode.equals(that.fstrPostcode));
    equal = equal && (this.fstrActionFlag == null ? that.fstrActionFlag == null : this.fstrActionFlag.equals(that.fstrActionFlag));
    equal = equal && (this.fstrMatchType == null ? that.fstrMatchType == null : this.fstrMatchType.equals(that.fstrMatchType));
    equal = equal && (this.fdtmChangeDate == null ? that.fdtmChangeDate == null : this.fdtmChangeDate.equals(that.fdtmChangeDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngFileKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngMailItemKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrChangeAddressLine1 = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrChangeAddressLine2 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrChangeAddressLine3 = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrChangeAddressLine4 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrChangeAddressLine5 = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPostcode = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrActionFlag = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrMatchType = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmChangeDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngFileKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngMailItemKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrChangeAddressLine1 = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrChangeAddressLine2 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrChangeAddressLine3 = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrChangeAddressLine4 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrChangeAddressLine5 = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPostcode = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrActionFlag = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrMatchType = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmChangeDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngFileKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailItemKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine1, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine2, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine3, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine4, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine5, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostcode, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrActionFlag, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMatchType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmChangeDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngFileKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailItemKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine1, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine2, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine3, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine4, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeAddressLine5, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostcode, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrActionFlag, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMatchType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmChangeDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngFileKey = null;
    } else {
    this.flngFileKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMailItemKey = null;
    } else {
    this.flngMailItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrChangeAddressLine1 = null;
    } else {
    this.fstrChangeAddressLine1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrChangeAddressLine2 = null;
    } else {
    this.fstrChangeAddressLine2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrChangeAddressLine3 = null;
    } else {
    this.fstrChangeAddressLine3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrChangeAddressLine4 = null;
    } else {
    this.fstrChangeAddressLine4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrChangeAddressLine5 = null;
    } else {
    this.fstrChangeAddressLine5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPostcode = null;
    } else {
    this.fstrPostcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrActionFlag = null;
    } else {
    this.fstrActionFlag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMatchType = null;
    } else {
    this.fstrMatchType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmChangeDate = null;
    } else {
    this.fdtmChangeDate = new Timestamp(__dataIn.readLong());
    this.fdtmChangeDate.setNanos(__dataIn.readInt());
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
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.fstrChangeAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine1);
    }
    if (null == this.fstrChangeAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine2);
    }
    if (null == this.fstrChangeAddressLine3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine3);
    }
    if (null == this.fstrChangeAddressLine4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine4);
    }
    if (null == this.fstrChangeAddressLine5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine5);
    }
    if (null == this.fstrPostcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostcode);
    }
    if (null == this.fstrActionFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActionFlag);
    }
    if (null == this.fstrMatchType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMatchType);
    }
    if (null == this.fdtmChangeDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmChangeDate.getTime());
    __dataOut.writeInt(this.fdtmChangeDate.getNanos());
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
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.fstrChangeAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine1);
    }
    if (null == this.fstrChangeAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine2);
    }
    if (null == this.fstrChangeAddressLine3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine3);
    }
    if (null == this.fstrChangeAddressLine4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine4);
    }
    if (null == this.fstrChangeAddressLine5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeAddressLine5);
    }
    if (null == this.fstrPostcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostcode);
    }
    if (null == this.fstrActionFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActionFlag);
    }
    if (null == this.fstrMatchType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMatchType);
    }
    if (null == this.fdtmChangeDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmChangeDate.getTime());
    __dataOut.writeInt(this.fdtmChangeDate.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine1==null?"\\N":fstrChangeAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine2==null?"\\N":fstrChangeAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine3==null?"\\N":fstrChangeAddressLine3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine4==null?"\\N":fstrChangeAddressLine4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine5==null?"\\N":fstrChangeAddressLine5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostcode==null?"\\N":fstrPostcode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActionFlag==null?"\\N":fstrActionFlag, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMatchType==null?"\\N":fstrMatchType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmChangeDate==null?"\\N":"" + fdtmChangeDate, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine1==null?"\\N":fstrChangeAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine2==null?"\\N":fstrChangeAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine3==null?"\\N":fstrChangeAddressLine3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine4==null?"\\N":fstrChangeAddressLine4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeAddressLine5==null?"\\N":fstrChangeAddressLine5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostcode==null?"\\N":fstrPostcode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActionFlag==null?"\\N":fstrActionFlag, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMatchType==null?"\\N":fstrMatchType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmChangeDate==null?"\\N":"" + fdtmChangeDate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileKey = null; } else {
      this.flngFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine1 = null; } else {
      this.fstrChangeAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine2 = null; } else {
      this.fstrChangeAddressLine2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine3 = null; } else {
      this.fstrChangeAddressLine3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine4 = null; } else {
      this.fstrChangeAddressLine4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine5 = null; } else {
      this.fstrChangeAddressLine5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostcode = null; } else {
      this.fstrPostcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActionFlag = null; } else {
      this.fstrActionFlag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMatchType = null; } else {
      this.fstrMatchType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmChangeDate = null; } else {
      this.fdtmChangeDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileKey = null; } else {
      this.flngFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine1 = null; } else {
      this.fstrChangeAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine2 = null; } else {
      this.fstrChangeAddressLine2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine3 = null; } else {
      this.fstrChangeAddressLine3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine4 = null; } else {
      this.fstrChangeAddressLine4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeAddressLine5 = null; } else {
      this.fstrChangeAddressLine5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostcode = null; } else {
      this.fstrPostcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActionFlag = null; } else {
      this.fstrActionFlag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMatchType = null; } else {
      this.fstrMatchType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmChangeDate = null; } else {
      this.fdtmChangeDate = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_returnedmailinfo o = (tblnz_returnedmailinfo) super.clone();
    o.fdtmChangeDate = (o.fdtmChangeDate != null) ? (java.sql.Timestamp) o.fdtmChangeDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_returnedmailinfo o) throws CloneNotSupportedException {
    o.fdtmChangeDate = (o.fdtmChangeDate != null) ? (java.sql.Timestamp) o.fdtmChangeDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("fstrChangeAddressLine1", this.fstrChangeAddressLine1);
    __sqoop$field_map.put("fstrChangeAddressLine2", this.fstrChangeAddressLine2);
    __sqoop$field_map.put("fstrChangeAddressLine3", this.fstrChangeAddressLine3);
    __sqoop$field_map.put("fstrChangeAddressLine4", this.fstrChangeAddressLine4);
    __sqoop$field_map.put("fstrChangeAddressLine5", this.fstrChangeAddressLine5);
    __sqoop$field_map.put("fstrPostcode", this.fstrPostcode);
    __sqoop$field_map.put("fstrActionFlag", this.fstrActionFlag);
    __sqoop$field_map.put("fstrMatchType", this.fstrMatchType);
    __sqoop$field_map.put("fdtmChangeDate", this.fdtmChangeDate);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("fstrChangeAddressLine1", this.fstrChangeAddressLine1);
    __sqoop$field_map.put("fstrChangeAddressLine2", this.fstrChangeAddressLine2);
    __sqoop$field_map.put("fstrChangeAddressLine3", this.fstrChangeAddressLine3);
    __sqoop$field_map.put("fstrChangeAddressLine4", this.fstrChangeAddressLine4);
    __sqoop$field_map.put("fstrChangeAddressLine5", this.fstrChangeAddressLine5);
    __sqoop$field_map.put("fstrPostcode", this.fstrPostcode);
    __sqoop$field_map.put("fstrActionFlag", this.fstrActionFlag);
    __sqoop$field_map.put("fstrMatchType", this.fstrMatchType);
    __sqoop$field_map.put("fdtmChangeDate", this.fdtmChangeDate);
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
