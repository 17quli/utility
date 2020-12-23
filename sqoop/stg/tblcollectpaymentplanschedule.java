// ORM class for table 'tblcollectpaymentplanschedule'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:53:22 NZDT 2020
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

public class tblcollectpaymentplanschedule extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngPaymentPlanKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.flngPaymentPlanKey = (Integer)value;
      }
    });
    setters.put("fintScheduleVersion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fintScheduleVersion = (Integer)value;
      }
    });
    setters.put("fintInstallmentSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fintInstallmentSeq = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fdtmInstallmentDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fdtmInstallmentDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurStartingBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fcurStartingBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInstallment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fcurInstallment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fcurInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fcurPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEndingBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fcurEndingBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngAchDebitKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.flngAchDebitKey = (Integer)value;
      }
    });
    setters.put("fi64PaymentRequestKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fi64PaymentRequestKey = (Long)value;
      }
    });
    setters.put("fdtmProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fdtmProcessed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnSatisfied", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fblnSatisfied = (Integer)value;
      }
    });
    setters.put("fdtmSatisfied", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fdtmSatisfied = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnPreviousSchedule", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fblnPreviousSchedule = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplanschedule.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcollectpaymentplanschedule() {
    init0();
  }
  private Integer flngPaymentPlanKey;
  public Integer get_flngPaymentPlanKey() {
    return flngPaymentPlanKey;
  }
  public void set_flngPaymentPlanKey(Integer flngPaymentPlanKey) {
    this.flngPaymentPlanKey = flngPaymentPlanKey;
  }
  public tblcollectpaymentplanschedule with_flngPaymentPlanKey(Integer flngPaymentPlanKey) {
    this.flngPaymentPlanKey = flngPaymentPlanKey;
    return this;
  }
  private Integer fintScheduleVersion;
  public Integer get_fintScheduleVersion() {
    return fintScheduleVersion;
  }
  public void set_fintScheduleVersion(Integer fintScheduleVersion) {
    this.fintScheduleVersion = fintScheduleVersion;
  }
  public tblcollectpaymentplanschedule with_fintScheduleVersion(Integer fintScheduleVersion) {
    this.fintScheduleVersion = fintScheduleVersion;
    return this;
  }
  private Integer fintInstallmentSeq;
  public Integer get_fintInstallmentSeq() {
    return fintInstallmentSeq;
  }
  public void set_fintInstallmentSeq(Integer fintInstallmentSeq) {
    this.fintInstallmentSeq = fintInstallmentSeq;
  }
  public tblcollectpaymentplanschedule with_fintInstallmentSeq(Integer fintInstallmentSeq) {
    this.fintInstallmentSeq = fintInstallmentSeq;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblcollectpaymentplanschedule with_flngVer(Integer flngVer) {
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
  public tblcollectpaymentplanschedule with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.sql.Timestamp fdtmInstallmentDue;
  public java.sql.Timestamp get_fdtmInstallmentDue() {
    return fdtmInstallmentDue;
  }
  public void set_fdtmInstallmentDue(java.sql.Timestamp fdtmInstallmentDue) {
    this.fdtmInstallmentDue = fdtmInstallmentDue;
  }
  public tblcollectpaymentplanschedule with_fdtmInstallmentDue(java.sql.Timestamp fdtmInstallmentDue) {
    this.fdtmInstallmentDue = fdtmInstallmentDue;
    return this;
  }
  private java.math.BigDecimal fcurStartingBalance;
  public java.math.BigDecimal get_fcurStartingBalance() {
    return fcurStartingBalance;
  }
  public void set_fcurStartingBalance(java.math.BigDecimal fcurStartingBalance) {
    this.fcurStartingBalance = fcurStartingBalance;
  }
  public tblcollectpaymentplanschedule with_fcurStartingBalance(java.math.BigDecimal fcurStartingBalance) {
    this.fcurStartingBalance = fcurStartingBalance;
    return this;
  }
  private java.math.BigDecimal fcurInstallment;
  public java.math.BigDecimal get_fcurInstallment() {
    return fcurInstallment;
  }
  public void set_fcurInstallment(java.math.BigDecimal fcurInstallment) {
    this.fcurInstallment = fcurInstallment;
  }
  public tblcollectpaymentplanschedule with_fcurInstallment(java.math.BigDecimal fcurInstallment) {
    this.fcurInstallment = fcurInstallment;
    return this;
  }
  private java.math.BigDecimal fcurInterest;
  public java.math.BigDecimal get_fcurInterest() {
    return fcurInterest;
  }
  public void set_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
  }
  public tblcollectpaymentplanschedule with_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
    return this;
  }
  private java.math.BigDecimal fcurPenalty;
  public java.math.BigDecimal get_fcurPenalty() {
    return fcurPenalty;
  }
  public void set_fcurPenalty(java.math.BigDecimal fcurPenalty) {
    this.fcurPenalty = fcurPenalty;
  }
  public tblcollectpaymentplanschedule with_fcurPenalty(java.math.BigDecimal fcurPenalty) {
    this.fcurPenalty = fcurPenalty;
    return this;
  }
  private java.math.BigDecimal fcurEndingBalance;
  public java.math.BigDecimal get_fcurEndingBalance() {
    return fcurEndingBalance;
  }
  public void set_fcurEndingBalance(java.math.BigDecimal fcurEndingBalance) {
    this.fcurEndingBalance = fcurEndingBalance;
  }
  public tblcollectpaymentplanschedule with_fcurEndingBalance(java.math.BigDecimal fcurEndingBalance) {
    this.fcurEndingBalance = fcurEndingBalance;
    return this;
  }
  private Integer flngAchDebitKey;
  public Integer get_flngAchDebitKey() {
    return flngAchDebitKey;
  }
  public void set_flngAchDebitKey(Integer flngAchDebitKey) {
    this.flngAchDebitKey = flngAchDebitKey;
  }
  public tblcollectpaymentplanschedule with_flngAchDebitKey(Integer flngAchDebitKey) {
    this.flngAchDebitKey = flngAchDebitKey;
    return this;
  }
  private Long fi64PaymentRequestKey;
  public Long get_fi64PaymentRequestKey() {
    return fi64PaymentRequestKey;
  }
  public void set_fi64PaymentRequestKey(Long fi64PaymentRequestKey) {
    this.fi64PaymentRequestKey = fi64PaymentRequestKey;
  }
  public tblcollectpaymentplanschedule with_fi64PaymentRequestKey(Long fi64PaymentRequestKey) {
    this.fi64PaymentRequestKey = fi64PaymentRequestKey;
    return this;
  }
  private java.sql.Timestamp fdtmProcessed;
  public java.sql.Timestamp get_fdtmProcessed() {
    return fdtmProcessed;
  }
  public void set_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
  }
  public tblcollectpaymentplanschedule with_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
    return this;
  }
  private Integer fblnSatisfied;
  public Integer get_fblnSatisfied() {
    return fblnSatisfied;
  }
  public void set_fblnSatisfied(Integer fblnSatisfied) {
    this.fblnSatisfied = fblnSatisfied;
  }
  public tblcollectpaymentplanschedule with_fblnSatisfied(Integer fblnSatisfied) {
    this.fblnSatisfied = fblnSatisfied;
    return this;
  }
  private java.sql.Timestamp fdtmSatisfied;
  public java.sql.Timestamp get_fdtmSatisfied() {
    return fdtmSatisfied;
  }
  public void set_fdtmSatisfied(java.sql.Timestamp fdtmSatisfied) {
    this.fdtmSatisfied = fdtmSatisfied;
  }
  public tblcollectpaymentplanschedule with_fdtmSatisfied(java.sql.Timestamp fdtmSatisfied) {
    this.fdtmSatisfied = fdtmSatisfied;
    return this;
  }
  private Integer fblnPreviousSchedule;
  public Integer get_fblnPreviousSchedule() {
    return fblnPreviousSchedule;
  }
  public void set_fblnPreviousSchedule(Integer fblnPreviousSchedule) {
    this.fblnPreviousSchedule = fblnPreviousSchedule;
  }
  public tblcollectpaymentplanschedule with_fblnPreviousSchedule(Integer fblnPreviousSchedule) {
    this.fblnPreviousSchedule = fblnPreviousSchedule;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblcollectpaymentplanschedule with_fblnActive(Integer fblnActive) {
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
  public tblcollectpaymentplanschedule with_fstrWho(String fstrWho) {
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
  public tblcollectpaymentplanschedule with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollectpaymentplanschedule)) {
      return false;
    }
    tblcollectpaymentplanschedule that = (tblcollectpaymentplanschedule) o;
    boolean equal = true;
    equal = equal && (this.flngPaymentPlanKey == null ? that.flngPaymentPlanKey == null : this.flngPaymentPlanKey.equals(that.flngPaymentPlanKey));
    equal = equal && (this.fintScheduleVersion == null ? that.fintScheduleVersion == null : this.fintScheduleVersion.equals(that.fintScheduleVersion));
    equal = equal && (this.fintInstallmentSeq == null ? that.fintInstallmentSeq == null : this.fintInstallmentSeq.equals(that.fintInstallmentSeq));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmInstallmentDue == null ? that.fdtmInstallmentDue == null : this.fdtmInstallmentDue.equals(that.fdtmInstallmentDue));
    equal = equal && (this.fcurStartingBalance == null ? that.fcurStartingBalance == null : this.fcurStartingBalance.equals(that.fcurStartingBalance));
    equal = equal && (this.fcurInstallment == null ? that.fcurInstallment == null : this.fcurInstallment.equals(that.fcurInstallment));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurPenalty == null ? that.fcurPenalty == null : this.fcurPenalty.equals(that.fcurPenalty));
    equal = equal && (this.fcurEndingBalance == null ? that.fcurEndingBalance == null : this.fcurEndingBalance.equals(that.fcurEndingBalance));
    equal = equal && (this.flngAchDebitKey == null ? that.flngAchDebitKey == null : this.flngAchDebitKey.equals(that.flngAchDebitKey));
    equal = equal && (this.fi64PaymentRequestKey == null ? that.fi64PaymentRequestKey == null : this.fi64PaymentRequestKey.equals(that.fi64PaymentRequestKey));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.fblnSatisfied == null ? that.fblnSatisfied == null : this.fblnSatisfied.equals(that.fblnSatisfied));
    equal = equal && (this.fdtmSatisfied == null ? that.fdtmSatisfied == null : this.fdtmSatisfied.equals(that.fdtmSatisfied));
    equal = equal && (this.fblnPreviousSchedule == null ? that.fblnPreviousSchedule == null : this.fblnPreviousSchedule.equals(that.fblnPreviousSchedule));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollectpaymentplanschedule)) {
      return false;
    }
    tblcollectpaymentplanschedule that = (tblcollectpaymentplanschedule) o;
    boolean equal = true;
    equal = equal && (this.flngPaymentPlanKey == null ? that.flngPaymentPlanKey == null : this.flngPaymentPlanKey.equals(that.flngPaymentPlanKey));
    equal = equal && (this.fintScheduleVersion == null ? that.fintScheduleVersion == null : this.fintScheduleVersion.equals(that.fintScheduleVersion));
    equal = equal && (this.fintInstallmentSeq == null ? that.fintInstallmentSeq == null : this.fintInstallmentSeq.equals(that.fintInstallmentSeq));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmInstallmentDue == null ? that.fdtmInstallmentDue == null : this.fdtmInstallmentDue.equals(that.fdtmInstallmentDue));
    equal = equal && (this.fcurStartingBalance == null ? that.fcurStartingBalance == null : this.fcurStartingBalance.equals(that.fcurStartingBalance));
    equal = equal && (this.fcurInstallment == null ? that.fcurInstallment == null : this.fcurInstallment.equals(that.fcurInstallment));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurPenalty == null ? that.fcurPenalty == null : this.fcurPenalty.equals(that.fcurPenalty));
    equal = equal && (this.fcurEndingBalance == null ? that.fcurEndingBalance == null : this.fcurEndingBalance.equals(that.fcurEndingBalance));
    equal = equal && (this.flngAchDebitKey == null ? that.flngAchDebitKey == null : this.flngAchDebitKey.equals(that.flngAchDebitKey));
    equal = equal && (this.fi64PaymentRequestKey == null ? that.fi64PaymentRequestKey == null : this.fi64PaymentRequestKey.equals(that.fi64PaymentRequestKey));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.fblnSatisfied == null ? that.fblnSatisfied == null : this.fblnSatisfied.equals(that.fblnSatisfied));
    equal = equal && (this.fdtmSatisfied == null ? that.fdtmSatisfied == null : this.fdtmSatisfied.equals(that.fdtmSatisfied));
    equal = equal && (this.fblnPreviousSchedule == null ? that.fblnPreviousSchedule == null : this.fblnPreviousSchedule.equals(that.fblnPreviousSchedule));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngPaymentPlanKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintScheduleVersion = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintInstallmentSeq = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmInstallmentDue = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fcurStartingBalance = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurInstallment = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPenalty = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurEndingBalance = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.flngAchDebitKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fi64PaymentRequestKey = JdbcWritableBridge.readLong(13, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fblnSatisfied = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmSatisfied = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fblnPreviousSchedule = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngPaymentPlanKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintScheduleVersion = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintInstallmentSeq = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmInstallmentDue = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fcurStartingBalance = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurInstallment = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPenalty = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurEndingBalance = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.flngAchDebitKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fi64PaymentRequestKey = JdbcWritableBridge.readLong(13, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fblnSatisfied = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmSatisfied = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fblnPreviousSchedule = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(18, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngPaymentPlanKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintScheduleVersion, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintInstallmentSeq, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInstallmentDue, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurStartingBalance, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInstallment, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenalty, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndingBalance, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAchDebitKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64PaymentRequestKey, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSatisfied, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSatisfied, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPreviousSchedule, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngPaymentPlanKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintScheduleVersion, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintInstallmentSeq, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInstallmentDue, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurStartingBalance, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInstallment, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenalty, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEndingBalance, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAchDebitKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64PaymentRequestKey, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSatisfied, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSatisfied, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPreviousSchedule, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngPaymentPlanKey = null;
    } else {
    this.flngPaymentPlanKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintScheduleVersion = null;
    } else {
    this.fintScheduleVersion = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintInstallmentSeq = null;
    } else {
    this.fintInstallmentSeq = Integer.valueOf(__dataIn.readInt());
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
        this.fdtmInstallmentDue = null;
    } else {
    this.fdtmInstallmentDue = new Timestamp(__dataIn.readLong());
    this.fdtmInstallmentDue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurStartingBalance = null;
    } else {
    this.fcurStartingBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInstallment = null;
    } else {
    this.fcurInstallment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterest = null;
    } else {
    this.fcurInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenalty = null;
    } else {
    this.fcurPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEndingBalance = null;
    } else {
    this.fcurEndingBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngAchDebitKey = null;
    } else {
    this.flngAchDebitKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64PaymentRequestKey = null;
    } else {
    this.fi64PaymentRequestKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProcessed = null;
    } else {
    this.fdtmProcessed = new Timestamp(__dataIn.readLong());
    this.fdtmProcessed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSatisfied = null;
    } else {
    this.fblnSatisfied = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSatisfied = null;
    } else {
    this.fdtmSatisfied = new Timestamp(__dataIn.readLong());
    this.fdtmSatisfied.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPreviousSchedule = null;
    } else {
    this.fblnPreviousSchedule = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngPaymentPlanKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPaymentPlanKey);
    }
    if (null == this.fintScheduleVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintScheduleVersion);
    }
    if (null == this.fintInstallmentSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintInstallmentSeq);
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
    if (null == this.fdtmInstallmentDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInstallmentDue.getTime());
    __dataOut.writeInt(this.fdtmInstallmentDue.getNanos());
    }
    if (null == this.fcurStartingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurStartingBalance, __dataOut);
    }
    if (null == this.fcurInstallment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInstallment, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenalty, __dataOut);
    }
    if (null == this.fcurEndingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndingBalance, __dataOut);
    }
    if (null == this.flngAchDebitKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAchDebitKey);
    }
    if (null == this.fi64PaymentRequestKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64PaymentRequestKey);
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
    }
    if (null == this.fblnSatisfied) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSatisfied);
    }
    if (null == this.fdtmSatisfied) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSatisfied.getTime());
    __dataOut.writeInt(this.fdtmSatisfied.getNanos());
    }
    if (null == this.fblnPreviousSchedule) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPreviousSchedule);
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
    if (null == this.flngPaymentPlanKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPaymentPlanKey);
    }
    if (null == this.fintScheduleVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintScheduleVersion);
    }
    if (null == this.fintInstallmentSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintInstallmentSeq);
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
    if (null == this.fdtmInstallmentDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInstallmentDue.getTime());
    __dataOut.writeInt(this.fdtmInstallmentDue.getNanos());
    }
    if (null == this.fcurStartingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurStartingBalance, __dataOut);
    }
    if (null == this.fcurInstallment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInstallment, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenalty, __dataOut);
    }
    if (null == this.fcurEndingBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEndingBalance, __dataOut);
    }
    if (null == this.flngAchDebitKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAchDebitKey);
    }
    if (null == this.fi64PaymentRequestKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64PaymentRequestKey);
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
    }
    if (null == this.fblnSatisfied) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSatisfied);
    }
    if (null == this.fdtmSatisfied) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSatisfied.getTime());
    __dataOut.writeInt(this.fdtmSatisfied.getNanos());
    }
    if (null == this.fblnPreviousSchedule) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPreviousSchedule);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngPaymentPlanKey==null?"\\N":"" + flngPaymentPlanKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintScheduleVersion==null?"\\N":"" + fintScheduleVersion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintInstallmentSeq==null?"\\N":"" + fintInstallmentSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInstallmentDue==null?"\\N":"" + fdtmInstallmentDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurStartingBalance==null?"\\N":fcurStartingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInstallment==null?"\\N":fcurInstallment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenalty==null?"\\N":fcurPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndingBalance==null?"\\N":fcurEndingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAchDebitKey==null?"\\N":"" + flngAchDebitKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64PaymentRequestKey==null?"\\N":"" + fi64PaymentRequestKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSatisfied==null?"\\N":"" + fblnSatisfied, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSatisfied==null?"\\N":"" + fdtmSatisfied, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPreviousSchedule==null?"\\N":"" + fblnPreviousSchedule, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngPaymentPlanKey==null?"\\N":"" + flngPaymentPlanKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintScheduleVersion==null?"\\N":"" + fintScheduleVersion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintInstallmentSeq==null?"\\N":"" + fintInstallmentSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInstallmentDue==null?"\\N":"" + fdtmInstallmentDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurStartingBalance==null?"\\N":fcurStartingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInstallment==null?"\\N":fcurInstallment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenalty==null?"\\N":fcurPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEndingBalance==null?"\\N":fcurEndingBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAchDebitKey==null?"\\N":"" + flngAchDebitKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64PaymentRequestKey==null?"\\N":"" + fi64PaymentRequestKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSatisfied==null?"\\N":"" + fblnSatisfied, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSatisfied==null?"\\N":"" + fdtmSatisfied, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPreviousSchedule==null?"\\N":"" + fblnPreviousSchedule, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPaymentPlanKey = null; } else {
      this.flngPaymentPlanKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintScheduleVersion = null; } else {
      this.fintScheduleVersion = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintInstallmentSeq = null; } else {
      this.fintInstallmentSeq = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInstallmentDue = null; } else {
      this.fdtmInstallmentDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurStartingBalance = null; } else {
      this.fcurStartingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInstallment = null; } else {
      this.fcurInstallment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterest = null; } else {
      this.fcurInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenalty = null; } else {
      this.fcurPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndingBalance = null; } else {
      this.fcurEndingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAchDebitKey = null; } else {
      this.flngAchDebitKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64PaymentRequestKey = null; } else {
      this.fi64PaymentRequestKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessed = null; } else {
      this.fdtmProcessed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSatisfied = null; } else {
      this.fblnSatisfied = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSatisfied = null; } else {
      this.fdtmSatisfied = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPreviousSchedule = null; } else {
      this.fblnPreviousSchedule = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPaymentPlanKey = null; } else {
      this.flngPaymentPlanKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintScheduleVersion = null; } else {
      this.fintScheduleVersion = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintInstallmentSeq = null; } else {
      this.fintInstallmentSeq = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInstallmentDue = null; } else {
      this.fdtmInstallmentDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurStartingBalance = null; } else {
      this.fcurStartingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInstallment = null; } else {
      this.fcurInstallment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterest = null; } else {
      this.fcurInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenalty = null; } else {
      this.fcurPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEndingBalance = null; } else {
      this.fcurEndingBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAchDebitKey = null; } else {
      this.flngAchDebitKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64PaymentRequestKey = null; } else {
      this.fi64PaymentRequestKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessed = null; } else {
      this.fdtmProcessed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSatisfied = null; } else {
      this.fblnSatisfied = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSatisfied = null; } else {
      this.fdtmSatisfied = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPreviousSchedule = null; } else {
      this.fblnPreviousSchedule = Integer.valueOf(__cur_str);
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
    tblcollectpaymentplanschedule o = (tblcollectpaymentplanschedule) super.clone();
    o.fdtmInstallmentDue = (o.fdtmInstallmentDue != null) ? (java.sql.Timestamp) o.fdtmInstallmentDue.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmSatisfied = (o.fdtmSatisfied != null) ? (java.sql.Timestamp) o.fdtmSatisfied.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcollectpaymentplanschedule o) throws CloneNotSupportedException {
    o.fdtmInstallmentDue = (o.fdtmInstallmentDue != null) ? (java.sql.Timestamp) o.fdtmInstallmentDue.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmSatisfied = (o.fdtmSatisfied != null) ? (java.sql.Timestamp) o.fdtmSatisfied.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngPaymentPlanKey", this.flngPaymentPlanKey);
    __sqoop$field_map.put("fintScheduleVersion", this.fintScheduleVersion);
    __sqoop$field_map.put("fintInstallmentSeq", this.fintInstallmentSeq);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmInstallmentDue", this.fdtmInstallmentDue);
    __sqoop$field_map.put("fcurStartingBalance", this.fcurStartingBalance);
    __sqoop$field_map.put("fcurInstallment", this.fcurInstallment);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurPenalty", this.fcurPenalty);
    __sqoop$field_map.put("fcurEndingBalance", this.fcurEndingBalance);
    __sqoop$field_map.put("flngAchDebitKey", this.flngAchDebitKey);
    __sqoop$field_map.put("fi64PaymentRequestKey", this.fi64PaymentRequestKey);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
    __sqoop$field_map.put("fblnSatisfied", this.fblnSatisfied);
    __sqoop$field_map.put("fdtmSatisfied", this.fdtmSatisfied);
    __sqoop$field_map.put("fblnPreviousSchedule", this.fblnPreviousSchedule);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngPaymentPlanKey", this.flngPaymentPlanKey);
    __sqoop$field_map.put("fintScheduleVersion", this.fintScheduleVersion);
    __sqoop$field_map.put("fintInstallmentSeq", this.fintInstallmentSeq);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmInstallmentDue", this.fdtmInstallmentDue);
    __sqoop$field_map.put("fcurStartingBalance", this.fcurStartingBalance);
    __sqoop$field_map.put("fcurInstallment", this.fcurInstallment);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurPenalty", this.fcurPenalty);
    __sqoop$field_map.put("fcurEndingBalance", this.fcurEndingBalance);
    __sqoop$field_map.put("flngAchDebitKey", this.flngAchDebitKey);
    __sqoop$field_map.put("fi64PaymentRequestKey", this.fi64PaymentRequestKey);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
    __sqoop$field_map.put("fblnSatisfied", this.fblnSatisfied);
    __sqoop$field_map.put("fdtmSatisfied", this.fdtmSatisfied);
    __sqoop$field_map.put("fblnPreviousSchedule", this.fblnPreviousSchedule);
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
