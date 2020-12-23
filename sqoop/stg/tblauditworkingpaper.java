// ORM class for table 'tblauditworkingpaper'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:38:24 NZDT 2020
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

public class tblauditworkingpaper extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngWPKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.flngWPKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrWPId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fstrWPId = (String)value;
      }
    });
    setters.put("flngAuditKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.flngAuditKey = (Integer)value;
      }
    });
    setters.put("fstrStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fstrStatus = (String)value;
      }
    });
    setters.put("fstrWPType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fstrWPType = (String)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fi64DocSetKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fi64DocSetKey = (Long)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("fstrAssignedTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fstrAssignedTo = (String)value;
      }
    });
    setters.put("fstrComment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fstrComment = (String)value;
      }
    });
    setters.put("fstrCreatedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fstrCreatedWho = (String)value;
      }
    });
    setters.put("fdtmCreatedWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fdtmCreatedWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurAmount1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fcurAmount1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmount2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fcurAmount2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngReturnKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.flngReturnKey = (Integer)value;
      }
    });
    setters.put("flngReturnDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.flngReturnDocKey = (Integer)value;
      }
    });
    setters.put("fi64ReturnDocSetKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fi64ReturnDocSetKey = (Long)value;
      }
    });
    setters.put("fblnReturnUpdated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fblnReturnUpdated = (Integer)value;
      }
    });
    setters.put("fblnPostTrans", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fblnPostTrans = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fblnApprovalReq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fblnApprovalReq = (Integer)value;
      }
    });
    setters.put("fblnComplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fblnComplete = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngAttachmentKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.flngAttachmentKey = (Integer)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditworkingpaper.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblauditworkingpaper() {
    init0();
  }
  private Integer flngWPKey;
  public Integer get_flngWPKey() {
    return flngWPKey;
  }
  public void set_flngWPKey(Integer flngWPKey) {
    this.flngWPKey = flngWPKey;
  }
  public tblauditworkingpaper with_flngWPKey(Integer flngWPKey) {
    this.flngWPKey = flngWPKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblauditworkingpaper with_flngVer(Integer flngVer) {
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
  public tblauditworkingpaper with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrWPId;
  public String get_fstrWPId() {
    return fstrWPId;
  }
  public void set_fstrWPId(String fstrWPId) {
    this.fstrWPId = fstrWPId;
  }
  public tblauditworkingpaper with_fstrWPId(String fstrWPId) {
    this.fstrWPId = fstrWPId;
    return this;
  }
  private Integer flngAuditKey;
  public Integer get_flngAuditKey() {
    return flngAuditKey;
  }
  public void set_flngAuditKey(Integer flngAuditKey) {
    this.flngAuditKey = flngAuditKey;
  }
  public tblauditworkingpaper with_flngAuditKey(Integer flngAuditKey) {
    this.flngAuditKey = flngAuditKey;
    return this;
  }
  private String fstrStatus;
  public String get_fstrStatus() {
    return fstrStatus;
  }
  public void set_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
  }
  public tblauditworkingpaper with_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
    return this;
  }
  private String fstrWPType;
  public String get_fstrWPType() {
    return fstrWPType;
  }
  public void set_fstrWPType(String fstrWPType) {
    this.fstrWPType = fstrWPType;
  }
  public tblauditworkingpaper with_fstrWPType(String fstrWPType) {
    this.fstrWPType = fstrWPType;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblauditworkingpaper with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Long fi64DocSetKey;
  public Long get_fi64DocSetKey() {
    return fi64DocSetKey;
  }
  public void set_fi64DocSetKey(Long fi64DocSetKey) {
    this.fi64DocSetKey = fi64DocSetKey;
  }
  public tblauditworkingpaper with_fi64DocSetKey(Long fi64DocSetKey) {
    this.fi64DocSetKey = fi64DocSetKey;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public tblauditworkingpaper with_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
    return this;
  }
  private Integer fintDocVer;
  public Integer get_fintDocVer() {
    return fintDocVer;
  }
  public void set_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
  }
  public tblauditworkingpaper with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private String fstrAssignedTo;
  public String get_fstrAssignedTo() {
    return fstrAssignedTo;
  }
  public void set_fstrAssignedTo(String fstrAssignedTo) {
    this.fstrAssignedTo = fstrAssignedTo;
  }
  public tblauditworkingpaper with_fstrAssignedTo(String fstrAssignedTo) {
    this.fstrAssignedTo = fstrAssignedTo;
    return this;
  }
  private String fstrComment;
  public String get_fstrComment() {
    return fstrComment;
  }
  public void set_fstrComment(String fstrComment) {
    this.fstrComment = fstrComment;
  }
  public tblauditworkingpaper with_fstrComment(String fstrComment) {
    this.fstrComment = fstrComment;
    return this;
  }
  private String fstrCreatedWho;
  public String get_fstrCreatedWho() {
    return fstrCreatedWho;
  }
  public void set_fstrCreatedWho(String fstrCreatedWho) {
    this.fstrCreatedWho = fstrCreatedWho;
  }
  public tblauditworkingpaper with_fstrCreatedWho(String fstrCreatedWho) {
    this.fstrCreatedWho = fstrCreatedWho;
    return this;
  }
  private java.sql.Timestamp fdtmCreatedWhen;
  public java.sql.Timestamp get_fdtmCreatedWhen() {
    return fdtmCreatedWhen;
  }
  public void set_fdtmCreatedWhen(java.sql.Timestamp fdtmCreatedWhen) {
    this.fdtmCreatedWhen = fdtmCreatedWhen;
  }
  public tblauditworkingpaper with_fdtmCreatedWhen(java.sql.Timestamp fdtmCreatedWhen) {
    this.fdtmCreatedWhen = fdtmCreatedWhen;
    return this;
  }
  private java.math.BigDecimal fcurAmount1;
  public java.math.BigDecimal get_fcurAmount1() {
    return fcurAmount1;
  }
  public void set_fcurAmount1(java.math.BigDecimal fcurAmount1) {
    this.fcurAmount1 = fcurAmount1;
  }
  public tblauditworkingpaper with_fcurAmount1(java.math.BigDecimal fcurAmount1) {
    this.fcurAmount1 = fcurAmount1;
    return this;
  }
  private java.math.BigDecimal fcurAmount2;
  public java.math.BigDecimal get_fcurAmount2() {
    return fcurAmount2;
  }
  public void set_fcurAmount2(java.math.BigDecimal fcurAmount2) {
    this.fcurAmount2 = fcurAmount2;
  }
  public tblauditworkingpaper with_fcurAmount2(java.math.BigDecimal fcurAmount2) {
    this.fcurAmount2 = fcurAmount2;
    return this;
  }
  private Integer flngReturnKey;
  public Integer get_flngReturnKey() {
    return flngReturnKey;
  }
  public void set_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
  }
  public tblauditworkingpaper with_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
    return this;
  }
  private Integer flngReturnDocKey;
  public Integer get_flngReturnDocKey() {
    return flngReturnDocKey;
  }
  public void set_flngReturnDocKey(Integer flngReturnDocKey) {
    this.flngReturnDocKey = flngReturnDocKey;
  }
  public tblauditworkingpaper with_flngReturnDocKey(Integer flngReturnDocKey) {
    this.flngReturnDocKey = flngReturnDocKey;
    return this;
  }
  private Long fi64ReturnDocSetKey;
  public Long get_fi64ReturnDocSetKey() {
    return fi64ReturnDocSetKey;
  }
  public void set_fi64ReturnDocSetKey(Long fi64ReturnDocSetKey) {
    this.fi64ReturnDocSetKey = fi64ReturnDocSetKey;
  }
  public tblauditworkingpaper with_fi64ReturnDocSetKey(Long fi64ReturnDocSetKey) {
    this.fi64ReturnDocSetKey = fi64ReturnDocSetKey;
    return this;
  }
  private Integer fblnReturnUpdated;
  public Integer get_fblnReturnUpdated() {
    return fblnReturnUpdated;
  }
  public void set_fblnReturnUpdated(Integer fblnReturnUpdated) {
    this.fblnReturnUpdated = fblnReturnUpdated;
  }
  public tblauditworkingpaper with_fblnReturnUpdated(Integer fblnReturnUpdated) {
    this.fblnReturnUpdated = fblnReturnUpdated;
    return this;
  }
  private Integer fblnPostTrans;
  public Integer get_fblnPostTrans() {
    return fblnPostTrans;
  }
  public void set_fblnPostTrans(Integer fblnPostTrans) {
    this.fblnPostTrans = fblnPostTrans;
  }
  public tblauditworkingpaper with_fblnPostTrans(Integer fblnPostTrans) {
    this.fblnPostTrans = fblnPostTrans;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblauditworkingpaper with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private Integer fblnApprovalReq;
  public Integer get_fblnApprovalReq() {
    return fblnApprovalReq;
  }
  public void set_fblnApprovalReq(Integer fblnApprovalReq) {
    this.fblnApprovalReq = fblnApprovalReq;
  }
  public tblauditworkingpaper with_fblnApprovalReq(Integer fblnApprovalReq) {
    this.fblnApprovalReq = fblnApprovalReq;
    return this;
  }
  private Integer fblnComplete;
  public Integer get_fblnComplete() {
    return fblnComplete;
  }
  public void set_fblnComplete(Integer fblnComplete) {
    this.fblnComplete = fblnComplete;
  }
  public tblauditworkingpaper with_fblnComplete(Integer fblnComplete) {
    this.fblnComplete = fblnComplete;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblauditworkingpaper with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngAttachmentKey;
  public Integer get_flngAttachmentKey() {
    return flngAttachmentKey;
  }
  public void set_flngAttachmentKey(Integer flngAttachmentKey) {
    this.flngAttachmentKey = flngAttachmentKey;
  }
  public tblauditworkingpaper with_flngAttachmentKey(Integer flngAttachmentKey) {
    this.flngAttachmentKey = flngAttachmentKey;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tblauditworkingpaper with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblauditworkingpaper with_fstrWho(String fstrWho) {
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
  public tblauditworkingpaper with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditworkingpaper)) {
      return false;
    }
    tblauditworkingpaper that = (tblauditworkingpaper) o;
    boolean equal = true;
    equal = equal && (this.flngWPKey == null ? that.flngWPKey == null : this.flngWPKey.equals(that.flngWPKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrWPId == null ? that.fstrWPId == null : this.fstrWPId.equals(that.fstrWPId));
    equal = equal && (this.flngAuditKey == null ? that.flngAuditKey == null : this.flngAuditKey.equals(that.flngAuditKey));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrWPType == null ? that.fstrWPType == null : this.fstrWPType.equals(that.fstrWPType));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fi64DocSetKey == null ? that.fi64DocSetKey == null : this.fi64DocSetKey.equals(that.fi64DocSetKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fstrAssignedTo == null ? that.fstrAssignedTo == null : this.fstrAssignedTo.equals(that.fstrAssignedTo));
    equal = equal && (this.fstrComment == null ? that.fstrComment == null : this.fstrComment.equals(that.fstrComment));
    equal = equal && (this.fstrCreatedWho == null ? that.fstrCreatedWho == null : this.fstrCreatedWho.equals(that.fstrCreatedWho));
    equal = equal && (this.fdtmCreatedWhen == null ? that.fdtmCreatedWhen == null : this.fdtmCreatedWhen.equals(that.fdtmCreatedWhen));
    equal = equal && (this.fcurAmount1 == null ? that.fcurAmount1 == null : this.fcurAmount1.equals(that.fcurAmount1));
    equal = equal && (this.fcurAmount2 == null ? that.fcurAmount2 == null : this.fcurAmount2.equals(that.fcurAmount2));
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngReturnDocKey == null ? that.flngReturnDocKey == null : this.flngReturnDocKey.equals(that.flngReturnDocKey));
    equal = equal && (this.fi64ReturnDocSetKey == null ? that.fi64ReturnDocSetKey == null : this.fi64ReturnDocSetKey.equals(that.fi64ReturnDocSetKey));
    equal = equal && (this.fblnReturnUpdated == null ? that.fblnReturnUpdated == null : this.fblnReturnUpdated.equals(that.fblnReturnUpdated));
    equal = equal && (this.fblnPostTrans == null ? that.fblnPostTrans == null : this.fblnPostTrans.equals(that.fblnPostTrans));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fblnApprovalReq == null ? that.fblnApprovalReq == null : this.fblnApprovalReq.equals(that.fblnApprovalReq));
    equal = equal && (this.fblnComplete == null ? that.fblnComplete == null : this.fblnComplete.equals(that.fblnComplete));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngAttachmentKey == null ? that.flngAttachmentKey == null : this.flngAttachmentKey.equals(that.flngAttachmentKey));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditworkingpaper)) {
      return false;
    }
    tblauditworkingpaper that = (tblauditworkingpaper) o;
    boolean equal = true;
    equal = equal && (this.flngWPKey == null ? that.flngWPKey == null : this.flngWPKey.equals(that.flngWPKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrWPId == null ? that.fstrWPId == null : this.fstrWPId.equals(that.fstrWPId));
    equal = equal && (this.flngAuditKey == null ? that.flngAuditKey == null : this.flngAuditKey.equals(that.flngAuditKey));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrWPType == null ? that.fstrWPType == null : this.fstrWPType.equals(that.fstrWPType));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fi64DocSetKey == null ? that.fi64DocSetKey == null : this.fi64DocSetKey.equals(that.fi64DocSetKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fstrAssignedTo == null ? that.fstrAssignedTo == null : this.fstrAssignedTo.equals(that.fstrAssignedTo));
    equal = equal && (this.fstrComment == null ? that.fstrComment == null : this.fstrComment.equals(that.fstrComment));
    equal = equal && (this.fstrCreatedWho == null ? that.fstrCreatedWho == null : this.fstrCreatedWho.equals(that.fstrCreatedWho));
    equal = equal && (this.fdtmCreatedWhen == null ? that.fdtmCreatedWhen == null : this.fdtmCreatedWhen.equals(that.fdtmCreatedWhen));
    equal = equal && (this.fcurAmount1 == null ? that.fcurAmount1 == null : this.fcurAmount1.equals(that.fcurAmount1));
    equal = equal && (this.fcurAmount2 == null ? that.fcurAmount2 == null : this.fcurAmount2.equals(that.fcurAmount2));
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngReturnDocKey == null ? that.flngReturnDocKey == null : this.flngReturnDocKey.equals(that.flngReturnDocKey));
    equal = equal && (this.fi64ReturnDocSetKey == null ? that.fi64ReturnDocSetKey == null : this.fi64ReturnDocSetKey.equals(that.fi64ReturnDocSetKey));
    equal = equal && (this.fblnReturnUpdated == null ? that.fblnReturnUpdated == null : this.fblnReturnUpdated.equals(that.fblnReturnUpdated));
    equal = equal && (this.fblnPostTrans == null ? that.fblnPostTrans == null : this.fblnPostTrans.equals(that.fblnPostTrans));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fblnApprovalReq == null ? that.fblnApprovalReq == null : this.fblnApprovalReq.equals(that.fblnApprovalReq));
    equal = equal && (this.fblnComplete == null ? that.fblnComplete == null : this.fblnComplete.equals(that.fblnComplete));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngAttachmentKey == null ? that.flngAttachmentKey == null : this.flngAttachmentKey.equals(that.flngAttachmentKey));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngWPKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrWPId = JdbcWritableBridge.readString(4, __dbResults);
    this.flngAuditKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrWPType = JdbcWritableBridge.readString(7, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fi64DocSetKey = JdbcWritableBridge.readLong(9, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(10, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrAssignedTo = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrComment = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCreatedWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmCreatedWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fcurAmount1 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurAmount2 = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.flngReturnKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.flngReturnDocKey = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fi64ReturnDocSetKey = JdbcWritableBridge.readLong(20, __dbResults);
    this.fblnReturnUpdated = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnPostTrans = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnApprovalReq = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnComplete = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.flngAttachmentKey = JdbcWritableBridge.readInteger(27, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(29, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(30, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngWPKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrWPId = JdbcWritableBridge.readString(4, __dbResults);
    this.flngAuditKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrWPType = JdbcWritableBridge.readString(7, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fi64DocSetKey = JdbcWritableBridge.readLong(9, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(10, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrAssignedTo = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrComment = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCreatedWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmCreatedWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fcurAmount1 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurAmount2 = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.flngReturnKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.flngReturnDocKey = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fi64ReturnDocSetKey = JdbcWritableBridge.readLong(20, __dbResults);
    this.fblnReturnUpdated = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnPostTrans = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnApprovalReq = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnComplete = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.flngAttachmentKey = JdbcWritableBridge.readInteger(27, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(29, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(30, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngWPKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWPId, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAuditKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWPType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocSetKey, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAssignedTo, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrComment, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreatedWhen, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount1, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount2, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnDocKey, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ReturnDocSetKey, 20 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReturnUpdated, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPostTrans, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnApprovalReq, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnComplete, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAttachmentKey, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 30 + __off, 93, __dbStmt);
    return 30;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngWPKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWPId, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAuditKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWPType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocSetKey, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAssignedTo, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrComment, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreatedWhen, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount1, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount2, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnDocKey, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ReturnDocSetKey, 20 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReturnUpdated, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPostTrans, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnApprovalReq, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnComplete, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAttachmentKey, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 30 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngWPKey = null;
    } else {
    this.flngWPKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrWPId = null;
    } else {
    this.fstrWPId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngAuditKey = null;
    } else {
    this.flngAuditKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStatus = null;
    } else {
    this.fstrStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWPType = null;
    } else {
    this.fstrWPType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64DocSetKey = null;
    } else {
    this.fi64DocSetKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDocType = null;
    } else {
    this.fstrDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocVer = null;
    } else {
    this.fintDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAssignedTo = null;
    } else {
    this.fstrAssignedTo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrComment = null;
    } else {
    this.fstrComment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreatedWho = null;
    } else {
    this.fstrCreatedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreatedWhen = null;
    } else {
    this.fdtmCreatedWhen = new Timestamp(__dataIn.readLong());
    this.fdtmCreatedWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount1 = null;
    } else {
    this.fcurAmount1 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount2 = null;
    } else {
    this.fcurAmount2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngReturnKey = null;
    } else {
    this.flngReturnKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngReturnDocKey = null;
    } else {
    this.flngReturnDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ReturnDocSetKey = null;
    } else {
    this.fi64ReturnDocSetKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReturnUpdated = null;
    } else {
    this.fblnReturnUpdated = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPostTrans = null;
    } else {
    this.fblnPostTrans = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnApprovalReq = null;
    } else {
    this.fblnApprovalReq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnComplete = null;
    } else {
    this.fblnComplete = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAttachmentKey = null;
    } else {
    this.flngAttachmentKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngWPKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWPKey);
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
    if (null == this.fstrWPId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWPId);
    }
    if (null == this.flngAuditKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditKey);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fstrWPType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWPType);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fi64DocSetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocSetKey);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fstrAssignedTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAssignedTo);
    }
    if (null == this.fstrComment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrComment);
    }
    if (null == this.fstrCreatedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedWho);
    }
    if (null == this.fdtmCreatedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreatedWhen.getTime());
    __dataOut.writeInt(this.fdtmCreatedWhen.getNanos());
    }
    if (null == this.fcurAmount1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount1, __dataOut);
    }
    if (null == this.fcurAmount2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount2, __dataOut);
    }
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngReturnDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnDocKey);
    }
    if (null == this.fi64ReturnDocSetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ReturnDocSetKey);
    }
    if (null == this.fblnReturnUpdated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReturnUpdated);
    }
    if (null == this.fblnPostTrans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPostTrans);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fblnApprovalReq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnApprovalReq);
    }
    if (null == this.fblnComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnComplete);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngAttachmentKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAttachmentKey);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
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
    if (null == this.flngWPKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWPKey);
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
    if (null == this.fstrWPId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWPId);
    }
    if (null == this.flngAuditKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditKey);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fstrWPType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWPType);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fi64DocSetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocSetKey);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fstrAssignedTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAssignedTo);
    }
    if (null == this.fstrComment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrComment);
    }
    if (null == this.fstrCreatedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedWho);
    }
    if (null == this.fdtmCreatedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreatedWhen.getTime());
    __dataOut.writeInt(this.fdtmCreatedWhen.getNanos());
    }
    if (null == this.fcurAmount1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount1, __dataOut);
    }
    if (null == this.fcurAmount2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount2, __dataOut);
    }
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngReturnDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnDocKey);
    }
    if (null == this.fi64ReturnDocSetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ReturnDocSetKey);
    }
    if (null == this.fblnReturnUpdated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReturnUpdated);
    }
    if (null == this.fblnPostTrans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPostTrans);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fblnApprovalReq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnApprovalReq);
    }
    if (null == this.fblnComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnComplete);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngAttachmentKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAttachmentKey);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngWPKey==null?"\\N":"" + flngWPKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWPId==null?"\\N":fstrWPId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditKey==null?"\\N":"" + flngAuditKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWPType==null?"\\N":fstrWPType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocSetKey==null?"\\N":"" + fi64DocSetKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAssignedTo==null?"\\N":fstrAssignedTo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrComment==null?"\\N":fstrComment, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedWho==null?"\\N":fstrCreatedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreatedWhen==null?"\\N":"" + fdtmCreatedWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount1==null?"\\N":fcurAmount1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount2==null?"\\N":fcurAmount2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnDocKey==null?"\\N":"" + flngReturnDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ReturnDocSetKey==null?"\\N":"" + fi64ReturnDocSetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReturnUpdated==null?"\\N":"" + fblnReturnUpdated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPostTrans==null?"\\N":"" + fblnPostTrans, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnApprovalReq==null?"\\N":"" + fblnApprovalReq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnComplete==null?"\\N":"" + fblnComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAttachmentKey==null?"\\N":"" + flngAttachmentKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngWPKey==null?"\\N":"" + flngWPKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWPId==null?"\\N":fstrWPId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditKey==null?"\\N":"" + flngAuditKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWPType==null?"\\N":fstrWPType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocSetKey==null?"\\N":"" + fi64DocSetKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAssignedTo==null?"\\N":fstrAssignedTo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrComment==null?"\\N":fstrComment, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedWho==null?"\\N":fstrCreatedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreatedWhen==null?"\\N":"" + fdtmCreatedWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount1==null?"\\N":fcurAmount1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount2==null?"\\N":fcurAmount2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnDocKey==null?"\\N":"" + flngReturnDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ReturnDocSetKey==null?"\\N":"" + fi64ReturnDocSetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReturnUpdated==null?"\\N":"" + fblnReturnUpdated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPostTrans==null?"\\N":"" + fblnPostTrans, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnApprovalReq==null?"\\N":"" + fblnApprovalReq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnComplete==null?"\\N":"" + fblnComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAttachmentKey==null?"\\N":"" + flngAttachmentKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWPKey = null; } else {
      this.flngWPKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrWPId = null; } else {
      this.fstrWPId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditKey = null; } else {
      this.flngAuditKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrWPType = null; } else {
      this.fstrWPType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocSetKey = null; } else {
      this.fi64DocSetKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAssignedTo = null; } else {
      this.fstrAssignedTo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrComment = null; } else {
      this.fstrComment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreatedWho = null; } else {
      this.fstrCreatedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreatedWhen = null; } else {
      this.fdtmCreatedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount1 = null; } else {
      this.fcurAmount1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount2 = null; } else {
      this.fcurAmount2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnDocKey = null; } else {
      this.flngReturnDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ReturnDocSetKey = null; } else {
      this.fi64ReturnDocSetKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReturnUpdated = null; } else {
      this.fblnReturnUpdated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPostTrans = null; } else {
      this.fblnPostTrans = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnApprovalReq = null; } else {
      this.fblnApprovalReq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnComplete = null; } else {
      this.fblnComplete = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAttachmentKey = null; } else {
      this.flngAttachmentKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWPKey = null; } else {
      this.flngWPKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrWPId = null; } else {
      this.fstrWPId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditKey = null; } else {
      this.flngAuditKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrWPType = null; } else {
      this.fstrWPType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocSetKey = null; } else {
      this.fi64DocSetKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAssignedTo = null; } else {
      this.fstrAssignedTo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrComment = null; } else {
      this.fstrComment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreatedWho = null; } else {
      this.fstrCreatedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreatedWhen = null; } else {
      this.fdtmCreatedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount1 = null; } else {
      this.fcurAmount1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount2 = null; } else {
      this.fcurAmount2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnDocKey = null; } else {
      this.flngReturnDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ReturnDocSetKey = null; } else {
      this.fi64ReturnDocSetKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReturnUpdated = null; } else {
      this.fblnReturnUpdated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPostTrans = null; } else {
      this.fblnPostTrans = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnApprovalReq = null; } else {
      this.fblnApprovalReq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnComplete = null; } else {
      this.fblnComplete = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAttachmentKey = null; } else {
      this.flngAttachmentKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
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
    tblauditworkingpaper o = (tblauditworkingpaper) super.clone();
    o.fdtmCreatedWhen = (o.fdtmCreatedWhen != null) ? (java.sql.Timestamp) o.fdtmCreatedWhen.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblauditworkingpaper o) throws CloneNotSupportedException {
    o.fdtmCreatedWhen = (o.fdtmCreatedWhen != null) ? (java.sql.Timestamp) o.fdtmCreatedWhen.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngWPKey", this.flngWPKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrWPId", this.fstrWPId);
    __sqoop$field_map.put("flngAuditKey", this.flngAuditKey);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrWPType", this.fstrWPType);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fi64DocSetKey", this.fi64DocSetKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fstrAssignedTo", this.fstrAssignedTo);
    __sqoop$field_map.put("fstrComment", this.fstrComment);
    __sqoop$field_map.put("fstrCreatedWho", this.fstrCreatedWho);
    __sqoop$field_map.put("fdtmCreatedWhen", this.fdtmCreatedWhen);
    __sqoop$field_map.put("fcurAmount1", this.fcurAmount1);
    __sqoop$field_map.put("fcurAmount2", this.fcurAmount2);
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngReturnDocKey", this.flngReturnDocKey);
    __sqoop$field_map.put("fi64ReturnDocSetKey", this.fi64ReturnDocSetKey);
    __sqoop$field_map.put("fblnReturnUpdated", this.fblnReturnUpdated);
    __sqoop$field_map.put("fblnPostTrans", this.fblnPostTrans);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fblnApprovalReq", this.fblnApprovalReq);
    __sqoop$field_map.put("fblnComplete", this.fblnComplete);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngAttachmentKey", this.flngAttachmentKey);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngWPKey", this.flngWPKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrWPId", this.fstrWPId);
    __sqoop$field_map.put("flngAuditKey", this.flngAuditKey);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrWPType", this.fstrWPType);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fi64DocSetKey", this.fi64DocSetKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fstrAssignedTo", this.fstrAssignedTo);
    __sqoop$field_map.put("fstrComment", this.fstrComment);
    __sqoop$field_map.put("fstrCreatedWho", this.fstrCreatedWho);
    __sqoop$field_map.put("fdtmCreatedWhen", this.fdtmCreatedWhen);
    __sqoop$field_map.put("fcurAmount1", this.fcurAmount1);
    __sqoop$field_map.put("fcurAmount2", this.fcurAmount2);
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngReturnDocKey", this.flngReturnDocKey);
    __sqoop$field_map.put("fi64ReturnDocSetKey", this.fi64ReturnDocSetKey);
    __sqoop$field_map.put("fblnReturnUpdated", this.fblnReturnUpdated);
    __sqoop$field_map.put("fblnPostTrans", this.fblnPostTrans);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fblnApprovalReq", this.fblnApprovalReq);
    __sqoop$field_map.put("fblnComplete", this.fblnComplete);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngAttachmentKey", this.flngAttachmentKey);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
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
