// ORM class for table 'tblnz_ksb2bpaymentinbound'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:16:57 NZDT 2020
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

public class tblnz_ksb2bpaymentinbound extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64KSB2BKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fi64KSB2BKey = (Long)value;
      }
    });
    setters.put("fi64ContributionDetailKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fi64ContributionDetailKey = (Long)value;
      }
    });
    setters.put("fstrPaymentID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrPaymentID = (String)value;
      }
    });
    setters.put("fstrPaymentType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrPaymentType = (String)value;
      }
    });
    setters.put("fcurPaymentAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fcurPaymentAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrPaymentLineID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrPaymentLineID = (String)value;
      }
    });
    setters.put("fstrPaymentDocumentNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrPaymentDocumentNumber = (String)value;
      }
    });
    setters.put("fstrPaymentDocumentLineNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrPaymentDocumentLineNumber = (String)value;
      }
    });
    setters.put("fstrEmployerIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrEmployerIRDNumber = (String)value;
      }
    });
    setters.put("fstrEmployerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrEmployerName = (String)value;
      }
    });
    setters.put("fdtmPayDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fdtmPayDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmGVCPeriodEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fdtmGVCPeriodEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmVoluntaryPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fdtmVoluntaryPayment = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurEmployerContributionAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fcurEmployerContributionAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrRefundReasonCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrRefundReasonCode = (String)value;
      }
    });
    setters.put("fstrRefundLineID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrRefundLineID = (String)value;
      }
    });
    setters.put("fstrRefundLineNumberMember", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrRefundLineNumberMember = (String)value;
      }
    });
    setters.put("fstrRefundLineNumberScheme", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrRefundLineNumberScheme = (String)value;
      }
    });
    setters.put("fstrRefundReferenceScheme", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrRefundReferenceScheme = (String)value;
      }
    });
    setters.put("fstrRefundReferenceMember", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrRefundReferenceMember = (String)value;
      }
    });
    setters.put("fcurDirectMemberContributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fcurDirectMemberContributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalWithdrawalAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fcurTotalWithdrawalAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalMortgageDiversion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fcurTotalMortgageDiversion = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrMemberTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberTitle = (String)value;
      }
    });
    setters.put("fstrMemberFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberFirstName = (String)value;
      }
    });
    setters.put("fstrMemberFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberFamilyName = (String)value;
      }
    });
    setters.put("fstrMemberAddress1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberAddress1 = (String)value;
      }
    });
    setters.put("fstrMemberStreet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberStreet = (String)value;
      }
    });
    setters.put("fstrMemberStreet2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberStreet2 = (String)value;
      }
    });
    setters.put("fstrMemberAddress2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberAddress2 = (String)value;
      }
    });
    setters.put("fstrMemberUrbanization", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberUrbanization = (String)value;
      }
    });
    setters.put("fstrMemberCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberCity = (String)value;
      }
    });
    setters.put("fstrMemberPostcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberPostcode = (String)value;
      }
    });
    setters.put("fstrMemberCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrMemberCountry = (String)value;
      }
    });
    setters.put("fdtmAddressChange", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fdtmAddressChange = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentinbound.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ksb2bpaymentinbound() {
    init0();
  }
  private Long fi64KSB2BKey;
  public Long get_fi64KSB2BKey() {
    return fi64KSB2BKey;
  }
  public void set_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
  }
  public tblnz_ksb2bpaymentinbound with_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
    return this;
  }
  private Long fi64ContributionDetailKey;
  public Long get_fi64ContributionDetailKey() {
    return fi64ContributionDetailKey;
  }
  public void set_fi64ContributionDetailKey(Long fi64ContributionDetailKey) {
    this.fi64ContributionDetailKey = fi64ContributionDetailKey;
  }
  public tblnz_ksb2bpaymentinbound with_fi64ContributionDetailKey(Long fi64ContributionDetailKey) {
    this.fi64ContributionDetailKey = fi64ContributionDetailKey;
    return this;
  }
  private String fstrPaymentID;
  public String get_fstrPaymentID() {
    return fstrPaymentID;
  }
  public void set_fstrPaymentID(String fstrPaymentID) {
    this.fstrPaymentID = fstrPaymentID;
  }
  public tblnz_ksb2bpaymentinbound with_fstrPaymentID(String fstrPaymentID) {
    this.fstrPaymentID = fstrPaymentID;
    return this;
  }
  private String fstrPaymentType;
  public String get_fstrPaymentType() {
    return fstrPaymentType;
  }
  public void set_fstrPaymentType(String fstrPaymentType) {
    this.fstrPaymentType = fstrPaymentType;
  }
  public tblnz_ksb2bpaymentinbound with_fstrPaymentType(String fstrPaymentType) {
    this.fstrPaymentType = fstrPaymentType;
    return this;
  }
  private java.math.BigDecimal fcurPaymentAmount;
  public java.math.BigDecimal get_fcurPaymentAmount() {
    return fcurPaymentAmount;
  }
  public void set_fcurPaymentAmount(java.math.BigDecimal fcurPaymentAmount) {
    this.fcurPaymentAmount = fcurPaymentAmount;
  }
  public tblnz_ksb2bpaymentinbound with_fcurPaymentAmount(java.math.BigDecimal fcurPaymentAmount) {
    this.fcurPaymentAmount = fcurPaymentAmount;
    return this;
  }
  private String fstrPaymentLineID;
  public String get_fstrPaymentLineID() {
    return fstrPaymentLineID;
  }
  public void set_fstrPaymentLineID(String fstrPaymentLineID) {
    this.fstrPaymentLineID = fstrPaymentLineID;
  }
  public tblnz_ksb2bpaymentinbound with_fstrPaymentLineID(String fstrPaymentLineID) {
    this.fstrPaymentLineID = fstrPaymentLineID;
    return this;
  }
  private String fstrPaymentDocumentNumber;
  public String get_fstrPaymentDocumentNumber() {
    return fstrPaymentDocumentNumber;
  }
  public void set_fstrPaymentDocumentNumber(String fstrPaymentDocumentNumber) {
    this.fstrPaymentDocumentNumber = fstrPaymentDocumentNumber;
  }
  public tblnz_ksb2bpaymentinbound with_fstrPaymentDocumentNumber(String fstrPaymentDocumentNumber) {
    this.fstrPaymentDocumentNumber = fstrPaymentDocumentNumber;
    return this;
  }
  private String fstrPaymentDocumentLineNumber;
  public String get_fstrPaymentDocumentLineNumber() {
    return fstrPaymentDocumentLineNumber;
  }
  public void set_fstrPaymentDocumentLineNumber(String fstrPaymentDocumentLineNumber) {
    this.fstrPaymentDocumentLineNumber = fstrPaymentDocumentLineNumber;
  }
  public tblnz_ksb2bpaymentinbound with_fstrPaymentDocumentLineNumber(String fstrPaymentDocumentLineNumber) {
    this.fstrPaymentDocumentLineNumber = fstrPaymentDocumentLineNumber;
    return this;
  }
  private String fstrEmployerIRDNumber;
  public String get_fstrEmployerIRDNumber() {
    return fstrEmployerIRDNumber;
  }
  public void set_fstrEmployerIRDNumber(String fstrEmployerIRDNumber) {
    this.fstrEmployerIRDNumber = fstrEmployerIRDNumber;
  }
  public tblnz_ksb2bpaymentinbound with_fstrEmployerIRDNumber(String fstrEmployerIRDNumber) {
    this.fstrEmployerIRDNumber = fstrEmployerIRDNumber;
    return this;
  }
  private String fstrEmployerName;
  public String get_fstrEmployerName() {
    return fstrEmployerName;
  }
  public void set_fstrEmployerName(String fstrEmployerName) {
    this.fstrEmployerName = fstrEmployerName;
  }
  public tblnz_ksb2bpaymentinbound with_fstrEmployerName(String fstrEmployerName) {
    this.fstrEmployerName = fstrEmployerName;
    return this;
  }
  private java.sql.Timestamp fdtmPayDate;
  public java.sql.Timestamp get_fdtmPayDate() {
    return fdtmPayDate;
  }
  public void set_fdtmPayDate(java.sql.Timestamp fdtmPayDate) {
    this.fdtmPayDate = fdtmPayDate;
  }
  public tblnz_ksb2bpaymentinbound with_fdtmPayDate(java.sql.Timestamp fdtmPayDate) {
    this.fdtmPayDate = fdtmPayDate;
    return this;
  }
  private java.sql.Timestamp fdtmGVCPeriodEnd;
  public java.sql.Timestamp get_fdtmGVCPeriodEnd() {
    return fdtmGVCPeriodEnd;
  }
  public void set_fdtmGVCPeriodEnd(java.sql.Timestamp fdtmGVCPeriodEnd) {
    this.fdtmGVCPeriodEnd = fdtmGVCPeriodEnd;
  }
  public tblnz_ksb2bpaymentinbound with_fdtmGVCPeriodEnd(java.sql.Timestamp fdtmGVCPeriodEnd) {
    this.fdtmGVCPeriodEnd = fdtmGVCPeriodEnd;
    return this;
  }
  private java.sql.Timestamp fdtmVoluntaryPayment;
  public java.sql.Timestamp get_fdtmVoluntaryPayment() {
    return fdtmVoluntaryPayment;
  }
  public void set_fdtmVoluntaryPayment(java.sql.Timestamp fdtmVoluntaryPayment) {
    this.fdtmVoluntaryPayment = fdtmVoluntaryPayment;
  }
  public tblnz_ksb2bpaymentinbound with_fdtmVoluntaryPayment(java.sql.Timestamp fdtmVoluntaryPayment) {
    this.fdtmVoluntaryPayment = fdtmVoluntaryPayment;
    return this;
  }
  private java.math.BigDecimal fcurEmployerContributionAmount;
  public java.math.BigDecimal get_fcurEmployerContributionAmount() {
    return fcurEmployerContributionAmount;
  }
  public void set_fcurEmployerContributionAmount(java.math.BigDecimal fcurEmployerContributionAmount) {
    this.fcurEmployerContributionAmount = fcurEmployerContributionAmount;
  }
  public tblnz_ksb2bpaymentinbound with_fcurEmployerContributionAmount(java.math.BigDecimal fcurEmployerContributionAmount) {
    this.fcurEmployerContributionAmount = fcurEmployerContributionAmount;
    return this;
  }
  private String fstrRefundReasonCode;
  public String get_fstrRefundReasonCode() {
    return fstrRefundReasonCode;
  }
  public void set_fstrRefundReasonCode(String fstrRefundReasonCode) {
    this.fstrRefundReasonCode = fstrRefundReasonCode;
  }
  public tblnz_ksb2bpaymentinbound with_fstrRefundReasonCode(String fstrRefundReasonCode) {
    this.fstrRefundReasonCode = fstrRefundReasonCode;
    return this;
  }
  private String fstrRefundLineID;
  public String get_fstrRefundLineID() {
    return fstrRefundLineID;
  }
  public void set_fstrRefundLineID(String fstrRefundLineID) {
    this.fstrRefundLineID = fstrRefundLineID;
  }
  public tblnz_ksb2bpaymentinbound with_fstrRefundLineID(String fstrRefundLineID) {
    this.fstrRefundLineID = fstrRefundLineID;
    return this;
  }
  private String fstrRefundLineNumberMember;
  public String get_fstrRefundLineNumberMember() {
    return fstrRefundLineNumberMember;
  }
  public void set_fstrRefundLineNumberMember(String fstrRefundLineNumberMember) {
    this.fstrRefundLineNumberMember = fstrRefundLineNumberMember;
  }
  public tblnz_ksb2bpaymentinbound with_fstrRefundLineNumberMember(String fstrRefundLineNumberMember) {
    this.fstrRefundLineNumberMember = fstrRefundLineNumberMember;
    return this;
  }
  private String fstrRefundLineNumberScheme;
  public String get_fstrRefundLineNumberScheme() {
    return fstrRefundLineNumberScheme;
  }
  public void set_fstrRefundLineNumberScheme(String fstrRefundLineNumberScheme) {
    this.fstrRefundLineNumberScheme = fstrRefundLineNumberScheme;
  }
  public tblnz_ksb2bpaymentinbound with_fstrRefundLineNumberScheme(String fstrRefundLineNumberScheme) {
    this.fstrRefundLineNumberScheme = fstrRefundLineNumberScheme;
    return this;
  }
  private String fstrRefundReferenceScheme;
  public String get_fstrRefundReferenceScheme() {
    return fstrRefundReferenceScheme;
  }
  public void set_fstrRefundReferenceScheme(String fstrRefundReferenceScheme) {
    this.fstrRefundReferenceScheme = fstrRefundReferenceScheme;
  }
  public tblnz_ksb2bpaymentinbound with_fstrRefundReferenceScheme(String fstrRefundReferenceScheme) {
    this.fstrRefundReferenceScheme = fstrRefundReferenceScheme;
    return this;
  }
  private String fstrRefundReferenceMember;
  public String get_fstrRefundReferenceMember() {
    return fstrRefundReferenceMember;
  }
  public void set_fstrRefundReferenceMember(String fstrRefundReferenceMember) {
    this.fstrRefundReferenceMember = fstrRefundReferenceMember;
  }
  public tblnz_ksb2bpaymentinbound with_fstrRefundReferenceMember(String fstrRefundReferenceMember) {
    this.fstrRefundReferenceMember = fstrRefundReferenceMember;
    return this;
  }
  private java.math.BigDecimal fcurDirectMemberContributions;
  public java.math.BigDecimal get_fcurDirectMemberContributions() {
    return fcurDirectMemberContributions;
  }
  public void set_fcurDirectMemberContributions(java.math.BigDecimal fcurDirectMemberContributions) {
    this.fcurDirectMemberContributions = fcurDirectMemberContributions;
  }
  public tblnz_ksb2bpaymentinbound with_fcurDirectMemberContributions(java.math.BigDecimal fcurDirectMemberContributions) {
    this.fcurDirectMemberContributions = fcurDirectMemberContributions;
    return this;
  }
  private java.math.BigDecimal fcurTotalWithdrawalAmount;
  public java.math.BigDecimal get_fcurTotalWithdrawalAmount() {
    return fcurTotalWithdrawalAmount;
  }
  public void set_fcurTotalWithdrawalAmount(java.math.BigDecimal fcurTotalWithdrawalAmount) {
    this.fcurTotalWithdrawalAmount = fcurTotalWithdrawalAmount;
  }
  public tblnz_ksb2bpaymentinbound with_fcurTotalWithdrawalAmount(java.math.BigDecimal fcurTotalWithdrawalAmount) {
    this.fcurTotalWithdrawalAmount = fcurTotalWithdrawalAmount;
    return this;
  }
  private java.math.BigDecimal fcurTotalMortgageDiversion;
  public java.math.BigDecimal get_fcurTotalMortgageDiversion() {
    return fcurTotalMortgageDiversion;
  }
  public void set_fcurTotalMortgageDiversion(java.math.BigDecimal fcurTotalMortgageDiversion) {
    this.fcurTotalMortgageDiversion = fcurTotalMortgageDiversion;
  }
  public tblnz_ksb2bpaymentinbound with_fcurTotalMortgageDiversion(java.math.BigDecimal fcurTotalMortgageDiversion) {
    this.fcurTotalMortgageDiversion = fcurTotalMortgageDiversion;
    return this;
  }
  private String fstrMemberTitle;
  public String get_fstrMemberTitle() {
    return fstrMemberTitle;
  }
  public void set_fstrMemberTitle(String fstrMemberTitle) {
    this.fstrMemberTitle = fstrMemberTitle;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberTitle(String fstrMemberTitle) {
    this.fstrMemberTitle = fstrMemberTitle;
    return this;
  }
  private String fstrMemberFirstName;
  public String get_fstrMemberFirstName() {
    return fstrMemberFirstName;
  }
  public void set_fstrMemberFirstName(String fstrMemberFirstName) {
    this.fstrMemberFirstName = fstrMemberFirstName;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberFirstName(String fstrMemberFirstName) {
    this.fstrMemberFirstName = fstrMemberFirstName;
    return this;
  }
  private String fstrMemberFamilyName;
  public String get_fstrMemberFamilyName() {
    return fstrMemberFamilyName;
  }
  public void set_fstrMemberFamilyName(String fstrMemberFamilyName) {
    this.fstrMemberFamilyName = fstrMemberFamilyName;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberFamilyName(String fstrMemberFamilyName) {
    this.fstrMemberFamilyName = fstrMemberFamilyName;
    return this;
  }
  private String fstrMemberAddress1;
  public String get_fstrMemberAddress1() {
    return fstrMemberAddress1;
  }
  public void set_fstrMemberAddress1(String fstrMemberAddress1) {
    this.fstrMemberAddress1 = fstrMemberAddress1;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberAddress1(String fstrMemberAddress1) {
    this.fstrMemberAddress1 = fstrMemberAddress1;
    return this;
  }
  private String fstrMemberStreet;
  public String get_fstrMemberStreet() {
    return fstrMemberStreet;
  }
  public void set_fstrMemberStreet(String fstrMemberStreet) {
    this.fstrMemberStreet = fstrMemberStreet;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberStreet(String fstrMemberStreet) {
    this.fstrMemberStreet = fstrMemberStreet;
    return this;
  }
  private String fstrMemberStreet2;
  public String get_fstrMemberStreet2() {
    return fstrMemberStreet2;
  }
  public void set_fstrMemberStreet2(String fstrMemberStreet2) {
    this.fstrMemberStreet2 = fstrMemberStreet2;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberStreet2(String fstrMemberStreet2) {
    this.fstrMemberStreet2 = fstrMemberStreet2;
    return this;
  }
  private String fstrMemberAddress2;
  public String get_fstrMemberAddress2() {
    return fstrMemberAddress2;
  }
  public void set_fstrMemberAddress2(String fstrMemberAddress2) {
    this.fstrMemberAddress2 = fstrMemberAddress2;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberAddress2(String fstrMemberAddress2) {
    this.fstrMemberAddress2 = fstrMemberAddress2;
    return this;
  }
  private String fstrMemberUrbanization;
  public String get_fstrMemberUrbanization() {
    return fstrMemberUrbanization;
  }
  public void set_fstrMemberUrbanization(String fstrMemberUrbanization) {
    this.fstrMemberUrbanization = fstrMemberUrbanization;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberUrbanization(String fstrMemberUrbanization) {
    this.fstrMemberUrbanization = fstrMemberUrbanization;
    return this;
  }
  private String fstrMemberCity;
  public String get_fstrMemberCity() {
    return fstrMemberCity;
  }
  public void set_fstrMemberCity(String fstrMemberCity) {
    this.fstrMemberCity = fstrMemberCity;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberCity(String fstrMemberCity) {
    this.fstrMemberCity = fstrMemberCity;
    return this;
  }
  private String fstrMemberPostcode;
  public String get_fstrMemberPostcode() {
    return fstrMemberPostcode;
  }
  public void set_fstrMemberPostcode(String fstrMemberPostcode) {
    this.fstrMemberPostcode = fstrMemberPostcode;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberPostcode(String fstrMemberPostcode) {
    this.fstrMemberPostcode = fstrMemberPostcode;
    return this;
  }
  private String fstrMemberCountry;
  public String get_fstrMemberCountry() {
    return fstrMemberCountry;
  }
  public void set_fstrMemberCountry(String fstrMemberCountry) {
    this.fstrMemberCountry = fstrMemberCountry;
  }
  public tblnz_ksb2bpaymentinbound with_fstrMemberCountry(String fstrMemberCountry) {
    this.fstrMemberCountry = fstrMemberCountry;
    return this;
  }
  private java.sql.Timestamp fdtmAddressChange;
  public java.sql.Timestamp get_fdtmAddressChange() {
    return fdtmAddressChange;
  }
  public void set_fdtmAddressChange(java.sql.Timestamp fdtmAddressChange) {
    this.fdtmAddressChange = fdtmAddressChange;
  }
  public tblnz_ksb2bpaymentinbound with_fdtmAddressChange(java.sql.Timestamp fdtmAddressChange) {
    this.fdtmAddressChange = fdtmAddressChange;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ksb2bpaymentinbound with_fstrWho(String fstrWho) {
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
  public tblnz_ksb2bpaymentinbound with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksb2bpaymentinbound)) {
      return false;
    }
    tblnz_ksb2bpaymentinbound that = (tblnz_ksb2bpaymentinbound) o;
    boolean equal = true;
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.fi64ContributionDetailKey == null ? that.fi64ContributionDetailKey == null : this.fi64ContributionDetailKey.equals(that.fi64ContributionDetailKey));
    equal = equal && (this.fstrPaymentID == null ? that.fstrPaymentID == null : this.fstrPaymentID.equals(that.fstrPaymentID));
    equal = equal && (this.fstrPaymentType == null ? that.fstrPaymentType == null : this.fstrPaymentType.equals(that.fstrPaymentType));
    equal = equal && (this.fcurPaymentAmount == null ? that.fcurPaymentAmount == null : this.fcurPaymentAmount.equals(that.fcurPaymentAmount));
    equal = equal && (this.fstrPaymentLineID == null ? that.fstrPaymentLineID == null : this.fstrPaymentLineID.equals(that.fstrPaymentLineID));
    equal = equal && (this.fstrPaymentDocumentNumber == null ? that.fstrPaymentDocumentNumber == null : this.fstrPaymentDocumentNumber.equals(that.fstrPaymentDocumentNumber));
    equal = equal && (this.fstrPaymentDocumentLineNumber == null ? that.fstrPaymentDocumentLineNumber == null : this.fstrPaymentDocumentLineNumber.equals(that.fstrPaymentDocumentLineNumber));
    equal = equal && (this.fstrEmployerIRDNumber == null ? that.fstrEmployerIRDNumber == null : this.fstrEmployerIRDNumber.equals(that.fstrEmployerIRDNumber));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fdtmPayDate == null ? that.fdtmPayDate == null : this.fdtmPayDate.equals(that.fdtmPayDate));
    equal = equal && (this.fdtmGVCPeriodEnd == null ? that.fdtmGVCPeriodEnd == null : this.fdtmGVCPeriodEnd.equals(that.fdtmGVCPeriodEnd));
    equal = equal && (this.fdtmVoluntaryPayment == null ? that.fdtmVoluntaryPayment == null : this.fdtmVoluntaryPayment.equals(that.fdtmVoluntaryPayment));
    equal = equal && (this.fcurEmployerContributionAmount == null ? that.fcurEmployerContributionAmount == null : this.fcurEmployerContributionAmount.equals(that.fcurEmployerContributionAmount));
    equal = equal && (this.fstrRefundReasonCode == null ? that.fstrRefundReasonCode == null : this.fstrRefundReasonCode.equals(that.fstrRefundReasonCode));
    equal = equal && (this.fstrRefundLineID == null ? that.fstrRefundLineID == null : this.fstrRefundLineID.equals(that.fstrRefundLineID));
    equal = equal && (this.fstrRefundLineNumberMember == null ? that.fstrRefundLineNumberMember == null : this.fstrRefundLineNumberMember.equals(that.fstrRefundLineNumberMember));
    equal = equal && (this.fstrRefundLineNumberScheme == null ? that.fstrRefundLineNumberScheme == null : this.fstrRefundLineNumberScheme.equals(that.fstrRefundLineNumberScheme));
    equal = equal && (this.fstrRefundReferenceScheme == null ? that.fstrRefundReferenceScheme == null : this.fstrRefundReferenceScheme.equals(that.fstrRefundReferenceScheme));
    equal = equal && (this.fstrRefundReferenceMember == null ? that.fstrRefundReferenceMember == null : this.fstrRefundReferenceMember.equals(that.fstrRefundReferenceMember));
    equal = equal && (this.fcurDirectMemberContributions == null ? that.fcurDirectMemberContributions == null : this.fcurDirectMemberContributions.equals(that.fcurDirectMemberContributions));
    equal = equal && (this.fcurTotalWithdrawalAmount == null ? that.fcurTotalWithdrawalAmount == null : this.fcurTotalWithdrawalAmount.equals(that.fcurTotalWithdrawalAmount));
    equal = equal && (this.fcurTotalMortgageDiversion == null ? that.fcurTotalMortgageDiversion == null : this.fcurTotalMortgageDiversion.equals(that.fcurTotalMortgageDiversion));
    equal = equal && (this.fstrMemberTitle == null ? that.fstrMemberTitle == null : this.fstrMemberTitle.equals(that.fstrMemberTitle));
    equal = equal && (this.fstrMemberFirstName == null ? that.fstrMemberFirstName == null : this.fstrMemberFirstName.equals(that.fstrMemberFirstName));
    equal = equal && (this.fstrMemberFamilyName == null ? that.fstrMemberFamilyName == null : this.fstrMemberFamilyName.equals(that.fstrMemberFamilyName));
    equal = equal && (this.fstrMemberAddress1 == null ? that.fstrMemberAddress1 == null : this.fstrMemberAddress1.equals(that.fstrMemberAddress1));
    equal = equal && (this.fstrMemberStreet == null ? that.fstrMemberStreet == null : this.fstrMemberStreet.equals(that.fstrMemberStreet));
    equal = equal && (this.fstrMemberStreet2 == null ? that.fstrMemberStreet2 == null : this.fstrMemberStreet2.equals(that.fstrMemberStreet2));
    equal = equal && (this.fstrMemberAddress2 == null ? that.fstrMemberAddress2 == null : this.fstrMemberAddress2.equals(that.fstrMemberAddress2));
    equal = equal && (this.fstrMemberUrbanization == null ? that.fstrMemberUrbanization == null : this.fstrMemberUrbanization.equals(that.fstrMemberUrbanization));
    equal = equal && (this.fstrMemberCity == null ? that.fstrMemberCity == null : this.fstrMemberCity.equals(that.fstrMemberCity));
    equal = equal && (this.fstrMemberPostcode == null ? that.fstrMemberPostcode == null : this.fstrMemberPostcode.equals(that.fstrMemberPostcode));
    equal = equal && (this.fstrMemberCountry == null ? that.fstrMemberCountry == null : this.fstrMemberCountry.equals(that.fstrMemberCountry));
    equal = equal && (this.fdtmAddressChange == null ? that.fdtmAddressChange == null : this.fdtmAddressChange.equals(that.fdtmAddressChange));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksb2bpaymentinbound)) {
      return false;
    }
    tblnz_ksb2bpaymentinbound that = (tblnz_ksb2bpaymentinbound) o;
    boolean equal = true;
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.fi64ContributionDetailKey == null ? that.fi64ContributionDetailKey == null : this.fi64ContributionDetailKey.equals(that.fi64ContributionDetailKey));
    equal = equal && (this.fstrPaymentID == null ? that.fstrPaymentID == null : this.fstrPaymentID.equals(that.fstrPaymentID));
    equal = equal && (this.fstrPaymentType == null ? that.fstrPaymentType == null : this.fstrPaymentType.equals(that.fstrPaymentType));
    equal = equal && (this.fcurPaymentAmount == null ? that.fcurPaymentAmount == null : this.fcurPaymentAmount.equals(that.fcurPaymentAmount));
    equal = equal && (this.fstrPaymentLineID == null ? that.fstrPaymentLineID == null : this.fstrPaymentLineID.equals(that.fstrPaymentLineID));
    equal = equal && (this.fstrPaymentDocumentNumber == null ? that.fstrPaymentDocumentNumber == null : this.fstrPaymentDocumentNumber.equals(that.fstrPaymentDocumentNumber));
    equal = equal && (this.fstrPaymentDocumentLineNumber == null ? that.fstrPaymentDocumentLineNumber == null : this.fstrPaymentDocumentLineNumber.equals(that.fstrPaymentDocumentLineNumber));
    equal = equal && (this.fstrEmployerIRDNumber == null ? that.fstrEmployerIRDNumber == null : this.fstrEmployerIRDNumber.equals(that.fstrEmployerIRDNumber));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fdtmPayDate == null ? that.fdtmPayDate == null : this.fdtmPayDate.equals(that.fdtmPayDate));
    equal = equal && (this.fdtmGVCPeriodEnd == null ? that.fdtmGVCPeriodEnd == null : this.fdtmGVCPeriodEnd.equals(that.fdtmGVCPeriodEnd));
    equal = equal && (this.fdtmVoluntaryPayment == null ? that.fdtmVoluntaryPayment == null : this.fdtmVoluntaryPayment.equals(that.fdtmVoluntaryPayment));
    equal = equal && (this.fcurEmployerContributionAmount == null ? that.fcurEmployerContributionAmount == null : this.fcurEmployerContributionAmount.equals(that.fcurEmployerContributionAmount));
    equal = equal && (this.fstrRefundReasonCode == null ? that.fstrRefundReasonCode == null : this.fstrRefundReasonCode.equals(that.fstrRefundReasonCode));
    equal = equal && (this.fstrRefundLineID == null ? that.fstrRefundLineID == null : this.fstrRefundLineID.equals(that.fstrRefundLineID));
    equal = equal && (this.fstrRefundLineNumberMember == null ? that.fstrRefundLineNumberMember == null : this.fstrRefundLineNumberMember.equals(that.fstrRefundLineNumberMember));
    equal = equal && (this.fstrRefundLineNumberScheme == null ? that.fstrRefundLineNumberScheme == null : this.fstrRefundLineNumberScheme.equals(that.fstrRefundLineNumberScheme));
    equal = equal && (this.fstrRefundReferenceScheme == null ? that.fstrRefundReferenceScheme == null : this.fstrRefundReferenceScheme.equals(that.fstrRefundReferenceScheme));
    equal = equal && (this.fstrRefundReferenceMember == null ? that.fstrRefundReferenceMember == null : this.fstrRefundReferenceMember.equals(that.fstrRefundReferenceMember));
    equal = equal && (this.fcurDirectMemberContributions == null ? that.fcurDirectMemberContributions == null : this.fcurDirectMemberContributions.equals(that.fcurDirectMemberContributions));
    equal = equal && (this.fcurTotalWithdrawalAmount == null ? that.fcurTotalWithdrawalAmount == null : this.fcurTotalWithdrawalAmount.equals(that.fcurTotalWithdrawalAmount));
    equal = equal && (this.fcurTotalMortgageDiversion == null ? that.fcurTotalMortgageDiversion == null : this.fcurTotalMortgageDiversion.equals(that.fcurTotalMortgageDiversion));
    equal = equal && (this.fstrMemberTitle == null ? that.fstrMemberTitle == null : this.fstrMemberTitle.equals(that.fstrMemberTitle));
    equal = equal && (this.fstrMemberFirstName == null ? that.fstrMemberFirstName == null : this.fstrMemberFirstName.equals(that.fstrMemberFirstName));
    equal = equal && (this.fstrMemberFamilyName == null ? that.fstrMemberFamilyName == null : this.fstrMemberFamilyName.equals(that.fstrMemberFamilyName));
    equal = equal && (this.fstrMemberAddress1 == null ? that.fstrMemberAddress1 == null : this.fstrMemberAddress1.equals(that.fstrMemberAddress1));
    equal = equal && (this.fstrMemberStreet == null ? that.fstrMemberStreet == null : this.fstrMemberStreet.equals(that.fstrMemberStreet));
    equal = equal && (this.fstrMemberStreet2 == null ? that.fstrMemberStreet2 == null : this.fstrMemberStreet2.equals(that.fstrMemberStreet2));
    equal = equal && (this.fstrMemberAddress2 == null ? that.fstrMemberAddress2 == null : this.fstrMemberAddress2.equals(that.fstrMemberAddress2));
    equal = equal && (this.fstrMemberUrbanization == null ? that.fstrMemberUrbanization == null : this.fstrMemberUrbanization.equals(that.fstrMemberUrbanization));
    equal = equal && (this.fstrMemberCity == null ? that.fstrMemberCity == null : this.fstrMemberCity.equals(that.fstrMemberCity));
    equal = equal && (this.fstrMemberPostcode == null ? that.fstrMemberPostcode == null : this.fstrMemberPostcode.equals(that.fstrMemberPostcode));
    equal = equal && (this.fstrMemberCountry == null ? that.fstrMemberCountry == null : this.fstrMemberCountry.equals(that.fstrMemberCountry));
    equal = equal && (this.fdtmAddressChange == null ? that.fdtmAddressChange == null : this.fdtmAddressChange.equals(that.fdtmAddressChange));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ContributionDetailKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fstrPaymentID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrPaymentType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurPaymentAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fstrPaymentLineID = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPaymentDocumentNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPaymentDocumentLineNumber = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrEmployerIRDNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmPayDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmGVCPeriodEnd = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmVoluntaryPayment = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fcurEmployerContributionAmount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fstrRefundReasonCode = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrRefundLineID = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrRefundLineNumberMember = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrRefundLineNumberScheme = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrRefundReferenceScheme = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrRefundReferenceMember = JdbcWritableBridge.readString(20, __dbResults);
    this.fcurDirectMemberContributions = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalWithdrawalAmount = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTotalMortgageDiversion = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fstrMemberTitle = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrMemberFirstName = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrMemberFamilyName = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrMemberAddress1 = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrMemberStreet = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrMemberStreet2 = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrMemberAddress2 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrMemberUrbanization = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrMemberCity = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrMemberPostcode = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrMemberCountry = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmAddressChange = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(36, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(37, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ContributionDetailKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fstrPaymentID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrPaymentType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurPaymentAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fstrPaymentLineID = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPaymentDocumentNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPaymentDocumentLineNumber = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrEmployerIRDNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmPayDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmGVCPeriodEnd = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmVoluntaryPayment = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fcurEmployerContributionAmount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fstrRefundReasonCode = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrRefundLineID = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrRefundLineNumberMember = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrRefundLineNumberScheme = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrRefundReferenceScheme = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrRefundReferenceMember = JdbcWritableBridge.readString(20, __dbResults);
    this.fcurDirectMemberContributions = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalWithdrawalAmount = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTotalMortgageDiversion = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fstrMemberTitle = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrMemberFirstName = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrMemberFamilyName = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrMemberAddress1 = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrMemberStreet = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrMemberStreet2 = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrMemberAddress2 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrMemberUrbanization = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrMemberCity = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrMemberPostcode = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrMemberCountry = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmAddressChange = JdbcWritableBridge.readTimestamp(35, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64KSB2BKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionDetailKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaymentAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentLineID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentDocumentNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentDocumentLineNumber, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRDNumber, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmGVCPeriodEnd, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVoluntaryPayment, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEmployerContributionAmount, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundReasonCode, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundLineID, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundLineNumberMember, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundLineNumberScheme, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundReferenceScheme, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundReferenceMember, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDirectMemberContributions, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalWithdrawalAmount, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMortgageDiversion, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberTitle, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFirstName, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFamilyName, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberAddress1, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberStreet, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberStreet2, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberAddress2, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberUrbanization, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberCity, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberPostcode, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberCountry, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAddressChange, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 37 + __off, 93, __dbStmt);
    return 37;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64KSB2BKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionDetailKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaymentAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentLineID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentDocumentNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentDocumentLineNumber, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRDNumber, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmGVCPeriodEnd, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVoluntaryPayment, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEmployerContributionAmount, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundReasonCode, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundLineID, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundLineNumberMember, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundLineNumberScheme, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundReferenceScheme, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundReferenceMember, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDirectMemberContributions, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalWithdrawalAmount, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMortgageDiversion, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberTitle, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFirstName, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFamilyName, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberAddress1, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberStreet, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberStreet2, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberAddress2, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberUrbanization, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberCity, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberPostcode, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberCountry, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAddressChange, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 37 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64KSB2BKey = null;
    } else {
    this.fi64KSB2BKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ContributionDetailKey = null;
    } else {
    this.fi64ContributionDetailKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentID = null;
    } else {
    this.fstrPaymentID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentType = null;
    } else {
    this.fstrPaymentType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPaymentAmount = null;
    } else {
    this.fcurPaymentAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentLineID = null;
    } else {
    this.fstrPaymentLineID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentDocumentNumber = null;
    } else {
    this.fstrPaymentDocumentNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentDocumentLineNumber = null;
    } else {
    this.fstrPaymentDocumentLineNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerIRDNumber = null;
    } else {
    this.fstrEmployerIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerName = null;
    } else {
    this.fstrEmployerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPayDate = null;
    } else {
    this.fdtmPayDate = new Timestamp(__dataIn.readLong());
    this.fdtmPayDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmGVCPeriodEnd = null;
    } else {
    this.fdtmGVCPeriodEnd = new Timestamp(__dataIn.readLong());
    this.fdtmGVCPeriodEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVoluntaryPayment = null;
    } else {
    this.fdtmVoluntaryPayment = new Timestamp(__dataIn.readLong());
    this.fdtmVoluntaryPayment.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEmployerContributionAmount = null;
    } else {
    this.fcurEmployerContributionAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundReasonCode = null;
    } else {
    this.fstrRefundReasonCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundLineID = null;
    } else {
    this.fstrRefundLineID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundLineNumberMember = null;
    } else {
    this.fstrRefundLineNumberMember = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundLineNumberScheme = null;
    } else {
    this.fstrRefundLineNumberScheme = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundReferenceScheme = null;
    } else {
    this.fstrRefundReferenceScheme = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundReferenceMember = null;
    } else {
    this.fstrRefundReferenceMember = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDirectMemberContributions = null;
    } else {
    this.fcurDirectMemberContributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalWithdrawalAmount = null;
    } else {
    this.fcurTotalWithdrawalAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalMortgageDiversion = null;
    } else {
    this.fcurTotalMortgageDiversion = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberTitle = null;
    } else {
    this.fstrMemberTitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberFirstName = null;
    } else {
    this.fstrMemberFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberFamilyName = null;
    } else {
    this.fstrMemberFamilyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberAddress1 = null;
    } else {
    this.fstrMemberAddress1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberStreet = null;
    } else {
    this.fstrMemberStreet = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberStreet2 = null;
    } else {
    this.fstrMemberStreet2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberAddress2 = null;
    } else {
    this.fstrMemberAddress2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberUrbanization = null;
    } else {
    this.fstrMemberUrbanization = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberCity = null;
    } else {
    this.fstrMemberCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberPostcode = null;
    } else {
    this.fstrMemberPostcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberCountry = null;
    } else {
    this.fstrMemberCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAddressChange = null;
    } else {
    this.fdtmAddressChange = new Timestamp(__dataIn.readLong());
    this.fdtmAddressChange.setNanos(__dataIn.readInt());
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
    if (null == this.fi64KSB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BKey);
    }
    if (null == this.fi64ContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionDetailKey);
    }
    if (null == this.fstrPaymentID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentID);
    }
    if (null == this.fstrPaymentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentType);
    }
    if (null == this.fcurPaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaymentAmount, __dataOut);
    }
    if (null == this.fstrPaymentLineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentLineID);
    }
    if (null == this.fstrPaymentDocumentNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentDocumentNumber);
    }
    if (null == this.fstrPaymentDocumentLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentDocumentLineNumber);
    }
    if (null == this.fstrEmployerIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerIRDNumber);
    }
    if (null == this.fstrEmployerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerName);
    }
    if (null == this.fdtmPayDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDate.getTime());
    __dataOut.writeInt(this.fdtmPayDate.getNanos());
    }
    if (null == this.fdtmGVCPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmGVCPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmGVCPeriodEnd.getNanos());
    }
    if (null == this.fdtmVoluntaryPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVoluntaryPayment.getTime());
    __dataOut.writeInt(this.fdtmVoluntaryPayment.getNanos());
    }
    if (null == this.fcurEmployerContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEmployerContributionAmount, __dataOut);
    }
    if (null == this.fstrRefundReasonCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundReasonCode);
    }
    if (null == this.fstrRefundLineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundLineID);
    }
    if (null == this.fstrRefundLineNumberMember) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundLineNumberMember);
    }
    if (null == this.fstrRefundLineNumberScheme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundLineNumberScheme);
    }
    if (null == this.fstrRefundReferenceScheme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundReferenceScheme);
    }
    if (null == this.fstrRefundReferenceMember) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundReferenceMember);
    }
    if (null == this.fcurDirectMemberContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDirectMemberContributions, __dataOut);
    }
    if (null == this.fcurTotalWithdrawalAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalWithdrawalAmount, __dataOut);
    }
    if (null == this.fcurTotalMortgageDiversion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalMortgageDiversion, __dataOut);
    }
    if (null == this.fstrMemberTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberTitle);
    }
    if (null == this.fstrMemberFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberFirstName);
    }
    if (null == this.fstrMemberFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberFamilyName);
    }
    if (null == this.fstrMemberAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberAddress1);
    }
    if (null == this.fstrMemberStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberStreet);
    }
    if (null == this.fstrMemberStreet2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberStreet2);
    }
    if (null == this.fstrMemberAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberAddress2);
    }
    if (null == this.fstrMemberUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberUrbanization);
    }
    if (null == this.fstrMemberCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberCity);
    }
    if (null == this.fstrMemberPostcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberPostcode);
    }
    if (null == this.fstrMemberCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberCountry);
    }
    if (null == this.fdtmAddressChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAddressChange.getTime());
    __dataOut.writeInt(this.fdtmAddressChange.getNanos());
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
    if (null == this.fi64KSB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BKey);
    }
    if (null == this.fi64ContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionDetailKey);
    }
    if (null == this.fstrPaymentID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentID);
    }
    if (null == this.fstrPaymentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentType);
    }
    if (null == this.fcurPaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaymentAmount, __dataOut);
    }
    if (null == this.fstrPaymentLineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentLineID);
    }
    if (null == this.fstrPaymentDocumentNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentDocumentNumber);
    }
    if (null == this.fstrPaymentDocumentLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentDocumentLineNumber);
    }
    if (null == this.fstrEmployerIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerIRDNumber);
    }
    if (null == this.fstrEmployerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerName);
    }
    if (null == this.fdtmPayDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDate.getTime());
    __dataOut.writeInt(this.fdtmPayDate.getNanos());
    }
    if (null == this.fdtmGVCPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmGVCPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmGVCPeriodEnd.getNanos());
    }
    if (null == this.fdtmVoluntaryPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVoluntaryPayment.getTime());
    __dataOut.writeInt(this.fdtmVoluntaryPayment.getNanos());
    }
    if (null == this.fcurEmployerContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEmployerContributionAmount, __dataOut);
    }
    if (null == this.fstrRefundReasonCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundReasonCode);
    }
    if (null == this.fstrRefundLineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundLineID);
    }
    if (null == this.fstrRefundLineNumberMember) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundLineNumberMember);
    }
    if (null == this.fstrRefundLineNumberScheme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundLineNumberScheme);
    }
    if (null == this.fstrRefundReferenceScheme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundReferenceScheme);
    }
    if (null == this.fstrRefundReferenceMember) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundReferenceMember);
    }
    if (null == this.fcurDirectMemberContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDirectMemberContributions, __dataOut);
    }
    if (null == this.fcurTotalWithdrawalAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalWithdrawalAmount, __dataOut);
    }
    if (null == this.fcurTotalMortgageDiversion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalMortgageDiversion, __dataOut);
    }
    if (null == this.fstrMemberTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberTitle);
    }
    if (null == this.fstrMemberFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberFirstName);
    }
    if (null == this.fstrMemberFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberFamilyName);
    }
    if (null == this.fstrMemberAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberAddress1);
    }
    if (null == this.fstrMemberStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberStreet);
    }
    if (null == this.fstrMemberStreet2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberStreet2);
    }
    if (null == this.fstrMemberAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberAddress2);
    }
    if (null == this.fstrMemberUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberUrbanization);
    }
    if (null == this.fstrMemberCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberCity);
    }
    if (null == this.fstrMemberPostcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberPostcode);
    }
    if (null == this.fstrMemberCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberCountry);
    }
    if (null == this.fdtmAddressChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAddressChange.getTime());
    __dataOut.writeInt(this.fdtmAddressChange.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BKey==null?"\\N":"" + fi64KSB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionDetailKey==null?"\\N":"" + fi64ContributionDetailKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentID==null?"\\N":fstrPaymentID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentType==null?"\\N":fstrPaymentType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaymentAmount==null?"\\N":fcurPaymentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentLineID==null?"\\N":fstrPaymentLineID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentDocumentNumber==null?"\\N":fstrPaymentDocumentNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentDocumentLineNumber==null?"\\N":fstrPaymentDocumentLineNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRDNumber==null?"\\N":fstrEmployerIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDate==null?"\\N":"" + fdtmPayDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmGVCPeriodEnd==null?"\\N":"" + fdtmGVCPeriodEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVoluntaryPayment==null?"\\N":"" + fdtmVoluntaryPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEmployerContributionAmount==null?"\\N":fcurEmployerContributionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundReasonCode==null?"\\N":fstrRefundReasonCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundLineID==null?"\\N":fstrRefundLineID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundLineNumberMember==null?"\\N":fstrRefundLineNumberMember, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundLineNumberScheme==null?"\\N":fstrRefundLineNumberScheme, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundReferenceScheme==null?"\\N":fstrRefundReferenceScheme, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundReferenceMember==null?"\\N":fstrRefundReferenceMember, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDirectMemberContributions==null?"\\N":fcurDirectMemberContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalWithdrawalAmount==null?"\\N":fcurTotalWithdrawalAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMortgageDiversion==null?"\\N":fcurTotalMortgageDiversion.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberTitle==null?"\\N":fstrMemberTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberFirstName==null?"\\N":fstrMemberFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberFamilyName==null?"\\N":fstrMemberFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberAddress1==null?"\\N":fstrMemberAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberStreet==null?"\\N":fstrMemberStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberStreet2==null?"\\N":fstrMemberStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberAddress2==null?"\\N":fstrMemberAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberUrbanization==null?"\\N":fstrMemberUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberCity==null?"\\N":fstrMemberCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberPostcode==null?"\\N":fstrMemberPostcode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberCountry==null?"\\N":fstrMemberCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAddressChange==null?"\\N":"" + fdtmAddressChange, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BKey==null?"\\N":"" + fi64KSB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionDetailKey==null?"\\N":"" + fi64ContributionDetailKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentID==null?"\\N":fstrPaymentID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentType==null?"\\N":fstrPaymentType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaymentAmount==null?"\\N":fcurPaymentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentLineID==null?"\\N":fstrPaymentLineID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentDocumentNumber==null?"\\N":fstrPaymentDocumentNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentDocumentLineNumber==null?"\\N":fstrPaymentDocumentLineNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRDNumber==null?"\\N":fstrEmployerIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDate==null?"\\N":"" + fdtmPayDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmGVCPeriodEnd==null?"\\N":"" + fdtmGVCPeriodEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVoluntaryPayment==null?"\\N":"" + fdtmVoluntaryPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEmployerContributionAmount==null?"\\N":fcurEmployerContributionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundReasonCode==null?"\\N":fstrRefundReasonCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundLineID==null?"\\N":fstrRefundLineID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundLineNumberMember==null?"\\N":fstrRefundLineNumberMember, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundLineNumberScheme==null?"\\N":fstrRefundLineNumberScheme, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundReferenceScheme==null?"\\N":fstrRefundReferenceScheme, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundReferenceMember==null?"\\N":fstrRefundReferenceMember, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDirectMemberContributions==null?"\\N":fcurDirectMemberContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalWithdrawalAmount==null?"\\N":fcurTotalWithdrawalAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMortgageDiversion==null?"\\N":fcurTotalMortgageDiversion.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberTitle==null?"\\N":fstrMemberTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberFirstName==null?"\\N":fstrMemberFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberFamilyName==null?"\\N":fstrMemberFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberAddress1==null?"\\N":fstrMemberAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberStreet==null?"\\N":fstrMemberStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberStreet2==null?"\\N":fstrMemberStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberAddress2==null?"\\N":fstrMemberAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberUrbanization==null?"\\N":fstrMemberUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberCity==null?"\\N":fstrMemberCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberPostcode==null?"\\N":fstrMemberPostcode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberCountry==null?"\\N":fstrMemberCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAddressChange==null?"\\N":"" + fdtmAddressChange, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BKey = null; } else {
      this.fi64KSB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionDetailKey = null; } else {
      this.fi64ContributionDetailKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentID = null; } else {
      this.fstrPaymentID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaymentAmount = null; } else {
      this.fcurPaymentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentLineID = null; } else {
      this.fstrPaymentLineID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentDocumentNumber = null; } else {
      this.fstrPaymentDocumentNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentDocumentLineNumber = null; } else {
      this.fstrPaymentDocumentLineNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerIRDNumber = null; } else {
      this.fstrEmployerIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerName = null; } else {
      this.fstrEmployerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDate = null; } else {
      this.fdtmPayDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmGVCPeriodEnd = null; } else {
      this.fdtmGVCPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVoluntaryPayment = null; } else {
      this.fdtmVoluntaryPayment = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEmployerContributionAmount = null; } else {
      this.fcurEmployerContributionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundReasonCode = null; } else {
      this.fstrRefundReasonCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundLineID = null; } else {
      this.fstrRefundLineID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundLineNumberMember = null; } else {
      this.fstrRefundLineNumberMember = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundLineNumberScheme = null; } else {
      this.fstrRefundLineNumberScheme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundReferenceScheme = null; } else {
      this.fstrRefundReferenceScheme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundReferenceMember = null; } else {
      this.fstrRefundReferenceMember = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDirectMemberContributions = null; } else {
      this.fcurDirectMemberContributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalWithdrawalAmount = null; } else {
      this.fcurTotalWithdrawalAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalMortgageDiversion = null; } else {
      this.fcurTotalMortgageDiversion = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberTitle = null; } else {
      this.fstrMemberTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberFirstName = null; } else {
      this.fstrMemberFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberFamilyName = null; } else {
      this.fstrMemberFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberAddress1 = null; } else {
      this.fstrMemberAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberStreet = null; } else {
      this.fstrMemberStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberStreet2 = null; } else {
      this.fstrMemberStreet2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberAddress2 = null; } else {
      this.fstrMemberAddress2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberUrbanization = null; } else {
      this.fstrMemberUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberCity = null; } else {
      this.fstrMemberCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberPostcode = null; } else {
      this.fstrMemberPostcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberCountry = null; } else {
      this.fstrMemberCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAddressChange = null; } else {
      this.fdtmAddressChange = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BKey = null; } else {
      this.fi64KSB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionDetailKey = null; } else {
      this.fi64ContributionDetailKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentID = null; } else {
      this.fstrPaymentID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaymentAmount = null; } else {
      this.fcurPaymentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentLineID = null; } else {
      this.fstrPaymentLineID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentDocumentNumber = null; } else {
      this.fstrPaymentDocumentNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentDocumentLineNumber = null; } else {
      this.fstrPaymentDocumentLineNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerIRDNumber = null; } else {
      this.fstrEmployerIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerName = null; } else {
      this.fstrEmployerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDate = null; } else {
      this.fdtmPayDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmGVCPeriodEnd = null; } else {
      this.fdtmGVCPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVoluntaryPayment = null; } else {
      this.fdtmVoluntaryPayment = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEmployerContributionAmount = null; } else {
      this.fcurEmployerContributionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundReasonCode = null; } else {
      this.fstrRefundReasonCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundLineID = null; } else {
      this.fstrRefundLineID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundLineNumberMember = null; } else {
      this.fstrRefundLineNumberMember = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundLineNumberScheme = null; } else {
      this.fstrRefundLineNumberScheme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundReferenceScheme = null; } else {
      this.fstrRefundReferenceScheme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundReferenceMember = null; } else {
      this.fstrRefundReferenceMember = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDirectMemberContributions = null; } else {
      this.fcurDirectMemberContributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalWithdrawalAmount = null; } else {
      this.fcurTotalWithdrawalAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalMortgageDiversion = null; } else {
      this.fcurTotalMortgageDiversion = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberTitle = null; } else {
      this.fstrMemberTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberFirstName = null; } else {
      this.fstrMemberFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberFamilyName = null; } else {
      this.fstrMemberFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberAddress1 = null; } else {
      this.fstrMemberAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberStreet = null; } else {
      this.fstrMemberStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberStreet2 = null; } else {
      this.fstrMemberStreet2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberAddress2 = null; } else {
      this.fstrMemberAddress2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberUrbanization = null; } else {
      this.fstrMemberUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberCity = null; } else {
      this.fstrMemberCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberPostcode = null; } else {
      this.fstrMemberPostcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberCountry = null; } else {
      this.fstrMemberCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAddressChange = null; } else {
      this.fdtmAddressChange = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_ksb2bpaymentinbound o = (tblnz_ksb2bpaymentinbound) super.clone();
    o.fdtmPayDate = (o.fdtmPayDate != null) ? (java.sql.Timestamp) o.fdtmPayDate.clone() : null;
    o.fdtmGVCPeriodEnd = (o.fdtmGVCPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmGVCPeriodEnd.clone() : null;
    o.fdtmVoluntaryPayment = (o.fdtmVoluntaryPayment != null) ? (java.sql.Timestamp) o.fdtmVoluntaryPayment.clone() : null;
    o.fdtmAddressChange = (o.fdtmAddressChange != null) ? (java.sql.Timestamp) o.fdtmAddressChange.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ksb2bpaymentinbound o) throws CloneNotSupportedException {
    o.fdtmPayDate = (o.fdtmPayDate != null) ? (java.sql.Timestamp) o.fdtmPayDate.clone() : null;
    o.fdtmGVCPeriodEnd = (o.fdtmGVCPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmGVCPeriodEnd.clone() : null;
    o.fdtmVoluntaryPayment = (o.fdtmVoluntaryPayment != null) ? (java.sql.Timestamp) o.fdtmVoluntaryPayment.clone() : null;
    o.fdtmAddressChange = (o.fdtmAddressChange != null) ? (java.sql.Timestamp) o.fdtmAddressChange.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("fi64ContributionDetailKey", this.fi64ContributionDetailKey);
    __sqoop$field_map.put("fstrPaymentID", this.fstrPaymentID);
    __sqoop$field_map.put("fstrPaymentType", this.fstrPaymentType);
    __sqoop$field_map.put("fcurPaymentAmount", this.fcurPaymentAmount);
    __sqoop$field_map.put("fstrPaymentLineID", this.fstrPaymentLineID);
    __sqoop$field_map.put("fstrPaymentDocumentNumber", this.fstrPaymentDocumentNumber);
    __sqoop$field_map.put("fstrPaymentDocumentLineNumber", this.fstrPaymentDocumentLineNumber);
    __sqoop$field_map.put("fstrEmployerIRDNumber", this.fstrEmployerIRDNumber);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
    __sqoop$field_map.put("fdtmPayDate", this.fdtmPayDate);
    __sqoop$field_map.put("fdtmGVCPeriodEnd", this.fdtmGVCPeriodEnd);
    __sqoop$field_map.put("fdtmVoluntaryPayment", this.fdtmVoluntaryPayment);
    __sqoop$field_map.put("fcurEmployerContributionAmount", this.fcurEmployerContributionAmount);
    __sqoop$field_map.put("fstrRefundReasonCode", this.fstrRefundReasonCode);
    __sqoop$field_map.put("fstrRefundLineID", this.fstrRefundLineID);
    __sqoop$field_map.put("fstrRefundLineNumberMember", this.fstrRefundLineNumberMember);
    __sqoop$field_map.put("fstrRefundLineNumberScheme", this.fstrRefundLineNumberScheme);
    __sqoop$field_map.put("fstrRefundReferenceScheme", this.fstrRefundReferenceScheme);
    __sqoop$field_map.put("fstrRefundReferenceMember", this.fstrRefundReferenceMember);
    __sqoop$field_map.put("fcurDirectMemberContributions", this.fcurDirectMemberContributions);
    __sqoop$field_map.put("fcurTotalWithdrawalAmount", this.fcurTotalWithdrawalAmount);
    __sqoop$field_map.put("fcurTotalMortgageDiversion", this.fcurTotalMortgageDiversion);
    __sqoop$field_map.put("fstrMemberTitle", this.fstrMemberTitle);
    __sqoop$field_map.put("fstrMemberFirstName", this.fstrMemberFirstName);
    __sqoop$field_map.put("fstrMemberFamilyName", this.fstrMemberFamilyName);
    __sqoop$field_map.put("fstrMemberAddress1", this.fstrMemberAddress1);
    __sqoop$field_map.put("fstrMemberStreet", this.fstrMemberStreet);
    __sqoop$field_map.put("fstrMemberStreet2", this.fstrMemberStreet2);
    __sqoop$field_map.put("fstrMemberAddress2", this.fstrMemberAddress2);
    __sqoop$field_map.put("fstrMemberUrbanization", this.fstrMemberUrbanization);
    __sqoop$field_map.put("fstrMemberCity", this.fstrMemberCity);
    __sqoop$field_map.put("fstrMemberPostcode", this.fstrMemberPostcode);
    __sqoop$field_map.put("fstrMemberCountry", this.fstrMemberCountry);
    __sqoop$field_map.put("fdtmAddressChange", this.fdtmAddressChange);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("fi64ContributionDetailKey", this.fi64ContributionDetailKey);
    __sqoop$field_map.put("fstrPaymentID", this.fstrPaymentID);
    __sqoop$field_map.put("fstrPaymentType", this.fstrPaymentType);
    __sqoop$field_map.put("fcurPaymentAmount", this.fcurPaymentAmount);
    __sqoop$field_map.put("fstrPaymentLineID", this.fstrPaymentLineID);
    __sqoop$field_map.put("fstrPaymentDocumentNumber", this.fstrPaymentDocumentNumber);
    __sqoop$field_map.put("fstrPaymentDocumentLineNumber", this.fstrPaymentDocumentLineNumber);
    __sqoop$field_map.put("fstrEmployerIRDNumber", this.fstrEmployerIRDNumber);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
    __sqoop$field_map.put("fdtmPayDate", this.fdtmPayDate);
    __sqoop$field_map.put("fdtmGVCPeriodEnd", this.fdtmGVCPeriodEnd);
    __sqoop$field_map.put("fdtmVoluntaryPayment", this.fdtmVoluntaryPayment);
    __sqoop$field_map.put("fcurEmployerContributionAmount", this.fcurEmployerContributionAmount);
    __sqoop$field_map.put("fstrRefundReasonCode", this.fstrRefundReasonCode);
    __sqoop$field_map.put("fstrRefundLineID", this.fstrRefundLineID);
    __sqoop$field_map.put("fstrRefundLineNumberMember", this.fstrRefundLineNumberMember);
    __sqoop$field_map.put("fstrRefundLineNumberScheme", this.fstrRefundLineNumberScheme);
    __sqoop$field_map.put("fstrRefundReferenceScheme", this.fstrRefundReferenceScheme);
    __sqoop$field_map.put("fstrRefundReferenceMember", this.fstrRefundReferenceMember);
    __sqoop$field_map.put("fcurDirectMemberContributions", this.fcurDirectMemberContributions);
    __sqoop$field_map.put("fcurTotalWithdrawalAmount", this.fcurTotalWithdrawalAmount);
    __sqoop$field_map.put("fcurTotalMortgageDiversion", this.fcurTotalMortgageDiversion);
    __sqoop$field_map.put("fstrMemberTitle", this.fstrMemberTitle);
    __sqoop$field_map.put("fstrMemberFirstName", this.fstrMemberFirstName);
    __sqoop$field_map.put("fstrMemberFamilyName", this.fstrMemberFamilyName);
    __sqoop$field_map.put("fstrMemberAddress1", this.fstrMemberAddress1);
    __sqoop$field_map.put("fstrMemberStreet", this.fstrMemberStreet);
    __sqoop$field_map.put("fstrMemberStreet2", this.fstrMemberStreet2);
    __sqoop$field_map.put("fstrMemberAddress2", this.fstrMemberAddress2);
    __sqoop$field_map.put("fstrMemberUrbanization", this.fstrMemberUrbanization);
    __sqoop$field_map.put("fstrMemberCity", this.fstrMemberCity);
    __sqoop$field_map.put("fstrMemberPostcode", this.fstrMemberPostcode);
    __sqoop$field_map.put("fstrMemberCountry", this.fstrMemberCountry);
    __sqoop$field_map.put("fdtmAddressChange", this.fdtmAddressChange);
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
