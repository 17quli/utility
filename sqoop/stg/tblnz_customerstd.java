// ORM class for table 'tblnz_customerstd'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:34:19 NZDT 2020
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

public class tblnz_customerstd extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrCustomerSubTypeClass", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrCustomerSubTypeClass = (String)value;
      }
    });
    setters.put("fstrCustomerSubType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrCustomerSubType = (String)value;
      }
    });
    setters.put("fstrCustomerSegment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrCustomerSegment = (String)value;
      }
    });
    setters.put("fstrSpecialFileType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrSpecialFileType = (String)value;
      }
    });
    setters.put("fblnSpecialTaxResidency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fblnSpecialTaxResidency = (Integer)value;
      }
    });
    setters.put("fstrNonResidentType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrNonResidentType = (String)value;
      }
    });
    setters.put("fstrCurrentTaxResidency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrCurrentTaxResidency = (String)value;
      }
    });
    setters.put("fstrClosureReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrClosureReason = (String)value;
      }
    });
    setters.put("fintSMSCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fintSMSCountryCode = (Integer)value;
      }
    });
    setters.put("fstrSMSAreaCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrSMSAreaCode = (String)value;
      }
    });
    setters.put("fstrSMSPhoneNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrSMSPhoneNumber = (String)value;
      }
    });
    setters.put("fdtmIncomeBalanceDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fdtmIncomeBalanceDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCustomerClass", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrCustomerClass = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customerstd.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_customerstd() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_customerstd with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrCustomerSubTypeClass;
  public String get_fstrCustomerSubTypeClass() {
    return fstrCustomerSubTypeClass;
  }
  public void set_fstrCustomerSubTypeClass(String fstrCustomerSubTypeClass) {
    this.fstrCustomerSubTypeClass = fstrCustomerSubTypeClass;
  }
  public tblnz_customerstd with_fstrCustomerSubTypeClass(String fstrCustomerSubTypeClass) {
    this.fstrCustomerSubTypeClass = fstrCustomerSubTypeClass;
    return this;
  }
  private String fstrCustomerSubType;
  public String get_fstrCustomerSubType() {
    return fstrCustomerSubType;
  }
  public void set_fstrCustomerSubType(String fstrCustomerSubType) {
    this.fstrCustomerSubType = fstrCustomerSubType;
  }
  public tblnz_customerstd with_fstrCustomerSubType(String fstrCustomerSubType) {
    this.fstrCustomerSubType = fstrCustomerSubType;
    return this;
  }
  private String fstrCustomerSegment;
  public String get_fstrCustomerSegment() {
    return fstrCustomerSegment;
  }
  public void set_fstrCustomerSegment(String fstrCustomerSegment) {
    this.fstrCustomerSegment = fstrCustomerSegment;
  }
  public tblnz_customerstd with_fstrCustomerSegment(String fstrCustomerSegment) {
    this.fstrCustomerSegment = fstrCustomerSegment;
    return this;
  }
  private String fstrSpecialFileType;
  public String get_fstrSpecialFileType() {
    return fstrSpecialFileType;
  }
  public void set_fstrSpecialFileType(String fstrSpecialFileType) {
    this.fstrSpecialFileType = fstrSpecialFileType;
  }
  public tblnz_customerstd with_fstrSpecialFileType(String fstrSpecialFileType) {
    this.fstrSpecialFileType = fstrSpecialFileType;
    return this;
  }
  private Integer fblnSpecialTaxResidency;
  public Integer get_fblnSpecialTaxResidency() {
    return fblnSpecialTaxResidency;
  }
  public void set_fblnSpecialTaxResidency(Integer fblnSpecialTaxResidency) {
    this.fblnSpecialTaxResidency = fblnSpecialTaxResidency;
  }
  public tblnz_customerstd with_fblnSpecialTaxResidency(Integer fblnSpecialTaxResidency) {
    this.fblnSpecialTaxResidency = fblnSpecialTaxResidency;
    return this;
  }
  private String fstrNonResidentType;
  public String get_fstrNonResidentType() {
    return fstrNonResidentType;
  }
  public void set_fstrNonResidentType(String fstrNonResidentType) {
    this.fstrNonResidentType = fstrNonResidentType;
  }
  public tblnz_customerstd with_fstrNonResidentType(String fstrNonResidentType) {
    this.fstrNonResidentType = fstrNonResidentType;
    return this;
  }
  private String fstrCurrentTaxResidency;
  public String get_fstrCurrentTaxResidency() {
    return fstrCurrentTaxResidency;
  }
  public void set_fstrCurrentTaxResidency(String fstrCurrentTaxResidency) {
    this.fstrCurrentTaxResidency = fstrCurrentTaxResidency;
  }
  public tblnz_customerstd with_fstrCurrentTaxResidency(String fstrCurrentTaxResidency) {
    this.fstrCurrentTaxResidency = fstrCurrentTaxResidency;
    return this;
  }
  private String fstrClosureReason;
  public String get_fstrClosureReason() {
    return fstrClosureReason;
  }
  public void set_fstrClosureReason(String fstrClosureReason) {
    this.fstrClosureReason = fstrClosureReason;
  }
  public tblnz_customerstd with_fstrClosureReason(String fstrClosureReason) {
    this.fstrClosureReason = fstrClosureReason;
    return this;
  }
  private Integer fintSMSCountryCode;
  public Integer get_fintSMSCountryCode() {
    return fintSMSCountryCode;
  }
  public void set_fintSMSCountryCode(Integer fintSMSCountryCode) {
    this.fintSMSCountryCode = fintSMSCountryCode;
  }
  public tblnz_customerstd with_fintSMSCountryCode(Integer fintSMSCountryCode) {
    this.fintSMSCountryCode = fintSMSCountryCode;
    return this;
  }
  private String fstrSMSAreaCode;
  public String get_fstrSMSAreaCode() {
    return fstrSMSAreaCode;
  }
  public void set_fstrSMSAreaCode(String fstrSMSAreaCode) {
    this.fstrSMSAreaCode = fstrSMSAreaCode;
  }
  public tblnz_customerstd with_fstrSMSAreaCode(String fstrSMSAreaCode) {
    this.fstrSMSAreaCode = fstrSMSAreaCode;
    return this;
  }
  private String fstrSMSPhoneNumber;
  public String get_fstrSMSPhoneNumber() {
    return fstrSMSPhoneNumber;
  }
  public void set_fstrSMSPhoneNumber(String fstrSMSPhoneNumber) {
    this.fstrSMSPhoneNumber = fstrSMSPhoneNumber;
  }
  public tblnz_customerstd with_fstrSMSPhoneNumber(String fstrSMSPhoneNumber) {
    this.fstrSMSPhoneNumber = fstrSMSPhoneNumber;
    return this;
  }
  private java.sql.Timestamp fdtmIncomeBalanceDate;
  public java.sql.Timestamp get_fdtmIncomeBalanceDate() {
    return fdtmIncomeBalanceDate;
  }
  public void set_fdtmIncomeBalanceDate(java.sql.Timestamp fdtmIncomeBalanceDate) {
    this.fdtmIncomeBalanceDate = fdtmIncomeBalanceDate;
  }
  public tblnz_customerstd with_fdtmIncomeBalanceDate(java.sql.Timestamp fdtmIncomeBalanceDate) {
    this.fdtmIncomeBalanceDate = fdtmIncomeBalanceDate;
    return this;
  }
  private String fstrCustomerClass;
  public String get_fstrCustomerClass() {
    return fstrCustomerClass;
  }
  public void set_fstrCustomerClass(String fstrCustomerClass) {
    this.fstrCustomerClass = fstrCustomerClass;
  }
  public tblnz_customerstd with_fstrCustomerClass(String fstrCustomerClass) {
    this.fstrCustomerClass = fstrCustomerClass;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_customerstd with_fstrWho(String fstrWho) {
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
  public tblnz_customerstd with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_customerstd)) {
      return false;
    }
    tblnz_customerstd that = (tblnz_customerstd) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrCustomerSubTypeClass == null ? that.fstrCustomerSubTypeClass == null : this.fstrCustomerSubTypeClass.equals(that.fstrCustomerSubTypeClass));
    equal = equal && (this.fstrCustomerSubType == null ? that.fstrCustomerSubType == null : this.fstrCustomerSubType.equals(that.fstrCustomerSubType));
    equal = equal && (this.fstrCustomerSegment == null ? that.fstrCustomerSegment == null : this.fstrCustomerSegment.equals(that.fstrCustomerSegment));
    equal = equal && (this.fstrSpecialFileType == null ? that.fstrSpecialFileType == null : this.fstrSpecialFileType.equals(that.fstrSpecialFileType));
    equal = equal && (this.fblnSpecialTaxResidency == null ? that.fblnSpecialTaxResidency == null : this.fblnSpecialTaxResidency.equals(that.fblnSpecialTaxResidency));
    equal = equal && (this.fstrNonResidentType == null ? that.fstrNonResidentType == null : this.fstrNonResidentType.equals(that.fstrNonResidentType));
    equal = equal && (this.fstrCurrentTaxResidency == null ? that.fstrCurrentTaxResidency == null : this.fstrCurrentTaxResidency.equals(that.fstrCurrentTaxResidency));
    equal = equal && (this.fstrClosureReason == null ? that.fstrClosureReason == null : this.fstrClosureReason.equals(that.fstrClosureReason));
    equal = equal && (this.fintSMSCountryCode == null ? that.fintSMSCountryCode == null : this.fintSMSCountryCode.equals(that.fintSMSCountryCode));
    equal = equal && (this.fstrSMSAreaCode == null ? that.fstrSMSAreaCode == null : this.fstrSMSAreaCode.equals(that.fstrSMSAreaCode));
    equal = equal && (this.fstrSMSPhoneNumber == null ? that.fstrSMSPhoneNumber == null : this.fstrSMSPhoneNumber.equals(that.fstrSMSPhoneNumber));
    equal = equal && (this.fdtmIncomeBalanceDate == null ? that.fdtmIncomeBalanceDate == null : this.fdtmIncomeBalanceDate.equals(that.fdtmIncomeBalanceDate));
    equal = equal && (this.fstrCustomerClass == null ? that.fstrCustomerClass == null : this.fstrCustomerClass.equals(that.fstrCustomerClass));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_customerstd)) {
      return false;
    }
    tblnz_customerstd that = (tblnz_customerstd) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrCustomerSubTypeClass == null ? that.fstrCustomerSubTypeClass == null : this.fstrCustomerSubTypeClass.equals(that.fstrCustomerSubTypeClass));
    equal = equal && (this.fstrCustomerSubType == null ? that.fstrCustomerSubType == null : this.fstrCustomerSubType.equals(that.fstrCustomerSubType));
    equal = equal && (this.fstrCustomerSegment == null ? that.fstrCustomerSegment == null : this.fstrCustomerSegment.equals(that.fstrCustomerSegment));
    equal = equal && (this.fstrSpecialFileType == null ? that.fstrSpecialFileType == null : this.fstrSpecialFileType.equals(that.fstrSpecialFileType));
    equal = equal && (this.fblnSpecialTaxResidency == null ? that.fblnSpecialTaxResidency == null : this.fblnSpecialTaxResidency.equals(that.fblnSpecialTaxResidency));
    equal = equal && (this.fstrNonResidentType == null ? that.fstrNonResidentType == null : this.fstrNonResidentType.equals(that.fstrNonResidentType));
    equal = equal && (this.fstrCurrentTaxResidency == null ? that.fstrCurrentTaxResidency == null : this.fstrCurrentTaxResidency.equals(that.fstrCurrentTaxResidency));
    equal = equal && (this.fstrClosureReason == null ? that.fstrClosureReason == null : this.fstrClosureReason.equals(that.fstrClosureReason));
    equal = equal && (this.fintSMSCountryCode == null ? that.fintSMSCountryCode == null : this.fintSMSCountryCode.equals(that.fintSMSCountryCode));
    equal = equal && (this.fstrSMSAreaCode == null ? that.fstrSMSAreaCode == null : this.fstrSMSAreaCode.equals(that.fstrSMSAreaCode));
    equal = equal && (this.fstrSMSPhoneNumber == null ? that.fstrSMSPhoneNumber == null : this.fstrSMSPhoneNumber.equals(that.fstrSMSPhoneNumber));
    equal = equal && (this.fdtmIncomeBalanceDate == null ? that.fdtmIncomeBalanceDate == null : this.fdtmIncomeBalanceDate.equals(that.fdtmIncomeBalanceDate));
    equal = equal && (this.fstrCustomerClass == null ? that.fstrCustomerClass == null : this.fstrCustomerClass.equals(that.fstrCustomerClass));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrCustomerSubTypeClass = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrCustomerSubType = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrCustomerSegment = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSpecialFileType = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnSpecialTaxResidency = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrNonResidentType = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrCurrentTaxResidency = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrClosureReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fintSMSCountryCode = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrSMSAreaCode = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrSMSPhoneNumber = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmIncomeBalanceDate = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fstrCustomerClass = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrCustomerSubTypeClass = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrCustomerSubType = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrCustomerSegment = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSpecialFileType = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnSpecialTaxResidency = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrNonResidentType = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrCurrentTaxResidency = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrClosureReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fintSMSCountryCode = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrSMSAreaCode = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrSMSPhoneNumber = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmIncomeBalanceDate = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fstrCustomerClass = JdbcWritableBridge.readString(14, __dbResults);
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
    JdbcWritableBridge.writeString(fstrCustomerSubTypeClass, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerSubType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerSegment, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSpecialFileType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecialTaxResidency, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrNonResidentType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrentTaxResidency, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosureReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSMSCountryCode, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSAreaCode, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSPhoneNumber, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIncomeBalanceDate, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerClass, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerSubTypeClass, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerSubType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerSegment, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSpecialFileType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecialTaxResidency, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrNonResidentType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrentTaxResidency, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosureReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSMSCountryCode, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSAreaCode, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSPhoneNumber, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIncomeBalanceDate, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerClass, 14 + __off, -9, __dbStmt);
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
        this.fstrCustomerSubTypeClass = null;
    } else {
    this.fstrCustomerSubTypeClass = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCustomerSubType = null;
    } else {
    this.fstrCustomerSubType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCustomerSegment = null;
    } else {
    this.fstrCustomerSegment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSpecialFileType = null;
    } else {
    this.fstrSpecialFileType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSpecialTaxResidency = null;
    } else {
    this.fblnSpecialTaxResidency = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNonResidentType = null;
    } else {
    this.fstrNonResidentType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCurrentTaxResidency = null;
    } else {
    this.fstrCurrentTaxResidency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrClosureReason = null;
    } else {
    this.fstrClosureReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintSMSCountryCode = null;
    } else {
    this.fintSMSCountryCode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSMSAreaCode = null;
    } else {
    this.fstrSMSAreaCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSMSPhoneNumber = null;
    } else {
    this.fstrSMSPhoneNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmIncomeBalanceDate = null;
    } else {
    this.fdtmIncomeBalanceDate = new Timestamp(__dataIn.readLong());
    this.fdtmIncomeBalanceDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCustomerClass = null;
    } else {
    this.fstrCustomerClass = Text.readString(__dataIn);
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
    if (null == this.fstrCustomerSubTypeClass) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerSubTypeClass);
    }
    if (null == this.fstrCustomerSubType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerSubType);
    }
    if (null == this.fstrCustomerSegment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerSegment);
    }
    if (null == this.fstrSpecialFileType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSpecialFileType);
    }
    if (null == this.fblnSpecialTaxResidency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecialTaxResidency);
    }
    if (null == this.fstrNonResidentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNonResidentType);
    }
    if (null == this.fstrCurrentTaxResidency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrentTaxResidency);
    }
    if (null == this.fstrClosureReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosureReason);
    }
    if (null == this.fintSMSCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSMSCountryCode);
    }
    if (null == this.fstrSMSAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSAreaCode);
    }
    if (null == this.fstrSMSPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSPhoneNumber);
    }
    if (null == this.fdtmIncomeBalanceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIncomeBalanceDate.getTime());
    __dataOut.writeInt(this.fdtmIncomeBalanceDate.getNanos());
    }
    if (null == this.fstrCustomerClass) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerClass);
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
    if (null == this.fstrCustomerSubTypeClass) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerSubTypeClass);
    }
    if (null == this.fstrCustomerSubType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerSubType);
    }
    if (null == this.fstrCustomerSegment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerSegment);
    }
    if (null == this.fstrSpecialFileType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSpecialFileType);
    }
    if (null == this.fblnSpecialTaxResidency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecialTaxResidency);
    }
    if (null == this.fstrNonResidentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNonResidentType);
    }
    if (null == this.fstrCurrentTaxResidency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrentTaxResidency);
    }
    if (null == this.fstrClosureReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosureReason);
    }
    if (null == this.fintSMSCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSMSCountryCode);
    }
    if (null == this.fstrSMSAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSAreaCode);
    }
    if (null == this.fstrSMSPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSPhoneNumber);
    }
    if (null == this.fdtmIncomeBalanceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIncomeBalanceDate.getTime());
    __dataOut.writeInt(this.fdtmIncomeBalanceDate.getNanos());
    }
    if (null == this.fstrCustomerClass) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerClass);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerSubTypeClass==null?"\\N":fstrCustomerSubTypeClass, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerSubType==null?"\\N":fstrCustomerSubType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerSegment==null?"\\N":fstrCustomerSegment, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSpecialFileType==null?"\\N":fstrSpecialFileType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecialTaxResidency==null?"\\N":"" + fblnSpecialTaxResidency, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNonResidentType==null?"\\N":fstrNonResidentType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrentTaxResidency==null?"\\N":fstrCurrentTaxResidency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosureReason==null?"\\N":fstrClosureReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSMSCountryCode==null?"\\N":"" + fintSMSCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSAreaCode==null?"\\N":fstrSMSAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSPhoneNumber==null?"\\N":fstrSMSPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIncomeBalanceDate==null?"\\N":"" + fdtmIncomeBalanceDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerClass==null?"\\N":fstrCustomerClass, " ", delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerSubTypeClass==null?"\\N":fstrCustomerSubTypeClass, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerSubType==null?"\\N":fstrCustomerSubType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerSegment==null?"\\N":fstrCustomerSegment, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSpecialFileType==null?"\\N":fstrSpecialFileType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecialTaxResidency==null?"\\N":"" + fblnSpecialTaxResidency, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNonResidentType==null?"\\N":fstrNonResidentType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrentTaxResidency==null?"\\N":fstrCurrentTaxResidency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosureReason==null?"\\N":fstrClosureReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSMSCountryCode==null?"\\N":"" + fintSMSCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSAreaCode==null?"\\N":fstrSMSAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSPhoneNumber==null?"\\N":fstrSMSPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIncomeBalanceDate==null?"\\N":"" + fdtmIncomeBalanceDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerClass==null?"\\N":fstrCustomerClass, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.fstrCustomerSubTypeClass = null; } else {
      this.fstrCustomerSubTypeClass = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerSubType = null; } else {
      this.fstrCustomerSubType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerSegment = null; } else {
      this.fstrCustomerSegment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSpecialFileType = null; } else {
      this.fstrSpecialFileType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecialTaxResidency = null; } else {
      this.fblnSpecialTaxResidency = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNonResidentType = null; } else {
      this.fstrNonResidentType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCurrentTaxResidency = null; } else {
      this.fstrCurrentTaxResidency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosureReason = null; } else {
      this.fstrClosureReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSMSCountryCode = null; } else {
      this.fintSMSCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSAreaCode = null; } else {
      this.fstrSMSAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSPhoneNumber = null; } else {
      this.fstrSMSPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIncomeBalanceDate = null; } else {
      this.fdtmIncomeBalanceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerClass = null; } else {
      this.fstrCustomerClass = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCustomerSubTypeClass = null; } else {
      this.fstrCustomerSubTypeClass = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerSubType = null; } else {
      this.fstrCustomerSubType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerSegment = null; } else {
      this.fstrCustomerSegment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSpecialFileType = null; } else {
      this.fstrSpecialFileType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecialTaxResidency = null; } else {
      this.fblnSpecialTaxResidency = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNonResidentType = null; } else {
      this.fstrNonResidentType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCurrentTaxResidency = null; } else {
      this.fstrCurrentTaxResidency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosureReason = null; } else {
      this.fstrClosureReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSMSCountryCode = null; } else {
      this.fintSMSCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSAreaCode = null; } else {
      this.fstrSMSAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSPhoneNumber = null; } else {
      this.fstrSMSPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIncomeBalanceDate = null; } else {
      this.fdtmIncomeBalanceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerClass = null; } else {
      this.fstrCustomerClass = __cur_str;
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
    tblnz_customerstd o = (tblnz_customerstd) super.clone();
    o.fdtmIncomeBalanceDate = (o.fdtmIncomeBalanceDate != null) ? (java.sql.Timestamp) o.fdtmIncomeBalanceDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_customerstd o) throws CloneNotSupportedException {
    o.fdtmIncomeBalanceDate = (o.fdtmIncomeBalanceDate != null) ? (java.sql.Timestamp) o.fdtmIncomeBalanceDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrCustomerSubTypeClass", this.fstrCustomerSubTypeClass);
    __sqoop$field_map.put("fstrCustomerSubType", this.fstrCustomerSubType);
    __sqoop$field_map.put("fstrCustomerSegment", this.fstrCustomerSegment);
    __sqoop$field_map.put("fstrSpecialFileType", this.fstrSpecialFileType);
    __sqoop$field_map.put("fblnSpecialTaxResidency", this.fblnSpecialTaxResidency);
    __sqoop$field_map.put("fstrNonResidentType", this.fstrNonResidentType);
    __sqoop$field_map.put("fstrCurrentTaxResidency", this.fstrCurrentTaxResidency);
    __sqoop$field_map.put("fstrClosureReason", this.fstrClosureReason);
    __sqoop$field_map.put("fintSMSCountryCode", this.fintSMSCountryCode);
    __sqoop$field_map.put("fstrSMSAreaCode", this.fstrSMSAreaCode);
    __sqoop$field_map.put("fstrSMSPhoneNumber", this.fstrSMSPhoneNumber);
    __sqoop$field_map.put("fdtmIncomeBalanceDate", this.fdtmIncomeBalanceDate);
    __sqoop$field_map.put("fstrCustomerClass", this.fstrCustomerClass);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrCustomerSubTypeClass", this.fstrCustomerSubTypeClass);
    __sqoop$field_map.put("fstrCustomerSubType", this.fstrCustomerSubType);
    __sqoop$field_map.put("fstrCustomerSegment", this.fstrCustomerSegment);
    __sqoop$field_map.put("fstrSpecialFileType", this.fstrSpecialFileType);
    __sqoop$field_map.put("fblnSpecialTaxResidency", this.fblnSpecialTaxResidency);
    __sqoop$field_map.put("fstrNonResidentType", this.fstrNonResidentType);
    __sqoop$field_map.put("fstrCurrentTaxResidency", this.fstrCurrentTaxResidency);
    __sqoop$field_map.put("fstrClosureReason", this.fstrClosureReason);
    __sqoop$field_map.put("fintSMSCountryCode", this.fintSMSCountryCode);
    __sqoop$field_map.put("fstrSMSAreaCode", this.fstrSMSAreaCode);
    __sqoop$field_map.put("fstrSMSPhoneNumber", this.fstrSMSPhoneNumber);
    __sqoop$field_map.put("fdtmIncomeBalanceDate", this.fdtmIncomeBalanceDate);
    __sqoop$field_map.put("fstrCustomerClass", this.fstrCustomerClass);
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
