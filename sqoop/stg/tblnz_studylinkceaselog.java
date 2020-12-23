// ORM class for table 'tblnz_studylinkceaselog'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:19:47 NZDT 2020
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

public class tblnz_studylinkceaselog extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64CeaseLogKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fi64CeaseLogKey = (Long)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fstrFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fstrFamilyName = (String)value;
      }
    });
    setters.put("fstrMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fstrMiddleName = (String)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fstrDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fstrDLN = (String)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCeaseReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fstrCeaseReason = (String)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fstrStudyLinkAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fstrStudyLinkAction = (String)value;
      }
    });
    setters.put("fdtmResponse", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fdtmResponse = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkceaselog.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_studylinkceaselog() {
    init0();
  }
  private Long fi64CeaseLogKey;
  public Long get_fi64CeaseLogKey() {
    return fi64CeaseLogKey;
  }
  public void set_fi64CeaseLogKey(Long fi64CeaseLogKey) {
    this.fi64CeaseLogKey = fi64CeaseLogKey;
  }
  public tblnz_studylinkceaselog with_fi64CeaseLogKey(Long fi64CeaseLogKey) {
    this.fi64CeaseLogKey = fi64CeaseLogKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_studylinkceaselog with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrIRDNumber;
  public String get_fstrIRDNumber() {
    return fstrIRDNumber;
  }
  public void set_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
  }
  public tblnz_studylinkceaselog with_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
    return this;
  }
  private String fstrFamilyName;
  public String get_fstrFamilyName() {
    return fstrFamilyName;
  }
  public void set_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
  }
  public tblnz_studylinkceaselog with_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
    return this;
  }
  private String fstrMiddleName;
  public String get_fstrMiddleName() {
    return fstrMiddleName;
  }
  public void set_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
  }
  public tblnz_studylinkceaselog with_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
    return this;
  }
  private String fstrFirstName;
  public String get_fstrFirstName() {
    return fstrFirstName;
  }
  public void set_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
  }
  public tblnz_studylinkceaselog with_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
    return this;
  }
  private String fstrDLN;
  public String get_fstrDLN() {
    return fstrDLN;
  }
  public void set_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
  }
  public tblnz_studylinkceaselog with_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
    return this;
  }
  private java.sql.Timestamp fdtmCease;
  public java.sql.Timestamp get_fdtmCease() {
    return fdtmCease;
  }
  public void set_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
  }
  public tblnz_studylinkceaselog with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private String fstrCeaseReason;
  public String get_fstrCeaseReason() {
    return fstrCeaseReason;
  }
  public void set_fstrCeaseReason(String fstrCeaseReason) {
    this.fstrCeaseReason = fstrCeaseReason;
  }
  public tblnz_studylinkceaselog with_fstrCeaseReason(String fstrCeaseReason) {
    this.fstrCeaseReason = fstrCeaseReason;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblnz_studylinkceaselog with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private String fstrStudyLinkAction;
  public String get_fstrStudyLinkAction() {
    return fstrStudyLinkAction;
  }
  public void set_fstrStudyLinkAction(String fstrStudyLinkAction) {
    this.fstrStudyLinkAction = fstrStudyLinkAction;
  }
  public tblnz_studylinkceaselog with_fstrStudyLinkAction(String fstrStudyLinkAction) {
    this.fstrStudyLinkAction = fstrStudyLinkAction;
    return this;
  }
  private java.sql.Timestamp fdtmResponse;
  public java.sql.Timestamp get_fdtmResponse() {
    return fdtmResponse;
  }
  public void set_fdtmResponse(java.sql.Timestamp fdtmResponse) {
    this.fdtmResponse = fdtmResponse;
  }
  public tblnz_studylinkceaselog with_fdtmResponse(java.sql.Timestamp fdtmResponse) {
    this.fdtmResponse = fdtmResponse;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_studylinkceaselog with_fstrWho(String fstrWho) {
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
  public tblnz_studylinkceaselog with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkceaselog)) {
      return false;
    }
    tblnz_studylinkceaselog that = (tblnz_studylinkceaselog) o;
    boolean equal = true;
    equal = equal && (this.fi64CeaseLogKey == null ? that.fi64CeaseLogKey == null : this.fi64CeaseLogKey.equals(that.fi64CeaseLogKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fstrCeaseReason == null ? that.fstrCeaseReason == null : this.fstrCeaseReason.equals(that.fstrCeaseReason));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrStudyLinkAction == null ? that.fstrStudyLinkAction == null : this.fstrStudyLinkAction.equals(that.fstrStudyLinkAction));
    equal = equal && (this.fdtmResponse == null ? that.fdtmResponse == null : this.fdtmResponse.equals(that.fdtmResponse));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkceaselog)) {
      return false;
    }
    tblnz_studylinkceaselog that = (tblnz_studylinkceaselog) o;
    boolean equal = true;
    equal = equal && (this.fi64CeaseLogKey == null ? that.fi64CeaseLogKey == null : this.fi64CeaseLogKey.equals(that.fi64CeaseLogKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fstrCeaseReason == null ? that.fstrCeaseReason == null : this.fstrCeaseReason.equals(that.fstrCeaseReason));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrStudyLinkAction == null ? that.fstrStudyLinkAction == null : this.fstrStudyLinkAction.equals(that.fstrStudyLinkAction));
    equal = equal && (this.fdtmResponse == null ? that.fdtmResponse == null : this.fdtmResponse.equals(that.fdtmResponse));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64CeaseLogKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrCeaseReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrStudyLinkAction = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmResponse = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64CeaseLogKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrCeaseReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrStudyLinkAction = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmResponse = JdbcWritableBridge.readTimestamp(12, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64CeaseLogKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStudyLinkAction, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmResponse, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64CeaseLogKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStudyLinkAction, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmResponse, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64CeaseLogKey = null;
    } else {
    this.fi64CeaseLogKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIRDNumber = null;
    } else {
    this.fstrIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFamilyName = null;
    } else {
    this.fstrFamilyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMiddleName = null;
    } else {
    this.fstrMiddleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFirstName = null;
    } else {
    this.fstrFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDLN = null;
    } else {
    this.fstrDLN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCease = null;
    } else {
    this.fdtmCease = new Timestamp(__dataIn.readLong());
    this.fdtmCease.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCeaseReason = null;
    } else {
    this.fstrCeaseReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStudyLinkAction = null;
    } else {
    this.fstrStudyLinkAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmResponse = null;
    } else {
    this.fdtmResponse = new Timestamp(__dataIn.readLong());
    this.fdtmResponse.setNanos(__dataIn.readInt());
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
    if (null == this.fi64CeaseLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64CeaseLogKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.fstrCeaseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseReason);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrStudyLinkAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStudyLinkAction);
    }
    if (null == this.fdtmResponse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmResponse.getTime());
    __dataOut.writeInt(this.fdtmResponse.getNanos());
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
    if (null == this.fi64CeaseLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64CeaseLogKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.fstrCeaseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseReason);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrStudyLinkAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStudyLinkAction);
    }
    if (null == this.fdtmResponse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmResponse.getTime());
    __dataOut.writeInt(this.fdtmResponse.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64CeaseLogKey==null?"\\N":"" + fi64CeaseLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCeaseReason==null?"\\N":fstrCeaseReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStudyLinkAction==null?"\\N":fstrStudyLinkAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmResponse==null?"\\N":"" + fdtmResponse, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64CeaseLogKey==null?"\\N":"" + fi64CeaseLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCeaseReason==null?"\\N":fstrCeaseReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStudyLinkAction==null?"\\N":fstrStudyLinkAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmResponse==null?"\\N":"" + fdtmResponse, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64CeaseLogKey = null; } else {
      this.fi64CeaseLogKey = Long.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseReason = null; } else {
      this.fstrCeaseReason = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrStudyLinkAction = null; } else {
      this.fstrStudyLinkAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmResponse = null; } else {
      this.fdtmResponse = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64CeaseLogKey = null; } else {
      this.fi64CeaseLogKey = Long.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseReason = null; } else {
      this.fstrCeaseReason = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrStudyLinkAction = null; } else {
      this.fstrStudyLinkAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmResponse = null; } else {
      this.fdtmResponse = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_studylinkceaselog o = (tblnz_studylinkceaselog) super.clone();
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmResponse = (o.fdtmResponse != null) ? (java.sql.Timestamp) o.fdtmResponse.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_studylinkceaselog o) throws CloneNotSupportedException {
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmResponse = (o.fdtmResponse != null) ? (java.sql.Timestamp) o.fdtmResponse.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64CeaseLogKey", this.fi64CeaseLogKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fstrCeaseReason", this.fstrCeaseReason);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrStudyLinkAction", this.fstrStudyLinkAction);
    __sqoop$field_map.put("fdtmResponse", this.fdtmResponse);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64CeaseLogKey", this.fi64CeaseLogKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fstrCeaseReason", this.fstrCeaseReason);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrStudyLinkAction", this.fstrStudyLinkAction);
    __sqoop$field_map.put("fdtmResponse", this.fdtmResponse);
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
