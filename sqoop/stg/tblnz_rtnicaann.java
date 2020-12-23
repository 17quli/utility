// ORM class for table 'tblnz_rtnicaann'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:34:59 NZDT 2020
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

public class tblnz_rtnicaann extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurImpOpeningBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpOpeningBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpIncomeTaxCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpIncomeTaxCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpFDPCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpFDPCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpRWTCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpRWTCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpImputationCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpImputationCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpOtherCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpOtherCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpTotalCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpTotalCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpIncomeTaxDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpIncomeTaxDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpFDPDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpFDPDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpImputationDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpImputationDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpOtherDebits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpOtherDebits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpTotalDebits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpTotalDebits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpClosingBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpClosingBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpFurtherIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpFurtherIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpPenaltyTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpPenaltyTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImpTotalPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fcurImpTotalPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnicaann.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnicaann() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnicaann with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurImpOpeningBalance;
  public java.math.BigDecimal get_fcurImpOpeningBalance() {
    return fcurImpOpeningBalance;
  }
  public void set_fcurImpOpeningBalance(java.math.BigDecimal fcurImpOpeningBalance) {
    this.fcurImpOpeningBalance = fcurImpOpeningBalance;
  }
  public tblnz_rtnicaann with_fcurImpOpeningBalance(java.math.BigDecimal fcurImpOpeningBalance) {
    this.fcurImpOpeningBalance = fcurImpOpeningBalance;
    return this;
  }
  private java.math.BigDecimal fcurImpIncomeTaxCredit;
  public java.math.BigDecimal get_fcurImpIncomeTaxCredit() {
    return fcurImpIncomeTaxCredit;
  }
  public void set_fcurImpIncomeTaxCredit(java.math.BigDecimal fcurImpIncomeTaxCredit) {
    this.fcurImpIncomeTaxCredit = fcurImpIncomeTaxCredit;
  }
  public tblnz_rtnicaann with_fcurImpIncomeTaxCredit(java.math.BigDecimal fcurImpIncomeTaxCredit) {
    this.fcurImpIncomeTaxCredit = fcurImpIncomeTaxCredit;
    return this;
  }
  private java.math.BigDecimal fcurImpFDPCredit;
  public java.math.BigDecimal get_fcurImpFDPCredit() {
    return fcurImpFDPCredit;
  }
  public void set_fcurImpFDPCredit(java.math.BigDecimal fcurImpFDPCredit) {
    this.fcurImpFDPCredit = fcurImpFDPCredit;
  }
  public tblnz_rtnicaann with_fcurImpFDPCredit(java.math.BigDecimal fcurImpFDPCredit) {
    this.fcurImpFDPCredit = fcurImpFDPCredit;
    return this;
  }
  private java.math.BigDecimal fcurImpRWTCredit;
  public java.math.BigDecimal get_fcurImpRWTCredit() {
    return fcurImpRWTCredit;
  }
  public void set_fcurImpRWTCredit(java.math.BigDecimal fcurImpRWTCredit) {
    this.fcurImpRWTCredit = fcurImpRWTCredit;
  }
  public tblnz_rtnicaann with_fcurImpRWTCredit(java.math.BigDecimal fcurImpRWTCredit) {
    this.fcurImpRWTCredit = fcurImpRWTCredit;
    return this;
  }
  private java.math.BigDecimal fcurImpImputationCredit;
  public java.math.BigDecimal get_fcurImpImputationCredit() {
    return fcurImpImputationCredit;
  }
  public void set_fcurImpImputationCredit(java.math.BigDecimal fcurImpImputationCredit) {
    this.fcurImpImputationCredit = fcurImpImputationCredit;
  }
  public tblnz_rtnicaann with_fcurImpImputationCredit(java.math.BigDecimal fcurImpImputationCredit) {
    this.fcurImpImputationCredit = fcurImpImputationCredit;
    return this;
  }
  private java.math.BigDecimal fcurImpOtherCredits;
  public java.math.BigDecimal get_fcurImpOtherCredits() {
    return fcurImpOtherCredits;
  }
  public void set_fcurImpOtherCredits(java.math.BigDecimal fcurImpOtherCredits) {
    this.fcurImpOtherCredits = fcurImpOtherCredits;
  }
  public tblnz_rtnicaann with_fcurImpOtherCredits(java.math.BigDecimal fcurImpOtherCredits) {
    this.fcurImpOtherCredits = fcurImpOtherCredits;
    return this;
  }
  private java.math.BigDecimal fcurImpTotalCredits;
  public java.math.BigDecimal get_fcurImpTotalCredits() {
    return fcurImpTotalCredits;
  }
  public void set_fcurImpTotalCredits(java.math.BigDecimal fcurImpTotalCredits) {
    this.fcurImpTotalCredits = fcurImpTotalCredits;
  }
  public tblnz_rtnicaann with_fcurImpTotalCredits(java.math.BigDecimal fcurImpTotalCredits) {
    this.fcurImpTotalCredits = fcurImpTotalCredits;
    return this;
  }
  private java.math.BigDecimal fcurImpIncomeTaxDebit;
  public java.math.BigDecimal get_fcurImpIncomeTaxDebit() {
    return fcurImpIncomeTaxDebit;
  }
  public void set_fcurImpIncomeTaxDebit(java.math.BigDecimal fcurImpIncomeTaxDebit) {
    this.fcurImpIncomeTaxDebit = fcurImpIncomeTaxDebit;
  }
  public tblnz_rtnicaann with_fcurImpIncomeTaxDebit(java.math.BigDecimal fcurImpIncomeTaxDebit) {
    this.fcurImpIncomeTaxDebit = fcurImpIncomeTaxDebit;
    return this;
  }
  private java.math.BigDecimal fcurImpFDPDebit;
  public java.math.BigDecimal get_fcurImpFDPDebit() {
    return fcurImpFDPDebit;
  }
  public void set_fcurImpFDPDebit(java.math.BigDecimal fcurImpFDPDebit) {
    this.fcurImpFDPDebit = fcurImpFDPDebit;
  }
  public tblnz_rtnicaann with_fcurImpFDPDebit(java.math.BigDecimal fcurImpFDPDebit) {
    this.fcurImpFDPDebit = fcurImpFDPDebit;
    return this;
  }
  private java.math.BigDecimal fcurImpImputationDebit;
  public java.math.BigDecimal get_fcurImpImputationDebit() {
    return fcurImpImputationDebit;
  }
  public void set_fcurImpImputationDebit(java.math.BigDecimal fcurImpImputationDebit) {
    this.fcurImpImputationDebit = fcurImpImputationDebit;
  }
  public tblnz_rtnicaann with_fcurImpImputationDebit(java.math.BigDecimal fcurImpImputationDebit) {
    this.fcurImpImputationDebit = fcurImpImputationDebit;
    return this;
  }
  private java.math.BigDecimal fcurImpOtherDebits;
  public java.math.BigDecimal get_fcurImpOtherDebits() {
    return fcurImpOtherDebits;
  }
  public void set_fcurImpOtherDebits(java.math.BigDecimal fcurImpOtherDebits) {
    this.fcurImpOtherDebits = fcurImpOtherDebits;
  }
  public tblnz_rtnicaann with_fcurImpOtherDebits(java.math.BigDecimal fcurImpOtherDebits) {
    this.fcurImpOtherDebits = fcurImpOtherDebits;
    return this;
  }
  private java.math.BigDecimal fcurImpTotalDebits;
  public java.math.BigDecimal get_fcurImpTotalDebits() {
    return fcurImpTotalDebits;
  }
  public void set_fcurImpTotalDebits(java.math.BigDecimal fcurImpTotalDebits) {
    this.fcurImpTotalDebits = fcurImpTotalDebits;
  }
  public tblnz_rtnicaann with_fcurImpTotalDebits(java.math.BigDecimal fcurImpTotalDebits) {
    this.fcurImpTotalDebits = fcurImpTotalDebits;
    return this;
  }
  private java.math.BigDecimal fcurImpClosingBalance;
  public java.math.BigDecimal get_fcurImpClosingBalance() {
    return fcurImpClosingBalance;
  }
  public void set_fcurImpClosingBalance(java.math.BigDecimal fcurImpClosingBalance) {
    this.fcurImpClosingBalance = fcurImpClosingBalance;
  }
  public tblnz_rtnicaann with_fcurImpClosingBalance(java.math.BigDecimal fcurImpClosingBalance) {
    this.fcurImpClosingBalance = fcurImpClosingBalance;
    return this;
  }
  private java.math.BigDecimal fcurImpAdjustments;
  public java.math.BigDecimal get_fcurImpAdjustments() {
    return fcurImpAdjustments;
  }
  public void set_fcurImpAdjustments(java.math.BigDecimal fcurImpAdjustments) {
    this.fcurImpAdjustments = fcurImpAdjustments;
  }
  public tblnz_rtnicaann with_fcurImpAdjustments(java.math.BigDecimal fcurImpAdjustments) {
    this.fcurImpAdjustments = fcurImpAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurImpFurtherIncomeTax;
  public java.math.BigDecimal get_fcurImpFurtherIncomeTax() {
    return fcurImpFurtherIncomeTax;
  }
  public void set_fcurImpFurtherIncomeTax(java.math.BigDecimal fcurImpFurtherIncomeTax) {
    this.fcurImpFurtherIncomeTax = fcurImpFurtherIncomeTax;
  }
  public tblnz_rtnicaann with_fcurImpFurtherIncomeTax(java.math.BigDecimal fcurImpFurtherIncomeTax) {
    this.fcurImpFurtherIncomeTax = fcurImpFurtherIncomeTax;
    return this;
  }
  private java.math.BigDecimal fcurImpPenaltyTax;
  public java.math.BigDecimal get_fcurImpPenaltyTax() {
    return fcurImpPenaltyTax;
  }
  public void set_fcurImpPenaltyTax(java.math.BigDecimal fcurImpPenaltyTax) {
    this.fcurImpPenaltyTax = fcurImpPenaltyTax;
  }
  public tblnz_rtnicaann with_fcurImpPenaltyTax(java.math.BigDecimal fcurImpPenaltyTax) {
    this.fcurImpPenaltyTax = fcurImpPenaltyTax;
    return this;
  }
  private java.math.BigDecimal fcurImpTotalPayable;
  public java.math.BigDecimal get_fcurImpTotalPayable() {
    return fcurImpTotalPayable;
  }
  public void set_fcurImpTotalPayable(java.math.BigDecimal fcurImpTotalPayable) {
    this.fcurImpTotalPayable = fcurImpTotalPayable;
  }
  public tblnz_rtnicaann with_fcurImpTotalPayable(java.math.BigDecimal fcurImpTotalPayable) {
    this.fcurImpTotalPayable = fcurImpTotalPayable;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnicaann with_fstrWho(String fstrWho) {
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
  public tblnz_rtnicaann with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnicaann)) {
      return false;
    }
    tblnz_rtnicaann that = (tblnz_rtnicaann) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurImpOpeningBalance == null ? that.fcurImpOpeningBalance == null : this.fcurImpOpeningBalance.equals(that.fcurImpOpeningBalance));
    equal = equal && (this.fcurImpIncomeTaxCredit == null ? that.fcurImpIncomeTaxCredit == null : this.fcurImpIncomeTaxCredit.equals(that.fcurImpIncomeTaxCredit));
    equal = equal && (this.fcurImpFDPCredit == null ? that.fcurImpFDPCredit == null : this.fcurImpFDPCredit.equals(that.fcurImpFDPCredit));
    equal = equal && (this.fcurImpRWTCredit == null ? that.fcurImpRWTCredit == null : this.fcurImpRWTCredit.equals(that.fcurImpRWTCredit));
    equal = equal && (this.fcurImpImputationCredit == null ? that.fcurImpImputationCredit == null : this.fcurImpImputationCredit.equals(that.fcurImpImputationCredit));
    equal = equal && (this.fcurImpOtherCredits == null ? that.fcurImpOtherCredits == null : this.fcurImpOtherCredits.equals(that.fcurImpOtherCredits));
    equal = equal && (this.fcurImpTotalCredits == null ? that.fcurImpTotalCredits == null : this.fcurImpTotalCredits.equals(that.fcurImpTotalCredits));
    equal = equal && (this.fcurImpIncomeTaxDebit == null ? that.fcurImpIncomeTaxDebit == null : this.fcurImpIncomeTaxDebit.equals(that.fcurImpIncomeTaxDebit));
    equal = equal && (this.fcurImpFDPDebit == null ? that.fcurImpFDPDebit == null : this.fcurImpFDPDebit.equals(that.fcurImpFDPDebit));
    equal = equal && (this.fcurImpImputationDebit == null ? that.fcurImpImputationDebit == null : this.fcurImpImputationDebit.equals(that.fcurImpImputationDebit));
    equal = equal && (this.fcurImpOtherDebits == null ? that.fcurImpOtherDebits == null : this.fcurImpOtherDebits.equals(that.fcurImpOtherDebits));
    equal = equal && (this.fcurImpTotalDebits == null ? that.fcurImpTotalDebits == null : this.fcurImpTotalDebits.equals(that.fcurImpTotalDebits));
    equal = equal && (this.fcurImpClosingBalance == null ? that.fcurImpClosingBalance == null : this.fcurImpClosingBalance.equals(that.fcurImpClosingBalance));
    equal = equal && (this.fcurImpAdjustments == null ? that.fcurImpAdjustments == null : this.fcurImpAdjustments.equals(that.fcurImpAdjustments));
    equal = equal && (this.fcurImpFurtherIncomeTax == null ? that.fcurImpFurtherIncomeTax == null : this.fcurImpFurtherIncomeTax.equals(that.fcurImpFurtherIncomeTax));
    equal = equal && (this.fcurImpPenaltyTax == null ? that.fcurImpPenaltyTax == null : this.fcurImpPenaltyTax.equals(that.fcurImpPenaltyTax));
    equal = equal && (this.fcurImpTotalPayable == null ? that.fcurImpTotalPayable == null : this.fcurImpTotalPayable.equals(that.fcurImpTotalPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnicaann)) {
      return false;
    }
    tblnz_rtnicaann that = (tblnz_rtnicaann) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurImpOpeningBalance == null ? that.fcurImpOpeningBalance == null : this.fcurImpOpeningBalance.equals(that.fcurImpOpeningBalance));
    equal = equal && (this.fcurImpIncomeTaxCredit == null ? that.fcurImpIncomeTaxCredit == null : this.fcurImpIncomeTaxCredit.equals(that.fcurImpIncomeTaxCredit));
    equal = equal && (this.fcurImpFDPCredit == null ? that.fcurImpFDPCredit == null : this.fcurImpFDPCredit.equals(that.fcurImpFDPCredit));
    equal = equal && (this.fcurImpRWTCredit == null ? that.fcurImpRWTCredit == null : this.fcurImpRWTCredit.equals(that.fcurImpRWTCredit));
    equal = equal && (this.fcurImpImputationCredit == null ? that.fcurImpImputationCredit == null : this.fcurImpImputationCredit.equals(that.fcurImpImputationCredit));
    equal = equal && (this.fcurImpOtherCredits == null ? that.fcurImpOtherCredits == null : this.fcurImpOtherCredits.equals(that.fcurImpOtherCredits));
    equal = equal && (this.fcurImpTotalCredits == null ? that.fcurImpTotalCredits == null : this.fcurImpTotalCredits.equals(that.fcurImpTotalCredits));
    equal = equal && (this.fcurImpIncomeTaxDebit == null ? that.fcurImpIncomeTaxDebit == null : this.fcurImpIncomeTaxDebit.equals(that.fcurImpIncomeTaxDebit));
    equal = equal && (this.fcurImpFDPDebit == null ? that.fcurImpFDPDebit == null : this.fcurImpFDPDebit.equals(that.fcurImpFDPDebit));
    equal = equal && (this.fcurImpImputationDebit == null ? that.fcurImpImputationDebit == null : this.fcurImpImputationDebit.equals(that.fcurImpImputationDebit));
    equal = equal && (this.fcurImpOtherDebits == null ? that.fcurImpOtherDebits == null : this.fcurImpOtherDebits.equals(that.fcurImpOtherDebits));
    equal = equal && (this.fcurImpTotalDebits == null ? that.fcurImpTotalDebits == null : this.fcurImpTotalDebits.equals(that.fcurImpTotalDebits));
    equal = equal && (this.fcurImpClosingBalance == null ? that.fcurImpClosingBalance == null : this.fcurImpClosingBalance.equals(that.fcurImpClosingBalance));
    equal = equal && (this.fcurImpAdjustments == null ? that.fcurImpAdjustments == null : this.fcurImpAdjustments.equals(that.fcurImpAdjustments));
    equal = equal && (this.fcurImpFurtherIncomeTax == null ? that.fcurImpFurtherIncomeTax == null : this.fcurImpFurtherIncomeTax.equals(that.fcurImpFurtherIncomeTax));
    equal = equal && (this.fcurImpPenaltyTax == null ? that.fcurImpPenaltyTax == null : this.fcurImpPenaltyTax.equals(that.fcurImpPenaltyTax));
    equal = equal && (this.fcurImpTotalPayable == null ? that.fcurImpTotalPayable == null : this.fcurImpTotalPayable.equals(that.fcurImpTotalPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurImpOpeningBalance = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurImpIncomeTaxCredit = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurImpFDPCredit = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurImpRWTCredit = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurImpImputationCredit = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurImpOtherCredits = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurImpTotalCredits = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurImpIncomeTaxDebit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurImpFDPDebit = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurImpImputationDebit = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurImpOtherDebits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurImpTotalDebits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurImpClosingBalance = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurImpAdjustments = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurImpFurtherIncomeTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurImpPenaltyTax = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurImpTotalPayable = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurImpOpeningBalance = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurImpIncomeTaxCredit = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurImpFDPCredit = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurImpRWTCredit = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurImpImputationCredit = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurImpOtherCredits = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurImpTotalCredits = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurImpIncomeTaxDebit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurImpFDPDebit = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurImpImputationDebit = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurImpOtherDebits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurImpTotalDebits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurImpClosingBalance = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurImpAdjustments = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurImpFurtherIncomeTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurImpPenaltyTax = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurImpTotalPayable = JdbcWritableBridge.readBigDecimal(18, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpOpeningBalance, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpIncomeTaxCredit, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpFDPCredit, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpRWTCredit, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpImputationCredit, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpOtherCredits, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpTotalCredits, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpIncomeTaxDebit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpFDPDebit, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpImputationDebit, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpOtherDebits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpTotalDebits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpClosingBalance, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpAdjustments, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpFurtherIncomeTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpPenaltyTax, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpTotalPayable, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpOpeningBalance, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpIncomeTaxCredit, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpFDPCredit, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpRWTCredit, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpImputationCredit, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpOtherCredits, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpTotalCredits, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpIncomeTaxDebit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpFDPDebit, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpImputationDebit, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpOtherDebits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpTotalDebits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpClosingBalance, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpAdjustments, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpFurtherIncomeTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpPenaltyTax, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImpTotalPayable, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
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
        this.fcurImpOpeningBalance = null;
    } else {
    this.fcurImpOpeningBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpIncomeTaxCredit = null;
    } else {
    this.fcurImpIncomeTaxCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpFDPCredit = null;
    } else {
    this.fcurImpFDPCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpRWTCredit = null;
    } else {
    this.fcurImpRWTCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpImputationCredit = null;
    } else {
    this.fcurImpImputationCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpOtherCredits = null;
    } else {
    this.fcurImpOtherCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpTotalCredits = null;
    } else {
    this.fcurImpTotalCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpIncomeTaxDebit = null;
    } else {
    this.fcurImpIncomeTaxDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpFDPDebit = null;
    } else {
    this.fcurImpFDPDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpImputationDebit = null;
    } else {
    this.fcurImpImputationDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpOtherDebits = null;
    } else {
    this.fcurImpOtherDebits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpTotalDebits = null;
    } else {
    this.fcurImpTotalDebits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpClosingBalance = null;
    } else {
    this.fcurImpClosingBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpAdjustments = null;
    } else {
    this.fcurImpAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpFurtherIncomeTax = null;
    } else {
    this.fcurImpFurtherIncomeTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpPenaltyTax = null;
    } else {
    this.fcurImpPenaltyTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImpTotalPayable = null;
    } else {
    this.fcurImpTotalPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurImpOpeningBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpOpeningBalance, __dataOut);
    }
    if (null == this.fcurImpIncomeTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpIncomeTaxCredit, __dataOut);
    }
    if (null == this.fcurImpFDPCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpFDPCredit, __dataOut);
    }
    if (null == this.fcurImpRWTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpRWTCredit, __dataOut);
    }
    if (null == this.fcurImpImputationCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpImputationCredit, __dataOut);
    }
    if (null == this.fcurImpOtherCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpOtherCredits, __dataOut);
    }
    if (null == this.fcurImpTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpTotalCredits, __dataOut);
    }
    if (null == this.fcurImpIncomeTaxDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpIncomeTaxDebit, __dataOut);
    }
    if (null == this.fcurImpFDPDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpFDPDebit, __dataOut);
    }
    if (null == this.fcurImpImputationDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpImputationDebit, __dataOut);
    }
    if (null == this.fcurImpOtherDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpOtherDebits, __dataOut);
    }
    if (null == this.fcurImpTotalDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpTotalDebits, __dataOut);
    }
    if (null == this.fcurImpClosingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpClosingBalance, __dataOut);
    }
    if (null == this.fcurImpAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpAdjustments, __dataOut);
    }
    if (null == this.fcurImpFurtherIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpFurtherIncomeTax, __dataOut);
    }
    if (null == this.fcurImpPenaltyTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpPenaltyTax, __dataOut);
    }
    if (null == this.fcurImpTotalPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpTotalPayable, __dataOut);
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
    if (null == this.fcurImpOpeningBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpOpeningBalance, __dataOut);
    }
    if (null == this.fcurImpIncomeTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpIncomeTaxCredit, __dataOut);
    }
    if (null == this.fcurImpFDPCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpFDPCredit, __dataOut);
    }
    if (null == this.fcurImpRWTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpRWTCredit, __dataOut);
    }
    if (null == this.fcurImpImputationCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpImputationCredit, __dataOut);
    }
    if (null == this.fcurImpOtherCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpOtherCredits, __dataOut);
    }
    if (null == this.fcurImpTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpTotalCredits, __dataOut);
    }
    if (null == this.fcurImpIncomeTaxDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpIncomeTaxDebit, __dataOut);
    }
    if (null == this.fcurImpFDPDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpFDPDebit, __dataOut);
    }
    if (null == this.fcurImpImputationDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpImputationDebit, __dataOut);
    }
    if (null == this.fcurImpOtherDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpOtherDebits, __dataOut);
    }
    if (null == this.fcurImpTotalDebits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpTotalDebits, __dataOut);
    }
    if (null == this.fcurImpClosingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpClosingBalance, __dataOut);
    }
    if (null == this.fcurImpAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpAdjustments, __dataOut);
    }
    if (null == this.fcurImpFurtherIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpFurtherIncomeTax, __dataOut);
    }
    if (null == this.fcurImpPenaltyTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpPenaltyTax, __dataOut);
    }
    if (null == this.fcurImpTotalPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImpTotalPayable, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpOpeningBalance==null?"\\N":fcurImpOpeningBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpIncomeTaxCredit==null?"\\N":fcurImpIncomeTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpFDPCredit==null?"\\N":fcurImpFDPCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpRWTCredit==null?"\\N":fcurImpRWTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpImputationCredit==null?"\\N":fcurImpImputationCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpOtherCredits==null?"\\N":fcurImpOtherCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpTotalCredits==null?"\\N":fcurImpTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpIncomeTaxDebit==null?"\\N":fcurImpIncomeTaxDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpFDPDebit==null?"\\N":fcurImpFDPDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpImputationDebit==null?"\\N":fcurImpImputationDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpOtherDebits==null?"\\N":fcurImpOtherDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpTotalDebits==null?"\\N":fcurImpTotalDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpClosingBalance==null?"\\N":fcurImpClosingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpAdjustments==null?"\\N":fcurImpAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpFurtherIncomeTax==null?"\\N":fcurImpFurtherIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpPenaltyTax==null?"\\N":fcurImpPenaltyTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpTotalPayable==null?"\\N":fcurImpTotalPayable.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpOpeningBalance==null?"\\N":fcurImpOpeningBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpIncomeTaxCredit==null?"\\N":fcurImpIncomeTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpFDPCredit==null?"\\N":fcurImpFDPCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpRWTCredit==null?"\\N":fcurImpRWTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpImputationCredit==null?"\\N":fcurImpImputationCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpOtherCredits==null?"\\N":fcurImpOtherCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpTotalCredits==null?"\\N":fcurImpTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpIncomeTaxDebit==null?"\\N":fcurImpIncomeTaxDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpFDPDebit==null?"\\N":fcurImpFDPDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpImputationDebit==null?"\\N":fcurImpImputationDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpOtherDebits==null?"\\N":fcurImpOtherDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpTotalDebits==null?"\\N":fcurImpTotalDebits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpClosingBalance==null?"\\N":fcurImpClosingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpAdjustments==null?"\\N":fcurImpAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpFurtherIncomeTax==null?"\\N":fcurImpFurtherIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpPenaltyTax==null?"\\N":fcurImpPenaltyTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImpTotalPayable==null?"\\N":fcurImpTotalPayable.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpOpeningBalance = null; } else {
      this.fcurImpOpeningBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpIncomeTaxCredit = null; } else {
      this.fcurImpIncomeTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpFDPCredit = null; } else {
      this.fcurImpFDPCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpRWTCredit = null; } else {
      this.fcurImpRWTCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpImputationCredit = null; } else {
      this.fcurImpImputationCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpOtherCredits = null; } else {
      this.fcurImpOtherCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpTotalCredits = null; } else {
      this.fcurImpTotalCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpIncomeTaxDebit = null; } else {
      this.fcurImpIncomeTaxDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpFDPDebit = null; } else {
      this.fcurImpFDPDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpImputationDebit = null; } else {
      this.fcurImpImputationDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpOtherDebits = null; } else {
      this.fcurImpOtherDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpTotalDebits = null; } else {
      this.fcurImpTotalDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpClosingBalance = null; } else {
      this.fcurImpClosingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpAdjustments = null; } else {
      this.fcurImpAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpFurtherIncomeTax = null; } else {
      this.fcurImpFurtherIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpPenaltyTax = null; } else {
      this.fcurImpPenaltyTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpTotalPayable = null; } else {
      this.fcurImpTotalPayable = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpOpeningBalance = null; } else {
      this.fcurImpOpeningBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpIncomeTaxCredit = null; } else {
      this.fcurImpIncomeTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpFDPCredit = null; } else {
      this.fcurImpFDPCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpRWTCredit = null; } else {
      this.fcurImpRWTCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpImputationCredit = null; } else {
      this.fcurImpImputationCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpOtherCredits = null; } else {
      this.fcurImpOtherCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpTotalCredits = null; } else {
      this.fcurImpTotalCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpIncomeTaxDebit = null; } else {
      this.fcurImpIncomeTaxDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpFDPDebit = null; } else {
      this.fcurImpFDPDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpImputationDebit = null; } else {
      this.fcurImpImputationDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpOtherDebits = null; } else {
      this.fcurImpOtherDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpTotalDebits = null; } else {
      this.fcurImpTotalDebits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpClosingBalance = null; } else {
      this.fcurImpClosingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpAdjustments = null; } else {
      this.fcurImpAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpFurtherIncomeTax = null; } else {
      this.fcurImpFurtherIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpPenaltyTax = null; } else {
      this.fcurImpPenaltyTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImpTotalPayable = null; } else {
      this.fcurImpTotalPayable = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnicaann o = (tblnz_rtnicaann) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnicaann o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurImpOpeningBalance", this.fcurImpOpeningBalance);
    __sqoop$field_map.put("fcurImpIncomeTaxCredit", this.fcurImpIncomeTaxCredit);
    __sqoop$field_map.put("fcurImpFDPCredit", this.fcurImpFDPCredit);
    __sqoop$field_map.put("fcurImpRWTCredit", this.fcurImpRWTCredit);
    __sqoop$field_map.put("fcurImpImputationCredit", this.fcurImpImputationCredit);
    __sqoop$field_map.put("fcurImpOtherCredits", this.fcurImpOtherCredits);
    __sqoop$field_map.put("fcurImpTotalCredits", this.fcurImpTotalCredits);
    __sqoop$field_map.put("fcurImpIncomeTaxDebit", this.fcurImpIncomeTaxDebit);
    __sqoop$field_map.put("fcurImpFDPDebit", this.fcurImpFDPDebit);
    __sqoop$field_map.put("fcurImpImputationDebit", this.fcurImpImputationDebit);
    __sqoop$field_map.put("fcurImpOtherDebits", this.fcurImpOtherDebits);
    __sqoop$field_map.put("fcurImpTotalDebits", this.fcurImpTotalDebits);
    __sqoop$field_map.put("fcurImpClosingBalance", this.fcurImpClosingBalance);
    __sqoop$field_map.put("fcurImpAdjustments", this.fcurImpAdjustments);
    __sqoop$field_map.put("fcurImpFurtherIncomeTax", this.fcurImpFurtherIncomeTax);
    __sqoop$field_map.put("fcurImpPenaltyTax", this.fcurImpPenaltyTax);
    __sqoop$field_map.put("fcurImpTotalPayable", this.fcurImpTotalPayable);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurImpOpeningBalance", this.fcurImpOpeningBalance);
    __sqoop$field_map.put("fcurImpIncomeTaxCredit", this.fcurImpIncomeTaxCredit);
    __sqoop$field_map.put("fcurImpFDPCredit", this.fcurImpFDPCredit);
    __sqoop$field_map.put("fcurImpRWTCredit", this.fcurImpRWTCredit);
    __sqoop$field_map.put("fcurImpImputationCredit", this.fcurImpImputationCredit);
    __sqoop$field_map.put("fcurImpOtherCredits", this.fcurImpOtherCredits);
    __sqoop$field_map.put("fcurImpTotalCredits", this.fcurImpTotalCredits);
    __sqoop$field_map.put("fcurImpIncomeTaxDebit", this.fcurImpIncomeTaxDebit);
    __sqoop$field_map.put("fcurImpFDPDebit", this.fcurImpFDPDebit);
    __sqoop$field_map.put("fcurImpImputationDebit", this.fcurImpImputationDebit);
    __sqoop$field_map.put("fcurImpOtherDebits", this.fcurImpOtherDebits);
    __sqoop$field_map.put("fcurImpTotalDebits", this.fcurImpTotalDebits);
    __sqoop$field_map.put("fcurImpClosingBalance", this.fcurImpClosingBalance);
    __sqoop$field_map.put("fcurImpAdjustments", this.fcurImpAdjustments);
    __sqoop$field_map.put("fcurImpFurtherIncomeTax", this.fcurImpFurtherIncomeTax);
    __sqoop$field_map.put("fcurImpPenaltyTax", this.fcurImpPenaltyTax);
    __sqoop$field_map.put("fcurImpTotalPayable", this.fcurImpTotalPayable);
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
