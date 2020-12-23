// ORM class for table 'tbllead'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:56:37 NZDT 2020
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

public class tbllead extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngLeadKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngLeadKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrLeadCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrLeadCategory = (String)value;
      }
    });
    setters.put("fstrLeadType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrLeadType = (String)value;
      }
    });
    setters.put("fstrLeadWorkArea", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrLeadWorkArea = (String)value;
      }
    });
    setters.put("fstrManager", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrManager = (String)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrAccountType = (String)value;
      }
    });
    setters.put("flngSourceDiscoveryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngSourceDiscoveryKey = (Integer)value;
      }
    });
    setters.put("fstrRecordKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrRecordKey = (String)value;
      }
    });
    setters.put("flngTeamKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngTeamKey = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngCRMKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngCRMKey = (Integer)value;
      }
    });
    setters.put("fstrNextAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrNextAction = (String)value;
      }
    });
    setters.put("flngNextActionTaskKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.flngNextActionTaskKey = (Integer)value;
      }
    });
    setters.put("fstrNextActionWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrNextActionWho = (String)value;
      }
    });
    setters.put("fdtmNextActionDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fdtmNextActionDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrNextActionLogEntry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrNextActionLogEntry = (String)value;
      }
    });
    setters.put("fblnNextActionInError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fblnNextActionInError = (Integer)value;
      }
    });
    setters.put("fstrLastAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrLastAction = (String)value;
      }
    });
    setters.put("fstrLastActionOutCome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrLastActionOutCome = (String)value;
      }
    });
    setters.put("fstrLastActionWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrLastActionWho = (String)value;
      }
    });
    setters.put("fdtmLastActionDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fdtmLastActionDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLastActionActual", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fdtmLastActionActual = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmExpires", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fdtmExpires = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCreatedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrCreatedWho = (String)value;
      }
    });
    setters.put("fdtmClosed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fdtmClosed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrClosedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrClosedWho = (String)value;
      }
    });
    setters.put("fstrCloseReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrCloseReason = (String)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProbability", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fcurProbability = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRecoverability", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fcurRecoverability = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrIdType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrIdType = (String)value;
      }
    });
    setters.put("fstrId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrId = (String)value;
      }
    });
    setters.put("fstrFormattedId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrFormattedId = (String)value;
      }
    });
    setters.put("fstrName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrName = (String)value;
      }
    });
    setters.put("fstrFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrFamilyName = (String)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fstrMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrMiddleName = (String)value;
      }
    });
    setters.put("fstrTitleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrTitleName = (String)value;
      }
    });
    setters.put("fstrSuffixName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrSuffixName = (String)value;
      }
    });
    setters.put("fstrAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrAddress = (String)value;
      }
    });
    setters.put("fstrStreet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrStreet = (String)value;
      }
    });
    setters.put("fstrStreet2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrStreet2 = (String)value;
      }
    });
    setters.put("fstrUnit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrUnit = (String)value;
      }
    });
    setters.put("fstrUnitType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrUnitType = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrCounty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrCounty = (String)value;
      }
    });
    setters.put("fstrState", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrState = (String)value;
      }
    });
    setters.put("fstrZip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrZip = (String)value;
      }
    });
    setters.put("fstrLocationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrLocationCode = (String)value;
      }
    });
    setters.put("fstrMunicipality", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrMunicipality = (String)value;
      }
    });
    setters.put("fstrUrbanization", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrUrbanization = (String)value;
      }
    });
    setters.put("fstrDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrDistrict = (String)value;
      }
    });
    setters.put("fstrSubDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrSubDistrict = (String)value;
      }
    });
    setters.put("fstrSubProvince", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrSubProvince = (String)value;
      }
    });
    setters.put("fstrAddressDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrAddressDescription = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrCountry = (String)value;
      }
    });
    setters.put("fstrAttention", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrAttention = (String)value;
      }
    });
    setters.put("fstrDistrictOffice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrDistrictOffice = (String)value;
      }
    });
    setters.put("fstrData", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrData = (String)value;
      }
    });
    setters.put("fstrLeadParameters", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrLeadParameters = (String)value;
      }
    });
    setters.put("fi64LeadParametersKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fi64LeadParametersKey = (Long)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbllead.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tbllead() {
    init0();
  }
  private Integer flngLeadKey;
  public Integer get_flngLeadKey() {
    return flngLeadKey;
  }
  public void set_flngLeadKey(Integer flngLeadKey) {
    this.flngLeadKey = flngLeadKey;
  }
  public tbllead with_flngLeadKey(Integer flngLeadKey) {
    this.flngLeadKey = flngLeadKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tbllead with_flngVer(Integer flngVer) {
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
  public tbllead with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrLeadCategory;
  public String get_fstrLeadCategory() {
    return fstrLeadCategory;
  }
  public void set_fstrLeadCategory(String fstrLeadCategory) {
    this.fstrLeadCategory = fstrLeadCategory;
  }
  public tbllead with_fstrLeadCategory(String fstrLeadCategory) {
    this.fstrLeadCategory = fstrLeadCategory;
    return this;
  }
  private String fstrLeadType;
  public String get_fstrLeadType() {
    return fstrLeadType;
  }
  public void set_fstrLeadType(String fstrLeadType) {
    this.fstrLeadType = fstrLeadType;
  }
  public tbllead with_fstrLeadType(String fstrLeadType) {
    this.fstrLeadType = fstrLeadType;
    return this;
  }
  private String fstrLeadWorkArea;
  public String get_fstrLeadWorkArea() {
    return fstrLeadWorkArea;
  }
  public void set_fstrLeadWorkArea(String fstrLeadWorkArea) {
    this.fstrLeadWorkArea = fstrLeadWorkArea;
  }
  public tbllead with_fstrLeadWorkArea(String fstrLeadWorkArea) {
    this.fstrLeadWorkArea = fstrLeadWorkArea;
    return this;
  }
  private String fstrManager;
  public String get_fstrManager() {
    return fstrManager;
  }
  public void set_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
  }
  public tbllead with_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tbllead with_flngCustomerKey(Integer flngCustomerKey) {
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
  public tbllead with_flngAccountKey(Integer flngAccountKey) {
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
  public tbllead with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
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
  public tbllead with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private Integer flngSourceDiscoveryKey;
  public Integer get_flngSourceDiscoveryKey() {
    return flngSourceDiscoveryKey;
  }
  public void set_flngSourceDiscoveryKey(Integer flngSourceDiscoveryKey) {
    this.flngSourceDiscoveryKey = flngSourceDiscoveryKey;
  }
  public tbllead with_flngSourceDiscoveryKey(Integer flngSourceDiscoveryKey) {
    this.flngSourceDiscoveryKey = flngSourceDiscoveryKey;
    return this;
  }
  private String fstrRecordKey;
  public String get_fstrRecordKey() {
    return fstrRecordKey;
  }
  public void set_fstrRecordKey(String fstrRecordKey) {
    this.fstrRecordKey = fstrRecordKey;
  }
  public tbllead with_fstrRecordKey(String fstrRecordKey) {
    this.fstrRecordKey = fstrRecordKey;
    return this;
  }
  private Integer flngTeamKey;
  public Integer get_flngTeamKey() {
    return flngTeamKey;
  }
  public void set_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
  }
  public tbllead with_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tbllead with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngCRMKey;
  public Integer get_flngCRMKey() {
    return flngCRMKey;
  }
  public void set_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
  }
  public tbllead with_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
    return this;
  }
  private String fstrNextAction;
  public String get_fstrNextAction() {
    return fstrNextAction;
  }
  public void set_fstrNextAction(String fstrNextAction) {
    this.fstrNextAction = fstrNextAction;
  }
  public tbllead with_fstrNextAction(String fstrNextAction) {
    this.fstrNextAction = fstrNextAction;
    return this;
  }
  private Integer flngNextActionTaskKey;
  public Integer get_flngNextActionTaskKey() {
    return flngNextActionTaskKey;
  }
  public void set_flngNextActionTaskKey(Integer flngNextActionTaskKey) {
    this.flngNextActionTaskKey = flngNextActionTaskKey;
  }
  public tbllead with_flngNextActionTaskKey(Integer flngNextActionTaskKey) {
    this.flngNextActionTaskKey = flngNextActionTaskKey;
    return this;
  }
  private String fstrNextActionWho;
  public String get_fstrNextActionWho() {
    return fstrNextActionWho;
  }
  public void set_fstrNextActionWho(String fstrNextActionWho) {
    this.fstrNextActionWho = fstrNextActionWho;
  }
  public tbllead with_fstrNextActionWho(String fstrNextActionWho) {
    this.fstrNextActionWho = fstrNextActionWho;
    return this;
  }
  private java.sql.Timestamp fdtmNextActionDue;
  public java.sql.Timestamp get_fdtmNextActionDue() {
    return fdtmNextActionDue;
  }
  public void set_fdtmNextActionDue(java.sql.Timestamp fdtmNextActionDue) {
    this.fdtmNextActionDue = fdtmNextActionDue;
  }
  public tbllead with_fdtmNextActionDue(java.sql.Timestamp fdtmNextActionDue) {
    this.fdtmNextActionDue = fdtmNextActionDue;
    return this;
  }
  private String fstrNextActionLogEntry;
  public String get_fstrNextActionLogEntry() {
    return fstrNextActionLogEntry;
  }
  public void set_fstrNextActionLogEntry(String fstrNextActionLogEntry) {
    this.fstrNextActionLogEntry = fstrNextActionLogEntry;
  }
  public tbllead with_fstrNextActionLogEntry(String fstrNextActionLogEntry) {
    this.fstrNextActionLogEntry = fstrNextActionLogEntry;
    return this;
  }
  private Integer fblnNextActionInError;
  public Integer get_fblnNextActionInError() {
    return fblnNextActionInError;
  }
  public void set_fblnNextActionInError(Integer fblnNextActionInError) {
    this.fblnNextActionInError = fblnNextActionInError;
  }
  public tbllead with_fblnNextActionInError(Integer fblnNextActionInError) {
    this.fblnNextActionInError = fblnNextActionInError;
    return this;
  }
  private String fstrLastAction;
  public String get_fstrLastAction() {
    return fstrLastAction;
  }
  public void set_fstrLastAction(String fstrLastAction) {
    this.fstrLastAction = fstrLastAction;
  }
  public tbllead with_fstrLastAction(String fstrLastAction) {
    this.fstrLastAction = fstrLastAction;
    return this;
  }
  private String fstrLastActionOutCome;
  public String get_fstrLastActionOutCome() {
    return fstrLastActionOutCome;
  }
  public void set_fstrLastActionOutCome(String fstrLastActionOutCome) {
    this.fstrLastActionOutCome = fstrLastActionOutCome;
  }
  public tbllead with_fstrLastActionOutCome(String fstrLastActionOutCome) {
    this.fstrLastActionOutCome = fstrLastActionOutCome;
    return this;
  }
  private String fstrLastActionWho;
  public String get_fstrLastActionWho() {
    return fstrLastActionWho;
  }
  public void set_fstrLastActionWho(String fstrLastActionWho) {
    this.fstrLastActionWho = fstrLastActionWho;
  }
  public tbllead with_fstrLastActionWho(String fstrLastActionWho) {
    this.fstrLastActionWho = fstrLastActionWho;
    return this;
  }
  private java.sql.Timestamp fdtmLastActionDue;
  public java.sql.Timestamp get_fdtmLastActionDue() {
    return fdtmLastActionDue;
  }
  public void set_fdtmLastActionDue(java.sql.Timestamp fdtmLastActionDue) {
    this.fdtmLastActionDue = fdtmLastActionDue;
  }
  public tbllead with_fdtmLastActionDue(java.sql.Timestamp fdtmLastActionDue) {
    this.fdtmLastActionDue = fdtmLastActionDue;
    return this;
  }
  private java.sql.Timestamp fdtmLastActionActual;
  public java.sql.Timestamp get_fdtmLastActionActual() {
    return fdtmLastActionActual;
  }
  public void set_fdtmLastActionActual(java.sql.Timestamp fdtmLastActionActual) {
    this.fdtmLastActionActual = fdtmLastActionActual;
  }
  public tbllead with_fdtmLastActionActual(java.sql.Timestamp fdtmLastActionActual) {
    this.fdtmLastActionActual = fdtmLastActionActual;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tbllead with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private java.sql.Timestamp fdtmExpires;
  public java.sql.Timestamp get_fdtmExpires() {
    return fdtmExpires;
  }
  public void set_fdtmExpires(java.sql.Timestamp fdtmExpires) {
    this.fdtmExpires = fdtmExpires;
  }
  public tbllead with_fdtmExpires(java.sql.Timestamp fdtmExpires) {
    this.fdtmExpires = fdtmExpires;
    return this;
  }
  private String fstrCreatedWho;
  public String get_fstrCreatedWho() {
    return fstrCreatedWho;
  }
  public void set_fstrCreatedWho(String fstrCreatedWho) {
    this.fstrCreatedWho = fstrCreatedWho;
  }
  public tbllead with_fstrCreatedWho(String fstrCreatedWho) {
    this.fstrCreatedWho = fstrCreatedWho;
    return this;
  }
  private java.sql.Timestamp fdtmClosed;
  public java.sql.Timestamp get_fdtmClosed() {
    return fdtmClosed;
  }
  public void set_fdtmClosed(java.sql.Timestamp fdtmClosed) {
    this.fdtmClosed = fdtmClosed;
  }
  public tbllead with_fdtmClosed(java.sql.Timestamp fdtmClosed) {
    this.fdtmClosed = fdtmClosed;
    return this;
  }
  private String fstrClosedWho;
  public String get_fstrClosedWho() {
    return fstrClosedWho;
  }
  public void set_fstrClosedWho(String fstrClosedWho) {
    this.fstrClosedWho = fstrClosedWho;
  }
  public tbllead with_fstrClosedWho(String fstrClosedWho) {
    this.fstrClosedWho = fstrClosedWho;
    return this;
  }
  private String fstrCloseReason;
  public String get_fstrCloseReason() {
    return fstrCloseReason;
  }
  public void set_fstrCloseReason(String fstrCloseReason) {
    this.fstrCloseReason = fstrCloseReason;
  }
  public tbllead with_fstrCloseReason(String fstrCloseReason) {
    this.fstrCloseReason = fstrCloseReason;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tbllead with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private java.math.BigDecimal fcurProbability;
  public java.math.BigDecimal get_fcurProbability() {
    return fcurProbability;
  }
  public void set_fcurProbability(java.math.BigDecimal fcurProbability) {
    this.fcurProbability = fcurProbability;
  }
  public tbllead with_fcurProbability(java.math.BigDecimal fcurProbability) {
    this.fcurProbability = fcurProbability;
    return this;
  }
  private java.math.BigDecimal fcurRecoverability;
  public java.math.BigDecimal get_fcurRecoverability() {
    return fcurRecoverability;
  }
  public void set_fcurRecoverability(java.math.BigDecimal fcurRecoverability) {
    this.fcurRecoverability = fcurRecoverability;
  }
  public tbllead with_fcurRecoverability(java.math.BigDecimal fcurRecoverability) {
    this.fcurRecoverability = fcurRecoverability;
    return this;
  }
  private String fstrIdType;
  public String get_fstrIdType() {
    return fstrIdType;
  }
  public void set_fstrIdType(String fstrIdType) {
    this.fstrIdType = fstrIdType;
  }
  public tbllead with_fstrIdType(String fstrIdType) {
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
  public tbllead with_fstrId(String fstrId) {
    this.fstrId = fstrId;
    return this;
  }
  private String fstrFormattedId;
  public String get_fstrFormattedId() {
    return fstrFormattedId;
  }
  public void set_fstrFormattedId(String fstrFormattedId) {
    this.fstrFormattedId = fstrFormattedId;
  }
  public tbllead with_fstrFormattedId(String fstrFormattedId) {
    this.fstrFormattedId = fstrFormattedId;
    return this;
  }
  private String fstrName;
  public String get_fstrName() {
    return fstrName;
  }
  public void set_fstrName(String fstrName) {
    this.fstrName = fstrName;
  }
  public tbllead with_fstrName(String fstrName) {
    this.fstrName = fstrName;
    return this;
  }
  private String fstrFamilyName;
  public String get_fstrFamilyName() {
    return fstrFamilyName;
  }
  public void set_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
  }
  public tbllead with_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
    return this;
  }
  private String fstrFirstName;
  public String get_fstrFirstName() {
    return fstrFirstName;
  }
  public void set_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
  }
  public tbllead with_fstrFirstName(String fstrFirstName) {
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
  public tbllead with_fstrMiddleName(String fstrMiddleName) {
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
  public tbllead with_fstrTitleName(String fstrTitleName) {
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
  public tbllead with_fstrSuffixName(String fstrSuffixName) {
    this.fstrSuffixName = fstrSuffixName;
    return this;
  }
  private String fstrAddress;
  public String get_fstrAddress() {
    return fstrAddress;
  }
  public void set_fstrAddress(String fstrAddress) {
    this.fstrAddress = fstrAddress;
  }
  public tbllead with_fstrAddress(String fstrAddress) {
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
  public tbllead with_fstrStreet(String fstrStreet) {
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
  public tbllead with_fstrStreet2(String fstrStreet2) {
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
  public tbllead with_fstrUnit(String fstrUnit) {
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
  public tbllead with_fstrUnitType(String fstrUnitType) {
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
  public tbllead with_fstrCity(String fstrCity) {
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
  public tbllead with_fstrCounty(String fstrCounty) {
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
  public tbllead with_fstrState(String fstrState) {
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
  public tbllead with_fstrZip(String fstrZip) {
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
  public tbllead with_fstrLocationCode(String fstrLocationCode) {
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
  public tbllead with_fstrMunicipality(String fstrMunicipality) {
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
  public tbllead with_fstrUrbanization(String fstrUrbanization) {
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
  public tbllead with_fstrDistrict(String fstrDistrict) {
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
  public tbllead with_fstrSubDistrict(String fstrSubDistrict) {
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
  public tbllead with_fstrSubProvince(String fstrSubProvince) {
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
  public tbllead with_fstrAddressDescription(String fstrAddressDescription) {
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
  public tbllead with_fstrCountry(String fstrCountry) {
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
  public tbllead with_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
    return this;
  }
  private String fstrDistrictOffice;
  public String get_fstrDistrictOffice() {
    return fstrDistrictOffice;
  }
  public void set_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
  }
  public tbllead with_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
    return this;
  }
  private String fstrData;
  public String get_fstrData() {
    return fstrData;
  }
  public void set_fstrData(String fstrData) {
    this.fstrData = fstrData;
  }
  public tbllead with_fstrData(String fstrData) {
    this.fstrData = fstrData;
    return this;
  }
  private String fstrLeadParameters;
  public String get_fstrLeadParameters() {
    return fstrLeadParameters;
  }
  public void set_fstrLeadParameters(String fstrLeadParameters) {
    this.fstrLeadParameters = fstrLeadParameters;
  }
  public tbllead with_fstrLeadParameters(String fstrLeadParameters) {
    this.fstrLeadParameters = fstrLeadParameters;
    return this;
  }
  private Long fi64LeadParametersKey;
  public Long get_fi64LeadParametersKey() {
    return fi64LeadParametersKey;
  }
  public void set_fi64LeadParametersKey(Long fi64LeadParametersKey) {
    this.fi64LeadParametersKey = fi64LeadParametersKey;
  }
  public tbllead with_fi64LeadParametersKey(Long fi64LeadParametersKey) {
    this.fi64LeadParametersKey = fi64LeadParametersKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tbllead with_fstrWho(String fstrWho) {
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
  public tbllead with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbllead)) {
      return false;
    }
    tbllead that = (tbllead) o;
    boolean equal = true;
    equal = equal && (this.flngLeadKey == null ? that.flngLeadKey == null : this.flngLeadKey.equals(that.flngLeadKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrLeadCategory == null ? that.fstrLeadCategory == null : this.fstrLeadCategory.equals(that.fstrLeadCategory));
    equal = equal && (this.fstrLeadType == null ? that.fstrLeadType == null : this.fstrLeadType.equals(that.fstrLeadType));
    equal = equal && (this.fstrLeadWorkArea == null ? that.fstrLeadWorkArea == null : this.fstrLeadWorkArea.equals(that.fstrLeadWorkArea));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.flngSourceDiscoveryKey == null ? that.flngSourceDiscoveryKey == null : this.flngSourceDiscoveryKey.equals(that.flngSourceDiscoveryKey));
    equal = equal && (this.fstrRecordKey == null ? that.fstrRecordKey == null : this.fstrRecordKey.equals(that.fstrRecordKey));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrNextAction == null ? that.fstrNextAction == null : this.fstrNextAction.equals(that.fstrNextAction));
    equal = equal && (this.flngNextActionTaskKey == null ? that.flngNextActionTaskKey == null : this.flngNextActionTaskKey.equals(that.flngNextActionTaskKey));
    equal = equal && (this.fstrNextActionWho == null ? that.fstrNextActionWho == null : this.fstrNextActionWho.equals(that.fstrNextActionWho));
    equal = equal && (this.fdtmNextActionDue == null ? that.fdtmNextActionDue == null : this.fdtmNextActionDue.equals(that.fdtmNextActionDue));
    equal = equal && (this.fstrNextActionLogEntry == null ? that.fstrNextActionLogEntry == null : this.fstrNextActionLogEntry.equals(that.fstrNextActionLogEntry));
    equal = equal && (this.fblnNextActionInError == null ? that.fblnNextActionInError == null : this.fblnNextActionInError.equals(that.fblnNextActionInError));
    equal = equal && (this.fstrLastAction == null ? that.fstrLastAction == null : this.fstrLastAction.equals(that.fstrLastAction));
    equal = equal && (this.fstrLastActionOutCome == null ? that.fstrLastActionOutCome == null : this.fstrLastActionOutCome.equals(that.fstrLastActionOutCome));
    equal = equal && (this.fstrLastActionWho == null ? that.fstrLastActionWho == null : this.fstrLastActionWho.equals(that.fstrLastActionWho));
    equal = equal && (this.fdtmLastActionDue == null ? that.fdtmLastActionDue == null : this.fdtmLastActionDue.equals(that.fdtmLastActionDue));
    equal = equal && (this.fdtmLastActionActual == null ? that.fdtmLastActionActual == null : this.fdtmLastActionActual.equals(that.fdtmLastActionActual));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fdtmExpires == null ? that.fdtmExpires == null : this.fdtmExpires.equals(that.fdtmExpires));
    equal = equal && (this.fstrCreatedWho == null ? that.fstrCreatedWho == null : this.fstrCreatedWho.equals(that.fstrCreatedWho));
    equal = equal && (this.fdtmClosed == null ? that.fdtmClosed == null : this.fdtmClosed.equals(that.fdtmClosed));
    equal = equal && (this.fstrClosedWho == null ? that.fstrClosedWho == null : this.fstrClosedWho.equals(that.fstrClosedWho));
    equal = equal && (this.fstrCloseReason == null ? that.fstrCloseReason == null : this.fstrCloseReason.equals(that.fstrCloseReason));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fcurProbability == null ? that.fcurProbability == null : this.fcurProbability.equals(that.fcurProbability));
    equal = equal && (this.fcurRecoverability == null ? that.fcurRecoverability == null : this.fcurRecoverability.equals(that.fcurRecoverability));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrFormattedId == null ? that.fstrFormattedId == null : this.fstrFormattedId.equals(that.fstrFormattedId));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrTitleName == null ? that.fstrTitleName == null : this.fstrTitleName.equals(that.fstrTitleName));
    equal = equal && (this.fstrSuffixName == null ? that.fstrSuffixName == null : this.fstrSuffixName.equals(that.fstrSuffixName));
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
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrData == null ? that.fstrData == null : this.fstrData.equals(that.fstrData));
    equal = equal && (this.fstrLeadParameters == null ? that.fstrLeadParameters == null : this.fstrLeadParameters.equals(that.fstrLeadParameters));
    equal = equal && (this.fi64LeadParametersKey == null ? that.fi64LeadParametersKey == null : this.fi64LeadParametersKey.equals(that.fi64LeadParametersKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbllead)) {
      return false;
    }
    tbllead that = (tbllead) o;
    boolean equal = true;
    equal = equal && (this.flngLeadKey == null ? that.flngLeadKey == null : this.flngLeadKey.equals(that.flngLeadKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrLeadCategory == null ? that.fstrLeadCategory == null : this.fstrLeadCategory.equals(that.fstrLeadCategory));
    equal = equal && (this.fstrLeadType == null ? that.fstrLeadType == null : this.fstrLeadType.equals(that.fstrLeadType));
    equal = equal && (this.fstrLeadWorkArea == null ? that.fstrLeadWorkArea == null : this.fstrLeadWorkArea.equals(that.fstrLeadWorkArea));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.flngSourceDiscoveryKey == null ? that.flngSourceDiscoveryKey == null : this.flngSourceDiscoveryKey.equals(that.flngSourceDiscoveryKey));
    equal = equal && (this.fstrRecordKey == null ? that.fstrRecordKey == null : this.fstrRecordKey.equals(that.fstrRecordKey));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrNextAction == null ? that.fstrNextAction == null : this.fstrNextAction.equals(that.fstrNextAction));
    equal = equal && (this.flngNextActionTaskKey == null ? that.flngNextActionTaskKey == null : this.flngNextActionTaskKey.equals(that.flngNextActionTaskKey));
    equal = equal && (this.fstrNextActionWho == null ? that.fstrNextActionWho == null : this.fstrNextActionWho.equals(that.fstrNextActionWho));
    equal = equal && (this.fdtmNextActionDue == null ? that.fdtmNextActionDue == null : this.fdtmNextActionDue.equals(that.fdtmNextActionDue));
    equal = equal && (this.fstrNextActionLogEntry == null ? that.fstrNextActionLogEntry == null : this.fstrNextActionLogEntry.equals(that.fstrNextActionLogEntry));
    equal = equal && (this.fblnNextActionInError == null ? that.fblnNextActionInError == null : this.fblnNextActionInError.equals(that.fblnNextActionInError));
    equal = equal && (this.fstrLastAction == null ? that.fstrLastAction == null : this.fstrLastAction.equals(that.fstrLastAction));
    equal = equal && (this.fstrLastActionOutCome == null ? that.fstrLastActionOutCome == null : this.fstrLastActionOutCome.equals(that.fstrLastActionOutCome));
    equal = equal && (this.fstrLastActionWho == null ? that.fstrLastActionWho == null : this.fstrLastActionWho.equals(that.fstrLastActionWho));
    equal = equal && (this.fdtmLastActionDue == null ? that.fdtmLastActionDue == null : this.fdtmLastActionDue.equals(that.fdtmLastActionDue));
    equal = equal && (this.fdtmLastActionActual == null ? that.fdtmLastActionActual == null : this.fdtmLastActionActual.equals(that.fdtmLastActionActual));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fdtmExpires == null ? that.fdtmExpires == null : this.fdtmExpires.equals(that.fdtmExpires));
    equal = equal && (this.fstrCreatedWho == null ? that.fstrCreatedWho == null : this.fstrCreatedWho.equals(that.fstrCreatedWho));
    equal = equal && (this.fdtmClosed == null ? that.fdtmClosed == null : this.fdtmClosed.equals(that.fdtmClosed));
    equal = equal && (this.fstrClosedWho == null ? that.fstrClosedWho == null : this.fstrClosedWho.equals(that.fstrClosedWho));
    equal = equal && (this.fstrCloseReason == null ? that.fstrCloseReason == null : this.fstrCloseReason.equals(that.fstrCloseReason));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fcurProbability == null ? that.fcurProbability == null : this.fcurProbability.equals(that.fcurProbability));
    equal = equal && (this.fcurRecoverability == null ? that.fcurRecoverability == null : this.fcurRecoverability.equals(that.fcurRecoverability));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrFormattedId == null ? that.fstrFormattedId == null : this.fstrFormattedId.equals(that.fstrFormattedId));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrTitleName == null ? that.fstrTitleName == null : this.fstrTitleName.equals(that.fstrTitleName));
    equal = equal && (this.fstrSuffixName == null ? that.fstrSuffixName == null : this.fstrSuffixName.equals(that.fstrSuffixName));
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
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrData == null ? that.fstrData == null : this.fstrData.equals(that.fstrData));
    equal = equal && (this.fstrLeadParameters == null ? that.fstrLeadParameters == null : this.fstrLeadParameters.equals(that.fstrLeadParameters));
    equal = equal && (this.fi64LeadParametersKey == null ? that.fi64LeadParametersKey == null : this.fi64LeadParametersKey.equals(that.fi64LeadParametersKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngLeadKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrLeadCategory = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrLeadType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrLeadWorkArea = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(7, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(11, __dbResults);
    this.flngSourceDiscoveryKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrRecordKey = JdbcWritableBridge.readString(13, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrNextAction = JdbcWritableBridge.readString(17, __dbResults);
    this.flngNextActionTaskKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrNextActionWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmNextActionDue = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrNextActionLogEntry = JdbcWritableBridge.readString(21, __dbResults);
    this.fblnNextActionInError = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrLastAction = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrLastActionOutCome = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrLastActionWho = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmLastActionDue = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fdtmLastActionActual = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fdtmExpires = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fstrCreatedWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmClosed = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.fstrClosedWho = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrCloseReason = JdbcWritableBridge.readString(33, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurProbability = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurRecoverability = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrFormattedId = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(41, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrTitleName = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrSuffixName = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrAddress = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(47, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(51, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(53, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(54, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(55, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(56, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(57, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(58, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(59, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(60, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(61, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(62, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(63, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(64, __dbResults);
    this.fstrData = JdbcWritableBridge.readString(65, __dbResults);
    this.fstrLeadParameters = JdbcWritableBridge.readString(66, __dbResults);
    this.fi64LeadParametersKey = JdbcWritableBridge.readLong(67, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(68, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(69, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngLeadKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrLeadCategory = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrLeadType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrLeadWorkArea = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(7, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(11, __dbResults);
    this.flngSourceDiscoveryKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrRecordKey = JdbcWritableBridge.readString(13, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrNextAction = JdbcWritableBridge.readString(17, __dbResults);
    this.flngNextActionTaskKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrNextActionWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmNextActionDue = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrNextActionLogEntry = JdbcWritableBridge.readString(21, __dbResults);
    this.fblnNextActionInError = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrLastAction = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrLastActionOutCome = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrLastActionWho = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmLastActionDue = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fdtmLastActionActual = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fdtmExpires = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fstrCreatedWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmClosed = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.fstrClosedWho = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrCloseReason = JdbcWritableBridge.readString(33, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurProbability = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurRecoverability = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrFormattedId = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(41, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrTitleName = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrSuffixName = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrAddress = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(47, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(51, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(53, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(54, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(55, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(56, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(57, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(58, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(59, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(60, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(61, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(62, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(63, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(64, __dbResults);
    this.fstrData = JdbcWritableBridge.readString(65, __dbResults);
    this.fstrLeadParameters = JdbcWritableBridge.readString(66, __dbResults);
    this.fi64LeadParametersKey = JdbcWritableBridge.readLong(67, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(68, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(69, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngLeadKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadCategory, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadWorkArea, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceDiscoveryKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecordKey, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrNextAction, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNextActionTaskKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrNextActionWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextActionDue, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrNextActionLogEntry, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNextActionInError, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastAction, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastActionOutCome, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastActionWho, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastActionDue, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastActionActual, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExpires, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosed, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosedWho, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCloseReason, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProbability, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRecoverability, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormattedId, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitleName, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuffixName, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddress, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 55 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 57 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 58 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 59 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 61 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 62 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 63 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 64 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrData, 65 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadParameters, 66 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64LeadParametersKey, 67 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 68 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 69 + __off, 93, __dbStmt);
    return 69;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngLeadKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadCategory, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadWorkArea, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceDiscoveryKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecordKey, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrNextAction, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNextActionTaskKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrNextActionWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextActionDue, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrNextActionLogEntry, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNextActionInError, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastAction, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastActionOutCome, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastActionWho, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastActionDue, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastActionActual, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExpires, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosed, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosedWho, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCloseReason, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProbability, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRecoverability, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormattedId, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitleName, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuffixName, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddress, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 55 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 57 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 58 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 59 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 61 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 62 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 63 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 64 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrData, 65 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadParameters, 66 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64LeadParametersKey, 67 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 68 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 69 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngLeadKey = null;
    } else {
    this.flngLeadKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrLeadCategory = null;
    } else {
    this.fstrLeadCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLeadType = null;
    } else {
    this.fstrLeadType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLeadWorkArea = null;
    } else {
    this.fstrLeadWorkArea = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrManager = null;
    } else {
    this.fstrManager = Text.readString(__dataIn);
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
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngSourceDiscoveryKey = null;
    } else {
    this.flngSourceDiscoveryKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecordKey = null;
    } else {
    this.fstrRecordKey = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngTeamKey = null;
    } else {
    this.flngTeamKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCRMKey = null;
    } else {
    this.flngCRMKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNextAction = null;
    } else {
    this.fstrNextAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngNextActionTaskKey = null;
    } else {
    this.flngNextActionTaskKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNextActionWho = null;
    } else {
    this.fstrNextActionWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmNextActionDue = null;
    } else {
    this.fdtmNextActionDue = new Timestamp(__dataIn.readLong());
    this.fdtmNextActionDue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNextActionLogEntry = null;
    } else {
    this.fstrNextActionLogEntry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNextActionInError = null;
    } else {
    this.fblnNextActionInError = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastAction = null;
    } else {
    this.fstrLastAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastActionOutCome = null;
    } else {
    this.fstrLastActionOutCome = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastActionWho = null;
    } else {
    this.fstrLastActionWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastActionDue = null;
    } else {
    this.fdtmLastActionDue = new Timestamp(__dataIn.readLong());
    this.fdtmLastActionDue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastActionActual = null;
    } else {
    this.fdtmLastActionActual = new Timestamp(__dataIn.readLong());
    this.fdtmLastActionActual.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmExpires = null;
    } else {
    this.fdtmExpires = new Timestamp(__dataIn.readLong());
    this.fdtmExpires.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreatedWho = null;
    } else {
    this.fstrCreatedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClosed = null;
    } else {
    this.fdtmClosed = new Timestamp(__dataIn.readLong());
    this.fdtmClosed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrClosedWho = null;
    } else {
    this.fstrClosedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCloseReason = null;
    } else {
    this.fstrCloseReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProbability = null;
    } else {
    this.fcurProbability = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRecoverability = null;
    } else {
    this.fcurRecoverability = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fstrFormattedId = null;
    } else {
    this.fstrFormattedId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrName = null;
    } else {
    this.fstrName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFamilyName = null;
    } else {
    this.fstrFamilyName = Text.readString(__dataIn);
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
        this.fstrDistrictOffice = null;
    } else {
    this.fstrDistrictOffice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrData = null;
    } else {
    this.fstrData = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLeadParameters = null;
    } else {
    this.fstrLeadParameters = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64LeadParametersKey = null;
    } else {
    this.fi64LeadParametersKey = Long.valueOf(__dataIn.readLong());
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
    if (null == this.flngLeadKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLeadKey);
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
    if (null == this.fstrLeadCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadCategory);
    }
    if (null == this.fstrLeadType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadType);
    }
    if (null == this.fstrLeadWorkArea) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadWorkArea);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
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
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.flngSourceDiscoveryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceDiscoveryKey);
    }
    if (null == this.fstrRecordKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecordKey);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
    }
    if (null == this.fstrNextAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNextAction);
    }
    if (null == this.flngNextActionTaskKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNextActionTaskKey);
    }
    if (null == this.fstrNextActionWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNextActionWho);
    }
    if (null == this.fdtmNextActionDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextActionDue.getTime());
    __dataOut.writeInt(this.fdtmNextActionDue.getNanos());
    }
    if (null == this.fstrNextActionLogEntry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNextActionLogEntry);
    }
    if (null == this.fblnNextActionInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNextActionInError);
    }
    if (null == this.fstrLastAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastAction);
    }
    if (null == this.fstrLastActionOutCome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastActionOutCome);
    }
    if (null == this.fstrLastActionWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastActionWho);
    }
    if (null == this.fdtmLastActionDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastActionDue.getTime());
    __dataOut.writeInt(this.fdtmLastActionDue.getNanos());
    }
    if (null == this.fdtmLastActionActual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastActionActual.getTime());
    __dataOut.writeInt(this.fdtmLastActionActual.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fdtmExpires) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExpires.getTime());
    __dataOut.writeInt(this.fdtmExpires.getNanos());
    }
    if (null == this.fstrCreatedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedWho);
    }
    if (null == this.fdtmClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosed.getTime());
    __dataOut.writeInt(this.fdtmClosed.getNanos());
    }
    if (null == this.fstrClosedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosedWho);
    }
    if (null == this.fstrCloseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCloseReason);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fcurProbability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProbability, __dataOut);
    }
    if (null == this.fcurRecoverability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRecoverability, __dataOut);
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
    if (null == this.fstrFormattedId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormattedId);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
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
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrData);
    }
    if (null == this.fstrLeadParameters) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadParameters);
    }
    if (null == this.fi64LeadParametersKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LeadParametersKey);
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
    if (null == this.flngLeadKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLeadKey);
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
    if (null == this.fstrLeadCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadCategory);
    }
    if (null == this.fstrLeadType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadType);
    }
    if (null == this.fstrLeadWorkArea) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadWorkArea);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
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
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.flngSourceDiscoveryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceDiscoveryKey);
    }
    if (null == this.fstrRecordKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecordKey);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
    }
    if (null == this.fstrNextAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNextAction);
    }
    if (null == this.flngNextActionTaskKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNextActionTaskKey);
    }
    if (null == this.fstrNextActionWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNextActionWho);
    }
    if (null == this.fdtmNextActionDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextActionDue.getTime());
    __dataOut.writeInt(this.fdtmNextActionDue.getNanos());
    }
    if (null == this.fstrNextActionLogEntry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNextActionLogEntry);
    }
    if (null == this.fblnNextActionInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNextActionInError);
    }
    if (null == this.fstrLastAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastAction);
    }
    if (null == this.fstrLastActionOutCome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastActionOutCome);
    }
    if (null == this.fstrLastActionWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastActionWho);
    }
    if (null == this.fdtmLastActionDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastActionDue.getTime());
    __dataOut.writeInt(this.fdtmLastActionDue.getNanos());
    }
    if (null == this.fdtmLastActionActual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastActionActual.getTime());
    __dataOut.writeInt(this.fdtmLastActionActual.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fdtmExpires) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExpires.getTime());
    __dataOut.writeInt(this.fdtmExpires.getNanos());
    }
    if (null == this.fstrCreatedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedWho);
    }
    if (null == this.fdtmClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosed.getTime());
    __dataOut.writeInt(this.fdtmClosed.getNanos());
    }
    if (null == this.fstrClosedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosedWho);
    }
    if (null == this.fstrCloseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCloseReason);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fcurProbability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProbability, __dataOut);
    }
    if (null == this.fcurRecoverability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRecoverability, __dataOut);
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
    if (null == this.fstrFormattedId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormattedId);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
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
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrData);
    }
    if (null == this.fstrLeadParameters) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadParameters);
    }
    if (null == this.fi64LeadParametersKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LeadParametersKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngLeadKey==null?"\\N":"" + flngLeadKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadCategory==null?"\\N":fstrLeadCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadType==null?"\\N":fstrLeadType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadWorkArea==null?"\\N":fstrLeadWorkArea, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceDiscoveryKey==null?"\\N":"" + flngSourceDiscoveryKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecordKey==null?"\\N":fstrRecordKey, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNextAction==null?"\\N":fstrNextAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNextActionTaskKey==null?"\\N":"" + flngNextActionTaskKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNextActionWho==null?"\\N":fstrNextActionWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextActionDue==null?"\\N":"" + fdtmNextActionDue, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNextActionLogEntry==null?"\\N":fstrNextActionLogEntry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNextActionInError==null?"\\N":"" + fblnNextActionInError, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastAction==null?"\\N":fstrLastAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastActionOutCome==null?"\\N":fstrLastActionOutCome, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastActionWho==null?"\\N":fstrLastActionWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastActionDue==null?"\\N":"" + fdtmLastActionDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastActionActual==null?"\\N":"" + fdtmLastActionActual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExpires==null?"\\N":"" + fdtmExpires, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedWho==null?"\\N":fstrCreatedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosed==null?"\\N":"" + fdtmClosed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosedWho==null?"\\N":fstrClosedWho, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCloseReason==null?"\\N":fstrCloseReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProbability==null?"\\N":fcurProbability.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRecoverability==null?"\\N":fcurRecoverability.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormattedId==null?"\\N":fstrFormattedId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrData==null?"\\N":fstrData, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadParameters==null?"\\N":fstrLeadParameters, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LeadParametersKey==null?"\\N":"" + fi64LeadParametersKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngLeadKey==null?"\\N":"" + flngLeadKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadCategory==null?"\\N":fstrLeadCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadType==null?"\\N":fstrLeadType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadWorkArea==null?"\\N":fstrLeadWorkArea, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceDiscoveryKey==null?"\\N":"" + flngSourceDiscoveryKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecordKey==null?"\\N":fstrRecordKey, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNextAction==null?"\\N":fstrNextAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNextActionTaskKey==null?"\\N":"" + flngNextActionTaskKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNextActionWho==null?"\\N":fstrNextActionWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextActionDue==null?"\\N":"" + fdtmNextActionDue, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNextActionLogEntry==null?"\\N":fstrNextActionLogEntry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNextActionInError==null?"\\N":"" + fblnNextActionInError, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastAction==null?"\\N":fstrLastAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastActionOutCome==null?"\\N":fstrLastActionOutCome, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastActionWho==null?"\\N":fstrLastActionWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastActionDue==null?"\\N":"" + fdtmLastActionDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastActionActual==null?"\\N":"" + fdtmLastActionActual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExpires==null?"\\N":"" + fdtmExpires, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedWho==null?"\\N":fstrCreatedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosed==null?"\\N":"" + fdtmClosed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosedWho==null?"\\N":fstrClosedWho, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCloseReason==null?"\\N":fstrCloseReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProbability==null?"\\N":fcurProbability.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRecoverability==null?"\\N":fcurRecoverability.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormattedId==null?"\\N":fstrFormattedId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrData==null?"\\N":fstrData, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadParameters==null?"\\N":fstrLeadParameters, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LeadParametersKey==null?"\\N":"" + fi64LeadParametersKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLeadKey = null; } else {
      this.flngLeadKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrLeadCategory = null; } else {
      this.fstrLeadCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadType = null; } else {
      this.fstrLeadType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadWorkArea = null; } else {
      this.fstrLeadWorkArea = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceDiscoveryKey = null; } else {
      this.flngSourceDiscoveryKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecordKey = null; } else {
      this.fstrRecordKey = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCRMKey = null; } else {
      this.flngCRMKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNextAction = null; } else {
      this.fstrNextAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNextActionTaskKey = null; } else {
      this.flngNextActionTaskKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNextActionWho = null; } else {
      this.fstrNextActionWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextActionDue = null; } else {
      this.fdtmNextActionDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNextActionLogEntry = null; } else {
      this.fstrNextActionLogEntry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNextActionInError = null; } else {
      this.fblnNextActionInError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastAction = null; } else {
      this.fstrLastAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastActionOutCome = null; } else {
      this.fstrLastActionOutCome = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastActionWho = null; } else {
      this.fstrLastActionWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastActionDue = null; } else {
      this.fdtmLastActionDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastActionActual = null; } else {
      this.fdtmLastActionActual = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExpires = null; } else {
      this.fdtmExpires = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosed = null; } else {
      this.fdtmClosed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosedWho = null; } else {
      this.fstrClosedWho = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProbability = null; } else {
      this.fcurProbability = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRecoverability = null; } else {
      this.fcurRecoverability = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrFormattedId = null; } else {
      this.fstrFormattedId = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrData = null; } else {
      this.fstrData = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadParameters = null; } else {
      this.fstrLeadParameters = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LeadParametersKey = null; } else {
      this.fi64LeadParametersKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLeadKey = null; } else {
      this.flngLeadKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrLeadCategory = null; } else {
      this.fstrLeadCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadType = null; } else {
      this.fstrLeadType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadWorkArea = null; } else {
      this.fstrLeadWorkArea = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceDiscoveryKey = null; } else {
      this.flngSourceDiscoveryKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecordKey = null; } else {
      this.fstrRecordKey = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCRMKey = null; } else {
      this.flngCRMKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNextAction = null; } else {
      this.fstrNextAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNextActionTaskKey = null; } else {
      this.flngNextActionTaskKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNextActionWho = null; } else {
      this.fstrNextActionWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextActionDue = null; } else {
      this.fdtmNextActionDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNextActionLogEntry = null; } else {
      this.fstrNextActionLogEntry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNextActionInError = null; } else {
      this.fblnNextActionInError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastAction = null; } else {
      this.fstrLastAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastActionOutCome = null; } else {
      this.fstrLastActionOutCome = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastActionWho = null; } else {
      this.fstrLastActionWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastActionDue = null; } else {
      this.fdtmLastActionDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastActionActual = null; } else {
      this.fdtmLastActionActual = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExpires = null; } else {
      this.fdtmExpires = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosed = null; } else {
      this.fdtmClosed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosedWho = null; } else {
      this.fstrClosedWho = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProbability = null; } else {
      this.fcurProbability = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRecoverability = null; } else {
      this.fcurRecoverability = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrFormattedId = null; } else {
      this.fstrFormattedId = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrData = null; } else {
      this.fstrData = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadParameters = null; } else {
      this.fstrLeadParameters = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LeadParametersKey = null; } else {
      this.fi64LeadParametersKey = Long.valueOf(__cur_str);
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
    tbllead o = (tbllead) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmNextActionDue = (o.fdtmNextActionDue != null) ? (java.sql.Timestamp) o.fdtmNextActionDue.clone() : null;
    o.fdtmLastActionDue = (o.fdtmLastActionDue != null) ? (java.sql.Timestamp) o.fdtmLastActionDue.clone() : null;
    o.fdtmLastActionActual = (o.fdtmLastActionActual != null) ? (java.sql.Timestamp) o.fdtmLastActionActual.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmExpires = (o.fdtmExpires != null) ? (java.sql.Timestamp) o.fdtmExpires.clone() : null;
    o.fdtmClosed = (o.fdtmClosed != null) ? (java.sql.Timestamp) o.fdtmClosed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tbllead o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmNextActionDue = (o.fdtmNextActionDue != null) ? (java.sql.Timestamp) o.fdtmNextActionDue.clone() : null;
    o.fdtmLastActionDue = (o.fdtmLastActionDue != null) ? (java.sql.Timestamp) o.fdtmLastActionDue.clone() : null;
    o.fdtmLastActionActual = (o.fdtmLastActionActual != null) ? (java.sql.Timestamp) o.fdtmLastActionActual.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmExpires = (o.fdtmExpires != null) ? (java.sql.Timestamp) o.fdtmExpires.clone() : null;
    o.fdtmClosed = (o.fdtmClosed != null) ? (java.sql.Timestamp) o.fdtmClosed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngLeadKey", this.flngLeadKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrLeadCategory", this.fstrLeadCategory);
    __sqoop$field_map.put("fstrLeadType", this.fstrLeadType);
    __sqoop$field_map.put("fstrLeadWorkArea", this.fstrLeadWorkArea);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("flngSourceDiscoveryKey", this.flngSourceDiscoveryKey);
    __sqoop$field_map.put("fstrRecordKey", this.fstrRecordKey);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
    __sqoop$field_map.put("fstrNextAction", this.fstrNextAction);
    __sqoop$field_map.put("flngNextActionTaskKey", this.flngNextActionTaskKey);
    __sqoop$field_map.put("fstrNextActionWho", this.fstrNextActionWho);
    __sqoop$field_map.put("fdtmNextActionDue", this.fdtmNextActionDue);
    __sqoop$field_map.put("fstrNextActionLogEntry", this.fstrNextActionLogEntry);
    __sqoop$field_map.put("fblnNextActionInError", this.fblnNextActionInError);
    __sqoop$field_map.put("fstrLastAction", this.fstrLastAction);
    __sqoop$field_map.put("fstrLastActionOutCome", this.fstrLastActionOutCome);
    __sqoop$field_map.put("fstrLastActionWho", this.fstrLastActionWho);
    __sqoop$field_map.put("fdtmLastActionDue", this.fdtmLastActionDue);
    __sqoop$field_map.put("fdtmLastActionActual", this.fdtmLastActionActual);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fdtmExpires", this.fdtmExpires);
    __sqoop$field_map.put("fstrCreatedWho", this.fstrCreatedWho);
    __sqoop$field_map.put("fdtmClosed", this.fdtmClosed);
    __sqoop$field_map.put("fstrClosedWho", this.fstrClosedWho);
    __sqoop$field_map.put("fstrCloseReason", this.fstrCloseReason);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fcurProbability", this.fcurProbability);
    __sqoop$field_map.put("fcurRecoverability", this.fcurRecoverability);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrFormattedId", this.fstrFormattedId);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrTitleName", this.fstrTitleName);
    __sqoop$field_map.put("fstrSuffixName", this.fstrSuffixName);
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
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrData", this.fstrData);
    __sqoop$field_map.put("fstrLeadParameters", this.fstrLeadParameters);
    __sqoop$field_map.put("fi64LeadParametersKey", this.fi64LeadParametersKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngLeadKey", this.flngLeadKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrLeadCategory", this.fstrLeadCategory);
    __sqoop$field_map.put("fstrLeadType", this.fstrLeadType);
    __sqoop$field_map.put("fstrLeadWorkArea", this.fstrLeadWorkArea);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("flngSourceDiscoveryKey", this.flngSourceDiscoveryKey);
    __sqoop$field_map.put("fstrRecordKey", this.fstrRecordKey);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
    __sqoop$field_map.put("fstrNextAction", this.fstrNextAction);
    __sqoop$field_map.put("flngNextActionTaskKey", this.flngNextActionTaskKey);
    __sqoop$field_map.put("fstrNextActionWho", this.fstrNextActionWho);
    __sqoop$field_map.put("fdtmNextActionDue", this.fdtmNextActionDue);
    __sqoop$field_map.put("fstrNextActionLogEntry", this.fstrNextActionLogEntry);
    __sqoop$field_map.put("fblnNextActionInError", this.fblnNextActionInError);
    __sqoop$field_map.put("fstrLastAction", this.fstrLastAction);
    __sqoop$field_map.put("fstrLastActionOutCome", this.fstrLastActionOutCome);
    __sqoop$field_map.put("fstrLastActionWho", this.fstrLastActionWho);
    __sqoop$field_map.put("fdtmLastActionDue", this.fdtmLastActionDue);
    __sqoop$field_map.put("fdtmLastActionActual", this.fdtmLastActionActual);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fdtmExpires", this.fdtmExpires);
    __sqoop$field_map.put("fstrCreatedWho", this.fstrCreatedWho);
    __sqoop$field_map.put("fdtmClosed", this.fdtmClosed);
    __sqoop$field_map.put("fstrClosedWho", this.fstrClosedWho);
    __sqoop$field_map.put("fstrCloseReason", this.fstrCloseReason);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fcurProbability", this.fcurProbability);
    __sqoop$field_map.put("fcurRecoverability", this.fcurRecoverability);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrFormattedId", this.fstrFormattedId);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrTitleName", this.fstrTitleName);
    __sqoop$field_map.put("fstrSuffixName", this.fstrSuffixName);
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
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrData", this.fstrData);
    __sqoop$field_map.put("fstrLeadParameters", this.fstrLeadParameters);
    __sqoop$field_map.put("fi64LeadParametersKey", this.fi64LeadParametersKey);
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
