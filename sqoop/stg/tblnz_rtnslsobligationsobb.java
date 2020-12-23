// ORM class for table 'tblnz_rtnslsobligationsobb'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:33:36 NZDT 2020
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

public class tblnz_rtnslsobligationsobb extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurTotalLoanBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fcurTotalLoanBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmObbBegin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fdtmObbBegin = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurBalanceAtObbBegin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fcurBalanceAtObbBegin = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBalanceBracketBased", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fcurBalanceBracketBased = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmPeriodDeterminingBracket", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fdtmPeriodDeterminingBracket = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurFullYearObligation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fcurFullYearObligation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdjustedObligation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fcurAdjustedObligation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmInstalment1Due", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fdtmInstalment1Due = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmInstalment2Due", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fdtmInstalment2Due = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurBracket", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fcurBracket = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmObbBegin2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fdtmObbBegin2 = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurBracket2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fcurBracket2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBalanceAtObbBegin2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fcurBalanceAtObbBegin2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligationsobb.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnslsobligationsobb() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnslsobligationsobb with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurTotalLoanBalance;
  public java.math.BigDecimal get_fcurTotalLoanBalance() {
    return fcurTotalLoanBalance;
  }
  public void set_fcurTotalLoanBalance(java.math.BigDecimal fcurTotalLoanBalance) {
    this.fcurTotalLoanBalance = fcurTotalLoanBalance;
  }
  public tblnz_rtnslsobligationsobb with_fcurTotalLoanBalance(java.math.BigDecimal fcurTotalLoanBalance) {
    this.fcurTotalLoanBalance = fcurTotalLoanBalance;
    return this;
  }
  private java.sql.Timestamp fdtmObbBegin;
  public java.sql.Timestamp get_fdtmObbBegin() {
    return fdtmObbBegin;
  }
  public void set_fdtmObbBegin(java.sql.Timestamp fdtmObbBegin) {
    this.fdtmObbBegin = fdtmObbBegin;
  }
  public tblnz_rtnslsobligationsobb with_fdtmObbBegin(java.sql.Timestamp fdtmObbBegin) {
    this.fdtmObbBegin = fdtmObbBegin;
    return this;
  }
  private java.math.BigDecimal fcurBalanceAtObbBegin;
  public java.math.BigDecimal get_fcurBalanceAtObbBegin() {
    return fcurBalanceAtObbBegin;
  }
  public void set_fcurBalanceAtObbBegin(java.math.BigDecimal fcurBalanceAtObbBegin) {
    this.fcurBalanceAtObbBegin = fcurBalanceAtObbBegin;
  }
  public tblnz_rtnslsobligationsobb with_fcurBalanceAtObbBegin(java.math.BigDecimal fcurBalanceAtObbBegin) {
    this.fcurBalanceAtObbBegin = fcurBalanceAtObbBegin;
    return this;
  }
  private java.math.BigDecimal fcurBalanceBracketBased;
  public java.math.BigDecimal get_fcurBalanceBracketBased() {
    return fcurBalanceBracketBased;
  }
  public void set_fcurBalanceBracketBased(java.math.BigDecimal fcurBalanceBracketBased) {
    this.fcurBalanceBracketBased = fcurBalanceBracketBased;
  }
  public tblnz_rtnslsobligationsobb with_fcurBalanceBracketBased(java.math.BigDecimal fcurBalanceBracketBased) {
    this.fcurBalanceBracketBased = fcurBalanceBracketBased;
    return this;
  }
  private java.sql.Timestamp fdtmPeriodDeterminingBracket;
  public java.sql.Timestamp get_fdtmPeriodDeterminingBracket() {
    return fdtmPeriodDeterminingBracket;
  }
  public void set_fdtmPeriodDeterminingBracket(java.sql.Timestamp fdtmPeriodDeterminingBracket) {
    this.fdtmPeriodDeterminingBracket = fdtmPeriodDeterminingBracket;
  }
  public tblnz_rtnslsobligationsobb with_fdtmPeriodDeterminingBracket(java.sql.Timestamp fdtmPeriodDeterminingBracket) {
    this.fdtmPeriodDeterminingBracket = fdtmPeriodDeterminingBracket;
    return this;
  }
  private java.math.BigDecimal fcurFullYearObligation;
  public java.math.BigDecimal get_fcurFullYearObligation() {
    return fcurFullYearObligation;
  }
  public void set_fcurFullYearObligation(java.math.BigDecimal fcurFullYearObligation) {
    this.fcurFullYearObligation = fcurFullYearObligation;
  }
  public tblnz_rtnslsobligationsobb with_fcurFullYearObligation(java.math.BigDecimal fcurFullYearObligation) {
    this.fcurFullYearObligation = fcurFullYearObligation;
    return this;
  }
  private java.math.BigDecimal fcurAdjustedObligation;
  public java.math.BigDecimal get_fcurAdjustedObligation() {
    return fcurAdjustedObligation;
  }
  public void set_fcurAdjustedObligation(java.math.BigDecimal fcurAdjustedObligation) {
    this.fcurAdjustedObligation = fcurAdjustedObligation;
  }
  public tblnz_rtnslsobligationsobb with_fcurAdjustedObligation(java.math.BigDecimal fcurAdjustedObligation) {
    this.fcurAdjustedObligation = fcurAdjustedObligation;
    return this;
  }
  private java.sql.Timestamp fdtmInstalment1Due;
  public java.sql.Timestamp get_fdtmInstalment1Due() {
    return fdtmInstalment1Due;
  }
  public void set_fdtmInstalment1Due(java.sql.Timestamp fdtmInstalment1Due) {
    this.fdtmInstalment1Due = fdtmInstalment1Due;
  }
  public tblnz_rtnslsobligationsobb with_fdtmInstalment1Due(java.sql.Timestamp fdtmInstalment1Due) {
    this.fdtmInstalment1Due = fdtmInstalment1Due;
    return this;
  }
  private java.sql.Timestamp fdtmInstalment2Due;
  public java.sql.Timestamp get_fdtmInstalment2Due() {
    return fdtmInstalment2Due;
  }
  public void set_fdtmInstalment2Due(java.sql.Timestamp fdtmInstalment2Due) {
    this.fdtmInstalment2Due = fdtmInstalment2Due;
  }
  public tblnz_rtnslsobligationsobb with_fdtmInstalment2Due(java.sql.Timestamp fdtmInstalment2Due) {
    this.fdtmInstalment2Due = fdtmInstalment2Due;
    return this;
  }
  private java.math.BigDecimal fcurBracket;
  public java.math.BigDecimal get_fcurBracket() {
    return fcurBracket;
  }
  public void set_fcurBracket(java.math.BigDecimal fcurBracket) {
    this.fcurBracket = fcurBracket;
  }
  public tblnz_rtnslsobligationsobb with_fcurBracket(java.math.BigDecimal fcurBracket) {
    this.fcurBracket = fcurBracket;
    return this;
  }
  private java.sql.Timestamp fdtmObbBegin2;
  public java.sql.Timestamp get_fdtmObbBegin2() {
    return fdtmObbBegin2;
  }
  public void set_fdtmObbBegin2(java.sql.Timestamp fdtmObbBegin2) {
    this.fdtmObbBegin2 = fdtmObbBegin2;
  }
  public tblnz_rtnslsobligationsobb with_fdtmObbBegin2(java.sql.Timestamp fdtmObbBegin2) {
    this.fdtmObbBegin2 = fdtmObbBegin2;
    return this;
  }
  private java.math.BigDecimal fcurBracket2;
  public java.math.BigDecimal get_fcurBracket2() {
    return fcurBracket2;
  }
  public void set_fcurBracket2(java.math.BigDecimal fcurBracket2) {
    this.fcurBracket2 = fcurBracket2;
  }
  public tblnz_rtnslsobligationsobb with_fcurBracket2(java.math.BigDecimal fcurBracket2) {
    this.fcurBracket2 = fcurBracket2;
    return this;
  }
  private java.math.BigDecimal fcurBalanceAtObbBegin2;
  public java.math.BigDecimal get_fcurBalanceAtObbBegin2() {
    return fcurBalanceAtObbBegin2;
  }
  public void set_fcurBalanceAtObbBegin2(java.math.BigDecimal fcurBalanceAtObbBegin2) {
    this.fcurBalanceAtObbBegin2 = fcurBalanceAtObbBegin2;
  }
  public tblnz_rtnslsobligationsobb with_fcurBalanceAtObbBegin2(java.math.BigDecimal fcurBalanceAtObbBegin2) {
    this.fcurBalanceAtObbBegin2 = fcurBalanceAtObbBegin2;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnslsobligationsobb with_fstrWho(String fstrWho) {
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
  public tblnz_rtnslsobligationsobb with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnslsobligationsobb)) {
      return false;
    }
    tblnz_rtnslsobligationsobb that = (tblnz_rtnslsobligationsobb) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTotalLoanBalance == null ? that.fcurTotalLoanBalance == null : this.fcurTotalLoanBalance.equals(that.fcurTotalLoanBalance));
    equal = equal && (this.fdtmObbBegin == null ? that.fdtmObbBegin == null : this.fdtmObbBegin.equals(that.fdtmObbBegin));
    equal = equal && (this.fcurBalanceAtObbBegin == null ? that.fcurBalanceAtObbBegin == null : this.fcurBalanceAtObbBegin.equals(that.fcurBalanceAtObbBegin));
    equal = equal && (this.fcurBalanceBracketBased == null ? that.fcurBalanceBracketBased == null : this.fcurBalanceBracketBased.equals(that.fcurBalanceBracketBased));
    equal = equal && (this.fdtmPeriodDeterminingBracket == null ? that.fdtmPeriodDeterminingBracket == null : this.fdtmPeriodDeterminingBracket.equals(that.fdtmPeriodDeterminingBracket));
    equal = equal && (this.fcurFullYearObligation == null ? that.fcurFullYearObligation == null : this.fcurFullYearObligation.equals(that.fcurFullYearObligation));
    equal = equal && (this.fcurAdjustedObligation == null ? that.fcurAdjustedObligation == null : this.fcurAdjustedObligation.equals(that.fcurAdjustedObligation));
    equal = equal && (this.fdtmInstalment1Due == null ? that.fdtmInstalment1Due == null : this.fdtmInstalment1Due.equals(that.fdtmInstalment1Due));
    equal = equal && (this.fdtmInstalment2Due == null ? that.fdtmInstalment2Due == null : this.fdtmInstalment2Due.equals(that.fdtmInstalment2Due));
    equal = equal && (this.fcurBracket == null ? that.fcurBracket == null : this.fcurBracket.equals(that.fcurBracket));
    equal = equal && (this.fdtmObbBegin2 == null ? that.fdtmObbBegin2 == null : this.fdtmObbBegin2.equals(that.fdtmObbBegin2));
    equal = equal && (this.fcurBracket2 == null ? that.fcurBracket2 == null : this.fcurBracket2.equals(that.fcurBracket2));
    equal = equal && (this.fcurBalanceAtObbBegin2 == null ? that.fcurBalanceAtObbBegin2 == null : this.fcurBalanceAtObbBegin2.equals(that.fcurBalanceAtObbBegin2));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnslsobligationsobb)) {
      return false;
    }
    tblnz_rtnslsobligationsobb that = (tblnz_rtnslsobligationsobb) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTotalLoanBalance == null ? that.fcurTotalLoanBalance == null : this.fcurTotalLoanBalance.equals(that.fcurTotalLoanBalance));
    equal = equal && (this.fdtmObbBegin == null ? that.fdtmObbBegin == null : this.fdtmObbBegin.equals(that.fdtmObbBegin));
    equal = equal && (this.fcurBalanceAtObbBegin == null ? that.fcurBalanceAtObbBegin == null : this.fcurBalanceAtObbBegin.equals(that.fcurBalanceAtObbBegin));
    equal = equal && (this.fcurBalanceBracketBased == null ? that.fcurBalanceBracketBased == null : this.fcurBalanceBracketBased.equals(that.fcurBalanceBracketBased));
    equal = equal && (this.fdtmPeriodDeterminingBracket == null ? that.fdtmPeriodDeterminingBracket == null : this.fdtmPeriodDeterminingBracket.equals(that.fdtmPeriodDeterminingBracket));
    equal = equal && (this.fcurFullYearObligation == null ? that.fcurFullYearObligation == null : this.fcurFullYearObligation.equals(that.fcurFullYearObligation));
    equal = equal && (this.fcurAdjustedObligation == null ? that.fcurAdjustedObligation == null : this.fcurAdjustedObligation.equals(that.fcurAdjustedObligation));
    equal = equal && (this.fdtmInstalment1Due == null ? that.fdtmInstalment1Due == null : this.fdtmInstalment1Due.equals(that.fdtmInstalment1Due));
    equal = equal && (this.fdtmInstalment2Due == null ? that.fdtmInstalment2Due == null : this.fdtmInstalment2Due.equals(that.fdtmInstalment2Due));
    equal = equal && (this.fcurBracket == null ? that.fcurBracket == null : this.fcurBracket.equals(that.fcurBracket));
    equal = equal && (this.fdtmObbBegin2 == null ? that.fdtmObbBegin2 == null : this.fdtmObbBegin2.equals(that.fdtmObbBegin2));
    equal = equal && (this.fcurBracket2 == null ? that.fcurBracket2 == null : this.fcurBracket2.equals(that.fcurBracket2));
    equal = equal && (this.fcurBalanceAtObbBegin2 == null ? that.fcurBalanceAtObbBegin2 == null : this.fcurBalanceAtObbBegin2.equals(that.fcurBalanceAtObbBegin2));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTotalLoanBalance = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fdtmObbBegin = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurBalanceAtObbBegin = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurBalanceBracketBased = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fdtmPeriodDeterminingBracket = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fcurFullYearObligation = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAdjustedObligation = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fdtmInstalment1Due = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmInstalment2Due = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurBracket = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fdtmObbBegin2 = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurBracket2 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurBalanceAtObbBegin2 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTotalLoanBalance = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fdtmObbBegin = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurBalanceAtObbBegin = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurBalanceBracketBased = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fdtmPeriodDeterminingBracket = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fcurFullYearObligation = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAdjustedObligation = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fdtmInstalment1Due = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmInstalment2Due = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurBracket = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fdtmObbBegin2 = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurBracket2 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurBalanceAtObbBegin2 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurTotalLoanBalance, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmObbBegin, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceAtObbBegin, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceBracketBased, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriodDeterminingBracket, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFullYearObligation, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedObligation, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInstalment1Due, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInstalment2Due, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBracket, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmObbBegin2, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBracket2, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceAtObbBegin2, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLoanBalance, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmObbBegin, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceAtObbBegin, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceBracketBased, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriodDeterminingBracket, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFullYearObligation, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedObligation, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInstalment1Due, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInstalment2Due, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBracket, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmObbBegin2, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBracket2, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceAtObbBegin2, 14 + __off, 3, __dbStmt);
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
        this.fcurTotalLoanBalance = null;
    } else {
    this.fcurTotalLoanBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmObbBegin = null;
    } else {
    this.fdtmObbBegin = new Timestamp(__dataIn.readLong());
    this.fdtmObbBegin.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalanceAtObbBegin = null;
    } else {
    this.fcurBalanceAtObbBegin = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalanceBracketBased = null;
    } else {
    this.fcurBalanceBracketBased = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPeriodDeterminingBracket = null;
    } else {
    this.fdtmPeriodDeterminingBracket = new Timestamp(__dataIn.readLong());
    this.fdtmPeriodDeterminingBracket.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFullYearObligation = null;
    } else {
    this.fcurFullYearObligation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdjustedObligation = null;
    } else {
    this.fcurAdjustedObligation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmInstalment1Due = null;
    } else {
    this.fdtmInstalment1Due = new Timestamp(__dataIn.readLong());
    this.fdtmInstalment1Due.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmInstalment2Due = null;
    } else {
    this.fdtmInstalment2Due = new Timestamp(__dataIn.readLong());
    this.fdtmInstalment2Due.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBracket = null;
    } else {
    this.fcurBracket = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmObbBegin2 = null;
    } else {
    this.fdtmObbBegin2 = new Timestamp(__dataIn.readLong());
    this.fdtmObbBegin2.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBracket2 = null;
    } else {
    this.fcurBracket2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalanceAtObbBegin2 = null;
    } else {
    this.fcurBalanceAtObbBegin2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurTotalLoanBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLoanBalance, __dataOut);
    }
    if (null == this.fdtmObbBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmObbBegin.getTime());
    __dataOut.writeInt(this.fdtmObbBegin.getNanos());
    }
    if (null == this.fcurBalanceAtObbBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceAtObbBegin, __dataOut);
    }
    if (null == this.fcurBalanceBracketBased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceBracketBased, __dataOut);
    }
    if (null == this.fdtmPeriodDeterminingBracket) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriodDeterminingBracket.getTime());
    __dataOut.writeInt(this.fdtmPeriodDeterminingBracket.getNanos());
    }
    if (null == this.fcurFullYearObligation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFullYearObligation, __dataOut);
    }
    if (null == this.fcurAdjustedObligation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedObligation, __dataOut);
    }
    if (null == this.fdtmInstalment1Due) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInstalment1Due.getTime());
    __dataOut.writeInt(this.fdtmInstalment1Due.getNanos());
    }
    if (null == this.fdtmInstalment2Due) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInstalment2Due.getTime());
    __dataOut.writeInt(this.fdtmInstalment2Due.getNanos());
    }
    if (null == this.fcurBracket) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBracket, __dataOut);
    }
    if (null == this.fdtmObbBegin2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmObbBegin2.getTime());
    __dataOut.writeInt(this.fdtmObbBegin2.getNanos());
    }
    if (null == this.fcurBracket2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBracket2, __dataOut);
    }
    if (null == this.fcurBalanceAtObbBegin2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceAtObbBegin2, __dataOut);
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
    if (null == this.fcurTotalLoanBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLoanBalance, __dataOut);
    }
    if (null == this.fdtmObbBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmObbBegin.getTime());
    __dataOut.writeInt(this.fdtmObbBegin.getNanos());
    }
    if (null == this.fcurBalanceAtObbBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceAtObbBegin, __dataOut);
    }
    if (null == this.fcurBalanceBracketBased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceBracketBased, __dataOut);
    }
    if (null == this.fdtmPeriodDeterminingBracket) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriodDeterminingBracket.getTime());
    __dataOut.writeInt(this.fdtmPeriodDeterminingBracket.getNanos());
    }
    if (null == this.fcurFullYearObligation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFullYearObligation, __dataOut);
    }
    if (null == this.fcurAdjustedObligation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedObligation, __dataOut);
    }
    if (null == this.fdtmInstalment1Due) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInstalment1Due.getTime());
    __dataOut.writeInt(this.fdtmInstalment1Due.getNanos());
    }
    if (null == this.fdtmInstalment2Due) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInstalment2Due.getTime());
    __dataOut.writeInt(this.fdtmInstalment2Due.getNanos());
    }
    if (null == this.fcurBracket) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBracket, __dataOut);
    }
    if (null == this.fdtmObbBegin2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmObbBegin2.getTime());
    __dataOut.writeInt(this.fdtmObbBegin2.getNanos());
    }
    if (null == this.fcurBracket2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBracket2, __dataOut);
    }
    if (null == this.fcurBalanceAtObbBegin2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceAtObbBegin2, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLoanBalance==null?"\\N":fcurTotalLoanBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmObbBegin==null?"\\N":"" + fdtmObbBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceAtObbBegin==null?"\\N":fcurBalanceAtObbBegin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceBracketBased==null?"\\N":fcurBalanceBracketBased.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriodDeterminingBracket==null?"\\N":"" + fdtmPeriodDeterminingBracket, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFullYearObligation==null?"\\N":fcurFullYearObligation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedObligation==null?"\\N":fcurAdjustedObligation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInstalment1Due==null?"\\N":"" + fdtmInstalment1Due, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInstalment2Due==null?"\\N":"" + fdtmInstalment2Due, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBracket==null?"\\N":fcurBracket.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmObbBegin2==null?"\\N":"" + fdtmObbBegin2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBracket2==null?"\\N":fcurBracket2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceAtObbBegin2==null?"\\N":fcurBalanceAtObbBegin2.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLoanBalance==null?"\\N":fcurTotalLoanBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmObbBegin==null?"\\N":"" + fdtmObbBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceAtObbBegin==null?"\\N":fcurBalanceAtObbBegin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceBracketBased==null?"\\N":fcurBalanceBracketBased.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriodDeterminingBracket==null?"\\N":"" + fdtmPeriodDeterminingBracket, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFullYearObligation==null?"\\N":fcurFullYearObligation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedObligation==null?"\\N":fcurAdjustedObligation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInstalment1Due==null?"\\N":"" + fdtmInstalment1Due, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInstalment2Due==null?"\\N":"" + fdtmInstalment2Due, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBracket==null?"\\N":fcurBracket.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmObbBegin2==null?"\\N":"" + fdtmObbBegin2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBracket2==null?"\\N":fcurBracket2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceAtObbBegin2==null?"\\N":fcurBalanceAtObbBegin2.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLoanBalance = null; } else {
      this.fcurTotalLoanBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmObbBegin = null; } else {
      this.fdtmObbBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceAtObbBegin = null; } else {
      this.fcurBalanceAtObbBegin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceBracketBased = null; } else {
      this.fcurBalanceBracketBased = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriodDeterminingBracket = null; } else {
      this.fdtmPeriodDeterminingBracket = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFullYearObligation = null; } else {
      this.fcurFullYearObligation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedObligation = null; } else {
      this.fcurAdjustedObligation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInstalment1Due = null; } else {
      this.fdtmInstalment1Due = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInstalment2Due = null; } else {
      this.fdtmInstalment2Due = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBracket = null; } else {
      this.fcurBracket = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmObbBegin2 = null; } else {
      this.fdtmObbBegin2 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBracket2 = null; } else {
      this.fcurBracket2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceAtObbBegin2 = null; } else {
      this.fcurBalanceAtObbBegin2 = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLoanBalance = null; } else {
      this.fcurTotalLoanBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmObbBegin = null; } else {
      this.fdtmObbBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceAtObbBegin = null; } else {
      this.fcurBalanceAtObbBegin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceBracketBased = null; } else {
      this.fcurBalanceBracketBased = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriodDeterminingBracket = null; } else {
      this.fdtmPeriodDeterminingBracket = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFullYearObligation = null; } else {
      this.fcurFullYearObligation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedObligation = null; } else {
      this.fcurAdjustedObligation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInstalment1Due = null; } else {
      this.fdtmInstalment1Due = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInstalment2Due = null; } else {
      this.fdtmInstalment2Due = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBracket = null; } else {
      this.fcurBracket = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmObbBegin2 = null; } else {
      this.fdtmObbBegin2 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBracket2 = null; } else {
      this.fcurBracket2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceAtObbBegin2 = null; } else {
      this.fcurBalanceAtObbBegin2 = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnslsobligationsobb o = (tblnz_rtnslsobligationsobb) super.clone();
    o.fdtmObbBegin = (o.fdtmObbBegin != null) ? (java.sql.Timestamp) o.fdtmObbBegin.clone() : null;
    o.fdtmPeriodDeterminingBracket = (o.fdtmPeriodDeterminingBracket != null) ? (java.sql.Timestamp) o.fdtmPeriodDeterminingBracket.clone() : null;
    o.fdtmInstalment1Due = (o.fdtmInstalment1Due != null) ? (java.sql.Timestamp) o.fdtmInstalment1Due.clone() : null;
    o.fdtmInstalment2Due = (o.fdtmInstalment2Due != null) ? (java.sql.Timestamp) o.fdtmInstalment2Due.clone() : null;
    o.fdtmObbBegin2 = (o.fdtmObbBegin2 != null) ? (java.sql.Timestamp) o.fdtmObbBegin2.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnslsobligationsobb o) throws CloneNotSupportedException {
    o.fdtmObbBegin = (o.fdtmObbBegin != null) ? (java.sql.Timestamp) o.fdtmObbBegin.clone() : null;
    o.fdtmPeriodDeterminingBracket = (o.fdtmPeriodDeterminingBracket != null) ? (java.sql.Timestamp) o.fdtmPeriodDeterminingBracket.clone() : null;
    o.fdtmInstalment1Due = (o.fdtmInstalment1Due != null) ? (java.sql.Timestamp) o.fdtmInstalment1Due.clone() : null;
    o.fdtmInstalment2Due = (o.fdtmInstalment2Due != null) ? (java.sql.Timestamp) o.fdtmInstalment2Due.clone() : null;
    o.fdtmObbBegin2 = (o.fdtmObbBegin2 != null) ? (java.sql.Timestamp) o.fdtmObbBegin2.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTotalLoanBalance", this.fcurTotalLoanBalance);
    __sqoop$field_map.put("fdtmObbBegin", this.fdtmObbBegin);
    __sqoop$field_map.put("fcurBalanceAtObbBegin", this.fcurBalanceAtObbBegin);
    __sqoop$field_map.put("fcurBalanceBracketBased", this.fcurBalanceBracketBased);
    __sqoop$field_map.put("fdtmPeriodDeterminingBracket", this.fdtmPeriodDeterminingBracket);
    __sqoop$field_map.put("fcurFullYearObligation", this.fcurFullYearObligation);
    __sqoop$field_map.put("fcurAdjustedObligation", this.fcurAdjustedObligation);
    __sqoop$field_map.put("fdtmInstalment1Due", this.fdtmInstalment1Due);
    __sqoop$field_map.put("fdtmInstalment2Due", this.fdtmInstalment2Due);
    __sqoop$field_map.put("fcurBracket", this.fcurBracket);
    __sqoop$field_map.put("fdtmObbBegin2", this.fdtmObbBegin2);
    __sqoop$field_map.put("fcurBracket2", this.fcurBracket2);
    __sqoop$field_map.put("fcurBalanceAtObbBegin2", this.fcurBalanceAtObbBegin2);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTotalLoanBalance", this.fcurTotalLoanBalance);
    __sqoop$field_map.put("fdtmObbBegin", this.fdtmObbBegin);
    __sqoop$field_map.put("fcurBalanceAtObbBegin", this.fcurBalanceAtObbBegin);
    __sqoop$field_map.put("fcurBalanceBracketBased", this.fcurBalanceBracketBased);
    __sqoop$field_map.put("fdtmPeriodDeterminingBracket", this.fdtmPeriodDeterminingBracket);
    __sqoop$field_map.put("fcurFullYearObligation", this.fcurFullYearObligation);
    __sqoop$field_map.put("fcurAdjustedObligation", this.fcurAdjustedObligation);
    __sqoop$field_map.put("fdtmInstalment1Due", this.fdtmInstalment1Due);
    __sqoop$field_map.put("fdtmInstalment2Due", this.fdtmInstalment2Due);
    __sqoop$field_map.put("fcurBracket", this.fcurBracket);
    __sqoop$field_map.put("fdtmObbBegin2", this.fdtmObbBegin2);
    __sqoop$field_map.put("fcurBracket2", this.fcurBracket2);
    __sqoop$field_map.put("fcurBalanceAtObbBegin2", this.fcurBalanceAtObbBegin2);
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
