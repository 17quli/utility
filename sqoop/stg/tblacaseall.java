// ORM class for table 'tblacaseall'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:20:12 NZDT 2020
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

public class tblacaseall extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("flngWIFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.flngWIFolderKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrExternalId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrExternalId = (String)value;
      }
    });
    setters.put("fstrCaseType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrCaseType = (String)value;
      }
    });
    setters.put("fstrCaseCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrCaseCategory = (String)value;
      }
    });
    setters.put("fstrStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrStage = (String)value;
      }
    });
    setters.put("fdtmStageDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmStageDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCreatedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrCreatedBy = (String)value;
      }
    });
    setters.put("fdtmWorkDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmWorkDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmAssigned", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmAssigned = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmResolved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmResolved = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmAborted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmAborted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmClosed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmClosed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCloseReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrCloseReason = (String)value;
      }
    });
    setters.put("fstrStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrStatus = (String)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrOwner = (String)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrDescription = (String)value;
      }
    });
    setters.put("fstrPriority", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrPriority = (String)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fi64DocGroupKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fi64DocGroupKey = (Long)value;
      }
    });
    setters.put("flngParentCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.flngParentCaseKey = (Integer)value;
      }
    });
    setters.put("flngTeamKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.flngTeamKey = (Integer)value;
      }
    });
    setters.put("fblnManualUpdate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fblnManualUpdate = (Integer)value;
      }
    });
    setters.put("fstrId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrId = (String)value;
      }
    });
    setters.put("fstrIdType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrIdType = (String)value;
      }
    });
    setters.put("fi64NameKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fi64NameKey = (Long)value;
      }
    });
    setters.put("fstrName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrName = (String)value;
      }
    });
    setters.put("fstrLastName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrLastName = (String)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fstrMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrMiddleName = (String)value;
      }
    });
    setters.put("fstrTitleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrTitleName = (String)value;
      }
    });
    setters.put("fstrSuffixName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrSuffixName = (String)value;
      }
    });
    setters.put("fi64AddressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fi64AddressKey = (Long)value;
      }
    });
    setters.put("fstrAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrAddress = (String)value;
      }
    });
    setters.put("fstrStreet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrStreet = (String)value;
      }
    });
    setters.put("fstrStreet2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrStreet2 = (String)value;
      }
    });
    setters.put("fstrUnit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrUnit = (String)value;
      }
    });
    setters.put("fstrUnitType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrUnitType = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrCounty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrCounty = (String)value;
      }
    });
    setters.put("fstrState", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrState = (String)value;
      }
    });
    setters.put("fstrZip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrZip = (String)value;
      }
    });
    setters.put("fstrLocationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrLocationCode = (String)value;
      }
    });
    setters.put("fstrMunicipality", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrMunicipality = (String)value;
      }
    });
    setters.put("fstrUrbanization", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrUrbanization = (String)value;
      }
    });
    setters.put("fstrDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrDistrict = (String)value;
      }
    });
    setters.put("fstrSubDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrSubDistrict = (String)value;
      }
    });
    setters.put("fstrSubProvince", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrSubProvince = (String)value;
      }
    });
    setters.put("fstrAddressDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrAddressDescription = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrCountry = (String)value;
      }
    });
    setters.put("fstrAttention", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrAttention = (String)value;
      }
    });
    setters.put("fstrPrimaryLanguage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrPrimaryLanguage = (String)value;
      }
    });
    setters.put("fstrSecondaryLanguage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrSecondaryLanguage = (String)value;
      }
    });
    setters.put("fstrProtectType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrProtectType = (String)value;
      }
    });
    setters.put("fintProtectLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fintProtectLevel = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblacaseall.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblacaseall() {
    init0();
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tblacaseall with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblacaseall with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblacaseall with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private Integer flngWIFolderKey;
  public Integer get_flngWIFolderKey() {
    return flngWIFolderKey;
  }
  public void set_flngWIFolderKey(Integer flngWIFolderKey) {
    this.flngWIFolderKey = flngWIFolderKey;
  }
  public tblacaseall with_flngWIFolderKey(Integer flngWIFolderKey) {
    this.flngWIFolderKey = flngWIFolderKey;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblacaseall with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblacaseall with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblacaseall with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrExternalId;
  public String get_fstrExternalId() {
    return fstrExternalId;
  }
  public void set_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
  }
  public tblacaseall with_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
    return this;
  }
  private String fstrCaseType;
  public String get_fstrCaseType() {
    return fstrCaseType;
  }
  public void set_fstrCaseType(String fstrCaseType) {
    this.fstrCaseType = fstrCaseType;
  }
  public tblacaseall with_fstrCaseType(String fstrCaseType) {
    this.fstrCaseType = fstrCaseType;
    return this;
  }
  private String fstrCaseCategory;
  public String get_fstrCaseCategory() {
    return fstrCaseCategory;
  }
  public void set_fstrCaseCategory(String fstrCaseCategory) {
    this.fstrCaseCategory = fstrCaseCategory;
  }
  public tblacaseall with_fstrCaseCategory(String fstrCaseCategory) {
    this.fstrCaseCategory = fstrCaseCategory;
    return this;
  }
  private String fstrStage;
  public String get_fstrStage() {
    return fstrStage;
  }
  public void set_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
  }
  public tblacaseall with_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
    return this;
  }
  private java.sql.Timestamp fdtmStageDate;
  public java.sql.Timestamp get_fdtmStageDate() {
    return fdtmStageDate;
  }
  public void set_fdtmStageDate(java.sql.Timestamp fdtmStageDate) {
    this.fdtmStageDate = fdtmStageDate;
  }
  public tblacaseall with_fdtmStageDate(java.sql.Timestamp fdtmStageDate) {
    this.fdtmStageDate = fdtmStageDate;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblacaseall with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
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
  public tblacaseall with_fstrCreatedBy(String fstrCreatedBy) {
    this.fstrCreatedBy = fstrCreatedBy;
    return this;
  }
  private java.sql.Timestamp fdtmWorkDate;
  public java.sql.Timestamp get_fdtmWorkDate() {
    return fdtmWorkDate;
  }
  public void set_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
  }
  public tblacaseall with_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
    return this;
  }
  private java.sql.Timestamp fdtmReceived;
  public java.sql.Timestamp get_fdtmReceived() {
    return fdtmReceived;
  }
  public void set_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
  }
  public tblacaseall with_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
    return this;
  }
  private java.sql.Timestamp fdtmAssigned;
  public java.sql.Timestamp get_fdtmAssigned() {
    return fdtmAssigned;
  }
  public void set_fdtmAssigned(java.sql.Timestamp fdtmAssigned) {
    this.fdtmAssigned = fdtmAssigned;
  }
  public tblacaseall with_fdtmAssigned(java.sql.Timestamp fdtmAssigned) {
    this.fdtmAssigned = fdtmAssigned;
    return this;
  }
  private java.sql.Timestamp fdtmResolved;
  public java.sql.Timestamp get_fdtmResolved() {
    return fdtmResolved;
  }
  public void set_fdtmResolved(java.sql.Timestamp fdtmResolved) {
    this.fdtmResolved = fdtmResolved;
  }
  public tblacaseall with_fdtmResolved(java.sql.Timestamp fdtmResolved) {
    this.fdtmResolved = fdtmResolved;
    return this;
  }
  private java.sql.Timestamp fdtmAborted;
  public java.sql.Timestamp get_fdtmAborted() {
    return fdtmAborted;
  }
  public void set_fdtmAborted(java.sql.Timestamp fdtmAborted) {
    this.fdtmAborted = fdtmAborted;
  }
  public tblacaseall with_fdtmAborted(java.sql.Timestamp fdtmAborted) {
    this.fdtmAborted = fdtmAborted;
    return this;
  }
  private java.sql.Timestamp fdtmClosed;
  public java.sql.Timestamp get_fdtmClosed() {
    return fdtmClosed;
  }
  public void set_fdtmClosed(java.sql.Timestamp fdtmClosed) {
    this.fdtmClosed = fdtmClosed;
  }
  public tblacaseall with_fdtmClosed(java.sql.Timestamp fdtmClosed) {
    this.fdtmClosed = fdtmClosed;
    return this;
  }
  private String fstrCloseReason;
  public String get_fstrCloseReason() {
    return fstrCloseReason;
  }
  public void set_fstrCloseReason(String fstrCloseReason) {
    this.fstrCloseReason = fstrCloseReason;
  }
  public tblacaseall with_fstrCloseReason(String fstrCloseReason) {
    this.fstrCloseReason = fstrCloseReason;
    return this;
  }
  private String fstrStatus;
  public String get_fstrStatus() {
    return fstrStatus;
  }
  public void set_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
  }
  public tblacaseall with_fstrStatus(String fstrStatus) {
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
  public tblacaseall with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public tblacaseall with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  private String fstrPriority;
  public String get_fstrPriority() {
    return fstrPriority;
  }
  public void set_fstrPriority(String fstrPriority) {
    this.fstrPriority = fstrPriority;
  }
  public tblacaseall with_fstrPriority(String fstrPriority) {
    this.fstrPriority = fstrPriority;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblacaseall with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Long fi64DocGroupKey;
  public Long get_fi64DocGroupKey() {
    return fi64DocGroupKey;
  }
  public void set_fi64DocGroupKey(Long fi64DocGroupKey) {
    this.fi64DocGroupKey = fi64DocGroupKey;
  }
  public tblacaseall with_fi64DocGroupKey(Long fi64DocGroupKey) {
    this.fi64DocGroupKey = fi64DocGroupKey;
    return this;
  }
  private Integer flngParentCaseKey;
  public Integer get_flngParentCaseKey() {
    return flngParentCaseKey;
  }
  public void set_flngParentCaseKey(Integer flngParentCaseKey) {
    this.flngParentCaseKey = flngParentCaseKey;
  }
  public tblacaseall with_flngParentCaseKey(Integer flngParentCaseKey) {
    this.flngParentCaseKey = flngParentCaseKey;
    return this;
  }
  private Integer flngTeamKey;
  public Integer get_flngTeamKey() {
    return flngTeamKey;
  }
  public void set_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
  }
  public tblacaseall with_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
    return this;
  }
  private Integer fblnManualUpdate;
  public Integer get_fblnManualUpdate() {
    return fblnManualUpdate;
  }
  public void set_fblnManualUpdate(Integer fblnManualUpdate) {
    this.fblnManualUpdate = fblnManualUpdate;
  }
  public tblacaseall with_fblnManualUpdate(Integer fblnManualUpdate) {
    this.fblnManualUpdate = fblnManualUpdate;
    return this;
  }
  private String fstrId;
  public String get_fstrId() {
    return fstrId;
  }
  public void set_fstrId(String fstrId) {
    this.fstrId = fstrId;
  }
  public tblacaseall with_fstrId(String fstrId) {
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
  public tblacaseall with_fstrIdType(String fstrIdType) {
    this.fstrIdType = fstrIdType;
    return this;
  }
  private Long fi64NameKey;
  public Long get_fi64NameKey() {
    return fi64NameKey;
  }
  public void set_fi64NameKey(Long fi64NameKey) {
    this.fi64NameKey = fi64NameKey;
  }
  public tblacaseall with_fi64NameKey(Long fi64NameKey) {
    this.fi64NameKey = fi64NameKey;
    return this;
  }
  private String fstrName;
  public String get_fstrName() {
    return fstrName;
  }
  public void set_fstrName(String fstrName) {
    this.fstrName = fstrName;
  }
  public tblacaseall with_fstrName(String fstrName) {
    this.fstrName = fstrName;
    return this;
  }
  private String fstrLastName;
  public String get_fstrLastName() {
    return fstrLastName;
  }
  public void set_fstrLastName(String fstrLastName) {
    this.fstrLastName = fstrLastName;
  }
  public tblacaseall with_fstrLastName(String fstrLastName) {
    this.fstrLastName = fstrLastName;
    return this;
  }
  private String fstrFirstName;
  public String get_fstrFirstName() {
    return fstrFirstName;
  }
  public void set_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
  }
  public tblacaseall with_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
    return this;
  }
  private String fstrMiddleName;
  public String get_fstrMiddleName() {
    return fstrMiddleName;
  }
  public void set_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
  }
  public tblacaseall with_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
    return this;
  }
  private String fstrTitleName;
  public String get_fstrTitleName() {
    return fstrTitleName;
  }
  public void set_fstrTitleName(String fstrTitleName) {
    this.fstrTitleName = fstrTitleName;
  }
  public tblacaseall with_fstrTitleName(String fstrTitleName) {
    this.fstrTitleName = fstrTitleName;
    return this;
  }
  private String fstrSuffixName;
  public String get_fstrSuffixName() {
    return fstrSuffixName;
  }
  public void set_fstrSuffixName(String fstrSuffixName) {
    this.fstrSuffixName = fstrSuffixName;
  }
  public tblacaseall with_fstrSuffixName(String fstrSuffixName) {
    this.fstrSuffixName = fstrSuffixName;
    return this;
  }
  private Long fi64AddressKey;
  public Long get_fi64AddressKey() {
    return fi64AddressKey;
  }
  public void set_fi64AddressKey(Long fi64AddressKey) {
    this.fi64AddressKey = fi64AddressKey;
  }
  public tblacaseall with_fi64AddressKey(Long fi64AddressKey) {
    this.fi64AddressKey = fi64AddressKey;
    return this;
  }
  private String fstrAddress;
  public String get_fstrAddress() {
    return fstrAddress;
  }
  public void set_fstrAddress(String fstrAddress) {
    this.fstrAddress = fstrAddress;
  }
  public tblacaseall with_fstrAddress(String fstrAddress) {
    this.fstrAddress = fstrAddress;
    return this;
  }
  private String fstrStreet;
  public String get_fstrStreet() {
    return fstrStreet;
  }
  public void set_fstrStreet(String fstrStreet) {
    this.fstrStreet = fstrStreet;
  }
  public tblacaseall with_fstrStreet(String fstrStreet) {
    this.fstrStreet = fstrStreet;
    return this;
  }
  private String fstrStreet2;
  public String get_fstrStreet2() {
    return fstrStreet2;
  }
  public void set_fstrStreet2(String fstrStreet2) {
    this.fstrStreet2 = fstrStreet2;
  }
  public tblacaseall with_fstrStreet2(String fstrStreet2) {
    this.fstrStreet2 = fstrStreet2;
    return this;
  }
  private String fstrUnit;
  public String get_fstrUnit() {
    return fstrUnit;
  }
  public void set_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
  }
  public tblacaseall with_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
    return this;
  }
  private String fstrUnitType;
  public String get_fstrUnitType() {
    return fstrUnitType;
  }
  public void set_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
  }
  public tblacaseall with_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tblacaseall with_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
    return this;
  }
  private String fstrCounty;
  public String get_fstrCounty() {
    return fstrCounty;
  }
  public void set_fstrCounty(String fstrCounty) {
    this.fstrCounty = fstrCounty;
  }
  public tblacaseall with_fstrCounty(String fstrCounty) {
    this.fstrCounty = fstrCounty;
    return this;
  }
  private String fstrState;
  public String get_fstrState() {
    return fstrState;
  }
  public void set_fstrState(String fstrState) {
    this.fstrState = fstrState;
  }
  public tblacaseall with_fstrState(String fstrState) {
    this.fstrState = fstrState;
    return this;
  }
  private String fstrZip;
  public String get_fstrZip() {
    return fstrZip;
  }
  public void set_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
  }
  public tblacaseall with_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
    return this;
  }
  private String fstrLocationCode;
  public String get_fstrLocationCode() {
    return fstrLocationCode;
  }
  public void set_fstrLocationCode(String fstrLocationCode) {
    this.fstrLocationCode = fstrLocationCode;
  }
  public tblacaseall with_fstrLocationCode(String fstrLocationCode) {
    this.fstrLocationCode = fstrLocationCode;
    return this;
  }
  private String fstrMunicipality;
  public String get_fstrMunicipality() {
    return fstrMunicipality;
  }
  public void set_fstrMunicipality(String fstrMunicipality) {
    this.fstrMunicipality = fstrMunicipality;
  }
  public tblacaseall with_fstrMunicipality(String fstrMunicipality) {
    this.fstrMunicipality = fstrMunicipality;
    return this;
  }
  private String fstrUrbanization;
  public String get_fstrUrbanization() {
    return fstrUrbanization;
  }
  public void set_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
  }
  public tblacaseall with_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
    return this;
  }
  private String fstrDistrict;
  public String get_fstrDistrict() {
    return fstrDistrict;
  }
  public void set_fstrDistrict(String fstrDistrict) {
    this.fstrDistrict = fstrDistrict;
  }
  public tblacaseall with_fstrDistrict(String fstrDistrict) {
    this.fstrDistrict = fstrDistrict;
    return this;
  }
  private String fstrSubDistrict;
  public String get_fstrSubDistrict() {
    return fstrSubDistrict;
  }
  public void set_fstrSubDistrict(String fstrSubDistrict) {
    this.fstrSubDistrict = fstrSubDistrict;
  }
  public tblacaseall with_fstrSubDistrict(String fstrSubDistrict) {
    this.fstrSubDistrict = fstrSubDistrict;
    return this;
  }
  private String fstrSubProvince;
  public String get_fstrSubProvince() {
    return fstrSubProvince;
  }
  public void set_fstrSubProvince(String fstrSubProvince) {
    this.fstrSubProvince = fstrSubProvince;
  }
  public tblacaseall with_fstrSubProvince(String fstrSubProvince) {
    this.fstrSubProvince = fstrSubProvince;
    return this;
  }
  private String fstrAddressDescription;
  public String get_fstrAddressDescription() {
    return fstrAddressDescription;
  }
  public void set_fstrAddressDescription(String fstrAddressDescription) {
    this.fstrAddressDescription = fstrAddressDescription;
  }
  public tblacaseall with_fstrAddressDescription(String fstrAddressDescription) {
    this.fstrAddressDescription = fstrAddressDescription;
    return this;
  }
  private String fstrCountry;
  public String get_fstrCountry() {
    return fstrCountry;
  }
  public void set_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
  }
  public tblacaseall with_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
    return this;
  }
  private String fstrAttention;
  public String get_fstrAttention() {
    return fstrAttention;
  }
  public void set_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
  }
  public tblacaseall with_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
    return this;
  }
  private String fstrPrimaryLanguage;
  public String get_fstrPrimaryLanguage() {
    return fstrPrimaryLanguage;
  }
  public void set_fstrPrimaryLanguage(String fstrPrimaryLanguage) {
    this.fstrPrimaryLanguage = fstrPrimaryLanguage;
  }
  public tblacaseall with_fstrPrimaryLanguage(String fstrPrimaryLanguage) {
    this.fstrPrimaryLanguage = fstrPrimaryLanguage;
    return this;
  }
  private String fstrSecondaryLanguage;
  public String get_fstrSecondaryLanguage() {
    return fstrSecondaryLanguage;
  }
  public void set_fstrSecondaryLanguage(String fstrSecondaryLanguage) {
    this.fstrSecondaryLanguage = fstrSecondaryLanguage;
  }
  public tblacaseall with_fstrSecondaryLanguage(String fstrSecondaryLanguage) {
    this.fstrSecondaryLanguage = fstrSecondaryLanguage;
    return this;
  }
  private String fstrProtectType;
  public String get_fstrProtectType() {
    return fstrProtectType;
  }
  public void set_fstrProtectType(String fstrProtectType) {
    this.fstrProtectType = fstrProtectType;
  }
  public tblacaseall with_fstrProtectType(String fstrProtectType) {
    this.fstrProtectType = fstrProtectType;
    return this;
  }
  private Integer fintProtectLevel;
  public Integer get_fintProtectLevel() {
    return fintProtectLevel;
  }
  public void set_fintProtectLevel(Integer fintProtectLevel) {
    this.fintProtectLevel = fintProtectLevel;
  }
  public tblacaseall with_fintProtectLevel(Integer fintProtectLevel) {
    this.fintProtectLevel = fintProtectLevel;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblacaseall with_fstrWho(String fstrWho) {
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
  public tblacaseall with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblacaseall)) {
      return false;
    }
    tblacaseall that = (tblacaseall) o;
    boolean equal = true;
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngWIFolderKey == null ? that.flngWIFolderKey == null : this.flngWIFolderKey.equals(that.flngWIFolderKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fstrCaseType == null ? that.fstrCaseType == null : this.fstrCaseType.equals(that.fstrCaseType));
    equal = equal && (this.fstrCaseCategory == null ? that.fstrCaseCategory == null : this.fstrCaseCategory.equals(that.fstrCaseCategory));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fdtmStageDate == null ? that.fdtmStageDate == null : this.fdtmStageDate.equals(that.fdtmStageDate));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fdtmAssigned == null ? that.fdtmAssigned == null : this.fdtmAssigned.equals(that.fdtmAssigned));
    equal = equal && (this.fdtmResolved == null ? that.fdtmResolved == null : this.fdtmResolved.equals(that.fdtmResolved));
    equal = equal && (this.fdtmAborted == null ? that.fdtmAborted == null : this.fdtmAborted.equals(that.fdtmAborted));
    equal = equal && (this.fdtmClosed == null ? that.fdtmClosed == null : this.fdtmClosed.equals(that.fdtmClosed));
    equal = equal && (this.fstrCloseReason == null ? that.fstrCloseReason == null : this.fstrCloseReason.equals(that.fstrCloseReason));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fstrPriority == null ? that.fstrPriority == null : this.fstrPriority.equals(that.fstrPriority));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fi64DocGroupKey == null ? that.fi64DocGroupKey == null : this.fi64DocGroupKey.equals(that.fi64DocGroupKey));
    equal = equal && (this.flngParentCaseKey == null ? that.flngParentCaseKey == null : this.flngParentCaseKey.equals(that.flngParentCaseKey));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.fblnManualUpdate == null ? that.fblnManualUpdate == null : this.fblnManualUpdate.equals(that.fblnManualUpdate));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fi64NameKey == null ? that.fi64NameKey == null : this.fi64NameKey.equals(that.fi64NameKey));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrLastName == null ? that.fstrLastName == null : this.fstrLastName.equals(that.fstrLastName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrTitleName == null ? that.fstrTitleName == null : this.fstrTitleName.equals(that.fstrTitleName));
    equal = equal && (this.fstrSuffixName == null ? that.fstrSuffixName == null : this.fstrSuffixName.equals(that.fstrSuffixName));
    equal = equal && (this.fi64AddressKey == null ? that.fi64AddressKey == null : this.fi64AddressKey.equals(that.fi64AddressKey));
    equal = equal && (this.fstrAddress == null ? that.fstrAddress == null : this.fstrAddress.equals(that.fstrAddress));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrStreet2 == null ? that.fstrStreet2 == null : this.fstrStreet2.equals(that.fstrStreet2));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrLocationCode == null ? that.fstrLocationCode == null : this.fstrLocationCode.equals(that.fstrLocationCode));
    equal = equal && (this.fstrMunicipality == null ? that.fstrMunicipality == null : this.fstrMunicipality.equals(that.fstrMunicipality));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrPrimaryLanguage == null ? that.fstrPrimaryLanguage == null : this.fstrPrimaryLanguage.equals(that.fstrPrimaryLanguage));
    equal = equal && (this.fstrSecondaryLanguage == null ? that.fstrSecondaryLanguage == null : this.fstrSecondaryLanguage.equals(that.fstrSecondaryLanguage));
    equal = equal && (this.fstrProtectType == null ? that.fstrProtectType == null : this.fstrProtectType.equals(that.fstrProtectType));
    equal = equal && (this.fintProtectLevel == null ? that.fintProtectLevel == null : this.fintProtectLevel.equals(that.fintProtectLevel));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblacaseall)) {
      return false;
    }
    tblacaseall that = (tblacaseall) o;
    boolean equal = true;
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngWIFolderKey == null ? that.flngWIFolderKey == null : this.flngWIFolderKey.equals(that.flngWIFolderKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fstrCaseType == null ? that.fstrCaseType == null : this.fstrCaseType.equals(that.fstrCaseType));
    equal = equal && (this.fstrCaseCategory == null ? that.fstrCaseCategory == null : this.fstrCaseCategory.equals(that.fstrCaseCategory));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fdtmStageDate == null ? that.fdtmStageDate == null : this.fdtmStageDate.equals(that.fdtmStageDate));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fdtmAssigned == null ? that.fdtmAssigned == null : this.fdtmAssigned.equals(that.fdtmAssigned));
    equal = equal && (this.fdtmResolved == null ? that.fdtmResolved == null : this.fdtmResolved.equals(that.fdtmResolved));
    equal = equal && (this.fdtmAborted == null ? that.fdtmAborted == null : this.fdtmAborted.equals(that.fdtmAborted));
    equal = equal && (this.fdtmClosed == null ? that.fdtmClosed == null : this.fdtmClosed.equals(that.fdtmClosed));
    equal = equal && (this.fstrCloseReason == null ? that.fstrCloseReason == null : this.fstrCloseReason.equals(that.fstrCloseReason));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fstrPriority == null ? that.fstrPriority == null : this.fstrPriority.equals(that.fstrPriority));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fi64DocGroupKey == null ? that.fi64DocGroupKey == null : this.fi64DocGroupKey.equals(that.fi64DocGroupKey));
    equal = equal && (this.flngParentCaseKey == null ? that.flngParentCaseKey == null : this.flngParentCaseKey.equals(that.flngParentCaseKey));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.fblnManualUpdate == null ? that.fblnManualUpdate == null : this.fblnManualUpdate.equals(that.fblnManualUpdate));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fi64NameKey == null ? that.fi64NameKey == null : this.fi64NameKey.equals(that.fi64NameKey));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrLastName == null ? that.fstrLastName == null : this.fstrLastName.equals(that.fstrLastName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrTitleName == null ? that.fstrTitleName == null : this.fstrTitleName.equals(that.fstrTitleName));
    equal = equal && (this.fstrSuffixName == null ? that.fstrSuffixName == null : this.fstrSuffixName.equals(that.fstrSuffixName));
    equal = equal && (this.fi64AddressKey == null ? that.fi64AddressKey == null : this.fi64AddressKey.equals(that.fi64AddressKey));
    equal = equal && (this.fstrAddress == null ? that.fstrAddress == null : this.fstrAddress.equals(that.fstrAddress));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrStreet2 == null ? that.fstrStreet2 == null : this.fstrStreet2.equals(that.fstrStreet2));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrLocationCode == null ? that.fstrLocationCode == null : this.fstrLocationCode.equals(that.fstrLocationCode));
    equal = equal && (this.fstrMunicipality == null ? that.fstrMunicipality == null : this.fstrMunicipality.equals(that.fstrMunicipality));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrPrimaryLanguage == null ? that.fstrPrimaryLanguage == null : this.fstrPrimaryLanguage.equals(that.fstrPrimaryLanguage));
    equal = equal && (this.fstrSecondaryLanguage == null ? that.fstrSecondaryLanguage == null : this.fstrSecondaryLanguage.equals(that.fstrSecondaryLanguage));
    equal = equal && (this.fstrProtectType == null ? that.fstrProtectType == null : this.fstrProtectType.equals(that.fstrProtectType));
    equal = equal && (this.fintProtectLevel == null ? that.fintProtectLevel == null : this.fintProtectLevel.equals(that.fintProtectLevel));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCaseKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngWIFolderKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrCaseType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrCaseCategory = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmStageDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmAssigned = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmResolved = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmAborted = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmClosed = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrCloseReason = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPriority = JdbcWritableBridge.readString(25, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fi64DocGroupKey = JdbcWritableBridge.readLong(27, __dbResults);
    this.flngParentCaseKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fblnManualUpdate = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(32, __dbResults);
    this.fi64NameKey = JdbcWritableBridge.readLong(33, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrLastName = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrTitleName = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrSuffixName = JdbcWritableBridge.readString(39, __dbResults);
    this.fi64AddressKey = JdbcWritableBridge.readLong(40, __dbResults);
    this.fstrAddress = JdbcWritableBridge.readString(41, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(47, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(51, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(53, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(54, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(55, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(56, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(57, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(58, __dbResults);
    this.fstrPrimaryLanguage = JdbcWritableBridge.readString(59, __dbResults);
    this.fstrSecondaryLanguage = JdbcWritableBridge.readString(60, __dbResults);
    this.fstrProtectType = JdbcWritableBridge.readString(61, __dbResults);
    this.fintProtectLevel = JdbcWritableBridge.readInteger(62, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(63, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(64, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCaseKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngWIFolderKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrCaseType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrCaseCategory = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmStageDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmAssigned = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmResolved = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmAborted = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmClosed = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrCloseReason = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPriority = JdbcWritableBridge.readString(25, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fi64DocGroupKey = JdbcWritableBridge.readLong(27, __dbResults);
    this.flngParentCaseKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fblnManualUpdate = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(32, __dbResults);
    this.fi64NameKey = JdbcWritableBridge.readLong(33, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrLastName = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrTitleName = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrSuffixName = JdbcWritableBridge.readString(39, __dbResults);
    this.fi64AddressKey = JdbcWritableBridge.readLong(40, __dbResults);
    this.fstrAddress = JdbcWritableBridge.readString(41, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(47, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(51, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(53, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(54, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(55, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(56, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(57, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(58, __dbResults);
    this.fstrPrimaryLanguage = JdbcWritableBridge.readString(59, __dbResults);
    this.fstrSecondaryLanguage = JdbcWritableBridge.readString(60, __dbResults);
    this.fstrProtectType = JdbcWritableBridge.readString(61, __dbResults);
    this.fintProtectLevel = JdbcWritableBridge.readInteger(62, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(63, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(64, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCaseKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWIFolderKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCaseType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCaseCategory, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStageDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAssigned, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmResolved, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAborted, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosed, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCloseReason, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPriority, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocGroupKey, 27 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParentCaseKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualUpdate, 30 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NameKey, 33 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastName, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitleName, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuffixName, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64AddressKey, 40 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddress, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 55 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 57 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 58 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrimaryLanguage, 59 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecondaryLanguage, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrProtectType, 61 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProtectLevel, 62 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 63 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 64 + __off, 93, __dbStmt);
    return 64;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCaseKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWIFolderKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCaseType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCaseCategory, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStageDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAssigned, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmResolved, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAborted, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosed, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCloseReason, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPriority, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocGroupKey, 27 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParentCaseKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualUpdate, 30 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NameKey, 33 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastName, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitleName, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuffixName, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64AddressKey, 40 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddress, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 55 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 57 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 58 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrimaryLanguage, 59 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecondaryLanguage, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrProtectType, 61 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProtectLevel, 62 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 63 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 64 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngWIFolderKey = null;
    } else {
    this.flngWIFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExternalId = null;
    } else {
    this.fstrExternalId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCaseType = null;
    } else {
    this.fstrCaseType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCaseCategory = null;
    } else {
    this.fstrCaseCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStage = null;
    } else {
    this.fstrStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStageDate = null;
    } else {
    this.fdtmStageDate = new Timestamp(__dataIn.readLong());
    this.fdtmStageDate.setNanos(__dataIn.readInt());
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
        this.fdtmWorkDate = null;
    } else {
    this.fdtmWorkDate = new Timestamp(__dataIn.readLong());
    this.fdtmWorkDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReceived = null;
    } else {
    this.fdtmReceived = new Timestamp(__dataIn.readLong());
    this.fdtmReceived.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAssigned = null;
    } else {
    this.fdtmAssigned = new Timestamp(__dataIn.readLong());
    this.fdtmAssigned.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmResolved = null;
    } else {
    this.fdtmResolved = new Timestamp(__dataIn.readLong());
    this.fdtmResolved.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAborted = null;
    } else {
    this.fdtmAborted = new Timestamp(__dataIn.readLong());
    this.fdtmAborted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClosed = null;
    } else {
    this.fdtmClosed = new Timestamp(__dataIn.readLong());
    this.fdtmClosed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCloseReason = null;
    } else {
    this.fstrCloseReason = Text.readString(__dataIn);
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
        this.fstrDescription = null;
    } else {
    this.fstrDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPriority = null;
    } else {
    this.fstrPriority = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64DocGroupKey = null;
    } else {
    this.fi64DocGroupKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngParentCaseKey = null;
    } else {
    this.flngParentCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTeamKey = null;
    } else {
    this.flngTeamKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnManualUpdate = null;
    } else {
    this.fblnManualUpdate = Integer.valueOf(__dataIn.readInt());
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
        this.fi64NameKey = null;
    } else {
    this.fi64NameKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrName = null;
    } else {
    this.fstrName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastName = null;
    } else {
    this.fstrLastName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFirstName = null;
    } else {
    this.fstrFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMiddleName = null;
    } else {
    this.fstrMiddleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTitleName = null;
    } else {
    this.fstrTitleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSuffixName = null;
    } else {
    this.fstrSuffixName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64AddressKey = null;
    } else {
    this.fi64AddressKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddress = null;
    } else {
    this.fstrAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreet = null;
    } else {
    this.fstrStreet = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreet2 = null;
    } else {
    this.fstrStreet2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnit = null;
    } else {
    this.fstrUnit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnitType = null;
    } else {
    this.fstrUnitType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCity = null;
    } else {
    this.fstrCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCounty = null;
    } else {
    this.fstrCounty = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrState = null;
    } else {
    this.fstrState = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrZip = null;
    } else {
    this.fstrZip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLocationCode = null;
    } else {
    this.fstrLocationCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMunicipality = null;
    } else {
    this.fstrMunicipality = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUrbanization = null;
    } else {
    this.fstrUrbanization = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDistrict = null;
    } else {
    this.fstrDistrict = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubDistrict = null;
    } else {
    this.fstrSubDistrict = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubProvince = null;
    } else {
    this.fstrSubProvince = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressDescription = null;
    } else {
    this.fstrAddressDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry = null;
    } else {
    this.fstrCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAttention = null;
    } else {
    this.fstrAttention = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPrimaryLanguage = null;
    } else {
    this.fstrPrimaryLanguage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSecondaryLanguage = null;
    } else {
    this.fstrSecondaryLanguage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrProtectType = null;
    } else {
    this.fstrProtectType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintProtectLevel = null;
    } else {
    this.fintProtectLevel = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngWIFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWIFolderKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fstrCaseType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCaseType);
    }
    if (null == this.fstrCaseCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCaseCategory);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fdtmStageDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStageDate.getTime());
    __dataOut.writeInt(this.fdtmStageDate.getNanos());
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
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fdtmAssigned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAssigned.getTime());
    __dataOut.writeInt(this.fdtmAssigned.getNanos());
    }
    if (null == this.fdtmResolved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmResolved.getTime());
    __dataOut.writeInt(this.fdtmResolved.getNanos());
    }
    if (null == this.fdtmAborted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAborted.getTime());
    __dataOut.writeInt(this.fdtmAborted.getNanos());
    }
    if (null == this.fdtmClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosed.getTime());
    __dataOut.writeInt(this.fdtmClosed.getNanos());
    }
    if (null == this.fstrCloseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCloseReason);
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
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fstrPriority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPriority);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fi64DocGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocGroupKey);
    }
    if (null == this.flngParentCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParentCaseKey);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.fblnManualUpdate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualUpdate);
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
    if (null == this.fi64NameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NameKey);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrLastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastName);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrTitleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTitleName);
    }
    if (null == this.fstrSuffixName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuffixName);
    }
    if (null == this.fi64AddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AddressKey);
    }
    if (null == this.fstrAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddress);
    }
    if (null == this.fstrStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet);
    }
    if (null == this.fstrStreet2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet2);
    }
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrCounty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCounty);
    }
    if (null == this.fstrState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrState);
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
    }
    if (null == this.fstrLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCode);
    }
    if (null == this.fstrMunicipality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMunicipality);
    }
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fstrDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrict);
    }
    if (null == this.fstrSubDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubDistrict);
    }
    if (null == this.fstrSubProvince) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubProvince);
    }
    if (null == this.fstrAddressDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressDescription);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrAttention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttention);
    }
    if (null == this.fstrPrimaryLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrimaryLanguage);
    }
    if (null == this.fstrSecondaryLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecondaryLanguage);
    }
    if (null == this.fstrProtectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProtectType);
    }
    if (null == this.fintProtectLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProtectLevel);
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
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngWIFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWIFolderKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fstrCaseType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCaseType);
    }
    if (null == this.fstrCaseCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCaseCategory);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fdtmStageDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStageDate.getTime());
    __dataOut.writeInt(this.fdtmStageDate.getNanos());
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
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fdtmAssigned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAssigned.getTime());
    __dataOut.writeInt(this.fdtmAssigned.getNanos());
    }
    if (null == this.fdtmResolved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmResolved.getTime());
    __dataOut.writeInt(this.fdtmResolved.getNanos());
    }
    if (null == this.fdtmAborted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAborted.getTime());
    __dataOut.writeInt(this.fdtmAborted.getNanos());
    }
    if (null == this.fdtmClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosed.getTime());
    __dataOut.writeInt(this.fdtmClosed.getNanos());
    }
    if (null == this.fstrCloseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCloseReason);
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
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fstrPriority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPriority);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fi64DocGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocGroupKey);
    }
    if (null == this.flngParentCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParentCaseKey);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.fblnManualUpdate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualUpdate);
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
    if (null == this.fi64NameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NameKey);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrLastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastName);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrTitleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTitleName);
    }
    if (null == this.fstrSuffixName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuffixName);
    }
    if (null == this.fi64AddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AddressKey);
    }
    if (null == this.fstrAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddress);
    }
    if (null == this.fstrStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet);
    }
    if (null == this.fstrStreet2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet2);
    }
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrCounty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCounty);
    }
    if (null == this.fstrState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrState);
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
    }
    if (null == this.fstrLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCode);
    }
    if (null == this.fstrMunicipality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMunicipality);
    }
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fstrDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrict);
    }
    if (null == this.fstrSubDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubDistrict);
    }
    if (null == this.fstrSubProvince) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubProvince);
    }
    if (null == this.fstrAddressDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressDescription);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrAttention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttention);
    }
    if (null == this.fstrPrimaryLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrimaryLanguage);
    }
    if (null == this.fstrSecondaryLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecondaryLanguage);
    }
    if (null == this.fstrProtectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProtectType);
    }
    if (null == this.fintProtectLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProtectLevel);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWIFolderKey==null?"\\N":"" + flngWIFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCaseType==null?"\\N":fstrCaseType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCaseCategory==null?"\\N":fstrCaseCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStageDate==null?"\\N":"" + fdtmStageDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAssigned==null?"\\N":"" + fdtmAssigned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmResolved==null?"\\N":"" + fdtmResolved, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAborted==null?"\\N":"" + fdtmAborted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosed==null?"\\N":"" + fdtmClosed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCloseReason==null?"\\N":fstrCloseReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPriority==null?"\\N":fstrPriority, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocGroupKey==null?"\\N":"" + fi64DocGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParentCaseKey==null?"\\N":"" + flngParentCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualUpdate==null?"\\N":"" + fblnManualUpdate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NameKey==null?"\\N":"" + fi64NameKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastName==null?"\\N":fstrLastName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTitleName==null?"\\N":fstrTitleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuffixName==null?"\\N":fstrSuffixName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AddressKey==null?"\\N":"" + fi64AddressKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddress==null?"\\N":fstrAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet2==null?"\\N":fstrStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCounty==null?"\\N":fstrCounty, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrState==null?"\\N":fstrState, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCode==null?"\\N":fstrLocationCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMunicipality==null?"\\N":fstrMunicipality, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrict==null?"\\N":fstrDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubDistrict==null?"\\N":fstrSubDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubProvince==null?"\\N":fstrSubProvince, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressDescription==null?"\\N":fstrAddressDescription, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrimaryLanguage==null?"\\N":fstrPrimaryLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecondaryLanguage==null?"\\N":fstrSecondaryLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProtectType==null?"\\N":fstrProtectType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProtectLevel==null?"\\N":"" + fintProtectLevel, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWIFolderKey==null?"\\N":"" + flngWIFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCaseType==null?"\\N":fstrCaseType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCaseCategory==null?"\\N":fstrCaseCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStageDate==null?"\\N":"" + fdtmStageDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAssigned==null?"\\N":"" + fdtmAssigned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmResolved==null?"\\N":"" + fdtmResolved, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAborted==null?"\\N":"" + fdtmAborted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosed==null?"\\N":"" + fdtmClosed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCloseReason==null?"\\N":fstrCloseReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPriority==null?"\\N":fstrPriority, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocGroupKey==null?"\\N":"" + fi64DocGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParentCaseKey==null?"\\N":"" + flngParentCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualUpdate==null?"\\N":"" + fblnManualUpdate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NameKey==null?"\\N":"" + fi64NameKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastName==null?"\\N":fstrLastName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTitleName==null?"\\N":fstrTitleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuffixName==null?"\\N":fstrSuffixName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AddressKey==null?"\\N":"" + fi64AddressKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddress==null?"\\N":fstrAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet2==null?"\\N":fstrStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCounty==null?"\\N":fstrCounty, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrState==null?"\\N":fstrState, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCode==null?"\\N":fstrLocationCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMunicipality==null?"\\N":fstrMunicipality, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrict==null?"\\N":fstrDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubDistrict==null?"\\N":fstrSubDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubProvince==null?"\\N":fstrSubProvince, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressDescription==null?"\\N":fstrAddressDescription, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrimaryLanguage==null?"\\N":fstrPrimaryLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecondaryLanguage==null?"\\N":fstrSecondaryLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProtectType==null?"\\N":fstrProtectType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProtectLevel==null?"\\N":"" + fintProtectLevel, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWIFolderKey = null; } else {
      this.flngWIFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCaseType = null; } else {
      this.fstrCaseType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCaseCategory = null; } else {
      this.fstrCaseCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStageDate = null; } else {
      this.fdtmStageDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAssigned = null; } else {
      this.fdtmAssigned = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmResolved = null; } else {
      this.fdtmResolved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAborted = null; } else {
      this.fdtmAborted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosed = null; } else {
      this.fdtmClosed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCloseReason = null; } else {
      this.fstrCloseReason = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPriority = null; } else {
      this.fstrPriority = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocGroupKey = null; } else {
      this.fi64DocGroupKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParentCaseKey = null; } else {
      this.flngParentCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamKey = null; } else {
      this.flngTeamKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManualUpdate = null; } else {
      this.fblnManualUpdate = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NameKey = null; } else {
      this.fi64NameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastName = null; } else {
      this.fstrLastName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTitleName = null; } else {
      this.fstrTitleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSuffixName = null; } else {
      this.fstrSuffixName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64AddressKey = null; } else {
      this.fi64AddressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddress = null; } else {
      this.fstrAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet = null; } else {
      this.fstrStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet2 = null; } else {
      this.fstrStreet2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCounty = null; } else {
      this.fstrCounty = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrState = null; } else {
      this.fstrState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLocationCode = null; } else {
      this.fstrLocationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMunicipality = null; } else {
      this.fstrMunicipality = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUrbanization = null; } else {
      this.fstrUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrict = null; } else {
      this.fstrDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubDistrict = null; } else {
      this.fstrSubDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubProvince = null; } else {
      this.fstrSubProvince = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressDescription = null; } else {
      this.fstrAddressDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttention = null; } else {
      this.fstrAttention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrimaryLanguage = null; } else {
      this.fstrPrimaryLanguage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecondaryLanguage = null; } else {
      this.fstrSecondaryLanguage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProtectType = null; } else {
      this.fstrProtectType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProtectLevel = null; } else {
      this.fintProtectLevel = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWIFolderKey = null; } else {
      this.flngWIFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCaseType = null; } else {
      this.fstrCaseType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCaseCategory = null; } else {
      this.fstrCaseCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStageDate = null; } else {
      this.fdtmStageDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAssigned = null; } else {
      this.fdtmAssigned = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmResolved = null; } else {
      this.fdtmResolved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAborted = null; } else {
      this.fdtmAborted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosed = null; } else {
      this.fdtmClosed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCloseReason = null; } else {
      this.fstrCloseReason = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPriority = null; } else {
      this.fstrPriority = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocGroupKey = null; } else {
      this.fi64DocGroupKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParentCaseKey = null; } else {
      this.flngParentCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamKey = null; } else {
      this.flngTeamKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManualUpdate = null; } else {
      this.fblnManualUpdate = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NameKey = null; } else {
      this.fi64NameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastName = null; } else {
      this.fstrLastName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTitleName = null; } else {
      this.fstrTitleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSuffixName = null; } else {
      this.fstrSuffixName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64AddressKey = null; } else {
      this.fi64AddressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddress = null; } else {
      this.fstrAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet = null; } else {
      this.fstrStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet2 = null; } else {
      this.fstrStreet2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCounty = null; } else {
      this.fstrCounty = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrState = null; } else {
      this.fstrState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLocationCode = null; } else {
      this.fstrLocationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMunicipality = null; } else {
      this.fstrMunicipality = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUrbanization = null; } else {
      this.fstrUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrict = null; } else {
      this.fstrDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubDistrict = null; } else {
      this.fstrSubDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubProvince = null; } else {
      this.fstrSubProvince = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressDescription = null; } else {
      this.fstrAddressDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttention = null; } else {
      this.fstrAttention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrimaryLanguage = null; } else {
      this.fstrPrimaryLanguage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecondaryLanguage = null; } else {
      this.fstrSecondaryLanguage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProtectType = null; } else {
      this.fstrProtectType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProtectLevel = null; } else {
      this.fintProtectLevel = Integer.valueOf(__cur_str);
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
    tblacaseall o = (tblacaseall) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmStageDate = (o.fdtmStageDate != null) ? (java.sql.Timestamp) o.fdtmStageDate.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmAssigned = (o.fdtmAssigned != null) ? (java.sql.Timestamp) o.fdtmAssigned.clone() : null;
    o.fdtmResolved = (o.fdtmResolved != null) ? (java.sql.Timestamp) o.fdtmResolved.clone() : null;
    o.fdtmAborted = (o.fdtmAborted != null) ? (java.sql.Timestamp) o.fdtmAborted.clone() : null;
    o.fdtmClosed = (o.fdtmClosed != null) ? (java.sql.Timestamp) o.fdtmClosed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblacaseall o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmStageDate = (o.fdtmStageDate != null) ? (java.sql.Timestamp) o.fdtmStageDate.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmAssigned = (o.fdtmAssigned != null) ? (java.sql.Timestamp) o.fdtmAssigned.clone() : null;
    o.fdtmResolved = (o.fdtmResolved != null) ? (java.sql.Timestamp) o.fdtmResolved.clone() : null;
    o.fdtmAborted = (o.fdtmAborted != null) ? (java.sql.Timestamp) o.fdtmAborted.clone() : null;
    o.fdtmClosed = (o.fdtmClosed != null) ? (java.sql.Timestamp) o.fdtmClosed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngWIFolderKey", this.flngWIFolderKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fstrCaseType", this.fstrCaseType);
    __sqoop$field_map.put("fstrCaseCategory", this.fstrCaseCategory);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fdtmStageDate", this.fdtmStageDate);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fdtmAssigned", this.fdtmAssigned);
    __sqoop$field_map.put("fdtmResolved", this.fdtmResolved);
    __sqoop$field_map.put("fdtmAborted", this.fdtmAborted);
    __sqoop$field_map.put("fdtmClosed", this.fdtmClosed);
    __sqoop$field_map.put("fstrCloseReason", this.fstrCloseReason);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fstrPriority", this.fstrPriority);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fi64DocGroupKey", this.fi64DocGroupKey);
    __sqoop$field_map.put("flngParentCaseKey", this.flngParentCaseKey);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("fblnManualUpdate", this.fblnManualUpdate);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fi64NameKey", this.fi64NameKey);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrLastName", this.fstrLastName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrTitleName", this.fstrTitleName);
    __sqoop$field_map.put("fstrSuffixName", this.fstrSuffixName);
    __sqoop$field_map.put("fi64AddressKey", this.fi64AddressKey);
    __sqoop$field_map.put("fstrAddress", this.fstrAddress);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrStreet2", this.fstrStreet2);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fstrLocationCode", this.fstrLocationCode);
    __sqoop$field_map.put("fstrMunicipality", this.fstrMunicipality);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrPrimaryLanguage", this.fstrPrimaryLanguage);
    __sqoop$field_map.put("fstrSecondaryLanguage", this.fstrSecondaryLanguage);
    __sqoop$field_map.put("fstrProtectType", this.fstrProtectType);
    __sqoop$field_map.put("fintProtectLevel", this.fintProtectLevel);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngWIFolderKey", this.flngWIFolderKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fstrCaseType", this.fstrCaseType);
    __sqoop$field_map.put("fstrCaseCategory", this.fstrCaseCategory);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fdtmStageDate", this.fdtmStageDate);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fdtmAssigned", this.fdtmAssigned);
    __sqoop$field_map.put("fdtmResolved", this.fdtmResolved);
    __sqoop$field_map.put("fdtmAborted", this.fdtmAborted);
    __sqoop$field_map.put("fdtmClosed", this.fdtmClosed);
    __sqoop$field_map.put("fstrCloseReason", this.fstrCloseReason);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fstrPriority", this.fstrPriority);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fi64DocGroupKey", this.fi64DocGroupKey);
    __sqoop$field_map.put("flngParentCaseKey", this.flngParentCaseKey);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("fblnManualUpdate", this.fblnManualUpdate);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fi64NameKey", this.fi64NameKey);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrLastName", this.fstrLastName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrTitleName", this.fstrTitleName);
    __sqoop$field_map.put("fstrSuffixName", this.fstrSuffixName);
    __sqoop$field_map.put("fi64AddressKey", this.fi64AddressKey);
    __sqoop$field_map.put("fstrAddress", this.fstrAddress);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrStreet2", this.fstrStreet2);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fstrLocationCode", this.fstrLocationCode);
    __sqoop$field_map.put("fstrMunicipality", this.fstrMunicipality);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrPrimaryLanguage", this.fstrPrimaryLanguage);
    __sqoop$field_map.put("fstrSecondaryLanguage", this.fstrSecondaryLanguage);
    __sqoop$field_map.put("fstrProtectType", this.fstrProtectType);
    __sqoop$field_map.put("fintProtectLevel", this.fintProtectLevel);
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
