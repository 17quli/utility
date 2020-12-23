// ORM class for table 'tblnz_kssresidual'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:16:15 NZDT 2020
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

public class tblnz_kssresidual extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngReturnKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.flngReturnKey = (Integer)value;
      }
    });
    setters.put("flngItemNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.flngItemNumber = (Integer)value;
      }
    });
    setters.put("fstrContributionType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fstrContributionType = (String)value;
      }
    });
    setters.put("fcurContributionAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fcurContributionAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmPayDayPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fdtmPayDayPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fi64ContributionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fi64ContributionKey = (Long)value;
      }
    });
    setters.put("flngMemberAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.flngMemberAccountKey = (Integer)value;
      }
    });
    setters.put("fstrMemberIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fstrMemberIRD = (String)value;
      }
    });
    setters.put("flngRelationshipKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.flngRelationshipKey = (Integer)value;
      }
    });
    setters.put("flngEmployerCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.flngEmployerCustomerKey = (Integer)value;
      }
    });
    setters.put("flngEmployerAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.flngEmployerAccountKey = (Integer)value;
      }
    });
    setters.put("fblnRegister", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fblnRegister = (Integer)value;
      }
    });
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("fblnWorkItem", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fblnWorkItem = (Integer)value;
      }
    });
    setters.put("flngWorkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.flngWorkKey = (Integer)value;
      }
    });
    setters.put("fblnPartialOptOut", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fblnPartialOptOut = (Integer)value;
      }
    });
    setters.put("fblnComplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fblnComplete = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssresidual.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_kssresidual() {
    init0();
  }
  private Integer flngReturnKey;
  public Integer get_flngReturnKey() {
    return flngReturnKey;
  }
  public void set_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
  }
  public tblnz_kssresidual with_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
    return this;
  }
  private Integer flngItemNumber;
  public Integer get_flngItemNumber() {
    return flngItemNumber;
  }
  public void set_flngItemNumber(Integer flngItemNumber) {
    this.flngItemNumber = flngItemNumber;
  }
  public tblnz_kssresidual with_flngItemNumber(Integer flngItemNumber) {
    this.flngItemNumber = flngItemNumber;
    return this;
  }
  private String fstrContributionType;
  public String get_fstrContributionType() {
    return fstrContributionType;
  }
  public void set_fstrContributionType(String fstrContributionType) {
    this.fstrContributionType = fstrContributionType;
  }
  public tblnz_kssresidual with_fstrContributionType(String fstrContributionType) {
    this.fstrContributionType = fstrContributionType;
    return this;
  }
  private java.math.BigDecimal fcurContributionAmount;
  public java.math.BigDecimal get_fcurContributionAmount() {
    return fcurContributionAmount;
  }
  public void set_fcurContributionAmount(java.math.BigDecimal fcurContributionAmount) {
    this.fcurContributionAmount = fcurContributionAmount;
  }
  public tblnz_kssresidual with_fcurContributionAmount(java.math.BigDecimal fcurContributionAmount) {
    this.fcurContributionAmount = fcurContributionAmount;
    return this;
  }
  private java.sql.Timestamp fdtmPayDayPeriod;
  public java.sql.Timestamp get_fdtmPayDayPeriod() {
    return fdtmPayDayPeriod;
  }
  public void set_fdtmPayDayPeriod(java.sql.Timestamp fdtmPayDayPeriod) {
    this.fdtmPayDayPeriod = fdtmPayDayPeriod;
  }
  public tblnz_kssresidual with_fdtmPayDayPeriod(java.sql.Timestamp fdtmPayDayPeriod) {
    this.fdtmPayDayPeriod = fdtmPayDayPeriod;
    return this;
  }
  private Long fi64ContributionKey;
  public Long get_fi64ContributionKey() {
    return fi64ContributionKey;
  }
  public void set_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
  }
  public tblnz_kssresidual with_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
    return this;
  }
  private Integer flngMemberAccountKey;
  public Integer get_flngMemberAccountKey() {
    return flngMemberAccountKey;
  }
  public void set_flngMemberAccountKey(Integer flngMemberAccountKey) {
    this.flngMemberAccountKey = flngMemberAccountKey;
  }
  public tblnz_kssresidual with_flngMemberAccountKey(Integer flngMemberAccountKey) {
    this.flngMemberAccountKey = flngMemberAccountKey;
    return this;
  }
  private String fstrMemberIRD;
  public String get_fstrMemberIRD() {
    return fstrMemberIRD;
  }
  public void set_fstrMemberIRD(String fstrMemberIRD) {
    this.fstrMemberIRD = fstrMemberIRD;
  }
  public tblnz_kssresidual with_fstrMemberIRD(String fstrMemberIRD) {
    this.fstrMemberIRD = fstrMemberIRD;
    return this;
  }
  private Integer flngRelationshipKey;
  public Integer get_flngRelationshipKey() {
    return flngRelationshipKey;
  }
  public void set_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
  }
  public tblnz_kssresidual with_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
    return this;
  }
  private Integer flngEmployerCustomerKey;
  public Integer get_flngEmployerCustomerKey() {
    return flngEmployerCustomerKey;
  }
  public void set_flngEmployerCustomerKey(Integer flngEmployerCustomerKey) {
    this.flngEmployerCustomerKey = flngEmployerCustomerKey;
  }
  public tblnz_kssresidual with_flngEmployerCustomerKey(Integer flngEmployerCustomerKey) {
    this.flngEmployerCustomerKey = flngEmployerCustomerKey;
    return this;
  }
  private Integer flngEmployerAccountKey;
  public Integer get_flngEmployerAccountKey() {
    return flngEmployerAccountKey;
  }
  public void set_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
  }
  public tblnz_kssresidual with_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
    return this;
  }
  private Integer fblnRegister;
  public Integer get_fblnRegister() {
    return fblnRegister;
  }
  public void set_fblnRegister(Integer fblnRegister) {
    this.fblnRegister = fblnRegister;
  }
  public tblnz_kssresidual with_fblnRegister(Integer fblnRegister) {
    this.fblnRegister = fblnRegister;
    return this;
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tblnz_kssresidual with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private Integer fblnWorkItem;
  public Integer get_fblnWorkItem() {
    return fblnWorkItem;
  }
  public void set_fblnWorkItem(Integer fblnWorkItem) {
    this.fblnWorkItem = fblnWorkItem;
  }
  public tblnz_kssresidual with_fblnWorkItem(Integer fblnWorkItem) {
    this.fblnWorkItem = fblnWorkItem;
    return this;
  }
  private Integer flngWorkKey;
  public Integer get_flngWorkKey() {
    return flngWorkKey;
  }
  public void set_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
  }
  public tblnz_kssresidual with_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
    return this;
  }
  private Integer fblnPartialOptOut;
  public Integer get_fblnPartialOptOut() {
    return fblnPartialOptOut;
  }
  public void set_fblnPartialOptOut(Integer fblnPartialOptOut) {
    this.fblnPartialOptOut = fblnPartialOptOut;
  }
  public tblnz_kssresidual with_fblnPartialOptOut(Integer fblnPartialOptOut) {
    this.fblnPartialOptOut = fblnPartialOptOut;
    return this;
  }
  private Integer fblnComplete;
  public Integer get_fblnComplete() {
    return fblnComplete;
  }
  public void set_fblnComplete(Integer fblnComplete) {
    this.fblnComplete = fblnComplete;
  }
  public tblnz_kssresidual with_fblnComplete(Integer fblnComplete) {
    this.fblnComplete = fblnComplete;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_kssresidual with_fstrWho(String fstrWho) {
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
  public tblnz_kssresidual with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_kssresidual)) {
      return false;
    }
    tblnz_kssresidual that = (tblnz_kssresidual) o;
    boolean equal = true;
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngItemNumber == null ? that.flngItemNumber == null : this.flngItemNumber.equals(that.flngItemNumber));
    equal = equal && (this.fstrContributionType == null ? that.fstrContributionType == null : this.fstrContributionType.equals(that.fstrContributionType));
    equal = equal && (this.fcurContributionAmount == null ? that.fcurContributionAmount == null : this.fcurContributionAmount.equals(that.fcurContributionAmount));
    equal = equal && (this.fdtmPayDayPeriod == null ? that.fdtmPayDayPeriod == null : this.fdtmPayDayPeriod.equals(that.fdtmPayDayPeriod));
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.flngMemberAccountKey == null ? that.flngMemberAccountKey == null : this.flngMemberAccountKey.equals(that.flngMemberAccountKey));
    equal = equal && (this.fstrMemberIRD == null ? that.fstrMemberIRD == null : this.fstrMemberIRD.equals(that.fstrMemberIRD));
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.flngEmployerCustomerKey == null ? that.flngEmployerCustomerKey == null : this.flngEmployerCustomerKey.equals(that.flngEmployerCustomerKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.fblnRegister == null ? that.fblnRegister == null : this.fblnRegister.equals(that.fblnRegister));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fblnWorkItem == null ? that.fblnWorkItem == null : this.fblnWorkItem.equals(that.fblnWorkItem));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.fblnPartialOptOut == null ? that.fblnPartialOptOut == null : this.fblnPartialOptOut.equals(that.fblnPartialOptOut));
    equal = equal && (this.fblnComplete == null ? that.fblnComplete == null : this.fblnComplete.equals(that.fblnComplete));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_kssresidual)) {
      return false;
    }
    tblnz_kssresidual that = (tblnz_kssresidual) o;
    boolean equal = true;
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngItemNumber == null ? that.flngItemNumber == null : this.flngItemNumber.equals(that.flngItemNumber));
    equal = equal && (this.fstrContributionType == null ? that.fstrContributionType == null : this.fstrContributionType.equals(that.fstrContributionType));
    equal = equal && (this.fcurContributionAmount == null ? that.fcurContributionAmount == null : this.fcurContributionAmount.equals(that.fcurContributionAmount));
    equal = equal && (this.fdtmPayDayPeriod == null ? that.fdtmPayDayPeriod == null : this.fdtmPayDayPeriod.equals(that.fdtmPayDayPeriod));
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.flngMemberAccountKey == null ? that.flngMemberAccountKey == null : this.flngMemberAccountKey.equals(that.flngMemberAccountKey));
    equal = equal && (this.fstrMemberIRD == null ? that.fstrMemberIRD == null : this.fstrMemberIRD.equals(that.fstrMemberIRD));
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.flngEmployerCustomerKey == null ? that.flngEmployerCustomerKey == null : this.flngEmployerCustomerKey.equals(that.flngEmployerCustomerKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.fblnRegister == null ? that.fblnRegister == null : this.fblnRegister.equals(that.fblnRegister));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fblnWorkItem == null ? that.fblnWorkItem == null : this.fblnWorkItem.equals(that.fblnWorkItem));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.fblnPartialOptOut == null ? that.fblnPartialOptOut == null : this.fblnPartialOptOut.equals(that.fblnPartialOptOut));
    equal = equal && (this.fblnComplete == null ? that.fblnComplete == null : this.fblnComplete.equals(that.fblnComplete));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngReturnKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngItemNumber = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrContributionType = JdbcWritableBridge.readString(3, __dbResults);
    this.fcurContributionAmount = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fdtmPayDayPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fi64ContributionKey = JdbcWritableBridge.readLong(6, __dbResults);
    this.flngMemberAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrMemberIRD = JdbcWritableBridge.readString(8, __dbResults);
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngEmployerCustomerKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnRegister = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnWorkItem = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnPartialOptOut = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnComplete = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngReturnKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngItemNumber = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrContributionType = JdbcWritableBridge.readString(3, __dbResults);
    this.fcurContributionAmount = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fdtmPayDayPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fi64ContributionKey = JdbcWritableBridge.readLong(6, __dbResults);
    this.flngMemberAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrMemberIRD = JdbcWritableBridge.readString(8, __dbResults);
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngEmployerCustomerKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnRegister = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnWorkItem = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnPartialOptOut = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnComplete = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngReturnKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngItemNumber, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrContributionType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContributionAmount, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionKey, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberIRD, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerCustomerKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRegister, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWorkItem, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPartialOptOut, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnComplete, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngReturnKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngItemNumber, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrContributionType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContributionAmount, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionKey, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberIRD, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerCustomerKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRegister, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWorkItem, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPartialOptOut, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnComplete, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngReturnKey = null;
    } else {
    this.flngReturnKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngItemNumber = null;
    } else {
    this.flngItemNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContributionType = null;
    } else {
    this.fstrContributionType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurContributionAmount = null;
    } else {
    this.fcurContributionAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPayDayPeriod = null;
    } else {
    this.fdtmPayDayPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmPayDayPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ContributionKey = null;
    } else {
    this.fi64ContributionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMemberAccountKey = null;
    } else {
    this.flngMemberAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberIRD = null;
    } else {
    this.fstrMemberIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngRelationshipKey = null;
    } else {
    this.flngRelationshipKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployerCustomerKey = null;
    } else {
    this.flngEmployerCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployerAccountKey = null;
    } else {
    this.flngEmployerAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRegister = null;
    } else {
    this.fblnRegister = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnWorkItem = null;
    } else {
    this.fblnWorkItem = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngWorkKey = null;
    } else {
    this.flngWorkKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPartialOptOut = null;
    } else {
    this.fblnPartialOptOut = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnComplete = null;
    } else {
    this.fblnComplete = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngItemNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngItemNumber);
    }
    if (null == this.fstrContributionType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContributionType);
    }
    if (null == this.fcurContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContributionAmount, __dataOut);
    }
    if (null == this.fdtmPayDayPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayPeriod.getTime());
    __dataOut.writeInt(this.fdtmPayDayPeriod.getNanos());
    }
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
    }
    if (null == this.flngMemberAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberAccountKey);
    }
    if (null == this.fstrMemberIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberIRD);
    }
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
    }
    if (null == this.flngEmployerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerCustomerKey);
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.fblnRegister) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRegister);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fblnWorkItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWorkItem);
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.fblnPartialOptOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPartialOptOut);
    }
    if (null == this.fblnComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnComplete);
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngItemNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngItemNumber);
    }
    if (null == this.fstrContributionType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContributionType);
    }
    if (null == this.fcurContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContributionAmount, __dataOut);
    }
    if (null == this.fdtmPayDayPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayPeriod.getTime());
    __dataOut.writeInt(this.fdtmPayDayPeriod.getNanos());
    }
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
    }
    if (null == this.flngMemberAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberAccountKey);
    }
    if (null == this.fstrMemberIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberIRD);
    }
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
    }
    if (null == this.flngEmployerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerCustomerKey);
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.fblnRegister) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRegister);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fblnWorkItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWorkItem);
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.fblnPartialOptOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPartialOptOut);
    }
    if (null == this.fblnComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnComplete);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngItemNumber==null?"\\N":"" + flngItemNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContributionType==null?"\\N":fstrContributionType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContributionAmount==null?"\\N":fcurContributionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayPeriod==null?"\\N":"" + fdtmPayDayPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberAccountKey==null?"\\N":"" + flngMemberAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberIRD==null?"\\N":fstrMemberIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerCustomerKey==null?"\\N":"" + flngEmployerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRegister==null?"\\N":"" + fblnRegister, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWorkItem==null?"\\N":"" + fblnWorkItem, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPartialOptOut==null?"\\N":"" + fblnPartialOptOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnComplete==null?"\\N":"" + fblnComplete, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngItemNumber==null?"\\N":"" + flngItemNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContributionType==null?"\\N":fstrContributionType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContributionAmount==null?"\\N":fcurContributionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayPeriod==null?"\\N":"" + fdtmPayDayPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberAccountKey==null?"\\N":"" + flngMemberAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberIRD==null?"\\N":fstrMemberIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerCustomerKey==null?"\\N":"" + flngEmployerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRegister==null?"\\N":"" + fblnRegister, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWorkItem==null?"\\N":"" + fblnWorkItem, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPartialOptOut==null?"\\N":"" + fblnPartialOptOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnComplete==null?"\\N":"" + fblnComplete, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngItemNumber = null; } else {
      this.flngItemNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContributionType = null; } else {
      this.fstrContributionType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContributionAmount = null; } else {
      this.fcurContributionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayPeriod = null; } else {
      this.fdtmPayDayPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberAccountKey = null; } else {
      this.flngMemberAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberIRD = null; } else {
      this.fstrMemberIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerCustomerKey = null; } else {
      this.flngEmployerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRegister = null; } else {
      this.fblnRegister = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWorkItem = null; } else {
      this.fblnWorkItem = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPartialOptOut = null; } else {
      this.fblnPartialOptOut = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnComplete = null; } else {
      this.fblnComplete = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngItemNumber = null; } else {
      this.flngItemNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContributionType = null; } else {
      this.fstrContributionType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContributionAmount = null; } else {
      this.fcurContributionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayPeriod = null; } else {
      this.fdtmPayDayPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberAccountKey = null; } else {
      this.flngMemberAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberIRD = null; } else {
      this.fstrMemberIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerCustomerKey = null; } else {
      this.flngEmployerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRegister = null; } else {
      this.fblnRegister = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWorkItem = null; } else {
      this.fblnWorkItem = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPartialOptOut = null; } else {
      this.fblnPartialOptOut = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnComplete = null; } else {
      this.fblnComplete = Integer.valueOf(__cur_str);
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
    tblnz_kssresidual o = (tblnz_kssresidual) super.clone();
    o.fdtmPayDayPeriod = (o.fdtmPayDayPeriod != null) ? (java.sql.Timestamp) o.fdtmPayDayPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_kssresidual o) throws CloneNotSupportedException {
    o.fdtmPayDayPeriod = (o.fdtmPayDayPeriod != null) ? (java.sql.Timestamp) o.fdtmPayDayPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngItemNumber", this.flngItemNumber);
    __sqoop$field_map.put("fstrContributionType", this.fstrContributionType);
    __sqoop$field_map.put("fcurContributionAmount", this.fcurContributionAmount);
    __sqoop$field_map.put("fdtmPayDayPeriod", this.fdtmPayDayPeriod);
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("flngMemberAccountKey", this.flngMemberAccountKey);
    __sqoop$field_map.put("fstrMemberIRD", this.fstrMemberIRD);
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("flngEmployerCustomerKey", this.flngEmployerCustomerKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("fblnRegister", this.fblnRegister);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fblnWorkItem", this.fblnWorkItem);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("fblnPartialOptOut", this.fblnPartialOptOut);
    __sqoop$field_map.put("fblnComplete", this.fblnComplete);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngItemNumber", this.flngItemNumber);
    __sqoop$field_map.put("fstrContributionType", this.fstrContributionType);
    __sqoop$field_map.put("fcurContributionAmount", this.fcurContributionAmount);
    __sqoop$field_map.put("fdtmPayDayPeriod", this.fdtmPayDayPeriod);
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("flngMemberAccountKey", this.flngMemberAccountKey);
    __sqoop$field_map.put("fstrMemberIRD", this.fstrMemberIRD);
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("flngEmployerCustomerKey", this.flngEmployerCustomerKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("fblnRegister", this.fblnRegister);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fblnWorkItem", this.fblnWorkItem);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("fblnPartialOptOut", this.fblnPartialOptOut);
    __sqoop$field_map.put("fblnComplete", this.fblnComplete);
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
