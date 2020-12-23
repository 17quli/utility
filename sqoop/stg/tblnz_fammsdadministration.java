// ORM class for table 'tblnz_fammsdadministration'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:47:02 NZDT 2020
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

public class tblnz_fammsdadministration extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngMSDBenefitKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.flngMSDBenefitKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fdtmReceivedDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmReceivedDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrActionCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fstrActionCode = (String)value;
      }
    });
    setters.put("fstrBenefitCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fstrBenefitCode = (String)value;
      }
    });
    setters.put("fstrCeaseCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fstrCeaseCode = (String)value;
      }
    });
    setters.put("fcurBenefitRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fcurBenefitRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnPaidMSD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fblnPaidMSD = (Integer)value;
      }
    });
    setters.put("fstrFrequency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fstrFrequency = (String)value;
      }
    });
    setters.put("fdtmFinalPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmFinalPayment = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintPaymentExtension", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fintPaymentExtension = (Integer)value;
      }
    });
    setters.put("fcurPCGBenefitIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fcurPCGBenefitIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPCGEstIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fcurPCGEstIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPCGFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fcurPCGFTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPCGBSTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fcurPCGBSTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngPCGHours", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.flngPCGHours = (Integer)value;
      }
    });
    setters.put("fdtmPCGStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmPCGStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPCGStop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmPCGStop = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngPTRCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.flngPTRCustomerKey = (Integer)value;
      }
    });
    setters.put("fcurPTRBenefitIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fcurPTRBenefitIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTREstIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fcurPTREstIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTRFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fcurPTRFTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTRBSTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fcurPTRBSTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngPTRHours", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.flngPTRHours = (Integer)value;
      }
    });
    setters.put("fdtmPTRStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmPTRStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPTRStop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmPTRStop = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmEffectiveStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmEffectiveStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEffectiveStop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmEffectiveStop = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnMaximumFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fblnMaximumFTC = (Integer)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_fammsdadministration.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_fammsdadministration() {
    init0();
  }
  private Integer flngMSDBenefitKey;
  public Integer get_flngMSDBenefitKey() {
    return flngMSDBenefitKey;
  }
  public void set_flngMSDBenefitKey(Integer flngMSDBenefitKey) {
    this.flngMSDBenefitKey = flngMSDBenefitKey;
  }
  public tblnz_fammsdadministration with_flngMSDBenefitKey(Integer flngMSDBenefitKey) {
    this.flngMSDBenefitKey = flngMSDBenefitKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_fammsdadministration with_flngVer(Integer flngVer) {
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
  public tblnz_fammsdadministration with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.sql.Timestamp fdtmReceivedDate;
  public java.sql.Timestamp get_fdtmReceivedDate() {
    return fdtmReceivedDate;
  }
  public void set_fdtmReceivedDate(java.sql.Timestamp fdtmReceivedDate) {
    this.fdtmReceivedDate = fdtmReceivedDate;
  }
  public tblnz_fammsdadministration with_fdtmReceivedDate(java.sql.Timestamp fdtmReceivedDate) {
    this.fdtmReceivedDate = fdtmReceivedDate;
    return this;
  }
  private String fstrActionCode;
  public String get_fstrActionCode() {
    return fstrActionCode;
  }
  public void set_fstrActionCode(String fstrActionCode) {
    this.fstrActionCode = fstrActionCode;
  }
  public tblnz_fammsdadministration with_fstrActionCode(String fstrActionCode) {
    this.fstrActionCode = fstrActionCode;
    return this;
  }
  private String fstrBenefitCode;
  public String get_fstrBenefitCode() {
    return fstrBenefitCode;
  }
  public void set_fstrBenefitCode(String fstrBenefitCode) {
    this.fstrBenefitCode = fstrBenefitCode;
  }
  public tblnz_fammsdadministration with_fstrBenefitCode(String fstrBenefitCode) {
    this.fstrBenefitCode = fstrBenefitCode;
    return this;
  }
  private String fstrCeaseCode;
  public String get_fstrCeaseCode() {
    return fstrCeaseCode;
  }
  public void set_fstrCeaseCode(String fstrCeaseCode) {
    this.fstrCeaseCode = fstrCeaseCode;
  }
  public tblnz_fammsdadministration with_fstrCeaseCode(String fstrCeaseCode) {
    this.fstrCeaseCode = fstrCeaseCode;
    return this;
  }
  private java.math.BigDecimal fcurBenefitRate;
  public java.math.BigDecimal get_fcurBenefitRate() {
    return fcurBenefitRate;
  }
  public void set_fcurBenefitRate(java.math.BigDecimal fcurBenefitRate) {
    this.fcurBenefitRate = fcurBenefitRate;
  }
  public tblnz_fammsdadministration with_fcurBenefitRate(java.math.BigDecimal fcurBenefitRate) {
    this.fcurBenefitRate = fcurBenefitRate;
    return this;
  }
  private Integer fblnPaidMSD;
  public Integer get_fblnPaidMSD() {
    return fblnPaidMSD;
  }
  public void set_fblnPaidMSD(Integer fblnPaidMSD) {
    this.fblnPaidMSD = fblnPaidMSD;
  }
  public tblnz_fammsdadministration with_fblnPaidMSD(Integer fblnPaidMSD) {
    this.fblnPaidMSD = fblnPaidMSD;
    return this;
  }
  private String fstrFrequency;
  public String get_fstrFrequency() {
    return fstrFrequency;
  }
  public void set_fstrFrequency(String fstrFrequency) {
    this.fstrFrequency = fstrFrequency;
  }
  public tblnz_fammsdadministration with_fstrFrequency(String fstrFrequency) {
    this.fstrFrequency = fstrFrequency;
    return this;
  }
  private java.sql.Timestamp fdtmFinalPayment;
  public java.sql.Timestamp get_fdtmFinalPayment() {
    return fdtmFinalPayment;
  }
  public void set_fdtmFinalPayment(java.sql.Timestamp fdtmFinalPayment) {
    this.fdtmFinalPayment = fdtmFinalPayment;
  }
  public tblnz_fammsdadministration with_fdtmFinalPayment(java.sql.Timestamp fdtmFinalPayment) {
    this.fdtmFinalPayment = fdtmFinalPayment;
    return this;
  }
  private Integer fintPaymentExtension;
  public Integer get_fintPaymentExtension() {
    return fintPaymentExtension;
  }
  public void set_fintPaymentExtension(Integer fintPaymentExtension) {
    this.fintPaymentExtension = fintPaymentExtension;
  }
  public tblnz_fammsdadministration with_fintPaymentExtension(Integer fintPaymentExtension) {
    this.fintPaymentExtension = fintPaymentExtension;
    return this;
  }
  private java.math.BigDecimal fcurPCGBenefitIncome;
  public java.math.BigDecimal get_fcurPCGBenefitIncome() {
    return fcurPCGBenefitIncome;
  }
  public void set_fcurPCGBenefitIncome(java.math.BigDecimal fcurPCGBenefitIncome) {
    this.fcurPCGBenefitIncome = fcurPCGBenefitIncome;
  }
  public tblnz_fammsdadministration with_fcurPCGBenefitIncome(java.math.BigDecimal fcurPCGBenefitIncome) {
    this.fcurPCGBenefitIncome = fcurPCGBenefitIncome;
    return this;
  }
  private java.math.BigDecimal fcurPCGEstIncome;
  public java.math.BigDecimal get_fcurPCGEstIncome() {
    return fcurPCGEstIncome;
  }
  public void set_fcurPCGEstIncome(java.math.BigDecimal fcurPCGEstIncome) {
    this.fcurPCGEstIncome = fcurPCGEstIncome;
  }
  public tblnz_fammsdadministration with_fcurPCGEstIncome(java.math.BigDecimal fcurPCGEstIncome) {
    this.fcurPCGEstIncome = fcurPCGEstIncome;
    return this;
  }
  private java.math.BigDecimal fcurPCGFTC;
  public java.math.BigDecimal get_fcurPCGFTC() {
    return fcurPCGFTC;
  }
  public void set_fcurPCGFTC(java.math.BigDecimal fcurPCGFTC) {
    this.fcurPCGFTC = fcurPCGFTC;
  }
  public tblnz_fammsdadministration with_fcurPCGFTC(java.math.BigDecimal fcurPCGFTC) {
    this.fcurPCGFTC = fcurPCGFTC;
    return this;
  }
  private java.math.BigDecimal fcurPCGBSTC;
  public java.math.BigDecimal get_fcurPCGBSTC() {
    return fcurPCGBSTC;
  }
  public void set_fcurPCGBSTC(java.math.BigDecimal fcurPCGBSTC) {
    this.fcurPCGBSTC = fcurPCGBSTC;
  }
  public tblnz_fammsdadministration with_fcurPCGBSTC(java.math.BigDecimal fcurPCGBSTC) {
    this.fcurPCGBSTC = fcurPCGBSTC;
    return this;
  }
  private Integer flngPCGHours;
  public Integer get_flngPCGHours() {
    return flngPCGHours;
  }
  public void set_flngPCGHours(Integer flngPCGHours) {
    this.flngPCGHours = flngPCGHours;
  }
  public tblnz_fammsdadministration with_flngPCGHours(Integer flngPCGHours) {
    this.flngPCGHours = flngPCGHours;
    return this;
  }
  private java.sql.Timestamp fdtmPCGStart;
  public java.sql.Timestamp get_fdtmPCGStart() {
    return fdtmPCGStart;
  }
  public void set_fdtmPCGStart(java.sql.Timestamp fdtmPCGStart) {
    this.fdtmPCGStart = fdtmPCGStart;
  }
  public tblnz_fammsdadministration with_fdtmPCGStart(java.sql.Timestamp fdtmPCGStart) {
    this.fdtmPCGStart = fdtmPCGStart;
    return this;
  }
  private java.sql.Timestamp fdtmPCGStop;
  public java.sql.Timestamp get_fdtmPCGStop() {
    return fdtmPCGStop;
  }
  public void set_fdtmPCGStop(java.sql.Timestamp fdtmPCGStop) {
    this.fdtmPCGStop = fdtmPCGStop;
  }
  public tblnz_fammsdadministration with_fdtmPCGStop(java.sql.Timestamp fdtmPCGStop) {
    this.fdtmPCGStop = fdtmPCGStop;
    return this;
  }
  private Integer flngPTRCustomerKey;
  public Integer get_flngPTRCustomerKey() {
    return flngPTRCustomerKey;
  }
  public void set_flngPTRCustomerKey(Integer flngPTRCustomerKey) {
    this.flngPTRCustomerKey = flngPTRCustomerKey;
  }
  public tblnz_fammsdadministration with_flngPTRCustomerKey(Integer flngPTRCustomerKey) {
    this.flngPTRCustomerKey = flngPTRCustomerKey;
    return this;
  }
  private java.math.BigDecimal fcurPTRBenefitIncome;
  public java.math.BigDecimal get_fcurPTRBenefitIncome() {
    return fcurPTRBenefitIncome;
  }
  public void set_fcurPTRBenefitIncome(java.math.BigDecimal fcurPTRBenefitIncome) {
    this.fcurPTRBenefitIncome = fcurPTRBenefitIncome;
  }
  public tblnz_fammsdadministration with_fcurPTRBenefitIncome(java.math.BigDecimal fcurPTRBenefitIncome) {
    this.fcurPTRBenefitIncome = fcurPTRBenefitIncome;
    return this;
  }
  private java.math.BigDecimal fcurPTREstIncome;
  public java.math.BigDecimal get_fcurPTREstIncome() {
    return fcurPTREstIncome;
  }
  public void set_fcurPTREstIncome(java.math.BigDecimal fcurPTREstIncome) {
    this.fcurPTREstIncome = fcurPTREstIncome;
  }
  public tblnz_fammsdadministration with_fcurPTREstIncome(java.math.BigDecimal fcurPTREstIncome) {
    this.fcurPTREstIncome = fcurPTREstIncome;
    return this;
  }
  private java.math.BigDecimal fcurPTRFTC;
  public java.math.BigDecimal get_fcurPTRFTC() {
    return fcurPTRFTC;
  }
  public void set_fcurPTRFTC(java.math.BigDecimal fcurPTRFTC) {
    this.fcurPTRFTC = fcurPTRFTC;
  }
  public tblnz_fammsdadministration with_fcurPTRFTC(java.math.BigDecimal fcurPTRFTC) {
    this.fcurPTRFTC = fcurPTRFTC;
    return this;
  }
  private java.math.BigDecimal fcurPTRBSTC;
  public java.math.BigDecimal get_fcurPTRBSTC() {
    return fcurPTRBSTC;
  }
  public void set_fcurPTRBSTC(java.math.BigDecimal fcurPTRBSTC) {
    this.fcurPTRBSTC = fcurPTRBSTC;
  }
  public tblnz_fammsdadministration with_fcurPTRBSTC(java.math.BigDecimal fcurPTRBSTC) {
    this.fcurPTRBSTC = fcurPTRBSTC;
    return this;
  }
  private Integer flngPTRHours;
  public Integer get_flngPTRHours() {
    return flngPTRHours;
  }
  public void set_flngPTRHours(Integer flngPTRHours) {
    this.flngPTRHours = flngPTRHours;
  }
  public tblnz_fammsdadministration with_flngPTRHours(Integer flngPTRHours) {
    this.flngPTRHours = flngPTRHours;
    return this;
  }
  private java.sql.Timestamp fdtmPTRStart;
  public java.sql.Timestamp get_fdtmPTRStart() {
    return fdtmPTRStart;
  }
  public void set_fdtmPTRStart(java.sql.Timestamp fdtmPTRStart) {
    this.fdtmPTRStart = fdtmPTRStart;
  }
  public tblnz_fammsdadministration with_fdtmPTRStart(java.sql.Timestamp fdtmPTRStart) {
    this.fdtmPTRStart = fdtmPTRStart;
    return this;
  }
  private java.sql.Timestamp fdtmPTRStop;
  public java.sql.Timestamp get_fdtmPTRStop() {
    return fdtmPTRStop;
  }
  public void set_fdtmPTRStop(java.sql.Timestamp fdtmPTRStop) {
    this.fdtmPTRStop = fdtmPTRStop;
  }
  public tblnz_fammsdadministration with_fdtmPTRStop(java.sql.Timestamp fdtmPTRStop) {
    this.fdtmPTRStop = fdtmPTRStop;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_fammsdadministration with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmEffectiveStart;
  public java.sql.Timestamp get_fdtmEffectiveStart() {
    return fdtmEffectiveStart;
  }
  public void set_fdtmEffectiveStart(java.sql.Timestamp fdtmEffectiveStart) {
    this.fdtmEffectiveStart = fdtmEffectiveStart;
  }
  public tblnz_fammsdadministration with_fdtmEffectiveStart(java.sql.Timestamp fdtmEffectiveStart) {
    this.fdtmEffectiveStart = fdtmEffectiveStart;
    return this;
  }
  private java.sql.Timestamp fdtmEffectiveStop;
  public java.sql.Timestamp get_fdtmEffectiveStop() {
    return fdtmEffectiveStop;
  }
  public void set_fdtmEffectiveStop(java.sql.Timestamp fdtmEffectiveStop) {
    this.fdtmEffectiveStop = fdtmEffectiveStop;
  }
  public tblnz_fammsdadministration with_fdtmEffectiveStop(java.sql.Timestamp fdtmEffectiveStop) {
    this.fdtmEffectiveStop = fdtmEffectiveStop;
    return this;
  }
  private Integer fblnMaximumFTC;
  public Integer get_fblnMaximumFTC() {
    return fblnMaximumFTC;
  }
  public void set_fblnMaximumFTC(Integer fblnMaximumFTC) {
    this.fblnMaximumFTC = fblnMaximumFTC;
  }
  public tblnz_fammsdadministration with_fblnMaximumFTC(Integer fblnMaximumFTC) {
    this.fblnMaximumFTC = fblnMaximumFTC;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblnz_fammsdadministration with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_fammsdadministration with_fstrWho(String fstrWho) {
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
  public tblnz_fammsdadministration with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_fammsdadministration)) {
      return false;
    }
    tblnz_fammsdadministration that = (tblnz_fammsdadministration) o;
    boolean equal = true;
    equal = equal && (this.flngMSDBenefitKey == null ? that.flngMSDBenefitKey == null : this.flngMSDBenefitKey.equals(that.flngMSDBenefitKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmReceivedDate == null ? that.fdtmReceivedDate == null : this.fdtmReceivedDate.equals(that.fdtmReceivedDate));
    equal = equal && (this.fstrActionCode == null ? that.fstrActionCode == null : this.fstrActionCode.equals(that.fstrActionCode));
    equal = equal && (this.fstrBenefitCode == null ? that.fstrBenefitCode == null : this.fstrBenefitCode.equals(that.fstrBenefitCode));
    equal = equal && (this.fstrCeaseCode == null ? that.fstrCeaseCode == null : this.fstrCeaseCode.equals(that.fstrCeaseCode));
    equal = equal && (this.fcurBenefitRate == null ? that.fcurBenefitRate == null : this.fcurBenefitRate.equals(that.fcurBenefitRate));
    equal = equal && (this.fblnPaidMSD == null ? that.fblnPaidMSD == null : this.fblnPaidMSD.equals(that.fblnPaidMSD));
    equal = equal && (this.fstrFrequency == null ? that.fstrFrequency == null : this.fstrFrequency.equals(that.fstrFrequency));
    equal = equal && (this.fdtmFinalPayment == null ? that.fdtmFinalPayment == null : this.fdtmFinalPayment.equals(that.fdtmFinalPayment));
    equal = equal && (this.fintPaymentExtension == null ? that.fintPaymentExtension == null : this.fintPaymentExtension.equals(that.fintPaymentExtension));
    equal = equal && (this.fcurPCGBenefitIncome == null ? that.fcurPCGBenefitIncome == null : this.fcurPCGBenefitIncome.equals(that.fcurPCGBenefitIncome));
    equal = equal && (this.fcurPCGEstIncome == null ? that.fcurPCGEstIncome == null : this.fcurPCGEstIncome.equals(that.fcurPCGEstIncome));
    equal = equal && (this.fcurPCGFTC == null ? that.fcurPCGFTC == null : this.fcurPCGFTC.equals(that.fcurPCGFTC));
    equal = equal && (this.fcurPCGBSTC == null ? that.fcurPCGBSTC == null : this.fcurPCGBSTC.equals(that.fcurPCGBSTC));
    equal = equal && (this.flngPCGHours == null ? that.flngPCGHours == null : this.flngPCGHours.equals(that.flngPCGHours));
    equal = equal && (this.fdtmPCGStart == null ? that.fdtmPCGStart == null : this.fdtmPCGStart.equals(that.fdtmPCGStart));
    equal = equal && (this.fdtmPCGStop == null ? that.fdtmPCGStop == null : this.fdtmPCGStop.equals(that.fdtmPCGStop));
    equal = equal && (this.flngPTRCustomerKey == null ? that.flngPTRCustomerKey == null : this.flngPTRCustomerKey.equals(that.flngPTRCustomerKey));
    equal = equal && (this.fcurPTRBenefitIncome == null ? that.fcurPTRBenefitIncome == null : this.fcurPTRBenefitIncome.equals(that.fcurPTRBenefitIncome));
    equal = equal && (this.fcurPTREstIncome == null ? that.fcurPTREstIncome == null : this.fcurPTREstIncome.equals(that.fcurPTREstIncome));
    equal = equal && (this.fcurPTRFTC == null ? that.fcurPTRFTC == null : this.fcurPTRFTC.equals(that.fcurPTRFTC));
    equal = equal && (this.fcurPTRBSTC == null ? that.fcurPTRBSTC == null : this.fcurPTRBSTC.equals(that.fcurPTRBSTC));
    equal = equal && (this.flngPTRHours == null ? that.flngPTRHours == null : this.flngPTRHours.equals(that.flngPTRHours));
    equal = equal && (this.fdtmPTRStart == null ? that.fdtmPTRStart == null : this.fdtmPTRStart.equals(that.fdtmPTRStart));
    equal = equal && (this.fdtmPTRStop == null ? that.fdtmPTRStop == null : this.fdtmPTRStop.equals(that.fdtmPTRStop));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmEffectiveStart == null ? that.fdtmEffectiveStart == null : this.fdtmEffectiveStart.equals(that.fdtmEffectiveStart));
    equal = equal && (this.fdtmEffectiveStop == null ? that.fdtmEffectiveStop == null : this.fdtmEffectiveStop.equals(that.fdtmEffectiveStop));
    equal = equal && (this.fblnMaximumFTC == null ? that.fblnMaximumFTC == null : this.fblnMaximumFTC.equals(that.fblnMaximumFTC));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_fammsdadministration)) {
      return false;
    }
    tblnz_fammsdadministration that = (tblnz_fammsdadministration) o;
    boolean equal = true;
    equal = equal && (this.flngMSDBenefitKey == null ? that.flngMSDBenefitKey == null : this.flngMSDBenefitKey.equals(that.flngMSDBenefitKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmReceivedDate == null ? that.fdtmReceivedDate == null : this.fdtmReceivedDate.equals(that.fdtmReceivedDate));
    equal = equal && (this.fstrActionCode == null ? that.fstrActionCode == null : this.fstrActionCode.equals(that.fstrActionCode));
    equal = equal && (this.fstrBenefitCode == null ? that.fstrBenefitCode == null : this.fstrBenefitCode.equals(that.fstrBenefitCode));
    equal = equal && (this.fstrCeaseCode == null ? that.fstrCeaseCode == null : this.fstrCeaseCode.equals(that.fstrCeaseCode));
    equal = equal && (this.fcurBenefitRate == null ? that.fcurBenefitRate == null : this.fcurBenefitRate.equals(that.fcurBenefitRate));
    equal = equal && (this.fblnPaidMSD == null ? that.fblnPaidMSD == null : this.fblnPaidMSD.equals(that.fblnPaidMSD));
    equal = equal && (this.fstrFrequency == null ? that.fstrFrequency == null : this.fstrFrequency.equals(that.fstrFrequency));
    equal = equal && (this.fdtmFinalPayment == null ? that.fdtmFinalPayment == null : this.fdtmFinalPayment.equals(that.fdtmFinalPayment));
    equal = equal && (this.fintPaymentExtension == null ? that.fintPaymentExtension == null : this.fintPaymentExtension.equals(that.fintPaymentExtension));
    equal = equal && (this.fcurPCGBenefitIncome == null ? that.fcurPCGBenefitIncome == null : this.fcurPCGBenefitIncome.equals(that.fcurPCGBenefitIncome));
    equal = equal && (this.fcurPCGEstIncome == null ? that.fcurPCGEstIncome == null : this.fcurPCGEstIncome.equals(that.fcurPCGEstIncome));
    equal = equal && (this.fcurPCGFTC == null ? that.fcurPCGFTC == null : this.fcurPCGFTC.equals(that.fcurPCGFTC));
    equal = equal && (this.fcurPCGBSTC == null ? that.fcurPCGBSTC == null : this.fcurPCGBSTC.equals(that.fcurPCGBSTC));
    equal = equal && (this.flngPCGHours == null ? that.flngPCGHours == null : this.flngPCGHours.equals(that.flngPCGHours));
    equal = equal && (this.fdtmPCGStart == null ? that.fdtmPCGStart == null : this.fdtmPCGStart.equals(that.fdtmPCGStart));
    equal = equal && (this.fdtmPCGStop == null ? that.fdtmPCGStop == null : this.fdtmPCGStop.equals(that.fdtmPCGStop));
    equal = equal && (this.flngPTRCustomerKey == null ? that.flngPTRCustomerKey == null : this.flngPTRCustomerKey.equals(that.flngPTRCustomerKey));
    equal = equal && (this.fcurPTRBenefitIncome == null ? that.fcurPTRBenefitIncome == null : this.fcurPTRBenefitIncome.equals(that.fcurPTRBenefitIncome));
    equal = equal && (this.fcurPTREstIncome == null ? that.fcurPTREstIncome == null : this.fcurPTREstIncome.equals(that.fcurPTREstIncome));
    equal = equal && (this.fcurPTRFTC == null ? that.fcurPTRFTC == null : this.fcurPTRFTC.equals(that.fcurPTRFTC));
    equal = equal && (this.fcurPTRBSTC == null ? that.fcurPTRBSTC == null : this.fcurPTRBSTC.equals(that.fcurPTRBSTC));
    equal = equal && (this.flngPTRHours == null ? that.flngPTRHours == null : this.flngPTRHours.equals(that.flngPTRHours));
    equal = equal && (this.fdtmPTRStart == null ? that.fdtmPTRStart == null : this.fdtmPTRStart.equals(that.fdtmPTRStart));
    equal = equal && (this.fdtmPTRStop == null ? that.fdtmPTRStop == null : this.fdtmPTRStop.equals(that.fdtmPTRStop));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmEffectiveStart == null ? that.fdtmEffectiveStart == null : this.fdtmEffectiveStart.equals(that.fdtmEffectiveStart));
    equal = equal && (this.fdtmEffectiveStop == null ? that.fdtmEffectiveStop == null : this.fdtmEffectiveStop.equals(that.fdtmEffectiveStop));
    equal = equal && (this.fblnMaximumFTC == null ? that.fblnMaximumFTC == null : this.fblnMaximumFTC.equals(that.fblnMaximumFTC));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngMSDBenefitKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmReceivedDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrActionCode = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrBenefitCode = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrCeaseCode = JdbcWritableBridge.readString(7, __dbResults);
    this.fcurBenefitRate = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fblnPaidMSD = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrFrequency = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmFinalPayment = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fintPaymentExtension = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurPCGBenefitIncome = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurPCGEstIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurPCGFTC = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPCGBSTC = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.flngPCGHours = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fdtmPCGStart = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmPCGStop = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.flngPTRCustomerKey = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fcurPTRBenefitIncome = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurPTREstIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurPTRFTC = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurPTRBSTC = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.flngPTRHours = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fdtmPTRStart = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fdtmPTRStop = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fdtmEffectiveStart = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fdtmEffectiveStop = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.fblnMaximumFTC = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(33, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(34, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngMSDBenefitKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmReceivedDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrActionCode = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrBenefitCode = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrCeaseCode = JdbcWritableBridge.readString(7, __dbResults);
    this.fcurBenefitRate = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fblnPaidMSD = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrFrequency = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmFinalPayment = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fintPaymentExtension = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurPCGBenefitIncome = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurPCGEstIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurPCGFTC = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPCGBSTC = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.flngPCGHours = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fdtmPCGStart = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmPCGStop = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.flngPTRCustomerKey = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fcurPTRBenefitIncome = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurPTREstIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurPTRFTC = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurPTRBSTC = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.flngPTRHours = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fdtmPTRStart = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fdtmPTRStop = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fdtmEffectiveStart = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fdtmEffectiveStop = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.fblnMaximumFTC = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(33, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(34, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngMSDBenefitKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceivedDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrActionCode, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBenefitCode, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseCode, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBenefitRate, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPaidMSD, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFrequency, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFinalPayment, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintPaymentExtension, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPCGBenefitIncome, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPCGEstIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPCGFTC, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPCGBSTC, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPCGHours, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPCGStart, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPCGStop, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPTRCustomerKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRBenefitIncome, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTREstIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRFTC, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRBSTC, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPTRHours, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPTRStart, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPTRStop, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveStart, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveStop, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMaximumFTC, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 34 + __off, 93, __dbStmt);
    return 34;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngMSDBenefitKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceivedDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrActionCode, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBenefitCode, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseCode, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBenefitRate, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPaidMSD, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFrequency, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFinalPayment, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintPaymentExtension, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPCGBenefitIncome, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPCGEstIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPCGFTC, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPCGBSTC, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPCGHours, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPCGStart, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPCGStop, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPTRCustomerKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRBenefitIncome, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTREstIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRFTC, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRBSTC, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPTRHours, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPTRStart, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPTRStop, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveStart, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveStop, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMaximumFTC, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 34 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngMSDBenefitKey = null;
    } else {
    this.flngMSDBenefitKey = Integer.valueOf(__dataIn.readInt());
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
        this.fdtmReceivedDate = null;
    } else {
    this.fdtmReceivedDate = new Timestamp(__dataIn.readLong());
    this.fdtmReceivedDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrActionCode = null;
    } else {
    this.fstrActionCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBenefitCode = null;
    } else {
    this.fstrBenefitCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCeaseCode = null;
    } else {
    this.fstrCeaseCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBenefitRate = null;
    } else {
    this.fcurBenefitRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPaidMSD = null;
    } else {
    this.fblnPaidMSD = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFrequency = null;
    } else {
    this.fstrFrequency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFinalPayment = null;
    } else {
    this.fdtmFinalPayment = new Timestamp(__dataIn.readLong());
    this.fdtmFinalPayment.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintPaymentExtension = null;
    } else {
    this.fintPaymentExtension = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPCGBenefitIncome = null;
    } else {
    this.fcurPCGBenefitIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPCGEstIncome = null;
    } else {
    this.fcurPCGEstIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPCGFTC = null;
    } else {
    this.fcurPCGFTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPCGBSTC = null;
    } else {
    this.fcurPCGBSTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngPCGHours = null;
    } else {
    this.flngPCGHours = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPCGStart = null;
    } else {
    this.fdtmPCGStart = new Timestamp(__dataIn.readLong());
    this.fdtmPCGStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPCGStop = null;
    } else {
    this.fdtmPCGStop = new Timestamp(__dataIn.readLong());
    this.fdtmPCGStop.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngPTRCustomerKey = null;
    } else {
    this.flngPTRCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTRBenefitIncome = null;
    } else {
    this.fcurPTRBenefitIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTREstIncome = null;
    } else {
    this.fcurPTREstIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTRFTC = null;
    } else {
    this.fcurPTRFTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTRBSTC = null;
    } else {
    this.fcurPTRBSTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngPTRHours = null;
    } else {
    this.flngPTRHours = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPTRStart = null;
    } else {
    this.fdtmPTRStart = new Timestamp(__dataIn.readLong());
    this.fdtmPTRStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPTRStop = null;
    } else {
    this.fdtmPTRStop = new Timestamp(__dataIn.readLong());
    this.fdtmPTRStop.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectiveStart = null;
    } else {
    this.fdtmEffectiveStart = new Timestamp(__dataIn.readLong());
    this.fdtmEffectiveStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectiveStop = null;
    } else {
    this.fdtmEffectiveStop = new Timestamp(__dataIn.readLong());
    this.fdtmEffectiveStop.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMaximumFTC = null;
    } else {
    this.fblnMaximumFTC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
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
    if (null == this.flngMSDBenefitKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMSDBenefitKey);
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
    if (null == this.fdtmReceivedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceivedDate.getTime());
    __dataOut.writeInt(this.fdtmReceivedDate.getNanos());
    }
    if (null == this.fstrActionCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActionCode);
    }
    if (null == this.fstrBenefitCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBenefitCode);
    }
    if (null == this.fstrCeaseCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseCode);
    }
    if (null == this.fcurBenefitRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBenefitRate, __dataOut);
    }
    if (null == this.fblnPaidMSD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPaidMSD);
    }
    if (null == this.fstrFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFrequency);
    }
    if (null == this.fdtmFinalPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFinalPayment.getTime());
    __dataOut.writeInt(this.fdtmFinalPayment.getNanos());
    }
    if (null == this.fintPaymentExtension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintPaymentExtension);
    }
    if (null == this.fcurPCGBenefitIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPCGBenefitIncome, __dataOut);
    }
    if (null == this.fcurPCGEstIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPCGEstIncome, __dataOut);
    }
    if (null == this.fcurPCGFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPCGFTC, __dataOut);
    }
    if (null == this.fcurPCGBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPCGBSTC, __dataOut);
    }
    if (null == this.flngPCGHours) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPCGHours);
    }
    if (null == this.fdtmPCGStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPCGStart.getTime());
    __dataOut.writeInt(this.fdtmPCGStart.getNanos());
    }
    if (null == this.fdtmPCGStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPCGStop.getTime());
    __dataOut.writeInt(this.fdtmPCGStop.getNanos());
    }
    if (null == this.flngPTRCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPTRCustomerKey);
    }
    if (null == this.fcurPTRBenefitIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRBenefitIncome, __dataOut);
    }
    if (null == this.fcurPTREstIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTREstIncome, __dataOut);
    }
    if (null == this.fcurPTRFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRFTC, __dataOut);
    }
    if (null == this.fcurPTRBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRBSTC, __dataOut);
    }
    if (null == this.flngPTRHours) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPTRHours);
    }
    if (null == this.fdtmPTRStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPTRStart.getTime());
    __dataOut.writeInt(this.fdtmPTRStart.getNanos());
    }
    if (null == this.fdtmPTRStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPTRStop.getTime());
    __dataOut.writeInt(this.fdtmPTRStop.getNanos());
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmEffectiveStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveStart.getTime());
    __dataOut.writeInt(this.fdtmEffectiveStart.getNanos());
    }
    if (null == this.fdtmEffectiveStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveStop.getTime());
    __dataOut.writeInt(this.fdtmEffectiveStop.getNanos());
    }
    if (null == this.fblnMaximumFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMaximumFTC);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    if (null == this.flngMSDBenefitKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMSDBenefitKey);
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
    if (null == this.fdtmReceivedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceivedDate.getTime());
    __dataOut.writeInt(this.fdtmReceivedDate.getNanos());
    }
    if (null == this.fstrActionCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActionCode);
    }
    if (null == this.fstrBenefitCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBenefitCode);
    }
    if (null == this.fstrCeaseCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseCode);
    }
    if (null == this.fcurBenefitRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBenefitRate, __dataOut);
    }
    if (null == this.fblnPaidMSD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPaidMSD);
    }
    if (null == this.fstrFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFrequency);
    }
    if (null == this.fdtmFinalPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFinalPayment.getTime());
    __dataOut.writeInt(this.fdtmFinalPayment.getNanos());
    }
    if (null == this.fintPaymentExtension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintPaymentExtension);
    }
    if (null == this.fcurPCGBenefitIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPCGBenefitIncome, __dataOut);
    }
    if (null == this.fcurPCGEstIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPCGEstIncome, __dataOut);
    }
    if (null == this.fcurPCGFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPCGFTC, __dataOut);
    }
    if (null == this.fcurPCGBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPCGBSTC, __dataOut);
    }
    if (null == this.flngPCGHours) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPCGHours);
    }
    if (null == this.fdtmPCGStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPCGStart.getTime());
    __dataOut.writeInt(this.fdtmPCGStart.getNanos());
    }
    if (null == this.fdtmPCGStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPCGStop.getTime());
    __dataOut.writeInt(this.fdtmPCGStop.getNanos());
    }
    if (null == this.flngPTRCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPTRCustomerKey);
    }
    if (null == this.fcurPTRBenefitIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRBenefitIncome, __dataOut);
    }
    if (null == this.fcurPTREstIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTREstIncome, __dataOut);
    }
    if (null == this.fcurPTRFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRFTC, __dataOut);
    }
    if (null == this.fcurPTRBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRBSTC, __dataOut);
    }
    if (null == this.flngPTRHours) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPTRHours);
    }
    if (null == this.fdtmPTRStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPTRStart.getTime());
    __dataOut.writeInt(this.fdtmPTRStart.getNanos());
    }
    if (null == this.fdtmPTRStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPTRStop.getTime());
    __dataOut.writeInt(this.fdtmPTRStop.getNanos());
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmEffectiveStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveStart.getTime());
    __dataOut.writeInt(this.fdtmEffectiveStart.getNanos());
    }
    if (null == this.fdtmEffectiveStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveStop.getTime());
    __dataOut.writeInt(this.fdtmEffectiveStop.getNanos());
    }
    if (null == this.fblnMaximumFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMaximumFTC);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngMSDBenefitKey==null?"\\N":"" + flngMSDBenefitKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceivedDate==null?"\\N":"" + fdtmReceivedDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActionCode==null?"\\N":fstrActionCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBenefitCode==null?"\\N":fstrBenefitCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCeaseCode==null?"\\N":fstrCeaseCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBenefitRate==null?"\\N":fcurBenefitRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPaidMSD==null?"\\N":"" + fblnPaidMSD, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFrequency==null?"\\N":fstrFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFinalPayment==null?"\\N":"" + fdtmFinalPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintPaymentExtension==null?"\\N":"" + fintPaymentExtension, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPCGBenefitIncome==null?"\\N":fcurPCGBenefitIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPCGEstIncome==null?"\\N":fcurPCGEstIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPCGFTC==null?"\\N":fcurPCGFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPCGBSTC==null?"\\N":fcurPCGBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPCGHours==null?"\\N":"" + flngPCGHours, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPCGStart==null?"\\N":"" + fdtmPCGStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPCGStop==null?"\\N":"" + fdtmPCGStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPTRCustomerKey==null?"\\N":"" + flngPTRCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRBenefitIncome==null?"\\N":fcurPTRBenefitIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTREstIncome==null?"\\N":fcurPTREstIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRFTC==null?"\\N":fcurPTRFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRBSTC==null?"\\N":fcurPTRBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPTRHours==null?"\\N":"" + flngPTRHours, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPTRStart==null?"\\N":"" + fdtmPTRStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPTRStop==null?"\\N":"" + fdtmPTRStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveStart==null?"\\N":"" + fdtmEffectiveStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveStop==null?"\\N":"" + fdtmEffectiveStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMaximumFTC==null?"\\N":"" + fblnMaximumFTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngMSDBenefitKey==null?"\\N":"" + flngMSDBenefitKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceivedDate==null?"\\N":"" + fdtmReceivedDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActionCode==null?"\\N":fstrActionCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBenefitCode==null?"\\N":fstrBenefitCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCeaseCode==null?"\\N":fstrCeaseCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBenefitRate==null?"\\N":fcurBenefitRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPaidMSD==null?"\\N":"" + fblnPaidMSD, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFrequency==null?"\\N":fstrFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFinalPayment==null?"\\N":"" + fdtmFinalPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintPaymentExtension==null?"\\N":"" + fintPaymentExtension, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPCGBenefitIncome==null?"\\N":fcurPCGBenefitIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPCGEstIncome==null?"\\N":fcurPCGEstIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPCGFTC==null?"\\N":fcurPCGFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPCGBSTC==null?"\\N":fcurPCGBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPCGHours==null?"\\N":"" + flngPCGHours, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPCGStart==null?"\\N":"" + fdtmPCGStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPCGStop==null?"\\N":"" + fdtmPCGStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPTRCustomerKey==null?"\\N":"" + flngPTRCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRBenefitIncome==null?"\\N":fcurPTRBenefitIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTREstIncome==null?"\\N":fcurPTREstIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRFTC==null?"\\N":fcurPTRFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRBSTC==null?"\\N":fcurPTRBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPTRHours==null?"\\N":"" + flngPTRHours, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPTRStart==null?"\\N":"" + fdtmPTRStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPTRStop==null?"\\N":"" + fdtmPTRStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveStart==null?"\\N":"" + fdtmEffectiveStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveStop==null?"\\N":"" + fdtmEffectiveStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMaximumFTC==null?"\\N":"" + fblnMaximumFTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMSDBenefitKey = null; } else {
      this.flngMSDBenefitKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceivedDate = null; } else {
      this.fdtmReceivedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActionCode = null; } else {
      this.fstrActionCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBenefitCode = null; } else {
      this.fstrBenefitCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseCode = null; } else {
      this.fstrCeaseCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBenefitRate = null; } else {
      this.fcurBenefitRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPaidMSD = null; } else {
      this.fblnPaidMSD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFrequency = null; } else {
      this.fstrFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFinalPayment = null; } else {
      this.fdtmFinalPayment = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintPaymentExtension = null; } else {
      this.fintPaymentExtension = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPCGBenefitIncome = null; } else {
      this.fcurPCGBenefitIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPCGEstIncome = null; } else {
      this.fcurPCGEstIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPCGFTC = null; } else {
      this.fcurPCGFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPCGBSTC = null; } else {
      this.fcurPCGBSTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPCGHours = null; } else {
      this.flngPCGHours = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPCGStart = null; } else {
      this.fdtmPCGStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPCGStop = null; } else {
      this.fdtmPCGStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPTRCustomerKey = null; } else {
      this.flngPTRCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRBenefitIncome = null; } else {
      this.fcurPTRBenefitIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTREstIncome = null; } else {
      this.fcurPTREstIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRFTC = null; } else {
      this.fcurPTRFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRBSTC = null; } else {
      this.fcurPTRBSTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPTRHours = null; } else {
      this.flngPTRHours = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPTRStart = null; } else {
      this.fdtmPTRStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPTRStop = null; } else {
      this.fdtmPTRStop = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveStart = null; } else {
      this.fdtmEffectiveStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveStop = null; } else {
      this.fdtmEffectiveStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMaximumFTC = null; } else {
      this.fblnMaximumFTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMSDBenefitKey = null; } else {
      this.flngMSDBenefitKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceivedDate = null; } else {
      this.fdtmReceivedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActionCode = null; } else {
      this.fstrActionCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBenefitCode = null; } else {
      this.fstrBenefitCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseCode = null; } else {
      this.fstrCeaseCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBenefitRate = null; } else {
      this.fcurBenefitRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPaidMSD = null; } else {
      this.fblnPaidMSD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFrequency = null; } else {
      this.fstrFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFinalPayment = null; } else {
      this.fdtmFinalPayment = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintPaymentExtension = null; } else {
      this.fintPaymentExtension = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPCGBenefitIncome = null; } else {
      this.fcurPCGBenefitIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPCGEstIncome = null; } else {
      this.fcurPCGEstIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPCGFTC = null; } else {
      this.fcurPCGFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPCGBSTC = null; } else {
      this.fcurPCGBSTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPCGHours = null; } else {
      this.flngPCGHours = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPCGStart = null; } else {
      this.fdtmPCGStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPCGStop = null; } else {
      this.fdtmPCGStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPTRCustomerKey = null; } else {
      this.flngPTRCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRBenefitIncome = null; } else {
      this.fcurPTRBenefitIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTREstIncome = null; } else {
      this.fcurPTREstIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRFTC = null; } else {
      this.fcurPTRFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRBSTC = null; } else {
      this.fcurPTRBSTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPTRHours = null; } else {
      this.flngPTRHours = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPTRStart = null; } else {
      this.fdtmPTRStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPTRStop = null; } else {
      this.fdtmPTRStop = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveStart = null; } else {
      this.fdtmEffectiveStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveStop = null; } else {
      this.fdtmEffectiveStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMaximumFTC = null; } else {
      this.fblnMaximumFTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_fammsdadministration o = (tblnz_fammsdadministration) super.clone();
    o.fdtmReceivedDate = (o.fdtmReceivedDate != null) ? (java.sql.Timestamp) o.fdtmReceivedDate.clone() : null;
    o.fdtmFinalPayment = (o.fdtmFinalPayment != null) ? (java.sql.Timestamp) o.fdtmFinalPayment.clone() : null;
    o.fdtmPCGStart = (o.fdtmPCGStart != null) ? (java.sql.Timestamp) o.fdtmPCGStart.clone() : null;
    o.fdtmPCGStop = (o.fdtmPCGStop != null) ? (java.sql.Timestamp) o.fdtmPCGStop.clone() : null;
    o.fdtmPTRStart = (o.fdtmPTRStart != null) ? (java.sql.Timestamp) o.fdtmPTRStart.clone() : null;
    o.fdtmPTRStop = (o.fdtmPTRStop != null) ? (java.sql.Timestamp) o.fdtmPTRStop.clone() : null;
    o.fdtmEffectiveStart = (o.fdtmEffectiveStart != null) ? (java.sql.Timestamp) o.fdtmEffectiveStart.clone() : null;
    o.fdtmEffectiveStop = (o.fdtmEffectiveStop != null) ? (java.sql.Timestamp) o.fdtmEffectiveStop.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_fammsdadministration o) throws CloneNotSupportedException {
    o.fdtmReceivedDate = (o.fdtmReceivedDate != null) ? (java.sql.Timestamp) o.fdtmReceivedDate.clone() : null;
    o.fdtmFinalPayment = (o.fdtmFinalPayment != null) ? (java.sql.Timestamp) o.fdtmFinalPayment.clone() : null;
    o.fdtmPCGStart = (o.fdtmPCGStart != null) ? (java.sql.Timestamp) o.fdtmPCGStart.clone() : null;
    o.fdtmPCGStop = (o.fdtmPCGStop != null) ? (java.sql.Timestamp) o.fdtmPCGStop.clone() : null;
    o.fdtmPTRStart = (o.fdtmPTRStart != null) ? (java.sql.Timestamp) o.fdtmPTRStart.clone() : null;
    o.fdtmPTRStop = (o.fdtmPTRStop != null) ? (java.sql.Timestamp) o.fdtmPTRStop.clone() : null;
    o.fdtmEffectiveStart = (o.fdtmEffectiveStart != null) ? (java.sql.Timestamp) o.fdtmEffectiveStart.clone() : null;
    o.fdtmEffectiveStop = (o.fdtmEffectiveStop != null) ? (java.sql.Timestamp) o.fdtmEffectiveStop.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngMSDBenefitKey", this.flngMSDBenefitKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmReceivedDate", this.fdtmReceivedDate);
    __sqoop$field_map.put("fstrActionCode", this.fstrActionCode);
    __sqoop$field_map.put("fstrBenefitCode", this.fstrBenefitCode);
    __sqoop$field_map.put("fstrCeaseCode", this.fstrCeaseCode);
    __sqoop$field_map.put("fcurBenefitRate", this.fcurBenefitRate);
    __sqoop$field_map.put("fblnPaidMSD", this.fblnPaidMSD);
    __sqoop$field_map.put("fstrFrequency", this.fstrFrequency);
    __sqoop$field_map.put("fdtmFinalPayment", this.fdtmFinalPayment);
    __sqoop$field_map.put("fintPaymentExtension", this.fintPaymentExtension);
    __sqoop$field_map.put("fcurPCGBenefitIncome", this.fcurPCGBenefitIncome);
    __sqoop$field_map.put("fcurPCGEstIncome", this.fcurPCGEstIncome);
    __sqoop$field_map.put("fcurPCGFTC", this.fcurPCGFTC);
    __sqoop$field_map.put("fcurPCGBSTC", this.fcurPCGBSTC);
    __sqoop$field_map.put("flngPCGHours", this.flngPCGHours);
    __sqoop$field_map.put("fdtmPCGStart", this.fdtmPCGStart);
    __sqoop$field_map.put("fdtmPCGStop", this.fdtmPCGStop);
    __sqoop$field_map.put("flngPTRCustomerKey", this.flngPTRCustomerKey);
    __sqoop$field_map.put("fcurPTRBenefitIncome", this.fcurPTRBenefitIncome);
    __sqoop$field_map.put("fcurPTREstIncome", this.fcurPTREstIncome);
    __sqoop$field_map.put("fcurPTRFTC", this.fcurPTRFTC);
    __sqoop$field_map.put("fcurPTRBSTC", this.fcurPTRBSTC);
    __sqoop$field_map.put("flngPTRHours", this.flngPTRHours);
    __sqoop$field_map.put("fdtmPTRStart", this.fdtmPTRStart);
    __sqoop$field_map.put("fdtmPTRStop", this.fdtmPTRStop);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmEffectiveStart", this.fdtmEffectiveStart);
    __sqoop$field_map.put("fdtmEffectiveStop", this.fdtmEffectiveStop);
    __sqoop$field_map.put("fblnMaximumFTC", this.fblnMaximumFTC);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngMSDBenefitKey", this.flngMSDBenefitKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmReceivedDate", this.fdtmReceivedDate);
    __sqoop$field_map.put("fstrActionCode", this.fstrActionCode);
    __sqoop$field_map.put("fstrBenefitCode", this.fstrBenefitCode);
    __sqoop$field_map.put("fstrCeaseCode", this.fstrCeaseCode);
    __sqoop$field_map.put("fcurBenefitRate", this.fcurBenefitRate);
    __sqoop$field_map.put("fblnPaidMSD", this.fblnPaidMSD);
    __sqoop$field_map.put("fstrFrequency", this.fstrFrequency);
    __sqoop$field_map.put("fdtmFinalPayment", this.fdtmFinalPayment);
    __sqoop$field_map.put("fintPaymentExtension", this.fintPaymentExtension);
    __sqoop$field_map.put("fcurPCGBenefitIncome", this.fcurPCGBenefitIncome);
    __sqoop$field_map.put("fcurPCGEstIncome", this.fcurPCGEstIncome);
    __sqoop$field_map.put("fcurPCGFTC", this.fcurPCGFTC);
    __sqoop$field_map.put("fcurPCGBSTC", this.fcurPCGBSTC);
    __sqoop$field_map.put("flngPCGHours", this.flngPCGHours);
    __sqoop$field_map.put("fdtmPCGStart", this.fdtmPCGStart);
    __sqoop$field_map.put("fdtmPCGStop", this.fdtmPCGStop);
    __sqoop$field_map.put("flngPTRCustomerKey", this.flngPTRCustomerKey);
    __sqoop$field_map.put("fcurPTRBenefitIncome", this.fcurPTRBenefitIncome);
    __sqoop$field_map.put("fcurPTREstIncome", this.fcurPTREstIncome);
    __sqoop$field_map.put("fcurPTRFTC", this.fcurPTRFTC);
    __sqoop$field_map.put("fcurPTRBSTC", this.fcurPTRBSTC);
    __sqoop$field_map.put("flngPTRHours", this.flngPTRHours);
    __sqoop$field_map.put("fdtmPTRStart", this.fdtmPTRStart);
    __sqoop$field_map.put("fdtmPTRStop", this.fdtmPTRStop);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmEffectiveStart", this.fdtmEffectiveStart);
    __sqoop$field_map.put("fdtmEffectiveStop", this.fdtmEffectiveStop);
    __sqoop$field_map.put("fblnMaximumFTC", this.fblnMaximumFTC);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
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
