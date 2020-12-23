// ORM class for table 'tblnz_rtnnrts'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:48:53 NZDT 2020
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

public class tblnz_rtnnrts extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurGrossDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurGrossDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurGrossInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossRoyalties", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurGrossRoyalties = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurGrossOther = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurGrossTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurNRWTDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurNRWTInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTRoyalties", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurNRWTRoyalties = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurNRWTOther = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurNRWTTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFDPCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurFDPCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurNRWTPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTBCM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurNRWTBCM = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurManualNRWTPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurManualNRWTPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurNRWTPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTFinal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurNRWTFinal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurUnreconciledAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fcurUnreconciledAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngCertificateNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.flngCertificateNumber = (Integer)value;
      }
    });
    setters.put("flngCertFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.flngCertFiled = (Integer)value;
      }
    });
    setters.put("fblnElectronicFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fblnElectronicFiled = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrts.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnnrts() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnnrts with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurGrossDividends;
  public java.math.BigDecimal get_fcurGrossDividends() {
    return fcurGrossDividends;
  }
  public void set_fcurGrossDividends(java.math.BigDecimal fcurGrossDividends) {
    this.fcurGrossDividends = fcurGrossDividends;
  }
  public tblnz_rtnnrts with_fcurGrossDividends(java.math.BigDecimal fcurGrossDividends) {
    this.fcurGrossDividends = fcurGrossDividends;
    return this;
  }
  private java.math.BigDecimal fcurGrossInterest;
  public java.math.BigDecimal get_fcurGrossInterest() {
    return fcurGrossInterest;
  }
  public void set_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
    this.fcurGrossInterest = fcurGrossInterest;
  }
  public tblnz_rtnnrts with_fcurGrossInterest(java.math.BigDecimal fcurGrossInterest) {
    this.fcurGrossInterest = fcurGrossInterest;
    return this;
  }
  private java.math.BigDecimal fcurGrossRoyalties;
  public java.math.BigDecimal get_fcurGrossRoyalties() {
    return fcurGrossRoyalties;
  }
  public void set_fcurGrossRoyalties(java.math.BigDecimal fcurGrossRoyalties) {
    this.fcurGrossRoyalties = fcurGrossRoyalties;
  }
  public tblnz_rtnnrts with_fcurGrossRoyalties(java.math.BigDecimal fcurGrossRoyalties) {
    this.fcurGrossRoyalties = fcurGrossRoyalties;
    return this;
  }
  private java.math.BigDecimal fcurGrossOther;
  public java.math.BigDecimal get_fcurGrossOther() {
    return fcurGrossOther;
  }
  public void set_fcurGrossOther(java.math.BigDecimal fcurGrossOther) {
    this.fcurGrossOther = fcurGrossOther;
  }
  public tblnz_rtnnrts with_fcurGrossOther(java.math.BigDecimal fcurGrossOther) {
    this.fcurGrossOther = fcurGrossOther;
    return this;
  }
  private java.math.BigDecimal fcurGrossTotal;
  public java.math.BigDecimal get_fcurGrossTotal() {
    return fcurGrossTotal;
  }
  public void set_fcurGrossTotal(java.math.BigDecimal fcurGrossTotal) {
    this.fcurGrossTotal = fcurGrossTotal;
  }
  public tblnz_rtnnrts with_fcurGrossTotal(java.math.BigDecimal fcurGrossTotal) {
    this.fcurGrossTotal = fcurGrossTotal;
    return this;
  }
  private java.math.BigDecimal fcurNRWTDividends;
  public java.math.BigDecimal get_fcurNRWTDividends() {
    return fcurNRWTDividends;
  }
  public void set_fcurNRWTDividends(java.math.BigDecimal fcurNRWTDividends) {
    this.fcurNRWTDividends = fcurNRWTDividends;
  }
  public tblnz_rtnnrts with_fcurNRWTDividends(java.math.BigDecimal fcurNRWTDividends) {
    this.fcurNRWTDividends = fcurNRWTDividends;
    return this;
  }
  private java.math.BigDecimal fcurNRWTInterest;
  public java.math.BigDecimal get_fcurNRWTInterest() {
    return fcurNRWTInterest;
  }
  public void set_fcurNRWTInterest(java.math.BigDecimal fcurNRWTInterest) {
    this.fcurNRWTInterest = fcurNRWTInterest;
  }
  public tblnz_rtnnrts with_fcurNRWTInterest(java.math.BigDecimal fcurNRWTInterest) {
    this.fcurNRWTInterest = fcurNRWTInterest;
    return this;
  }
  private java.math.BigDecimal fcurNRWTRoyalties;
  public java.math.BigDecimal get_fcurNRWTRoyalties() {
    return fcurNRWTRoyalties;
  }
  public void set_fcurNRWTRoyalties(java.math.BigDecimal fcurNRWTRoyalties) {
    this.fcurNRWTRoyalties = fcurNRWTRoyalties;
  }
  public tblnz_rtnnrts with_fcurNRWTRoyalties(java.math.BigDecimal fcurNRWTRoyalties) {
    this.fcurNRWTRoyalties = fcurNRWTRoyalties;
    return this;
  }
  private java.math.BigDecimal fcurNRWTOther;
  public java.math.BigDecimal get_fcurNRWTOther() {
    return fcurNRWTOther;
  }
  public void set_fcurNRWTOther(java.math.BigDecimal fcurNRWTOther) {
    this.fcurNRWTOther = fcurNRWTOther;
  }
  public tblnz_rtnnrts with_fcurNRWTOther(java.math.BigDecimal fcurNRWTOther) {
    this.fcurNRWTOther = fcurNRWTOther;
    return this;
  }
  private java.math.BigDecimal fcurNRWTTotal;
  public java.math.BigDecimal get_fcurNRWTTotal() {
    return fcurNRWTTotal;
  }
  public void set_fcurNRWTTotal(java.math.BigDecimal fcurNRWTTotal) {
    this.fcurNRWTTotal = fcurNRWTTotal;
  }
  public tblnz_rtnnrts with_fcurNRWTTotal(java.math.BigDecimal fcurNRWTTotal) {
    this.fcurNRWTTotal = fcurNRWTTotal;
    return this;
  }
  private java.math.BigDecimal fcurFDPCredits;
  public java.math.BigDecimal get_fcurFDPCredits() {
    return fcurFDPCredits;
  }
  public void set_fcurFDPCredits(java.math.BigDecimal fcurFDPCredits) {
    this.fcurFDPCredits = fcurFDPCredits;
  }
  public tblnz_rtnnrts with_fcurFDPCredits(java.math.BigDecimal fcurFDPCredits) {
    this.fcurFDPCredits = fcurFDPCredits;
    return this;
  }
  private java.math.BigDecimal fcurNRWTPayable;
  public java.math.BigDecimal get_fcurNRWTPayable() {
    return fcurNRWTPayable;
  }
  public void set_fcurNRWTPayable(java.math.BigDecimal fcurNRWTPayable) {
    this.fcurNRWTPayable = fcurNRWTPayable;
  }
  public tblnz_rtnnrts with_fcurNRWTPayable(java.math.BigDecimal fcurNRWTPayable) {
    this.fcurNRWTPayable = fcurNRWTPayable;
    return this;
  }
  private java.math.BigDecimal fcurNRWTBCM;
  public java.math.BigDecimal get_fcurNRWTBCM() {
    return fcurNRWTBCM;
  }
  public void set_fcurNRWTBCM(java.math.BigDecimal fcurNRWTBCM) {
    this.fcurNRWTBCM = fcurNRWTBCM;
  }
  public tblnz_rtnnrts with_fcurNRWTBCM(java.math.BigDecimal fcurNRWTBCM) {
    this.fcurNRWTBCM = fcurNRWTBCM;
    return this;
  }
  private java.math.BigDecimal fcurManualNRWTPaid;
  public java.math.BigDecimal get_fcurManualNRWTPaid() {
    return fcurManualNRWTPaid;
  }
  public void set_fcurManualNRWTPaid(java.math.BigDecimal fcurManualNRWTPaid) {
    this.fcurManualNRWTPaid = fcurManualNRWTPaid;
  }
  public tblnz_rtnnrts with_fcurManualNRWTPaid(java.math.BigDecimal fcurManualNRWTPaid) {
    this.fcurManualNRWTPaid = fcurManualNRWTPaid;
    return this;
  }
  private java.math.BigDecimal fcurNRWTPaid;
  public java.math.BigDecimal get_fcurNRWTPaid() {
    return fcurNRWTPaid;
  }
  public void set_fcurNRWTPaid(java.math.BigDecimal fcurNRWTPaid) {
    this.fcurNRWTPaid = fcurNRWTPaid;
  }
  public tblnz_rtnnrts with_fcurNRWTPaid(java.math.BigDecimal fcurNRWTPaid) {
    this.fcurNRWTPaid = fcurNRWTPaid;
    return this;
  }
  private java.math.BigDecimal fcurNRWTFinal;
  public java.math.BigDecimal get_fcurNRWTFinal() {
    return fcurNRWTFinal;
  }
  public void set_fcurNRWTFinal(java.math.BigDecimal fcurNRWTFinal) {
    this.fcurNRWTFinal = fcurNRWTFinal;
  }
  public tblnz_rtnnrts with_fcurNRWTFinal(java.math.BigDecimal fcurNRWTFinal) {
    this.fcurNRWTFinal = fcurNRWTFinal;
    return this;
  }
  private java.math.BigDecimal fcurUnreconciledAmount;
  public java.math.BigDecimal get_fcurUnreconciledAmount() {
    return fcurUnreconciledAmount;
  }
  public void set_fcurUnreconciledAmount(java.math.BigDecimal fcurUnreconciledAmount) {
    this.fcurUnreconciledAmount = fcurUnreconciledAmount;
  }
  public tblnz_rtnnrts with_fcurUnreconciledAmount(java.math.BigDecimal fcurUnreconciledAmount) {
    this.fcurUnreconciledAmount = fcurUnreconciledAmount;
    return this;
  }
  private Integer flngCertificateNumber;
  public Integer get_flngCertificateNumber() {
    return flngCertificateNumber;
  }
  public void set_flngCertificateNumber(Integer flngCertificateNumber) {
    this.flngCertificateNumber = flngCertificateNumber;
  }
  public tblnz_rtnnrts with_flngCertificateNumber(Integer flngCertificateNumber) {
    this.flngCertificateNumber = flngCertificateNumber;
    return this;
  }
  private Integer flngCertFiled;
  public Integer get_flngCertFiled() {
    return flngCertFiled;
  }
  public void set_flngCertFiled(Integer flngCertFiled) {
    this.flngCertFiled = flngCertFiled;
  }
  public tblnz_rtnnrts with_flngCertFiled(Integer flngCertFiled) {
    this.flngCertFiled = flngCertFiled;
    return this;
  }
  private Integer fblnElectronicFiled;
  public Integer get_fblnElectronicFiled() {
    return fblnElectronicFiled;
  }
  public void set_fblnElectronicFiled(Integer fblnElectronicFiled) {
    this.fblnElectronicFiled = fblnElectronicFiled;
  }
  public tblnz_rtnnrts with_fblnElectronicFiled(Integer fblnElectronicFiled) {
    this.fblnElectronicFiled = fblnElectronicFiled;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnnrts with_fstrWho(String fstrWho) {
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
  public tblnz_rtnnrts with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnrts)) {
      return false;
    }
    tblnz_rtnnrts that = (tblnz_rtnnrts) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurGrossDividends == null ? that.fcurGrossDividends == null : this.fcurGrossDividends.equals(that.fcurGrossDividends));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurGrossRoyalties == null ? that.fcurGrossRoyalties == null : this.fcurGrossRoyalties.equals(that.fcurGrossRoyalties));
    equal = equal && (this.fcurGrossOther == null ? that.fcurGrossOther == null : this.fcurGrossOther.equals(that.fcurGrossOther));
    equal = equal && (this.fcurGrossTotal == null ? that.fcurGrossTotal == null : this.fcurGrossTotal.equals(that.fcurGrossTotal));
    equal = equal && (this.fcurNRWTDividends == null ? that.fcurNRWTDividends == null : this.fcurNRWTDividends.equals(that.fcurNRWTDividends));
    equal = equal && (this.fcurNRWTInterest == null ? that.fcurNRWTInterest == null : this.fcurNRWTInterest.equals(that.fcurNRWTInterest));
    equal = equal && (this.fcurNRWTRoyalties == null ? that.fcurNRWTRoyalties == null : this.fcurNRWTRoyalties.equals(that.fcurNRWTRoyalties));
    equal = equal && (this.fcurNRWTOther == null ? that.fcurNRWTOther == null : this.fcurNRWTOther.equals(that.fcurNRWTOther));
    equal = equal && (this.fcurNRWTTotal == null ? that.fcurNRWTTotal == null : this.fcurNRWTTotal.equals(that.fcurNRWTTotal));
    equal = equal && (this.fcurFDPCredits == null ? that.fcurFDPCredits == null : this.fcurFDPCredits.equals(that.fcurFDPCredits));
    equal = equal && (this.fcurNRWTPayable == null ? that.fcurNRWTPayable == null : this.fcurNRWTPayable.equals(that.fcurNRWTPayable));
    equal = equal && (this.fcurNRWTBCM == null ? that.fcurNRWTBCM == null : this.fcurNRWTBCM.equals(that.fcurNRWTBCM));
    equal = equal && (this.fcurManualNRWTPaid == null ? that.fcurManualNRWTPaid == null : this.fcurManualNRWTPaid.equals(that.fcurManualNRWTPaid));
    equal = equal && (this.fcurNRWTPaid == null ? that.fcurNRWTPaid == null : this.fcurNRWTPaid.equals(that.fcurNRWTPaid));
    equal = equal && (this.fcurNRWTFinal == null ? that.fcurNRWTFinal == null : this.fcurNRWTFinal.equals(that.fcurNRWTFinal));
    equal = equal && (this.fcurUnreconciledAmount == null ? that.fcurUnreconciledAmount == null : this.fcurUnreconciledAmount.equals(that.fcurUnreconciledAmount));
    equal = equal && (this.flngCertificateNumber == null ? that.flngCertificateNumber == null : this.flngCertificateNumber.equals(that.flngCertificateNumber));
    equal = equal && (this.flngCertFiled == null ? that.flngCertFiled == null : this.flngCertFiled.equals(that.flngCertFiled));
    equal = equal && (this.fblnElectronicFiled == null ? that.fblnElectronicFiled == null : this.fblnElectronicFiled.equals(that.fblnElectronicFiled));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnrts)) {
      return false;
    }
    tblnz_rtnnrts that = (tblnz_rtnnrts) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurGrossDividends == null ? that.fcurGrossDividends == null : this.fcurGrossDividends.equals(that.fcurGrossDividends));
    equal = equal && (this.fcurGrossInterest == null ? that.fcurGrossInterest == null : this.fcurGrossInterest.equals(that.fcurGrossInterest));
    equal = equal && (this.fcurGrossRoyalties == null ? that.fcurGrossRoyalties == null : this.fcurGrossRoyalties.equals(that.fcurGrossRoyalties));
    equal = equal && (this.fcurGrossOther == null ? that.fcurGrossOther == null : this.fcurGrossOther.equals(that.fcurGrossOther));
    equal = equal && (this.fcurGrossTotal == null ? that.fcurGrossTotal == null : this.fcurGrossTotal.equals(that.fcurGrossTotal));
    equal = equal && (this.fcurNRWTDividends == null ? that.fcurNRWTDividends == null : this.fcurNRWTDividends.equals(that.fcurNRWTDividends));
    equal = equal && (this.fcurNRWTInterest == null ? that.fcurNRWTInterest == null : this.fcurNRWTInterest.equals(that.fcurNRWTInterest));
    equal = equal && (this.fcurNRWTRoyalties == null ? that.fcurNRWTRoyalties == null : this.fcurNRWTRoyalties.equals(that.fcurNRWTRoyalties));
    equal = equal && (this.fcurNRWTOther == null ? that.fcurNRWTOther == null : this.fcurNRWTOther.equals(that.fcurNRWTOther));
    equal = equal && (this.fcurNRWTTotal == null ? that.fcurNRWTTotal == null : this.fcurNRWTTotal.equals(that.fcurNRWTTotal));
    equal = equal && (this.fcurFDPCredits == null ? that.fcurFDPCredits == null : this.fcurFDPCredits.equals(that.fcurFDPCredits));
    equal = equal && (this.fcurNRWTPayable == null ? that.fcurNRWTPayable == null : this.fcurNRWTPayable.equals(that.fcurNRWTPayable));
    equal = equal && (this.fcurNRWTBCM == null ? that.fcurNRWTBCM == null : this.fcurNRWTBCM.equals(that.fcurNRWTBCM));
    equal = equal && (this.fcurManualNRWTPaid == null ? that.fcurManualNRWTPaid == null : this.fcurManualNRWTPaid.equals(that.fcurManualNRWTPaid));
    equal = equal && (this.fcurNRWTPaid == null ? that.fcurNRWTPaid == null : this.fcurNRWTPaid.equals(that.fcurNRWTPaid));
    equal = equal && (this.fcurNRWTFinal == null ? that.fcurNRWTFinal == null : this.fcurNRWTFinal.equals(that.fcurNRWTFinal));
    equal = equal && (this.fcurUnreconciledAmount == null ? that.fcurUnreconciledAmount == null : this.fcurUnreconciledAmount.equals(that.fcurUnreconciledAmount));
    equal = equal && (this.flngCertificateNumber == null ? that.flngCertificateNumber == null : this.flngCertificateNumber.equals(that.flngCertificateNumber));
    equal = equal && (this.flngCertFiled == null ? that.flngCertFiled == null : this.flngCertFiled.equals(that.flngCertFiled));
    equal = equal && (this.fblnElectronicFiled == null ? that.fblnElectronicFiled == null : this.fblnElectronicFiled.equals(that.fblnElectronicFiled));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurGrossDividends = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurGrossRoyalties = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurGrossOther = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurGrossTotal = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurNRWTDividends = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurNRWTInterest = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurNRWTRoyalties = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurNRWTOther = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurNRWTTotal = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurFDPCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurNRWTPayable = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurNRWTBCM = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurManualNRWTPaid = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurNRWTPaid = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurNRWTFinal = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurUnreconciledAmount = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.flngCertificateNumber = JdbcWritableBridge.readInteger(19, __dbResults);
    this.flngCertFiled = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnElectronicFiled = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurGrossDividends = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurGrossInterest = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurGrossRoyalties = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurGrossOther = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurGrossTotal = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurNRWTDividends = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurNRWTInterest = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurNRWTRoyalties = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurNRWTOther = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurNRWTTotal = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurFDPCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurNRWTPayable = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurNRWTBCM = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurManualNRWTPaid = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurNRWTPaid = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurNRWTFinal = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurUnreconciledAmount = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.flngCertificateNumber = JdbcWritableBridge.readInteger(19, __dbResults);
    this.flngCertFiled = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnElectronicFiled = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurGrossDividends, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossRoyalties, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossOther, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossTotal, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTDividends, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTInterest, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTRoyalties, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTOther, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTTotal, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFDPCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTPayable, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTBCM, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurManualNRWTPaid, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTPaid, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTFinal, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnreconciledAmount, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertificateNumber, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertFiled, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronicFiled, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDividends, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossInterest, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossRoyalties, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossOther, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossTotal, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTDividends, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTInterest, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTRoyalties, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTOther, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTTotal, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFDPCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTPayable, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTBCM, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurManualNRWTPaid, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTPaid, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTFinal, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnreconciledAmount, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertificateNumber, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertFiled, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronicFiled, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
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
        this.fcurGrossDividends = null;
    } else {
    this.fcurGrossDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossInterest = null;
    } else {
    this.fcurGrossInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossRoyalties = null;
    } else {
    this.fcurGrossRoyalties = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossOther = null;
    } else {
    this.fcurGrossOther = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossTotal = null;
    } else {
    this.fcurGrossTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTDividends = null;
    } else {
    this.fcurNRWTDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTInterest = null;
    } else {
    this.fcurNRWTInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTRoyalties = null;
    } else {
    this.fcurNRWTRoyalties = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTOther = null;
    } else {
    this.fcurNRWTOther = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTTotal = null;
    } else {
    this.fcurNRWTTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFDPCredits = null;
    } else {
    this.fcurFDPCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTPayable = null;
    } else {
    this.fcurNRWTPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTBCM = null;
    } else {
    this.fcurNRWTBCM = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurManualNRWTPaid = null;
    } else {
    this.fcurManualNRWTPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTPaid = null;
    } else {
    this.fcurNRWTPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTFinal = null;
    } else {
    this.fcurNRWTFinal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurUnreconciledAmount = null;
    } else {
    this.fcurUnreconciledAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCertificateNumber = null;
    } else {
    this.flngCertificateNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCertFiled = null;
    } else {
    this.flngCertFiled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnElectronicFiled = null;
    } else {
    this.fblnElectronicFiled = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fcurGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDividends, __dataOut);
    }
    if (null == this.fcurGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossInterest, __dataOut);
    }
    if (null == this.fcurGrossRoyalties) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossRoyalties, __dataOut);
    }
    if (null == this.fcurGrossOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossOther, __dataOut);
    }
    if (null == this.fcurGrossTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossTotal, __dataOut);
    }
    if (null == this.fcurNRWTDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTDividends, __dataOut);
    }
    if (null == this.fcurNRWTInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTInterest, __dataOut);
    }
    if (null == this.fcurNRWTRoyalties) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTRoyalties, __dataOut);
    }
    if (null == this.fcurNRWTOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTOther, __dataOut);
    }
    if (null == this.fcurNRWTTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTTotal, __dataOut);
    }
    if (null == this.fcurFDPCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFDPCredits, __dataOut);
    }
    if (null == this.fcurNRWTPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTPayable, __dataOut);
    }
    if (null == this.fcurNRWTBCM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTBCM, __dataOut);
    }
    if (null == this.fcurManualNRWTPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurManualNRWTPaid, __dataOut);
    }
    if (null == this.fcurNRWTPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTPaid, __dataOut);
    }
    if (null == this.fcurNRWTFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTFinal, __dataOut);
    }
    if (null == this.fcurUnreconciledAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnreconciledAmount, __dataOut);
    }
    if (null == this.flngCertificateNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertificateNumber);
    }
    if (null == this.flngCertFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertFiled);
    }
    if (null == this.fblnElectronicFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnElectronicFiled);
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
    if (null == this.fcurGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDividends, __dataOut);
    }
    if (null == this.fcurGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossInterest, __dataOut);
    }
    if (null == this.fcurGrossRoyalties) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossRoyalties, __dataOut);
    }
    if (null == this.fcurGrossOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossOther, __dataOut);
    }
    if (null == this.fcurGrossTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossTotal, __dataOut);
    }
    if (null == this.fcurNRWTDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTDividends, __dataOut);
    }
    if (null == this.fcurNRWTInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTInterest, __dataOut);
    }
    if (null == this.fcurNRWTRoyalties) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTRoyalties, __dataOut);
    }
    if (null == this.fcurNRWTOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTOther, __dataOut);
    }
    if (null == this.fcurNRWTTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTTotal, __dataOut);
    }
    if (null == this.fcurFDPCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFDPCredits, __dataOut);
    }
    if (null == this.fcurNRWTPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTPayable, __dataOut);
    }
    if (null == this.fcurNRWTBCM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTBCM, __dataOut);
    }
    if (null == this.fcurManualNRWTPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurManualNRWTPaid, __dataOut);
    }
    if (null == this.fcurNRWTPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTPaid, __dataOut);
    }
    if (null == this.fcurNRWTFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTFinal, __dataOut);
    }
    if (null == this.fcurUnreconciledAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnreconciledAmount, __dataOut);
    }
    if (null == this.flngCertificateNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertificateNumber);
    }
    if (null == this.flngCertFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertFiled);
    }
    if (null == this.fblnElectronicFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnElectronicFiled);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDividends==null?"\\N":fcurGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossInterest==null?"\\N":fcurGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossRoyalties==null?"\\N":fcurGrossRoyalties.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossOther==null?"\\N":fcurGrossOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossTotal==null?"\\N":fcurGrossTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTDividends==null?"\\N":fcurNRWTDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTInterest==null?"\\N":fcurNRWTInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTRoyalties==null?"\\N":fcurNRWTRoyalties.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTOther==null?"\\N":fcurNRWTOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTTotal==null?"\\N":fcurNRWTTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFDPCredits==null?"\\N":fcurFDPCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTPayable==null?"\\N":fcurNRWTPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTBCM==null?"\\N":fcurNRWTBCM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurManualNRWTPaid==null?"\\N":fcurManualNRWTPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTPaid==null?"\\N":fcurNRWTPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTFinal==null?"\\N":fcurNRWTFinal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnreconciledAmount==null?"\\N":fcurUnreconciledAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertificateNumber==null?"\\N":"" + flngCertificateNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertFiled==null?"\\N":"" + flngCertFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnElectronicFiled==null?"\\N":"" + fblnElectronicFiled, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDividends==null?"\\N":fcurGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossInterest==null?"\\N":fcurGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossRoyalties==null?"\\N":fcurGrossRoyalties.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossOther==null?"\\N":fcurGrossOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossTotal==null?"\\N":fcurGrossTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTDividends==null?"\\N":fcurNRWTDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTInterest==null?"\\N":fcurNRWTInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTRoyalties==null?"\\N":fcurNRWTRoyalties.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTOther==null?"\\N":fcurNRWTOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTTotal==null?"\\N":fcurNRWTTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFDPCredits==null?"\\N":fcurFDPCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTPayable==null?"\\N":fcurNRWTPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTBCM==null?"\\N":fcurNRWTBCM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurManualNRWTPaid==null?"\\N":fcurManualNRWTPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTPaid==null?"\\N":fcurNRWTPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTFinal==null?"\\N":fcurNRWTFinal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnreconciledAmount==null?"\\N":fcurUnreconciledAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertificateNumber==null?"\\N":"" + flngCertificateNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertFiled==null?"\\N":"" + flngCertFiled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnElectronicFiled==null?"\\N":"" + fblnElectronicFiled, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDividends = null; } else {
      this.fcurGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossInterest = null; } else {
      this.fcurGrossInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossRoyalties = null; } else {
      this.fcurGrossRoyalties = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossOther = null; } else {
      this.fcurGrossOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossTotal = null; } else {
      this.fcurGrossTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTDividends = null; } else {
      this.fcurNRWTDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTInterest = null; } else {
      this.fcurNRWTInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTRoyalties = null; } else {
      this.fcurNRWTRoyalties = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTOther = null; } else {
      this.fcurNRWTOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTTotal = null; } else {
      this.fcurNRWTTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFDPCredits = null; } else {
      this.fcurFDPCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTPayable = null; } else {
      this.fcurNRWTPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTBCM = null; } else {
      this.fcurNRWTBCM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurManualNRWTPaid = null; } else {
      this.fcurManualNRWTPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTPaid = null; } else {
      this.fcurNRWTPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTFinal = null; } else {
      this.fcurNRWTFinal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnreconciledAmount = null; } else {
      this.fcurUnreconciledAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertificateNumber = null; } else {
      this.flngCertificateNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertFiled = null; } else {
      this.flngCertFiled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnElectronicFiled = null; } else {
      this.fblnElectronicFiled = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDividends = null; } else {
      this.fcurGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossInterest = null; } else {
      this.fcurGrossInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossRoyalties = null; } else {
      this.fcurGrossRoyalties = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossOther = null; } else {
      this.fcurGrossOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossTotal = null; } else {
      this.fcurGrossTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTDividends = null; } else {
      this.fcurNRWTDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTInterest = null; } else {
      this.fcurNRWTInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTRoyalties = null; } else {
      this.fcurNRWTRoyalties = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTOther = null; } else {
      this.fcurNRWTOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTTotal = null; } else {
      this.fcurNRWTTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFDPCredits = null; } else {
      this.fcurFDPCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTPayable = null; } else {
      this.fcurNRWTPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTBCM = null; } else {
      this.fcurNRWTBCM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurManualNRWTPaid = null; } else {
      this.fcurManualNRWTPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTPaid = null; } else {
      this.fcurNRWTPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTFinal = null; } else {
      this.fcurNRWTFinal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnreconciledAmount = null; } else {
      this.fcurUnreconciledAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertificateNumber = null; } else {
      this.flngCertificateNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertFiled = null; } else {
      this.flngCertFiled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnElectronicFiled = null; } else {
      this.fblnElectronicFiled = Integer.valueOf(__cur_str);
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
    tblnz_rtnnrts o = (tblnz_rtnnrts) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnrts o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurGrossDividends", this.fcurGrossDividends);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurGrossRoyalties", this.fcurGrossRoyalties);
    __sqoop$field_map.put("fcurGrossOther", this.fcurGrossOther);
    __sqoop$field_map.put("fcurGrossTotal", this.fcurGrossTotal);
    __sqoop$field_map.put("fcurNRWTDividends", this.fcurNRWTDividends);
    __sqoop$field_map.put("fcurNRWTInterest", this.fcurNRWTInterest);
    __sqoop$field_map.put("fcurNRWTRoyalties", this.fcurNRWTRoyalties);
    __sqoop$field_map.put("fcurNRWTOther", this.fcurNRWTOther);
    __sqoop$field_map.put("fcurNRWTTotal", this.fcurNRWTTotal);
    __sqoop$field_map.put("fcurFDPCredits", this.fcurFDPCredits);
    __sqoop$field_map.put("fcurNRWTPayable", this.fcurNRWTPayable);
    __sqoop$field_map.put("fcurNRWTBCM", this.fcurNRWTBCM);
    __sqoop$field_map.put("fcurManualNRWTPaid", this.fcurManualNRWTPaid);
    __sqoop$field_map.put("fcurNRWTPaid", this.fcurNRWTPaid);
    __sqoop$field_map.put("fcurNRWTFinal", this.fcurNRWTFinal);
    __sqoop$field_map.put("fcurUnreconciledAmount", this.fcurUnreconciledAmount);
    __sqoop$field_map.put("flngCertificateNumber", this.flngCertificateNumber);
    __sqoop$field_map.put("flngCertFiled", this.flngCertFiled);
    __sqoop$field_map.put("fblnElectronicFiled", this.fblnElectronicFiled);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurGrossDividends", this.fcurGrossDividends);
    __sqoop$field_map.put("fcurGrossInterest", this.fcurGrossInterest);
    __sqoop$field_map.put("fcurGrossRoyalties", this.fcurGrossRoyalties);
    __sqoop$field_map.put("fcurGrossOther", this.fcurGrossOther);
    __sqoop$field_map.put("fcurGrossTotal", this.fcurGrossTotal);
    __sqoop$field_map.put("fcurNRWTDividends", this.fcurNRWTDividends);
    __sqoop$field_map.put("fcurNRWTInterest", this.fcurNRWTInterest);
    __sqoop$field_map.put("fcurNRWTRoyalties", this.fcurNRWTRoyalties);
    __sqoop$field_map.put("fcurNRWTOther", this.fcurNRWTOther);
    __sqoop$field_map.put("fcurNRWTTotal", this.fcurNRWTTotal);
    __sqoop$field_map.put("fcurFDPCredits", this.fcurFDPCredits);
    __sqoop$field_map.put("fcurNRWTPayable", this.fcurNRWTPayable);
    __sqoop$field_map.put("fcurNRWTBCM", this.fcurNRWTBCM);
    __sqoop$field_map.put("fcurManualNRWTPaid", this.fcurManualNRWTPaid);
    __sqoop$field_map.put("fcurNRWTPaid", this.fcurNRWTPaid);
    __sqoop$field_map.put("fcurNRWTFinal", this.fcurNRWTFinal);
    __sqoop$field_map.put("fcurUnreconciledAmount", this.fcurUnreconciledAmount);
    __sqoop$field_map.put("flngCertificateNumber", this.flngCertificateNumber);
    __sqoop$field_map.put("flngCertFiled", this.flngCertFiled);
    __sqoop$field_map.put("fblnElectronicFiled", this.fblnElectronicFiled);
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
