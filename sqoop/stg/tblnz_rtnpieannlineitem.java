// ORM class for table 'tblnz_rtnpieannlineitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:05:21 NZDT 2020
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

public class tblnz_rtnpieannlineitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64LineItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fi64LineItemKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrPIEName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrPIEName = (String)value;
      }
    });
    setters.put("fstrPIEIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrPIEIRDNumber = (String)value;
      }
    });
    setters.put("fstrInvestorName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrInvestorName = (String)value;
      }
    });
    setters.put("fstrInvestorIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrInvestorIRDNumber = (String)value;
      }
    });
    setters.put("fstrRecipientStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrRecipientStatus = (String)value;
      }
    });
    setters.put("fdtmInvestorDateOfBirth", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fdtmInvestorDateOfBirth = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrInvestorCertIdentifier", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrInvestorCertIdentifier = (String)value;
      }
    });
    setters.put("fcurRateYearEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurRateYearEnd = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnRateChanged", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fblnRateChanged = (Integer)value;
      }
    });
    setters.put("fcurUnitsHeldYearEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurUnitsHeldYearEnd = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fdtmPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurTotalIncomeLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTotalIncomeLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTotalTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurNetTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxableIncomeLowMid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTaxableIncomeLowMid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPaidLowMid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTaxPaidLowMid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxCreditsLowMid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTotalTaxCreditsLowMid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurZeroExitedTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurZeroExitedTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalForeignTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTotalForeignTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTotalOtherTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalICTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTotalICTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRWTTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTotalRWTTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPaymentExitedInvestors", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fcurTaxPaymentExitedInvestors = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrHomeAddressLine1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrHomeAddressLine1 = (String)value;
      }
    });
    setters.put("fstrHomeAddressLine2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrHomeAddressLine2 = (String)value;
      }
    });
    setters.put("fstrHomeAddressLine3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrHomeAddressLine3 = (String)value;
      }
    });
    setters.put("fstrHomeAddressLine4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrHomeAddressLine4 = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrCountry = (String)value;
      }
    });
    setters.put("fstrCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrCountryCode = (String)value;
      }
    });
    setters.put("fstrHomeTaxFileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrHomeTaxFileNumber = (String)value;
      }
    });
    setters.put("fstrNFIDTA", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrNFIDTA = (String)value;
      }
    });
    setters.put("fblnHomeTaxFileDeclaration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fblnHomeTaxFileDeclaration = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieannlineitem.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnpieannlineitem() {
    init0();
  }
  private Long fi64LineItemKey;
  public Long get_fi64LineItemKey() {
    return fi64LineItemKey;
  }
  public void set_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
  }
  public tblnz_rtnpieannlineitem with_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_rtnpieannlineitem with_flngVer(Integer flngVer) {
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
  public tblnz_rtnpieannlineitem with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrPIEName;
  public String get_fstrPIEName() {
    return fstrPIEName;
  }
  public void set_fstrPIEName(String fstrPIEName) {
    this.fstrPIEName = fstrPIEName;
  }
  public tblnz_rtnpieannlineitem with_fstrPIEName(String fstrPIEName) {
    this.fstrPIEName = fstrPIEName;
    return this;
  }
  private String fstrPIEIRDNumber;
  public String get_fstrPIEIRDNumber() {
    return fstrPIEIRDNumber;
  }
  public void set_fstrPIEIRDNumber(String fstrPIEIRDNumber) {
    this.fstrPIEIRDNumber = fstrPIEIRDNumber;
  }
  public tblnz_rtnpieannlineitem with_fstrPIEIRDNumber(String fstrPIEIRDNumber) {
    this.fstrPIEIRDNumber = fstrPIEIRDNumber;
    return this;
  }
  private String fstrInvestorName;
  public String get_fstrInvestorName() {
    return fstrInvestorName;
  }
  public void set_fstrInvestorName(String fstrInvestorName) {
    this.fstrInvestorName = fstrInvestorName;
  }
  public tblnz_rtnpieannlineitem with_fstrInvestorName(String fstrInvestorName) {
    this.fstrInvestorName = fstrInvestorName;
    return this;
  }
  private String fstrInvestorIRDNumber;
  public String get_fstrInvestorIRDNumber() {
    return fstrInvestorIRDNumber;
  }
  public void set_fstrInvestorIRDNumber(String fstrInvestorIRDNumber) {
    this.fstrInvestorIRDNumber = fstrInvestorIRDNumber;
  }
  public tblnz_rtnpieannlineitem with_fstrInvestorIRDNumber(String fstrInvestorIRDNumber) {
    this.fstrInvestorIRDNumber = fstrInvestorIRDNumber;
    return this;
  }
  private String fstrRecipientStatus;
  public String get_fstrRecipientStatus() {
    return fstrRecipientStatus;
  }
  public void set_fstrRecipientStatus(String fstrRecipientStatus) {
    this.fstrRecipientStatus = fstrRecipientStatus;
  }
  public tblnz_rtnpieannlineitem with_fstrRecipientStatus(String fstrRecipientStatus) {
    this.fstrRecipientStatus = fstrRecipientStatus;
    return this;
  }
  private java.sql.Timestamp fdtmInvestorDateOfBirth;
  public java.sql.Timestamp get_fdtmInvestorDateOfBirth() {
    return fdtmInvestorDateOfBirth;
  }
  public void set_fdtmInvestorDateOfBirth(java.sql.Timestamp fdtmInvestorDateOfBirth) {
    this.fdtmInvestorDateOfBirth = fdtmInvestorDateOfBirth;
  }
  public tblnz_rtnpieannlineitem with_fdtmInvestorDateOfBirth(java.sql.Timestamp fdtmInvestorDateOfBirth) {
    this.fdtmInvestorDateOfBirth = fdtmInvestorDateOfBirth;
    return this;
  }
  private String fstrInvestorCertIdentifier;
  public String get_fstrInvestorCertIdentifier() {
    return fstrInvestorCertIdentifier;
  }
  public void set_fstrInvestorCertIdentifier(String fstrInvestorCertIdentifier) {
    this.fstrInvestorCertIdentifier = fstrInvestorCertIdentifier;
  }
  public tblnz_rtnpieannlineitem with_fstrInvestorCertIdentifier(String fstrInvestorCertIdentifier) {
    this.fstrInvestorCertIdentifier = fstrInvestorCertIdentifier;
    return this;
  }
  private java.math.BigDecimal fcurRateYearEnd;
  public java.math.BigDecimal get_fcurRateYearEnd() {
    return fcurRateYearEnd;
  }
  public void set_fcurRateYearEnd(java.math.BigDecimal fcurRateYearEnd) {
    this.fcurRateYearEnd = fcurRateYearEnd;
  }
  public tblnz_rtnpieannlineitem with_fcurRateYearEnd(java.math.BigDecimal fcurRateYearEnd) {
    this.fcurRateYearEnd = fcurRateYearEnd;
    return this;
  }
  private Integer fblnRateChanged;
  public Integer get_fblnRateChanged() {
    return fblnRateChanged;
  }
  public void set_fblnRateChanged(Integer fblnRateChanged) {
    this.fblnRateChanged = fblnRateChanged;
  }
  public tblnz_rtnpieannlineitem with_fblnRateChanged(Integer fblnRateChanged) {
    this.fblnRateChanged = fblnRateChanged;
    return this;
  }
  private java.math.BigDecimal fcurUnitsHeldYearEnd;
  public java.math.BigDecimal get_fcurUnitsHeldYearEnd() {
    return fcurUnitsHeldYearEnd;
  }
  public void set_fcurUnitsHeldYearEnd(java.math.BigDecimal fcurUnitsHeldYearEnd) {
    this.fcurUnitsHeldYearEnd = fcurUnitsHeldYearEnd;
  }
  public tblnz_rtnpieannlineitem with_fcurUnitsHeldYearEnd(java.math.BigDecimal fcurUnitsHeldYearEnd) {
    this.fcurUnitsHeldYearEnd = fcurUnitsHeldYearEnd;
    return this;
  }
  private java.sql.Timestamp fdtmPeriod;
  public java.sql.Timestamp get_fdtmPeriod() {
    return fdtmPeriod;
  }
  public void set_fdtmPeriod(java.sql.Timestamp fdtmPeriod) {
    this.fdtmPeriod = fdtmPeriod;
  }
  public tblnz_rtnpieannlineitem with_fdtmPeriod(java.sql.Timestamp fdtmPeriod) {
    this.fdtmPeriod = fdtmPeriod;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncomeLoss;
  public java.math.BigDecimal get_fcurTotalIncomeLoss() {
    return fcurTotalIncomeLoss;
  }
  public void set_fcurTotalIncomeLoss(java.math.BigDecimal fcurTotalIncomeLoss) {
    this.fcurTotalIncomeLoss = fcurTotalIncomeLoss;
  }
  public tblnz_rtnpieannlineitem with_fcurTotalIncomeLoss(java.math.BigDecimal fcurTotalIncomeLoss) {
    this.fcurTotalIncomeLoss = fcurTotalIncomeLoss;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxCredits;
  public java.math.BigDecimal get_fcurTotalTaxCredits() {
    return fcurTotalTaxCredits;
  }
  public void set_fcurTotalTaxCredits(java.math.BigDecimal fcurTotalTaxCredits) {
    this.fcurTotalTaxCredits = fcurTotalTaxCredits;
  }
  public tblnz_rtnpieannlineitem with_fcurTotalTaxCredits(java.math.BigDecimal fcurTotalTaxCredits) {
    this.fcurTotalTaxCredits = fcurTotalTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurNetTaxPaid;
  public java.math.BigDecimal get_fcurNetTaxPaid() {
    return fcurNetTaxPaid;
  }
  public void set_fcurNetTaxPaid(java.math.BigDecimal fcurNetTaxPaid) {
    this.fcurNetTaxPaid = fcurNetTaxPaid;
  }
  public tblnz_rtnpieannlineitem with_fcurNetTaxPaid(java.math.BigDecimal fcurNetTaxPaid) {
    this.fcurNetTaxPaid = fcurNetTaxPaid;
    return this;
  }
  private java.math.BigDecimal fcurTaxableIncomeLowMid;
  public java.math.BigDecimal get_fcurTaxableIncomeLowMid() {
    return fcurTaxableIncomeLowMid;
  }
  public void set_fcurTaxableIncomeLowMid(java.math.BigDecimal fcurTaxableIncomeLowMid) {
    this.fcurTaxableIncomeLowMid = fcurTaxableIncomeLowMid;
  }
  public tblnz_rtnpieannlineitem with_fcurTaxableIncomeLowMid(java.math.BigDecimal fcurTaxableIncomeLowMid) {
    this.fcurTaxableIncomeLowMid = fcurTaxableIncomeLowMid;
    return this;
  }
  private java.math.BigDecimal fcurTaxPaidLowMid;
  public java.math.BigDecimal get_fcurTaxPaidLowMid() {
    return fcurTaxPaidLowMid;
  }
  public void set_fcurTaxPaidLowMid(java.math.BigDecimal fcurTaxPaidLowMid) {
    this.fcurTaxPaidLowMid = fcurTaxPaidLowMid;
  }
  public tblnz_rtnpieannlineitem with_fcurTaxPaidLowMid(java.math.BigDecimal fcurTaxPaidLowMid) {
    this.fcurTaxPaidLowMid = fcurTaxPaidLowMid;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxCreditsLowMid;
  public java.math.BigDecimal get_fcurTotalTaxCreditsLowMid() {
    return fcurTotalTaxCreditsLowMid;
  }
  public void set_fcurTotalTaxCreditsLowMid(java.math.BigDecimal fcurTotalTaxCreditsLowMid) {
    this.fcurTotalTaxCreditsLowMid = fcurTotalTaxCreditsLowMid;
  }
  public tblnz_rtnpieannlineitem with_fcurTotalTaxCreditsLowMid(java.math.BigDecimal fcurTotalTaxCreditsLowMid) {
    this.fcurTotalTaxCreditsLowMid = fcurTotalTaxCreditsLowMid;
    return this;
  }
  private java.math.BigDecimal fcurZeroExitedTaxableIncome;
  public java.math.BigDecimal get_fcurZeroExitedTaxableIncome() {
    return fcurZeroExitedTaxableIncome;
  }
  public void set_fcurZeroExitedTaxableIncome(java.math.BigDecimal fcurZeroExitedTaxableIncome) {
    this.fcurZeroExitedTaxableIncome = fcurZeroExitedTaxableIncome;
  }
  public tblnz_rtnpieannlineitem with_fcurZeroExitedTaxableIncome(java.math.BigDecimal fcurZeroExitedTaxableIncome) {
    this.fcurZeroExitedTaxableIncome = fcurZeroExitedTaxableIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalForeignTaxCredits;
  public java.math.BigDecimal get_fcurTotalForeignTaxCredits() {
    return fcurTotalForeignTaxCredits;
  }
  public void set_fcurTotalForeignTaxCredits(java.math.BigDecimal fcurTotalForeignTaxCredits) {
    this.fcurTotalForeignTaxCredits = fcurTotalForeignTaxCredits;
  }
  public tblnz_rtnpieannlineitem with_fcurTotalForeignTaxCredits(java.math.BigDecimal fcurTotalForeignTaxCredits) {
    this.fcurTotalForeignTaxCredits = fcurTotalForeignTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherTaxCredits;
  public java.math.BigDecimal get_fcurTotalOtherTaxCredits() {
    return fcurTotalOtherTaxCredits;
  }
  public void set_fcurTotalOtherTaxCredits(java.math.BigDecimal fcurTotalOtherTaxCredits) {
    this.fcurTotalOtherTaxCredits = fcurTotalOtherTaxCredits;
  }
  public tblnz_rtnpieannlineitem with_fcurTotalOtherTaxCredits(java.math.BigDecimal fcurTotalOtherTaxCredits) {
    this.fcurTotalOtherTaxCredits = fcurTotalOtherTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalICTaxCredits;
  public java.math.BigDecimal get_fcurTotalICTaxCredits() {
    return fcurTotalICTaxCredits;
  }
  public void set_fcurTotalICTaxCredits(java.math.BigDecimal fcurTotalICTaxCredits) {
    this.fcurTotalICTaxCredits = fcurTotalICTaxCredits;
  }
  public tblnz_rtnpieannlineitem with_fcurTotalICTaxCredits(java.math.BigDecimal fcurTotalICTaxCredits) {
    this.fcurTotalICTaxCredits = fcurTotalICTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTotalRWTTaxCredits;
  public java.math.BigDecimal get_fcurTotalRWTTaxCredits() {
    return fcurTotalRWTTaxCredits;
  }
  public void set_fcurTotalRWTTaxCredits(java.math.BigDecimal fcurTotalRWTTaxCredits) {
    this.fcurTotalRWTTaxCredits = fcurTotalRWTTaxCredits;
  }
  public tblnz_rtnpieannlineitem with_fcurTotalRWTTaxCredits(java.math.BigDecimal fcurTotalRWTTaxCredits) {
    this.fcurTotalRWTTaxCredits = fcurTotalRWTTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurTaxPaymentExitedInvestors;
  public java.math.BigDecimal get_fcurTaxPaymentExitedInvestors() {
    return fcurTaxPaymentExitedInvestors;
  }
  public void set_fcurTaxPaymentExitedInvestors(java.math.BigDecimal fcurTaxPaymentExitedInvestors) {
    this.fcurTaxPaymentExitedInvestors = fcurTaxPaymentExitedInvestors;
  }
  public tblnz_rtnpieannlineitem with_fcurTaxPaymentExitedInvestors(java.math.BigDecimal fcurTaxPaymentExitedInvestors) {
    this.fcurTaxPaymentExitedInvestors = fcurTaxPaymentExitedInvestors;
    return this;
  }
  private String fstrHomeAddressLine1;
  public String get_fstrHomeAddressLine1() {
    return fstrHomeAddressLine1;
  }
  public void set_fstrHomeAddressLine1(String fstrHomeAddressLine1) {
    this.fstrHomeAddressLine1 = fstrHomeAddressLine1;
  }
  public tblnz_rtnpieannlineitem with_fstrHomeAddressLine1(String fstrHomeAddressLine1) {
    this.fstrHomeAddressLine1 = fstrHomeAddressLine1;
    return this;
  }
  private String fstrHomeAddressLine2;
  public String get_fstrHomeAddressLine2() {
    return fstrHomeAddressLine2;
  }
  public void set_fstrHomeAddressLine2(String fstrHomeAddressLine2) {
    this.fstrHomeAddressLine2 = fstrHomeAddressLine2;
  }
  public tblnz_rtnpieannlineitem with_fstrHomeAddressLine2(String fstrHomeAddressLine2) {
    this.fstrHomeAddressLine2 = fstrHomeAddressLine2;
    return this;
  }
  private String fstrHomeAddressLine3;
  public String get_fstrHomeAddressLine3() {
    return fstrHomeAddressLine3;
  }
  public void set_fstrHomeAddressLine3(String fstrHomeAddressLine3) {
    this.fstrHomeAddressLine3 = fstrHomeAddressLine3;
  }
  public tblnz_rtnpieannlineitem with_fstrHomeAddressLine3(String fstrHomeAddressLine3) {
    this.fstrHomeAddressLine3 = fstrHomeAddressLine3;
    return this;
  }
  private String fstrHomeAddressLine4;
  public String get_fstrHomeAddressLine4() {
    return fstrHomeAddressLine4;
  }
  public void set_fstrHomeAddressLine4(String fstrHomeAddressLine4) {
    this.fstrHomeAddressLine4 = fstrHomeAddressLine4;
  }
  public tblnz_rtnpieannlineitem with_fstrHomeAddressLine4(String fstrHomeAddressLine4) {
    this.fstrHomeAddressLine4 = fstrHomeAddressLine4;
    return this;
  }
  private String fstrCountry;
  public String get_fstrCountry() {
    return fstrCountry;
  }
  public void set_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
  }
  public tblnz_rtnpieannlineitem with_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
    return this;
  }
  private String fstrCountryCode;
  public String get_fstrCountryCode() {
    return fstrCountryCode;
  }
  public void set_fstrCountryCode(String fstrCountryCode) {
    this.fstrCountryCode = fstrCountryCode;
  }
  public tblnz_rtnpieannlineitem with_fstrCountryCode(String fstrCountryCode) {
    this.fstrCountryCode = fstrCountryCode;
    return this;
  }
  private String fstrHomeTaxFileNumber;
  public String get_fstrHomeTaxFileNumber() {
    return fstrHomeTaxFileNumber;
  }
  public void set_fstrHomeTaxFileNumber(String fstrHomeTaxFileNumber) {
    this.fstrHomeTaxFileNumber = fstrHomeTaxFileNumber;
  }
  public tblnz_rtnpieannlineitem with_fstrHomeTaxFileNumber(String fstrHomeTaxFileNumber) {
    this.fstrHomeTaxFileNumber = fstrHomeTaxFileNumber;
    return this;
  }
  private String fstrNFIDTA;
  public String get_fstrNFIDTA() {
    return fstrNFIDTA;
  }
  public void set_fstrNFIDTA(String fstrNFIDTA) {
    this.fstrNFIDTA = fstrNFIDTA;
  }
  public tblnz_rtnpieannlineitem with_fstrNFIDTA(String fstrNFIDTA) {
    this.fstrNFIDTA = fstrNFIDTA;
    return this;
  }
  private Integer fblnHomeTaxFileDeclaration;
  public Integer get_fblnHomeTaxFileDeclaration() {
    return fblnHomeTaxFileDeclaration;
  }
  public void set_fblnHomeTaxFileDeclaration(Integer fblnHomeTaxFileDeclaration) {
    this.fblnHomeTaxFileDeclaration = fblnHomeTaxFileDeclaration;
  }
  public tblnz_rtnpieannlineitem with_fblnHomeTaxFileDeclaration(Integer fblnHomeTaxFileDeclaration) {
    this.fblnHomeTaxFileDeclaration = fblnHomeTaxFileDeclaration;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnpieannlineitem with_fstrWho(String fstrWho) {
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
  public tblnz_rtnpieannlineitem with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpieannlineitem)) {
      return false;
    }
    tblnz_rtnpieannlineitem that = (tblnz_rtnpieannlineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrPIEName == null ? that.fstrPIEName == null : this.fstrPIEName.equals(that.fstrPIEName));
    equal = equal && (this.fstrPIEIRDNumber == null ? that.fstrPIEIRDNumber == null : this.fstrPIEIRDNumber.equals(that.fstrPIEIRDNumber));
    equal = equal && (this.fstrInvestorName == null ? that.fstrInvestorName == null : this.fstrInvestorName.equals(that.fstrInvestorName));
    equal = equal && (this.fstrInvestorIRDNumber == null ? that.fstrInvestorIRDNumber == null : this.fstrInvestorIRDNumber.equals(that.fstrInvestorIRDNumber));
    equal = equal && (this.fstrRecipientStatus == null ? that.fstrRecipientStatus == null : this.fstrRecipientStatus.equals(that.fstrRecipientStatus));
    equal = equal && (this.fdtmInvestorDateOfBirth == null ? that.fdtmInvestorDateOfBirth == null : this.fdtmInvestorDateOfBirth.equals(that.fdtmInvestorDateOfBirth));
    equal = equal && (this.fstrInvestorCertIdentifier == null ? that.fstrInvestorCertIdentifier == null : this.fstrInvestorCertIdentifier.equals(that.fstrInvestorCertIdentifier));
    equal = equal && (this.fcurRateYearEnd == null ? that.fcurRateYearEnd == null : this.fcurRateYearEnd.equals(that.fcurRateYearEnd));
    equal = equal && (this.fblnRateChanged == null ? that.fblnRateChanged == null : this.fblnRateChanged.equals(that.fblnRateChanged));
    equal = equal && (this.fcurUnitsHeldYearEnd == null ? that.fcurUnitsHeldYearEnd == null : this.fcurUnitsHeldYearEnd.equals(that.fcurUnitsHeldYearEnd));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fcurTotalIncomeLoss == null ? that.fcurTotalIncomeLoss == null : this.fcurTotalIncomeLoss.equals(that.fcurTotalIncomeLoss));
    equal = equal && (this.fcurTotalTaxCredits == null ? that.fcurTotalTaxCredits == null : this.fcurTotalTaxCredits.equals(that.fcurTotalTaxCredits));
    equal = equal && (this.fcurNetTaxPaid == null ? that.fcurNetTaxPaid == null : this.fcurNetTaxPaid.equals(that.fcurNetTaxPaid));
    equal = equal && (this.fcurTaxableIncomeLowMid == null ? that.fcurTaxableIncomeLowMid == null : this.fcurTaxableIncomeLowMid.equals(that.fcurTaxableIncomeLowMid));
    equal = equal && (this.fcurTaxPaidLowMid == null ? that.fcurTaxPaidLowMid == null : this.fcurTaxPaidLowMid.equals(that.fcurTaxPaidLowMid));
    equal = equal && (this.fcurTotalTaxCreditsLowMid == null ? that.fcurTotalTaxCreditsLowMid == null : this.fcurTotalTaxCreditsLowMid.equals(that.fcurTotalTaxCreditsLowMid));
    equal = equal && (this.fcurZeroExitedTaxableIncome == null ? that.fcurZeroExitedTaxableIncome == null : this.fcurZeroExitedTaxableIncome.equals(that.fcurZeroExitedTaxableIncome));
    equal = equal && (this.fcurTotalForeignTaxCredits == null ? that.fcurTotalForeignTaxCredits == null : this.fcurTotalForeignTaxCredits.equals(that.fcurTotalForeignTaxCredits));
    equal = equal && (this.fcurTotalOtherTaxCredits == null ? that.fcurTotalOtherTaxCredits == null : this.fcurTotalOtherTaxCredits.equals(that.fcurTotalOtherTaxCredits));
    equal = equal && (this.fcurTotalICTaxCredits == null ? that.fcurTotalICTaxCredits == null : this.fcurTotalICTaxCredits.equals(that.fcurTotalICTaxCredits));
    equal = equal && (this.fcurTotalRWTTaxCredits == null ? that.fcurTotalRWTTaxCredits == null : this.fcurTotalRWTTaxCredits.equals(that.fcurTotalRWTTaxCredits));
    equal = equal && (this.fcurTaxPaymentExitedInvestors == null ? that.fcurTaxPaymentExitedInvestors == null : this.fcurTaxPaymentExitedInvestors.equals(that.fcurTaxPaymentExitedInvestors));
    equal = equal && (this.fstrHomeAddressLine1 == null ? that.fstrHomeAddressLine1 == null : this.fstrHomeAddressLine1.equals(that.fstrHomeAddressLine1));
    equal = equal && (this.fstrHomeAddressLine2 == null ? that.fstrHomeAddressLine2 == null : this.fstrHomeAddressLine2.equals(that.fstrHomeAddressLine2));
    equal = equal && (this.fstrHomeAddressLine3 == null ? that.fstrHomeAddressLine3 == null : this.fstrHomeAddressLine3.equals(that.fstrHomeAddressLine3));
    equal = equal && (this.fstrHomeAddressLine4 == null ? that.fstrHomeAddressLine4 == null : this.fstrHomeAddressLine4.equals(that.fstrHomeAddressLine4));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrCountryCode == null ? that.fstrCountryCode == null : this.fstrCountryCode.equals(that.fstrCountryCode));
    equal = equal && (this.fstrHomeTaxFileNumber == null ? that.fstrHomeTaxFileNumber == null : this.fstrHomeTaxFileNumber.equals(that.fstrHomeTaxFileNumber));
    equal = equal && (this.fstrNFIDTA == null ? that.fstrNFIDTA == null : this.fstrNFIDTA.equals(that.fstrNFIDTA));
    equal = equal && (this.fblnHomeTaxFileDeclaration == null ? that.fblnHomeTaxFileDeclaration == null : this.fblnHomeTaxFileDeclaration.equals(that.fblnHomeTaxFileDeclaration));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpieannlineitem)) {
      return false;
    }
    tblnz_rtnpieannlineitem that = (tblnz_rtnpieannlineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrPIEName == null ? that.fstrPIEName == null : this.fstrPIEName.equals(that.fstrPIEName));
    equal = equal && (this.fstrPIEIRDNumber == null ? that.fstrPIEIRDNumber == null : this.fstrPIEIRDNumber.equals(that.fstrPIEIRDNumber));
    equal = equal && (this.fstrInvestorName == null ? that.fstrInvestorName == null : this.fstrInvestorName.equals(that.fstrInvestorName));
    equal = equal && (this.fstrInvestorIRDNumber == null ? that.fstrInvestorIRDNumber == null : this.fstrInvestorIRDNumber.equals(that.fstrInvestorIRDNumber));
    equal = equal && (this.fstrRecipientStatus == null ? that.fstrRecipientStatus == null : this.fstrRecipientStatus.equals(that.fstrRecipientStatus));
    equal = equal && (this.fdtmInvestorDateOfBirth == null ? that.fdtmInvestorDateOfBirth == null : this.fdtmInvestorDateOfBirth.equals(that.fdtmInvestorDateOfBirth));
    equal = equal && (this.fstrInvestorCertIdentifier == null ? that.fstrInvestorCertIdentifier == null : this.fstrInvestorCertIdentifier.equals(that.fstrInvestorCertIdentifier));
    equal = equal && (this.fcurRateYearEnd == null ? that.fcurRateYearEnd == null : this.fcurRateYearEnd.equals(that.fcurRateYearEnd));
    equal = equal && (this.fblnRateChanged == null ? that.fblnRateChanged == null : this.fblnRateChanged.equals(that.fblnRateChanged));
    equal = equal && (this.fcurUnitsHeldYearEnd == null ? that.fcurUnitsHeldYearEnd == null : this.fcurUnitsHeldYearEnd.equals(that.fcurUnitsHeldYearEnd));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fcurTotalIncomeLoss == null ? that.fcurTotalIncomeLoss == null : this.fcurTotalIncomeLoss.equals(that.fcurTotalIncomeLoss));
    equal = equal && (this.fcurTotalTaxCredits == null ? that.fcurTotalTaxCredits == null : this.fcurTotalTaxCredits.equals(that.fcurTotalTaxCredits));
    equal = equal && (this.fcurNetTaxPaid == null ? that.fcurNetTaxPaid == null : this.fcurNetTaxPaid.equals(that.fcurNetTaxPaid));
    equal = equal && (this.fcurTaxableIncomeLowMid == null ? that.fcurTaxableIncomeLowMid == null : this.fcurTaxableIncomeLowMid.equals(that.fcurTaxableIncomeLowMid));
    equal = equal && (this.fcurTaxPaidLowMid == null ? that.fcurTaxPaidLowMid == null : this.fcurTaxPaidLowMid.equals(that.fcurTaxPaidLowMid));
    equal = equal && (this.fcurTotalTaxCreditsLowMid == null ? that.fcurTotalTaxCreditsLowMid == null : this.fcurTotalTaxCreditsLowMid.equals(that.fcurTotalTaxCreditsLowMid));
    equal = equal && (this.fcurZeroExitedTaxableIncome == null ? that.fcurZeroExitedTaxableIncome == null : this.fcurZeroExitedTaxableIncome.equals(that.fcurZeroExitedTaxableIncome));
    equal = equal && (this.fcurTotalForeignTaxCredits == null ? that.fcurTotalForeignTaxCredits == null : this.fcurTotalForeignTaxCredits.equals(that.fcurTotalForeignTaxCredits));
    equal = equal && (this.fcurTotalOtherTaxCredits == null ? that.fcurTotalOtherTaxCredits == null : this.fcurTotalOtherTaxCredits.equals(that.fcurTotalOtherTaxCredits));
    equal = equal && (this.fcurTotalICTaxCredits == null ? that.fcurTotalICTaxCredits == null : this.fcurTotalICTaxCredits.equals(that.fcurTotalICTaxCredits));
    equal = equal && (this.fcurTotalRWTTaxCredits == null ? that.fcurTotalRWTTaxCredits == null : this.fcurTotalRWTTaxCredits.equals(that.fcurTotalRWTTaxCredits));
    equal = equal && (this.fcurTaxPaymentExitedInvestors == null ? that.fcurTaxPaymentExitedInvestors == null : this.fcurTaxPaymentExitedInvestors.equals(that.fcurTaxPaymentExitedInvestors));
    equal = equal && (this.fstrHomeAddressLine1 == null ? that.fstrHomeAddressLine1 == null : this.fstrHomeAddressLine1.equals(that.fstrHomeAddressLine1));
    equal = equal && (this.fstrHomeAddressLine2 == null ? that.fstrHomeAddressLine2 == null : this.fstrHomeAddressLine2.equals(that.fstrHomeAddressLine2));
    equal = equal && (this.fstrHomeAddressLine3 == null ? that.fstrHomeAddressLine3 == null : this.fstrHomeAddressLine3.equals(that.fstrHomeAddressLine3));
    equal = equal && (this.fstrHomeAddressLine4 == null ? that.fstrHomeAddressLine4 == null : this.fstrHomeAddressLine4.equals(that.fstrHomeAddressLine4));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrCountryCode == null ? that.fstrCountryCode == null : this.fstrCountryCode.equals(that.fstrCountryCode));
    equal = equal && (this.fstrHomeTaxFileNumber == null ? that.fstrHomeTaxFileNumber == null : this.fstrHomeTaxFileNumber.equals(that.fstrHomeTaxFileNumber));
    equal = equal && (this.fstrNFIDTA == null ? that.fstrNFIDTA == null : this.fstrNFIDTA.equals(that.fstrNFIDTA));
    equal = equal && (this.fblnHomeTaxFileDeclaration == null ? that.fblnHomeTaxFileDeclaration == null : this.fblnHomeTaxFileDeclaration.equals(that.fblnHomeTaxFileDeclaration));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrPIEName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrPIEIRDNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrInvestorName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrInvestorIRDNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrRecipientStatus = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmInvestorDateOfBirth = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrInvestorCertIdentifier = JdbcWritableBridge.readString(10, __dbResults);
    this.fcurRateYearEnd = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fblnRateChanged = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurUnitsHeldYearEnd = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fdtmPeriod = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurTotalIncomeLoss = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalTaxCredits = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurNetTaxPaid = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTaxableIncomeLowMid = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTaxPaidLowMid = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalTaxCreditsLowMid = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurZeroExitedTaxableIncome = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalForeignTaxCredits = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTotalOtherTaxCredits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurTotalICTaxCredits = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTotalRWTTaxCredits = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxPaymentExitedInvestors = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fstrHomeAddressLine1 = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrHomeAddressLine2 = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrHomeAddressLine3 = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrHomeAddressLine4 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrCountryCode = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrHomeTaxFileNumber = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrNFIDTA = JdbcWritableBridge.readString(34, __dbResults);
    this.fblnHomeTaxFileDeclaration = JdbcWritableBridge.readInteger(35, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(36, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(37, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrPIEName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrPIEIRDNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrInvestorName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrInvestorIRDNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrRecipientStatus = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmInvestorDateOfBirth = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrInvestorCertIdentifier = JdbcWritableBridge.readString(10, __dbResults);
    this.fcurRateYearEnd = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fblnRateChanged = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurUnitsHeldYearEnd = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fdtmPeriod = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurTotalIncomeLoss = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalTaxCredits = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurNetTaxPaid = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTaxableIncomeLowMid = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTaxPaidLowMid = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalTaxCreditsLowMid = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurZeroExitedTaxableIncome = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalForeignTaxCredits = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTotalOtherTaxCredits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurTotalICTaxCredits = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTotalRWTTaxCredits = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxPaymentExitedInvestors = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fstrHomeAddressLine1 = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrHomeAddressLine2 = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrHomeAddressLine3 = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrHomeAddressLine4 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrCountryCode = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrHomeTaxFileNumber = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrNFIDTA = JdbcWritableBridge.readString(34, __dbResults);
    this.fblnHomeTaxFileDeclaration = JdbcWritableBridge.readInteger(35, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIEName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIEIRDNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvestorName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvestorIRDNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientStatus, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInvestorDateOfBirth, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvestorCertIdentifier, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRateYearEnd, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRateChanged, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnitsHeldYearEnd, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriod, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeLoss, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCredits, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetTaxPaid, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncomeLowMid, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaidLowMid, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCreditsLowMid, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurZeroExitedTaxableIncome, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalForeignTaxCredits, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherTaxCredits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalICTaxCredits, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWTTaxCredits, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaymentExitedInvestors, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeAddressLine1, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeAddressLine2, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeAddressLine3, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeAddressLine4, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountryCode, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeTaxFileNumber, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNFIDTA, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHomeTaxFileDeclaration, 35 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 37 + __off, 93, __dbStmt);
    return 37;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIEName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIEIRDNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvestorName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvestorIRDNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientStatus, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInvestorDateOfBirth, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvestorCertIdentifier, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRateYearEnd, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRateChanged, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnitsHeldYearEnd, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriod, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeLoss, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCredits, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetTaxPaid, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableIncomeLowMid, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaidLowMid, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCreditsLowMid, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurZeroExitedTaxableIncome, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalForeignTaxCredits, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherTaxCredits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalICTaxCredits, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWTTaxCredits, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaymentExitedInvestors, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeAddressLine1, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeAddressLine2, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeAddressLine3, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeAddressLine4, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountryCode, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHomeTaxFileNumber, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNFIDTA, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHomeTaxFileDeclaration, 35 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 37 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64LineItemKey = null;
    } else {
    this.fi64LineItemKey = Long.valueOf(__dataIn.readLong());
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
        this.fstrPIEName = null;
    } else {
    this.fstrPIEName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPIEIRDNumber = null;
    } else {
    this.fstrPIEIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrInvestorName = null;
    } else {
    this.fstrInvestorName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrInvestorIRDNumber = null;
    } else {
    this.fstrInvestorIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientStatus = null;
    } else {
    this.fstrRecipientStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmInvestorDateOfBirth = null;
    } else {
    this.fdtmInvestorDateOfBirth = new Timestamp(__dataIn.readLong());
    this.fdtmInvestorDateOfBirth.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrInvestorCertIdentifier = null;
    } else {
    this.fstrInvestorCertIdentifier = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRateYearEnd = null;
    } else {
    this.fcurRateYearEnd = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRateChanged = null;
    } else {
    this.fblnRateChanged = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurUnitsHeldYearEnd = null;
    } else {
    this.fcurUnitsHeldYearEnd = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPeriod = null;
    } else {
    this.fdtmPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncomeLoss = null;
    } else {
    this.fcurTotalIncomeLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxCredits = null;
    } else {
    this.fcurTotalTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetTaxPaid = null;
    } else {
    this.fcurNetTaxPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxableIncomeLowMid = null;
    } else {
    this.fcurTaxableIncomeLowMid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPaidLowMid = null;
    } else {
    this.fcurTaxPaidLowMid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxCreditsLowMid = null;
    } else {
    this.fcurTotalTaxCreditsLowMid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurZeroExitedTaxableIncome = null;
    } else {
    this.fcurZeroExitedTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalForeignTaxCredits = null;
    } else {
    this.fcurTotalForeignTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOtherTaxCredits = null;
    } else {
    this.fcurTotalOtherTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalICTaxCredits = null;
    } else {
    this.fcurTotalICTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalRWTTaxCredits = null;
    } else {
    this.fcurTotalRWTTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPaymentExitedInvestors = null;
    } else {
    this.fcurTaxPaymentExitedInvestors = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHomeAddressLine1 = null;
    } else {
    this.fstrHomeAddressLine1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHomeAddressLine2 = null;
    } else {
    this.fstrHomeAddressLine2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHomeAddressLine3 = null;
    } else {
    this.fstrHomeAddressLine3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHomeAddressLine4 = null;
    } else {
    this.fstrHomeAddressLine4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry = null;
    } else {
    this.fstrCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountryCode = null;
    } else {
    this.fstrCountryCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHomeTaxFileNumber = null;
    } else {
    this.fstrHomeTaxFileNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNFIDTA = null;
    } else {
    this.fstrNFIDTA = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHomeTaxFileDeclaration = null;
    } else {
    this.fblnHomeTaxFileDeclaration = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
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
    if (null == this.fstrPIEName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIEName);
    }
    if (null == this.fstrPIEIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIEIRDNumber);
    }
    if (null == this.fstrInvestorName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvestorName);
    }
    if (null == this.fstrInvestorIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvestorIRDNumber);
    }
    if (null == this.fstrRecipientStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientStatus);
    }
    if (null == this.fdtmInvestorDateOfBirth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInvestorDateOfBirth.getTime());
    __dataOut.writeInt(this.fdtmInvestorDateOfBirth.getNanos());
    }
    if (null == this.fstrInvestorCertIdentifier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvestorCertIdentifier);
    }
    if (null == this.fcurRateYearEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRateYearEnd, __dataOut);
    }
    if (null == this.fblnRateChanged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRateChanged);
    }
    if (null == this.fcurUnitsHeldYearEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnitsHeldYearEnd, __dataOut);
    }
    if (null == this.fdtmPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriod.getTime());
    __dataOut.writeInt(this.fdtmPeriod.getNanos());
    }
    if (null == this.fcurTotalIncomeLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeLoss, __dataOut);
    }
    if (null == this.fcurTotalTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCredits, __dataOut);
    }
    if (null == this.fcurNetTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetTaxPaid, __dataOut);
    }
    if (null == this.fcurTaxableIncomeLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncomeLowMid, __dataOut);
    }
    if (null == this.fcurTaxPaidLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaidLowMid, __dataOut);
    }
    if (null == this.fcurTotalTaxCreditsLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCreditsLowMid, __dataOut);
    }
    if (null == this.fcurZeroExitedTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurZeroExitedTaxableIncome, __dataOut);
    }
    if (null == this.fcurTotalForeignTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalForeignTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalICTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalICTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalRWTTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWTTaxCredits, __dataOut);
    }
    if (null == this.fcurTaxPaymentExitedInvestors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaymentExitedInvestors, __dataOut);
    }
    if (null == this.fstrHomeAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeAddressLine1);
    }
    if (null == this.fstrHomeAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeAddressLine2);
    }
    if (null == this.fstrHomeAddressLine3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeAddressLine3);
    }
    if (null == this.fstrHomeAddressLine4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeAddressLine4);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountryCode);
    }
    if (null == this.fstrHomeTaxFileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeTaxFileNumber);
    }
    if (null == this.fstrNFIDTA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNFIDTA);
    }
    if (null == this.fblnHomeTaxFileDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHomeTaxFileDeclaration);
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
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
    if (null == this.fstrPIEName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIEName);
    }
    if (null == this.fstrPIEIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIEIRDNumber);
    }
    if (null == this.fstrInvestorName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvestorName);
    }
    if (null == this.fstrInvestorIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvestorIRDNumber);
    }
    if (null == this.fstrRecipientStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientStatus);
    }
    if (null == this.fdtmInvestorDateOfBirth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInvestorDateOfBirth.getTime());
    __dataOut.writeInt(this.fdtmInvestorDateOfBirth.getNanos());
    }
    if (null == this.fstrInvestorCertIdentifier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvestorCertIdentifier);
    }
    if (null == this.fcurRateYearEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRateYearEnd, __dataOut);
    }
    if (null == this.fblnRateChanged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRateChanged);
    }
    if (null == this.fcurUnitsHeldYearEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnitsHeldYearEnd, __dataOut);
    }
    if (null == this.fdtmPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriod.getTime());
    __dataOut.writeInt(this.fdtmPeriod.getNanos());
    }
    if (null == this.fcurTotalIncomeLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeLoss, __dataOut);
    }
    if (null == this.fcurTotalTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCredits, __dataOut);
    }
    if (null == this.fcurNetTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetTaxPaid, __dataOut);
    }
    if (null == this.fcurTaxableIncomeLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableIncomeLowMid, __dataOut);
    }
    if (null == this.fcurTaxPaidLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaidLowMid, __dataOut);
    }
    if (null == this.fcurTotalTaxCreditsLowMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCreditsLowMid, __dataOut);
    }
    if (null == this.fcurZeroExitedTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurZeroExitedTaxableIncome, __dataOut);
    }
    if (null == this.fcurTotalForeignTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalForeignTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalICTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalICTaxCredits, __dataOut);
    }
    if (null == this.fcurTotalRWTTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWTTaxCredits, __dataOut);
    }
    if (null == this.fcurTaxPaymentExitedInvestors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaymentExitedInvestors, __dataOut);
    }
    if (null == this.fstrHomeAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeAddressLine1);
    }
    if (null == this.fstrHomeAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeAddressLine2);
    }
    if (null == this.fstrHomeAddressLine3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeAddressLine3);
    }
    if (null == this.fstrHomeAddressLine4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeAddressLine4);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountryCode);
    }
    if (null == this.fstrHomeTaxFileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHomeTaxFileNumber);
    }
    if (null == this.fstrNFIDTA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNFIDTA);
    }
    if (null == this.fblnHomeTaxFileDeclaration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHomeTaxFileDeclaration);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIEName==null?"\\N":fstrPIEName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIEIRDNumber==null?"\\N":fstrPIEIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvestorName==null?"\\N":fstrInvestorName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvestorIRDNumber==null?"\\N":fstrInvestorIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientStatus==null?"\\N":fstrRecipientStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInvestorDateOfBirth==null?"\\N":"" + fdtmInvestorDateOfBirth, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvestorCertIdentifier==null?"\\N":fstrInvestorCertIdentifier, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRateYearEnd==null?"\\N":fcurRateYearEnd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRateChanged==null?"\\N":"" + fblnRateChanged, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnitsHeldYearEnd==null?"\\N":fcurUnitsHeldYearEnd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriod==null?"\\N":"" + fdtmPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeLoss==null?"\\N":fcurTotalIncomeLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCredits==null?"\\N":fcurTotalTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetTaxPaid==null?"\\N":fcurNetTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncomeLowMid==null?"\\N":fcurTaxableIncomeLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaidLowMid==null?"\\N":fcurTaxPaidLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCreditsLowMid==null?"\\N":fcurTotalTaxCreditsLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurZeroExitedTaxableIncome==null?"\\N":fcurZeroExitedTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalForeignTaxCredits==null?"\\N":fcurTotalForeignTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherTaxCredits==null?"\\N":fcurTotalOtherTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalICTaxCredits==null?"\\N":fcurTotalICTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWTTaxCredits==null?"\\N":fcurTotalRWTTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaymentExitedInvestors==null?"\\N":fcurTaxPaymentExitedInvestors.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeAddressLine1==null?"\\N":fstrHomeAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeAddressLine2==null?"\\N":fstrHomeAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeAddressLine3==null?"\\N":fstrHomeAddressLine3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeAddressLine4==null?"\\N":fstrHomeAddressLine4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountryCode==null?"\\N":fstrCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeTaxFileNumber==null?"\\N":fstrHomeTaxFileNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNFIDTA==null?"\\N":fstrNFIDTA, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHomeTaxFileDeclaration==null?"\\N":"" + fblnHomeTaxFileDeclaration, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIEName==null?"\\N":fstrPIEName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIEIRDNumber==null?"\\N":fstrPIEIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvestorName==null?"\\N":fstrInvestorName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvestorIRDNumber==null?"\\N":fstrInvestorIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientStatus==null?"\\N":fstrRecipientStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInvestorDateOfBirth==null?"\\N":"" + fdtmInvestorDateOfBirth, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvestorCertIdentifier==null?"\\N":fstrInvestorCertIdentifier, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRateYearEnd==null?"\\N":fcurRateYearEnd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRateChanged==null?"\\N":"" + fblnRateChanged, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnitsHeldYearEnd==null?"\\N":fcurUnitsHeldYearEnd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriod==null?"\\N":"" + fdtmPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeLoss==null?"\\N":fcurTotalIncomeLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCredits==null?"\\N":fcurTotalTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetTaxPaid==null?"\\N":fcurNetTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableIncomeLowMid==null?"\\N":fcurTaxableIncomeLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaidLowMid==null?"\\N":fcurTaxPaidLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCreditsLowMid==null?"\\N":fcurTotalTaxCreditsLowMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurZeroExitedTaxableIncome==null?"\\N":fcurZeroExitedTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalForeignTaxCredits==null?"\\N":fcurTotalForeignTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherTaxCredits==null?"\\N":fcurTotalOtherTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalICTaxCredits==null?"\\N":fcurTotalICTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWTTaxCredits==null?"\\N":fcurTotalRWTTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaymentExitedInvestors==null?"\\N":fcurTaxPaymentExitedInvestors.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeAddressLine1==null?"\\N":fstrHomeAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeAddressLine2==null?"\\N":fstrHomeAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeAddressLine3==null?"\\N":fstrHomeAddressLine3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeAddressLine4==null?"\\N":fstrHomeAddressLine4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountryCode==null?"\\N":fstrCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHomeTaxFileNumber==null?"\\N":fstrHomeTaxFileNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNFIDTA==null?"\\N":fstrNFIDTA, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHomeTaxFileDeclaration==null?"\\N":"" + fblnHomeTaxFileDeclaration, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrPIEName = null; } else {
      this.fstrPIEName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPIEIRDNumber = null; } else {
      this.fstrPIEIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInvestorName = null; } else {
      this.fstrInvestorName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInvestorIRDNumber = null; } else {
      this.fstrInvestorIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientStatus = null; } else {
      this.fstrRecipientStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInvestorDateOfBirth = null; } else {
      this.fdtmInvestorDateOfBirth = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInvestorCertIdentifier = null; } else {
      this.fstrInvestorCertIdentifier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRateYearEnd = null; } else {
      this.fcurRateYearEnd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRateChanged = null; } else {
      this.fblnRateChanged = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnitsHeldYearEnd = null; } else {
      this.fcurUnitsHeldYearEnd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriod = null; } else {
      this.fdtmPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeLoss = null; } else {
      this.fcurTotalIncomeLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCredits = null; } else {
      this.fcurTotalTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetTaxPaid = null; } else {
      this.fcurNetTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableIncomeLowMid = null; } else {
      this.fcurTaxableIncomeLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaidLowMid = null; } else {
      this.fcurTaxPaidLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCreditsLowMid = null; } else {
      this.fcurTotalTaxCreditsLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurZeroExitedTaxableIncome = null; } else {
      this.fcurZeroExitedTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalForeignTaxCredits = null; } else {
      this.fcurTotalForeignTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherTaxCredits = null; } else {
      this.fcurTotalOtherTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalICTaxCredits = null; } else {
      this.fcurTotalICTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWTTaxCredits = null; } else {
      this.fcurTotalRWTTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaymentExitedInvestors = null; } else {
      this.fcurTaxPaymentExitedInvestors = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeAddressLine1 = null; } else {
      this.fstrHomeAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeAddressLine2 = null; } else {
      this.fstrHomeAddressLine2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeAddressLine3 = null; } else {
      this.fstrHomeAddressLine3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeAddressLine4 = null; } else {
      this.fstrHomeAddressLine4 = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCountryCode = null; } else {
      this.fstrCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeTaxFileNumber = null; } else {
      this.fstrHomeTaxFileNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNFIDTA = null; } else {
      this.fstrNFIDTA = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHomeTaxFileDeclaration = null; } else {
      this.fblnHomeTaxFileDeclaration = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrPIEName = null; } else {
      this.fstrPIEName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPIEIRDNumber = null; } else {
      this.fstrPIEIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInvestorName = null; } else {
      this.fstrInvestorName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInvestorIRDNumber = null; } else {
      this.fstrInvestorIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientStatus = null; } else {
      this.fstrRecipientStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInvestorDateOfBirth = null; } else {
      this.fdtmInvestorDateOfBirth = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInvestorCertIdentifier = null; } else {
      this.fstrInvestorCertIdentifier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRateYearEnd = null; } else {
      this.fcurRateYearEnd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRateChanged = null; } else {
      this.fblnRateChanged = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnitsHeldYearEnd = null; } else {
      this.fcurUnitsHeldYearEnd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriod = null; } else {
      this.fdtmPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeLoss = null; } else {
      this.fcurTotalIncomeLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCredits = null; } else {
      this.fcurTotalTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetTaxPaid = null; } else {
      this.fcurNetTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableIncomeLowMid = null; } else {
      this.fcurTaxableIncomeLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaidLowMid = null; } else {
      this.fcurTaxPaidLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCreditsLowMid = null; } else {
      this.fcurTotalTaxCreditsLowMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurZeroExitedTaxableIncome = null; } else {
      this.fcurZeroExitedTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalForeignTaxCredits = null; } else {
      this.fcurTotalForeignTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherTaxCredits = null; } else {
      this.fcurTotalOtherTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalICTaxCredits = null; } else {
      this.fcurTotalICTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWTTaxCredits = null; } else {
      this.fcurTotalRWTTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaymentExitedInvestors = null; } else {
      this.fcurTaxPaymentExitedInvestors = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeAddressLine1 = null; } else {
      this.fstrHomeAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeAddressLine2 = null; } else {
      this.fstrHomeAddressLine2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeAddressLine3 = null; } else {
      this.fstrHomeAddressLine3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeAddressLine4 = null; } else {
      this.fstrHomeAddressLine4 = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCountryCode = null; } else {
      this.fstrCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHomeTaxFileNumber = null; } else {
      this.fstrHomeTaxFileNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNFIDTA = null; } else {
      this.fstrNFIDTA = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHomeTaxFileDeclaration = null; } else {
      this.fblnHomeTaxFileDeclaration = Integer.valueOf(__cur_str);
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
    tblnz_rtnpieannlineitem o = (tblnz_rtnpieannlineitem) super.clone();
    o.fdtmInvestorDateOfBirth = (o.fdtmInvestorDateOfBirth != null) ? (java.sql.Timestamp) o.fdtmInvestorDateOfBirth.clone() : null;
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnpieannlineitem o) throws CloneNotSupportedException {
    o.fdtmInvestorDateOfBirth = (o.fdtmInvestorDateOfBirth != null) ? (java.sql.Timestamp) o.fdtmInvestorDateOfBirth.clone() : null;
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrPIEName", this.fstrPIEName);
    __sqoop$field_map.put("fstrPIEIRDNumber", this.fstrPIEIRDNumber);
    __sqoop$field_map.put("fstrInvestorName", this.fstrInvestorName);
    __sqoop$field_map.put("fstrInvestorIRDNumber", this.fstrInvestorIRDNumber);
    __sqoop$field_map.put("fstrRecipientStatus", this.fstrRecipientStatus);
    __sqoop$field_map.put("fdtmInvestorDateOfBirth", this.fdtmInvestorDateOfBirth);
    __sqoop$field_map.put("fstrInvestorCertIdentifier", this.fstrInvestorCertIdentifier);
    __sqoop$field_map.put("fcurRateYearEnd", this.fcurRateYearEnd);
    __sqoop$field_map.put("fblnRateChanged", this.fblnRateChanged);
    __sqoop$field_map.put("fcurUnitsHeldYearEnd", this.fcurUnitsHeldYearEnd);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fcurTotalIncomeLoss", this.fcurTotalIncomeLoss);
    __sqoop$field_map.put("fcurTotalTaxCredits", this.fcurTotalTaxCredits);
    __sqoop$field_map.put("fcurNetTaxPaid", this.fcurNetTaxPaid);
    __sqoop$field_map.put("fcurTaxableIncomeLowMid", this.fcurTaxableIncomeLowMid);
    __sqoop$field_map.put("fcurTaxPaidLowMid", this.fcurTaxPaidLowMid);
    __sqoop$field_map.put("fcurTotalTaxCreditsLowMid", this.fcurTotalTaxCreditsLowMid);
    __sqoop$field_map.put("fcurZeroExitedTaxableIncome", this.fcurZeroExitedTaxableIncome);
    __sqoop$field_map.put("fcurTotalForeignTaxCredits", this.fcurTotalForeignTaxCredits);
    __sqoop$field_map.put("fcurTotalOtherTaxCredits", this.fcurTotalOtherTaxCredits);
    __sqoop$field_map.put("fcurTotalICTaxCredits", this.fcurTotalICTaxCredits);
    __sqoop$field_map.put("fcurTotalRWTTaxCredits", this.fcurTotalRWTTaxCredits);
    __sqoop$field_map.put("fcurTaxPaymentExitedInvestors", this.fcurTaxPaymentExitedInvestors);
    __sqoop$field_map.put("fstrHomeAddressLine1", this.fstrHomeAddressLine1);
    __sqoop$field_map.put("fstrHomeAddressLine2", this.fstrHomeAddressLine2);
    __sqoop$field_map.put("fstrHomeAddressLine3", this.fstrHomeAddressLine3);
    __sqoop$field_map.put("fstrHomeAddressLine4", this.fstrHomeAddressLine4);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrCountryCode", this.fstrCountryCode);
    __sqoop$field_map.put("fstrHomeTaxFileNumber", this.fstrHomeTaxFileNumber);
    __sqoop$field_map.put("fstrNFIDTA", this.fstrNFIDTA);
    __sqoop$field_map.put("fblnHomeTaxFileDeclaration", this.fblnHomeTaxFileDeclaration);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrPIEName", this.fstrPIEName);
    __sqoop$field_map.put("fstrPIEIRDNumber", this.fstrPIEIRDNumber);
    __sqoop$field_map.put("fstrInvestorName", this.fstrInvestorName);
    __sqoop$field_map.put("fstrInvestorIRDNumber", this.fstrInvestorIRDNumber);
    __sqoop$field_map.put("fstrRecipientStatus", this.fstrRecipientStatus);
    __sqoop$field_map.put("fdtmInvestorDateOfBirth", this.fdtmInvestorDateOfBirth);
    __sqoop$field_map.put("fstrInvestorCertIdentifier", this.fstrInvestorCertIdentifier);
    __sqoop$field_map.put("fcurRateYearEnd", this.fcurRateYearEnd);
    __sqoop$field_map.put("fblnRateChanged", this.fblnRateChanged);
    __sqoop$field_map.put("fcurUnitsHeldYearEnd", this.fcurUnitsHeldYearEnd);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fcurTotalIncomeLoss", this.fcurTotalIncomeLoss);
    __sqoop$field_map.put("fcurTotalTaxCredits", this.fcurTotalTaxCredits);
    __sqoop$field_map.put("fcurNetTaxPaid", this.fcurNetTaxPaid);
    __sqoop$field_map.put("fcurTaxableIncomeLowMid", this.fcurTaxableIncomeLowMid);
    __sqoop$field_map.put("fcurTaxPaidLowMid", this.fcurTaxPaidLowMid);
    __sqoop$field_map.put("fcurTotalTaxCreditsLowMid", this.fcurTotalTaxCreditsLowMid);
    __sqoop$field_map.put("fcurZeroExitedTaxableIncome", this.fcurZeroExitedTaxableIncome);
    __sqoop$field_map.put("fcurTotalForeignTaxCredits", this.fcurTotalForeignTaxCredits);
    __sqoop$field_map.put("fcurTotalOtherTaxCredits", this.fcurTotalOtherTaxCredits);
    __sqoop$field_map.put("fcurTotalICTaxCredits", this.fcurTotalICTaxCredits);
    __sqoop$field_map.put("fcurTotalRWTTaxCredits", this.fcurTotalRWTTaxCredits);
    __sqoop$field_map.put("fcurTaxPaymentExitedInvestors", this.fcurTaxPaymentExitedInvestors);
    __sqoop$field_map.put("fstrHomeAddressLine1", this.fstrHomeAddressLine1);
    __sqoop$field_map.put("fstrHomeAddressLine2", this.fstrHomeAddressLine2);
    __sqoop$field_map.put("fstrHomeAddressLine3", this.fstrHomeAddressLine3);
    __sqoop$field_map.put("fstrHomeAddressLine4", this.fstrHomeAddressLine4);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrCountryCode", this.fstrCountryCode);
    __sqoop$field_map.put("fstrHomeTaxFileNumber", this.fstrHomeTaxFileNumber);
    __sqoop$field_map.put("fstrNFIDTA", this.fstrNFIDTA);
    __sqoop$field_map.put("fblnHomeTaxFileDeclaration", this.fblnHomeTaxFileDeclaration);
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
