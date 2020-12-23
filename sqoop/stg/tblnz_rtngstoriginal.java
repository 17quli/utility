// ORM class for table 'tblnz_rtngstoriginal'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:35:57 NZDT 2020
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

public class tblnz_rtngstoriginal extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrFilingFreq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fstrFilingFreq = (String)value;
      }
    });
    setters.put("fstrSourceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fstrSourceType = (String)value;
      }
    });
    setters.put("fcurGSTTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurGSTTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTVoluntaryAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurPTVoluntaryAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTRefundTransfer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurPTRefundTransfer = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnTransitional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fblnTransitional = (Integer)value;
      }
    });
    setters.put("fstrWebLogonID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fstrWebLogonID = (String)value;
      }
    });
    setters.put("fstrVendorID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fstrVendorID = (String)value;
      }
    });
    setters.put("fstrIPAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fstrIPAddress = (String)value;
      }
    });
    setters.put("fblnDebitAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fblnDebitAdjustments = (Integer)value;
      }
    });
    setters.put("fcurDebitAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnP2DebitAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fblnP2DebitAdjustments = (Integer)value;
      }
    });
    setters.put("fcurP2DebitAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurP2DebitAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnCreditAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fblnCreditAdjustments = (Integer)value;
      }
    });
    setters.put("fcurCreditAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnP2CreditAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fblnP2CreditAdjustments = (Integer)value;
      }
    });
    setters.put("fcurP2CreditAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurP2CreditAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnFinalReturn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fblnFinalReturn = (Integer)value;
      }
    });
    setters.put("fblnHospice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fblnHospice = (Integer)value;
      }
    });
    setters.put("fstrHospiceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fstrHospiceType = (String)value;
      }
    });
    setters.put("fcurTotalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurTotalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurZeroSupplies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurZeroSupplies = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLongTermCareSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurLongTermCareSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurHospitalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurHospitalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitPrivateUse", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitPrivateUse = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitOneOff", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitOneOff = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitAssetsKept", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitAssetsKept = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitEntertainment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitEntertainment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitChangeOfAccounting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitChangeOfAccounting = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitExemptSupplies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitExemptSupplies = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitAdjustPrevRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitAdjustPrevRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitOther = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPurchases", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurTotalPurchases = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditPrivateGoods", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditPrivateGoods = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditPrivateAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditPrivateAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditChangeOfAccounting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditChangeOfAccounting = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditAdjustPrevRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditAdjustPrevRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditOther = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPart1GST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurTotalPart1GST = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2TotalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurP2TotalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2ZeroSupplies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurP2ZeroSupplies = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2LongTermSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurP2LongTermSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2HospitalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurP2HospitalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitP2PrivateUse", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitP2PrivateUse = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitP2OneOff", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitP2OneOff = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitP2AssetsKept", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitP2AssetsKept = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitP2Entertainment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitP2Entertainment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitP2ChangeOfAccounting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitP2ChangeOfAccounting = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitP2ExemptSupplies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitP2ExemptSupplies = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitP2AdjustPrevRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitP2AdjustPrevRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitP2Other", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurDebitP2Other = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2TotalPurchases", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurP2TotalPurchases = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditP2PrivateGoods", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditP2PrivateGoods = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditP2PrivateAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditP2PrivateAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditP2ChangeOfAccounting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditP2ChangeOfAccounting = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditP2AdjustPrevRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditP2AdjustPrevRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditP2Other", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurCreditP2Other = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPart2GST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurTotalPart2GST = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTransitionalGST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fcurTotalTransitionalGST = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngstoriginal.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtngstoriginal() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtngstoriginal with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_rtngstoriginal with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrFilingFreq;
  public String get_fstrFilingFreq() {
    return fstrFilingFreq;
  }
  public void set_fstrFilingFreq(String fstrFilingFreq) {
    this.fstrFilingFreq = fstrFilingFreq;
  }
  public tblnz_rtngstoriginal with_fstrFilingFreq(String fstrFilingFreq) {
    this.fstrFilingFreq = fstrFilingFreq;
    return this;
  }
  private String fstrSourceType;
  public String get_fstrSourceType() {
    return fstrSourceType;
  }
  public void set_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
  }
  public tblnz_rtngstoriginal with_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
    return this;
  }
  private java.math.BigDecimal fcurGSTTotal;
  public java.math.BigDecimal get_fcurGSTTotal() {
    return fcurGSTTotal;
  }
  public void set_fcurGSTTotal(java.math.BigDecimal fcurGSTTotal) {
    this.fcurGSTTotal = fcurGSTTotal;
  }
  public tblnz_rtngstoriginal with_fcurGSTTotal(java.math.BigDecimal fcurGSTTotal) {
    this.fcurGSTTotal = fcurGSTTotal;
    return this;
  }
  private java.math.BigDecimal fcurPTVoluntaryAmount;
  public java.math.BigDecimal get_fcurPTVoluntaryAmount() {
    return fcurPTVoluntaryAmount;
  }
  public void set_fcurPTVoluntaryAmount(java.math.BigDecimal fcurPTVoluntaryAmount) {
    this.fcurPTVoluntaryAmount = fcurPTVoluntaryAmount;
  }
  public tblnz_rtngstoriginal with_fcurPTVoluntaryAmount(java.math.BigDecimal fcurPTVoluntaryAmount) {
    this.fcurPTVoluntaryAmount = fcurPTVoluntaryAmount;
    return this;
  }
  private java.math.BigDecimal fcurPTRefundTransfer;
  public java.math.BigDecimal get_fcurPTRefundTransfer() {
    return fcurPTRefundTransfer;
  }
  public void set_fcurPTRefundTransfer(java.math.BigDecimal fcurPTRefundTransfer) {
    this.fcurPTRefundTransfer = fcurPTRefundTransfer;
  }
  public tblnz_rtngstoriginal with_fcurPTRefundTransfer(java.math.BigDecimal fcurPTRefundTransfer) {
    this.fcurPTRefundTransfer = fcurPTRefundTransfer;
    return this;
  }
  private Integer fblnTransitional;
  public Integer get_fblnTransitional() {
    return fblnTransitional;
  }
  public void set_fblnTransitional(Integer fblnTransitional) {
    this.fblnTransitional = fblnTransitional;
  }
  public tblnz_rtngstoriginal with_fblnTransitional(Integer fblnTransitional) {
    this.fblnTransitional = fblnTransitional;
    return this;
  }
  private String fstrWebLogonID;
  public String get_fstrWebLogonID() {
    return fstrWebLogonID;
  }
  public void set_fstrWebLogonID(String fstrWebLogonID) {
    this.fstrWebLogonID = fstrWebLogonID;
  }
  public tblnz_rtngstoriginal with_fstrWebLogonID(String fstrWebLogonID) {
    this.fstrWebLogonID = fstrWebLogonID;
    return this;
  }
  private String fstrVendorID;
  public String get_fstrVendorID() {
    return fstrVendorID;
  }
  public void set_fstrVendorID(String fstrVendorID) {
    this.fstrVendorID = fstrVendorID;
  }
  public tblnz_rtngstoriginal with_fstrVendorID(String fstrVendorID) {
    this.fstrVendorID = fstrVendorID;
    return this;
  }
  private String fstrIPAddress;
  public String get_fstrIPAddress() {
    return fstrIPAddress;
  }
  public void set_fstrIPAddress(String fstrIPAddress) {
    this.fstrIPAddress = fstrIPAddress;
  }
  public tblnz_rtngstoriginal with_fstrIPAddress(String fstrIPAddress) {
    this.fstrIPAddress = fstrIPAddress;
    return this;
  }
  private Integer fblnDebitAdjustments;
  public Integer get_fblnDebitAdjustments() {
    return fblnDebitAdjustments;
  }
  public void set_fblnDebitAdjustments(Integer fblnDebitAdjustments) {
    this.fblnDebitAdjustments = fblnDebitAdjustments;
  }
  public tblnz_rtngstoriginal with_fblnDebitAdjustments(Integer fblnDebitAdjustments) {
    this.fblnDebitAdjustments = fblnDebitAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurDebitAdjustments;
  public java.math.BigDecimal get_fcurDebitAdjustments() {
    return fcurDebitAdjustments;
  }
  public void set_fcurDebitAdjustments(java.math.BigDecimal fcurDebitAdjustments) {
    this.fcurDebitAdjustments = fcurDebitAdjustments;
  }
  public tblnz_rtngstoriginal with_fcurDebitAdjustments(java.math.BigDecimal fcurDebitAdjustments) {
    this.fcurDebitAdjustments = fcurDebitAdjustments;
    return this;
  }
  private Integer fblnP2DebitAdjustments;
  public Integer get_fblnP2DebitAdjustments() {
    return fblnP2DebitAdjustments;
  }
  public void set_fblnP2DebitAdjustments(Integer fblnP2DebitAdjustments) {
    this.fblnP2DebitAdjustments = fblnP2DebitAdjustments;
  }
  public tblnz_rtngstoriginal with_fblnP2DebitAdjustments(Integer fblnP2DebitAdjustments) {
    this.fblnP2DebitAdjustments = fblnP2DebitAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurP2DebitAdjustments;
  public java.math.BigDecimal get_fcurP2DebitAdjustments() {
    return fcurP2DebitAdjustments;
  }
  public void set_fcurP2DebitAdjustments(java.math.BigDecimal fcurP2DebitAdjustments) {
    this.fcurP2DebitAdjustments = fcurP2DebitAdjustments;
  }
  public tblnz_rtngstoriginal with_fcurP2DebitAdjustments(java.math.BigDecimal fcurP2DebitAdjustments) {
    this.fcurP2DebitAdjustments = fcurP2DebitAdjustments;
    return this;
  }
  private Integer fblnCreditAdjustments;
  public Integer get_fblnCreditAdjustments() {
    return fblnCreditAdjustments;
  }
  public void set_fblnCreditAdjustments(Integer fblnCreditAdjustments) {
    this.fblnCreditAdjustments = fblnCreditAdjustments;
  }
  public tblnz_rtngstoriginal with_fblnCreditAdjustments(Integer fblnCreditAdjustments) {
    this.fblnCreditAdjustments = fblnCreditAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurCreditAdjustments;
  public java.math.BigDecimal get_fcurCreditAdjustments() {
    return fcurCreditAdjustments;
  }
  public void set_fcurCreditAdjustments(java.math.BigDecimal fcurCreditAdjustments) {
    this.fcurCreditAdjustments = fcurCreditAdjustments;
  }
  public tblnz_rtngstoriginal with_fcurCreditAdjustments(java.math.BigDecimal fcurCreditAdjustments) {
    this.fcurCreditAdjustments = fcurCreditAdjustments;
    return this;
  }
  private Integer fblnP2CreditAdjustments;
  public Integer get_fblnP2CreditAdjustments() {
    return fblnP2CreditAdjustments;
  }
  public void set_fblnP2CreditAdjustments(Integer fblnP2CreditAdjustments) {
    this.fblnP2CreditAdjustments = fblnP2CreditAdjustments;
  }
  public tblnz_rtngstoriginal with_fblnP2CreditAdjustments(Integer fblnP2CreditAdjustments) {
    this.fblnP2CreditAdjustments = fblnP2CreditAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurP2CreditAdjustments;
  public java.math.BigDecimal get_fcurP2CreditAdjustments() {
    return fcurP2CreditAdjustments;
  }
  public void set_fcurP2CreditAdjustments(java.math.BigDecimal fcurP2CreditAdjustments) {
    this.fcurP2CreditAdjustments = fcurP2CreditAdjustments;
  }
  public tblnz_rtngstoriginal with_fcurP2CreditAdjustments(java.math.BigDecimal fcurP2CreditAdjustments) {
    this.fcurP2CreditAdjustments = fcurP2CreditAdjustments;
    return this;
  }
  private Integer fblnFinalReturn;
  public Integer get_fblnFinalReturn() {
    return fblnFinalReturn;
  }
  public void set_fblnFinalReturn(Integer fblnFinalReturn) {
    this.fblnFinalReturn = fblnFinalReturn;
  }
  public tblnz_rtngstoriginal with_fblnFinalReturn(Integer fblnFinalReturn) {
    this.fblnFinalReturn = fblnFinalReturn;
    return this;
  }
  private Integer fblnHospice;
  public Integer get_fblnHospice() {
    return fblnHospice;
  }
  public void set_fblnHospice(Integer fblnHospice) {
    this.fblnHospice = fblnHospice;
  }
  public tblnz_rtngstoriginal with_fblnHospice(Integer fblnHospice) {
    this.fblnHospice = fblnHospice;
    return this;
  }
  private String fstrHospiceType;
  public String get_fstrHospiceType() {
    return fstrHospiceType;
  }
  public void set_fstrHospiceType(String fstrHospiceType) {
    this.fstrHospiceType = fstrHospiceType;
  }
  public tblnz_rtngstoriginal with_fstrHospiceType(String fstrHospiceType) {
    this.fstrHospiceType = fstrHospiceType;
    return this;
  }
  private java.math.BigDecimal fcurTotalSales;
  public java.math.BigDecimal get_fcurTotalSales() {
    return fcurTotalSales;
  }
  public void set_fcurTotalSales(java.math.BigDecimal fcurTotalSales) {
    this.fcurTotalSales = fcurTotalSales;
  }
  public tblnz_rtngstoriginal with_fcurTotalSales(java.math.BigDecimal fcurTotalSales) {
    this.fcurTotalSales = fcurTotalSales;
    return this;
  }
  private java.math.BigDecimal fcurZeroSupplies;
  public java.math.BigDecimal get_fcurZeroSupplies() {
    return fcurZeroSupplies;
  }
  public void set_fcurZeroSupplies(java.math.BigDecimal fcurZeroSupplies) {
    this.fcurZeroSupplies = fcurZeroSupplies;
  }
  public tblnz_rtngstoriginal with_fcurZeroSupplies(java.math.BigDecimal fcurZeroSupplies) {
    this.fcurZeroSupplies = fcurZeroSupplies;
    return this;
  }
  private java.math.BigDecimal fcurLongTermCareSales;
  public java.math.BigDecimal get_fcurLongTermCareSales() {
    return fcurLongTermCareSales;
  }
  public void set_fcurLongTermCareSales(java.math.BigDecimal fcurLongTermCareSales) {
    this.fcurLongTermCareSales = fcurLongTermCareSales;
  }
  public tblnz_rtngstoriginal with_fcurLongTermCareSales(java.math.BigDecimal fcurLongTermCareSales) {
    this.fcurLongTermCareSales = fcurLongTermCareSales;
    return this;
  }
  private java.math.BigDecimal fcurHospitalSales;
  public java.math.BigDecimal get_fcurHospitalSales() {
    return fcurHospitalSales;
  }
  public void set_fcurHospitalSales(java.math.BigDecimal fcurHospitalSales) {
    this.fcurHospitalSales = fcurHospitalSales;
  }
  public tblnz_rtngstoriginal with_fcurHospitalSales(java.math.BigDecimal fcurHospitalSales) {
    this.fcurHospitalSales = fcurHospitalSales;
    return this;
  }
  private java.math.BigDecimal fcurDebitPrivateUse;
  public java.math.BigDecimal get_fcurDebitPrivateUse() {
    return fcurDebitPrivateUse;
  }
  public void set_fcurDebitPrivateUse(java.math.BigDecimal fcurDebitPrivateUse) {
    this.fcurDebitPrivateUse = fcurDebitPrivateUse;
  }
  public tblnz_rtngstoriginal with_fcurDebitPrivateUse(java.math.BigDecimal fcurDebitPrivateUse) {
    this.fcurDebitPrivateUse = fcurDebitPrivateUse;
    return this;
  }
  private java.math.BigDecimal fcurDebitOneOff;
  public java.math.BigDecimal get_fcurDebitOneOff() {
    return fcurDebitOneOff;
  }
  public void set_fcurDebitOneOff(java.math.BigDecimal fcurDebitOneOff) {
    this.fcurDebitOneOff = fcurDebitOneOff;
  }
  public tblnz_rtngstoriginal with_fcurDebitOneOff(java.math.BigDecimal fcurDebitOneOff) {
    this.fcurDebitOneOff = fcurDebitOneOff;
    return this;
  }
  private java.math.BigDecimal fcurDebitAssetsKept;
  public java.math.BigDecimal get_fcurDebitAssetsKept() {
    return fcurDebitAssetsKept;
  }
  public void set_fcurDebitAssetsKept(java.math.BigDecimal fcurDebitAssetsKept) {
    this.fcurDebitAssetsKept = fcurDebitAssetsKept;
  }
  public tblnz_rtngstoriginal with_fcurDebitAssetsKept(java.math.BigDecimal fcurDebitAssetsKept) {
    this.fcurDebitAssetsKept = fcurDebitAssetsKept;
    return this;
  }
  private java.math.BigDecimal fcurDebitEntertainment;
  public java.math.BigDecimal get_fcurDebitEntertainment() {
    return fcurDebitEntertainment;
  }
  public void set_fcurDebitEntertainment(java.math.BigDecimal fcurDebitEntertainment) {
    this.fcurDebitEntertainment = fcurDebitEntertainment;
  }
  public tblnz_rtngstoriginal with_fcurDebitEntertainment(java.math.BigDecimal fcurDebitEntertainment) {
    this.fcurDebitEntertainment = fcurDebitEntertainment;
    return this;
  }
  private java.math.BigDecimal fcurDebitChangeOfAccounting;
  public java.math.BigDecimal get_fcurDebitChangeOfAccounting() {
    return fcurDebitChangeOfAccounting;
  }
  public void set_fcurDebitChangeOfAccounting(java.math.BigDecimal fcurDebitChangeOfAccounting) {
    this.fcurDebitChangeOfAccounting = fcurDebitChangeOfAccounting;
  }
  public tblnz_rtngstoriginal with_fcurDebitChangeOfAccounting(java.math.BigDecimal fcurDebitChangeOfAccounting) {
    this.fcurDebitChangeOfAccounting = fcurDebitChangeOfAccounting;
    return this;
  }
  private java.math.BigDecimal fcurDebitExemptSupplies;
  public java.math.BigDecimal get_fcurDebitExemptSupplies() {
    return fcurDebitExemptSupplies;
  }
  public void set_fcurDebitExemptSupplies(java.math.BigDecimal fcurDebitExemptSupplies) {
    this.fcurDebitExemptSupplies = fcurDebitExemptSupplies;
  }
  public tblnz_rtngstoriginal with_fcurDebitExemptSupplies(java.math.BigDecimal fcurDebitExemptSupplies) {
    this.fcurDebitExemptSupplies = fcurDebitExemptSupplies;
    return this;
  }
  private java.math.BigDecimal fcurDebitAdjustPrevRate;
  public java.math.BigDecimal get_fcurDebitAdjustPrevRate() {
    return fcurDebitAdjustPrevRate;
  }
  public void set_fcurDebitAdjustPrevRate(java.math.BigDecimal fcurDebitAdjustPrevRate) {
    this.fcurDebitAdjustPrevRate = fcurDebitAdjustPrevRate;
  }
  public tblnz_rtngstoriginal with_fcurDebitAdjustPrevRate(java.math.BigDecimal fcurDebitAdjustPrevRate) {
    this.fcurDebitAdjustPrevRate = fcurDebitAdjustPrevRate;
    return this;
  }
  private java.math.BigDecimal fcurDebitOther;
  public java.math.BigDecimal get_fcurDebitOther() {
    return fcurDebitOther;
  }
  public void set_fcurDebitOther(java.math.BigDecimal fcurDebitOther) {
    this.fcurDebitOther = fcurDebitOther;
  }
  public tblnz_rtngstoriginal with_fcurDebitOther(java.math.BigDecimal fcurDebitOther) {
    this.fcurDebitOther = fcurDebitOther;
    return this;
  }
  private java.math.BigDecimal fcurTotalPurchases;
  public java.math.BigDecimal get_fcurTotalPurchases() {
    return fcurTotalPurchases;
  }
  public void set_fcurTotalPurchases(java.math.BigDecimal fcurTotalPurchases) {
    this.fcurTotalPurchases = fcurTotalPurchases;
  }
  public tblnz_rtngstoriginal with_fcurTotalPurchases(java.math.BigDecimal fcurTotalPurchases) {
    this.fcurTotalPurchases = fcurTotalPurchases;
    return this;
  }
  private java.math.BigDecimal fcurCreditPrivateGoods;
  public java.math.BigDecimal get_fcurCreditPrivateGoods() {
    return fcurCreditPrivateGoods;
  }
  public void set_fcurCreditPrivateGoods(java.math.BigDecimal fcurCreditPrivateGoods) {
    this.fcurCreditPrivateGoods = fcurCreditPrivateGoods;
  }
  public tblnz_rtngstoriginal with_fcurCreditPrivateGoods(java.math.BigDecimal fcurCreditPrivateGoods) {
    this.fcurCreditPrivateGoods = fcurCreditPrivateGoods;
    return this;
  }
  private java.math.BigDecimal fcurCreditPrivateAssets;
  public java.math.BigDecimal get_fcurCreditPrivateAssets() {
    return fcurCreditPrivateAssets;
  }
  public void set_fcurCreditPrivateAssets(java.math.BigDecimal fcurCreditPrivateAssets) {
    this.fcurCreditPrivateAssets = fcurCreditPrivateAssets;
  }
  public tblnz_rtngstoriginal with_fcurCreditPrivateAssets(java.math.BigDecimal fcurCreditPrivateAssets) {
    this.fcurCreditPrivateAssets = fcurCreditPrivateAssets;
    return this;
  }
  private java.math.BigDecimal fcurCreditChangeOfAccounting;
  public java.math.BigDecimal get_fcurCreditChangeOfAccounting() {
    return fcurCreditChangeOfAccounting;
  }
  public void set_fcurCreditChangeOfAccounting(java.math.BigDecimal fcurCreditChangeOfAccounting) {
    this.fcurCreditChangeOfAccounting = fcurCreditChangeOfAccounting;
  }
  public tblnz_rtngstoriginal with_fcurCreditChangeOfAccounting(java.math.BigDecimal fcurCreditChangeOfAccounting) {
    this.fcurCreditChangeOfAccounting = fcurCreditChangeOfAccounting;
    return this;
  }
  private java.math.BigDecimal fcurCreditAdjustPrevRate;
  public java.math.BigDecimal get_fcurCreditAdjustPrevRate() {
    return fcurCreditAdjustPrevRate;
  }
  public void set_fcurCreditAdjustPrevRate(java.math.BigDecimal fcurCreditAdjustPrevRate) {
    this.fcurCreditAdjustPrevRate = fcurCreditAdjustPrevRate;
  }
  public tblnz_rtngstoriginal with_fcurCreditAdjustPrevRate(java.math.BigDecimal fcurCreditAdjustPrevRate) {
    this.fcurCreditAdjustPrevRate = fcurCreditAdjustPrevRate;
    return this;
  }
  private java.math.BigDecimal fcurCreditOther;
  public java.math.BigDecimal get_fcurCreditOther() {
    return fcurCreditOther;
  }
  public void set_fcurCreditOther(java.math.BigDecimal fcurCreditOther) {
    this.fcurCreditOther = fcurCreditOther;
  }
  public tblnz_rtngstoriginal with_fcurCreditOther(java.math.BigDecimal fcurCreditOther) {
    this.fcurCreditOther = fcurCreditOther;
    return this;
  }
  private java.math.BigDecimal fcurTotalPart1GST;
  public java.math.BigDecimal get_fcurTotalPart1GST() {
    return fcurTotalPart1GST;
  }
  public void set_fcurTotalPart1GST(java.math.BigDecimal fcurTotalPart1GST) {
    this.fcurTotalPart1GST = fcurTotalPart1GST;
  }
  public tblnz_rtngstoriginal with_fcurTotalPart1GST(java.math.BigDecimal fcurTotalPart1GST) {
    this.fcurTotalPart1GST = fcurTotalPart1GST;
    return this;
  }
  private java.math.BigDecimal fcurP2TotalSales;
  public java.math.BigDecimal get_fcurP2TotalSales() {
    return fcurP2TotalSales;
  }
  public void set_fcurP2TotalSales(java.math.BigDecimal fcurP2TotalSales) {
    this.fcurP2TotalSales = fcurP2TotalSales;
  }
  public tblnz_rtngstoriginal with_fcurP2TotalSales(java.math.BigDecimal fcurP2TotalSales) {
    this.fcurP2TotalSales = fcurP2TotalSales;
    return this;
  }
  private java.math.BigDecimal fcurP2ZeroSupplies;
  public java.math.BigDecimal get_fcurP2ZeroSupplies() {
    return fcurP2ZeroSupplies;
  }
  public void set_fcurP2ZeroSupplies(java.math.BigDecimal fcurP2ZeroSupplies) {
    this.fcurP2ZeroSupplies = fcurP2ZeroSupplies;
  }
  public tblnz_rtngstoriginal with_fcurP2ZeroSupplies(java.math.BigDecimal fcurP2ZeroSupplies) {
    this.fcurP2ZeroSupplies = fcurP2ZeroSupplies;
    return this;
  }
  private java.math.BigDecimal fcurP2LongTermSales;
  public java.math.BigDecimal get_fcurP2LongTermSales() {
    return fcurP2LongTermSales;
  }
  public void set_fcurP2LongTermSales(java.math.BigDecimal fcurP2LongTermSales) {
    this.fcurP2LongTermSales = fcurP2LongTermSales;
  }
  public tblnz_rtngstoriginal with_fcurP2LongTermSales(java.math.BigDecimal fcurP2LongTermSales) {
    this.fcurP2LongTermSales = fcurP2LongTermSales;
    return this;
  }
  private java.math.BigDecimal fcurP2HospitalSales;
  public java.math.BigDecimal get_fcurP2HospitalSales() {
    return fcurP2HospitalSales;
  }
  public void set_fcurP2HospitalSales(java.math.BigDecimal fcurP2HospitalSales) {
    this.fcurP2HospitalSales = fcurP2HospitalSales;
  }
  public tblnz_rtngstoriginal with_fcurP2HospitalSales(java.math.BigDecimal fcurP2HospitalSales) {
    this.fcurP2HospitalSales = fcurP2HospitalSales;
    return this;
  }
  private java.math.BigDecimal fcurDebitP2PrivateUse;
  public java.math.BigDecimal get_fcurDebitP2PrivateUse() {
    return fcurDebitP2PrivateUse;
  }
  public void set_fcurDebitP2PrivateUse(java.math.BigDecimal fcurDebitP2PrivateUse) {
    this.fcurDebitP2PrivateUse = fcurDebitP2PrivateUse;
  }
  public tblnz_rtngstoriginal with_fcurDebitP2PrivateUse(java.math.BigDecimal fcurDebitP2PrivateUse) {
    this.fcurDebitP2PrivateUse = fcurDebitP2PrivateUse;
    return this;
  }
  private java.math.BigDecimal fcurDebitP2OneOff;
  public java.math.BigDecimal get_fcurDebitP2OneOff() {
    return fcurDebitP2OneOff;
  }
  public void set_fcurDebitP2OneOff(java.math.BigDecimal fcurDebitP2OneOff) {
    this.fcurDebitP2OneOff = fcurDebitP2OneOff;
  }
  public tblnz_rtngstoriginal with_fcurDebitP2OneOff(java.math.BigDecimal fcurDebitP2OneOff) {
    this.fcurDebitP2OneOff = fcurDebitP2OneOff;
    return this;
  }
  private java.math.BigDecimal fcurDebitP2AssetsKept;
  public java.math.BigDecimal get_fcurDebitP2AssetsKept() {
    return fcurDebitP2AssetsKept;
  }
  public void set_fcurDebitP2AssetsKept(java.math.BigDecimal fcurDebitP2AssetsKept) {
    this.fcurDebitP2AssetsKept = fcurDebitP2AssetsKept;
  }
  public tblnz_rtngstoriginal with_fcurDebitP2AssetsKept(java.math.BigDecimal fcurDebitP2AssetsKept) {
    this.fcurDebitP2AssetsKept = fcurDebitP2AssetsKept;
    return this;
  }
  private java.math.BigDecimal fcurDebitP2Entertainment;
  public java.math.BigDecimal get_fcurDebitP2Entertainment() {
    return fcurDebitP2Entertainment;
  }
  public void set_fcurDebitP2Entertainment(java.math.BigDecimal fcurDebitP2Entertainment) {
    this.fcurDebitP2Entertainment = fcurDebitP2Entertainment;
  }
  public tblnz_rtngstoriginal with_fcurDebitP2Entertainment(java.math.BigDecimal fcurDebitP2Entertainment) {
    this.fcurDebitP2Entertainment = fcurDebitP2Entertainment;
    return this;
  }
  private java.math.BigDecimal fcurDebitP2ChangeOfAccounting;
  public java.math.BigDecimal get_fcurDebitP2ChangeOfAccounting() {
    return fcurDebitP2ChangeOfAccounting;
  }
  public void set_fcurDebitP2ChangeOfAccounting(java.math.BigDecimal fcurDebitP2ChangeOfAccounting) {
    this.fcurDebitP2ChangeOfAccounting = fcurDebitP2ChangeOfAccounting;
  }
  public tblnz_rtngstoriginal with_fcurDebitP2ChangeOfAccounting(java.math.BigDecimal fcurDebitP2ChangeOfAccounting) {
    this.fcurDebitP2ChangeOfAccounting = fcurDebitP2ChangeOfAccounting;
    return this;
  }
  private java.math.BigDecimal fcurDebitP2ExemptSupplies;
  public java.math.BigDecimal get_fcurDebitP2ExemptSupplies() {
    return fcurDebitP2ExemptSupplies;
  }
  public void set_fcurDebitP2ExemptSupplies(java.math.BigDecimal fcurDebitP2ExemptSupplies) {
    this.fcurDebitP2ExemptSupplies = fcurDebitP2ExemptSupplies;
  }
  public tblnz_rtngstoriginal with_fcurDebitP2ExemptSupplies(java.math.BigDecimal fcurDebitP2ExemptSupplies) {
    this.fcurDebitP2ExemptSupplies = fcurDebitP2ExemptSupplies;
    return this;
  }
  private java.math.BigDecimal fcurDebitP2AdjustPrevRate;
  public java.math.BigDecimal get_fcurDebitP2AdjustPrevRate() {
    return fcurDebitP2AdjustPrevRate;
  }
  public void set_fcurDebitP2AdjustPrevRate(java.math.BigDecimal fcurDebitP2AdjustPrevRate) {
    this.fcurDebitP2AdjustPrevRate = fcurDebitP2AdjustPrevRate;
  }
  public tblnz_rtngstoriginal with_fcurDebitP2AdjustPrevRate(java.math.BigDecimal fcurDebitP2AdjustPrevRate) {
    this.fcurDebitP2AdjustPrevRate = fcurDebitP2AdjustPrevRate;
    return this;
  }
  private java.math.BigDecimal fcurDebitP2Other;
  public java.math.BigDecimal get_fcurDebitP2Other() {
    return fcurDebitP2Other;
  }
  public void set_fcurDebitP2Other(java.math.BigDecimal fcurDebitP2Other) {
    this.fcurDebitP2Other = fcurDebitP2Other;
  }
  public tblnz_rtngstoriginal with_fcurDebitP2Other(java.math.BigDecimal fcurDebitP2Other) {
    this.fcurDebitP2Other = fcurDebitP2Other;
    return this;
  }
  private java.math.BigDecimal fcurP2TotalPurchases;
  public java.math.BigDecimal get_fcurP2TotalPurchases() {
    return fcurP2TotalPurchases;
  }
  public void set_fcurP2TotalPurchases(java.math.BigDecimal fcurP2TotalPurchases) {
    this.fcurP2TotalPurchases = fcurP2TotalPurchases;
  }
  public tblnz_rtngstoriginal with_fcurP2TotalPurchases(java.math.BigDecimal fcurP2TotalPurchases) {
    this.fcurP2TotalPurchases = fcurP2TotalPurchases;
    return this;
  }
  private java.math.BigDecimal fcurCreditP2PrivateGoods;
  public java.math.BigDecimal get_fcurCreditP2PrivateGoods() {
    return fcurCreditP2PrivateGoods;
  }
  public void set_fcurCreditP2PrivateGoods(java.math.BigDecimal fcurCreditP2PrivateGoods) {
    this.fcurCreditP2PrivateGoods = fcurCreditP2PrivateGoods;
  }
  public tblnz_rtngstoriginal with_fcurCreditP2PrivateGoods(java.math.BigDecimal fcurCreditP2PrivateGoods) {
    this.fcurCreditP2PrivateGoods = fcurCreditP2PrivateGoods;
    return this;
  }
  private java.math.BigDecimal fcurCreditP2PrivateAssets;
  public java.math.BigDecimal get_fcurCreditP2PrivateAssets() {
    return fcurCreditP2PrivateAssets;
  }
  public void set_fcurCreditP2PrivateAssets(java.math.BigDecimal fcurCreditP2PrivateAssets) {
    this.fcurCreditP2PrivateAssets = fcurCreditP2PrivateAssets;
  }
  public tblnz_rtngstoriginal with_fcurCreditP2PrivateAssets(java.math.BigDecimal fcurCreditP2PrivateAssets) {
    this.fcurCreditP2PrivateAssets = fcurCreditP2PrivateAssets;
    return this;
  }
  private java.math.BigDecimal fcurCreditP2ChangeOfAccounting;
  public java.math.BigDecimal get_fcurCreditP2ChangeOfAccounting() {
    return fcurCreditP2ChangeOfAccounting;
  }
  public void set_fcurCreditP2ChangeOfAccounting(java.math.BigDecimal fcurCreditP2ChangeOfAccounting) {
    this.fcurCreditP2ChangeOfAccounting = fcurCreditP2ChangeOfAccounting;
  }
  public tblnz_rtngstoriginal with_fcurCreditP2ChangeOfAccounting(java.math.BigDecimal fcurCreditP2ChangeOfAccounting) {
    this.fcurCreditP2ChangeOfAccounting = fcurCreditP2ChangeOfAccounting;
    return this;
  }
  private java.math.BigDecimal fcurCreditP2AdjustPrevRate;
  public java.math.BigDecimal get_fcurCreditP2AdjustPrevRate() {
    return fcurCreditP2AdjustPrevRate;
  }
  public void set_fcurCreditP2AdjustPrevRate(java.math.BigDecimal fcurCreditP2AdjustPrevRate) {
    this.fcurCreditP2AdjustPrevRate = fcurCreditP2AdjustPrevRate;
  }
  public tblnz_rtngstoriginal with_fcurCreditP2AdjustPrevRate(java.math.BigDecimal fcurCreditP2AdjustPrevRate) {
    this.fcurCreditP2AdjustPrevRate = fcurCreditP2AdjustPrevRate;
    return this;
  }
  private java.math.BigDecimal fcurCreditP2Other;
  public java.math.BigDecimal get_fcurCreditP2Other() {
    return fcurCreditP2Other;
  }
  public void set_fcurCreditP2Other(java.math.BigDecimal fcurCreditP2Other) {
    this.fcurCreditP2Other = fcurCreditP2Other;
  }
  public tblnz_rtngstoriginal with_fcurCreditP2Other(java.math.BigDecimal fcurCreditP2Other) {
    this.fcurCreditP2Other = fcurCreditP2Other;
    return this;
  }
  private java.math.BigDecimal fcurTotalPart2GST;
  public java.math.BigDecimal get_fcurTotalPart2GST() {
    return fcurTotalPart2GST;
  }
  public void set_fcurTotalPart2GST(java.math.BigDecimal fcurTotalPart2GST) {
    this.fcurTotalPart2GST = fcurTotalPart2GST;
  }
  public tblnz_rtngstoriginal with_fcurTotalPart2GST(java.math.BigDecimal fcurTotalPart2GST) {
    this.fcurTotalPart2GST = fcurTotalPart2GST;
    return this;
  }
  private java.math.BigDecimal fcurTotalTransitionalGST;
  public java.math.BigDecimal get_fcurTotalTransitionalGST() {
    return fcurTotalTransitionalGST;
  }
  public void set_fcurTotalTransitionalGST(java.math.BigDecimal fcurTotalTransitionalGST) {
    this.fcurTotalTransitionalGST = fcurTotalTransitionalGST;
  }
  public tblnz_rtngstoriginal with_fcurTotalTransitionalGST(java.math.BigDecimal fcurTotalTransitionalGST) {
    this.fcurTotalTransitionalGST = fcurTotalTransitionalGST;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtngstoriginal with_fstrWho(String fstrWho) {
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
  public tblnz_rtngstoriginal with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtngstoriginal)) {
      return false;
    }
    tblnz_rtngstoriginal that = (tblnz_rtngstoriginal) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrFilingFreq == null ? that.fstrFilingFreq == null : this.fstrFilingFreq.equals(that.fstrFilingFreq));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fcurGSTTotal == null ? that.fcurGSTTotal == null : this.fcurGSTTotal.equals(that.fcurGSTTotal));
    equal = equal && (this.fcurPTVoluntaryAmount == null ? that.fcurPTVoluntaryAmount == null : this.fcurPTVoluntaryAmount.equals(that.fcurPTVoluntaryAmount));
    equal = equal && (this.fcurPTRefundTransfer == null ? that.fcurPTRefundTransfer == null : this.fcurPTRefundTransfer.equals(that.fcurPTRefundTransfer));
    equal = equal && (this.fblnTransitional == null ? that.fblnTransitional == null : this.fblnTransitional.equals(that.fblnTransitional));
    equal = equal && (this.fstrWebLogonID == null ? that.fstrWebLogonID == null : this.fstrWebLogonID.equals(that.fstrWebLogonID));
    equal = equal && (this.fstrVendorID == null ? that.fstrVendorID == null : this.fstrVendorID.equals(that.fstrVendorID));
    equal = equal && (this.fstrIPAddress == null ? that.fstrIPAddress == null : this.fstrIPAddress.equals(that.fstrIPAddress));
    equal = equal && (this.fblnDebitAdjustments == null ? that.fblnDebitAdjustments == null : this.fblnDebitAdjustments.equals(that.fblnDebitAdjustments));
    equal = equal && (this.fcurDebitAdjustments == null ? that.fcurDebitAdjustments == null : this.fcurDebitAdjustments.equals(that.fcurDebitAdjustments));
    equal = equal && (this.fblnP2DebitAdjustments == null ? that.fblnP2DebitAdjustments == null : this.fblnP2DebitAdjustments.equals(that.fblnP2DebitAdjustments));
    equal = equal && (this.fcurP2DebitAdjustments == null ? that.fcurP2DebitAdjustments == null : this.fcurP2DebitAdjustments.equals(that.fcurP2DebitAdjustments));
    equal = equal && (this.fblnCreditAdjustments == null ? that.fblnCreditAdjustments == null : this.fblnCreditAdjustments.equals(that.fblnCreditAdjustments));
    equal = equal && (this.fcurCreditAdjustments == null ? that.fcurCreditAdjustments == null : this.fcurCreditAdjustments.equals(that.fcurCreditAdjustments));
    equal = equal && (this.fblnP2CreditAdjustments == null ? that.fblnP2CreditAdjustments == null : this.fblnP2CreditAdjustments.equals(that.fblnP2CreditAdjustments));
    equal = equal && (this.fcurP2CreditAdjustments == null ? that.fcurP2CreditAdjustments == null : this.fcurP2CreditAdjustments.equals(that.fcurP2CreditAdjustments));
    equal = equal && (this.fblnFinalReturn == null ? that.fblnFinalReturn == null : this.fblnFinalReturn.equals(that.fblnFinalReturn));
    equal = equal && (this.fblnHospice == null ? that.fblnHospice == null : this.fblnHospice.equals(that.fblnHospice));
    equal = equal && (this.fstrHospiceType == null ? that.fstrHospiceType == null : this.fstrHospiceType.equals(that.fstrHospiceType));
    equal = equal && (this.fcurTotalSales == null ? that.fcurTotalSales == null : this.fcurTotalSales.equals(that.fcurTotalSales));
    equal = equal && (this.fcurZeroSupplies == null ? that.fcurZeroSupplies == null : this.fcurZeroSupplies.equals(that.fcurZeroSupplies));
    equal = equal && (this.fcurLongTermCareSales == null ? that.fcurLongTermCareSales == null : this.fcurLongTermCareSales.equals(that.fcurLongTermCareSales));
    equal = equal && (this.fcurHospitalSales == null ? that.fcurHospitalSales == null : this.fcurHospitalSales.equals(that.fcurHospitalSales));
    equal = equal && (this.fcurDebitPrivateUse == null ? that.fcurDebitPrivateUse == null : this.fcurDebitPrivateUse.equals(that.fcurDebitPrivateUse));
    equal = equal && (this.fcurDebitOneOff == null ? that.fcurDebitOneOff == null : this.fcurDebitOneOff.equals(that.fcurDebitOneOff));
    equal = equal && (this.fcurDebitAssetsKept == null ? that.fcurDebitAssetsKept == null : this.fcurDebitAssetsKept.equals(that.fcurDebitAssetsKept));
    equal = equal && (this.fcurDebitEntertainment == null ? that.fcurDebitEntertainment == null : this.fcurDebitEntertainment.equals(that.fcurDebitEntertainment));
    equal = equal && (this.fcurDebitChangeOfAccounting == null ? that.fcurDebitChangeOfAccounting == null : this.fcurDebitChangeOfAccounting.equals(that.fcurDebitChangeOfAccounting));
    equal = equal && (this.fcurDebitExemptSupplies == null ? that.fcurDebitExemptSupplies == null : this.fcurDebitExemptSupplies.equals(that.fcurDebitExemptSupplies));
    equal = equal && (this.fcurDebitAdjustPrevRate == null ? that.fcurDebitAdjustPrevRate == null : this.fcurDebitAdjustPrevRate.equals(that.fcurDebitAdjustPrevRate));
    equal = equal && (this.fcurDebitOther == null ? that.fcurDebitOther == null : this.fcurDebitOther.equals(that.fcurDebitOther));
    equal = equal && (this.fcurTotalPurchases == null ? that.fcurTotalPurchases == null : this.fcurTotalPurchases.equals(that.fcurTotalPurchases));
    equal = equal && (this.fcurCreditPrivateGoods == null ? that.fcurCreditPrivateGoods == null : this.fcurCreditPrivateGoods.equals(that.fcurCreditPrivateGoods));
    equal = equal && (this.fcurCreditPrivateAssets == null ? that.fcurCreditPrivateAssets == null : this.fcurCreditPrivateAssets.equals(that.fcurCreditPrivateAssets));
    equal = equal && (this.fcurCreditChangeOfAccounting == null ? that.fcurCreditChangeOfAccounting == null : this.fcurCreditChangeOfAccounting.equals(that.fcurCreditChangeOfAccounting));
    equal = equal && (this.fcurCreditAdjustPrevRate == null ? that.fcurCreditAdjustPrevRate == null : this.fcurCreditAdjustPrevRate.equals(that.fcurCreditAdjustPrevRate));
    equal = equal && (this.fcurCreditOther == null ? that.fcurCreditOther == null : this.fcurCreditOther.equals(that.fcurCreditOther));
    equal = equal && (this.fcurTotalPart1GST == null ? that.fcurTotalPart1GST == null : this.fcurTotalPart1GST.equals(that.fcurTotalPart1GST));
    equal = equal && (this.fcurP2TotalSales == null ? that.fcurP2TotalSales == null : this.fcurP2TotalSales.equals(that.fcurP2TotalSales));
    equal = equal && (this.fcurP2ZeroSupplies == null ? that.fcurP2ZeroSupplies == null : this.fcurP2ZeroSupplies.equals(that.fcurP2ZeroSupplies));
    equal = equal && (this.fcurP2LongTermSales == null ? that.fcurP2LongTermSales == null : this.fcurP2LongTermSales.equals(that.fcurP2LongTermSales));
    equal = equal && (this.fcurP2HospitalSales == null ? that.fcurP2HospitalSales == null : this.fcurP2HospitalSales.equals(that.fcurP2HospitalSales));
    equal = equal && (this.fcurDebitP2PrivateUse == null ? that.fcurDebitP2PrivateUse == null : this.fcurDebitP2PrivateUse.equals(that.fcurDebitP2PrivateUse));
    equal = equal && (this.fcurDebitP2OneOff == null ? that.fcurDebitP2OneOff == null : this.fcurDebitP2OneOff.equals(that.fcurDebitP2OneOff));
    equal = equal && (this.fcurDebitP2AssetsKept == null ? that.fcurDebitP2AssetsKept == null : this.fcurDebitP2AssetsKept.equals(that.fcurDebitP2AssetsKept));
    equal = equal && (this.fcurDebitP2Entertainment == null ? that.fcurDebitP2Entertainment == null : this.fcurDebitP2Entertainment.equals(that.fcurDebitP2Entertainment));
    equal = equal && (this.fcurDebitP2ChangeOfAccounting == null ? that.fcurDebitP2ChangeOfAccounting == null : this.fcurDebitP2ChangeOfAccounting.equals(that.fcurDebitP2ChangeOfAccounting));
    equal = equal && (this.fcurDebitP2ExemptSupplies == null ? that.fcurDebitP2ExemptSupplies == null : this.fcurDebitP2ExemptSupplies.equals(that.fcurDebitP2ExemptSupplies));
    equal = equal && (this.fcurDebitP2AdjustPrevRate == null ? that.fcurDebitP2AdjustPrevRate == null : this.fcurDebitP2AdjustPrevRate.equals(that.fcurDebitP2AdjustPrevRate));
    equal = equal && (this.fcurDebitP2Other == null ? that.fcurDebitP2Other == null : this.fcurDebitP2Other.equals(that.fcurDebitP2Other));
    equal = equal && (this.fcurP2TotalPurchases == null ? that.fcurP2TotalPurchases == null : this.fcurP2TotalPurchases.equals(that.fcurP2TotalPurchases));
    equal = equal && (this.fcurCreditP2PrivateGoods == null ? that.fcurCreditP2PrivateGoods == null : this.fcurCreditP2PrivateGoods.equals(that.fcurCreditP2PrivateGoods));
    equal = equal && (this.fcurCreditP2PrivateAssets == null ? that.fcurCreditP2PrivateAssets == null : this.fcurCreditP2PrivateAssets.equals(that.fcurCreditP2PrivateAssets));
    equal = equal && (this.fcurCreditP2ChangeOfAccounting == null ? that.fcurCreditP2ChangeOfAccounting == null : this.fcurCreditP2ChangeOfAccounting.equals(that.fcurCreditP2ChangeOfAccounting));
    equal = equal && (this.fcurCreditP2AdjustPrevRate == null ? that.fcurCreditP2AdjustPrevRate == null : this.fcurCreditP2AdjustPrevRate.equals(that.fcurCreditP2AdjustPrevRate));
    equal = equal && (this.fcurCreditP2Other == null ? that.fcurCreditP2Other == null : this.fcurCreditP2Other.equals(that.fcurCreditP2Other));
    equal = equal && (this.fcurTotalPart2GST == null ? that.fcurTotalPart2GST == null : this.fcurTotalPart2GST.equals(that.fcurTotalPart2GST));
    equal = equal && (this.fcurTotalTransitionalGST == null ? that.fcurTotalTransitionalGST == null : this.fcurTotalTransitionalGST.equals(that.fcurTotalTransitionalGST));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtngstoriginal)) {
      return false;
    }
    tblnz_rtngstoriginal that = (tblnz_rtngstoriginal) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrFilingFreq == null ? that.fstrFilingFreq == null : this.fstrFilingFreq.equals(that.fstrFilingFreq));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fcurGSTTotal == null ? that.fcurGSTTotal == null : this.fcurGSTTotal.equals(that.fcurGSTTotal));
    equal = equal && (this.fcurPTVoluntaryAmount == null ? that.fcurPTVoluntaryAmount == null : this.fcurPTVoluntaryAmount.equals(that.fcurPTVoluntaryAmount));
    equal = equal && (this.fcurPTRefundTransfer == null ? that.fcurPTRefundTransfer == null : this.fcurPTRefundTransfer.equals(that.fcurPTRefundTransfer));
    equal = equal && (this.fblnTransitional == null ? that.fblnTransitional == null : this.fblnTransitional.equals(that.fblnTransitional));
    equal = equal && (this.fstrWebLogonID == null ? that.fstrWebLogonID == null : this.fstrWebLogonID.equals(that.fstrWebLogonID));
    equal = equal && (this.fstrVendorID == null ? that.fstrVendorID == null : this.fstrVendorID.equals(that.fstrVendorID));
    equal = equal && (this.fstrIPAddress == null ? that.fstrIPAddress == null : this.fstrIPAddress.equals(that.fstrIPAddress));
    equal = equal && (this.fblnDebitAdjustments == null ? that.fblnDebitAdjustments == null : this.fblnDebitAdjustments.equals(that.fblnDebitAdjustments));
    equal = equal && (this.fcurDebitAdjustments == null ? that.fcurDebitAdjustments == null : this.fcurDebitAdjustments.equals(that.fcurDebitAdjustments));
    equal = equal && (this.fblnP2DebitAdjustments == null ? that.fblnP2DebitAdjustments == null : this.fblnP2DebitAdjustments.equals(that.fblnP2DebitAdjustments));
    equal = equal && (this.fcurP2DebitAdjustments == null ? that.fcurP2DebitAdjustments == null : this.fcurP2DebitAdjustments.equals(that.fcurP2DebitAdjustments));
    equal = equal && (this.fblnCreditAdjustments == null ? that.fblnCreditAdjustments == null : this.fblnCreditAdjustments.equals(that.fblnCreditAdjustments));
    equal = equal && (this.fcurCreditAdjustments == null ? that.fcurCreditAdjustments == null : this.fcurCreditAdjustments.equals(that.fcurCreditAdjustments));
    equal = equal && (this.fblnP2CreditAdjustments == null ? that.fblnP2CreditAdjustments == null : this.fblnP2CreditAdjustments.equals(that.fblnP2CreditAdjustments));
    equal = equal && (this.fcurP2CreditAdjustments == null ? that.fcurP2CreditAdjustments == null : this.fcurP2CreditAdjustments.equals(that.fcurP2CreditAdjustments));
    equal = equal && (this.fblnFinalReturn == null ? that.fblnFinalReturn == null : this.fblnFinalReturn.equals(that.fblnFinalReturn));
    equal = equal && (this.fblnHospice == null ? that.fblnHospice == null : this.fblnHospice.equals(that.fblnHospice));
    equal = equal && (this.fstrHospiceType == null ? that.fstrHospiceType == null : this.fstrHospiceType.equals(that.fstrHospiceType));
    equal = equal && (this.fcurTotalSales == null ? that.fcurTotalSales == null : this.fcurTotalSales.equals(that.fcurTotalSales));
    equal = equal && (this.fcurZeroSupplies == null ? that.fcurZeroSupplies == null : this.fcurZeroSupplies.equals(that.fcurZeroSupplies));
    equal = equal && (this.fcurLongTermCareSales == null ? that.fcurLongTermCareSales == null : this.fcurLongTermCareSales.equals(that.fcurLongTermCareSales));
    equal = equal && (this.fcurHospitalSales == null ? that.fcurHospitalSales == null : this.fcurHospitalSales.equals(that.fcurHospitalSales));
    equal = equal && (this.fcurDebitPrivateUse == null ? that.fcurDebitPrivateUse == null : this.fcurDebitPrivateUse.equals(that.fcurDebitPrivateUse));
    equal = equal && (this.fcurDebitOneOff == null ? that.fcurDebitOneOff == null : this.fcurDebitOneOff.equals(that.fcurDebitOneOff));
    equal = equal && (this.fcurDebitAssetsKept == null ? that.fcurDebitAssetsKept == null : this.fcurDebitAssetsKept.equals(that.fcurDebitAssetsKept));
    equal = equal && (this.fcurDebitEntertainment == null ? that.fcurDebitEntertainment == null : this.fcurDebitEntertainment.equals(that.fcurDebitEntertainment));
    equal = equal && (this.fcurDebitChangeOfAccounting == null ? that.fcurDebitChangeOfAccounting == null : this.fcurDebitChangeOfAccounting.equals(that.fcurDebitChangeOfAccounting));
    equal = equal && (this.fcurDebitExemptSupplies == null ? that.fcurDebitExemptSupplies == null : this.fcurDebitExemptSupplies.equals(that.fcurDebitExemptSupplies));
    equal = equal && (this.fcurDebitAdjustPrevRate == null ? that.fcurDebitAdjustPrevRate == null : this.fcurDebitAdjustPrevRate.equals(that.fcurDebitAdjustPrevRate));
    equal = equal && (this.fcurDebitOther == null ? that.fcurDebitOther == null : this.fcurDebitOther.equals(that.fcurDebitOther));
    equal = equal && (this.fcurTotalPurchases == null ? that.fcurTotalPurchases == null : this.fcurTotalPurchases.equals(that.fcurTotalPurchases));
    equal = equal && (this.fcurCreditPrivateGoods == null ? that.fcurCreditPrivateGoods == null : this.fcurCreditPrivateGoods.equals(that.fcurCreditPrivateGoods));
    equal = equal && (this.fcurCreditPrivateAssets == null ? that.fcurCreditPrivateAssets == null : this.fcurCreditPrivateAssets.equals(that.fcurCreditPrivateAssets));
    equal = equal && (this.fcurCreditChangeOfAccounting == null ? that.fcurCreditChangeOfAccounting == null : this.fcurCreditChangeOfAccounting.equals(that.fcurCreditChangeOfAccounting));
    equal = equal && (this.fcurCreditAdjustPrevRate == null ? that.fcurCreditAdjustPrevRate == null : this.fcurCreditAdjustPrevRate.equals(that.fcurCreditAdjustPrevRate));
    equal = equal && (this.fcurCreditOther == null ? that.fcurCreditOther == null : this.fcurCreditOther.equals(that.fcurCreditOther));
    equal = equal && (this.fcurTotalPart1GST == null ? that.fcurTotalPart1GST == null : this.fcurTotalPart1GST.equals(that.fcurTotalPart1GST));
    equal = equal && (this.fcurP2TotalSales == null ? that.fcurP2TotalSales == null : this.fcurP2TotalSales.equals(that.fcurP2TotalSales));
    equal = equal && (this.fcurP2ZeroSupplies == null ? that.fcurP2ZeroSupplies == null : this.fcurP2ZeroSupplies.equals(that.fcurP2ZeroSupplies));
    equal = equal && (this.fcurP2LongTermSales == null ? that.fcurP2LongTermSales == null : this.fcurP2LongTermSales.equals(that.fcurP2LongTermSales));
    equal = equal && (this.fcurP2HospitalSales == null ? that.fcurP2HospitalSales == null : this.fcurP2HospitalSales.equals(that.fcurP2HospitalSales));
    equal = equal && (this.fcurDebitP2PrivateUse == null ? that.fcurDebitP2PrivateUse == null : this.fcurDebitP2PrivateUse.equals(that.fcurDebitP2PrivateUse));
    equal = equal && (this.fcurDebitP2OneOff == null ? that.fcurDebitP2OneOff == null : this.fcurDebitP2OneOff.equals(that.fcurDebitP2OneOff));
    equal = equal && (this.fcurDebitP2AssetsKept == null ? that.fcurDebitP2AssetsKept == null : this.fcurDebitP2AssetsKept.equals(that.fcurDebitP2AssetsKept));
    equal = equal && (this.fcurDebitP2Entertainment == null ? that.fcurDebitP2Entertainment == null : this.fcurDebitP2Entertainment.equals(that.fcurDebitP2Entertainment));
    equal = equal && (this.fcurDebitP2ChangeOfAccounting == null ? that.fcurDebitP2ChangeOfAccounting == null : this.fcurDebitP2ChangeOfAccounting.equals(that.fcurDebitP2ChangeOfAccounting));
    equal = equal && (this.fcurDebitP2ExemptSupplies == null ? that.fcurDebitP2ExemptSupplies == null : this.fcurDebitP2ExemptSupplies.equals(that.fcurDebitP2ExemptSupplies));
    equal = equal && (this.fcurDebitP2AdjustPrevRate == null ? that.fcurDebitP2AdjustPrevRate == null : this.fcurDebitP2AdjustPrevRate.equals(that.fcurDebitP2AdjustPrevRate));
    equal = equal && (this.fcurDebitP2Other == null ? that.fcurDebitP2Other == null : this.fcurDebitP2Other.equals(that.fcurDebitP2Other));
    equal = equal && (this.fcurP2TotalPurchases == null ? that.fcurP2TotalPurchases == null : this.fcurP2TotalPurchases.equals(that.fcurP2TotalPurchases));
    equal = equal && (this.fcurCreditP2PrivateGoods == null ? that.fcurCreditP2PrivateGoods == null : this.fcurCreditP2PrivateGoods.equals(that.fcurCreditP2PrivateGoods));
    equal = equal && (this.fcurCreditP2PrivateAssets == null ? that.fcurCreditP2PrivateAssets == null : this.fcurCreditP2PrivateAssets.equals(that.fcurCreditP2PrivateAssets));
    equal = equal && (this.fcurCreditP2ChangeOfAccounting == null ? that.fcurCreditP2ChangeOfAccounting == null : this.fcurCreditP2ChangeOfAccounting.equals(that.fcurCreditP2ChangeOfAccounting));
    equal = equal && (this.fcurCreditP2AdjustPrevRate == null ? that.fcurCreditP2AdjustPrevRate == null : this.fcurCreditP2AdjustPrevRate.equals(that.fcurCreditP2AdjustPrevRate));
    equal = equal && (this.fcurCreditP2Other == null ? that.fcurCreditP2Other == null : this.fcurCreditP2Other.equals(that.fcurCreditP2Other));
    equal = equal && (this.fcurTotalPart2GST == null ? that.fcurTotalPart2GST == null : this.fcurTotalPart2GST.equals(that.fcurTotalPart2GST));
    equal = equal && (this.fcurTotalTransitionalGST == null ? that.fcurTotalTransitionalGST == null : this.fcurTotalTransitionalGST.equals(that.fcurTotalTransitionalGST));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fstrFilingFreq = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurGSTTotal = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurPTVoluntaryAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurPTRefundTransfer = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fblnTransitional = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrWebLogonID = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrVendorID = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrIPAddress = JdbcWritableBridge.readString(11, __dbResults);
    this.fblnDebitAdjustments = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurDebitAdjustments = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnP2DebitAdjustments = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fcurP2DebitAdjustments = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fblnCreditAdjustments = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fcurCreditAdjustments = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnP2CreditAdjustments = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fcurP2CreditAdjustments = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fblnFinalReturn = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnHospice = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrHospiceType = JdbcWritableBridge.readString(22, __dbResults);
    this.fcurTotalSales = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurZeroSupplies = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurLongTermCareSales = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurHospitalSales = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurDebitPrivateUse = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurDebitOneOff = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurDebitAssetsKept = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurDebitEntertainment = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurDebitChangeOfAccounting = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurDebitExemptSupplies = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurDebitAdjustPrevRate = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurDebitOther = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurTotalPurchases = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurCreditPrivateGoods = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurCreditPrivateAssets = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurCreditChangeOfAccounting = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurCreditAdjustPrevRate = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurCreditOther = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurTotalPart1GST = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurP2TotalSales = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurP2ZeroSupplies = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurP2LongTermSales = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurP2HospitalSales = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurDebitP2PrivateUse = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurDebitP2OneOff = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurDebitP2AssetsKept = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurDebitP2Entertainment = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurDebitP2ChangeOfAccounting = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurDebitP2ExemptSupplies = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurDebitP2AdjustPrevRate = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurDebitP2Other = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurP2TotalPurchases = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurCreditP2PrivateGoods = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurCreditP2PrivateAssets = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurCreditP2ChangeOfAccounting = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurCreditP2AdjustPrevRate = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurCreditP2Other = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurTotalPart2GST = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurTotalTransitionalGST = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(62, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(63, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fstrFilingFreq = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurGSTTotal = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurPTVoluntaryAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurPTRefundTransfer = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fblnTransitional = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrWebLogonID = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrVendorID = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrIPAddress = JdbcWritableBridge.readString(11, __dbResults);
    this.fblnDebitAdjustments = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurDebitAdjustments = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnP2DebitAdjustments = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fcurP2DebitAdjustments = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fblnCreditAdjustments = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fcurCreditAdjustments = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnP2CreditAdjustments = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fcurP2CreditAdjustments = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fblnFinalReturn = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnHospice = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrHospiceType = JdbcWritableBridge.readString(22, __dbResults);
    this.fcurTotalSales = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurZeroSupplies = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurLongTermCareSales = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurHospitalSales = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurDebitPrivateUse = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurDebitOneOff = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurDebitAssetsKept = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurDebitEntertainment = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurDebitChangeOfAccounting = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurDebitExemptSupplies = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurDebitAdjustPrevRate = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurDebitOther = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurTotalPurchases = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurCreditPrivateGoods = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurCreditPrivateAssets = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurCreditChangeOfAccounting = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurCreditAdjustPrevRate = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurCreditOther = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurTotalPart1GST = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurP2TotalSales = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurP2ZeroSupplies = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurP2LongTermSales = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurP2HospitalSales = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurDebitP2PrivateUse = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurDebitP2OneOff = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurDebitP2AssetsKept = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurDebitP2Entertainment = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurDebitP2ChangeOfAccounting = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurDebitP2ExemptSupplies = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurDebitP2AdjustPrevRate = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurDebitP2Other = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurP2TotalPurchases = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurCreditP2PrivateGoods = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurCreditP2PrivateAssets = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurCreditP2ChangeOfAccounting = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurCreditP2AdjustPrevRate = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurCreditP2Other = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurTotalPart2GST = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurTotalTransitionalGST = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(62, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(63, __dbResults);
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
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFreq, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGSTTotal, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTVoluntaryAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRefundTransfer, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransitional, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonID, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorID, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIPAddress, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDebitAdjustments, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitAdjustments, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnP2DebitAdjustments, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2DebitAdjustments, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCreditAdjustments, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditAdjustments, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnP2CreditAdjustments, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2CreditAdjustments, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinalReturn, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHospice, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrHospiceType, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSales, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurZeroSupplies, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLongTermCareSales, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurHospitalSales, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitPrivateUse, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitOneOff, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitAssetsKept, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitEntertainment, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitChangeOfAccounting, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitExemptSupplies, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitAdjustPrevRate, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitOther, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPurchases, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditPrivateGoods, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditPrivateAssets, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditChangeOfAccounting, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditAdjustPrevRate, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditOther, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPart1GST, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2TotalSales, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2ZeroSupplies, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2LongTermSales, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2HospitalSales, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2PrivateUse, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2OneOff, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2AssetsKept, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2Entertainment, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2ChangeOfAccounting, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2ExemptSupplies, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2AdjustPrevRate, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2Other, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2TotalPurchases, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2PrivateGoods, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2PrivateAssets, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2ChangeOfAccounting, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2AdjustPrevRate, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2Other, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPart2GST, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTransitionalGST, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 62 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 63 + __off, 93, __dbStmt);
    return 63;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFreq, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGSTTotal, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTVoluntaryAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRefundTransfer, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransitional, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonID, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorID, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIPAddress, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDebitAdjustments, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitAdjustments, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnP2DebitAdjustments, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2DebitAdjustments, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCreditAdjustments, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditAdjustments, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnP2CreditAdjustments, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2CreditAdjustments, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinalReturn, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHospice, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrHospiceType, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSales, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurZeroSupplies, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLongTermCareSales, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurHospitalSales, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitPrivateUse, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitOneOff, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitAssetsKept, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitEntertainment, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitChangeOfAccounting, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitExemptSupplies, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitAdjustPrevRate, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitOther, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPurchases, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditPrivateGoods, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditPrivateAssets, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditChangeOfAccounting, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditAdjustPrevRate, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditOther, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPart1GST, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2TotalSales, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2ZeroSupplies, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2LongTermSales, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2HospitalSales, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2PrivateUse, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2OneOff, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2AssetsKept, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2Entertainment, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2ChangeOfAccounting, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2ExemptSupplies, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2AdjustPrevRate, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitP2Other, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2TotalPurchases, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2PrivateGoods, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2PrivateAssets, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2ChangeOfAccounting, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2AdjustPrevRate, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditP2Other, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPart2GST, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTransitionalGST, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 62 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 63 + __off, 93, __dbStmt);
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
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingFreq = null;
    } else {
    this.fstrFilingFreq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceType = null;
    } else {
    this.fstrSourceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGSTTotal = null;
    } else {
    this.fcurGSTTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTVoluntaryAmount = null;
    } else {
    this.fcurPTVoluntaryAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTRefundTransfer = null;
    } else {
    this.fcurPTRefundTransfer = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTransitional = null;
    } else {
    this.fblnTransitional = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWebLogonID = null;
    } else {
    this.fstrWebLogonID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVendorID = null;
    } else {
    this.fstrVendorID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIPAddress = null;
    } else {
    this.fstrIPAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDebitAdjustments = null;
    } else {
    this.fblnDebitAdjustments = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitAdjustments = null;
    } else {
    this.fcurDebitAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnP2DebitAdjustments = null;
    } else {
    this.fblnP2DebitAdjustments = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2DebitAdjustments = null;
    } else {
    this.fcurP2DebitAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCreditAdjustments = null;
    } else {
    this.fblnCreditAdjustments = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditAdjustments = null;
    } else {
    this.fcurCreditAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnP2CreditAdjustments = null;
    } else {
    this.fblnP2CreditAdjustments = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2CreditAdjustments = null;
    } else {
    this.fcurP2CreditAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFinalReturn = null;
    } else {
    this.fblnFinalReturn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHospice = null;
    } else {
    this.fblnHospice = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHospiceType = null;
    } else {
    this.fstrHospiceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalSales = null;
    } else {
    this.fcurTotalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurZeroSupplies = null;
    } else {
    this.fcurZeroSupplies = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLongTermCareSales = null;
    } else {
    this.fcurLongTermCareSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurHospitalSales = null;
    } else {
    this.fcurHospitalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitPrivateUse = null;
    } else {
    this.fcurDebitPrivateUse = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitOneOff = null;
    } else {
    this.fcurDebitOneOff = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitAssetsKept = null;
    } else {
    this.fcurDebitAssetsKept = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitEntertainment = null;
    } else {
    this.fcurDebitEntertainment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitChangeOfAccounting = null;
    } else {
    this.fcurDebitChangeOfAccounting = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitExemptSupplies = null;
    } else {
    this.fcurDebitExemptSupplies = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitAdjustPrevRate = null;
    } else {
    this.fcurDebitAdjustPrevRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitOther = null;
    } else {
    this.fcurDebitOther = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPurchases = null;
    } else {
    this.fcurTotalPurchases = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditPrivateGoods = null;
    } else {
    this.fcurCreditPrivateGoods = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditPrivateAssets = null;
    } else {
    this.fcurCreditPrivateAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditChangeOfAccounting = null;
    } else {
    this.fcurCreditChangeOfAccounting = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditAdjustPrevRate = null;
    } else {
    this.fcurCreditAdjustPrevRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditOther = null;
    } else {
    this.fcurCreditOther = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPart1GST = null;
    } else {
    this.fcurTotalPart1GST = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2TotalSales = null;
    } else {
    this.fcurP2TotalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2ZeroSupplies = null;
    } else {
    this.fcurP2ZeroSupplies = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2LongTermSales = null;
    } else {
    this.fcurP2LongTermSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2HospitalSales = null;
    } else {
    this.fcurP2HospitalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitP2PrivateUse = null;
    } else {
    this.fcurDebitP2PrivateUse = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitP2OneOff = null;
    } else {
    this.fcurDebitP2OneOff = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitP2AssetsKept = null;
    } else {
    this.fcurDebitP2AssetsKept = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitP2Entertainment = null;
    } else {
    this.fcurDebitP2Entertainment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitP2ChangeOfAccounting = null;
    } else {
    this.fcurDebitP2ChangeOfAccounting = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitP2ExemptSupplies = null;
    } else {
    this.fcurDebitP2ExemptSupplies = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitP2AdjustPrevRate = null;
    } else {
    this.fcurDebitP2AdjustPrevRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitP2Other = null;
    } else {
    this.fcurDebitP2Other = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2TotalPurchases = null;
    } else {
    this.fcurP2TotalPurchases = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditP2PrivateGoods = null;
    } else {
    this.fcurCreditP2PrivateGoods = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditP2PrivateAssets = null;
    } else {
    this.fcurCreditP2PrivateAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditP2ChangeOfAccounting = null;
    } else {
    this.fcurCreditP2ChangeOfAccounting = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditP2AdjustPrevRate = null;
    } else {
    this.fcurCreditP2AdjustPrevRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditP2Other = null;
    } else {
    this.fcurCreditP2Other = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPart2GST = null;
    } else {
    this.fcurTotalPart2GST = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTransitionalGST = null;
    } else {
    this.fcurTotalTransitionalGST = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrFilingFreq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFreq);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fcurGSTTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGSTTotal, __dataOut);
    }
    if (null == this.fcurPTVoluntaryAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTVoluntaryAmount, __dataOut);
    }
    if (null == this.fcurPTRefundTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRefundTransfer, __dataOut);
    }
    if (null == this.fblnTransitional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransitional);
    }
    if (null == this.fstrWebLogonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonID);
    }
    if (null == this.fstrVendorID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorID);
    }
    if (null == this.fstrIPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIPAddress);
    }
    if (null == this.fblnDebitAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDebitAdjustments);
    }
    if (null == this.fcurDebitAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitAdjustments, __dataOut);
    }
    if (null == this.fblnP2DebitAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnP2DebitAdjustments);
    }
    if (null == this.fcurP2DebitAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2DebitAdjustments, __dataOut);
    }
    if (null == this.fblnCreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCreditAdjustments);
    }
    if (null == this.fcurCreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditAdjustments, __dataOut);
    }
    if (null == this.fblnP2CreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnP2CreditAdjustments);
    }
    if (null == this.fcurP2CreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2CreditAdjustments, __dataOut);
    }
    if (null == this.fblnFinalReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinalReturn);
    }
    if (null == this.fblnHospice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHospice);
    }
    if (null == this.fstrHospiceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHospiceType);
    }
    if (null == this.fcurTotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSales, __dataOut);
    }
    if (null == this.fcurZeroSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurZeroSupplies, __dataOut);
    }
    if (null == this.fcurLongTermCareSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLongTermCareSales, __dataOut);
    }
    if (null == this.fcurHospitalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurHospitalSales, __dataOut);
    }
    if (null == this.fcurDebitPrivateUse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitPrivateUse, __dataOut);
    }
    if (null == this.fcurDebitOneOff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitOneOff, __dataOut);
    }
    if (null == this.fcurDebitAssetsKept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitAssetsKept, __dataOut);
    }
    if (null == this.fcurDebitEntertainment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitEntertainment, __dataOut);
    }
    if (null == this.fcurDebitChangeOfAccounting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitChangeOfAccounting, __dataOut);
    }
    if (null == this.fcurDebitExemptSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitExemptSupplies, __dataOut);
    }
    if (null == this.fcurDebitAdjustPrevRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitAdjustPrevRate, __dataOut);
    }
    if (null == this.fcurDebitOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitOther, __dataOut);
    }
    if (null == this.fcurTotalPurchases) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPurchases, __dataOut);
    }
    if (null == this.fcurCreditPrivateGoods) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditPrivateGoods, __dataOut);
    }
    if (null == this.fcurCreditPrivateAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditPrivateAssets, __dataOut);
    }
    if (null == this.fcurCreditChangeOfAccounting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditChangeOfAccounting, __dataOut);
    }
    if (null == this.fcurCreditAdjustPrevRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditAdjustPrevRate, __dataOut);
    }
    if (null == this.fcurCreditOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditOther, __dataOut);
    }
    if (null == this.fcurTotalPart1GST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPart1GST, __dataOut);
    }
    if (null == this.fcurP2TotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2TotalSales, __dataOut);
    }
    if (null == this.fcurP2ZeroSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2ZeroSupplies, __dataOut);
    }
    if (null == this.fcurP2LongTermSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2LongTermSales, __dataOut);
    }
    if (null == this.fcurP2HospitalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2HospitalSales, __dataOut);
    }
    if (null == this.fcurDebitP2PrivateUse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2PrivateUse, __dataOut);
    }
    if (null == this.fcurDebitP2OneOff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2OneOff, __dataOut);
    }
    if (null == this.fcurDebitP2AssetsKept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2AssetsKept, __dataOut);
    }
    if (null == this.fcurDebitP2Entertainment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2Entertainment, __dataOut);
    }
    if (null == this.fcurDebitP2ChangeOfAccounting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2ChangeOfAccounting, __dataOut);
    }
    if (null == this.fcurDebitP2ExemptSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2ExemptSupplies, __dataOut);
    }
    if (null == this.fcurDebitP2AdjustPrevRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2AdjustPrevRate, __dataOut);
    }
    if (null == this.fcurDebitP2Other) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2Other, __dataOut);
    }
    if (null == this.fcurP2TotalPurchases) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2TotalPurchases, __dataOut);
    }
    if (null == this.fcurCreditP2PrivateGoods) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2PrivateGoods, __dataOut);
    }
    if (null == this.fcurCreditP2PrivateAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2PrivateAssets, __dataOut);
    }
    if (null == this.fcurCreditP2ChangeOfAccounting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2ChangeOfAccounting, __dataOut);
    }
    if (null == this.fcurCreditP2AdjustPrevRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2AdjustPrevRate, __dataOut);
    }
    if (null == this.fcurCreditP2Other) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2Other, __dataOut);
    }
    if (null == this.fcurTotalPart2GST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPart2GST, __dataOut);
    }
    if (null == this.fcurTotalTransitionalGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTransitionalGST, __dataOut);
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
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrFilingFreq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFreq);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fcurGSTTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGSTTotal, __dataOut);
    }
    if (null == this.fcurPTVoluntaryAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTVoluntaryAmount, __dataOut);
    }
    if (null == this.fcurPTRefundTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRefundTransfer, __dataOut);
    }
    if (null == this.fblnTransitional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransitional);
    }
    if (null == this.fstrWebLogonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonID);
    }
    if (null == this.fstrVendorID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorID);
    }
    if (null == this.fstrIPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIPAddress);
    }
    if (null == this.fblnDebitAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDebitAdjustments);
    }
    if (null == this.fcurDebitAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitAdjustments, __dataOut);
    }
    if (null == this.fblnP2DebitAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnP2DebitAdjustments);
    }
    if (null == this.fcurP2DebitAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2DebitAdjustments, __dataOut);
    }
    if (null == this.fblnCreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCreditAdjustments);
    }
    if (null == this.fcurCreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditAdjustments, __dataOut);
    }
    if (null == this.fblnP2CreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnP2CreditAdjustments);
    }
    if (null == this.fcurP2CreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2CreditAdjustments, __dataOut);
    }
    if (null == this.fblnFinalReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinalReturn);
    }
    if (null == this.fblnHospice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHospice);
    }
    if (null == this.fstrHospiceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHospiceType);
    }
    if (null == this.fcurTotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSales, __dataOut);
    }
    if (null == this.fcurZeroSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurZeroSupplies, __dataOut);
    }
    if (null == this.fcurLongTermCareSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLongTermCareSales, __dataOut);
    }
    if (null == this.fcurHospitalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurHospitalSales, __dataOut);
    }
    if (null == this.fcurDebitPrivateUse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitPrivateUse, __dataOut);
    }
    if (null == this.fcurDebitOneOff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitOneOff, __dataOut);
    }
    if (null == this.fcurDebitAssetsKept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitAssetsKept, __dataOut);
    }
    if (null == this.fcurDebitEntertainment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitEntertainment, __dataOut);
    }
    if (null == this.fcurDebitChangeOfAccounting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitChangeOfAccounting, __dataOut);
    }
    if (null == this.fcurDebitExemptSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitExemptSupplies, __dataOut);
    }
    if (null == this.fcurDebitAdjustPrevRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitAdjustPrevRate, __dataOut);
    }
    if (null == this.fcurDebitOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitOther, __dataOut);
    }
    if (null == this.fcurTotalPurchases) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPurchases, __dataOut);
    }
    if (null == this.fcurCreditPrivateGoods) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditPrivateGoods, __dataOut);
    }
    if (null == this.fcurCreditPrivateAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditPrivateAssets, __dataOut);
    }
    if (null == this.fcurCreditChangeOfAccounting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditChangeOfAccounting, __dataOut);
    }
    if (null == this.fcurCreditAdjustPrevRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditAdjustPrevRate, __dataOut);
    }
    if (null == this.fcurCreditOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditOther, __dataOut);
    }
    if (null == this.fcurTotalPart1GST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPart1GST, __dataOut);
    }
    if (null == this.fcurP2TotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2TotalSales, __dataOut);
    }
    if (null == this.fcurP2ZeroSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2ZeroSupplies, __dataOut);
    }
    if (null == this.fcurP2LongTermSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2LongTermSales, __dataOut);
    }
    if (null == this.fcurP2HospitalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2HospitalSales, __dataOut);
    }
    if (null == this.fcurDebitP2PrivateUse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2PrivateUse, __dataOut);
    }
    if (null == this.fcurDebitP2OneOff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2OneOff, __dataOut);
    }
    if (null == this.fcurDebitP2AssetsKept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2AssetsKept, __dataOut);
    }
    if (null == this.fcurDebitP2Entertainment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2Entertainment, __dataOut);
    }
    if (null == this.fcurDebitP2ChangeOfAccounting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2ChangeOfAccounting, __dataOut);
    }
    if (null == this.fcurDebitP2ExemptSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2ExemptSupplies, __dataOut);
    }
    if (null == this.fcurDebitP2AdjustPrevRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2AdjustPrevRate, __dataOut);
    }
    if (null == this.fcurDebitP2Other) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitP2Other, __dataOut);
    }
    if (null == this.fcurP2TotalPurchases) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2TotalPurchases, __dataOut);
    }
    if (null == this.fcurCreditP2PrivateGoods) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2PrivateGoods, __dataOut);
    }
    if (null == this.fcurCreditP2PrivateAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2PrivateAssets, __dataOut);
    }
    if (null == this.fcurCreditP2ChangeOfAccounting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2ChangeOfAccounting, __dataOut);
    }
    if (null == this.fcurCreditP2AdjustPrevRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2AdjustPrevRate, __dataOut);
    }
    if (null == this.fcurCreditP2Other) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditP2Other, __dataOut);
    }
    if (null == this.fcurTotalPart2GST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPart2GST, __dataOut);
    }
    if (null == this.fcurTotalTransitionalGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTransitionalGST, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFreq==null?"\\N":fstrFilingFreq, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGSTTotal==null?"\\N":fcurGSTTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTVoluntaryAmount==null?"\\N":fcurPTVoluntaryAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRefundTransfer==null?"\\N":fcurPTRefundTransfer.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransitional==null?"\\N":"" + fblnTransitional, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebLogonID==null?"\\N":fstrWebLogonID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorID==null?"\\N":fstrVendorID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIPAddress==null?"\\N":fstrIPAddress, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDebitAdjustments==null?"\\N":"" + fblnDebitAdjustments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitAdjustments==null?"\\N":fcurDebitAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnP2DebitAdjustments==null?"\\N":"" + fblnP2DebitAdjustments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2DebitAdjustments==null?"\\N":fcurP2DebitAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCreditAdjustments==null?"\\N":"" + fblnCreditAdjustments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditAdjustments==null?"\\N":fcurCreditAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnP2CreditAdjustments==null?"\\N":"" + fblnP2CreditAdjustments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2CreditAdjustments==null?"\\N":fcurP2CreditAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinalReturn==null?"\\N":"" + fblnFinalReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHospice==null?"\\N":"" + fblnHospice, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHospiceType==null?"\\N":fstrHospiceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSales==null?"\\N":fcurTotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurZeroSupplies==null?"\\N":fcurZeroSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLongTermCareSales==null?"\\N":fcurLongTermCareSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurHospitalSales==null?"\\N":fcurHospitalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitPrivateUse==null?"\\N":fcurDebitPrivateUse.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitOneOff==null?"\\N":fcurDebitOneOff.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitAssetsKept==null?"\\N":fcurDebitAssetsKept.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitEntertainment==null?"\\N":fcurDebitEntertainment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitChangeOfAccounting==null?"\\N":fcurDebitChangeOfAccounting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitExemptSupplies==null?"\\N":fcurDebitExemptSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitAdjustPrevRate==null?"\\N":fcurDebitAdjustPrevRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitOther==null?"\\N":fcurDebitOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPurchases==null?"\\N":fcurTotalPurchases.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditPrivateGoods==null?"\\N":fcurCreditPrivateGoods.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditPrivateAssets==null?"\\N":fcurCreditPrivateAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditChangeOfAccounting==null?"\\N":fcurCreditChangeOfAccounting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditAdjustPrevRate==null?"\\N":fcurCreditAdjustPrevRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditOther==null?"\\N":fcurCreditOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPart1GST==null?"\\N":fcurTotalPart1GST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2TotalSales==null?"\\N":fcurP2TotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2ZeroSupplies==null?"\\N":fcurP2ZeroSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2LongTermSales==null?"\\N":fcurP2LongTermSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2HospitalSales==null?"\\N":fcurP2HospitalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2PrivateUse==null?"\\N":fcurDebitP2PrivateUse.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2OneOff==null?"\\N":fcurDebitP2OneOff.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2AssetsKept==null?"\\N":fcurDebitP2AssetsKept.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2Entertainment==null?"\\N":fcurDebitP2Entertainment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2ChangeOfAccounting==null?"\\N":fcurDebitP2ChangeOfAccounting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2ExemptSupplies==null?"\\N":fcurDebitP2ExemptSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2AdjustPrevRate==null?"\\N":fcurDebitP2AdjustPrevRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2Other==null?"\\N":fcurDebitP2Other.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2TotalPurchases==null?"\\N":fcurP2TotalPurchases.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2PrivateGoods==null?"\\N":fcurCreditP2PrivateGoods.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2PrivateAssets==null?"\\N":fcurCreditP2PrivateAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2ChangeOfAccounting==null?"\\N":fcurCreditP2ChangeOfAccounting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2AdjustPrevRate==null?"\\N":fcurCreditP2AdjustPrevRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2Other==null?"\\N":fcurCreditP2Other.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPart2GST==null?"\\N":fcurTotalPart2GST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTransitionalGST==null?"\\N":fcurTotalTransitionalGST.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFreq==null?"\\N":fstrFilingFreq, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGSTTotal==null?"\\N":fcurGSTTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTVoluntaryAmount==null?"\\N":fcurPTVoluntaryAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRefundTransfer==null?"\\N":fcurPTRefundTransfer.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransitional==null?"\\N":"" + fblnTransitional, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebLogonID==null?"\\N":fstrWebLogonID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorID==null?"\\N":fstrVendorID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIPAddress==null?"\\N":fstrIPAddress, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDebitAdjustments==null?"\\N":"" + fblnDebitAdjustments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitAdjustments==null?"\\N":fcurDebitAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnP2DebitAdjustments==null?"\\N":"" + fblnP2DebitAdjustments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2DebitAdjustments==null?"\\N":fcurP2DebitAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCreditAdjustments==null?"\\N":"" + fblnCreditAdjustments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditAdjustments==null?"\\N":fcurCreditAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnP2CreditAdjustments==null?"\\N":"" + fblnP2CreditAdjustments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2CreditAdjustments==null?"\\N":fcurP2CreditAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinalReturn==null?"\\N":"" + fblnFinalReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHospice==null?"\\N":"" + fblnHospice, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHospiceType==null?"\\N":fstrHospiceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSales==null?"\\N":fcurTotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurZeroSupplies==null?"\\N":fcurZeroSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLongTermCareSales==null?"\\N":fcurLongTermCareSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurHospitalSales==null?"\\N":fcurHospitalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitPrivateUse==null?"\\N":fcurDebitPrivateUse.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitOneOff==null?"\\N":fcurDebitOneOff.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitAssetsKept==null?"\\N":fcurDebitAssetsKept.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitEntertainment==null?"\\N":fcurDebitEntertainment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitChangeOfAccounting==null?"\\N":fcurDebitChangeOfAccounting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitExemptSupplies==null?"\\N":fcurDebitExemptSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitAdjustPrevRate==null?"\\N":fcurDebitAdjustPrevRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitOther==null?"\\N":fcurDebitOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPurchases==null?"\\N":fcurTotalPurchases.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditPrivateGoods==null?"\\N":fcurCreditPrivateGoods.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditPrivateAssets==null?"\\N":fcurCreditPrivateAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditChangeOfAccounting==null?"\\N":fcurCreditChangeOfAccounting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditAdjustPrevRate==null?"\\N":fcurCreditAdjustPrevRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditOther==null?"\\N":fcurCreditOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPart1GST==null?"\\N":fcurTotalPart1GST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2TotalSales==null?"\\N":fcurP2TotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2ZeroSupplies==null?"\\N":fcurP2ZeroSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2LongTermSales==null?"\\N":fcurP2LongTermSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2HospitalSales==null?"\\N":fcurP2HospitalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2PrivateUse==null?"\\N":fcurDebitP2PrivateUse.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2OneOff==null?"\\N":fcurDebitP2OneOff.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2AssetsKept==null?"\\N":fcurDebitP2AssetsKept.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2Entertainment==null?"\\N":fcurDebitP2Entertainment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2ChangeOfAccounting==null?"\\N":fcurDebitP2ChangeOfAccounting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2ExemptSupplies==null?"\\N":fcurDebitP2ExemptSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2AdjustPrevRate==null?"\\N":fcurDebitP2AdjustPrevRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitP2Other==null?"\\N":fcurDebitP2Other.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2TotalPurchases==null?"\\N":fcurP2TotalPurchases.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2PrivateGoods==null?"\\N":fcurCreditP2PrivateGoods.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2PrivateAssets==null?"\\N":fcurCreditP2PrivateAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2ChangeOfAccounting==null?"\\N":fcurCreditP2ChangeOfAccounting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2AdjustPrevRate==null?"\\N":fcurCreditP2AdjustPrevRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditP2Other==null?"\\N":fcurCreditP2Other.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPart2GST==null?"\\N":fcurTotalPart2GST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTransitionalGST==null?"\\N":fcurTotalTransitionalGST.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFreq = null; } else {
      this.fstrFilingFreq = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGSTTotal = null; } else {
      this.fcurGSTTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTVoluntaryAmount = null; } else {
      this.fcurPTVoluntaryAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRefundTransfer = null; } else {
      this.fcurPTRefundTransfer = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransitional = null; } else {
      this.fblnTransitional = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrVendorID = null; } else {
      this.fstrVendorID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDebitAdjustments = null; } else {
      this.fblnDebitAdjustments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitAdjustments = null; } else {
      this.fcurDebitAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnP2DebitAdjustments = null; } else {
      this.fblnP2DebitAdjustments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2DebitAdjustments = null; } else {
      this.fcurP2DebitAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCreditAdjustments = null; } else {
      this.fblnCreditAdjustments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditAdjustments = null; } else {
      this.fcurCreditAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnP2CreditAdjustments = null; } else {
      this.fblnP2CreditAdjustments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2CreditAdjustments = null; } else {
      this.fcurP2CreditAdjustments = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHospice = null; } else {
      this.fblnHospice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHospiceType = null; } else {
      this.fstrHospiceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSales = null; } else {
      this.fcurTotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurZeroSupplies = null; } else {
      this.fcurZeroSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLongTermCareSales = null; } else {
      this.fcurLongTermCareSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurHospitalSales = null; } else {
      this.fcurHospitalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitPrivateUse = null; } else {
      this.fcurDebitPrivateUse = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitOneOff = null; } else {
      this.fcurDebitOneOff = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitAssetsKept = null; } else {
      this.fcurDebitAssetsKept = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitEntertainment = null; } else {
      this.fcurDebitEntertainment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitChangeOfAccounting = null; } else {
      this.fcurDebitChangeOfAccounting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitExemptSupplies = null; } else {
      this.fcurDebitExemptSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitAdjustPrevRate = null; } else {
      this.fcurDebitAdjustPrevRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitOther = null; } else {
      this.fcurDebitOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPurchases = null; } else {
      this.fcurTotalPurchases = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditPrivateGoods = null; } else {
      this.fcurCreditPrivateGoods = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditPrivateAssets = null; } else {
      this.fcurCreditPrivateAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditChangeOfAccounting = null; } else {
      this.fcurCreditChangeOfAccounting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditAdjustPrevRate = null; } else {
      this.fcurCreditAdjustPrevRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditOther = null; } else {
      this.fcurCreditOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPart1GST = null; } else {
      this.fcurTotalPart1GST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2TotalSales = null; } else {
      this.fcurP2TotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2ZeroSupplies = null; } else {
      this.fcurP2ZeroSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2LongTermSales = null; } else {
      this.fcurP2LongTermSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2HospitalSales = null; } else {
      this.fcurP2HospitalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2PrivateUse = null; } else {
      this.fcurDebitP2PrivateUse = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2OneOff = null; } else {
      this.fcurDebitP2OneOff = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2AssetsKept = null; } else {
      this.fcurDebitP2AssetsKept = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2Entertainment = null; } else {
      this.fcurDebitP2Entertainment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2ChangeOfAccounting = null; } else {
      this.fcurDebitP2ChangeOfAccounting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2ExemptSupplies = null; } else {
      this.fcurDebitP2ExemptSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2AdjustPrevRate = null; } else {
      this.fcurDebitP2AdjustPrevRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2Other = null; } else {
      this.fcurDebitP2Other = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2TotalPurchases = null; } else {
      this.fcurP2TotalPurchases = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2PrivateGoods = null; } else {
      this.fcurCreditP2PrivateGoods = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2PrivateAssets = null; } else {
      this.fcurCreditP2PrivateAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2ChangeOfAccounting = null; } else {
      this.fcurCreditP2ChangeOfAccounting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2AdjustPrevRate = null; } else {
      this.fcurCreditP2AdjustPrevRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2Other = null; } else {
      this.fcurCreditP2Other = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPart2GST = null; } else {
      this.fcurTotalPart2GST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTransitionalGST = null; } else {
      this.fcurTotalTransitionalGST = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFreq = null; } else {
      this.fstrFilingFreq = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGSTTotal = null; } else {
      this.fcurGSTTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTVoluntaryAmount = null; } else {
      this.fcurPTVoluntaryAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRefundTransfer = null; } else {
      this.fcurPTRefundTransfer = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransitional = null; } else {
      this.fblnTransitional = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrVendorID = null; } else {
      this.fstrVendorID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDebitAdjustments = null; } else {
      this.fblnDebitAdjustments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitAdjustments = null; } else {
      this.fcurDebitAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnP2DebitAdjustments = null; } else {
      this.fblnP2DebitAdjustments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2DebitAdjustments = null; } else {
      this.fcurP2DebitAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCreditAdjustments = null; } else {
      this.fblnCreditAdjustments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditAdjustments = null; } else {
      this.fcurCreditAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnP2CreditAdjustments = null; } else {
      this.fblnP2CreditAdjustments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2CreditAdjustments = null; } else {
      this.fcurP2CreditAdjustments = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHospice = null; } else {
      this.fblnHospice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHospiceType = null; } else {
      this.fstrHospiceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSales = null; } else {
      this.fcurTotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurZeroSupplies = null; } else {
      this.fcurZeroSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLongTermCareSales = null; } else {
      this.fcurLongTermCareSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurHospitalSales = null; } else {
      this.fcurHospitalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitPrivateUse = null; } else {
      this.fcurDebitPrivateUse = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitOneOff = null; } else {
      this.fcurDebitOneOff = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitAssetsKept = null; } else {
      this.fcurDebitAssetsKept = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitEntertainment = null; } else {
      this.fcurDebitEntertainment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitChangeOfAccounting = null; } else {
      this.fcurDebitChangeOfAccounting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitExemptSupplies = null; } else {
      this.fcurDebitExemptSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitAdjustPrevRate = null; } else {
      this.fcurDebitAdjustPrevRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitOther = null; } else {
      this.fcurDebitOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPurchases = null; } else {
      this.fcurTotalPurchases = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditPrivateGoods = null; } else {
      this.fcurCreditPrivateGoods = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditPrivateAssets = null; } else {
      this.fcurCreditPrivateAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditChangeOfAccounting = null; } else {
      this.fcurCreditChangeOfAccounting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditAdjustPrevRate = null; } else {
      this.fcurCreditAdjustPrevRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditOther = null; } else {
      this.fcurCreditOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPart1GST = null; } else {
      this.fcurTotalPart1GST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2TotalSales = null; } else {
      this.fcurP2TotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2ZeroSupplies = null; } else {
      this.fcurP2ZeroSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2LongTermSales = null; } else {
      this.fcurP2LongTermSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2HospitalSales = null; } else {
      this.fcurP2HospitalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2PrivateUse = null; } else {
      this.fcurDebitP2PrivateUse = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2OneOff = null; } else {
      this.fcurDebitP2OneOff = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2AssetsKept = null; } else {
      this.fcurDebitP2AssetsKept = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2Entertainment = null; } else {
      this.fcurDebitP2Entertainment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2ChangeOfAccounting = null; } else {
      this.fcurDebitP2ChangeOfAccounting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2ExemptSupplies = null; } else {
      this.fcurDebitP2ExemptSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2AdjustPrevRate = null; } else {
      this.fcurDebitP2AdjustPrevRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitP2Other = null; } else {
      this.fcurDebitP2Other = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2TotalPurchases = null; } else {
      this.fcurP2TotalPurchases = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2PrivateGoods = null; } else {
      this.fcurCreditP2PrivateGoods = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2PrivateAssets = null; } else {
      this.fcurCreditP2PrivateAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2ChangeOfAccounting = null; } else {
      this.fcurCreditP2ChangeOfAccounting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2AdjustPrevRate = null; } else {
      this.fcurCreditP2AdjustPrevRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditP2Other = null; } else {
      this.fcurCreditP2Other = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPart2GST = null; } else {
      this.fcurTotalPart2GST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTransitionalGST = null; } else {
      this.fcurTotalTransitionalGST = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtngstoriginal o = (tblnz_rtngstoriginal) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtngstoriginal o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrFilingFreq", this.fstrFilingFreq);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fcurGSTTotal", this.fcurGSTTotal);
    __sqoop$field_map.put("fcurPTVoluntaryAmount", this.fcurPTVoluntaryAmount);
    __sqoop$field_map.put("fcurPTRefundTransfer", this.fcurPTRefundTransfer);
    __sqoop$field_map.put("fblnTransitional", this.fblnTransitional);
    __sqoop$field_map.put("fstrWebLogonID", this.fstrWebLogonID);
    __sqoop$field_map.put("fstrVendorID", this.fstrVendorID);
    __sqoop$field_map.put("fstrIPAddress", this.fstrIPAddress);
    __sqoop$field_map.put("fblnDebitAdjustments", this.fblnDebitAdjustments);
    __sqoop$field_map.put("fcurDebitAdjustments", this.fcurDebitAdjustments);
    __sqoop$field_map.put("fblnP2DebitAdjustments", this.fblnP2DebitAdjustments);
    __sqoop$field_map.put("fcurP2DebitAdjustments", this.fcurP2DebitAdjustments);
    __sqoop$field_map.put("fblnCreditAdjustments", this.fblnCreditAdjustments);
    __sqoop$field_map.put("fcurCreditAdjustments", this.fcurCreditAdjustments);
    __sqoop$field_map.put("fblnP2CreditAdjustments", this.fblnP2CreditAdjustments);
    __sqoop$field_map.put("fcurP2CreditAdjustments", this.fcurP2CreditAdjustments);
    __sqoop$field_map.put("fblnFinalReturn", this.fblnFinalReturn);
    __sqoop$field_map.put("fblnHospice", this.fblnHospice);
    __sqoop$field_map.put("fstrHospiceType", this.fstrHospiceType);
    __sqoop$field_map.put("fcurTotalSales", this.fcurTotalSales);
    __sqoop$field_map.put("fcurZeroSupplies", this.fcurZeroSupplies);
    __sqoop$field_map.put("fcurLongTermCareSales", this.fcurLongTermCareSales);
    __sqoop$field_map.put("fcurHospitalSales", this.fcurHospitalSales);
    __sqoop$field_map.put("fcurDebitPrivateUse", this.fcurDebitPrivateUse);
    __sqoop$field_map.put("fcurDebitOneOff", this.fcurDebitOneOff);
    __sqoop$field_map.put("fcurDebitAssetsKept", this.fcurDebitAssetsKept);
    __sqoop$field_map.put("fcurDebitEntertainment", this.fcurDebitEntertainment);
    __sqoop$field_map.put("fcurDebitChangeOfAccounting", this.fcurDebitChangeOfAccounting);
    __sqoop$field_map.put("fcurDebitExemptSupplies", this.fcurDebitExemptSupplies);
    __sqoop$field_map.put("fcurDebitAdjustPrevRate", this.fcurDebitAdjustPrevRate);
    __sqoop$field_map.put("fcurDebitOther", this.fcurDebitOther);
    __sqoop$field_map.put("fcurTotalPurchases", this.fcurTotalPurchases);
    __sqoop$field_map.put("fcurCreditPrivateGoods", this.fcurCreditPrivateGoods);
    __sqoop$field_map.put("fcurCreditPrivateAssets", this.fcurCreditPrivateAssets);
    __sqoop$field_map.put("fcurCreditChangeOfAccounting", this.fcurCreditChangeOfAccounting);
    __sqoop$field_map.put("fcurCreditAdjustPrevRate", this.fcurCreditAdjustPrevRate);
    __sqoop$field_map.put("fcurCreditOther", this.fcurCreditOther);
    __sqoop$field_map.put("fcurTotalPart1GST", this.fcurTotalPart1GST);
    __sqoop$field_map.put("fcurP2TotalSales", this.fcurP2TotalSales);
    __sqoop$field_map.put("fcurP2ZeroSupplies", this.fcurP2ZeroSupplies);
    __sqoop$field_map.put("fcurP2LongTermSales", this.fcurP2LongTermSales);
    __sqoop$field_map.put("fcurP2HospitalSales", this.fcurP2HospitalSales);
    __sqoop$field_map.put("fcurDebitP2PrivateUse", this.fcurDebitP2PrivateUse);
    __sqoop$field_map.put("fcurDebitP2OneOff", this.fcurDebitP2OneOff);
    __sqoop$field_map.put("fcurDebitP2AssetsKept", this.fcurDebitP2AssetsKept);
    __sqoop$field_map.put("fcurDebitP2Entertainment", this.fcurDebitP2Entertainment);
    __sqoop$field_map.put("fcurDebitP2ChangeOfAccounting", this.fcurDebitP2ChangeOfAccounting);
    __sqoop$field_map.put("fcurDebitP2ExemptSupplies", this.fcurDebitP2ExemptSupplies);
    __sqoop$field_map.put("fcurDebitP2AdjustPrevRate", this.fcurDebitP2AdjustPrevRate);
    __sqoop$field_map.put("fcurDebitP2Other", this.fcurDebitP2Other);
    __sqoop$field_map.put("fcurP2TotalPurchases", this.fcurP2TotalPurchases);
    __sqoop$field_map.put("fcurCreditP2PrivateGoods", this.fcurCreditP2PrivateGoods);
    __sqoop$field_map.put("fcurCreditP2PrivateAssets", this.fcurCreditP2PrivateAssets);
    __sqoop$field_map.put("fcurCreditP2ChangeOfAccounting", this.fcurCreditP2ChangeOfAccounting);
    __sqoop$field_map.put("fcurCreditP2AdjustPrevRate", this.fcurCreditP2AdjustPrevRate);
    __sqoop$field_map.put("fcurCreditP2Other", this.fcurCreditP2Other);
    __sqoop$field_map.put("fcurTotalPart2GST", this.fcurTotalPart2GST);
    __sqoop$field_map.put("fcurTotalTransitionalGST", this.fcurTotalTransitionalGST);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrFilingFreq", this.fstrFilingFreq);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fcurGSTTotal", this.fcurGSTTotal);
    __sqoop$field_map.put("fcurPTVoluntaryAmount", this.fcurPTVoluntaryAmount);
    __sqoop$field_map.put("fcurPTRefundTransfer", this.fcurPTRefundTransfer);
    __sqoop$field_map.put("fblnTransitional", this.fblnTransitional);
    __sqoop$field_map.put("fstrWebLogonID", this.fstrWebLogonID);
    __sqoop$field_map.put("fstrVendorID", this.fstrVendorID);
    __sqoop$field_map.put("fstrIPAddress", this.fstrIPAddress);
    __sqoop$field_map.put("fblnDebitAdjustments", this.fblnDebitAdjustments);
    __sqoop$field_map.put("fcurDebitAdjustments", this.fcurDebitAdjustments);
    __sqoop$field_map.put("fblnP2DebitAdjustments", this.fblnP2DebitAdjustments);
    __sqoop$field_map.put("fcurP2DebitAdjustments", this.fcurP2DebitAdjustments);
    __sqoop$field_map.put("fblnCreditAdjustments", this.fblnCreditAdjustments);
    __sqoop$field_map.put("fcurCreditAdjustments", this.fcurCreditAdjustments);
    __sqoop$field_map.put("fblnP2CreditAdjustments", this.fblnP2CreditAdjustments);
    __sqoop$field_map.put("fcurP2CreditAdjustments", this.fcurP2CreditAdjustments);
    __sqoop$field_map.put("fblnFinalReturn", this.fblnFinalReturn);
    __sqoop$field_map.put("fblnHospice", this.fblnHospice);
    __sqoop$field_map.put("fstrHospiceType", this.fstrHospiceType);
    __sqoop$field_map.put("fcurTotalSales", this.fcurTotalSales);
    __sqoop$field_map.put("fcurZeroSupplies", this.fcurZeroSupplies);
    __sqoop$field_map.put("fcurLongTermCareSales", this.fcurLongTermCareSales);
    __sqoop$field_map.put("fcurHospitalSales", this.fcurHospitalSales);
    __sqoop$field_map.put("fcurDebitPrivateUse", this.fcurDebitPrivateUse);
    __sqoop$field_map.put("fcurDebitOneOff", this.fcurDebitOneOff);
    __sqoop$field_map.put("fcurDebitAssetsKept", this.fcurDebitAssetsKept);
    __sqoop$field_map.put("fcurDebitEntertainment", this.fcurDebitEntertainment);
    __sqoop$field_map.put("fcurDebitChangeOfAccounting", this.fcurDebitChangeOfAccounting);
    __sqoop$field_map.put("fcurDebitExemptSupplies", this.fcurDebitExemptSupplies);
    __sqoop$field_map.put("fcurDebitAdjustPrevRate", this.fcurDebitAdjustPrevRate);
    __sqoop$field_map.put("fcurDebitOther", this.fcurDebitOther);
    __sqoop$field_map.put("fcurTotalPurchases", this.fcurTotalPurchases);
    __sqoop$field_map.put("fcurCreditPrivateGoods", this.fcurCreditPrivateGoods);
    __sqoop$field_map.put("fcurCreditPrivateAssets", this.fcurCreditPrivateAssets);
    __sqoop$field_map.put("fcurCreditChangeOfAccounting", this.fcurCreditChangeOfAccounting);
    __sqoop$field_map.put("fcurCreditAdjustPrevRate", this.fcurCreditAdjustPrevRate);
    __sqoop$field_map.put("fcurCreditOther", this.fcurCreditOther);
    __sqoop$field_map.put("fcurTotalPart1GST", this.fcurTotalPart1GST);
    __sqoop$field_map.put("fcurP2TotalSales", this.fcurP2TotalSales);
    __sqoop$field_map.put("fcurP2ZeroSupplies", this.fcurP2ZeroSupplies);
    __sqoop$field_map.put("fcurP2LongTermSales", this.fcurP2LongTermSales);
    __sqoop$field_map.put("fcurP2HospitalSales", this.fcurP2HospitalSales);
    __sqoop$field_map.put("fcurDebitP2PrivateUse", this.fcurDebitP2PrivateUse);
    __sqoop$field_map.put("fcurDebitP2OneOff", this.fcurDebitP2OneOff);
    __sqoop$field_map.put("fcurDebitP2AssetsKept", this.fcurDebitP2AssetsKept);
    __sqoop$field_map.put("fcurDebitP2Entertainment", this.fcurDebitP2Entertainment);
    __sqoop$field_map.put("fcurDebitP2ChangeOfAccounting", this.fcurDebitP2ChangeOfAccounting);
    __sqoop$field_map.put("fcurDebitP2ExemptSupplies", this.fcurDebitP2ExemptSupplies);
    __sqoop$field_map.put("fcurDebitP2AdjustPrevRate", this.fcurDebitP2AdjustPrevRate);
    __sqoop$field_map.put("fcurDebitP2Other", this.fcurDebitP2Other);
    __sqoop$field_map.put("fcurP2TotalPurchases", this.fcurP2TotalPurchases);
    __sqoop$field_map.put("fcurCreditP2PrivateGoods", this.fcurCreditP2PrivateGoods);
    __sqoop$field_map.put("fcurCreditP2PrivateAssets", this.fcurCreditP2PrivateAssets);
    __sqoop$field_map.put("fcurCreditP2ChangeOfAccounting", this.fcurCreditP2ChangeOfAccounting);
    __sqoop$field_map.put("fcurCreditP2AdjustPrevRate", this.fcurCreditP2AdjustPrevRate);
    __sqoop$field_map.put("fcurCreditP2Other", this.fcurCreditP2Other);
    __sqoop$field_map.put("fcurTotalPart2GST", this.fcurTotalPart2GST);
    __sqoop$field_map.put("fcurTotalTransitionalGST", this.fcurTotalTransitionalGST);
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
