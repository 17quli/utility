// ORM class for table 'tblauditdetail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:19:25 NZDT 2020
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

public class tblauditdetail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAuditkey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.flngAuditkey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrExternalID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fstrExternalID = (String)value;
      }
    });
    setters.put("fstrAuditStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fstrAuditStatus = (String)value;
      }
    });
    setters.put("fstrAuditStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fstrAuditStage = (String)value;
      }
    });
    setters.put("fstrAuditProgram", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fstrAuditProgram = (String)value;
      }
    });
    setters.put("fstrAuditSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fstrAuditSource = (String)value;
      }
    });
    setters.put("fdtmPostingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmPostingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrManager", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fstrManager = (String)value;
      }
    });
    setters.put("fstrApprovedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fstrApprovedBy = (String)value;
      }
    });
    setters.put("fdtmApprovedWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmApprovedWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fstrDescription = (String)value;
      }
    });
    setters.put("fblnApprovalReq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fblnApprovalReq = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriodFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmFilingPeriodFrom = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmFilingPeriodTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmFilingPeriodTo = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmAuditFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmAuditFrom = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmAuditTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmAuditTo = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEffective", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmEffective = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmWorkDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmWorkDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fdtmStatuteDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditdetail.this.fdtmStatuteDate = (java.sql.Timestamp)value;
      }
    });
  }
  public tblauditdetail() {
    init0();
  }
  private Integer flngAuditkey;
  public Integer get_flngAuditkey() {
    return flngAuditkey;
  }
  public void set_flngAuditkey(Integer flngAuditkey) {
    this.flngAuditkey = flngAuditkey;
  }
  public tblauditdetail with_flngAuditkey(Integer flngAuditkey) {
    this.flngAuditkey = flngAuditkey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblauditdetail with_flngVer(Integer flngVer) {
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
  public tblauditdetail with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrExternalID;
  public String get_fstrExternalID() {
    return fstrExternalID;
  }
  public void set_fstrExternalID(String fstrExternalID) {
    this.fstrExternalID = fstrExternalID;
  }
  public tblauditdetail with_fstrExternalID(String fstrExternalID) {
    this.fstrExternalID = fstrExternalID;
    return this;
  }
  private String fstrAuditStatus;
  public String get_fstrAuditStatus() {
    return fstrAuditStatus;
  }
  public void set_fstrAuditStatus(String fstrAuditStatus) {
    this.fstrAuditStatus = fstrAuditStatus;
  }
  public tblauditdetail with_fstrAuditStatus(String fstrAuditStatus) {
    this.fstrAuditStatus = fstrAuditStatus;
    return this;
  }
  private String fstrAuditStage;
  public String get_fstrAuditStage() {
    return fstrAuditStage;
  }
  public void set_fstrAuditStage(String fstrAuditStage) {
    this.fstrAuditStage = fstrAuditStage;
  }
  public tblauditdetail with_fstrAuditStage(String fstrAuditStage) {
    this.fstrAuditStage = fstrAuditStage;
    return this;
  }
  private String fstrAuditProgram;
  public String get_fstrAuditProgram() {
    return fstrAuditProgram;
  }
  public void set_fstrAuditProgram(String fstrAuditProgram) {
    this.fstrAuditProgram = fstrAuditProgram;
  }
  public tblauditdetail with_fstrAuditProgram(String fstrAuditProgram) {
    this.fstrAuditProgram = fstrAuditProgram;
    return this;
  }
  private String fstrAuditSource;
  public String get_fstrAuditSource() {
    return fstrAuditSource;
  }
  public void set_fstrAuditSource(String fstrAuditSource) {
    this.fstrAuditSource = fstrAuditSource;
  }
  public tblauditdetail with_fstrAuditSource(String fstrAuditSource) {
    this.fstrAuditSource = fstrAuditSource;
    return this;
  }
  private java.sql.Timestamp fdtmPostingPeriod;
  public java.sql.Timestamp get_fdtmPostingPeriod() {
    return fdtmPostingPeriod;
  }
  public void set_fdtmPostingPeriod(java.sql.Timestamp fdtmPostingPeriod) {
    this.fdtmPostingPeriod = fdtmPostingPeriod;
  }
  public tblauditdetail with_fdtmPostingPeriod(java.sql.Timestamp fdtmPostingPeriod) {
    this.fdtmPostingPeriod = fdtmPostingPeriod;
    return this;
  }
  private String fstrManager;
  public String get_fstrManager() {
    return fstrManager;
  }
  public void set_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
  }
  public tblauditdetail with_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
    return this;
  }
  private String fstrApprovedBy;
  public String get_fstrApprovedBy() {
    return fstrApprovedBy;
  }
  public void set_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
  }
  public tblauditdetail with_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
    return this;
  }
  private java.sql.Timestamp fdtmApprovedWhen;
  public java.sql.Timestamp get_fdtmApprovedWhen() {
    return fdtmApprovedWhen;
  }
  public void set_fdtmApprovedWhen(java.sql.Timestamp fdtmApprovedWhen) {
    this.fdtmApprovedWhen = fdtmApprovedWhen;
  }
  public tblauditdetail with_fdtmApprovedWhen(java.sql.Timestamp fdtmApprovedWhen) {
    this.fdtmApprovedWhen = fdtmApprovedWhen;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public tblauditdetail with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  private Integer fblnApprovalReq;
  public Integer get_fblnApprovalReq() {
    return fblnApprovalReq;
  }
  public void set_fblnApprovalReq(Integer fblnApprovalReq) {
    this.fblnApprovalReq = fblnApprovalReq;
  }
  public tblauditdetail with_fblnApprovalReq(Integer fblnApprovalReq) {
    this.fblnApprovalReq = fblnApprovalReq;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriodFrom;
  public java.sql.Timestamp get_fdtmFilingPeriodFrom() {
    return fdtmFilingPeriodFrom;
  }
  public void set_fdtmFilingPeriodFrom(java.sql.Timestamp fdtmFilingPeriodFrom) {
    this.fdtmFilingPeriodFrom = fdtmFilingPeriodFrom;
  }
  public tblauditdetail with_fdtmFilingPeriodFrom(java.sql.Timestamp fdtmFilingPeriodFrom) {
    this.fdtmFilingPeriodFrom = fdtmFilingPeriodFrom;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriodTo;
  public java.sql.Timestamp get_fdtmFilingPeriodTo() {
    return fdtmFilingPeriodTo;
  }
  public void set_fdtmFilingPeriodTo(java.sql.Timestamp fdtmFilingPeriodTo) {
    this.fdtmFilingPeriodTo = fdtmFilingPeriodTo;
  }
  public tblauditdetail with_fdtmFilingPeriodTo(java.sql.Timestamp fdtmFilingPeriodTo) {
    this.fdtmFilingPeriodTo = fdtmFilingPeriodTo;
    return this;
  }
  private java.sql.Timestamp fdtmAuditFrom;
  public java.sql.Timestamp get_fdtmAuditFrom() {
    return fdtmAuditFrom;
  }
  public void set_fdtmAuditFrom(java.sql.Timestamp fdtmAuditFrom) {
    this.fdtmAuditFrom = fdtmAuditFrom;
  }
  public tblauditdetail with_fdtmAuditFrom(java.sql.Timestamp fdtmAuditFrom) {
    this.fdtmAuditFrom = fdtmAuditFrom;
    return this;
  }
  private java.sql.Timestamp fdtmAuditTo;
  public java.sql.Timestamp get_fdtmAuditTo() {
    return fdtmAuditTo;
  }
  public void set_fdtmAuditTo(java.sql.Timestamp fdtmAuditTo) {
    this.fdtmAuditTo = fdtmAuditTo;
  }
  public tblauditdetail with_fdtmAuditTo(java.sql.Timestamp fdtmAuditTo) {
    this.fdtmAuditTo = fdtmAuditTo;
    return this;
  }
  private java.sql.Timestamp fdtmEffective;
  public java.sql.Timestamp get_fdtmEffective() {
    return fdtmEffective;
  }
  public void set_fdtmEffective(java.sql.Timestamp fdtmEffective) {
    this.fdtmEffective = fdtmEffective;
  }
  public tblauditdetail with_fdtmEffective(java.sql.Timestamp fdtmEffective) {
    this.fdtmEffective = fdtmEffective;
    return this;
  }
  private java.sql.Timestamp fdtmWorkDate;
  public java.sql.Timestamp get_fdtmWorkDate() {
    return fdtmWorkDate;
  }
  public void set_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
  }
  public tblauditdetail with_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblauditdetail with_fstrWho(String fstrWho) {
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
  public tblauditdetail with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblauditdetail with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private java.sql.Timestamp fdtmStatuteDate;
  public java.sql.Timestamp get_fdtmStatuteDate() {
    return fdtmStatuteDate;
  }
  public void set_fdtmStatuteDate(java.sql.Timestamp fdtmStatuteDate) {
    this.fdtmStatuteDate = fdtmStatuteDate;
  }
  public tblauditdetail with_fdtmStatuteDate(java.sql.Timestamp fdtmStatuteDate) {
    this.fdtmStatuteDate = fdtmStatuteDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditdetail)) {
      return false;
    }
    tblauditdetail that = (tblauditdetail) o;
    boolean equal = true;
    equal = equal && (this.flngAuditkey == null ? that.flngAuditkey == null : this.flngAuditkey.equals(that.flngAuditkey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrExternalID == null ? that.fstrExternalID == null : this.fstrExternalID.equals(that.fstrExternalID));
    equal = equal && (this.fstrAuditStatus == null ? that.fstrAuditStatus == null : this.fstrAuditStatus.equals(that.fstrAuditStatus));
    equal = equal && (this.fstrAuditStage == null ? that.fstrAuditStage == null : this.fstrAuditStage.equals(that.fstrAuditStage));
    equal = equal && (this.fstrAuditProgram == null ? that.fstrAuditProgram == null : this.fstrAuditProgram.equals(that.fstrAuditProgram));
    equal = equal && (this.fstrAuditSource == null ? that.fstrAuditSource == null : this.fstrAuditSource.equals(that.fstrAuditSource));
    equal = equal && (this.fdtmPostingPeriod == null ? that.fdtmPostingPeriod == null : this.fdtmPostingPeriod.equals(that.fdtmPostingPeriod));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fdtmApprovedWhen == null ? that.fdtmApprovedWhen == null : this.fdtmApprovedWhen.equals(that.fdtmApprovedWhen));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fblnApprovalReq == null ? that.fblnApprovalReq == null : this.fblnApprovalReq.equals(that.fblnApprovalReq));
    equal = equal && (this.fdtmFilingPeriodFrom == null ? that.fdtmFilingPeriodFrom == null : this.fdtmFilingPeriodFrom.equals(that.fdtmFilingPeriodFrom));
    equal = equal && (this.fdtmFilingPeriodTo == null ? that.fdtmFilingPeriodTo == null : this.fdtmFilingPeriodTo.equals(that.fdtmFilingPeriodTo));
    equal = equal && (this.fdtmAuditFrom == null ? that.fdtmAuditFrom == null : this.fdtmAuditFrom.equals(that.fdtmAuditFrom));
    equal = equal && (this.fdtmAuditTo == null ? that.fdtmAuditTo == null : this.fdtmAuditTo.equals(that.fdtmAuditTo));
    equal = equal && (this.fdtmEffective == null ? that.fdtmEffective == null : this.fdtmEffective.equals(that.fdtmEffective));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fdtmStatuteDate == null ? that.fdtmStatuteDate == null : this.fdtmStatuteDate.equals(that.fdtmStatuteDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditdetail)) {
      return false;
    }
    tblauditdetail that = (tblauditdetail) o;
    boolean equal = true;
    equal = equal && (this.flngAuditkey == null ? that.flngAuditkey == null : this.flngAuditkey.equals(that.flngAuditkey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrExternalID == null ? that.fstrExternalID == null : this.fstrExternalID.equals(that.fstrExternalID));
    equal = equal && (this.fstrAuditStatus == null ? that.fstrAuditStatus == null : this.fstrAuditStatus.equals(that.fstrAuditStatus));
    equal = equal && (this.fstrAuditStage == null ? that.fstrAuditStage == null : this.fstrAuditStage.equals(that.fstrAuditStage));
    equal = equal && (this.fstrAuditProgram == null ? that.fstrAuditProgram == null : this.fstrAuditProgram.equals(that.fstrAuditProgram));
    equal = equal && (this.fstrAuditSource == null ? that.fstrAuditSource == null : this.fstrAuditSource.equals(that.fstrAuditSource));
    equal = equal && (this.fdtmPostingPeriod == null ? that.fdtmPostingPeriod == null : this.fdtmPostingPeriod.equals(that.fdtmPostingPeriod));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fdtmApprovedWhen == null ? that.fdtmApprovedWhen == null : this.fdtmApprovedWhen.equals(that.fdtmApprovedWhen));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fblnApprovalReq == null ? that.fblnApprovalReq == null : this.fblnApprovalReq.equals(that.fblnApprovalReq));
    equal = equal && (this.fdtmFilingPeriodFrom == null ? that.fdtmFilingPeriodFrom == null : this.fdtmFilingPeriodFrom.equals(that.fdtmFilingPeriodFrom));
    equal = equal && (this.fdtmFilingPeriodTo == null ? that.fdtmFilingPeriodTo == null : this.fdtmFilingPeriodTo.equals(that.fdtmFilingPeriodTo));
    equal = equal && (this.fdtmAuditFrom == null ? that.fdtmAuditFrom == null : this.fdtmAuditFrom.equals(that.fdtmAuditFrom));
    equal = equal && (this.fdtmAuditTo == null ? that.fdtmAuditTo == null : this.fdtmAuditTo.equals(that.fdtmAuditTo));
    equal = equal && (this.fdtmEffective == null ? that.fdtmEffective == null : this.fdtmEffective.equals(that.fdtmEffective));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fdtmStatuteDate == null ? that.fdtmStatuteDate == null : this.fdtmStatuteDate.equals(that.fdtmStatuteDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAuditkey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrExternalID = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrAuditStatus = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAuditStage = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrAuditProgram = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrAuditSource = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmPostingPeriod = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmApprovedWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnApprovalReq = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmFilingPeriodFrom = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmFilingPeriodTo = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmAuditFrom = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmAuditTo = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmEffective = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fdtmStatuteDate = JdbcWritableBridge.readTimestamp(24, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAuditkey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrExternalID = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrAuditStatus = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAuditStage = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrAuditProgram = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrAuditSource = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmPostingPeriod = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmApprovedWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnApprovalReq = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmFilingPeriodFrom = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmFilingPeriodTo = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmAuditFrom = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmAuditTo = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmEffective = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fdtmStatuteDate = JdbcWritableBridge.readTimestamp(24, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAuditkey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalID, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditStatus, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditStage, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditProgram, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditSource, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPostingPeriod, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApprovedWhen, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnApprovalReq, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriodFrom, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriodTo, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAuditFrom, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAuditTo, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffective, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatuteDate, 24 + __off, 93, __dbStmt);
    return 24;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAuditkey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalID, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditStatus, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditStage, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditProgram, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditSource, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPostingPeriod, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApprovedWhen, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnApprovalReq, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriodFrom, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriodTo, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAuditFrom, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAuditTo, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffective, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatuteDate, 24 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngAuditkey = null;
    } else {
    this.flngAuditkey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrExternalID = null;
    } else {
    this.fstrExternalID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditStatus = null;
    } else {
    this.fstrAuditStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditStage = null;
    } else {
    this.fstrAuditStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditProgram = null;
    } else {
    this.fstrAuditProgram = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditSource = null;
    } else {
    this.fstrAuditSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPostingPeriod = null;
    } else {
    this.fdtmPostingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmPostingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrManager = null;
    } else {
    this.fstrManager = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrApprovedBy = null;
    } else {
    this.fstrApprovedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApprovedWhen = null;
    } else {
    this.fdtmApprovedWhen = new Timestamp(__dataIn.readLong());
    this.fdtmApprovedWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDescription = null;
    } else {
    this.fstrDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnApprovalReq = null;
    } else {
    this.fblnApprovalReq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriodFrom = null;
    } else {
    this.fdtmFilingPeriodFrom = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriodFrom.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriodTo = null;
    } else {
    this.fdtmFilingPeriodTo = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriodTo.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAuditFrom = null;
    } else {
    this.fdtmAuditFrom = new Timestamp(__dataIn.readLong());
    this.fdtmAuditFrom.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAuditTo = null;
    } else {
    this.fdtmAuditTo = new Timestamp(__dataIn.readLong());
    this.fdtmAuditTo.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffective = null;
    } else {
    this.fdtmEffective = new Timestamp(__dataIn.readLong());
    this.fdtmEffective.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWorkDate = null;
    } else {
    this.fdtmWorkDate = new Timestamp(__dataIn.readLong());
    this.fdtmWorkDate.setNanos(__dataIn.readInt());
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
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStatuteDate = null;
    } else {
    this.fdtmStatuteDate = new Timestamp(__dataIn.readLong());
    this.fdtmStatuteDate.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngAuditkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditkey);
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
    if (null == this.fstrExternalID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalID);
    }
    if (null == this.fstrAuditStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditStatus);
    }
    if (null == this.fstrAuditStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditStage);
    }
    if (null == this.fstrAuditProgram) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditProgram);
    }
    if (null == this.fstrAuditSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditSource);
    }
    if (null == this.fdtmPostingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPostingPeriod.getTime());
    __dataOut.writeInt(this.fdtmPostingPeriod.getNanos());
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fdtmApprovedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApprovedWhen.getTime());
    __dataOut.writeInt(this.fdtmApprovedWhen.getNanos());
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fblnApprovalReq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnApprovalReq);
    }
    if (null == this.fdtmFilingPeriodFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriodFrom.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriodFrom.getNanos());
    }
    if (null == this.fdtmFilingPeriodTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriodTo.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriodTo.getNanos());
    }
    if (null == this.fdtmAuditFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAuditFrom.getTime());
    __dataOut.writeInt(this.fdtmAuditFrom.getNanos());
    }
    if (null == this.fdtmAuditTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAuditTo.getTime());
    __dataOut.writeInt(this.fdtmAuditTo.getNanos());
    }
    if (null == this.fdtmEffective) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffective.getTime());
    __dataOut.writeInt(this.fdtmEffective.getNanos());
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
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
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fdtmStatuteDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatuteDate.getTime());
    __dataOut.writeInt(this.fdtmStatuteDate.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngAuditkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditkey);
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
    if (null == this.fstrExternalID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalID);
    }
    if (null == this.fstrAuditStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditStatus);
    }
    if (null == this.fstrAuditStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditStage);
    }
    if (null == this.fstrAuditProgram) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditProgram);
    }
    if (null == this.fstrAuditSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditSource);
    }
    if (null == this.fdtmPostingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPostingPeriod.getTime());
    __dataOut.writeInt(this.fdtmPostingPeriod.getNanos());
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fdtmApprovedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApprovedWhen.getTime());
    __dataOut.writeInt(this.fdtmApprovedWhen.getNanos());
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fblnApprovalReq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnApprovalReq);
    }
    if (null == this.fdtmFilingPeriodFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriodFrom.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriodFrom.getNanos());
    }
    if (null == this.fdtmFilingPeriodTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriodTo.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriodTo.getNanos());
    }
    if (null == this.fdtmAuditFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAuditFrom.getTime());
    __dataOut.writeInt(this.fdtmAuditFrom.getNanos());
    }
    if (null == this.fdtmAuditTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAuditTo.getTime());
    __dataOut.writeInt(this.fdtmAuditTo.getNanos());
    }
    if (null == this.fdtmEffective) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffective.getTime());
    __dataOut.writeInt(this.fdtmEffective.getNanos());
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
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
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fdtmStatuteDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatuteDate.getTime());
    __dataOut.writeInt(this.fdtmStatuteDate.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditkey==null?"\\N":"" + flngAuditkey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalID==null?"\\N":fstrExternalID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditStatus==null?"\\N":fstrAuditStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditStage==null?"\\N":fstrAuditStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditProgram==null?"\\N":fstrAuditProgram, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditSource==null?"\\N":fstrAuditSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPostingPeriod==null?"\\N":"" + fdtmPostingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApprovedWhen==null?"\\N":"" + fdtmApprovedWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnApprovalReq==null?"\\N":"" + fblnApprovalReq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriodFrom==null?"\\N":"" + fdtmFilingPeriodFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriodTo==null?"\\N":"" + fdtmFilingPeriodTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAuditFrom==null?"\\N":"" + fdtmAuditFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAuditTo==null?"\\N":"" + fdtmAuditTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffective==null?"\\N":"" + fdtmEffective, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatuteDate==null?"\\N":"" + fdtmStatuteDate, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditkey==null?"\\N":"" + flngAuditkey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalID==null?"\\N":fstrExternalID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditStatus==null?"\\N":fstrAuditStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditStage==null?"\\N":fstrAuditStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditProgram==null?"\\N":fstrAuditProgram, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditSource==null?"\\N":fstrAuditSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPostingPeriod==null?"\\N":"" + fdtmPostingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApprovedWhen==null?"\\N":"" + fdtmApprovedWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnApprovalReq==null?"\\N":"" + fblnApprovalReq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriodFrom==null?"\\N":"" + fdtmFilingPeriodFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriodTo==null?"\\N":"" + fdtmFilingPeriodTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAuditFrom==null?"\\N":"" + fdtmAuditFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAuditTo==null?"\\N":"" + fdtmAuditTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffective==null?"\\N":"" + fdtmEffective, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatuteDate==null?"\\N":"" + fdtmStatuteDate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditkey = null; } else {
      this.flngAuditkey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrExternalID = null; } else {
      this.fstrExternalID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditStatus = null; } else {
      this.fstrAuditStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditStage = null; } else {
      this.fstrAuditStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditProgram = null; } else {
      this.fstrAuditProgram = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditSource = null; } else {
      this.fstrAuditSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPostingPeriod = null; } else {
      this.fdtmPostingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApprovedWhen = null; } else {
      this.fdtmApprovedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnApprovalReq = null; } else {
      this.fblnApprovalReq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriodFrom = null; } else {
      this.fdtmFilingPeriodFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriodTo = null; } else {
      this.fdtmFilingPeriodTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAuditFrom = null; } else {
      this.fdtmAuditFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAuditTo = null; } else {
      this.fdtmAuditTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffective = null; } else {
      this.fdtmEffective = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStatuteDate = null; } else {
      this.fdtmStatuteDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditkey = null; } else {
      this.flngAuditkey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrExternalID = null; } else {
      this.fstrExternalID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditStatus = null; } else {
      this.fstrAuditStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditStage = null; } else {
      this.fstrAuditStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditProgram = null; } else {
      this.fstrAuditProgram = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditSource = null; } else {
      this.fstrAuditSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPostingPeriod = null; } else {
      this.fdtmPostingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApprovedWhen = null; } else {
      this.fdtmApprovedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnApprovalReq = null; } else {
      this.fblnApprovalReq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriodFrom = null; } else {
      this.fdtmFilingPeriodFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriodTo = null; } else {
      this.fdtmFilingPeriodTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAuditFrom = null; } else {
      this.fdtmAuditFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAuditTo = null; } else {
      this.fdtmAuditTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffective = null; } else {
      this.fdtmEffective = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStatuteDate = null; } else {
      this.fdtmStatuteDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblauditdetail o = (tblauditdetail) super.clone();
    o.fdtmPostingPeriod = (o.fdtmPostingPeriod != null) ? (java.sql.Timestamp) o.fdtmPostingPeriod.clone() : null;
    o.fdtmApprovedWhen = (o.fdtmApprovedWhen != null) ? (java.sql.Timestamp) o.fdtmApprovedWhen.clone() : null;
    o.fdtmFilingPeriodFrom = (o.fdtmFilingPeriodFrom != null) ? (java.sql.Timestamp) o.fdtmFilingPeriodFrom.clone() : null;
    o.fdtmFilingPeriodTo = (o.fdtmFilingPeriodTo != null) ? (java.sql.Timestamp) o.fdtmFilingPeriodTo.clone() : null;
    o.fdtmAuditFrom = (o.fdtmAuditFrom != null) ? (java.sql.Timestamp) o.fdtmAuditFrom.clone() : null;
    o.fdtmAuditTo = (o.fdtmAuditTo != null) ? (java.sql.Timestamp) o.fdtmAuditTo.clone() : null;
    o.fdtmEffective = (o.fdtmEffective != null) ? (java.sql.Timestamp) o.fdtmEffective.clone() : null;
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    o.fdtmStatuteDate = (o.fdtmStatuteDate != null) ? (java.sql.Timestamp) o.fdtmStatuteDate.clone() : null;
    return o;
  }

  public void clone0(tblauditdetail o) throws CloneNotSupportedException {
    o.fdtmPostingPeriod = (o.fdtmPostingPeriod != null) ? (java.sql.Timestamp) o.fdtmPostingPeriod.clone() : null;
    o.fdtmApprovedWhen = (o.fdtmApprovedWhen != null) ? (java.sql.Timestamp) o.fdtmApprovedWhen.clone() : null;
    o.fdtmFilingPeriodFrom = (o.fdtmFilingPeriodFrom != null) ? (java.sql.Timestamp) o.fdtmFilingPeriodFrom.clone() : null;
    o.fdtmFilingPeriodTo = (o.fdtmFilingPeriodTo != null) ? (java.sql.Timestamp) o.fdtmFilingPeriodTo.clone() : null;
    o.fdtmAuditFrom = (o.fdtmAuditFrom != null) ? (java.sql.Timestamp) o.fdtmAuditFrom.clone() : null;
    o.fdtmAuditTo = (o.fdtmAuditTo != null) ? (java.sql.Timestamp) o.fdtmAuditTo.clone() : null;
    o.fdtmEffective = (o.fdtmEffective != null) ? (java.sql.Timestamp) o.fdtmEffective.clone() : null;
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    o.fdtmStatuteDate = (o.fdtmStatuteDate != null) ? (java.sql.Timestamp) o.fdtmStatuteDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAuditkey", this.flngAuditkey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrExternalID", this.fstrExternalID);
    __sqoop$field_map.put("fstrAuditStatus", this.fstrAuditStatus);
    __sqoop$field_map.put("fstrAuditStage", this.fstrAuditStage);
    __sqoop$field_map.put("fstrAuditProgram", this.fstrAuditProgram);
    __sqoop$field_map.put("fstrAuditSource", this.fstrAuditSource);
    __sqoop$field_map.put("fdtmPostingPeriod", this.fdtmPostingPeriod);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fdtmApprovedWhen", this.fdtmApprovedWhen);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fblnApprovalReq", this.fblnApprovalReq);
    __sqoop$field_map.put("fdtmFilingPeriodFrom", this.fdtmFilingPeriodFrom);
    __sqoop$field_map.put("fdtmFilingPeriodTo", this.fdtmFilingPeriodTo);
    __sqoop$field_map.put("fdtmAuditFrom", this.fdtmAuditFrom);
    __sqoop$field_map.put("fdtmAuditTo", this.fdtmAuditTo);
    __sqoop$field_map.put("fdtmEffective", this.fdtmEffective);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fdtmStatuteDate", this.fdtmStatuteDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAuditkey", this.flngAuditkey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrExternalID", this.fstrExternalID);
    __sqoop$field_map.put("fstrAuditStatus", this.fstrAuditStatus);
    __sqoop$field_map.put("fstrAuditStage", this.fstrAuditStage);
    __sqoop$field_map.put("fstrAuditProgram", this.fstrAuditProgram);
    __sqoop$field_map.put("fstrAuditSource", this.fstrAuditSource);
    __sqoop$field_map.put("fdtmPostingPeriod", this.fdtmPostingPeriod);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fdtmApprovedWhen", this.fdtmApprovedWhen);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fblnApprovalReq", this.fblnApprovalReq);
    __sqoop$field_map.put("fdtmFilingPeriodFrom", this.fdtmFilingPeriodFrom);
    __sqoop$field_map.put("fdtmFilingPeriodTo", this.fdtmFilingPeriodTo);
    __sqoop$field_map.put("fdtmAuditFrom", this.fdtmAuditFrom);
    __sqoop$field_map.put("fdtmAuditTo", this.fdtmAuditTo);
    __sqoop$field_map.put("fdtmEffective", this.fdtmEffective);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fdtmStatuteDate", this.fdtmStatuteDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
