// ORM class for table 'tblnz_studylinkvalidatelog'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:05:39 NZDT 2020
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

public class tblnz_studylinkvalidatelog extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64ValidateLogKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fi64ValidateLogKey = (Long)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrCorrelationID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fstrCorrelationID = (String)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fstrFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fstrFamilyName = (String)value;
      }
    });
    setters.put("fstrMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fstrMiddleName = (String)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fdtmApplicationDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fdtmApplicationDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fdtmDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fintValidateIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fintValidateIRD = (Integer)value;
      }
    });
    setters.put("fintValidateDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fintValidateDOB = (Integer)value;
      }
    });
    setters.put("fintValidateName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fintValidateName = (Integer)value;
      }
    });
    setters.put("fintValidateDebt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fintValidateDebt = (Integer)value;
      }
    });
    setters.put("fblnPassedValidation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fblnPassedValidation = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkvalidatelog.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_studylinkvalidatelog() {
    init0();
  }
  private Long fi64ValidateLogKey;
  public Long get_fi64ValidateLogKey() {
    return fi64ValidateLogKey;
  }
  public void set_fi64ValidateLogKey(Long fi64ValidateLogKey) {
    this.fi64ValidateLogKey = fi64ValidateLogKey;
  }
  public tblnz_studylinkvalidatelog with_fi64ValidateLogKey(Long fi64ValidateLogKey) {
    this.fi64ValidateLogKey = fi64ValidateLogKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_studylinkvalidatelog with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_studylinkvalidatelog with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private String fstrCorrelationID;
  public String get_fstrCorrelationID() {
    return fstrCorrelationID;
  }
  public void set_fstrCorrelationID(String fstrCorrelationID) {
    this.fstrCorrelationID = fstrCorrelationID;
  }
  public tblnz_studylinkvalidatelog with_fstrCorrelationID(String fstrCorrelationID) {
    this.fstrCorrelationID = fstrCorrelationID;
    return this;
  }
  private String fstrIRDNumber;
  public String get_fstrIRDNumber() {
    return fstrIRDNumber;
  }
  public void set_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
  }
  public tblnz_studylinkvalidatelog with_fstrIRDNumber(String fstrIRDNumber) {
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
  public tblnz_studylinkvalidatelog with_fstrFamilyName(String fstrFamilyName) {
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
  public tblnz_studylinkvalidatelog with_fstrMiddleName(String fstrMiddleName) {
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
  public tblnz_studylinkvalidatelog with_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
    return this;
  }
  private java.sql.Timestamp fdtmApplicationDate;
  public java.sql.Timestamp get_fdtmApplicationDate() {
    return fdtmApplicationDate;
  }
  public void set_fdtmApplicationDate(java.sql.Timestamp fdtmApplicationDate) {
    this.fdtmApplicationDate = fdtmApplicationDate;
  }
  public tblnz_studylinkvalidatelog with_fdtmApplicationDate(java.sql.Timestamp fdtmApplicationDate) {
    this.fdtmApplicationDate = fdtmApplicationDate;
    return this;
  }
  private java.sql.Timestamp fdtmDOB;
  public java.sql.Timestamp get_fdtmDOB() {
    return fdtmDOB;
  }
  public void set_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
  }
  public tblnz_studylinkvalidatelog with_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblnz_studylinkvalidatelog with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private Integer fintValidateIRD;
  public Integer get_fintValidateIRD() {
    return fintValidateIRD;
  }
  public void set_fintValidateIRD(Integer fintValidateIRD) {
    this.fintValidateIRD = fintValidateIRD;
  }
  public tblnz_studylinkvalidatelog with_fintValidateIRD(Integer fintValidateIRD) {
    this.fintValidateIRD = fintValidateIRD;
    return this;
  }
  private Integer fintValidateDOB;
  public Integer get_fintValidateDOB() {
    return fintValidateDOB;
  }
  public void set_fintValidateDOB(Integer fintValidateDOB) {
    this.fintValidateDOB = fintValidateDOB;
  }
  public tblnz_studylinkvalidatelog with_fintValidateDOB(Integer fintValidateDOB) {
    this.fintValidateDOB = fintValidateDOB;
    return this;
  }
  private Integer fintValidateName;
  public Integer get_fintValidateName() {
    return fintValidateName;
  }
  public void set_fintValidateName(Integer fintValidateName) {
    this.fintValidateName = fintValidateName;
  }
  public tblnz_studylinkvalidatelog with_fintValidateName(Integer fintValidateName) {
    this.fintValidateName = fintValidateName;
    return this;
  }
  private Integer fintValidateDebt;
  public Integer get_fintValidateDebt() {
    return fintValidateDebt;
  }
  public void set_fintValidateDebt(Integer fintValidateDebt) {
    this.fintValidateDebt = fintValidateDebt;
  }
  public tblnz_studylinkvalidatelog with_fintValidateDebt(Integer fintValidateDebt) {
    this.fintValidateDebt = fintValidateDebt;
    return this;
  }
  private Integer fblnPassedValidation;
  public Integer get_fblnPassedValidation() {
    return fblnPassedValidation;
  }
  public void set_fblnPassedValidation(Integer fblnPassedValidation) {
    this.fblnPassedValidation = fblnPassedValidation;
  }
  public tblnz_studylinkvalidatelog with_fblnPassedValidation(Integer fblnPassedValidation) {
    this.fblnPassedValidation = fblnPassedValidation;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_studylinkvalidatelog with_fstrWho(String fstrWho) {
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
  public tblnz_studylinkvalidatelog with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkvalidatelog)) {
      return false;
    }
    tblnz_studylinkvalidatelog that = (tblnz_studylinkvalidatelog) o;
    boolean equal = true;
    equal = equal && (this.fi64ValidateLogKey == null ? that.fi64ValidateLogKey == null : this.fi64ValidateLogKey.equals(that.fi64ValidateLogKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrCorrelationID == null ? that.fstrCorrelationID == null : this.fstrCorrelationID.equals(that.fstrCorrelationID));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fdtmApplicationDate == null ? that.fdtmApplicationDate == null : this.fdtmApplicationDate.equals(that.fdtmApplicationDate));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fintValidateIRD == null ? that.fintValidateIRD == null : this.fintValidateIRD.equals(that.fintValidateIRD));
    equal = equal && (this.fintValidateDOB == null ? that.fintValidateDOB == null : this.fintValidateDOB.equals(that.fintValidateDOB));
    equal = equal && (this.fintValidateName == null ? that.fintValidateName == null : this.fintValidateName.equals(that.fintValidateName));
    equal = equal && (this.fintValidateDebt == null ? that.fintValidateDebt == null : this.fintValidateDebt.equals(that.fintValidateDebt));
    equal = equal && (this.fblnPassedValidation == null ? that.fblnPassedValidation == null : this.fblnPassedValidation.equals(that.fblnPassedValidation));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkvalidatelog)) {
      return false;
    }
    tblnz_studylinkvalidatelog that = (tblnz_studylinkvalidatelog) o;
    boolean equal = true;
    equal = equal && (this.fi64ValidateLogKey == null ? that.fi64ValidateLogKey == null : this.fi64ValidateLogKey.equals(that.fi64ValidateLogKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrCorrelationID == null ? that.fstrCorrelationID == null : this.fstrCorrelationID.equals(that.fstrCorrelationID));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fdtmApplicationDate == null ? that.fdtmApplicationDate == null : this.fdtmApplicationDate.equals(that.fdtmApplicationDate));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fintValidateIRD == null ? that.fintValidateIRD == null : this.fintValidateIRD.equals(that.fintValidateIRD));
    equal = equal && (this.fintValidateDOB == null ? that.fintValidateDOB == null : this.fintValidateDOB.equals(that.fintValidateDOB));
    equal = equal && (this.fintValidateName == null ? that.fintValidateName == null : this.fintValidateName.equals(that.fintValidateName));
    equal = equal && (this.fintValidateDebt == null ? that.fintValidateDebt == null : this.fintValidateDebt.equals(that.fintValidateDebt));
    equal = equal && (this.fblnPassedValidation == null ? that.fblnPassedValidation == null : this.fblnPassedValidation.equals(that.fblnPassedValidation));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64ValidateLogKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCorrelationID = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmApplicationDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(11, __dbResults);
    this.fintValidateIRD = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fintValidateDOB = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fintValidateName = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fintValidateDebt = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnPassedValidation = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64ValidateLogKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCorrelationID = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmApplicationDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(11, __dbResults);
    this.fintValidateIRD = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fintValidateDOB = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fintValidateName = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fintValidateDebt = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnPassedValidation = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64ValidateLogKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrelationID, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApplicationDate, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintValidateIRD, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintValidateDOB, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintValidateName, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintValidateDebt, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPassedValidation, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64ValidateLogKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrelationID, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApplicationDate, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintValidateIRD, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintValidateDOB, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintValidateName, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintValidateDebt, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPassedValidation, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64ValidateLogKey = null;
    } else {
    this.fi64ValidateLogKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCorrelationID = null;
    } else {
    this.fstrCorrelationID = Text.readString(__dataIn);
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
        this.fdtmApplicationDate = null;
    } else {
    this.fdtmApplicationDate = new Timestamp(__dataIn.readLong());
    this.fdtmApplicationDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDOB = null;
    } else {
    this.fdtmDOB = new Timestamp(__dataIn.readLong());
    this.fdtmDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintValidateIRD = null;
    } else {
    this.fintValidateIRD = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintValidateDOB = null;
    } else {
    this.fintValidateDOB = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintValidateName = null;
    } else {
    this.fintValidateName = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintValidateDebt = null;
    } else {
    this.fintValidateDebt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPassedValidation = null;
    } else {
    this.fblnPassedValidation = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64ValidateLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ValidateLogKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrCorrelationID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorrelationID);
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
    if (null == this.fdtmApplicationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApplicationDate.getTime());
    __dataOut.writeInt(this.fdtmApplicationDate.getNanos());
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fintValidateIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintValidateIRD);
    }
    if (null == this.fintValidateDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintValidateDOB);
    }
    if (null == this.fintValidateName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintValidateName);
    }
    if (null == this.fintValidateDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintValidateDebt);
    }
    if (null == this.fblnPassedValidation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPassedValidation);
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
    if (null == this.fi64ValidateLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ValidateLogKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrCorrelationID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorrelationID);
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
    if (null == this.fdtmApplicationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApplicationDate.getTime());
    __dataOut.writeInt(this.fdtmApplicationDate.getNanos());
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fintValidateIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintValidateIRD);
    }
    if (null == this.fintValidateDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintValidateDOB);
    }
    if (null == this.fintValidateName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintValidateName);
    }
    if (null == this.fintValidateDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintValidateDebt);
    }
    if (null == this.fblnPassedValidation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPassedValidation);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ValidateLogKey==null?"\\N":"" + fi64ValidateLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorrelationID==null?"\\N":fstrCorrelationID, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApplicationDate==null?"\\N":"" + fdtmApplicationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintValidateIRD==null?"\\N":"" + fintValidateIRD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintValidateDOB==null?"\\N":"" + fintValidateDOB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintValidateName==null?"\\N":"" + fintValidateName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintValidateDebt==null?"\\N":"" + fintValidateDebt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPassedValidation==null?"\\N":"" + fblnPassedValidation, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ValidateLogKey==null?"\\N":"" + fi64ValidateLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorrelationID==null?"\\N":fstrCorrelationID, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApplicationDate==null?"\\N":"" + fdtmApplicationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintValidateIRD==null?"\\N":"" + fintValidateIRD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintValidateDOB==null?"\\N":"" + fintValidateDOB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintValidateName==null?"\\N":"" + fintValidateName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintValidateDebt==null?"\\N":"" + fintValidateDebt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPassedValidation==null?"\\N":"" + fblnPassedValidation, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ValidateLogKey = null; } else {
      this.fi64ValidateLogKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorrelationID = null; } else {
      this.fstrCorrelationID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApplicationDate = null; } else {
      this.fdtmApplicationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintValidateIRD = null; } else {
      this.fintValidateIRD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintValidateDOB = null; } else {
      this.fintValidateDOB = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintValidateName = null; } else {
      this.fintValidateName = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintValidateDebt = null; } else {
      this.fintValidateDebt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPassedValidation = null; } else {
      this.fblnPassedValidation = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ValidateLogKey = null; } else {
      this.fi64ValidateLogKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorrelationID = null; } else {
      this.fstrCorrelationID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApplicationDate = null; } else {
      this.fdtmApplicationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintValidateIRD = null; } else {
      this.fintValidateIRD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintValidateDOB = null; } else {
      this.fintValidateDOB = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintValidateName = null; } else {
      this.fintValidateName = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintValidateDebt = null; } else {
      this.fintValidateDebt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPassedValidation = null; } else {
      this.fblnPassedValidation = Integer.valueOf(__cur_str);
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
    tblnz_studylinkvalidatelog o = (tblnz_studylinkvalidatelog) super.clone();
    o.fdtmApplicationDate = (o.fdtmApplicationDate != null) ? (java.sql.Timestamp) o.fdtmApplicationDate.clone() : null;
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_studylinkvalidatelog o) throws CloneNotSupportedException {
    o.fdtmApplicationDate = (o.fdtmApplicationDate != null) ? (java.sql.Timestamp) o.fdtmApplicationDate.clone() : null;
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64ValidateLogKey", this.fi64ValidateLogKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrCorrelationID", this.fstrCorrelationID);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fdtmApplicationDate", this.fdtmApplicationDate);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fintValidateIRD", this.fintValidateIRD);
    __sqoop$field_map.put("fintValidateDOB", this.fintValidateDOB);
    __sqoop$field_map.put("fintValidateName", this.fintValidateName);
    __sqoop$field_map.put("fintValidateDebt", this.fintValidateDebt);
    __sqoop$field_map.put("fblnPassedValidation", this.fblnPassedValidation);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64ValidateLogKey", this.fi64ValidateLogKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrCorrelationID", this.fstrCorrelationID);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fdtmApplicationDate", this.fdtmApplicationDate);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fintValidateIRD", this.fintValidateIRD);
    __sqoop$field_map.put("fintValidateDOB", this.fintValidateDOB);
    __sqoop$field_map.put("fintValidateName", this.fintValidateName);
    __sqoop$field_map.put("fintValidateDebt", this.fintValidateDebt);
    __sqoop$field_map.put("fblnPassedValidation", this.fblnPassedValidation);
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
