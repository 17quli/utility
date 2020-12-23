// ORM class for table 'tblcollectpaymentplan'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:55:21 NZDT 2020
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

public class tblcollectpaymentplan extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngPaymentPlanKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngPaymentPlanKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngCollectKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngCollectKey = (Integer)value;
      }
    });
    setters.put("fstrPaymentPlanId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrPaymentPlanId = (String)value;
      }
    });
    setters.put("fintScheduleVersion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fintScheduleVersion = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngCustomerKey2 = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("flngIndicatorKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngIndicatorKey = (Integer)value;
      }
    });
    setters.put("fstrPaymentPlanType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrPaymentPlanType = (String)value;
      }
    });
    setters.put("fstrStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrStatus = (String)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrOwner = (String)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCreatedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrCreatedBy = (String)value;
      }
    });
    setters.put("fstrFrequency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrFrequency = (String)value;
      }
    });
    setters.put("fstrInstallType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrInstallType = (String)value;
      }
    });
    setters.put("fintInstallments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fintInstallments = (Integer)value;
      }
    });
    setters.put("fcurInstallmentAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fcurInstallmentAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmNextInstallmentDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fdtmNextInstallmentDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrBillMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrBillMethod = (String)value;
      }
    });
    setters.put("flngBankAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngBankAccountKey = (Integer)value;
      }
    });
    setters.put("fstrBankAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrBankAccountType = (String)value;
      }
    });
    setters.put("fstrTransitNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrTransitNumber = (String)value;
      }
    });
    setters.put("fstrAccountNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrAccountNumber = (String)value;
      }
    });
    setters.put("fcurPlanAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fcurPlanAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDownPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fcurDownPayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmDownPayDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fdtmDownPayDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngPenaltyTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.flngPenaltyTransKey = (Integer)value;
      }
    });
    setters.put("fcurPlanPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fcurPlanPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmNextEval", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fdtmNextEval = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fdtmApproved = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrChangeReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrChangeReason = (String)value;
      }
    });
    setters.put("fdtmChangeEvaluated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fdtmChangeEvaluated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectpaymentplan.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcollectpaymentplan() {
    init0();
  }
  private Integer flngPaymentPlanKey;
  public Integer get_flngPaymentPlanKey() {
    return flngPaymentPlanKey;
  }
  public void set_flngPaymentPlanKey(Integer flngPaymentPlanKey) {
    this.flngPaymentPlanKey = flngPaymentPlanKey;
  }
  public tblcollectpaymentplan with_flngPaymentPlanKey(Integer flngPaymentPlanKey) {
    this.flngPaymentPlanKey = flngPaymentPlanKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblcollectpaymentplan with_flngVer(Integer flngVer) {
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
  public tblcollectpaymentplan with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngCollectKey;
  public Integer get_flngCollectKey() {
    return flngCollectKey;
  }
  public void set_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
  }
  public tblcollectpaymentplan with_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
    return this;
  }
  private String fstrPaymentPlanId;
  public String get_fstrPaymentPlanId() {
    return fstrPaymentPlanId;
  }
  public void set_fstrPaymentPlanId(String fstrPaymentPlanId) {
    this.fstrPaymentPlanId = fstrPaymentPlanId;
  }
  public tblcollectpaymentplan with_fstrPaymentPlanId(String fstrPaymentPlanId) {
    this.fstrPaymentPlanId = fstrPaymentPlanId;
    return this;
  }
  private Integer fintScheduleVersion;
  public Integer get_fintScheduleVersion() {
    return fintScheduleVersion;
  }
  public void set_fintScheduleVersion(Integer fintScheduleVersion) {
    this.fintScheduleVersion = fintScheduleVersion;
  }
  public tblcollectpaymentplan with_fintScheduleVersion(Integer fintScheduleVersion) {
    this.fintScheduleVersion = fintScheduleVersion;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblcollectpaymentplan with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngCustomerKey2;
  public Integer get_flngCustomerKey2() {
    return flngCustomerKey2;
  }
  public void set_flngCustomerKey2(Integer flngCustomerKey2) {
    this.flngCustomerKey2 = flngCustomerKey2;
  }
  public tblcollectpaymentplan with_flngCustomerKey2(Integer flngCustomerKey2) {
    this.flngCustomerKey2 = flngCustomerKey2;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblcollectpaymentplan with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblcollectpaymentplan with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private Integer flngIndicatorKey;
  public Integer get_flngIndicatorKey() {
    return flngIndicatorKey;
  }
  public void set_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
  }
  public tblcollectpaymentplan with_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
    return this;
  }
  private String fstrPaymentPlanType;
  public String get_fstrPaymentPlanType() {
    return fstrPaymentPlanType;
  }
  public void set_fstrPaymentPlanType(String fstrPaymentPlanType) {
    this.fstrPaymentPlanType = fstrPaymentPlanType;
  }
  public tblcollectpaymentplan with_fstrPaymentPlanType(String fstrPaymentPlanType) {
    this.fstrPaymentPlanType = fstrPaymentPlanType;
    return this;
  }
  private String fstrStatus;
  public String get_fstrStatus() {
    return fstrStatus;
  }
  public void set_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
  }
  public tblcollectpaymentplan with_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
    return this;
  }
  private String fstrOwner;
  public String get_fstrOwner() {
    return fstrOwner;
  }
  public void set_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
  }
  public tblcollectpaymentplan with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblcollectpaymentplan with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private String fstrCreatedBy;
  public String get_fstrCreatedBy() {
    return fstrCreatedBy;
  }
  public void set_fstrCreatedBy(String fstrCreatedBy) {
    this.fstrCreatedBy = fstrCreatedBy;
  }
  public tblcollectpaymentplan with_fstrCreatedBy(String fstrCreatedBy) {
    this.fstrCreatedBy = fstrCreatedBy;
    return this;
  }
  private String fstrFrequency;
  public String get_fstrFrequency() {
    return fstrFrequency;
  }
  public void set_fstrFrequency(String fstrFrequency) {
    this.fstrFrequency = fstrFrequency;
  }
  public tblcollectpaymentplan with_fstrFrequency(String fstrFrequency) {
    this.fstrFrequency = fstrFrequency;
    return this;
  }
  private String fstrInstallType;
  public String get_fstrInstallType() {
    return fstrInstallType;
  }
  public void set_fstrInstallType(String fstrInstallType) {
    this.fstrInstallType = fstrInstallType;
  }
  public tblcollectpaymentplan with_fstrInstallType(String fstrInstallType) {
    this.fstrInstallType = fstrInstallType;
    return this;
  }
  private Integer fintInstallments;
  public Integer get_fintInstallments() {
    return fintInstallments;
  }
  public void set_fintInstallments(Integer fintInstallments) {
    this.fintInstallments = fintInstallments;
  }
  public tblcollectpaymentplan with_fintInstallments(Integer fintInstallments) {
    this.fintInstallments = fintInstallments;
    return this;
  }
  private java.math.BigDecimal fcurInstallmentAmount;
  public java.math.BigDecimal get_fcurInstallmentAmount() {
    return fcurInstallmentAmount;
  }
  public void set_fcurInstallmentAmount(java.math.BigDecimal fcurInstallmentAmount) {
    this.fcurInstallmentAmount = fcurInstallmentAmount;
  }
  public tblcollectpaymentplan with_fcurInstallmentAmount(java.math.BigDecimal fcurInstallmentAmount) {
    this.fcurInstallmentAmount = fcurInstallmentAmount;
    return this;
  }
  private java.sql.Timestamp fdtmNextInstallmentDue;
  public java.sql.Timestamp get_fdtmNextInstallmentDue() {
    return fdtmNextInstallmentDue;
  }
  public void set_fdtmNextInstallmentDue(java.sql.Timestamp fdtmNextInstallmentDue) {
    this.fdtmNextInstallmentDue = fdtmNextInstallmentDue;
  }
  public tblcollectpaymentplan with_fdtmNextInstallmentDue(java.sql.Timestamp fdtmNextInstallmentDue) {
    this.fdtmNextInstallmentDue = fdtmNextInstallmentDue;
    return this;
  }
  private String fstrBillMethod;
  public String get_fstrBillMethod() {
    return fstrBillMethod;
  }
  public void set_fstrBillMethod(String fstrBillMethod) {
    this.fstrBillMethod = fstrBillMethod;
  }
  public tblcollectpaymentplan with_fstrBillMethod(String fstrBillMethod) {
    this.fstrBillMethod = fstrBillMethod;
    return this;
  }
  private Integer flngBankAccountKey;
  public Integer get_flngBankAccountKey() {
    return flngBankAccountKey;
  }
  public void set_flngBankAccountKey(Integer flngBankAccountKey) {
    this.flngBankAccountKey = flngBankAccountKey;
  }
  public tblcollectpaymentplan with_flngBankAccountKey(Integer flngBankAccountKey) {
    this.flngBankAccountKey = flngBankAccountKey;
    return this;
  }
  private String fstrBankAccountType;
  public String get_fstrBankAccountType() {
    return fstrBankAccountType;
  }
  public void set_fstrBankAccountType(String fstrBankAccountType) {
    this.fstrBankAccountType = fstrBankAccountType;
  }
  public tblcollectpaymentplan with_fstrBankAccountType(String fstrBankAccountType) {
    this.fstrBankAccountType = fstrBankAccountType;
    return this;
  }
  private String fstrTransitNumber;
  public String get_fstrTransitNumber() {
    return fstrTransitNumber;
  }
  public void set_fstrTransitNumber(String fstrTransitNumber) {
    this.fstrTransitNumber = fstrTransitNumber;
  }
  public tblcollectpaymentplan with_fstrTransitNumber(String fstrTransitNumber) {
    this.fstrTransitNumber = fstrTransitNumber;
    return this;
  }
  private String fstrAccountNumber;
  public String get_fstrAccountNumber() {
    return fstrAccountNumber;
  }
  public void set_fstrAccountNumber(String fstrAccountNumber) {
    this.fstrAccountNumber = fstrAccountNumber;
  }
  public tblcollectpaymentplan with_fstrAccountNumber(String fstrAccountNumber) {
    this.fstrAccountNumber = fstrAccountNumber;
    return this;
  }
  private java.math.BigDecimal fcurPlanAmount;
  public java.math.BigDecimal get_fcurPlanAmount() {
    return fcurPlanAmount;
  }
  public void set_fcurPlanAmount(java.math.BigDecimal fcurPlanAmount) {
    this.fcurPlanAmount = fcurPlanAmount;
  }
  public tblcollectpaymentplan with_fcurPlanAmount(java.math.BigDecimal fcurPlanAmount) {
    this.fcurPlanAmount = fcurPlanAmount;
    return this;
  }
  private java.math.BigDecimal fcurDownPayment;
  public java.math.BigDecimal get_fcurDownPayment() {
    return fcurDownPayment;
  }
  public void set_fcurDownPayment(java.math.BigDecimal fcurDownPayment) {
    this.fcurDownPayment = fcurDownPayment;
  }
  public tblcollectpaymentplan with_fcurDownPayment(java.math.BigDecimal fcurDownPayment) {
    this.fcurDownPayment = fcurDownPayment;
    return this;
  }
  private java.sql.Timestamp fdtmDownPayDue;
  public java.sql.Timestamp get_fdtmDownPayDue() {
    return fdtmDownPayDue;
  }
  public void set_fdtmDownPayDue(java.sql.Timestamp fdtmDownPayDue) {
    this.fdtmDownPayDue = fdtmDownPayDue;
  }
  public tblcollectpaymentplan with_fdtmDownPayDue(java.sql.Timestamp fdtmDownPayDue) {
    this.fdtmDownPayDue = fdtmDownPayDue;
    return this;
  }
  private Integer flngPenaltyTransKey;
  public Integer get_flngPenaltyTransKey() {
    return flngPenaltyTransKey;
  }
  public void set_flngPenaltyTransKey(Integer flngPenaltyTransKey) {
    this.flngPenaltyTransKey = flngPenaltyTransKey;
  }
  public tblcollectpaymentplan with_flngPenaltyTransKey(Integer flngPenaltyTransKey) {
    this.flngPenaltyTransKey = flngPenaltyTransKey;
    return this;
  }
  private java.math.BigDecimal fcurPlanPenalty;
  public java.math.BigDecimal get_fcurPlanPenalty() {
    return fcurPlanPenalty;
  }
  public void set_fcurPlanPenalty(java.math.BigDecimal fcurPlanPenalty) {
    this.fcurPlanPenalty = fcurPlanPenalty;
  }
  public tblcollectpaymentplan with_fcurPlanPenalty(java.math.BigDecimal fcurPlanPenalty) {
    this.fcurPlanPenalty = fcurPlanPenalty;
    return this;
  }
  private java.sql.Timestamp fdtmNextEval;
  public java.sql.Timestamp get_fdtmNextEval() {
    return fdtmNextEval;
  }
  public void set_fdtmNextEval(java.sql.Timestamp fdtmNextEval) {
    this.fdtmNextEval = fdtmNextEval;
  }
  public tblcollectpaymentplan with_fdtmNextEval(java.sql.Timestamp fdtmNextEval) {
    this.fdtmNextEval = fdtmNextEval;
    return this;
  }
  private java.sql.Timestamp fdtmApproved;
  public java.sql.Timestamp get_fdtmApproved() {
    return fdtmApproved;
  }
  public void set_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
  }
  public tblcollectpaymentplan with_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
    return this;
  }
  private String fstrChangeReason;
  public String get_fstrChangeReason() {
    return fstrChangeReason;
  }
  public void set_fstrChangeReason(String fstrChangeReason) {
    this.fstrChangeReason = fstrChangeReason;
  }
  public tblcollectpaymentplan with_fstrChangeReason(String fstrChangeReason) {
    this.fstrChangeReason = fstrChangeReason;
    return this;
  }
  private java.sql.Timestamp fdtmChangeEvaluated;
  public java.sql.Timestamp get_fdtmChangeEvaluated() {
    return fdtmChangeEvaluated;
  }
  public void set_fdtmChangeEvaluated(java.sql.Timestamp fdtmChangeEvaluated) {
    this.fdtmChangeEvaluated = fdtmChangeEvaluated;
  }
  public tblcollectpaymentplan with_fdtmChangeEvaluated(java.sql.Timestamp fdtmChangeEvaluated) {
    this.fdtmChangeEvaluated = fdtmChangeEvaluated;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblcollectpaymentplan with_fblnActive(Integer fblnActive) {
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
  public tblcollectpaymentplan with_fstrWho(String fstrWho) {
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
  public tblcollectpaymentplan with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollectpaymentplan)) {
      return false;
    }
    tblcollectpaymentplan that = (tblcollectpaymentplan) o;
    boolean equal = true;
    equal = equal && (this.flngPaymentPlanKey == null ? that.flngPaymentPlanKey == null : this.flngPaymentPlanKey.equals(that.flngPaymentPlanKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.fstrPaymentPlanId == null ? that.fstrPaymentPlanId == null : this.fstrPaymentPlanId.equals(that.fstrPaymentPlanId));
    equal = equal && (this.fintScheduleVersion == null ? that.fintScheduleVersion == null : this.fintScheduleVersion.equals(that.fintScheduleVersion));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngCustomerKey2 == null ? that.flngCustomerKey2 == null : this.flngCustomerKey2.equals(that.flngCustomerKey2));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.fstrPaymentPlanType == null ? that.fstrPaymentPlanType == null : this.fstrPaymentPlanType.equals(that.fstrPaymentPlanType));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fstrFrequency == null ? that.fstrFrequency == null : this.fstrFrequency.equals(that.fstrFrequency));
    equal = equal && (this.fstrInstallType == null ? that.fstrInstallType == null : this.fstrInstallType.equals(that.fstrInstallType));
    equal = equal && (this.fintInstallments == null ? that.fintInstallments == null : this.fintInstallments.equals(that.fintInstallments));
    equal = equal && (this.fcurInstallmentAmount == null ? that.fcurInstallmentAmount == null : this.fcurInstallmentAmount.equals(that.fcurInstallmentAmount));
    equal = equal && (this.fdtmNextInstallmentDue == null ? that.fdtmNextInstallmentDue == null : this.fdtmNextInstallmentDue.equals(that.fdtmNextInstallmentDue));
    equal = equal && (this.fstrBillMethod == null ? that.fstrBillMethod == null : this.fstrBillMethod.equals(that.fstrBillMethod));
    equal = equal && (this.flngBankAccountKey == null ? that.flngBankAccountKey == null : this.flngBankAccountKey.equals(that.flngBankAccountKey));
    equal = equal && (this.fstrBankAccountType == null ? that.fstrBankAccountType == null : this.fstrBankAccountType.equals(that.fstrBankAccountType));
    equal = equal && (this.fstrTransitNumber == null ? that.fstrTransitNumber == null : this.fstrTransitNumber.equals(that.fstrTransitNumber));
    equal = equal && (this.fstrAccountNumber == null ? that.fstrAccountNumber == null : this.fstrAccountNumber.equals(that.fstrAccountNumber));
    equal = equal && (this.fcurPlanAmount == null ? that.fcurPlanAmount == null : this.fcurPlanAmount.equals(that.fcurPlanAmount));
    equal = equal && (this.fcurDownPayment == null ? that.fcurDownPayment == null : this.fcurDownPayment.equals(that.fcurDownPayment));
    equal = equal && (this.fdtmDownPayDue == null ? that.fdtmDownPayDue == null : this.fdtmDownPayDue.equals(that.fdtmDownPayDue));
    equal = equal && (this.flngPenaltyTransKey == null ? that.flngPenaltyTransKey == null : this.flngPenaltyTransKey.equals(that.flngPenaltyTransKey));
    equal = equal && (this.fcurPlanPenalty == null ? that.fcurPlanPenalty == null : this.fcurPlanPenalty.equals(that.fcurPlanPenalty));
    equal = equal && (this.fdtmNextEval == null ? that.fdtmNextEval == null : this.fdtmNextEval.equals(that.fdtmNextEval));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fstrChangeReason == null ? that.fstrChangeReason == null : this.fstrChangeReason.equals(that.fstrChangeReason));
    equal = equal && (this.fdtmChangeEvaluated == null ? that.fdtmChangeEvaluated == null : this.fdtmChangeEvaluated.equals(that.fdtmChangeEvaluated));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollectpaymentplan)) {
      return false;
    }
    tblcollectpaymentplan that = (tblcollectpaymentplan) o;
    boolean equal = true;
    equal = equal && (this.flngPaymentPlanKey == null ? that.flngPaymentPlanKey == null : this.flngPaymentPlanKey.equals(that.flngPaymentPlanKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.fstrPaymentPlanId == null ? that.fstrPaymentPlanId == null : this.fstrPaymentPlanId.equals(that.fstrPaymentPlanId));
    equal = equal && (this.fintScheduleVersion == null ? that.fintScheduleVersion == null : this.fintScheduleVersion.equals(that.fintScheduleVersion));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngCustomerKey2 == null ? that.flngCustomerKey2 == null : this.flngCustomerKey2.equals(that.flngCustomerKey2));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.fstrPaymentPlanType == null ? that.fstrPaymentPlanType == null : this.fstrPaymentPlanType.equals(that.fstrPaymentPlanType));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fstrFrequency == null ? that.fstrFrequency == null : this.fstrFrequency.equals(that.fstrFrequency));
    equal = equal && (this.fstrInstallType == null ? that.fstrInstallType == null : this.fstrInstallType.equals(that.fstrInstallType));
    equal = equal && (this.fintInstallments == null ? that.fintInstallments == null : this.fintInstallments.equals(that.fintInstallments));
    equal = equal && (this.fcurInstallmentAmount == null ? that.fcurInstallmentAmount == null : this.fcurInstallmentAmount.equals(that.fcurInstallmentAmount));
    equal = equal && (this.fdtmNextInstallmentDue == null ? that.fdtmNextInstallmentDue == null : this.fdtmNextInstallmentDue.equals(that.fdtmNextInstallmentDue));
    equal = equal && (this.fstrBillMethod == null ? that.fstrBillMethod == null : this.fstrBillMethod.equals(that.fstrBillMethod));
    equal = equal && (this.flngBankAccountKey == null ? that.flngBankAccountKey == null : this.flngBankAccountKey.equals(that.flngBankAccountKey));
    equal = equal && (this.fstrBankAccountType == null ? that.fstrBankAccountType == null : this.fstrBankAccountType.equals(that.fstrBankAccountType));
    equal = equal && (this.fstrTransitNumber == null ? that.fstrTransitNumber == null : this.fstrTransitNumber.equals(that.fstrTransitNumber));
    equal = equal && (this.fstrAccountNumber == null ? that.fstrAccountNumber == null : this.fstrAccountNumber.equals(that.fstrAccountNumber));
    equal = equal && (this.fcurPlanAmount == null ? that.fcurPlanAmount == null : this.fcurPlanAmount.equals(that.fcurPlanAmount));
    equal = equal && (this.fcurDownPayment == null ? that.fcurDownPayment == null : this.fcurDownPayment.equals(that.fcurDownPayment));
    equal = equal && (this.fdtmDownPayDue == null ? that.fdtmDownPayDue == null : this.fdtmDownPayDue.equals(that.fdtmDownPayDue));
    equal = equal && (this.flngPenaltyTransKey == null ? that.flngPenaltyTransKey == null : this.flngPenaltyTransKey.equals(that.flngPenaltyTransKey));
    equal = equal && (this.fcurPlanPenalty == null ? that.fcurPlanPenalty == null : this.fcurPlanPenalty.equals(that.fcurPlanPenalty));
    equal = equal && (this.fdtmNextEval == null ? that.fdtmNextEval == null : this.fdtmNextEval.equals(that.fdtmNextEval));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fstrChangeReason == null ? that.fstrChangeReason == null : this.fstrChangeReason.equals(that.fstrChangeReason));
    equal = equal && (this.fdtmChangeEvaluated == null ? that.fdtmChangeEvaluated == null : this.fdtmChangeEvaluated.equals(that.fdtmChangeEvaluated));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngPaymentPlanKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCollectKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrPaymentPlanId = JdbcWritableBridge.readString(5, __dbResults);
    this.fintScheduleVersion = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngCustomerKey2 = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrPaymentPlanType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrFrequency = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrInstallType = JdbcWritableBridge.readString(18, __dbResults);
    this.fintInstallments = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fcurInstallmentAmount = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fdtmNextInstallmentDue = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fstrBillMethod = JdbcWritableBridge.readString(22, __dbResults);
    this.flngBankAccountKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fstrBankAccountType = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrTransitNumber = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAccountNumber = JdbcWritableBridge.readString(26, __dbResults);
    this.fcurPlanAmount = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurDownPayment = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fdtmDownPayDue = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.flngPenaltyTransKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fcurPlanPenalty = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fdtmNextEval = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.fstrChangeReason = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmChangeEvaluated = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(37, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(38, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngPaymentPlanKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCollectKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrPaymentPlanId = JdbcWritableBridge.readString(5, __dbResults);
    this.fintScheduleVersion = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngCustomerKey2 = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrPaymentPlanType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrFrequency = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrInstallType = JdbcWritableBridge.readString(18, __dbResults);
    this.fintInstallments = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fcurInstallmentAmount = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fdtmNextInstallmentDue = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fstrBillMethod = JdbcWritableBridge.readString(22, __dbResults);
    this.flngBankAccountKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fstrBankAccountType = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrTransitNumber = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAccountNumber = JdbcWritableBridge.readString(26, __dbResults);
    this.fcurPlanAmount = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurDownPayment = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fdtmDownPayDue = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.flngPenaltyTransKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fcurPlanPenalty = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fdtmNextEval = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.fstrChangeReason = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmChangeEvaluated = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(37, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(38, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCollectKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentPlanId, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintScheduleVersion, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey2, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentPlanType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFrequency, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrInstallType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintInstallments, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInstallmentAmount, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextInstallmentDue, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBillMethod, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransitNumber, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountNumber, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPlanAmount, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDownPayment, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDownPayDue, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPenaltyTransKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPlanPenalty, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextEval, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeReason, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmChangeEvaluated, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 38 + __off, 93, __dbStmt);
    return 38;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngPaymentPlanKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCollectKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentPlanId, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintScheduleVersion, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey2, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentPlanType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFrequency, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrInstallType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintInstallments, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInstallmentAmount, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextInstallmentDue, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBillMethod, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransitNumber, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountNumber, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPlanAmount, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDownPayment, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDownPayDue, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPenaltyTransKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPlanPenalty, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextEval, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeReason, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmChangeEvaluated, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 38 + __off, 93, __dbStmt);
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
        this.flngCollectKey = null;
    } else {
    this.flngCollectKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentPlanId = null;
    } else {
    this.fstrPaymentPlanId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintScheduleVersion = null;
    } else {
    this.fintScheduleVersion = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey2 = null;
    } else {
    this.flngCustomerKey2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngIndicatorKey = null;
    } else {
    this.flngIndicatorKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentPlanType = null;
    } else {
    this.fstrPaymentPlanType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStatus = null;
    } else {
    this.fstrStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwner = null;
    } else {
    this.fstrOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreatedBy = null;
    } else {
    this.fstrCreatedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFrequency = null;
    } else {
    this.fstrFrequency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrInstallType = null;
    } else {
    this.fstrInstallType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintInstallments = null;
    } else {
    this.fintInstallments = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInstallmentAmount = null;
    } else {
    this.fcurInstallmentAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmNextInstallmentDue = null;
    } else {
    this.fdtmNextInstallmentDue = new Timestamp(__dataIn.readLong());
    this.fdtmNextInstallmentDue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBillMethod = null;
    } else {
    this.fstrBillMethod = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngBankAccountKey = null;
    } else {
    this.flngBankAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccountType = null;
    } else {
    this.fstrBankAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransitNumber = null;
    } else {
    this.fstrTransitNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountNumber = null;
    } else {
    this.fstrAccountNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPlanAmount = null;
    } else {
    this.fcurPlanAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDownPayment = null;
    } else {
    this.fcurDownPayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDownPayDue = null;
    } else {
    this.fdtmDownPayDue = new Timestamp(__dataIn.readLong());
    this.fdtmDownPayDue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngPenaltyTransKey = null;
    } else {
    this.flngPenaltyTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPlanPenalty = null;
    } else {
    this.fcurPlanPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmNextEval = null;
    } else {
    this.fdtmNextEval = new Timestamp(__dataIn.readLong());
    this.fdtmNextEval.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApproved = null;
    } else {
    this.fdtmApproved = new Timestamp(__dataIn.readLong());
    this.fdtmApproved.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrChangeReason = null;
    } else {
    this.fstrChangeReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmChangeEvaluated = null;
    } else {
    this.fdtmChangeEvaluated = new Timestamp(__dataIn.readLong());
    this.fdtmChangeEvaluated.setNanos(__dataIn.readInt());
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
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
    }
    if (null == this.fstrPaymentPlanId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentPlanId);
    }
    if (null == this.fintScheduleVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintScheduleVersion);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngCustomerKey2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey2);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.fstrPaymentPlanType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentPlanType);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrCreatedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedBy);
    }
    if (null == this.fstrFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFrequency);
    }
    if (null == this.fstrInstallType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInstallType);
    }
    if (null == this.fintInstallments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintInstallments);
    }
    if (null == this.fcurInstallmentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInstallmentAmount, __dataOut);
    }
    if (null == this.fdtmNextInstallmentDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextInstallmentDue.getTime());
    __dataOut.writeInt(this.fdtmNextInstallmentDue.getNanos());
    }
    if (null == this.fstrBillMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBillMethod);
    }
    if (null == this.flngBankAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountKey);
    }
    if (null == this.fstrBankAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountType);
    }
    if (null == this.fstrTransitNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransitNumber);
    }
    if (null == this.fstrAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountNumber);
    }
    if (null == this.fcurPlanAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPlanAmount, __dataOut);
    }
    if (null == this.fcurDownPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDownPayment, __dataOut);
    }
    if (null == this.fdtmDownPayDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDownPayDue.getTime());
    __dataOut.writeInt(this.fdtmDownPayDue.getNanos());
    }
    if (null == this.flngPenaltyTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPenaltyTransKey);
    }
    if (null == this.fcurPlanPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPlanPenalty, __dataOut);
    }
    if (null == this.fdtmNextEval) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextEval.getTime());
    __dataOut.writeInt(this.fdtmNextEval.getNanos());
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fstrChangeReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeReason);
    }
    if (null == this.fdtmChangeEvaluated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmChangeEvaluated.getTime());
    __dataOut.writeInt(this.fdtmChangeEvaluated.getNanos());
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
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
    }
    if (null == this.fstrPaymentPlanId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentPlanId);
    }
    if (null == this.fintScheduleVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintScheduleVersion);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngCustomerKey2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey2);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.fstrPaymentPlanType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentPlanType);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrCreatedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedBy);
    }
    if (null == this.fstrFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFrequency);
    }
    if (null == this.fstrInstallType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInstallType);
    }
    if (null == this.fintInstallments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintInstallments);
    }
    if (null == this.fcurInstallmentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInstallmentAmount, __dataOut);
    }
    if (null == this.fdtmNextInstallmentDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextInstallmentDue.getTime());
    __dataOut.writeInt(this.fdtmNextInstallmentDue.getNanos());
    }
    if (null == this.fstrBillMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBillMethod);
    }
    if (null == this.flngBankAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountKey);
    }
    if (null == this.fstrBankAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountType);
    }
    if (null == this.fstrTransitNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransitNumber);
    }
    if (null == this.fstrAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountNumber);
    }
    if (null == this.fcurPlanAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPlanAmount, __dataOut);
    }
    if (null == this.fcurDownPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDownPayment, __dataOut);
    }
    if (null == this.fdtmDownPayDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDownPayDue.getTime());
    __dataOut.writeInt(this.fdtmDownPayDue.getNanos());
    }
    if (null == this.flngPenaltyTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPenaltyTransKey);
    }
    if (null == this.fcurPlanPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPlanPenalty, __dataOut);
    }
    if (null == this.fdtmNextEval) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextEval.getTime());
    __dataOut.writeInt(this.fdtmNextEval.getNanos());
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fstrChangeReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeReason);
    }
    if (null == this.fdtmChangeEvaluated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmChangeEvaluated.getTime());
    __dataOut.writeInt(this.fdtmChangeEvaluated.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentPlanId==null?"\\N":fstrPaymentPlanId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintScheduleVersion==null?"\\N":"" + fintScheduleVersion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey2==null?"\\N":"" + flngCustomerKey2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentPlanType==null?"\\N":fstrPaymentPlanType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFrequency==null?"\\N":fstrFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInstallType==null?"\\N":fstrInstallType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintInstallments==null?"\\N":"" + fintInstallments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInstallmentAmount==null?"\\N":fcurInstallmentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextInstallmentDue==null?"\\N":"" + fdtmNextInstallmentDue, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBillMethod==null?"\\N":fstrBillMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountKey==null?"\\N":"" + flngBankAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountType==null?"\\N":fstrBankAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransitNumber==null?"\\N":fstrTransitNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountNumber==null?"\\N":fstrAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPlanAmount==null?"\\N":fcurPlanAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDownPayment==null?"\\N":fcurDownPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDownPayDue==null?"\\N":"" + fdtmDownPayDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPenaltyTransKey==null?"\\N":"" + flngPenaltyTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPlanPenalty==null?"\\N":fcurPlanPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextEval==null?"\\N":"" + fdtmNextEval, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeReason==null?"\\N":fstrChangeReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmChangeEvaluated==null?"\\N":"" + fdtmChangeEvaluated, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentPlanId==null?"\\N":fstrPaymentPlanId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintScheduleVersion==null?"\\N":"" + fintScheduleVersion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey2==null?"\\N":"" + flngCustomerKey2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentPlanType==null?"\\N":fstrPaymentPlanType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFrequency==null?"\\N":fstrFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInstallType==null?"\\N":fstrInstallType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintInstallments==null?"\\N":"" + fintInstallments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInstallmentAmount==null?"\\N":fcurInstallmentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextInstallmentDue==null?"\\N":"" + fdtmNextInstallmentDue, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBillMethod==null?"\\N":fstrBillMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountKey==null?"\\N":"" + flngBankAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountType==null?"\\N":fstrBankAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransitNumber==null?"\\N":fstrTransitNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountNumber==null?"\\N":fstrAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPlanAmount==null?"\\N":fcurPlanAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDownPayment==null?"\\N":fcurDownPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDownPayDue==null?"\\N":"" + fdtmDownPayDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPenaltyTransKey==null?"\\N":"" + flngPenaltyTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPlanPenalty==null?"\\N":fcurPlanPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextEval==null?"\\N":"" + fdtmNextEval, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeReason==null?"\\N":fstrChangeReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmChangeEvaluated==null?"\\N":"" + fdtmChangeEvaluated, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentPlanId = null; } else {
      this.fstrPaymentPlanId = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey2 = null; } else {
      this.flngCustomerKey2 = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrPaymentPlanType = null; } else {
      this.fstrPaymentPlanType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStatus = null; } else {
      this.fstrStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCreatedBy = null; } else {
      this.fstrCreatedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFrequency = null; } else {
      this.fstrFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInstallType = null; } else {
      this.fstrInstallType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintInstallments = null; } else {
      this.fintInstallments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInstallmentAmount = null; } else {
      this.fcurInstallmentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextInstallmentDue = null; } else {
      this.fdtmNextInstallmentDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBillMethod = null; } else {
      this.fstrBillMethod = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrBankAccountType = null; } else {
      this.fstrBankAccountType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrAccountNumber = null; } else {
      this.fstrAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPlanAmount = null; } else {
      this.fcurPlanAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDownPayment = null; } else {
      this.fcurDownPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDownPayDue = null; } else {
      this.fdtmDownPayDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPenaltyTransKey = null; } else {
      this.flngPenaltyTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPlanPenalty = null; } else {
      this.fcurPlanPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextEval = null; } else {
      this.fdtmNextEval = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeReason = null; } else {
      this.fstrChangeReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmChangeEvaluated = null; } else {
      this.fdtmChangeEvaluated = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentPlanId = null; } else {
      this.fstrPaymentPlanId = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey2 = null; } else {
      this.flngCustomerKey2 = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrPaymentPlanType = null; } else {
      this.fstrPaymentPlanType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStatus = null; } else {
      this.fstrStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCreatedBy = null; } else {
      this.fstrCreatedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFrequency = null; } else {
      this.fstrFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInstallType = null; } else {
      this.fstrInstallType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintInstallments = null; } else {
      this.fintInstallments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInstallmentAmount = null; } else {
      this.fcurInstallmentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextInstallmentDue = null; } else {
      this.fdtmNextInstallmentDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBillMethod = null; } else {
      this.fstrBillMethod = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrBankAccountType = null; } else {
      this.fstrBankAccountType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrAccountNumber = null; } else {
      this.fstrAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPlanAmount = null; } else {
      this.fcurPlanAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDownPayment = null; } else {
      this.fcurDownPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDownPayDue = null; } else {
      this.fdtmDownPayDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPenaltyTransKey = null; } else {
      this.flngPenaltyTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPlanPenalty = null; } else {
      this.fcurPlanPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextEval = null; } else {
      this.fdtmNextEval = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeReason = null; } else {
      this.fstrChangeReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmChangeEvaluated = null; } else {
      this.fdtmChangeEvaluated = java.sql.Timestamp.valueOf(__cur_str);
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
    tblcollectpaymentplan o = (tblcollectpaymentplan) super.clone();
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmNextInstallmentDue = (o.fdtmNextInstallmentDue != null) ? (java.sql.Timestamp) o.fdtmNextInstallmentDue.clone() : null;
    o.fdtmDownPayDue = (o.fdtmDownPayDue != null) ? (java.sql.Timestamp) o.fdtmDownPayDue.clone() : null;
    o.fdtmNextEval = (o.fdtmNextEval != null) ? (java.sql.Timestamp) o.fdtmNextEval.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmChangeEvaluated = (o.fdtmChangeEvaluated != null) ? (java.sql.Timestamp) o.fdtmChangeEvaluated.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcollectpaymentplan o) throws CloneNotSupportedException {
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmNextInstallmentDue = (o.fdtmNextInstallmentDue != null) ? (java.sql.Timestamp) o.fdtmNextInstallmentDue.clone() : null;
    o.fdtmDownPayDue = (o.fdtmDownPayDue != null) ? (java.sql.Timestamp) o.fdtmDownPayDue.clone() : null;
    o.fdtmNextEval = (o.fdtmNextEval != null) ? (java.sql.Timestamp) o.fdtmNextEval.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmChangeEvaluated = (o.fdtmChangeEvaluated != null) ? (java.sql.Timestamp) o.fdtmChangeEvaluated.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngPaymentPlanKey", this.flngPaymentPlanKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("fstrPaymentPlanId", this.fstrPaymentPlanId);
    __sqoop$field_map.put("fintScheduleVersion", this.fintScheduleVersion);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngCustomerKey2", this.flngCustomerKey2);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("fstrPaymentPlanType", this.fstrPaymentPlanType);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fstrFrequency", this.fstrFrequency);
    __sqoop$field_map.put("fstrInstallType", this.fstrInstallType);
    __sqoop$field_map.put("fintInstallments", this.fintInstallments);
    __sqoop$field_map.put("fcurInstallmentAmount", this.fcurInstallmentAmount);
    __sqoop$field_map.put("fdtmNextInstallmentDue", this.fdtmNextInstallmentDue);
    __sqoop$field_map.put("fstrBillMethod", this.fstrBillMethod);
    __sqoop$field_map.put("flngBankAccountKey", this.flngBankAccountKey);
    __sqoop$field_map.put("fstrBankAccountType", this.fstrBankAccountType);
    __sqoop$field_map.put("fstrTransitNumber", this.fstrTransitNumber);
    __sqoop$field_map.put("fstrAccountNumber", this.fstrAccountNumber);
    __sqoop$field_map.put("fcurPlanAmount", this.fcurPlanAmount);
    __sqoop$field_map.put("fcurDownPayment", this.fcurDownPayment);
    __sqoop$field_map.put("fdtmDownPayDue", this.fdtmDownPayDue);
    __sqoop$field_map.put("flngPenaltyTransKey", this.flngPenaltyTransKey);
    __sqoop$field_map.put("fcurPlanPenalty", this.fcurPlanPenalty);
    __sqoop$field_map.put("fdtmNextEval", this.fdtmNextEval);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fstrChangeReason", this.fstrChangeReason);
    __sqoop$field_map.put("fdtmChangeEvaluated", this.fdtmChangeEvaluated);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngPaymentPlanKey", this.flngPaymentPlanKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("fstrPaymentPlanId", this.fstrPaymentPlanId);
    __sqoop$field_map.put("fintScheduleVersion", this.fintScheduleVersion);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngCustomerKey2", this.flngCustomerKey2);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("fstrPaymentPlanType", this.fstrPaymentPlanType);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fstrFrequency", this.fstrFrequency);
    __sqoop$field_map.put("fstrInstallType", this.fstrInstallType);
    __sqoop$field_map.put("fintInstallments", this.fintInstallments);
    __sqoop$field_map.put("fcurInstallmentAmount", this.fcurInstallmentAmount);
    __sqoop$field_map.put("fdtmNextInstallmentDue", this.fdtmNextInstallmentDue);
    __sqoop$field_map.put("fstrBillMethod", this.fstrBillMethod);
    __sqoop$field_map.put("flngBankAccountKey", this.flngBankAccountKey);
    __sqoop$field_map.put("fstrBankAccountType", this.fstrBankAccountType);
    __sqoop$field_map.put("fstrTransitNumber", this.fstrTransitNumber);
    __sqoop$field_map.put("fstrAccountNumber", this.fstrAccountNumber);
    __sqoop$field_map.put("fcurPlanAmount", this.fcurPlanAmount);
    __sqoop$field_map.put("fcurDownPayment", this.fcurDownPayment);
    __sqoop$field_map.put("fdtmDownPayDue", this.fdtmDownPayDue);
    __sqoop$field_map.put("flngPenaltyTransKey", this.flngPenaltyTransKey);
    __sqoop$field_map.put("fcurPlanPenalty", this.fcurPlanPenalty);
    __sqoop$field_map.put("fdtmNextEval", this.fdtmNextEval);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fstrChangeReason", this.fstrChangeReason);
    __sqoop$field_map.put("fdtmChangeEvaluated", this.fdtmChangeEvaluated);
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
