// ORM class for table 'tblreturnsuspense'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:56:04 NZDT 2020
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

public class tblreturnsuspense extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngReturnSuspenseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngReturnSuspenseKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fi64DocSetKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fi64DocSetKey = (Long)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("flngSecondaryAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngSecondaryAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fdtmDataCapture", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fdtmDataCapture = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fdtmReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnInError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fblnInError = (Integer)value;
      }
    });
    setters.put("fstrFilingStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrFilingStatus = (String)value;
      }
    });
    setters.put("fstrId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrId = (String)value;
      }
    });
    setters.put("fstrIdType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrIdType = (String)value;
      }
    });
    setters.put("fstrNameControl", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrNameControl = (String)value;
      }
    });
    setters.put("fstrSecondaryId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrSecondaryId = (String)value;
      }
    });
    setters.put("fstrSecondaryIdType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrSecondaryIdType = (String)value;
      }
    });
    setters.put("fstrSecondaryNameControl", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrSecondaryNameControl = (String)value;
      }
    });
    setters.put("fstrURI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrURI = (String)value;
      }
    });
    setters.put("fstrURIType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrURIType = (String)value;
      }
    });
    setters.put("fstrMedia", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrMedia = (String)value;
      }
    });
    setters.put("fstrReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrReason = (String)value;
      }
    });
    setters.put("fcurPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fcurPayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrStatus = (String)value;
      }
    });
    setters.put("flngBatchKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngBatchKey = (Integer)value;
      }
    });
    setters.put("fintSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fintSequence = (Integer)value;
      }
    });
    setters.put("fstrRtnBatchId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrRtnBatchId = (String)value;
      }
    });
    setters.put("fdtmComposed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fdtmComposed = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("flngWorkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngWorkKey = (Integer)value;
      }
    });
    setters.put("fstrWorkType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrWorkType = (String)value;
      }
    });
    setters.put("fblnOpen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fblnOpen = (Integer)value;
      }
    });
    setters.put("flngReturnKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.flngReturnKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturnsuspense.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblreturnsuspense() {
    init0();
  }
  private Integer flngReturnSuspenseKey;
  public Integer get_flngReturnSuspenseKey() {
    return flngReturnSuspenseKey;
  }
  public void set_flngReturnSuspenseKey(Integer flngReturnSuspenseKey) {
    this.flngReturnSuspenseKey = flngReturnSuspenseKey;
  }
  public tblreturnsuspense with_flngReturnSuspenseKey(Integer flngReturnSuspenseKey) {
    this.flngReturnSuspenseKey = flngReturnSuspenseKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblreturnsuspense with_flngVer(Integer flngVer) {
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
  public tblreturnsuspense with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Long fi64DocSetKey;
  public Long get_fi64DocSetKey() {
    return fi64DocSetKey;
  }
  public void set_fi64DocSetKey(Long fi64DocSetKey) {
    this.fi64DocSetKey = fi64DocSetKey;
  }
  public tblreturnsuspense with_fi64DocSetKey(Long fi64DocSetKey) {
    this.fi64DocSetKey = fi64DocSetKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblreturnsuspense with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public tblreturnsuspense with_fstrDocType(String fstrDocType) {
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
  public tblreturnsuspense with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblreturnsuspense with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer flngSecondaryAccountKey;
  public Integer get_flngSecondaryAccountKey() {
    return flngSecondaryAccountKey;
  }
  public void set_flngSecondaryAccountKey(Integer flngSecondaryAccountKey) {
    this.flngSecondaryAccountKey = flngSecondaryAccountKey;
  }
  public tblreturnsuspense with_flngSecondaryAccountKey(Integer flngSecondaryAccountKey) {
    this.flngSecondaryAccountKey = flngSecondaryAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblreturnsuspense with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblreturnsuspense with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private java.sql.Timestamp fdtmDataCapture;
  public java.sql.Timestamp get_fdtmDataCapture() {
    return fdtmDataCapture;
  }
  public void set_fdtmDataCapture(java.sql.Timestamp fdtmDataCapture) {
    this.fdtmDataCapture = fdtmDataCapture;
  }
  public tblreturnsuspense with_fdtmDataCapture(java.sql.Timestamp fdtmDataCapture) {
    this.fdtmDataCapture = fdtmDataCapture;
    return this;
  }
  private java.sql.Timestamp fdtmReceived;
  public java.sql.Timestamp get_fdtmReceived() {
    return fdtmReceived;
  }
  public void set_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
  }
  public tblreturnsuspense with_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
    return this;
  }
  private Integer fblnInError;
  public Integer get_fblnInError() {
    return fblnInError;
  }
  public void set_fblnInError(Integer fblnInError) {
    this.fblnInError = fblnInError;
  }
  public tblreturnsuspense with_fblnInError(Integer fblnInError) {
    this.fblnInError = fblnInError;
    return this;
  }
  private String fstrFilingStatus;
  public String get_fstrFilingStatus() {
    return fstrFilingStatus;
  }
  public void set_fstrFilingStatus(String fstrFilingStatus) {
    this.fstrFilingStatus = fstrFilingStatus;
  }
  public tblreturnsuspense with_fstrFilingStatus(String fstrFilingStatus) {
    this.fstrFilingStatus = fstrFilingStatus;
    return this;
  }
  private String fstrId;
  public String get_fstrId() {
    return fstrId;
  }
  public void set_fstrId(String fstrId) {
    this.fstrId = fstrId;
  }
  public tblreturnsuspense with_fstrId(String fstrId) {
    this.fstrId = fstrId;
    return this;
  }
  private String fstrIdType;
  public String get_fstrIdType() {
    return fstrIdType;
  }
  public void set_fstrIdType(String fstrIdType) {
    this.fstrIdType = fstrIdType;
  }
  public tblreturnsuspense with_fstrIdType(String fstrIdType) {
    this.fstrIdType = fstrIdType;
    return this;
  }
  private String fstrNameControl;
  public String get_fstrNameControl() {
    return fstrNameControl;
  }
  public void set_fstrNameControl(String fstrNameControl) {
    this.fstrNameControl = fstrNameControl;
  }
  public tblreturnsuspense with_fstrNameControl(String fstrNameControl) {
    this.fstrNameControl = fstrNameControl;
    return this;
  }
  private String fstrSecondaryId;
  public String get_fstrSecondaryId() {
    return fstrSecondaryId;
  }
  public void set_fstrSecondaryId(String fstrSecondaryId) {
    this.fstrSecondaryId = fstrSecondaryId;
  }
  public tblreturnsuspense with_fstrSecondaryId(String fstrSecondaryId) {
    this.fstrSecondaryId = fstrSecondaryId;
    return this;
  }
  private String fstrSecondaryIdType;
  public String get_fstrSecondaryIdType() {
    return fstrSecondaryIdType;
  }
  public void set_fstrSecondaryIdType(String fstrSecondaryIdType) {
    this.fstrSecondaryIdType = fstrSecondaryIdType;
  }
  public tblreturnsuspense with_fstrSecondaryIdType(String fstrSecondaryIdType) {
    this.fstrSecondaryIdType = fstrSecondaryIdType;
    return this;
  }
  private String fstrSecondaryNameControl;
  public String get_fstrSecondaryNameControl() {
    return fstrSecondaryNameControl;
  }
  public void set_fstrSecondaryNameControl(String fstrSecondaryNameControl) {
    this.fstrSecondaryNameControl = fstrSecondaryNameControl;
  }
  public tblreturnsuspense with_fstrSecondaryNameControl(String fstrSecondaryNameControl) {
    this.fstrSecondaryNameControl = fstrSecondaryNameControl;
    return this;
  }
  private String fstrURI;
  public String get_fstrURI() {
    return fstrURI;
  }
  public void set_fstrURI(String fstrURI) {
    this.fstrURI = fstrURI;
  }
  public tblreturnsuspense with_fstrURI(String fstrURI) {
    this.fstrURI = fstrURI;
    return this;
  }
  private String fstrURIType;
  public String get_fstrURIType() {
    return fstrURIType;
  }
  public void set_fstrURIType(String fstrURIType) {
    this.fstrURIType = fstrURIType;
  }
  public tblreturnsuspense with_fstrURIType(String fstrURIType) {
    this.fstrURIType = fstrURIType;
    return this;
  }
  private String fstrMedia;
  public String get_fstrMedia() {
    return fstrMedia;
  }
  public void set_fstrMedia(String fstrMedia) {
    this.fstrMedia = fstrMedia;
  }
  public tblreturnsuspense with_fstrMedia(String fstrMedia) {
    this.fstrMedia = fstrMedia;
    return this;
  }
  private String fstrReason;
  public String get_fstrReason() {
    return fstrReason;
  }
  public void set_fstrReason(String fstrReason) {
    this.fstrReason = fstrReason;
  }
  public tblreturnsuspense with_fstrReason(String fstrReason) {
    this.fstrReason = fstrReason;
    return this;
  }
  private java.math.BigDecimal fcurPayment;
  public java.math.BigDecimal get_fcurPayment() {
    return fcurPayment;
  }
  public void set_fcurPayment(java.math.BigDecimal fcurPayment) {
    this.fcurPayment = fcurPayment;
  }
  public tblreturnsuspense with_fcurPayment(java.math.BigDecimal fcurPayment) {
    this.fcurPayment = fcurPayment;
    return this;
  }
  private String fstrStatus;
  public String get_fstrStatus() {
    return fstrStatus;
  }
  public void set_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
  }
  public tblreturnsuspense with_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
    return this;
  }
  private Integer flngBatchKey;
  public Integer get_flngBatchKey() {
    return flngBatchKey;
  }
  public void set_flngBatchKey(Integer flngBatchKey) {
    this.flngBatchKey = flngBatchKey;
  }
  public tblreturnsuspense with_flngBatchKey(Integer flngBatchKey) {
    this.flngBatchKey = flngBatchKey;
    return this;
  }
  private Integer fintSequence;
  public Integer get_fintSequence() {
    return fintSequence;
  }
  public void set_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
  }
  public tblreturnsuspense with_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
    return this;
  }
  private String fstrRtnBatchId;
  public String get_fstrRtnBatchId() {
    return fstrRtnBatchId;
  }
  public void set_fstrRtnBatchId(String fstrRtnBatchId) {
    this.fstrRtnBatchId = fstrRtnBatchId;
  }
  public tblreturnsuspense with_fstrRtnBatchId(String fstrRtnBatchId) {
    this.fstrRtnBatchId = fstrRtnBatchId;
    return this;
  }
  private java.sql.Timestamp fdtmComposed;
  public java.sql.Timestamp get_fdtmComposed() {
    return fdtmComposed;
  }
  public void set_fdtmComposed(java.sql.Timestamp fdtmComposed) {
    this.fdtmComposed = fdtmComposed;
  }
  public tblreturnsuspense with_fdtmComposed(java.sql.Timestamp fdtmComposed) {
    this.fdtmComposed = fdtmComposed;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tblreturnsuspense with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblreturnsuspense with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private Integer flngWorkKey;
  public Integer get_flngWorkKey() {
    return flngWorkKey;
  }
  public void set_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
  }
  public tblreturnsuspense with_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
    return this;
  }
  private String fstrWorkType;
  public String get_fstrWorkType() {
    return fstrWorkType;
  }
  public void set_fstrWorkType(String fstrWorkType) {
    this.fstrWorkType = fstrWorkType;
  }
  public tblreturnsuspense with_fstrWorkType(String fstrWorkType) {
    this.fstrWorkType = fstrWorkType;
    return this;
  }
  private Integer fblnOpen;
  public Integer get_fblnOpen() {
    return fblnOpen;
  }
  public void set_fblnOpen(Integer fblnOpen) {
    this.fblnOpen = fblnOpen;
  }
  public tblreturnsuspense with_fblnOpen(Integer fblnOpen) {
    this.fblnOpen = fblnOpen;
    return this;
  }
  private Integer flngReturnKey;
  public Integer get_flngReturnKey() {
    return flngReturnKey;
  }
  public void set_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
  }
  public tblreturnsuspense with_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblreturnsuspense with_fstrWho(String fstrWho) {
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
  public tblreturnsuspense with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblreturnsuspense)) {
      return false;
    }
    tblreturnsuspense that = (tblreturnsuspense) o;
    boolean equal = true;
    equal = equal && (this.flngReturnSuspenseKey == null ? that.flngReturnSuspenseKey == null : this.flngReturnSuspenseKey.equals(that.flngReturnSuspenseKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fi64DocSetKey == null ? that.fi64DocSetKey == null : this.fi64DocSetKey.equals(that.fi64DocSetKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngSecondaryAccountKey == null ? that.flngSecondaryAccountKey == null : this.flngSecondaryAccountKey.equals(that.flngSecondaryAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmDataCapture == null ? that.fdtmDataCapture == null : this.fdtmDataCapture.equals(that.fdtmDataCapture));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fblnInError == null ? that.fblnInError == null : this.fblnInError.equals(that.fblnInError));
    equal = equal && (this.fstrFilingStatus == null ? that.fstrFilingStatus == null : this.fstrFilingStatus.equals(that.fstrFilingStatus));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fstrNameControl == null ? that.fstrNameControl == null : this.fstrNameControl.equals(that.fstrNameControl));
    equal = equal && (this.fstrSecondaryId == null ? that.fstrSecondaryId == null : this.fstrSecondaryId.equals(that.fstrSecondaryId));
    equal = equal && (this.fstrSecondaryIdType == null ? that.fstrSecondaryIdType == null : this.fstrSecondaryIdType.equals(that.fstrSecondaryIdType));
    equal = equal && (this.fstrSecondaryNameControl == null ? that.fstrSecondaryNameControl == null : this.fstrSecondaryNameControl.equals(that.fstrSecondaryNameControl));
    equal = equal && (this.fstrURI == null ? that.fstrURI == null : this.fstrURI.equals(that.fstrURI));
    equal = equal && (this.fstrURIType == null ? that.fstrURIType == null : this.fstrURIType.equals(that.fstrURIType));
    equal = equal && (this.fstrMedia == null ? that.fstrMedia == null : this.fstrMedia.equals(that.fstrMedia));
    equal = equal && (this.fstrReason == null ? that.fstrReason == null : this.fstrReason.equals(that.fstrReason));
    equal = equal && (this.fcurPayment == null ? that.fcurPayment == null : this.fcurPayment.equals(that.fcurPayment));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.flngBatchKey == null ? that.flngBatchKey == null : this.flngBatchKey.equals(that.flngBatchKey));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.fstrRtnBatchId == null ? that.fstrRtnBatchId == null : this.fstrRtnBatchId.equals(that.fstrRtnBatchId));
    equal = equal && (this.fdtmComposed == null ? that.fdtmComposed == null : this.fdtmComposed.equals(that.fdtmComposed));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.fstrWorkType == null ? that.fstrWorkType == null : this.fstrWorkType.equals(that.fstrWorkType));
    equal = equal && (this.fblnOpen == null ? that.fblnOpen == null : this.fblnOpen.equals(that.fblnOpen));
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblreturnsuspense)) {
      return false;
    }
    tblreturnsuspense that = (tblreturnsuspense) o;
    boolean equal = true;
    equal = equal && (this.flngReturnSuspenseKey == null ? that.flngReturnSuspenseKey == null : this.flngReturnSuspenseKey.equals(that.flngReturnSuspenseKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fi64DocSetKey == null ? that.fi64DocSetKey == null : this.fi64DocSetKey.equals(that.fi64DocSetKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngSecondaryAccountKey == null ? that.flngSecondaryAccountKey == null : this.flngSecondaryAccountKey.equals(that.flngSecondaryAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmDataCapture == null ? that.fdtmDataCapture == null : this.fdtmDataCapture.equals(that.fdtmDataCapture));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fblnInError == null ? that.fblnInError == null : this.fblnInError.equals(that.fblnInError));
    equal = equal && (this.fstrFilingStatus == null ? that.fstrFilingStatus == null : this.fstrFilingStatus.equals(that.fstrFilingStatus));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fstrNameControl == null ? that.fstrNameControl == null : this.fstrNameControl.equals(that.fstrNameControl));
    equal = equal && (this.fstrSecondaryId == null ? that.fstrSecondaryId == null : this.fstrSecondaryId.equals(that.fstrSecondaryId));
    equal = equal && (this.fstrSecondaryIdType == null ? that.fstrSecondaryIdType == null : this.fstrSecondaryIdType.equals(that.fstrSecondaryIdType));
    equal = equal && (this.fstrSecondaryNameControl == null ? that.fstrSecondaryNameControl == null : this.fstrSecondaryNameControl.equals(that.fstrSecondaryNameControl));
    equal = equal && (this.fstrURI == null ? that.fstrURI == null : this.fstrURI.equals(that.fstrURI));
    equal = equal && (this.fstrURIType == null ? that.fstrURIType == null : this.fstrURIType.equals(that.fstrURIType));
    equal = equal && (this.fstrMedia == null ? that.fstrMedia == null : this.fstrMedia.equals(that.fstrMedia));
    equal = equal && (this.fstrReason == null ? that.fstrReason == null : this.fstrReason.equals(that.fstrReason));
    equal = equal && (this.fcurPayment == null ? that.fcurPayment == null : this.fcurPayment.equals(that.fcurPayment));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.flngBatchKey == null ? that.flngBatchKey == null : this.flngBatchKey.equals(that.flngBatchKey));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.fstrRtnBatchId == null ? that.fstrRtnBatchId == null : this.fstrRtnBatchId.equals(that.fstrRtnBatchId));
    equal = equal && (this.fdtmComposed == null ? that.fdtmComposed == null : this.fdtmComposed.equals(that.fdtmComposed));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.fstrWorkType == null ? that.fstrWorkType == null : this.fstrWorkType.equals(that.fstrWorkType));
    equal = equal && (this.fblnOpen == null ? that.fblnOpen == null : this.fblnOpen.equals(that.fblnOpen));
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngReturnSuspenseKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fi64DocSetKey = JdbcWritableBridge.readLong(4, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(6, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngSecondaryAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmDataCapture = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fblnInError = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrFilingStatus = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrNameControl = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrSecondaryId = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrSecondaryIdType = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrSecondaryNameControl = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrURI = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrURIType = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrMedia = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrReason = JdbcWritableBridge.readString(25, __dbResults);
    this.fcurPayment = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(27, __dbResults);
    this.flngBatchKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fstrRtnBatchId = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmComposed = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(32, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(33, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fstrWorkType = JdbcWritableBridge.readString(35, __dbResults);
    this.fblnOpen = JdbcWritableBridge.readInteger(36, __dbResults);
    this.flngReturnKey = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(38, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(39, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngReturnSuspenseKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fi64DocSetKey = JdbcWritableBridge.readLong(4, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(6, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngSecondaryAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmDataCapture = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fblnInError = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrFilingStatus = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrNameControl = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrSecondaryId = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrSecondaryIdType = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrSecondaryNameControl = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrURI = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrURIType = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrMedia = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrReason = JdbcWritableBridge.readString(25, __dbResults);
    this.fcurPayment = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(27, __dbResults);
    this.flngBatchKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fstrRtnBatchId = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmComposed = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(32, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(33, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fstrWorkType = JdbcWritableBridge.readString(35, __dbResults);
    this.fblnOpen = JdbcWritableBridge.readInteger(36, __dbResults);
    this.flngReturnKey = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(38, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(39, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngReturnSuspenseKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocSetKey, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSecondaryAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDataCapture, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInError, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingStatus, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNameControl, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecondaryId, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecondaryIdType, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecondaryNameControl, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrURI, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrURIType, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMedia, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReason, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPayment, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBatchKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 29 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrRtnBatchId, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmComposed, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 34 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkType, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOpen, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKey, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 39 + __off, 93, __dbStmt);
    return 39;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngReturnSuspenseKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocSetKey, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSecondaryAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDataCapture, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInError, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingStatus, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNameControl, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecondaryId, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecondaryIdType, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecondaryNameControl, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrURI, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrURIType, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMedia, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReason, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPayment, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBatchKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 29 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrRtnBatchId, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmComposed, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 34 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkType, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOpen, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKey, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 39 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngReturnSuspenseKey = null;
    } else {
    this.flngReturnSuspenseKey = Integer.valueOf(__dataIn.readInt());
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
        this.fi64DocSetKey = null;
    } else {
    this.fi64DocSetKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSecondaryAccountKey = null;
    } else {
    this.flngSecondaryAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDataCapture = null;
    } else {
    this.fdtmDataCapture = new Timestamp(__dataIn.readLong());
    this.fdtmDataCapture.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReceived = null;
    } else {
    this.fdtmReceived = new Timestamp(__dataIn.readLong());
    this.fdtmReceived.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInError = null;
    } else {
    this.fblnInError = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingStatus = null;
    } else {
    this.fstrFilingStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrId = null;
    } else {
    this.fstrId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIdType = null;
    } else {
    this.fstrIdType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNameControl = null;
    } else {
    this.fstrNameControl = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSecondaryId = null;
    } else {
    this.fstrSecondaryId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSecondaryIdType = null;
    } else {
    this.fstrSecondaryIdType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSecondaryNameControl = null;
    } else {
    this.fstrSecondaryNameControl = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrURI = null;
    } else {
    this.fstrURI = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrURIType = null;
    } else {
    this.fstrURIType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMedia = null;
    } else {
    this.fstrMedia = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReason = null;
    } else {
    this.fstrReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPayment = null;
    } else {
    this.fcurPayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStatus = null;
    } else {
    this.fstrStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngBatchKey = null;
    } else {
    this.flngBatchKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintSequence = null;
    } else {
    this.fintSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRtnBatchId = null;
    } else {
    this.fstrRtnBatchId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmComposed = null;
    } else {
    this.fdtmComposed = new Timestamp(__dataIn.readLong());
    this.fdtmComposed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngWorkKey = null;
    } else {
    this.flngWorkKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWorkType = null;
    } else {
    this.fstrWorkType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOpen = null;
    } else {
    this.fblnOpen = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngReturnKey = null;
    } else {
    this.flngReturnKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngReturnSuspenseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnSuspenseKey);
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
    if (null == this.fi64DocSetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocSetKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngSecondaryAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSecondaryAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmDataCapture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDataCapture.getTime());
    __dataOut.writeInt(this.fdtmDataCapture.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fblnInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInError);
    }
    if (null == this.fstrFilingStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingStatus);
    }
    if (null == this.fstrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrId);
    }
    if (null == this.fstrIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIdType);
    }
    if (null == this.fstrNameControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNameControl);
    }
    if (null == this.fstrSecondaryId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecondaryId);
    }
    if (null == this.fstrSecondaryIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecondaryIdType);
    }
    if (null == this.fstrSecondaryNameControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecondaryNameControl);
    }
    if (null == this.fstrURI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrURI);
    }
    if (null == this.fstrURIType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrURIType);
    }
    if (null == this.fstrMedia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMedia);
    }
    if (null == this.fstrReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReason);
    }
    if (null == this.fcurPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPayment, __dataOut);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.flngBatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBatchKey);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
    }
    if (null == this.fstrRtnBatchId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRtnBatchId);
    }
    if (null == this.fdtmComposed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmComposed.getTime());
    __dataOut.writeInt(this.fdtmComposed.getNanos());
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.fstrWorkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkType);
    }
    if (null == this.fblnOpen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOpen);
    }
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
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
    if (null == this.flngReturnSuspenseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnSuspenseKey);
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
    if (null == this.fi64DocSetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocSetKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngSecondaryAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSecondaryAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmDataCapture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDataCapture.getTime());
    __dataOut.writeInt(this.fdtmDataCapture.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fblnInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInError);
    }
    if (null == this.fstrFilingStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingStatus);
    }
    if (null == this.fstrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrId);
    }
    if (null == this.fstrIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIdType);
    }
    if (null == this.fstrNameControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNameControl);
    }
    if (null == this.fstrSecondaryId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecondaryId);
    }
    if (null == this.fstrSecondaryIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecondaryIdType);
    }
    if (null == this.fstrSecondaryNameControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecondaryNameControl);
    }
    if (null == this.fstrURI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrURI);
    }
    if (null == this.fstrURIType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrURIType);
    }
    if (null == this.fstrMedia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMedia);
    }
    if (null == this.fstrReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReason);
    }
    if (null == this.fcurPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPayment, __dataOut);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.flngBatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBatchKey);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
    }
    if (null == this.fstrRtnBatchId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRtnBatchId);
    }
    if (null == this.fdtmComposed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmComposed.getTime());
    __dataOut.writeInt(this.fdtmComposed.getNanos());
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.fstrWorkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkType);
    }
    if (null == this.fblnOpen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOpen);
    }
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnSuspenseKey==null?"\\N":"" + flngReturnSuspenseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocSetKey==null?"\\N":"" + fi64DocSetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSecondaryAccountKey==null?"\\N":"" + flngSecondaryAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDataCapture==null?"\\N":"" + fdtmDataCapture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInError==null?"\\N":"" + fblnInError, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingStatus==null?"\\N":fstrFilingStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNameControl==null?"\\N":fstrNameControl, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecondaryId==null?"\\N":fstrSecondaryId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecondaryIdType==null?"\\N":fstrSecondaryIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecondaryNameControl==null?"\\N":fstrSecondaryNameControl, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrURI==null?"\\N":fstrURI, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrURIType==null?"\\N":fstrURIType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMedia==null?"\\N":fstrMedia, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReason==null?"\\N":fstrReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPayment==null?"\\N":fcurPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBatchKey==null?"\\N":"" + flngBatchKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRtnBatchId==null?"\\N":fstrRtnBatchId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmComposed==null?"\\N":"" + fdtmComposed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkType==null?"\\N":fstrWorkType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOpen==null?"\\N":"" + fblnOpen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnSuspenseKey==null?"\\N":"" + flngReturnSuspenseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocSetKey==null?"\\N":"" + fi64DocSetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSecondaryAccountKey==null?"\\N":"" + flngSecondaryAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDataCapture==null?"\\N":"" + fdtmDataCapture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInError==null?"\\N":"" + fblnInError, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingStatus==null?"\\N":fstrFilingStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNameControl==null?"\\N":fstrNameControl, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecondaryId==null?"\\N":fstrSecondaryId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecondaryIdType==null?"\\N":fstrSecondaryIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecondaryNameControl==null?"\\N":fstrSecondaryNameControl, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrURI==null?"\\N":fstrURI, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrURIType==null?"\\N":fstrURIType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMedia==null?"\\N":fstrMedia, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReason==null?"\\N":fstrReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPayment==null?"\\N":fcurPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBatchKey==null?"\\N":"" + flngBatchKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRtnBatchId==null?"\\N":fstrRtnBatchId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmComposed==null?"\\N":"" + fdtmComposed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkType==null?"\\N":fstrWorkType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOpen==null?"\\N":"" + fblnOpen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnSuspenseKey = null; } else {
      this.flngReturnSuspenseKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocSetKey = null; } else {
      this.fi64DocSetKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSecondaryAccountKey = null; } else {
      this.flngSecondaryAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDataCapture = null; } else {
      this.fdtmDataCapture = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInError = null; } else {
      this.fblnInError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingStatus = null; } else {
      this.fstrFilingStatus = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrIdType = null; } else {
      this.fstrIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNameControl = null; } else {
      this.fstrNameControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecondaryId = null; } else {
      this.fstrSecondaryId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecondaryIdType = null; } else {
      this.fstrSecondaryIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecondaryNameControl = null; } else {
      this.fstrSecondaryNameControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrURI = null; } else {
      this.fstrURI = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrURIType = null; } else {
      this.fstrURIType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrReason = null; } else {
      this.fstrReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPayment = null; } else {
      this.fcurPayment = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBatchKey = null; } else {
      this.flngBatchKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRtnBatchId = null; } else {
      this.fstrRtnBatchId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmComposed = null; } else {
      this.fdtmComposed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkType = null; } else {
      this.fstrWorkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOpen = null; } else {
      this.fblnOpen = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnSuspenseKey = null; } else {
      this.flngReturnSuspenseKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocSetKey = null; } else {
      this.fi64DocSetKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSecondaryAccountKey = null; } else {
      this.flngSecondaryAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDataCapture = null; } else {
      this.fdtmDataCapture = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInError = null; } else {
      this.fblnInError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingStatus = null; } else {
      this.fstrFilingStatus = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrIdType = null; } else {
      this.fstrIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNameControl = null; } else {
      this.fstrNameControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecondaryId = null; } else {
      this.fstrSecondaryId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecondaryIdType = null; } else {
      this.fstrSecondaryIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecondaryNameControl = null; } else {
      this.fstrSecondaryNameControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrURI = null; } else {
      this.fstrURI = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrURIType = null; } else {
      this.fstrURIType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrReason = null; } else {
      this.fstrReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPayment = null; } else {
      this.fcurPayment = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBatchKey = null; } else {
      this.flngBatchKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRtnBatchId = null; } else {
      this.fstrRtnBatchId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmComposed = null; } else {
      this.fdtmComposed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkType = null; } else {
      this.fstrWorkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOpen = null; } else {
      this.fblnOpen = Integer.valueOf(__cur_str);
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
    tblreturnsuspense o = (tblreturnsuspense) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDataCapture = (o.fdtmDataCapture != null) ? (java.sql.Timestamp) o.fdtmDataCapture.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmComposed = (o.fdtmComposed != null) ? (java.sql.Timestamp) o.fdtmComposed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblreturnsuspense o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDataCapture = (o.fdtmDataCapture != null) ? (java.sql.Timestamp) o.fdtmDataCapture.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmComposed = (o.fdtmComposed != null) ? (java.sql.Timestamp) o.fdtmComposed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngReturnSuspenseKey", this.flngReturnSuspenseKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fi64DocSetKey", this.fi64DocSetKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngSecondaryAccountKey", this.flngSecondaryAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmDataCapture", this.fdtmDataCapture);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fblnInError", this.fblnInError);
    __sqoop$field_map.put("fstrFilingStatus", this.fstrFilingStatus);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fstrNameControl", this.fstrNameControl);
    __sqoop$field_map.put("fstrSecondaryId", this.fstrSecondaryId);
    __sqoop$field_map.put("fstrSecondaryIdType", this.fstrSecondaryIdType);
    __sqoop$field_map.put("fstrSecondaryNameControl", this.fstrSecondaryNameControl);
    __sqoop$field_map.put("fstrURI", this.fstrURI);
    __sqoop$field_map.put("fstrURIType", this.fstrURIType);
    __sqoop$field_map.put("fstrMedia", this.fstrMedia);
    __sqoop$field_map.put("fstrReason", this.fstrReason);
    __sqoop$field_map.put("fcurPayment", this.fcurPayment);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("flngBatchKey", this.flngBatchKey);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("fstrRtnBatchId", this.fstrRtnBatchId);
    __sqoop$field_map.put("fdtmComposed", this.fdtmComposed);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("fstrWorkType", this.fstrWorkType);
    __sqoop$field_map.put("fblnOpen", this.fblnOpen);
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngReturnSuspenseKey", this.flngReturnSuspenseKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fi64DocSetKey", this.fi64DocSetKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngSecondaryAccountKey", this.flngSecondaryAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmDataCapture", this.fdtmDataCapture);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fblnInError", this.fblnInError);
    __sqoop$field_map.put("fstrFilingStatus", this.fstrFilingStatus);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fstrNameControl", this.fstrNameControl);
    __sqoop$field_map.put("fstrSecondaryId", this.fstrSecondaryId);
    __sqoop$field_map.put("fstrSecondaryIdType", this.fstrSecondaryIdType);
    __sqoop$field_map.put("fstrSecondaryNameControl", this.fstrSecondaryNameControl);
    __sqoop$field_map.put("fstrURI", this.fstrURI);
    __sqoop$field_map.put("fstrURIType", this.fstrURIType);
    __sqoop$field_map.put("fstrMedia", this.fstrMedia);
    __sqoop$field_map.put("fstrReason", this.fstrReason);
    __sqoop$field_map.put("fcurPayment", this.fcurPayment);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("flngBatchKey", this.flngBatchKey);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("fstrRtnBatchId", this.fstrRtnBatchId);
    __sqoop$field_map.put("fdtmComposed", this.fdtmComposed);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("fstrWorkType", this.fstrWorkType);
    __sqoop$field_map.put("fblnOpen", this.fblnOpen);
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
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
