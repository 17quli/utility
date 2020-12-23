// ORM class for table 'tblnz_ksswithdrawal'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:43:11 NZDT 2020
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

public class tblnz_ksswithdrawal extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngWithdrawalKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.flngWithdrawalKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngMemberCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.flngMemberCustomerKey = (Integer)value;
      }
    });
    setters.put("flngMemberAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.flngMemberAccountKey = (Integer)value;
      }
    });
    setters.put("flngSchemeCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.flngSchemeCustomerKey = (Integer)value;
      }
    });
    setters.put("flngSchemeAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.flngSchemeAccountKey = (Integer)value;
      }
    });
    setters.put("fstrWithdrawalReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.fstrWithdrawalReason = (String)value;
      }
    });
    setters.put("fdtmWithdrawal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.fdtmWithdrawal = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurWithdrawalAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.fcurWithdrawalAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGovernmentContribution", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.fcurGovernmentContribution = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdblMortgageDiversionPercent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.fdblMortgageDiversionPercent = (Double)value;
      }
    });
    setters.put("fblnValid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.fblnValid = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksswithdrawal.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ksswithdrawal() {
    init0();
  }
  private Integer flngWithdrawalKey;
  public Integer get_flngWithdrawalKey() {
    return flngWithdrawalKey;
  }
  public void set_flngWithdrawalKey(Integer flngWithdrawalKey) {
    this.flngWithdrawalKey = flngWithdrawalKey;
  }
  public tblnz_ksswithdrawal with_flngWithdrawalKey(Integer flngWithdrawalKey) {
    this.flngWithdrawalKey = flngWithdrawalKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_ksswithdrawal with_flngVer(Integer flngVer) {
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
  public tblnz_ksswithdrawal with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngMemberCustomerKey;
  public Integer get_flngMemberCustomerKey() {
    return flngMemberCustomerKey;
  }
  public void set_flngMemberCustomerKey(Integer flngMemberCustomerKey) {
    this.flngMemberCustomerKey = flngMemberCustomerKey;
  }
  public tblnz_ksswithdrawal with_flngMemberCustomerKey(Integer flngMemberCustomerKey) {
    this.flngMemberCustomerKey = flngMemberCustomerKey;
    return this;
  }
  private Integer flngMemberAccountKey;
  public Integer get_flngMemberAccountKey() {
    return flngMemberAccountKey;
  }
  public void set_flngMemberAccountKey(Integer flngMemberAccountKey) {
    this.flngMemberAccountKey = flngMemberAccountKey;
  }
  public tblnz_ksswithdrawal with_flngMemberAccountKey(Integer flngMemberAccountKey) {
    this.flngMemberAccountKey = flngMemberAccountKey;
    return this;
  }
  private Integer flngSchemeCustomerKey;
  public Integer get_flngSchemeCustomerKey() {
    return flngSchemeCustomerKey;
  }
  public void set_flngSchemeCustomerKey(Integer flngSchemeCustomerKey) {
    this.flngSchemeCustomerKey = flngSchemeCustomerKey;
  }
  public tblnz_ksswithdrawal with_flngSchemeCustomerKey(Integer flngSchemeCustomerKey) {
    this.flngSchemeCustomerKey = flngSchemeCustomerKey;
    return this;
  }
  private Integer flngSchemeAccountKey;
  public Integer get_flngSchemeAccountKey() {
    return flngSchemeAccountKey;
  }
  public void set_flngSchemeAccountKey(Integer flngSchemeAccountKey) {
    this.flngSchemeAccountKey = flngSchemeAccountKey;
  }
  public tblnz_ksswithdrawal with_flngSchemeAccountKey(Integer flngSchemeAccountKey) {
    this.flngSchemeAccountKey = flngSchemeAccountKey;
    return this;
  }
  private String fstrWithdrawalReason;
  public String get_fstrWithdrawalReason() {
    return fstrWithdrawalReason;
  }
  public void set_fstrWithdrawalReason(String fstrWithdrawalReason) {
    this.fstrWithdrawalReason = fstrWithdrawalReason;
  }
  public tblnz_ksswithdrawal with_fstrWithdrawalReason(String fstrWithdrawalReason) {
    this.fstrWithdrawalReason = fstrWithdrawalReason;
    return this;
  }
  private java.sql.Timestamp fdtmWithdrawal;
  public java.sql.Timestamp get_fdtmWithdrawal() {
    return fdtmWithdrawal;
  }
  public void set_fdtmWithdrawal(java.sql.Timestamp fdtmWithdrawal) {
    this.fdtmWithdrawal = fdtmWithdrawal;
  }
  public tblnz_ksswithdrawal with_fdtmWithdrawal(java.sql.Timestamp fdtmWithdrawal) {
    this.fdtmWithdrawal = fdtmWithdrawal;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblnz_ksswithdrawal with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private java.math.BigDecimal fcurWithdrawalAmount;
  public java.math.BigDecimal get_fcurWithdrawalAmount() {
    return fcurWithdrawalAmount;
  }
  public void set_fcurWithdrawalAmount(java.math.BigDecimal fcurWithdrawalAmount) {
    this.fcurWithdrawalAmount = fcurWithdrawalAmount;
  }
  public tblnz_ksswithdrawal with_fcurWithdrawalAmount(java.math.BigDecimal fcurWithdrawalAmount) {
    this.fcurWithdrawalAmount = fcurWithdrawalAmount;
    return this;
  }
  private java.math.BigDecimal fcurGovernmentContribution;
  public java.math.BigDecimal get_fcurGovernmentContribution() {
    return fcurGovernmentContribution;
  }
  public void set_fcurGovernmentContribution(java.math.BigDecimal fcurGovernmentContribution) {
    this.fcurGovernmentContribution = fcurGovernmentContribution;
  }
  public tblnz_ksswithdrawal with_fcurGovernmentContribution(java.math.BigDecimal fcurGovernmentContribution) {
    this.fcurGovernmentContribution = fcurGovernmentContribution;
    return this;
  }
  private Double fdblMortgageDiversionPercent;
  public Double get_fdblMortgageDiversionPercent() {
    return fdblMortgageDiversionPercent;
  }
  public void set_fdblMortgageDiversionPercent(Double fdblMortgageDiversionPercent) {
    this.fdblMortgageDiversionPercent = fdblMortgageDiversionPercent;
  }
  public tblnz_ksswithdrawal with_fdblMortgageDiversionPercent(Double fdblMortgageDiversionPercent) {
    this.fdblMortgageDiversionPercent = fdblMortgageDiversionPercent;
    return this;
  }
  private Integer fblnValid;
  public Integer get_fblnValid() {
    return fblnValid;
  }
  public void set_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
  }
  public tblnz_ksswithdrawal with_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ksswithdrawal with_fstrWho(String fstrWho) {
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
  public tblnz_ksswithdrawal with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksswithdrawal)) {
      return false;
    }
    tblnz_ksswithdrawal that = (tblnz_ksswithdrawal) o;
    boolean equal = true;
    equal = equal && (this.flngWithdrawalKey == null ? that.flngWithdrawalKey == null : this.flngWithdrawalKey.equals(that.flngWithdrawalKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMemberCustomerKey == null ? that.flngMemberCustomerKey == null : this.flngMemberCustomerKey.equals(that.flngMemberCustomerKey));
    equal = equal && (this.flngMemberAccountKey == null ? that.flngMemberAccountKey == null : this.flngMemberAccountKey.equals(that.flngMemberAccountKey));
    equal = equal && (this.flngSchemeCustomerKey == null ? that.flngSchemeCustomerKey == null : this.flngSchemeCustomerKey.equals(that.flngSchemeCustomerKey));
    equal = equal && (this.flngSchemeAccountKey == null ? that.flngSchemeAccountKey == null : this.flngSchemeAccountKey.equals(that.flngSchemeAccountKey));
    equal = equal && (this.fstrWithdrawalReason == null ? that.fstrWithdrawalReason == null : this.fstrWithdrawalReason.equals(that.fstrWithdrawalReason));
    equal = equal && (this.fdtmWithdrawal == null ? that.fdtmWithdrawal == null : this.fdtmWithdrawal.equals(that.fdtmWithdrawal));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fcurWithdrawalAmount == null ? that.fcurWithdrawalAmount == null : this.fcurWithdrawalAmount.equals(that.fcurWithdrawalAmount));
    equal = equal && (this.fcurGovernmentContribution == null ? that.fcurGovernmentContribution == null : this.fcurGovernmentContribution.equals(that.fcurGovernmentContribution));
    equal = equal && (this.fdblMortgageDiversionPercent == null ? that.fdblMortgageDiversionPercent == null : this.fdblMortgageDiversionPercent.equals(that.fdblMortgageDiversionPercent));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksswithdrawal)) {
      return false;
    }
    tblnz_ksswithdrawal that = (tblnz_ksswithdrawal) o;
    boolean equal = true;
    equal = equal && (this.flngWithdrawalKey == null ? that.flngWithdrawalKey == null : this.flngWithdrawalKey.equals(that.flngWithdrawalKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMemberCustomerKey == null ? that.flngMemberCustomerKey == null : this.flngMemberCustomerKey.equals(that.flngMemberCustomerKey));
    equal = equal && (this.flngMemberAccountKey == null ? that.flngMemberAccountKey == null : this.flngMemberAccountKey.equals(that.flngMemberAccountKey));
    equal = equal && (this.flngSchemeCustomerKey == null ? that.flngSchemeCustomerKey == null : this.flngSchemeCustomerKey.equals(that.flngSchemeCustomerKey));
    equal = equal && (this.flngSchemeAccountKey == null ? that.flngSchemeAccountKey == null : this.flngSchemeAccountKey.equals(that.flngSchemeAccountKey));
    equal = equal && (this.fstrWithdrawalReason == null ? that.fstrWithdrawalReason == null : this.fstrWithdrawalReason.equals(that.fstrWithdrawalReason));
    equal = equal && (this.fdtmWithdrawal == null ? that.fdtmWithdrawal == null : this.fdtmWithdrawal.equals(that.fdtmWithdrawal));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fcurWithdrawalAmount == null ? that.fcurWithdrawalAmount == null : this.fcurWithdrawalAmount.equals(that.fcurWithdrawalAmount));
    equal = equal && (this.fcurGovernmentContribution == null ? that.fcurGovernmentContribution == null : this.fcurGovernmentContribution.equals(that.fcurGovernmentContribution));
    equal = equal && (this.fdblMortgageDiversionPercent == null ? that.fdblMortgageDiversionPercent == null : this.fdblMortgageDiversionPercent.equals(that.fdblMortgageDiversionPercent));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngWithdrawalKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngMemberCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngMemberAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngSchemeCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngSchemeAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrWithdrawalReason = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWithdrawal = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurWithdrawalAmount = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurGovernmentContribution = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fdblMortgageDiversionPercent = JdbcWritableBridge.readDouble(13, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngWithdrawalKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngMemberCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngMemberAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngSchemeCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngSchemeAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrWithdrawalReason = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWithdrawal = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurWithdrawalAmount = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurGovernmentContribution = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fdblMortgageDiversionPercent = JdbcWritableBridge.readDouble(13, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(14, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngWithdrawalKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWithdrawalReason, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWithdrawal, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWithdrawalAmount, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGovernmentContribution, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblMortgageDiversionPercent, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngWithdrawalKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWithdrawalReason, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWithdrawal, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWithdrawalAmount, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGovernmentContribution, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblMortgageDiversionPercent, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngWithdrawalKey = null;
    } else {
    this.flngWithdrawalKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngMemberCustomerKey = null;
    } else {
    this.flngMemberCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMemberAccountKey = null;
    } else {
    this.flngMemberAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSchemeCustomerKey = null;
    } else {
    this.flngSchemeCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSchemeAccountKey = null;
    } else {
    this.flngSchemeAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWithdrawalReason = null;
    } else {
    this.fstrWithdrawalReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWithdrawal = null;
    } else {
    this.fdtmWithdrawal = new Timestamp(__dataIn.readLong());
    this.fdtmWithdrawal.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurWithdrawalAmount = null;
    } else {
    this.fcurWithdrawalAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGovernmentContribution = null;
    } else {
    this.fcurGovernmentContribution = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdblMortgageDiversionPercent = null;
    } else {
    this.fdblMortgageDiversionPercent = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnValid = null;
    } else {
    this.fblnValid = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngWithdrawalKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWithdrawalKey);
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
    if (null == this.flngMemberCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberCustomerKey);
    }
    if (null == this.flngMemberAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberAccountKey);
    }
    if (null == this.flngSchemeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeCustomerKey);
    }
    if (null == this.flngSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeAccountKey);
    }
    if (null == this.fstrWithdrawalReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWithdrawalReason);
    }
    if (null == this.fdtmWithdrawal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWithdrawal.getTime());
    __dataOut.writeInt(this.fdtmWithdrawal.getNanos());
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fcurWithdrawalAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWithdrawalAmount, __dataOut);
    }
    if (null == this.fcurGovernmentContribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGovernmentContribution, __dataOut);
    }
    if (null == this.fdblMortgageDiversionPercent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblMortgageDiversionPercent);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
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
    if (null == this.flngWithdrawalKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWithdrawalKey);
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
    if (null == this.flngMemberCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberCustomerKey);
    }
    if (null == this.flngMemberAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberAccountKey);
    }
    if (null == this.flngSchemeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeCustomerKey);
    }
    if (null == this.flngSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeAccountKey);
    }
    if (null == this.fstrWithdrawalReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWithdrawalReason);
    }
    if (null == this.fdtmWithdrawal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWithdrawal.getTime());
    __dataOut.writeInt(this.fdtmWithdrawal.getNanos());
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fcurWithdrawalAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWithdrawalAmount, __dataOut);
    }
    if (null == this.fcurGovernmentContribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGovernmentContribution, __dataOut);
    }
    if (null == this.fdblMortgageDiversionPercent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblMortgageDiversionPercent);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngWithdrawalKey==null?"\\N":"" + flngWithdrawalKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberCustomerKey==null?"\\N":"" + flngMemberCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberAccountKey==null?"\\N":"" + flngMemberAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeCustomerKey==null?"\\N":"" + flngSchemeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeAccountKey==null?"\\N":"" + flngSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWithdrawalReason==null?"\\N":fstrWithdrawalReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWithdrawal==null?"\\N":"" + fdtmWithdrawal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWithdrawalAmount==null?"\\N":fcurWithdrawalAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGovernmentContribution==null?"\\N":fcurGovernmentContribution.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblMortgageDiversionPercent==null?"\\N":"" + fdblMortgageDiversionPercent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngWithdrawalKey==null?"\\N":"" + flngWithdrawalKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberCustomerKey==null?"\\N":"" + flngMemberCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberAccountKey==null?"\\N":"" + flngMemberAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeCustomerKey==null?"\\N":"" + flngSchemeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeAccountKey==null?"\\N":"" + flngSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWithdrawalReason==null?"\\N":fstrWithdrawalReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWithdrawal==null?"\\N":"" + fdtmWithdrawal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWithdrawalAmount==null?"\\N":fcurWithdrawalAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGovernmentContribution==null?"\\N":fcurGovernmentContribution.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblMortgageDiversionPercent==null?"\\N":"" + fdblMortgageDiversionPercent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWithdrawalKey = null; } else {
      this.flngWithdrawalKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberCustomerKey = null; } else {
      this.flngMemberCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeCustomerKey = null; } else {
      this.flngSchemeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeAccountKey = null; } else {
      this.flngSchemeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWithdrawalReason = null; } else {
      this.fstrWithdrawalReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWithdrawal = null; } else {
      this.fdtmWithdrawal = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWithdrawalAmount = null; } else {
      this.fcurWithdrawalAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGovernmentContribution = null; } else {
      this.fcurGovernmentContribution = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblMortgageDiversionPercent = null; } else {
      this.fdblMortgageDiversionPercent = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWithdrawalKey = null; } else {
      this.flngWithdrawalKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberCustomerKey = null; } else {
      this.flngMemberCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeCustomerKey = null; } else {
      this.flngSchemeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeAccountKey = null; } else {
      this.flngSchemeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWithdrawalReason = null; } else {
      this.fstrWithdrawalReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWithdrawal = null; } else {
      this.fdtmWithdrawal = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWithdrawalAmount = null; } else {
      this.fcurWithdrawalAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGovernmentContribution = null; } else {
      this.fcurGovernmentContribution = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblMortgageDiversionPercent = null; } else {
      this.fdblMortgageDiversionPercent = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    tblnz_ksswithdrawal o = (tblnz_ksswithdrawal) super.clone();
    o.fdtmWithdrawal = (o.fdtmWithdrawal != null) ? (java.sql.Timestamp) o.fdtmWithdrawal.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ksswithdrawal o) throws CloneNotSupportedException {
    o.fdtmWithdrawal = (o.fdtmWithdrawal != null) ? (java.sql.Timestamp) o.fdtmWithdrawal.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngWithdrawalKey", this.flngWithdrawalKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMemberCustomerKey", this.flngMemberCustomerKey);
    __sqoop$field_map.put("flngMemberAccountKey", this.flngMemberAccountKey);
    __sqoop$field_map.put("flngSchemeCustomerKey", this.flngSchemeCustomerKey);
    __sqoop$field_map.put("flngSchemeAccountKey", this.flngSchemeAccountKey);
    __sqoop$field_map.put("fstrWithdrawalReason", this.fstrWithdrawalReason);
    __sqoop$field_map.put("fdtmWithdrawal", this.fdtmWithdrawal);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fcurWithdrawalAmount", this.fcurWithdrawalAmount);
    __sqoop$field_map.put("fcurGovernmentContribution", this.fcurGovernmentContribution);
    __sqoop$field_map.put("fdblMortgageDiversionPercent", this.fdblMortgageDiversionPercent);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngWithdrawalKey", this.flngWithdrawalKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMemberCustomerKey", this.flngMemberCustomerKey);
    __sqoop$field_map.put("flngMemberAccountKey", this.flngMemberAccountKey);
    __sqoop$field_map.put("flngSchemeCustomerKey", this.flngSchemeCustomerKey);
    __sqoop$field_map.put("flngSchemeAccountKey", this.flngSchemeAccountKey);
    __sqoop$field_map.put("fstrWithdrawalReason", this.fstrWithdrawalReason);
    __sqoop$field_map.put("fdtmWithdrawal", this.fdtmWithdrawal);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fcurWithdrawalAmount", this.fcurWithdrawalAmount);
    __sqoop$field_map.put("fcurGovernmentContribution", this.fcurGovernmentContribution);
    __sqoop$field_map.put("fdblMortgageDiversionPercent", this.fdblMortgageDiversionPercent);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
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
