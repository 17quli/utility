// ORM class for table 'tblnz_ksb2bgvcclaiminbound'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:30:57 NZDT 2020
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

public class tblnz_ksb2bgvcclaiminbound extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64KSB2BKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fi64KSB2BKey = (Long)value;
      }
    });
    setters.put("fstrClaimID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrClaimID = (String)value;
      }
    });
    setters.put("fstrMemberTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberTitle = (String)value;
      }
    });
    setters.put("fstrMemberFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberFirstName = (String)value;
      }
    });
    setters.put("fstrMemberFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberFamilyName = (String)value;
      }
    });
    setters.put("fstrMemberAddress1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberAddress1 = (String)value;
      }
    });
    setters.put("fstrMemberStreet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberStreet = (String)value;
      }
    });
    setters.put("fstrMemberStreet2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberStreet2 = (String)value;
      }
    });
    setters.put("fstrMemberAddress2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberAddress2 = (String)value;
      }
    });
    setters.put("fstrMemberUrbanization", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberUrbanization = (String)value;
      }
    });
    setters.put("fstrMemberCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberCity = (String)value;
      }
    });
    setters.put("fstrMemberPostcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberPostcode = (String)value;
      }
    });
    setters.put("fstrMemberCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrMemberCountry = (String)value;
      }
    });
    setters.put("fdtmAddressChange", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fdtmAddressChange = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintClaimInfoType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fintClaimInfoType = (Integer)value;
      }
    });
    setters.put("fdtmFirstPaymentReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fdtmFirstPaymentReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintEligibleDays", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fintEligibleDays = (Integer)value;
      }
    });
    setters.put("fblnIgnoreEligibleDays", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fblnIgnoreEligibleDays = (Integer)value;
      }
    });
    setters.put("fcurDirectContributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fcurDirectContributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnIgnoreDirectContributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fblnIgnoreDirectContributions = (Integer)value;
      }
    });
    setters.put("fcurMortgageDiversionAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fcurMortgageDiversionAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnIgnoreMortgageDiversion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fblnIgnoreMortgageDiversion = (Integer)value;
      }
    });
    setters.put("fdtmClaimPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fdtmClaimPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bgvcclaiminbound.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ksb2bgvcclaiminbound() {
    init0();
  }
  private Long fi64KSB2BKey;
  public Long get_fi64KSB2BKey() {
    return fi64KSB2BKey;
  }
  public void set_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
  }
  public tblnz_ksb2bgvcclaiminbound with_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
    return this;
  }
  private String fstrClaimID;
  public String get_fstrClaimID() {
    return fstrClaimID;
  }
  public void set_fstrClaimID(String fstrClaimID) {
    this.fstrClaimID = fstrClaimID;
  }
  public tblnz_ksb2bgvcclaiminbound with_fstrClaimID(String fstrClaimID) {
    this.fstrClaimID = fstrClaimID;
    return this;
  }
  private String fstrMemberTitle;
  public String get_fstrMemberTitle() {
    return fstrMemberTitle;
  }
  public void set_fstrMemberTitle(String fstrMemberTitle) {
    this.fstrMemberTitle = fstrMemberTitle;
  }
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberTitle(String fstrMemberTitle) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberFirstName(String fstrMemberFirstName) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberFamilyName(String fstrMemberFamilyName) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberAddress1(String fstrMemberAddress1) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberStreet(String fstrMemberStreet) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberStreet2(String fstrMemberStreet2) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberAddress2(String fstrMemberAddress2) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberUrbanization(String fstrMemberUrbanization) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberCity(String fstrMemberCity) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberPostcode(String fstrMemberPostcode) {
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
  public tblnz_ksb2bgvcclaiminbound with_fstrMemberCountry(String fstrMemberCountry) {
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
  public tblnz_ksb2bgvcclaiminbound with_fdtmAddressChange(java.sql.Timestamp fdtmAddressChange) {
    this.fdtmAddressChange = fdtmAddressChange;
    return this;
  }
  private Integer fintClaimInfoType;
  public Integer get_fintClaimInfoType() {
    return fintClaimInfoType;
  }
  public void set_fintClaimInfoType(Integer fintClaimInfoType) {
    this.fintClaimInfoType = fintClaimInfoType;
  }
  public tblnz_ksb2bgvcclaiminbound with_fintClaimInfoType(Integer fintClaimInfoType) {
    this.fintClaimInfoType = fintClaimInfoType;
    return this;
  }
  private java.sql.Timestamp fdtmFirstPaymentReceived;
  public java.sql.Timestamp get_fdtmFirstPaymentReceived() {
    return fdtmFirstPaymentReceived;
  }
  public void set_fdtmFirstPaymentReceived(java.sql.Timestamp fdtmFirstPaymentReceived) {
    this.fdtmFirstPaymentReceived = fdtmFirstPaymentReceived;
  }
  public tblnz_ksb2bgvcclaiminbound with_fdtmFirstPaymentReceived(java.sql.Timestamp fdtmFirstPaymentReceived) {
    this.fdtmFirstPaymentReceived = fdtmFirstPaymentReceived;
    return this;
  }
  private Integer fintEligibleDays;
  public Integer get_fintEligibleDays() {
    return fintEligibleDays;
  }
  public void set_fintEligibleDays(Integer fintEligibleDays) {
    this.fintEligibleDays = fintEligibleDays;
  }
  public tblnz_ksb2bgvcclaiminbound with_fintEligibleDays(Integer fintEligibleDays) {
    this.fintEligibleDays = fintEligibleDays;
    return this;
  }
  private Integer fblnIgnoreEligibleDays;
  public Integer get_fblnIgnoreEligibleDays() {
    return fblnIgnoreEligibleDays;
  }
  public void set_fblnIgnoreEligibleDays(Integer fblnIgnoreEligibleDays) {
    this.fblnIgnoreEligibleDays = fblnIgnoreEligibleDays;
  }
  public tblnz_ksb2bgvcclaiminbound with_fblnIgnoreEligibleDays(Integer fblnIgnoreEligibleDays) {
    this.fblnIgnoreEligibleDays = fblnIgnoreEligibleDays;
    return this;
  }
  private java.math.BigDecimal fcurDirectContributions;
  public java.math.BigDecimal get_fcurDirectContributions() {
    return fcurDirectContributions;
  }
  public void set_fcurDirectContributions(java.math.BigDecimal fcurDirectContributions) {
    this.fcurDirectContributions = fcurDirectContributions;
  }
  public tblnz_ksb2bgvcclaiminbound with_fcurDirectContributions(java.math.BigDecimal fcurDirectContributions) {
    this.fcurDirectContributions = fcurDirectContributions;
    return this;
  }
  private Integer fblnIgnoreDirectContributions;
  public Integer get_fblnIgnoreDirectContributions() {
    return fblnIgnoreDirectContributions;
  }
  public void set_fblnIgnoreDirectContributions(Integer fblnIgnoreDirectContributions) {
    this.fblnIgnoreDirectContributions = fblnIgnoreDirectContributions;
  }
  public tblnz_ksb2bgvcclaiminbound with_fblnIgnoreDirectContributions(Integer fblnIgnoreDirectContributions) {
    this.fblnIgnoreDirectContributions = fblnIgnoreDirectContributions;
    return this;
  }
  private java.math.BigDecimal fcurMortgageDiversionAmount;
  public java.math.BigDecimal get_fcurMortgageDiversionAmount() {
    return fcurMortgageDiversionAmount;
  }
  public void set_fcurMortgageDiversionAmount(java.math.BigDecimal fcurMortgageDiversionAmount) {
    this.fcurMortgageDiversionAmount = fcurMortgageDiversionAmount;
  }
  public tblnz_ksb2bgvcclaiminbound with_fcurMortgageDiversionAmount(java.math.BigDecimal fcurMortgageDiversionAmount) {
    this.fcurMortgageDiversionAmount = fcurMortgageDiversionAmount;
    return this;
  }
  private Integer fblnIgnoreMortgageDiversion;
  public Integer get_fblnIgnoreMortgageDiversion() {
    return fblnIgnoreMortgageDiversion;
  }
  public void set_fblnIgnoreMortgageDiversion(Integer fblnIgnoreMortgageDiversion) {
    this.fblnIgnoreMortgageDiversion = fblnIgnoreMortgageDiversion;
  }
  public tblnz_ksb2bgvcclaiminbound with_fblnIgnoreMortgageDiversion(Integer fblnIgnoreMortgageDiversion) {
    this.fblnIgnoreMortgageDiversion = fblnIgnoreMortgageDiversion;
    return this;
  }
  private java.sql.Timestamp fdtmClaimPeriod;
  public java.sql.Timestamp get_fdtmClaimPeriod() {
    return fdtmClaimPeriod;
  }
  public void set_fdtmClaimPeriod(java.sql.Timestamp fdtmClaimPeriod) {
    this.fdtmClaimPeriod = fdtmClaimPeriod;
  }
  public tblnz_ksb2bgvcclaiminbound with_fdtmClaimPeriod(java.sql.Timestamp fdtmClaimPeriod) {
    this.fdtmClaimPeriod = fdtmClaimPeriod;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ksb2bgvcclaiminbound with_fstrWho(String fstrWho) {
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
  public tblnz_ksb2bgvcclaiminbound with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksb2bgvcclaiminbound)) {
      return false;
    }
    tblnz_ksb2bgvcclaiminbound that = (tblnz_ksb2bgvcclaiminbound) o;
    boolean equal = true;
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.fstrClaimID == null ? that.fstrClaimID == null : this.fstrClaimID.equals(that.fstrClaimID));
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
    equal = equal && (this.fintClaimInfoType == null ? that.fintClaimInfoType == null : this.fintClaimInfoType.equals(that.fintClaimInfoType));
    equal = equal && (this.fdtmFirstPaymentReceived == null ? that.fdtmFirstPaymentReceived == null : this.fdtmFirstPaymentReceived.equals(that.fdtmFirstPaymentReceived));
    equal = equal && (this.fintEligibleDays == null ? that.fintEligibleDays == null : this.fintEligibleDays.equals(that.fintEligibleDays));
    equal = equal && (this.fblnIgnoreEligibleDays == null ? that.fblnIgnoreEligibleDays == null : this.fblnIgnoreEligibleDays.equals(that.fblnIgnoreEligibleDays));
    equal = equal && (this.fcurDirectContributions == null ? that.fcurDirectContributions == null : this.fcurDirectContributions.equals(that.fcurDirectContributions));
    equal = equal && (this.fblnIgnoreDirectContributions == null ? that.fblnIgnoreDirectContributions == null : this.fblnIgnoreDirectContributions.equals(that.fblnIgnoreDirectContributions));
    equal = equal && (this.fcurMortgageDiversionAmount == null ? that.fcurMortgageDiversionAmount == null : this.fcurMortgageDiversionAmount.equals(that.fcurMortgageDiversionAmount));
    equal = equal && (this.fblnIgnoreMortgageDiversion == null ? that.fblnIgnoreMortgageDiversion == null : this.fblnIgnoreMortgageDiversion.equals(that.fblnIgnoreMortgageDiversion));
    equal = equal && (this.fdtmClaimPeriod == null ? that.fdtmClaimPeriod == null : this.fdtmClaimPeriod.equals(that.fdtmClaimPeriod));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksb2bgvcclaiminbound)) {
      return false;
    }
    tblnz_ksb2bgvcclaiminbound that = (tblnz_ksb2bgvcclaiminbound) o;
    boolean equal = true;
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.fstrClaimID == null ? that.fstrClaimID == null : this.fstrClaimID.equals(that.fstrClaimID));
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
    equal = equal && (this.fintClaimInfoType == null ? that.fintClaimInfoType == null : this.fintClaimInfoType.equals(that.fintClaimInfoType));
    equal = equal && (this.fdtmFirstPaymentReceived == null ? that.fdtmFirstPaymentReceived == null : this.fdtmFirstPaymentReceived.equals(that.fdtmFirstPaymentReceived));
    equal = equal && (this.fintEligibleDays == null ? that.fintEligibleDays == null : this.fintEligibleDays.equals(that.fintEligibleDays));
    equal = equal && (this.fblnIgnoreEligibleDays == null ? that.fblnIgnoreEligibleDays == null : this.fblnIgnoreEligibleDays.equals(that.fblnIgnoreEligibleDays));
    equal = equal && (this.fcurDirectContributions == null ? that.fcurDirectContributions == null : this.fcurDirectContributions.equals(that.fcurDirectContributions));
    equal = equal && (this.fblnIgnoreDirectContributions == null ? that.fblnIgnoreDirectContributions == null : this.fblnIgnoreDirectContributions.equals(that.fblnIgnoreDirectContributions));
    equal = equal && (this.fcurMortgageDiversionAmount == null ? that.fcurMortgageDiversionAmount == null : this.fcurMortgageDiversionAmount.equals(that.fcurMortgageDiversionAmount));
    equal = equal && (this.fblnIgnoreMortgageDiversion == null ? that.fblnIgnoreMortgageDiversion == null : this.fblnIgnoreMortgageDiversion.equals(that.fblnIgnoreMortgageDiversion));
    equal = equal && (this.fdtmClaimPeriod == null ? that.fdtmClaimPeriod == null : this.fdtmClaimPeriod.equals(that.fdtmClaimPeriod));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fstrClaimID = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrMemberTitle = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrMemberFirstName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrMemberFamilyName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrMemberAddress1 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMemberStreet = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrMemberStreet2 = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrMemberAddress2 = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrMemberUrbanization = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrMemberCity = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrMemberPostcode = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrMemberCountry = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmAddressChange = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fintClaimInfoType = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmFirstPaymentReceived = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fintEligibleDays = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnIgnoreEligibleDays = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fcurDirectContributions = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fblnIgnoreDirectContributions = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fcurMortgageDiversionAmount = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fblnIgnoreMortgageDiversion = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fdtmClaimPeriod = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(24, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(25, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fstrClaimID = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrMemberTitle = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrMemberFirstName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrMemberFamilyName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrMemberAddress1 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMemberStreet = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrMemberStreet2 = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrMemberAddress2 = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrMemberUrbanization = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrMemberCity = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrMemberPostcode = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrMemberCountry = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmAddressChange = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fintClaimInfoType = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmFirstPaymentReceived = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fintEligibleDays = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnIgnoreEligibleDays = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fcurDirectContributions = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fblnIgnoreDirectContributions = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fcurMortgageDiversionAmount = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fblnIgnoreMortgageDiversion = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fdtmClaimPeriod = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(24, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(25, __dbResults);
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
    JdbcWritableBridge.writeString(fstrClaimID, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberTitle, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFirstName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFamilyName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberAddress1, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberStreet, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberStreet2, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberAddress2, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberUrbanization, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberCity, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberPostcode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberCountry, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAddressChange, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintClaimInfoType, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFirstPaymentReceived, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEligibleDays, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIgnoreEligibleDays, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDirectContributions, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIgnoreDirectContributions, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMortgageDiversionAmount, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIgnoreMortgageDiversion, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClaimPeriod, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 25 + __off, 93, __dbStmt);
    return 25;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64KSB2BKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrClaimID, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberTitle, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFirstName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFamilyName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberAddress1, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberStreet, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberStreet2, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberAddress2, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberUrbanization, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberCity, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberPostcode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberCountry, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAddressChange, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintClaimInfoType, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFirstPaymentReceived, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEligibleDays, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIgnoreEligibleDays, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDirectContributions, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIgnoreDirectContributions, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMortgageDiversionAmount, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIgnoreMortgageDiversion, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClaimPeriod, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 25 + __off, 93, __dbStmt);
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
        this.fstrClaimID = null;
    } else {
    this.fstrClaimID = Text.readString(__dataIn);
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
        this.fintClaimInfoType = null;
    } else {
    this.fintClaimInfoType = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFirstPaymentReceived = null;
    } else {
    this.fdtmFirstPaymentReceived = new Timestamp(__dataIn.readLong());
    this.fdtmFirstPaymentReceived.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintEligibleDays = null;
    } else {
    this.fintEligibleDays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIgnoreEligibleDays = null;
    } else {
    this.fblnIgnoreEligibleDays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDirectContributions = null;
    } else {
    this.fcurDirectContributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIgnoreDirectContributions = null;
    } else {
    this.fblnIgnoreDirectContributions = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMortgageDiversionAmount = null;
    } else {
    this.fcurMortgageDiversionAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIgnoreMortgageDiversion = null;
    } else {
    this.fblnIgnoreMortgageDiversion = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClaimPeriod = null;
    } else {
    this.fdtmClaimPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmClaimPeriod.setNanos(__dataIn.readInt());
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
    if (null == this.fstrClaimID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClaimID);
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
    if (null == this.fintClaimInfoType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintClaimInfoType);
    }
    if (null == this.fdtmFirstPaymentReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFirstPaymentReceived.getTime());
    __dataOut.writeInt(this.fdtmFirstPaymentReceived.getNanos());
    }
    if (null == this.fintEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEligibleDays);
    }
    if (null == this.fblnIgnoreEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIgnoreEligibleDays);
    }
    if (null == this.fcurDirectContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDirectContributions, __dataOut);
    }
    if (null == this.fblnIgnoreDirectContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIgnoreDirectContributions);
    }
    if (null == this.fcurMortgageDiversionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMortgageDiversionAmount, __dataOut);
    }
    if (null == this.fblnIgnoreMortgageDiversion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIgnoreMortgageDiversion);
    }
    if (null == this.fdtmClaimPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClaimPeriod.getTime());
    __dataOut.writeInt(this.fdtmClaimPeriod.getNanos());
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
    if (null == this.fstrClaimID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClaimID);
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
    if (null == this.fintClaimInfoType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintClaimInfoType);
    }
    if (null == this.fdtmFirstPaymentReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFirstPaymentReceived.getTime());
    __dataOut.writeInt(this.fdtmFirstPaymentReceived.getNanos());
    }
    if (null == this.fintEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEligibleDays);
    }
    if (null == this.fblnIgnoreEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIgnoreEligibleDays);
    }
    if (null == this.fcurDirectContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDirectContributions, __dataOut);
    }
    if (null == this.fblnIgnoreDirectContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIgnoreDirectContributions);
    }
    if (null == this.fcurMortgageDiversionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMortgageDiversionAmount, __dataOut);
    }
    if (null == this.fblnIgnoreMortgageDiversion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIgnoreMortgageDiversion);
    }
    if (null == this.fdtmClaimPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClaimPeriod.getTime());
    __dataOut.writeInt(this.fdtmClaimPeriod.getNanos());
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClaimID==null?"\\N":fstrClaimID, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintClaimInfoType==null?"\\N":"" + fintClaimInfoType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFirstPaymentReceived==null?"\\N":"" + fdtmFirstPaymentReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEligibleDays==null?"\\N":"" + fintEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIgnoreEligibleDays==null?"\\N":"" + fblnIgnoreEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDirectContributions==null?"\\N":fcurDirectContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIgnoreDirectContributions==null?"\\N":"" + fblnIgnoreDirectContributions, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMortgageDiversionAmount==null?"\\N":fcurMortgageDiversionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIgnoreMortgageDiversion==null?"\\N":"" + fblnIgnoreMortgageDiversion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClaimPeriod==null?"\\N":"" + fdtmClaimPeriod, delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClaimID==null?"\\N":fstrClaimID, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintClaimInfoType==null?"\\N":"" + fintClaimInfoType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFirstPaymentReceived==null?"\\N":"" + fdtmFirstPaymentReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEligibleDays==null?"\\N":"" + fintEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIgnoreEligibleDays==null?"\\N":"" + fblnIgnoreEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDirectContributions==null?"\\N":fcurDirectContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIgnoreDirectContributions==null?"\\N":"" + fblnIgnoreDirectContributions, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMortgageDiversionAmount==null?"\\N":fcurMortgageDiversionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIgnoreMortgageDiversion==null?"\\N":"" + fblnIgnoreMortgageDiversion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClaimPeriod==null?"\\N":"" + fdtmClaimPeriod, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrClaimID = null; } else {
      this.fstrClaimID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintClaimInfoType = null; } else {
      this.fintClaimInfoType = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFirstPaymentReceived = null; } else {
      this.fdtmFirstPaymentReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEligibleDays = null; } else {
      this.fintEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIgnoreEligibleDays = null; } else {
      this.fblnIgnoreEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDirectContributions = null; } else {
      this.fcurDirectContributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIgnoreDirectContributions = null; } else {
      this.fblnIgnoreDirectContributions = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMortgageDiversionAmount = null; } else {
      this.fcurMortgageDiversionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIgnoreMortgageDiversion = null; } else {
      this.fblnIgnoreMortgageDiversion = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClaimPeriod = null; } else {
      this.fdtmClaimPeriod = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrClaimID = null; } else {
      this.fstrClaimID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintClaimInfoType = null; } else {
      this.fintClaimInfoType = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFirstPaymentReceived = null; } else {
      this.fdtmFirstPaymentReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEligibleDays = null; } else {
      this.fintEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIgnoreEligibleDays = null; } else {
      this.fblnIgnoreEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDirectContributions = null; } else {
      this.fcurDirectContributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIgnoreDirectContributions = null; } else {
      this.fblnIgnoreDirectContributions = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMortgageDiversionAmount = null; } else {
      this.fcurMortgageDiversionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIgnoreMortgageDiversion = null; } else {
      this.fblnIgnoreMortgageDiversion = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClaimPeriod = null; } else {
      this.fdtmClaimPeriod = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_ksb2bgvcclaiminbound o = (tblnz_ksb2bgvcclaiminbound) super.clone();
    o.fdtmAddressChange = (o.fdtmAddressChange != null) ? (java.sql.Timestamp) o.fdtmAddressChange.clone() : null;
    o.fdtmFirstPaymentReceived = (o.fdtmFirstPaymentReceived != null) ? (java.sql.Timestamp) o.fdtmFirstPaymentReceived.clone() : null;
    o.fdtmClaimPeriod = (o.fdtmClaimPeriod != null) ? (java.sql.Timestamp) o.fdtmClaimPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ksb2bgvcclaiminbound o) throws CloneNotSupportedException {
    o.fdtmAddressChange = (o.fdtmAddressChange != null) ? (java.sql.Timestamp) o.fdtmAddressChange.clone() : null;
    o.fdtmFirstPaymentReceived = (o.fdtmFirstPaymentReceived != null) ? (java.sql.Timestamp) o.fdtmFirstPaymentReceived.clone() : null;
    o.fdtmClaimPeriod = (o.fdtmClaimPeriod != null) ? (java.sql.Timestamp) o.fdtmClaimPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("fstrClaimID", this.fstrClaimID);
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
    __sqoop$field_map.put("fintClaimInfoType", this.fintClaimInfoType);
    __sqoop$field_map.put("fdtmFirstPaymentReceived", this.fdtmFirstPaymentReceived);
    __sqoop$field_map.put("fintEligibleDays", this.fintEligibleDays);
    __sqoop$field_map.put("fblnIgnoreEligibleDays", this.fblnIgnoreEligibleDays);
    __sqoop$field_map.put("fcurDirectContributions", this.fcurDirectContributions);
    __sqoop$field_map.put("fblnIgnoreDirectContributions", this.fblnIgnoreDirectContributions);
    __sqoop$field_map.put("fcurMortgageDiversionAmount", this.fcurMortgageDiversionAmount);
    __sqoop$field_map.put("fblnIgnoreMortgageDiversion", this.fblnIgnoreMortgageDiversion);
    __sqoop$field_map.put("fdtmClaimPeriod", this.fdtmClaimPeriod);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("fstrClaimID", this.fstrClaimID);
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
    __sqoop$field_map.put("fintClaimInfoType", this.fintClaimInfoType);
    __sqoop$field_map.put("fdtmFirstPaymentReceived", this.fdtmFirstPaymentReceived);
    __sqoop$field_map.put("fintEligibleDays", this.fintEligibleDays);
    __sqoop$field_map.put("fblnIgnoreEligibleDays", this.fblnIgnoreEligibleDays);
    __sqoop$field_map.put("fcurDirectContributions", this.fcurDirectContributions);
    __sqoop$field_map.put("fblnIgnoreDirectContributions", this.fblnIgnoreDirectContributions);
    __sqoop$field_map.put("fcurMortgageDiversionAmount", this.fcurMortgageDiversionAmount);
    __sqoop$field_map.put("fblnIgnoreMortgageDiversion", this.fblnIgnoreMortgageDiversion);
    __sqoop$field_map.put("fdtmClaimPeriod", this.fdtmClaimPeriod);
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
