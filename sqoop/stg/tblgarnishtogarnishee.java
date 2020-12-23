// ORM class for table 'tblgarnishtogarnishee'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:56:16 NZDT 2020
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

public class tblgarnishtogarnishee extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngGarnisheeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.flngGarnisheeKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngGarnishKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.flngGarnishKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngIndicatorKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.flngIndicatorKey = (Integer)value;
      }
    });
    setters.put("flngJointIndicatorKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.flngJointIndicatorKey = (Integer)value;
      }
    });
    setters.put("fstrGarnisheeType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fstrGarnisheeType = (String)value;
      }
    });
    setters.put("flngBankAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.flngBankAccountKey = (Integer)value;
      }
    });
    setters.put("fstrBankAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fstrBankAccount = (String)value;
      }
    });
    setters.put("fstrTransitNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fstrTransitNumber = (String)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmIssued", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fdtmIssued = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmAmended", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fdtmAmended = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReleased", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fdtmReleased = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblgarnishtogarnishee.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblgarnishtogarnishee() {
    init0();
  }
  private Integer flngGarnisheeKey;
  public Integer get_flngGarnisheeKey() {
    return flngGarnisheeKey;
  }
  public void set_flngGarnisheeKey(Integer flngGarnisheeKey) {
    this.flngGarnisheeKey = flngGarnisheeKey;
  }
  public tblgarnishtogarnishee with_flngGarnisheeKey(Integer flngGarnisheeKey) {
    this.flngGarnisheeKey = flngGarnisheeKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblgarnishtogarnishee with_flngVer(Integer flngVer) {
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
  public tblgarnishtogarnishee with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngGarnishKey;
  public Integer get_flngGarnishKey() {
    return flngGarnishKey;
  }
  public void set_flngGarnishKey(Integer flngGarnishKey) {
    this.flngGarnishKey = flngGarnishKey;
  }
  public tblgarnishtogarnishee with_flngGarnishKey(Integer flngGarnishKey) {
    this.flngGarnishKey = flngGarnishKey;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblgarnishtogarnishee with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngIndicatorKey;
  public Integer get_flngIndicatorKey() {
    return flngIndicatorKey;
  }
  public void set_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
  }
  public tblgarnishtogarnishee with_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
    return this;
  }
  private Integer flngJointIndicatorKey;
  public Integer get_flngJointIndicatorKey() {
    return flngJointIndicatorKey;
  }
  public void set_flngJointIndicatorKey(Integer flngJointIndicatorKey) {
    this.flngJointIndicatorKey = flngJointIndicatorKey;
  }
  public tblgarnishtogarnishee with_flngJointIndicatorKey(Integer flngJointIndicatorKey) {
    this.flngJointIndicatorKey = flngJointIndicatorKey;
    return this;
  }
  private String fstrGarnisheeType;
  public String get_fstrGarnisheeType() {
    return fstrGarnisheeType;
  }
  public void set_fstrGarnisheeType(String fstrGarnisheeType) {
    this.fstrGarnisheeType = fstrGarnisheeType;
  }
  public tblgarnishtogarnishee with_fstrGarnisheeType(String fstrGarnisheeType) {
    this.fstrGarnisheeType = fstrGarnisheeType;
    return this;
  }
  private Integer flngBankAccountKey;
  public Integer get_flngBankAccountKey() {
    return flngBankAccountKey;
  }
  public void set_flngBankAccountKey(Integer flngBankAccountKey) {
    this.flngBankAccountKey = flngBankAccountKey;
  }
  public tblgarnishtogarnishee with_flngBankAccountKey(Integer flngBankAccountKey) {
    this.flngBankAccountKey = flngBankAccountKey;
    return this;
  }
  private String fstrBankAccount;
  public String get_fstrBankAccount() {
    return fstrBankAccount;
  }
  public void set_fstrBankAccount(String fstrBankAccount) {
    this.fstrBankAccount = fstrBankAccount;
  }
  public tblgarnishtogarnishee with_fstrBankAccount(String fstrBankAccount) {
    this.fstrBankAccount = fstrBankAccount;
    return this;
  }
  private String fstrTransitNumber;
  public String get_fstrTransitNumber() {
    return fstrTransitNumber;
  }
  public void set_fstrTransitNumber(String fstrTransitNumber) {
    this.fstrTransitNumber = fstrTransitNumber;
  }
  public tblgarnishtogarnishee with_fstrTransitNumber(String fstrTransitNumber) {
    this.fstrTransitNumber = fstrTransitNumber;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblgarnishtogarnishee with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private java.sql.Timestamp fdtmIssued;
  public java.sql.Timestamp get_fdtmIssued() {
    return fdtmIssued;
  }
  public void set_fdtmIssued(java.sql.Timestamp fdtmIssued) {
    this.fdtmIssued = fdtmIssued;
  }
  public tblgarnishtogarnishee with_fdtmIssued(java.sql.Timestamp fdtmIssued) {
    this.fdtmIssued = fdtmIssued;
    return this;
  }
  private java.sql.Timestamp fdtmAmended;
  public java.sql.Timestamp get_fdtmAmended() {
    return fdtmAmended;
  }
  public void set_fdtmAmended(java.sql.Timestamp fdtmAmended) {
    this.fdtmAmended = fdtmAmended;
  }
  public tblgarnishtogarnishee with_fdtmAmended(java.sql.Timestamp fdtmAmended) {
    this.fdtmAmended = fdtmAmended;
    return this;
  }
  private java.sql.Timestamp fdtmReleased;
  public java.sql.Timestamp get_fdtmReleased() {
    return fdtmReleased;
  }
  public void set_fdtmReleased(java.sql.Timestamp fdtmReleased) {
    this.fdtmReleased = fdtmReleased;
  }
  public tblgarnishtogarnishee with_fdtmReleased(java.sql.Timestamp fdtmReleased) {
    this.fdtmReleased = fdtmReleased;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblgarnishtogarnishee with_fblnActive(Integer fblnActive) {
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
  public tblgarnishtogarnishee with_fstrWho(String fstrWho) {
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
  public tblgarnishtogarnishee with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblgarnishtogarnishee)) {
      return false;
    }
    tblgarnishtogarnishee that = (tblgarnishtogarnishee) o;
    boolean equal = true;
    equal = equal && (this.flngGarnisheeKey == null ? that.flngGarnisheeKey == null : this.flngGarnisheeKey.equals(that.flngGarnisheeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngGarnishKey == null ? that.flngGarnishKey == null : this.flngGarnishKey.equals(that.flngGarnishKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.flngJointIndicatorKey == null ? that.flngJointIndicatorKey == null : this.flngJointIndicatorKey.equals(that.flngJointIndicatorKey));
    equal = equal && (this.fstrGarnisheeType == null ? that.fstrGarnisheeType == null : this.fstrGarnisheeType.equals(that.fstrGarnisheeType));
    equal = equal && (this.flngBankAccountKey == null ? that.flngBankAccountKey == null : this.flngBankAccountKey.equals(that.flngBankAccountKey));
    equal = equal && (this.fstrBankAccount == null ? that.fstrBankAccount == null : this.fstrBankAccount.equals(that.fstrBankAccount));
    equal = equal && (this.fstrTransitNumber == null ? that.fstrTransitNumber == null : this.fstrTransitNumber.equals(that.fstrTransitNumber));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fdtmIssued == null ? that.fdtmIssued == null : this.fdtmIssued.equals(that.fdtmIssued));
    equal = equal && (this.fdtmAmended == null ? that.fdtmAmended == null : this.fdtmAmended.equals(that.fdtmAmended));
    equal = equal && (this.fdtmReleased == null ? that.fdtmReleased == null : this.fdtmReleased.equals(that.fdtmReleased));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblgarnishtogarnishee)) {
      return false;
    }
    tblgarnishtogarnishee that = (tblgarnishtogarnishee) o;
    boolean equal = true;
    equal = equal && (this.flngGarnisheeKey == null ? that.flngGarnisheeKey == null : this.flngGarnisheeKey.equals(that.flngGarnisheeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngGarnishKey == null ? that.flngGarnishKey == null : this.flngGarnishKey.equals(that.flngGarnishKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.flngJointIndicatorKey == null ? that.flngJointIndicatorKey == null : this.flngJointIndicatorKey.equals(that.flngJointIndicatorKey));
    equal = equal && (this.fstrGarnisheeType == null ? that.fstrGarnisheeType == null : this.fstrGarnisheeType.equals(that.fstrGarnisheeType));
    equal = equal && (this.flngBankAccountKey == null ? that.flngBankAccountKey == null : this.flngBankAccountKey.equals(that.flngBankAccountKey));
    equal = equal && (this.fstrBankAccount == null ? that.fstrBankAccount == null : this.fstrBankAccount.equals(that.fstrBankAccount));
    equal = equal && (this.fstrTransitNumber == null ? that.fstrTransitNumber == null : this.fstrTransitNumber.equals(that.fstrTransitNumber));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fdtmIssued == null ? that.fdtmIssued == null : this.fdtmIssued.equals(that.fdtmIssued));
    equal = equal && (this.fdtmAmended == null ? that.fdtmAmended == null : this.fdtmAmended.equals(that.fdtmAmended));
    equal = equal && (this.fdtmReleased == null ? that.fdtmReleased == null : this.fdtmReleased.equals(that.fdtmReleased));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngGarnisheeKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngGarnishKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngJointIndicatorKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrGarnisheeType = JdbcWritableBridge.readString(8, __dbResults);
    this.flngBankAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrBankAccount = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrTransitNumber = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmIssued = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmAmended = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmReleased = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngGarnisheeKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngGarnishKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngJointIndicatorKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrGarnisheeType = JdbcWritableBridge.readString(8, __dbResults);
    this.flngBankAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrBankAccount = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrTransitNumber = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmIssued = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmAmended = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmReleased = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(16, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngGarnisheeKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnishKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJointIndicatorKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrGarnisheeType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccount, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransitNumber, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIssued, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAmended, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReleased, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngGarnisheeKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnishKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJointIndicatorKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrGarnisheeType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccount, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransitNumber, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIssued, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAmended, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReleased, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngGarnisheeKey = null;
    } else {
    this.flngGarnisheeKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngGarnishKey = null;
    } else {
    this.flngGarnishKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngIndicatorKey = null;
    } else {
    this.flngIndicatorKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngJointIndicatorKey = null;
    } else {
    this.flngJointIndicatorKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrGarnisheeType = null;
    } else {
    this.fstrGarnisheeType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngBankAccountKey = null;
    } else {
    this.flngBankAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccount = null;
    } else {
    this.fstrBankAccount = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransitNumber = null;
    } else {
    this.fstrTransitNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmIssued = null;
    } else {
    this.fdtmIssued = new Timestamp(__dataIn.readLong());
    this.fdtmIssued.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAmended = null;
    } else {
    this.fdtmAmended = new Timestamp(__dataIn.readLong());
    this.fdtmAmended.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReleased = null;
    } else {
    this.fdtmReleased = new Timestamp(__dataIn.readLong());
    this.fdtmReleased.setNanos(__dataIn.readInt());
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
    if (null == this.flngGarnisheeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnisheeKey);
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
    if (null == this.flngGarnishKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnishKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.flngJointIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJointIndicatorKey);
    }
    if (null == this.fstrGarnisheeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrGarnisheeType);
    }
    if (null == this.flngBankAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountKey);
    }
    if (null == this.fstrBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccount);
    }
    if (null == this.fstrTransitNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransitNumber);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fdtmIssued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIssued.getTime());
    __dataOut.writeInt(this.fdtmIssued.getNanos());
    }
    if (null == this.fdtmAmended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAmended.getTime());
    __dataOut.writeInt(this.fdtmAmended.getNanos());
    }
    if (null == this.fdtmReleased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReleased.getTime());
    __dataOut.writeInt(this.fdtmReleased.getNanos());
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
    if (null == this.flngGarnisheeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnisheeKey);
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
    if (null == this.flngGarnishKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnishKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.flngJointIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJointIndicatorKey);
    }
    if (null == this.fstrGarnisheeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrGarnisheeType);
    }
    if (null == this.flngBankAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountKey);
    }
    if (null == this.fstrBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccount);
    }
    if (null == this.fstrTransitNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransitNumber);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fdtmIssued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIssued.getTime());
    __dataOut.writeInt(this.fdtmIssued.getNanos());
    }
    if (null == this.fdtmAmended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAmended.getTime());
    __dataOut.writeInt(this.fdtmAmended.getNanos());
    }
    if (null == this.fdtmReleased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReleased.getTime());
    __dataOut.writeInt(this.fdtmReleased.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnisheeKey==null?"\\N":"" + flngGarnisheeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnishKey==null?"\\N":"" + flngGarnishKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJointIndicatorKey==null?"\\N":"" + flngJointIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrGarnisheeType==null?"\\N":fstrGarnisheeType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountKey==null?"\\N":"" + flngBankAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccount==null?"\\N":fstrBankAccount, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransitNumber==null?"\\N":fstrTransitNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIssued==null?"\\N":"" + fdtmIssued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAmended==null?"\\N":"" + fdtmAmended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReleased==null?"\\N":"" + fdtmReleased, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnisheeKey==null?"\\N":"" + flngGarnisheeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnishKey==null?"\\N":"" + flngGarnishKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJointIndicatorKey==null?"\\N":"" + flngJointIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrGarnisheeType==null?"\\N":fstrGarnisheeType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountKey==null?"\\N":"" + flngBankAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccount==null?"\\N":fstrBankAccount, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransitNumber==null?"\\N":fstrTransitNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIssued==null?"\\N":"" + fdtmIssued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAmended==null?"\\N":"" + fdtmAmended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReleased==null?"\\N":"" + fdtmReleased, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnisheeKey = null; } else {
      this.flngGarnisheeKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnishKey = null; } else {
      this.flngGarnishKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJointIndicatorKey = null; } else {
      this.flngJointIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrGarnisheeType = null; } else {
      this.fstrGarnisheeType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountKey = null; } else {
      this.flngBankAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccount = null; } else {
      this.fstrBankAccount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransitNumber = null; } else {
      this.fstrTransitNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIssued = null; } else {
      this.fdtmIssued = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAmended = null; } else {
      this.fdtmAmended = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReleased = null; } else {
      this.fdtmReleased = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnisheeKey = null; } else {
      this.flngGarnisheeKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnishKey = null; } else {
      this.flngGarnishKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJointIndicatorKey = null; } else {
      this.flngJointIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrGarnisheeType = null; } else {
      this.fstrGarnisheeType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountKey = null; } else {
      this.flngBankAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccount = null; } else {
      this.fstrBankAccount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransitNumber = null; } else {
      this.fstrTransitNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIssued = null; } else {
      this.fdtmIssued = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAmended = null; } else {
      this.fdtmAmended = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReleased = null; } else {
      this.fdtmReleased = java.sql.Timestamp.valueOf(__cur_str);
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
    tblgarnishtogarnishee o = (tblgarnishtogarnishee) super.clone();
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmIssued = (o.fdtmIssued != null) ? (java.sql.Timestamp) o.fdtmIssued.clone() : null;
    o.fdtmAmended = (o.fdtmAmended != null) ? (java.sql.Timestamp) o.fdtmAmended.clone() : null;
    o.fdtmReleased = (o.fdtmReleased != null) ? (java.sql.Timestamp) o.fdtmReleased.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblgarnishtogarnishee o) throws CloneNotSupportedException {
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmIssued = (o.fdtmIssued != null) ? (java.sql.Timestamp) o.fdtmIssued.clone() : null;
    o.fdtmAmended = (o.fdtmAmended != null) ? (java.sql.Timestamp) o.fdtmAmended.clone() : null;
    o.fdtmReleased = (o.fdtmReleased != null) ? (java.sql.Timestamp) o.fdtmReleased.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngGarnisheeKey", this.flngGarnisheeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngGarnishKey", this.flngGarnishKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("flngJointIndicatorKey", this.flngJointIndicatorKey);
    __sqoop$field_map.put("fstrGarnisheeType", this.fstrGarnisheeType);
    __sqoop$field_map.put("flngBankAccountKey", this.flngBankAccountKey);
    __sqoop$field_map.put("fstrBankAccount", this.fstrBankAccount);
    __sqoop$field_map.put("fstrTransitNumber", this.fstrTransitNumber);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fdtmIssued", this.fdtmIssued);
    __sqoop$field_map.put("fdtmAmended", this.fdtmAmended);
    __sqoop$field_map.put("fdtmReleased", this.fdtmReleased);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngGarnisheeKey", this.flngGarnisheeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngGarnishKey", this.flngGarnishKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("flngJointIndicatorKey", this.flngJointIndicatorKey);
    __sqoop$field_map.put("fstrGarnisheeType", this.fstrGarnisheeType);
    __sqoop$field_map.put("flngBankAccountKey", this.flngBankAccountKey);
    __sqoop$field_map.put("fstrBankAccount", this.fstrBankAccount);
    __sqoop$field_map.put("fstrTransitNumber", this.fstrTransitNumber);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fdtmIssued", this.fdtmIssued);
    __sqoop$field_map.put("fdtmAmended", this.fdtmAmended);
    __sqoop$field_map.put("fdtmReleased", this.fdtmReleased);
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
