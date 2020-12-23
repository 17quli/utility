// ORM class for table 'tblnz_rtnipss'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:39:37 NZDT 2020
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

public class tblnz_rtnipss extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurInterestRWTDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurInterestRWTDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestNoRWTDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurInterestNoRWTDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurInterestTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTCertificates", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurRWTCertificates = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTBCM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurRWTBCM = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTNoCertificates", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurRWTNoCertificates = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTTotalPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurRWTTotalPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurManualRWTPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurManualRWTPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTIR15P", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurRWTIR15P = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTAlreadyDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurRWTAlreadyDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTTotalPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurRWTTotalPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTFinal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fcurRWTFinal = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngCertificatesAttached", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.flngCertificatesAttached = (Integer)value;
      }
    });
    setters.put("flngCertFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.flngCertFiled = (Integer)value;
      }
    });
    setters.put("fblnElectronicFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fblnElectronicFiled = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipss.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnipss() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnipss with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurInterestRWTDeducted;
  public java.math.BigDecimal get_fcurInterestRWTDeducted() {
    return fcurInterestRWTDeducted;
  }
  public void set_fcurInterestRWTDeducted(java.math.BigDecimal fcurInterestRWTDeducted) {
    this.fcurInterestRWTDeducted = fcurInterestRWTDeducted;
  }
  public tblnz_rtnipss with_fcurInterestRWTDeducted(java.math.BigDecimal fcurInterestRWTDeducted) {
    this.fcurInterestRWTDeducted = fcurInterestRWTDeducted;
    return this;
  }
  private java.math.BigDecimal fcurInterestNoRWTDeducted;
  public java.math.BigDecimal get_fcurInterestNoRWTDeducted() {
    return fcurInterestNoRWTDeducted;
  }
  public void set_fcurInterestNoRWTDeducted(java.math.BigDecimal fcurInterestNoRWTDeducted) {
    this.fcurInterestNoRWTDeducted = fcurInterestNoRWTDeducted;
  }
  public tblnz_rtnipss with_fcurInterestNoRWTDeducted(java.math.BigDecimal fcurInterestNoRWTDeducted) {
    this.fcurInterestNoRWTDeducted = fcurInterestNoRWTDeducted;
    return this;
  }
  private java.math.BigDecimal fcurInterestTotal;
  public java.math.BigDecimal get_fcurInterestTotal() {
    return fcurInterestTotal;
  }
  public void set_fcurInterestTotal(java.math.BigDecimal fcurInterestTotal) {
    this.fcurInterestTotal = fcurInterestTotal;
  }
  public tblnz_rtnipss with_fcurInterestTotal(java.math.BigDecimal fcurInterestTotal) {
    this.fcurInterestTotal = fcurInterestTotal;
    return this;
  }
  private java.math.BigDecimal fcurRWTCertificates;
  public java.math.BigDecimal get_fcurRWTCertificates() {
    return fcurRWTCertificates;
  }
  public void set_fcurRWTCertificates(java.math.BigDecimal fcurRWTCertificates) {
    this.fcurRWTCertificates = fcurRWTCertificates;
  }
  public tblnz_rtnipss with_fcurRWTCertificates(java.math.BigDecimal fcurRWTCertificates) {
    this.fcurRWTCertificates = fcurRWTCertificates;
    return this;
  }
  private java.math.BigDecimal fcurRWTBCM;
  public java.math.BigDecimal get_fcurRWTBCM() {
    return fcurRWTBCM;
  }
  public void set_fcurRWTBCM(java.math.BigDecimal fcurRWTBCM) {
    this.fcurRWTBCM = fcurRWTBCM;
  }
  public tblnz_rtnipss with_fcurRWTBCM(java.math.BigDecimal fcurRWTBCM) {
    this.fcurRWTBCM = fcurRWTBCM;
    return this;
  }
  private java.math.BigDecimal fcurRWTNoCertificates;
  public java.math.BigDecimal get_fcurRWTNoCertificates() {
    return fcurRWTNoCertificates;
  }
  public void set_fcurRWTNoCertificates(java.math.BigDecimal fcurRWTNoCertificates) {
    this.fcurRWTNoCertificates = fcurRWTNoCertificates;
  }
  public tblnz_rtnipss with_fcurRWTNoCertificates(java.math.BigDecimal fcurRWTNoCertificates) {
    this.fcurRWTNoCertificates = fcurRWTNoCertificates;
    return this;
  }
  private java.math.BigDecimal fcurRWTTotalPayable;
  public java.math.BigDecimal get_fcurRWTTotalPayable() {
    return fcurRWTTotalPayable;
  }
  public void set_fcurRWTTotalPayable(java.math.BigDecimal fcurRWTTotalPayable) {
    this.fcurRWTTotalPayable = fcurRWTTotalPayable;
  }
  public tblnz_rtnipss with_fcurRWTTotalPayable(java.math.BigDecimal fcurRWTTotalPayable) {
    this.fcurRWTTotalPayable = fcurRWTTotalPayable;
    return this;
  }
  private java.math.BigDecimal fcurManualRWTPaid;
  public java.math.BigDecimal get_fcurManualRWTPaid() {
    return fcurManualRWTPaid;
  }
  public void set_fcurManualRWTPaid(java.math.BigDecimal fcurManualRWTPaid) {
    this.fcurManualRWTPaid = fcurManualRWTPaid;
  }
  public tblnz_rtnipss with_fcurManualRWTPaid(java.math.BigDecimal fcurManualRWTPaid) {
    this.fcurManualRWTPaid = fcurManualRWTPaid;
    return this;
  }
  private java.math.BigDecimal fcurRWTIR15P;
  public java.math.BigDecimal get_fcurRWTIR15P() {
    return fcurRWTIR15P;
  }
  public void set_fcurRWTIR15P(java.math.BigDecimal fcurRWTIR15P) {
    this.fcurRWTIR15P = fcurRWTIR15P;
  }
  public tblnz_rtnipss with_fcurRWTIR15P(java.math.BigDecimal fcurRWTIR15P) {
    this.fcurRWTIR15P = fcurRWTIR15P;
    return this;
  }
  private java.math.BigDecimal fcurRWTAlreadyDeducted;
  public java.math.BigDecimal get_fcurRWTAlreadyDeducted() {
    return fcurRWTAlreadyDeducted;
  }
  public void set_fcurRWTAlreadyDeducted(java.math.BigDecimal fcurRWTAlreadyDeducted) {
    this.fcurRWTAlreadyDeducted = fcurRWTAlreadyDeducted;
  }
  public tblnz_rtnipss with_fcurRWTAlreadyDeducted(java.math.BigDecimal fcurRWTAlreadyDeducted) {
    this.fcurRWTAlreadyDeducted = fcurRWTAlreadyDeducted;
    return this;
  }
  private java.math.BigDecimal fcurRWTTotalPaid;
  public java.math.BigDecimal get_fcurRWTTotalPaid() {
    return fcurRWTTotalPaid;
  }
  public void set_fcurRWTTotalPaid(java.math.BigDecimal fcurRWTTotalPaid) {
    this.fcurRWTTotalPaid = fcurRWTTotalPaid;
  }
  public tblnz_rtnipss with_fcurRWTTotalPaid(java.math.BigDecimal fcurRWTTotalPaid) {
    this.fcurRWTTotalPaid = fcurRWTTotalPaid;
    return this;
  }
  private java.math.BigDecimal fcurRWTFinal;
  public java.math.BigDecimal get_fcurRWTFinal() {
    return fcurRWTFinal;
  }
  public void set_fcurRWTFinal(java.math.BigDecimal fcurRWTFinal) {
    this.fcurRWTFinal = fcurRWTFinal;
  }
  public tblnz_rtnipss with_fcurRWTFinal(java.math.BigDecimal fcurRWTFinal) {
    this.fcurRWTFinal = fcurRWTFinal;
    return this;
  }
  private Integer flngCertificatesAttached;
  public Integer get_flngCertificatesAttached() {
    return flngCertificatesAttached;
  }
  public void set_flngCertificatesAttached(Integer flngCertificatesAttached) {
    this.flngCertificatesAttached = flngCertificatesAttached;
  }
  public tblnz_rtnipss with_flngCertificatesAttached(Integer flngCertificatesAttached) {
    this.flngCertificatesAttached = flngCertificatesAttached;
    return this;
  }
  private Integer flngCertFiled;
  public Integer get_flngCertFiled() {
    return flngCertFiled;
  }
  public void set_flngCertFiled(Integer flngCertFiled) {
    this.flngCertFiled = flngCertFiled;
  }
  public tblnz_rtnipss with_flngCertFiled(Integer flngCertFiled) {
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
  public tblnz_rtnipss with_fblnElectronicFiled(Integer fblnElectronicFiled) {
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
  public tblnz_rtnipss with_fstrWho(String fstrWho) {
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
  public tblnz_rtnipss with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnipss)) {
      return false;
    }
    tblnz_rtnipss that = (tblnz_rtnipss) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurInterestRWTDeducted == null ? that.fcurInterestRWTDeducted == null : this.fcurInterestRWTDeducted.equals(that.fcurInterestRWTDeducted));
    equal = equal && (this.fcurInterestNoRWTDeducted == null ? that.fcurInterestNoRWTDeducted == null : this.fcurInterestNoRWTDeducted.equals(that.fcurInterestNoRWTDeducted));
    equal = equal && (this.fcurInterestTotal == null ? that.fcurInterestTotal == null : this.fcurInterestTotal.equals(that.fcurInterestTotal));
    equal = equal && (this.fcurRWTCertificates == null ? that.fcurRWTCertificates == null : this.fcurRWTCertificates.equals(that.fcurRWTCertificates));
    equal = equal && (this.fcurRWTBCM == null ? that.fcurRWTBCM == null : this.fcurRWTBCM.equals(that.fcurRWTBCM));
    equal = equal && (this.fcurRWTNoCertificates == null ? that.fcurRWTNoCertificates == null : this.fcurRWTNoCertificates.equals(that.fcurRWTNoCertificates));
    equal = equal && (this.fcurRWTTotalPayable == null ? that.fcurRWTTotalPayable == null : this.fcurRWTTotalPayable.equals(that.fcurRWTTotalPayable));
    equal = equal && (this.fcurManualRWTPaid == null ? that.fcurManualRWTPaid == null : this.fcurManualRWTPaid.equals(that.fcurManualRWTPaid));
    equal = equal && (this.fcurRWTIR15P == null ? that.fcurRWTIR15P == null : this.fcurRWTIR15P.equals(that.fcurRWTIR15P));
    equal = equal && (this.fcurRWTAlreadyDeducted == null ? that.fcurRWTAlreadyDeducted == null : this.fcurRWTAlreadyDeducted.equals(that.fcurRWTAlreadyDeducted));
    equal = equal && (this.fcurRWTTotalPaid == null ? that.fcurRWTTotalPaid == null : this.fcurRWTTotalPaid.equals(that.fcurRWTTotalPaid));
    equal = equal && (this.fcurRWTFinal == null ? that.fcurRWTFinal == null : this.fcurRWTFinal.equals(that.fcurRWTFinal));
    equal = equal && (this.flngCertificatesAttached == null ? that.flngCertificatesAttached == null : this.flngCertificatesAttached.equals(that.flngCertificatesAttached));
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
    if (!(o instanceof tblnz_rtnipss)) {
      return false;
    }
    tblnz_rtnipss that = (tblnz_rtnipss) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurInterestRWTDeducted == null ? that.fcurInterestRWTDeducted == null : this.fcurInterestRWTDeducted.equals(that.fcurInterestRWTDeducted));
    equal = equal && (this.fcurInterestNoRWTDeducted == null ? that.fcurInterestNoRWTDeducted == null : this.fcurInterestNoRWTDeducted.equals(that.fcurInterestNoRWTDeducted));
    equal = equal && (this.fcurInterestTotal == null ? that.fcurInterestTotal == null : this.fcurInterestTotal.equals(that.fcurInterestTotal));
    equal = equal && (this.fcurRWTCertificates == null ? that.fcurRWTCertificates == null : this.fcurRWTCertificates.equals(that.fcurRWTCertificates));
    equal = equal && (this.fcurRWTBCM == null ? that.fcurRWTBCM == null : this.fcurRWTBCM.equals(that.fcurRWTBCM));
    equal = equal && (this.fcurRWTNoCertificates == null ? that.fcurRWTNoCertificates == null : this.fcurRWTNoCertificates.equals(that.fcurRWTNoCertificates));
    equal = equal && (this.fcurRWTTotalPayable == null ? that.fcurRWTTotalPayable == null : this.fcurRWTTotalPayable.equals(that.fcurRWTTotalPayable));
    equal = equal && (this.fcurManualRWTPaid == null ? that.fcurManualRWTPaid == null : this.fcurManualRWTPaid.equals(that.fcurManualRWTPaid));
    equal = equal && (this.fcurRWTIR15P == null ? that.fcurRWTIR15P == null : this.fcurRWTIR15P.equals(that.fcurRWTIR15P));
    equal = equal && (this.fcurRWTAlreadyDeducted == null ? that.fcurRWTAlreadyDeducted == null : this.fcurRWTAlreadyDeducted.equals(that.fcurRWTAlreadyDeducted));
    equal = equal && (this.fcurRWTTotalPaid == null ? that.fcurRWTTotalPaid == null : this.fcurRWTTotalPaid.equals(that.fcurRWTTotalPaid));
    equal = equal && (this.fcurRWTFinal == null ? that.fcurRWTFinal == null : this.fcurRWTFinal.equals(that.fcurRWTFinal));
    equal = equal && (this.flngCertificatesAttached == null ? that.flngCertificatesAttached == null : this.flngCertificatesAttached.equals(that.flngCertificatesAttached));
    equal = equal && (this.flngCertFiled == null ? that.flngCertFiled == null : this.flngCertFiled.equals(that.flngCertFiled));
    equal = equal && (this.fblnElectronicFiled == null ? that.fblnElectronicFiled == null : this.fblnElectronicFiled.equals(that.fblnElectronicFiled));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurInterestRWTDeducted = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurInterestNoRWTDeducted = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurInterestTotal = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurRWTCertificates = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurRWTBCM = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurRWTNoCertificates = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurRWTTotalPayable = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurManualRWTPaid = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurRWTIR15P = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurRWTAlreadyDeducted = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurRWTTotalPaid = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurRWTFinal = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.flngCertificatesAttached = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngCertFiled = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnElectronicFiled = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurInterestRWTDeducted = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurInterestNoRWTDeducted = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurInterestTotal = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurRWTCertificates = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurRWTBCM = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurRWTNoCertificates = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurRWTTotalPayable = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurManualRWTPaid = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurRWTIR15P = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurRWTAlreadyDeducted = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurRWTTotalPaid = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurRWTFinal = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.flngCertificatesAttached = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngCertFiled = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnElectronicFiled = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurInterestRWTDeducted, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestNoRWTDeducted, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestTotal, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTCertificates, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTBCM, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTNoCertificates, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTTotalPayable, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurManualRWTPaid, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTIR15P, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTAlreadyDeducted, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTTotalPaid, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTFinal, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertificatesAttached, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertFiled, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronicFiled, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestRWTDeducted, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestNoRWTDeducted, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestTotal, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTCertificates, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTBCM, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTNoCertificates, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTTotalPayable, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurManualRWTPaid, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTIR15P, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTAlreadyDeducted, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTTotalPaid, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTFinal, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertificatesAttached, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertFiled, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronicFiled, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
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
        this.fcurInterestRWTDeducted = null;
    } else {
    this.fcurInterestRWTDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestNoRWTDeducted = null;
    } else {
    this.fcurInterestNoRWTDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestTotal = null;
    } else {
    this.fcurInterestTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTCertificates = null;
    } else {
    this.fcurRWTCertificates = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTBCM = null;
    } else {
    this.fcurRWTBCM = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTNoCertificates = null;
    } else {
    this.fcurRWTNoCertificates = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTTotalPayable = null;
    } else {
    this.fcurRWTTotalPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurManualRWTPaid = null;
    } else {
    this.fcurManualRWTPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTIR15P = null;
    } else {
    this.fcurRWTIR15P = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTAlreadyDeducted = null;
    } else {
    this.fcurRWTAlreadyDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTTotalPaid = null;
    } else {
    this.fcurRWTTotalPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTFinal = null;
    } else {
    this.fcurRWTFinal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCertificatesAttached = null;
    } else {
    this.flngCertificatesAttached = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fcurInterestRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestRWTDeducted, __dataOut);
    }
    if (null == this.fcurInterestNoRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestNoRWTDeducted, __dataOut);
    }
    if (null == this.fcurInterestTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestTotal, __dataOut);
    }
    if (null == this.fcurRWTCertificates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTCertificates, __dataOut);
    }
    if (null == this.fcurRWTBCM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTBCM, __dataOut);
    }
    if (null == this.fcurRWTNoCertificates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTNoCertificates, __dataOut);
    }
    if (null == this.fcurRWTTotalPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTTotalPayable, __dataOut);
    }
    if (null == this.fcurManualRWTPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurManualRWTPaid, __dataOut);
    }
    if (null == this.fcurRWTIR15P) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTIR15P, __dataOut);
    }
    if (null == this.fcurRWTAlreadyDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTAlreadyDeducted, __dataOut);
    }
    if (null == this.fcurRWTTotalPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTTotalPaid, __dataOut);
    }
    if (null == this.fcurRWTFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTFinal, __dataOut);
    }
    if (null == this.flngCertificatesAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertificatesAttached);
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
    if (null == this.fcurInterestRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestRWTDeducted, __dataOut);
    }
    if (null == this.fcurInterestNoRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestNoRWTDeducted, __dataOut);
    }
    if (null == this.fcurInterestTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestTotal, __dataOut);
    }
    if (null == this.fcurRWTCertificates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTCertificates, __dataOut);
    }
    if (null == this.fcurRWTBCM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTBCM, __dataOut);
    }
    if (null == this.fcurRWTNoCertificates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTNoCertificates, __dataOut);
    }
    if (null == this.fcurRWTTotalPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTTotalPayable, __dataOut);
    }
    if (null == this.fcurManualRWTPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurManualRWTPaid, __dataOut);
    }
    if (null == this.fcurRWTIR15P) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTIR15P, __dataOut);
    }
    if (null == this.fcurRWTAlreadyDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTAlreadyDeducted, __dataOut);
    }
    if (null == this.fcurRWTTotalPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTTotalPaid, __dataOut);
    }
    if (null == this.fcurRWTFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTFinal, __dataOut);
    }
    if (null == this.flngCertificatesAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertificatesAttached);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestRWTDeducted==null?"\\N":fcurInterestRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestNoRWTDeducted==null?"\\N":fcurInterestNoRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestTotal==null?"\\N":fcurInterestTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTCertificates==null?"\\N":fcurRWTCertificates.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTBCM==null?"\\N":fcurRWTBCM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTNoCertificates==null?"\\N":fcurRWTNoCertificates.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTTotalPayable==null?"\\N":fcurRWTTotalPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurManualRWTPaid==null?"\\N":fcurManualRWTPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTIR15P==null?"\\N":fcurRWTIR15P.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTAlreadyDeducted==null?"\\N":fcurRWTAlreadyDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTTotalPaid==null?"\\N":fcurRWTTotalPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTFinal==null?"\\N":fcurRWTFinal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertificatesAttached==null?"\\N":"" + flngCertificatesAttached, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestRWTDeducted==null?"\\N":fcurInterestRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestNoRWTDeducted==null?"\\N":fcurInterestNoRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestTotal==null?"\\N":fcurInterestTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTCertificates==null?"\\N":fcurRWTCertificates.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTBCM==null?"\\N":fcurRWTBCM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTNoCertificates==null?"\\N":fcurRWTNoCertificates.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTTotalPayable==null?"\\N":fcurRWTTotalPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurManualRWTPaid==null?"\\N":fcurManualRWTPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTIR15P==null?"\\N":fcurRWTIR15P.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTAlreadyDeducted==null?"\\N":fcurRWTAlreadyDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTTotalPaid==null?"\\N":fcurRWTTotalPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTFinal==null?"\\N":fcurRWTFinal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertificatesAttached==null?"\\N":"" + flngCertificatesAttached, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestRWTDeducted = null; } else {
      this.fcurInterestRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestNoRWTDeducted = null; } else {
      this.fcurInterestNoRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestTotal = null; } else {
      this.fcurInterestTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTCertificates = null; } else {
      this.fcurRWTCertificates = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTBCM = null; } else {
      this.fcurRWTBCM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTNoCertificates = null; } else {
      this.fcurRWTNoCertificates = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTTotalPayable = null; } else {
      this.fcurRWTTotalPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurManualRWTPaid = null; } else {
      this.fcurManualRWTPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTIR15P = null; } else {
      this.fcurRWTIR15P = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTAlreadyDeducted = null; } else {
      this.fcurRWTAlreadyDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTTotalPaid = null; } else {
      this.fcurRWTTotalPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTFinal = null; } else {
      this.fcurRWTFinal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertificatesAttached = null; } else {
      this.flngCertificatesAttached = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestRWTDeducted = null; } else {
      this.fcurInterestRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestNoRWTDeducted = null; } else {
      this.fcurInterestNoRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestTotal = null; } else {
      this.fcurInterestTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTCertificates = null; } else {
      this.fcurRWTCertificates = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTBCM = null; } else {
      this.fcurRWTBCM = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTNoCertificates = null; } else {
      this.fcurRWTNoCertificates = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTTotalPayable = null; } else {
      this.fcurRWTTotalPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurManualRWTPaid = null; } else {
      this.fcurManualRWTPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTIR15P = null; } else {
      this.fcurRWTIR15P = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTAlreadyDeducted = null; } else {
      this.fcurRWTAlreadyDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTTotalPaid = null; } else {
      this.fcurRWTTotalPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTFinal = null; } else {
      this.fcurRWTFinal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertificatesAttached = null; } else {
      this.flngCertificatesAttached = Integer.valueOf(__cur_str);
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
    tblnz_rtnipss o = (tblnz_rtnipss) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnipss o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurInterestRWTDeducted", this.fcurInterestRWTDeducted);
    __sqoop$field_map.put("fcurInterestNoRWTDeducted", this.fcurInterestNoRWTDeducted);
    __sqoop$field_map.put("fcurInterestTotal", this.fcurInterestTotal);
    __sqoop$field_map.put("fcurRWTCertificates", this.fcurRWTCertificates);
    __sqoop$field_map.put("fcurRWTBCM", this.fcurRWTBCM);
    __sqoop$field_map.put("fcurRWTNoCertificates", this.fcurRWTNoCertificates);
    __sqoop$field_map.put("fcurRWTTotalPayable", this.fcurRWTTotalPayable);
    __sqoop$field_map.put("fcurManualRWTPaid", this.fcurManualRWTPaid);
    __sqoop$field_map.put("fcurRWTIR15P", this.fcurRWTIR15P);
    __sqoop$field_map.put("fcurRWTAlreadyDeducted", this.fcurRWTAlreadyDeducted);
    __sqoop$field_map.put("fcurRWTTotalPaid", this.fcurRWTTotalPaid);
    __sqoop$field_map.put("fcurRWTFinal", this.fcurRWTFinal);
    __sqoop$field_map.put("flngCertificatesAttached", this.flngCertificatesAttached);
    __sqoop$field_map.put("flngCertFiled", this.flngCertFiled);
    __sqoop$field_map.put("fblnElectronicFiled", this.fblnElectronicFiled);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurInterestRWTDeducted", this.fcurInterestRWTDeducted);
    __sqoop$field_map.put("fcurInterestNoRWTDeducted", this.fcurInterestNoRWTDeducted);
    __sqoop$field_map.put("fcurInterestTotal", this.fcurInterestTotal);
    __sqoop$field_map.put("fcurRWTCertificates", this.fcurRWTCertificates);
    __sqoop$field_map.put("fcurRWTBCM", this.fcurRWTBCM);
    __sqoop$field_map.put("fcurRWTNoCertificates", this.fcurRWTNoCertificates);
    __sqoop$field_map.put("fcurRWTTotalPayable", this.fcurRWTTotalPayable);
    __sqoop$field_map.put("fcurManualRWTPaid", this.fcurManualRWTPaid);
    __sqoop$field_map.put("fcurRWTIR15P", this.fcurRWTIR15P);
    __sqoop$field_map.put("fcurRWTAlreadyDeducted", this.fcurRWTAlreadyDeducted);
    __sqoop$field_map.put("fcurRWTTotalPaid", this.fcurRWTTotalPaid);
    __sqoop$field_map.put("fcurRWTFinal", this.fcurRWTFinal);
    __sqoop$field_map.put("flngCertificatesAttached", this.flngCertificatesAttached);
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
