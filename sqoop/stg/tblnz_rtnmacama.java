// ORM class for table 'tblnz_rtnmacama'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:12:14 NZDT 2020
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

public class tblnz_rtnmacama extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurAuthOpeningBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthOpeningBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthIncomeTaxCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthIncomeTaxCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthFDPCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthFDPCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthRWTCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthRWTCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthImputationCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthImputationCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthOtherCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthOtherCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthTotalCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthTotalCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthIncomeTaxDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthIncomeTaxDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthFDPDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthFDPDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthMaoriDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthMaoriDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthOtherDebits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthOtherDebits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthTotalDebits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthTotalDebits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthFurtherIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthFurtherIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthClosingBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthClosingBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthPenaltyTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthPenaltyTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAuthTotalPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fcurAuthTotalPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnmacama.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnmacama() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnmacama with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurAuthOpeningBalance;
  public java.math.BigDecimal get_fcurAuthOpeningBalance() {
    return fcurAuthOpeningBalance;
  }
  public void set_fcurAuthOpeningBalance(java.math.BigDecimal fcurAuthOpeningBalance) {
    this.fcurAuthOpeningBalance = fcurAuthOpeningBalance;
  }
  public tblnz_rtnmacama with_fcurAuthOpeningBalance(java.math.BigDecimal fcurAuthOpeningBalance) {
    this.fcurAuthOpeningBalance = fcurAuthOpeningBalance;
    return this;
  }
  private java.math.BigDecimal fcurAuthIncomeTaxCredit;
  public java.math.BigDecimal get_fcurAuthIncomeTaxCredit() {
    return fcurAuthIncomeTaxCredit;
  }
  public void set_fcurAuthIncomeTaxCredit(java.math.BigDecimal fcurAuthIncomeTaxCredit) {
    this.fcurAuthIncomeTaxCredit = fcurAuthIncomeTaxCredit;
  }
  public tblnz_rtnmacama with_fcurAuthIncomeTaxCredit(java.math.BigDecimal fcurAuthIncomeTaxCredit) {
    this.fcurAuthIncomeTaxCredit = fcurAuthIncomeTaxCredit;
    return this;
  }
  private java.math.BigDecimal fcurAuthFDPCredit;
  public java.math.BigDecimal get_fcurAuthFDPCredit() {
    return fcurAuthFDPCredit;
  }
  public void set_fcurAuthFDPCredit(java.math.BigDecimal fcurAuthFDPCredit) {
    this.fcurAuthFDPCredit = fcurAuthFDPCredit;
  }
  public tblnz_rtnmacama with_fcurAuthFDPCredit(java.math.BigDecimal fcurAuthFDPCredit) {
    this.fcurAuthFDPCredit = fcurAuthFDPCredit;
    return this;
  }
  private java.math.BigDecimal fcurAuthRWTCredit;
  public java.math.BigDecimal get_fcurAuthRWTCredit() {
    return fcurAuthRWTCredit;
  }
  public void set_fcurAuthRWTCredit(java.math.BigDecimal fcurAuthRWTCredit) {
    this.fcurAuthRWTCredit = fcurAuthRWTCredit;
  }
  public tblnz_rtnmacama with_fcurAuthRWTCredit(java.math.BigDecimal fcurAuthRWTCredit) {
    this.fcurAuthRWTCredit = fcurAuthRWTCredit;
    return this;
  }
  private java.math.BigDecimal fcurAuthImputationCredit;
  public java.math.BigDecimal get_fcurAuthImputationCredit() {
    return fcurAuthImputationCredit;
  }
  public void set_fcurAuthImputationCredit(java.math.BigDecimal fcurAuthImputationCredit) {
    this.fcurAuthImputationCredit = fcurAuthImputationCredit;
  }
  public tblnz_rtnmacama with_fcurAuthImputationCredit(java.math.BigDecimal fcurAuthImputationCredit) {
    this.fcurAuthImputationCredit = fcurAuthImputationCredit;
    return this;
  }
  private java.math.BigDecimal fcurAuthOtherCredits;
  public java.math.BigDecimal get_fcurAuthOtherCredits() {
    return fcurAuthOtherCredits;
  }
  public void set_fcurAuthOtherCredits(java.math.BigDecimal fcurAuthOtherCredits) {
    this.fcurAuthOtherCredits = fcurAuthOtherCredits;
  }
  public tblnz_rtnmacama with_fcurAuthOtherCredits(java.math.BigDecimal fcurAuthOtherCredits) {
    this.fcurAuthOtherCredits = fcurAuthOtherCredits;
    return this;
  }
  private java.math.BigDecimal fcurAuthTotalCredits;
  public java.math.BigDecimal get_fcurAuthTotalCredits() {
    return fcurAuthTotalCredits;
  }
  public void set_fcurAuthTotalCredits(java.math.BigDecimal fcurAuthTotalCredits) {
    this.fcurAuthTotalCredits = fcurAuthTotalCredits;
  }
  public tblnz_rtnmacama with_fcurAuthTotalCredits(java.math.BigDecimal fcurAuthTotalCredits) {
    this.fcurAuthTotalCredits = fcurAuthTotalCredits;
    return this;
  }
  private java.math.BigDecimal fcurAuthIncomeTaxDebit;
  public java.math.BigDecimal get_fcurAuthIncomeTaxDebit() {
    return fcurAuthIncomeTaxDebit;
  }
  public void set_fcurAuthIncomeTaxDebit(java.math.BigDecimal fcurAuthIncomeTaxDebit) {
    this.fcurAuthIncomeTaxDebit = fcurAuthIncomeTaxDebit;
  }
  public tblnz_rtnmacama with_fcurAuthIncomeTaxDebit(java.math.BigDecimal fcurAuthIncomeTaxDebit) {
    this.fcurAuthIncomeTaxDebit = fcurAuthIncomeTaxDebit;
    return this;
  }
  private java.math.BigDecimal fcurAuthFDPDebit;
  public java.math.BigDecimal get_fcurAuthFDPDebit() {
    return fcurAuthFDPDebit;
  }
  public void set_fcurAuthFDPDebit(java.math.BigDecimal fcurAuthFDPDebit) {
    this.fcurAuthFDPDebit = fcurAuthFDPDebit;
  }
  public tblnz_rtnmacama with_fcurAuthFDPDebit(java.math.BigDecimal fcurAuthFDPDebit) {
    this.fcurAuthFDPDebit = fcurAuthFDPDebit;
    return this;
  }
  private java.math.BigDecimal fcurAuthMaoriDebit;
  public java.math.BigDecimal get_fcurAuthMaoriDebit() {
    return fcurAuthMaoriDebit;
  }
  public void set_fcurAuthMaoriDebit(java.math.BigDecimal fcurAuthMaoriDebit) {
    this.fcurAuthMaoriDebit = fcurAuthMaoriDebit;
  }
  public tblnz_rtnmacama with_fcurAuthMaoriDebit(java.math.BigDecimal fcurAuthMaoriDebit) {
    this.fcurAuthMaoriDebit = fcurAuthMaoriDebit;
    return this;
  }
  private java.math.BigDecimal fcurAuthOtherDebits;
  public java.math.BigDecimal get_fcurAuthOtherDebits() {
    return fcurAuthOtherDebits;
  }
  public void set_fcurAuthOtherDebits(java.math.BigDecimal fcurAuthOtherDebits) {
    this.fcurAuthOtherDebits = fcurAuthOtherDebits;
  }
  public tblnz_rtnmacama with_fcurAuthOtherDebits(java.math.BigDecimal fcurAuthOtherDebits) {
    this.fcurAuthOtherDebits = fcurAuthOtherDebits;
    return this;
  }
  private java.math.BigDecimal fcurAuthTotalDebits;
  public java.math.BigDecimal get_fcurAuthTotalDebits() {
    return fcurAuthTotalDebits;
  }
  public void set_fcurAuthTotalDebits(java.math.BigDecimal fcurAuthTotalDebits) {
    this.fcurAuthTotalDebits = fcurAuthTotalDebits;
  }
  public tblnz_rtnmacama with_fcurAuthTotalDebits(java.math.BigDecimal fcurAuthTotalDebits) {
    this.fcurAuthTotalDebits = fcurAuthTotalDebits;
    return this;
  }
  private java.math.BigDecimal fcurAuthFurtherIncomeTax;
  public java.math.BigDecimal get_fcurAuthFurtherIncomeTax() {
    return fcurAuthFurtherIncomeTax;
  }
  public void set_fcurAuthFurtherIncomeTax(java.math.BigDecimal fcurAuthFurtherIncomeTax) {
    this.fcurAuthFurtherIncomeTax = fcurAuthFurtherIncomeTax;
  }
  public tblnz_rtnmacama with_fcurAuthFurtherIncomeTax(java.math.BigDecimal fcurAuthFurtherIncomeTax) {
    this.fcurAuthFurtherIncomeTax = fcurAuthFurtherIncomeTax;
    return this;
  }
  private java.math.BigDecimal fcurAuthClosingBalance;
  public java.math.BigDecimal get_fcurAuthClosingBalance() {
    return fcurAuthClosingBalance;
  }
  public void set_fcurAuthClosingBalance(java.math.BigDecimal fcurAuthClosingBalance) {
    this.fcurAuthClosingBalance = fcurAuthClosingBalance;
  }
  public tblnz_rtnmacama with_fcurAuthClosingBalance(java.math.BigDecimal fcurAuthClosingBalance) {
    this.fcurAuthClosingBalance = fcurAuthClosingBalance;
    return this;
  }
  private java.math.BigDecimal fcurAuthPenaltyTax;
  public java.math.BigDecimal get_fcurAuthPenaltyTax() {
    return fcurAuthPenaltyTax;
  }
  public void set_fcurAuthPenaltyTax(java.math.BigDecimal fcurAuthPenaltyTax) {
    this.fcurAuthPenaltyTax = fcurAuthPenaltyTax;
  }
  public tblnz_rtnmacama with_fcurAuthPenaltyTax(java.math.BigDecimal fcurAuthPenaltyTax) {
    this.fcurAuthPenaltyTax = fcurAuthPenaltyTax;
    return this;
  }
  private java.math.BigDecimal fcurAuthTotalPayable;
  public java.math.BigDecimal get_fcurAuthTotalPayable() {
    return fcurAuthTotalPayable;
  }
  public void set_fcurAuthTotalPayable(java.math.BigDecimal fcurAuthTotalPayable) {
    this.fcurAuthTotalPayable = fcurAuthTotalPayable;
  }
  public tblnz_rtnmacama with_fcurAuthTotalPayable(java.math.BigDecimal fcurAuthTotalPayable) {
    this.fcurAuthTotalPayable = fcurAuthTotalPayable;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnmacama with_fstrWho(String fstrWho) {
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
  public tblnz_rtnmacama with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnmacama)) {
      return false;
    }
    tblnz_rtnmacama that = (tblnz_rtnmacama) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurAuthOpeningBalance == null ? that.fcurAuthOpeningBalance == null : this.fcurAuthOpeningBalance.equals(that.fcurAuthOpeningBalance));
    equal = equal && (this.fcurAuthIncomeTaxCredit == null ? that.fcurAuthIncomeTaxCredit == null : this.fcurAuthIncomeTaxCredit.equals(that.fcurAuthIncomeTaxCredit));
    equal = equal && (this.fcurAuthFDPCredit == null ? that.fcurAuthFDPCredit == null : this.fcurAuthFDPCredit.equals(that.fcurAuthFDPCredit));
    equal = equal && (this.fcurAuthRWTCredit == null ? that.fcurAuthRWTCredit == null : this.fcurAuthRWTCredit.equals(that.fcurAuthRWTCredit));
    equal = equal && (this.fcurAuthImputationCredit == null ? that.fcurAuthImputationCredit == null : this.fcurAuthImputationCredit.equals(that.fcurAuthImputationCredit));
    equal = equal && (this.fcurAuthOtherCredits == null ? that.fcurAuthOtherCredits == null : this.fcurAuthOtherCredits.equals(that.fcurAuthOtherCredits));
    equal = equal && (this.fcurAuthTotalCredits == null ? that.fcurAuthTotalCredits == null : this.fcurAuthTotalCredits.equals(that.fcurAuthTotalCredits));
    equal = equal && (this.fcurAuthIncomeTaxDebit == null ? that.fcurAuthIncomeTaxDebit == null : this.fcurAuthIncomeTaxDebit.equals(that.fcurAuthIncomeTaxDebit));
    equal = equal && (this.fcurAuthFDPDebit == null ? that.fcurAuthFDPDebit == null : this.fcurAuthFDPDebit.equals(that.fcurAuthFDPDebit));
    equal = equal && (this.fcurAuthMaoriDebit == null ? that.fcurAuthMaoriDebit == null : this.fcurAuthMaoriDebit.equals(that.fcurAuthMaoriDebit));
    equal = equal && (this.fcurAuthOtherDebits == null ? that.fcurAuthOtherDebits == null : this.fcurAuthOtherDebits.equals(that.fcurAuthOtherDebits));
    equal = equal && (this.fcurAuthTotalDebits == null ? that.fcurAuthTotalDebits == null : this.fcurAuthTotalDebits.equals(that.fcurAuthTotalDebits));
    equal = equal && (this.fcurAuthFurtherIncomeTax == null ? that.fcurAuthFurtherIncomeTax == null : this.fcurAuthFurtherIncomeTax.equals(that.fcurAuthFurtherIncomeTax));
    equal = equal && (this.fcurAuthClosingBalance == null ? that.fcurAuthClosingBalance == null : this.fcurAuthClosingBalance.equals(that.fcurAuthClosingBalance));
    equal = equal && (this.fcurAuthPenaltyTax == null ? that.fcurAuthPenaltyTax == null : this.fcurAuthPenaltyTax.equals(that.fcurAuthPenaltyTax));
    equal = equal && (this.fcurAuthTotalPayable == null ? that.fcurAuthTotalPayable == null : this.fcurAuthTotalPayable.equals(that.fcurAuthTotalPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnmacama)) {
      return false;
    }
    tblnz_rtnmacama that = (tblnz_rtnmacama) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurAuthOpeningBalance == null ? that.fcurAuthOpeningBalance == null : this.fcurAuthOpeningBalance.equals(that.fcurAuthOpeningBalance));
    equal = equal && (this.fcurAuthIncomeTaxCredit == null ? that.fcurAuthIncomeTaxCredit == null : this.fcurAuthIncomeTaxCredit.equals(that.fcurAuthIncomeTaxCredit));
    equal = equal && (this.fcurAuthFDPCredit == null ? that.fcurAuthFDPCredit == null : this.fcurAuthFDPCredit.equals(that.fcurAuthFDPCredit));
    equal = equal && (this.fcurAuthRWTCredit == null ? that.fcurAuthRWTCredit == null : this.fcurAuthRWTCredit.equals(that.fcurAuthRWTCredit));
    equal = equal && (this.fcurAuthImputationCredit == null ? that.fcurAuthImputationCredit == null : this.fcurAuthImputationCredit.equals(that.fcurAuthImputationCredit));
    equal = equal && (this.fcurAuthOtherCredits == null ? that.fcurAuthOtherCredits == null : this.fcurAuthOtherCredits.equals(that.fcurAuthOtherCredits));
    equal = equal && (this.fcurAuthTotalCredits == null ? that.fcurAuthTotalCredits == null : this.fcurAuthTotalCredits.equals(that.fcurAuthTotalCredits));
    equal = equal && (this.fcurAuthIncomeTaxDebit == null ? that.fcurAuthIncomeTaxDebit == null : this.fcurAuthIncomeTaxDebit.equals(that.fcurAuthIncomeTaxDebit));
    equal = equal && (this.fcurAuthFDPDebit == null ? that.fcurAuthFDPDebit == null : this.fcurAuthFDPDebit.equals(that.fcurAuthFDPDebit));
    equal = equal && (this.fcurAuthMaoriDebit == null ? that.fcurAuthMaoriDebit == null : this.fcurAuthMaoriDebit.equals(that.fcurAuthMaoriDebit));
    equal = equal && (this.fcurAuthOtherDebits == null ? that.fcurAuthOtherDebits == null : this.fcurAuthOtherDebits.equals(that.fcurAuthOtherDebits));
    equal = equal && (this.fcurAuthTotalDebits == null ? that.fcurAuthTotalDebits == null : this.fcurAuthTotalDebits.equals(that.fcurAuthTotalDebits));
    equal = equal && (this.fcurAuthFurtherIncomeTax == null ? that.fcurAuthFurtherIncomeTax == null : this.fcurAuthFurtherIncomeTax.equals(that.fcurAuthFurtherIncomeTax));
    equal = equal && (this.fcurAuthClosingBalance == null ? that.fcurAuthClosingBalance == null : this.fcurAuthClosingBalance.equals(that.fcurAuthClosingBalance));
    equal = equal && (this.fcurAuthPenaltyTax == null ? that.fcurAuthPenaltyTax == null : this.fcurAuthPenaltyTax.equals(that.fcurAuthPenaltyTax));
    equal = equal && (this.fcurAuthTotalPayable == null ? that.fcurAuthTotalPayable == null : this.fcurAuthTotalPayable.equals(that.fcurAuthTotalPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurAuthOpeningBalance = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurAuthIncomeTaxCredit = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurAuthFDPCredit = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurAuthRWTCredit = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurAuthImputationCredit = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurAuthOtherCredits = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAuthTotalCredits = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurAuthIncomeTaxDebit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAuthFDPDebit = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurAuthMaoriDebit = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurAuthOtherDebits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurAuthTotalDebits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAuthFurtherIncomeTax = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurAuthClosingBalance = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurAuthPenaltyTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurAuthTotalPayable = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurAuthOpeningBalance = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurAuthIncomeTaxCredit = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurAuthFDPCredit = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurAuthRWTCredit = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurAuthImputationCredit = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurAuthOtherCredits = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAuthTotalCredits = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurAuthIncomeTaxDebit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAuthFDPDebit = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurAuthMaoriDebit = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurAuthOtherDebits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurAuthTotalDebits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAuthFurtherIncomeTax = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurAuthClosingBalance = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurAuthPenaltyTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurAuthTotalPayable = JdbcWritableBridge.readBigDecimal(17, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthOpeningBalance, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthIncomeTaxCredit, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthFDPCredit, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthRWTCredit, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthImputationCredit, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthOtherCredits, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthTotalCredits, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthIncomeTaxDebit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthFDPDebit, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthMaoriDebit, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthOtherDebits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthTotalDebits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthFurtherIncomeTax, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthClosingBalance, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthPenaltyTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthTotalPayable, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthOpeningBalance, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthIncomeTaxCredit, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthFDPCredit, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthRWTCredit, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthImputationCredit, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthOtherCredits, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthTotalCredits, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthIncomeTaxDebit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthFDPDebit, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthMaoriDebit, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthOtherDebits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthTotalDebits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthFurtherIncomeTax, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthClosingBalance, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthPenaltyTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAuthTotalPayable, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
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
        this.fcurAuthOpeningBalance = null;
    } else {
    this.fcurAuthOpeningBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthIncomeTaxCredit = null;
    } else {
    this.fcurAuthIncomeTaxCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthFDPCredit = null;
    } else {
    this.fcurAuthFDPCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthRWTCredit = null;
    } else {
    this.fcurAuthRWTCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthImputationCredit = null;
    } else {
    this.fcurAuthImputationCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthOtherCredits = null;
    } else {
    this.fcurAuthOtherCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthTotalCredits = null;
    } else {
    this.fcurAuthTotalCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthIncomeTaxDebit = null;
    } else {
    this.fcurAuthIncomeTaxDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthFDPDebit = null;
    } else {
    this.fcurAuthFDPDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthMaoriDebit = null;
    } else {
    this.fcurAuthMaoriDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthOtherDebits = null;
    } else {
    this.fcurAuthOtherDebits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthTotalDebits = null;
    } else {
    this.fcurAuthTotalDebits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthFurtherIncomeTax = null;
    } else {
    this.fcurAuthFurtherIncomeTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthClosingBalance = null;
    } else {
    this.fcurAuthClosingBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthPenaltyTax = null;
    } else {
    this.fcurAuthPenaltyTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAuthTotalPayable = null;
    } else {
    this.fcurAuthTotalPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurAuthOpeningBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthOpeningBalance, __dataOut);
    }
    if (null == this.fcurAuthIncomeTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthIncomeTaxCredit, __dataOut);
    }
    if (null == this.fcurAuthFDPCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthFDPCredit, __dataOut);
    }
    if (null == this.fcurAuthRWTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthRWTCredit, __dataOut);
    }
    if (null == this.fcurAuthImputationCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthImputationCredit, __dataOut);
    }
    if (null == this.fcurAuthOtherCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthOtherCredits, __dataOut);
    }
    if (null == this.fcurAuthTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthTotalCredits, __dataOut);
    }
    if (null == this.fcurAuthIncomeTaxDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthIncomeTaxDebit, __dataOut);
    }
    if (null == this.fcurAuthFDPDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthFDPDebit, __dataOut);
    }
    if (null == this.fcurAuthMaoriDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthMaoriDebit, __dataOut);
    }
    if (null == this.fcurAuthOtherDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthOtherDebits, __dataOut);
    }
    if (null == this.fcurAuthTotalDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthTotalDebits, __dataOut);
    }
    if (null == this.fcurAuthFurtherIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthFurtherIncomeTax, __dataOut);
    }
    if (null == this.fcurAuthClosingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthClosingBalance, __dataOut);
    }
    if (null == this.fcurAuthPenaltyTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthPenaltyTax, __dataOut);
    }
    if (null == this.fcurAuthTotalPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthTotalPayable, __dataOut);
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
    if (null == this.fcurAuthOpeningBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthOpeningBalance, __dataOut);
    }
    if (null == this.fcurAuthIncomeTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthIncomeTaxCredit, __dataOut);
    }
    if (null == this.fcurAuthFDPCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthFDPCredit, __dataOut);
    }
    if (null == this.fcurAuthRWTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthRWTCredit, __dataOut);
    }
    if (null == this.fcurAuthImputationCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthImputationCredit, __dataOut);
    }
    if (null == this.fcurAuthOtherCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthOtherCredits, __dataOut);
    }
    if (null == this.fcurAuthTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthTotalCredits, __dataOut);
    }
    if (null == this.fcurAuthIncomeTaxDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthIncomeTaxDebit, __dataOut);
    }
    if (null == this.fcurAuthFDPDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthFDPDebit, __dataOut);
    }
    if (null == this.fcurAuthMaoriDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthMaoriDebit, __dataOut);
    }
    if (null == this.fcurAuthOtherDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthOtherDebits, __dataOut);
    }
    if (null == this.fcurAuthTotalDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthTotalDebits, __dataOut);
    }
    if (null == this.fcurAuthFurtherIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthFurtherIncomeTax, __dataOut);
    }
    if (null == this.fcurAuthClosingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthClosingBalance, __dataOut);
    }
    if (null == this.fcurAuthPenaltyTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthPenaltyTax, __dataOut);
    }
    if (null == this.fcurAuthTotalPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAuthTotalPayable, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthOpeningBalance==null?"\\N":fcurAuthOpeningBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthIncomeTaxCredit==null?"\\N":fcurAuthIncomeTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthFDPCredit==null?"\\N":fcurAuthFDPCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthRWTCredit==null?"\\N":fcurAuthRWTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthImputationCredit==null?"\\N":fcurAuthImputationCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthOtherCredits==null?"\\N":fcurAuthOtherCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthTotalCredits==null?"\\N":fcurAuthTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthIncomeTaxDebit==null?"\\N":fcurAuthIncomeTaxDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthFDPDebit==null?"\\N":fcurAuthFDPDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthMaoriDebit==null?"\\N":fcurAuthMaoriDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthOtherDebits==null?"\\N":fcurAuthOtherDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthTotalDebits==null?"\\N":fcurAuthTotalDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthFurtherIncomeTax==null?"\\N":fcurAuthFurtherIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthClosingBalance==null?"\\N":fcurAuthClosingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthPenaltyTax==null?"\\N":fcurAuthPenaltyTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthTotalPayable==null?"\\N":fcurAuthTotalPayable.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthOpeningBalance==null?"\\N":fcurAuthOpeningBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthIncomeTaxCredit==null?"\\N":fcurAuthIncomeTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthFDPCredit==null?"\\N":fcurAuthFDPCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthRWTCredit==null?"\\N":fcurAuthRWTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthImputationCredit==null?"\\N":fcurAuthImputationCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthOtherCredits==null?"\\N":fcurAuthOtherCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthTotalCredits==null?"\\N":fcurAuthTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthIncomeTaxDebit==null?"\\N":fcurAuthIncomeTaxDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthFDPDebit==null?"\\N":fcurAuthFDPDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthMaoriDebit==null?"\\N":fcurAuthMaoriDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthOtherDebits==null?"\\N":fcurAuthOtherDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthTotalDebits==null?"\\N":fcurAuthTotalDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthFurtherIncomeTax==null?"\\N":fcurAuthFurtherIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthClosingBalance==null?"\\N":fcurAuthClosingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthPenaltyTax==null?"\\N":fcurAuthPenaltyTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAuthTotalPayable==null?"\\N":fcurAuthTotalPayable.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthOpeningBalance = null; } else {
      this.fcurAuthOpeningBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthIncomeTaxCredit = null; } else {
      this.fcurAuthIncomeTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthFDPCredit = null; } else {
      this.fcurAuthFDPCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthRWTCredit = null; } else {
      this.fcurAuthRWTCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthImputationCredit = null; } else {
      this.fcurAuthImputationCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthOtherCredits = null; } else {
      this.fcurAuthOtherCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthTotalCredits = null; } else {
      this.fcurAuthTotalCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthIncomeTaxDebit = null; } else {
      this.fcurAuthIncomeTaxDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthFDPDebit = null; } else {
      this.fcurAuthFDPDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthMaoriDebit = null; } else {
      this.fcurAuthMaoriDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthOtherDebits = null; } else {
      this.fcurAuthOtherDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthTotalDebits = null; } else {
      this.fcurAuthTotalDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthFurtherIncomeTax = null; } else {
      this.fcurAuthFurtherIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthClosingBalance = null; } else {
      this.fcurAuthClosingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthPenaltyTax = null; } else {
      this.fcurAuthPenaltyTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthTotalPayable = null; } else {
      this.fcurAuthTotalPayable = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthOpeningBalance = null; } else {
      this.fcurAuthOpeningBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthIncomeTaxCredit = null; } else {
      this.fcurAuthIncomeTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthFDPCredit = null; } else {
      this.fcurAuthFDPCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthRWTCredit = null; } else {
      this.fcurAuthRWTCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthImputationCredit = null; } else {
      this.fcurAuthImputationCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthOtherCredits = null; } else {
      this.fcurAuthOtherCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthTotalCredits = null; } else {
      this.fcurAuthTotalCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthIncomeTaxDebit = null; } else {
      this.fcurAuthIncomeTaxDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthFDPDebit = null; } else {
      this.fcurAuthFDPDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthMaoriDebit = null; } else {
      this.fcurAuthMaoriDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthOtherDebits = null; } else {
      this.fcurAuthOtherDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthTotalDebits = null; } else {
      this.fcurAuthTotalDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthFurtherIncomeTax = null; } else {
      this.fcurAuthFurtherIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthClosingBalance = null; } else {
      this.fcurAuthClosingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthPenaltyTax = null; } else {
      this.fcurAuthPenaltyTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAuthTotalPayable = null; } else {
      this.fcurAuthTotalPayable = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnmacama o = (tblnz_rtnmacama) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnmacama o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurAuthOpeningBalance", this.fcurAuthOpeningBalance);
    __sqoop$field_map.put("fcurAuthIncomeTaxCredit", this.fcurAuthIncomeTaxCredit);
    __sqoop$field_map.put("fcurAuthFDPCredit", this.fcurAuthFDPCredit);
    __sqoop$field_map.put("fcurAuthRWTCredit", this.fcurAuthRWTCredit);
    __sqoop$field_map.put("fcurAuthImputationCredit", this.fcurAuthImputationCredit);
    __sqoop$field_map.put("fcurAuthOtherCredits", this.fcurAuthOtherCredits);
    __sqoop$field_map.put("fcurAuthTotalCredits", this.fcurAuthTotalCredits);
    __sqoop$field_map.put("fcurAuthIncomeTaxDebit", this.fcurAuthIncomeTaxDebit);
    __sqoop$field_map.put("fcurAuthFDPDebit", this.fcurAuthFDPDebit);
    __sqoop$field_map.put("fcurAuthMaoriDebit", this.fcurAuthMaoriDebit);
    __sqoop$field_map.put("fcurAuthOtherDebits", this.fcurAuthOtherDebits);
    __sqoop$field_map.put("fcurAuthTotalDebits", this.fcurAuthTotalDebits);
    __sqoop$field_map.put("fcurAuthFurtherIncomeTax", this.fcurAuthFurtherIncomeTax);
    __sqoop$field_map.put("fcurAuthClosingBalance", this.fcurAuthClosingBalance);
    __sqoop$field_map.put("fcurAuthPenaltyTax", this.fcurAuthPenaltyTax);
    __sqoop$field_map.put("fcurAuthTotalPayable", this.fcurAuthTotalPayable);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurAuthOpeningBalance", this.fcurAuthOpeningBalance);
    __sqoop$field_map.put("fcurAuthIncomeTaxCredit", this.fcurAuthIncomeTaxCredit);
    __sqoop$field_map.put("fcurAuthFDPCredit", this.fcurAuthFDPCredit);
    __sqoop$field_map.put("fcurAuthRWTCredit", this.fcurAuthRWTCredit);
    __sqoop$field_map.put("fcurAuthImputationCredit", this.fcurAuthImputationCredit);
    __sqoop$field_map.put("fcurAuthOtherCredits", this.fcurAuthOtherCredits);
    __sqoop$field_map.put("fcurAuthTotalCredits", this.fcurAuthTotalCredits);
    __sqoop$field_map.put("fcurAuthIncomeTaxDebit", this.fcurAuthIncomeTaxDebit);
    __sqoop$field_map.put("fcurAuthFDPDebit", this.fcurAuthFDPDebit);
    __sqoop$field_map.put("fcurAuthMaoriDebit", this.fcurAuthMaoriDebit);
    __sqoop$field_map.put("fcurAuthOtherDebits", this.fcurAuthOtherDebits);
    __sqoop$field_map.put("fcurAuthTotalDebits", this.fcurAuthTotalDebits);
    __sqoop$field_map.put("fcurAuthFurtherIncomeTax", this.fcurAuthFurtherIncomeTax);
    __sqoop$field_map.put("fcurAuthClosingBalance", this.fcurAuthClosingBalance);
    __sqoop$field_map.put("fcurAuthPenaltyTax", this.fcurAuthPenaltyTax);
    __sqoop$field_map.put("fcurAuthTotalPayable", this.fcurAuthTotalPayable);
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
