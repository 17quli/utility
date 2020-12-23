// ORM class for table 'tblnz_rtnicaannfdp'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:39:27 NZDT 2020
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

public class tblnz_rtnicaannfdp extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurFdpOpeningBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpOpeningBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpCreditsRec", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpCreditsRec = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpTotalCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpTotalCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpCreditsPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpCreditsPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpRefunded", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpRefunded = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpOtherDebits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpOtherDebits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpTotalDebits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpTotalDebits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpTotalBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpTotalBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpTransfer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpTransfer = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpClosingBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpClosingBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpImpPenaltyTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpImpPenaltyTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFdpTotalPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fcurFdpTotalPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaannfdp.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnicaannfdp() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnicaannfdp with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurFdpOpeningBalance;
  public java.math.BigDecimal get_fcurFdpOpeningBalance() {
    return fcurFdpOpeningBalance;
  }
  public void set_fcurFdpOpeningBalance(java.math.BigDecimal fcurFdpOpeningBalance) {
    this.fcurFdpOpeningBalance = fcurFdpOpeningBalance;
  }
  public tblnz_rtnicaannfdp with_fcurFdpOpeningBalance(java.math.BigDecimal fcurFdpOpeningBalance) {
    this.fcurFdpOpeningBalance = fcurFdpOpeningBalance;
    return this;
  }
  private java.math.BigDecimal fcurFdpPaid;
  public java.math.BigDecimal get_fcurFdpPaid() {
    return fcurFdpPaid;
  }
  public void set_fcurFdpPaid(java.math.BigDecimal fcurFdpPaid) {
    this.fcurFdpPaid = fcurFdpPaid;
  }
  public tblnz_rtnicaannfdp with_fcurFdpPaid(java.math.BigDecimal fcurFdpPaid) {
    this.fcurFdpPaid = fcurFdpPaid;
    return this;
  }
  private java.math.BigDecimal fcurFdpCreditsRec;
  public java.math.BigDecimal get_fcurFdpCreditsRec() {
    return fcurFdpCreditsRec;
  }
  public void set_fcurFdpCreditsRec(java.math.BigDecimal fcurFdpCreditsRec) {
    this.fcurFdpCreditsRec = fcurFdpCreditsRec;
  }
  public tblnz_rtnicaannfdp with_fcurFdpCreditsRec(java.math.BigDecimal fcurFdpCreditsRec) {
    this.fcurFdpCreditsRec = fcurFdpCreditsRec;
    return this;
  }
  private java.math.BigDecimal fcurFdpTotalCredits;
  public java.math.BigDecimal get_fcurFdpTotalCredits() {
    return fcurFdpTotalCredits;
  }
  public void set_fcurFdpTotalCredits(java.math.BigDecimal fcurFdpTotalCredits) {
    this.fcurFdpTotalCredits = fcurFdpTotalCredits;
  }
  public tblnz_rtnicaannfdp with_fcurFdpTotalCredits(java.math.BigDecimal fcurFdpTotalCredits) {
    this.fcurFdpTotalCredits = fcurFdpTotalCredits;
    return this;
  }
  private java.math.BigDecimal fcurFdpCreditsPaid;
  public java.math.BigDecimal get_fcurFdpCreditsPaid() {
    return fcurFdpCreditsPaid;
  }
  public void set_fcurFdpCreditsPaid(java.math.BigDecimal fcurFdpCreditsPaid) {
    this.fcurFdpCreditsPaid = fcurFdpCreditsPaid;
  }
  public tblnz_rtnicaannfdp with_fcurFdpCreditsPaid(java.math.BigDecimal fcurFdpCreditsPaid) {
    this.fcurFdpCreditsPaid = fcurFdpCreditsPaid;
    return this;
  }
  private java.math.BigDecimal fcurFdpRefunded;
  public java.math.BigDecimal get_fcurFdpRefunded() {
    return fcurFdpRefunded;
  }
  public void set_fcurFdpRefunded(java.math.BigDecimal fcurFdpRefunded) {
    this.fcurFdpRefunded = fcurFdpRefunded;
  }
  public tblnz_rtnicaannfdp with_fcurFdpRefunded(java.math.BigDecimal fcurFdpRefunded) {
    this.fcurFdpRefunded = fcurFdpRefunded;
    return this;
  }
  private java.math.BigDecimal fcurFdpOtherDebits;
  public java.math.BigDecimal get_fcurFdpOtherDebits() {
    return fcurFdpOtherDebits;
  }
  public void set_fcurFdpOtherDebits(java.math.BigDecimal fcurFdpOtherDebits) {
    this.fcurFdpOtherDebits = fcurFdpOtherDebits;
  }
  public tblnz_rtnicaannfdp with_fcurFdpOtherDebits(java.math.BigDecimal fcurFdpOtherDebits) {
    this.fcurFdpOtherDebits = fcurFdpOtherDebits;
    return this;
  }
  private java.math.BigDecimal fcurFdpTotalDebits;
  public java.math.BigDecimal get_fcurFdpTotalDebits() {
    return fcurFdpTotalDebits;
  }
  public void set_fcurFdpTotalDebits(java.math.BigDecimal fcurFdpTotalDebits) {
    this.fcurFdpTotalDebits = fcurFdpTotalDebits;
  }
  public tblnz_rtnicaannfdp with_fcurFdpTotalDebits(java.math.BigDecimal fcurFdpTotalDebits) {
    this.fcurFdpTotalDebits = fcurFdpTotalDebits;
    return this;
  }
  private java.math.BigDecimal fcurFdpTotalBalance;
  public java.math.BigDecimal get_fcurFdpTotalBalance() {
    return fcurFdpTotalBalance;
  }
  public void set_fcurFdpTotalBalance(java.math.BigDecimal fcurFdpTotalBalance) {
    this.fcurFdpTotalBalance = fcurFdpTotalBalance;
  }
  public tblnz_rtnicaannfdp with_fcurFdpTotalBalance(java.math.BigDecimal fcurFdpTotalBalance) {
    this.fcurFdpTotalBalance = fcurFdpTotalBalance;
    return this;
  }
  private java.math.BigDecimal fcurFdpTransfer;
  public java.math.BigDecimal get_fcurFdpTransfer() {
    return fcurFdpTransfer;
  }
  public void set_fcurFdpTransfer(java.math.BigDecimal fcurFdpTransfer) {
    this.fcurFdpTransfer = fcurFdpTransfer;
  }
  public tblnz_rtnicaannfdp with_fcurFdpTransfer(java.math.BigDecimal fcurFdpTransfer) {
    this.fcurFdpTransfer = fcurFdpTransfer;
    return this;
  }
  private java.math.BigDecimal fcurFdpClosingBalance;
  public java.math.BigDecimal get_fcurFdpClosingBalance() {
    return fcurFdpClosingBalance;
  }
  public void set_fcurFdpClosingBalance(java.math.BigDecimal fcurFdpClosingBalance) {
    this.fcurFdpClosingBalance = fcurFdpClosingBalance;
  }
  public tblnz_rtnicaannfdp with_fcurFdpClosingBalance(java.math.BigDecimal fcurFdpClosingBalance) {
    this.fcurFdpClosingBalance = fcurFdpClosingBalance;
    return this;
  }
  private java.math.BigDecimal fcurFdpImpPenaltyTax;
  public java.math.BigDecimal get_fcurFdpImpPenaltyTax() {
    return fcurFdpImpPenaltyTax;
  }
  public void set_fcurFdpImpPenaltyTax(java.math.BigDecimal fcurFdpImpPenaltyTax) {
    this.fcurFdpImpPenaltyTax = fcurFdpImpPenaltyTax;
  }
  public tblnz_rtnicaannfdp with_fcurFdpImpPenaltyTax(java.math.BigDecimal fcurFdpImpPenaltyTax) {
    this.fcurFdpImpPenaltyTax = fcurFdpImpPenaltyTax;
    return this;
  }
  private java.math.BigDecimal fcurFdpTotalPayable;
  public java.math.BigDecimal get_fcurFdpTotalPayable() {
    return fcurFdpTotalPayable;
  }
  public void set_fcurFdpTotalPayable(java.math.BigDecimal fcurFdpTotalPayable) {
    this.fcurFdpTotalPayable = fcurFdpTotalPayable;
  }
  public tblnz_rtnicaannfdp with_fcurFdpTotalPayable(java.math.BigDecimal fcurFdpTotalPayable) {
    this.fcurFdpTotalPayable = fcurFdpTotalPayable;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnicaannfdp with_fstrWho(String fstrWho) {
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
  public tblnz_rtnicaannfdp with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnicaannfdp)) {
      return false;
    }
    tblnz_rtnicaannfdp that = (tblnz_rtnicaannfdp) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurFdpOpeningBalance == null ? that.fcurFdpOpeningBalance == null : this.fcurFdpOpeningBalance.equals(that.fcurFdpOpeningBalance));
    equal = equal && (this.fcurFdpPaid == null ? that.fcurFdpPaid == null : this.fcurFdpPaid.equals(that.fcurFdpPaid));
    equal = equal && (this.fcurFdpCreditsRec == null ? that.fcurFdpCreditsRec == null : this.fcurFdpCreditsRec.equals(that.fcurFdpCreditsRec));
    equal = equal && (this.fcurFdpTotalCredits == null ? that.fcurFdpTotalCredits == null : this.fcurFdpTotalCredits.equals(that.fcurFdpTotalCredits));
    equal = equal && (this.fcurFdpCreditsPaid == null ? that.fcurFdpCreditsPaid == null : this.fcurFdpCreditsPaid.equals(that.fcurFdpCreditsPaid));
    equal = equal && (this.fcurFdpRefunded == null ? that.fcurFdpRefunded == null : this.fcurFdpRefunded.equals(that.fcurFdpRefunded));
    equal = equal && (this.fcurFdpOtherDebits == null ? that.fcurFdpOtherDebits == null : this.fcurFdpOtherDebits.equals(that.fcurFdpOtherDebits));
    equal = equal && (this.fcurFdpTotalDebits == null ? that.fcurFdpTotalDebits == null : this.fcurFdpTotalDebits.equals(that.fcurFdpTotalDebits));
    equal = equal && (this.fcurFdpTotalBalance == null ? that.fcurFdpTotalBalance == null : this.fcurFdpTotalBalance.equals(that.fcurFdpTotalBalance));
    equal = equal && (this.fcurFdpTransfer == null ? that.fcurFdpTransfer == null : this.fcurFdpTransfer.equals(that.fcurFdpTransfer));
    equal = equal && (this.fcurFdpClosingBalance == null ? that.fcurFdpClosingBalance == null : this.fcurFdpClosingBalance.equals(that.fcurFdpClosingBalance));
    equal = equal && (this.fcurFdpImpPenaltyTax == null ? that.fcurFdpImpPenaltyTax == null : this.fcurFdpImpPenaltyTax.equals(that.fcurFdpImpPenaltyTax));
    equal = equal && (this.fcurFdpTotalPayable == null ? that.fcurFdpTotalPayable == null : this.fcurFdpTotalPayable.equals(that.fcurFdpTotalPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnicaannfdp)) {
      return false;
    }
    tblnz_rtnicaannfdp that = (tblnz_rtnicaannfdp) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurFdpOpeningBalance == null ? that.fcurFdpOpeningBalance == null : this.fcurFdpOpeningBalance.equals(that.fcurFdpOpeningBalance));
    equal = equal && (this.fcurFdpPaid == null ? that.fcurFdpPaid == null : this.fcurFdpPaid.equals(that.fcurFdpPaid));
    equal = equal && (this.fcurFdpCreditsRec == null ? that.fcurFdpCreditsRec == null : this.fcurFdpCreditsRec.equals(that.fcurFdpCreditsRec));
    equal = equal && (this.fcurFdpTotalCredits == null ? that.fcurFdpTotalCredits == null : this.fcurFdpTotalCredits.equals(that.fcurFdpTotalCredits));
    equal = equal && (this.fcurFdpCreditsPaid == null ? that.fcurFdpCreditsPaid == null : this.fcurFdpCreditsPaid.equals(that.fcurFdpCreditsPaid));
    equal = equal && (this.fcurFdpRefunded == null ? that.fcurFdpRefunded == null : this.fcurFdpRefunded.equals(that.fcurFdpRefunded));
    equal = equal && (this.fcurFdpOtherDebits == null ? that.fcurFdpOtherDebits == null : this.fcurFdpOtherDebits.equals(that.fcurFdpOtherDebits));
    equal = equal && (this.fcurFdpTotalDebits == null ? that.fcurFdpTotalDebits == null : this.fcurFdpTotalDebits.equals(that.fcurFdpTotalDebits));
    equal = equal && (this.fcurFdpTotalBalance == null ? that.fcurFdpTotalBalance == null : this.fcurFdpTotalBalance.equals(that.fcurFdpTotalBalance));
    equal = equal && (this.fcurFdpTransfer == null ? that.fcurFdpTransfer == null : this.fcurFdpTransfer.equals(that.fcurFdpTransfer));
    equal = equal && (this.fcurFdpClosingBalance == null ? that.fcurFdpClosingBalance == null : this.fcurFdpClosingBalance.equals(that.fcurFdpClosingBalance));
    equal = equal && (this.fcurFdpImpPenaltyTax == null ? that.fcurFdpImpPenaltyTax == null : this.fcurFdpImpPenaltyTax.equals(that.fcurFdpImpPenaltyTax));
    equal = equal && (this.fcurFdpTotalPayable == null ? that.fcurFdpTotalPayable == null : this.fcurFdpTotalPayable.equals(that.fcurFdpTotalPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurFdpOpeningBalance = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurFdpPaid = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurFdpCreditsRec = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurFdpTotalCredits = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurFdpCreditsPaid = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurFdpRefunded = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurFdpOtherDebits = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurFdpTotalDebits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurFdpTotalBalance = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurFdpTransfer = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurFdpClosingBalance = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurFdpImpPenaltyTax = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurFdpTotalPayable = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurFdpOpeningBalance = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurFdpPaid = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurFdpCreditsRec = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurFdpTotalCredits = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurFdpCreditsPaid = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurFdpRefunded = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurFdpOtherDebits = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurFdpTotalDebits = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurFdpTotalBalance = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurFdpTransfer = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurFdpClosingBalance = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurFdpImpPenaltyTax = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurFdpTotalPayable = JdbcWritableBridge.readBigDecimal(14, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurFdpOpeningBalance, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpPaid, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpCreditsRec, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTotalCredits, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpCreditsPaid, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpRefunded, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpOtherDebits, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTotalDebits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTotalBalance, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTransfer, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpClosingBalance, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpImpPenaltyTax, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTotalPayable, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpOpeningBalance, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpPaid, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpCreditsRec, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTotalCredits, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpCreditsPaid, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpRefunded, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpOtherDebits, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTotalDebits, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTotalBalance, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTransfer, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpClosingBalance, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpImpPenaltyTax, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFdpTotalPayable, 14 + __off, 3, __dbStmt);
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
        this.fcurFdpOpeningBalance = null;
    } else {
    this.fcurFdpOpeningBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpPaid = null;
    } else {
    this.fcurFdpPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpCreditsRec = null;
    } else {
    this.fcurFdpCreditsRec = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpTotalCredits = null;
    } else {
    this.fcurFdpTotalCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpCreditsPaid = null;
    } else {
    this.fcurFdpCreditsPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpRefunded = null;
    } else {
    this.fcurFdpRefunded = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpOtherDebits = null;
    } else {
    this.fcurFdpOtherDebits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpTotalDebits = null;
    } else {
    this.fcurFdpTotalDebits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpTotalBalance = null;
    } else {
    this.fcurFdpTotalBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpTransfer = null;
    } else {
    this.fcurFdpTransfer = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpClosingBalance = null;
    } else {
    this.fcurFdpClosingBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpImpPenaltyTax = null;
    } else {
    this.fcurFdpImpPenaltyTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFdpTotalPayable = null;
    } else {
    this.fcurFdpTotalPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurFdpOpeningBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpOpeningBalance, __dataOut);
    }
    if (null == this.fcurFdpPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpPaid, __dataOut);
    }
    if (null == this.fcurFdpCreditsRec) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpCreditsRec, __dataOut);
    }
    if (null == this.fcurFdpTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTotalCredits, __dataOut);
    }
    if (null == this.fcurFdpCreditsPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpCreditsPaid, __dataOut);
    }
    if (null == this.fcurFdpRefunded) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpRefunded, __dataOut);
    }
    if (null == this.fcurFdpOtherDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpOtherDebits, __dataOut);
    }
    if (null == this.fcurFdpTotalDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTotalDebits, __dataOut);
    }
    if (null == this.fcurFdpTotalBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTotalBalance, __dataOut);
    }
    if (null == this.fcurFdpTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTransfer, __dataOut);
    }
    if (null == this.fcurFdpClosingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpClosingBalance, __dataOut);
    }
    if (null == this.fcurFdpImpPenaltyTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpImpPenaltyTax, __dataOut);
    }
    if (null == this.fcurFdpTotalPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTotalPayable, __dataOut);
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
    if (null == this.fcurFdpOpeningBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpOpeningBalance, __dataOut);
    }
    if (null == this.fcurFdpPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpPaid, __dataOut);
    }
    if (null == this.fcurFdpCreditsRec) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpCreditsRec, __dataOut);
    }
    if (null == this.fcurFdpTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTotalCredits, __dataOut);
    }
    if (null == this.fcurFdpCreditsPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpCreditsPaid, __dataOut);
    }
    if (null == this.fcurFdpRefunded) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpRefunded, __dataOut);
    }
    if (null == this.fcurFdpOtherDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpOtherDebits, __dataOut);
    }
    if (null == this.fcurFdpTotalDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTotalDebits, __dataOut);
    }
    if (null == this.fcurFdpTotalBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTotalBalance, __dataOut);
    }
    if (null == this.fcurFdpTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTransfer, __dataOut);
    }
    if (null == this.fcurFdpClosingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpClosingBalance, __dataOut);
    }
    if (null == this.fcurFdpImpPenaltyTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpImpPenaltyTax, __dataOut);
    }
    if (null == this.fcurFdpTotalPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFdpTotalPayable, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpOpeningBalance==null?"\\N":fcurFdpOpeningBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpPaid==null?"\\N":fcurFdpPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpCreditsRec==null?"\\N":fcurFdpCreditsRec.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTotalCredits==null?"\\N":fcurFdpTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpCreditsPaid==null?"\\N":fcurFdpCreditsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpRefunded==null?"\\N":fcurFdpRefunded.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpOtherDebits==null?"\\N":fcurFdpOtherDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTotalDebits==null?"\\N":fcurFdpTotalDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTotalBalance==null?"\\N":fcurFdpTotalBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTransfer==null?"\\N":fcurFdpTransfer.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpClosingBalance==null?"\\N":fcurFdpClosingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpImpPenaltyTax==null?"\\N":fcurFdpImpPenaltyTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTotalPayable==null?"\\N":fcurFdpTotalPayable.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpOpeningBalance==null?"\\N":fcurFdpOpeningBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpPaid==null?"\\N":fcurFdpPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpCreditsRec==null?"\\N":fcurFdpCreditsRec.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTotalCredits==null?"\\N":fcurFdpTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpCreditsPaid==null?"\\N":fcurFdpCreditsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpRefunded==null?"\\N":fcurFdpRefunded.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpOtherDebits==null?"\\N":fcurFdpOtherDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTotalDebits==null?"\\N":fcurFdpTotalDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTotalBalance==null?"\\N":fcurFdpTotalBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTransfer==null?"\\N":fcurFdpTransfer.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpClosingBalance==null?"\\N":fcurFdpClosingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpImpPenaltyTax==null?"\\N":fcurFdpImpPenaltyTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFdpTotalPayable==null?"\\N":fcurFdpTotalPayable.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpOpeningBalance = null; } else {
      this.fcurFdpOpeningBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpPaid = null; } else {
      this.fcurFdpPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpCreditsRec = null; } else {
      this.fcurFdpCreditsRec = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTotalCredits = null; } else {
      this.fcurFdpTotalCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpCreditsPaid = null; } else {
      this.fcurFdpCreditsPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpRefunded = null; } else {
      this.fcurFdpRefunded = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpOtherDebits = null; } else {
      this.fcurFdpOtherDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTotalDebits = null; } else {
      this.fcurFdpTotalDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTotalBalance = null; } else {
      this.fcurFdpTotalBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTransfer = null; } else {
      this.fcurFdpTransfer = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpClosingBalance = null; } else {
      this.fcurFdpClosingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpImpPenaltyTax = null; } else {
      this.fcurFdpImpPenaltyTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTotalPayable = null; } else {
      this.fcurFdpTotalPayable = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpOpeningBalance = null; } else {
      this.fcurFdpOpeningBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpPaid = null; } else {
      this.fcurFdpPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpCreditsRec = null; } else {
      this.fcurFdpCreditsRec = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTotalCredits = null; } else {
      this.fcurFdpTotalCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpCreditsPaid = null; } else {
      this.fcurFdpCreditsPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpRefunded = null; } else {
      this.fcurFdpRefunded = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpOtherDebits = null; } else {
      this.fcurFdpOtherDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTotalDebits = null; } else {
      this.fcurFdpTotalDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTotalBalance = null; } else {
      this.fcurFdpTotalBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTransfer = null; } else {
      this.fcurFdpTransfer = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpClosingBalance = null; } else {
      this.fcurFdpClosingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpImpPenaltyTax = null; } else {
      this.fcurFdpImpPenaltyTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFdpTotalPayable = null; } else {
      this.fcurFdpTotalPayable = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnicaannfdp o = (tblnz_rtnicaannfdp) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnicaannfdp o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurFdpOpeningBalance", this.fcurFdpOpeningBalance);
    __sqoop$field_map.put("fcurFdpPaid", this.fcurFdpPaid);
    __sqoop$field_map.put("fcurFdpCreditsRec", this.fcurFdpCreditsRec);
    __sqoop$field_map.put("fcurFdpTotalCredits", this.fcurFdpTotalCredits);
    __sqoop$field_map.put("fcurFdpCreditsPaid", this.fcurFdpCreditsPaid);
    __sqoop$field_map.put("fcurFdpRefunded", this.fcurFdpRefunded);
    __sqoop$field_map.put("fcurFdpOtherDebits", this.fcurFdpOtherDebits);
    __sqoop$field_map.put("fcurFdpTotalDebits", this.fcurFdpTotalDebits);
    __sqoop$field_map.put("fcurFdpTotalBalance", this.fcurFdpTotalBalance);
    __sqoop$field_map.put("fcurFdpTransfer", this.fcurFdpTransfer);
    __sqoop$field_map.put("fcurFdpClosingBalance", this.fcurFdpClosingBalance);
    __sqoop$field_map.put("fcurFdpImpPenaltyTax", this.fcurFdpImpPenaltyTax);
    __sqoop$field_map.put("fcurFdpTotalPayable", this.fcurFdpTotalPayable);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurFdpOpeningBalance", this.fcurFdpOpeningBalance);
    __sqoop$field_map.put("fcurFdpPaid", this.fcurFdpPaid);
    __sqoop$field_map.put("fcurFdpCreditsRec", this.fcurFdpCreditsRec);
    __sqoop$field_map.put("fcurFdpTotalCredits", this.fcurFdpTotalCredits);
    __sqoop$field_map.put("fcurFdpCreditsPaid", this.fcurFdpCreditsPaid);
    __sqoop$field_map.put("fcurFdpRefunded", this.fcurFdpRefunded);
    __sqoop$field_map.put("fcurFdpOtherDebits", this.fcurFdpOtherDebits);
    __sqoop$field_map.put("fcurFdpTotalDebits", this.fcurFdpTotalDebits);
    __sqoop$field_map.put("fcurFdpTotalBalance", this.fcurFdpTotalBalance);
    __sqoop$field_map.put("fcurFdpTransfer", this.fcurFdpTransfer);
    __sqoop$field_map.put("fcurFdpClosingBalance", this.fcurFdpClosingBalance);
    __sqoop$field_map.put("fcurFdpImpPenaltyTax", this.fcurFdpImpPenaltyTax);
    __sqoop$field_map.put("fcurFdpTotalPayable", this.fcurFdpTotalPayable);
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
