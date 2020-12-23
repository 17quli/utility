// ORM class for table 'tblnz_audgrossprddiscrepancy'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:11:44 NZDT 2020
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

public class tblnz_audgrossprddiscrepancy extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurTaxDebitDiscrepancy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurTaxDebitDiscrepancy = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxCreditDiscrepancy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurTaxCreditDiscrepancy = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOriginalTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurOriginalTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdjustedTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurAdjustedTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalDiscrepancy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurTotalDiscrepancy = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOriginalTaxDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurOriginalTaxDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdjustedTaxDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurAdjustedTaxDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOriginalTaxCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurOriginalTaxCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdjustedTaxCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurAdjustedTaxCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmLatePayPen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fdtmLatePayPen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReturnDueDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fdtmReturnDueDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurPostLastCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurPostLastCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPostLastDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurPostLastDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPostCurrentCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurPostCurrentCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPostCurrentDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurPostCurrentDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPostChange", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurPostChange = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDisputeTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurDisputeTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalChange", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fcurTotalChange = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audgrossprddiscrepancy.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_audgrossprddiscrepancy() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_audgrossprddiscrepancy with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tblnz_audgrossprddiscrepancy with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_audgrossprddiscrepancy with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private java.math.BigDecimal fcurTaxDebitDiscrepancy;
  public java.math.BigDecimal get_fcurTaxDebitDiscrepancy() {
    return fcurTaxDebitDiscrepancy;
  }
  public void set_fcurTaxDebitDiscrepancy(java.math.BigDecimal fcurTaxDebitDiscrepancy) {
    this.fcurTaxDebitDiscrepancy = fcurTaxDebitDiscrepancy;
  }
  public tblnz_audgrossprddiscrepancy with_fcurTaxDebitDiscrepancy(java.math.BigDecimal fcurTaxDebitDiscrepancy) {
    this.fcurTaxDebitDiscrepancy = fcurTaxDebitDiscrepancy;
    return this;
  }
  private java.math.BigDecimal fcurTaxCreditDiscrepancy;
  public java.math.BigDecimal get_fcurTaxCreditDiscrepancy() {
    return fcurTaxCreditDiscrepancy;
  }
  public void set_fcurTaxCreditDiscrepancy(java.math.BigDecimal fcurTaxCreditDiscrepancy) {
    this.fcurTaxCreditDiscrepancy = fcurTaxCreditDiscrepancy;
  }
  public tblnz_audgrossprddiscrepancy with_fcurTaxCreditDiscrepancy(java.math.BigDecimal fcurTaxCreditDiscrepancy) {
    this.fcurTaxCreditDiscrepancy = fcurTaxCreditDiscrepancy;
    return this;
  }
  private java.math.BigDecimal fcurOriginalTotal;
  public java.math.BigDecimal get_fcurOriginalTotal() {
    return fcurOriginalTotal;
  }
  public void set_fcurOriginalTotal(java.math.BigDecimal fcurOriginalTotal) {
    this.fcurOriginalTotal = fcurOriginalTotal;
  }
  public tblnz_audgrossprddiscrepancy with_fcurOriginalTotal(java.math.BigDecimal fcurOriginalTotal) {
    this.fcurOriginalTotal = fcurOriginalTotal;
    return this;
  }
  private java.math.BigDecimal fcurAdjustedTotal;
  public java.math.BigDecimal get_fcurAdjustedTotal() {
    return fcurAdjustedTotal;
  }
  public void set_fcurAdjustedTotal(java.math.BigDecimal fcurAdjustedTotal) {
    this.fcurAdjustedTotal = fcurAdjustedTotal;
  }
  public tblnz_audgrossprddiscrepancy with_fcurAdjustedTotal(java.math.BigDecimal fcurAdjustedTotal) {
    this.fcurAdjustedTotal = fcurAdjustedTotal;
    return this;
  }
  private java.math.BigDecimal fcurTotalDiscrepancy;
  public java.math.BigDecimal get_fcurTotalDiscrepancy() {
    return fcurTotalDiscrepancy;
  }
  public void set_fcurTotalDiscrepancy(java.math.BigDecimal fcurTotalDiscrepancy) {
    this.fcurTotalDiscrepancy = fcurTotalDiscrepancy;
  }
  public tblnz_audgrossprddiscrepancy with_fcurTotalDiscrepancy(java.math.BigDecimal fcurTotalDiscrepancy) {
    this.fcurTotalDiscrepancy = fcurTotalDiscrepancy;
    return this;
  }
  private java.math.BigDecimal fcurOriginalTaxDebit;
  public java.math.BigDecimal get_fcurOriginalTaxDebit() {
    return fcurOriginalTaxDebit;
  }
  public void set_fcurOriginalTaxDebit(java.math.BigDecimal fcurOriginalTaxDebit) {
    this.fcurOriginalTaxDebit = fcurOriginalTaxDebit;
  }
  public tblnz_audgrossprddiscrepancy with_fcurOriginalTaxDebit(java.math.BigDecimal fcurOriginalTaxDebit) {
    this.fcurOriginalTaxDebit = fcurOriginalTaxDebit;
    return this;
  }
  private java.math.BigDecimal fcurAdjustedTaxDebit;
  public java.math.BigDecimal get_fcurAdjustedTaxDebit() {
    return fcurAdjustedTaxDebit;
  }
  public void set_fcurAdjustedTaxDebit(java.math.BigDecimal fcurAdjustedTaxDebit) {
    this.fcurAdjustedTaxDebit = fcurAdjustedTaxDebit;
  }
  public tblnz_audgrossprddiscrepancy with_fcurAdjustedTaxDebit(java.math.BigDecimal fcurAdjustedTaxDebit) {
    this.fcurAdjustedTaxDebit = fcurAdjustedTaxDebit;
    return this;
  }
  private java.math.BigDecimal fcurOriginalTaxCredit;
  public java.math.BigDecimal get_fcurOriginalTaxCredit() {
    return fcurOriginalTaxCredit;
  }
  public void set_fcurOriginalTaxCredit(java.math.BigDecimal fcurOriginalTaxCredit) {
    this.fcurOriginalTaxCredit = fcurOriginalTaxCredit;
  }
  public tblnz_audgrossprddiscrepancy with_fcurOriginalTaxCredit(java.math.BigDecimal fcurOriginalTaxCredit) {
    this.fcurOriginalTaxCredit = fcurOriginalTaxCredit;
    return this;
  }
  private java.math.BigDecimal fcurAdjustedTaxCredit;
  public java.math.BigDecimal get_fcurAdjustedTaxCredit() {
    return fcurAdjustedTaxCredit;
  }
  public void set_fcurAdjustedTaxCredit(java.math.BigDecimal fcurAdjustedTaxCredit) {
    this.fcurAdjustedTaxCredit = fcurAdjustedTaxCredit;
  }
  public tblnz_audgrossprddiscrepancy with_fcurAdjustedTaxCredit(java.math.BigDecimal fcurAdjustedTaxCredit) {
    this.fcurAdjustedTaxCredit = fcurAdjustedTaxCredit;
    return this;
  }
  private java.sql.Timestamp fdtmLatePayPen;
  public java.sql.Timestamp get_fdtmLatePayPen() {
    return fdtmLatePayPen;
  }
  public void set_fdtmLatePayPen(java.sql.Timestamp fdtmLatePayPen) {
    this.fdtmLatePayPen = fdtmLatePayPen;
  }
  public tblnz_audgrossprddiscrepancy with_fdtmLatePayPen(java.sql.Timestamp fdtmLatePayPen) {
    this.fdtmLatePayPen = fdtmLatePayPen;
    return this;
  }
  private java.sql.Timestamp fdtmReturnDueDate;
  public java.sql.Timestamp get_fdtmReturnDueDate() {
    return fdtmReturnDueDate;
  }
  public void set_fdtmReturnDueDate(java.sql.Timestamp fdtmReturnDueDate) {
    this.fdtmReturnDueDate = fdtmReturnDueDate;
  }
  public tblnz_audgrossprddiscrepancy with_fdtmReturnDueDate(java.sql.Timestamp fdtmReturnDueDate) {
    this.fdtmReturnDueDate = fdtmReturnDueDate;
    return this;
  }
  private java.math.BigDecimal fcurPostLastCredit;
  public java.math.BigDecimal get_fcurPostLastCredit() {
    return fcurPostLastCredit;
  }
  public void set_fcurPostLastCredit(java.math.BigDecimal fcurPostLastCredit) {
    this.fcurPostLastCredit = fcurPostLastCredit;
  }
  public tblnz_audgrossprddiscrepancy with_fcurPostLastCredit(java.math.BigDecimal fcurPostLastCredit) {
    this.fcurPostLastCredit = fcurPostLastCredit;
    return this;
  }
  private java.math.BigDecimal fcurPostLastDebit;
  public java.math.BigDecimal get_fcurPostLastDebit() {
    return fcurPostLastDebit;
  }
  public void set_fcurPostLastDebit(java.math.BigDecimal fcurPostLastDebit) {
    this.fcurPostLastDebit = fcurPostLastDebit;
  }
  public tblnz_audgrossprddiscrepancy with_fcurPostLastDebit(java.math.BigDecimal fcurPostLastDebit) {
    this.fcurPostLastDebit = fcurPostLastDebit;
    return this;
  }
  private java.math.BigDecimal fcurPostCurrentCredit;
  public java.math.BigDecimal get_fcurPostCurrentCredit() {
    return fcurPostCurrentCredit;
  }
  public void set_fcurPostCurrentCredit(java.math.BigDecimal fcurPostCurrentCredit) {
    this.fcurPostCurrentCredit = fcurPostCurrentCredit;
  }
  public tblnz_audgrossprddiscrepancy with_fcurPostCurrentCredit(java.math.BigDecimal fcurPostCurrentCredit) {
    this.fcurPostCurrentCredit = fcurPostCurrentCredit;
    return this;
  }
  private java.math.BigDecimal fcurPostCurrentDebit;
  public java.math.BigDecimal get_fcurPostCurrentDebit() {
    return fcurPostCurrentDebit;
  }
  public void set_fcurPostCurrentDebit(java.math.BigDecimal fcurPostCurrentDebit) {
    this.fcurPostCurrentDebit = fcurPostCurrentDebit;
  }
  public tblnz_audgrossprddiscrepancy with_fcurPostCurrentDebit(java.math.BigDecimal fcurPostCurrentDebit) {
    this.fcurPostCurrentDebit = fcurPostCurrentDebit;
    return this;
  }
  private java.math.BigDecimal fcurPostChange;
  public java.math.BigDecimal get_fcurPostChange() {
    return fcurPostChange;
  }
  public void set_fcurPostChange(java.math.BigDecimal fcurPostChange) {
    this.fcurPostChange = fcurPostChange;
  }
  public tblnz_audgrossprddiscrepancy with_fcurPostChange(java.math.BigDecimal fcurPostChange) {
    this.fcurPostChange = fcurPostChange;
    return this;
  }
  private java.math.BigDecimal fcurDisputeTotal;
  public java.math.BigDecimal get_fcurDisputeTotal() {
    return fcurDisputeTotal;
  }
  public void set_fcurDisputeTotal(java.math.BigDecimal fcurDisputeTotal) {
    this.fcurDisputeTotal = fcurDisputeTotal;
  }
  public tblnz_audgrossprddiscrepancy with_fcurDisputeTotal(java.math.BigDecimal fcurDisputeTotal) {
    this.fcurDisputeTotal = fcurDisputeTotal;
    return this;
  }
  private java.math.BigDecimal fcurTotalChange;
  public java.math.BigDecimal get_fcurTotalChange() {
    return fcurTotalChange;
  }
  public void set_fcurTotalChange(java.math.BigDecimal fcurTotalChange) {
    this.fcurTotalChange = fcurTotalChange;
  }
  public tblnz_audgrossprddiscrepancy with_fcurTotalChange(java.math.BigDecimal fcurTotalChange) {
    this.fcurTotalChange = fcurTotalChange;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_audgrossprddiscrepancy with_fstrWho(String fstrWho) {
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
  public tblnz_audgrossprddiscrepancy with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_audgrossprddiscrepancy)) {
      return false;
    }
    tblnz_audgrossprddiscrepancy that = (tblnz_audgrossprddiscrepancy) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fcurTaxDebitDiscrepancy == null ? that.fcurTaxDebitDiscrepancy == null : this.fcurTaxDebitDiscrepancy.equals(that.fcurTaxDebitDiscrepancy));
    equal = equal && (this.fcurTaxCreditDiscrepancy == null ? that.fcurTaxCreditDiscrepancy == null : this.fcurTaxCreditDiscrepancy.equals(that.fcurTaxCreditDiscrepancy));
    equal = equal && (this.fcurOriginalTotal == null ? that.fcurOriginalTotal == null : this.fcurOriginalTotal.equals(that.fcurOriginalTotal));
    equal = equal && (this.fcurAdjustedTotal == null ? that.fcurAdjustedTotal == null : this.fcurAdjustedTotal.equals(that.fcurAdjustedTotal));
    equal = equal && (this.fcurTotalDiscrepancy == null ? that.fcurTotalDiscrepancy == null : this.fcurTotalDiscrepancy.equals(that.fcurTotalDiscrepancy));
    equal = equal && (this.fcurOriginalTaxDebit == null ? that.fcurOriginalTaxDebit == null : this.fcurOriginalTaxDebit.equals(that.fcurOriginalTaxDebit));
    equal = equal && (this.fcurAdjustedTaxDebit == null ? that.fcurAdjustedTaxDebit == null : this.fcurAdjustedTaxDebit.equals(that.fcurAdjustedTaxDebit));
    equal = equal && (this.fcurOriginalTaxCredit == null ? that.fcurOriginalTaxCredit == null : this.fcurOriginalTaxCredit.equals(that.fcurOriginalTaxCredit));
    equal = equal && (this.fcurAdjustedTaxCredit == null ? that.fcurAdjustedTaxCredit == null : this.fcurAdjustedTaxCredit.equals(that.fcurAdjustedTaxCredit));
    equal = equal && (this.fdtmLatePayPen == null ? that.fdtmLatePayPen == null : this.fdtmLatePayPen.equals(that.fdtmLatePayPen));
    equal = equal && (this.fdtmReturnDueDate == null ? that.fdtmReturnDueDate == null : this.fdtmReturnDueDate.equals(that.fdtmReturnDueDate));
    equal = equal && (this.fcurPostLastCredit == null ? that.fcurPostLastCredit == null : this.fcurPostLastCredit.equals(that.fcurPostLastCredit));
    equal = equal && (this.fcurPostLastDebit == null ? that.fcurPostLastDebit == null : this.fcurPostLastDebit.equals(that.fcurPostLastDebit));
    equal = equal && (this.fcurPostCurrentCredit == null ? that.fcurPostCurrentCredit == null : this.fcurPostCurrentCredit.equals(that.fcurPostCurrentCredit));
    equal = equal && (this.fcurPostCurrentDebit == null ? that.fcurPostCurrentDebit == null : this.fcurPostCurrentDebit.equals(that.fcurPostCurrentDebit));
    equal = equal && (this.fcurPostChange == null ? that.fcurPostChange == null : this.fcurPostChange.equals(that.fcurPostChange));
    equal = equal && (this.fcurDisputeTotal == null ? that.fcurDisputeTotal == null : this.fcurDisputeTotal.equals(that.fcurDisputeTotal));
    equal = equal && (this.fcurTotalChange == null ? that.fcurTotalChange == null : this.fcurTotalChange.equals(that.fcurTotalChange));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_audgrossprddiscrepancy)) {
      return false;
    }
    tblnz_audgrossprddiscrepancy that = (tblnz_audgrossprddiscrepancy) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fcurTaxDebitDiscrepancy == null ? that.fcurTaxDebitDiscrepancy == null : this.fcurTaxDebitDiscrepancy.equals(that.fcurTaxDebitDiscrepancy));
    equal = equal && (this.fcurTaxCreditDiscrepancy == null ? that.fcurTaxCreditDiscrepancy == null : this.fcurTaxCreditDiscrepancy.equals(that.fcurTaxCreditDiscrepancy));
    equal = equal && (this.fcurOriginalTotal == null ? that.fcurOriginalTotal == null : this.fcurOriginalTotal.equals(that.fcurOriginalTotal));
    equal = equal && (this.fcurAdjustedTotal == null ? that.fcurAdjustedTotal == null : this.fcurAdjustedTotal.equals(that.fcurAdjustedTotal));
    equal = equal && (this.fcurTotalDiscrepancy == null ? that.fcurTotalDiscrepancy == null : this.fcurTotalDiscrepancy.equals(that.fcurTotalDiscrepancy));
    equal = equal && (this.fcurOriginalTaxDebit == null ? that.fcurOriginalTaxDebit == null : this.fcurOriginalTaxDebit.equals(that.fcurOriginalTaxDebit));
    equal = equal && (this.fcurAdjustedTaxDebit == null ? that.fcurAdjustedTaxDebit == null : this.fcurAdjustedTaxDebit.equals(that.fcurAdjustedTaxDebit));
    equal = equal && (this.fcurOriginalTaxCredit == null ? that.fcurOriginalTaxCredit == null : this.fcurOriginalTaxCredit.equals(that.fcurOriginalTaxCredit));
    equal = equal && (this.fcurAdjustedTaxCredit == null ? that.fcurAdjustedTaxCredit == null : this.fcurAdjustedTaxCredit.equals(that.fcurAdjustedTaxCredit));
    equal = equal && (this.fdtmLatePayPen == null ? that.fdtmLatePayPen == null : this.fdtmLatePayPen.equals(that.fdtmLatePayPen));
    equal = equal && (this.fdtmReturnDueDate == null ? that.fdtmReturnDueDate == null : this.fdtmReturnDueDate.equals(that.fdtmReturnDueDate));
    equal = equal && (this.fcurPostLastCredit == null ? that.fcurPostLastCredit == null : this.fcurPostLastCredit.equals(that.fcurPostLastCredit));
    equal = equal && (this.fcurPostLastDebit == null ? that.fcurPostLastDebit == null : this.fcurPostLastDebit.equals(that.fcurPostLastDebit));
    equal = equal && (this.fcurPostCurrentCredit == null ? that.fcurPostCurrentCredit == null : this.fcurPostCurrentCredit.equals(that.fcurPostCurrentCredit));
    equal = equal && (this.fcurPostCurrentDebit == null ? that.fcurPostCurrentDebit == null : this.fcurPostCurrentDebit.equals(that.fcurPostCurrentDebit));
    equal = equal && (this.fcurPostChange == null ? that.fcurPostChange == null : this.fcurPostChange.equals(that.fcurPostChange));
    equal = equal && (this.fcurDisputeTotal == null ? that.fcurDisputeTotal == null : this.fcurDisputeTotal.equals(that.fcurDisputeTotal));
    equal = equal && (this.fcurTotalChange == null ? that.fcurTotalChange == null : this.fcurTotalChange.equals(that.fcurTotalChange));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurTaxDebitDiscrepancy = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTaxCreditDiscrepancy = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurOriginalTotal = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurAdjustedTotal = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalDiscrepancy = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurOriginalTaxDebit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAdjustedTaxDebit = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurOriginalTaxCredit = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurAdjustedTaxCredit = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fdtmLatePayPen = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmReturnDueDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurPostLastCredit = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPostLastDebit = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPostCurrentCredit = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurPostCurrentDebit = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurPostChange = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurDisputeTotal = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurTotalChange = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurTaxDebitDiscrepancy = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTaxCreditDiscrepancy = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurOriginalTotal = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurAdjustedTotal = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalDiscrepancy = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurOriginalTaxDebit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAdjustedTaxDebit = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurOriginalTaxCredit = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurAdjustedTaxCredit = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fdtmLatePayPen = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmReturnDueDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurPostLastCredit = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPostLastDebit = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPostCurrentCredit = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurPostCurrentDebit = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurPostChange = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurDisputeTotal = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurTotalChange = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDebitDiscrepancy, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditDiscrepancy, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalTotal, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedTotal, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDiscrepancy, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalTaxDebit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedTaxDebit, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalTaxCredit, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedTaxCredit, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLatePayPen, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReturnDueDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostLastCredit, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostLastDebit, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostCurrentCredit, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostCurrentDebit, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostChange, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisputeTotal, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalChange, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDebitDiscrepancy, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditDiscrepancy, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalTotal, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedTotal, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalDiscrepancy, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalTaxDebit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedTaxDebit, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalTaxCredit, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustedTaxCredit, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLatePayPen, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReturnDueDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostLastCredit, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostLastDebit, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostCurrentCredit, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostCurrentDebit, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostChange, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisputeTotal, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalChange, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
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
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxDebitDiscrepancy = null;
    } else {
    this.fcurTaxDebitDiscrepancy = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxCreditDiscrepancy = null;
    } else {
    this.fcurTaxCreditDiscrepancy = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOriginalTotal = null;
    } else {
    this.fcurOriginalTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdjustedTotal = null;
    } else {
    this.fcurAdjustedTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalDiscrepancy = null;
    } else {
    this.fcurTotalDiscrepancy = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOriginalTaxDebit = null;
    } else {
    this.fcurOriginalTaxDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdjustedTaxDebit = null;
    } else {
    this.fcurAdjustedTaxDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOriginalTaxCredit = null;
    } else {
    this.fcurOriginalTaxCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdjustedTaxCredit = null;
    } else {
    this.fcurAdjustedTaxCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLatePayPen = null;
    } else {
    this.fdtmLatePayPen = new Timestamp(__dataIn.readLong());
    this.fdtmLatePayPen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReturnDueDate = null;
    } else {
    this.fdtmReturnDueDate = new Timestamp(__dataIn.readLong());
    this.fdtmReturnDueDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPostLastCredit = null;
    } else {
    this.fcurPostLastCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPostLastDebit = null;
    } else {
    this.fcurPostLastDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPostCurrentCredit = null;
    } else {
    this.fcurPostCurrentCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPostCurrentDebit = null;
    } else {
    this.fcurPostCurrentDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPostChange = null;
    } else {
    this.fcurPostChange = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDisputeTotal = null;
    } else {
    this.fcurDisputeTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalChange = null;
    } else {
    this.fcurTotalChange = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fcurTaxDebitDiscrepancy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDebitDiscrepancy, __dataOut);
    }
    if (null == this.fcurTaxCreditDiscrepancy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditDiscrepancy, __dataOut);
    }
    if (null == this.fcurOriginalTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalTotal, __dataOut);
    }
    if (null == this.fcurAdjustedTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedTotal, __dataOut);
    }
    if (null == this.fcurTotalDiscrepancy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDiscrepancy, __dataOut);
    }
    if (null == this.fcurOriginalTaxDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalTaxDebit, __dataOut);
    }
    if (null == this.fcurAdjustedTaxDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedTaxDebit, __dataOut);
    }
    if (null == this.fcurOriginalTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalTaxCredit, __dataOut);
    }
    if (null == this.fcurAdjustedTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedTaxCredit, __dataOut);
    }
    if (null == this.fdtmLatePayPen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLatePayPen.getTime());
    __dataOut.writeInt(this.fdtmLatePayPen.getNanos());
    }
    if (null == this.fdtmReturnDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReturnDueDate.getTime());
    __dataOut.writeInt(this.fdtmReturnDueDate.getNanos());
    }
    if (null == this.fcurPostLastCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostLastCredit, __dataOut);
    }
    if (null == this.fcurPostLastDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostLastDebit, __dataOut);
    }
    if (null == this.fcurPostCurrentCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostCurrentCredit, __dataOut);
    }
    if (null == this.fcurPostCurrentDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostCurrentDebit, __dataOut);
    }
    if (null == this.fcurPostChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostChange, __dataOut);
    }
    if (null == this.fcurDisputeTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisputeTotal, __dataOut);
    }
    if (null == this.fcurTotalChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalChange, __dataOut);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fcurTaxDebitDiscrepancy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDebitDiscrepancy, __dataOut);
    }
    if (null == this.fcurTaxCreditDiscrepancy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditDiscrepancy, __dataOut);
    }
    if (null == this.fcurOriginalTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalTotal, __dataOut);
    }
    if (null == this.fcurAdjustedTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedTotal, __dataOut);
    }
    if (null == this.fcurTotalDiscrepancy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalDiscrepancy, __dataOut);
    }
    if (null == this.fcurOriginalTaxDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalTaxDebit, __dataOut);
    }
    if (null == this.fcurAdjustedTaxDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedTaxDebit, __dataOut);
    }
    if (null == this.fcurOriginalTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalTaxCredit, __dataOut);
    }
    if (null == this.fcurAdjustedTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustedTaxCredit, __dataOut);
    }
    if (null == this.fdtmLatePayPen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLatePayPen.getTime());
    __dataOut.writeInt(this.fdtmLatePayPen.getNanos());
    }
    if (null == this.fdtmReturnDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReturnDueDate.getTime());
    __dataOut.writeInt(this.fdtmReturnDueDate.getNanos());
    }
    if (null == this.fcurPostLastCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostLastCredit, __dataOut);
    }
    if (null == this.fcurPostLastDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostLastDebit, __dataOut);
    }
    if (null == this.fcurPostCurrentCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostCurrentCredit, __dataOut);
    }
    if (null == this.fcurPostCurrentDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostCurrentDebit, __dataOut);
    }
    if (null == this.fcurPostChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostChange, __dataOut);
    }
    if (null == this.fcurDisputeTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisputeTotal, __dataOut);
    }
    if (null == this.fcurTotalChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalChange, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDebitDiscrepancy==null?"\\N":fcurTaxDebitDiscrepancy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditDiscrepancy==null?"\\N":fcurTaxCreditDiscrepancy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalTotal==null?"\\N":fcurOriginalTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedTotal==null?"\\N":fcurAdjustedTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDiscrepancy==null?"\\N":fcurTotalDiscrepancy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalTaxDebit==null?"\\N":fcurOriginalTaxDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedTaxDebit==null?"\\N":fcurAdjustedTaxDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalTaxCredit==null?"\\N":fcurOriginalTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedTaxCredit==null?"\\N":fcurAdjustedTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLatePayPen==null?"\\N":"" + fdtmLatePayPen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReturnDueDate==null?"\\N":"" + fdtmReturnDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostLastCredit==null?"\\N":fcurPostLastCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostLastDebit==null?"\\N":fcurPostLastDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostCurrentCredit==null?"\\N":fcurPostCurrentCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostCurrentDebit==null?"\\N":fcurPostCurrentDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostChange==null?"\\N":fcurPostChange.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisputeTotal==null?"\\N":fcurDisputeTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalChange==null?"\\N":fcurTotalChange.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDebitDiscrepancy==null?"\\N":fcurTaxDebitDiscrepancy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditDiscrepancy==null?"\\N":fcurTaxCreditDiscrepancy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalTotal==null?"\\N":fcurOriginalTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedTotal==null?"\\N":fcurAdjustedTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalDiscrepancy==null?"\\N":fcurTotalDiscrepancy.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalTaxDebit==null?"\\N":fcurOriginalTaxDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedTaxDebit==null?"\\N":fcurAdjustedTaxDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalTaxCredit==null?"\\N":fcurOriginalTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustedTaxCredit==null?"\\N":fcurAdjustedTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLatePayPen==null?"\\N":"" + fdtmLatePayPen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReturnDueDate==null?"\\N":"" + fdtmReturnDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostLastCredit==null?"\\N":fcurPostLastCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostLastDebit==null?"\\N":fcurPostLastDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostCurrentCredit==null?"\\N":fcurPostCurrentCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostCurrentDebit==null?"\\N":fcurPostCurrentDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostChange==null?"\\N":fcurPostChange.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisputeTotal==null?"\\N":fcurDisputeTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalChange==null?"\\N":fcurTotalChange.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDebitDiscrepancy = null; } else {
      this.fcurTaxDebitDiscrepancy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditDiscrepancy = null; } else {
      this.fcurTaxCreditDiscrepancy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalTotal = null; } else {
      this.fcurOriginalTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedTotal = null; } else {
      this.fcurAdjustedTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDiscrepancy = null; } else {
      this.fcurTotalDiscrepancy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalTaxDebit = null; } else {
      this.fcurOriginalTaxDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedTaxDebit = null; } else {
      this.fcurAdjustedTaxDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalTaxCredit = null; } else {
      this.fcurOriginalTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedTaxCredit = null; } else {
      this.fcurAdjustedTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLatePayPen = null; } else {
      this.fdtmLatePayPen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReturnDueDate = null; } else {
      this.fdtmReturnDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostLastCredit = null; } else {
      this.fcurPostLastCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostLastDebit = null; } else {
      this.fcurPostLastDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostCurrentCredit = null; } else {
      this.fcurPostCurrentCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostCurrentDebit = null; } else {
      this.fcurPostCurrentDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostChange = null; } else {
      this.fcurPostChange = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisputeTotal = null; } else {
      this.fcurDisputeTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalChange = null; } else {
      this.fcurTotalChange = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDebitDiscrepancy = null; } else {
      this.fcurTaxDebitDiscrepancy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditDiscrepancy = null; } else {
      this.fcurTaxCreditDiscrepancy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalTotal = null; } else {
      this.fcurOriginalTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedTotal = null; } else {
      this.fcurAdjustedTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalDiscrepancy = null; } else {
      this.fcurTotalDiscrepancy = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalTaxDebit = null; } else {
      this.fcurOriginalTaxDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedTaxDebit = null; } else {
      this.fcurAdjustedTaxDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalTaxCredit = null; } else {
      this.fcurOriginalTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustedTaxCredit = null; } else {
      this.fcurAdjustedTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLatePayPen = null; } else {
      this.fdtmLatePayPen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReturnDueDate = null; } else {
      this.fdtmReturnDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostLastCredit = null; } else {
      this.fcurPostLastCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostLastDebit = null; } else {
      this.fcurPostLastDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostCurrentCredit = null; } else {
      this.fcurPostCurrentCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostCurrentDebit = null; } else {
      this.fcurPostCurrentDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostChange = null; } else {
      this.fcurPostChange = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisputeTotal = null; } else {
      this.fcurDisputeTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalChange = null; } else {
      this.fcurTotalChange = new java.math.BigDecimal(__cur_str);
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
    tblnz_audgrossprddiscrepancy o = (tblnz_audgrossprddiscrepancy) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmLatePayPen = (o.fdtmLatePayPen != null) ? (java.sql.Timestamp) o.fdtmLatePayPen.clone() : null;
    o.fdtmReturnDueDate = (o.fdtmReturnDueDate != null) ? (java.sql.Timestamp) o.fdtmReturnDueDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_audgrossprddiscrepancy o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmLatePayPen = (o.fdtmLatePayPen != null) ? (java.sql.Timestamp) o.fdtmLatePayPen.clone() : null;
    o.fdtmReturnDueDate = (o.fdtmReturnDueDate != null) ? (java.sql.Timestamp) o.fdtmReturnDueDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fcurTaxDebitDiscrepancy", this.fcurTaxDebitDiscrepancy);
    __sqoop$field_map.put("fcurTaxCreditDiscrepancy", this.fcurTaxCreditDiscrepancy);
    __sqoop$field_map.put("fcurOriginalTotal", this.fcurOriginalTotal);
    __sqoop$field_map.put("fcurAdjustedTotal", this.fcurAdjustedTotal);
    __sqoop$field_map.put("fcurTotalDiscrepancy", this.fcurTotalDiscrepancy);
    __sqoop$field_map.put("fcurOriginalTaxDebit", this.fcurOriginalTaxDebit);
    __sqoop$field_map.put("fcurAdjustedTaxDebit", this.fcurAdjustedTaxDebit);
    __sqoop$field_map.put("fcurOriginalTaxCredit", this.fcurOriginalTaxCredit);
    __sqoop$field_map.put("fcurAdjustedTaxCredit", this.fcurAdjustedTaxCredit);
    __sqoop$field_map.put("fdtmLatePayPen", this.fdtmLatePayPen);
    __sqoop$field_map.put("fdtmReturnDueDate", this.fdtmReturnDueDate);
    __sqoop$field_map.put("fcurPostLastCredit", this.fcurPostLastCredit);
    __sqoop$field_map.put("fcurPostLastDebit", this.fcurPostLastDebit);
    __sqoop$field_map.put("fcurPostCurrentCredit", this.fcurPostCurrentCredit);
    __sqoop$field_map.put("fcurPostCurrentDebit", this.fcurPostCurrentDebit);
    __sqoop$field_map.put("fcurPostChange", this.fcurPostChange);
    __sqoop$field_map.put("fcurDisputeTotal", this.fcurDisputeTotal);
    __sqoop$field_map.put("fcurTotalChange", this.fcurTotalChange);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fcurTaxDebitDiscrepancy", this.fcurTaxDebitDiscrepancy);
    __sqoop$field_map.put("fcurTaxCreditDiscrepancy", this.fcurTaxCreditDiscrepancy);
    __sqoop$field_map.put("fcurOriginalTotal", this.fcurOriginalTotal);
    __sqoop$field_map.put("fcurAdjustedTotal", this.fcurAdjustedTotal);
    __sqoop$field_map.put("fcurTotalDiscrepancy", this.fcurTotalDiscrepancy);
    __sqoop$field_map.put("fcurOriginalTaxDebit", this.fcurOriginalTaxDebit);
    __sqoop$field_map.put("fcurAdjustedTaxDebit", this.fcurAdjustedTaxDebit);
    __sqoop$field_map.put("fcurOriginalTaxCredit", this.fcurOriginalTaxCredit);
    __sqoop$field_map.put("fcurAdjustedTaxCredit", this.fcurAdjustedTaxCredit);
    __sqoop$field_map.put("fdtmLatePayPen", this.fdtmLatePayPen);
    __sqoop$field_map.put("fdtmReturnDueDate", this.fdtmReturnDueDate);
    __sqoop$field_map.put("fcurPostLastCredit", this.fcurPostLastCredit);
    __sqoop$field_map.put("fcurPostLastDebit", this.fcurPostLastDebit);
    __sqoop$field_map.put("fcurPostCurrentCredit", this.fcurPostCurrentCredit);
    __sqoop$field_map.put("fcurPostCurrentDebit", this.fcurPostCurrentDebit);
    __sqoop$field_map.put("fcurPostChange", this.fcurPostChange);
    __sqoop$field_map.put("fcurDisputeTotal", this.fcurDisputeTotal);
    __sqoop$field_map.put("fcurTotalChange", this.fcurTotalChange);
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
