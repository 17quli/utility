// ORM class for table 'tblnz_rtnconversion'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:14:21 NZDT 2020
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

public class tblnz_rtnconversion extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnRules", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fblnRules = (Integer)value;
      }
    });
    setters.put("fblnReturnFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fblnReturnFiled = (Integer)value;
      }
    });
    setters.put("fblnDueDateIssues", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fblnDueDateIssues = (Integer)value;
      }
    });
    setters.put("fcurCnvTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fcurCnvTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLateFilePenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fcurLateFilePenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLateFilePenaltyRemission", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fcurLateFilePenaltyRemission = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLatePaymentPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fcurLatePaymentPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLatePayPenaltyRemission", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fcurLatePayPenaltyRemission = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fcurInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestRemission", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fcurInterestRemission = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmInterestEffective", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fdtmInterestEffective = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fcurAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmLegacyPNIDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fdtmLegacyPNIDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreditInterestThruDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fdtmCreditInterestThruDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLastStatementDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fdtmLastStatementDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAccountReviewType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fstrAccountReviewType = (String)value;
      }
    });
    setters.put("fstrReturnCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fstrReturnCategory = (String)value;
      }
    });
    setters.put("fintReturnVersion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fintReturnVersion = (Integer)value;
      }
    });
    setters.put("fblnAudit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fblnAudit = (Integer)value;
      }
    });
    setters.put("flngCnvSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.flngCnvSequence = (Integer)value;
      }
    });
    setters.put("fblnOriginalConversion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fblnOriginalConversion = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnconversion.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnconversion() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnconversion with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnRules;
  public Integer get_fblnRules() {
    return fblnRules;
  }
  public void set_fblnRules(Integer fblnRules) {
    this.fblnRules = fblnRules;
  }
  public tblnz_rtnconversion with_fblnRules(Integer fblnRules) {
    this.fblnRules = fblnRules;
    return this;
  }
  private Integer fblnReturnFiled;
  public Integer get_fblnReturnFiled() {
    return fblnReturnFiled;
  }
  public void set_fblnReturnFiled(Integer fblnReturnFiled) {
    this.fblnReturnFiled = fblnReturnFiled;
  }
  public tblnz_rtnconversion with_fblnReturnFiled(Integer fblnReturnFiled) {
    this.fblnReturnFiled = fblnReturnFiled;
    return this;
  }
  private Integer fblnDueDateIssues;
  public Integer get_fblnDueDateIssues() {
    return fblnDueDateIssues;
  }
  public void set_fblnDueDateIssues(Integer fblnDueDateIssues) {
    this.fblnDueDateIssues = fblnDueDateIssues;
  }
  public tblnz_rtnconversion with_fblnDueDateIssues(Integer fblnDueDateIssues) {
    this.fblnDueDateIssues = fblnDueDateIssues;
    return this;
  }
  private java.math.BigDecimal fcurCnvTax;
  public java.math.BigDecimal get_fcurCnvTax() {
    return fcurCnvTax;
  }
  public void set_fcurCnvTax(java.math.BigDecimal fcurCnvTax) {
    this.fcurCnvTax = fcurCnvTax;
  }
  public tblnz_rtnconversion with_fcurCnvTax(java.math.BigDecimal fcurCnvTax) {
    this.fcurCnvTax = fcurCnvTax;
    return this;
  }
  private java.math.BigDecimal fcurLateFilePenalty;
  public java.math.BigDecimal get_fcurLateFilePenalty() {
    return fcurLateFilePenalty;
  }
  public void set_fcurLateFilePenalty(java.math.BigDecimal fcurLateFilePenalty) {
    this.fcurLateFilePenalty = fcurLateFilePenalty;
  }
  public tblnz_rtnconversion with_fcurLateFilePenalty(java.math.BigDecimal fcurLateFilePenalty) {
    this.fcurLateFilePenalty = fcurLateFilePenalty;
    return this;
  }
  private java.math.BigDecimal fcurLateFilePenaltyRemission;
  public java.math.BigDecimal get_fcurLateFilePenaltyRemission() {
    return fcurLateFilePenaltyRemission;
  }
  public void set_fcurLateFilePenaltyRemission(java.math.BigDecimal fcurLateFilePenaltyRemission) {
    this.fcurLateFilePenaltyRemission = fcurLateFilePenaltyRemission;
  }
  public tblnz_rtnconversion with_fcurLateFilePenaltyRemission(java.math.BigDecimal fcurLateFilePenaltyRemission) {
    this.fcurLateFilePenaltyRemission = fcurLateFilePenaltyRemission;
    return this;
  }
  private java.math.BigDecimal fcurLatePaymentPenalty;
  public java.math.BigDecimal get_fcurLatePaymentPenalty() {
    return fcurLatePaymentPenalty;
  }
  public void set_fcurLatePaymentPenalty(java.math.BigDecimal fcurLatePaymentPenalty) {
    this.fcurLatePaymentPenalty = fcurLatePaymentPenalty;
  }
  public tblnz_rtnconversion with_fcurLatePaymentPenalty(java.math.BigDecimal fcurLatePaymentPenalty) {
    this.fcurLatePaymentPenalty = fcurLatePaymentPenalty;
    return this;
  }
  private java.math.BigDecimal fcurLatePayPenaltyRemission;
  public java.math.BigDecimal get_fcurLatePayPenaltyRemission() {
    return fcurLatePayPenaltyRemission;
  }
  public void set_fcurLatePayPenaltyRemission(java.math.BigDecimal fcurLatePayPenaltyRemission) {
    this.fcurLatePayPenaltyRemission = fcurLatePayPenaltyRemission;
  }
  public tblnz_rtnconversion with_fcurLatePayPenaltyRemission(java.math.BigDecimal fcurLatePayPenaltyRemission) {
    this.fcurLatePayPenaltyRemission = fcurLatePayPenaltyRemission;
    return this;
  }
  private java.math.BigDecimal fcurInterest;
  public java.math.BigDecimal get_fcurInterest() {
    return fcurInterest;
  }
  public void set_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
  }
  public tblnz_rtnconversion with_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
    return this;
  }
  private java.math.BigDecimal fcurInterestRemission;
  public java.math.BigDecimal get_fcurInterestRemission() {
    return fcurInterestRemission;
  }
  public void set_fcurInterestRemission(java.math.BigDecimal fcurInterestRemission) {
    this.fcurInterestRemission = fcurInterestRemission;
  }
  public tblnz_rtnconversion with_fcurInterestRemission(java.math.BigDecimal fcurInterestRemission) {
    this.fcurInterestRemission = fcurInterestRemission;
    return this;
  }
  private java.sql.Timestamp fdtmInterestEffective;
  public java.sql.Timestamp get_fdtmInterestEffective() {
    return fdtmInterestEffective;
  }
  public void set_fdtmInterestEffective(java.sql.Timestamp fdtmInterestEffective) {
    this.fdtmInterestEffective = fdtmInterestEffective;
  }
  public tblnz_rtnconversion with_fdtmInterestEffective(java.sql.Timestamp fdtmInterestEffective) {
    this.fdtmInterestEffective = fdtmInterestEffective;
    return this;
  }
  private java.math.BigDecimal fcurAdjustment;
  public java.math.BigDecimal get_fcurAdjustment() {
    return fcurAdjustment;
  }
  public void set_fcurAdjustment(java.math.BigDecimal fcurAdjustment) {
    this.fcurAdjustment = fcurAdjustment;
  }
  public tblnz_rtnconversion with_fcurAdjustment(java.math.BigDecimal fcurAdjustment) {
    this.fcurAdjustment = fcurAdjustment;
    return this;
  }
  private java.sql.Timestamp fdtmLegacyPNIDate;
  public java.sql.Timestamp get_fdtmLegacyPNIDate() {
    return fdtmLegacyPNIDate;
  }
  public void set_fdtmLegacyPNIDate(java.sql.Timestamp fdtmLegacyPNIDate) {
    this.fdtmLegacyPNIDate = fdtmLegacyPNIDate;
  }
  public tblnz_rtnconversion with_fdtmLegacyPNIDate(java.sql.Timestamp fdtmLegacyPNIDate) {
    this.fdtmLegacyPNIDate = fdtmLegacyPNIDate;
    return this;
  }
  private java.sql.Timestamp fdtmCreditInterestThruDate;
  public java.sql.Timestamp get_fdtmCreditInterestThruDate() {
    return fdtmCreditInterestThruDate;
  }
  public void set_fdtmCreditInterestThruDate(java.sql.Timestamp fdtmCreditInterestThruDate) {
    this.fdtmCreditInterestThruDate = fdtmCreditInterestThruDate;
  }
  public tblnz_rtnconversion with_fdtmCreditInterestThruDate(java.sql.Timestamp fdtmCreditInterestThruDate) {
    this.fdtmCreditInterestThruDate = fdtmCreditInterestThruDate;
    return this;
  }
  private java.sql.Timestamp fdtmLastStatementDate;
  public java.sql.Timestamp get_fdtmLastStatementDate() {
    return fdtmLastStatementDate;
  }
  public void set_fdtmLastStatementDate(java.sql.Timestamp fdtmLastStatementDate) {
    this.fdtmLastStatementDate = fdtmLastStatementDate;
  }
  public tblnz_rtnconversion with_fdtmLastStatementDate(java.sql.Timestamp fdtmLastStatementDate) {
    this.fdtmLastStatementDate = fdtmLastStatementDate;
    return this;
  }
  private String fstrAccountReviewType;
  public String get_fstrAccountReviewType() {
    return fstrAccountReviewType;
  }
  public void set_fstrAccountReviewType(String fstrAccountReviewType) {
    this.fstrAccountReviewType = fstrAccountReviewType;
  }
  public tblnz_rtnconversion with_fstrAccountReviewType(String fstrAccountReviewType) {
    this.fstrAccountReviewType = fstrAccountReviewType;
    return this;
  }
  private String fstrReturnCategory;
  public String get_fstrReturnCategory() {
    return fstrReturnCategory;
  }
  public void set_fstrReturnCategory(String fstrReturnCategory) {
    this.fstrReturnCategory = fstrReturnCategory;
  }
  public tblnz_rtnconversion with_fstrReturnCategory(String fstrReturnCategory) {
    this.fstrReturnCategory = fstrReturnCategory;
    return this;
  }
  private Integer fintReturnVersion;
  public Integer get_fintReturnVersion() {
    return fintReturnVersion;
  }
  public void set_fintReturnVersion(Integer fintReturnVersion) {
    this.fintReturnVersion = fintReturnVersion;
  }
  public tblnz_rtnconversion with_fintReturnVersion(Integer fintReturnVersion) {
    this.fintReturnVersion = fintReturnVersion;
    return this;
  }
  private Integer fblnAudit;
  public Integer get_fblnAudit() {
    return fblnAudit;
  }
  public void set_fblnAudit(Integer fblnAudit) {
    this.fblnAudit = fblnAudit;
  }
  public tblnz_rtnconversion with_fblnAudit(Integer fblnAudit) {
    this.fblnAudit = fblnAudit;
    return this;
  }
  private Integer flngCnvSequence;
  public Integer get_flngCnvSequence() {
    return flngCnvSequence;
  }
  public void set_flngCnvSequence(Integer flngCnvSequence) {
    this.flngCnvSequence = flngCnvSequence;
  }
  public tblnz_rtnconversion with_flngCnvSequence(Integer flngCnvSequence) {
    this.flngCnvSequence = flngCnvSequence;
    return this;
  }
  private Integer fblnOriginalConversion;
  public Integer get_fblnOriginalConversion() {
    return fblnOriginalConversion;
  }
  public void set_fblnOriginalConversion(Integer fblnOriginalConversion) {
    this.fblnOriginalConversion = fblnOriginalConversion;
  }
  public tblnz_rtnconversion with_fblnOriginalConversion(Integer fblnOriginalConversion) {
    this.fblnOriginalConversion = fblnOriginalConversion;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnconversion with_fstrWho(String fstrWho) {
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
  public tblnz_rtnconversion with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnconversion)) {
      return false;
    }
    tblnz_rtnconversion that = (tblnz_rtnconversion) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnRules == null ? that.fblnRules == null : this.fblnRules.equals(that.fblnRules));
    equal = equal && (this.fblnReturnFiled == null ? that.fblnReturnFiled == null : this.fblnReturnFiled.equals(that.fblnReturnFiled));
    equal = equal && (this.fblnDueDateIssues == null ? that.fblnDueDateIssues == null : this.fblnDueDateIssues.equals(that.fblnDueDateIssues));
    equal = equal && (this.fcurCnvTax == null ? that.fcurCnvTax == null : this.fcurCnvTax.equals(that.fcurCnvTax));
    equal = equal && (this.fcurLateFilePenalty == null ? that.fcurLateFilePenalty == null : this.fcurLateFilePenalty.equals(that.fcurLateFilePenalty));
    equal = equal && (this.fcurLateFilePenaltyRemission == null ? that.fcurLateFilePenaltyRemission == null : this.fcurLateFilePenaltyRemission.equals(that.fcurLateFilePenaltyRemission));
    equal = equal && (this.fcurLatePaymentPenalty == null ? that.fcurLatePaymentPenalty == null : this.fcurLatePaymentPenalty.equals(that.fcurLatePaymentPenalty));
    equal = equal && (this.fcurLatePayPenaltyRemission == null ? that.fcurLatePayPenaltyRemission == null : this.fcurLatePayPenaltyRemission.equals(that.fcurLatePayPenaltyRemission));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurInterestRemission == null ? that.fcurInterestRemission == null : this.fcurInterestRemission.equals(that.fcurInterestRemission));
    equal = equal && (this.fdtmInterestEffective == null ? that.fdtmInterestEffective == null : this.fdtmInterestEffective.equals(that.fdtmInterestEffective));
    equal = equal && (this.fcurAdjustment == null ? that.fcurAdjustment == null : this.fcurAdjustment.equals(that.fcurAdjustment));
    equal = equal && (this.fdtmLegacyPNIDate == null ? that.fdtmLegacyPNIDate == null : this.fdtmLegacyPNIDate.equals(that.fdtmLegacyPNIDate));
    equal = equal && (this.fdtmCreditInterestThruDate == null ? that.fdtmCreditInterestThruDate == null : this.fdtmCreditInterestThruDate.equals(that.fdtmCreditInterestThruDate));
    equal = equal && (this.fdtmLastStatementDate == null ? that.fdtmLastStatementDate == null : this.fdtmLastStatementDate.equals(that.fdtmLastStatementDate));
    equal = equal && (this.fstrAccountReviewType == null ? that.fstrAccountReviewType == null : this.fstrAccountReviewType.equals(that.fstrAccountReviewType));
    equal = equal && (this.fstrReturnCategory == null ? that.fstrReturnCategory == null : this.fstrReturnCategory.equals(that.fstrReturnCategory));
    equal = equal && (this.fintReturnVersion == null ? that.fintReturnVersion == null : this.fintReturnVersion.equals(that.fintReturnVersion));
    equal = equal && (this.fblnAudit == null ? that.fblnAudit == null : this.fblnAudit.equals(that.fblnAudit));
    equal = equal && (this.flngCnvSequence == null ? that.flngCnvSequence == null : this.flngCnvSequence.equals(that.flngCnvSequence));
    equal = equal && (this.fblnOriginalConversion == null ? that.fblnOriginalConversion == null : this.fblnOriginalConversion.equals(that.fblnOriginalConversion));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnconversion)) {
      return false;
    }
    tblnz_rtnconversion that = (tblnz_rtnconversion) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnRules == null ? that.fblnRules == null : this.fblnRules.equals(that.fblnRules));
    equal = equal && (this.fblnReturnFiled == null ? that.fblnReturnFiled == null : this.fblnReturnFiled.equals(that.fblnReturnFiled));
    equal = equal && (this.fblnDueDateIssues == null ? that.fblnDueDateIssues == null : this.fblnDueDateIssues.equals(that.fblnDueDateIssues));
    equal = equal && (this.fcurCnvTax == null ? that.fcurCnvTax == null : this.fcurCnvTax.equals(that.fcurCnvTax));
    equal = equal && (this.fcurLateFilePenalty == null ? that.fcurLateFilePenalty == null : this.fcurLateFilePenalty.equals(that.fcurLateFilePenalty));
    equal = equal && (this.fcurLateFilePenaltyRemission == null ? that.fcurLateFilePenaltyRemission == null : this.fcurLateFilePenaltyRemission.equals(that.fcurLateFilePenaltyRemission));
    equal = equal && (this.fcurLatePaymentPenalty == null ? that.fcurLatePaymentPenalty == null : this.fcurLatePaymentPenalty.equals(that.fcurLatePaymentPenalty));
    equal = equal && (this.fcurLatePayPenaltyRemission == null ? that.fcurLatePayPenaltyRemission == null : this.fcurLatePayPenaltyRemission.equals(that.fcurLatePayPenaltyRemission));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurInterestRemission == null ? that.fcurInterestRemission == null : this.fcurInterestRemission.equals(that.fcurInterestRemission));
    equal = equal && (this.fdtmInterestEffective == null ? that.fdtmInterestEffective == null : this.fdtmInterestEffective.equals(that.fdtmInterestEffective));
    equal = equal && (this.fcurAdjustment == null ? that.fcurAdjustment == null : this.fcurAdjustment.equals(that.fcurAdjustment));
    equal = equal && (this.fdtmLegacyPNIDate == null ? that.fdtmLegacyPNIDate == null : this.fdtmLegacyPNIDate.equals(that.fdtmLegacyPNIDate));
    equal = equal && (this.fdtmCreditInterestThruDate == null ? that.fdtmCreditInterestThruDate == null : this.fdtmCreditInterestThruDate.equals(that.fdtmCreditInterestThruDate));
    equal = equal && (this.fdtmLastStatementDate == null ? that.fdtmLastStatementDate == null : this.fdtmLastStatementDate.equals(that.fdtmLastStatementDate));
    equal = equal && (this.fstrAccountReviewType == null ? that.fstrAccountReviewType == null : this.fstrAccountReviewType.equals(that.fstrAccountReviewType));
    equal = equal && (this.fstrReturnCategory == null ? that.fstrReturnCategory == null : this.fstrReturnCategory.equals(that.fstrReturnCategory));
    equal = equal && (this.fintReturnVersion == null ? that.fintReturnVersion == null : this.fintReturnVersion.equals(that.fintReturnVersion));
    equal = equal && (this.fblnAudit == null ? that.fblnAudit == null : this.fblnAudit.equals(that.fblnAudit));
    equal = equal && (this.flngCnvSequence == null ? that.flngCnvSequence == null : this.flngCnvSequence.equals(that.flngCnvSequence));
    equal = equal && (this.fblnOriginalConversion == null ? that.fblnOriginalConversion == null : this.fblnOriginalConversion.equals(that.fblnOriginalConversion));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnRules = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnReturnFiled = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnDueDateIssues = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurCnvTax = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurLateFilePenalty = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurLateFilePenaltyRemission = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurLatePaymentPenalty = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurLatePayPenaltyRemission = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurInterestRemission = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fdtmInterestEffective = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurAdjustment = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fdtmLegacyPNIDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmCreditInterestThruDate = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmLastStatementDate = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrAccountReviewType = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrReturnCategory = JdbcWritableBridge.readString(18, __dbResults);
    this.fintReturnVersion = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnAudit = JdbcWritableBridge.readInteger(20, __dbResults);
    this.flngCnvSequence = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnOriginalConversion = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(23, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(24, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnRules = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnReturnFiled = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnDueDateIssues = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurCnvTax = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurLateFilePenalty = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurLateFilePenaltyRemission = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurLatePaymentPenalty = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurLatePayPenaltyRemission = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurInterestRemission = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fdtmInterestEffective = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurAdjustment = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fdtmLegacyPNIDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmCreditInterestThruDate = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmLastStatementDate = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrAccountReviewType = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrReturnCategory = JdbcWritableBridge.readString(18, __dbResults);
    this.fintReturnVersion = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnAudit = JdbcWritableBridge.readInteger(20, __dbResults);
    this.flngCnvSequence = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnOriginalConversion = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(23, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(24, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnRules, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReturnFiled, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDueDateIssues, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvTax, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLateFilePenalty, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLateFilePenaltyRemission, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePaymentPenalty, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePayPenaltyRemission, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestRemission, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInterestEffective, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustment, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLegacyPNIDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreditInterestThruDate, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastStatementDate, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountReviewType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReturnCategory, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintReturnVersion, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAudit, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCnvSequence, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOriginalConversion, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 24 + __off, 93, __dbStmt);
    return 24;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRules, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReturnFiled, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDueDateIssues, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvTax, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLateFilePenalty, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLateFilePenaltyRemission, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePaymentPenalty, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePayPenaltyRemission, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestRemission, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInterestEffective, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdjustment, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLegacyPNIDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreditInterestThruDate, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastStatementDate, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountReviewType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReturnCategory, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintReturnVersion, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAudit, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCnvSequence, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOriginalConversion, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 24 + __off, 93, __dbStmt);
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
        this.fblnRules = null;
    } else {
    this.fblnRules = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReturnFiled = null;
    } else {
    this.fblnReturnFiled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDueDateIssues = null;
    } else {
    this.fblnDueDateIssues = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCnvTax = null;
    } else {
    this.fcurCnvTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLateFilePenalty = null;
    } else {
    this.fcurLateFilePenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLateFilePenaltyRemission = null;
    } else {
    this.fcurLateFilePenaltyRemission = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLatePaymentPenalty = null;
    } else {
    this.fcurLatePaymentPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLatePayPenaltyRemission = null;
    } else {
    this.fcurLatePayPenaltyRemission = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterest = null;
    } else {
    this.fcurInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestRemission = null;
    } else {
    this.fcurInterestRemission = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmInterestEffective = null;
    } else {
    this.fdtmInterestEffective = new Timestamp(__dataIn.readLong());
    this.fdtmInterestEffective.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdjustment = null;
    } else {
    this.fcurAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLegacyPNIDate = null;
    } else {
    this.fdtmLegacyPNIDate = new Timestamp(__dataIn.readLong());
    this.fdtmLegacyPNIDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreditInterestThruDate = null;
    } else {
    this.fdtmCreditInterestThruDate = new Timestamp(__dataIn.readLong());
    this.fdtmCreditInterestThruDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastStatementDate = null;
    } else {
    this.fdtmLastStatementDate = new Timestamp(__dataIn.readLong());
    this.fdtmLastStatementDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountReviewType = null;
    } else {
    this.fstrAccountReviewType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReturnCategory = null;
    } else {
    this.fstrReturnCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintReturnVersion = null;
    } else {
    this.fintReturnVersion = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAudit = null;
    } else {
    this.fblnAudit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCnvSequence = null;
    } else {
    this.flngCnvSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOriginalConversion = null;
    } else {
    this.fblnOriginalConversion = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fblnRules) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRules);
    }
    if (null == this.fblnReturnFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReturnFiled);
    }
    if (null == this.fblnDueDateIssues) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDueDateIssues);
    }
    if (null == this.fcurCnvTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvTax, __dataOut);
    }
    if (null == this.fcurLateFilePenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLateFilePenalty, __dataOut);
    }
    if (null == this.fcurLateFilePenaltyRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLateFilePenaltyRemission, __dataOut);
    }
    if (null == this.fcurLatePaymentPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePaymentPenalty, __dataOut);
    }
    if (null == this.fcurLatePayPenaltyRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePayPenaltyRemission, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurInterestRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestRemission, __dataOut);
    }
    if (null == this.fdtmInterestEffective) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInterestEffective.getTime());
    __dataOut.writeInt(this.fdtmInterestEffective.getNanos());
    }
    if (null == this.fcurAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustment, __dataOut);
    }
    if (null == this.fdtmLegacyPNIDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLegacyPNIDate.getTime());
    __dataOut.writeInt(this.fdtmLegacyPNIDate.getNanos());
    }
    if (null == this.fdtmCreditInterestThruDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreditInterestThruDate.getTime());
    __dataOut.writeInt(this.fdtmCreditInterestThruDate.getNanos());
    }
    if (null == this.fdtmLastStatementDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastStatementDate.getTime());
    __dataOut.writeInt(this.fdtmLastStatementDate.getNanos());
    }
    if (null == this.fstrAccountReviewType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountReviewType);
    }
    if (null == this.fstrReturnCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReturnCategory);
    }
    if (null == this.fintReturnVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintReturnVersion);
    }
    if (null == this.fblnAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAudit);
    }
    if (null == this.flngCnvSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCnvSequence);
    }
    if (null == this.fblnOriginalConversion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOriginalConversion);
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
    if (null == this.fblnRules) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRules);
    }
    if (null == this.fblnReturnFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReturnFiled);
    }
    if (null == this.fblnDueDateIssues) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDueDateIssues);
    }
    if (null == this.fcurCnvTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvTax, __dataOut);
    }
    if (null == this.fcurLateFilePenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLateFilePenalty, __dataOut);
    }
    if (null == this.fcurLateFilePenaltyRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLateFilePenaltyRemission, __dataOut);
    }
    if (null == this.fcurLatePaymentPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePaymentPenalty, __dataOut);
    }
    if (null == this.fcurLatePayPenaltyRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePayPenaltyRemission, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurInterestRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestRemission, __dataOut);
    }
    if (null == this.fdtmInterestEffective) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInterestEffective.getTime());
    __dataOut.writeInt(this.fdtmInterestEffective.getNanos());
    }
    if (null == this.fcurAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdjustment, __dataOut);
    }
    if (null == this.fdtmLegacyPNIDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLegacyPNIDate.getTime());
    __dataOut.writeInt(this.fdtmLegacyPNIDate.getNanos());
    }
    if (null == this.fdtmCreditInterestThruDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreditInterestThruDate.getTime());
    __dataOut.writeInt(this.fdtmCreditInterestThruDate.getNanos());
    }
    if (null == this.fdtmLastStatementDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastStatementDate.getTime());
    __dataOut.writeInt(this.fdtmLastStatementDate.getNanos());
    }
    if (null == this.fstrAccountReviewType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountReviewType);
    }
    if (null == this.fstrReturnCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReturnCategory);
    }
    if (null == this.fintReturnVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintReturnVersion);
    }
    if (null == this.fblnAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAudit);
    }
    if (null == this.flngCnvSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCnvSequence);
    }
    if (null == this.fblnOriginalConversion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOriginalConversion);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRules==null?"\\N":"" + fblnRules, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReturnFiled==null?"\\N":"" + fblnReturnFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDueDateIssues==null?"\\N":"" + fblnDueDateIssues, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvTax==null?"\\N":fcurCnvTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLateFilePenalty==null?"\\N":fcurLateFilePenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLateFilePenaltyRemission==null?"\\N":fcurLateFilePenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePaymentPenalty==null?"\\N":fcurLatePaymentPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePayPenaltyRemission==null?"\\N":fcurLatePayPenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestRemission==null?"\\N":fcurInterestRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInterestEffective==null?"\\N":"" + fdtmInterestEffective, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustment==null?"\\N":fcurAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLegacyPNIDate==null?"\\N":"" + fdtmLegacyPNIDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreditInterestThruDate==null?"\\N":"" + fdtmCreditInterestThruDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastStatementDate==null?"\\N":"" + fdtmLastStatementDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountReviewType==null?"\\N":fstrAccountReviewType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReturnCategory==null?"\\N":fstrReturnCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintReturnVersion==null?"\\N":"" + fintReturnVersion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAudit==null?"\\N":"" + fblnAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCnvSequence==null?"\\N":"" + flngCnvSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOriginalConversion==null?"\\N":"" + fblnOriginalConversion, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRules==null?"\\N":"" + fblnRules, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReturnFiled==null?"\\N":"" + fblnReturnFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDueDateIssues==null?"\\N":"" + fblnDueDateIssues, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvTax==null?"\\N":fcurCnvTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLateFilePenalty==null?"\\N":fcurLateFilePenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLateFilePenaltyRemission==null?"\\N":fcurLateFilePenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePaymentPenalty==null?"\\N":fcurLatePaymentPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePayPenaltyRemission==null?"\\N":fcurLatePayPenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestRemission==null?"\\N":fcurInterestRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInterestEffective==null?"\\N":"" + fdtmInterestEffective, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdjustment==null?"\\N":fcurAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLegacyPNIDate==null?"\\N":"" + fdtmLegacyPNIDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreditInterestThruDate==null?"\\N":"" + fdtmCreditInterestThruDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastStatementDate==null?"\\N":"" + fdtmLastStatementDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountReviewType==null?"\\N":fstrAccountReviewType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReturnCategory==null?"\\N":fstrReturnCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintReturnVersion==null?"\\N":"" + fintReturnVersion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAudit==null?"\\N":"" + fblnAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCnvSequence==null?"\\N":"" + flngCnvSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOriginalConversion==null?"\\N":"" + fblnOriginalConversion, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRules = null; } else {
      this.fblnRules = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReturnFiled = null; } else {
      this.fblnReturnFiled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDueDateIssues = null; } else {
      this.fblnDueDateIssues = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvTax = null; } else {
      this.fcurCnvTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLateFilePenalty = null; } else {
      this.fcurLateFilePenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLateFilePenaltyRemission = null; } else {
      this.fcurLateFilePenaltyRemission = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLatePaymentPenalty = null; } else {
      this.fcurLatePaymentPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLatePayPenaltyRemission = null; } else {
      this.fcurLatePayPenaltyRemission = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestRemission = null; } else {
      this.fcurInterestRemission = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInterestEffective = null; } else {
      this.fdtmInterestEffective = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustment = null; } else {
      this.fcurAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLegacyPNIDate = null; } else {
      this.fdtmLegacyPNIDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreditInterestThruDate = null; } else {
      this.fdtmCreditInterestThruDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastStatementDate = null; } else {
      this.fdtmLastStatementDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountReviewType = null; } else {
      this.fstrAccountReviewType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReturnCategory = null; } else {
      this.fstrReturnCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintReturnVersion = null; } else {
      this.fintReturnVersion = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAudit = null; } else {
      this.fblnAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCnvSequence = null; } else {
      this.flngCnvSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOriginalConversion = null; } else {
      this.fblnOriginalConversion = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRules = null; } else {
      this.fblnRules = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReturnFiled = null; } else {
      this.fblnReturnFiled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDueDateIssues = null; } else {
      this.fblnDueDateIssues = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvTax = null; } else {
      this.fcurCnvTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLateFilePenalty = null; } else {
      this.fcurLateFilePenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLateFilePenaltyRemission = null; } else {
      this.fcurLateFilePenaltyRemission = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLatePaymentPenalty = null; } else {
      this.fcurLatePaymentPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLatePayPenaltyRemission = null; } else {
      this.fcurLatePayPenaltyRemission = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestRemission = null; } else {
      this.fcurInterestRemission = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInterestEffective = null; } else {
      this.fdtmInterestEffective = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdjustment = null; } else {
      this.fcurAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLegacyPNIDate = null; } else {
      this.fdtmLegacyPNIDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreditInterestThruDate = null; } else {
      this.fdtmCreditInterestThruDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastStatementDate = null; } else {
      this.fdtmLastStatementDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountReviewType = null; } else {
      this.fstrAccountReviewType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReturnCategory = null; } else {
      this.fstrReturnCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintReturnVersion = null; } else {
      this.fintReturnVersion = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAudit = null; } else {
      this.fblnAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCnvSequence = null; } else {
      this.flngCnvSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOriginalConversion = null; } else {
      this.fblnOriginalConversion = Integer.valueOf(__cur_str);
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
    tblnz_rtnconversion o = (tblnz_rtnconversion) super.clone();
    o.fdtmInterestEffective = (o.fdtmInterestEffective != null) ? (java.sql.Timestamp) o.fdtmInterestEffective.clone() : null;
    o.fdtmLegacyPNIDate = (o.fdtmLegacyPNIDate != null) ? (java.sql.Timestamp) o.fdtmLegacyPNIDate.clone() : null;
    o.fdtmCreditInterestThruDate = (o.fdtmCreditInterestThruDate != null) ? (java.sql.Timestamp) o.fdtmCreditInterestThruDate.clone() : null;
    o.fdtmLastStatementDate = (o.fdtmLastStatementDate != null) ? (java.sql.Timestamp) o.fdtmLastStatementDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnconversion o) throws CloneNotSupportedException {
    o.fdtmInterestEffective = (o.fdtmInterestEffective != null) ? (java.sql.Timestamp) o.fdtmInterestEffective.clone() : null;
    o.fdtmLegacyPNIDate = (o.fdtmLegacyPNIDate != null) ? (java.sql.Timestamp) o.fdtmLegacyPNIDate.clone() : null;
    o.fdtmCreditInterestThruDate = (o.fdtmCreditInterestThruDate != null) ? (java.sql.Timestamp) o.fdtmCreditInterestThruDate.clone() : null;
    o.fdtmLastStatementDate = (o.fdtmLastStatementDate != null) ? (java.sql.Timestamp) o.fdtmLastStatementDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnRules", this.fblnRules);
    __sqoop$field_map.put("fblnReturnFiled", this.fblnReturnFiled);
    __sqoop$field_map.put("fblnDueDateIssues", this.fblnDueDateIssues);
    __sqoop$field_map.put("fcurCnvTax", this.fcurCnvTax);
    __sqoop$field_map.put("fcurLateFilePenalty", this.fcurLateFilePenalty);
    __sqoop$field_map.put("fcurLateFilePenaltyRemission", this.fcurLateFilePenaltyRemission);
    __sqoop$field_map.put("fcurLatePaymentPenalty", this.fcurLatePaymentPenalty);
    __sqoop$field_map.put("fcurLatePayPenaltyRemission", this.fcurLatePayPenaltyRemission);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurInterestRemission", this.fcurInterestRemission);
    __sqoop$field_map.put("fdtmInterestEffective", this.fdtmInterestEffective);
    __sqoop$field_map.put("fcurAdjustment", this.fcurAdjustment);
    __sqoop$field_map.put("fdtmLegacyPNIDate", this.fdtmLegacyPNIDate);
    __sqoop$field_map.put("fdtmCreditInterestThruDate", this.fdtmCreditInterestThruDate);
    __sqoop$field_map.put("fdtmLastStatementDate", this.fdtmLastStatementDate);
    __sqoop$field_map.put("fstrAccountReviewType", this.fstrAccountReviewType);
    __sqoop$field_map.put("fstrReturnCategory", this.fstrReturnCategory);
    __sqoop$field_map.put("fintReturnVersion", this.fintReturnVersion);
    __sqoop$field_map.put("fblnAudit", this.fblnAudit);
    __sqoop$field_map.put("flngCnvSequence", this.flngCnvSequence);
    __sqoop$field_map.put("fblnOriginalConversion", this.fblnOriginalConversion);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnRules", this.fblnRules);
    __sqoop$field_map.put("fblnReturnFiled", this.fblnReturnFiled);
    __sqoop$field_map.put("fblnDueDateIssues", this.fblnDueDateIssues);
    __sqoop$field_map.put("fcurCnvTax", this.fcurCnvTax);
    __sqoop$field_map.put("fcurLateFilePenalty", this.fcurLateFilePenalty);
    __sqoop$field_map.put("fcurLateFilePenaltyRemission", this.fcurLateFilePenaltyRemission);
    __sqoop$field_map.put("fcurLatePaymentPenalty", this.fcurLatePaymentPenalty);
    __sqoop$field_map.put("fcurLatePayPenaltyRemission", this.fcurLatePayPenaltyRemission);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurInterestRemission", this.fcurInterestRemission);
    __sqoop$field_map.put("fdtmInterestEffective", this.fdtmInterestEffective);
    __sqoop$field_map.put("fcurAdjustment", this.fcurAdjustment);
    __sqoop$field_map.put("fdtmLegacyPNIDate", this.fdtmLegacyPNIDate);
    __sqoop$field_map.put("fdtmCreditInterestThruDate", this.fdtmCreditInterestThruDate);
    __sqoop$field_map.put("fdtmLastStatementDate", this.fdtmLastStatementDate);
    __sqoop$field_map.put("fstrAccountReviewType", this.fstrAccountReviewType);
    __sqoop$field_map.put("fstrReturnCategory", this.fstrReturnCategory);
    __sqoop$field_map.put("fintReturnVersion", this.fintReturnVersion);
    __sqoop$field_map.put("fblnAudit", this.fblnAudit);
    __sqoop$field_map.put("flngCnvSequence", this.flngCnvSequence);
    __sqoop$field_map.put("fblnOriginalConversion", this.fblnOriginalConversion);
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
