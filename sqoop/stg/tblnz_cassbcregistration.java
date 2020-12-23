// ORM class for table 'tblnz_cassbcregistration'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:45:41 NZDT 2020
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

public class tblnz_cassbcregistration extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrRegistrationSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrRegistrationSource = (String)value;
      }
    });
    setters.put("fstrSourceReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrSourceReason = (String)value;
      }
    });
    setters.put("fstrLegalDeclaration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrLegalDeclaration = (String)value;
      }
    });
    setters.put("fstrResidentDeclaration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrResidentDeclaration = (String)value;
      }
    });
    setters.put("fstrLossDeclaration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrLossDeclaration = (String)value;
      }
    });
    setters.put("fstrExistingBusinessDeclare", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrExistingBusinessDeclare = (String)value;
      }
    });
    setters.put("fstrWorkingCapitalDeclaration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrWorkingCapitalDeclaration = (String)value;
      }
    });
    setters.put("fstrBenefitDeclaration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrBenefitDeclaration = (String)value;
      }
    });
    setters.put("fstrAgeDeclaration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrAgeDeclaration = (String)value;
      }
    });
    setters.put("fblnMsdVerified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnMsdVerified = (Integer)value;
      }
    });
    setters.put("fcurMsdSubsidyAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fcurMsdSubsidyAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLoanAllowable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fcurLoanAllowable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnOverrideLoan", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnOverrideLoan = (Integer)value;
      }
    });
    setters.put("fcurLoanAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fcurLoanAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngFullTimeEmployees", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.flngFullTimeEmployees = (Integer)value;
      }
    });
    setters.put("flngPartTimeEmployees", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.flngPartTimeEmployees = (Integer)value;
      }
    });
    setters.put("flngFte", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.flngFte = (Integer)value;
      }
    });
    setters.put("fstrNzbn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrNzbn = (String)value;
      }
    });
    setters.put("fstrContactName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrContactName = (String)value;
      }
    });
    setters.put("fblnUnder18", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnUnder18 = (Integer)value;
      }
    });
    setters.put("fblnExistingAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnExistingAccount = (Integer)value;
      }
    });
    setters.put("fblnCeased", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnCeased = (Integer)value;
      }
    });
    setters.put("fblnInsolvent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnInsolvent = (Integer)value;
      }
    });
    setters.put("fblnEmployeeReview", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnEmployeeReview = (Integer)value;
      }
    });
    setters.put("fblnMultipleApplications", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnMultipleApplications = (Integer)value;
      }
    });
    setters.put("fblnSignificantEnterprise", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnSignificantEnterprise = (Integer)value;
      }
    });
    setters.put("fblnFraud", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnFraud = (Integer)value;
      }
    });
    setters.put("fblnMsdIneligible", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnMsdIneligible = (Integer)value;
      }
    });
    setters.put("fblnIR3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnIR3 = (Integer)value;
      }
    });
    setters.put("fblnSpecialAudit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnSpecialAudit = (Integer)value;
      }
    });
    setters.put("fblnFteCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnFteCount = (Integer)value;
      }
    });
    setters.put("fblnCommenceDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnCommenceDate = (Integer)value;
      }
    });
    setters.put("fblnOverseasIp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnOverseasIp = (Integer)value;
      }
    });
    setters.put("fblnOverseasAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnOverseasAddress = (Integer)value;
      }
    });
    setters.put("fblnPriorProsecution", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnPriorProsecution = (Integer)value;
      }
    });
    setters.put("fblnRelatedSuspectedOfFraud", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnRelatedSuspectedOfFraud = (Integer)value;
      }
    });
    setters.put("fblnCurrentAudit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnCurrentAudit = (Integer)value;
      }
    });
    setters.put("fblnPriorEvasionAudit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnPriorEvasionAudit = (Integer)value;
      }
    });
    setters.put("fblnPrision", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnPrision = (Integer)value;
      }
    });
    setters.put("fblnNonResident", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnNonResident = (Integer)value;
      }
    });
    setters.put("fblnRelatedSpecialAudit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnRelatedSpecialAudit = (Integer)value;
      }
    });
    setters.put("fblnHighNzbnChangeCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnHighNzbnChangeCount = (Integer)value;
      }
    });
    setters.put("fblnNonActiveInd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnNonActiveInd = (Integer)value;
      }
    });
    setters.put("fblnFailedBiometrics", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnFailedBiometrics = (Integer)value;
      }
    });
    setters.put("fblnRiskyBankAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnRiskyBankAccount = (Integer)value;
      }
    });
    setters.put("fstrIpAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrIpAddress = (String)value;
      }
    });
    setters.put("fstrIpCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrIpCountry = (String)value;
      }
    });
    setters.put("fstrIpCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrIpCity = (String)value;
      }
    });
    setters.put("fstrIpProxyType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrIpProxyType = (String)value;
      }
    });
    setters.put("fblnNzIpProxy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnNzIpProxy = (Integer)value;
      }
    });
    setters.put("fstrBankAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrBankAccount = (String)value;
      }
    });
    setters.put("fblnBankAccountAlreadyUsed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fblnBankAccountAlreadyUsed = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassbcregistration.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_cassbcregistration() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_cassbcregistration with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrRegistrationSource;
  public String get_fstrRegistrationSource() {
    return fstrRegistrationSource;
  }
  public void set_fstrRegistrationSource(String fstrRegistrationSource) {
    this.fstrRegistrationSource = fstrRegistrationSource;
  }
  public tblnz_cassbcregistration with_fstrRegistrationSource(String fstrRegistrationSource) {
    this.fstrRegistrationSource = fstrRegistrationSource;
    return this;
  }
  private String fstrSourceReason;
  public String get_fstrSourceReason() {
    return fstrSourceReason;
  }
  public void set_fstrSourceReason(String fstrSourceReason) {
    this.fstrSourceReason = fstrSourceReason;
  }
  public tblnz_cassbcregistration with_fstrSourceReason(String fstrSourceReason) {
    this.fstrSourceReason = fstrSourceReason;
    return this;
  }
  private String fstrLegalDeclaration;
  public String get_fstrLegalDeclaration() {
    return fstrLegalDeclaration;
  }
  public void set_fstrLegalDeclaration(String fstrLegalDeclaration) {
    this.fstrLegalDeclaration = fstrLegalDeclaration;
  }
  public tblnz_cassbcregistration with_fstrLegalDeclaration(String fstrLegalDeclaration) {
    this.fstrLegalDeclaration = fstrLegalDeclaration;
    return this;
  }
  private String fstrResidentDeclaration;
  public String get_fstrResidentDeclaration() {
    return fstrResidentDeclaration;
  }
  public void set_fstrResidentDeclaration(String fstrResidentDeclaration) {
    this.fstrResidentDeclaration = fstrResidentDeclaration;
  }
  public tblnz_cassbcregistration with_fstrResidentDeclaration(String fstrResidentDeclaration) {
    this.fstrResidentDeclaration = fstrResidentDeclaration;
    return this;
  }
  private String fstrLossDeclaration;
  public String get_fstrLossDeclaration() {
    return fstrLossDeclaration;
  }
  public void set_fstrLossDeclaration(String fstrLossDeclaration) {
    this.fstrLossDeclaration = fstrLossDeclaration;
  }
  public tblnz_cassbcregistration with_fstrLossDeclaration(String fstrLossDeclaration) {
    this.fstrLossDeclaration = fstrLossDeclaration;
    return this;
  }
  private String fstrExistingBusinessDeclare;
  public String get_fstrExistingBusinessDeclare() {
    return fstrExistingBusinessDeclare;
  }
  public void set_fstrExistingBusinessDeclare(String fstrExistingBusinessDeclare) {
    this.fstrExistingBusinessDeclare = fstrExistingBusinessDeclare;
  }
  public tblnz_cassbcregistration with_fstrExistingBusinessDeclare(String fstrExistingBusinessDeclare) {
    this.fstrExistingBusinessDeclare = fstrExistingBusinessDeclare;
    return this;
  }
  private String fstrWorkingCapitalDeclaration;
  public String get_fstrWorkingCapitalDeclaration() {
    return fstrWorkingCapitalDeclaration;
  }
  public void set_fstrWorkingCapitalDeclaration(String fstrWorkingCapitalDeclaration) {
    this.fstrWorkingCapitalDeclaration = fstrWorkingCapitalDeclaration;
  }
  public tblnz_cassbcregistration with_fstrWorkingCapitalDeclaration(String fstrWorkingCapitalDeclaration) {
    this.fstrWorkingCapitalDeclaration = fstrWorkingCapitalDeclaration;
    return this;
  }
  private String fstrBenefitDeclaration;
  public String get_fstrBenefitDeclaration() {
    return fstrBenefitDeclaration;
  }
  public void set_fstrBenefitDeclaration(String fstrBenefitDeclaration) {
    this.fstrBenefitDeclaration = fstrBenefitDeclaration;
  }
  public tblnz_cassbcregistration with_fstrBenefitDeclaration(String fstrBenefitDeclaration) {
    this.fstrBenefitDeclaration = fstrBenefitDeclaration;
    return this;
  }
  private String fstrAgeDeclaration;
  public String get_fstrAgeDeclaration() {
    return fstrAgeDeclaration;
  }
  public void set_fstrAgeDeclaration(String fstrAgeDeclaration) {
    this.fstrAgeDeclaration = fstrAgeDeclaration;
  }
  public tblnz_cassbcregistration with_fstrAgeDeclaration(String fstrAgeDeclaration) {
    this.fstrAgeDeclaration = fstrAgeDeclaration;
    return this;
  }
  private Integer fblnMsdVerified;
  public Integer get_fblnMsdVerified() {
    return fblnMsdVerified;
  }
  public void set_fblnMsdVerified(Integer fblnMsdVerified) {
    this.fblnMsdVerified = fblnMsdVerified;
  }
  public tblnz_cassbcregistration with_fblnMsdVerified(Integer fblnMsdVerified) {
    this.fblnMsdVerified = fblnMsdVerified;
    return this;
  }
  private java.math.BigDecimal fcurMsdSubsidyAmount;
  public java.math.BigDecimal get_fcurMsdSubsidyAmount() {
    return fcurMsdSubsidyAmount;
  }
  public void set_fcurMsdSubsidyAmount(java.math.BigDecimal fcurMsdSubsidyAmount) {
    this.fcurMsdSubsidyAmount = fcurMsdSubsidyAmount;
  }
  public tblnz_cassbcregistration with_fcurMsdSubsidyAmount(java.math.BigDecimal fcurMsdSubsidyAmount) {
    this.fcurMsdSubsidyAmount = fcurMsdSubsidyAmount;
    return this;
  }
  private java.math.BigDecimal fcurLoanAllowable;
  public java.math.BigDecimal get_fcurLoanAllowable() {
    return fcurLoanAllowable;
  }
  public void set_fcurLoanAllowable(java.math.BigDecimal fcurLoanAllowable) {
    this.fcurLoanAllowable = fcurLoanAllowable;
  }
  public tblnz_cassbcregistration with_fcurLoanAllowable(java.math.BigDecimal fcurLoanAllowable) {
    this.fcurLoanAllowable = fcurLoanAllowable;
    return this;
  }
  private Integer fblnOverrideLoan;
  public Integer get_fblnOverrideLoan() {
    return fblnOverrideLoan;
  }
  public void set_fblnOverrideLoan(Integer fblnOverrideLoan) {
    this.fblnOverrideLoan = fblnOverrideLoan;
  }
  public tblnz_cassbcregistration with_fblnOverrideLoan(Integer fblnOverrideLoan) {
    this.fblnOverrideLoan = fblnOverrideLoan;
    return this;
  }
  private java.math.BigDecimal fcurLoanAmount;
  public java.math.BigDecimal get_fcurLoanAmount() {
    return fcurLoanAmount;
  }
  public void set_fcurLoanAmount(java.math.BigDecimal fcurLoanAmount) {
    this.fcurLoanAmount = fcurLoanAmount;
  }
  public tblnz_cassbcregistration with_fcurLoanAmount(java.math.BigDecimal fcurLoanAmount) {
    this.fcurLoanAmount = fcurLoanAmount;
    return this;
  }
  private Integer flngFullTimeEmployees;
  public Integer get_flngFullTimeEmployees() {
    return flngFullTimeEmployees;
  }
  public void set_flngFullTimeEmployees(Integer flngFullTimeEmployees) {
    this.flngFullTimeEmployees = flngFullTimeEmployees;
  }
  public tblnz_cassbcregistration with_flngFullTimeEmployees(Integer flngFullTimeEmployees) {
    this.flngFullTimeEmployees = flngFullTimeEmployees;
    return this;
  }
  private Integer flngPartTimeEmployees;
  public Integer get_flngPartTimeEmployees() {
    return flngPartTimeEmployees;
  }
  public void set_flngPartTimeEmployees(Integer flngPartTimeEmployees) {
    this.flngPartTimeEmployees = flngPartTimeEmployees;
  }
  public tblnz_cassbcregistration with_flngPartTimeEmployees(Integer flngPartTimeEmployees) {
    this.flngPartTimeEmployees = flngPartTimeEmployees;
    return this;
  }
  private Integer flngFte;
  public Integer get_flngFte() {
    return flngFte;
  }
  public void set_flngFte(Integer flngFte) {
    this.flngFte = flngFte;
  }
  public tblnz_cassbcregistration with_flngFte(Integer flngFte) {
    this.flngFte = flngFte;
    return this;
  }
  private String fstrNzbn;
  public String get_fstrNzbn() {
    return fstrNzbn;
  }
  public void set_fstrNzbn(String fstrNzbn) {
    this.fstrNzbn = fstrNzbn;
  }
  public tblnz_cassbcregistration with_fstrNzbn(String fstrNzbn) {
    this.fstrNzbn = fstrNzbn;
    return this;
  }
  private String fstrContactName;
  public String get_fstrContactName() {
    return fstrContactName;
  }
  public void set_fstrContactName(String fstrContactName) {
    this.fstrContactName = fstrContactName;
  }
  public tblnz_cassbcregistration with_fstrContactName(String fstrContactName) {
    this.fstrContactName = fstrContactName;
    return this;
  }
  private Integer fblnUnder18;
  public Integer get_fblnUnder18() {
    return fblnUnder18;
  }
  public void set_fblnUnder18(Integer fblnUnder18) {
    this.fblnUnder18 = fblnUnder18;
  }
  public tblnz_cassbcregistration with_fblnUnder18(Integer fblnUnder18) {
    this.fblnUnder18 = fblnUnder18;
    return this;
  }
  private Integer fblnExistingAccount;
  public Integer get_fblnExistingAccount() {
    return fblnExistingAccount;
  }
  public void set_fblnExistingAccount(Integer fblnExistingAccount) {
    this.fblnExistingAccount = fblnExistingAccount;
  }
  public tblnz_cassbcregistration with_fblnExistingAccount(Integer fblnExistingAccount) {
    this.fblnExistingAccount = fblnExistingAccount;
    return this;
  }
  private Integer fblnCeased;
  public Integer get_fblnCeased() {
    return fblnCeased;
  }
  public void set_fblnCeased(Integer fblnCeased) {
    this.fblnCeased = fblnCeased;
  }
  public tblnz_cassbcregistration with_fblnCeased(Integer fblnCeased) {
    this.fblnCeased = fblnCeased;
    return this;
  }
  private Integer fblnInsolvent;
  public Integer get_fblnInsolvent() {
    return fblnInsolvent;
  }
  public void set_fblnInsolvent(Integer fblnInsolvent) {
    this.fblnInsolvent = fblnInsolvent;
  }
  public tblnz_cassbcregistration with_fblnInsolvent(Integer fblnInsolvent) {
    this.fblnInsolvent = fblnInsolvent;
    return this;
  }
  private Integer fblnEmployeeReview;
  public Integer get_fblnEmployeeReview() {
    return fblnEmployeeReview;
  }
  public void set_fblnEmployeeReview(Integer fblnEmployeeReview) {
    this.fblnEmployeeReview = fblnEmployeeReview;
  }
  public tblnz_cassbcregistration with_fblnEmployeeReview(Integer fblnEmployeeReview) {
    this.fblnEmployeeReview = fblnEmployeeReview;
    return this;
  }
  private Integer fblnMultipleApplications;
  public Integer get_fblnMultipleApplications() {
    return fblnMultipleApplications;
  }
  public void set_fblnMultipleApplications(Integer fblnMultipleApplications) {
    this.fblnMultipleApplications = fblnMultipleApplications;
  }
  public tblnz_cassbcregistration with_fblnMultipleApplications(Integer fblnMultipleApplications) {
    this.fblnMultipleApplications = fblnMultipleApplications;
    return this;
  }
  private Integer fblnSignificantEnterprise;
  public Integer get_fblnSignificantEnterprise() {
    return fblnSignificantEnterprise;
  }
  public void set_fblnSignificantEnterprise(Integer fblnSignificantEnterprise) {
    this.fblnSignificantEnterprise = fblnSignificantEnterprise;
  }
  public tblnz_cassbcregistration with_fblnSignificantEnterprise(Integer fblnSignificantEnterprise) {
    this.fblnSignificantEnterprise = fblnSignificantEnterprise;
    return this;
  }
  private Integer fblnFraud;
  public Integer get_fblnFraud() {
    return fblnFraud;
  }
  public void set_fblnFraud(Integer fblnFraud) {
    this.fblnFraud = fblnFraud;
  }
  public tblnz_cassbcregistration with_fblnFraud(Integer fblnFraud) {
    this.fblnFraud = fblnFraud;
    return this;
  }
  private Integer fblnMsdIneligible;
  public Integer get_fblnMsdIneligible() {
    return fblnMsdIneligible;
  }
  public void set_fblnMsdIneligible(Integer fblnMsdIneligible) {
    this.fblnMsdIneligible = fblnMsdIneligible;
  }
  public tblnz_cassbcregistration with_fblnMsdIneligible(Integer fblnMsdIneligible) {
    this.fblnMsdIneligible = fblnMsdIneligible;
    return this;
  }
  private Integer fblnIR3;
  public Integer get_fblnIR3() {
    return fblnIR3;
  }
  public void set_fblnIR3(Integer fblnIR3) {
    this.fblnIR3 = fblnIR3;
  }
  public tblnz_cassbcregistration with_fblnIR3(Integer fblnIR3) {
    this.fblnIR3 = fblnIR3;
    return this;
  }
  private Integer fblnSpecialAudit;
  public Integer get_fblnSpecialAudit() {
    return fblnSpecialAudit;
  }
  public void set_fblnSpecialAudit(Integer fblnSpecialAudit) {
    this.fblnSpecialAudit = fblnSpecialAudit;
  }
  public tblnz_cassbcregistration with_fblnSpecialAudit(Integer fblnSpecialAudit) {
    this.fblnSpecialAudit = fblnSpecialAudit;
    return this;
  }
  private Integer fblnFteCount;
  public Integer get_fblnFteCount() {
    return fblnFteCount;
  }
  public void set_fblnFteCount(Integer fblnFteCount) {
    this.fblnFteCount = fblnFteCount;
  }
  public tblnz_cassbcregistration with_fblnFteCount(Integer fblnFteCount) {
    this.fblnFteCount = fblnFteCount;
    return this;
  }
  private Integer fblnCommenceDate;
  public Integer get_fblnCommenceDate() {
    return fblnCommenceDate;
  }
  public void set_fblnCommenceDate(Integer fblnCommenceDate) {
    this.fblnCommenceDate = fblnCommenceDate;
  }
  public tblnz_cassbcregistration with_fblnCommenceDate(Integer fblnCommenceDate) {
    this.fblnCommenceDate = fblnCommenceDate;
    return this;
  }
  private Integer fblnOverseasIp;
  public Integer get_fblnOverseasIp() {
    return fblnOverseasIp;
  }
  public void set_fblnOverseasIp(Integer fblnOverseasIp) {
    this.fblnOverseasIp = fblnOverseasIp;
  }
  public tblnz_cassbcregistration with_fblnOverseasIp(Integer fblnOverseasIp) {
    this.fblnOverseasIp = fblnOverseasIp;
    return this;
  }
  private Integer fblnOverseasAddress;
  public Integer get_fblnOverseasAddress() {
    return fblnOverseasAddress;
  }
  public void set_fblnOverseasAddress(Integer fblnOverseasAddress) {
    this.fblnOverseasAddress = fblnOverseasAddress;
  }
  public tblnz_cassbcregistration with_fblnOverseasAddress(Integer fblnOverseasAddress) {
    this.fblnOverseasAddress = fblnOverseasAddress;
    return this;
  }
  private Integer fblnPriorProsecution;
  public Integer get_fblnPriorProsecution() {
    return fblnPriorProsecution;
  }
  public void set_fblnPriorProsecution(Integer fblnPriorProsecution) {
    this.fblnPriorProsecution = fblnPriorProsecution;
  }
  public tblnz_cassbcregistration with_fblnPriorProsecution(Integer fblnPriorProsecution) {
    this.fblnPriorProsecution = fblnPriorProsecution;
    return this;
  }
  private Integer fblnRelatedSuspectedOfFraud;
  public Integer get_fblnRelatedSuspectedOfFraud() {
    return fblnRelatedSuspectedOfFraud;
  }
  public void set_fblnRelatedSuspectedOfFraud(Integer fblnRelatedSuspectedOfFraud) {
    this.fblnRelatedSuspectedOfFraud = fblnRelatedSuspectedOfFraud;
  }
  public tblnz_cassbcregistration with_fblnRelatedSuspectedOfFraud(Integer fblnRelatedSuspectedOfFraud) {
    this.fblnRelatedSuspectedOfFraud = fblnRelatedSuspectedOfFraud;
    return this;
  }
  private Integer fblnCurrentAudit;
  public Integer get_fblnCurrentAudit() {
    return fblnCurrentAudit;
  }
  public void set_fblnCurrentAudit(Integer fblnCurrentAudit) {
    this.fblnCurrentAudit = fblnCurrentAudit;
  }
  public tblnz_cassbcregistration with_fblnCurrentAudit(Integer fblnCurrentAudit) {
    this.fblnCurrentAudit = fblnCurrentAudit;
    return this;
  }
  private Integer fblnPriorEvasionAudit;
  public Integer get_fblnPriorEvasionAudit() {
    return fblnPriorEvasionAudit;
  }
  public void set_fblnPriorEvasionAudit(Integer fblnPriorEvasionAudit) {
    this.fblnPriorEvasionAudit = fblnPriorEvasionAudit;
  }
  public tblnz_cassbcregistration with_fblnPriorEvasionAudit(Integer fblnPriorEvasionAudit) {
    this.fblnPriorEvasionAudit = fblnPriorEvasionAudit;
    return this;
  }
  private Integer fblnPrision;
  public Integer get_fblnPrision() {
    return fblnPrision;
  }
  public void set_fblnPrision(Integer fblnPrision) {
    this.fblnPrision = fblnPrision;
  }
  public tblnz_cassbcregistration with_fblnPrision(Integer fblnPrision) {
    this.fblnPrision = fblnPrision;
    return this;
  }
  private Integer fblnNonResident;
  public Integer get_fblnNonResident() {
    return fblnNonResident;
  }
  public void set_fblnNonResident(Integer fblnNonResident) {
    this.fblnNonResident = fblnNonResident;
  }
  public tblnz_cassbcregistration with_fblnNonResident(Integer fblnNonResident) {
    this.fblnNonResident = fblnNonResident;
    return this;
  }
  private Integer fblnRelatedSpecialAudit;
  public Integer get_fblnRelatedSpecialAudit() {
    return fblnRelatedSpecialAudit;
  }
  public void set_fblnRelatedSpecialAudit(Integer fblnRelatedSpecialAudit) {
    this.fblnRelatedSpecialAudit = fblnRelatedSpecialAudit;
  }
  public tblnz_cassbcregistration with_fblnRelatedSpecialAudit(Integer fblnRelatedSpecialAudit) {
    this.fblnRelatedSpecialAudit = fblnRelatedSpecialAudit;
    return this;
  }
  private Integer fblnHighNzbnChangeCount;
  public Integer get_fblnHighNzbnChangeCount() {
    return fblnHighNzbnChangeCount;
  }
  public void set_fblnHighNzbnChangeCount(Integer fblnHighNzbnChangeCount) {
    this.fblnHighNzbnChangeCount = fblnHighNzbnChangeCount;
  }
  public tblnz_cassbcregistration with_fblnHighNzbnChangeCount(Integer fblnHighNzbnChangeCount) {
    this.fblnHighNzbnChangeCount = fblnHighNzbnChangeCount;
    return this;
  }
  private Integer fblnNonActiveInd;
  public Integer get_fblnNonActiveInd() {
    return fblnNonActiveInd;
  }
  public void set_fblnNonActiveInd(Integer fblnNonActiveInd) {
    this.fblnNonActiveInd = fblnNonActiveInd;
  }
  public tblnz_cassbcregistration with_fblnNonActiveInd(Integer fblnNonActiveInd) {
    this.fblnNonActiveInd = fblnNonActiveInd;
    return this;
  }
  private Integer fblnFailedBiometrics;
  public Integer get_fblnFailedBiometrics() {
    return fblnFailedBiometrics;
  }
  public void set_fblnFailedBiometrics(Integer fblnFailedBiometrics) {
    this.fblnFailedBiometrics = fblnFailedBiometrics;
  }
  public tblnz_cassbcregistration with_fblnFailedBiometrics(Integer fblnFailedBiometrics) {
    this.fblnFailedBiometrics = fblnFailedBiometrics;
    return this;
  }
  private Integer fblnRiskyBankAccount;
  public Integer get_fblnRiskyBankAccount() {
    return fblnRiskyBankAccount;
  }
  public void set_fblnRiskyBankAccount(Integer fblnRiskyBankAccount) {
    this.fblnRiskyBankAccount = fblnRiskyBankAccount;
  }
  public tblnz_cassbcregistration with_fblnRiskyBankAccount(Integer fblnRiskyBankAccount) {
    this.fblnRiskyBankAccount = fblnRiskyBankAccount;
    return this;
  }
  private String fstrIpAddress;
  public String get_fstrIpAddress() {
    return fstrIpAddress;
  }
  public void set_fstrIpAddress(String fstrIpAddress) {
    this.fstrIpAddress = fstrIpAddress;
  }
  public tblnz_cassbcregistration with_fstrIpAddress(String fstrIpAddress) {
    this.fstrIpAddress = fstrIpAddress;
    return this;
  }
  private String fstrIpCountry;
  public String get_fstrIpCountry() {
    return fstrIpCountry;
  }
  public void set_fstrIpCountry(String fstrIpCountry) {
    this.fstrIpCountry = fstrIpCountry;
  }
  public tblnz_cassbcregistration with_fstrIpCountry(String fstrIpCountry) {
    this.fstrIpCountry = fstrIpCountry;
    return this;
  }
  private String fstrIpCity;
  public String get_fstrIpCity() {
    return fstrIpCity;
  }
  public void set_fstrIpCity(String fstrIpCity) {
    this.fstrIpCity = fstrIpCity;
  }
  public tblnz_cassbcregistration with_fstrIpCity(String fstrIpCity) {
    this.fstrIpCity = fstrIpCity;
    return this;
  }
  private String fstrIpProxyType;
  public String get_fstrIpProxyType() {
    return fstrIpProxyType;
  }
  public void set_fstrIpProxyType(String fstrIpProxyType) {
    this.fstrIpProxyType = fstrIpProxyType;
  }
  public tblnz_cassbcregistration with_fstrIpProxyType(String fstrIpProxyType) {
    this.fstrIpProxyType = fstrIpProxyType;
    return this;
  }
  private Integer fblnNzIpProxy;
  public Integer get_fblnNzIpProxy() {
    return fblnNzIpProxy;
  }
  public void set_fblnNzIpProxy(Integer fblnNzIpProxy) {
    this.fblnNzIpProxy = fblnNzIpProxy;
  }
  public tblnz_cassbcregistration with_fblnNzIpProxy(Integer fblnNzIpProxy) {
    this.fblnNzIpProxy = fblnNzIpProxy;
    return this;
  }
  private String fstrBankAccount;
  public String get_fstrBankAccount() {
    return fstrBankAccount;
  }
  public void set_fstrBankAccount(String fstrBankAccount) {
    this.fstrBankAccount = fstrBankAccount;
  }
  public tblnz_cassbcregistration with_fstrBankAccount(String fstrBankAccount) {
    this.fstrBankAccount = fstrBankAccount;
    return this;
  }
  private Integer fblnBankAccountAlreadyUsed;
  public Integer get_fblnBankAccountAlreadyUsed() {
    return fblnBankAccountAlreadyUsed;
  }
  public void set_fblnBankAccountAlreadyUsed(Integer fblnBankAccountAlreadyUsed) {
    this.fblnBankAccountAlreadyUsed = fblnBankAccountAlreadyUsed;
  }
  public tblnz_cassbcregistration with_fblnBankAccountAlreadyUsed(Integer fblnBankAccountAlreadyUsed) {
    this.fblnBankAccountAlreadyUsed = fblnBankAccountAlreadyUsed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_cassbcregistration with_fstrWho(String fstrWho) {
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
  public tblnz_cassbcregistration with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_cassbcregistration)) {
      return false;
    }
    tblnz_cassbcregistration that = (tblnz_cassbcregistration) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrRegistrationSource == null ? that.fstrRegistrationSource == null : this.fstrRegistrationSource.equals(that.fstrRegistrationSource));
    equal = equal && (this.fstrSourceReason == null ? that.fstrSourceReason == null : this.fstrSourceReason.equals(that.fstrSourceReason));
    equal = equal && (this.fstrLegalDeclaration == null ? that.fstrLegalDeclaration == null : this.fstrLegalDeclaration.equals(that.fstrLegalDeclaration));
    equal = equal && (this.fstrResidentDeclaration == null ? that.fstrResidentDeclaration == null : this.fstrResidentDeclaration.equals(that.fstrResidentDeclaration));
    equal = equal && (this.fstrLossDeclaration == null ? that.fstrLossDeclaration == null : this.fstrLossDeclaration.equals(that.fstrLossDeclaration));
    equal = equal && (this.fstrExistingBusinessDeclare == null ? that.fstrExistingBusinessDeclare == null : this.fstrExistingBusinessDeclare.equals(that.fstrExistingBusinessDeclare));
    equal = equal && (this.fstrWorkingCapitalDeclaration == null ? that.fstrWorkingCapitalDeclaration == null : this.fstrWorkingCapitalDeclaration.equals(that.fstrWorkingCapitalDeclaration));
    equal = equal && (this.fstrBenefitDeclaration == null ? that.fstrBenefitDeclaration == null : this.fstrBenefitDeclaration.equals(that.fstrBenefitDeclaration));
    equal = equal && (this.fstrAgeDeclaration == null ? that.fstrAgeDeclaration == null : this.fstrAgeDeclaration.equals(that.fstrAgeDeclaration));
    equal = equal && (this.fblnMsdVerified == null ? that.fblnMsdVerified == null : this.fblnMsdVerified.equals(that.fblnMsdVerified));
    equal = equal && (this.fcurMsdSubsidyAmount == null ? that.fcurMsdSubsidyAmount == null : this.fcurMsdSubsidyAmount.equals(that.fcurMsdSubsidyAmount));
    equal = equal && (this.fcurLoanAllowable == null ? that.fcurLoanAllowable == null : this.fcurLoanAllowable.equals(that.fcurLoanAllowable));
    equal = equal && (this.fblnOverrideLoan == null ? that.fblnOverrideLoan == null : this.fblnOverrideLoan.equals(that.fblnOverrideLoan));
    equal = equal && (this.fcurLoanAmount == null ? that.fcurLoanAmount == null : this.fcurLoanAmount.equals(that.fcurLoanAmount));
    equal = equal && (this.flngFullTimeEmployees == null ? that.flngFullTimeEmployees == null : this.flngFullTimeEmployees.equals(that.flngFullTimeEmployees));
    equal = equal && (this.flngPartTimeEmployees == null ? that.flngPartTimeEmployees == null : this.flngPartTimeEmployees.equals(that.flngPartTimeEmployees));
    equal = equal && (this.flngFte == null ? that.flngFte == null : this.flngFte.equals(that.flngFte));
    equal = equal && (this.fstrNzbn == null ? that.fstrNzbn == null : this.fstrNzbn.equals(that.fstrNzbn));
    equal = equal && (this.fstrContactName == null ? that.fstrContactName == null : this.fstrContactName.equals(that.fstrContactName));
    equal = equal && (this.fblnUnder18 == null ? that.fblnUnder18 == null : this.fblnUnder18.equals(that.fblnUnder18));
    equal = equal && (this.fblnExistingAccount == null ? that.fblnExistingAccount == null : this.fblnExistingAccount.equals(that.fblnExistingAccount));
    equal = equal && (this.fblnCeased == null ? that.fblnCeased == null : this.fblnCeased.equals(that.fblnCeased));
    equal = equal && (this.fblnInsolvent == null ? that.fblnInsolvent == null : this.fblnInsolvent.equals(that.fblnInsolvent));
    equal = equal && (this.fblnEmployeeReview == null ? that.fblnEmployeeReview == null : this.fblnEmployeeReview.equals(that.fblnEmployeeReview));
    equal = equal && (this.fblnMultipleApplications == null ? that.fblnMultipleApplications == null : this.fblnMultipleApplications.equals(that.fblnMultipleApplications));
    equal = equal && (this.fblnSignificantEnterprise == null ? that.fblnSignificantEnterprise == null : this.fblnSignificantEnterprise.equals(that.fblnSignificantEnterprise));
    equal = equal && (this.fblnFraud == null ? that.fblnFraud == null : this.fblnFraud.equals(that.fblnFraud));
    equal = equal && (this.fblnMsdIneligible == null ? that.fblnMsdIneligible == null : this.fblnMsdIneligible.equals(that.fblnMsdIneligible));
    equal = equal && (this.fblnIR3 == null ? that.fblnIR3 == null : this.fblnIR3.equals(that.fblnIR3));
    equal = equal && (this.fblnSpecialAudit == null ? that.fblnSpecialAudit == null : this.fblnSpecialAudit.equals(that.fblnSpecialAudit));
    equal = equal && (this.fblnFteCount == null ? that.fblnFteCount == null : this.fblnFteCount.equals(that.fblnFteCount));
    equal = equal && (this.fblnCommenceDate == null ? that.fblnCommenceDate == null : this.fblnCommenceDate.equals(that.fblnCommenceDate));
    equal = equal && (this.fblnOverseasIp == null ? that.fblnOverseasIp == null : this.fblnOverseasIp.equals(that.fblnOverseasIp));
    equal = equal && (this.fblnOverseasAddress == null ? that.fblnOverseasAddress == null : this.fblnOverseasAddress.equals(that.fblnOverseasAddress));
    equal = equal && (this.fblnPriorProsecution == null ? that.fblnPriorProsecution == null : this.fblnPriorProsecution.equals(that.fblnPriorProsecution));
    equal = equal && (this.fblnRelatedSuspectedOfFraud == null ? that.fblnRelatedSuspectedOfFraud == null : this.fblnRelatedSuspectedOfFraud.equals(that.fblnRelatedSuspectedOfFraud));
    equal = equal && (this.fblnCurrentAudit == null ? that.fblnCurrentAudit == null : this.fblnCurrentAudit.equals(that.fblnCurrentAudit));
    equal = equal && (this.fblnPriorEvasionAudit == null ? that.fblnPriorEvasionAudit == null : this.fblnPriorEvasionAudit.equals(that.fblnPriorEvasionAudit));
    equal = equal && (this.fblnPrision == null ? that.fblnPrision == null : this.fblnPrision.equals(that.fblnPrision));
    equal = equal && (this.fblnNonResident == null ? that.fblnNonResident == null : this.fblnNonResident.equals(that.fblnNonResident));
    equal = equal && (this.fblnRelatedSpecialAudit == null ? that.fblnRelatedSpecialAudit == null : this.fblnRelatedSpecialAudit.equals(that.fblnRelatedSpecialAudit));
    equal = equal && (this.fblnHighNzbnChangeCount == null ? that.fblnHighNzbnChangeCount == null : this.fblnHighNzbnChangeCount.equals(that.fblnHighNzbnChangeCount));
    equal = equal && (this.fblnNonActiveInd == null ? that.fblnNonActiveInd == null : this.fblnNonActiveInd.equals(that.fblnNonActiveInd));
    equal = equal && (this.fblnFailedBiometrics == null ? that.fblnFailedBiometrics == null : this.fblnFailedBiometrics.equals(that.fblnFailedBiometrics));
    equal = equal && (this.fblnRiskyBankAccount == null ? that.fblnRiskyBankAccount == null : this.fblnRiskyBankAccount.equals(that.fblnRiskyBankAccount));
    equal = equal && (this.fstrIpAddress == null ? that.fstrIpAddress == null : this.fstrIpAddress.equals(that.fstrIpAddress));
    equal = equal && (this.fstrIpCountry == null ? that.fstrIpCountry == null : this.fstrIpCountry.equals(that.fstrIpCountry));
    equal = equal && (this.fstrIpCity == null ? that.fstrIpCity == null : this.fstrIpCity.equals(that.fstrIpCity));
    equal = equal && (this.fstrIpProxyType == null ? that.fstrIpProxyType == null : this.fstrIpProxyType.equals(that.fstrIpProxyType));
    equal = equal && (this.fblnNzIpProxy == null ? that.fblnNzIpProxy == null : this.fblnNzIpProxy.equals(that.fblnNzIpProxy));
    equal = equal && (this.fstrBankAccount == null ? that.fstrBankAccount == null : this.fstrBankAccount.equals(that.fstrBankAccount));
    equal = equal && (this.fblnBankAccountAlreadyUsed == null ? that.fblnBankAccountAlreadyUsed == null : this.fblnBankAccountAlreadyUsed.equals(that.fblnBankAccountAlreadyUsed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_cassbcregistration)) {
      return false;
    }
    tblnz_cassbcregistration that = (tblnz_cassbcregistration) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrRegistrationSource == null ? that.fstrRegistrationSource == null : this.fstrRegistrationSource.equals(that.fstrRegistrationSource));
    equal = equal && (this.fstrSourceReason == null ? that.fstrSourceReason == null : this.fstrSourceReason.equals(that.fstrSourceReason));
    equal = equal && (this.fstrLegalDeclaration == null ? that.fstrLegalDeclaration == null : this.fstrLegalDeclaration.equals(that.fstrLegalDeclaration));
    equal = equal && (this.fstrResidentDeclaration == null ? that.fstrResidentDeclaration == null : this.fstrResidentDeclaration.equals(that.fstrResidentDeclaration));
    equal = equal && (this.fstrLossDeclaration == null ? that.fstrLossDeclaration == null : this.fstrLossDeclaration.equals(that.fstrLossDeclaration));
    equal = equal && (this.fstrExistingBusinessDeclare == null ? that.fstrExistingBusinessDeclare == null : this.fstrExistingBusinessDeclare.equals(that.fstrExistingBusinessDeclare));
    equal = equal && (this.fstrWorkingCapitalDeclaration == null ? that.fstrWorkingCapitalDeclaration == null : this.fstrWorkingCapitalDeclaration.equals(that.fstrWorkingCapitalDeclaration));
    equal = equal && (this.fstrBenefitDeclaration == null ? that.fstrBenefitDeclaration == null : this.fstrBenefitDeclaration.equals(that.fstrBenefitDeclaration));
    equal = equal && (this.fstrAgeDeclaration == null ? that.fstrAgeDeclaration == null : this.fstrAgeDeclaration.equals(that.fstrAgeDeclaration));
    equal = equal && (this.fblnMsdVerified == null ? that.fblnMsdVerified == null : this.fblnMsdVerified.equals(that.fblnMsdVerified));
    equal = equal && (this.fcurMsdSubsidyAmount == null ? that.fcurMsdSubsidyAmount == null : this.fcurMsdSubsidyAmount.equals(that.fcurMsdSubsidyAmount));
    equal = equal && (this.fcurLoanAllowable == null ? that.fcurLoanAllowable == null : this.fcurLoanAllowable.equals(that.fcurLoanAllowable));
    equal = equal && (this.fblnOverrideLoan == null ? that.fblnOverrideLoan == null : this.fblnOverrideLoan.equals(that.fblnOverrideLoan));
    equal = equal && (this.fcurLoanAmount == null ? that.fcurLoanAmount == null : this.fcurLoanAmount.equals(that.fcurLoanAmount));
    equal = equal && (this.flngFullTimeEmployees == null ? that.flngFullTimeEmployees == null : this.flngFullTimeEmployees.equals(that.flngFullTimeEmployees));
    equal = equal && (this.flngPartTimeEmployees == null ? that.flngPartTimeEmployees == null : this.flngPartTimeEmployees.equals(that.flngPartTimeEmployees));
    equal = equal && (this.flngFte == null ? that.flngFte == null : this.flngFte.equals(that.flngFte));
    equal = equal && (this.fstrNzbn == null ? that.fstrNzbn == null : this.fstrNzbn.equals(that.fstrNzbn));
    equal = equal && (this.fstrContactName == null ? that.fstrContactName == null : this.fstrContactName.equals(that.fstrContactName));
    equal = equal && (this.fblnUnder18 == null ? that.fblnUnder18 == null : this.fblnUnder18.equals(that.fblnUnder18));
    equal = equal && (this.fblnExistingAccount == null ? that.fblnExistingAccount == null : this.fblnExistingAccount.equals(that.fblnExistingAccount));
    equal = equal && (this.fblnCeased == null ? that.fblnCeased == null : this.fblnCeased.equals(that.fblnCeased));
    equal = equal && (this.fblnInsolvent == null ? that.fblnInsolvent == null : this.fblnInsolvent.equals(that.fblnInsolvent));
    equal = equal && (this.fblnEmployeeReview == null ? that.fblnEmployeeReview == null : this.fblnEmployeeReview.equals(that.fblnEmployeeReview));
    equal = equal && (this.fblnMultipleApplications == null ? that.fblnMultipleApplications == null : this.fblnMultipleApplications.equals(that.fblnMultipleApplications));
    equal = equal && (this.fblnSignificantEnterprise == null ? that.fblnSignificantEnterprise == null : this.fblnSignificantEnterprise.equals(that.fblnSignificantEnterprise));
    equal = equal && (this.fblnFraud == null ? that.fblnFraud == null : this.fblnFraud.equals(that.fblnFraud));
    equal = equal && (this.fblnMsdIneligible == null ? that.fblnMsdIneligible == null : this.fblnMsdIneligible.equals(that.fblnMsdIneligible));
    equal = equal && (this.fblnIR3 == null ? that.fblnIR3 == null : this.fblnIR3.equals(that.fblnIR3));
    equal = equal && (this.fblnSpecialAudit == null ? that.fblnSpecialAudit == null : this.fblnSpecialAudit.equals(that.fblnSpecialAudit));
    equal = equal && (this.fblnFteCount == null ? that.fblnFteCount == null : this.fblnFteCount.equals(that.fblnFteCount));
    equal = equal && (this.fblnCommenceDate == null ? that.fblnCommenceDate == null : this.fblnCommenceDate.equals(that.fblnCommenceDate));
    equal = equal && (this.fblnOverseasIp == null ? that.fblnOverseasIp == null : this.fblnOverseasIp.equals(that.fblnOverseasIp));
    equal = equal && (this.fblnOverseasAddress == null ? that.fblnOverseasAddress == null : this.fblnOverseasAddress.equals(that.fblnOverseasAddress));
    equal = equal && (this.fblnPriorProsecution == null ? that.fblnPriorProsecution == null : this.fblnPriorProsecution.equals(that.fblnPriorProsecution));
    equal = equal && (this.fblnRelatedSuspectedOfFraud == null ? that.fblnRelatedSuspectedOfFraud == null : this.fblnRelatedSuspectedOfFraud.equals(that.fblnRelatedSuspectedOfFraud));
    equal = equal && (this.fblnCurrentAudit == null ? that.fblnCurrentAudit == null : this.fblnCurrentAudit.equals(that.fblnCurrentAudit));
    equal = equal && (this.fblnPriorEvasionAudit == null ? that.fblnPriorEvasionAudit == null : this.fblnPriorEvasionAudit.equals(that.fblnPriorEvasionAudit));
    equal = equal && (this.fblnPrision == null ? that.fblnPrision == null : this.fblnPrision.equals(that.fblnPrision));
    equal = equal && (this.fblnNonResident == null ? that.fblnNonResident == null : this.fblnNonResident.equals(that.fblnNonResident));
    equal = equal && (this.fblnRelatedSpecialAudit == null ? that.fblnRelatedSpecialAudit == null : this.fblnRelatedSpecialAudit.equals(that.fblnRelatedSpecialAudit));
    equal = equal && (this.fblnHighNzbnChangeCount == null ? that.fblnHighNzbnChangeCount == null : this.fblnHighNzbnChangeCount.equals(that.fblnHighNzbnChangeCount));
    equal = equal && (this.fblnNonActiveInd == null ? that.fblnNonActiveInd == null : this.fblnNonActiveInd.equals(that.fblnNonActiveInd));
    equal = equal && (this.fblnFailedBiometrics == null ? that.fblnFailedBiometrics == null : this.fblnFailedBiometrics.equals(that.fblnFailedBiometrics));
    equal = equal && (this.fblnRiskyBankAccount == null ? that.fblnRiskyBankAccount == null : this.fblnRiskyBankAccount.equals(that.fblnRiskyBankAccount));
    equal = equal && (this.fstrIpAddress == null ? that.fstrIpAddress == null : this.fstrIpAddress.equals(that.fstrIpAddress));
    equal = equal && (this.fstrIpCountry == null ? that.fstrIpCountry == null : this.fstrIpCountry.equals(that.fstrIpCountry));
    equal = equal && (this.fstrIpCity == null ? that.fstrIpCity == null : this.fstrIpCity.equals(that.fstrIpCity));
    equal = equal && (this.fstrIpProxyType == null ? that.fstrIpProxyType == null : this.fstrIpProxyType.equals(that.fstrIpProxyType));
    equal = equal && (this.fblnNzIpProxy == null ? that.fblnNzIpProxy == null : this.fblnNzIpProxy.equals(that.fblnNzIpProxy));
    equal = equal && (this.fstrBankAccount == null ? that.fstrBankAccount == null : this.fstrBankAccount.equals(that.fstrBankAccount));
    equal = equal && (this.fblnBankAccountAlreadyUsed == null ? that.fblnBankAccountAlreadyUsed == null : this.fblnBankAccountAlreadyUsed.equals(that.fblnBankAccountAlreadyUsed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRegistrationSource = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrSourceReason = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrLegalDeclaration = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrResidentDeclaration = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrLossDeclaration = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrExistingBusinessDeclare = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrWorkingCapitalDeclaration = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrBenefitDeclaration = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrAgeDeclaration = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnMsdVerified = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fcurMsdSubsidyAmount = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLoanAllowable = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnOverrideLoan = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fcurLoanAmount = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.flngFullTimeEmployees = JdbcWritableBridge.readInteger(16, __dbResults);
    this.flngPartTimeEmployees = JdbcWritableBridge.readInteger(17, __dbResults);
    this.flngFte = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrNzbn = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrContactName = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnUnder18 = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnExistingAccount = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnCeased = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnInsolvent = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnEmployeeReview = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fblnMultipleApplications = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnSignificantEnterprise = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnFraud = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fblnMsdIneligible = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fblnIR3 = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fblnSpecialAudit = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fblnFteCount = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fblnCommenceDate = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fblnOverseasIp = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fblnOverseasAddress = JdbcWritableBridge.readInteger(35, __dbResults);
    this.fblnPriorProsecution = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fblnRelatedSuspectedOfFraud = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fblnCurrentAudit = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fblnPriorEvasionAudit = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnPrision = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnNonResident = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fblnRelatedSpecialAudit = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fblnHighNzbnChangeCount = JdbcWritableBridge.readInteger(43, __dbResults);
    this.fblnNonActiveInd = JdbcWritableBridge.readInteger(44, __dbResults);
    this.fblnFailedBiometrics = JdbcWritableBridge.readInteger(45, __dbResults);
    this.fblnRiskyBankAccount = JdbcWritableBridge.readInteger(46, __dbResults);
    this.fstrIpAddress = JdbcWritableBridge.readString(47, __dbResults);
    this.fstrIpCountry = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrIpCity = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrIpProxyType = JdbcWritableBridge.readString(50, __dbResults);
    this.fblnNzIpProxy = JdbcWritableBridge.readInteger(51, __dbResults);
    this.fstrBankAccount = JdbcWritableBridge.readString(52, __dbResults);
    this.fblnBankAccountAlreadyUsed = JdbcWritableBridge.readInteger(53, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(54, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(55, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRegistrationSource = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrSourceReason = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrLegalDeclaration = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrResidentDeclaration = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrLossDeclaration = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrExistingBusinessDeclare = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrWorkingCapitalDeclaration = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrBenefitDeclaration = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrAgeDeclaration = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnMsdVerified = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fcurMsdSubsidyAmount = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurLoanAllowable = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnOverrideLoan = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fcurLoanAmount = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.flngFullTimeEmployees = JdbcWritableBridge.readInteger(16, __dbResults);
    this.flngPartTimeEmployees = JdbcWritableBridge.readInteger(17, __dbResults);
    this.flngFte = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrNzbn = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrContactName = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnUnder18 = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnExistingAccount = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnCeased = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnInsolvent = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnEmployeeReview = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fblnMultipleApplications = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnSignificantEnterprise = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnFraud = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fblnMsdIneligible = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fblnIR3 = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fblnSpecialAudit = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fblnFteCount = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fblnCommenceDate = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fblnOverseasIp = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fblnOverseasAddress = JdbcWritableBridge.readInteger(35, __dbResults);
    this.fblnPriorProsecution = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fblnRelatedSuspectedOfFraud = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fblnCurrentAudit = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fblnPriorEvasionAudit = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnPrision = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnNonResident = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fblnRelatedSpecialAudit = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fblnHighNzbnChangeCount = JdbcWritableBridge.readInteger(43, __dbResults);
    this.fblnNonActiveInd = JdbcWritableBridge.readInteger(44, __dbResults);
    this.fblnFailedBiometrics = JdbcWritableBridge.readInteger(45, __dbResults);
    this.fblnRiskyBankAccount = JdbcWritableBridge.readInteger(46, __dbResults);
    this.fstrIpAddress = JdbcWritableBridge.readString(47, __dbResults);
    this.fstrIpCountry = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrIpCity = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrIpProxyType = JdbcWritableBridge.readString(50, __dbResults);
    this.fblnNzIpProxy = JdbcWritableBridge.readInteger(51, __dbResults);
    this.fstrBankAccount = JdbcWritableBridge.readString(52, __dbResults);
    this.fblnBankAccountAlreadyUsed = JdbcWritableBridge.readInteger(53, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegistrationSource, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceReason, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLegalDeclaration, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResidentDeclaration, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLossDeclaration, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExistingBusinessDeclare, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkingCapitalDeclaration, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBenefitDeclaration, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAgeDeclaration, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMsdVerified, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMsdSubsidyAmount, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLoanAllowable, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverrideLoan, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLoanAmount, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFullTimeEmployees, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPartTimeEmployees, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFte, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrNzbn, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactName, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnder18, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExistingAccount, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCeased, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInsolvent, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEmployeeReview, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMultipleApplications, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSignificantEnterprise, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFraud, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMsdIneligible, 29 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIR3, 30 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecialAudit, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFteCount, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommenceDate, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverseasIp, 34 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverseasAddress, 35 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPriorProsecution, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRelatedSuspectedOfFraud, 37 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCurrentAudit, 38 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPriorEvasionAudit, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPrision, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonResident, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRelatedSpecialAudit, 42 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHighNzbnChangeCount, 43 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonActiveInd, 44 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFailedBiometrics, 45 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRiskyBankAccount, 46 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrIpAddress, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIpCountry, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIpCity, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIpProxyType, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNzIpProxy, 51 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccount, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBankAccountAlreadyUsed, 53 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 55 + __off, 93, __dbStmt);
    return 55;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegistrationSource, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceReason, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLegalDeclaration, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResidentDeclaration, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLossDeclaration, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExistingBusinessDeclare, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkingCapitalDeclaration, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBenefitDeclaration, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAgeDeclaration, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMsdVerified, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMsdSubsidyAmount, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLoanAllowable, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverrideLoan, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLoanAmount, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFullTimeEmployees, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPartTimeEmployees, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFte, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrNzbn, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactName, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnder18, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExistingAccount, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCeased, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInsolvent, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEmployeeReview, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMultipleApplications, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSignificantEnterprise, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFraud, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMsdIneligible, 29 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIR3, 30 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecialAudit, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFteCount, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommenceDate, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverseasIp, 34 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverseasAddress, 35 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPriorProsecution, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRelatedSuspectedOfFraud, 37 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCurrentAudit, 38 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPriorEvasionAudit, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPrision, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonResident, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRelatedSpecialAudit, 42 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHighNzbnChangeCount, 43 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonActiveInd, 44 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFailedBiometrics, 45 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRiskyBankAccount, 46 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrIpAddress, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIpCountry, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIpCity, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIpProxyType, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNzIpProxy, 51 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccount, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBankAccountAlreadyUsed, 53 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 55 + __off, 93, __dbStmt);
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
        this.fstrRegistrationSource = null;
    } else {
    this.fstrRegistrationSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceReason = null;
    } else {
    this.fstrSourceReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLegalDeclaration = null;
    } else {
    this.fstrLegalDeclaration = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrResidentDeclaration = null;
    } else {
    this.fstrResidentDeclaration = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLossDeclaration = null;
    } else {
    this.fstrLossDeclaration = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExistingBusinessDeclare = null;
    } else {
    this.fstrExistingBusinessDeclare = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWorkingCapitalDeclaration = null;
    } else {
    this.fstrWorkingCapitalDeclaration = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBenefitDeclaration = null;
    } else {
    this.fstrBenefitDeclaration = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAgeDeclaration = null;
    } else {
    this.fstrAgeDeclaration = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMsdVerified = null;
    } else {
    this.fblnMsdVerified = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMsdSubsidyAmount = null;
    } else {
    this.fcurMsdSubsidyAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLoanAllowable = null;
    } else {
    this.fcurLoanAllowable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverrideLoan = null;
    } else {
    this.fblnOverrideLoan = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLoanAmount = null;
    } else {
    this.fcurLoanAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngFullTimeEmployees = null;
    } else {
    this.flngFullTimeEmployees = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngPartTimeEmployees = null;
    } else {
    this.flngPartTimeEmployees = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFte = null;
    } else {
    this.flngFte = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNzbn = null;
    } else {
    this.fstrNzbn = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContactName = null;
    } else {
    this.fstrContactName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUnder18 = null;
    } else {
    this.fblnUnder18 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExistingAccount = null;
    } else {
    this.fblnExistingAccount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCeased = null;
    } else {
    this.fblnCeased = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInsolvent = null;
    } else {
    this.fblnInsolvent = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEmployeeReview = null;
    } else {
    this.fblnEmployeeReview = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMultipleApplications = null;
    } else {
    this.fblnMultipleApplications = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSignificantEnterprise = null;
    } else {
    this.fblnSignificantEnterprise = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFraud = null;
    } else {
    this.fblnFraud = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMsdIneligible = null;
    } else {
    this.fblnMsdIneligible = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIR3 = null;
    } else {
    this.fblnIR3 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSpecialAudit = null;
    } else {
    this.fblnSpecialAudit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFteCount = null;
    } else {
    this.fblnFteCount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCommenceDate = null;
    } else {
    this.fblnCommenceDate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverseasIp = null;
    } else {
    this.fblnOverseasIp = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverseasAddress = null;
    } else {
    this.fblnOverseasAddress = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPriorProsecution = null;
    } else {
    this.fblnPriorProsecution = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRelatedSuspectedOfFraud = null;
    } else {
    this.fblnRelatedSuspectedOfFraud = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCurrentAudit = null;
    } else {
    this.fblnCurrentAudit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPriorEvasionAudit = null;
    } else {
    this.fblnPriorEvasionAudit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPrision = null;
    } else {
    this.fblnPrision = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNonResident = null;
    } else {
    this.fblnNonResident = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRelatedSpecialAudit = null;
    } else {
    this.fblnRelatedSpecialAudit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHighNzbnChangeCount = null;
    } else {
    this.fblnHighNzbnChangeCount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNonActiveInd = null;
    } else {
    this.fblnNonActiveInd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFailedBiometrics = null;
    } else {
    this.fblnFailedBiometrics = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRiskyBankAccount = null;
    } else {
    this.fblnRiskyBankAccount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIpAddress = null;
    } else {
    this.fstrIpAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIpCountry = null;
    } else {
    this.fstrIpCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIpCity = null;
    } else {
    this.fstrIpCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIpProxyType = null;
    } else {
    this.fstrIpProxyType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNzIpProxy = null;
    } else {
    this.fblnNzIpProxy = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccount = null;
    } else {
    this.fstrBankAccount = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnBankAccountAlreadyUsed = null;
    } else {
    this.fblnBankAccountAlreadyUsed = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fstrRegistrationSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegistrationSource);
    }
    if (null == this.fstrSourceReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceReason);
    }
    if (null == this.fstrLegalDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLegalDeclaration);
    }
    if (null == this.fstrResidentDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResidentDeclaration);
    }
    if (null == this.fstrLossDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLossDeclaration);
    }
    if (null == this.fstrExistingBusinessDeclare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExistingBusinessDeclare);
    }
    if (null == this.fstrWorkingCapitalDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkingCapitalDeclaration);
    }
    if (null == this.fstrBenefitDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBenefitDeclaration);
    }
    if (null == this.fstrAgeDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAgeDeclaration);
    }
    if (null == this.fblnMsdVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMsdVerified);
    }
    if (null == this.fcurMsdSubsidyAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMsdSubsidyAmount, __dataOut);
    }
    if (null == this.fcurLoanAllowable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLoanAllowable, __dataOut);
    }
    if (null == this.fblnOverrideLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverrideLoan);
    }
    if (null == this.fcurLoanAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLoanAmount, __dataOut);
    }
    if (null == this.flngFullTimeEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFullTimeEmployees);
    }
    if (null == this.flngPartTimeEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPartTimeEmployees);
    }
    if (null == this.flngFte) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFte);
    }
    if (null == this.fstrNzbn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNzbn);
    }
    if (null == this.fstrContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactName);
    }
    if (null == this.fblnUnder18) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnder18);
    }
    if (null == this.fblnExistingAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExistingAccount);
    }
    if (null == this.fblnCeased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCeased);
    }
    if (null == this.fblnInsolvent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInsolvent);
    }
    if (null == this.fblnEmployeeReview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEmployeeReview);
    }
    if (null == this.fblnMultipleApplications) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultipleApplications);
    }
    if (null == this.fblnSignificantEnterprise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSignificantEnterprise);
    }
    if (null == this.fblnFraud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFraud);
    }
    if (null == this.fblnMsdIneligible) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMsdIneligible);
    }
    if (null == this.fblnIR3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIR3);
    }
    if (null == this.fblnSpecialAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecialAudit);
    }
    if (null == this.fblnFteCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFteCount);
    }
    if (null == this.fblnCommenceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommenceDate);
    }
    if (null == this.fblnOverseasIp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverseasIp);
    }
    if (null == this.fblnOverseasAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverseasAddress);
    }
    if (null == this.fblnPriorProsecution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPriorProsecution);
    }
    if (null == this.fblnRelatedSuspectedOfFraud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRelatedSuspectedOfFraud);
    }
    if (null == this.fblnCurrentAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCurrentAudit);
    }
    if (null == this.fblnPriorEvasionAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPriorEvasionAudit);
    }
    if (null == this.fblnPrision) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPrision);
    }
    if (null == this.fblnNonResident) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonResident);
    }
    if (null == this.fblnRelatedSpecialAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRelatedSpecialAudit);
    }
    if (null == this.fblnHighNzbnChangeCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHighNzbnChangeCount);
    }
    if (null == this.fblnNonActiveInd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonActiveInd);
    }
    if (null == this.fblnFailedBiometrics) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFailedBiometrics);
    }
    if (null == this.fblnRiskyBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRiskyBankAccount);
    }
    if (null == this.fstrIpAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIpAddress);
    }
    if (null == this.fstrIpCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIpCountry);
    }
    if (null == this.fstrIpCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIpCity);
    }
    if (null == this.fstrIpProxyType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIpProxyType);
    }
    if (null == this.fblnNzIpProxy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNzIpProxy);
    }
    if (null == this.fstrBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccount);
    }
    if (null == this.fblnBankAccountAlreadyUsed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBankAccountAlreadyUsed);
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
    if (null == this.fstrRegistrationSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegistrationSource);
    }
    if (null == this.fstrSourceReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceReason);
    }
    if (null == this.fstrLegalDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLegalDeclaration);
    }
    if (null == this.fstrResidentDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResidentDeclaration);
    }
    if (null == this.fstrLossDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLossDeclaration);
    }
    if (null == this.fstrExistingBusinessDeclare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExistingBusinessDeclare);
    }
    if (null == this.fstrWorkingCapitalDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkingCapitalDeclaration);
    }
    if (null == this.fstrBenefitDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBenefitDeclaration);
    }
    if (null == this.fstrAgeDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAgeDeclaration);
    }
    if (null == this.fblnMsdVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMsdVerified);
    }
    if (null == this.fcurMsdSubsidyAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMsdSubsidyAmount, __dataOut);
    }
    if (null == this.fcurLoanAllowable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLoanAllowable, __dataOut);
    }
    if (null == this.fblnOverrideLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverrideLoan);
    }
    if (null == this.fcurLoanAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLoanAmount, __dataOut);
    }
    if (null == this.flngFullTimeEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFullTimeEmployees);
    }
    if (null == this.flngPartTimeEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPartTimeEmployees);
    }
    if (null == this.flngFte) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFte);
    }
    if (null == this.fstrNzbn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNzbn);
    }
    if (null == this.fstrContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactName);
    }
    if (null == this.fblnUnder18) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnder18);
    }
    if (null == this.fblnExistingAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExistingAccount);
    }
    if (null == this.fblnCeased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCeased);
    }
    if (null == this.fblnInsolvent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInsolvent);
    }
    if (null == this.fblnEmployeeReview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEmployeeReview);
    }
    if (null == this.fblnMultipleApplications) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultipleApplications);
    }
    if (null == this.fblnSignificantEnterprise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSignificantEnterprise);
    }
    if (null == this.fblnFraud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFraud);
    }
    if (null == this.fblnMsdIneligible) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMsdIneligible);
    }
    if (null == this.fblnIR3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIR3);
    }
    if (null == this.fblnSpecialAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecialAudit);
    }
    if (null == this.fblnFteCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFteCount);
    }
    if (null == this.fblnCommenceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommenceDate);
    }
    if (null == this.fblnOverseasIp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverseasIp);
    }
    if (null == this.fblnOverseasAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverseasAddress);
    }
    if (null == this.fblnPriorProsecution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPriorProsecution);
    }
    if (null == this.fblnRelatedSuspectedOfFraud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRelatedSuspectedOfFraud);
    }
    if (null == this.fblnCurrentAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCurrentAudit);
    }
    if (null == this.fblnPriorEvasionAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPriorEvasionAudit);
    }
    if (null == this.fblnPrision) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPrision);
    }
    if (null == this.fblnNonResident) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonResident);
    }
    if (null == this.fblnRelatedSpecialAudit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRelatedSpecialAudit);
    }
    if (null == this.fblnHighNzbnChangeCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHighNzbnChangeCount);
    }
    if (null == this.fblnNonActiveInd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonActiveInd);
    }
    if (null == this.fblnFailedBiometrics) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFailedBiometrics);
    }
    if (null == this.fblnRiskyBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRiskyBankAccount);
    }
    if (null == this.fstrIpAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIpAddress);
    }
    if (null == this.fstrIpCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIpCountry);
    }
    if (null == this.fstrIpCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIpCity);
    }
    if (null == this.fstrIpProxyType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIpProxyType);
    }
    if (null == this.fblnNzIpProxy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNzIpProxy);
    }
    if (null == this.fstrBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccount);
    }
    if (null == this.fblnBankAccountAlreadyUsed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBankAccountAlreadyUsed);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegistrationSource==null?"\\N":fstrRegistrationSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceReason==null?"\\N":fstrSourceReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLegalDeclaration==null?"\\N":fstrLegalDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResidentDeclaration==null?"\\N":fstrResidentDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLossDeclaration==null?"\\N":fstrLossDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExistingBusinessDeclare==null?"\\N":fstrExistingBusinessDeclare, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkingCapitalDeclaration==null?"\\N":fstrWorkingCapitalDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBenefitDeclaration==null?"\\N":fstrBenefitDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAgeDeclaration==null?"\\N":fstrAgeDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMsdVerified==null?"\\N":"" + fblnMsdVerified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMsdSubsidyAmount==null?"\\N":fcurMsdSubsidyAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLoanAllowable==null?"\\N":fcurLoanAllowable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverrideLoan==null?"\\N":"" + fblnOverrideLoan, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLoanAmount==null?"\\N":fcurLoanAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFullTimeEmployees==null?"\\N":"" + flngFullTimeEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPartTimeEmployees==null?"\\N":"" + flngPartTimeEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFte==null?"\\N":"" + flngFte, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNzbn==null?"\\N":fstrNzbn, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactName==null?"\\N":fstrContactName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnder18==null?"\\N":"" + fblnUnder18, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExistingAccount==null?"\\N":"" + fblnExistingAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCeased==null?"\\N":"" + fblnCeased, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInsolvent==null?"\\N":"" + fblnInsolvent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEmployeeReview==null?"\\N":"" + fblnEmployeeReview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultipleApplications==null?"\\N":"" + fblnMultipleApplications, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSignificantEnterprise==null?"\\N":"" + fblnSignificantEnterprise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFraud==null?"\\N":"" + fblnFraud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMsdIneligible==null?"\\N":"" + fblnMsdIneligible, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIR3==null?"\\N":"" + fblnIR3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecialAudit==null?"\\N":"" + fblnSpecialAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFteCount==null?"\\N":"" + fblnFteCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommenceDate==null?"\\N":"" + fblnCommenceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverseasIp==null?"\\N":"" + fblnOverseasIp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverseasAddress==null?"\\N":"" + fblnOverseasAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPriorProsecution==null?"\\N":"" + fblnPriorProsecution, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRelatedSuspectedOfFraud==null?"\\N":"" + fblnRelatedSuspectedOfFraud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCurrentAudit==null?"\\N":"" + fblnCurrentAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPriorEvasionAudit==null?"\\N":"" + fblnPriorEvasionAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPrision==null?"\\N":"" + fblnPrision, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonResident==null?"\\N":"" + fblnNonResident, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRelatedSpecialAudit==null?"\\N":"" + fblnRelatedSpecialAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHighNzbnChangeCount==null?"\\N":"" + fblnHighNzbnChangeCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonActiveInd==null?"\\N":"" + fblnNonActiveInd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFailedBiometrics==null?"\\N":"" + fblnFailedBiometrics, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRiskyBankAccount==null?"\\N":"" + fblnRiskyBankAccount, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIpAddress==null?"\\N":fstrIpAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIpCountry==null?"\\N":fstrIpCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIpCity==null?"\\N":fstrIpCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIpProxyType==null?"\\N":fstrIpProxyType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNzIpProxy==null?"\\N":"" + fblnNzIpProxy, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccount==null?"\\N":fstrBankAccount, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBankAccountAlreadyUsed==null?"\\N":"" + fblnBankAccountAlreadyUsed, delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegistrationSource==null?"\\N":fstrRegistrationSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceReason==null?"\\N":fstrSourceReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLegalDeclaration==null?"\\N":fstrLegalDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResidentDeclaration==null?"\\N":fstrResidentDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLossDeclaration==null?"\\N":fstrLossDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExistingBusinessDeclare==null?"\\N":fstrExistingBusinessDeclare, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkingCapitalDeclaration==null?"\\N":fstrWorkingCapitalDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBenefitDeclaration==null?"\\N":fstrBenefitDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAgeDeclaration==null?"\\N":fstrAgeDeclaration, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMsdVerified==null?"\\N":"" + fblnMsdVerified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMsdSubsidyAmount==null?"\\N":fcurMsdSubsidyAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLoanAllowable==null?"\\N":fcurLoanAllowable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverrideLoan==null?"\\N":"" + fblnOverrideLoan, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLoanAmount==null?"\\N":fcurLoanAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFullTimeEmployees==null?"\\N":"" + flngFullTimeEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPartTimeEmployees==null?"\\N":"" + flngPartTimeEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFte==null?"\\N":"" + flngFte, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNzbn==null?"\\N":fstrNzbn, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactName==null?"\\N":fstrContactName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnder18==null?"\\N":"" + fblnUnder18, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExistingAccount==null?"\\N":"" + fblnExistingAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCeased==null?"\\N":"" + fblnCeased, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInsolvent==null?"\\N":"" + fblnInsolvent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEmployeeReview==null?"\\N":"" + fblnEmployeeReview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultipleApplications==null?"\\N":"" + fblnMultipleApplications, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSignificantEnterprise==null?"\\N":"" + fblnSignificantEnterprise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFraud==null?"\\N":"" + fblnFraud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMsdIneligible==null?"\\N":"" + fblnMsdIneligible, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIR3==null?"\\N":"" + fblnIR3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecialAudit==null?"\\N":"" + fblnSpecialAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFteCount==null?"\\N":"" + fblnFteCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommenceDate==null?"\\N":"" + fblnCommenceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverseasIp==null?"\\N":"" + fblnOverseasIp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverseasAddress==null?"\\N":"" + fblnOverseasAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPriorProsecution==null?"\\N":"" + fblnPriorProsecution, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRelatedSuspectedOfFraud==null?"\\N":"" + fblnRelatedSuspectedOfFraud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCurrentAudit==null?"\\N":"" + fblnCurrentAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPriorEvasionAudit==null?"\\N":"" + fblnPriorEvasionAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPrision==null?"\\N":"" + fblnPrision, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonResident==null?"\\N":"" + fblnNonResident, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRelatedSpecialAudit==null?"\\N":"" + fblnRelatedSpecialAudit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHighNzbnChangeCount==null?"\\N":"" + fblnHighNzbnChangeCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonActiveInd==null?"\\N":"" + fblnNonActiveInd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFailedBiometrics==null?"\\N":"" + fblnFailedBiometrics, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRiskyBankAccount==null?"\\N":"" + fblnRiskyBankAccount, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIpAddress==null?"\\N":fstrIpAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIpCountry==null?"\\N":fstrIpCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIpCity==null?"\\N":fstrIpCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIpProxyType==null?"\\N":fstrIpProxyType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNzIpProxy==null?"\\N":"" + fblnNzIpProxy, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccount==null?"\\N":fstrBankAccount, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBankAccountAlreadyUsed==null?"\\N":"" + fblnBankAccountAlreadyUsed, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrRegistrationSource = null; } else {
      this.fstrRegistrationSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceReason = null; } else {
      this.fstrSourceReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLegalDeclaration = null; } else {
      this.fstrLegalDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResidentDeclaration = null; } else {
      this.fstrResidentDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLossDeclaration = null; } else {
      this.fstrLossDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExistingBusinessDeclare = null; } else {
      this.fstrExistingBusinessDeclare = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkingCapitalDeclaration = null; } else {
      this.fstrWorkingCapitalDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBenefitDeclaration = null; } else {
      this.fstrBenefitDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAgeDeclaration = null; } else {
      this.fstrAgeDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMsdVerified = null; } else {
      this.fblnMsdVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMsdSubsidyAmount = null; } else {
      this.fcurMsdSubsidyAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLoanAllowable = null; } else {
      this.fcurLoanAllowable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverrideLoan = null; } else {
      this.fblnOverrideLoan = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLoanAmount = null; } else {
      this.fcurLoanAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFullTimeEmployees = null; } else {
      this.flngFullTimeEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPartTimeEmployees = null; } else {
      this.flngPartTimeEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFte = null; } else {
      this.flngFte = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNzbn = null; } else {
      this.fstrNzbn = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactName = null; } else {
      this.fstrContactName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnder18 = null; } else {
      this.fblnUnder18 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExistingAccount = null; } else {
      this.fblnExistingAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCeased = null; } else {
      this.fblnCeased = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInsolvent = null; } else {
      this.fblnInsolvent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEmployeeReview = null; } else {
      this.fblnEmployeeReview = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultipleApplications = null; } else {
      this.fblnMultipleApplications = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSignificantEnterprise = null; } else {
      this.fblnSignificantEnterprise = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFraud = null; } else {
      this.fblnFraud = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMsdIneligible = null; } else {
      this.fblnMsdIneligible = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIR3 = null; } else {
      this.fblnIR3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecialAudit = null; } else {
      this.fblnSpecialAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFteCount = null; } else {
      this.fblnFteCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommenceDate = null; } else {
      this.fblnCommenceDate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverseasIp = null; } else {
      this.fblnOverseasIp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverseasAddress = null; } else {
      this.fblnOverseasAddress = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPriorProsecution = null; } else {
      this.fblnPriorProsecution = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRelatedSuspectedOfFraud = null; } else {
      this.fblnRelatedSuspectedOfFraud = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCurrentAudit = null; } else {
      this.fblnCurrentAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPriorEvasionAudit = null; } else {
      this.fblnPriorEvasionAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPrision = null; } else {
      this.fblnPrision = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonResident = null; } else {
      this.fblnNonResident = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRelatedSpecialAudit = null; } else {
      this.fblnRelatedSpecialAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHighNzbnChangeCount = null; } else {
      this.fblnHighNzbnChangeCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonActiveInd = null; } else {
      this.fblnNonActiveInd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFailedBiometrics = null; } else {
      this.fblnFailedBiometrics = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRiskyBankAccount = null; } else {
      this.fblnRiskyBankAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIpAddress = null; } else {
      this.fstrIpAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIpCountry = null; } else {
      this.fstrIpCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIpCity = null; } else {
      this.fstrIpCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIpProxyType = null; } else {
      this.fstrIpProxyType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNzIpProxy = null; } else {
      this.fblnNzIpProxy = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccount = null; } else {
      this.fstrBankAccount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBankAccountAlreadyUsed = null; } else {
      this.fblnBankAccountAlreadyUsed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRegistrationSource = null; } else {
      this.fstrRegistrationSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceReason = null; } else {
      this.fstrSourceReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLegalDeclaration = null; } else {
      this.fstrLegalDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResidentDeclaration = null; } else {
      this.fstrResidentDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLossDeclaration = null; } else {
      this.fstrLossDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExistingBusinessDeclare = null; } else {
      this.fstrExistingBusinessDeclare = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkingCapitalDeclaration = null; } else {
      this.fstrWorkingCapitalDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBenefitDeclaration = null; } else {
      this.fstrBenefitDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAgeDeclaration = null; } else {
      this.fstrAgeDeclaration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMsdVerified = null; } else {
      this.fblnMsdVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMsdSubsidyAmount = null; } else {
      this.fcurMsdSubsidyAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLoanAllowable = null; } else {
      this.fcurLoanAllowable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverrideLoan = null; } else {
      this.fblnOverrideLoan = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLoanAmount = null; } else {
      this.fcurLoanAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFullTimeEmployees = null; } else {
      this.flngFullTimeEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPartTimeEmployees = null; } else {
      this.flngPartTimeEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFte = null; } else {
      this.flngFte = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNzbn = null; } else {
      this.fstrNzbn = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactName = null; } else {
      this.fstrContactName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnder18 = null; } else {
      this.fblnUnder18 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExistingAccount = null; } else {
      this.fblnExistingAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCeased = null; } else {
      this.fblnCeased = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInsolvent = null; } else {
      this.fblnInsolvent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEmployeeReview = null; } else {
      this.fblnEmployeeReview = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultipleApplications = null; } else {
      this.fblnMultipleApplications = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSignificantEnterprise = null; } else {
      this.fblnSignificantEnterprise = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFraud = null; } else {
      this.fblnFraud = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMsdIneligible = null; } else {
      this.fblnMsdIneligible = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIR3 = null; } else {
      this.fblnIR3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecialAudit = null; } else {
      this.fblnSpecialAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFteCount = null; } else {
      this.fblnFteCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommenceDate = null; } else {
      this.fblnCommenceDate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverseasIp = null; } else {
      this.fblnOverseasIp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverseasAddress = null; } else {
      this.fblnOverseasAddress = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPriorProsecution = null; } else {
      this.fblnPriorProsecution = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRelatedSuspectedOfFraud = null; } else {
      this.fblnRelatedSuspectedOfFraud = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCurrentAudit = null; } else {
      this.fblnCurrentAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPriorEvasionAudit = null; } else {
      this.fblnPriorEvasionAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPrision = null; } else {
      this.fblnPrision = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonResident = null; } else {
      this.fblnNonResident = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRelatedSpecialAudit = null; } else {
      this.fblnRelatedSpecialAudit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHighNzbnChangeCount = null; } else {
      this.fblnHighNzbnChangeCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonActiveInd = null; } else {
      this.fblnNonActiveInd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFailedBiometrics = null; } else {
      this.fblnFailedBiometrics = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRiskyBankAccount = null; } else {
      this.fblnRiskyBankAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIpAddress = null; } else {
      this.fstrIpAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIpCountry = null; } else {
      this.fstrIpCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIpCity = null; } else {
      this.fstrIpCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIpProxyType = null; } else {
      this.fstrIpProxyType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNzIpProxy = null; } else {
      this.fblnNzIpProxy = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccount = null; } else {
      this.fstrBankAccount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBankAccountAlreadyUsed = null; } else {
      this.fblnBankAccountAlreadyUsed = Integer.valueOf(__cur_str);
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
    tblnz_cassbcregistration o = (tblnz_cassbcregistration) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_cassbcregistration o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrRegistrationSource", this.fstrRegistrationSource);
    __sqoop$field_map.put("fstrSourceReason", this.fstrSourceReason);
    __sqoop$field_map.put("fstrLegalDeclaration", this.fstrLegalDeclaration);
    __sqoop$field_map.put("fstrResidentDeclaration", this.fstrResidentDeclaration);
    __sqoop$field_map.put("fstrLossDeclaration", this.fstrLossDeclaration);
    __sqoop$field_map.put("fstrExistingBusinessDeclare", this.fstrExistingBusinessDeclare);
    __sqoop$field_map.put("fstrWorkingCapitalDeclaration", this.fstrWorkingCapitalDeclaration);
    __sqoop$field_map.put("fstrBenefitDeclaration", this.fstrBenefitDeclaration);
    __sqoop$field_map.put("fstrAgeDeclaration", this.fstrAgeDeclaration);
    __sqoop$field_map.put("fblnMsdVerified", this.fblnMsdVerified);
    __sqoop$field_map.put("fcurMsdSubsidyAmount", this.fcurMsdSubsidyAmount);
    __sqoop$field_map.put("fcurLoanAllowable", this.fcurLoanAllowable);
    __sqoop$field_map.put("fblnOverrideLoan", this.fblnOverrideLoan);
    __sqoop$field_map.put("fcurLoanAmount", this.fcurLoanAmount);
    __sqoop$field_map.put("flngFullTimeEmployees", this.flngFullTimeEmployees);
    __sqoop$field_map.put("flngPartTimeEmployees", this.flngPartTimeEmployees);
    __sqoop$field_map.put("flngFte", this.flngFte);
    __sqoop$field_map.put("fstrNzbn", this.fstrNzbn);
    __sqoop$field_map.put("fstrContactName", this.fstrContactName);
    __sqoop$field_map.put("fblnUnder18", this.fblnUnder18);
    __sqoop$field_map.put("fblnExistingAccount", this.fblnExistingAccount);
    __sqoop$field_map.put("fblnCeased", this.fblnCeased);
    __sqoop$field_map.put("fblnInsolvent", this.fblnInsolvent);
    __sqoop$field_map.put("fblnEmployeeReview", this.fblnEmployeeReview);
    __sqoop$field_map.put("fblnMultipleApplications", this.fblnMultipleApplications);
    __sqoop$field_map.put("fblnSignificantEnterprise", this.fblnSignificantEnterprise);
    __sqoop$field_map.put("fblnFraud", this.fblnFraud);
    __sqoop$field_map.put("fblnMsdIneligible", this.fblnMsdIneligible);
    __sqoop$field_map.put("fblnIR3", this.fblnIR3);
    __sqoop$field_map.put("fblnSpecialAudit", this.fblnSpecialAudit);
    __sqoop$field_map.put("fblnFteCount", this.fblnFteCount);
    __sqoop$field_map.put("fblnCommenceDate", this.fblnCommenceDate);
    __sqoop$field_map.put("fblnOverseasIp", this.fblnOverseasIp);
    __sqoop$field_map.put("fblnOverseasAddress", this.fblnOverseasAddress);
    __sqoop$field_map.put("fblnPriorProsecution", this.fblnPriorProsecution);
    __sqoop$field_map.put("fblnRelatedSuspectedOfFraud", this.fblnRelatedSuspectedOfFraud);
    __sqoop$field_map.put("fblnCurrentAudit", this.fblnCurrentAudit);
    __sqoop$field_map.put("fblnPriorEvasionAudit", this.fblnPriorEvasionAudit);
    __sqoop$field_map.put("fblnPrision", this.fblnPrision);
    __sqoop$field_map.put("fblnNonResident", this.fblnNonResident);
    __sqoop$field_map.put("fblnRelatedSpecialAudit", this.fblnRelatedSpecialAudit);
    __sqoop$field_map.put("fblnHighNzbnChangeCount", this.fblnHighNzbnChangeCount);
    __sqoop$field_map.put("fblnNonActiveInd", this.fblnNonActiveInd);
    __sqoop$field_map.put("fblnFailedBiometrics", this.fblnFailedBiometrics);
    __sqoop$field_map.put("fblnRiskyBankAccount", this.fblnRiskyBankAccount);
    __sqoop$field_map.put("fstrIpAddress", this.fstrIpAddress);
    __sqoop$field_map.put("fstrIpCountry", this.fstrIpCountry);
    __sqoop$field_map.put("fstrIpCity", this.fstrIpCity);
    __sqoop$field_map.put("fstrIpProxyType", this.fstrIpProxyType);
    __sqoop$field_map.put("fblnNzIpProxy", this.fblnNzIpProxy);
    __sqoop$field_map.put("fstrBankAccount", this.fstrBankAccount);
    __sqoop$field_map.put("fblnBankAccountAlreadyUsed", this.fblnBankAccountAlreadyUsed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrRegistrationSource", this.fstrRegistrationSource);
    __sqoop$field_map.put("fstrSourceReason", this.fstrSourceReason);
    __sqoop$field_map.put("fstrLegalDeclaration", this.fstrLegalDeclaration);
    __sqoop$field_map.put("fstrResidentDeclaration", this.fstrResidentDeclaration);
    __sqoop$field_map.put("fstrLossDeclaration", this.fstrLossDeclaration);
    __sqoop$field_map.put("fstrExistingBusinessDeclare", this.fstrExistingBusinessDeclare);
    __sqoop$field_map.put("fstrWorkingCapitalDeclaration", this.fstrWorkingCapitalDeclaration);
    __sqoop$field_map.put("fstrBenefitDeclaration", this.fstrBenefitDeclaration);
    __sqoop$field_map.put("fstrAgeDeclaration", this.fstrAgeDeclaration);
    __sqoop$field_map.put("fblnMsdVerified", this.fblnMsdVerified);
    __sqoop$field_map.put("fcurMsdSubsidyAmount", this.fcurMsdSubsidyAmount);
    __sqoop$field_map.put("fcurLoanAllowable", this.fcurLoanAllowable);
    __sqoop$field_map.put("fblnOverrideLoan", this.fblnOverrideLoan);
    __sqoop$field_map.put("fcurLoanAmount", this.fcurLoanAmount);
    __sqoop$field_map.put("flngFullTimeEmployees", this.flngFullTimeEmployees);
    __sqoop$field_map.put("flngPartTimeEmployees", this.flngPartTimeEmployees);
    __sqoop$field_map.put("flngFte", this.flngFte);
    __sqoop$field_map.put("fstrNzbn", this.fstrNzbn);
    __sqoop$field_map.put("fstrContactName", this.fstrContactName);
    __sqoop$field_map.put("fblnUnder18", this.fblnUnder18);
    __sqoop$field_map.put("fblnExistingAccount", this.fblnExistingAccount);
    __sqoop$field_map.put("fblnCeased", this.fblnCeased);
    __sqoop$field_map.put("fblnInsolvent", this.fblnInsolvent);
    __sqoop$field_map.put("fblnEmployeeReview", this.fblnEmployeeReview);
    __sqoop$field_map.put("fblnMultipleApplications", this.fblnMultipleApplications);
    __sqoop$field_map.put("fblnSignificantEnterprise", this.fblnSignificantEnterprise);
    __sqoop$field_map.put("fblnFraud", this.fblnFraud);
    __sqoop$field_map.put("fblnMsdIneligible", this.fblnMsdIneligible);
    __sqoop$field_map.put("fblnIR3", this.fblnIR3);
    __sqoop$field_map.put("fblnSpecialAudit", this.fblnSpecialAudit);
    __sqoop$field_map.put("fblnFteCount", this.fblnFteCount);
    __sqoop$field_map.put("fblnCommenceDate", this.fblnCommenceDate);
    __sqoop$field_map.put("fblnOverseasIp", this.fblnOverseasIp);
    __sqoop$field_map.put("fblnOverseasAddress", this.fblnOverseasAddress);
    __sqoop$field_map.put("fblnPriorProsecution", this.fblnPriorProsecution);
    __sqoop$field_map.put("fblnRelatedSuspectedOfFraud", this.fblnRelatedSuspectedOfFraud);
    __sqoop$field_map.put("fblnCurrentAudit", this.fblnCurrentAudit);
    __sqoop$field_map.put("fblnPriorEvasionAudit", this.fblnPriorEvasionAudit);
    __sqoop$field_map.put("fblnPrision", this.fblnPrision);
    __sqoop$field_map.put("fblnNonResident", this.fblnNonResident);
    __sqoop$field_map.put("fblnRelatedSpecialAudit", this.fblnRelatedSpecialAudit);
    __sqoop$field_map.put("fblnHighNzbnChangeCount", this.fblnHighNzbnChangeCount);
    __sqoop$field_map.put("fblnNonActiveInd", this.fblnNonActiveInd);
    __sqoop$field_map.put("fblnFailedBiometrics", this.fblnFailedBiometrics);
    __sqoop$field_map.put("fblnRiskyBankAccount", this.fblnRiskyBankAccount);
    __sqoop$field_map.put("fstrIpAddress", this.fstrIpAddress);
    __sqoop$field_map.put("fstrIpCountry", this.fstrIpCountry);
    __sqoop$field_map.put("fstrIpCity", this.fstrIpCity);
    __sqoop$field_map.put("fstrIpProxyType", this.fstrIpProxyType);
    __sqoop$field_map.put("fblnNzIpProxy", this.fblnNzIpProxy);
    __sqoop$field_map.put("fstrBankAccount", this.fstrBankAccount);
    __sqoop$field_map.put("fblnBankAccountAlreadyUsed", this.fblnBankAccountAlreadyUsed);
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
