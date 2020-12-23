// ORM class for table 'tblnz_employeremployees'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:56:34 NZDT 2020
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

public class tblnz_employeremployees extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngRelationshipKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.flngRelationshipKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngEmployerCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.flngEmployerCustomerKey = (Integer)value;
      }
    });
    setters.put("flngEmployerAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.flngEmployerAccountKey = (Integer)value;
      }
    });
    setters.put("flngEmployeeCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.flngEmployeeCustomerKey = (Integer)value;
      }
    });
    setters.put("flngEmployeeKSSAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.flngEmployeeKSSAccountKey = (Integer)value;
      }
    });
    setters.put("flngEmployeeSLSAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.flngEmployeeSLSAccountKey = (Integer)value;
      }
    });
    setters.put("fstrEmployeeIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrEmployeeIRDNumber = (String)value;
      }
    });
    setters.put("fstrEmployeeName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrEmployeeName = (String)value;
      }
    });
    setters.put("fstrEmployeeTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrEmployeeTitle = (String)value;
      }
    });
    setters.put("fstrEmployeeFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrEmployeeFirstName = (String)value;
      }
    });
    setters.put("fstrEmployeeMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrEmployeeMiddleName = (String)value;
      }
    });
    setters.put("fstrEmployeeFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrEmployeeFamilyName = (String)value;
      }
    });
    setters.put("fdtmEmployeeDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fdtmEmployeeDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrKiwiSaverStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrKiwiSaverStatus = (String)value;
      }
    });
    setters.put("fdtmKiwiSaverEndDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fdtmKiwiSaverEndDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmKiwiSaverOptInDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fdtmKiwiSaverOptInDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmKiwiSaverOptOutDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fdtmKiwiSaverOptOutDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmKiwiSaverOptOutDeclined", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fdtmKiwiSaverOptOutDeclined = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnAutoEnrolled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fblnAutoEnrolled = (Integer)value;
      }
    });
    setters.put("fblnNonDistributionEmployee", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fblnNonDistributionEmployee = (Integer)value;
      }
    });
    setters.put("fstrUnitType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrUnitType = (String)value;
      }
    });
    setters.put("fstrUnitNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrUnitNumber = (String)value;
      }
    });
    setters.put("fstrDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrDistrict = (String)value;
      }
    });
    setters.put("fstrSubDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrSubDistrict = (String)value;
      }
    });
    setters.put("fstrSubProvince", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrSubProvince = (String)value;
      }
    });
    setters.put("fstrStreetNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrStreetNumber = (String)value;
      }
    });
    setters.put("fstrStreetName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrStreetName = (String)value;
      }
    });
    setters.put("fstrUrbanization", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrUrbanization = (String)value;
      }
    });
    setters.put("fstrStreetAddress1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrStreetAddress1 = (String)value;
      }
    });
    setters.put("fstrStreetAddress2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrStreetAddress2 = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrCounty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrCounty = (String)value;
      }
    });
    setters.put("fstrPostCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrPostCode = (String)value;
      }
    });
    setters.put("fstrState", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrState = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrCountry = (String)value;
      }
    });
    setters.put("fstrAttention", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrAttention = (String)value;
      }
    });
    setters.put("fstrAddressDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrAddressDescription = (String)value;
      }
    });
    setters.put("fblnAddressVerified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fblnAddressVerified = (Integer)value;
      }
    });
    setters.put("fstrDaytimeCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrDaytimeCountry = (String)value;
      }
    });
    setters.put("fintDaytimeCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fintDaytimeCountryCode = (Integer)value;
      }
    });
    setters.put("fstrDaytimeAreaCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrDaytimeAreaCode = (String)value;
      }
    });
    setters.put("fstrDaytimePhoneNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrDaytimePhoneNumber = (String)value;
      }
    });
    setters.put("fstrDaytimeExtension", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrDaytimeExtension = (String)value;
      }
    });
    setters.put("fstrMobileCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrMobileCountry = (String)value;
      }
    });
    setters.put("fintMobileCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fintMobileCountryCode = (Integer)value;
      }
    });
    setters.put("fstrMobileAreaCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrMobileAreaCode = (String)value;
      }
    });
    setters.put("fstrMobilePhoneNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrMobilePhoneNumber = (String)value;
      }
    });
    setters.put("fstrMobileExtension", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrMobileExtension = (String)value;
      }
    });
    setters.put("fstrEmailAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrEmailAddress = (String)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnValid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fblnValid = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_employeremployees.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_employeremployees() {
    init0();
  }
  private Integer flngRelationshipKey;
  public Integer get_flngRelationshipKey() {
    return flngRelationshipKey;
  }
  public void set_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
  }
  public tblnz_employeremployees with_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_employeremployees with_flngVer(Integer flngVer) {
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
  public tblnz_employeremployees with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngEmployerCustomerKey;
  public Integer get_flngEmployerCustomerKey() {
    return flngEmployerCustomerKey;
  }
  public void set_flngEmployerCustomerKey(Integer flngEmployerCustomerKey) {
    this.flngEmployerCustomerKey = flngEmployerCustomerKey;
  }
  public tblnz_employeremployees with_flngEmployerCustomerKey(Integer flngEmployerCustomerKey) {
    this.flngEmployerCustomerKey = flngEmployerCustomerKey;
    return this;
  }
  private Integer flngEmployerAccountKey;
  public Integer get_flngEmployerAccountKey() {
    return flngEmployerAccountKey;
  }
  public void set_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
  }
  public tblnz_employeremployees with_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
    return this;
  }
  private Integer flngEmployeeCustomerKey;
  public Integer get_flngEmployeeCustomerKey() {
    return flngEmployeeCustomerKey;
  }
  public void set_flngEmployeeCustomerKey(Integer flngEmployeeCustomerKey) {
    this.flngEmployeeCustomerKey = flngEmployeeCustomerKey;
  }
  public tblnz_employeremployees with_flngEmployeeCustomerKey(Integer flngEmployeeCustomerKey) {
    this.flngEmployeeCustomerKey = flngEmployeeCustomerKey;
    return this;
  }
  private Integer flngEmployeeKSSAccountKey;
  public Integer get_flngEmployeeKSSAccountKey() {
    return flngEmployeeKSSAccountKey;
  }
  public void set_flngEmployeeKSSAccountKey(Integer flngEmployeeKSSAccountKey) {
    this.flngEmployeeKSSAccountKey = flngEmployeeKSSAccountKey;
  }
  public tblnz_employeremployees with_flngEmployeeKSSAccountKey(Integer flngEmployeeKSSAccountKey) {
    this.flngEmployeeKSSAccountKey = flngEmployeeKSSAccountKey;
    return this;
  }
  private Integer flngEmployeeSLSAccountKey;
  public Integer get_flngEmployeeSLSAccountKey() {
    return flngEmployeeSLSAccountKey;
  }
  public void set_flngEmployeeSLSAccountKey(Integer flngEmployeeSLSAccountKey) {
    this.flngEmployeeSLSAccountKey = flngEmployeeSLSAccountKey;
  }
  public tblnz_employeremployees with_flngEmployeeSLSAccountKey(Integer flngEmployeeSLSAccountKey) {
    this.flngEmployeeSLSAccountKey = flngEmployeeSLSAccountKey;
    return this;
  }
  private String fstrEmployeeIRDNumber;
  public String get_fstrEmployeeIRDNumber() {
    return fstrEmployeeIRDNumber;
  }
  public void set_fstrEmployeeIRDNumber(String fstrEmployeeIRDNumber) {
    this.fstrEmployeeIRDNumber = fstrEmployeeIRDNumber;
  }
  public tblnz_employeremployees with_fstrEmployeeIRDNumber(String fstrEmployeeIRDNumber) {
    this.fstrEmployeeIRDNumber = fstrEmployeeIRDNumber;
    return this;
  }
  private String fstrEmployeeName;
  public String get_fstrEmployeeName() {
    return fstrEmployeeName;
  }
  public void set_fstrEmployeeName(String fstrEmployeeName) {
    this.fstrEmployeeName = fstrEmployeeName;
  }
  public tblnz_employeremployees with_fstrEmployeeName(String fstrEmployeeName) {
    this.fstrEmployeeName = fstrEmployeeName;
    return this;
  }
  private String fstrEmployeeTitle;
  public String get_fstrEmployeeTitle() {
    return fstrEmployeeTitle;
  }
  public void set_fstrEmployeeTitle(String fstrEmployeeTitle) {
    this.fstrEmployeeTitle = fstrEmployeeTitle;
  }
  public tblnz_employeremployees with_fstrEmployeeTitle(String fstrEmployeeTitle) {
    this.fstrEmployeeTitle = fstrEmployeeTitle;
    return this;
  }
  private String fstrEmployeeFirstName;
  public String get_fstrEmployeeFirstName() {
    return fstrEmployeeFirstName;
  }
  public void set_fstrEmployeeFirstName(String fstrEmployeeFirstName) {
    this.fstrEmployeeFirstName = fstrEmployeeFirstName;
  }
  public tblnz_employeremployees with_fstrEmployeeFirstName(String fstrEmployeeFirstName) {
    this.fstrEmployeeFirstName = fstrEmployeeFirstName;
    return this;
  }
  private String fstrEmployeeMiddleName;
  public String get_fstrEmployeeMiddleName() {
    return fstrEmployeeMiddleName;
  }
  public void set_fstrEmployeeMiddleName(String fstrEmployeeMiddleName) {
    this.fstrEmployeeMiddleName = fstrEmployeeMiddleName;
  }
  public tblnz_employeremployees with_fstrEmployeeMiddleName(String fstrEmployeeMiddleName) {
    this.fstrEmployeeMiddleName = fstrEmployeeMiddleName;
    return this;
  }
  private String fstrEmployeeFamilyName;
  public String get_fstrEmployeeFamilyName() {
    return fstrEmployeeFamilyName;
  }
  public void set_fstrEmployeeFamilyName(String fstrEmployeeFamilyName) {
    this.fstrEmployeeFamilyName = fstrEmployeeFamilyName;
  }
  public tblnz_employeremployees with_fstrEmployeeFamilyName(String fstrEmployeeFamilyName) {
    this.fstrEmployeeFamilyName = fstrEmployeeFamilyName;
    return this;
  }
  private java.sql.Timestamp fdtmEmployeeDOB;
  public java.sql.Timestamp get_fdtmEmployeeDOB() {
    return fdtmEmployeeDOB;
  }
  public void set_fdtmEmployeeDOB(java.sql.Timestamp fdtmEmployeeDOB) {
    this.fdtmEmployeeDOB = fdtmEmployeeDOB;
  }
  public tblnz_employeremployees with_fdtmEmployeeDOB(java.sql.Timestamp fdtmEmployeeDOB) {
    this.fdtmEmployeeDOB = fdtmEmployeeDOB;
    return this;
  }
  private String fstrKiwiSaverStatus;
  public String get_fstrKiwiSaverStatus() {
    return fstrKiwiSaverStatus;
  }
  public void set_fstrKiwiSaverStatus(String fstrKiwiSaverStatus) {
    this.fstrKiwiSaverStatus = fstrKiwiSaverStatus;
  }
  public tblnz_employeremployees with_fstrKiwiSaverStatus(String fstrKiwiSaverStatus) {
    this.fstrKiwiSaverStatus = fstrKiwiSaverStatus;
    return this;
  }
  private java.sql.Timestamp fdtmKiwiSaverEndDate;
  public java.sql.Timestamp get_fdtmKiwiSaverEndDate() {
    return fdtmKiwiSaverEndDate;
  }
  public void set_fdtmKiwiSaverEndDate(java.sql.Timestamp fdtmKiwiSaverEndDate) {
    this.fdtmKiwiSaverEndDate = fdtmKiwiSaverEndDate;
  }
  public tblnz_employeremployees with_fdtmKiwiSaverEndDate(java.sql.Timestamp fdtmKiwiSaverEndDate) {
    this.fdtmKiwiSaverEndDate = fdtmKiwiSaverEndDate;
    return this;
  }
  private java.sql.Timestamp fdtmKiwiSaverOptInDate;
  public java.sql.Timestamp get_fdtmKiwiSaverOptInDate() {
    return fdtmKiwiSaverOptInDate;
  }
  public void set_fdtmKiwiSaverOptInDate(java.sql.Timestamp fdtmKiwiSaverOptInDate) {
    this.fdtmKiwiSaverOptInDate = fdtmKiwiSaverOptInDate;
  }
  public tblnz_employeremployees with_fdtmKiwiSaverOptInDate(java.sql.Timestamp fdtmKiwiSaverOptInDate) {
    this.fdtmKiwiSaverOptInDate = fdtmKiwiSaverOptInDate;
    return this;
  }
  private java.sql.Timestamp fdtmKiwiSaverOptOutDate;
  public java.sql.Timestamp get_fdtmKiwiSaverOptOutDate() {
    return fdtmKiwiSaverOptOutDate;
  }
  public void set_fdtmKiwiSaverOptOutDate(java.sql.Timestamp fdtmKiwiSaverOptOutDate) {
    this.fdtmKiwiSaverOptOutDate = fdtmKiwiSaverOptOutDate;
  }
  public tblnz_employeremployees with_fdtmKiwiSaverOptOutDate(java.sql.Timestamp fdtmKiwiSaverOptOutDate) {
    this.fdtmKiwiSaverOptOutDate = fdtmKiwiSaverOptOutDate;
    return this;
  }
  private java.sql.Timestamp fdtmKiwiSaverOptOutDeclined;
  public java.sql.Timestamp get_fdtmKiwiSaverOptOutDeclined() {
    return fdtmKiwiSaverOptOutDeclined;
  }
  public void set_fdtmKiwiSaverOptOutDeclined(java.sql.Timestamp fdtmKiwiSaverOptOutDeclined) {
    this.fdtmKiwiSaverOptOutDeclined = fdtmKiwiSaverOptOutDeclined;
  }
  public tblnz_employeremployees with_fdtmKiwiSaverOptOutDeclined(java.sql.Timestamp fdtmKiwiSaverOptOutDeclined) {
    this.fdtmKiwiSaverOptOutDeclined = fdtmKiwiSaverOptOutDeclined;
    return this;
  }
  private Integer fblnAutoEnrolled;
  public Integer get_fblnAutoEnrolled() {
    return fblnAutoEnrolled;
  }
  public void set_fblnAutoEnrolled(Integer fblnAutoEnrolled) {
    this.fblnAutoEnrolled = fblnAutoEnrolled;
  }
  public tblnz_employeremployees with_fblnAutoEnrolled(Integer fblnAutoEnrolled) {
    this.fblnAutoEnrolled = fblnAutoEnrolled;
    return this;
  }
  private Integer fblnNonDistributionEmployee;
  public Integer get_fblnNonDistributionEmployee() {
    return fblnNonDistributionEmployee;
  }
  public void set_fblnNonDistributionEmployee(Integer fblnNonDistributionEmployee) {
    this.fblnNonDistributionEmployee = fblnNonDistributionEmployee;
  }
  public tblnz_employeremployees with_fblnNonDistributionEmployee(Integer fblnNonDistributionEmployee) {
    this.fblnNonDistributionEmployee = fblnNonDistributionEmployee;
    return this;
  }
  private String fstrUnitType;
  public String get_fstrUnitType() {
    return fstrUnitType;
  }
  public void set_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
  }
  public tblnz_employeremployees with_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
    return this;
  }
  private String fstrUnitNumber;
  public String get_fstrUnitNumber() {
    return fstrUnitNumber;
  }
  public void set_fstrUnitNumber(String fstrUnitNumber) {
    this.fstrUnitNumber = fstrUnitNumber;
  }
  public tblnz_employeremployees with_fstrUnitNumber(String fstrUnitNumber) {
    this.fstrUnitNumber = fstrUnitNumber;
    return this;
  }
  private String fstrDistrict;
  public String get_fstrDistrict() {
    return fstrDistrict;
  }
  public void set_fstrDistrict(String fstrDistrict) {
    this.fstrDistrict = fstrDistrict;
  }
  public tblnz_employeremployees with_fstrDistrict(String fstrDistrict) {
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
  public tblnz_employeremployees with_fstrSubDistrict(String fstrSubDistrict) {
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
  public tblnz_employeremployees with_fstrSubProvince(String fstrSubProvince) {
    this.fstrSubProvince = fstrSubProvince;
    return this;
  }
  private String fstrStreetNumber;
  public String get_fstrStreetNumber() {
    return fstrStreetNumber;
  }
  public void set_fstrStreetNumber(String fstrStreetNumber) {
    this.fstrStreetNumber = fstrStreetNumber;
  }
  public tblnz_employeremployees with_fstrStreetNumber(String fstrStreetNumber) {
    this.fstrStreetNumber = fstrStreetNumber;
    return this;
  }
  private String fstrStreetName;
  public String get_fstrStreetName() {
    return fstrStreetName;
  }
  public void set_fstrStreetName(String fstrStreetName) {
    this.fstrStreetName = fstrStreetName;
  }
  public tblnz_employeremployees with_fstrStreetName(String fstrStreetName) {
    this.fstrStreetName = fstrStreetName;
    return this;
  }
  private String fstrUrbanization;
  public String get_fstrUrbanization() {
    return fstrUrbanization;
  }
  public void set_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
  }
  public tblnz_employeremployees with_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
    return this;
  }
  private String fstrStreetAddress1;
  public String get_fstrStreetAddress1() {
    return fstrStreetAddress1;
  }
  public void set_fstrStreetAddress1(String fstrStreetAddress1) {
    this.fstrStreetAddress1 = fstrStreetAddress1;
  }
  public tblnz_employeremployees with_fstrStreetAddress1(String fstrStreetAddress1) {
    this.fstrStreetAddress1 = fstrStreetAddress1;
    return this;
  }
  private String fstrStreetAddress2;
  public String get_fstrStreetAddress2() {
    return fstrStreetAddress2;
  }
  public void set_fstrStreetAddress2(String fstrStreetAddress2) {
    this.fstrStreetAddress2 = fstrStreetAddress2;
  }
  public tblnz_employeremployees with_fstrStreetAddress2(String fstrStreetAddress2) {
    this.fstrStreetAddress2 = fstrStreetAddress2;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tblnz_employeremployees with_fstrCity(String fstrCity) {
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
  public tblnz_employeremployees with_fstrCounty(String fstrCounty) {
    this.fstrCounty = fstrCounty;
    return this;
  }
  private String fstrPostCode;
  public String get_fstrPostCode() {
    return fstrPostCode;
  }
  public void set_fstrPostCode(String fstrPostCode) {
    this.fstrPostCode = fstrPostCode;
  }
  public tblnz_employeremployees with_fstrPostCode(String fstrPostCode) {
    this.fstrPostCode = fstrPostCode;
    return this;
  }
  private String fstrState;
  public String get_fstrState() {
    return fstrState;
  }
  public void set_fstrState(String fstrState) {
    this.fstrState = fstrState;
  }
  public tblnz_employeremployees with_fstrState(String fstrState) {
    this.fstrState = fstrState;
    return this;
  }
  private String fstrCountry;
  public String get_fstrCountry() {
    return fstrCountry;
  }
  public void set_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
  }
  public tblnz_employeremployees with_fstrCountry(String fstrCountry) {
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
  public tblnz_employeremployees with_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
    return this;
  }
  private String fstrAddressDescription;
  public String get_fstrAddressDescription() {
    return fstrAddressDescription;
  }
  public void set_fstrAddressDescription(String fstrAddressDescription) {
    this.fstrAddressDescription = fstrAddressDescription;
  }
  public tblnz_employeremployees with_fstrAddressDescription(String fstrAddressDescription) {
    this.fstrAddressDescription = fstrAddressDescription;
    return this;
  }
  private Integer fblnAddressVerified;
  public Integer get_fblnAddressVerified() {
    return fblnAddressVerified;
  }
  public void set_fblnAddressVerified(Integer fblnAddressVerified) {
    this.fblnAddressVerified = fblnAddressVerified;
  }
  public tblnz_employeremployees with_fblnAddressVerified(Integer fblnAddressVerified) {
    this.fblnAddressVerified = fblnAddressVerified;
    return this;
  }
  private String fstrDaytimeCountry;
  public String get_fstrDaytimeCountry() {
    return fstrDaytimeCountry;
  }
  public void set_fstrDaytimeCountry(String fstrDaytimeCountry) {
    this.fstrDaytimeCountry = fstrDaytimeCountry;
  }
  public tblnz_employeremployees with_fstrDaytimeCountry(String fstrDaytimeCountry) {
    this.fstrDaytimeCountry = fstrDaytimeCountry;
    return this;
  }
  private Integer fintDaytimeCountryCode;
  public Integer get_fintDaytimeCountryCode() {
    return fintDaytimeCountryCode;
  }
  public void set_fintDaytimeCountryCode(Integer fintDaytimeCountryCode) {
    this.fintDaytimeCountryCode = fintDaytimeCountryCode;
  }
  public tblnz_employeremployees with_fintDaytimeCountryCode(Integer fintDaytimeCountryCode) {
    this.fintDaytimeCountryCode = fintDaytimeCountryCode;
    return this;
  }
  private String fstrDaytimeAreaCode;
  public String get_fstrDaytimeAreaCode() {
    return fstrDaytimeAreaCode;
  }
  public void set_fstrDaytimeAreaCode(String fstrDaytimeAreaCode) {
    this.fstrDaytimeAreaCode = fstrDaytimeAreaCode;
  }
  public tblnz_employeremployees with_fstrDaytimeAreaCode(String fstrDaytimeAreaCode) {
    this.fstrDaytimeAreaCode = fstrDaytimeAreaCode;
    return this;
  }
  private String fstrDaytimePhoneNumber;
  public String get_fstrDaytimePhoneNumber() {
    return fstrDaytimePhoneNumber;
  }
  public void set_fstrDaytimePhoneNumber(String fstrDaytimePhoneNumber) {
    this.fstrDaytimePhoneNumber = fstrDaytimePhoneNumber;
  }
  public tblnz_employeremployees with_fstrDaytimePhoneNumber(String fstrDaytimePhoneNumber) {
    this.fstrDaytimePhoneNumber = fstrDaytimePhoneNumber;
    return this;
  }
  private String fstrDaytimeExtension;
  public String get_fstrDaytimeExtension() {
    return fstrDaytimeExtension;
  }
  public void set_fstrDaytimeExtension(String fstrDaytimeExtension) {
    this.fstrDaytimeExtension = fstrDaytimeExtension;
  }
  public tblnz_employeremployees with_fstrDaytimeExtension(String fstrDaytimeExtension) {
    this.fstrDaytimeExtension = fstrDaytimeExtension;
    return this;
  }
  private String fstrMobileCountry;
  public String get_fstrMobileCountry() {
    return fstrMobileCountry;
  }
  public void set_fstrMobileCountry(String fstrMobileCountry) {
    this.fstrMobileCountry = fstrMobileCountry;
  }
  public tblnz_employeremployees with_fstrMobileCountry(String fstrMobileCountry) {
    this.fstrMobileCountry = fstrMobileCountry;
    return this;
  }
  private Integer fintMobileCountryCode;
  public Integer get_fintMobileCountryCode() {
    return fintMobileCountryCode;
  }
  public void set_fintMobileCountryCode(Integer fintMobileCountryCode) {
    this.fintMobileCountryCode = fintMobileCountryCode;
  }
  public tblnz_employeremployees with_fintMobileCountryCode(Integer fintMobileCountryCode) {
    this.fintMobileCountryCode = fintMobileCountryCode;
    return this;
  }
  private String fstrMobileAreaCode;
  public String get_fstrMobileAreaCode() {
    return fstrMobileAreaCode;
  }
  public void set_fstrMobileAreaCode(String fstrMobileAreaCode) {
    this.fstrMobileAreaCode = fstrMobileAreaCode;
  }
  public tblnz_employeremployees with_fstrMobileAreaCode(String fstrMobileAreaCode) {
    this.fstrMobileAreaCode = fstrMobileAreaCode;
    return this;
  }
  private String fstrMobilePhoneNumber;
  public String get_fstrMobilePhoneNumber() {
    return fstrMobilePhoneNumber;
  }
  public void set_fstrMobilePhoneNumber(String fstrMobilePhoneNumber) {
    this.fstrMobilePhoneNumber = fstrMobilePhoneNumber;
  }
  public tblnz_employeremployees with_fstrMobilePhoneNumber(String fstrMobilePhoneNumber) {
    this.fstrMobilePhoneNumber = fstrMobilePhoneNumber;
    return this;
  }
  private String fstrMobileExtension;
  public String get_fstrMobileExtension() {
    return fstrMobileExtension;
  }
  public void set_fstrMobileExtension(String fstrMobileExtension) {
    this.fstrMobileExtension = fstrMobileExtension;
  }
  public tblnz_employeremployees with_fstrMobileExtension(String fstrMobileExtension) {
    this.fstrMobileExtension = fstrMobileExtension;
    return this;
  }
  private String fstrEmailAddress;
  public String get_fstrEmailAddress() {
    return fstrEmailAddress;
  }
  public void set_fstrEmailAddress(String fstrEmailAddress) {
    this.fstrEmailAddress = fstrEmailAddress;
  }
  public tblnz_employeremployees with_fstrEmailAddress(String fstrEmailAddress) {
    this.fstrEmailAddress = fstrEmailAddress;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tblnz_employeremployees with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
    return this;
  }
  private java.sql.Timestamp fdtmCease;
  public java.sql.Timestamp get_fdtmCease() {
    return fdtmCease;
  }
  public void set_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
  }
  public tblnz_employeremployees with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblnz_employeremployees with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private Integer fblnValid;
  public Integer get_fblnValid() {
    return fblnValid;
  }
  public void set_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
  }
  public tblnz_employeremployees with_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_employeremployees with_fstrWho(String fstrWho) {
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
  public tblnz_employeremployees with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_employeremployees)) {
      return false;
    }
    tblnz_employeremployees that = (tblnz_employeremployees) o;
    boolean equal = true;
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngEmployerCustomerKey == null ? that.flngEmployerCustomerKey == null : this.flngEmployerCustomerKey.equals(that.flngEmployerCustomerKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.flngEmployeeCustomerKey == null ? that.flngEmployeeCustomerKey == null : this.flngEmployeeCustomerKey.equals(that.flngEmployeeCustomerKey));
    equal = equal && (this.flngEmployeeKSSAccountKey == null ? that.flngEmployeeKSSAccountKey == null : this.flngEmployeeKSSAccountKey.equals(that.flngEmployeeKSSAccountKey));
    equal = equal && (this.flngEmployeeSLSAccountKey == null ? that.flngEmployeeSLSAccountKey == null : this.flngEmployeeSLSAccountKey.equals(that.flngEmployeeSLSAccountKey));
    equal = equal && (this.fstrEmployeeIRDNumber == null ? that.fstrEmployeeIRDNumber == null : this.fstrEmployeeIRDNumber.equals(that.fstrEmployeeIRDNumber));
    equal = equal && (this.fstrEmployeeName == null ? that.fstrEmployeeName == null : this.fstrEmployeeName.equals(that.fstrEmployeeName));
    equal = equal && (this.fstrEmployeeTitle == null ? that.fstrEmployeeTitle == null : this.fstrEmployeeTitle.equals(that.fstrEmployeeTitle));
    equal = equal && (this.fstrEmployeeFirstName == null ? that.fstrEmployeeFirstName == null : this.fstrEmployeeFirstName.equals(that.fstrEmployeeFirstName));
    equal = equal && (this.fstrEmployeeMiddleName == null ? that.fstrEmployeeMiddleName == null : this.fstrEmployeeMiddleName.equals(that.fstrEmployeeMiddleName));
    equal = equal && (this.fstrEmployeeFamilyName == null ? that.fstrEmployeeFamilyName == null : this.fstrEmployeeFamilyName.equals(that.fstrEmployeeFamilyName));
    equal = equal && (this.fdtmEmployeeDOB == null ? that.fdtmEmployeeDOB == null : this.fdtmEmployeeDOB.equals(that.fdtmEmployeeDOB));
    equal = equal && (this.fstrKiwiSaverStatus == null ? that.fstrKiwiSaverStatus == null : this.fstrKiwiSaverStatus.equals(that.fstrKiwiSaverStatus));
    equal = equal && (this.fdtmKiwiSaverEndDate == null ? that.fdtmKiwiSaverEndDate == null : this.fdtmKiwiSaverEndDate.equals(that.fdtmKiwiSaverEndDate));
    equal = equal && (this.fdtmKiwiSaverOptInDate == null ? that.fdtmKiwiSaverOptInDate == null : this.fdtmKiwiSaverOptInDate.equals(that.fdtmKiwiSaverOptInDate));
    equal = equal && (this.fdtmKiwiSaverOptOutDate == null ? that.fdtmKiwiSaverOptOutDate == null : this.fdtmKiwiSaverOptOutDate.equals(that.fdtmKiwiSaverOptOutDate));
    equal = equal && (this.fdtmKiwiSaverOptOutDeclined == null ? that.fdtmKiwiSaverOptOutDeclined == null : this.fdtmKiwiSaverOptOutDeclined.equals(that.fdtmKiwiSaverOptOutDeclined));
    equal = equal && (this.fblnAutoEnrolled == null ? that.fblnAutoEnrolled == null : this.fblnAutoEnrolled.equals(that.fblnAutoEnrolled));
    equal = equal && (this.fblnNonDistributionEmployee == null ? that.fblnNonDistributionEmployee == null : this.fblnNonDistributionEmployee.equals(that.fblnNonDistributionEmployee));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrUnitNumber == null ? that.fstrUnitNumber == null : this.fstrUnitNumber.equals(that.fstrUnitNumber));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrStreetNumber == null ? that.fstrStreetNumber == null : this.fstrStreetNumber.equals(that.fstrStreetNumber));
    equal = equal && (this.fstrStreetName == null ? that.fstrStreetName == null : this.fstrStreetName.equals(that.fstrStreetName));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fstrStreetAddress1 == null ? that.fstrStreetAddress1 == null : this.fstrStreetAddress1.equals(that.fstrStreetAddress1));
    equal = equal && (this.fstrStreetAddress2 == null ? that.fstrStreetAddress2 == null : this.fstrStreetAddress2.equals(that.fstrStreetAddress2));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fblnAddressVerified == null ? that.fblnAddressVerified == null : this.fblnAddressVerified.equals(that.fblnAddressVerified));
    equal = equal && (this.fstrDaytimeCountry == null ? that.fstrDaytimeCountry == null : this.fstrDaytimeCountry.equals(that.fstrDaytimeCountry));
    equal = equal && (this.fintDaytimeCountryCode == null ? that.fintDaytimeCountryCode == null : this.fintDaytimeCountryCode.equals(that.fintDaytimeCountryCode));
    equal = equal && (this.fstrDaytimeAreaCode == null ? that.fstrDaytimeAreaCode == null : this.fstrDaytimeAreaCode.equals(that.fstrDaytimeAreaCode));
    equal = equal && (this.fstrDaytimePhoneNumber == null ? that.fstrDaytimePhoneNumber == null : this.fstrDaytimePhoneNumber.equals(that.fstrDaytimePhoneNumber));
    equal = equal && (this.fstrDaytimeExtension == null ? that.fstrDaytimeExtension == null : this.fstrDaytimeExtension.equals(that.fstrDaytimeExtension));
    equal = equal && (this.fstrMobileCountry == null ? that.fstrMobileCountry == null : this.fstrMobileCountry.equals(that.fstrMobileCountry));
    equal = equal && (this.fintMobileCountryCode == null ? that.fintMobileCountryCode == null : this.fintMobileCountryCode.equals(that.fintMobileCountryCode));
    equal = equal && (this.fstrMobileAreaCode == null ? that.fstrMobileAreaCode == null : this.fstrMobileAreaCode.equals(that.fstrMobileAreaCode));
    equal = equal && (this.fstrMobilePhoneNumber == null ? that.fstrMobilePhoneNumber == null : this.fstrMobilePhoneNumber.equals(that.fstrMobilePhoneNumber));
    equal = equal && (this.fstrMobileExtension == null ? that.fstrMobileExtension == null : this.fstrMobileExtension.equals(that.fstrMobileExtension));
    equal = equal && (this.fstrEmailAddress == null ? that.fstrEmailAddress == null : this.fstrEmailAddress.equals(that.fstrEmailAddress));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_employeremployees)) {
      return false;
    }
    tblnz_employeremployees that = (tblnz_employeremployees) o;
    boolean equal = true;
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngEmployerCustomerKey == null ? that.flngEmployerCustomerKey == null : this.flngEmployerCustomerKey.equals(that.flngEmployerCustomerKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.flngEmployeeCustomerKey == null ? that.flngEmployeeCustomerKey == null : this.flngEmployeeCustomerKey.equals(that.flngEmployeeCustomerKey));
    equal = equal && (this.flngEmployeeKSSAccountKey == null ? that.flngEmployeeKSSAccountKey == null : this.flngEmployeeKSSAccountKey.equals(that.flngEmployeeKSSAccountKey));
    equal = equal && (this.flngEmployeeSLSAccountKey == null ? that.flngEmployeeSLSAccountKey == null : this.flngEmployeeSLSAccountKey.equals(that.flngEmployeeSLSAccountKey));
    equal = equal && (this.fstrEmployeeIRDNumber == null ? that.fstrEmployeeIRDNumber == null : this.fstrEmployeeIRDNumber.equals(that.fstrEmployeeIRDNumber));
    equal = equal && (this.fstrEmployeeName == null ? that.fstrEmployeeName == null : this.fstrEmployeeName.equals(that.fstrEmployeeName));
    equal = equal && (this.fstrEmployeeTitle == null ? that.fstrEmployeeTitle == null : this.fstrEmployeeTitle.equals(that.fstrEmployeeTitle));
    equal = equal && (this.fstrEmployeeFirstName == null ? that.fstrEmployeeFirstName == null : this.fstrEmployeeFirstName.equals(that.fstrEmployeeFirstName));
    equal = equal && (this.fstrEmployeeMiddleName == null ? that.fstrEmployeeMiddleName == null : this.fstrEmployeeMiddleName.equals(that.fstrEmployeeMiddleName));
    equal = equal && (this.fstrEmployeeFamilyName == null ? that.fstrEmployeeFamilyName == null : this.fstrEmployeeFamilyName.equals(that.fstrEmployeeFamilyName));
    equal = equal && (this.fdtmEmployeeDOB == null ? that.fdtmEmployeeDOB == null : this.fdtmEmployeeDOB.equals(that.fdtmEmployeeDOB));
    equal = equal && (this.fstrKiwiSaverStatus == null ? that.fstrKiwiSaverStatus == null : this.fstrKiwiSaverStatus.equals(that.fstrKiwiSaverStatus));
    equal = equal && (this.fdtmKiwiSaverEndDate == null ? that.fdtmKiwiSaverEndDate == null : this.fdtmKiwiSaverEndDate.equals(that.fdtmKiwiSaverEndDate));
    equal = equal && (this.fdtmKiwiSaverOptInDate == null ? that.fdtmKiwiSaverOptInDate == null : this.fdtmKiwiSaverOptInDate.equals(that.fdtmKiwiSaverOptInDate));
    equal = equal && (this.fdtmKiwiSaverOptOutDate == null ? that.fdtmKiwiSaverOptOutDate == null : this.fdtmKiwiSaverOptOutDate.equals(that.fdtmKiwiSaverOptOutDate));
    equal = equal && (this.fdtmKiwiSaverOptOutDeclined == null ? that.fdtmKiwiSaverOptOutDeclined == null : this.fdtmKiwiSaverOptOutDeclined.equals(that.fdtmKiwiSaverOptOutDeclined));
    equal = equal && (this.fblnAutoEnrolled == null ? that.fblnAutoEnrolled == null : this.fblnAutoEnrolled.equals(that.fblnAutoEnrolled));
    equal = equal && (this.fblnNonDistributionEmployee == null ? that.fblnNonDistributionEmployee == null : this.fblnNonDistributionEmployee.equals(that.fblnNonDistributionEmployee));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrUnitNumber == null ? that.fstrUnitNumber == null : this.fstrUnitNumber.equals(that.fstrUnitNumber));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrStreetNumber == null ? that.fstrStreetNumber == null : this.fstrStreetNumber.equals(that.fstrStreetNumber));
    equal = equal && (this.fstrStreetName == null ? that.fstrStreetName == null : this.fstrStreetName.equals(that.fstrStreetName));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fstrStreetAddress1 == null ? that.fstrStreetAddress1 == null : this.fstrStreetAddress1.equals(that.fstrStreetAddress1));
    equal = equal && (this.fstrStreetAddress2 == null ? that.fstrStreetAddress2 == null : this.fstrStreetAddress2.equals(that.fstrStreetAddress2));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fblnAddressVerified == null ? that.fblnAddressVerified == null : this.fblnAddressVerified.equals(that.fblnAddressVerified));
    equal = equal && (this.fstrDaytimeCountry == null ? that.fstrDaytimeCountry == null : this.fstrDaytimeCountry.equals(that.fstrDaytimeCountry));
    equal = equal && (this.fintDaytimeCountryCode == null ? that.fintDaytimeCountryCode == null : this.fintDaytimeCountryCode.equals(that.fintDaytimeCountryCode));
    equal = equal && (this.fstrDaytimeAreaCode == null ? that.fstrDaytimeAreaCode == null : this.fstrDaytimeAreaCode.equals(that.fstrDaytimeAreaCode));
    equal = equal && (this.fstrDaytimePhoneNumber == null ? that.fstrDaytimePhoneNumber == null : this.fstrDaytimePhoneNumber.equals(that.fstrDaytimePhoneNumber));
    equal = equal && (this.fstrDaytimeExtension == null ? that.fstrDaytimeExtension == null : this.fstrDaytimeExtension.equals(that.fstrDaytimeExtension));
    equal = equal && (this.fstrMobileCountry == null ? that.fstrMobileCountry == null : this.fstrMobileCountry.equals(that.fstrMobileCountry));
    equal = equal && (this.fintMobileCountryCode == null ? that.fintMobileCountryCode == null : this.fintMobileCountryCode.equals(that.fintMobileCountryCode));
    equal = equal && (this.fstrMobileAreaCode == null ? that.fstrMobileAreaCode == null : this.fstrMobileAreaCode.equals(that.fstrMobileAreaCode));
    equal = equal && (this.fstrMobilePhoneNumber == null ? that.fstrMobilePhoneNumber == null : this.fstrMobilePhoneNumber.equals(that.fstrMobilePhoneNumber));
    equal = equal && (this.fstrMobileExtension == null ? that.fstrMobileExtension == null : this.fstrMobileExtension.equals(that.fstrMobileExtension));
    equal = equal && (this.fstrEmailAddress == null ? that.fstrEmailAddress == null : this.fstrEmailAddress.equals(that.fstrEmailAddress));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngEmployerCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngEmployeeCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngEmployeeKSSAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngEmployeeSLSAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrEmployeeIRDNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrEmployeeName = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrEmployeeTitle = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrEmployeeFirstName = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrEmployeeMiddleName = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrEmployeeFamilyName = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmEmployeeDOB = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrKiwiSaverStatus = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmKiwiSaverEndDate = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmKiwiSaverOptInDate = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmKiwiSaverOptOutDate = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmKiwiSaverOptOutDeclined = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fblnAutoEnrolled = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnNonDistributionEmployee = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrUnitNumber = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrStreetNumber = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrStreetName = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrStreetAddress1 = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrStreetAddress2 = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(39, __dbResults);
    this.fblnAddressVerified = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fstrDaytimeCountry = JdbcWritableBridge.readString(41, __dbResults);
    this.fintDaytimeCountryCode = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fstrDaytimeAreaCode = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrDaytimePhoneNumber = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrDaytimeExtension = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrMobileCountry = JdbcWritableBridge.readString(46, __dbResults);
    this.fintMobileCountryCode = JdbcWritableBridge.readInteger(47, __dbResults);
    this.fstrMobileAreaCode = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrMobilePhoneNumber = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrMobileExtension = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrEmailAddress = JdbcWritableBridge.readString(51, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(52, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(53, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(54, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(55, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(56, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(57, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngEmployerCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngEmployeeCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngEmployeeKSSAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngEmployeeSLSAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrEmployeeIRDNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrEmployeeName = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrEmployeeTitle = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrEmployeeFirstName = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrEmployeeMiddleName = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrEmployeeFamilyName = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmEmployeeDOB = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrKiwiSaverStatus = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmKiwiSaverEndDate = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmKiwiSaverOptInDate = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmKiwiSaverOptOutDate = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmKiwiSaverOptOutDeclined = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fblnAutoEnrolled = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnNonDistributionEmployee = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrUnitNumber = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrStreetNumber = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrStreetName = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrStreetAddress1 = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrStreetAddress2 = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(39, __dbResults);
    this.fblnAddressVerified = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fstrDaytimeCountry = JdbcWritableBridge.readString(41, __dbResults);
    this.fintDaytimeCountryCode = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fstrDaytimeAreaCode = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrDaytimePhoneNumber = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrDaytimeExtension = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrMobileCountry = JdbcWritableBridge.readString(46, __dbResults);
    this.fintMobileCountryCode = JdbcWritableBridge.readInteger(47, __dbResults);
    this.fstrMobileAreaCode = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrMobilePhoneNumber = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrMobileExtension = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrEmailAddress = JdbcWritableBridge.readString(51, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(52, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(53, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(54, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(55, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(56, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(57, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployeeCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployeeKSSAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployeeSLSAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeIRDNumber, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeTitle, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeFirstName, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeMiddleName, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeFamilyName, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEmployeeDOB, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrKiwiSaverStatus, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmKiwiSaverEndDate, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmKiwiSaverOptInDate, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmKiwiSaverOptOutDate, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmKiwiSaverOptOutDeclined, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutoEnrolled, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonDistributionEmployee, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitNumber, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreetNumber, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreetName, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreetAddress1, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreetAddress2, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAddressVerified, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaytimeCountry, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDaytimeCountryCode, 42 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaytimeAreaCode, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaytimePhoneNumber, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaytimeExtension, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMobileCountry, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMobileCountryCode, 47 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrMobileAreaCode, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMobilePhoneNumber, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMobileExtension, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailAddress, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 52 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 53 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 54 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 55 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 57 + __off, 93, __dbStmt);
    return 57;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployeeCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployeeKSSAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployeeSLSAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeIRDNumber, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeTitle, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeFirstName, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeMiddleName, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeFamilyName, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEmployeeDOB, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrKiwiSaverStatus, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmKiwiSaverEndDate, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmKiwiSaverOptInDate, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmKiwiSaverOptOutDate, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmKiwiSaverOptOutDeclined, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutoEnrolled, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonDistributionEmployee, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitNumber, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreetNumber, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreetName, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreetAddress1, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreetAddress2, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAddressVerified, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaytimeCountry, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDaytimeCountryCode, 42 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaytimeAreaCode, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaytimePhoneNumber, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaytimeExtension, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMobileCountry, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMobileCountryCode, 47 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrMobileAreaCode, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMobilePhoneNumber, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMobileExtension, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailAddress, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 52 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 53 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 54 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 55 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 57 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngRelationshipKey = null;
    } else {
    this.flngRelationshipKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngEmployerCustomerKey = null;
    } else {
    this.flngEmployerCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployerAccountKey = null;
    } else {
    this.flngEmployerAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployeeCustomerKey = null;
    } else {
    this.flngEmployeeCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployeeKSSAccountKey = null;
    } else {
    this.flngEmployeeKSSAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployeeSLSAccountKey = null;
    } else {
    this.flngEmployeeSLSAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployeeIRDNumber = null;
    } else {
    this.fstrEmployeeIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployeeName = null;
    } else {
    this.fstrEmployeeName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployeeTitle = null;
    } else {
    this.fstrEmployeeTitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployeeFirstName = null;
    } else {
    this.fstrEmployeeFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployeeMiddleName = null;
    } else {
    this.fstrEmployeeMiddleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployeeFamilyName = null;
    } else {
    this.fstrEmployeeFamilyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEmployeeDOB = null;
    } else {
    this.fdtmEmployeeDOB = new Timestamp(__dataIn.readLong());
    this.fdtmEmployeeDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrKiwiSaverStatus = null;
    } else {
    this.fstrKiwiSaverStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmKiwiSaverEndDate = null;
    } else {
    this.fdtmKiwiSaverEndDate = new Timestamp(__dataIn.readLong());
    this.fdtmKiwiSaverEndDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmKiwiSaverOptInDate = null;
    } else {
    this.fdtmKiwiSaverOptInDate = new Timestamp(__dataIn.readLong());
    this.fdtmKiwiSaverOptInDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmKiwiSaverOptOutDate = null;
    } else {
    this.fdtmKiwiSaverOptOutDate = new Timestamp(__dataIn.readLong());
    this.fdtmKiwiSaverOptOutDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmKiwiSaverOptOutDeclined = null;
    } else {
    this.fdtmKiwiSaverOptOutDeclined = new Timestamp(__dataIn.readLong());
    this.fdtmKiwiSaverOptOutDeclined.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAutoEnrolled = null;
    } else {
    this.fblnAutoEnrolled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNonDistributionEmployee = null;
    } else {
    this.fblnNonDistributionEmployee = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnitType = null;
    } else {
    this.fstrUnitType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnitNumber = null;
    } else {
    this.fstrUnitNumber = Text.readString(__dataIn);
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
        this.fstrStreetNumber = null;
    } else {
    this.fstrStreetNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreetName = null;
    } else {
    this.fstrStreetName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUrbanization = null;
    } else {
    this.fstrUrbanization = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreetAddress1 = null;
    } else {
    this.fstrStreetAddress1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreetAddress2 = null;
    } else {
    this.fstrStreetAddress2 = Text.readString(__dataIn);
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
        this.fstrPostCode = null;
    } else {
    this.fstrPostCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrState = null;
    } else {
    this.fstrState = Text.readString(__dataIn);
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
        this.fstrAddressDescription = null;
    } else {
    this.fstrAddressDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAddressVerified = null;
    } else {
    this.fblnAddressVerified = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDaytimeCountry = null;
    } else {
    this.fstrDaytimeCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDaytimeCountryCode = null;
    } else {
    this.fintDaytimeCountryCode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDaytimeAreaCode = null;
    } else {
    this.fstrDaytimeAreaCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDaytimePhoneNumber = null;
    } else {
    this.fstrDaytimePhoneNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDaytimeExtension = null;
    } else {
    this.fstrDaytimeExtension = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMobileCountry = null;
    } else {
    this.fstrMobileCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintMobileCountryCode = null;
    } else {
    this.fintMobileCountryCode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMobileAreaCode = null;
    } else {
    this.fstrMobileAreaCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMobilePhoneNumber = null;
    } else {
    this.fstrMobilePhoneNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMobileExtension = null;
    } else {
    this.fstrMobileExtension = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmailAddress = null;
    } else {
    this.fstrEmailAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCommence = null;
    } else {
    this.fdtmCommence = new Timestamp(__dataIn.readLong());
    this.fdtmCommence.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCease = null;
    } else {
    this.fdtmCease = new Timestamp(__dataIn.readLong());
    this.fdtmCease.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnValid = null;
    } else {
    this.fblnValid = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
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
    if (null == this.flngEmployerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerCustomerKey);
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.flngEmployeeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployeeCustomerKey);
    }
    if (null == this.flngEmployeeKSSAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployeeKSSAccountKey);
    }
    if (null == this.flngEmployeeSLSAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployeeSLSAccountKey);
    }
    if (null == this.fstrEmployeeIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeIRDNumber);
    }
    if (null == this.fstrEmployeeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeName);
    }
    if (null == this.fstrEmployeeTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeTitle);
    }
    if (null == this.fstrEmployeeFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeFirstName);
    }
    if (null == this.fstrEmployeeMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeMiddleName);
    }
    if (null == this.fstrEmployeeFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeFamilyName);
    }
    if (null == this.fdtmEmployeeDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEmployeeDOB.getTime());
    __dataOut.writeInt(this.fdtmEmployeeDOB.getNanos());
    }
    if (null == this.fstrKiwiSaverStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrKiwiSaverStatus);
    }
    if (null == this.fdtmKiwiSaverEndDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmKiwiSaverEndDate.getTime());
    __dataOut.writeInt(this.fdtmKiwiSaverEndDate.getNanos());
    }
    if (null == this.fdtmKiwiSaverOptInDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmKiwiSaverOptInDate.getTime());
    __dataOut.writeInt(this.fdtmKiwiSaverOptInDate.getNanos());
    }
    if (null == this.fdtmKiwiSaverOptOutDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmKiwiSaverOptOutDate.getTime());
    __dataOut.writeInt(this.fdtmKiwiSaverOptOutDate.getNanos());
    }
    if (null == this.fdtmKiwiSaverOptOutDeclined) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmKiwiSaverOptOutDeclined.getTime());
    __dataOut.writeInt(this.fdtmKiwiSaverOptOutDeclined.getNanos());
    }
    if (null == this.fblnAutoEnrolled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutoEnrolled);
    }
    if (null == this.fblnNonDistributionEmployee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonDistributionEmployee);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fstrUnitNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitNumber);
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
    if (null == this.fstrStreetNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreetNumber);
    }
    if (null == this.fstrStreetName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreetName);
    }
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fstrStreetAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreetAddress1);
    }
    if (null == this.fstrStreetAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreetAddress2);
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
    if (null == this.fstrPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostCode);
    }
    if (null == this.fstrState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrState);
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
    if (null == this.fstrAddressDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressDescription);
    }
    if (null == this.fblnAddressVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAddressVerified);
    }
    if (null == this.fstrDaytimeCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaytimeCountry);
    }
    if (null == this.fintDaytimeCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDaytimeCountryCode);
    }
    if (null == this.fstrDaytimeAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaytimeAreaCode);
    }
    if (null == this.fstrDaytimePhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaytimePhoneNumber);
    }
    if (null == this.fstrDaytimeExtension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaytimeExtension);
    }
    if (null == this.fstrMobileCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMobileCountry);
    }
    if (null == this.fintMobileCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMobileCountryCode);
    }
    if (null == this.fstrMobileAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMobileAreaCode);
    }
    if (null == this.fstrMobilePhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMobilePhoneNumber);
    }
    if (null == this.fstrMobileExtension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMobileExtension);
    }
    if (null == this.fstrEmailAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailAddress);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
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
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
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
    if (null == this.flngEmployerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerCustomerKey);
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.flngEmployeeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployeeCustomerKey);
    }
    if (null == this.flngEmployeeKSSAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployeeKSSAccountKey);
    }
    if (null == this.flngEmployeeSLSAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployeeSLSAccountKey);
    }
    if (null == this.fstrEmployeeIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeIRDNumber);
    }
    if (null == this.fstrEmployeeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeName);
    }
    if (null == this.fstrEmployeeTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeTitle);
    }
    if (null == this.fstrEmployeeFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeFirstName);
    }
    if (null == this.fstrEmployeeMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeMiddleName);
    }
    if (null == this.fstrEmployeeFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeFamilyName);
    }
    if (null == this.fdtmEmployeeDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEmployeeDOB.getTime());
    __dataOut.writeInt(this.fdtmEmployeeDOB.getNanos());
    }
    if (null == this.fstrKiwiSaverStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrKiwiSaverStatus);
    }
    if (null == this.fdtmKiwiSaverEndDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmKiwiSaverEndDate.getTime());
    __dataOut.writeInt(this.fdtmKiwiSaverEndDate.getNanos());
    }
    if (null == this.fdtmKiwiSaverOptInDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmKiwiSaverOptInDate.getTime());
    __dataOut.writeInt(this.fdtmKiwiSaverOptInDate.getNanos());
    }
    if (null == this.fdtmKiwiSaverOptOutDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmKiwiSaverOptOutDate.getTime());
    __dataOut.writeInt(this.fdtmKiwiSaverOptOutDate.getNanos());
    }
    if (null == this.fdtmKiwiSaverOptOutDeclined) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmKiwiSaverOptOutDeclined.getTime());
    __dataOut.writeInt(this.fdtmKiwiSaverOptOutDeclined.getNanos());
    }
    if (null == this.fblnAutoEnrolled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutoEnrolled);
    }
    if (null == this.fblnNonDistributionEmployee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonDistributionEmployee);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fstrUnitNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitNumber);
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
    if (null == this.fstrStreetNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreetNumber);
    }
    if (null == this.fstrStreetName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreetName);
    }
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fstrStreetAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreetAddress1);
    }
    if (null == this.fstrStreetAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreetAddress2);
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
    if (null == this.fstrPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostCode);
    }
    if (null == this.fstrState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrState);
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
    if (null == this.fstrAddressDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressDescription);
    }
    if (null == this.fblnAddressVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAddressVerified);
    }
    if (null == this.fstrDaytimeCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaytimeCountry);
    }
    if (null == this.fintDaytimeCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDaytimeCountryCode);
    }
    if (null == this.fstrDaytimeAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaytimeAreaCode);
    }
    if (null == this.fstrDaytimePhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaytimePhoneNumber);
    }
    if (null == this.fstrDaytimeExtension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaytimeExtension);
    }
    if (null == this.fstrMobileCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMobileCountry);
    }
    if (null == this.fintMobileCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMobileCountryCode);
    }
    if (null == this.fstrMobileAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMobileAreaCode);
    }
    if (null == this.fstrMobilePhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMobilePhoneNumber);
    }
    if (null == this.fstrMobileExtension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMobileExtension);
    }
    if (null == this.fstrEmailAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailAddress);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerCustomerKey==null?"\\N":"" + flngEmployerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployeeCustomerKey==null?"\\N":"" + flngEmployeeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployeeKSSAccountKey==null?"\\N":"" + flngEmployeeKSSAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployeeSLSAccountKey==null?"\\N":"" + flngEmployeeSLSAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeIRDNumber==null?"\\N":fstrEmployeeIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeName==null?"\\N":fstrEmployeeName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeTitle==null?"\\N":fstrEmployeeTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeFirstName==null?"\\N":fstrEmployeeFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeMiddleName==null?"\\N":fstrEmployeeMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeFamilyName==null?"\\N":fstrEmployeeFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEmployeeDOB==null?"\\N":"" + fdtmEmployeeDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrKiwiSaverStatus==null?"\\N":fstrKiwiSaverStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmKiwiSaverEndDate==null?"\\N":"" + fdtmKiwiSaverEndDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmKiwiSaverOptInDate==null?"\\N":"" + fdtmKiwiSaverOptInDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmKiwiSaverOptOutDate==null?"\\N":"" + fdtmKiwiSaverOptOutDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmKiwiSaverOptOutDeclined==null?"\\N":"" + fdtmKiwiSaverOptOutDeclined, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutoEnrolled==null?"\\N":"" + fblnAutoEnrolled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonDistributionEmployee==null?"\\N":"" + fblnNonDistributionEmployee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitNumber==null?"\\N":fstrUnitNumber, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreetNumber==null?"\\N":fstrStreetNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreetName==null?"\\N":fstrStreetName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreetAddress1==null?"\\N":fstrStreetAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreetAddress2==null?"\\N":fstrStreetAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCounty==null?"\\N":fstrCounty, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostCode==null?"\\N":fstrPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrState==null?"\\N":fstrState, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressDescription==null?"\\N":fstrAddressDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAddressVerified==null?"\\N":"" + fblnAddressVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaytimeCountry==null?"\\N":fstrDaytimeCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDaytimeCountryCode==null?"\\N":"" + fintDaytimeCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaytimeAreaCode==null?"\\N":fstrDaytimeAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaytimePhoneNumber==null?"\\N":fstrDaytimePhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaytimeExtension==null?"\\N":fstrDaytimeExtension, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMobileCountry==null?"\\N":fstrMobileCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMobileCountryCode==null?"\\N":"" + fintMobileCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMobileAreaCode==null?"\\N":fstrMobileAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMobilePhoneNumber==null?"\\N":fstrMobilePhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMobileExtension==null?"\\N":fstrMobileExtension, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailAddress==null?"\\N":fstrEmailAddress, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerCustomerKey==null?"\\N":"" + flngEmployerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployeeCustomerKey==null?"\\N":"" + flngEmployeeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployeeKSSAccountKey==null?"\\N":"" + flngEmployeeKSSAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployeeSLSAccountKey==null?"\\N":"" + flngEmployeeSLSAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeIRDNumber==null?"\\N":fstrEmployeeIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeName==null?"\\N":fstrEmployeeName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeTitle==null?"\\N":fstrEmployeeTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeFirstName==null?"\\N":fstrEmployeeFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeMiddleName==null?"\\N":fstrEmployeeMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeFamilyName==null?"\\N":fstrEmployeeFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEmployeeDOB==null?"\\N":"" + fdtmEmployeeDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrKiwiSaverStatus==null?"\\N":fstrKiwiSaverStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmKiwiSaverEndDate==null?"\\N":"" + fdtmKiwiSaverEndDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmKiwiSaverOptInDate==null?"\\N":"" + fdtmKiwiSaverOptInDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmKiwiSaverOptOutDate==null?"\\N":"" + fdtmKiwiSaverOptOutDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmKiwiSaverOptOutDeclined==null?"\\N":"" + fdtmKiwiSaverOptOutDeclined, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutoEnrolled==null?"\\N":"" + fblnAutoEnrolled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonDistributionEmployee==null?"\\N":"" + fblnNonDistributionEmployee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitNumber==null?"\\N":fstrUnitNumber, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreetNumber==null?"\\N":fstrStreetNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreetName==null?"\\N":fstrStreetName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreetAddress1==null?"\\N":fstrStreetAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreetAddress2==null?"\\N":fstrStreetAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCounty==null?"\\N":fstrCounty, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostCode==null?"\\N":fstrPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrState==null?"\\N":fstrState, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressDescription==null?"\\N":fstrAddressDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAddressVerified==null?"\\N":"" + fblnAddressVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaytimeCountry==null?"\\N":fstrDaytimeCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDaytimeCountryCode==null?"\\N":"" + fintDaytimeCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaytimeAreaCode==null?"\\N":fstrDaytimeAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaytimePhoneNumber==null?"\\N":fstrDaytimePhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaytimeExtension==null?"\\N":fstrDaytimeExtension, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMobileCountry==null?"\\N":fstrMobileCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMobileCountryCode==null?"\\N":"" + fintMobileCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMobileAreaCode==null?"\\N":fstrMobileAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMobilePhoneNumber==null?"\\N":fstrMobilePhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMobileExtension==null?"\\N":fstrMobileExtension, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailAddress==null?"\\N":fstrEmailAddress, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerCustomerKey = null; } else {
      this.flngEmployerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployeeCustomerKey = null; } else {
      this.flngEmployeeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployeeKSSAccountKey = null; } else {
      this.flngEmployeeKSSAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployeeSLSAccountKey = null; } else {
      this.flngEmployeeSLSAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeIRDNumber = null; } else {
      this.fstrEmployeeIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeName = null; } else {
      this.fstrEmployeeName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeTitle = null; } else {
      this.fstrEmployeeTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeFirstName = null; } else {
      this.fstrEmployeeFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeMiddleName = null; } else {
      this.fstrEmployeeMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeFamilyName = null; } else {
      this.fstrEmployeeFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEmployeeDOB = null; } else {
      this.fdtmEmployeeDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrKiwiSaverStatus = null; } else {
      this.fstrKiwiSaverStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmKiwiSaverEndDate = null; } else {
      this.fdtmKiwiSaverEndDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmKiwiSaverOptInDate = null; } else {
      this.fdtmKiwiSaverOptInDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmKiwiSaverOptOutDate = null; } else {
      this.fdtmKiwiSaverOptOutDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmKiwiSaverOptOutDeclined = null; } else {
      this.fdtmKiwiSaverOptOutDeclined = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutoEnrolled = null; } else {
      this.fblnAutoEnrolled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonDistributionEmployee = null; } else {
      this.fblnNonDistributionEmployee = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrUnitNumber = null; } else {
      this.fstrUnitNumber = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrStreetNumber = null; } else {
      this.fstrStreetNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreetName = null; } else {
      this.fstrStreetName = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrStreetAddress1 = null; } else {
      this.fstrStreetAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreetAddress2 = null; } else {
      this.fstrStreetAddress2 = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrPostCode = null; } else {
      this.fstrPostCode = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrAddressDescription = null; } else {
      this.fstrAddressDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAddressVerified = null; } else {
      this.fblnAddressVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaytimeCountry = null; } else {
      this.fstrDaytimeCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDaytimeCountryCode = null; } else {
      this.fintDaytimeCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaytimeAreaCode = null; } else {
      this.fstrDaytimeAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaytimePhoneNumber = null; } else {
      this.fstrDaytimePhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaytimeExtension = null; } else {
      this.fstrDaytimeExtension = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMobileCountry = null; } else {
      this.fstrMobileCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintMobileCountryCode = null; } else {
      this.fintMobileCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMobileAreaCode = null; } else {
      this.fstrMobileAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMobilePhoneNumber = null; } else {
      this.fstrMobilePhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMobileExtension = null; } else {
      this.fstrMobileExtension = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailAddress = null; } else {
      this.fstrEmailAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerCustomerKey = null; } else {
      this.flngEmployerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployeeCustomerKey = null; } else {
      this.flngEmployeeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployeeKSSAccountKey = null; } else {
      this.flngEmployeeKSSAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployeeSLSAccountKey = null; } else {
      this.flngEmployeeSLSAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeIRDNumber = null; } else {
      this.fstrEmployeeIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeName = null; } else {
      this.fstrEmployeeName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeTitle = null; } else {
      this.fstrEmployeeTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeFirstName = null; } else {
      this.fstrEmployeeFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeMiddleName = null; } else {
      this.fstrEmployeeMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeFamilyName = null; } else {
      this.fstrEmployeeFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEmployeeDOB = null; } else {
      this.fdtmEmployeeDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrKiwiSaverStatus = null; } else {
      this.fstrKiwiSaverStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmKiwiSaverEndDate = null; } else {
      this.fdtmKiwiSaverEndDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmKiwiSaverOptInDate = null; } else {
      this.fdtmKiwiSaverOptInDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmKiwiSaverOptOutDate = null; } else {
      this.fdtmKiwiSaverOptOutDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmKiwiSaverOptOutDeclined = null; } else {
      this.fdtmKiwiSaverOptOutDeclined = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutoEnrolled = null; } else {
      this.fblnAutoEnrolled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonDistributionEmployee = null; } else {
      this.fblnNonDistributionEmployee = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrUnitNumber = null; } else {
      this.fstrUnitNumber = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrStreetNumber = null; } else {
      this.fstrStreetNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreetName = null; } else {
      this.fstrStreetName = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrStreetAddress1 = null; } else {
      this.fstrStreetAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreetAddress2 = null; } else {
      this.fstrStreetAddress2 = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrPostCode = null; } else {
      this.fstrPostCode = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrAddressDescription = null; } else {
      this.fstrAddressDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAddressVerified = null; } else {
      this.fblnAddressVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaytimeCountry = null; } else {
      this.fstrDaytimeCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDaytimeCountryCode = null; } else {
      this.fintDaytimeCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaytimeAreaCode = null; } else {
      this.fstrDaytimeAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaytimePhoneNumber = null; } else {
      this.fstrDaytimePhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaytimeExtension = null; } else {
      this.fstrDaytimeExtension = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMobileCountry = null; } else {
      this.fstrMobileCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintMobileCountryCode = null; } else {
      this.fintMobileCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMobileAreaCode = null; } else {
      this.fstrMobileAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMobilePhoneNumber = null; } else {
      this.fstrMobilePhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMobileExtension = null; } else {
      this.fstrMobileExtension = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailAddress = null; } else {
      this.fstrEmailAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    tblnz_employeremployees o = (tblnz_employeremployees) super.clone();
    o.fdtmEmployeeDOB = (o.fdtmEmployeeDOB != null) ? (java.sql.Timestamp) o.fdtmEmployeeDOB.clone() : null;
    o.fdtmKiwiSaverEndDate = (o.fdtmKiwiSaverEndDate != null) ? (java.sql.Timestamp) o.fdtmKiwiSaverEndDate.clone() : null;
    o.fdtmKiwiSaverOptInDate = (o.fdtmKiwiSaverOptInDate != null) ? (java.sql.Timestamp) o.fdtmKiwiSaverOptInDate.clone() : null;
    o.fdtmKiwiSaverOptOutDate = (o.fdtmKiwiSaverOptOutDate != null) ? (java.sql.Timestamp) o.fdtmKiwiSaverOptOutDate.clone() : null;
    o.fdtmKiwiSaverOptOutDeclined = (o.fdtmKiwiSaverOptOutDeclined != null) ? (java.sql.Timestamp) o.fdtmKiwiSaverOptOutDeclined.clone() : null;
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_employeremployees o) throws CloneNotSupportedException {
    o.fdtmEmployeeDOB = (o.fdtmEmployeeDOB != null) ? (java.sql.Timestamp) o.fdtmEmployeeDOB.clone() : null;
    o.fdtmKiwiSaverEndDate = (o.fdtmKiwiSaverEndDate != null) ? (java.sql.Timestamp) o.fdtmKiwiSaverEndDate.clone() : null;
    o.fdtmKiwiSaverOptInDate = (o.fdtmKiwiSaverOptInDate != null) ? (java.sql.Timestamp) o.fdtmKiwiSaverOptInDate.clone() : null;
    o.fdtmKiwiSaverOptOutDate = (o.fdtmKiwiSaverOptOutDate != null) ? (java.sql.Timestamp) o.fdtmKiwiSaverOptOutDate.clone() : null;
    o.fdtmKiwiSaverOptOutDeclined = (o.fdtmKiwiSaverOptOutDeclined != null) ? (java.sql.Timestamp) o.fdtmKiwiSaverOptOutDeclined.clone() : null;
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngEmployerCustomerKey", this.flngEmployerCustomerKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("flngEmployeeCustomerKey", this.flngEmployeeCustomerKey);
    __sqoop$field_map.put("flngEmployeeKSSAccountKey", this.flngEmployeeKSSAccountKey);
    __sqoop$field_map.put("flngEmployeeSLSAccountKey", this.flngEmployeeSLSAccountKey);
    __sqoop$field_map.put("fstrEmployeeIRDNumber", this.fstrEmployeeIRDNumber);
    __sqoop$field_map.put("fstrEmployeeName", this.fstrEmployeeName);
    __sqoop$field_map.put("fstrEmployeeTitle", this.fstrEmployeeTitle);
    __sqoop$field_map.put("fstrEmployeeFirstName", this.fstrEmployeeFirstName);
    __sqoop$field_map.put("fstrEmployeeMiddleName", this.fstrEmployeeMiddleName);
    __sqoop$field_map.put("fstrEmployeeFamilyName", this.fstrEmployeeFamilyName);
    __sqoop$field_map.put("fdtmEmployeeDOB", this.fdtmEmployeeDOB);
    __sqoop$field_map.put("fstrKiwiSaverStatus", this.fstrKiwiSaverStatus);
    __sqoop$field_map.put("fdtmKiwiSaverEndDate", this.fdtmKiwiSaverEndDate);
    __sqoop$field_map.put("fdtmKiwiSaverOptInDate", this.fdtmKiwiSaverOptInDate);
    __sqoop$field_map.put("fdtmKiwiSaverOptOutDate", this.fdtmKiwiSaverOptOutDate);
    __sqoop$field_map.put("fdtmKiwiSaverOptOutDeclined", this.fdtmKiwiSaverOptOutDeclined);
    __sqoop$field_map.put("fblnAutoEnrolled", this.fblnAutoEnrolled);
    __sqoop$field_map.put("fblnNonDistributionEmployee", this.fblnNonDistributionEmployee);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrUnitNumber", this.fstrUnitNumber);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrStreetNumber", this.fstrStreetNumber);
    __sqoop$field_map.put("fstrStreetName", this.fstrStreetName);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fstrStreetAddress1", this.fstrStreetAddress1);
    __sqoop$field_map.put("fstrStreetAddress2", this.fstrStreetAddress2);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fblnAddressVerified", this.fblnAddressVerified);
    __sqoop$field_map.put("fstrDaytimeCountry", this.fstrDaytimeCountry);
    __sqoop$field_map.put("fintDaytimeCountryCode", this.fintDaytimeCountryCode);
    __sqoop$field_map.put("fstrDaytimeAreaCode", this.fstrDaytimeAreaCode);
    __sqoop$field_map.put("fstrDaytimePhoneNumber", this.fstrDaytimePhoneNumber);
    __sqoop$field_map.put("fstrDaytimeExtension", this.fstrDaytimeExtension);
    __sqoop$field_map.put("fstrMobileCountry", this.fstrMobileCountry);
    __sqoop$field_map.put("fintMobileCountryCode", this.fintMobileCountryCode);
    __sqoop$field_map.put("fstrMobileAreaCode", this.fstrMobileAreaCode);
    __sqoop$field_map.put("fstrMobilePhoneNumber", this.fstrMobilePhoneNumber);
    __sqoop$field_map.put("fstrMobileExtension", this.fstrMobileExtension);
    __sqoop$field_map.put("fstrEmailAddress", this.fstrEmailAddress);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngEmployerCustomerKey", this.flngEmployerCustomerKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("flngEmployeeCustomerKey", this.flngEmployeeCustomerKey);
    __sqoop$field_map.put("flngEmployeeKSSAccountKey", this.flngEmployeeKSSAccountKey);
    __sqoop$field_map.put("flngEmployeeSLSAccountKey", this.flngEmployeeSLSAccountKey);
    __sqoop$field_map.put("fstrEmployeeIRDNumber", this.fstrEmployeeIRDNumber);
    __sqoop$field_map.put("fstrEmployeeName", this.fstrEmployeeName);
    __sqoop$field_map.put("fstrEmployeeTitle", this.fstrEmployeeTitle);
    __sqoop$field_map.put("fstrEmployeeFirstName", this.fstrEmployeeFirstName);
    __sqoop$field_map.put("fstrEmployeeMiddleName", this.fstrEmployeeMiddleName);
    __sqoop$field_map.put("fstrEmployeeFamilyName", this.fstrEmployeeFamilyName);
    __sqoop$field_map.put("fdtmEmployeeDOB", this.fdtmEmployeeDOB);
    __sqoop$field_map.put("fstrKiwiSaverStatus", this.fstrKiwiSaverStatus);
    __sqoop$field_map.put("fdtmKiwiSaverEndDate", this.fdtmKiwiSaverEndDate);
    __sqoop$field_map.put("fdtmKiwiSaverOptInDate", this.fdtmKiwiSaverOptInDate);
    __sqoop$field_map.put("fdtmKiwiSaverOptOutDate", this.fdtmKiwiSaverOptOutDate);
    __sqoop$field_map.put("fdtmKiwiSaverOptOutDeclined", this.fdtmKiwiSaverOptOutDeclined);
    __sqoop$field_map.put("fblnAutoEnrolled", this.fblnAutoEnrolled);
    __sqoop$field_map.put("fblnNonDistributionEmployee", this.fblnNonDistributionEmployee);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrUnitNumber", this.fstrUnitNumber);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrStreetNumber", this.fstrStreetNumber);
    __sqoop$field_map.put("fstrStreetName", this.fstrStreetName);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fstrStreetAddress1", this.fstrStreetAddress1);
    __sqoop$field_map.put("fstrStreetAddress2", this.fstrStreetAddress2);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fblnAddressVerified", this.fblnAddressVerified);
    __sqoop$field_map.put("fstrDaytimeCountry", this.fstrDaytimeCountry);
    __sqoop$field_map.put("fintDaytimeCountryCode", this.fintDaytimeCountryCode);
    __sqoop$field_map.put("fstrDaytimeAreaCode", this.fstrDaytimeAreaCode);
    __sqoop$field_map.put("fstrDaytimePhoneNumber", this.fstrDaytimePhoneNumber);
    __sqoop$field_map.put("fstrDaytimeExtension", this.fstrDaytimeExtension);
    __sqoop$field_map.put("fstrMobileCountry", this.fstrMobileCountry);
    __sqoop$field_map.put("fintMobileCountryCode", this.fintMobileCountryCode);
    __sqoop$field_map.put("fstrMobileAreaCode", this.fstrMobileAreaCode);
    __sqoop$field_map.put("fstrMobilePhoneNumber", this.fstrMobilePhoneNumber);
    __sqoop$field_map.put("fstrMobileExtension", this.fstrMobileExtension);
    __sqoop$field_map.put("fstrEmailAddress", this.fstrEmailAddress);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
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
