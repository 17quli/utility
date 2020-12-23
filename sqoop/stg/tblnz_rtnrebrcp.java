// ORM class for table 'tblnz_rtnrebrcp'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:56:03 NZDT 2020
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

public class tblnz_rtnrebrcp extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fintSeq = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("fcurReceiptAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fcurReceiptAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurApprovedAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fcurApprovedAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmReceiptDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fdtmReceiptDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrDonationType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrDonationType = (String)value;
      }
    });
    setters.put("fstrOrganisationName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOrganisationName = (String)value;
      }
    });
    setters.put("fstrOrganisationIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOrganisationIRD = (String)value;
      }
    });
    setters.put("fstrOrganisationCharityNum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOrganisationCharityNum = (String)value;
      }
    });
    setters.put("fstrPartnerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrPartnerIRD = (String)value;
      }
    });
    setters.put("flngPartnerCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.flngPartnerCustomerKey = (Integer)value;
      }
    });
    setters.put("fcurPartnerAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fcurPartnerAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrRejectedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrRejectedWho = (String)value;
      }
    });
    setters.put("flngWebReqKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.flngWebReqKey = (Integer)value;
      }
    });
    setters.put("fblnTaxAgentClaim", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fblnTaxAgentClaim = (Integer)value;
      }
    });
    setters.put("fstrAuditRejectionRating", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrAuditRejectionRating = (String)value;
      }
    });
    setters.put("fstrRejectionReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrRejectionReason = (String)value;
      }
    });
    setters.put("fstrOtherRejectionReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOtherRejectionReason = (String)value;
      }
    });
    setters.put("flngOCRPage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.flngOCRPage = (Integer)value;
      }
    });
    setters.put("fstrOCRSourceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRSourceType = (String)value;
      }
    });
    setters.put("flngOCRSourceKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.flngOCRSourceKey = (Integer)value;
      }
    });
    setters.put("fstrOCRStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRStatus = (String)value;
      }
    });
    setters.put("fstrOCRText", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRText = (String)value;
      }
    });
    setters.put("fblnOCRKeyerConfirm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fblnOCRKeyerConfirm = (Integer)value;
      }
    });
    setters.put("fblnOCRDonee", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fblnOCRDonee = (Integer)value;
      }
    });
    setters.put("fstrOCRReceiptID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRReceiptID = (String)value;
      }
    });
    setters.put("fstrOCRAddressName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRAddressName = (String)value;
      }
    });
    setters.put("fstrOCRAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRAddress = (String)value;
      }
    });
    setters.put("fstrOCREmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCREmail = (String)value;
      }
    });
    setters.put("fstrOCRWebSite", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRWebSite = (String)value;
      }
    });
    setters.put("fstrOCRCharityNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRCharityNumber = (String)value;
      }
    });
    setters.put("fstrOCRName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRName = (String)value;
      }
    });
    setters.put("fstrOCRIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRIRD = (String)value;
      }
    });
    setters.put("fcurOCRReceiptAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fcurOCRReceiptAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmOCRReceiptDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fdtmOCRReceiptDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrOCRType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrOCRType = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrebrcp.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnrebrcp() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnrebrcp with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tblnz_rtnrebrcp with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_rtnrebrcp with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tblnz_rtnrebrcp with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private java.math.BigDecimal fcurReceiptAmount;
  public java.math.BigDecimal get_fcurReceiptAmount() {
    return fcurReceiptAmount;
  }
  public void set_fcurReceiptAmount(java.math.BigDecimal fcurReceiptAmount) {
    this.fcurReceiptAmount = fcurReceiptAmount;
  }
  public tblnz_rtnrebrcp with_fcurReceiptAmount(java.math.BigDecimal fcurReceiptAmount) {
    this.fcurReceiptAmount = fcurReceiptAmount;
    return this;
  }
  private java.math.BigDecimal fcurApprovedAmount;
  public java.math.BigDecimal get_fcurApprovedAmount() {
    return fcurApprovedAmount;
  }
  public void set_fcurApprovedAmount(java.math.BigDecimal fcurApprovedAmount) {
    this.fcurApprovedAmount = fcurApprovedAmount;
  }
  public tblnz_rtnrebrcp with_fcurApprovedAmount(java.math.BigDecimal fcurApprovedAmount) {
    this.fcurApprovedAmount = fcurApprovedAmount;
    return this;
  }
  private java.sql.Timestamp fdtmReceiptDate;
  public java.sql.Timestamp get_fdtmReceiptDate() {
    return fdtmReceiptDate;
  }
  public void set_fdtmReceiptDate(java.sql.Timestamp fdtmReceiptDate) {
    this.fdtmReceiptDate = fdtmReceiptDate;
  }
  public tblnz_rtnrebrcp with_fdtmReceiptDate(java.sql.Timestamp fdtmReceiptDate) {
    this.fdtmReceiptDate = fdtmReceiptDate;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_rtnrebrcp with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrDonationType;
  public String get_fstrDonationType() {
    return fstrDonationType;
  }
  public void set_fstrDonationType(String fstrDonationType) {
    this.fstrDonationType = fstrDonationType;
  }
  public tblnz_rtnrebrcp with_fstrDonationType(String fstrDonationType) {
    this.fstrDonationType = fstrDonationType;
    return this;
  }
  private String fstrOrganisationName;
  public String get_fstrOrganisationName() {
    return fstrOrganisationName;
  }
  public void set_fstrOrganisationName(String fstrOrganisationName) {
    this.fstrOrganisationName = fstrOrganisationName;
  }
  public tblnz_rtnrebrcp with_fstrOrganisationName(String fstrOrganisationName) {
    this.fstrOrganisationName = fstrOrganisationName;
    return this;
  }
  private String fstrOrganisationIRD;
  public String get_fstrOrganisationIRD() {
    return fstrOrganisationIRD;
  }
  public void set_fstrOrganisationIRD(String fstrOrganisationIRD) {
    this.fstrOrganisationIRD = fstrOrganisationIRD;
  }
  public tblnz_rtnrebrcp with_fstrOrganisationIRD(String fstrOrganisationIRD) {
    this.fstrOrganisationIRD = fstrOrganisationIRD;
    return this;
  }
  private String fstrOrganisationCharityNum;
  public String get_fstrOrganisationCharityNum() {
    return fstrOrganisationCharityNum;
  }
  public void set_fstrOrganisationCharityNum(String fstrOrganisationCharityNum) {
    this.fstrOrganisationCharityNum = fstrOrganisationCharityNum;
  }
  public tblnz_rtnrebrcp with_fstrOrganisationCharityNum(String fstrOrganisationCharityNum) {
    this.fstrOrganisationCharityNum = fstrOrganisationCharityNum;
    return this;
  }
  private String fstrPartnerIRD;
  public String get_fstrPartnerIRD() {
    return fstrPartnerIRD;
  }
  public void set_fstrPartnerIRD(String fstrPartnerIRD) {
    this.fstrPartnerIRD = fstrPartnerIRD;
  }
  public tblnz_rtnrebrcp with_fstrPartnerIRD(String fstrPartnerIRD) {
    this.fstrPartnerIRD = fstrPartnerIRD;
    return this;
  }
  private Integer flngPartnerCustomerKey;
  public Integer get_flngPartnerCustomerKey() {
    return flngPartnerCustomerKey;
  }
  public void set_flngPartnerCustomerKey(Integer flngPartnerCustomerKey) {
    this.flngPartnerCustomerKey = flngPartnerCustomerKey;
  }
  public tblnz_rtnrebrcp with_flngPartnerCustomerKey(Integer flngPartnerCustomerKey) {
    this.flngPartnerCustomerKey = flngPartnerCustomerKey;
    return this;
  }
  private java.math.BigDecimal fcurPartnerAmount;
  public java.math.BigDecimal get_fcurPartnerAmount() {
    return fcurPartnerAmount;
  }
  public void set_fcurPartnerAmount(java.math.BigDecimal fcurPartnerAmount) {
    this.fcurPartnerAmount = fcurPartnerAmount;
  }
  public tblnz_rtnrebrcp with_fcurPartnerAmount(java.math.BigDecimal fcurPartnerAmount) {
    this.fcurPartnerAmount = fcurPartnerAmount;
    return this;
  }
  private String fstrRejectedWho;
  public String get_fstrRejectedWho() {
    return fstrRejectedWho;
  }
  public void set_fstrRejectedWho(String fstrRejectedWho) {
    this.fstrRejectedWho = fstrRejectedWho;
  }
  public tblnz_rtnrebrcp with_fstrRejectedWho(String fstrRejectedWho) {
    this.fstrRejectedWho = fstrRejectedWho;
    return this;
  }
  private Integer flngWebReqKey;
  public Integer get_flngWebReqKey() {
    return flngWebReqKey;
  }
  public void set_flngWebReqKey(Integer flngWebReqKey) {
    this.flngWebReqKey = flngWebReqKey;
  }
  public tblnz_rtnrebrcp with_flngWebReqKey(Integer flngWebReqKey) {
    this.flngWebReqKey = flngWebReqKey;
    return this;
  }
  private Integer fblnTaxAgentClaim;
  public Integer get_fblnTaxAgentClaim() {
    return fblnTaxAgentClaim;
  }
  public void set_fblnTaxAgentClaim(Integer fblnTaxAgentClaim) {
    this.fblnTaxAgentClaim = fblnTaxAgentClaim;
  }
  public tblnz_rtnrebrcp with_fblnTaxAgentClaim(Integer fblnTaxAgentClaim) {
    this.fblnTaxAgentClaim = fblnTaxAgentClaim;
    return this;
  }
  private String fstrAuditRejectionRating;
  public String get_fstrAuditRejectionRating() {
    return fstrAuditRejectionRating;
  }
  public void set_fstrAuditRejectionRating(String fstrAuditRejectionRating) {
    this.fstrAuditRejectionRating = fstrAuditRejectionRating;
  }
  public tblnz_rtnrebrcp with_fstrAuditRejectionRating(String fstrAuditRejectionRating) {
    this.fstrAuditRejectionRating = fstrAuditRejectionRating;
    return this;
  }
  private String fstrRejectionReason;
  public String get_fstrRejectionReason() {
    return fstrRejectionReason;
  }
  public void set_fstrRejectionReason(String fstrRejectionReason) {
    this.fstrRejectionReason = fstrRejectionReason;
  }
  public tblnz_rtnrebrcp with_fstrRejectionReason(String fstrRejectionReason) {
    this.fstrRejectionReason = fstrRejectionReason;
    return this;
  }
  private String fstrOtherRejectionReason;
  public String get_fstrOtherRejectionReason() {
    return fstrOtherRejectionReason;
  }
  public void set_fstrOtherRejectionReason(String fstrOtherRejectionReason) {
    this.fstrOtherRejectionReason = fstrOtherRejectionReason;
  }
  public tblnz_rtnrebrcp with_fstrOtherRejectionReason(String fstrOtherRejectionReason) {
    this.fstrOtherRejectionReason = fstrOtherRejectionReason;
    return this;
  }
  private Integer flngOCRPage;
  public Integer get_flngOCRPage() {
    return flngOCRPage;
  }
  public void set_flngOCRPage(Integer flngOCRPage) {
    this.flngOCRPage = flngOCRPage;
  }
  public tblnz_rtnrebrcp with_flngOCRPage(Integer flngOCRPage) {
    this.flngOCRPage = flngOCRPage;
    return this;
  }
  private String fstrOCRSourceType;
  public String get_fstrOCRSourceType() {
    return fstrOCRSourceType;
  }
  public void set_fstrOCRSourceType(String fstrOCRSourceType) {
    this.fstrOCRSourceType = fstrOCRSourceType;
  }
  public tblnz_rtnrebrcp with_fstrOCRSourceType(String fstrOCRSourceType) {
    this.fstrOCRSourceType = fstrOCRSourceType;
    return this;
  }
  private Integer flngOCRSourceKey;
  public Integer get_flngOCRSourceKey() {
    return flngOCRSourceKey;
  }
  public void set_flngOCRSourceKey(Integer flngOCRSourceKey) {
    this.flngOCRSourceKey = flngOCRSourceKey;
  }
  public tblnz_rtnrebrcp with_flngOCRSourceKey(Integer flngOCRSourceKey) {
    this.flngOCRSourceKey = flngOCRSourceKey;
    return this;
  }
  private String fstrOCRStatus;
  public String get_fstrOCRStatus() {
    return fstrOCRStatus;
  }
  public void set_fstrOCRStatus(String fstrOCRStatus) {
    this.fstrOCRStatus = fstrOCRStatus;
  }
  public tblnz_rtnrebrcp with_fstrOCRStatus(String fstrOCRStatus) {
    this.fstrOCRStatus = fstrOCRStatus;
    return this;
  }
  private String fstrOCRText;
  public String get_fstrOCRText() {
    return fstrOCRText;
  }
  public void set_fstrOCRText(String fstrOCRText) {
    this.fstrOCRText = fstrOCRText;
  }
  public tblnz_rtnrebrcp with_fstrOCRText(String fstrOCRText) {
    this.fstrOCRText = fstrOCRText;
    return this;
  }
  private Integer fblnOCRKeyerConfirm;
  public Integer get_fblnOCRKeyerConfirm() {
    return fblnOCRKeyerConfirm;
  }
  public void set_fblnOCRKeyerConfirm(Integer fblnOCRKeyerConfirm) {
    this.fblnOCRKeyerConfirm = fblnOCRKeyerConfirm;
  }
  public tblnz_rtnrebrcp with_fblnOCRKeyerConfirm(Integer fblnOCRKeyerConfirm) {
    this.fblnOCRKeyerConfirm = fblnOCRKeyerConfirm;
    return this;
  }
  private Integer fblnOCRDonee;
  public Integer get_fblnOCRDonee() {
    return fblnOCRDonee;
  }
  public void set_fblnOCRDonee(Integer fblnOCRDonee) {
    this.fblnOCRDonee = fblnOCRDonee;
  }
  public tblnz_rtnrebrcp with_fblnOCRDonee(Integer fblnOCRDonee) {
    this.fblnOCRDonee = fblnOCRDonee;
    return this;
  }
  private String fstrOCRReceiptID;
  public String get_fstrOCRReceiptID() {
    return fstrOCRReceiptID;
  }
  public void set_fstrOCRReceiptID(String fstrOCRReceiptID) {
    this.fstrOCRReceiptID = fstrOCRReceiptID;
  }
  public tblnz_rtnrebrcp with_fstrOCRReceiptID(String fstrOCRReceiptID) {
    this.fstrOCRReceiptID = fstrOCRReceiptID;
    return this;
  }
  private String fstrOCRAddressName;
  public String get_fstrOCRAddressName() {
    return fstrOCRAddressName;
  }
  public void set_fstrOCRAddressName(String fstrOCRAddressName) {
    this.fstrOCRAddressName = fstrOCRAddressName;
  }
  public tblnz_rtnrebrcp with_fstrOCRAddressName(String fstrOCRAddressName) {
    this.fstrOCRAddressName = fstrOCRAddressName;
    return this;
  }
  private String fstrOCRAddress;
  public String get_fstrOCRAddress() {
    return fstrOCRAddress;
  }
  public void set_fstrOCRAddress(String fstrOCRAddress) {
    this.fstrOCRAddress = fstrOCRAddress;
  }
  public tblnz_rtnrebrcp with_fstrOCRAddress(String fstrOCRAddress) {
    this.fstrOCRAddress = fstrOCRAddress;
    return this;
  }
  private String fstrOCREmail;
  public String get_fstrOCREmail() {
    return fstrOCREmail;
  }
  public void set_fstrOCREmail(String fstrOCREmail) {
    this.fstrOCREmail = fstrOCREmail;
  }
  public tblnz_rtnrebrcp with_fstrOCREmail(String fstrOCREmail) {
    this.fstrOCREmail = fstrOCREmail;
    return this;
  }
  private String fstrOCRWebSite;
  public String get_fstrOCRWebSite() {
    return fstrOCRWebSite;
  }
  public void set_fstrOCRWebSite(String fstrOCRWebSite) {
    this.fstrOCRWebSite = fstrOCRWebSite;
  }
  public tblnz_rtnrebrcp with_fstrOCRWebSite(String fstrOCRWebSite) {
    this.fstrOCRWebSite = fstrOCRWebSite;
    return this;
  }
  private String fstrOCRCharityNumber;
  public String get_fstrOCRCharityNumber() {
    return fstrOCRCharityNumber;
  }
  public void set_fstrOCRCharityNumber(String fstrOCRCharityNumber) {
    this.fstrOCRCharityNumber = fstrOCRCharityNumber;
  }
  public tblnz_rtnrebrcp with_fstrOCRCharityNumber(String fstrOCRCharityNumber) {
    this.fstrOCRCharityNumber = fstrOCRCharityNumber;
    return this;
  }
  private String fstrOCRName;
  public String get_fstrOCRName() {
    return fstrOCRName;
  }
  public void set_fstrOCRName(String fstrOCRName) {
    this.fstrOCRName = fstrOCRName;
  }
  public tblnz_rtnrebrcp with_fstrOCRName(String fstrOCRName) {
    this.fstrOCRName = fstrOCRName;
    return this;
  }
  private String fstrOCRIRD;
  public String get_fstrOCRIRD() {
    return fstrOCRIRD;
  }
  public void set_fstrOCRIRD(String fstrOCRIRD) {
    this.fstrOCRIRD = fstrOCRIRD;
  }
  public tblnz_rtnrebrcp with_fstrOCRIRD(String fstrOCRIRD) {
    this.fstrOCRIRD = fstrOCRIRD;
    return this;
  }
  private java.math.BigDecimal fcurOCRReceiptAmount;
  public java.math.BigDecimal get_fcurOCRReceiptAmount() {
    return fcurOCRReceiptAmount;
  }
  public void set_fcurOCRReceiptAmount(java.math.BigDecimal fcurOCRReceiptAmount) {
    this.fcurOCRReceiptAmount = fcurOCRReceiptAmount;
  }
  public tblnz_rtnrebrcp with_fcurOCRReceiptAmount(java.math.BigDecimal fcurOCRReceiptAmount) {
    this.fcurOCRReceiptAmount = fcurOCRReceiptAmount;
    return this;
  }
  private java.sql.Timestamp fdtmOCRReceiptDate;
  public java.sql.Timestamp get_fdtmOCRReceiptDate() {
    return fdtmOCRReceiptDate;
  }
  public void set_fdtmOCRReceiptDate(java.sql.Timestamp fdtmOCRReceiptDate) {
    this.fdtmOCRReceiptDate = fdtmOCRReceiptDate;
  }
  public tblnz_rtnrebrcp with_fdtmOCRReceiptDate(java.sql.Timestamp fdtmOCRReceiptDate) {
    this.fdtmOCRReceiptDate = fdtmOCRReceiptDate;
    return this;
  }
  private String fstrOCRType;
  public String get_fstrOCRType() {
    return fstrOCRType;
  }
  public void set_fstrOCRType(String fstrOCRType) {
    this.fstrOCRType = fstrOCRType;
  }
  public tblnz_rtnrebrcp with_fstrOCRType(String fstrOCRType) {
    this.fstrOCRType = fstrOCRType;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnrebrcp with_fstrWho(String fstrWho) {
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
  public tblnz_rtnrebrcp with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrebrcp)) {
      return false;
    }
    tblnz_rtnrebrcp that = (tblnz_rtnrebrcp) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fcurReceiptAmount == null ? that.fcurReceiptAmount == null : this.fcurReceiptAmount.equals(that.fcurReceiptAmount));
    equal = equal && (this.fcurApprovedAmount == null ? that.fcurApprovedAmount == null : this.fcurApprovedAmount.equals(that.fcurApprovedAmount));
    equal = equal && (this.fdtmReceiptDate == null ? that.fdtmReceiptDate == null : this.fdtmReceiptDate.equals(that.fdtmReceiptDate));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrDonationType == null ? that.fstrDonationType == null : this.fstrDonationType.equals(that.fstrDonationType));
    equal = equal && (this.fstrOrganisationName == null ? that.fstrOrganisationName == null : this.fstrOrganisationName.equals(that.fstrOrganisationName));
    equal = equal && (this.fstrOrganisationIRD == null ? that.fstrOrganisationIRD == null : this.fstrOrganisationIRD.equals(that.fstrOrganisationIRD));
    equal = equal && (this.fstrOrganisationCharityNum == null ? that.fstrOrganisationCharityNum == null : this.fstrOrganisationCharityNum.equals(that.fstrOrganisationCharityNum));
    equal = equal && (this.fstrPartnerIRD == null ? that.fstrPartnerIRD == null : this.fstrPartnerIRD.equals(that.fstrPartnerIRD));
    equal = equal && (this.flngPartnerCustomerKey == null ? that.flngPartnerCustomerKey == null : this.flngPartnerCustomerKey.equals(that.flngPartnerCustomerKey));
    equal = equal && (this.fcurPartnerAmount == null ? that.fcurPartnerAmount == null : this.fcurPartnerAmount.equals(that.fcurPartnerAmount));
    equal = equal && (this.fstrRejectedWho == null ? that.fstrRejectedWho == null : this.fstrRejectedWho.equals(that.fstrRejectedWho));
    equal = equal && (this.flngWebReqKey == null ? that.flngWebReqKey == null : this.flngWebReqKey.equals(that.flngWebReqKey));
    equal = equal && (this.fblnTaxAgentClaim == null ? that.fblnTaxAgentClaim == null : this.fblnTaxAgentClaim.equals(that.fblnTaxAgentClaim));
    equal = equal && (this.fstrAuditRejectionRating == null ? that.fstrAuditRejectionRating == null : this.fstrAuditRejectionRating.equals(that.fstrAuditRejectionRating));
    equal = equal && (this.fstrRejectionReason == null ? that.fstrRejectionReason == null : this.fstrRejectionReason.equals(that.fstrRejectionReason));
    equal = equal && (this.fstrOtherRejectionReason == null ? that.fstrOtherRejectionReason == null : this.fstrOtherRejectionReason.equals(that.fstrOtherRejectionReason));
    equal = equal && (this.flngOCRPage == null ? that.flngOCRPage == null : this.flngOCRPage.equals(that.flngOCRPage));
    equal = equal && (this.fstrOCRSourceType == null ? that.fstrOCRSourceType == null : this.fstrOCRSourceType.equals(that.fstrOCRSourceType));
    equal = equal && (this.flngOCRSourceKey == null ? that.flngOCRSourceKey == null : this.flngOCRSourceKey.equals(that.flngOCRSourceKey));
    equal = equal && (this.fstrOCRStatus == null ? that.fstrOCRStatus == null : this.fstrOCRStatus.equals(that.fstrOCRStatus));
    equal = equal && (this.fstrOCRText == null ? that.fstrOCRText == null : this.fstrOCRText.equals(that.fstrOCRText));
    equal = equal && (this.fblnOCRKeyerConfirm == null ? that.fblnOCRKeyerConfirm == null : this.fblnOCRKeyerConfirm.equals(that.fblnOCRKeyerConfirm));
    equal = equal && (this.fblnOCRDonee == null ? that.fblnOCRDonee == null : this.fblnOCRDonee.equals(that.fblnOCRDonee));
    equal = equal && (this.fstrOCRReceiptID == null ? that.fstrOCRReceiptID == null : this.fstrOCRReceiptID.equals(that.fstrOCRReceiptID));
    equal = equal && (this.fstrOCRAddressName == null ? that.fstrOCRAddressName == null : this.fstrOCRAddressName.equals(that.fstrOCRAddressName));
    equal = equal && (this.fstrOCRAddress == null ? that.fstrOCRAddress == null : this.fstrOCRAddress.equals(that.fstrOCRAddress));
    equal = equal && (this.fstrOCREmail == null ? that.fstrOCREmail == null : this.fstrOCREmail.equals(that.fstrOCREmail));
    equal = equal && (this.fstrOCRWebSite == null ? that.fstrOCRWebSite == null : this.fstrOCRWebSite.equals(that.fstrOCRWebSite));
    equal = equal && (this.fstrOCRCharityNumber == null ? that.fstrOCRCharityNumber == null : this.fstrOCRCharityNumber.equals(that.fstrOCRCharityNumber));
    equal = equal && (this.fstrOCRName == null ? that.fstrOCRName == null : this.fstrOCRName.equals(that.fstrOCRName));
    equal = equal && (this.fstrOCRIRD == null ? that.fstrOCRIRD == null : this.fstrOCRIRD.equals(that.fstrOCRIRD));
    equal = equal && (this.fcurOCRReceiptAmount == null ? that.fcurOCRReceiptAmount == null : this.fcurOCRReceiptAmount.equals(that.fcurOCRReceiptAmount));
    equal = equal && (this.fdtmOCRReceiptDate == null ? that.fdtmOCRReceiptDate == null : this.fdtmOCRReceiptDate.equals(that.fdtmOCRReceiptDate));
    equal = equal && (this.fstrOCRType == null ? that.fstrOCRType == null : this.fstrOCRType.equals(that.fstrOCRType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrebrcp)) {
      return false;
    }
    tblnz_rtnrebrcp that = (tblnz_rtnrebrcp) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fcurReceiptAmount == null ? that.fcurReceiptAmount == null : this.fcurReceiptAmount.equals(that.fcurReceiptAmount));
    equal = equal && (this.fcurApprovedAmount == null ? that.fcurApprovedAmount == null : this.fcurApprovedAmount.equals(that.fcurApprovedAmount));
    equal = equal && (this.fdtmReceiptDate == null ? that.fdtmReceiptDate == null : this.fdtmReceiptDate.equals(that.fdtmReceiptDate));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrDonationType == null ? that.fstrDonationType == null : this.fstrDonationType.equals(that.fstrDonationType));
    equal = equal && (this.fstrOrganisationName == null ? that.fstrOrganisationName == null : this.fstrOrganisationName.equals(that.fstrOrganisationName));
    equal = equal && (this.fstrOrganisationIRD == null ? that.fstrOrganisationIRD == null : this.fstrOrganisationIRD.equals(that.fstrOrganisationIRD));
    equal = equal && (this.fstrOrganisationCharityNum == null ? that.fstrOrganisationCharityNum == null : this.fstrOrganisationCharityNum.equals(that.fstrOrganisationCharityNum));
    equal = equal && (this.fstrPartnerIRD == null ? that.fstrPartnerIRD == null : this.fstrPartnerIRD.equals(that.fstrPartnerIRD));
    equal = equal && (this.flngPartnerCustomerKey == null ? that.flngPartnerCustomerKey == null : this.flngPartnerCustomerKey.equals(that.flngPartnerCustomerKey));
    equal = equal && (this.fcurPartnerAmount == null ? that.fcurPartnerAmount == null : this.fcurPartnerAmount.equals(that.fcurPartnerAmount));
    equal = equal && (this.fstrRejectedWho == null ? that.fstrRejectedWho == null : this.fstrRejectedWho.equals(that.fstrRejectedWho));
    equal = equal && (this.flngWebReqKey == null ? that.flngWebReqKey == null : this.flngWebReqKey.equals(that.flngWebReqKey));
    equal = equal && (this.fblnTaxAgentClaim == null ? that.fblnTaxAgentClaim == null : this.fblnTaxAgentClaim.equals(that.fblnTaxAgentClaim));
    equal = equal && (this.fstrAuditRejectionRating == null ? that.fstrAuditRejectionRating == null : this.fstrAuditRejectionRating.equals(that.fstrAuditRejectionRating));
    equal = equal && (this.fstrRejectionReason == null ? that.fstrRejectionReason == null : this.fstrRejectionReason.equals(that.fstrRejectionReason));
    equal = equal && (this.fstrOtherRejectionReason == null ? that.fstrOtherRejectionReason == null : this.fstrOtherRejectionReason.equals(that.fstrOtherRejectionReason));
    equal = equal && (this.flngOCRPage == null ? that.flngOCRPage == null : this.flngOCRPage.equals(that.flngOCRPage));
    equal = equal && (this.fstrOCRSourceType == null ? that.fstrOCRSourceType == null : this.fstrOCRSourceType.equals(that.fstrOCRSourceType));
    equal = equal && (this.flngOCRSourceKey == null ? that.flngOCRSourceKey == null : this.flngOCRSourceKey.equals(that.flngOCRSourceKey));
    equal = equal && (this.fstrOCRStatus == null ? that.fstrOCRStatus == null : this.fstrOCRStatus.equals(that.fstrOCRStatus));
    equal = equal && (this.fstrOCRText == null ? that.fstrOCRText == null : this.fstrOCRText.equals(that.fstrOCRText));
    equal = equal && (this.fblnOCRKeyerConfirm == null ? that.fblnOCRKeyerConfirm == null : this.fblnOCRKeyerConfirm.equals(that.fblnOCRKeyerConfirm));
    equal = equal && (this.fblnOCRDonee == null ? that.fblnOCRDonee == null : this.fblnOCRDonee.equals(that.fblnOCRDonee));
    equal = equal && (this.fstrOCRReceiptID == null ? that.fstrOCRReceiptID == null : this.fstrOCRReceiptID.equals(that.fstrOCRReceiptID));
    equal = equal && (this.fstrOCRAddressName == null ? that.fstrOCRAddressName == null : this.fstrOCRAddressName.equals(that.fstrOCRAddressName));
    equal = equal && (this.fstrOCRAddress == null ? that.fstrOCRAddress == null : this.fstrOCRAddress.equals(that.fstrOCRAddress));
    equal = equal && (this.fstrOCREmail == null ? that.fstrOCREmail == null : this.fstrOCREmail.equals(that.fstrOCREmail));
    equal = equal && (this.fstrOCRWebSite == null ? that.fstrOCRWebSite == null : this.fstrOCRWebSite.equals(that.fstrOCRWebSite));
    equal = equal && (this.fstrOCRCharityNumber == null ? that.fstrOCRCharityNumber == null : this.fstrOCRCharityNumber.equals(that.fstrOCRCharityNumber));
    equal = equal && (this.fstrOCRName == null ? that.fstrOCRName == null : this.fstrOCRName.equals(that.fstrOCRName));
    equal = equal && (this.fstrOCRIRD == null ? that.fstrOCRIRD == null : this.fstrOCRIRD.equals(that.fstrOCRIRD));
    equal = equal && (this.fcurOCRReceiptAmount == null ? that.fcurOCRReceiptAmount == null : this.fcurOCRReceiptAmount.equals(that.fcurOCRReceiptAmount));
    equal = equal && (this.fdtmOCRReceiptDate == null ? that.fdtmOCRReceiptDate == null : this.fdtmOCRReceiptDate.equals(that.fdtmOCRReceiptDate));
    equal = equal && (this.fstrOCRType == null ? that.fstrOCRType == null : this.fstrOCRType.equals(that.fstrOCRType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurReceiptAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurApprovedAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fdtmReceiptDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrDonationType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrOrganisationName = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrOrganisationIRD = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrOrganisationCharityNum = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPartnerIRD = JdbcWritableBridge.readString(13, __dbResults);
    this.flngPartnerCustomerKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fcurPartnerAmount = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fstrRejectedWho = JdbcWritableBridge.readString(16, __dbResults);
    this.flngWebReqKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnTaxAgentClaim = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrAuditRejectionRating = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrRejectionReason = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrOtherRejectionReason = JdbcWritableBridge.readString(21, __dbResults);
    this.flngOCRPage = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrOCRSourceType = JdbcWritableBridge.readString(23, __dbResults);
    this.flngOCRSourceKey = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fstrOCRStatus = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrOCRText = JdbcWritableBridge.readString(26, __dbResults);
    this.fblnOCRKeyerConfirm = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnOCRDonee = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrOCRReceiptID = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrOCRAddressName = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrOCRAddress = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrOCREmail = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrOCRWebSite = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrOCRCharityNumber = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrOCRName = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrOCRIRD = JdbcWritableBridge.readString(36, __dbResults);
    this.fcurOCRReceiptAmount = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fdtmOCRReceiptDate = JdbcWritableBridge.readTimestamp(38, __dbResults);
    this.fstrOCRType = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(40, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(41, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurReceiptAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurApprovedAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fdtmReceiptDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrDonationType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrOrganisationName = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrOrganisationIRD = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrOrganisationCharityNum = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPartnerIRD = JdbcWritableBridge.readString(13, __dbResults);
    this.flngPartnerCustomerKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fcurPartnerAmount = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fstrRejectedWho = JdbcWritableBridge.readString(16, __dbResults);
    this.flngWebReqKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnTaxAgentClaim = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrAuditRejectionRating = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrRejectionReason = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrOtherRejectionReason = JdbcWritableBridge.readString(21, __dbResults);
    this.flngOCRPage = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrOCRSourceType = JdbcWritableBridge.readString(23, __dbResults);
    this.flngOCRSourceKey = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fstrOCRStatus = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrOCRText = JdbcWritableBridge.readString(26, __dbResults);
    this.fblnOCRKeyerConfirm = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnOCRDonee = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrOCRReceiptID = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrOCRAddressName = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrOCRAddress = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrOCREmail = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrOCRWebSite = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrOCRCharityNumber = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrOCRName = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrOCRIRD = JdbcWritableBridge.readString(36, __dbResults);
    this.fcurOCRReceiptAmount = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fdtmOCRReceiptDate = JdbcWritableBridge.readTimestamp(38, __dbResults);
    this.fstrOCRType = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(40, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(41, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurReceiptAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurApprovedAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceiptDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDonationType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOrganisationName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOrganisationIRD, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOrganisationCharityNum, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnerIRD, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPartnerCustomerKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerAmount, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRejectedWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWebReqKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTaxAgentClaim, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditRejectionRating, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRejectionReason, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherRejectionReason, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOCRPage, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRSourceType, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOCRSourceKey, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRStatus, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRText, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOCRKeyerConfirm, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOCRDonee, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRReceiptID, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRAddressName, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRAddress, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCREmail, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRWebSite, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRCharityNumber, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRName, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRIRD, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOCRReceiptAmount, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOCRReceiptDate, 38 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRType, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 41 + __off, 93, __dbStmt);
    return 41;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurReceiptAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurApprovedAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceiptDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDonationType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOrganisationName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOrganisationIRD, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOrganisationCharityNum, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnerIRD, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPartnerCustomerKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerAmount, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRejectedWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWebReqKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTaxAgentClaim, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditRejectionRating, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRejectionReason, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherRejectionReason, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOCRPage, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRSourceType, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOCRSourceKey, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRStatus, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRText, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOCRKeyerConfirm, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOCRDonee, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRReceiptID, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRAddressName, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRAddress, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCREmail, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRWebSite, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRCharityNumber, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRName, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRIRD, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOCRReceiptAmount, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOCRReceiptDate, 38 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrOCRType, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 41 + __off, 93, __dbStmt);
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
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurReceiptAmount = null;
    } else {
    this.fcurReceiptAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurApprovedAmount = null;
    } else {
    this.fcurApprovedAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReceiptDate = null;
    } else {
    this.fdtmReceiptDate = new Timestamp(__dataIn.readLong());
    this.fdtmReceiptDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDonationType = null;
    } else {
    this.fstrDonationType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOrganisationName = null;
    } else {
    this.fstrOrganisationName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOrganisationIRD = null;
    } else {
    this.fstrOrganisationIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOrganisationCharityNum = null;
    } else {
    this.fstrOrganisationCharityNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPartnerIRD = null;
    } else {
    this.fstrPartnerIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngPartnerCustomerKey = null;
    } else {
    this.flngPartnerCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerAmount = null;
    } else {
    this.fcurPartnerAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRejectedWho = null;
    } else {
    this.fstrRejectedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngWebReqKey = null;
    } else {
    this.flngWebReqKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTaxAgentClaim = null;
    } else {
    this.fblnTaxAgentClaim = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditRejectionRating = null;
    } else {
    this.fstrAuditRejectionRating = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRejectionReason = null;
    } else {
    this.fstrRejectionReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOtherRejectionReason = null;
    } else {
    this.fstrOtherRejectionReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngOCRPage = null;
    } else {
    this.flngOCRPage = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRSourceType = null;
    } else {
    this.fstrOCRSourceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngOCRSourceKey = null;
    } else {
    this.flngOCRSourceKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRStatus = null;
    } else {
    this.fstrOCRStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRText = null;
    } else {
    this.fstrOCRText = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOCRKeyerConfirm = null;
    } else {
    this.fblnOCRKeyerConfirm = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOCRDonee = null;
    } else {
    this.fblnOCRDonee = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRReceiptID = null;
    } else {
    this.fstrOCRReceiptID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRAddressName = null;
    } else {
    this.fstrOCRAddressName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRAddress = null;
    } else {
    this.fstrOCRAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCREmail = null;
    } else {
    this.fstrOCREmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRWebSite = null;
    } else {
    this.fstrOCRWebSite = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRCharityNumber = null;
    } else {
    this.fstrOCRCharityNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRName = null;
    } else {
    this.fstrOCRName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRIRD = null;
    } else {
    this.fstrOCRIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOCRReceiptAmount = null;
    } else {
    this.fcurOCRReceiptAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmOCRReceiptDate = null;
    } else {
    this.fdtmOCRReceiptDate = new Timestamp(__dataIn.readLong());
    this.fdtmOCRReceiptDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOCRType = null;
    } else {
    this.fstrOCRType = Text.readString(__dataIn);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fcurReceiptAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurReceiptAmount, __dataOut);
    }
    if (null == this.fcurApprovedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurApprovedAmount, __dataOut);
    }
    if (null == this.fdtmReceiptDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceiptDate.getTime());
    __dataOut.writeInt(this.fdtmReceiptDate.getNanos());
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrDonationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDonationType);
    }
    if (null == this.fstrOrganisationName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOrganisationName);
    }
    if (null == this.fstrOrganisationIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOrganisationIRD);
    }
    if (null == this.fstrOrganisationCharityNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOrganisationCharityNum);
    }
    if (null == this.fstrPartnerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerIRD);
    }
    if (null == this.flngPartnerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPartnerCustomerKey);
    }
    if (null == this.fcurPartnerAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerAmount, __dataOut);
    }
    if (null == this.fstrRejectedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRejectedWho);
    }
    if (null == this.flngWebReqKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWebReqKey);
    }
    if (null == this.fblnTaxAgentClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTaxAgentClaim);
    }
    if (null == this.fstrAuditRejectionRating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditRejectionRating);
    }
    if (null == this.fstrRejectionReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRejectionReason);
    }
    if (null == this.fstrOtherRejectionReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherRejectionReason);
    }
    if (null == this.flngOCRPage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOCRPage);
    }
    if (null == this.fstrOCRSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRSourceType);
    }
    if (null == this.flngOCRSourceKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOCRSourceKey);
    }
    if (null == this.fstrOCRStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRStatus);
    }
    if (null == this.fstrOCRText) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRText);
    }
    if (null == this.fblnOCRKeyerConfirm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOCRKeyerConfirm);
    }
    if (null == this.fblnOCRDonee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOCRDonee);
    }
    if (null == this.fstrOCRReceiptID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRReceiptID);
    }
    if (null == this.fstrOCRAddressName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRAddressName);
    }
    if (null == this.fstrOCRAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRAddress);
    }
    if (null == this.fstrOCREmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCREmail);
    }
    if (null == this.fstrOCRWebSite) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRWebSite);
    }
    if (null == this.fstrOCRCharityNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRCharityNumber);
    }
    if (null == this.fstrOCRName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRName);
    }
    if (null == this.fstrOCRIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRIRD);
    }
    if (null == this.fcurOCRReceiptAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOCRReceiptAmount, __dataOut);
    }
    if (null == this.fdtmOCRReceiptDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmOCRReceiptDate.getTime());
    __dataOut.writeInt(this.fdtmOCRReceiptDate.getNanos());
    }
    if (null == this.fstrOCRType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRType);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fcurReceiptAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurReceiptAmount, __dataOut);
    }
    if (null == this.fcurApprovedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurApprovedAmount, __dataOut);
    }
    if (null == this.fdtmReceiptDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceiptDate.getTime());
    __dataOut.writeInt(this.fdtmReceiptDate.getNanos());
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrDonationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDonationType);
    }
    if (null == this.fstrOrganisationName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOrganisationName);
    }
    if (null == this.fstrOrganisationIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOrganisationIRD);
    }
    if (null == this.fstrOrganisationCharityNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOrganisationCharityNum);
    }
    if (null == this.fstrPartnerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerIRD);
    }
    if (null == this.flngPartnerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPartnerCustomerKey);
    }
    if (null == this.fcurPartnerAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerAmount, __dataOut);
    }
    if (null == this.fstrRejectedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRejectedWho);
    }
    if (null == this.flngWebReqKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWebReqKey);
    }
    if (null == this.fblnTaxAgentClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTaxAgentClaim);
    }
    if (null == this.fstrAuditRejectionRating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditRejectionRating);
    }
    if (null == this.fstrRejectionReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRejectionReason);
    }
    if (null == this.fstrOtherRejectionReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherRejectionReason);
    }
    if (null == this.flngOCRPage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOCRPage);
    }
    if (null == this.fstrOCRSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRSourceType);
    }
    if (null == this.flngOCRSourceKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOCRSourceKey);
    }
    if (null == this.fstrOCRStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRStatus);
    }
    if (null == this.fstrOCRText) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRText);
    }
    if (null == this.fblnOCRKeyerConfirm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOCRKeyerConfirm);
    }
    if (null == this.fblnOCRDonee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOCRDonee);
    }
    if (null == this.fstrOCRReceiptID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRReceiptID);
    }
    if (null == this.fstrOCRAddressName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRAddressName);
    }
    if (null == this.fstrOCRAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRAddress);
    }
    if (null == this.fstrOCREmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCREmail);
    }
    if (null == this.fstrOCRWebSite) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRWebSite);
    }
    if (null == this.fstrOCRCharityNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRCharityNumber);
    }
    if (null == this.fstrOCRName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRName);
    }
    if (null == this.fstrOCRIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRIRD);
    }
    if (null == this.fcurOCRReceiptAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOCRReceiptAmount, __dataOut);
    }
    if (null == this.fdtmOCRReceiptDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmOCRReceiptDate.getTime());
    __dataOut.writeInt(this.fdtmOCRReceiptDate.getNanos());
    }
    if (null == this.fstrOCRType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOCRType);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurReceiptAmount==null?"\\N":fcurReceiptAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurApprovedAmount==null?"\\N":fcurApprovedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceiptDate==null?"\\N":"" + fdtmReceiptDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDonationType==null?"\\N":fstrDonationType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOrganisationName==null?"\\N":fstrOrganisationName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOrganisationIRD==null?"\\N":fstrOrganisationIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOrganisationCharityNum==null?"\\N":fstrOrganisationCharityNum, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerIRD==null?"\\N":fstrPartnerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPartnerCustomerKey==null?"\\N":"" + flngPartnerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerAmount==null?"\\N":fcurPartnerAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRejectedWho==null?"\\N":fstrRejectedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWebReqKey==null?"\\N":"" + flngWebReqKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTaxAgentClaim==null?"\\N":"" + fblnTaxAgentClaim, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditRejectionRating==null?"\\N":fstrAuditRejectionRating, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRejectionReason==null?"\\N":fstrRejectionReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherRejectionReason==null?"\\N":fstrOtherRejectionReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOCRPage==null?"\\N":"" + flngOCRPage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRSourceType==null?"\\N":fstrOCRSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOCRSourceKey==null?"\\N":"" + flngOCRSourceKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRStatus==null?"\\N":fstrOCRStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRText==null?"\\N":fstrOCRText, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOCRKeyerConfirm==null?"\\N":"" + fblnOCRKeyerConfirm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOCRDonee==null?"\\N":"" + fblnOCRDonee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRReceiptID==null?"\\N":fstrOCRReceiptID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRAddressName==null?"\\N":fstrOCRAddressName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRAddress==null?"\\N":fstrOCRAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCREmail==null?"\\N":fstrOCREmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRWebSite==null?"\\N":fstrOCRWebSite, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRCharityNumber==null?"\\N":fstrOCRCharityNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRName==null?"\\N":fstrOCRName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRIRD==null?"\\N":fstrOCRIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOCRReceiptAmount==null?"\\N":fcurOCRReceiptAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmOCRReceiptDate==null?"\\N":"" + fdtmOCRReceiptDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRType==null?"\\N":fstrOCRType, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurReceiptAmount==null?"\\N":fcurReceiptAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurApprovedAmount==null?"\\N":fcurApprovedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceiptDate==null?"\\N":"" + fdtmReceiptDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDonationType==null?"\\N":fstrDonationType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOrganisationName==null?"\\N":fstrOrganisationName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOrganisationIRD==null?"\\N":fstrOrganisationIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOrganisationCharityNum==null?"\\N":fstrOrganisationCharityNum, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerIRD==null?"\\N":fstrPartnerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPartnerCustomerKey==null?"\\N":"" + flngPartnerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerAmount==null?"\\N":fcurPartnerAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRejectedWho==null?"\\N":fstrRejectedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWebReqKey==null?"\\N":"" + flngWebReqKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTaxAgentClaim==null?"\\N":"" + fblnTaxAgentClaim, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditRejectionRating==null?"\\N":fstrAuditRejectionRating, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRejectionReason==null?"\\N":fstrRejectionReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherRejectionReason==null?"\\N":fstrOtherRejectionReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOCRPage==null?"\\N":"" + flngOCRPage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRSourceType==null?"\\N":fstrOCRSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOCRSourceKey==null?"\\N":"" + flngOCRSourceKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRStatus==null?"\\N":fstrOCRStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRText==null?"\\N":fstrOCRText, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOCRKeyerConfirm==null?"\\N":"" + fblnOCRKeyerConfirm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOCRDonee==null?"\\N":"" + fblnOCRDonee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRReceiptID==null?"\\N":fstrOCRReceiptID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRAddressName==null?"\\N":fstrOCRAddressName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRAddress==null?"\\N":fstrOCRAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCREmail==null?"\\N":fstrOCREmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRWebSite==null?"\\N":fstrOCRWebSite, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRCharityNumber==null?"\\N":fstrOCRCharityNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRName==null?"\\N":fstrOCRName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRIRD==null?"\\N":fstrOCRIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOCRReceiptAmount==null?"\\N":fcurOCRReceiptAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmOCRReceiptDate==null?"\\N":"" + fdtmOCRReceiptDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOCRType==null?"\\N":fstrOCRType, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurReceiptAmount = null; } else {
      this.fcurReceiptAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurApprovedAmount = null; } else {
      this.fcurApprovedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceiptDate = null; } else {
      this.fdtmReceiptDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDonationType = null; } else {
      this.fstrDonationType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOrganisationName = null; } else {
      this.fstrOrganisationName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOrganisationIRD = null; } else {
      this.fstrOrganisationIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOrganisationCharityNum = null; } else {
      this.fstrOrganisationCharityNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnerIRD = null; } else {
      this.fstrPartnerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPartnerCustomerKey = null; } else {
      this.flngPartnerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerAmount = null; } else {
      this.fcurPartnerAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRejectedWho = null; } else {
      this.fstrRejectedWho = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTaxAgentClaim = null; } else {
      this.fblnTaxAgentClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditRejectionRating = null; } else {
      this.fstrAuditRejectionRating = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRejectionReason = null; } else {
      this.fstrRejectionReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherRejectionReason = null; } else {
      this.fstrOtherRejectionReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOCRPage = null; } else {
      this.flngOCRPage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRSourceType = null; } else {
      this.fstrOCRSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOCRSourceKey = null; } else {
      this.flngOCRSourceKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRStatus = null; } else {
      this.fstrOCRStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRText = null; } else {
      this.fstrOCRText = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOCRKeyerConfirm = null; } else {
      this.fblnOCRKeyerConfirm = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOCRDonee = null; } else {
      this.fblnOCRDonee = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRReceiptID = null; } else {
      this.fstrOCRReceiptID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRAddressName = null; } else {
      this.fstrOCRAddressName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRAddress = null; } else {
      this.fstrOCRAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCREmail = null; } else {
      this.fstrOCREmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRWebSite = null; } else {
      this.fstrOCRWebSite = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRCharityNumber = null; } else {
      this.fstrOCRCharityNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRName = null; } else {
      this.fstrOCRName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRIRD = null; } else {
      this.fstrOCRIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOCRReceiptAmount = null; } else {
      this.fcurOCRReceiptAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmOCRReceiptDate = null; } else {
      this.fdtmOCRReceiptDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRType = null; } else {
      this.fstrOCRType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurReceiptAmount = null; } else {
      this.fcurReceiptAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurApprovedAmount = null; } else {
      this.fcurApprovedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceiptDate = null; } else {
      this.fdtmReceiptDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDonationType = null; } else {
      this.fstrDonationType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOrganisationName = null; } else {
      this.fstrOrganisationName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOrganisationIRD = null; } else {
      this.fstrOrganisationIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOrganisationCharityNum = null; } else {
      this.fstrOrganisationCharityNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnerIRD = null; } else {
      this.fstrPartnerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPartnerCustomerKey = null; } else {
      this.flngPartnerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerAmount = null; } else {
      this.fcurPartnerAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRejectedWho = null; } else {
      this.fstrRejectedWho = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTaxAgentClaim = null; } else {
      this.fblnTaxAgentClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditRejectionRating = null; } else {
      this.fstrAuditRejectionRating = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRejectionReason = null; } else {
      this.fstrRejectionReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherRejectionReason = null; } else {
      this.fstrOtherRejectionReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOCRPage = null; } else {
      this.flngOCRPage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRSourceType = null; } else {
      this.fstrOCRSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOCRSourceKey = null; } else {
      this.flngOCRSourceKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRStatus = null; } else {
      this.fstrOCRStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRText = null; } else {
      this.fstrOCRText = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOCRKeyerConfirm = null; } else {
      this.fblnOCRKeyerConfirm = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOCRDonee = null; } else {
      this.fblnOCRDonee = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRReceiptID = null; } else {
      this.fstrOCRReceiptID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRAddressName = null; } else {
      this.fstrOCRAddressName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRAddress = null; } else {
      this.fstrOCRAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCREmail = null; } else {
      this.fstrOCREmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRWebSite = null; } else {
      this.fstrOCRWebSite = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRCharityNumber = null; } else {
      this.fstrOCRCharityNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRName = null; } else {
      this.fstrOCRName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRIRD = null; } else {
      this.fstrOCRIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOCRReceiptAmount = null; } else {
      this.fcurOCRReceiptAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmOCRReceiptDate = null; } else {
      this.fdtmOCRReceiptDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOCRType = null; } else {
      this.fstrOCRType = __cur_str;
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
    tblnz_rtnrebrcp o = (tblnz_rtnrebrcp) super.clone();
    o.fdtmReceiptDate = (o.fdtmReceiptDate != null) ? (java.sql.Timestamp) o.fdtmReceiptDate.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmOCRReceiptDate = (o.fdtmOCRReceiptDate != null) ? (java.sql.Timestamp) o.fdtmOCRReceiptDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnrebrcp o) throws CloneNotSupportedException {
    o.fdtmReceiptDate = (o.fdtmReceiptDate != null) ? (java.sql.Timestamp) o.fdtmReceiptDate.clone() : null;
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmOCRReceiptDate = (o.fdtmOCRReceiptDate != null) ? (java.sql.Timestamp) o.fdtmOCRReceiptDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fcurReceiptAmount", this.fcurReceiptAmount);
    __sqoop$field_map.put("fcurApprovedAmount", this.fcurApprovedAmount);
    __sqoop$field_map.put("fdtmReceiptDate", this.fdtmReceiptDate);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrDonationType", this.fstrDonationType);
    __sqoop$field_map.put("fstrOrganisationName", this.fstrOrganisationName);
    __sqoop$field_map.put("fstrOrganisationIRD", this.fstrOrganisationIRD);
    __sqoop$field_map.put("fstrOrganisationCharityNum", this.fstrOrganisationCharityNum);
    __sqoop$field_map.put("fstrPartnerIRD", this.fstrPartnerIRD);
    __sqoop$field_map.put("flngPartnerCustomerKey", this.flngPartnerCustomerKey);
    __sqoop$field_map.put("fcurPartnerAmount", this.fcurPartnerAmount);
    __sqoop$field_map.put("fstrRejectedWho", this.fstrRejectedWho);
    __sqoop$field_map.put("flngWebReqKey", this.flngWebReqKey);
    __sqoop$field_map.put("fblnTaxAgentClaim", this.fblnTaxAgentClaim);
    __sqoop$field_map.put("fstrAuditRejectionRating", this.fstrAuditRejectionRating);
    __sqoop$field_map.put("fstrRejectionReason", this.fstrRejectionReason);
    __sqoop$field_map.put("fstrOtherRejectionReason", this.fstrOtherRejectionReason);
    __sqoop$field_map.put("flngOCRPage", this.flngOCRPage);
    __sqoop$field_map.put("fstrOCRSourceType", this.fstrOCRSourceType);
    __sqoop$field_map.put("flngOCRSourceKey", this.flngOCRSourceKey);
    __sqoop$field_map.put("fstrOCRStatus", this.fstrOCRStatus);
    __sqoop$field_map.put("fstrOCRText", this.fstrOCRText);
    __sqoop$field_map.put("fblnOCRKeyerConfirm", this.fblnOCRKeyerConfirm);
    __sqoop$field_map.put("fblnOCRDonee", this.fblnOCRDonee);
    __sqoop$field_map.put("fstrOCRReceiptID", this.fstrOCRReceiptID);
    __sqoop$field_map.put("fstrOCRAddressName", this.fstrOCRAddressName);
    __sqoop$field_map.put("fstrOCRAddress", this.fstrOCRAddress);
    __sqoop$field_map.put("fstrOCREmail", this.fstrOCREmail);
    __sqoop$field_map.put("fstrOCRWebSite", this.fstrOCRWebSite);
    __sqoop$field_map.put("fstrOCRCharityNumber", this.fstrOCRCharityNumber);
    __sqoop$field_map.put("fstrOCRName", this.fstrOCRName);
    __sqoop$field_map.put("fstrOCRIRD", this.fstrOCRIRD);
    __sqoop$field_map.put("fcurOCRReceiptAmount", this.fcurOCRReceiptAmount);
    __sqoop$field_map.put("fdtmOCRReceiptDate", this.fdtmOCRReceiptDate);
    __sqoop$field_map.put("fstrOCRType", this.fstrOCRType);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fcurReceiptAmount", this.fcurReceiptAmount);
    __sqoop$field_map.put("fcurApprovedAmount", this.fcurApprovedAmount);
    __sqoop$field_map.put("fdtmReceiptDate", this.fdtmReceiptDate);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrDonationType", this.fstrDonationType);
    __sqoop$field_map.put("fstrOrganisationName", this.fstrOrganisationName);
    __sqoop$field_map.put("fstrOrganisationIRD", this.fstrOrganisationIRD);
    __sqoop$field_map.put("fstrOrganisationCharityNum", this.fstrOrganisationCharityNum);
    __sqoop$field_map.put("fstrPartnerIRD", this.fstrPartnerIRD);
    __sqoop$field_map.put("flngPartnerCustomerKey", this.flngPartnerCustomerKey);
    __sqoop$field_map.put("fcurPartnerAmount", this.fcurPartnerAmount);
    __sqoop$field_map.put("fstrRejectedWho", this.fstrRejectedWho);
    __sqoop$field_map.put("flngWebReqKey", this.flngWebReqKey);
    __sqoop$field_map.put("fblnTaxAgentClaim", this.fblnTaxAgentClaim);
    __sqoop$field_map.put("fstrAuditRejectionRating", this.fstrAuditRejectionRating);
    __sqoop$field_map.put("fstrRejectionReason", this.fstrRejectionReason);
    __sqoop$field_map.put("fstrOtherRejectionReason", this.fstrOtherRejectionReason);
    __sqoop$field_map.put("flngOCRPage", this.flngOCRPage);
    __sqoop$field_map.put("fstrOCRSourceType", this.fstrOCRSourceType);
    __sqoop$field_map.put("flngOCRSourceKey", this.flngOCRSourceKey);
    __sqoop$field_map.put("fstrOCRStatus", this.fstrOCRStatus);
    __sqoop$field_map.put("fstrOCRText", this.fstrOCRText);
    __sqoop$field_map.put("fblnOCRKeyerConfirm", this.fblnOCRKeyerConfirm);
    __sqoop$field_map.put("fblnOCRDonee", this.fblnOCRDonee);
    __sqoop$field_map.put("fstrOCRReceiptID", this.fstrOCRReceiptID);
    __sqoop$field_map.put("fstrOCRAddressName", this.fstrOCRAddressName);
    __sqoop$field_map.put("fstrOCRAddress", this.fstrOCRAddress);
    __sqoop$field_map.put("fstrOCREmail", this.fstrOCREmail);
    __sqoop$field_map.put("fstrOCRWebSite", this.fstrOCRWebSite);
    __sqoop$field_map.put("fstrOCRCharityNumber", this.fstrOCRCharityNumber);
    __sqoop$field_map.put("fstrOCRName", this.fstrOCRName);
    __sqoop$field_map.put("fstrOCRIRD", this.fstrOCRIRD);
    __sqoop$field_map.put("fcurOCRReceiptAmount", this.fcurOCRReceiptAmount);
    __sqoop$field_map.put("fdtmOCRReceiptDate", this.fdtmOCRReceiptDate);
    __sqoop$field_map.put("fstrOCRType", this.fstrOCRType);
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
