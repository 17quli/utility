// ORM class for table 'tblnz_rtngstconverted'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:23:26 NZDT 2020
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

public class tblnz_rtngstconverted extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnReturnFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fblnReturnFiled = (Integer)value;
      }
    });
    setters.put("fdtmLegacyPNIDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fdtmLegacyPNIDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLegacyCreditInterestThru", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fdtmLegacyCreditInterestThru = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAccountReviewType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fstrAccountReviewType = (String)value;
      }
    });
    setters.put("fblnPeriodAudited", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fblnPeriodAudited = (Integer)value;
      }
    });
    setters.put("fblnDueDateIssues", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fblnDueDateIssues = (Integer)value;
      }
    });
    setters.put("fdtmLastStatementDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fdtmLastStatementDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurCnvTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurCnvTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLateFilePenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurLateFilePenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLateFilePenaltyRemission", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurLateFilePenaltyRemission = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEffLateFilePenaltyRemiss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurEffLateFilePenaltyRemiss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnExcEffLateFilePenalRemiss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fblnExcEffLateFilePenalRemiss = (Integer)value;
      }
    });
    setters.put("fcurLatePayPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurLatePayPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLatePayPenaltyRemission", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurLatePayPenaltyRemission = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEffLatePayPenaltyRemission", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurEffLatePayPenaltyRemission = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnExcEffLatePayPenaltyRemiss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fblnExcEffLatePayPenaltyRemiss = (Integer)value;
      }
    });
    setters.put("fcurPenaltyPost", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurPenaltyPost = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestRemission", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurInterestRemission = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEffInterestRemission", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurEffInterestRemission = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnExcEffInterestRemission", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fblnExcEffInterestRemission = (Integer)value;
      }
    });
    setters.put("fcurInterestPost", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurInterestPost = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCnvAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurCnvAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCnvOriginalAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fcurCnvOriginalAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstconverted.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtngstconverted() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtngstconverted with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnReturnFiled;
  public Integer get_fblnReturnFiled() {
    return fblnReturnFiled;
  }
  public void set_fblnReturnFiled(Integer fblnReturnFiled) {
    this.fblnReturnFiled = fblnReturnFiled;
  }
  public tblnz_rtngstconverted with_fblnReturnFiled(Integer fblnReturnFiled) {
    this.fblnReturnFiled = fblnReturnFiled;
    return this;
  }
  private java.sql.Timestamp fdtmLegacyPNIDate;
  public java.sql.Timestamp get_fdtmLegacyPNIDate() {
    return fdtmLegacyPNIDate;
  }
  public void set_fdtmLegacyPNIDate(java.sql.Timestamp fdtmLegacyPNIDate) {
    this.fdtmLegacyPNIDate = fdtmLegacyPNIDate;
  }
  public tblnz_rtngstconverted with_fdtmLegacyPNIDate(java.sql.Timestamp fdtmLegacyPNIDate) {
    this.fdtmLegacyPNIDate = fdtmLegacyPNIDate;
    return this;
  }
  private java.sql.Timestamp fdtmLegacyCreditInterestThru;
  public java.sql.Timestamp get_fdtmLegacyCreditInterestThru() {
    return fdtmLegacyCreditInterestThru;
  }
  public void set_fdtmLegacyCreditInterestThru(java.sql.Timestamp fdtmLegacyCreditInterestThru) {
    this.fdtmLegacyCreditInterestThru = fdtmLegacyCreditInterestThru;
  }
  public tblnz_rtngstconverted with_fdtmLegacyCreditInterestThru(java.sql.Timestamp fdtmLegacyCreditInterestThru) {
    this.fdtmLegacyCreditInterestThru = fdtmLegacyCreditInterestThru;
    return this;
  }
  private String fstrAccountReviewType;
  public String get_fstrAccountReviewType() {
    return fstrAccountReviewType;
  }
  public void set_fstrAccountReviewType(String fstrAccountReviewType) {
    this.fstrAccountReviewType = fstrAccountReviewType;
  }
  public tblnz_rtngstconverted with_fstrAccountReviewType(String fstrAccountReviewType) {
    this.fstrAccountReviewType = fstrAccountReviewType;
    return this;
  }
  private Integer fblnPeriodAudited;
  public Integer get_fblnPeriodAudited() {
    return fblnPeriodAudited;
  }
  public void set_fblnPeriodAudited(Integer fblnPeriodAudited) {
    this.fblnPeriodAudited = fblnPeriodAudited;
  }
  public tblnz_rtngstconverted with_fblnPeriodAudited(Integer fblnPeriodAudited) {
    this.fblnPeriodAudited = fblnPeriodAudited;
    return this;
  }
  private Integer fblnDueDateIssues;
  public Integer get_fblnDueDateIssues() {
    return fblnDueDateIssues;
  }
  public void set_fblnDueDateIssues(Integer fblnDueDateIssues) {
    this.fblnDueDateIssues = fblnDueDateIssues;
  }
  public tblnz_rtngstconverted with_fblnDueDateIssues(Integer fblnDueDateIssues) {
    this.fblnDueDateIssues = fblnDueDateIssues;
    return this;
  }
  private java.sql.Timestamp fdtmLastStatementDate;
  public java.sql.Timestamp get_fdtmLastStatementDate() {
    return fdtmLastStatementDate;
  }
  public void set_fdtmLastStatementDate(java.sql.Timestamp fdtmLastStatementDate) {
    this.fdtmLastStatementDate = fdtmLastStatementDate;
  }
  public tblnz_rtngstconverted with_fdtmLastStatementDate(java.sql.Timestamp fdtmLastStatementDate) {
    this.fdtmLastStatementDate = fdtmLastStatementDate;
    return this;
  }
  private java.math.BigDecimal fcurCnvTax;
  public java.math.BigDecimal get_fcurCnvTax() {
    return fcurCnvTax;
  }
  public void set_fcurCnvTax(java.math.BigDecimal fcurCnvTax) {
    this.fcurCnvTax = fcurCnvTax;
  }
  public tblnz_rtngstconverted with_fcurCnvTax(java.math.BigDecimal fcurCnvTax) {
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
  public tblnz_rtngstconverted with_fcurLateFilePenalty(java.math.BigDecimal fcurLateFilePenalty) {
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
  public tblnz_rtngstconverted with_fcurLateFilePenaltyRemission(java.math.BigDecimal fcurLateFilePenaltyRemission) {
    this.fcurLateFilePenaltyRemission = fcurLateFilePenaltyRemission;
    return this;
  }
  private java.math.BigDecimal fcurEffLateFilePenaltyRemiss;
  public java.math.BigDecimal get_fcurEffLateFilePenaltyRemiss() {
    return fcurEffLateFilePenaltyRemiss;
  }
  public void set_fcurEffLateFilePenaltyRemiss(java.math.BigDecimal fcurEffLateFilePenaltyRemiss) {
    this.fcurEffLateFilePenaltyRemiss = fcurEffLateFilePenaltyRemiss;
  }
  public tblnz_rtngstconverted with_fcurEffLateFilePenaltyRemiss(java.math.BigDecimal fcurEffLateFilePenaltyRemiss) {
    this.fcurEffLateFilePenaltyRemiss = fcurEffLateFilePenaltyRemiss;
    return this;
  }
  private Integer fblnExcEffLateFilePenalRemiss;
  public Integer get_fblnExcEffLateFilePenalRemiss() {
    return fblnExcEffLateFilePenalRemiss;
  }
  public void set_fblnExcEffLateFilePenalRemiss(Integer fblnExcEffLateFilePenalRemiss) {
    this.fblnExcEffLateFilePenalRemiss = fblnExcEffLateFilePenalRemiss;
  }
  public tblnz_rtngstconverted with_fblnExcEffLateFilePenalRemiss(Integer fblnExcEffLateFilePenalRemiss) {
    this.fblnExcEffLateFilePenalRemiss = fblnExcEffLateFilePenalRemiss;
    return this;
  }
  private java.math.BigDecimal fcurLatePayPenalty;
  public java.math.BigDecimal get_fcurLatePayPenalty() {
    return fcurLatePayPenalty;
  }
  public void set_fcurLatePayPenalty(java.math.BigDecimal fcurLatePayPenalty) {
    this.fcurLatePayPenalty = fcurLatePayPenalty;
  }
  public tblnz_rtngstconverted with_fcurLatePayPenalty(java.math.BigDecimal fcurLatePayPenalty) {
    this.fcurLatePayPenalty = fcurLatePayPenalty;
    return this;
  }
  private java.math.BigDecimal fcurLatePayPenaltyRemission;
  public java.math.BigDecimal get_fcurLatePayPenaltyRemission() {
    return fcurLatePayPenaltyRemission;
  }
  public void set_fcurLatePayPenaltyRemission(java.math.BigDecimal fcurLatePayPenaltyRemission) {
    this.fcurLatePayPenaltyRemission = fcurLatePayPenaltyRemission;
  }
  public tblnz_rtngstconverted with_fcurLatePayPenaltyRemission(java.math.BigDecimal fcurLatePayPenaltyRemission) {
    this.fcurLatePayPenaltyRemission = fcurLatePayPenaltyRemission;
    return this;
  }
  private java.math.BigDecimal fcurEffLatePayPenaltyRemission;
  public java.math.BigDecimal get_fcurEffLatePayPenaltyRemission() {
    return fcurEffLatePayPenaltyRemission;
  }
  public void set_fcurEffLatePayPenaltyRemission(java.math.BigDecimal fcurEffLatePayPenaltyRemission) {
    this.fcurEffLatePayPenaltyRemission = fcurEffLatePayPenaltyRemission;
  }
  public tblnz_rtngstconverted with_fcurEffLatePayPenaltyRemission(java.math.BigDecimal fcurEffLatePayPenaltyRemission) {
    this.fcurEffLatePayPenaltyRemission = fcurEffLatePayPenaltyRemission;
    return this;
  }
  private Integer fblnExcEffLatePayPenaltyRemiss;
  public Integer get_fblnExcEffLatePayPenaltyRemiss() {
    return fblnExcEffLatePayPenaltyRemiss;
  }
  public void set_fblnExcEffLatePayPenaltyRemiss(Integer fblnExcEffLatePayPenaltyRemiss) {
    this.fblnExcEffLatePayPenaltyRemiss = fblnExcEffLatePayPenaltyRemiss;
  }
  public tblnz_rtngstconverted with_fblnExcEffLatePayPenaltyRemiss(Integer fblnExcEffLatePayPenaltyRemiss) {
    this.fblnExcEffLatePayPenaltyRemiss = fblnExcEffLatePayPenaltyRemiss;
    return this;
  }
  private java.math.BigDecimal fcurPenaltyPost;
  public java.math.BigDecimal get_fcurPenaltyPost() {
    return fcurPenaltyPost;
  }
  public void set_fcurPenaltyPost(java.math.BigDecimal fcurPenaltyPost) {
    this.fcurPenaltyPost = fcurPenaltyPost;
  }
  public tblnz_rtngstconverted with_fcurPenaltyPost(java.math.BigDecimal fcurPenaltyPost) {
    this.fcurPenaltyPost = fcurPenaltyPost;
    return this;
  }
  private java.math.BigDecimal fcurInterest;
  public java.math.BigDecimal get_fcurInterest() {
    return fcurInterest;
  }
  public void set_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
  }
  public tblnz_rtngstconverted with_fcurInterest(java.math.BigDecimal fcurInterest) {
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
  public tblnz_rtngstconverted with_fcurInterestRemission(java.math.BigDecimal fcurInterestRemission) {
    this.fcurInterestRemission = fcurInterestRemission;
    return this;
  }
  private java.math.BigDecimal fcurEffInterestRemission;
  public java.math.BigDecimal get_fcurEffInterestRemission() {
    return fcurEffInterestRemission;
  }
  public void set_fcurEffInterestRemission(java.math.BigDecimal fcurEffInterestRemission) {
    this.fcurEffInterestRemission = fcurEffInterestRemission;
  }
  public tblnz_rtngstconverted with_fcurEffInterestRemission(java.math.BigDecimal fcurEffInterestRemission) {
    this.fcurEffInterestRemission = fcurEffInterestRemission;
    return this;
  }
  private Integer fblnExcEffInterestRemission;
  public Integer get_fblnExcEffInterestRemission() {
    return fblnExcEffInterestRemission;
  }
  public void set_fblnExcEffInterestRemission(Integer fblnExcEffInterestRemission) {
    this.fblnExcEffInterestRemission = fblnExcEffInterestRemission;
  }
  public tblnz_rtngstconverted with_fblnExcEffInterestRemission(Integer fblnExcEffInterestRemission) {
    this.fblnExcEffInterestRemission = fblnExcEffInterestRemission;
    return this;
  }
  private java.math.BigDecimal fcurInterestPost;
  public java.math.BigDecimal get_fcurInterestPost() {
    return fcurInterestPost;
  }
  public void set_fcurInterestPost(java.math.BigDecimal fcurInterestPost) {
    this.fcurInterestPost = fcurInterestPost;
  }
  public tblnz_rtngstconverted with_fcurInterestPost(java.math.BigDecimal fcurInterestPost) {
    this.fcurInterestPost = fcurInterestPost;
    return this;
  }
  private java.math.BigDecimal fcurCnvAdjustment;
  public java.math.BigDecimal get_fcurCnvAdjustment() {
    return fcurCnvAdjustment;
  }
  public void set_fcurCnvAdjustment(java.math.BigDecimal fcurCnvAdjustment) {
    this.fcurCnvAdjustment = fcurCnvAdjustment;
  }
  public tblnz_rtngstconverted with_fcurCnvAdjustment(java.math.BigDecimal fcurCnvAdjustment) {
    this.fcurCnvAdjustment = fcurCnvAdjustment;
    return this;
  }
  private java.math.BigDecimal fcurCnvOriginalAdjustment;
  public java.math.BigDecimal get_fcurCnvOriginalAdjustment() {
    return fcurCnvOriginalAdjustment;
  }
  public void set_fcurCnvOriginalAdjustment(java.math.BigDecimal fcurCnvOriginalAdjustment) {
    this.fcurCnvOriginalAdjustment = fcurCnvOriginalAdjustment;
  }
  public tblnz_rtngstconverted with_fcurCnvOriginalAdjustment(java.math.BigDecimal fcurCnvOriginalAdjustment) {
    this.fcurCnvOriginalAdjustment = fcurCnvOriginalAdjustment;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtngstconverted with_fstrWho(String fstrWho) {
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
  public tblnz_rtngstconverted with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtngstconverted)) {
      return false;
    }
    tblnz_rtngstconverted that = (tblnz_rtngstconverted) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnReturnFiled == null ? that.fblnReturnFiled == null : this.fblnReturnFiled.equals(that.fblnReturnFiled));
    equal = equal && (this.fdtmLegacyPNIDate == null ? that.fdtmLegacyPNIDate == null : this.fdtmLegacyPNIDate.equals(that.fdtmLegacyPNIDate));
    equal = equal && (this.fdtmLegacyCreditInterestThru == null ? that.fdtmLegacyCreditInterestThru == null : this.fdtmLegacyCreditInterestThru.equals(that.fdtmLegacyCreditInterestThru));
    equal = equal && (this.fstrAccountReviewType == null ? that.fstrAccountReviewType == null : this.fstrAccountReviewType.equals(that.fstrAccountReviewType));
    equal = equal && (this.fblnPeriodAudited == null ? that.fblnPeriodAudited == null : this.fblnPeriodAudited.equals(that.fblnPeriodAudited));
    equal = equal && (this.fblnDueDateIssues == null ? that.fblnDueDateIssues == null : this.fblnDueDateIssues.equals(that.fblnDueDateIssues));
    equal = equal && (this.fdtmLastStatementDate == null ? that.fdtmLastStatementDate == null : this.fdtmLastStatementDate.equals(that.fdtmLastStatementDate));
    equal = equal && (this.fcurCnvTax == null ? that.fcurCnvTax == null : this.fcurCnvTax.equals(that.fcurCnvTax));
    equal = equal && (this.fcurLateFilePenalty == null ? that.fcurLateFilePenalty == null : this.fcurLateFilePenalty.equals(that.fcurLateFilePenalty));
    equal = equal && (this.fcurLateFilePenaltyRemission == null ? that.fcurLateFilePenaltyRemission == null : this.fcurLateFilePenaltyRemission.equals(that.fcurLateFilePenaltyRemission));
    equal = equal && (this.fcurEffLateFilePenaltyRemiss == null ? that.fcurEffLateFilePenaltyRemiss == null : this.fcurEffLateFilePenaltyRemiss.equals(that.fcurEffLateFilePenaltyRemiss));
    equal = equal && (this.fblnExcEffLateFilePenalRemiss == null ? that.fblnExcEffLateFilePenalRemiss == null : this.fblnExcEffLateFilePenalRemiss.equals(that.fblnExcEffLateFilePenalRemiss));
    equal = equal && (this.fcurLatePayPenalty == null ? that.fcurLatePayPenalty == null : this.fcurLatePayPenalty.equals(that.fcurLatePayPenalty));
    equal = equal && (this.fcurLatePayPenaltyRemission == null ? that.fcurLatePayPenaltyRemission == null : this.fcurLatePayPenaltyRemission.equals(that.fcurLatePayPenaltyRemission));
    equal = equal && (this.fcurEffLatePayPenaltyRemission == null ? that.fcurEffLatePayPenaltyRemission == null : this.fcurEffLatePayPenaltyRemission.equals(that.fcurEffLatePayPenaltyRemission));
    equal = equal && (this.fblnExcEffLatePayPenaltyRemiss == null ? that.fblnExcEffLatePayPenaltyRemiss == null : this.fblnExcEffLatePayPenaltyRemiss.equals(that.fblnExcEffLatePayPenaltyRemiss));
    equal = equal && (this.fcurPenaltyPost == null ? that.fcurPenaltyPost == null : this.fcurPenaltyPost.equals(that.fcurPenaltyPost));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurInterestRemission == null ? that.fcurInterestRemission == null : this.fcurInterestRemission.equals(that.fcurInterestRemission));
    equal = equal && (this.fcurEffInterestRemission == null ? that.fcurEffInterestRemission == null : this.fcurEffInterestRemission.equals(that.fcurEffInterestRemission));
    equal = equal && (this.fblnExcEffInterestRemission == null ? that.fblnExcEffInterestRemission == null : this.fblnExcEffInterestRemission.equals(that.fblnExcEffInterestRemission));
    equal = equal && (this.fcurInterestPost == null ? that.fcurInterestPost == null : this.fcurInterestPost.equals(that.fcurInterestPost));
    equal = equal && (this.fcurCnvAdjustment == null ? that.fcurCnvAdjustment == null : this.fcurCnvAdjustment.equals(that.fcurCnvAdjustment));
    equal = equal && (this.fcurCnvOriginalAdjustment == null ? that.fcurCnvOriginalAdjustment == null : this.fcurCnvOriginalAdjustment.equals(that.fcurCnvOriginalAdjustment));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtngstconverted)) {
      return false;
    }
    tblnz_rtngstconverted that = (tblnz_rtngstconverted) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnReturnFiled == null ? that.fblnReturnFiled == null : this.fblnReturnFiled.equals(that.fblnReturnFiled));
    equal = equal && (this.fdtmLegacyPNIDate == null ? that.fdtmLegacyPNIDate == null : this.fdtmLegacyPNIDate.equals(that.fdtmLegacyPNIDate));
    equal = equal && (this.fdtmLegacyCreditInterestThru == null ? that.fdtmLegacyCreditInterestThru == null : this.fdtmLegacyCreditInterestThru.equals(that.fdtmLegacyCreditInterestThru));
    equal = equal && (this.fstrAccountReviewType == null ? that.fstrAccountReviewType == null : this.fstrAccountReviewType.equals(that.fstrAccountReviewType));
    equal = equal && (this.fblnPeriodAudited == null ? that.fblnPeriodAudited == null : this.fblnPeriodAudited.equals(that.fblnPeriodAudited));
    equal = equal && (this.fblnDueDateIssues == null ? that.fblnDueDateIssues == null : this.fblnDueDateIssues.equals(that.fblnDueDateIssues));
    equal = equal && (this.fdtmLastStatementDate == null ? that.fdtmLastStatementDate == null : this.fdtmLastStatementDate.equals(that.fdtmLastStatementDate));
    equal = equal && (this.fcurCnvTax == null ? that.fcurCnvTax == null : this.fcurCnvTax.equals(that.fcurCnvTax));
    equal = equal && (this.fcurLateFilePenalty == null ? that.fcurLateFilePenalty == null : this.fcurLateFilePenalty.equals(that.fcurLateFilePenalty));
    equal = equal && (this.fcurLateFilePenaltyRemission == null ? that.fcurLateFilePenaltyRemission == null : this.fcurLateFilePenaltyRemission.equals(that.fcurLateFilePenaltyRemission));
    equal = equal && (this.fcurEffLateFilePenaltyRemiss == null ? that.fcurEffLateFilePenaltyRemiss == null : this.fcurEffLateFilePenaltyRemiss.equals(that.fcurEffLateFilePenaltyRemiss));
    equal = equal && (this.fblnExcEffLateFilePenalRemiss == null ? that.fblnExcEffLateFilePenalRemiss == null : this.fblnExcEffLateFilePenalRemiss.equals(that.fblnExcEffLateFilePenalRemiss));
    equal = equal && (this.fcurLatePayPenalty == null ? that.fcurLatePayPenalty == null : this.fcurLatePayPenalty.equals(that.fcurLatePayPenalty));
    equal = equal && (this.fcurLatePayPenaltyRemission == null ? that.fcurLatePayPenaltyRemission == null : this.fcurLatePayPenaltyRemission.equals(that.fcurLatePayPenaltyRemission));
    equal = equal && (this.fcurEffLatePayPenaltyRemission == null ? that.fcurEffLatePayPenaltyRemission == null : this.fcurEffLatePayPenaltyRemission.equals(that.fcurEffLatePayPenaltyRemission));
    equal = equal && (this.fblnExcEffLatePayPenaltyRemiss == null ? that.fblnExcEffLatePayPenaltyRemiss == null : this.fblnExcEffLatePayPenaltyRemiss.equals(that.fblnExcEffLatePayPenaltyRemiss));
    equal = equal && (this.fcurPenaltyPost == null ? that.fcurPenaltyPost == null : this.fcurPenaltyPost.equals(that.fcurPenaltyPost));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurInterestRemission == null ? that.fcurInterestRemission == null : this.fcurInterestRemission.equals(that.fcurInterestRemission));
    equal = equal && (this.fcurEffInterestRemission == null ? that.fcurEffInterestRemission == null : this.fcurEffInterestRemission.equals(that.fcurEffInterestRemission));
    equal = equal && (this.fblnExcEffInterestRemission == null ? that.fblnExcEffInterestRemission == null : this.fblnExcEffInterestRemission.equals(that.fblnExcEffInterestRemission));
    equal = equal && (this.fcurInterestPost == null ? that.fcurInterestPost == null : this.fcurInterestPost.equals(that.fcurInterestPost));
    equal = equal && (this.fcurCnvAdjustment == null ? that.fcurCnvAdjustment == null : this.fcurCnvAdjustment.equals(that.fcurCnvAdjustment));
    equal = equal && (this.fcurCnvOriginalAdjustment == null ? that.fcurCnvOriginalAdjustment == null : this.fcurCnvOriginalAdjustment.equals(that.fcurCnvOriginalAdjustment));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnReturnFiled = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmLegacyPNIDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmLegacyCreditInterestThru = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrAccountReviewType = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnPeriodAudited = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnDueDateIssues = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmLastStatementDate = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurCnvTax = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurLateFilePenalty = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurLateFilePenaltyRemission = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurEffLateFilePenaltyRemiss = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fblnExcEffLateFilePenalRemiss = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fcurLatePayPenalty = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurLatePayPenaltyRemission = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurEffLatePayPenaltyRemission = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fblnExcEffLatePayPenaltyRemiss = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fcurPenaltyPost = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurInterestRemission = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurEffInterestRemission = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fblnExcEffInterestRemission = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fcurInterestPost = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurCnvAdjustment = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurCnvOriginalAdjustment = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnReturnFiled = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmLegacyPNIDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmLegacyCreditInterestThru = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrAccountReviewType = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnPeriodAudited = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnDueDateIssues = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmLastStatementDate = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurCnvTax = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurLateFilePenalty = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurLateFilePenaltyRemission = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurEffLateFilePenaltyRemiss = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fblnExcEffLateFilePenalRemiss = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fcurLatePayPenalty = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurLatePayPenaltyRemission = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurEffLatePayPenaltyRemission = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fblnExcEffLatePayPenaltyRemiss = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fcurPenaltyPost = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurInterestRemission = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurEffInterestRemission = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fblnExcEffInterestRemission = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fcurInterestPost = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurCnvAdjustment = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurCnvOriginalAdjustment = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnReturnFiled, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLegacyPNIDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLegacyCreditInterestThru, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountReviewType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodAudited, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDueDateIssues, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastStatementDate, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvTax, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLateFilePenalty, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLateFilePenaltyRemission, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEffLateFilePenaltyRemiss, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExcEffLateFilePenalRemiss, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePayPenalty, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePayPenaltyRemission, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEffLatePayPenaltyRemission, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExcEffLatePayPenaltyRemiss, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyPost, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestRemission, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEffInterestRemission, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExcEffInterestRemission, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestPost, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvAdjustment, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvOriginalAdjustment, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReturnFiled, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLegacyPNIDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLegacyCreditInterestThru, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountReviewType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodAudited, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDueDateIssues, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastStatementDate, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvTax, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLateFilePenalty, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLateFilePenaltyRemission, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEffLateFilePenaltyRemiss, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExcEffLateFilePenalRemiss, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePayPenalty, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePayPenaltyRemission, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEffLatePayPenaltyRemission, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExcEffLatePayPenaltyRemiss, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyPost, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestRemission, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEffInterestRemission, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExcEffInterestRemission, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestPost, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvAdjustment, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvOriginalAdjustment, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
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
        this.fblnReturnFiled = null;
    } else {
    this.fblnReturnFiled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLegacyPNIDate = null;
    } else {
    this.fdtmLegacyPNIDate = new Timestamp(__dataIn.readLong());
    this.fdtmLegacyPNIDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLegacyCreditInterestThru = null;
    } else {
    this.fdtmLegacyCreditInterestThru = new Timestamp(__dataIn.readLong());
    this.fdtmLegacyCreditInterestThru.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountReviewType = null;
    } else {
    this.fstrAccountReviewType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPeriodAudited = null;
    } else {
    this.fblnPeriodAudited = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDueDateIssues = null;
    } else {
    this.fblnDueDateIssues = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastStatementDate = null;
    } else {
    this.fdtmLastStatementDate = new Timestamp(__dataIn.readLong());
    this.fdtmLastStatementDate.setNanos(__dataIn.readInt());
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
        this.fcurEffLateFilePenaltyRemiss = null;
    } else {
    this.fcurEffLateFilePenaltyRemiss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExcEffLateFilePenalRemiss = null;
    } else {
    this.fblnExcEffLateFilePenalRemiss = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLatePayPenalty = null;
    } else {
    this.fcurLatePayPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLatePayPenaltyRemission = null;
    } else {
    this.fcurLatePayPenaltyRemission = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEffLatePayPenaltyRemission = null;
    } else {
    this.fcurEffLatePayPenaltyRemission = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExcEffLatePayPenaltyRemiss = null;
    } else {
    this.fblnExcEffLatePayPenaltyRemiss = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenaltyPost = null;
    } else {
    this.fcurPenaltyPost = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurEffInterestRemission = null;
    } else {
    this.fcurEffInterestRemission = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExcEffInterestRemission = null;
    } else {
    this.fblnExcEffInterestRemission = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestPost = null;
    } else {
    this.fcurInterestPost = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCnvAdjustment = null;
    } else {
    this.fcurCnvAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCnvOriginalAdjustment = null;
    } else {
    this.fcurCnvOriginalAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fblnReturnFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReturnFiled);
    }
    if (null == this.fdtmLegacyPNIDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLegacyPNIDate.getTime());
    __dataOut.writeInt(this.fdtmLegacyPNIDate.getNanos());
    }
    if (null == this.fdtmLegacyCreditInterestThru) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLegacyCreditInterestThru.getTime());
    __dataOut.writeInt(this.fdtmLegacyCreditInterestThru.getNanos());
    }
    if (null == this.fstrAccountReviewType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountReviewType);
    }
    if (null == this.fblnPeriodAudited) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodAudited);
    }
    if (null == this.fblnDueDateIssues) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDueDateIssues);
    }
    if (null == this.fdtmLastStatementDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastStatementDate.getTime());
    __dataOut.writeInt(this.fdtmLastStatementDate.getNanos());
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
    if (null == this.fcurEffLateFilePenaltyRemiss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEffLateFilePenaltyRemiss, __dataOut);
    }
    if (null == this.fblnExcEffLateFilePenalRemiss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExcEffLateFilePenalRemiss);
    }
    if (null == this.fcurLatePayPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePayPenalty, __dataOut);
    }
    if (null == this.fcurLatePayPenaltyRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePayPenaltyRemission, __dataOut);
    }
    if (null == this.fcurEffLatePayPenaltyRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEffLatePayPenaltyRemission, __dataOut);
    }
    if (null == this.fblnExcEffLatePayPenaltyRemiss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExcEffLatePayPenaltyRemiss);
    }
    if (null == this.fcurPenaltyPost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyPost, __dataOut);
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
    if (null == this.fcurEffInterestRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEffInterestRemission, __dataOut);
    }
    if (null == this.fblnExcEffInterestRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExcEffInterestRemission);
    }
    if (null == this.fcurInterestPost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestPost, __dataOut);
    }
    if (null == this.fcurCnvAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvAdjustment, __dataOut);
    }
    if (null == this.fcurCnvOriginalAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvOriginalAdjustment, __dataOut);
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
    if (null == this.fblnReturnFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReturnFiled);
    }
    if (null == this.fdtmLegacyPNIDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLegacyPNIDate.getTime());
    __dataOut.writeInt(this.fdtmLegacyPNIDate.getNanos());
    }
    if (null == this.fdtmLegacyCreditInterestThru) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLegacyCreditInterestThru.getTime());
    __dataOut.writeInt(this.fdtmLegacyCreditInterestThru.getNanos());
    }
    if (null == this.fstrAccountReviewType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountReviewType);
    }
    if (null == this.fblnPeriodAudited) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodAudited);
    }
    if (null == this.fblnDueDateIssues) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDueDateIssues);
    }
    if (null == this.fdtmLastStatementDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastStatementDate.getTime());
    __dataOut.writeInt(this.fdtmLastStatementDate.getNanos());
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
    if (null == this.fcurEffLateFilePenaltyRemiss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEffLateFilePenaltyRemiss, __dataOut);
    }
    if (null == this.fblnExcEffLateFilePenalRemiss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExcEffLateFilePenalRemiss);
    }
    if (null == this.fcurLatePayPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePayPenalty, __dataOut);
    }
    if (null == this.fcurLatePayPenaltyRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePayPenaltyRemission, __dataOut);
    }
    if (null == this.fcurEffLatePayPenaltyRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEffLatePayPenaltyRemission, __dataOut);
    }
    if (null == this.fblnExcEffLatePayPenaltyRemiss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExcEffLatePayPenaltyRemiss);
    }
    if (null == this.fcurPenaltyPost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyPost, __dataOut);
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
    if (null == this.fcurEffInterestRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEffInterestRemission, __dataOut);
    }
    if (null == this.fblnExcEffInterestRemission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExcEffInterestRemission);
    }
    if (null == this.fcurInterestPost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestPost, __dataOut);
    }
    if (null == this.fcurCnvAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvAdjustment, __dataOut);
    }
    if (null == this.fcurCnvOriginalAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvOriginalAdjustment, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReturnFiled==null?"\\N":"" + fblnReturnFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLegacyPNIDate==null?"\\N":"" + fdtmLegacyPNIDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLegacyCreditInterestThru==null?"\\N":"" + fdtmLegacyCreditInterestThru, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountReviewType==null?"\\N":fstrAccountReviewType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodAudited==null?"\\N":"" + fblnPeriodAudited, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDueDateIssues==null?"\\N":"" + fblnDueDateIssues, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastStatementDate==null?"\\N":"" + fdtmLastStatementDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvTax==null?"\\N":fcurCnvTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLateFilePenalty==null?"\\N":fcurLateFilePenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLateFilePenaltyRemission==null?"\\N":fcurLateFilePenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEffLateFilePenaltyRemiss==null?"\\N":fcurEffLateFilePenaltyRemiss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExcEffLateFilePenalRemiss==null?"\\N":"" + fblnExcEffLateFilePenalRemiss, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePayPenalty==null?"\\N":fcurLatePayPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePayPenaltyRemission==null?"\\N":fcurLatePayPenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEffLatePayPenaltyRemission==null?"\\N":fcurEffLatePayPenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExcEffLatePayPenaltyRemiss==null?"\\N":"" + fblnExcEffLatePayPenaltyRemiss, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyPost==null?"\\N":fcurPenaltyPost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestRemission==null?"\\N":fcurInterestRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEffInterestRemission==null?"\\N":fcurEffInterestRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExcEffInterestRemission==null?"\\N":"" + fblnExcEffInterestRemission, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestPost==null?"\\N":fcurInterestPost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvAdjustment==null?"\\N":fcurCnvAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvOriginalAdjustment==null?"\\N":fcurCnvOriginalAdjustment.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReturnFiled==null?"\\N":"" + fblnReturnFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLegacyPNIDate==null?"\\N":"" + fdtmLegacyPNIDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLegacyCreditInterestThru==null?"\\N":"" + fdtmLegacyCreditInterestThru, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountReviewType==null?"\\N":fstrAccountReviewType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodAudited==null?"\\N":"" + fblnPeriodAudited, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDueDateIssues==null?"\\N":"" + fblnDueDateIssues, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastStatementDate==null?"\\N":"" + fdtmLastStatementDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvTax==null?"\\N":fcurCnvTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLateFilePenalty==null?"\\N":fcurLateFilePenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLateFilePenaltyRemission==null?"\\N":fcurLateFilePenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEffLateFilePenaltyRemiss==null?"\\N":fcurEffLateFilePenaltyRemiss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExcEffLateFilePenalRemiss==null?"\\N":"" + fblnExcEffLateFilePenalRemiss, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePayPenalty==null?"\\N":fcurLatePayPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePayPenaltyRemission==null?"\\N":fcurLatePayPenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEffLatePayPenaltyRemission==null?"\\N":fcurEffLatePayPenaltyRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExcEffLatePayPenaltyRemiss==null?"\\N":"" + fblnExcEffLatePayPenaltyRemiss, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyPost==null?"\\N":fcurPenaltyPost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestRemission==null?"\\N":fcurInterestRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEffInterestRemission==null?"\\N":fcurEffInterestRemission.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExcEffInterestRemission==null?"\\N":"" + fblnExcEffInterestRemission, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestPost==null?"\\N":fcurInterestPost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvAdjustment==null?"\\N":fcurCnvAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvOriginalAdjustment==null?"\\N":fcurCnvOriginalAdjustment.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReturnFiled = null; } else {
      this.fblnReturnFiled = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLegacyCreditInterestThru = null; } else {
      this.fdtmLegacyCreditInterestThru = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodAudited = null; } else {
      this.fblnPeriodAudited = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastStatementDate = null; } else {
      this.fdtmLastStatementDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEffLateFilePenaltyRemiss = null; } else {
      this.fcurEffLateFilePenaltyRemiss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExcEffLateFilePenalRemiss = null; } else {
      this.fblnExcEffLateFilePenalRemiss = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLatePayPenalty = null; } else {
      this.fcurLatePayPenalty = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEffLatePayPenaltyRemission = null; } else {
      this.fcurEffLatePayPenaltyRemission = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExcEffLatePayPenaltyRemiss = null; } else {
      this.fblnExcEffLatePayPenaltyRemiss = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyPost = null; } else {
      this.fcurPenaltyPost = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEffInterestRemission = null; } else {
      this.fcurEffInterestRemission = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExcEffInterestRemission = null; } else {
      this.fblnExcEffInterestRemission = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestPost = null; } else {
      this.fcurInterestPost = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvAdjustment = null; } else {
      this.fcurCnvAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvOriginalAdjustment = null; } else {
      this.fcurCnvOriginalAdjustment = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReturnFiled = null; } else {
      this.fblnReturnFiled = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLegacyCreditInterestThru = null; } else {
      this.fdtmLegacyCreditInterestThru = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodAudited = null; } else {
      this.fblnPeriodAudited = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastStatementDate = null; } else {
      this.fdtmLastStatementDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEffLateFilePenaltyRemiss = null; } else {
      this.fcurEffLateFilePenaltyRemiss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExcEffLateFilePenalRemiss = null; } else {
      this.fblnExcEffLateFilePenalRemiss = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLatePayPenalty = null; } else {
      this.fcurLatePayPenalty = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEffLatePayPenaltyRemission = null; } else {
      this.fcurEffLatePayPenaltyRemission = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExcEffLatePayPenaltyRemiss = null; } else {
      this.fblnExcEffLatePayPenaltyRemiss = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyPost = null; } else {
      this.fcurPenaltyPost = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEffInterestRemission = null; } else {
      this.fcurEffInterestRemission = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExcEffInterestRemission = null; } else {
      this.fblnExcEffInterestRemission = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestPost = null; } else {
      this.fcurInterestPost = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvAdjustment = null; } else {
      this.fcurCnvAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvOriginalAdjustment = null; } else {
      this.fcurCnvOriginalAdjustment = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtngstconverted o = (tblnz_rtngstconverted) super.clone();
    o.fdtmLegacyPNIDate = (o.fdtmLegacyPNIDate != null) ? (java.sql.Timestamp) o.fdtmLegacyPNIDate.clone() : null;
    o.fdtmLegacyCreditInterestThru = (o.fdtmLegacyCreditInterestThru != null) ? (java.sql.Timestamp) o.fdtmLegacyCreditInterestThru.clone() : null;
    o.fdtmLastStatementDate = (o.fdtmLastStatementDate != null) ? (java.sql.Timestamp) o.fdtmLastStatementDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtngstconverted o) throws CloneNotSupportedException {
    o.fdtmLegacyPNIDate = (o.fdtmLegacyPNIDate != null) ? (java.sql.Timestamp) o.fdtmLegacyPNIDate.clone() : null;
    o.fdtmLegacyCreditInterestThru = (o.fdtmLegacyCreditInterestThru != null) ? (java.sql.Timestamp) o.fdtmLegacyCreditInterestThru.clone() : null;
    o.fdtmLastStatementDate = (o.fdtmLastStatementDate != null) ? (java.sql.Timestamp) o.fdtmLastStatementDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnReturnFiled", this.fblnReturnFiled);
    __sqoop$field_map.put("fdtmLegacyPNIDate", this.fdtmLegacyPNIDate);
    __sqoop$field_map.put("fdtmLegacyCreditInterestThru", this.fdtmLegacyCreditInterestThru);
    __sqoop$field_map.put("fstrAccountReviewType", this.fstrAccountReviewType);
    __sqoop$field_map.put("fblnPeriodAudited", this.fblnPeriodAudited);
    __sqoop$field_map.put("fblnDueDateIssues", this.fblnDueDateIssues);
    __sqoop$field_map.put("fdtmLastStatementDate", this.fdtmLastStatementDate);
    __sqoop$field_map.put("fcurCnvTax", this.fcurCnvTax);
    __sqoop$field_map.put("fcurLateFilePenalty", this.fcurLateFilePenalty);
    __sqoop$field_map.put("fcurLateFilePenaltyRemission", this.fcurLateFilePenaltyRemission);
    __sqoop$field_map.put("fcurEffLateFilePenaltyRemiss", this.fcurEffLateFilePenaltyRemiss);
    __sqoop$field_map.put("fblnExcEffLateFilePenalRemiss", this.fblnExcEffLateFilePenalRemiss);
    __sqoop$field_map.put("fcurLatePayPenalty", this.fcurLatePayPenalty);
    __sqoop$field_map.put("fcurLatePayPenaltyRemission", this.fcurLatePayPenaltyRemission);
    __sqoop$field_map.put("fcurEffLatePayPenaltyRemission", this.fcurEffLatePayPenaltyRemission);
    __sqoop$field_map.put("fblnExcEffLatePayPenaltyRemiss", this.fblnExcEffLatePayPenaltyRemiss);
    __sqoop$field_map.put("fcurPenaltyPost", this.fcurPenaltyPost);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurInterestRemission", this.fcurInterestRemission);
    __sqoop$field_map.put("fcurEffInterestRemission", this.fcurEffInterestRemission);
    __sqoop$field_map.put("fblnExcEffInterestRemission", this.fblnExcEffInterestRemission);
    __sqoop$field_map.put("fcurInterestPost", this.fcurInterestPost);
    __sqoop$field_map.put("fcurCnvAdjustment", this.fcurCnvAdjustment);
    __sqoop$field_map.put("fcurCnvOriginalAdjustment", this.fcurCnvOriginalAdjustment);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnReturnFiled", this.fblnReturnFiled);
    __sqoop$field_map.put("fdtmLegacyPNIDate", this.fdtmLegacyPNIDate);
    __sqoop$field_map.put("fdtmLegacyCreditInterestThru", this.fdtmLegacyCreditInterestThru);
    __sqoop$field_map.put("fstrAccountReviewType", this.fstrAccountReviewType);
    __sqoop$field_map.put("fblnPeriodAudited", this.fblnPeriodAudited);
    __sqoop$field_map.put("fblnDueDateIssues", this.fblnDueDateIssues);
    __sqoop$field_map.put("fdtmLastStatementDate", this.fdtmLastStatementDate);
    __sqoop$field_map.put("fcurCnvTax", this.fcurCnvTax);
    __sqoop$field_map.put("fcurLateFilePenalty", this.fcurLateFilePenalty);
    __sqoop$field_map.put("fcurLateFilePenaltyRemission", this.fcurLateFilePenaltyRemission);
    __sqoop$field_map.put("fcurEffLateFilePenaltyRemiss", this.fcurEffLateFilePenaltyRemiss);
    __sqoop$field_map.put("fblnExcEffLateFilePenalRemiss", this.fblnExcEffLateFilePenalRemiss);
    __sqoop$field_map.put("fcurLatePayPenalty", this.fcurLatePayPenalty);
    __sqoop$field_map.put("fcurLatePayPenaltyRemission", this.fcurLatePayPenaltyRemission);
    __sqoop$field_map.put("fcurEffLatePayPenaltyRemission", this.fcurEffLatePayPenaltyRemission);
    __sqoop$field_map.put("fblnExcEffLatePayPenaltyRemiss", this.fblnExcEffLatePayPenaltyRemiss);
    __sqoop$field_map.put("fcurPenaltyPost", this.fcurPenaltyPost);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurInterestRemission", this.fcurInterestRemission);
    __sqoop$field_map.put("fcurEffInterestRemission", this.fcurEffInterestRemission);
    __sqoop$field_map.put("fblnExcEffInterestRemission", this.fblnExcEffInterestRemission);
    __sqoop$field_map.put("fcurInterestPost", this.fcurInterestPost);
    __sqoop$field_map.put("fcurCnvAdjustment", this.fcurCnvAdjustment);
    __sqoop$field_map.put("fcurCnvOriginalAdjustment", this.fcurCnvOriginalAdjustment);
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
