// ORM class for table 'tblnz_rtnattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 16:50:40 NZDT 2020
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

public class tblnz_rtnattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngWebReqKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.flngWebReqKey = (Integer)value;
      }
    });
    setters.put("fstrFilingFrequency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrFilingFrequency = (String)value;
      }
    });
    setters.put("fstrSourceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrSourceType = (String)value;
      }
    });
    setters.put("fstrWebLogonID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrWebLogonID = (String)value;
      }
    });
    setters.put("fstrFormTypeFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrFormTypeFiled = (String)value;
      }
    });
    setters.put("fstrFormTypeExpected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrFormTypeExpected = (String)value;
      }
    });
    setters.put("fstrIPAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrIPAddress = (String)value;
      }
    });
    setters.put("fstrVendorID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrVendorID = (String)value;
      }
    });
    setters.put("fstrSoftwareProvider", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrSoftwareProvider = (String)value;
      }
    });
    setters.put("fstrSoftwarePlatform", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrSoftwarePlatform = (String)value;
      }
    });
    setters.put("fstrSoftwareRelease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrSoftwareRelease = (String)value;
      }
    });
    setters.put("fstrDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrDLN = (String)value;
      }
    });
    setters.put("fdtmCeaseDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fdtmCeaseDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCeaseExplanation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrCeaseExplanation = (String)value;
      }
    });
    setters.put("fblnAmended", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnAmended = (Integer)value;
      }
    });
    setters.put("fstrAmendReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrAmendReason = (String)value;
      }
    });
    setters.put("fstrAmendText", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrAmendText = (String)value;
      }
    });
    setters.put("fblnAudited", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnAudited = (Integer)value;
      }
    });
    setters.put("fblnCorrespondence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnCorrespondence = (Integer)value;
      }
    });
    setters.put("fblnFuturePeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnFuturePeriod = (Integer)value;
      }
    });
    setters.put("fblnDiscovery", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnDiscovery = (Integer)value;
      }
    });
    setters.put("fblnNilReturn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnNilReturn = (Integer)value;
      }
    });
    setters.put("fblnDefault", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnDefault = (Integer)value;
      }
    });
    setters.put("fblnFinalReturn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnFinalReturn = (Integer)value;
      }
    });
    setters.put("fblnProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnProvisional = (Integer)value;
      }
    });
    setters.put("fcurAmountDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fcurAmountDue = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmPaymentDueDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fdtmPaymentDueDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPaymentDueDateExtended", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fdtmPaymentDueDateExtended = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnConverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnConverted = (Integer)value;
      }
    });
    setters.put("fblnOriginallyConverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fblnOriginallyConverted = (Integer)value;
      }
    });
    setters.put("fcurCreditTransferAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fcurCreditTransferAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmThirtyDaysToPay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fdtmThirtyDaysToPay = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnattributes() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnattributes with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_rtnattributes with_flngVer(Integer flngVer) {
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
  public tblnz_rtnattributes with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngWebReqKey;
  public Integer get_flngWebReqKey() {
    return flngWebReqKey;
  }
  public void set_flngWebReqKey(Integer flngWebReqKey) {
    this.flngWebReqKey = flngWebReqKey;
  }
  public tblnz_rtnattributes with_flngWebReqKey(Integer flngWebReqKey) {
    this.flngWebReqKey = flngWebReqKey;
    return this;
  }
  private String fstrFilingFrequency;
  public String get_fstrFilingFrequency() {
    return fstrFilingFrequency;
  }
  public void set_fstrFilingFrequency(String fstrFilingFrequency) {
    this.fstrFilingFrequency = fstrFilingFrequency;
  }
  public tblnz_rtnattributes with_fstrFilingFrequency(String fstrFilingFrequency) {
    this.fstrFilingFrequency = fstrFilingFrequency;
    return this;
  }
  private String fstrSourceType;
  public String get_fstrSourceType() {
    return fstrSourceType;
  }
  public void set_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
  }
  public tblnz_rtnattributes with_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
    return this;
  }
  private String fstrWebLogonID;
  public String get_fstrWebLogonID() {
    return fstrWebLogonID;
  }
  public void set_fstrWebLogonID(String fstrWebLogonID) {
    this.fstrWebLogonID = fstrWebLogonID;
  }
  public tblnz_rtnattributes with_fstrWebLogonID(String fstrWebLogonID) {
    this.fstrWebLogonID = fstrWebLogonID;
    return this;
  }
  private String fstrFormTypeFiled;
  public String get_fstrFormTypeFiled() {
    return fstrFormTypeFiled;
  }
  public void set_fstrFormTypeFiled(String fstrFormTypeFiled) {
    this.fstrFormTypeFiled = fstrFormTypeFiled;
  }
  public tblnz_rtnattributes with_fstrFormTypeFiled(String fstrFormTypeFiled) {
    this.fstrFormTypeFiled = fstrFormTypeFiled;
    return this;
  }
  private String fstrFormTypeExpected;
  public String get_fstrFormTypeExpected() {
    return fstrFormTypeExpected;
  }
  public void set_fstrFormTypeExpected(String fstrFormTypeExpected) {
    this.fstrFormTypeExpected = fstrFormTypeExpected;
  }
  public tblnz_rtnattributes with_fstrFormTypeExpected(String fstrFormTypeExpected) {
    this.fstrFormTypeExpected = fstrFormTypeExpected;
    return this;
  }
  private String fstrIPAddress;
  public String get_fstrIPAddress() {
    return fstrIPAddress;
  }
  public void set_fstrIPAddress(String fstrIPAddress) {
    this.fstrIPAddress = fstrIPAddress;
  }
  public tblnz_rtnattributes with_fstrIPAddress(String fstrIPAddress) {
    this.fstrIPAddress = fstrIPAddress;
    return this;
  }
  private String fstrVendorID;
  public String get_fstrVendorID() {
    return fstrVendorID;
  }
  public void set_fstrVendorID(String fstrVendorID) {
    this.fstrVendorID = fstrVendorID;
  }
  public tblnz_rtnattributes with_fstrVendorID(String fstrVendorID) {
    this.fstrVendorID = fstrVendorID;
    return this;
  }
  private String fstrSoftwareProvider;
  public String get_fstrSoftwareProvider() {
    return fstrSoftwareProvider;
  }
  public void set_fstrSoftwareProvider(String fstrSoftwareProvider) {
    this.fstrSoftwareProvider = fstrSoftwareProvider;
  }
  public tblnz_rtnattributes with_fstrSoftwareProvider(String fstrSoftwareProvider) {
    this.fstrSoftwareProvider = fstrSoftwareProvider;
    return this;
  }
  private String fstrSoftwarePlatform;
  public String get_fstrSoftwarePlatform() {
    return fstrSoftwarePlatform;
  }
  public void set_fstrSoftwarePlatform(String fstrSoftwarePlatform) {
    this.fstrSoftwarePlatform = fstrSoftwarePlatform;
  }
  public tblnz_rtnattributes with_fstrSoftwarePlatform(String fstrSoftwarePlatform) {
    this.fstrSoftwarePlatform = fstrSoftwarePlatform;
    return this;
  }
  private String fstrSoftwareRelease;
  public String get_fstrSoftwareRelease() {
    return fstrSoftwareRelease;
  }
  public void set_fstrSoftwareRelease(String fstrSoftwareRelease) {
    this.fstrSoftwareRelease = fstrSoftwareRelease;
  }
  public tblnz_rtnattributes with_fstrSoftwareRelease(String fstrSoftwareRelease) {
    this.fstrSoftwareRelease = fstrSoftwareRelease;
    return this;
  }
  private String fstrDLN;
  public String get_fstrDLN() {
    return fstrDLN;
  }
  public void set_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
  }
  public tblnz_rtnattributes with_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
    return this;
  }
  private java.sql.Timestamp fdtmCeaseDate;
  public java.sql.Timestamp get_fdtmCeaseDate() {
    return fdtmCeaseDate;
  }
  public void set_fdtmCeaseDate(java.sql.Timestamp fdtmCeaseDate) {
    this.fdtmCeaseDate = fdtmCeaseDate;
  }
  public tblnz_rtnattributes with_fdtmCeaseDate(java.sql.Timestamp fdtmCeaseDate) {
    this.fdtmCeaseDate = fdtmCeaseDate;
    return this;
  }
  private String fstrCeaseExplanation;
  public String get_fstrCeaseExplanation() {
    return fstrCeaseExplanation;
  }
  public void set_fstrCeaseExplanation(String fstrCeaseExplanation) {
    this.fstrCeaseExplanation = fstrCeaseExplanation;
  }
  public tblnz_rtnattributes with_fstrCeaseExplanation(String fstrCeaseExplanation) {
    this.fstrCeaseExplanation = fstrCeaseExplanation;
    return this;
  }
  private Integer fblnAmended;
  public Integer get_fblnAmended() {
    return fblnAmended;
  }
  public void set_fblnAmended(Integer fblnAmended) {
    this.fblnAmended = fblnAmended;
  }
  public tblnz_rtnattributes with_fblnAmended(Integer fblnAmended) {
    this.fblnAmended = fblnAmended;
    return this;
  }
  private String fstrAmendReason;
  public String get_fstrAmendReason() {
    return fstrAmendReason;
  }
  public void set_fstrAmendReason(String fstrAmendReason) {
    this.fstrAmendReason = fstrAmendReason;
  }
  public tblnz_rtnattributes with_fstrAmendReason(String fstrAmendReason) {
    this.fstrAmendReason = fstrAmendReason;
    return this;
  }
  private String fstrAmendText;
  public String get_fstrAmendText() {
    return fstrAmendText;
  }
  public void set_fstrAmendText(String fstrAmendText) {
    this.fstrAmendText = fstrAmendText;
  }
  public tblnz_rtnattributes with_fstrAmendText(String fstrAmendText) {
    this.fstrAmendText = fstrAmendText;
    return this;
  }
  private Integer fblnAudited;
  public Integer get_fblnAudited() {
    return fblnAudited;
  }
  public void set_fblnAudited(Integer fblnAudited) {
    this.fblnAudited = fblnAudited;
  }
  public tblnz_rtnattributes with_fblnAudited(Integer fblnAudited) {
    this.fblnAudited = fblnAudited;
    return this;
  }
  private Integer fblnCorrespondence;
  public Integer get_fblnCorrespondence() {
    return fblnCorrespondence;
  }
  public void set_fblnCorrespondence(Integer fblnCorrespondence) {
    this.fblnCorrespondence = fblnCorrespondence;
  }
  public tblnz_rtnattributes with_fblnCorrespondence(Integer fblnCorrespondence) {
    this.fblnCorrespondence = fblnCorrespondence;
    return this;
  }
  private Integer fblnFuturePeriod;
  public Integer get_fblnFuturePeriod() {
    return fblnFuturePeriod;
  }
  public void set_fblnFuturePeriod(Integer fblnFuturePeriod) {
    this.fblnFuturePeriod = fblnFuturePeriod;
  }
  public tblnz_rtnattributes with_fblnFuturePeriod(Integer fblnFuturePeriod) {
    this.fblnFuturePeriod = fblnFuturePeriod;
    return this;
  }
  private Integer fblnDiscovery;
  public Integer get_fblnDiscovery() {
    return fblnDiscovery;
  }
  public void set_fblnDiscovery(Integer fblnDiscovery) {
    this.fblnDiscovery = fblnDiscovery;
  }
  public tblnz_rtnattributes with_fblnDiscovery(Integer fblnDiscovery) {
    this.fblnDiscovery = fblnDiscovery;
    return this;
  }
  private Integer fblnNilReturn;
  public Integer get_fblnNilReturn() {
    return fblnNilReturn;
  }
  public void set_fblnNilReturn(Integer fblnNilReturn) {
    this.fblnNilReturn = fblnNilReturn;
  }
  public tblnz_rtnattributes with_fblnNilReturn(Integer fblnNilReturn) {
    this.fblnNilReturn = fblnNilReturn;
    return this;
  }
  private Integer fblnDefault;
  public Integer get_fblnDefault() {
    return fblnDefault;
  }
  public void set_fblnDefault(Integer fblnDefault) {
    this.fblnDefault = fblnDefault;
  }
  public tblnz_rtnattributes with_fblnDefault(Integer fblnDefault) {
    this.fblnDefault = fblnDefault;
    return this;
  }
  private Integer fblnFinalReturn;
  public Integer get_fblnFinalReturn() {
    return fblnFinalReturn;
  }
  public void set_fblnFinalReturn(Integer fblnFinalReturn) {
    this.fblnFinalReturn = fblnFinalReturn;
  }
  public tblnz_rtnattributes with_fblnFinalReturn(Integer fblnFinalReturn) {
    this.fblnFinalReturn = fblnFinalReturn;
    return this;
  }
  private Integer fblnProvisional;
  public Integer get_fblnProvisional() {
    return fblnProvisional;
  }
  public void set_fblnProvisional(Integer fblnProvisional) {
    this.fblnProvisional = fblnProvisional;
  }
  public tblnz_rtnattributes with_fblnProvisional(Integer fblnProvisional) {
    this.fblnProvisional = fblnProvisional;
    return this;
  }
  private java.math.BigDecimal fcurAmountDue;
  public java.math.BigDecimal get_fcurAmountDue() {
    return fcurAmountDue;
  }
  public void set_fcurAmountDue(java.math.BigDecimal fcurAmountDue) {
    this.fcurAmountDue = fcurAmountDue;
  }
  public tblnz_rtnattributes with_fcurAmountDue(java.math.BigDecimal fcurAmountDue) {
    this.fcurAmountDue = fcurAmountDue;
    return this;
  }
  private java.sql.Timestamp fdtmPaymentDueDate;
  public java.sql.Timestamp get_fdtmPaymentDueDate() {
    return fdtmPaymentDueDate;
  }
  public void set_fdtmPaymentDueDate(java.sql.Timestamp fdtmPaymentDueDate) {
    this.fdtmPaymentDueDate = fdtmPaymentDueDate;
  }
  public tblnz_rtnattributes with_fdtmPaymentDueDate(java.sql.Timestamp fdtmPaymentDueDate) {
    this.fdtmPaymentDueDate = fdtmPaymentDueDate;
    return this;
  }
  private java.sql.Timestamp fdtmPaymentDueDateExtended;
  public java.sql.Timestamp get_fdtmPaymentDueDateExtended() {
    return fdtmPaymentDueDateExtended;
  }
  public void set_fdtmPaymentDueDateExtended(java.sql.Timestamp fdtmPaymentDueDateExtended) {
    this.fdtmPaymentDueDateExtended = fdtmPaymentDueDateExtended;
  }
  public tblnz_rtnattributes with_fdtmPaymentDueDateExtended(java.sql.Timestamp fdtmPaymentDueDateExtended) {
    this.fdtmPaymentDueDateExtended = fdtmPaymentDueDateExtended;
    return this;
  }
  private Integer fblnConverted;
  public Integer get_fblnConverted() {
    return fblnConverted;
  }
  public void set_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
  }
  public tblnz_rtnattributes with_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
    return this;
  }
  private Integer fblnOriginallyConverted;
  public Integer get_fblnOriginallyConverted() {
    return fblnOriginallyConverted;
  }
  public void set_fblnOriginallyConverted(Integer fblnOriginallyConverted) {
    this.fblnOriginallyConverted = fblnOriginallyConverted;
  }
  public tblnz_rtnattributes with_fblnOriginallyConverted(Integer fblnOriginallyConverted) {
    this.fblnOriginallyConverted = fblnOriginallyConverted;
    return this;
  }
  private java.math.BigDecimal fcurCreditTransferAmount;
  public java.math.BigDecimal get_fcurCreditTransferAmount() {
    return fcurCreditTransferAmount;
  }
  public void set_fcurCreditTransferAmount(java.math.BigDecimal fcurCreditTransferAmount) {
    this.fcurCreditTransferAmount = fcurCreditTransferAmount;
  }
  public tblnz_rtnattributes with_fcurCreditTransferAmount(java.math.BigDecimal fcurCreditTransferAmount) {
    this.fcurCreditTransferAmount = fcurCreditTransferAmount;
    return this;
  }
  private java.sql.Timestamp fdtmThirtyDaysToPay;
  public java.sql.Timestamp get_fdtmThirtyDaysToPay() {
    return fdtmThirtyDaysToPay;
  }
  public void set_fdtmThirtyDaysToPay(java.sql.Timestamp fdtmThirtyDaysToPay) {
    this.fdtmThirtyDaysToPay = fdtmThirtyDaysToPay;
  }
  public tblnz_rtnattributes with_fdtmThirtyDaysToPay(java.sql.Timestamp fdtmThirtyDaysToPay) {
    this.fdtmThirtyDaysToPay = fdtmThirtyDaysToPay;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnattributes with_fstrWho(String fstrWho) {
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
  public tblnz_rtnattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnattributes)) {
      return false;
    }
    tblnz_rtnattributes that = (tblnz_rtnattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngWebReqKey == null ? that.flngWebReqKey == null : this.flngWebReqKey.equals(that.flngWebReqKey));
    equal = equal && (this.fstrFilingFrequency == null ? that.fstrFilingFrequency == null : this.fstrFilingFrequency.equals(that.fstrFilingFrequency));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fstrWebLogonID == null ? that.fstrWebLogonID == null : this.fstrWebLogonID.equals(that.fstrWebLogonID));
    equal = equal && (this.fstrFormTypeFiled == null ? that.fstrFormTypeFiled == null : this.fstrFormTypeFiled.equals(that.fstrFormTypeFiled));
    equal = equal && (this.fstrFormTypeExpected == null ? that.fstrFormTypeExpected == null : this.fstrFormTypeExpected.equals(that.fstrFormTypeExpected));
    equal = equal && (this.fstrIPAddress == null ? that.fstrIPAddress == null : this.fstrIPAddress.equals(that.fstrIPAddress));
    equal = equal && (this.fstrVendorID == null ? that.fstrVendorID == null : this.fstrVendorID.equals(that.fstrVendorID));
    equal = equal && (this.fstrSoftwareProvider == null ? that.fstrSoftwareProvider == null : this.fstrSoftwareProvider.equals(that.fstrSoftwareProvider));
    equal = equal && (this.fstrSoftwarePlatform == null ? that.fstrSoftwarePlatform == null : this.fstrSoftwarePlatform.equals(that.fstrSoftwarePlatform));
    equal = equal && (this.fstrSoftwareRelease == null ? that.fstrSoftwareRelease == null : this.fstrSoftwareRelease.equals(that.fstrSoftwareRelease));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmCeaseDate == null ? that.fdtmCeaseDate == null : this.fdtmCeaseDate.equals(that.fdtmCeaseDate));
    equal = equal && (this.fstrCeaseExplanation == null ? that.fstrCeaseExplanation == null : this.fstrCeaseExplanation.equals(that.fstrCeaseExplanation));
    equal = equal && (this.fblnAmended == null ? that.fblnAmended == null : this.fblnAmended.equals(that.fblnAmended));
    equal = equal && (this.fstrAmendReason == null ? that.fstrAmendReason == null : this.fstrAmendReason.equals(that.fstrAmendReason));
    equal = equal && (this.fstrAmendText == null ? that.fstrAmendText == null : this.fstrAmendText.equals(that.fstrAmendText));
    equal = equal && (this.fblnAudited == null ? that.fblnAudited == null : this.fblnAudited.equals(that.fblnAudited));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fblnFuturePeriod == null ? that.fblnFuturePeriod == null : this.fblnFuturePeriod.equals(that.fblnFuturePeriod));
    equal = equal && (this.fblnDiscovery == null ? that.fblnDiscovery == null : this.fblnDiscovery.equals(that.fblnDiscovery));
    equal = equal && (this.fblnNilReturn == null ? that.fblnNilReturn == null : this.fblnNilReturn.equals(that.fblnNilReturn));
    equal = equal && (this.fblnDefault == null ? that.fblnDefault == null : this.fblnDefault.equals(that.fblnDefault));
    equal = equal && (this.fblnFinalReturn == null ? that.fblnFinalReturn == null : this.fblnFinalReturn.equals(that.fblnFinalReturn));
    equal = equal && (this.fblnProvisional == null ? that.fblnProvisional == null : this.fblnProvisional.equals(that.fblnProvisional));
    equal = equal && (this.fcurAmountDue == null ? that.fcurAmountDue == null : this.fcurAmountDue.equals(that.fcurAmountDue));
    equal = equal && (this.fdtmPaymentDueDate == null ? that.fdtmPaymentDueDate == null : this.fdtmPaymentDueDate.equals(that.fdtmPaymentDueDate));
    equal = equal && (this.fdtmPaymentDueDateExtended == null ? that.fdtmPaymentDueDateExtended == null : this.fdtmPaymentDueDateExtended.equals(that.fdtmPaymentDueDateExtended));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    equal = equal && (this.fblnOriginallyConverted == null ? that.fblnOriginallyConverted == null : this.fblnOriginallyConverted.equals(that.fblnOriginallyConverted));
    equal = equal && (this.fcurCreditTransferAmount == null ? that.fcurCreditTransferAmount == null : this.fcurCreditTransferAmount.equals(that.fcurCreditTransferAmount));
    equal = equal && (this.fdtmThirtyDaysToPay == null ? that.fdtmThirtyDaysToPay == null : this.fdtmThirtyDaysToPay.equals(that.fdtmThirtyDaysToPay));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnattributes)) {
      return false;
    }
    tblnz_rtnattributes that = (tblnz_rtnattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngWebReqKey == null ? that.flngWebReqKey == null : this.flngWebReqKey.equals(that.flngWebReqKey));
    equal = equal && (this.fstrFilingFrequency == null ? that.fstrFilingFrequency == null : this.fstrFilingFrequency.equals(that.fstrFilingFrequency));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fstrWebLogonID == null ? that.fstrWebLogonID == null : this.fstrWebLogonID.equals(that.fstrWebLogonID));
    equal = equal && (this.fstrFormTypeFiled == null ? that.fstrFormTypeFiled == null : this.fstrFormTypeFiled.equals(that.fstrFormTypeFiled));
    equal = equal && (this.fstrFormTypeExpected == null ? that.fstrFormTypeExpected == null : this.fstrFormTypeExpected.equals(that.fstrFormTypeExpected));
    equal = equal && (this.fstrIPAddress == null ? that.fstrIPAddress == null : this.fstrIPAddress.equals(that.fstrIPAddress));
    equal = equal && (this.fstrVendorID == null ? that.fstrVendorID == null : this.fstrVendorID.equals(that.fstrVendorID));
    equal = equal && (this.fstrSoftwareProvider == null ? that.fstrSoftwareProvider == null : this.fstrSoftwareProvider.equals(that.fstrSoftwareProvider));
    equal = equal && (this.fstrSoftwarePlatform == null ? that.fstrSoftwarePlatform == null : this.fstrSoftwarePlatform.equals(that.fstrSoftwarePlatform));
    equal = equal && (this.fstrSoftwareRelease == null ? that.fstrSoftwareRelease == null : this.fstrSoftwareRelease.equals(that.fstrSoftwareRelease));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmCeaseDate == null ? that.fdtmCeaseDate == null : this.fdtmCeaseDate.equals(that.fdtmCeaseDate));
    equal = equal && (this.fstrCeaseExplanation == null ? that.fstrCeaseExplanation == null : this.fstrCeaseExplanation.equals(that.fstrCeaseExplanation));
    equal = equal && (this.fblnAmended == null ? that.fblnAmended == null : this.fblnAmended.equals(that.fblnAmended));
    equal = equal && (this.fstrAmendReason == null ? that.fstrAmendReason == null : this.fstrAmendReason.equals(that.fstrAmendReason));
    equal = equal && (this.fstrAmendText == null ? that.fstrAmendText == null : this.fstrAmendText.equals(that.fstrAmendText));
    equal = equal && (this.fblnAudited == null ? that.fblnAudited == null : this.fblnAudited.equals(that.fblnAudited));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fblnFuturePeriod == null ? that.fblnFuturePeriod == null : this.fblnFuturePeriod.equals(that.fblnFuturePeriod));
    equal = equal && (this.fblnDiscovery == null ? that.fblnDiscovery == null : this.fblnDiscovery.equals(that.fblnDiscovery));
    equal = equal && (this.fblnNilReturn == null ? that.fblnNilReturn == null : this.fblnNilReturn.equals(that.fblnNilReturn));
    equal = equal && (this.fblnDefault == null ? that.fblnDefault == null : this.fblnDefault.equals(that.fblnDefault));
    equal = equal && (this.fblnFinalReturn == null ? that.fblnFinalReturn == null : this.fblnFinalReturn.equals(that.fblnFinalReturn));
    equal = equal && (this.fblnProvisional == null ? that.fblnProvisional == null : this.fblnProvisional.equals(that.fblnProvisional));
    equal = equal && (this.fcurAmountDue == null ? that.fcurAmountDue == null : this.fcurAmountDue.equals(that.fcurAmountDue));
    equal = equal && (this.fdtmPaymentDueDate == null ? that.fdtmPaymentDueDate == null : this.fdtmPaymentDueDate.equals(that.fdtmPaymentDueDate));
    equal = equal && (this.fdtmPaymentDueDateExtended == null ? that.fdtmPaymentDueDateExtended == null : this.fdtmPaymentDueDateExtended.equals(that.fdtmPaymentDueDateExtended));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    equal = equal && (this.fblnOriginallyConverted == null ? that.fblnOriginallyConverted == null : this.fblnOriginallyConverted.equals(that.fblnOriginallyConverted));
    equal = equal && (this.fcurCreditTransferAmount == null ? that.fcurCreditTransferAmount == null : this.fcurCreditTransferAmount.equals(that.fcurCreditTransferAmount));
    equal = equal && (this.fdtmThirtyDaysToPay == null ? that.fdtmThirtyDaysToPay == null : this.fdtmThirtyDaysToPay.equals(that.fdtmThirtyDaysToPay));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngWebReqKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrFilingFrequency = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrWebLogonID = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFormTypeFiled = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrFormTypeExpected = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrIPAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrVendorID = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrSoftwareProvider = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrSoftwarePlatform = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrSoftwareRelease = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmCeaseDate = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrCeaseExplanation = JdbcWritableBridge.readString(17, __dbResults);
    this.fblnAmended = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrAmendReason = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrAmendText = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnAudited = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnFuturePeriod = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnDiscovery = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnNilReturn = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fblnDefault = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnFinalReturn = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnProvisional = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fcurAmountDue = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fdtmPaymentDueDate = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.fdtmPaymentDueDateExtended = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fblnOriginallyConverted = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fcurCreditTransferAmount = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fdtmThirtyDaysToPay = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(36, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(37, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngWebReqKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrFilingFrequency = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrWebLogonID = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFormTypeFiled = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrFormTypeExpected = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrIPAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrVendorID = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrSoftwareProvider = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrSoftwarePlatform = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrSoftwareRelease = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmCeaseDate = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrCeaseExplanation = JdbcWritableBridge.readString(17, __dbResults);
    this.fblnAmended = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrAmendReason = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrAmendText = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnAudited = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnFuturePeriod = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnDiscovery = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnNilReturn = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fblnDefault = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnFinalReturn = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnProvisional = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fcurAmountDue = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fdtmPaymentDueDate = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.fdtmPaymentDueDateExtended = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fblnOriginallyConverted = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fcurCreditTransferAmount = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fdtmThirtyDaysToPay = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(36, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(37, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWebReqKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFrequency, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonID, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeFiled, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeExpected, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIPAddress, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorID, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareProvider, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwarePlatform, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareRelease, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCeaseDate, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseExplanation, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAmended, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrAmendReason, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAmendText, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAudited, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFuturePeriod, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDiscovery, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNilReturn, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefault, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinalReturn, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProvisional, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountDue, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentDueDate, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentDueDateExtended, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOriginallyConverted, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditTransferAmount, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmThirtyDaysToPay, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 37 + __off, 93, __dbStmt);
    return 37;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWebReqKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFrequency, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonID, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeFiled, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeExpected, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIPAddress, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorID, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareProvider, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwarePlatform, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareRelease, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCeaseDate, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseExplanation, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAmended, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrAmendReason, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAmendText, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAudited, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFuturePeriod, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDiscovery, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNilReturn, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefault, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinalReturn, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProvisional, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountDue, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentDueDate, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentDueDateExtended, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOriginallyConverted, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditTransferAmount, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmThirtyDaysToPay, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 37 + __off, 93, __dbStmt);
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
        this.flngWebReqKey = null;
    } else {
    this.flngWebReqKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingFrequency = null;
    } else {
    this.fstrFilingFrequency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceType = null;
    } else {
    this.fstrSourceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWebLogonID = null;
    } else {
    this.fstrWebLogonID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormTypeFiled = null;
    } else {
    this.fstrFormTypeFiled = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormTypeExpected = null;
    } else {
    this.fstrFormTypeExpected = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIPAddress = null;
    } else {
    this.fstrIPAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVendorID = null;
    } else {
    this.fstrVendorID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoftwareProvider = null;
    } else {
    this.fstrSoftwareProvider = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoftwarePlatform = null;
    } else {
    this.fstrSoftwarePlatform = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoftwareRelease = null;
    } else {
    this.fstrSoftwareRelease = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDLN = null;
    } else {
    this.fstrDLN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCeaseDate = null;
    } else {
    this.fdtmCeaseDate = new Timestamp(__dataIn.readLong());
    this.fdtmCeaseDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCeaseExplanation = null;
    } else {
    this.fstrCeaseExplanation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAmended = null;
    } else {
    this.fblnAmended = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAmendReason = null;
    } else {
    this.fstrAmendReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAmendText = null;
    } else {
    this.fstrAmendText = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAudited = null;
    } else {
    this.fblnAudited = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCorrespondence = null;
    } else {
    this.fblnCorrespondence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFuturePeriod = null;
    } else {
    this.fblnFuturePeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDiscovery = null;
    } else {
    this.fblnDiscovery = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNilReturn = null;
    } else {
    this.fblnNilReturn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDefault = null;
    } else {
    this.fblnDefault = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFinalReturn = null;
    } else {
    this.fblnFinalReturn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProvisional = null;
    } else {
    this.fblnProvisional = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountDue = null;
    } else {
    this.fcurAmountDue = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPaymentDueDate = null;
    } else {
    this.fdtmPaymentDueDate = new Timestamp(__dataIn.readLong());
    this.fdtmPaymentDueDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPaymentDueDateExtended = null;
    } else {
    this.fdtmPaymentDueDateExtended = new Timestamp(__dataIn.readLong());
    this.fdtmPaymentDueDateExtended.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnConverted = null;
    } else {
    this.fblnConverted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOriginallyConverted = null;
    } else {
    this.fblnOriginallyConverted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditTransferAmount = null;
    } else {
    this.fcurCreditTransferAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmThirtyDaysToPay = null;
    } else {
    this.fdtmThirtyDaysToPay = new Timestamp(__dataIn.readLong());
    this.fdtmThirtyDaysToPay.setNanos(__dataIn.readInt());
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
    if (null == this.flngWebReqKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWebReqKey);
    }
    if (null == this.fstrFilingFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFrequency);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fstrWebLogonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonID);
    }
    if (null == this.fstrFormTypeFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeFiled);
    }
    if (null == this.fstrFormTypeExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeExpected);
    }
    if (null == this.fstrIPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIPAddress);
    }
    if (null == this.fstrVendorID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorID);
    }
    if (null == this.fstrSoftwareProvider) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareProvider);
    }
    if (null == this.fstrSoftwarePlatform) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwarePlatform);
    }
    if (null == this.fstrSoftwareRelease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareRelease);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fdtmCeaseDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCeaseDate.getTime());
    __dataOut.writeInt(this.fdtmCeaseDate.getNanos());
    }
    if (null == this.fstrCeaseExplanation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseExplanation);
    }
    if (null == this.fblnAmended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAmended);
    }
    if (null == this.fstrAmendReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAmendReason);
    }
    if (null == this.fstrAmendText) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAmendText);
    }
    if (null == this.fblnAudited) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAudited);
    }
    if (null == this.fblnCorrespondence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorrespondence);
    }
    if (null == this.fblnFuturePeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFuturePeriod);
    }
    if (null == this.fblnDiscovery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDiscovery);
    }
    if (null == this.fblnNilReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNilReturn);
    }
    if (null == this.fblnDefault) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefault);
    }
    if (null == this.fblnFinalReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinalReturn);
    }
    if (null == this.fblnProvisional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProvisional);
    }
    if (null == this.fcurAmountDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountDue, __dataOut);
    }
    if (null == this.fdtmPaymentDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentDueDate.getTime());
    __dataOut.writeInt(this.fdtmPaymentDueDate.getNanos());
    }
    if (null == this.fdtmPaymentDueDateExtended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentDueDateExtended.getTime());
    __dataOut.writeInt(this.fdtmPaymentDueDateExtended.getNanos());
    }
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
    }
    if (null == this.fblnOriginallyConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOriginallyConverted);
    }
    if (null == this.fcurCreditTransferAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditTransferAmount, __dataOut);
    }
    if (null == this.fdtmThirtyDaysToPay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmThirtyDaysToPay.getTime());
    __dataOut.writeInt(this.fdtmThirtyDaysToPay.getNanos());
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
    if (null == this.flngWebReqKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWebReqKey);
    }
    if (null == this.fstrFilingFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFrequency);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fstrWebLogonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonID);
    }
    if (null == this.fstrFormTypeFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeFiled);
    }
    if (null == this.fstrFormTypeExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeExpected);
    }
    if (null == this.fstrIPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIPAddress);
    }
    if (null == this.fstrVendorID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorID);
    }
    if (null == this.fstrSoftwareProvider) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareProvider);
    }
    if (null == this.fstrSoftwarePlatform) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwarePlatform);
    }
    if (null == this.fstrSoftwareRelease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareRelease);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fdtmCeaseDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCeaseDate.getTime());
    __dataOut.writeInt(this.fdtmCeaseDate.getNanos());
    }
    if (null == this.fstrCeaseExplanation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseExplanation);
    }
    if (null == this.fblnAmended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAmended);
    }
    if (null == this.fstrAmendReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAmendReason);
    }
    if (null == this.fstrAmendText) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAmendText);
    }
    if (null == this.fblnAudited) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAudited);
    }
    if (null == this.fblnCorrespondence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorrespondence);
    }
    if (null == this.fblnFuturePeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFuturePeriod);
    }
    if (null == this.fblnDiscovery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDiscovery);
    }
    if (null == this.fblnNilReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNilReturn);
    }
    if (null == this.fblnDefault) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefault);
    }
    if (null == this.fblnFinalReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinalReturn);
    }
    if (null == this.fblnProvisional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProvisional);
    }
    if (null == this.fcurAmountDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountDue, __dataOut);
    }
    if (null == this.fdtmPaymentDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentDueDate.getTime());
    __dataOut.writeInt(this.fdtmPaymentDueDate.getNanos());
    }
    if (null == this.fdtmPaymentDueDateExtended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentDueDateExtended.getTime());
    __dataOut.writeInt(this.fdtmPaymentDueDateExtended.getNanos());
    }
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
    }
    if (null == this.fblnOriginallyConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOriginallyConverted);
    }
    if (null == this.fcurCreditTransferAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditTransferAmount, __dataOut);
    }
    if (null == this.fdtmThirtyDaysToPay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmThirtyDaysToPay.getTime());
    __dataOut.writeInt(this.fdtmThirtyDaysToPay.getNanos());
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
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWebReqKey==null?"\\N":"" + flngWebReqKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrFilingFrequency==null?"\\N":fstrFilingFrequency, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrSourceType==null?"\\N":fstrSourceType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrWebLogonID==null?"\\N":fstrWebLogonID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrFormTypeFiled==null?"\\N":fstrFormTypeFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrFormTypeExpected==null?"\\N":fstrFormTypeExpected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrIPAddress==null?"\\N":fstrIPAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrVendorID==null?"\\N":fstrVendorID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrSoftwareProvider==null?"\\N":fstrSoftwareProvider, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrSoftwarePlatform==null?"\\N":fstrSoftwarePlatform, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrSoftwareRelease==null?"\\N":fstrSoftwareRelease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrDLN==null?"\\N":fstrDLN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCeaseDate==null?"\\N":"" + fdtmCeaseDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrCeaseExplanation==null?"\\N":fstrCeaseExplanation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAmended==null?"\\N":"" + fblnAmended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrAmendReason==null?"\\N":fstrAmendReason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrAmendText==null?"\\N":fstrAmendText, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAudited==null?"\\N":"" + fblnAudited, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFuturePeriod==null?"\\N":"" + fblnFuturePeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDiscovery==null?"\\N":"" + fblnDiscovery, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNilReturn==null?"\\N":"" + fblnNilReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefault==null?"\\N":"" + fblnDefault, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinalReturn==null?"\\N":"" + fblnFinalReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProvisional==null?"\\N":"" + fblnProvisional, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountDue==null?"\\N":fcurAmountDue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentDueDate==null?"\\N":"" + fdtmPaymentDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentDueDateExtended==null?"\\N":"" + fdtmPaymentDueDateExtended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOriginallyConverted==null?"\\N":"" + fblnOriginallyConverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditTransferAmount==null?"\\N":fcurCreditTransferAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmThirtyDaysToPay==null?"\\N":"" + fdtmThirtyDaysToPay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrWho==null?"\\N":fstrWho, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWebReqKey==null?"\\N":"" + flngWebReqKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrFilingFrequency==null?"\\N":fstrFilingFrequency, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrSourceType==null?"\\N":fstrSourceType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrWebLogonID==null?"\\N":fstrWebLogonID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrFormTypeFiled==null?"\\N":fstrFormTypeFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrFormTypeExpected==null?"\\N":fstrFormTypeExpected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrIPAddress==null?"\\N":fstrIPAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrVendorID==null?"\\N":fstrVendorID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrSoftwareProvider==null?"\\N":fstrSoftwareProvider, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrSoftwarePlatform==null?"\\N":fstrSoftwarePlatform, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrSoftwareRelease==null?"\\N":fstrSoftwareRelease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrDLN==null?"\\N":fstrDLN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCeaseDate==null?"\\N":"" + fdtmCeaseDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrCeaseExplanation==null?"\\N":fstrCeaseExplanation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAmended==null?"\\N":"" + fblnAmended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrAmendReason==null?"\\N":fstrAmendReason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrAmendText==null?"\\N":fstrAmendText, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAudited==null?"\\N":"" + fblnAudited, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFuturePeriod==null?"\\N":"" + fblnFuturePeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDiscovery==null?"\\N":"" + fblnDiscovery, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNilReturn==null?"\\N":"" + fblnNilReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefault==null?"\\N":"" + fblnDefault, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinalReturn==null?"\\N":"" + fblnFinalReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProvisional==null?"\\N":"" + fblnProvisional, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountDue==null?"\\N":fcurAmountDue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentDueDate==null?"\\N":"" + fdtmPaymentDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentDueDateExtended==null?"\\N":"" + fdtmPaymentDueDateExtended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOriginallyConverted==null?"\\N":"" + fblnOriginallyConverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditTransferAmount==null?"\\N":fcurCreditTransferAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmThirtyDaysToPay==null?"\\N":"" + fdtmThirtyDaysToPay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fstrWho==null?"\\N":fstrWho, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWebReqKey = null; } else {
      this.flngWebReqKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFrequency = null; } else {
      this.fstrFilingFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWebLogonID = null; } else {
      this.fstrWebLogonID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeFiled = null; } else {
      this.fstrFormTypeFiled = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeExpected = null; } else {
      this.fstrFormTypeExpected = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIPAddress = null; } else {
      this.fstrIPAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVendorID = null; } else {
      this.fstrVendorID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwareProvider = null; } else {
      this.fstrSoftwareProvider = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwarePlatform = null; } else {
      this.fstrSoftwarePlatform = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwareRelease = null; } else {
      this.fstrSoftwareRelease = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCeaseDate = null; } else {
      this.fdtmCeaseDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseExplanation = null; } else {
      this.fstrCeaseExplanation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAmended = null; } else {
      this.fblnAmended = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAmendReason = null; } else {
      this.fstrAmendReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAmendText = null; } else {
      this.fstrAmendText = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAudited = null; } else {
      this.fblnAudited = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCorrespondence = null; } else {
      this.fblnCorrespondence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFuturePeriod = null; } else {
      this.fblnFuturePeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDiscovery = null; } else {
      this.fblnDiscovery = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNilReturn = null; } else {
      this.fblnNilReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefault = null; } else {
      this.fblnDefault = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFinalReturn = null; } else {
      this.fblnFinalReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProvisional = null; } else {
      this.fblnProvisional = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountDue = null; } else {
      this.fcurAmountDue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentDueDate = null; } else {
      this.fdtmPaymentDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentDueDateExtended = null; } else {
      this.fdtmPaymentDueDateExtended = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOriginallyConverted = null; } else {
      this.fblnOriginallyConverted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditTransferAmount = null; } else {
      this.fcurCreditTransferAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmThirtyDaysToPay = null; } else {
      this.fdtmThirtyDaysToPay = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWebReqKey = null; } else {
      this.flngWebReqKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFrequency = null; } else {
      this.fstrFilingFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWebLogonID = null; } else {
      this.fstrWebLogonID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeFiled = null; } else {
      this.fstrFormTypeFiled = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeExpected = null; } else {
      this.fstrFormTypeExpected = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIPAddress = null; } else {
      this.fstrIPAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVendorID = null; } else {
      this.fstrVendorID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwareProvider = null; } else {
      this.fstrSoftwareProvider = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwarePlatform = null; } else {
      this.fstrSoftwarePlatform = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwareRelease = null; } else {
      this.fstrSoftwareRelease = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCeaseDate = null; } else {
      this.fdtmCeaseDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseExplanation = null; } else {
      this.fstrCeaseExplanation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAmended = null; } else {
      this.fblnAmended = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAmendReason = null; } else {
      this.fstrAmendReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAmendText = null; } else {
      this.fstrAmendText = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAudited = null; } else {
      this.fblnAudited = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCorrespondence = null; } else {
      this.fblnCorrespondence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFuturePeriod = null; } else {
      this.fblnFuturePeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDiscovery = null; } else {
      this.fblnDiscovery = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNilReturn = null; } else {
      this.fblnNilReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefault = null; } else {
      this.fblnDefault = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFinalReturn = null; } else {
      this.fblnFinalReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProvisional = null; } else {
      this.fblnProvisional = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountDue = null; } else {
      this.fcurAmountDue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentDueDate = null; } else {
      this.fdtmPaymentDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentDueDateExtended = null; } else {
      this.fdtmPaymentDueDateExtended = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOriginallyConverted = null; } else {
      this.fblnOriginallyConverted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditTransferAmount = null; } else {
      this.fcurCreditTransferAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmThirtyDaysToPay = null; } else {
      this.fdtmThirtyDaysToPay = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_rtnattributes o = (tblnz_rtnattributes) super.clone();
    o.fdtmCeaseDate = (o.fdtmCeaseDate != null) ? (java.sql.Timestamp) o.fdtmCeaseDate.clone() : null;
    o.fdtmPaymentDueDate = (o.fdtmPaymentDueDate != null) ? (java.sql.Timestamp) o.fdtmPaymentDueDate.clone() : null;
    o.fdtmPaymentDueDateExtended = (o.fdtmPaymentDueDateExtended != null) ? (java.sql.Timestamp) o.fdtmPaymentDueDateExtended.clone() : null;
    o.fdtmThirtyDaysToPay = (o.fdtmThirtyDaysToPay != null) ? (java.sql.Timestamp) o.fdtmThirtyDaysToPay.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnattributes o) throws CloneNotSupportedException {
    o.fdtmCeaseDate = (o.fdtmCeaseDate != null) ? (java.sql.Timestamp) o.fdtmCeaseDate.clone() : null;
    o.fdtmPaymentDueDate = (o.fdtmPaymentDueDate != null) ? (java.sql.Timestamp) o.fdtmPaymentDueDate.clone() : null;
    o.fdtmPaymentDueDateExtended = (o.fdtmPaymentDueDateExtended != null) ? (java.sql.Timestamp) o.fdtmPaymentDueDateExtended.clone() : null;
    o.fdtmThirtyDaysToPay = (o.fdtmThirtyDaysToPay != null) ? (java.sql.Timestamp) o.fdtmThirtyDaysToPay.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngWebReqKey", this.flngWebReqKey);
    __sqoop$field_map.put("fstrFilingFrequency", this.fstrFilingFrequency);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fstrWebLogonID", this.fstrWebLogonID);
    __sqoop$field_map.put("fstrFormTypeFiled", this.fstrFormTypeFiled);
    __sqoop$field_map.put("fstrFormTypeExpected", this.fstrFormTypeExpected);
    __sqoop$field_map.put("fstrIPAddress", this.fstrIPAddress);
    __sqoop$field_map.put("fstrVendorID", this.fstrVendorID);
    __sqoop$field_map.put("fstrSoftwareProvider", this.fstrSoftwareProvider);
    __sqoop$field_map.put("fstrSoftwarePlatform", this.fstrSoftwarePlatform);
    __sqoop$field_map.put("fstrSoftwareRelease", this.fstrSoftwareRelease);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmCeaseDate", this.fdtmCeaseDate);
    __sqoop$field_map.put("fstrCeaseExplanation", this.fstrCeaseExplanation);
    __sqoop$field_map.put("fblnAmended", this.fblnAmended);
    __sqoop$field_map.put("fstrAmendReason", this.fstrAmendReason);
    __sqoop$field_map.put("fstrAmendText", this.fstrAmendText);
    __sqoop$field_map.put("fblnAudited", this.fblnAudited);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fblnFuturePeriod", this.fblnFuturePeriod);
    __sqoop$field_map.put("fblnDiscovery", this.fblnDiscovery);
    __sqoop$field_map.put("fblnNilReturn", this.fblnNilReturn);
    __sqoop$field_map.put("fblnDefault", this.fblnDefault);
    __sqoop$field_map.put("fblnFinalReturn", this.fblnFinalReturn);
    __sqoop$field_map.put("fblnProvisional", this.fblnProvisional);
    __sqoop$field_map.put("fcurAmountDue", this.fcurAmountDue);
    __sqoop$field_map.put("fdtmPaymentDueDate", this.fdtmPaymentDueDate);
    __sqoop$field_map.put("fdtmPaymentDueDateExtended", this.fdtmPaymentDueDateExtended);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
    __sqoop$field_map.put("fblnOriginallyConverted", this.fblnOriginallyConverted);
    __sqoop$field_map.put("fcurCreditTransferAmount", this.fcurCreditTransferAmount);
    __sqoop$field_map.put("fdtmThirtyDaysToPay", this.fdtmThirtyDaysToPay);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngWebReqKey", this.flngWebReqKey);
    __sqoop$field_map.put("fstrFilingFrequency", this.fstrFilingFrequency);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fstrWebLogonID", this.fstrWebLogonID);
    __sqoop$field_map.put("fstrFormTypeFiled", this.fstrFormTypeFiled);
    __sqoop$field_map.put("fstrFormTypeExpected", this.fstrFormTypeExpected);
    __sqoop$field_map.put("fstrIPAddress", this.fstrIPAddress);
    __sqoop$field_map.put("fstrVendorID", this.fstrVendorID);
    __sqoop$field_map.put("fstrSoftwareProvider", this.fstrSoftwareProvider);
    __sqoop$field_map.put("fstrSoftwarePlatform", this.fstrSoftwarePlatform);
    __sqoop$field_map.put("fstrSoftwareRelease", this.fstrSoftwareRelease);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmCeaseDate", this.fdtmCeaseDate);
    __sqoop$field_map.put("fstrCeaseExplanation", this.fstrCeaseExplanation);
    __sqoop$field_map.put("fblnAmended", this.fblnAmended);
    __sqoop$field_map.put("fstrAmendReason", this.fstrAmendReason);
    __sqoop$field_map.put("fstrAmendText", this.fstrAmendText);
    __sqoop$field_map.put("fblnAudited", this.fblnAudited);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fblnFuturePeriod", this.fblnFuturePeriod);
    __sqoop$field_map.put("fblnDiscovery", this.fblnDiscovery);
    __sqoop$field_map.put("fblnNilReturn", this.fblnNilReturn);
    __sqoop$field_map.put("fblnDefault", this.fblnDefault);
    __sqoop$field_map.put("fblnFinalReturn", this.fblnFinalReturn);
    __sqoop$field_map.put("fblnProvisional", this.fblnProvisional);
    __sqoop$field_map.put("fcurAmountDue", this.fcurAmountDue);
    __sqoop$field_map.put("fdtmPaymentDueDate", this.fdtmPaymentDueDate);
    __sqoop$field_map.put("fdtmPaymentDueDateExtended", this.fdtmPaymentDueDateExtended);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
    __sqoop$field_map.put("fblnOriginallyConverted", this.fblnOriginallyConverted);
    __sqoop$field_map.put("fcurCreditTransferAmount", this.fcurCreditTransferAmount);
    __sqoop$field_map.put("fdtmThirtyDaysToPay", this.fdtmThirtyDaysToPay);
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
