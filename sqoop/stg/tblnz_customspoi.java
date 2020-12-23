// ORM class for table 'tblnz_customspoi'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:15:55 NZDT 2020
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

public class tblnz_customspoi extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64GatewayWebServiceOutKeyAdd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fi64GatewayWebServiceOutKeyAdd = (Long)value;
      }
    });
    setters.put("fi64GatewayWebServiceOutKeyDel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fi64GatewayWebServiceOutKeyDel = (Long)value;
      }
    });
    setters.put("fi64BatchKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fi64BatchKey = (Long)value;
      }
    });
    setters.put("fstrPoiId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fstrPoiId = (String)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fstrGivenName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fstrGivenName = (String)value;
      }
    });
    setters.put("fstrFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fstrFamilyName = (String)value;
      }
    });
    setters.put("fdtmDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fdtmDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPassportNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fstrPassportNumber = (String)value;
      }
    });
    setters.put("fstrPassportCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fstrPassportCountryCode = (String)value;
      }
    });
    setters.put("fdtmAdded", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fdtmAdded = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDeleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fdtmDeleted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLastProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fdtmLastProcessed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnAdd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fblnAdd = (Integer)value;
      }
    });
    setters.put("fblnDelete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fblnDelete = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_customspoi.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_customspoi() {
    init0();
  }
  private Long fi64GatewayWebServiceOutKeyAdd;
  public Long get_fi64GatewayWebServiceOutKeyAdd() {
    return fi64GatewayWebServiceOutKeyAdd;
  }
  public void set_fi64GatewayWebServiceOutKeyAdd(Long fi64GatewayWebServiceOutKeyAdd) {
    this.fi64GatewayWebServiceOutKeyAdd = fi64GatewayWebServiceOutKeyAdd;
  }
  public tblnz_customspoi with_fi64GatewayWebServiceOutKeyAdd(Long fi64GatewayWebServiceOutKeyAdd) {
    this.fi64GatewayWebServiceOutKeyAdd = fi64GatewayWebServiceOutKeyAdd;
    return this;
  }
  private Long fi64GatewayWebServiceOutKeyDel;
  public Long get_fi64GatewayWebServiceOutKeyDel() {
    return fi64GatewayWebServiceOutKeyDel;
  }
  public void set_fi64GatewayWebServiceOutKeyDel(Long fi64GatewayWebServiceOutKeyDel) {
    this.fi64GatewayWebServiceOutKeyDel = fi64GatewayWebServiceOutKeyDel;
  }
  public tblnz_customspoi with_fi64GatewayWebServiceOutKeyDel(Long fi64GatewayWebServiceOutKeyDel) {
    this.fi64GatewayWebServiceOutKeyDel = fi64GatewayWebServiceOutKeyDel;
    return this;
  }
  private Long fi64BatchKey;
  public Long get_fi64BatchKey() {
    return fi64BatchKey;
  }
  public void set_fi64BatchKey(Long fi64BatchKey) {
    this.fi64BatchKey = fi64BatchKey;
  }
  public tblnz_customspoi with_fi64BatchKey(Long fi64BatchKey) {
    this.fi64BatchKey = fi64BatchKey;
    return this;
  }
  private String fstrPoiId;
  public String get_fstrPoiId() {
    return fstrPoiId;
  }
  public void set_fstrPoiId(String fstrPoiId) {
    this.fstrPoiId = fstrPoiId;
  }
  public tblnz_customspoi with_fstrPoiId(String fstrPoiId) {
    this.fstrPoiId = fstrPoiId;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_customspoi with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_customspoi with_flngAccountKey(Integer flngAccountKey) {
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
  public tblnz_customspoi with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private String fstrIRDNumber;
  public String get_fstrIRDNumber() {
    return fstrIRDNumber;
  }
  public void set_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
  }
  public tblnz_customspoi with_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
    return this;
  }
  private String fstrGivenName;
  public String get_fstrGivenName() {
    return fstrGivenName;
  }
  public void set_fstrGivenName(String fstrGivenName) {
    this.fstrGivenName = fstrGivenName;
  }
  public tblnz_customspoi with_fstrGivenName(String fstrGivenName) {
    this.fstrGivenName = fstrGivenName;
    return this;
  }
  private String fstrFamilyName;
  public String get_fstrFamilyName() {
    return fstrFamilyName;
  }
  public void set_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
  }
  public tblnz_customspoi with_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
    return this;
  }
  private java.sql.Timestamp fdtmDOB;
  public java.sql.Timestamp get_fdtmDOB() {
    return fdtmDOB;
  }
  public void set_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
  }
  public tblnz_customspoi with_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
    return this;
  }
  private String fstrPassportNumber;
  public String get_fstrPassportNumber() {
    return fstrPassportNumber;
  }
  public void set_fstrPassportNumber(String fstrPassportNumber) {
    this.fstrPassportNumber = fstrPassportNumber;
  }
  public tblnz_customspoi with_fstrPassportNumber(String fstrPassportNumber) {
    this.fstrPassportNumber = fstrPassportNumber;
    return this;
  }
  private String fstrPassportCountryCode;
  public String get_fstrPassportCountryCode() {
    return fstrPassportCountryCode;
  }
  public void set_fstrPassportCountryCode(String fstrPassportCountryCode) {
    this.fstrPassportCountryCode = fstrPassportCountryCode;
  }
  public tblnz_customspoi with_fstrPassportCountryCode(String fstrPassportCountryCode) {
    this.fstrPassportCountryCode = fstrPassportCountryCode;
    return this;
  }
  private java.sql.Timestamp fdtmAdded;
  public java.sql.Timestamp get_fdtmAdded() {
    return fdtmAdded;
  }
  public void set_fdtmAdded(java.sql.Timestamp fdtmAdded) {
    this.fdtmAdded = fdtmAdded;
  }
  public tblnz_customspoi with_fdtmAdded(java.sql.Timestamp fdtmAdded) {
    this.fdtmAdded = fdtmAdded;
    return this;
  }
  private java.sql.Timestamp fdtmDeleted;
  public java.sql.Timestamp get_fdtmDeleted() {
    return fdtmDeleted;
  }
  public void set_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
  }
  public tblnz_customspoi with_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
    return this;
  }
  private java.sql.Timestamp fdtmLastProcessed;
  public java.sql.Timestamp get_fdtmLastProcessed() {
    return fdtmLastProcessed;
  }
  public void set_fdtmLastProcessed(java.sql.Timestamp fdtmLastProcessed) {
    this.fdtmLastProcessed = fdtmLastProcessed;
  }
  public tblnz_customspoi with_fdtmLastProcessed(java.sql.Timestamp fdtmLastProcessed) {
    this.fdtmLastProcessed = fdtmLastProcessed;
    return this;
  }
  private Integer fblnAdd;
  public Integer get_fblnAdd() {
    return fblnAdd;
  }
  public void set_fblnAdd(Integer fblnAdd) {
    this.fblnAdd = fblnAdd;
  }
  public tblnz_customspoi with_fblnAdd(Integer fblnAdd) {
    this.fblnAdd = fblnAdd;
    return this;
  }
  private Integer fblnDelete;
  public Integer get_fblnDelete() {
    return fblnDelete;
  }
  public void set_fblnDelete(Integer fblnDelete) {
    this.fblnDelete = fblnDelete;
  }
  public tblnz_customspoi with_fblnDelete(Integer fblnDelete) {
    this.fblnDelete = fblnDelete;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_customspoi with_fstrWho(String fstrWho) {
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
  public tblnz_customspoi with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_customspoi)) {
      return false;
    }
    tblnz_customspoi that = (tblnz_customspoi) o;
    boolean equal = true;
    equal = equal && (this.fi64GatewayWebServiceOutKeyAdd == null ? that.fi64GatewayWebServiceOutKeyAdd == null : this.fi64GatewayWebServiceOutKeyAdd.equals(that.fi64GatewayWebServiceOutKeyAdd));
    equal = equal && (this.fi64GatewayWebServiceOutKeyDel == null ? that.fi64GatewayWebServiceOutKeyDel == null : this.fi64GatewayWebServiceOutKeyDel.equals(that.fi64GatewayWebServiceOutKeyDel));
    equal = equal && (this.fi64BatchKey == null ? that.fi64BatchKey == null : this.fi64BatchKey.equals(that.fi64BatchKey));
    equal = equal && (this.fstrPoiId == null ? that.fstrPoiId == null : this.fstrPoiId.equals(that.fstrPoiId));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrGivenName == null ? that.fstrGivenName == null : this.fstrGivenName.equals(that.fstrGivenName));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrPassportNumber == null ? that.fstrPassportNumber == null : this.fstrPassportNumber.equals(that.fstrPassportNumber));
    equal = equal && (this.fstrPassportCountryCode == null ? that.fstrPassportCountryCode == null : this.fstrPassportCountryCode.equals(that.fstrPassportCountryCode));
    equal = equal && (this.fdtmAdded == null ? that.fdtmAdded == null : this.fdtmAdded.equals(that.fdtmAdded));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fdtmLastProcessed == null ? that.fdtmLastProcessed == null : this.fdtmLastProcessed.equals(that.fdtmLastProcessed));
    equal = equal && (this.fblnAdd == null ? that.fblnAdd == null : this.fblnAdd.equals(that.fblnAdd));
    equal = equal && (this.fblnDelete == null ? that.fblnDelete == null : this.fblnDelete.equals(that.fblnDelete));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_customspoi)) {
      return false;
    }
    tblnz_customspoi that = (tblnz_customspoi) o;
    boolean equal = true;
    equal = equal && (this.fi64GatewayWebServiceOutKeyAdd == null ? that.fi64GatewayWebServiceOutKeyAdd == null : this.fi64GatewayWebServiceOutKeyAdd.equals(that.fi64GatewayWebServiceOutKeyAdd));
    equal = equal && (this.fi64GatewayWebServiceOutKeyDel == null ? that.fi64GatewayWebServiceOutKeyDel == null : this.fi64GatewayWebServiceOutKeyDel.equals(that.fi64GatewayWebServiceOutKeyDel));
    equal = equal && (this.fi64BatchKey == null ? that.fi64BatchKey == null : this.fi64BatchKey.equals(that.fi64BatchKey));
    equal = equal && (this.fstrPoiId == null ? that.fstrPoiId == null : this.fstrPoiId.equals(that.fstrPoiId));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrGivenName == null ? that.fstrGivenName == null : this.fstrGivenName.equals(that.fstrGivenName));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrPassportNumber == null ? that.fstrPassportNumber == null : this.fstrPassportNumber.equals(that.fstrPassportNumber));
    equal = equal && (this.fstrPassportCountryCode == null ? that.fstrPassportCountryCode == null : this.fstrPassportCountryCode.equals(that.fstrPassportCountryCode));
    equal = equal && (this.fdtmAdded == null ? that.fdtmAdded == null : this.fdtmAdded.equals(that.fdtmAdded));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fdtmLastProcessed == null ? that.fdtmLastProcessed == null : this.fdtmLastProcessed.equals(that.fdtmLastProcessed));
    equal = equal && (this.fblnAdd == null ? that.fblnAdd == null : this.fblnAdd.equals(that.fblnAdd));
    equal = equal && (this.fblnDelete == null ? that.fblnDelete == null : this.fblnDelete.equals(that.fblnDelete));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64GatewayWebServiceOutKeyAdd = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64GatewayWebServiceOutKeyDel = JdbcWritableBridge.readLong(2, __dbResults);
    this.fi64BatchKey = JdbcWritableBridge.readLong(3, __dbResults);
    this.fstrPoiId = JdbcWritableBridge.readString(4, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrGivenName = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrPassportNumber = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPassportCountryCode = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmAdded = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmLastProcessed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fblnAdd = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnDelete = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64GatewayWebServiceOutKeyAdd = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64GatewayWebServiceOutKeyDel = JdbcWritableBridge.readLong(2, __dbResults);
    this.fi64BatchKey = JdbcWritableBridge.readLong(3, __dbResults);
    this.fstrPoiId = JdbcWritableBridge.readString(4, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrGivenName = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrPassportNumber = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPassportCountryCode = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmAdded = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmLastProcessed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fblnAdd = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnDelete = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(20, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64GatewayWebServiceOutKeyAdd, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64GatewayWebServiceOutKeyDel, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64BatchKey, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPoiId, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrGivenName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPassportNumber, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPassportCountryCode, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAdded, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastProcessed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAdd, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDelete, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64GatewayWebServiceOutKeyAdd, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64GatewayWebServiceOutKeyDel, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64BatchKey, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPoiId, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrGivenName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPassportNumber, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPassportCountryCode, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAdded, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastProcessed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAdd, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDelete, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64GatewayWebServiceOutKeyAdd = null;
    } else {
    this.fi64GatewayWebServiceOutKeyAdd = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64GatewayWebServiceOutKeyDel = null;
    } else {
    this.fi64GatewayWebServiceOutKeyDel = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64BatchKey = null;
    } else {
    this.fi64BatchKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPoiId = null;
    } else {
    this.fstrPoiId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrIRDNumber = null;
    } else {
    this.fstrIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrGivenName = null;
    } else {
    this.fstrGivenName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFamilyName = null;
    } else {
    this.fstrFamilyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDOB = null;
    } else {
    this.fdtmDOB = new Timestamp(__dataIn.readLong());
    this.fdtmDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPassportNumber = null;
    } else {
    this.fstrPassportNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPassportCountryCode = null;
    } else {
    this.fstrPassportCountryCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAdded = null;
    } else {
    this.fdtmAdded = new Timestamp(__dataIn.readLong());
    this.fdtmAdded.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDeleted = null;
    } else {
    this.fdtmDeleted = new Timestamp(__dataIn.readLong());
    this.fdtmDeleted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastProcessed = null;
    } else {
    this.fdtmLastProcessed = new Timestamp(__dataIn.readLong());
    this.fdtmLastProcessed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAdd = null;
    } else {
    this.fblnAdd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDelete = null;
    } else {
    this.fblnDelete = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64GatewayWebServiceOutKeyAdd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64GatewayWebServiceOutKeyAdd);
    }
    if (null == this.fi64GatewayWebServiceOutKeyDel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64GatewayWebServiceOutKeyDel);
    }
    if (null == this.fi64BatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64BatchKey);
    }
    if (null == this.fstrPoiId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPoiId);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
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
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrGivenName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrGivenName);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fstrPassportNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPassportNumber);
    }
    if (null == this.fstrPassportCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPassportCountryCode);
    }
    if (null == this.fdtmAdded) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAdded.getTime());
    __dataOut.writeInt(this.fdtmAdded.getNanos());
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
    }
    if (null == this.fdtmLastProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastProcessed.getTime());
    __dataOut.writeInt(this.fdtmLastProcessed.getNanos());
    }
    if (null == this.fblnAdd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAdd);
    }
    if (null == this.fblnDelete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDelete);
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
    if (null == this.fi64GatewayWebServiceOutKeyAdd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64GatewayWebServiceOutKeyAdd);
    }
    if (null == this.fi64GatewayWebServiceOutKeyDel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64GatewayWebServiceOutKeyDel);
    }
    if (null == this.fi64BatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64BatchKey);
    }
    if (null == this.fstrPoiId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPoiId);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
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
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrGivenName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrGivenName);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fstrPassportNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPassportNumber);
    }
    if (null == this.fstrPassportCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPassportCountryCode);
    }
    if (null == this.fdtmAdded) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAdded.getTime());
    __dataOut.writeInt(this.fdtmAdded.getNanos());
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
    }
    if (null == this.fdtmLastProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastProcessed.getTime());
    __dataOut.writeInt(this.fdtmLastProcessed.getNanos());
    }
    if (null == this.fblnAdd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAdd);
    }
    if (null == this.fblnDelete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDelete);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64GatewayWebServiceOutKeyAdd==null?"\\N":"" + fi64GatewayWebServiceOutKeyAdd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64GatewayWebServiceOutKeyDel==null?"\\N":"" + fi64GatewayWebServiceOutKeyDel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64BatchKey==null?"\\N":"" + fi64BatchKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPoiId==null?"\\N":fstrPoiId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrGivenName==null?"\\N":fstrGivenName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPassportNumber==null?"\\N":fstrPassportNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPassportCountryCode==null?"\\N":fstrPassportCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAdded==null?"\\N":"" + fdtmAdded, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastProcessed==null?"\\N":"" + fdtmLastProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAdd==null?"\\N":"" + fblnAdd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDelete==null?"\\N":"" + fblnDelete, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64GatewayWebServiceOutKeyAdd==null?"\\N":"" + fi64GatewayWebServiceOutKeyAdd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64GatewayWebServiceOutKeyDel==null?"\\N":"" + fi64GatewayWebServiceOutKeyDel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64BatchKey==null?"\\N":"" + fi64BatchKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPoiId==null?"\\N":fstrPoiId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrGivenName==null?"\\N":fstrGivenName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPassportNumber==null?"\\N":fstrPassportNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPassportCountryCode==null?"\\N":fstrPassportCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAdded==null?"\\N":"" + fdtmAdded, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastProcessed==null?"\\N":"" + fdtmLastProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAdd==null?"\\N":"" + fblnAdd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDelete==null?"\\N":"" + fblnDelete, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64GatewayWebServiceOutKeyAdd = null; } else {
      this.fi64GatewayWebServiceOutKeyAdd = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64GatewayWebServiceOutKeyDel = null; } else {
      this.fi64GatewayWebServiceOutKeyDel = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64BatchKey = null; } else {
      this.fi64BatchKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPoiId = null; } else {
      this.fstrPoiId = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrGivenName = null; } else {
      this.fstrGivenName = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPassportNumber = null; } else {
      this.fstrPassportNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPassportCountryCode = null; } else {
      this.fstrPassportCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAdded = null; } else {
      this.fdtmAdded = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeleted = null; } else {
      this.fdtmDeleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastProcessed = null; } else {
      this.fdtmLastProcessed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAdd = null; } else {
      this.fblnAdd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDelete = null; } else {
      this.fblnDelete = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64GatewayWebServiceOutKeyAdd = null; } else {
      this.fi64GatewayWebServiceOutKeyAdd = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64GatewayWebServiceOutKeyDel = null; } else {
      this.fi64GatewayWebServiceOutKeyDel = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64BatchKey = null; } else {
      this.fi64BatchKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPoiId = null; } else {
      this.fstrPoiId = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrGivenName = null; } else {
      this.fstrGivenName = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPassportNumber = null; } else {
      this.fstrPassportNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPassportCountryCode = null; } else {
      this.fstrPassportCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAdded = null; } else {
      this.fdtmAdded = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeleted = null; } else {
      this.fdtmDeleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastProcessed = null; } else {
      this.fdtmLastProcessed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAdd = null; } else {
      this.fblnAdd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDelete = null; } else {
      this.fblnDelete = Integer.valueOf(__cur_str);
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
    tblnz_customspoi o = (tblnz_customspoi) super.clone();
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmAdded = (o.fdtmAdded != null) ? (java.sql.Timestamp) o.fdtmAdded.clone() : null;
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmLastProcessed = (o.fdtmLastProcessed != null) ? (java.sql.Timestamp) o.fdtmLastProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_customspoi o) throws CloneNotSupportedException {
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmAdded = (o.fdtmAdded != null) ? (java.sql.Timestamp) o.fdtmAdded.clone() : null;
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmLastProcessed = (o.fdtmLastProcessed != null) ? (java.sql.Timestamp) o.fdtmLastProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64GatewayWebServiceOutKeyAdd", this.fi64GatewayWebServiceOutKeyAdd);
    __sqoop$field_map.put("fi64GatewayWebServiceOutKeyDel", this.fi64GatewayWebServiceOutKeyDel);
    __sqoop$field_map.put("fi64BatchKey", this.fi64BatchKey);
    __sqoop$field_map.put("fstrPoiId", this.fstrPoiId);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrGivenName", this.fstrGivenName);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrPassportNumber", this.fstrPassportNumber);
    __sqoop$field_map.put("fstrPassportCountryCode", this.fstrPassportCountryCode);
    __sqoop$field_map.put("fdtmAdded", this.fdtmAdded);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
    __sqoop$field_map.put("fdtmLastProcessed", this.fdtmLastProcessed);
    __sqoop$field_map.put("fblnAdd", this.fblnAdd);
    __sqoop$field_map.put("fblnDelete", this.fblnDelete);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64GatewayWebServiceOutKeyAdd", this.fi64GatewayWebServiceOutKeyAdd);
    __sqoop$field_map.put("fi64GatewayWebServiceOutKeyDel", this.fi64GatewayWebServiceOutKeyDel);
    __sqoop$field_map.put("fi64BatchKey", this.fi64BatchKey);
    __sqoop$field_map.put("fstrPoiId", this.fstrPoiId);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrGivenName", this.fstrGivenName);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrPassportNumber", this.fstrPassportNumber);
    __sqoop$field_map.put("fstrPassportCountryCode", this.fstrPassportCountryCode);
    __sqoop$field_map.put("fdtmAdded", this.fdtmAdded);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
    __sqoop$field_map.put("fdtmLastProcessed", this.fdtmLastProcessed);
    __sqoop$field_map.put("fblnAdd", this.fblnAdd);
    __sqoop$field_map.put("fblnDelete", this.fblnDelete);
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
