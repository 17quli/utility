// ORM class for table 'tblbcmcertificate'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:08:00 NZDT 2020
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

public class tblbcmcertificate extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCertificateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.flngCertificateKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngFundKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.flngFundKey = (Integer)value;
      }
    });
    setters.put("fstrCreditType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fstrCreditType = (String)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("fstrExternalId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fstrExternalId = (String)value;
      }
    });
    setters.put("fstrProject", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fstrProject = (String)value;
      }
    });
    setters.put("flngParentCertificateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.flngParentCertificateKey = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurAmountOriginal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fcurAmountOriginal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fcurAmountApproved = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fcurAmountClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountRemaining", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fcurAmountRemaining = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountTransferred", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fcurAmountTransferred = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrApprovedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fstrApprovedBy = (String)value;
      }
    });
    setters.put("fdtmApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fdtmApproved = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDenied", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fdtmDenied = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCertificateBegin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fdtmCertificateBegin = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCertificateEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fdtmCertificateEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnConverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fblnConverted = (Integer)value;
      }
    });
    setters.put("fblnValid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fblnValid = (Integer)value;
      }
    });
    setters.put("fcurPerPeriodClaimCap", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fcurPerPeriodClaimCap = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnAllowOverClaim", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fblnAllowOverClaim = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmcertificate.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblbcmcertificate() {
    init0();
  }
  private Integer flngCertificateKey;
  public Integer get_flngCertificateKey() {
    return flngCertificateKey;
  }
  public void set_flngCertificateKey(Integer flngCertificateKey) {
    this.flngCertificateKey = flngCertificateKey;
  }
  public tblbcmcertificate with_flngCertificateKey(Integer flngCertificateKey) {
    this.flngCertificateKey = flngCertificateKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblbcmcertificate with_flngVer(Integer flngVer) {
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
  public tblbcmcertificate with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngFundKey;
  public Integer get_flngFundKey() {
    return flngFundKey;
  }
  public void set_flngFundKey(Integer flngFundKey) {
    this.flngFundKey = flngFundKey;
  }
  public tblbcmcertificate with_flngFundKey(Integer flngFundKey) {
    this.flngFundKey = flngFundKey;
    return this;
  }
  private String fstrCreditType;
  public String get_fstrCreditType() {
    return fstrCreditType;
  }
  public void set_fstrCreditType(String fstrCreditType) {
    this.fstrCreditType = fstrCreditType;
  }
  public tblbcmcertificate with_fstrCreditType(String fstrCreditType) {
    this.fstrCreditType = fstrCreditType;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblbcmcertificate with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private String fstrExternalId;
  public String get_fstrExternalId() {
    return fstrExternalId;
  }
  public void set_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
  }
  public tblbcmcertificate with_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
    return this;
  }
  private String fstrProject;
  public String get_fstrProject() {
    return fstrProject;
  }
  public void set_fstrProject(String fstrProject) {
    this.fstrProject = fstrProject;
  }
  public tblbcmcertificate with_fstrProject(String fstrProject) {
    this.fstrProject = fstrProject;
    return this;
  }
  private Integer flngParentCertificateKey;
  public Integer get_flngParentCertificateKey() {
    return flngParentCertificateKey;
  }
  public void set_flngParentCertificateKey(Integer flngParentCertificateKey) {
    this.flngParentCertificateKey = flngParentCertificateKey;
  }
  public tblbcmcertificate with_flngParentCertificateKey(Integer flngParentCertificateKey) {
    this.flngParentCertificateKey = flngParentCertificateKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblbcmcertificate with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurAmountOriginal;
  public java.math.BigDecimal get_fcurAmountOriginal() {
    return fcurAmountOriginal;
  }
  public void set_fcurAmountOriginal(java.math.BigDecimal fcurAmountOriginal) {
    this.fcurAmountOriginal = fcurAmountOriginal;
  }
  public tblbcmcertificate with_fcurAmountOriginal(java.math.BigDecimal fcurAmountOriginal) {
    this.fcurAmountOriginal = fcurAmountOriginal;
    return this;
  }
  private java.math.BigDecimal fcurAmountApproved;
  public java.math.BigDecimal get_fcurAmountApproved() {
    return fcurAmountApproved;
  }
  public void set_fcurAmountApproved(java.math.BigDecimal fcurAmountApproved) {
    this.fcurAmountApproved = fcurAmountApproved;
  }
  public tblbcmcertificate with_fcurAmountApproved(java.math.BigDecimal fcurAmountApproved) {
    this.fcurAmountApproved = fcurAmountApproved;
    return this;
  }
  private java.math.BigDecimal fcurAmountClaimed;
  public java.math.BigDecimal get_fcurAmountClaimed() {
    return fcurAmountClaimed;
  }
  public void set_fcurAmountClaimed(java.math.BigDecimal fcurAmountClaimed) {
    this.fcurAmountClaimed = fcurAmountClaimed;
  }
  public tblbcmcertificate with_fcurAmountClaimed(java.math.BigDecimal fcurAmountClaimed) {
    this.fcurAmountClaimed = fcurAmountClaimed;
    return this;
  }
  private java.math.BigDecimal fcurAmountRemaining;
  public java.math.BigDecimal get_fcurAmountRemaining() {
    return fcurAmountRemaining;
  }
  public void set_fcurAmountRemaining(java.math.BigDecimal fcurAmountRemaining) {
    this.fcurAmountRemaining = fcurAmountRemaining;
  }
  public tblbcmcertificate with_fcurAmountRemaining(java.math.BigDecimal fcurAmountRemaining) {
    this.fcurAmountRemaining = fcurAmountRemaining;
    return this;
  }
  private java.math.BigDecimal fcurAmountTransferred;
  public java.math.BigDecimal get_fcurAmountTransferred() {
    return fcurAmountTransferred;
  }
  public void set_fcurAmountTransferred(java.math.BigDecimal fcurAmountTransferred) {
    this.fcurAmountTransferred = fcurAmountTransferred;
  }
  public tblbcmcertificate with_fcurAmountTransferred(java.math.BigDecimal fcurAmountTransferred) {
    this.fcurAmountTransferred = fcurAmountTransferred;
    return this;
  }
  private String fstrApprovedBy;
  public String get_fstrApprovedBy() {
    return fstrApprovedBy;
  }
  public void set_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
  }
  public tblbcmcertificate with_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
    return this;
  }
  private java.sql.Timestamp fdtmApproved;
  public java.sql.Timestamp get_fdtmApproved() {
    return fdtmApproved;
  }
  public void set_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
  }
  public tblbcmcertificate with_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
    return this;
  }
  private java.sql.Timestamp fdtmDenied;
  public java.sql.Timestamp get_fdtmDenied() {
    return fdtmDenied;
  }
  public void set_fdtmDenied(java.sql.Timestamp fdtmDenied) {
    this.fdtmDenied = fdtmDenied;
  }
  public tblbcmcertificate with_fdtmDenied(java.sql.Timestamp fdtmDenied) {
    this.fdtmDenied = fdtmDenied;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblbcmcertificate with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmCertificateBegin;
  public java.sql.Timestamp get_fdtmCertificateBegin() {
    return fdtmCertificateBegin;
  }
  public void set_fdtmCertificateBegin(java.sql.Timestamp fdtmCertificateBegin) {
    this.fdtmCertificateBegin = fdtmCertificateBegin;
  }
  public tblbcmcertificate with_fdtmCertificateBegin(java.sql.Timestamp fdtmCertificateBegin) {
    this.fdtmCertificateBegin = fdtmCertificateBegin;
    return this;
  }
  private java.sql.Timestamp fdtmCertificateEnd;
  public java.sql.Timestamp get_fdtmCertificateEnd() {
    return fdtmCertificateEnd;
  }
  public void set_fdtmCertificateEnd(java.sql.Timestamp fdtmCertificateEnd) {
    this.fdtmCertificateEnd = fdtmCertificateEnd;
  }
  public tblbcmcertificate with_fdtmCertificateEnd(java.sql.Timestamp fdtmCertificateEnd) {
    this.fdtmCertificateEnd = fdtmCertificateEnd;
    return this;
  }
  private Integer fblnConverted;
  public Integer get_fblnConverted() {
    return fblnConverted;
  }
  public void set_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
  }
  public tblbcmcertificate with_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
    return this;
  }
  private Integer fblnValid;
  public Integer get_fblnValid() {
    return fblnValid;
  }
  public void set_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
  }
  public tblbcmcertificate with_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
    return this;
  }
  private java.math.BigDecimal fcurPerPeriodClaimCap;
  public java.math.BigDecimal get_fcurPerPeriodClaimCap() {
    return fcurPerPeriodClaimCap;
  }
  public void set_fcurPerPeriodClaimCap(java.math.BigDecimal fcurPerPeriodClaimCap) {
    this.fcurPerPeriodClaimCap = fcurPerPeriodClaimCap;
  }
  public tblbcmcertificate with_fcurPerPeriodClaimCap(java.math.BigDecimal fcurPerPeriodClaimCap) {
    this.fcurPerPeriodClaimCap = fcurPerPeriodClaimCap;
    return this;
  }
  private Integer fblnAllowOverClaim;
  public Integer get_fblnAllowOverClaim() {
    return fblnAllowOverClaim;
  }
  public void set_fblnAllowOverClaim(Integer fblnAllowOverClaim) {
    this.fblnAllowOverClaim = fblnAllowOverClaim;
  }
  public tblbcmcertificate with_fblnAllowOverClaim(Integer fblnAllowOverClaim) {
    this.fblnAllowOverClaim = fblnAllowOverClaim;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblbcmcertificate with_fstrWho(String fstrWho) {
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
  public tblbcmcertificate with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblbcmcertificate)) {
      return false;
    }
    tblbcmcertificate that = (tblbcmcertificate) o;
    boolean equal = true;
    equal = equal && (this.flngCertificateKey == null ? that.flngCertificateKey == null : this.flngCertificateKey.equals(that.flngCertificateKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFundKey == null ? that.flngFundKey == null : this.flngFundKey.equals(that.flngFundKey));
    equal = equal && (this.fstrCreditType == null ? that.fstrCreditType == null : this.fstrCreditType.equals(that.fstrCreditType));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fstrProject == null ? that.fstrProject == null : this.fstrProject.equals(that.fstrProject));
    equal = equal && (this.flngParentCertificateKey == null ? that.flngParentCertificateKey == null : this.flngParentCertificateKey.equals(that.flngParentCertificateKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurAmountOriginal == null ? that.fcurAmountOriginal == null : this.fcurAmountOriginal.equals(that.fcurAmountOriginal));
    equal = equal && (this.fcurAmountApproved == null ? that.fcurAmountApproved == null : this.fcurAmountApproved.equals(that.fcurAmountApproved));
    equal = equal && (this.fcurAmountClaimed == null ? that.fcurAmountClaimed == null : this.fcurAmountClaimed.equals(that.fcurAmountClaimed));
    equal = equal && (this.fcurAmountRemaining == null ? that.fcurAmountRemaining == null : this.fcurAmountRemaining.equals(that.fcurAmountRemaining));
    equal = equal && (this.fcurAmountTransferred == null ? that.fcurAmountTransferred == null : this.fcurAmountTransferred.equals(that.fcurAmountTransferred));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fdtmDenied == null ? that.fdtmDenied == null : this.fdtmDenied.equals(that.fdtmDenied));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmCertificateBegin == null ? that.fdtmCertificateBegin == null : this.fdtmCertificateBegin.equals(that.fdtmCertificateBegin));
    equal = equal && (this.fdtmCertificateEnd == null ? that.fdtmCertificateEnd == null : this.fdtmCertificateEnd.equals(that.fdtmCertificateEnd));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fcurPerPeriodClaimCap == null ? that.fcurPerPeriodClaimCap == null : this.fcurPerPeriodClaimCap.equals(that.fcurPerPeriodClaimCap));
    equal = equal && (this.fblnAllowOverClaim == null ? that.fblnAllowOverClaim == null : this.fblnAllowOverClaim.equals(that.fblnAllowOverClaim));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblbcmcertificate)) {
      return false;
    }
    tblbcmcertificate that = (tblbcmcertificate) o;
    boolean equal = true;
    equal = equal && (this.flngCertificateKey == null ? that.flngCertificateKey == null : this.flngCertificateKey.equals(that.flngCertificateKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFundKey == null ? that.flngFundKey == null : this.flngFundKey.equals(that.flngFundKey));
    equal = equal && (this.fstrCreditType == null ? that.fstrCreditType == null : this.fstrCreditType.equals(that.fstrCreditType));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fstrProject == null ? that.fstrProject == null : this.fstrProject.equals(that.fstrProject));
    equal = equal && (this.flngParentCertificateKey == null ? that.flngParentCertificateKey == null : this.flngParentCertificateKey.equals(that.flngParentCertificateKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurAmountOriginal == null ? that.fcurAmountOriginal == null : this.fcurAmountOriginal.equals(that.fcurAmountOriginal));
    equal = equal && (this.fcurAmountApproved == null ? that.fcurAmountApproved == null : this.fcurAmountApproved.equals(that.fcurAmountApproved));
    equal = equal && (this.fcurAmountClaimed == null ? that.fcurAmountClaimed == null : this.fcurAmountClaimed.equals(that.fcurAmountClaimed));
    equal = equal && (this.fcurAmountRemaining == null ? that.fcurAmountRemaining == null : this.fcurAmountRemaining.equals(that.fcurAmountRemaining));
    equal = equal && (this.fcurAmountTransferred == null ? that.fcurAmountTransferred == null : this.fcurAmountTransferred.equals(that.fcurAmountTransferred));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fdtmDenied == null ? that.fdtmDenied == null : this.fdtmDenied.equals(that.fdtmDenied));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmCertificateBegin == null ? that.fdtmCertificateBegin == null : this.fdtmCertificateBegin.equals(that.fdtmCertificateBegin));
    equal = equal && (this.fdtmCertificateEnd == null ? that.fdtmCertificateEnd == null : this.fdtmCertificateEnd.equals(that.fdtmCertificateEnd));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fcurPerPeriodClaimCap == null ? that.fcurPerPeriodClaimCap == null : this.fcurPerPeriodClaimCap.equals(that.fcurPerPeriodClaimCap));
    equal = equal && (this.fblnAllowOverClaim == null ? that.fblnAllowOverClaim == null : this.fblnAllowOverClaim.equals(that.fblnAllowOverClaim));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCertificateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngFundKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrCreditType = JdbcWritableBridge.readString(5, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrProject = JdbcWritableBridge.readString(8, __dbResults);
    this.flngParentCertificateKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurAmountOriginal = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurAmountApproved = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurAmountClaimed = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAmountRemaining = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurAmountTransferred = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmDenied = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmCertificateBegin = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fdtmCertificateEnd = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fcurPerPeriodClaimCap = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fblnAllowOverClaim = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCertificateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngFundKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrCreditType = JdbcWritableBridge.readString(5, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrProject = JdbcWritableBridge.readString(8, __dbResults);
    this.flngParentCertificateKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurAmountOriginal = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurAmountApproved = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurAmountClaimed = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAmountRemaining = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurAmountTransferred = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmDenied = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmCertificateBegin = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fdtmCertificateEnd = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fcurPerPeriodClaimCap = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fblnAllowOverClaim = JdbcWritableBridge.readInteger(25, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCertificateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFundKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrProject, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParentCertificateKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountOriginal, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountApproved, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountClaimed, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountRemaining, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountTransferred, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDenied, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCertificateBegin, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCertificateEnd, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPerPeriodClaimCap, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAllowOverClaim, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCertificateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFundKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrProject, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParentCertificateKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountOriginal, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountApproved, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountClaimed, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountRemaining, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountTransferred, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDenied, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCertificateBegin, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCertificateEnd, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPerPeriodClaimCap, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAllowOverClaim, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCertificateKey = null;
    } else {
    this.flngCertificateKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngFundKey = null;
    } else {
    this.flngFundKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreditType = null;
    } else {
    this.fstrCreditType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExternalId = null;
    } else {
    this.fstrExternalId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrProject = null;
    } else {
    this.fstrProject = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngParentCertificateKey = null;
    } else {
    this.flngParentCertificateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountOriginal = null;
    } else {
    this.fcurAmountOriginal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountApproved = null;
    } else {
    this.fcurAmountApproved = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountClaimed = null;
    } else {
    this.fcurAmountClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountRemaining = null;
    } else {
    this.fcurAmountRemaining = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountTransferred = null;
    } else {
    this.fcurAmountTransferred = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrApprovedBy = null;
    } else {
    this.fstrApprovedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApproved = null;
    } else {
    this.fdtmApproved = new Timestamp(__dataIn.readLong());
    this.fdtmApproved.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDenied = null;
    } else {
    this.fdtmDenied = new Timestamp(__dataIn.readLong());
    this.fdtmDenied.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCertificateBegin = null;
    } else {
    this.fdtmCertificateBegin = new Timestamp(__dataIn.readLong());
    this.fdtmCertificateBegin.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCertificateEnd = null;
    } else {
    this.fdtmCertificateEnd = new Timestamp(__dataIn.readLong());
    this.fdtmCertificateEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnConverted = null;
    } else {
    this.fblnConverted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnValid = null;
    } else {
    this.fblnValid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPerPeriodClaimCap = null;
    } else {
    this.fcurPerPeriodClaimCap = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAllowOverClaim = null;
    } else {
    this.fblnAllowOverClaim = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngCertificateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertificateKey);
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
    if (null == this.flngFundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFundKey);
    }
    if (null == this.fstrCreditType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditType);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fstrProject) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProject);
    }
    if (null == this.flngParentCertificateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParentCertificateKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fcurAmountOriginal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountOriginal, __dataOut);
    }
    if (null == this.fcurAmountApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountApproved, __dataOut);
    }
    if (null == this.fcurAmountClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountClaimed, __dataOut);
    }
    if (null == this.fcurAmountRemaining) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountRemaining, __dataOut);
    }
    if (null == this.fcurAmountTransferred) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountTransferred, __dataOut);
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fdtmDenied) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDenied.getTime());
    __dataOut.writeInt(this.fdtmDenied.getNanos());
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fdtmCertificateBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCertificateBegin.getTime());
    __dataOut.writeInt(this.fdtmCertificateBegin.getNanos());
    }
    if (null == this.fdtmCertificateEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCertificateEnd.getTime());
    __dataOut.writeInt(this.fdtmCertificateEnd.getNanos());
    }
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
    }
    if (null == this.fcurPerPeriodClaimCap) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPerPeriodClaimCap, __dataOut);
    }
    if (null == this.fblnAllowOverClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAllowOverClaim);
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
    if (null == this.flngCertificateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertificateKey);
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
    if (null == this.flngFundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFundKey);
    }
    if (null == this.fstrCreditType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditType);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fstrProject) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProject);
    }
    if (null == this.flngParentCertificateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParentCertificateKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fcurAmountOriginal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountOriginal, __dataOut);
    }
    if (null == this.fcurAmountApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountApproved, __dataOut);
    }
    if (null == this.fcurAmountClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountClaimed, __dataOut);
    }
    if (null == this.fcurAmountRemaining) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountRemaining, __dataOut);
    }
    if (null == this.fcurAmountTransferred) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountTransferred, __dataOut);
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fdtmDenied) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDenied.getTime());
    __dataOut.writeInt(this.fdtmDenied.getNanos());
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fdtmCertificateBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCertificateBegin.getTime());
    __dataOut.writeInt(this.fdtmCertificateBegin.getNanos());
    }
    if (null == this.fdtmCertificateEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCertificateEnd.getTime());
    __dataOut.writeInt(this.fdtmCertificateEnd.getNanos());
    }
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
    }
    if (null == this.fcurPerPeriodClaimCap) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPerPeriodClaimCap, __dataOut);
    }
    if (null == this.fblnAllowOverClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAllowOverClaim);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertificateKey==null?"\\N":"" + flngCertificateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFundKey==null?"\\N":"" + flngFundKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditType==null?"\\N":fstrCreditType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProject==null?"\\N":fstrProject, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParentCertificateKey==null?"\\N":"" + flngParentCertificateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountOriginal==null?"\\N":fcurAmountOriginal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountApproved==null?"\\N":fcurAmountApproved.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountClaimed==null?"\\N":fcurAmountClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountRemaining==null?"\\N":fcurAmountRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountTransferred==null?"\\N":fcurAmountTransferred.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDenied==null?"\\N":"" + fdtmDenied, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCertificateBegin==null?"\\N":"" + fdtmCertificateBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCertificateEnd==null?"\\N":"" + fdtmCertificateEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPerPeriodClaimCap==null?"\\N":fcurPerPeriodClaimCap.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAllowOverClaim==null?"\\N":"" + fblnAllowOverClaim, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertificateKey==null?"\\N":"" + flngCertificateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFundKey==null?"\\N":"" + flngFundKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditType==null?"\\N":fstrCreditType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProject==null?"\\N":fstrProject, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParentCertificateKey==null?"\\N":"" + flngParentCertificateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountOriginal==null?"\\N":fcurAmountOriginal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountApproved==null?"\\N":fcurAmountApproved.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountClaimed==null?"\\N":fcurAmountClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountRemaining==null?"\\N":fcurAmountRemaining.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountTransferred==null?"\\N":fcurAmountTransferred.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDenied==null?"\\N":"" + fdtmDenied, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCertificateBegin==null?"\\N":"" + fdtmCertificateBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCertificateEnd==null?"\\N":"" + fdtmCertificateEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPerPeriodClaimCap==null?"\\N":fcurPerPeriodClaimCap.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAllowOverClaim==null?"\\N":"" + fblnAllowOverClaim, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertificateKey = null; } else {
      this.flngCertificateKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFundKey = null; } else {
      this.flngFundKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreditType = null; } else {
      this.fstrCreditType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProject = null; } else {
      this.fstrProject = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParentCertificateKey = null; } else {
      this.flngParentCertificateKey = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountOriginal = null; } else {
      this.fcurAmountOriginal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountApproved = null; } else {
      this.fcurAmountApproved = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountClaimed = null; } else {
      this.fcurAmountClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountRemaining = null; } else {
      this.fcurAmountRemaining = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountTransferred = null; } else {
      this.fcurAmountTransferred = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovedBy = null; } else {
      this.fstrApprovedBy = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDenied = null; } else {
      this.fdtmDenied = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCertificateBegin = null; } else {
      this.fdtmCertificateBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCertificateEnd = null; } else {
      this.fdtmCertificateEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConverted = null; } else {
      this.fblnConverted = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPerPeriodClaimCap = null; } else {
      this.fcurPerPeriodClaimCap = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAllowOverClaim = null; } else {
      this.fblnAllowOverClaim = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertificateKey = null; } else {
      this.flngCertificateKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFundKey = null; } else {
      this.flngFundKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreditType = null; } else {
      this.fstrCreditType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProject = null; } else {
      this.fstrProject = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParentCertificateKey = null; } else {
      this.flngParentCertificateKey = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountOriginal = null; } else {
      this.fcurAmountOriginal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountApproved = null; } else {
      this.fcurAmountApproved = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountClaimed = null; } else {
      this.fcurAmountClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountRemaining = null; } else {
      this.fcurAmountRemaining = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountTransferred = null; } else {
      this.fcurAmountTransferred = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovedBy = null; } else {
      this.fstrApprovedBy = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDenied = null; } else {
      this.fdtmDenied = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCertificateBegin = null; } else {
      this.fdtmCertificateBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCertificateEnd = null; } else {
      this.fdtmCertificateEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConverted = null; } else {
      this.fblnConverted = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPerPeriodClaimCap = null; } else {
      this.fcurPerPeriodClaimCap = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAllowOverClaim = null; } else {
      this.fblnAllowOverClaim = Integer.valueOf(__cur_str);
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
    tblbcmcertificate o = (tblbcmcertificate) super.clone();
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmDenied = (o.fdtmDenied != null) ? (java.sql.Timestamp) o.fdtmDenied.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmCertificateBegin = (o.fdtmCertificateBegin != null) ? (java.sql.Timestamp) o.fdtmCertificateBegin.clone() : null;
    o.fdtmCertificateEnd = (o.fdtmCertificateEnd != null) ? (java.sql.Timestamp) o.fdtmCertificateEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblbcmcertificate o) throws CloneNotSupportedException {
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmDenied = (o.fdtmDenied != null) ? (java.sql.Timestamp) o.fdtmDenied.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmCertificateBegin = (o.fdtmCertificateBegin != null) ? (java.sql.Timestamp) o.fdtmCertificateBegin.clone() : null;
    o.fdtmCertificateEnd = (o.fdtmCertificateEnd != null) ? (java.sql.Timestamp) o.fdtmCertificateEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCertificateKey", this.flngCertificateKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFundKey", this.flngFundKey);
    __sqoop$field_map.put("fstrCreditType", this.fstrCreditType);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fstrProject", this.fstrProject);
    __sqoop$field_map.put("flngParentCertificateKey", this.flngParentCertificateKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurAmountOriginal", this.fcurAmountOriginal);
    __sqoop$field_map.put("fcurAmountApproved", this.fcurAmountApproved);
    __sqoop$field_map.put("fcurAmountClaimed", this.fcurAmountClaimed);
    __sqoop$field_map.put("fcurAmountRemaining", this.fcurAmountRemaining);
    __sqoop$field_map.put("fcurAmountTransferred", this.fcurAmountTransferred);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fdtmDenied", this.fdtmDenied);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmCertificateBegin", this.fdtmCertificateBegin);
    __sqoop$field_map.put("fdtmCertificateEnd", this.fdtmCertificateEnd);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("fcurPerPeriodClaimCap", this.fcurPerPeriodClaimCap);
    __sqoop$field_map.put("fblnAllowOverClaim", this.fblnAllowOverClaim);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCertificateKey", this.flngCertificateKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFundKey", this.flngFundKey);
    __sqoop$field_map.put("fstrCreditType", this.fstrCreditType);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fstrProject", this.fstrProject);
    __sqoop$field_map.put("flngParentCertificateKey", this.flngParentCertificateKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurAmountOriginal", this.fcurAmountOriginal);
    __sqoop$field_map.put("fcurAmountApproved", this.fcurAmountApproved);
    __sqoop$field_map.put("fcurAmountClaimed", this.fcurAmountClaimed);
    __sqoop$field_map.put("fcurAmountRemaining", this.fcurAmountRemaining);
    __sqoop$field_map.put("fcurAmountTransferred", this.fcurAmountTransferred);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fdtmDenied", this.fdtmDenied);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmCertificateBegin", this.fdtmCertificateBegin);
    __sqoop$field_map.put("fdtmCertificateEnd", this.fdtmCertificateEnd);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("fcurPerPeriodClaimCap", this.fcurPerPeriodClaimCap);
    __sqoop$field_map.put("fblnAllowOverClaim", this.fblnAllowOverClaim);
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
