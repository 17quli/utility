// ORM class for table 'tblpayment'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:18:06 NZDT 2020
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

public class tblpayment extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngPaymentKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.flngPaymentKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fintAllocation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fintAllocation = (Integer)value;
      }
    });
    setters.put("fstrSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrSource = (String)value;
      }
    });
    setters.put("fstrPaymentType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrPaymentType = (String)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdtmEffect = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintRetry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fintRetry = (Integer)value;
      }
    });
    setters.put("fblnQueued", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fblnQueued = (Integer)value;
      }
    });
    setters.put("fblnUser", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fblnUser = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fblnDirected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fblnDirected = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrIdType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrIdType = (String)value;
      }
    });
    setters.put("fstrId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrId = (String)value;
      }
    });
    setters.put("fstrAssociatedId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrAssociatedId = (String)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrVoucherType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrVoucherType = (String)value;
      }
    });
    setters.put("fstrOvrIdType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrOvrIdType = (String)value;
      }
    });
    setters.put("fstrOvrId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrOvrId = (String)value;
      }
    });
    setters.put("fstrOvrAssociatedId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrOvrAssociatedId = (String)value;
      }
    });
    setters.put("fstrOvrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrOvrAccountType = (String)value;
      }
    });
    setters.put("fstrOvrVoucherType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrOvrVoucherType = (String)value;
      }
    });
    setters.put("fdtmOvrFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdtmOvrFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrDetails", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrDetails = (String)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrMedia", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrMedia = (String)value;
      }
    });
    setters.put("fstrEffType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrEffType = (String)value;
      }
    });
    setters.put("fstrTraceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrTraceType = (String)value;
      }
    });
    setters.put("fstrTrace", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrTrace = (String)value;
      }
    });
    setters.put("fstrFrgCurrType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrFrgCurrType = (String)value;
      }
    });
    setters.put("fcurFrgAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fcurFrgAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdblFrgRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdblFrgRate = (Double)value;
      }
    });
    setters.put("fstrTransitNum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrTransitNum = (String)value;
      }
    });
    setters.put("fstrAccountNum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrAccountNum = (String)value;
      }
    });
    setters.put("flngBatchKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.flngBatchKey = (Integer)value;
      }
    });
    setters.put("fintBatchSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fintBatchSeq = (Integer)value;
      }
    });
    setters.put("fstrReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrReason = (String)value;
      }
    });
    setters.put("fintProfile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fintProfile = (Integer)value;
      }
    });
    setters.put("fstrStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrStatus = (String)value;
      }
    });
    setters.put("fstrValidationParms", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrValidationParms = (String)value;
      }
    });
    setters.put("fstrUnknown", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrUnknown = (String)value;
      }
    });
    setters.put("fblnSuspended", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fblnSuspended = (Integer)value;
      }
    });
    setters.put("fstrPaymentChanel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrPaymentChanel = (String)value;
      }
    });
    setters.put("fstrDepositType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrDepositType = (String)value;
      }
    });
    setters.put("fdtmDeposit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdtmDeposit = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdtmReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdtmStatus = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrExternalId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrExternalId = (String)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("fdtmBankAdjusted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdtmBankAdjusted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblpayment.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblpayment() {
    init0();
  }
  private Integer flngPaymentKey;
  public Integer get_flngPaymentKey() {
    return flngPaymentKey;
  }
  public void set_flngPaymentKey(Integer flngPaymentKey) {
    this.flngPaymentKey = flngPaymentKey;
  }
  public tblpayment with_flngPaymentKey(Integer flngPaymentKey) {
    this.flngPaymentKey = flngPaymentKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblpayment with_flngVer(Integer flngVer) {
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
  public tblpayment with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer fintAllocation;
  public Integer get_fintAllocation() {
    return fintAllocation;
  }
  public void set_fintAllocation(Integer fintAllocation) {
    this.fintAllocation = fintAllocation;
  }
  public tblpayment with_fintAllocation(Integer fintAllocation) {
    this.fintAllocation = fintAllocation;
    return this;
  }
  private String fstrSource;
  public String get_fstrSource() {
    return fstrSource;
  }
  public void set_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
  }
  public tblpayment with_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
    return this;
  }
  private String fstrPaymentType;
  public String get_fstrPaymentType() {
    return fstrPaymentType;
  }
  public void set_fstrPaymentType(String fstrPaymentType) {
    this.fstrPaymentType = fstrPaymentType;
  }
  public tblpayment with_fstrPaymentType(String fstrPaymentType) {
    this.fstrPaymentType = fstrPaymentType;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblpayment with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private java.sql.Timestamp fdtmEffect;
  public java.sql.Timestamp get_fdtmEffect() {
    return fdtmEffect;
  }
  public void set_fdtmEffect(java.sql.Timestamp fdtmEffect) {
    this.fdtmEffect = fdtmEffect;
  }
  public tblpayment with_fdtmEffect(java.sql.Timestamp fdtmEffect) {
    this.fdtmEffect = fdtmEffect;
    return this;
  }
  private Integer fintRetry;
  public Integer get_fintRetry() {
    return fintRetry;
  }
  public void set_fintRetry(Integer fintRetry) {
    this.fintRetry = fintRetry;
  }
  public tblpayment with_fintRetry(Integer fintRetry) {
    this.fintRetry = fintRetry;
    return this;
  }
  private Integer fblnQueued;
  public Integer get_fblnQueued() {
    return fblnQueued;
  }
  public void set_fblnQueued(Integer fblnQueued) {
    this.fblnQueued = fblnQueued;
  }
  public tblpayment with_fblnQueued(Integer fblnQueued) {
    this.fblnQueued = fblnQueued;
    return this;
  }
  private Integer fblnUser;
  public Integer get_fblnUser() {
    return fblnUser;
  }
  public void set_fblnUser(Integer fblnUser) {
    this.fblnUser = fblnUser;
  }
  public tblpayment with_fblnUser(Integer fblnUser) {
    this.fblnUser = fblnUser;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblpayment with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private Integer fblnDirected;
  public Integer get_fblnDirected() {
    return fblnDirected;
  }
  public void set_fblnDirected(Integer fblnDirected) {
    this.fblnDirected = fblnDirected;
  }
  public tblpayment with_fblnDirected(Integer fblnDirected) {
    this.fblnDirected = fblnDirected;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblpayment with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrIdType;
  public String get_fstrIdType() {
    return fstrIdType;
  }
  public void set_fstrIdType(String fstrIdType) {
    this.fstrIdType = fstrIdType;
  }
  public tblpayment with_fstrIdType(String fstrIdType) {
    this.fstrIdType = fstrIdType;
    return this;
  }
  private String fstrId;
  public String get_fstrId() {
    return fstrId;
  }
  public void set_fstrId(String fstrId) {
    this.fstrId = fstrId;
  }
  public tblpayment with_fstrId(String fstrId) {
    this.fstrId = fstrId;
    return this;
  }
  private String fstrAssociatedId;
  public String get_fstrAssociatedId() {
    return fstrAssociatedId;
  }
  public void set_fstrAssociatedId(String fstrAssociatedId) {
    this.fstrAssociatedId = fstrAssociatedId;
  }
  public tblpayment with_fstrAssociatedId(String fstrAssociatedId) {
    this.fstrAssociatedId = fstrAssociatedId;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblpayment with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblpayment with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrVoucherType;
  public String get_fstrVoucherType() {
    return fstrVoucherType;
  }
  public void set_fstrVoucherType(String fstrVoucherType) {
    this.fstrVoucherType = fstrVoucherType;
  }
  public tblpayment with_fstrVoucherType(String fstrVoucherType) {
    this.fstrVoucherType = fstrVoucherType;
    return this;
  }
  private String fstrOvrIdType;
  public String get_fstrOvrIdType() {
    return fstrOvrIdType;
  }
  public void set_fstrOvrIdType(String fstrOvrIdType) {
    this.fstrOvrIdType = fstrOvrIdType;
  }
  public tblpayment with_fstrOvrIdType(String fstrOvrIdType) {
    this.fstrOvrIdType = fstrOvrIdType;
    return this;
  }
  private String fstrOvrId;
  public String get_fstrOvrId() {
    return fstrOvrId;
  }
  public void set_fstrOvrId(String fstrOvrId) {
    this.fstrOvrId = fstrOvrId;
  }
  public tblpayment with_fstrOvrId(String fstrOvrId) {
    this.fstrOvrId = fstrOvrId;
    return this;
  }
  private String fstrOvrAssociatedId;
  public String get_fstrOvrAssociatedId() {
    return fstrOvrAssociatedId;
  }
  public void set_fstrOvrAssociatedId(String fstrOvrAssociatedId) {
    this.fstrOvrAssociatedId = fstrOvrAssociatedId;
  }
  public tblpayment with_fstrOvrAssociatedId(String fstrOvrAssociatedId) {
    this.fstrOvrAssociatedId = fstrOvrAssociatedId;
    return this;
  }
  private String fstrOvrAccountType;
  public String get_fstrOvrAccountType() {
    return fstrOvrAccountType;
  }
  public void set_fstrOvrAccountType(String fstrOvrAccountType) {
    this.fstrOvrAccountType = fstrOvrAccountType;
  }
  public tblpayment with_fstrOvrAccountType(String fstrOvrAccountType) {
    this.fstrOvrAccountType = fstrOvrAccountType;
    return this;
  }
  private String fstrOvrVoucherType;
  public String get_fstrOvrVoucherType() {
    return fstrOvrVoucherType;
  }
  public void set_fstrOvrVoucherType(String fstrOvrVoucherType) {
    this.fstrOvrVoucherType = fstrOvrVoucherType;
  }
  public tblpayment with_fstrOvrVoucherType(String fstrOvrVoucherType) {
    this.fstrOvrVoucherType = fstrOvrVoucherType;
    return this;
  }
  private java.sql.Timestamp fdtmOvrFilingPeriod;
  public java.sql.Timestamp get_fdtmOvrFilingPeriod() {
    return fdtmOvrFilingPeriod;
  }
  public void set_fdtmOvrFilingPeriod(java.sql.Timestamp fdtmOvrFilingPeriod) {
    this.fdtmOvrFilingPeriod = fdtmOvrFilingPeriod;
  }
  public tblpayment with_fdtmOvrFilingPeriod(java.sql.Timestamp fdtmOvrFilingPeriod) {
    this.fdtmOvrFilingPeriod = fdtmOvrFilingPeriod;
    return this;
  }
  private String fstrDetails;
  public String get_fstrDetails() {
    return fstrDetails;
  }
  public void set_fstrDetails(String fstrDetails) {
    this.fstrDetails = fstrDetails;
  }
  public tblpayment with_fstrDetails(String fstrDetails) {
    this.fstrDetails = fstrDetails;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblpayment with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private String fstrMedia;
  public String get_fstrMedia() {
    return fstrMedia;
  }
  public void set_fstrMedia(String fstrMedia) {
    this.fstrMedia = fstrMedia;
  }
  public tblpayment with_fstrMedia(String fstrMedia) {
    this.fstrMedia = fstrMedia;
    return this;
  }
  private String fstrEffType;
  public String get_fstrEffType() {
    return fstrEffType;
  }
  public void set_fstrEffType(String fstrEffType) {
    this.fstrEffType = fstrEffType;
  }
  public tblpayment with_fstrEffType(String fstrEffType) {
    this.fstrEffType = fstrEffType;
    return this;
  }
  private String fstrTraceType;
  public String get_fstrTraceType() {
    return fstrTraceType;
  }
  public void set_fstrTraceType(String fstrTraceType) {
    this.fstrTraceType = fstrTraceType;
  }
  public tblpayment with_fstrTraceType(String fstrTraceType) {
    this.fstrTraceType = fstrTraceType;
    return this;
  }
  private String fstrTrace;
  public String get_fstrTrace() {
    return fstrTrace;
  }
  public void set_fstrTrace(String fstrTrace) {
    this.fstrTrace = fstrTrace;
  }
  public tblpayment with_fstrTrace(String fstrTrace) {
    this.fstrTrace = fstrTrace;
    return this;
  }
  private String fstrFrgCurrType;
  public String get_fstrFrgCurrType() {
    return fstrFrgCurrType;
  }
  public void set_fstrFrgCurrType(String fstrFrgCurrType) {
    this.fstrFrgCurrType = fstrFrgCurrType;
  }
  public tblpayment with_fstrFrgCurrType(String fstrFrgCurrType) {
    this.fstrFrgCurrType = fstrFrgCurrType;
    return this;
  }
  private java.math.BigDecimal fcurFrgAmount;
  public java.math.BigDecimal get_fcurFrgAmount() {
    return fcurFrgAmount;
  }
  public void set_fcurFrgAmount(java.math.BigDecimal fcurFrgAmount) {
    this.fcurFrgAmount = fcurFrgAmount;
  }
  public tblpayment with_fcurFrgAmount(java.math.BigDecimal fcurFrgAmount) {
    this.fcurFrgAmount = fcurFrgAmount;
    return this;
  }
  private Double fdblFrgRate;
  public Double get_fdblFrgRate() {
    return fdblFrgRate;
  }
  public void set_fdblFrgRate(Double fdblFrgRate) {
    this.fdblFrgRate = fdblFrgRate;
  }
  public tblpayment with_fdblFrgRate(Double fdblFrgRate) {
    this.fdblFrgRate = fdblFrgRate;
    return this;
  }
  private String fstrTransitNum;
  public String get_fstrTransitNum() {
    return fstrTransitNum;
  }
  public void set_fstrTransitNum(String fstrTransitNum) {
    this.fstrTransitNum = fstrTransitNum;
  }
  public tblpayment with_fstrTransitNum(String fstrTransitNum) {
    this.fstrTransitNum = fstrTransitNum;
    return this;
  }
  private String fstrAccountNum;
  public String get_fstrAccountNum() {
    return fstrAccountNum;
  }
  public void set_fstrAccountNum(String fstrAccountNum) {
    this.fstrAccountNum = fstrAccountNum;
  }
  public tblpayment with_fstrAccountNum(String fstrAccountNum) {
    this.fstrAccountNum = fstrAccountNum;
    return this;
  }
  private Integer flngBatchKey;
  public Integer get_flngBatchKey() {
    return flngBatchKey;
  }
  public void set_flngBatchKey(Integer flngBatchKey) {
    this.flngBatchKey = flngBatchKey;
  }
  public tblpayment with_flngBatchKey(Integer flngBatchKey) {
    this.flngBatchKey = flngBatchKey;
    return this;
  }
  private Integer fintBatchSeq;
  public Integer get_fintBatchSeq() {
    return fintBatchSeq;
  }
  public void set_fintBatchSeq(Integer fintBatchSeq) {
    this.fintBatchSeq = fintBatchSeq;
  }
  public tblpayment with_fintBatchSeq(Integer fintBatchSeq) {
    this.fintBatchSeq = fintBatchSeq;
    return this;
  }
  private String fstrReason;
  public String get_fstrReason() {
    return fstrReason;
  }
  public void set_fstrReason(String fstrReason) {
    this.fstrReason = fstrReason;
  }
  public tblpayment with_fstrReason(String fstrReason) {
    this.fstrReason = fstrReason;
    return this;
  }
  private Integer fintProfile;
  public Integer get_fintProfile() {
    return fintProfile;
  }
  public void set_fintProfile(Integer fintProfile) {
    this.fintProfile = fintProfile;
  }
  public tblpayment with_fintProfile(Integer fintProfile) {
    this.fintProfile = fintProfile;
    return this;
  }
  private String fstrStatus;
  public String get_fstrStatus() {
    return fstrStatus;
  }
  public void set_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
  }
  public tblpayment with_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
    return this;
  }
  private String fstrValidationParms;
  public String get_fstrValidationParms() {
    return fstrValidationParms;
  }
  public void set_fstrValidationParms(String fstrValidationParms) {
    this.fstrValidationParms = fstrValidationParms;
  }
  public tblpayment with_fstrValidationParms(String fstrValidationParms) {
    this.fstrValidationParms = fstrValidationParms;
    return this;
  }
  private String fstrUnknown;
  public String get_fstrUnknown() {
    return fstrUnknown;
  }
  public void set_fstrUnknown(String fstrUnknown) {
    this.fstrUnknown = fstrUnknown;
  }
  public tblpayment with_fstrUnknown(String fstrUnknown) {
    this.fstrUnknown = fstrUnknown;
    return this;
  }
  private Integer fblnSuspended;
  public Integer get_fblnSuspended() {
    return fblnSuspended;
  }
  public void set_fblnSuspended(Integer fblnSuspended) {
    this.fblnSuspended = fblnSuspended;
  }
  public tblpayment with_fblnSuspended(Integer fblnSuspended) {
    this.fblnSuspended = fblnSuspended;
    return this;
  }
  private String fstrPaymentChanel;
  public String get_fstrPaymentChanel() {
    return fstrPaymentChanel;
  }
  public void set_fstrPaymentChanel(String fstrPaymentChanel) {
    this.fstrPaymentChanel = fstrPaymentChanel;
  }
  public tblpayment with_fstrPaymentChanel(String fstrPaymentChanel) {
    this.fstrPaymentChanel = fstrPaymentChanel;
    return this;
  }
  private String fstrDepositType;
  public String get_fstrDepositType() {
    return fstrDepositType;
  }
  public void set_fstrDepositType(String fstrDepositType) {
    this.fstrDepositType = fstrDepositType;
  }
  public tblpayment with_fstrDepositType(String fstrDepositType) {
    this.fstrDepositType = fstrDepositType;
    return this;
  }
  private java.sql.Timestamp fdtmDeposit;
  public java.sql.Timestamp get_fdtmDeposit() {
    return fdtmDeposit;
  }
  public void set_fdtmDeposit(java.sql.Timestamp fdtmDeposit) {
    this.fdtmDeposit = fdtmDeposit;
  }
  public tblpayment with_fdtmDeposit(java.sql.Timestamp fdtmDeposit) {
    this.fdtmDeposit = fdtmDeposit;
    return this;
  }
  private java.sql.Timestamp fdtmReceived;
  public java.sql.Timestamp get_fdtmReceived() {
    return fdtmReceived;
  }
  public void set_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
  }
  public tblpayment with_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
    return this;
  }
  private java.sql.Timestamp fdtmStatus;
  public java.sql.Timestamp get_fdtmStatus() {
    return fdtmStatus;
  }
  public void set_fdtmStatus(java.sql.Timestamp fdtmStatus) {
    this.fdtmStatus = fdtmStatus;
  }
  public tblpayment with_fdtmStatus(java.sql.Timestamp fdtmStatus) {
    this.fdtmStatus = fdtmStatus;
    return this;
  }
  private String fstrExternalId;
  public String get_fstrExternalId() {
    return fstrExternalId;
  }
  public void set_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
  }
  public tblpayment with_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tblpayment with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private java.sql.Timestamp fdtmBankAdjusted;
  public java.sql.Timestamp get_fdtmBankAdjusted() {
    return fdtmBankAdjusted;
  }
  public void set_fdtmBankAdjusted(java.sql.Timestamp fdtmBankAdjusted) {
    this.fdtmBankAdjusted = fdtmBankAdjusted;
  }
  public tblpayment with_fdtmBankAdjusted(java.sql.Timestamp fdtmBankAdjusted) {
    this.fdtmBankAdjusted = fdtmBankAdjusted;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblpayment with_fstrWho(String fstrWho) {
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
  public tblpayment with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblpayment)) {
      return false;
    }
    tblpayment that = (tblpayment) o;
    boolean equal = true;
    equal = equal && (this.flngPaymentKey == null ? that.flngPaymentKey == null : this.flngPaymentKey.equals(that.flngPaymentKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fintAllocation == null ? that.fintAllocation == null : this.fintAllocation.equals(that.fintAllocation));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fstrPaymentType == null ? that.fstrPaymentType == null : this.fstrPaymentType.equals(that.fstrPaymentType));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fdtmEffect == null ? that.fdtmEffect == null : this.fdtmEffect.equals(that.fdtmEffect));
    equal = equal && (this.fintRetry == null ? that.fintRetry == null : this.fintRetry.equals(that.fintRetry));
    equal = equal && (this.fblnQueued == null ? that.fblnQueued == null : this.fblnQueued.equals(that.fblnQueued));
    equal = equal && (this.fblnUser == null ? that.fblnUser == null : this.fblnUser.equals(that.fblnUser));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fblnDirected == null ? that.fblnDirected == null : this.fblnDirected.equals(that.fblnDirected));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrAssociatedId == null ? that.fstrAssociatedId == null : this.fstrAssociatedId.equals(that.fstrAssociatedId));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrVoucherType == null ? that.fstrVoucherType == null : this.fstrVoucherType.equals(that.fstrVoucherType));
    equal = equal && (this.fstrOvrIdType == null ? that.fstrOvrIdType == null : this.fstrOvrIdType.equals(that.fstrOvrIdType));
    equal = equal && (this.fstrOvrId == null ? that.fstrOvrId == null : this.fstrOvrId.equals(that.fstrOvrId));
    equal = equal && (this.fstrOvrAssociatedId == null ? that.fstrOvrAssociatedId == null : this.fstrOvrAssociatedId.equals(that.fstrOvrAssociatedId));
    equal = equal && (this.fstrOvrAccountType == null ? that.fstrOvrAccountType == null : this.fstrOvrAccountType.equals(that.fstrOvrAccountType));
    equal = equal && (this.fstrOvrVoucherType == null ? that.fstrOvrVoucherType == null : this.fstrOvrVoucherType.equals(that.fstrOvrVoucherType));
    equal = equal && (this.fdtmOvrFilingPeriod == null ? that.fdtmOvrFilingPeriod == null : this.fdtmOvrFilingPeriod.equals(that.fdtmOvrFilingPeriod));
    equal = equal && (this.fstrDetails == null ? that.fstrDetails == null : this.fstrDetails.equals(that.fstrDetails));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrMedia == null ? that.fstrMedia == null : this.fstrMedia.equals(that.fstrMedia));
    equal = equal && (this.fstrEffType == null ? that.fstrEffType == null : this.fstrEffType.equals(that.fstrEffType));
    equal = equal && (this.fstrTraceType == null ? that.fstrTraceType == null : this.fstrTraceType.equals(that.fstrTraceType));
    equal = equal && (this.fstrTrace == null ? that.fstrTrace == null : this.fstrTrace.equals(that.fstrTrace));
    equal = equal && (this.fstrFrgCurrType == null ? that.fstrFrgCurrType == null : this.fstrFrgCurrType.equals(that.fstrFrgCurrType));
    equal = equal && (this.fcurFrgAmount == null ? that.fcurFrgAmount == null : this.fcurFrgAmount.equals(that.fcurFrgAmount));
    equal = equal && (this.fdblFrgRate == null ? that.fdblFrgRate == null : this.fdblFrgRate.equals(that.fdblFrgRate));
    equal = equal && (this.fstrTransitNum == null ? that.fstrTransitNum == null : this.fstrTransitNum.equals(that.fstrTransitNum));
    equal = equal && (this.fstrAccountNum == null ? that.fstrAccountNum == null : this.fstrAccountNum.equals(that.fstrAccountNum));
    equal = equal && (this.flngBatchKey == null ? that.flngBatchKey == null : this.flngBatchKey.equals(that.flngBatchKey));
    equal = equal && (this.fintBatchSeq == null ? that.fintBatchSeq == null : this.fintBatchSeq.equals(that.fintBatchSeq));
    equal = equal && (this.fstrReason == null ? that.fstrReason == null : this.fstrReason.equals(that.fstrReason));
    equal = equal && (this.fintProfile == null ? that.fintProfile == null : this.fintProfile.equals(that.fintProfile));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrValidationParms == null ? that.fstrValidationParms == null : this.fstrValidationParms.equals(that.fstrValidationParms));
    equal = equal && (this.fstrUnknown == null ? that.fstrUnknown == null : this.fstrUnknown.equals(that.fstrUnknown));
    equal = equal && (this.fblnSuspended == null ? that.fblnSuspended == null : this.fblnSuspended.equals(that.fblnSuspended));
    equal = equal && (this.fstrPaymentChanel == null ? that.fstrPaymentChanel == null : this.fstrPaymentChanel.equals(that.fstrPaymentChanel));
    equal = equal && (this.fstrDepositType == null ? that.fstrDepositType == null : this.fstrDepositType.equals(that.fstrDepositType));
    equal = equal && (this.fdtmDeposit == null ? that.fdtmDeposit == null : this.fdtmDeposit.equals(that.fdtmDeposit));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fdtmStatus == null ? that.fdtmStatus == null : this.fdtmStatus.equals(that.fdtmStatus));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fdtmBankAdjusted == null ? that.fdtmBankAdjusted == null : this.fdtmBankAdjusted.equals(that.fdtmBankAdjusted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblpayment)) {
      return false;
    }
    tblpayment that = (tblpayment) o;
    boolean equal = true;
    equal = equal && (this.flngPaymentKey == null ? that.flngPaymentKey == null : this.flngPaymentKey.equals(that.flngPaymentKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fintAllocation == null ? that.fintAllocation == null : this.fintAllocation.equals(that.fintAllocation));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fstrPaymentType == null ? that.fstrPaymentType == null : this.fstrPaymentType.equals(that.fstrPaymentType));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fdtmEffect == null ? that.fdtmEffect == null : this.fdtmEffect.equals(that.fdtmEffect));
    equal = equal && (this.fintRetry == null ? that.fintRetry == null : this.fintRetry.equals(that.fintRetry));
    equal = equal && (this.fblnQueued == null ? that.fblnQueued == null : this.fblnQueued.equals(that.fblnQueued));
    equal = equal && (this.fblnUser == null ? that.fblnUser == null : this.fblnUser.equals(that.fblnUser));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fblnDirected == null ? that.fblnDirected == null : this.fblnDirected.equals(that.fblnDirected));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrAssociatedId == null ? that.fstrAssociatedId == null : this.fstrAssociatedId.equals(that.fstrAssociatedId));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrVoucherType == null ? that.fstrVoucherType == null : this.fstrVoucherType.equals(that.fstrVoucherType));
    equal = equal && (this.fstrOvrIdType == null ? that.fstrOvrIdType == null : this.fstrOvrIdType.equals(that.fstrOvrIdType));
    equal = equal && (this.fstrOvrId == null ? that.fstrOvrId == null : this.fstrOvrId.equals(that.fstrOvrId));
    equal = equal && (this.fstrOvrAssociatedId == null ? that.fstrOvrAssociatedId == null : this.fstrOvrAssociatedId.equals(that.fstrOvrAssociatedId));
    equal = equal && (this.fstrOvrAccountType == null ? that.fstrOvrAccountType == null : this.fstrOvrAccountType.equals(that.fstrOvrAccountType));
    equal = equal && (this.fstrOvrVoucherType == null ? that.fstrOvrVoucherType == null : this.fstrOvrVoucherType.equals(that.fstrOvrVoucherType));
    equal = equal && (this.fdtmOvrFilingPeriod == null ? that.fdtmOvrFilingPeriod == null : this.fdtmOvrFilingPeriod.equals(that.fdtmOvrFilingPeriod));
    equal = equal && (this.fstrDetails == null ? that.fstrDetails == null : this.fstrDetails.equals(that.fstrDetails));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrMedia == null ? that.fstrMedia == null : this.fstrMedia.equals(that.fstrMedia));
    equal = equal && (this.fstrEffType == null ? that.fstrEffType == null : this.fstrEffType.equals(that.fstrEffType));
    equal = equal && (this.fstrTraceType == null ? that.fstrTraceType == null : this.fstrTraceType.equals(that.fstrTraceType));
    equal = equal && (this.fstrTrace == null ? that.fstrTrace == null : this.fstrTrace.equals(that.fstrTrace));
    equal = equal && (this.fstrFrgCurrType == null ? that.fstrFrgCurrType == null : this.fstrFrgCurrType.equals(that.fstrFrgCurrType));
    equal = equal && (this.fcurFrgAmount == null ? that.fcurFrgAmount == null : this.fcurFrgAmount.equals(that.fcurFrgAmount));
    equal = equal && (this.fdblFrgRate == null ? that.fdblFrgRate == null : this.fdblFrgRate.equals(that.fdblFrgRate));
    equal = equal && (this.fstrTransitNum == null ? that.fstrTransitNum == null : this.fstrTransitNum.equals(that.fstrTransitNum));
    equal = equal && (this.fstrAccountNum == null ? that.fstrAccountNum == null : this.fstrAccountNum.equals(that.fstrAccountNum));
    equal = equal && (this.flngBatchKey == null ? that.flngBatchKey == null : this.flngBatchKey.equals(that.flngBatchKey));
    equal = equal && (this.fintBatchSeq == null ? that.fintBatchSeq == null : this.fintBatchSeq.equals(that.fintBatchSeq));
    equal = equal && (this.fstrReason == null ? that.fstrReason == null : this.fstrReason.equals(that.fstrReason));
    equal = equal && (this.fintProfile == null ? that.fintProfile == null : this.fintProfile.equals(that.fintProfile));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrValidationParms == null ? that.fstrValidationParms == null : this.fstrValidationParms.equals(that.fstrValidationParms));
    equal = equal && (this.fstrUnknown == null ? that.fstrUnknown == null : this.fstrUnknown.equals(that.fstrUnknown));
    equal = equal && (this.fblnSuspended == null ? that.fblnSuspended == null : this.fblnSuspended.equals(that.fblnSuspended));
    equal = equal && (this.fstrPaymentChanel == null ? that.fstrPaymentChanel == null : this.fstrPaymentChanel.equals(that.fstrPaymentChanel));
    equal = equal && (this.fstrDepositType == null ? that.fstrDepositType == null : this.fstrDepositType.equals(that.fstrDepositType));
    equal = equal && (this.fdtmDeposit == null ? that.fdtmDeposit == null : this.fdtmDeposit.equals(that.fdtmDeposit));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fdtmStatus == null ? that.fdtmStatus == null : this.fdtmStatus.equals(that.fdtmStatus));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fdtmBankAdjusted == null ? that.fdtmBankAdjusted == null : this.fdtmBankAdjusted.equals(that.fdtmBankAdjusted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngPaymentKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintAllocation = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrPaymentType = JdbcWritableBridge.readString(6, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fdtmEffect = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fintRetry = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnQueued = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnUser = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnDirected = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrAssociatedId = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fstrVoucherType = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrOvrIdType = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrOvrId = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrOvrAssociatedId = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrOvrAccountType = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrOvrVoucherType = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmOvrFilingPeriod = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fstrDetails = JdbcWritableBridge.readString(27, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fstrMedia = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrEffType = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrTraceType = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrTrace = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrFrgCurrType = JdbcWritableBridge.readString(33, __dbResults);
    this.fcurFrgAmount = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fdblFrgRate = JdbcWritableBridge.readDouble(35, __dbResults);
    this.fstrTransitNum = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrAccountNum = JdbcWritableBridge.readString(37, __dbResults);
    this.flngBatchKey = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fintBatchSeq = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fstrReason = JdbcWritableBridge.readString(40, __dbResults);
    this.fintProfile = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrValidationParms = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrUnknown = JdbcWritableBridge.readString(44, __dbResults);
    this.fblnSuspended = JdbcWritableBridge.readInteger(45, __dbResults);
    this.fstrPaymentChanel = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrDepositType = JdbcWritableBridge.readString(47, __dbResults);
    this.fdtmDeposit = JdbcWritableBridge.readTimestamp(48, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(49, __dbResults);
    this.fdtmStatus = JdbcWritableBridge.readTimestamp(50, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(51, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(52, __dbResults);
    this.fdtmBankAdjusted = JdbcWritableBridge.readTimestamp(53, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(54, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(55, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngPaymentKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintAllocation = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrPaymentType = JdbcWritableBridge.readString(6, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fdtmEffect = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fintRetry = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnQueued = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnUser = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnDirected = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrAssociatedId = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fstrVoucherType = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrOvrIdType = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrOvrId = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrOvrAssociatedId = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrOvrAccountType = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrOvrVoucherType = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmOvrFilingPeriod = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fstrDetails = JdbcWritableBridge.readString(27, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fstrMedia = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrEffType = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrTraceType = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrTrace = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrFrgCurrType = JdbcWritableBridge.readString(33, __dbResults);
    this.fcurFrgAmount = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fdblFrgRate = JdbcWritableBridge.readDouble(35, __dbResults);
    this.fstrTransitNum = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrAccountNum = JdbcWritableBridge.readString(37, __dbResults);
    this.flngBatchKey = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fintBatchSeq = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fstrReason = JdbcWritableBridge.readString(40, __dbResults);
    this.fintProfile = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrValidationParms = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrUnknown = JdbcWritableBridge.readString(44, __dbResults);
    this.fblnSuspended = JdbcWritableBridge.readInteger(45, __dbResults);
    this.fstrPaymentChanel = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrDepositType = JdbcWritableBridge.readString(47, __dbResults);
    this.fdtmDeposit = JdbcWritableBridge.readTimestamp(48, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(49, __dbResults);
    this.fdtmStatus = JdbcWritableBridge.readTimestamp(50, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(51, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(52, __dbResults);
    this.fdtmBankAdjusted = JdbcWritableBridge.readTimestamp(53, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(54, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(55, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngPaymentKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAllocation, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffect, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRetry, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnQueued, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUser, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDirected, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAssociatedId, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrVoucherType, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrIdType, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrId, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrAssociatedId, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrAccountType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrVoucherType, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOvrFilingPeriod, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDetails, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrMedia, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEffType, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTraceType, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTrace, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFrgCurrType, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFrgAmount, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblFrgRate, 35 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransitNum, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountNum, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBatchKey, 38 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintBatchSeq, 39 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrReason, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfile, 41 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrValidationParms, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnknown, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSuspended, 45 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentChanel, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDepositType, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeposit, 48 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 49 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatus, 50 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 52 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBankAdjusted, 53 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 55 + __off, 93, __dbStmt);
    return 55;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngPaymentKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAllocation, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffect, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRetry, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnQueued, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUser, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDirected, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAssociatedId, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrVoucherType, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrIdType, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrId, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrAssociatedId, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrAccountType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOvrVoucherType, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOvrFilingPeriod, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDetails, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrMedia, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEffType, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTraceType, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTrace, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFrgCurrType, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFrgAmount, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblFrgRate, 35 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransitNum, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountNum, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBatchKey, 38 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintBatchSeq, 39 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrReason, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfile, 41 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrValidationParms, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnknown, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSuspended, 45 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentChanel, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDepositType, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeposit, 48 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 49 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatus, 50 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 52 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBankAdjusted, 53 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 55 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngPaymentKey = null;
    } else {
    this.flngPaymentKey = Integer.valueOf(__dataIn.readInt());
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
        this.fintAllocation = null;
    } else {
    this.fintAllocation = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSource = null;
    } else {
    this.fstrSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentType = null;
    } else {
    this.fstrPaymentType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffect = null;
    } else {
    this.fdtmEffect = new Timestamp(__dataIn.readLong());
    this.fdtmEffect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintRetry = null;
    } else {
    this.fintRetry = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnQueued = null;
    } else {
    this.fblnQueued = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUser = null;
    } else {
    this.fblnUser = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDirected = null;
    } else {
    this.fblnDirected = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIdType = null;
    } else {
    this.fstrIdType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrId = null;
    } else {
    this.fstrId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAssociatedId = null;
    } else {
    this.fstrAssociatedId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVoucherType = null;
    } else {
    this.fstrVoucherType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOvrIdType = null;
    } else {
    this.fstrOvrIdType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOvrId = null;
    } else {
    this.fstrOvrId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOvrAssociatedId = null;
    } else {
    this.fstrOvrAssociatedId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOvrAccountType = null;
    } else {
    this.fstrOvrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOvrVoucherType = null;
    } else {
    this.fstrOvrVoucherType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmOvrFilingPeriod = null;
    } else {
    this.fdtmOvrFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmOvrFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDetails = null;
    } else {
    this.fstrDetails = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMedia = null;
    } else {
    this.fstrMedia = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEffType = null;
    } else {
    this.fstrEffType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTraceType = null;
    } else {
    this.fstrTraceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTrace = null;
    } else {
    this.fstrTrace = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFrgCurrType = null;
    } else {
    this.fstrFrgCurrType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFrgAmount = null;
    } else {
    this.fcurFrgAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdblFrgRate = null;
    } else {
    this.fdblFrgRate = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransitNum = null;
    } else {
    this.fstrTransitNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountNum = null;
    } else {
    this.fstrAccountNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngBatchKey = null;
    } else {
    this.flngBatchKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintBatchSeq = null;
    } else {
    this.fintBatchSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReason = null;
    } else {
    this.fstrReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintProfile = null;
    } else {
    this.fintProfile = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStatus = null;
    } else {
    this.fstrStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrValidationParms = null;
    } else {
    this.fstrValidationParms = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnknown = null;
    } else {
    this.fstrUnknown = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSuspended = null;
    } else {
    this.fblnSuspended = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentChanel = null;
    } else {
    this.fstrPaymentChanel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDepositType = null;
    } else {
    this.fstrDepositType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDeposit = null;
    } else {
    this.fdtmDeposit = new Timestamp(__dataIn.readLong());
    this.fdtmDeposit.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReceived = null;
    } else {
    this.fdtmReceived = new Timestamp(__dataIn.readLong());
    this.fdtmReceived.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStatus = null;
    } else {
    this.fdtmStatus = new Timestamp(__dataIn.readLong());
    this.fdtmStatus.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExternalId = null;
    } else {
    this.fstrExternalId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmBankAdjusted = null;
    } else {
    this.fdtmBankAdjusted = new Timestamp(__dataIn.readLong());
    this.fdtmBankAdjusted.setNanos(__dataIn.readInt());
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
    if (null == this.flngPaymentKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPaymentKey);
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
    if (null == this.fintAllocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAllocation);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fstrPaymentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentType);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fdtmEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffect.getTime());
    __dataOut.writeInt(this.fdtmEffect.getNanos());
    }
    if (null == this.fintRetry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRetry);
    }
    if (null == this.fblnQueued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnQueued);
    }
    if (null == this.fblnUser) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUser);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fblnDirected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDirected);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIdType);
    }
    if (null == this.fstrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrId);
    }
    if (null == this.fstrAssociatedId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAssociatedId);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrVoucherType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVoucherType);
    }
    if (null == this.fstrOvrIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrIdType);
    }
    if (null == this.fstrOvrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrId);
    }
    if (null == this.fstrOvrAssociatedId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrAssociatedId);
    }
    if (null == this.fstrOvrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrAccountType);
    }
    if (null == this.fstrOvrVoucherType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrVoucherType);
    }
    if (null == this.fdtmOvrFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmOvrFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmOvrFilingPeriod.getNanos());
    }
    if (null == this.fstrDetails) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDetails);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrMedia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMedia);
    }
    if (null == this.fstrEffType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEffType);
    }
    if (null == this.fstrTraceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTraceType);
    }
    if (null == this.fstrTrace) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTrace);
    }
    if (null == this.fstrFrgCurrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFrgCurrType);
    }
    if (null == this.fcurFrgAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFrgAmount, __dataOut);
    }
    if (null == this.fdblFrgRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblFrgRate);
    }
    if (null == this.fstrTransitNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransitNum);
    }
    if (null == this.fstrAccountNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountNum);
    }
    if (null == this.flngBatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBatchKey);
    }
    if (null == this.fintBatchSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintBatchSeq);
    }
    if (null == this.fstrReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReason);
    }
    if (null == this.fintProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfile);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fstrValidationParms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrValidationParms);
    }
    if (null == this.fstrUnknown) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnknown);
    }
    if (null == this.fblnSuspended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSuspended);
    }
    if (null == this.fstrPaymentChanel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentChanel);
    }
    if (null == this.fstrDepositType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDepositType);
    }
    if (null == this.fdtmDeposit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeposit.getTime());
    __dataOut.writeInt(this.fdtmDeposit.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fdtmStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatus.getTime());
    __dataOut.writeInt(this.fdtmStatus.getNanos());
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fdtmBankAdjusted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBankAdjusted.getTime());
    __dataOut.writeInt(this.fdtmBankAdjusted.getNanos());
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
    if (null == this.flngPaymentKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPaymentKey);
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
    if (null == this.fintAllocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAllocation);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fstrPaymentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentType);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fdtmEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffect.getTime());
    __dataOut.writeInt(this.fdtmEffect.getNanos());
    }
    if (null == this.fintRetry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRetry);
    }
    if (null == this.fblnQueued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnQueued);
    }
    if (null == this.fblnUser) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUser);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fblnDirected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDirected);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIdType);
    }
    if (null == this.fstrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrId);
    }
    if (null == this.fstrAssociatedId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAssociatedId);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrVoucherType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVoucherType);
    }
    if (null == this.fstrOvrIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrIdType);
    }
    if (null == this.fstrOvrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrId);
    }
    if (null == this.fstrOvrAssociatedId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrAssociatedId);
    }
    if (null == this.fstrOvrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrAccountType);
    }
    if (null == this.fstrOvrVoucherType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOvrVoucherType);
    }
    if (null == this.fdtmOvrFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmOvrFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmOvrFilingPeriod.getNanos());
    }
    if (null == this.fstrDetails) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDetails);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrMedia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMedia);
    }
    if (null == this.fstrEffType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEffType);
    }
    if (null == this.fstrTraceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTraceType);
    }
    if (null == this.fstrTrace) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTrace);
    }
    if (null == this.fstrFrgCurrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFrgCurrType);
    }
    if (null == this.fcurFrgAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFrgAmount, __dataOut);
    }
    if (null == this.fdblFrgRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblFrgRate);
    }
    if (null == this.fstrTransitNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransitNum);
    }
    if (null == this.fstrAccountNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountNum);
    }
    if (null == this.flngBatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBatchKey);
    }
    if (null == this.fintBatchSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintBatchSeq);
    }
    if (null == this.fstrReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReason);
    }
    if (null == this.fintProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfile);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fstrValidationParms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrValidationParms);
    }
    if (null == this.fstrUnknown) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnknown);
    }
    if (null == this.fblnSuspended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSuspended);
    }
    if (null == this.fstrPaymentChanel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentChanel);
    }
    if (null == this.fstrDepositType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDepositType);
    }
    if (null == this.fdtmDeposit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeposit.getTime());
    __dataOut.writeInt(this.fdtmDeposit.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fdtmStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatus.getTime());
    __dataOut.writeInt(this.fdtmStatus.getNanos());
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fdtmBankAdjusted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBankAdjusted.getTime());
    __dataOut.writeInt(this.fdtmBankAdjusted.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngPaymentKey==null?"\\N":"" + flngPaymentKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAllocation==null?"\\N":"" + fintAllocation, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentType==null?"\\N":fstrPaymentType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffect==null?"\\N":"" + fdtmEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRetry==null?"\\N":"" + fintRetry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnQueued==null?"\\N":"" + fblnQueued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUser==null?"\\N":"" + fblnUser, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDirected==null?"\\N":"" + fblnDirected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAssociatedId==null?"\\N":fstrAssociatedId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVoucherType==null?"\\N":fstrVoucherType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrIdType==null?"\\N":fstrOvrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrId==null?"\\N":fstrOvrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrAssociatedId==null?"\\N":fstrOvrAssociatedId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrAccountType==null?"\\N":fstrOvrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrVoucherType==null?"\\N":fstrOvrVoucherType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmOvrFilingPeriod==null?"\\N":"" + fdtmOvrFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDetails==null?"\\N":fstrDetails, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMedia==null?"\\N":fstrMedia, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEffType==null?"\\N":fstrEffType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTraceType==null?"\\N":fstrTraceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTrace==null?"\\N":fstrTrace, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFrgCurrType==null?"\\N":fstrFrgCurrType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFrgAmount==null?"\\N":fcurFrgAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblFrgRate==null?"\\N":"" + fdblFrgRate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransitNum==null?"\\N":fstrTransitNum, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountNum==null?"\\N":fstrAccountNum, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBatchKey==null?"\\N":"" + flngBatchKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintBatchSeq==null?"\\N":"" + fintBatchSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReason==null?"\\N":fstrReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfile==null?"\\N":"" + fintProfile, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrValidationParms==null?"\\N":fstrValidationParms, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnknown==null?"\\N":fstrUnknown, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSuspended==null?"\\N":"" + fblnSuspended, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentChanel==null?"\\N":fstrPaymentChanel, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDepositType==null?"\\N":fstrDepositType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeposit==null?"\\N":"" + fdtmDeposit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatus==null?"\\N":"" + fdtmStatus, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBankAdjusted==null?"\\N":"" + fdtmBankAdjusted, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngPaymentKey==null?"\\N":"" + flngPaymentKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAllocation==null?"\\N":"" + fintAllocation, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentType==null?"\\N":fstrPaymentType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffect==null?"\\N":"" + fdtmEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRetry==null?"\\N":"" + fintRetry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnQueued==null?"\\N":"" + fblnQueued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUser==null?"\\N":"" + fblnUser, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDirected==null?"\\N":"" + fblnDirected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAssociatedId==null?"\\N":fstrAssociatedId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVoucherType==null?"\\N":fstrVoucherType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrIdType==null?"\\N":fstrOvrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrId==null?"\\N":fstrOvrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrAssociatedId==null?"\\N":fstrOvrAssociatedId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrAccountType==null?"\\N":fstrOvrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOvrVoucherType==null?"\\N":fstrOvrVoucherType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmOvrFilingPeriod==null?"\\N":"" + fdtmOvrFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDetails==null?"\\N":fstrDetails, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMedia==null?"\\N":fstrMedia, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEffType==null?"\\N":fstrEffType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTraceType==null?"\\N":fstrTraceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTrace==null?"\\N":fstrTrace, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFrgCurrType==null?"\\N":fstrFrgCurrType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFrgAmount==null?"\\N":fcurFrgAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblFrgRate==null?"\\N":"" + fdblFrgRate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransitNum==null?"\\N":fstrTransitNum, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountNum==null?"\\N":fstrAccountNum, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBatchKey==null?"\\N":"" + flngBatchKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintBatchSeq==null?"\\N":"" + fintBatchSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReason==null?"\\N":fstrReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfile==null?"\\N":"" + fintProfile, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrValidationParms==null?"\\N":fstrValidationParms, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnknown==null?"\\N":fstrUnknown, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSuspended==null?"\\N":"" + fblnSuspended, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentChanel==null?"\\N":fstrPaymentChanel, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDepositType==null?"\\N":fstrDepositType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeposit==null?"\\N":"" + fdtmDeposit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatus==null?"\\N":"" + fdtmStatus, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBankAdjusted==null?"\\N":"" + fdtmBankAdjusted, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPaymentKey = null; } else {
      this.flngPaymentKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAllocation = null; } else {
      this.fintAllocation = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentType = null; } else {
      this.fstrPaymentType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffect = null; } else {
      this.fdtmEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRetry = null; } else {
      this.fintRetry = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnQueued = null; } else {
      this.fblnQueued = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUser = null; } else {
      this.fblnUser = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDirected = null; } else {
      this.fblnDirected = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrIdType = null; } else {
      this.fstrIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrId = null; } else {
      this.fstrId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAssociatedId = null; } else {
      this.fstrAssociatedId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrVoucherType = null; } else {
      this.fstrVoucherType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrIdType = null; } else {
      this.fstrOvrIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrId = null; } else {
      this.fstrOvrId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrAssociatedId = null; } else {
      this.fstrOvrAssociatedId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrAccountType = null; } else {
      this.fstrOvrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrVoucherType = null; } else {
      this.fstrOvrVoucherType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmOvrFilingPeriod = null; } else {
      this.fdtmOvrFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDetails = null; } else {
      this.fstrDetails = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrMedia = null; } else {
      this.fstrMedia = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEffType = null; } else {
      this.fstrEffType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTraceType = null; } else {
      this.fstrTraceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTrace = null; } else {
      this.fstrTrace = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFrgCurrType = null; } else {
      this.fstrFrgCurrType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFrgAmount = null; } else {
      this.fcurFrgAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblFrgRate = null; } else {
      this.fdblFrgRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransitNum = null; } else {
      this.fstrTransitNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountNum = null; } else {
      this.fstrAccountNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBatchKey = null; } else {
      this.flngBatchKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintBatchSeq = null; } else {
      this.fintBatchSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReason = null; } else {
      this.fstrReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfile = null; } else {
      this.fintProfile = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrValidationParms = null; } else {
      this.fstrValidationParms = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnknown = null; } else {
      this.fstrUnknown = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSuspended = null; } else {
      this.fblnSuspended = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentChanel = null; } else {
      this.fstrPaymentChanel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDepositType = null; } else {
      this.fstrDepositType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeposit = null; } else {
      this.fdtmDeposit = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStatus = null; } else {
      this.fdtmStatus = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBankAdjusted = null; } else {
      this.fdtmBankAdjusted = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPaymentKey = null; } else {
      this.flngPaymentKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAllocation = null; } else {
      this.fintAllocation = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentType = null; } else {
      this.fstrPaymentType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffect = null; } else {
      this.fdtmEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRetry = null; } else {
      this.fintRetry = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnQueued = null; } else {
      this.fblnQueued = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUser = null; } else {
      this.fblnUser = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDirected = null; } else {
      this.fblnDirected = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrIdType = null; } else {
      this.fstrIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrId = null; } else {
      this.fstrId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAssociatedId = null; } else {
      this.fstrAssociatedId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrVoucherType = null; } else {
      this.fstrVoucherType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrIdType = null; } else {
      this.fstrOvrIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrId = null; } else {
      this.fstrOvrId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrAssociatedId = null; } else {
      this.fstrOvrAssociatedId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrAccountType = null; } else {
      this.fstrOvrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOvrVoucherType = null; } else {
      this.fstrOvrVoucherType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmOvrFilingPeriod = null; } else {
      this.fdtmOvrFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDetails = null; } else {
      this.fstrDetails = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrMedia = null; } else {
      this.fstrMedia = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEffType = null; } else {
      this.fstrEffType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTraceType = null; } else {
      this.fstrTraceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTrace = null; } else {
      this.fstrTrace = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFrgCurrType = null; } else {
      this.fstrFrgCurrType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFrgAmount = null; } else {
      this.fcurFrgAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblFrgRate = null; } else {
      this.fdblFrgRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransitNum = null; } else {
      this.fstrTransitNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountNum = null; } else {
      this.fstrAccountNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBatchKey = null; } else {
      this.flngBatchKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintBatchSeq = null; } else {
      this.fintBatchSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReason = null; } else {
      this.fstrReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfile = null; } else {
      this.fintProfile = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrValidationParms = null; } else {
      this.fstrValidationParms = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnknown = null; } else {
      this.fstrUnknown = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSuspended = null; } else {
      this.fblnSuspended = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentChanel = null; } else {
      this.fstrPaymentChanel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDepositType = null; } else {
      this.fstrDepositType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeposit = null; } else {
      this.fdtmDeposit = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStatus = null; } else {
      this.fdtmStatus = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBankAdjusted = null; } else {
      this.fdtmBankAdjusted = java.sql.Timestamp.valueOf(__cur_str);
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
    tblpayment o = (tblpayment) super.clone();
    o.fdtmEffect = (o.fdtmEffect != null) ? (java.sql.Timestamp) o.fdtmEffect.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmOvrFilingPeriod = (o.fdtmOvrFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmOvrFilingPeriod.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmDeposit = (o.fdtmDeposit != null) ? (java.sql.Timestamp) o.fdtmDeposit.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmStatus = (o.fdtmStatus != null) ? (java.sql.Timestamp) o.fdtmStatus.clone() : null;
    o.fdtmBankAdjusted = (o.fdtmBankAdjusted != null) ? (java.sql.Timestamp) o.fdtmBankAdjusted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblpayment o) throws CloneNotSupportedException {
    o.fdtmEffect = (o.fdtmEffect != null) ? (java.sql.Timestamp) o.fdtmEffect.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmOvrFilingPeriod = (o.fdtmOvrFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmOvrFilingPeriod.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmDeposit = (o.fdtmDeposit != null) ? (java.sql.Timestamp) o.fdtmDeposit.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmStatus = (o.fdtmStatus != null) ? (java.sql.Timestamp) o.fdtmStatus.clone() : null;
    o.fdtmBankAdjusted = (o.fdtmBankAdjusted != null) ? (java.sql.Timestamp) o.fdtmBankAdjusted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngPaymentKey", this.flngPaymentKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fintAllocation", this.fintAllocation);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fstrPaymentType", this.fstrPaymentType);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fdtmEffect", this.fdtmEffect);
    __sqoop$field_map.put("fintRetry", this.fintRetry);
    __sqoop$field_map.put("fblnQueued", this.fblnQueued);
    __sqoop$field_map.put("fblnUser", this.fblnUser);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fblnDirected", this.fblnDirected);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrAssociatedId", this.fstrAssociatedId);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrVoucherType", this.fstrVoucherType);
    __sqoop$field_map.put("fstrOvrIdType", this.fstrOvrIdType);
    __sqoop$field_map.put("fstrOvrId", this.fstrOvrId);
    __sqoop$field_map.put("fstrOvrAssociatedId", this.fstrOvrAssociatedId);
    __sqoop$field_map.put("fstrOvrAccountType", this.fstrOvrAccountType);
    __sqoop$field_map.put("fstrOvrVoucherType", this.fstrOvrVoucherType);
    __sqoop$field_map.put("fdtmOvrFilingPeriod", this.fdtmOvrFilingPeriod);
    __sqoop$field_map.put("fstrDetails", this.fstrDetails);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrMedia", this.fstrMedia);
    __sqoop$field_map.put("fstrEffType", this.fstrEffType);
    __sqoop$field_map.put("fstrTraceType", this.fstrTraceType);
    __sqoop$field_map.put("fstrTrace", this.fstrTrace);
    __sqoop$field_map.put("fstrFrgCurrType", this.fstrFrgCurrType);
    __sqoop$field_map.put("fcurFrgAmount", this.fcurFrgAmount);
    __sqoop$field_map.put("fdblFrgRate", this.fdblFrgRate);
    __sqoop$field_map.put("fstrTransitNum", this.fstrTransitNum);
    __sqoop$field_map.put("fstrAccountNum", this.fstrAccountNum);
    __sqoop$field_map.put("flngBatchKey", this.flngBatchKey);
    __sqoop$field_map.put("fintBatchSeq", this.fintBatchSeq);
    __sqoop$field_map.put("fstrReason", this.fstrReason);
    __sqoop$field_map.put("fintProfile", this.fintProfile);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrValidationParms", this.fstrValidationParms);
    __sqoop$field_map.put("fstrUnknown", this.fstrUnknown);
    __sqoop$field_map.put("fblnSuspended", this.fblnSuspended);
    __sqoop$field_map.put("fstrPaymentChanel", this.fstrPaymentChanel);
    __sqoop$field_map.put("fstrDepositType", this.fstrDepositType);
    __sqoop$field_map.put("fdtmDeposit", this.fdtmDeposit);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fdtmStatus", this.fdtmStatus);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fdtmBankAdjusted", this.fdtmBankAdjusted);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngPaymentKey", this.flngPaymentKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fintAllocation", this.fintAllocation);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fstrPaymentType", this.fstrPaymentType);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fdtmEffect", this.fdtmEffect);
    __sqoop$field_map.put("fintRetry", this.fintRetry);
    __sqoop$field_map.put("fblnQueued", this.fblnQueued);
    __sqoop$field_map.put("fblnUser", this.fblnUser);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fblnDirected", this.fblnDirected);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrAssociatedId", this.fstrAssociatedId);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrVoucherType", this.fstrVoucherType);
    __sqoop$field_map.put("fstrOvrIdType", this.fstrOvrIdType);
    __sqoop$field_map.put("fstrOvrId", this.fstrOvrId);
    __sqoop$field_map.put("fstrOvrAssociatedId", this.fstrOvrAssociatedId);
    __sqoop$field_map.put("fstrOvrAccountType", this.fstrOvrAccountType);
    __sqoop$field_map.put("fstrOvrVoucherType", this.fstrOvrVoucherType);
    __sqoop$field_map.put("fdtmOvrFilingPeriod", this.fdtmOvrFilingPeriod);
    __sqoop$field_map.put("fstrDetails", this.fstrDetails);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrMedia", this.fstrMedia);
    __sqoop$field_map.put("fstrEffType", this.fstrEffType);
    __sqoop$field_map.put("fstrTraceType", this.fstrTraceType);
    __sqoop$field_map.put("fstrTrace", this.fstrTrace);
    __sqoop$field_map.put("fstrFrgCurrType", this.fstrFrgCurrType);
    __sqoop$field_map.put("fcurFrgAmount", this.fcurFrgAmount);
    __sqoop$field_map.put("fdblFrgRate", this.fdblFrgRate);
    __sqoop$field_map.put("fstrTransitNum", this.fstrTransitNum);
    __sqoop$field_map.put("fstrAccountNum", this.fstrAccountNum);
    __sqoop$field_map.put("flngBatchKey", this.flngBatchKey);
    __sqoop$field_map.put("fintBatchSeq", this.fintBatchSeq);
    __sqoop$field_map.put("fstrReason", this.fstrReason);
    __sqoop$field_map.put("fintProfile", this.fintProfile);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrValidationParms", this.fstrValidationParms);
    __sqoop$field_map.put("fstrUnknown", this.fstrUnknown);
    __sqoop$field_map.put("fblnSuspended", this.fblnSuspended);
    __sqoop$field_map.put("fstrPaymentChanel", this.fstrPaymentChanel);
    __sqoop$field_map.put("fstrDepositType", this.fstrDepositType);
    __sqoop$field_map.put("fdtmDeposit", this.fdtmDeposit);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fdtmStatus", this.fdtmStatus);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fdtmBankAdjusted", this.fdtmBankAdjusted);
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
