// ORM class for table 'tblnz_rtnkssgvc'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:23:50 NZDT 2020
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

public class tblnz_rtnkssgvc extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintClaimType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fintClaimType = (Integer)value;
      }
    });
    setters.put("fblnFirstClaim", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fblnFirstClaim = (Integer)value;
      }
    });
    setters.put("fdtmClaimStartDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fdtmClaimStartDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnFinalClaim", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fblnFinalClaim = (Integer)value;
      }
    });
    setters.put("fintFinalClaimEligibleDays", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fintFinalClaimEligibleDays = (Integer)value;
      }
    });
    setters.put("fstrSchemeIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fstrSchemeIRDNumber = (String)value;
      }
    });
    setters.put("fblnAlternativeScheme", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fblnAlternativeScheme = (Integer)value;
      }
    });
    setters.put("fcurGVCContributionAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fcurGVCContributionAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDirectMemberContributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fcurDirectMemberContributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fintActualEligibleDays", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fintActualEligibleDays = (Integer)value;
      }
    });
    setters.put("fblnOverrideActualEligibleDays", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fblnOverrideActualEligibleDays = (Integer)value;
      }
    });
    setters.put("fcurMortgageDiversion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fcurMortgageDiversion = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurContributionsThroughIR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fcurContributionsThroughIR = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnTransferred", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fblnTransferred = (Integer)value;
      }
    });
    setters.put("fintSTARTFirstEligibleDays", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fintSTARTFirstEligibleDays = (Integer)value;
      }
    });
    setters.put("fblnClaimedFullEntitlement", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fblnClaimedFullEntitlement = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnkssgvc.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnkssgvc() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnkssgvc with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fintClaimType;
  public Integer get_fintClaimType() {
    return fintClaimType;
  }
  public void set_fintClaimType(Integer fintClaimType) {
    this.fintClaimType = fintClaimType;
  }
  public tblnz_rtnkssgvc with_fintClaimType(Integer fintClaimType) {
    this.fintClaimType = fintClaimType;
    return this;
  }
  private Integer fblnFirstClaim;
  public Integer get_fblnFirstClaim() {
    return fblnFirstClaim;
  }
  public void set_fblnFirstClaim(Integer fblnFirstClaim) {
    this.fblnFirstClaim = fblnFirstClaim;
  }
  public tblnz_rtnkssgvc with_fblnFirstClaim(Integer fblnFirstClaim) {
    this.fblnFirstClaim = fblnFirstClaim;
    return this;
  }
  private java.sql.Timestamp fdtmClaimStartDate;
  public java.sql.Timestamp get_fdtmClaimStartDate() {
    return fdtmClaimStartDate;
  }
  public void set_fdtmClaimStartDate(java.sql.Timestamp fdtmClaimStartDate) {
    this.fdtmClaimStartDate = fdtmClaimStartDate;
  }
  public tblnz_rtnkssgvc with_fdtmClaimStartDate(java.sql.Timestamp fdtmClaimStartDate) {
    this.fdtmClaimStartDate = fdtmClaimStartDate;
    return this;
  }
  private Integer fblnFinalClaim;
  public Integer get_fblnFinalClaim() {
    return fblnFinalClaim;
  }
  public void set_fblnFinalClaim(Integer fblnFinalClaim) {
    this.fblnFinalClaim = fblnFinalClaim;
  }
  public tblnz_rtnkssgvc with_fblnFinalClaim(Integer fblnFinalClaim) {
    this.fblnFinalClaim = fblnFinalClaim;
    return this;
  }
  private Integer fintFinalClaimEligibleDays;
  public Integer get_fintFinalClaimEligibleDays() {
    return fintFinalClaimEligibleDays;
  }
  public void set_fintFinalClaimEligibleDays(Integer fintFinalClaimEligibleDays) {
    this.fintFinalClaimEligibleDays = fintFinalClaimEligibleDays;
  }
  public tblnz_rtnkssgvc with_fintFinalClaimEligibleDays(Integer fintFinalClaimEligibleDays) {
    this.fintFinalClaimEligibleDays = fintFinalClaimEligibleDays;
    return this;
  }
  private String fstrSchemeIRDNumber;
  public String get_fstrSchemeIRDNumber() {
    return fstrSchemeIRDNumber;
  }
  public void set_fstrSchemeIRDNumber(String fstrSchemeIRDNumber) {
    this.fstrSchemeIRDNumber = fstrSchemeIRDNumber;
  }
  public tblnz_rtnkssgvc with_fstrSchemeIRDNumber(String fstrSchemeIRDNumber) {
    this.fstrSchemeIRDNumber = fstrSchemeIRDNumber;
    return this;
  }
  private Integer fblnAlternativeScheme;
  public Integer get_fblnAlternativeScheme() {
    return fblnAlternativeScheme;
  }
  public void set_fblnAlternativeScheme(Integer fblnAlternativeScheme) {
    this.fblnAlternativeScheme = fblnAlternativeScheme;
  }
  public tblnz_rtnkssgvc with_fblnAlternativeScheme(Integer fblnAlternativeScheme) {
    this.fblnAlternativeScheme = fblnAlternativeScheme;
    return this;
  }
  private java.math.BigDecimal fcurGVCContributionAmount;
  public java.math.BigDecimal get_fcurGVCContributionAmount() {
    return fcurGVCContributionAmount;
  }
  public void set_fcurGVCContributionAmount(java.math.BigDecimal fcurGVCContributionAmount) {
    this.fcurGVCContributionAmount = fcurGVCContributionAmount;
  }
  public tblnz_rtnkssgvc with_fcurGVCContributionAmount(java.math.BigDecimal fcurGVCContributionAmount) {
    this.fcurGVCContributionAmount = fcurGVCContributionAmount;
    return this;
  }
  private java.math.BigDecimal fcurDirectMemberContributions;
  public java.math.BigDecimal get_fcurDirectMemberContributions() {
    return fcurDirectMemberContributions;
  }
  public void set_fcurDirectMemberContributions(java.math.BigDecimal fcurDirectMemberContributions) {
    this.fcurDirectMemberContributions = fcurDirectMemberContributions;
  }
  public tblnz_rtnkssgvc with_fcurDirectMemberContributions(java.math.BigDecimal fcurDirectMemberContributions) {
    this.fcurDirectMemberContributions = fcurDirectMemberContributions;
    return this;
  }
  private Integer fintActualEligibleDays;
  public Integer get_fintActualEligibleDays() {
    return fintActualEligibleDays;
  }
  public void set_fintActualEligibleDays(Integer fintActualEligibleDays) {
    this.fintActualEligibleDays = fintActualEligibleDays;
  }
  public tblnz_rtnkssgvc with_fintActualEligibleDays(Integer fintActualEligibleDays) {
    this.fintActualEligibleDays = fintActualEligibleDays;
    return this;
  }
  private Integer fblnOverrideActualEligibleDays;
  public Integer get_fblnOverrideActualEligibleDays() {
    return fblnOverrideActualEligibleDays;
  }
  public void set_fblnOverrideActualEligibleDays(Integer fblnOverrideActualEligibleDays) {
    this.fblnOverrideActualEligibleDays = fblnOverrideActualEligibleDays;
  }
  public tblnz_rtnkssgvc with_fblnOverrideActualEligibleDays(Integer fblnOverrideActualEligibleDays) {
    this.fblnOverrideActualEligibleDays = fblnOverrideActualEligibleDays;
    return this;
  }
  private java.math.BigDecimal fcurMortgageDiversion;
  public java.math.BigDecimal get_fcurMortgageDiversion() {
    return fcurMortgageDiversion;
  }
  public void set_fcurMortgageDiversion(java.math.BigDecimal fcurMortgageDiversion) {
    this.fcurMortgageDiversion = fcurMortgageDiversion;
  }
  public tblnz_rtnkssgvc with_fcurMortgageDiversion(java.math.BigDecimal fcurMortgageDiversion) {
    this.fcurMortgageDiversion = fcurMortgageDiversion;
    return this;
  }
  private java.math.BigDecimal fcurContributionsThroughIR;
  public java.math.BigDecimal get_fcurContributionsThroughIR() {
    return fcurContributionsThroughIR;
  }
  public void set_fcurContributionsThroughIR(java.math.BigDecimal fcurContributionsThroughIR) {
    this.fcurContributionsThroughIR = fcurContributionsThroughIR;
  }
  public tblnz_rtnkssgvc with_fcurContributionsThroughIR(java.math.BigDecimal fcurContributionsThroughIR) {
    this.fcurContributionsThroughIR = fcurContributionsThroughIR;
    return this;
  }
  private Integer fblnTransferred;
  public Integer get_fblnTransferred() {
    return fblnTransferred;
  }
  public void set_fblnTransferred(Integer fblnTransferred) {
    this.fblnTransferred = fblnTransferred;
  }
  public tblnz_rtnkssgvc with_fblnTransferred(Integer fblnTransferred) {
    this.fblnTransferred = fblnTransferred;
    return this;
  }
  private Integer fintSTARTFirstEligibleDays;
  public Integer get_fintSTARTFirstEligibleDays() {
    return fintSTARTFirstEligibleDays;
  }
  public void set_fintSTARTFirstEligibleDays(Integer fintSTARTFirstEligibleDays) {
    this.fintSTARTFirstEligibleDays = fintSTARTFirstEligibleDays;
  }
  public tblnz_rtnkssgvc with_fintSTARTFirstEligibleDays(Integer fintSTARTFirstEligibleDays) {
    this.fintSTARTFirstEligibleDays = fintSTARTFirstEligibleDays;
    return this;
  }
  private Integer fblnClaimedFullEntitlement;
  public Integer get_fblnClaimedFullEntitlement() {
    return fblnClaimedFullEntitlement;
  }
  public void set_fblnClaimedFullEntitlement(Integer fblnClaimedFullEntitlement) {
    this.fblnClaimedFullEntitlement = fblnClaimedFullEntitlement;
  }
  public tblnz_rtnkssgvc with_fblnClaimedFullEntitlement(Integer fblnClaimedFullEntitlement) {
    this.fblnClaimedFullEntitlement = fblnClaimedFullEntitlement;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnkssgvc with_fstrWho(String fstrWho) {
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
  public tblnz_rtnkssgvc with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnkssgvc)) {
      return false;
    }
    tblnz_rtnkssgvc that = (tblnz_rtnkssgvc) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintClaimType == null ? that.fintClaimType == null : this.fintClaimType.equals(that.fintClaimType));
    equal = equal && (this.fblnFirstClaim == null ? that.fblnFirstClaim == null : this.fblnFirstClaim.equals(that.fblnFirstClaim));
    equal = equal && (this.fdtmClaimStartDate == null ? that.fdtmClaimStartDate == null : this.fdtmClaimStartDate.equals(that.fdtmClaimStartDate));
    equal = equal && (this.fblnFinalClaim == null ? that.fblnFinalClaim == null : this.fblnFinalClaim.equals(that.fblnFinalClaim));
    equal = equal && (this.fintFinalClaimEligibleDays == null ? that.fintFinalClaimEligibleDays == null : this.fintFinalClaimEligibleDays.equals(that.fintFinalClaimEligibleDays));
    equal = equal && (this.fstrSchemeIRDNumber == null ? that.fstrSchemeIRDNumber == null : this.fstrSchemeIRDNumber.equals(that.fstrSchemeIRDNumber));
    equal = equal && (this.fblnAlternativeScheme == null ? that.fblnAlternativeScheme == null : this.fblnAlternativeScheme.equals(that.fblnAlternativeScheme));
    equal = equal && (this.fcurGVCContributionAmount == null ? that.fcurGVCContributionAmount == null : this.fcurGVCContributionAmount.equals(that.fcurGVCContributionAmount));
    equal = equal && (this.fcurDirectMemberContributions == null ? that.fcurDirectMemberContributions == null : this.fcurDirectMemberContributions.equals(that.fcurDirectMemberContributions));
    equal = equal && (this.fintActualEligibleDays == null ? that.fintActualEligibleDays == null : this.fintActualEligibleDays.equals(that.fintActualEligibleDays));
    equal = equal && (this.fblnOverrideActualEligibleDays == null ? that.fblnOverrideActualEligibleDays == null : this.fblnOverrideActualEligibleDays.equals(that.fblnOverrideActualEligibleDays));
    equal = equal && (this.fcurMortgageDiversion == null ? that.fcurMortgageDiversion == null : this.fcurMortgageDiversion.equals(that.fcurMortgageDiversion));
    equal = equal && (this.fcurContributionsThroughIR == null ? that.fcurContributionsThroughIR == null : this.fcurContributionsThroughIR.equals(that.fcurContributionsThroughIR));
    equal = equal && (this.fblnTransferred == null ? that.fblnTransferred == null : this.fblnTransferred.equals(that.fblnTransferred));
    equal = equal && (this.fintSTARTFirstEligibleDays == null ? that.fintSTARTFirstEligibleDays == null : this.fintSTARTFirstEligibleDays.equals(that.fintSTARTFirstEligibleDays));
    equal = equal && (this.fblnClaimedFullEntitlement == null ? that.fblnClaimedFullEntitlement == null : this.fblnClaimedFullEntitlement.equals(that.fblnClaimedFullEntitlement));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnkssgvc)) {
      return false;
    }
    tblnz_rtnkssgvc that = (tblnz_rtnkssgvc) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintClaimType == null ? that.fintClaimType == null : this.fintClaimType.equals(that.fintClaimType));
    equal = equal && (this.fblnFirstClaim == null ? that.fblnFirstClaim == null : this.fblnFirstClaim.equals(that.fblnFirstClaim));
    equal = equal && (this.fdtmClaimStartDate == null ? that.fdtmClaimStartDate == null : this.fdtmClaimStartDate.equals(that.fdtmClaimStartDate));
    equal = equal && (this.fblnFinalClaim == null ? that.fblnFinalClaim == null : this.fblnFinalClaim.equals(that.fblnFinalClaim));
    equal = equal && (this.fintFinalClaimEligibleDays == null ? that.fintFinalClaimEligibleDays == null : this.fintFinalClaimEligibleDays.equals(that.fintFinalClaimEligibleDays));
    equal = equal && (this.fstrSchemeIRDNumber == null ? that.fstrSchemeIRDNumber == null : this.fstrSchemeIRDNumber.equals(that.fstrSchemeIRDNumber));
    equal = equal && (this.fblnAlternativeScheme == null ? that.fblnAlternativeScheme == null : this.fblnAlternativeScheme.equals(that.fblnAlternativeScheme));
    equal = equal && (this.fcurGVCContributionAmount == null ? that.fcurGVCContributionAmount == null : this.fcurGVCContributionAmount.equals(that.fcurGVCContributionAmount));
    equal = equal && (this.fcurDirectMemberContributions == null ? that.fcurDirectMemberContributions == null : this.fcurDirectMemberContributions.equals(that.fcurDirectMemberContributions));
    equal = equal && (this.fintActualEligibleDays == null ? that.fintActualEligibleDays == null : this.fintActualEligibleDays.equals(that.fintActualEligibleDays));
    equal = equal && (this.fblnOverrideActualEligibleDays == null ? that.fblnOverrideActualEligibleDays == null : this.fblnOverrideActualEligibleDays.equals(that.fblnOverrideActualEligibleDays));
    equal = equal && (this.fcurMortgageDiversion == null ? that.fcurMortgageDiversion == null : this.fcurMortgageDiversion.equals(that.fcurMortgageDiversion));
    equal = equal && (this.fcurContributionsThroughIR == null ? that.fcurContributionsThroughIR == null : this.fcurContributionsThroughIR.equals(that.fcurContributionsThroughIR));
    equal = equal && (this.fblnTransferred == null ? that.fblnTransferred == null : this.fblnTransferred.equals(that.fblnTransferred));
    equal = equal && (this.fintSTARTFirstEligibleDays == null ? that.fintSTARTFirstEligibleDays == null : this.fintSTARTFirstEligibleDays.equals(that.fintSTARTFirstEligibleDays));
    equal = equal && (this.fblnClaimedFullEntitlement == null ? that.fblnClaimedFullEntitlement == null : this.fblnClaimedFullEntitlement.equals(that.fblnClaimedFullEntitlement));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintClaimType = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnFirstClaim = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmClaimStartDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fblnFinalClaim = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintFinalClaimEligibleDays = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrSchemeIRDNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnAlternativeScheme = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fcurGVCContributionAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurDirectMemberContributions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fintActualEligibleDays = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnOverrideActualEligibleDays = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurMortgageDiversion = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurContributionsThroughIR = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fblnTransferred = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fintSTARTFirstEligibleDays = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnClaimedFullEntitlement = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintClaimType = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnFirstClaim = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmClaimStartDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fblnFinalClaim = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintFinalClaimEligibleDays = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrSchemeIRDNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnAlternativeScheme = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fcurGVCContributionAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurDirectMemberContributions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fintActualEligibleDays = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnOverrideActualEligibleDays = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurMortgageDiversion = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurContributionsThroughIR = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fblnTransferred = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fintSTARTFirstEligibleDays = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnClaimedFullEntitlement = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintClaimType, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFirstClaim, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClaimStartDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinalClaim, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFinalClaimEligibleDays, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSchemeIRDNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlternativeScheme, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGVCContributionAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDirectMemberContributions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fintActualEligibleDays, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverrideActualEligibleDays, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMortgageDiversion, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContributionsThroughIR, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransferred, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSTARTFirstEligibleDays, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnClaimedFullEntitlement, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintClaimType, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFirstClaim, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClaimStartDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinalClaim, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFinalClaimEligibleDays, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSchemeIRDNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlternativeScheme, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGVCContributionAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDirectMemberContributions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fintActualEligibleDays, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverrideActualEligibleDays, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMortgageDiversion, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContributionsThroughIR, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransferred, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSTARTFirstEligibleDays, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnClaimedFullEntitlement, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
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
        this.fintClaimType = null;
    } else {
    this.fintClaimType = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFirstClaim = null;
    } else {
    this.fblnFirstClaim = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClaimStartDate = null;
    } else {
    this.fdtmClaimStartDate = new Timestamp(__dataIn.readLong());
    this.fdtmClaimStartDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFinalClaim = null;
    } else {
    this.fblnFinalClaim = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintFinalClaimEligibleDays = null;
    } else {
    this.fintFinalClaimEligibleDays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSchemeIRDNumber = null;
    } else {
    this.fstrSchemeIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAlternativeScheme = null;
    } else {
    this.fblnAlternativeScheme = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGVCContributionAmount = null;
    } else {
    this.fcurGVCContributionAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDirectMemberContributions = null;
    } else {
    this.fcurDirectMemberContributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintActualEligibleDays = null;
    } else {
    this.fintActualEligibleDays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverrideActualEligibleDays = null;
    } else {
    this.fblnOverrideActualEligibleDays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMortgageDiversion = null;
    } else {
    this.fcurMortgageDiversion = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurContributionsThroughIR = null;
    } else {
    this.fcurContributionsThroughIR = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTransferred = null;
    } else {
    this.fblnTransferred = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintSTARTFirstEligibleDays = null;
    } else {
    this.fintSTARTFirstEligibleDays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnClaimedFullEntitlement = null;
    } else {
    this.fblnClaimedFullEntitlement = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fintClaimType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintClaimType);
    }
    if (null == this.fblnFirstClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFirstClaim);
    }
    if (null == this.fdtmClaimStartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClaimStartDate.getTime());
    __dataOut.writeInt(this.fdtmClaimStartDate.getNanos());
    }
    if (null == this.fblnFinalClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinalClaim);
    }
    if (null == this.fintFinalClaimEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFinalClaimEligibleDays);
    }
    if (null == this.fstrSchemeIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeIRDNumber);
    }
    if (null == this.fblnAlternativeScheme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlternativeScheme);
    }
    if (null == this.fcurGVCContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGVCContributionAmount, __dataOut);
    }
    if (null == this.fcurDirectMemberContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDirectMemberContributions, __dataOut);
    }
    if (null == this.fintActualEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintActualEligibleDays);
    }
    if (null == this.fblnOverrideActualEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverrideActualEligibleDays);
    }
    if (null == this.fcurMortgageDiversion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMortgageDiversion, __dataOut);
    }
    if (null == this.fcurContributionsThroughIR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContributionsThroughIR, __dataOut);
    }
    if (null == this.fblnTransferred) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransferred);
    }
    if (null == this.fintSTARTFirstEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSTARTFirstEligibleDays);
    }
    if (null == this.fblnClaimedFullEntitlement) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnClaimedFullEntitlement);
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
    if (null == this.fintClaimType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintClaimType);
    }
    if (null == this.fblnFirstClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFirstClaim);
    }
    if (null == this.fdtmClaimStartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClaimStartDate.getTime());
    __dataOut.writeInt(this.fdtmClaimStartDate.getNanos());
    }
    if (null == this.fblnFinalClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinalClaim);
    }
    if (null == this.fintFinalClaimEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFinalClaimEligibleDays);
    }
    if (null == this.fstrSchemeIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeIRDNumber);
    }
    if (null == this.fblnAlternativeScheme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlternativeScheme);
    }
    if (null == this.fcurGVCContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGVCContributionAmount, __dataOut);
    }
    if (null == this.fcurDirectMemberContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDirectMemberContributions, __dataOut);
    }
    if (null == this.fintActualEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintActualEligibleDays);
    }
    if (null == this.fblnOverrideActualEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverrideActualEligibleDays);
    }
    if (null == this.fcurMortgageDiversion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMortgageDiversion, __dataOut);
    }
    if (null == this.fcurContributionsThroughIR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContributionsThroughIR, __dataOut);
    }
    if (null == this.fblnTransferred) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransferred);
    }
    if (null == this.fintSTARTFirstEligibleDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSTARTFirstEligibleDays);
    }
    if (null == this.fblnClaimedFullEntitlement) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnClaimedFullEntitlement);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintClaimType==null?"\\N":"" + fintClaimType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFirstClaim==null?"\\N":"" + fblnFirstClaim, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClaimStartDate==null?"\\N":"" + fdtmClaimStartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinalClaim==null?"\\N":"" + fblnFinalClaim, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFinalClaimEligibleDays==null?"\\N":"" + fintFinalClaimEligibleDays, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeIRDNumber==null?"\\N":fstrSchemeIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlternativeScheme==null?"\\N":"" + fblnAlternativeScheme, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGVCContributionAmount==null?"\\N":fcurGVCContributionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDirectMemberContributions==null?"\\N":fcurDirectMemberContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintActualEligibleDays==null?"\\N":"" + fintActualEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverrideActualEligibleDays==null?"\\N":"" + fblnOverrideActualEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMortgageDiversion==null?"\\N":fcurMortgageDiversion.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContributionsThroughIR==null?"\\N":fcurContributionsThroughIR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransferred==null?"\\N":"" + fblnTransferred, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSTARTFirstEligibleDays==null?"\\N":"" + fintSTARTFirstEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnClaimedFullEntitlement==null?"\\N":"" + fblnClaimedFullEntitlement, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintClaimType==null?"\\N":"" + fintClaimType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFirstClaim==null?"\\N":"" + fblnFirstClaim, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClaimStartDate==null?"\\N":"" + fdtmClaimStartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinalClaim==null?"\\N":"" + fblnFinalClaim, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFinalClaimEligibleDays==null?"\\N":"" + fintFinalClaimEligibleDays, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeIRDNumber==null?"\\N":fstrSchemeIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlternativeScheme==null?"\\N":"" + fblnAlternativeScheme, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGVCContributionAmount==null?"\\N":fcurGVCContributionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDirectMemberContributions==null?"\\N":fcurDirectMemberContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintActualEligibleDays==null?"\\N":"" + fintActualEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverrideActualEligibleDays==null?"\\N":"" + fblnOverrideActualEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMortgageDiversion==null?"\\N":fcurMortgageDiversion.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContributionsThroughIR==null?"\\N":fcurContributionsThroughIR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransferred==null?"\\N":"" + fblnTransferred, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSTARTFirstEligibleDays==null?"\\N":"" + fintSTARTFirstEligibleDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnClaimedFullEntitlement==null?"\\N":"" + fblnClaimedFullEntitlement, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintClaimType = null; } else {
      this.fintClaimType = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFirstClaim = null; } else {
      this.fblnFirstClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClaimStartDate = null; } else {
      this.fdtmClaimStartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFinalClaim = null; } else {
      this.fblnFinalClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFinalClaimEligibleDays = null; } else {
      this.fintFinalClaimEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSchemeIRDNumber = null; } else {
      this.fstrSchemeIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlternativeScheme = null; } else {
      this.fblnAlternativeScheme = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGVCContributionAmount = null; } else {
      this.fcurGVCContributionAmount = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintActualEligibleDays = null; } else {
      this.fintActualEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverrideActualEligibleDays = null; } else {
      this.fblnOverrideActualEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMortgageDiversion = null; } else {
      this.fcurMortgageDiversion = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContributionsThroughIR = null; } else {
      this.fcurContributionsThroughIR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransferred = null; } else {
      this.fblnTransferred = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSTARTFirstEligibleDays = null; } else {
      this.fintSTARTFirstEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnClaimedFullEntitlement = null; } else {
      this.fblnClaimedFullEntitlement = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintClaimType = null; } else {
      this.fintClaimType = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFirstClaim = null; } else {
      this.fblnFirstClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClaimStartDate = null; } else {
      this.fdtmClaimStartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFinalClaim = null; } else {
      this.fblnFinalClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFinalClaimEligibleDays = null; } else {
      this.fintFinalClaimEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSchemeIRDNumber = null; } else {
      this.fstrSchemeIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlternativeScheme = null; } else {
      this.fblnAlternativeScheme = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGVCContributionAmount = null; } else {
      this.fcurGVCContributionAmount = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintActualEligibleDays = null; } else {
      this.fintActualEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverrideActualEligibleDays = null; } else {
      this.fblnOverrideActualEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMortgageDiversion = null; } else {
      this.fcurMortgageDiversion = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContributionsThroughIR = null; } else {
      this.fcurContributionsThroughIR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransferred = null; } else {
      this.fblnTransferred = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSTARTFirstEligibleDays = null; } else {
      this.fintSTARTFirstEligibleDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnClaimedFullEntitlement = null; } else {
      this.fblnClaimedFullEntitlement = Integer.valueOf(__cur_str);
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
    tblnz_rtnkssgvc o = (tblnz_rtnkssgvc) super.clone();
    o.fdtmClaimStartDate = (o.fdtmClaimStartDate != null) ? (java.sql.Timestamp) o.fdtmClaimStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnkssgvc o) throws CloneNotSupportedException {
    o.fdtmClaimStartDate = (o.fdtmClaimStartDate != null) ? (java.sql.Timestamp) o.fdtmClaimStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintClaimType", this.fintClaimType);
    __sqoop$field_map.put("fblnFirstClaim", this.fblnFirstClaim);
    __sqoop$field_map.put("fdtmClaimStartDate", this.fdtmClaimStartDate);
    __sqoop$field_map.put("fblnFinalClaim", this.fblnFinalClaim);
    __sqoop$field_map.put("fintFinalClaimEligibleDays", this.fintFinalClaimEligibleDays);
    __sqoop$field_map.put("fstrSchemeIRDNumber", this.fstrSchemeIRDNumber);
    __sqoop$field_map.put("fblnAlternativeScheme", this.fblnAlternativeScheme);
    __sqoop$field_map.put("fcurGVCContributionAmount", this.fcurGVCContributionAmount);
    __sqoop$field_map.put("fcurDirectMemberContributions", this.fcurDirectMemberContributions);
    __sqoop$field_map.put("fintActualEligibleDays", this.fintActualEligibleDays);
    __sqoop$field_map.put("fblnOverrideActualEligibleDays", this.fblnOverrideActualEligibleDays);
    __sqoop$field_map.put("fcurMortgageDiversion", this.fcurMortgageDiversion);
    __sqoop$field_map.put("fcurContributionsThroughIR", this.fcurContributionsThroughIR);
    __sqoop$field_map.put("fblnTransferred", this.fblnTransferred);
    __sqoop$field_map.put("fintSTARTFirstEligibleDays", this.fintSTARTFirstEligibleDays);
    __sqoop$field_map.put("fblnClaimedFullEntitlement", this.fblnClaimedFullEntitlement);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintClaimType", this.fintClaimType);
    __sqoop$field_map.put("fblnFirstClaim", this.fblnFirstClaim);
    __sqoop$field_map.put("fdtmClaimStartDate", this.fdtmClaimStartDate);
    __sqoop$field_map.put("fblnFinalClaim", this.fblnFinalClaim);
    __sqoop$field_map.put("fintFinalClaimEligibleDays", this.fintFinalClaimEligibleDays);
    __sqoop$field_map.put("fstrSchemeIRDNumber", this.fstrSchemeIRDNumber);
    __sqoop$field_map.put("fblnAlternativeScheme", this.fblnAlternativeScheme);
    __sqoop$field_map.put("fcurGVCContributionAmount", this.fcurGVCContributionAmount);
    __sqoop$field_map.put("fcurDirectMemberContributions", this.fcurDirectMemberContributions);
    __sqoop$field_map.put("fintActualEligibleDays", this.fintActualEligibleDays);
    __sqoop$field_map.put("fblnOverrideActualEligibleDays", this.fblnOverrideActualEligibleDays);
    __sqoop$field_map.put("fcurMortgageDiversion", this.fcurMortgageDiversion);
    __sqoop$field_map.put("fcurContributionsThroughIR", this.fcurContributionsThroughIR);
    __sqoop$field_map.put("fblnTransferred", this.fblnTransferred);
    __sqoop$field_map.put("fintSTARTFirstEligibleDays", this.fintSTARTFirstEligibleDays);
    __sqoop$field_map.put("fblnClaimedFullEntitlement", this.fblnClaimedFullEntitlement);
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
