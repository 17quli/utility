// ORM class for table 'tblnz_crtattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:14:14 NZDT 2020
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

public class tblnz_crtattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngWebReqKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.flngWebReqKey = (Integer)value;
      }
    });
    setters.put("fstrFilingFrequency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fstrFilingFrequency = (String)value;
      }
    });
    setters.put("fstrSourceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fstrSourceType = (String)value;
      }
    });
    setters.put("fstrWebLogonID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fstrWebLogonID = (String)value;
      }
    });
    setters.put("fstrFormTypeFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fstrFormTypeFiled = (String)value;
      }
    });
    setters.put("fstrFormTypeExpected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fstrFormTypeExpected = (String)value;
      }
    });
    setters.put("fstrIPAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fstrIPAddress = (String)value;
      }
    });
    setters.put("fstrDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fstrDLN = (String)value;
      }
    });
    setters.put("fblnAmended", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fblnAmended = (Integer)value;
      }
    });
    setters.put("fblnCorrespondence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fblnCorrespondence = (Integer)value;
      }
    });
    setters.put("fblnFuturePeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fblnFuturePeriod = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_crtattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_crtattributes() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_crtattributes with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_crtattributes with_flngVer(Integer flngVer) {
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
  public tblnz_crtattributes with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngWebReqKey;
  public Integer get_flngWebReqKey() {
    return flngWebReqKey;
  }
  public void set_flngWebReqKey(Integer flngWebReqKey) {
    this.flngWebReqKey = flngWebReqKey;
  }
  public tblnz_crtattributes with_flngWebReqKey(Integer flngWebReqKey) {
    this.flngWebReqKey = flngWebReqKey;
    return this;
  }
  private String fstrFilingFrequency;
  public String get_fstrFilingFrequency() {
    return fstrFilingFrequency;
  }
  public void set_fstrFilingFrequency(String fstrFilingFrequency) {
    this.fstrFilingFrequency = fstrFilingFrequency;
  }
  public tblnz_crtattributes with_fstrFilingFrequency(String fstrFilingFrequency) {
    this.fstrFilingFrequency = fstrFilingFrequency;
    return this;
  }
  private String fstrSourceType;
  public String get_fstrSourceType() {
    return fstrSourceType;
  }
  public void set_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
  }
  public tblnz_crtattributes with_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
    return this;
  }
  private String fstrWebLogonID;
  public String get_fstrWebLogonID() {
    return fstrWebLogonID;
  }
  public void set_fstrWebLogonID(String fstrWebLogonID) {
    this.fstrWebLogonID = fstrWebLogonID;
  }
  public tblnz_crtattributes with_fstrWebLogonID(String fstrWebLogonID) {
    this.fstrWebLogonID = fstrWebLogonID;
    return this;
  }
  private String fstrFormTypeFiled;
  public String get_fstrFormTypeFiled() {
    return fstrFormTypeFiled;
  }
  public void set_fstrFormTypeFiled(String fstrFormTypeFiled) {
    this.fstrFormTypeFiled = fstrFormTypeFiled;
  }
  public tblnz_crtattributes with_fstrFormTypeFiled(String fstrFormTypeFiled) {
    this.fstrFormTypeFiled = fstrFormTypeFiled;
    return this;
  }
  private String fstrFormTypeExpected;
  public String get_fstrFormTypeExpected() {
    return fstrFormTypeExpected;
  }
  public void set_fstrFormTypeExpected(String fstrFormTypeExpected) {
    this.fstrFormTypeExpected = fstrFormTypeExpected;
  }
  public tblnz_crtattributes with_fstrFormTypeExpected(String fstrFormTypeExpected) {
    this.fstrFormTypeExpected = fstrFormTypeExpected;
    return this;
  }
  private String fstrIPAddress;
  public String get_fstrIPAddress() {
    return fstrIPAddress;
  }
  public void set_fstrIPAddress(String fstrIPAddress) {
    this.fstrIPAddress = fstrIPAddress;
  }
  public tblnz_crtattributes with_fstrIPAddress(String fstrIPAddress) {
    this.fstrIPAddress = fstrIPAddress;
    return this;
  }
  private String fstrDLN;
  public String get_fstrDLN() {
    return fstrDLN;
  }
  public void set_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
  }
  public tblnz_crtattributes with_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
    return this;
  }
  private Integer fblnAmended;
  public Integer get_fblnAmended() {
    return fblnAmended;
  }
  public void set_fblnAmended(Integer fblnAmended) {
    this.fblnAmended = fblnAmended;
  }
  public tblnz_crtattributes with_fblnAmended(Integer fblnAmended) {
    this.fblnAmended = fblnAmended;
    return this;
  }
  private Integer fblnCorrespondence;
  public Integer get_fblnCorrespondence() {
    return fblnCorrespondence;
  }
  public void set_fblnCorrespondence(Integer fblnCorrespondence) {
    this.fblnCorrespondence = fblnCorrespondence;
  }
  public tblnz_crtattributes with_fblnCorrespondence(Integer fblnCorrespondence) {
    this.fblnCorrespondence = fblnCorrespondence;
    return this;
  }
  private Integer fblnFuturePeriod;
  public Integer get_fblnFuturePeriod() {
    return fblnFuturePeriod;
  }
  public void set_fblnFuturePeriod(Integer fblnFuturePeriod) {
    this.fblnFuturePeriod = fblnFuturePeriod;
  }
  public tblnz_crtattributes with_fblnFuturePeriod(Integer fblnFuturePeriod) {
    this.fblnFuturePeriod = fblnFuturePeriod;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_crtattributes with_fstrWho(String fstrWho) {
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
  public tblnz_crtattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_crtattributes)) {
      return false;
    }
    tblnz_crtattributes that = (tblnz_crtattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngWebReqKey == null ? that.flngWebReqKey == null : this.flngWebReqKey.equals(that.flngWebReqKey));
    equal = equal && (this.fstrFilingFrequency == null ? that.fstrFilingFrequency == null : this.fstrFilingFrequency.equals(that.fstrFilingFrequency));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fstrWebLogonID == null ? that.fstrWebLogonID == null : this.fstrWebLogonID.equals(that.fstrWebLogonID));
    equal = equal && (this.fstrFormTypeFiled == null ? that.fstrFormTypeFiled == null : this.fstrFormTypeFiled.equals(that.fstrFormTypeFiled));
    equal = equal && (this.fstrFormTypeExpected == null ? that.fstrFormTypeExpected == null : this.fstrFormTypeExpected.equals(that.fstrFormTypeExpected));
    equal = equal && (this.fstrIPAddress == null ? that.fstrIPAddress == null : this.fstrIPAddress.equals(that.fstrIPAddress));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fblnAmended == null ? that.fblnAmended == null : this.fblnAmended.equals(that.fblnAmended));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fblnFuturePeriod == null ? that.fblnFuturePeriod == null : this.fblnFuturePeriod.equals(that.fblnFuturePeriod));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_crtattributes)) {
      return false;
    }
    tblnz_crtattributes that = (tblnz_crtattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngWebReqKey == null ? that.flngWebReqKey == null : this.flngWebReqKey.equals(that.flngWebReqKey));
    equal = equal && (this.fstrFilingFrequency == null ? that.fstrFilingFrequency == null : this.fstrFilingFrequency.equals(that.fstrFilingFrequency));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fstrWebLogonID == null ? that.fstrWebLogonID == null : this.fstrWebLogonID.equals(that.fstrWebLogonID));
    equal = equal && (this.fstrFormTypeFiled == null ? that.fstrFormTypeFiled == null : this.fstrFormTypeFiled.equals(that.fstrFormTypeFiled));
    equal = equal && (this.fstrFormTypeExpected == null ? that.fstrFormTypeExpected == null : this.fstrFormTypeExpected.equals(that.fstrFormTypeExpected));
    equal = equal && (this.fstrIPAddress == null ? that.fstrIPAddress == null : this.fstrIPAddress.equals(that.fstrIPAddress));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fblnAmended == null ? that.fblnAmended == null : this.fblnAmended.equals(that.fblnAmended));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fblnFuturePeriod == null ? that.fblnFuturePeriod == null : this.fblnFuturePeriod.equals(that.fblnFuturePeriod));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngWebReqKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrFilingFrequency = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrWebLogonID = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFormTypeFiled = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrFormTypeExpected = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrIPAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(11, __dbResults);
    this.fblnAmended = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnFuturePeriod = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngWebReqKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrFilingFrequency = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrWebLogonID = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFormTypeFiled = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrFormTypeExpected = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrIPAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(11, __dbResults);
    this.fblnAmended = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnFuturePeriod = JdbcWritableBridge.readInteger(14, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWebReqKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFrequency, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonID, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeFiled, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeExpected, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIPAddress, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAmended, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFuturePeriod, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWebReqKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFrequency, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonID, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeFiled, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeExpected, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIPAddress, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAmended, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFuturePeriod, 14 + __off, -6, __dbStmt);
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
        this.flngWebReqKey = null;
    } else {
    this.flngWebReqKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingFrequency = null;
    } else {
    this.fstrFilingFrequency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceType = null;
    } else {
    this.fstrSourceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWebLogonID = null;
    } else {
    this.fstrWebLogonID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormTypeFiled = null;
    } else {
    this.fstrFormTypeFiled = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormTypeExpected = null;
    } else {
    this.fstrFormTypeExpected = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIPAddress = null;
    } else {
    this.fstrIPAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDLN = null;
    } else {
    this.fstrDLN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAmended = null;
    } else {
    this.fblnAmended = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCorrespondence = null;
    } else {
    this.fblnCorrespondence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFuturePeriod = null;
    } else {
    this.fblnFuturePeriod = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngWebReqKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWebReqKey);
    }
    if (null == this.fstrFilingFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFrequency);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fstrWebLogonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonID);
    }
    if (null == this.fstrFormTypeFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeFiled);
    }
    if (null == this.fstrFormTypeExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeExpected);
    }
    if (null == this.fstrIPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIPAddress);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fblnAmended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAmended);
    }
    if (null == this.fblnCorrespondence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorrespondence);
    }
    if (null == this.fblnFuturePeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFuturePeriod);
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
    if (null == this.flngWebReqKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWebReqKey);
    }
    if (null == this.fstrFilingFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFrequency);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fstrWebLogonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonID);
    }
    if (null == this.fstrFormTypeFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeFiled);
    }
    if (null == this.fstrFormTypeExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeExpected);
    }
    if (null == this.fstrIPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIPAddress);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fblnAmended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAmended);
    }
    if (null == this.fblnCorrespondence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorrespondence);
    }
    if (null == this.fblnFuturePeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFuturePeriod);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWebReqKey==null?"\\N":"" + flngWebReqKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFrequency==null?"\\N":fstrFilingFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebLogonID==null?"\\N":fstrWebLogonID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeFiled==null?"\\N":fstrFormTypeFiled, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeExpected==null?"\\N":fstrFormTypeExpected, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIPAddress==null?"\\N":fstrIPAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAmended==null?"\\N":"" + fblnAmended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFuturePeriod==null?"\\N":"" + fblnFuturePeriod, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWebReqKey==null?"\\N":"" + flngWebReqKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFrequency==null?"\\N":fstrFilingFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebLogonID==null?"\\N":fstrWebLogonID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeFiled==null?"\\N":fstrFormTypeFiled, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeExpected==null?"\\N":fstrFormTypeExpected, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIPAddress==null?"\\N":fstrIPAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAmended==null?"\\N":"" + fblnAmended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFuturePeriod==null?"\\N":"" + fblnFuturePeriod, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWebReqKey = null; } else {
      this.flngWebReqKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFrequency = null; } else {
      this.fstrFilingFrequency = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrWebLogonID = null; } else {
      this.fstrWebLogonID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeFiled = null; } else {
      this.fstrFormTypeFiled = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeExpected = null; } else {
      this.fstrFormTypeExpected = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIPAddress = null; } else {
      this.fstrIPAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAmended = null; } else {
      this.fblnAmended = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCorrespondence = null; } else {
      this.fblnCorrespondence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFuturePeriod = null; } else {
      this.fblnFuturePeriod = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWebReqKey = null; } else {
      this.flngWebReqKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFrequency = null; } else {
      this.fstrFilingFrequency = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrWebLogonID = null; } else {
      this.fstrWebLogonID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeFiled = null; } else {
      this.fstrFormTypeFiled = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeExpected = null; } else {
      this.fstrFormTypeExpected = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIPAddress = null; } else {
      this.fstrIPAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAmended = null; } else {
      this.fblnAmended = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCorrespondence = null; } else {
      this.fblnCorrespondence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFuturePeriod = null; } else {
      this.fblnFuturePeriod = Integer.valueOf(__cur_str);
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
    tblnz_crtattributes o = (tblnz_crtattributes) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_crtattributes o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngWebReqKey", this.flngWebReqKey);
    __sqoop$field_map.put("fstrFilingFrequency", this.fstrFilingFrequency);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fstrWebLogonID", this.fstrWebLogonID);
    __sqoop$field_map.put("fstrFormTypeFiled", this.fstrFormTypeFiled);
    __sqoop$field_map.put("fstrFormTypeExpected", this.fstrFormTypeExpected);
    __sqoop$field_map.put("fstrIPAddress", this.fstrIPAddress);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fblnAmended", this.fblnAmended);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fblnFuturePeriod", this.fblnFuturePeriod);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngWebReqKey", this.flngWebReqKey);
    __sqoop$field_map.put("fstrFilingFrequency", this.fstrFilingFrequency);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fstrWebLogonID", this.fstrWebLogonID);
    __sqoop$field_map.put("fstrFormTypeFiled", this.fstrFormTypeFiled);
    __sqoop$field_map.put("fstrFormTypeExpected", this.fstrFormTypeExpected);
    __sqoop$field_map.put("fstrIPAddress", this.fstrIPAddress);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fblnAmended", this.fblnAmended);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fblnFuturePeriod", this.fblnFuturePeriod);
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
